package M2;

import B2.K1;
import F2.t;
import M2.D;
import M2.L;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t2.AbstractC6614a;
import w2.InterfaceC6932F;

/* JADX INFO: renamed from: M2.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1911a implements D {

    /* JADX INFO: renamed from: a */
    private final ArrayList f11832a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    private final HashSet f11833b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    private final L.a f11834c = new L.a();

    /* JADX INFO: renamed from: d */
    private final t.a f11835d = new t.a();

    /* JADX INFO: renamed from: e */
    private Looper f11836e;

    /* JADX INFO: renamed from: f */
    private q2.Y f11837f;

    /* JADX INFO: renamed from: g */
    private K1 f11838g;

    protected abstract void A(InterfaceC6932F interfaceC6932F);

    protected final void B(q2.Y y10) {
        this.f11837f = y10;
        Iterator it = this.f11832a.iterator();
        while (it.hasNext()) {
            ((D.c) it.next()).a(this, y10);
        }
    }

    protected abstract void C();

    @Override // M2.D
    public final void b(Handler handler, F2.t tVar) {
        AbstractC6614a.e(handler);
        AbstractC6614a.e(tVar);
        this.f11835d.g(handler, tVar);
    }

    @Override // M2.D
    public final void c(F2.t tVar) {
        this.f11835d.n(tVar);
    }

    @Override // M2.D
    public final void d(D.c cVar) {
        this.f11832a.remove(cVar);
        if (!this.f11832a.isEmpty()) {
            p(cVar);
            return;
        }
        this.f11836e = null;
        this.f11837f = null;
        this.f11838g = null;
        this.f11833b.clear();
        C();
    }

    @Override // M2.D
    public final void h(D.c cVar) {
        AbstractC6614a.e(this.f11836e);
        boolean zIsEmpty = this.f11833b.isEmpty();
        this.f11833b.add(cVar);
        if (zIsEmpty) {
            x();
        }
    }

    @Override // M2.D
    public final void k(L l10) {
        this.f11834c.x(l10);
    }

    @Override // M2.D
    public final void p(D.c cVar) {
        boolean zIsEmpty = this.f11833b.isEmpty();
        this.f11833b.remove(cVar);
        if (zIsEmpty || !this.f11833b.isEmpty()) {
            return;
        }
        w();
    }

    @Override // M2.D
    public final void q(Handler handler, L l10) {
        AbstractC6614a.e(handler);
        AbstractC6614a.e(l10);
        this.f11834c.h(handler, l10);
    }

    @Override // M2.D
    public final void r(D.c cVar, InterfaceC6932F interfaceC6932F, K1 k12) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f11836e;
        AbstractC6614a.a(looper == null || looper == looperMyLooper);
        this.f11838g = k12;
        q2.Y y10 = this.f11837f;
        this.f11832a.add(cVar);
        if (this.f11836e == null) {
            this.f11836e = looperMyLooper;
            this.f11833b.add(cVar);
            A(interfaceC6932F);
        } else if (y10 != null) {
            h(cVar);
            cVar.a(this, y10);
        }
    }

    protected final t.a s(int i10, D.b bVar) {
        return this.f11835d.o(i10, bVar);
    }

    protected final t.a t(D.b bVar) {
        return this.f11835d.o(0, bVar);
    }

    protected final L.a u(int i10, D.b bVar) {
        return this.f11834c.A(i10, bVar);
    }

    protected final L.a v(D.b bVar) {
        return this.f11834c.A(0, bVar);
    }

    protected final K1 y() {
        return (K1) AbstractC6614a.i(this.f11838g);
    }

    protected final boolean z() {
        return !this.f11833b.isEmpty();
    }

    protected void w() {
    }

    protected void x() {
    }
}
