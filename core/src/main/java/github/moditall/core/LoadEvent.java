package github.moditall.core;

public enum LoadEvent {
    BEFORE_STARTUP,
    BEFORE_LOAD,
    LOAD,
    PREINIT,
    INIT,
    START,
    SUSPEND,
    RESUME,
    STOP,
    FINALIZE,
    DESTROY,
    AFTER_DESTROY,
    AFTER_SHUTDOWN
}
