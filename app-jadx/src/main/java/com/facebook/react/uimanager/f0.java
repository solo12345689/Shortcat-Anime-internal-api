package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.AbstractC2747a0;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f37690a = new f0();

    private f0() {
    }

    public static final float[] a(Context context) {
        EditText editText = new EditText(context);
        return new float[]{B.g(AbstractC2747a0.D(editText)), B.g(AbstractC2747a0.C(editText)), B.g(editText.getPaddingTop()), B.g(editText.getPaddingBottom())};
    }

    public static final EventDispatcher b(ReactContext context, int i10) {
        AbstractC5504s.h(context, "context");
        if (context.isBridgeless()) {
            boolean z10 = context instanceof C3284b0;
            Object objB = context;
            if (z10) {
                objB = ((C3284b0) context).b();
            }
            AbstractC5504s.f(objB, "null cannot be cast to non-null type com.facebook.react.uimanager.events.EventDispatcherProvider");
            return ((com.facebook.react.uimanager.events.j) objB).getEventDispatcher();
        }
        UIManager uIManagerH = h(context, i10, false);
        if (uIManagerH == null) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Unable to find UIManager for UIManagerType " + i10));
            return null;
        }
        EventDispatcher eventDispatcher = uIManagerH.getEventDispatcher();
        if (eventDispatcher == null) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new IllegalStateException("Cannot get EventDispatcher for UIManagerType " + i10));
        }
        return eventDispatcher;
    }

    public static final EventDispatcher c(ReactContext context, int i10) {
        AbstractC5504s.h(context, "context");
        EventDispatcher eventDispatcherB = b(context, C7.a.a(i10));
        if (eventDispatcherB == null) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new IllegalStateException("Cannot get EventDispatcher for reactTag " + i10));
        }
        return eventDispatcherB;
    }

    public static final ReactContext d(View view) {
        AbstractC5504s.h(view, "view");
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    public static final int e(Context context) {
        if (context instanceof C3284b0) {
            return ((C3284b0) context).c();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int f(View view) {
        AbstractC5504s.h(view, "view");
        if (view instanceof M) {
            M m10 = (M) view;
            if (m10.getUIManagerType() == 2) {
                return m10.getRootViewTag();
            }
            return -1;
        }
        int id2 = view.getId();
        if (C7.a.a(id2) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof C3284b0) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int iE = e(context);
        if (iE == -1) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new IllegalStateException("Fabric View [" + id2 + "] does not have SurfaceId associated with it"));
        }
        return iE;
    }

    public static final UIManager g(ReactContext context, int i10) {
        AbstractC5504s.h(context, "context");
        return h(context, i10, true);
    }

    private static final UIManager h(ReactContext reactContext, int i10, boolean z10) {
        if (Y6.a.f22864f || reactContext.isBridgeless()) {
            UIManager fabricUIManager = reactContext.getFabricUIManager();
            if (fabricUIManager != null) {
                return fabricUIManager;
            }
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet."));
            return null;
        }
        W6.b.a("UIManagerHelper.getUIManager(context, uiManagerType)", W6.a.f20778b);
        if (!reactContext.hasCatalystInstance()) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        }
        if (!reactContext.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
            if (z10) {
                return null;
            }
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        AbstractC5504s.g(catalystInstance, "getCatalystInstance(...)");
        try {
            return i10 == 2 ? reactContext.getFabricUIManager() : (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        } catch (IllegalArgumentException unused) {
            ReactSoftExceptionLogger.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager for UIManagerType: " + i10));
            return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
        }
    }

    public static final UIManager i(ReactContext context, int i10) {
        AbstractC5504s.h(context, "context");
        return g(context, C7.a.a(i10));
    }
}
