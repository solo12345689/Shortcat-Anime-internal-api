package j5;

import U4.i;
import U4.t;
import g5.g;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import o5.j;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t f51646c = new t(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new g(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6551a f51647a = new C6551a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f51648b = new AtomicReference();

    private j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f51648b.getAndSet(null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public t a(Class cls, Class cls2, Class cls3) {
        t tVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f51647a) {
            tVar = (t) this.f51647a.get(jVarB);
        }
        this.f51648b.set(jVarB);
        return tVar;
    }

    public boolean c(t tVar) {
        return f51646c.equals(tVar);
    }

    public void d(Class cls, Class cls2, Class cls3, t tVar) {
        synchronized (this.f51647a) {
            C6551a c6551a = this.f51647a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f51646c;
            }
            c6551a.put(jVar, tVar);
        }
    }
}
