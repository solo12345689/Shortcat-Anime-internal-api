package j5;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o5.j;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f51649a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6551a f51650b = new C6551a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f51649a.getAndSet(null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f51650b) {
            list = (List) this.f51650b.get(jVar);
        }
        this.f51649a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f51650b) {
            this.f51650b.put(new j(cls, cls2, cls3), list);
        }
    }
}
