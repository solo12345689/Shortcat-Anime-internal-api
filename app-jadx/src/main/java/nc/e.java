package nc;

import Td.L;
import Td.z;
import Ub.A;
import cc.p;
import cc.y;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedRef;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a */
    private final WeakReference f54108a;

    /* JADX INFO: renamed from: b */
    private int f54109b;

    /* JADX INFO: renamed from: c */
    private Map f54110c;

    public e(lc.b runtime) {
        AbstractC5504s.h(runtime, "runtime");
        this.f54108a = A.a(runtime);
        this.f54109b = C5776c.b(1);
        this.f54110c = new LinkedHashMap();
    }

    private final int c(int i10) throws y {
        if (this.f54110c.containsKey(C5776c.a(i10)) || i10 == 0 || i10 >= this.f54109b) {
            return i10;
        }
        throw new y();
    }

    private final int d() {
        int i10;
        synchronized (this) {
            i10 = this.f54109b;
            this.f54109b = C5776c.b(i10 + 1);
        }
        return i10;
    }

    public final int a(SharedObject sharedObject, JavaScriptObject js) throws cc.e {
        AbstractC5504s.h(sharedObject, "native");
        AbstractC5504s.h(js, "js");
        int iD = d();
        sharedObject.E(iD);
        JavaScriptObject.h(js, "__expo_shared_object_id__", iD, null, 4, null);
        lc.b bVar = (lc.b) this.f54108a.get();
        if (bVar == null) {
            throw new cc.e();
        }
        bVar.d().setNativeStateForSharedObject(iD, js);
        int iK = sharedObject.k();
        if (iK > 0) {
            js.setExternalMemoryPressure(iK);
        }
        if (sharedObject instanceof SharedRef) {
            JavaScriptObject.i(js, "nativeRefType", ((SharedRef) sharedObject).getNativeRefType(), null, 4, null);
        }
        JavaScriptWeakObject javaScriptWeakObjectCreateWeak = js.createWeak();
        synchronized (this) {
            this.f54110c.put(C5776c.a(iD), z.a(sharedObject, javaScriptWeakObjectCreateWeak));
            L l10 = L.f17438a;
        }
        if (sharedObject.getRuntimeContextHolder().get() == null) {
            sharedObject.D(A.a(bVar));
        }
        return iD;
    }

    public final void b(int i10) {
        Pair pair;
        synchronized (this) {
            pair = (Pair) this.f54110c.remove(C5776c.a(i10));
        }
        if (pair != null) {
            SharedObject sharedObject = (SharedObject) pair.getFirst();
            sharedObject.E(C5776c.b(0));
            sharedObject.H();
        }
    }

    public final JavaScriptObject e(SharedObject sharedObject) {
        JavaScriptObject javaScriptObjectLock;
        JavaScriptWeakObject javaScriptWeakObject;
        AbstractC5504s.h(sharedObject, "native");
        synchronized (this) {
            Pair pair = (Pair) this.f54110c.get(C5776c.a(sharedObject.w()));
            javaScriptObjectLock = (pair == null || (javaScriptWeakObject = (JavaScriptWeakObject) pair.d()) == null) ? null : javaScriptWeakObject.lock();
        }
        return javaScriptObjectLock;
    }

    public final SharedObject f(int i10) throws p {
        Pair pair = (Pair) this.f54110c.get(C5776c.a(c(i10)));
        SharedObject sharedObject = pair != null ? (SharedObject) pair.c() : null;
        if (sharedObject != null) {
            return sharedObject;
        }
        throw new p();
    }

    public final SharedObject g(int i10) {
        SharedObject sharedObject;
        synchronized (this) {
            Pair pair = (Pair) this.f54110c.get(C5776c.a(i10));
            sharedObject = pair != null ? (SharedObject) pair.c() : null;
        }
        return sharedObject;
    }

    public final JavaScriptWeakObject h(SharedObject nativeObject) {
        JavaScriptWeakObject javaScriptWeakObject;
        AbstractC5504s.h(nativeObject, "nativeObject");
        synchronized (this) {
            Pair pair = (Pair) this.f54110c.get(C5776c.a(nativeObject.w()));
            javaScriptWeakObject = pair != null ? (JavaScriptWeakObject) pair.d() : null;
        }
        return javaScriptWeakObject;
    }
}
