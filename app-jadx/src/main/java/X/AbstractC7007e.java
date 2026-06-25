package x;

import androidx.compose.foundation.BorderModifierNodeElement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import p0.C5911f;
import r0.AbstractC6219a;
import r0.AbstractC6220b;
import r0.C6224f;
import r0.C6228j;
import s0.AbstractC6358h0;
import s0.E1;
import s0.F1;
import s0.InterfaceC6374m1;
import s0.q1;
import s0.t1;
import u0.AbstractC6712g;
import u0.C6715j;
import u0.C6716k;
import u0.InterfaceC6708c;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: x.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7007e {

    /* JADX INFO: renamed from: x.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f63335a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6708c) obj);
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC6708c interfaceC6708c) {
            interfaceC6708c.B1();
        }
    }

    /* JADX INFO: renamed from: x.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC6358h0 f63336a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f63337b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f63338c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC6712g f63339d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC6358h0 abstractC6358h0, long j10, long j11, AbstractC6712g abstractC6712g) {
            super(1);
            this.f63336a = abstractC6358h0;
            this.f63337b = j10;
            this.f63338c = j11;
            this.f63339d = abstractC6712g;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6708c) obj);
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC6708c interfaceC6708c) {
            interfaceC6708c.B1();
            InterfaceC6711f.P(interfaceC6708c, this.f63336a, this.f63337b, this.f63338c, 0.0f, this.f63339d, null, 0, 104, null);
        }
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, C7009g c7009g, E1 e12) {
        return h(eVar, c7009g.b(), c7009g.a(), e12);
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, float f10, long j10, E1 e12) {
        return h(eVar, f10, new F1(j10, null), e12);
    }

    public static /* synthetic */ androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f10, long j10, E1 e12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            e12 = t1.a();
        }
        return f(eVar, f10, j10, e12);
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, float f10, AbstractC6358h0 abstractC6358h0, E1 e12) {
        return eVar.then(new BorderModifierNodeElement(f10, abstractC6358h0, e12, null));
    }

    private static final C6228j i(float f10, C6228j c6228j) {
        return new C6228j(f10, f10, c6228j.j() - f10, c6228j.d() - f10, m(c6228j.h(), f10), m(c6228j.i(), f10), m(c6228j.c(), f10), m(c6228j.b(), f10), null);
    }

    public static final InterfaceC6374m1 j(InterfaceC6374m1 interfaceC6374m1, C6228j c6228j, float f10, boolean z10) {
        interfaceC6374m1.reset();
        InterfaceC6374m1.s(interfaceC6374m1, c6228j, null, 2, null);
        if (!z10) {
            InterfaceC6374m1 interfaceC6374m1A = s0.V.a();
            InterfaceC6374m1.s(interfaceC6374m1A, i(f10, c6228j), null, 2, null);
            interfaceC6374m1.m(interfaceC6374m1, interfaceC6374m1A, q1.f58979a.a());
        }
        return interfaceC6374m1;
    }

    public static final p0.j k(C5911f c5911f) {
        return c5911f.p(a.f63335a);
    }

    public static final p0.j l(C5911f c5911f, AbstractC6358h0 abstractC6358h0, long j10, long j11, boolean z10, float f10) {
        return c5911f.p(new b(abstractC6358h0, z10 ? C6224f.f58329b.c() : j10, z10 ? c5911f.f() : j11, z10 ? C6715j.f61115a : new C6716k(f10, 0.0f, 0, 0, null, 30, null)));
    }

    public static final long m(long j10, float f10) {
        return AbstractC6220b.a(Math.max(0.0f, AbstractC6219a.d(j10) - f10), Math.max(0.0f, AbstractC6219a.e(j10) - f10));
    }
}
