package github.moditall.core.service;

import java.lang.invoke.MethodHandle;

public interface LaunchArtifact {

    public boolean isPrimary();

    public Class<?> getArtifactClass();

    public MethodHandle eventDispatchCallback();


}
