package Q;

import Q.C2051k;
import U0.T0;
import U0.W0;
import g1.EnumC4829i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.J f14200a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.J j10) {
            super(1);
            this.f14200a = j10;
        }

        public final void a(C2050j c2050j) {
            if (c2050j.c().length() > 0) {
                this.f14200a.f52255a = false;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2050j) obj);
            return Td.L.f17438a;
        }
    }

    public static final EnumC4829i b(T0 t02, int i10) {
        return e(t02, i10) ? t02.y(i10) : t02.c(i10);
    }

    public static final w c(T0 t02, int i10, int i11, int i12, long j10, boolean z10, boolean z11) {
        return new D(z11, 1, 1, z10 ? null : new C2051k(new C2051k.a(b(t02, W0.n(j10)), W0.n(j10), 1L), new C2051k.a(b(t02, W0.i(j10)), W0.i(j10), 1L), W0.m(j10)), new C2050j(1L, 1, i10, i11, i12, t02));
    }

    public static final boolean d(C2051k c2051k, w wVar) {
        if (c2051k == null || wVar == null) {
            return true;
        }
        if (c2051k.e().d() == c2051k.c().d()) {
            return c2051k.e().c() == c2051k.c().c();
        }
        if ((c2051k.d() ? c2051k.e() : c2051k.c()).c() != 0) {
            return false;
        }
        if (wVar.c().l() != (c2051k.d() ? c2051k.c() : c2051k.e()).c()) {
            return false;
        }
        kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
        j10.f52255a = true;
        wVar.f(new a(j10));
        return j10.f52255a;
    }

    private static final boolean e(T0 t02, int i10) {
        if (t02.l().j().length() != 0) {
            int iQ = t02.q(i10);
            if (i10 != 0 && iQ == t02.q(i10 - 1)) {
                return false;
            }
            if (i10 != t02.l().j().length() && iQ == t02.q(i10 + 1)) {
                return false;
            }
        }
        return true;
    }
}
