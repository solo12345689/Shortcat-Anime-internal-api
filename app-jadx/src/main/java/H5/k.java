package h5;

import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC2863q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class k implements j, InterfaceC2863q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f47615a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC2857k f47616b;

    k(AbstractC2857k abstractC2857k) {
        this.f47616b = abstractC2857k;
        abstractC2857k.addObserver(this);
    }

    @Override // h5.j
    public void a(l lVar) {
        this.f47615a.remove(lVar);
    }

    @Override // h5.j
    public void b(l lVar) {
        this.f47615a.add(lVar);
        if (this.f47616b.getCurrentState() == AbstractC2857k.b.f30235a) {
            lVar.d();
        } else if (this.f47616b.getCurrentState().b(AbstractC2857k.b.f30238d)) {
            lVar.b();
        } else {
            lVar.a();
        }
    }

    @C(AbstractC2857k.a.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.r rVar) {
        Iterator it = o5.l.k(this.f47615a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).d();
        }
        rVar.getLifecycle().removeObserver(this);
    }

    @C(AbstractC2857k.a.ON_START)
    public void onStart(androidx.lifecycle.r rVar) {
        Iterator it = o5.l.k(this.f47615a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).b();
        }
    }

    @C(AbstractC2857k.a.ON_STOP)
    public void onStop(androidx.lifecycle.r rVar) {
        Iterator it = o5.l.k(this.f47615a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
    }
}
