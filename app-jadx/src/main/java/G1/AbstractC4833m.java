package g1;

import U0.K0;
import ie.InterfaceC5082a;
import k1.AbstractC5437b;
import s0.AbstractC6358h0;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: renamed from: g1.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4833m {
    public static final p b(p pVar, p pVar2, float f10) {
        boolean z10 = pVar instanceof C4823c;
        if (!z10 && !(pVar2 instanceof C4823c)) {
            return p.f47302a.b(AbstractC6387s0.i(pVar.b(), pVar2.b(), f10));
        }
        if (!z10 || !(pVar2 instanceof C4823c)) {
            return (p) K0.d(pVar, pVar2, f10);
        }
        C4823c c4823c = (C4823c) pVar;
        C4823c c4823c2 = (C4823c) pVar2;
        return p.f47302a.a((AbstractC6358h0) K0.d(c4823c.i(), c4823c2.i(), f10), AbstractC5437b.b(c4823c.a(), c4823c2.a(), f10));
    }

    public static final long c(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : C6385r0.q(j10, C6385r0.t(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final float d(float f10, InterfaceC5082a interfaceC5082a) {
        return Float.isNaN(f10) ? ((Number) interfaceC5082a.invoke()).floatValue() : f10;
    }
}
