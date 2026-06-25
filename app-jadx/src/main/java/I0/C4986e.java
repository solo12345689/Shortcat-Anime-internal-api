package i0;

import i0.AbstractC4994m;
import j0.AbstractC5325b;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: i0.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4986e extends C4985d {

    /* JADX INFO: renamed from: s */
    private final C4985d f48486s;

    /* JADX INFO: renamed from: t */
    private boolean f48487t;

    public C4986e(long j10, C4997p c4997p, Function1 function1, Function1 function12, C4985d c4985d) {
        super(j10, c4997p, function1, function12);
        this.f48486s = c4985d;
        c4985d.m(this);
    }

    private final void U() {
        if (this.f48487t) {
            return;
        }
        this.f48487t = true;
        this.f48486s.n(this);
    }

    @Override // i0.C4985d
    public AbstractC4994m C() throws Throwable {
        C4986e c4986e;
        if (this.f48486s.D() || this.f48486s.e()) {
            return new AbstractC4994m.a(this);
        }
        t.Q qE = E();
        long jI = i();
        Map mapY = qE != null ? AbstractC5003v.Y(this.f48486s.i(), this, this.f48486s.f()) : null;
        synchronized (AbstractC5003v.O()) {
            try {
                AbstractC5003v.o0(this);
                try {
                    if (qE == null || qE.c() == 0) {
                        c4986e = this;
                        b();
                        Td.L l10 = Td.L.f17438a;
                    } else {
                        c4986e = this;
                        AbstractC4994m abstractC4994mJ = c4986e.J(this.f48486s.i(), qE, mapY, this.f48486s.f());
                        if (!AbstractC5504s.c(abstractC4994mJ, AbstractC4994m.b.f48502a)) {
                            return abstractC4994mJ;
                        }
                        t.Q qE2 = c4986e.f48486s.E();
                        if (qE2 != null) {
                            qE2.j(qE);
                        } else {
                            c4986e.f48486s.Q(qE);
                            Q(null);
                        }
                    }
                    if (AbstractC5504s.j(c4986e.f48486s.i(), jI) < 0) {
                        c4986e.f48486s.B();
                    }
                    C4985d c4985d = c4986e.f48486s;
                    c4985d.u(c4985d.f().n(jI).l(F()));
                    c4986e.f48486s.K(jI);
                    c4986e.f48486s.M(y());
                    c4986e.f48486s.L(F());
                    c4986e.f48486s.N(G());
                    Td.L l11 = Td.L.f17438a;
                    P(true);
                    U();
                    AbstractC5325b.c(this, qE);
                    return AbstractC4994m.b.f48502a;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        U();
    }
}
