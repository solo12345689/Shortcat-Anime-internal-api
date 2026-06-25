package com.facebook.react.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/bridge/GuardedRunnable;", "Ljava/lang/Runnable;", "Lcom/facebook/react/bridge/JSExceptionHandler;", "exceptionHandler", "<init>", "(Lcom/facebook/react/bridge/JSExceptionHandler;)V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "(Lcom/facebook/react/bridge/ReactContext;)V", "LTd/L;", "run", "()V", "runGuarded", "Lcom/facebook/react/bridge/JSExceptionHandler;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class GuardedRunnable implements Runnable {
    private final JSExceptionHandler exceptionHandler;

    public GuardedRunnable(JSExceptionHandler exceptionHandler) {
        AbstractC5504s.h(exceptionHandler, "exceptionHandler");
        this.exceptionHandler = exceptionHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            runGuarded();
        } catch (RuntimeException e10) {
            this.exceptionHandler.handleException(e10);
        }
    }

    public abstract void runGuarded();

    /* JADX WARN: Illegal instructions before constructor call */
    public GuardedRunnable(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        AbstractC5504s.g(exceptionHandler, "getExceptionHandler(...)");
        this(exceptionHandler);
    }
}
