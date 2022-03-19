package github.moditall.core.security;

import java.security.Permission;

public class MIAPermission extends Permission {
    private final String name;

    protected MIAPermission(String name){
        super(name);
        this.name = name;
    }

    @Override
    public boolean implies(Permission permission) {
        if(permission.getClass()==this.getClass()){
            var miaPermission = (MIAPermission)permission;
            if (miaPermission.name.equals(this.name))
                return true;
            else return this.name.equals("*");
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null)
            return false;
        else if(o==this)
            return true;
        else if(o.getClass()!=this.getClass())
            return false;
        else{
            MIAPermission mp = (MIAPermission) o;
            return this.implies(mp)&&mp.implies(this);
        }
    }


    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String getActions() {
        return name;
    }


}
