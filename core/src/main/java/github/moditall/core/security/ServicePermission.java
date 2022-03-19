package github.moditall.core.security;

import java.security.Permission;

public class ServicePermission extends MIAPermission {
    private final String serviceCl;

    public ServicePermission(String name, String serviceCl){
        super(name);
        this.serviceCl = serviceCl;
    }

    @Override
    public boolean implies(Permission p){
        if(!super.implies(p))
            return false;
        else{
            ServicePermission sp = (ServicePermission)p; // valid because super.implies checks the class
            if (sp.serviceCl.equals(this.serviceCl))
                return true;
            else if(this.serviceCl.equals("*"))
                return true;
            else if(this.serviceCl.endsWith(".*")){
                var prefix = this.serviceCl.substring(0,this.serviceCl.length()-1);
                return sp.serviceCl.startsWith(prefix);
            }else
                return false;
        }
    }
}
