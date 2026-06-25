package K;

import K0.InterfaceC1788g;
import Q.AbstractC2041a;
import Q.InterfaceC2049i;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.d;
import i1.C5015h;
import i1.C5018k;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.C5911f;
import r0.C6224f;
import r0.C6230l;
import s0.InterfaceC6341b1;
import u0.InterfaceC6708c;
import u0.InterfaceC6709d;
import u0.InterfaceC6711f;
import u0.InterfaceC6713h;

/* JADX INFO: renamed from: K.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1751a {

    /* JADX INFO: renamed from: a */
    private static final float f9889a;

    /* JADX INFO: renamed from: b */
    private static final float f9890b;

    /* JADX INFO: renamed from: K.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0149a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f9891a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.ui.e f9892b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0149a(long j10, androidx.compose.ui.e eVar) {
            super(2);
            this.f9891a = j10;
            this.f9892b = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1653527038, i10, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:64)");
            }
            if (this.f9891a != 9205357640488583168L) {
                interfaceC2425m.V(1828881000);
                androidx.compose.ui.e eVarP = androidx.compose.foundation.layout.s.p(this.f9892b, C5018k.h(this.f9891a), C5018k.g(this.f9891a), 0.0f, 0.0f, 12, null);
                I0.B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.m(), false);
                int iA = AbstractC2410h.a(interfaceC2425m, 0);
                Y.I iR = interfaceC2425m.r();
                androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarP);
                InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
                InterfaceC5082a interfaceC5082aA = aVar.a();
                if (interfaceC2425m.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425m.I();
                if (interfaceC2425m.e()) {
                    interfaceC2425m.h(interfaceC5082aA);
                } else {
                    interfaceC2425m.s();
                }
                InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
                m2.e(interfaceC2425mB, bH, aVar.e());
                m2.e(interfaceC2425mB, iR, aVar.g());
                Function2 function2B = aVar.b();
                if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                    interfaceC2425mB.u(Integer.valueOf(iA));
                    interfaceC2425mB.m(Integer.valueOf(iA), function2B);
                }
                m2.e(interfaceC2425mB, eVarF, aVar.f());
                androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
                AbstractC1751a.b(null, interfaceC2425m, 0, 1);
                interfaceC2425m.x();
                interfaceC2425m.O();
            } else {
                interfaceC2425m.V(1829217412);
                AbstractC1751a.b(this.f9892b, interfaceC2425m, 0, 0);
                interfaceC2425m.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: K.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC2049i f9893a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.ui.e f9894b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f9895c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f9896d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f9897e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2049i interfaceC2049i, androidx.compose.ui.e eVar, long j10, int i10, int i11) {
            super(2);
            this.f9893a = interfaceC2049i;
            this.f9894b = eVar;
            this.f9895c = j10;
            this.f9896d = i10;
            this.f9897e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1751a.a(this.f9893a, this.f9894b, this.f9895c, interfaceC2425m, AbstractC2409g1.a(this.f9896d | 1), this.f9897e);
        }
    }

    /* JADX INFO: renamed from: K.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC2049i f9898a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC2049i interfaceC2049i) {
            super(1);
            this.f9898a = interfaceC2049i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((R0.C) obj);
            return Td.L.f17438a;
        }

        public final void invoke(R0.C c10) {
            c10.b(Q.v.d(), new Q.u(EnumC1762l.Cursor, this.f9898a.a(), Q.t.Middle, true, null));
        }
    }

    /* JADX INFO: renamed from: K.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f9899a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f9900b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f9901c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.e eVar, int i10, int i11) {
            super(2);
            this.f9899a = eVar;
            this.f9900b = i10;
            this.f9901c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1751a.b(this.f9899a, interfaceC2425m, AbstractC2409g1.a(this.f9900b | 1), this.f9901c);
        }
    }

    /* JADX INFO: renamed from: K.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        public static final e f9902a = new e();

        /* JADX INFO: renamed from: K.a$e$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0150a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ long f9903a;

            /* JADX INFO: renamed from: K.a$e$a$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0151a extends AbstractC5506u implements Function1 {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ float f9904a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ InterfaceC6341b1 f9905b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ androidx.compose.ui.graphics.d f9906c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0151a(float f10, InterfaceC6341b1 interfaceC6341b1, androidx.compose.ui.graphics.d dVar) {
                    super(1);
                    this.f9904a = f10;
                    this.f9905b = interfaceC6341b1;
                    this.f9906c = dVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((InterfaceC6708c) obj);
                    return Td.L.f17438a;
                }

                public final void invoke(InterfaceC6708c interfaceC6708c) {
                    interfaceC6708c.B1();
                    float f10 = this.f9904a;
                    InterfaceC6341b1 interfaceC6341b1 = this.f9905b;
                    androidx.compose.ui.graphics.d dVar = this.f9906c;
                    InterfaceC6709d interfaceC6709dN1 = interfaceC6708c.n1();
                    long jF = interfaceC6709dN1.f();
                    interfaceC6709dN1.b().p();
                    try {
                        InterfaceC6713h interfaceC6713hA = interfaceC6709dN1.a();
                        InterfaceC6713h.e(interfaceC6713hA, f10, 0.0f, 2, null);
                        interfaceC6713hA.g(45.0f, C6224f.f58329b.c());
                        InterfaceC6711f.K0(interfaceC6708c, interfaceC6341b1, 0L, 0.0f, null, dVar, 0, 46, null);
                    } finally {
                        interfaceC6709dN1.b().k();
                        interfaceC6709dN1.e(jF);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0150a(long j10) {
                super(1);
                this.f9903a = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            public final p0.j invoke(C5911f c5911f) {
                float fI = C6230l.i(c5911f.f()) / 2.0f;
                return c5911f.p(new C0151a(fI, AbstractC2041a.d(c5911f, fI), d.a.b(androidx.compose.ui.graphics.d.f26763b, this.f9903a, 0, 2, null)));
            }
        }

        e() {
            super(3);
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(-2126899193);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-2126899193, i10, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
            }
            long jB = ((Q.J) interfaceC2425m.n(Q.K.b())).b();
            e.a aVar = androidx.compose.ui.e.f26613a;
            boolean zD = interfaceC2425m.d(jB);
            Object objD = interfaceC2425m.D();
            if (zD || objD == InterfaceC2425m.f22370a.a()) {
                objD = new C0150a(jB);
                interfaceC2425m.u(objD);
            }
            androidx.compose.ui.e eVarThen = eVar.then(androidx.compose.ui.draw.b.c(aVar, (Function1) objD));
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarThen;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    static {
        float fN = C5015h.n(25);
        f9889a = fN;
        f9890b = C5015h.n(C5015h.n(fN * 2.0f) / 2.4142137f);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(Q.InterfaceC2049i r8, androidx.compose.ui.e r9, long r10, Y.InterfaceC2425m r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K.AbstractC1751a.a(Q.i, androidx.compose.ui.e, long, Y.m, int, int):void");
    }

    public static final void b(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f26613a;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(694251107, i12, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            C.K.a(d(androidx.compose.foundation.layout.s.s(eVar, f9890b, f9889a)), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new d(eVar, i10, i11));
        }
    }

    private static final androidx.compose.ui.e d(androidx.compose.ui.e eVar) {
        return androidx.compose.ui.c.c(eVar, null, e.f9902a, 1, null);
    }
}
