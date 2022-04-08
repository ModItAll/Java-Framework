package github.moditall.core.service;

import java.util.Optional;
import java.util.stream.Stream;

public interface LaunchProviderService {
    public Optional<? extends LaunchProvider> gatherArtifacts(Stream<Class<?>> classes);
}
