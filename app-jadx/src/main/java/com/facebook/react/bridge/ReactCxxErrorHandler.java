package com.facebook.react.bridge;

import Td.InterfaceC2154e;
import Td.L;
import java.lang.reflect.Method;
import kotlin.Metadata;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/bridge/ReactCxxErrorHandler;", "", "<init>", "()V", "handlerObject", "Ljava/lang/reflect/Method;", "handleErrorFunc", "LTd/L;", "setHandleErrorFunc", "(Ljava/lang/Object;Ljava/lang/reflect/Method;)V", "", "message", "handleError", "(Ljava/lang/String;)V", "Ljava/lang/reflect/Method;", "Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InterfaceC2154e
public final class ReactCxxErrorHandler {
    public static final ReactCxxErrorHandler INSTANCE = new ReactCxxErrorHandler();
    private static Method handleErrorFunc;
    private static Object handlerObject;

    static {
        W6.b.a("ReactCxxErrorHandler", W6.a.f20777a);
    }

    private ReactCxxErrorHandler() {
    }

    private static final void handleError(String message) {
        Method method = handleErrorFunc;
        if (method != null) {
            try {
                method.invoke(handlerObject, new Object[]{new Exception(message)});
            } catch (Exception e10) {
                AbstractC7283a.n("ReactCxxErrorHandler", "Failed to invoke error handler function", e10);
                L l10 = L.f17438a;
            }
        }
    }

    public static final void setHandleErrorFunc(Object handlerObject2, Method handleErrorFunc2) {
        handlerObject = handlerObject2;
        handleErrorFunc = handleErrorFunc2;
    }
}
