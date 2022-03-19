package github.moditall.core;

import github.moditall.core.security.ServicePermission;

import java.util.Optional;

public interface LauncherInterface {
    /**
     * Requests access to a handle to the service given by ty.
     * Which services are available are launcher specific
     *
     * @param <S> The statically known type of the service
     * @param ty The runtime class of the service
     * @return A service from the launcher fulfilling cl, if it exists, or an empty optional
     * @throws SecurityException if the service requested belongs to a launcher-specific set of privileged services,
     * and the {@link ServicePermission} is denied to the caller
     * @throws IllegalStateException if called prior to preinit
     */
    public <S extends LauncherService> Optional<S> getService(Class<S> ty);
}
