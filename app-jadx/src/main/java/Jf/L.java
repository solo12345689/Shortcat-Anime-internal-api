package Jf;

import Gf.C1627p;
import Lf.AbstractC1897d;
import Td.u;
import ae.AbstractC2605b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC5504s;
import w.Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class L extends Kf.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f9557a = new AtomicReference(null);

    @Override // Kf.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(J j10) {
        if (AbstractC1897d.a(this.f9557a) != null) {
            return false;
        }
        AbstractC1897d.b(this.f9557a, K.f9555a);
        return true;
    }

    public final Object e(Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        if (!Y.a(this.f9557a, K.f9555a, c1627p)) {
            u.a aVar = Td.u.f17466b;
            c1627p.resumeWith(Td.u.b(Td.L.f17438a));
        }
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : Td.L.f17438a;
    }

    @Override // Kf.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Zd.e[] b(J j10) {
        AbstractC1897d.b(this.f9557a, null);
        return Kf.c.f11083a;
    }

    public final void g() {
        AtomicReference atomicReference = this.f9557a;
        while (true) {
            Object objA = AbstractC1897d.a(atomicReference);
            if (objA == null || objA == K.f9556b) {
                return;
            }
            if (objA == K.f9555a) {
                if (Y.a(this.f9557a, objA, K.f9556b)) {
                    return;
                }
            } else if (Y.a(this.f9557a, objA, K.f9555a)) {
                u.a aVar = Td.u.f17466b;
                ((C1627p) objA).resumeWith(Td.u.b(Td.L.f17438a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f9557a.getAndSet(K.f9555a);
        AbstractC5504s.e(andSet);
        return andSet == K.f9556b;
    }
}
