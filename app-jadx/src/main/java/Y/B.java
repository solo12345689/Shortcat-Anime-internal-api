package Y;

import Td.C2160k;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Y.U;
import i0.AbstractC4977V;
import i0.AbstractC4989h;
import i0.InterfaceC4976U;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k0.InterfaceC5422l;
import k0.InterfaceC5428r;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6550P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B implements Q, InterfaceC2462y1, InterfaceC2412h1, N0, InterfaceC5428r {

    /* JADX INFO: renamed from: a */
    private final AbstractC2460y f22058a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2398d f22059b;

    /* JADX INFO: renamed from: c */
    private final AtomicReference f22060c;

    /* JADX INFO: renamed from: d */
    private final Object f22061d;

    /* JADX INFO: renamed from: e */
    private final Set f22062e;

    /* JADX INFO: renamed from: f */
    private final E1 f22063f;

    /* JADX INFO: renamed from: g */
    private final C6550P f22064g;

    /* JADX INFO: renamed from: h */
    private final t.Q f22065h;

    /* JADX INFO: renamed from: i */
    private final t.Q f22066i;

    /* JADX INFO: renamed from: j */
    private final C6550P f22067j;

    /* JADX INFO: renamed from: k */
    private final Z.a f22068k;

    /* JADX INFO: renamed from: l */
    private final Z.a f22069l;

    /* JADX INFO: renamed from: m */
    private final C6550P f22070m;

    /* JADX INFO: renamed from: n */
    private C6550P f22071n;

    /* JADX INFO: renamed from: o */
    private boolean f22072o;

    /* JADX INFO: renamed from: p */
    private C1 f22073p;

    /* JADX INFO: renamed from: q */
    private R0 f22074q;

    /* JADX INFO: renamed from: r */
    private B f22075r;

    /* JADX INFO: renamed from: s */
    private int f22076s;

    /* JADX INFO: renamed from: t */
    private final K f22077t;

    /* JADX INFO: renamed from: u */
    private final g0.q f22078u;

    /* JADX INFO: renamed from: v */
    private final C2442s f22079v;

    /* JADX INFO: renamed from: w */
    private final Zd.i f22080w;

    /* JADX INFO: renamed from: x */
    private final boolean f22081x;

    /* JADX INFO: renamed from: y */
    private int f22082y;

    /* JADX INFO: renamed from: z */
    private Function2 f22083z;

    public B(AbstractC2460y abstractC2460y, InterfaceC2398d interfaceC2398d, Zd.i iVar) {
        this.f22058a = abstractC2460y;
        this.f22059b = interfaceC2398d;
        this.f22060c = new AtomicReference(null);
        this.f22061d = new Object();
        Set setL = new t.Q(0, 1, null).l();
        this.f22062e = setL;
        E1 e12 = new E1();
        if (abstractC2460y.d()) {
            e12.i();
        }
        if (abstractC2460y.f()) {
            e12.l();
        }
        this.f22063f = e12;
        this.f22064g = a0.g.d(null, 1, null);
        this.f22065h = new t.Q(0, 1, null);
        this.f22066i = new t.Q(0, 1, null);
        this.f22067j = a0.g.d(null, 1, null);
        Z.a aVar = new Z.a();
        this.f22068k = aVar;
        Z.a aVar2 = new Z.a();
        this.f22069l = aVar2;
        this.f22070m = a0.g.d(null, 1, null);
        this.f22071n = a0.g.d(null, 1, null);
        K k10 = new K(null, false, abstractC2460y, 3, null);
        this.f22077t = k10;
        this.f22078u = new g0.q();
        C2442s c2442s = new C2442s(interfaceC2398d, abstractC2460y, e12, setL, aVar, aVar2, k10, this);
        abstractC2460y.q(c2442s);
        this.f22079v = c2442s;
        this.f22080w = iVar;
        this.f22081x = abstractC2460y instanceof C2433o1;
        this.f22083z = C2407g.f22327a.b();
    }

    private final void A(Object obj, boolean z10) {
        Object objE = this.f22064g.e(obj);
        if (objE == null) {
            return;
        }
        if (!(objE instanceof t.Q)) {
            C2406f1 c2406f1 = (C2406f1) objE;
            if (a0.g.g(this.f22070m, obj, c2406f1) || c2406f1.v(obj) == EnumC2423l0.f22361a) {
                return;
            }
            if (!c2406f1.w() || z10) {
                this.f22065h.h(c2406f1);
                return;
            } else {
                this.f22066i.h(c2406f1);
                return;
            }
        }
        t.Q q10 = (t.Q) objE;
        Object[] objArr = q10.f60055b;
        long[] jArr = q10.f60054a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        C2406f1 c2406f12 = (C2406f1) objArr[(i10 << 3) + i12];
                        if (!a0.g.g(this.f22070m, obj, c2406f12) && c2406f12.v(obj) != EnumC2423l0.f22361a) {
                            if (!c2406f12.w() || z10) {
                                this.f22065h.h(c2406f12);
                            } else {
                                this.f22066i.h(c2406f12);
                            }
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void B(java.util.Set r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.B.B(java.util.Set, boolean):void");
    }

    /* JADX WARN: Finally extract failed */
    private final void C(Z.a aVar) {
        InterfaceC2398d interfaceC2398dC;
        g0.q qVarD;
        long[] jArr;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        boolean zD;
        long[] jArr3;
        this.f22078u.r(this.f22062e, this.f22079v.K0());
        try {
            if (aVar.c()) {
                try {
                    if (this.f22069l.c() && this.f22074q == null) {
                        this.f22078u.j();
                    }
                } finally {
                }
            } else {
                g0.x xVar = g0.x.f47218a;
                Object objA = xVar.a("Compose:applyChanges");
                try {
                    R0 r02 = this.f22074q;
                    if (r02 == null || (interfaceC2398dC = r02.c()) == null) {
                        interfaceC2398dC = this.f22059b;
                    }
                    R0 r03 = this.f22074q;
                    if (r03 == null || (qVarD = r03.d()) == null) {
                        qVarD = this.f22078u;
                    }
                    interfaceC2398dC.j();
                    H1 h1G = this.f22063f.G();
                    int i11 = 0;
                    try {
                        aVar.b(interfaceC2398dC, h1G, qVarD, this.f22079v.K0());
                        Td.L l10 = Td.L.f17438a;
                        h1G.J(true);
                        interfaceC2398dC.f();
                        xVar.b(objA);
                        this.f22078u.m();
                        this.f22078u.n();
                        if (this.f22072o) {
                            objA = xVar.a("Compose:unobserve");
                            try {
                                this.f22072o = false;
                                C6550P c6550p = this.f22064g;
                                long[] jArr4 = c6550p.f60043a;
                                int length = jArr4.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j12 = jArr4[i12];
                                        char c11 = 7;
                                        long j13 = -9187201950435737472L;
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8;
                                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                                            int i15 = i11;
                                            while (i15 < i14) {
                                                if ((j12 & 255) < 128) {
                                                    int i16 = (i12 << 3) + i15;
                                                    c10 = c11;
                                                    Object obj = c6550p.f60044b[i16];
                                                    Object obj2 = c6550p.f60045c[i16];
                                                    j11 = j13;
                                                    if (obj2 instanceof t.Q) {
                                                        AbstractC5504s.f(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                        t.Q q10 = (t.Q) obj2;
                                                        Object[] objArr = q10.f60055b;
                                                        long[] jArr5 = q10.f60054a;
                                                        int length2 = jArr5.length - 2;
                                                        if (length2 >= 0) {
                                                            j10 = j12;
                                                            int i17 = i13;
                                                            int i18 = 0;
                                                            while (true) {
                                                                long j14 = jArr5[i18];
                                                                Object[] objArr2 = objArr;
                                                                long[] jArr6 = jArr5;
                                                                if ((((~j14) << c10) & j14 & j11) != j11) {
                                                                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                                    int i20 = 0;
                                                                    while (i20 < i19) {
                                                                        if ((j14 & 255) < 128) {
                                                                            jArr3 = jArr4;
                                                                            int i21 = (i18 << 3) + i20;
                                                                            if (!((C2406f1) objArr2[i21]).u()) {
                                                                                q10.A(i21);
                                                                            }
                                                                        } else {
                                                                            jArr3 = jArr4;
                                                                        }
                                                                        j14 >>= i17;
                                                                        i20++;
                                                                        jArr4 = jArr3;
                                                                    }
                                                                    jArr2 = jArr4;
                                                                    if (i19 != i17) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr2 = jArr4;
                                                                }
                                                                if (i18 == length2) {
                                                                    break;
                                                                }
                                                                i18++;
                                                                objArr = objArr2;
                                                                jArr5 = jArr6;
                                                                jArr4 = jArr2;
                                                                i17 = 8;
                                                            }
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j10 = j12;
                                                        }
                                                        zD = q10.d();
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j10 = j12;
                                                        AbstractC5504s.f(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zD = !((C2406f1) obj2).u();
                                                    }
                                                    if (zD) {
                                                        c6550p.v(i16);
                                                    }
                                                    i10 = 8;
                                                } else {
                                                    jArr2 = jArr4;
                                                    j10 = j12;
                                                    c10 = c11;
                                                    j11 = j13;
                                                    i10 = i13;
                                                }
                                                j12 = j10 >> i10;
                                                i15++;
                                                i13 = i10;
                                                c11 = c10;
                                                j13 = j11;
                                                jArr4 = jArr2;
                                            }
                                            jArr = jArr4;
                                            if (i14 != i13) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr4;
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i12++;
                                        jArr4 = jArr;
                                        i11 = 0;
                                    }
                                }
                                D();
                                Td.L l11 = Td.L.f17438a;
                                g0.x.f47218a.b(objA);
                            } finally {
                                g0.x.f47218a.b(objA);
                            }
                        }
                        try {
                            if (this.f22069l.c() && this.f22074q == null) {
                                this.f22078u.j();
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        h1G.J(false);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                if (this.f22069l.c() && this.f22074q == null) {
                    this.f22078u.j();
                }
                throw th4;
            } finally {
            }
        }
    }

    private final void D() {
        char c10;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        long j13;
        int i10;
        char c11;
        long j14;
        long j15;
        int i11;
        boolean zD;
        long[] jArr3;
        int i12;
        int i13;
        C6550P c6550p = this.f22067j;
        long[] jArr4 = c6550p.f60043a;
        int length = jArr4.length - 2;
        char c12 = 7;
        long j16 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            long j17 = 128;
            while (true) {
                long j18 = jArr4[i15];
                j11 = 255;
                if ((((~j18) << c12) & j18 & j16) != j16) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j18 & 255) < j17) {
                            c11 = c12;
                            int i18 = (i15 << 3) + i17;
                            j14 = j16;
                            Object obj = c6550p.f60044b[i18];
                            Object obj2 = c6550p.f60045c[i18];
                            if (obj2 instanceof t.Q) {
                                AbstractC5504s.f(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                t.Q q10 = (t.Q) obj2;
                                Object[] objArr = q10.f60055b;
                                long[] jArr5 = q10.f60054a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j15 = j17;
                                    int i19 = 0;
                                    int i20 = i14;
                                    while (true) {
                                        int i21 = length2;
                                        long j19 = jArr5[i19];
                                        j13 = j18;
                                        if ((((~j19) << c11) & j19 & j14) != j14) {
                                            int i22 = 8 - ((~(i19 - i21)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j19 & 255) < j15) {
                                                    jArr3 = jArr4;
                                                    int i24 = (i19 << 3) + i23;
                                                    i12 = i23;
                                                    i13 = i17;
                                                    if (!a0.g.e(this.f22064g, (U) objArr[i24])) {
                                                        q10.A(i24);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i12 = i23;
                                                    i13 = i17;
                                                }
                                                j19 >>= i20;
                                                i23 = i12 + 1;
                                                i17 = i13;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i10 = i17;
                                            if (i22 != i20) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i10 = i17;
                                        }
                                        length2 = i21;
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        j18 = j13;
                                        i17 = i10;
                                        jArr4 = jArr2;
                                        i20 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j13 = j18;
                                    i10 = i17;
                                    j15 = j17;
                                }
                                zD = q10.d();
                            } else {
                                jArr2 = jArr4;
                                j13 = j18;
                                i10 = i17;
                                j15 = j17;
                                AbstractC5504s.f(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zD = !a0.g.e(this.f22064g, (U) obj2);
                            }
                            if (zD) {
                                c6550p.v(i18);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr4;
                            j13 = j18;
                            i10 = i17;
                            c11 = c12;
                            j14 = j16;
                            j15 = j17;
                            i11 = i14;
                        }
                        j18 = j13 >> i11;
                        i17 = i10 + 1;
                        i14 = i11;
                        c12 = c11;
                        j16 = j14;
                        j17 = j15;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                    if (i16 != i14) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                c12 = c10;
                j16 = j10;
                j17 = j12;
                jArr4 = jArr;
                i14 = 8;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 255;
            j12 = 128;
        }
        if (!this.f22066i.e()) {
            return;
        }
        t.Q q11 = this.f22066i;
        Object[] objArr2 = q11.f60055b;
        long[] jArr6 = q11.f60054a;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i25 = 0;
        while (true) {
            long j20 = jArr6[i25];
            if ((((~j20) << c10) & j20 & j10) != j10) {
                int i26 = 8 - ((~(i25 - length3)) >>> 31);
                for (int i27 = 0; i27 < i26; i27++) {
                    if ((j20 & j11) < j12) {
                        int i28 = (i25 << 3) + i27;
                        if (!((C2406f1) objArr2[i28]).w()) {
                            q11.A(i28);
                        }
                    }
                    j20 >>= 8;
                }
                if (i26 != 8) {
                    return;
                }
            }
            if (i25 == length3) {
                return;
            } else {
                i25++;
            }
        }
    }

    private final boolean E() {
        boolean z10;
        synchronized (this.f22061d) {
            z10 = true;
            if (this.f22082y != 1) {
                z10 = false;
            }
            if (z10) {
                this.f22082y = 0;
            }
        }
        return z10;
    }

    private final void F(Function2 function2) {
        this.f22083z = function2;
        this.f22058a.a(this, function2);
    }

    private final Q0 G(boolean z10, Function2 function2) {
        if (!(this.f22074q == null)) {
            V0.b("A pausable composition is in progress");
        }
        R0 r02 = new R0(this, this.f22058a, this.f22079v, this.f22062e, function2, z10, this.f22059b, this.f22061d);
        this.f22074q = r02;
        return r02;
    }

    private final void H(Function2 function2) {
        this.f22079v.z1();
        F(function2);
        this.f22079v.x0();
    }

    private final void I() {
        Object andSet = this.f22060c.getAndSet(C.f22084a);
        if (andSet != null) {
            if (AbstractC5504s.c(andSet, C.f22084a)) {
                AbstractC2454w.u("pending composition has not been applied");
                throw new C2160k();
            }
            if (andSet instanceof Set) {
                B((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC2454w.u("corrupt pendingModifications drain: " + this.f22060c);
                throw new C2160k();
            }
            for (Set set : (Set[]) andSet) {
                B(set, true);
            }
        }
    }

    private final void J() {
        Object andSet = this.f22060c.getAndSet(null);
        if (AbstractC5504s.c(andSet, C.f22084a)) {
            return;
        }
        if (andSet instanceof Set) {
            B((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                B(set, false);
            }
            return;
        }
        if (andSet == null) {
            AbstractC2454w.u("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new C2160k();
        }
        AbstractC2454w.u("corrupt pendingModifications drain: " + this.f22060c);
        throw new C2160k();
    }

    private final void K() {
        Object andSet = this.f22060c.getAndSet(Ud.a0.d());
        if (AbstractC5504s.c(andSet, C.f22084a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            B((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC2454w.u("corrupt pendingModifications drain: " + this.f22060c);
            throw new C2160k();
        }
        for (Set set : (Set[]) andSet) {
            B(set, false);
        }
    }

    private final void L() {
        int i10 = this.f22082y;
        if (!(i10 == 0)) {
            V0.b(i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f22074q == null) {
            return;
        }
        V0.b("A pausable composition is in progress");
    }

    private final boolean N() {
        return this.f22079v.G0();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a6 A[Catch: all -> 0x001e, EDGE_INSN: B:133:0x00a6->B:118:0x00a6 BREAK  A[LOOP:0: B:100:0x005d->B:114:0x009e], EDGE_INSN: B:134:0x00a6->B:118:0x00a6 BREAK  A[LOOP:0: B:100:0x005d->B:114:0x009e], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:73:0x000b, B:75:0x0010, B:83:0x0023, B:85:0x0029, B:89:0x002f, B:90:0x0038, B:92:0x003c, B:93:0x0045, B:95:0x004d, B:97:0x0051, B:100:0x005d, B:102:0x006d, B:104:0x0079, B:106:0x0083, B:110:0x0092, B:114:0x009e, B:115:0x00a1, B:118:0x00a6), top: B:131:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Y.EnumC2423l0 Q(Y.C2406f1 r21, Y.C2392b r22, java.lang.Object r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            java.lang.Object r4 = r1.f22061d
            monitor-enter(r4)
            Y.B r5 = r1.f22075r     // Catch: java.lang.Throwable -> L1e
            r6 = 0
            if (r5 == 0) goto L21
            Y.E1 r7 = r1.f22063f     // Catch: java.lang.Throwable -> L1e
            int r8 = r1.f22076s     // Catch: java.lang.Throwable -> L1e
            boolean r7 = r7.B(r8, r2)     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto L1b
            goto L1c
        L1b:
            r5 = r6
        L1c:
            r6 = r5
            goto L21
        L1e:
            r0 = move-exception
            goto Lc4
        L21:
            if (r6 != 0) goto Lab
            boolean r5 = r1.X(r0, r3)     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto L2d
            Y.l0 r0 = Y.EnumC2423l0.f22364d     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r4)
            return r0
        L2d:
            if (r3 != 0) goto L38
            t.P r5 = r1.f22071n     // Catch: java.lang.Throwable -> L1e
            Y.A1 r7 = Y.A1.f22057a     // Catch: java.lang.Throwable -> L1e
            a0.g.i(r5, r0, r7)     // Catch: java.lang.Throwable -> L1e
            goto Lab
        L38:
            boolean r5 = r3 instanceof Y.U     // Catch: java.lang.Throwable -> L1e
            if (r5 != 0) goto L45
            t.P r5 = r1.f22071n     // Catch: java.lang.Throwable -> L1e
            Y.A1 r7 = Y.A1.f22057a     // Catch: java.lang.Throwable -> L1e
            a0.g.i(r5, r0, r7)     // Catch: java.lang.Throwable -> L1e
            goto Lab
        L45:
            t.P r5 = r1.f22071n     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r5 = r5.e(r0)     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto La6
            boolean r7 = r5 instanceof t.Q     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto La1
            t.Q r5 = (t.Q) r5     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r7 = r5.f60055b     // Catch: java.lang.Throwable -> L1e
            long[] r5 = r5.f60054a     // Catch: java.lang.Throwable -> L1e
            int r8 = r5.length     // Catch: java.lang.Throwable -> L1e
            int r8 = r8 + (-2)
            if (r8 < 0) goto La6
            r10 = 0
        L5d:
            r11 = r5[r10]     // Catch: java.lang.Throwable -> L1e
            long r13 = ~r11     // Catch: java.lang.Throwable -> L1e
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L9c
            int r13 = r10 - r8
            int r13 = ~r13     // Catch: java.lang.Throwable -> L1e
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L77:
            if (r15 >= r13) goto L99
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L90
            int r16 = r10 << 3
            int r16 = r16 + r15
            r9 = r7[r16]     // Catch: java.lang.Throwable -> L1e
            r16 = r14
            Y.A1 r14 = Y.A1.f22057a     // Catch: java.lang.Throwable -> L1e
            if (r9 != r14) goto L92
            goto Lab
        L90:
            r16 = r14
        L92:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L77
        L99:
            r9 = r14
            if (r13 != r9) goto La6
        L9c:
            if (r10 == r8) goto La6
            int r10 = r10 + 1
            goto L5d
        La1:
            Y.A1 r7 = Y.A1.f22057a     // Catch: java.lang.Throwable -> L1e
            if (r5 != r7) goto La6
            goto Lab
        La6:
            t.P r5 = r1.f22071n     // Catch: java.lang.Throwable -> L1e
            a0.g.a(r5, r0, r3)     // Catch: java.lang.Throwable -> L1e
        Lab:
            monitor-exit(r4)
            if (r6 == 0) goto Lb3
            Y.l0 r0 = r6.Q(r0, r2, r3)
            return r0
        Lb3:
            Y.y r0 = r1.f22058a
            r0.m(r1)
            boolean r0 = r1.q()
            if (r0 == 0) goto Lc1
            Y.l0 r0 = Y.EnumC2423l0.f22363c
            return r0
        Lc1:
            Y.l0 r0 = Y.EnumC2423l0.f22362b
            return r0
        Lc4:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.B.Q(Y.f1, Y.b, java.lang.Object):Y.l0");
    }

    private final void R(Object obj) {
        Object objE = this.f22064g.e(obj);
        if (objE == null) {
            return;
        }
        if (!(objE instanceof t.Q)) {
            C2406f1 c2406f1 = (C2406f1) objE;
            if (c2406f1.v(obj) == EnumC2423l0.f22364d) {
                a0.g.a(this.f22070m, obj, c2406f1);
                return;
            }
            return;
        }
        t.Q q10 = (t.Q) objE;
        Object[] objArr = q10.f60055b;
        long[] jArr = q10.f60054a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        C2406f1 c2406f12 = (C2406f1) objArr[(i10 << 3) + i12];
                        if (c2406f12.v(obj) == EnumC2423l0.f22364d) {
                            a0.g.a(this.f22070m, obj, c2406f12);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final InterfaceC5422l S() {
        this.f22077t.a();
        return null;
    }

    private final C6550P W() {
        C6550P c6550p = this.f22071n;
        this.f22071n = a0.g.d(null, 1, null);
        return c6550p;
    }

    private final boolean X(C2406f1 c2406f1, Object obj) {
        return q() && this.f22079v.B1(c2406f1, obj);
    }

    public final List M(C2392b c2392b) {
        long[] jArr;
        long[] jArr2;
        int i10;
        int i11;
        long j10;
        char c10;
        long j11;
        int i12;
        boolean zD;
        Object[] objArr;
        int i13;
        long j12;
        Object[] objArr2;
        if (a0.g.f(this.f22071n) <= 0) {
            return AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList();
        E1 e12 = this.f22063f;
        C6550P c6550p = this.f22071n;
        long[] jArr3 = c6550p.f60043a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j13 = jArr3[i14];
                char c11 = 7;
                long j14 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j13 & 255) < 128) {
                            c10 = c11;
                            int i18 = (i14 << 3) + i17;
                            j11 = j14;
                            Object obj = c6550p.f60044b[i18];
                            Object obj2 = c6550p.f60045c[i18];
                            int i19 = i15;
                            AbstractC5504s.f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            if (obj2 instanceof t.Q) {
                                AbstractC5504s.f(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                t.Q q10 = (t.Q) obj2;
                                Object[] objArr3 = q10.f60055b;
                                long[] jArr4 = q10.f60054a;
                                jArr2 = jArr3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j10 = j13;
                                    int i20 = 0;
                                    while (true) {
                                        long j15 = jArr4[i20];
                                        i10 = length;
                                        i11 = i17;
                                        if ((((~j15) << c10) & j15 & j11) != j11) {
                                            int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                            int i22 = 0;
                                            while (i22 < i21) {
                                                if ((j15 & 255) < 128) {
                                                    i13 = i22;
                                                    int i23 = (i20 << 3) + i13;
                                                    j12 = j15;
                                                    Object obj3 = objArr3[i23];
                                                    C2406f1 c2406f1 = (C2406f1) obj;
                                                    objArr2 = objArr3;
                                                    C2392b c2392bH = c2406f1.h();
                                                    if (c2392bH != null && e12.D(c2392b, c2392bH)) {
                                                        arrayList.add(Td.z.a(c2406f1, obj3));
                                                        q10.A(i23);
                                                    }
                                                } else {
                                                    i13 = i22;
                                                    j12 = j15;
                                                    objArr2 = objArr3;
                                                }
                                                j15 = j12 >> i19;
                                                i22 = i13 + 1;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i21 != i19) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i20 == length2) {
                                            break;
                                        }
                                        i20++;
                                        length = i10;
                                        i17 = i11;
                                        objArr3 = objArr;
                                        i19 = 8;
                                    }
                                } else {
                                    i10 = length;
                                    i11 = i17;
                                    j10 = j13;
                                }
                                zD = q10.d();
                            } else {
                                jArr2 = jArr3;
                                i10 = length;
                                i11 = i17;
                                j10 = j13;
                                AbstractC5504s.f(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                C2406f1 c2406f12 = (C2406f1) obj;
                                C2392b c2392bH2 = c2406f12.h();
                                if (c2392bH2 == null || !e12.D(c2392b, c2392bH2)) {
                                    zD = false;
                                } else {
                                    arrayList.add(Td.z.a(c2406f12, obj2));
                                    zD = true;
                                }
                            }
                            if (zD) {
                                c6550p.v(i18);
                            }
                            i12 = 8;
                        } else {
                            jArr2 = jArr3;
                            i10 = length;
                            i11 = i17;
                            j10 = j13;
                            c10 = c11;
                            j11 = j14;
                            i12 = i15;
                        }
                        j13 = j10 >> i12;
                        i15 = i12;
                        c11 = c10;
                        j14 = j11;
                        jArr3 = jArr2;
                        length = i10;
                        i17 = i11 + 1;
                    }
                    jArr = jArr3;
                    int i24 = length;
                    if (i16 != i15) {
                        break;
                    }
                    length = i24;
                } else {
                    jArr = jArr3;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                jArr3 = jArr;
            }
        }
        return arrayList;
    }

    public final K O() {
        return this.f22077t;
    }

    public final E1 P() {
        return this.f22063f;
    }

    public final void T(t.e0 e0Var) {
        this.f22074q = null;
        if (e0Var != null) {
            this.f22078u.q(e0Var);
            this.f22082y = 2;
        }
    }

    public final void U(U u10) {
        if (a0.g.e(this.f22064g, u10)) {
            return;
        }
        a0.g.h(this.f22067j, u10);
    }

    public final void V(Object obj, C2406f1 c2406f1) {
        a0.g.g(this.f22064g, obj, c2406f1);
    }

    public final void Y() {
        synchronized (this.f22061d) {
            K();
            C6550P c6550pW = W();
            try {
                this.f22079v.D1(c6550pW);
                Td.L l10 = Td.L.f17438a;
            } finally {
            }
        }
    }

    @Override // Y.Q, Y.InterfaceC2412h1
    public void a(Object obj) {
        C2406f1 c2406f1I0;
        int i10;
        int i11;
        int i12;
        if (N() || (c2406f1I0 = this.f22079v.I0()) == null) {
            return;
        }
        int i13 = 1;
        c2406f1I0.O(true);
        boolean z10 = c2406f1I0.z(obj);
        S();
        if (z10) {
            return;
        }
        if (obj instanceof AbstractC4977V) {
            ((AbstractC4977V) obj).s(AbstractC4989h.a(1));
        }
        a0.g.a(this.f22064g, obj, c2406f1I0);
        if (obj instanceof U) {
            U u10 = (U) obj;
            U.a aVarO = u10.o();
            a0.g.h(this.f22067j, obj);
            t.T tB = aVarO.b();
            Object[] objArr = tB.f60001b;
            long[] jArr = tB.f60000a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j10 = jArr[i14];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j10 & 255) < 128) {
                                i11 = i13;
                                InterfaceC4976U interfaceC4976U = (InterfaceC4976U) objArr[(i14 << 3) + i17];
                                if (interfaceC4976U instanceof AbstractC4977V) {
                                    i12 = i15;
                                    ((AbstractC4977V) interfaceC4976U).s(AbstractC4989h.a(i11));
                                } else {
                                    i12 = i15;
                                }
                                a0.g.a(this.f22067j, interfaceC4976U, obj);
                            } else {
                                i11 = i13;
                                i12 = i15;
                            }
                            j10 >>= i12;
                            i17++;
                            i13 = i11;
                            i15 = i12;
                        }
                        i10 = i13;
                        if (i16 != i15) {
                            break;
                        }
                    } else {
                        i10 = i13;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    i13 = i10;
                }
            }
            c2406f1I0.y(u10, aVarO.a());
        }
    }

    @Override // Y.Q
    public void b(Function2 function2) {
        try {
            synchronized (this.f22061d) {
                I();
                try {
                    this.f22079v.k0(W(), function2, this.f22073p);
                    Td.L l10 = Td.L.f17438a;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f22062e.isEmpty()) {
                    g0.q qVar = this.f22078u;
                    try {
                        qVar.r(this.f22062e, this.f22079v.K0());
                        qVar.j();
                        qVar.i();
                    } catch (Throwable th3) {
                        qVar.i();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                v();
                throw th4;
            }
        }
    }

    @Override // Y.Q
    public void c() {
        synchronized (this.f22061d) {
            try {
                if (this.f22069l.d()) {
                    C(this.f22069l);
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                try {
                    if (!this.f22062e.isEmpty()) {
                        g0.q qVar = this.f22078u;
                        try {
                            qVar.r(this.f22062e, this.f22079v.K0());
                            qVar.j();
                            qVar.i();
                        } catch (Throwable th3) {
                            qVar.i();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    v();
                    throw th4;
                }
            }
        }
    }

    @Override // Y.N0
    public Q0 d(Function2 function2) {
        return G(E(), function2);
    }

    @Override // Y.InterfaceC2462y1
    public void deactivate() {
        synchronized (this.f22061d) {
            try {
                if (!(this.f22074q == null)) {
                    V0.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z10 = this.f22063f.u() > 0;
                if (z10 || !this.f22062e.isEmpty()) {
                    g0.x xVar = g0.x.f47218a;
                    Object objA = xVar.a("Compose:deactivate");
                    try {
                        g0.q qVar = this.f22078u;
                        try {
                            qVar.r(this.f22062e, this.f22079v.K0());
                            if (z10) {
                                this.f22059b.j();
                                H1 h1G = this.f22063f.G();
                                try {
                                    AbstractC2454w.v(h1G, this.f22078u);
                                    Td.L l10 = Td.L.f17438a;
                                    h1G.J(true);
                                    this.f22059b.f();
                                    qVar.m();
                                } catch (Throwable th2) {
                                    h1G.J(false);
                                    throw th2;
                                }
                            }
                            qVar.j();
                            qVar.i();
                            Td.L l11 = Td.L.f17438a;
                            xVar.b(objA);
                        } catch (Throwable th3) {
                            qVar.i();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        g0.x.f47218a.b(objA);
                        throw th4;
                    }
                }
                a0.g.b(this.f22064g);
                a0.g.b(this.f22067j);
                a0.g.b(this.f22071n);
                this.f22068k.a();
                this.f22069l.a();
                this.f22079v.q0();
                this.f22082y = 1;
                Td.L l12 = Td.L.f17438a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // Y.InterfaceC2457x
    public void dispose() {
        synchronized (this.f22061d) {
            try {
                if (this.f22079v.V0()) {
                    V0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f22082y != 3) {
                    this.f22082y = 3;
                    this.f22083z = C2407g.f22327a.a();
                    Z.a aVarJ0 = this.f22079v.J0();
                    if (aVarJ0 != null) {
                        C(aVarJ0);
                    }
                    boolean z10 = this.f22063f.u() > 0;
                    if (z10 || !this.f22062e.isEmpty()) {
                        g0.q qVar = this.f22078u;
                        try {
                            qVar.r(this.f22062e, this.f22079v.K0());
                            if (z10) {
                                this.f22059b.j();
                                H1 h1G = this.f22063f.G();
                                try {
                                    AbstractC2454w.O(h1G, this.f22078u);
                                    Td.L l10 = Td.L.f17438a;
                                    h1G.J(true);
                                    this.f22059b.clear();
                                    this.f22059b.f();
                                    qVar.m();
                                } catch (Throwable th2) {
                                    h1G.J(false);
                                    throw th2;
                                }
                            }
                            qVar.j();
                            qVar.i();
                        } catch (Throwable th3) {
                            qVar.i();
                            throw th3;
                        }
                    }
                    this.f22079v.r0();
                }
                Td.L l11 = Td.L.f17438a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f22058a.v(this);
    }

    @Override // Y.InterfaceC2457x
    public boolean e() {
        return this.f22082y == 3;
    }

    @Override // Y.Q
    public void f(InterfaceC5082a interfaceC5082a) {
        this.f22079v.b1(interfaceC5082a);
    }

    @Override // Y.InterfaceC2412h1
    public void g(C2406f1 c2406f1) {
        this.f22072o = true;
        S();
    }

    @Override // Y.InterfaceC2457x
    public void h(Function2 function2) {
        boolean zE = E();
        L();
        if (zE) {
            H(function2);
        } else {
            F(function2);
        }
    }

    @Override // Y.Q
    public C1 i(C1 c12) {
        C1 c13 = this.f22073p;
        this.f22073p = c12;
        return c13;
    }

    @Override // Y.Q
    public void j(List list) {
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!AbstractC5504s.c(((C2461y0) ((Pair) list.get(i10)).c()).b(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (!z10) {
            AbstractC2454w.t("Check failed");
        }
        try {
            this.f22079v.R0(list);
            Td.L l10 = Td.L.f17438a;
        } catch (Throwable th2) {
            try {
                if (!this.f22062e.isEmpty()) {
                    g0.q qVar = this.f22078u;
                    try {
                        qVar.r(this.f22062e, this.f22079v.K0());
                        qVar.j();
                        qVar.i();
                    } catch (Throwable th3) {
                        qVar.i();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                v();
                throw th4;
            }
        }
    }

    @Override // Y.Q
    public boolean k() {
        synchronized (this.f22061d) {
            R0 r02 = this.f22074q;
            if (r02 != null && !r02.e()) {
                r02.g();
                return false;
            }
            I();
            try {
                C6550P c6550pW = W();
                try {
                    boolean zD1 = this.f22079v.d1(c6550pW, this.f22073p);
                    if (!zD1) {
                        J();
                    }
                    return zD1;
                } catch (Throwable th2) {
                    this.f22071n = c6550pW;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f22062e.isEmpty()) {
                        g0.q qVar = this.f22078u;
                        try {
                            qVar.r(this.f22062e, this.f22079v.K0());
                            qVar.j();
                            qVar.i();
                        } catch (Throwable th4) {
                            qVar.i();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    v();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0057  */
    @Override // Y.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l(java.util.Set r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof a0.e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            a0.e r15 = (a0.e) r15
            t.e0 r15 = r15.b()
            java.lang.Object[] r0 = r15.f60055b
            long[] r15 = r15.f60054a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7d
            r4 = r1
        L16:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L30:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            t.P r11 = r14.f22064g
            boolean r11 = a0.g.e(r11, r10)
            if (r11 != 0) goto L50
            t.P r11 = r14.f22067j
            boolean r10 = a0.g.e(r11, r10)
            if (r10 == 0) goto L51
        L50:
            return r2
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L55:
            if (r7 != r8) goto L7d
        L57:
            if (r4 == r3) goto L7d
            int r4 = r4 + 1
            goto L16
        L5c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r15.next()
            t.P r3 = r14.f22064g
            boolean r3 = a0.g.e(r3, r0)
            if (r3 != 0) goto L7c
            t.P r3 = r14.f22067j
            boolean r0 = a0.g.e(r3, r0)
            if (r0 == 0) goto L62
        L7c:
            return r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.B.l(java.util.Set):boolean");
    }

    @Override // Y.Q
    public Object m(Q q10, int i10, InterfaceC5082a interfaceC5082a) {
        if (q10 == null || AbstractC5504s.c(q10, this) || i10 < 0) {
            return interfaceC5082a.invoke();
        }
        this.f22075r = (B) q10;
        this.f22076s = i10;
        try {
            return interfaceC5082a.invoke();
        } finally {
            this.f22075r = null;
            this.f22076s = 0;
        }
    }

    @Override // Y.Q
    public void n(AbstractC2458x0 abstractC2458x0) {
        g0.q qVar = this.f22078u;
        try {
            qVar.r(this.f22062e, this.f22079v.K0());
            H1 h1G = abstractC2458x0.a().G();
            try {
                AbstractC2454w.O(h1G, this.f22078u);
                Td.L l10 = Td.L.f17438a;
                h1G.J(true);
                qVar.m();
            } catch (Throwable th2) {
                h1G.J(false);
                throw th2;
            }
        } finally {
            qVar.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y.Q
    public void o(Set set) {
        Object obj;
        Object objD;
        do {
            obj = this.f22060c.get();
            if (obj == null || AbstractC5504s.c(obj, C.f22084a)) {
                objD = set;
            } else if (obj instanceof Set) {
                objD = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f22060c).toString());
                }
                AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objD = AbstractC2273n.D((Set[]) obj, set);
            }
        } while (!w.Y.a(this.f22060c, obj, objD));
        if (obj == null) {
            synchronized (this.f22061d) {
                J();
                Td.L l10 = Td.L.f17438a;
            }
        }
    }

    @Override // Y.Q
    public void p() {
        synchronized (this.f22061d) {
            try {
                C(this.f22068k);
                J();
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                try {
                    if (!this.f22062e.isEmpty()) {
                        g0.q qVar = this.f22078u;
                        try {
                            qVar.r(this.f22062e, this.f22079v.K0());
                            qVar.j();
                            qVar.i();
                        } catch (Throwable th3) {
                            qVar.i();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    v();
                    throw th4;
                }
            }
        }
    }

    @Override // Y.Q
    public boolean q() {
        return this.f22079v.V0();
    }

    @Override // Y.InterfaceC2462y1
    public void r(Function2 function2) {
        E();
        L();
        H(function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0057  */
    @Override // Y.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f22061d
            monitor-enter(r0)
            r14.R(r15)     // Catch: java.lang.Throwable -> L4f
            t.P r1 = r14.f22067j     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.e(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof t.Q     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            t.Q r15 = (t.Q) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f60055b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f60054a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            Y.U r10 = (Y.U) r10     // Catch: java.lang.Throwable -> L4f
            r14.R(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L65
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            Y.U r15 = (Y.U) r15     // Catch: java.lang.Throwable -> L4f
            r14.R(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            Td.L r15 = Td.L.f17438a     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L65:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.B.s(java.lang.Object):void");
    }

    @Override // Y.InterfaceC2457x
    public boolean t() {
        boolean z10;
        synchronized (this.f22061d) {
            z10 = a0.g.f(this.f22071n) > 0;
        }
        return z10;
    }

    @Override // Y.N0
    public Q0 u(Function2 function2) {
        E();
        L();
        return G(true, function2);
    }

    @Override // Y.Q
    public void v() {
        this.f22060c.set(null);
        this.f22068k.a();
        this.f22069l.a();
        if (this.f22062e.isEmpty()) {
            return;
        }
        g0.q qVar = this.f22078u;
        try {
            qVar.r(this.f22062e, this.f22079v.K0());
            qVar.j();
        } finally {
            qVar.i();
        }
    }

    @Override // Y.InterfaceC2412h1
    public EnumC2423l0 w(C2406f1 c2406f1, Object obj) {
        B b10;
        if (c2406f1.j()) {
            c2406f1.F(true);
        }
        C2392b c2392bH = c2406f1.h();
        if (c2392bH == null || !c2392bH.b()) {
            return EnumC2423l0.f22361a;
        }
        if (!this.f22063f.I(c2392bH)) {
            synchronized (this.f22061d) {
                b10 = this.f22075r;
            }
            return (b10 == null || !b10.X(c2406f1, obj)) ? EnumC2423l0.f22361a : EnumC2423l0.f22364d;
        }
        if (!c2406f1.i()) {
            return EnumC2423l0.f22361a;
        }
        EnumC2423l0 enumC2423l0Q = Q(c2406f1, c2392bH, obj);
        if (enumC2423l0Q != EnumC2423l0.f22361a) {
            S();
        }
        return enumC2423l0Q;
    }

    @Override // Y.Q
    public void x() {
        g0.q qVar;
        synchronized (this.f22061d) {
            try {
                this.f22079v.h0();
                if (!this.f22062e.isEmpty()) {
                    qVar = this.f22078u;
                    try {
                        qVar.r(this.f22062e, this.f22079v.K0());
                        qVar.j();
                        qVar.i();
                    } finally {
                    }
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                try {
                    if (!this.f22062e.isEmpty()) {
                        qVar = this.f22078u;
                        try {
                            qVar.r(this.f22062e, this.f22079v.K0());
                            qVar.j();
                            qVar.i();
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    v();
                    throw th3;
                }
            }
        }
    }

    @Override // Y.Q
    public void y() {
        synchronized (this.f22061d) {
            try {
                for (Object obj : this.f22063f.v()) {
                    C2406f1 c2406f1 = obj instanceof C2406f1 ? (C2406f1) obj : null;
                    if (c2406f1 != null) {
                        c2406f1.invalidate();
                    }
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ B(AbstractC2460y abstractC2460y, InterfaceC2398d interfaceC2398d, Zd.i iVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC2460y, interfaceC2398d, (i10 & 4) != 0 ? null : iVar);
    }
}
