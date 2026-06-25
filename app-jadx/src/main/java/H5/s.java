package h5;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f47646a = Collections.newSetFromMap(new WeakHashMap());

    @Override // h5.l
    public void a() {
        Iterator it = o5.l.k(this.f47646a).iterator();
        while (it.hasNext()) {
            ((l5.d) it.next()).a();
        }
    }

    @Override // h5.l
    public void b() {
        Iterator it = o5.l.k(this.f47646a).iterator();
        while (it.hasNext()) {
            ((l5.d) it.next()).b();
        }
    }

    @Override // h5.l
    public void d() {
        Iterator it = o5.l.k(this.f47646a).iterator();
        while (it.hasNext()) {
            ((l5.d) it.next()).d();
        }
    }

    public void e() {
        this.f47646a.clear();
    }

    public List g() {
        return o5.l.k(this.f47646a);
    }

    public void k(l5.d dVar) {
        this.f47646a.add(dVar);
    }

    public void o(l5.d dVar) {
        this.f47646a.remove(dVar);
    }
}
