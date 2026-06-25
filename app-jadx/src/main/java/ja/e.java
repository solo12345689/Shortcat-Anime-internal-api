package Ja;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a */
    private Object f9468a;

    /* JADX INFO: renamed from: b */
    private Method f9469b;

    /* JADX INFO: renamed from: c */
    private Method f9470c;

    /* JADX INFO: renamed from: d */
    private Method f9471d;

    /* JADX INFO: renamed from: e */
    private Method f9472e;

    /* JADX INFO: renamed from: f */
    private Method f9473f;

    public e(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        try {
            StatusBarModule.Companion companion = StatusBarModule.INSTANCE;
            this.f9468a = StatusBarModule.class.getConstructor(ReactApplicationContext.class).newInstance(reactContext);
            Class cls = Boolean.TYPE;
            this.f9469b = StatusBarModule.class.getMethod("setHidden", cls);
            this.f9470c = StatusBarModule.class.getMethod("setColor", Double.TYPE, cls);
            this.f9471d = StatusBarModule.class.getMethod("setTranslucent", cls);
            this.f9472e = StatusBarModule.class.getMethod("setStyle", String.class);
            this.f9473f = StatusBarModule.class.getMethod("getConstants", null);
        } catch (Exception e10) {
            Fa.a.f6597a.c(f.f9474a, "Failed to initialize StatusBarModule via reflection", e10);
        }
    }

    public final Map a() {
        try {
            Method method = this.f9473f;
            Object objInvoke = method != null ? method.invoke(this.f9468a, null) : null;
            if (V.m(objInvoke)) {
                return (Map) objInvoke;
            }
            return null;
        } catch (Exception e10) {
            Fa.a.f6597a.c(f.f9474a, "Error invoking StatusBarModule.getConstants method", e10);
            return null;
        }
    }

    public final void b(double d10, boolean z10) {
        try {
            Method method = this.f9470c;
            if (method != null) {
                method.invoke(this.f9468a, Double.valueOf(d10), Boolean.valueOf(z10));
            }
        } catch (Exception e10) {
            Fa.a.f6597a.c(f.f9474a, "Error invoking StatusBarModule.setColor method", e10);
        }
    }

    public final void c(String style) {
        AbstractC5504s.h(style, "style");
        try {
            Method method = this.f9472e;
            if (method != null) {
                method.invoke(this.f9468a, style);
            }
        } catch (Exception e10) {
            Fa.a.f6597a.c(f.f9474a, "Error invoking StatusBarModule.setStyle method", e10);
        }
    }

    public final void d(boolean z10) {
        try {
            Method method = this.f9471d;
            if (method != null) {
                method.invoke(this.f9468a, Boolean.valueOf(z10));
            }
        } catch (Exception e10) {
            Fa.a.f6597a.c(f.f9474a, "Error invoking StatusBarModule.setTranslucent method", e10);
        }
    }
}
