package github.moditall.core.service;

import java.util.stream.Stream;

public interface LaunchProvider {
    Stream<? extends LaunchArtifact> artifacts();

    boolean hasPrimaryArtifact();
}
