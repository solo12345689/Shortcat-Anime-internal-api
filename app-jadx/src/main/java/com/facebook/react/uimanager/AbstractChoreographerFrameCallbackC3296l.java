package com.facebook.react.uimanager;

import android.view.Choreographer;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.facebook.react.uimanager.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractChoreographerFrameCallbackC3296l implements Choreographer.FrameCallback {
    private final JSExceptionHandler exceptionHandler;

    protected AbstractChoreographerFrameCallbackC3296l(JSExceptionHandler exceptionHandler) {
        AbstractC5504s.h(exceptionHandler, "exceptionHandler");
        this.exceptionHandler = exceptionHandler;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        try {
            doFrameGuarded(j10);
        } catch (RuntimeException e10) {
            this.exceptionHandler.handleException(e10);
        }
    }

    protected abstract void doFrameGuarded(long j10);

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractChoreographerFrameCallbackC3296l(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        AbstractC5504s.g(exceptionHandler, "getExceptionHandler(...)");
        this(exceptionHandler);
    }
}
