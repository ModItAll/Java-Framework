package github.moditall.core.security;

import github.moditall.core.LauncherService;

import java.security.Permission;
import java.security.PermissionCollection;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface SecurityAccessInterface extends LauncherService {
    public Optional<SecurityContext> requestPermissions(Permission... perms);
    public Optional<SecurityContext> requestPermissions(PermissionCollection perms);

    public void privilegedInvoke(SecurityContext ctx,Runnable op);
    public <T> void privilegedInvoke(SecurityContext ctx, Consumer<? super T> op, T param);
    public <T> T privilegedInvoke(SecurityContext ctx, Supplier<? extends T> op);
}
