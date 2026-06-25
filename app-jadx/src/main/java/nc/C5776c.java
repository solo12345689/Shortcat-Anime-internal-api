package nc;

import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.sharedobjects.SharedObject;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: nc.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5776c {

    /* JADX INFO: renamed from: a */
    private final int f54107a;

    private /* synthetic */ C5776c(int i10) {
        this.f54107a = i10;
    }

    public static final /* synthetic */ C5776c a(int i10) {
        return new C5776c(i10);
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof C5776c) && i10 == ((C5776c) obj).j();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static final JavaScriptObject e(int i10, lc.b runtime) {
        AbstractC5504s.h(runtime, "runtime");
        SharedObject sharedObjectG = g(i10, runtime);
        if (sharedObjectG == null) {
            return null;
        }
        return runtime.e().e(sharedObjectG);
    }

    public static final SharedObject f(int i10, lc.b runtime) {
        AbstractC5504s.h(runtime, "runtime");
        return runtime.e().f(i10);
    }

    public static final SharedObject g(int i10, lc.b runtime) {
        AbstractC5504s.h(runtime, "runtime");
        return runtime.e().g(i10);
    }

    public static String h(int i10) {
        return "SharedObjectId(value=" + i10 + ")";
    }

    public static final JavaScriptWeakObject i(int i10, lc.b runtime) {
        AbstractC5504s.h(runtime, "runtime");
        SharedObject sharedObjectG = g(i10, runtime);
        if (sharedObjectG == null) {
            return null;
        }
        return runtime.e().h(sharedObjectG);
    }

    public boolean equals(Object obj) {
        return c(this.f54107a, obj);
    }

    public int hashCode() {
        return d(this.f54107a);
    }

    public final /* synthetic */ int j() {
        return this.f54107a;
    }

    public String toString() {
        return h(this.f54107a);
    }

    public static int b(int i10) {
        return i10;
    }
}
