package androidx.compose.foundation.gestures;

import B.m;
import E0.C;
import E0.Q;
import Td.L;
import Td.v;
import Zd.i;
import ae.AbstractC2605b;
import i1.InterfaceC5011d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.K;
import l0.k;
import w.m0;
import x.InterfaceC6999T;
import z.InterfaceC7262d;
import z.n;
import z.p;
import z.q;
import z.u;
import z.x;
import z.z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a */
    private static final Function1 f25976a = a.f25980a;

    /* JADX INFO: renamed from: b */
    private static final u f25977b = new c();

    /* JADX INFO: renamed from: c */
    private static final k f25978c = new b();

    /* JADX INFO: renamed from: d */
    private static final C0450d f25979d = new C0450d();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f25980a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(C c10) {
            return Boolean.valueOf(!Q.g(c10.n(), Q.f4086a.b()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements k {
        b() {
        }

        @Override // l0.k
        public float E() {
            return 1.0f;
        }

        @Override // Zd.i
        public i a1(i.c cVar) {
            return k.a.c(this, cVar);
        }

        @Override // Zd.i.b, Zd.i
        public i.b l(i.c cVar) {
            return k.a.b(this, cVar);
        }

        @Override // Zd.i
        public i w(i iVar) {
            return k.a.d(this, iVar);
        }

        @Override // Zd.i
        public Object y1(Object obj, Function2 function2) {
            return k.a.a(this, obj, function2);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.d$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0450d implements InterfaceC5011d {
        C0450d() {
        }

        @Override // i1.InterfaceC5011d
        public float getDensity() {
            return 1.0f;
        }

        @Override // i1.InterfaceC5019l
        public float j1() {
            return 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f25981a;

        /* JADX INFO: renamed from: b */
        Object f25982b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f25983c;

        /* JADX INFO: renamed from: d */
        int f25984d;

        e(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25983c = obj;
            this.f25984d |= Integer.MIN_VALUE;
            return d.j(null, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f25985a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f25986b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ z f25987c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f25988d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ K f25989e;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ K f25990a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ z f25991b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ p f25992c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(K k10, z zVar, p pVar) {
                super(2);
                this.f25990a = k10;
                this.f25991b = zVar;
                this.f25992c = pVar;
            }

            public final void a(float f10, float f11) {
                float f12 = f10 - this.f25990a.f52256a;
                z zVar = this.f25991b;
                this.f25990a.f52256a += zVar.t(zVar.A(this.f25992c.b(zVar.B(zVar.t(f12)), D0.e.f3532a.b())));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z zVar, long j10, K k10, Zd.e eVar) {
            super(2, eVar);
            this.f25987c = zVar;
            this.f25988d = j10;
            this.f25989e = k10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(p pVar, Zd.e eVar) {
            return ((f) create(pVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            f fVar = new f(this.f25987c, this.f25988d, this.f25989e, eVar);
            fVar.f25986b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25985a;
            if (i10 == 0) {
                v.b(obj);
                p pVar = (p) this.f25986b;
                float fA = this.f25987c.A(this.f25988d);
                a aVar = new a(this.f25989e, this.f25987c, pVar);
                this.f25985a = 1;
                if (m0.e(0.0f, fA, 0.0f, null, aVar, this, 12, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    public static final k e() {
        return f25978c;
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, x xVar, q qVar, InterfaceC6999T interfaceC6999T, boolean z10, boolean z11, n nVar, m mVar, InterfaceC7262d interfaceC7262d) {
        return eVar.then(new ScrollableElement(xVar, qVar, interfaceC6999T, z10, z11, nVar, mVar, interfaceC7262d));
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, x xVar, q qVar, boolean z10, boolean z11, n nVar, m mVar) {
        return h(eVar, xVar, qVar, null, z10, z11, nVar, mVar, null, 128, null);
    }

    public static /* synthetic */ androidx.compose.ui.e h(androidx.compose.ui.e eVar, x xVar, q qVar, InterfaceC6999T interfaceC6999T, boolean z10, boolean z11, n nVar, m mVar, InterfaceC7262d interfaceC7262d, int i10, Object obj) {
        InterfaceC7262d interfaceC7262d2;
        androidx.compose.ui.e eVar2;
        x xVar2;
        q qVar2;
        InterfaceC6999T interfaceC6999T2;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        boolean z13 = (i10 & 16) != 0 ? false : z11;
        n nVar2 = (i10 & 32) != 0 ? null : nVar;
        m mVar2 = (i10 & 64) != 0 ? null : mVar;
        if ((i10 & 128) != 0) {
            interfaceC7262d2 = null;
            eVar2 = eVar;
            qVar2 = qVar;
            interfaceC6999T2 = interfaceC6999T;
            xVar2 = xVar;
        } else {
            interfaceC7262d2 = interfaceC7262d;
            eVar2 = eVar;
            xVar2 = xVar;
            qVar2 = qVar;
            interfaceC6999T2 = interfaceC6999T;
        }
        return f(eVar2, xVar2, qVar2, interfaceC6999T2, z12, z13, nVar2, mVar2, interfaceC7262d2);
    }

    public static /* synthetic */ androidx.compose.ui.e i(androidx.compose.ui.e eVar, x xVar, q qVar, boolean z10, boolean z11, n nVar, m mVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return g(eVar, xVar, qVar, z12, z11, (i10 & 16) != 0 ? null : nVar, (i10 & 32) != 0 ? null : mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(z.z r10, long r11, Zd.e r13) {
        /*
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.d.e
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.d$e r0 = (androidx.compose.foundation.gestures.d.e) r0
            int r1 = r0.f25984d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25984d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.d$e r0 = new androidx.compose.foundation.gestures.d$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f25983c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f25984d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r10 = r0.f25982b
            kotlin.jvm.internal.K r10 = (kotlin.jvm.internal.K) r10
            java.lang.Object r11 = r0.f25981a
            z.z r11 = (z.z) r11
            Td.v.b(r13)
            r8 = r10
            r10 = r11
            goto L5b
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            Td.v.b(r13)
            kotlin.jvm.internal.K r8 = new kotlin.jvm.internal.K
            r8.<init>()
            x.L r13 = x.EnumC6992L.Default
            androidx.compose.foundation.gestures.d$f r4 = new androidx.compose.foundation.gestures.d$f
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            r0.f25981a = r5
            r0.f25982b = r8
            r0.f25984d = r3
            java.lang.Object r10 = r5.v(r13, r4, r0)
            if (r10 != r1) goto L5a
            return r1
        L5a:
            r10 = r5
        L5b:
            float r11 = r8.f52256a
            long r10 = r10.B(r11)
            r0.f r10 = r0.C6224f.d(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.j(z.z, long, Zd.e):java.lang.Object");
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements u {
        c() {
        }

        @Override // z.u
        public float a(float f10) {
            return f10;
        }
    }
}
