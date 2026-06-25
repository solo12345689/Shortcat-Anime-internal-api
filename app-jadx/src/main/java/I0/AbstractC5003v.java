package i0;

import Td.C2160k;
import Ud.AbstractC2279u;
import g0.C4819a;
import i0.AbstractC4993l;
import i0.C4997p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: i0.v */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5003v {

    /* JADX INFO: renamed from: b */
    private static final long f48527b = 0;

    /* JADX INFO: renamed from: e */
    private static C4997p f48530e;

    /* JADX INFO: renamed from: f */
    private static long f48531f;

    /* JADX INFO: renamed from: g */
    private static final C4995n f48532g;

    /* JADX INFO: renamed from: h */
    private static final C4969M f48533h;

    /* JADX INFO: renamed from: i */
    private static List f48534i;

    /* JADX INFO: renamed from: j */
    private static List f48535j;

    /* JADX INFO: renamed from: k */
    private static final C4983b f48536k;

    /* JADX INFO: renamed from: l */
    private static final AbstractC4993l f48537l;

    /* JADX INFO: renamed from: m */
    private static C4819a f48538m;

    /* JADX INFO: renamed from: a */
    private static final Function1 f48526a = new Function1() { // from class: i0.s
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AbstractC5003v.N((C4997p) obj);
        }
    };

    /* JADX INFO: renamed from: c */
    private static final g0.r f48528c = new g0.r();

    /* JADX INFO: renamed from: d */
    private static final Object f48529d = new Object();

    static {
        C4997p.a aVar = C4997p.f48509e;
        f48530e = aVar.a();
        long j10 = 1;
        f48531f = AbstractC4998q.c(1) + j10;
        f48532g = new C4995n();
        f48533h = new C4969M();
        f48534i = AbstractC2279u.m();
        f48535j = AbstractC2279u.m();
        long j11 = f48531f;
        f48531f = j10 + j11;
        C4983b c4983b = new C4983b(j11, aVar.a());
        f48530e = f48530e.u(c4983b.i());
        f48536k = c4983b;
        f48537l = c4983b;
        f48538m = new C4819a(0);
    }

    public static final C4997p E(C4997p c4997p, long j10, long j11) {
        while (AbstractC5504s.j(j10, j11) < 0) {
            c4997p = c4997p.u(j10);
            j10 += (long) 1;
        }
        return c4997p;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F(kotlin.jvm.functions.Function1 r15) {
        /*
            i0.b r0 = i0.AbstractC5003v.f48536k
            java.lang.Object r1 = O()
            monitor-enter(r1)
            t.Q r2 = r0.E()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L17
            g0.a r3 = i0.AbstractC5003v.f48538m     // Catch: java.lang.Throwable -> L14
            r4 = 1
            r3.a(r4)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r15 = move-exception
            goto L9e
        L17:
            java.lang.Object r15 = h0(r0, r15)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L47
            r3 = -1
            java.util.List r4 = i0.AbstractC5003v.f48534i     // Catch: java.lang.Throwable -> L39
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L39
            r6 = r1
        L27:
            if (r6 >= r5) goto L3b
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L39
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch: java.lang.Throwable -> L39
            java.util.Set r8 = a0.f.a(r2)     // Catch: java.lang.Throwable -> L39
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L39
            int r6 = r6 + 1
            goto L27
        L39:
            r15 = move-exception
            goto L41
        L3b:
            g0.a r0 = i0.AbstractC5003v.f48538m
            r0.a(r3)
            goto L47
        L41:
            g0.a r0 = i0.AbstractC5003v.f48538m
            r0.a(r3)
            throw r15
        L47:
            java.lang.Object r0 = O()
            monitor-enter(r0)
            H()     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L9a
            java.lang.Object[] r3 = r2.f60055b     // Catch: java.lang.Throwable -> L8b
            long[] r2 = r2.f60054a     // Catch: java.lang.Throwable -> L8b
            int r4 = r2.length     // Catch: java.lang.Throwable -> L8b
            int r4 = r4 + (-2)
            if (r4 < 0) goto L98
            r5 = r1
        L5b:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L8b
            long r8 = ~r6     // Catch: java.lang.Throwable -> L8b
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L93
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L8b
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L75:
            if (r10 >= r8) goto L91
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L8d
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L8b
            i0.U r11 = (i0.InterfaceC4976U) r11     // Catch: java.lang.Throwable -> L8b
            b0(r11)     // Catch: java.lang.Throwable -> L8b
            goto L8d
        L8b:
            r15 = move-exception
            goto L9c
        L8d:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L75
        L91:
            if (r8 != r9) goto L98
        L93:
            if (r5 == r4) goto L98
            int r5 = r5 + 1
            goto L5b
        L98:
            Td.L r1 = Td.L.f17438a     // Catch: java.lang.Throwable -> L8b
        L9a:
            monitor-exit(r0)
            return r15
        L9c:
            monitor-exit(r0)
            throw r15
        L9e:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.AbstractC5003v.F(kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final void G() {
        F(f48526a);
    }

    public static final void H() {
        C4969M c4969m = f48533h;
        int iE = c4969m.e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iE) {
                break;
            }
            g0.z zVar = c4969m.f()[i10];
            Object obj = zVar != null ? zVar.get() : null;
            if (obj != null && a0((InterfaceC4976U) obj)) {
                if (i11 != i10) {
                    c4969m.f()[i11] = zVar;
                    c4969m.d()[i11] = c4969m.d()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < iE; i12++) {
            c4969m.f()[i12] = null;
            c4969m.d()[i12] = 0;
        }
        if (i11 != iE) {
            c4969m.g(i11);
        }
    }

    public static final AbstractC4993l I(AbstractC4993l abstractC4993l, Function1 function1, boolean z10) {
        boolean z11 = abstractC4993l instanceof C4985d;
        if (z11 || abstractC4993l == null) {
            return new C4980Y(z11 ? (C4985d) abstractC4993l : null, function1, null, false, z10);
        }
        return new C4981Z(abstractC4993l, function1, false, z10);
    }

    static /* synthetic */ AbstractC4993l J(AbstractC4993l abstractC4993l, Function1 function1, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return I(abstractC4993l, function1, z10);
    }

    public static final AbstractC4978W K(AbstractC4978W abstractC4978W) {
        AbstractC4978W abstractC4978WD0;
        AbstractC4993l.a aVar = AbstractC4993l.f48495e;
        AbstractC4993l abstractC4993lC = aVar.c();
        AbstractC4978W abstractC4978WD02 = d0(abstractC4978W, abstractC4993lC.i(), abstractC4993lC.f());
        if (abstractC4978WD02 != null) {
            return abstractC4978WD02;
        }
        synchronized (O()) {
            AbstractC4993l abstractC4993lC2 = aVar.c();
            abstractC4978WD0 = d0(abstractC4978W, abstractC4993lC2.i(), abstractC4993lC2.f());
        }
        if (abstractC4978WD0 != null) {
            return abstractC4978WD0;
        }
        c0();
        throw new C2160k();
    }

    public static final AbstractC4978W L(AbstractC4978W abstractC4978W, AbstractC4993l abstractC4993l) {
        AbstractC4978W abstractC4978WD0;
        AbstractC4978W abstractC4978WD02 = d0(abstractC4978W, abstractC4993l.i(), abstractC4993l.f());
        if (abstractC4978WD02 != null) {
            return abstractC4978WD02;
        }
        synchronized (O()) {
            abstractC4978WD0 = d0(abstractC4978W, abstractC4993l.i(), abstractC4993l.f());
        }
        if (abstractC4978WD0 != null) {
            return abstractC4978WD0;
        }
        c0();
        throw new C2160k();
    }

    public static final AbstractC4993l M() {
        AbstractC4993l abstractC4993l = (AbstractC4993l) f48528c.a();
        return abstractC4993l == null ? f48536k : abstractC4993l;
    }

    public static final Td.L N(C4997p c4997p) {
        return Td.L.f17438a;
    }

    public static final Object O() {
        return f48529d;
    }

    public static final Function1 P(final Function1 function1, final Function1 function12, boolean z10) {
        if (!z10) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new Function1() { // from class: i0.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC5003v.R(function1, function12, obj);
            }
        };
    }

    static /* synthetic */ Function1 Q(Function1 function1, Function1 function12, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return P(function1, function12, z10);
    }

    public static final Td.L R(Function1 function1, Function1 function12, Object obj) {
        function1.invoke(obj);
        function12.invoke(obj);
        return Td.L.f17438a;
    }

    public static final Function1 S(final Function1 function1, final Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new Function1() { // from class: i0.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC5003v.T(function1, function12, obj);
            }
        };
    }

    public static final Td.L T(Function1 function1, Function1 function12, Object obj) {
        function1.invoke(obj);
        function12.invoke(obj);
        return Td.L.f17438a;
    }

    public static final AbstractC4978W U(AbstractC4978W abstractC4978W, InterfaceC4976U interfaceC4976U) {
        AbstractC4978W abstractC4978WL0 = l0(interfaceC4976U);
        if (abstractC4978WL0 != null) {
            abstractC4978WL0.h(Long.MAX_VALUE);
            return abstractC4978WL0;
        }
        AbstractC4978W abstractC4978WD = abstractC4978W.d(Long.MAX_VALUE);
        abstractC4978WD.g(interfaceC4976U.l());
        AbstractC5504s.f(abstractC4978WD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        interfaceC4976U.r(abstractC4978WD);
        AbstractC5504s.f(abstractC4978WD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return abstractC4978WD;
    }

    public static final AbstractC4978W V(AbstractC4978W abstractC4978W, InterfaceC4976U interfaceC4976U, AbstractC4993l abstractC4993l) {
        AbstractC4978W abstractC4978WW;
        synchronized (O()) {
            abstractC4978WW = W(abstractC4978W, interfaceC4976U, abstractC4993l);
        }
        return abstractC4978WW;
    }

    private static final AbstractC4978W W(AbstractC4978W abstractC4978W, InterfaceC4976U interfaceC4976U, AbstractC4993l abstractC4993l) {
        AbstractC4978W abstractC4978WU = U(abstractC4978W, interfaceC4976U);
        abstractC4978WU.c(abstractC4978W);
        abstractC4978WU.h(abstractC4993l.i());
        return abstractC4978WU;
    }

    public static final void X(AbstractC4993l abstractC4993l, InterfaceC4976U interfaceC4976U) {
        abstractC4993l.w(abstractC4993l.j() + 1);
        Function1 function1K = abstractC4993l.k();
        if (function1K != null) {
            function1K.invoke(interfaceC4976U);
        }
    }

    public static final Map Y(long j10, C4985d c4985d, C4997p c4997p) {
        long[] jArr;
        Map map;
        C4997p c4997p2;
        long[] jArr2;
        Map map2;
        C4997p c4997p3;
        int i10;
        long j11 = j10;
        t.Q qE = c4985d.E();
        Map map3 = null;
        if (qE == null) {
            return null;
        }
        C4997p c4997pT = c4985d.f().u(c4985d.i()).t(c4985d.F());
        Object[] objArr = qE.f60055b;
        long[] jArr3 = qE.f60054a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i11 = 0;
        while (true) {
            long j12 = jArr3[i11];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j12) < 128) {
                        InterfaceC4976U interfaceC4976U = (InterfaceC4976U) objArr[(i11 << 3) + i14];
                        map2 = map3;
                        AbstractC4978W abstractC4978WL = interfaceC4976U.l();
                        i10 = i12;
                        AbstractC4978W abstractC4978WD0 = d0(abstractC4978WL, j11, c4997p);
                        if (abstractC4978WD0 == null) {
                            jArr2 = jArr3;
                        } else {
                            jArr2 = jArr3;
                            AbstractC4978W abstractC4978WD02 = d0(abstractC4978WL, j11, c4997pT);
                            if (abstractC4978WD02 != null && !AbstractC5504s.c(abstractC4978WD0, abstractC4978WD02)) {
                                c4997p3 = c4997pT;
                                AbstractC4978W abstractC4978WD03 = d0(abstractC4978WL, c4985d.i(), c4985d.f());
                                if (abstractC4978WD03 == null) {
                                    c0();
                                    throw new C2160k();
                                }
                                AbstractC4978W abstractC4978WI = interfaceC4976U.i(abstractC4978WD02, abstractC4978WD0, abstractC4978WD03);
                                if (abstractC4978WI == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(abstractC4978WD0, abstractC4978WI);
                                map4 = map4;
                            }
                        }
                        c4997p3 = c4997pT;
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        c4997p3 = c4997pT;
                        i10 = i12;
                    }
                    j12 >>= i10;
                    i14++;
                    j11 = j10;
                    map3 = map2;
                    i12 = i10;
                    jArr3 = jArr2;
                    c4997pT = c4997p3;
                }
                jArr = jArr3;
                map = map3;
                c4997p2 = c4997pT;
                if (i13 != i12) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                c4997p2 = c4997pT;
            }
            if (i11 == length) {
                return map4;
            }
            i11++;
            j11 = j10;
            map3 = map;
            jArr3 = jArr;
            c4997pT = c4997p2;
        }
    }

    public static final AbstractC4978W Z(AbstractC4978W abstractC4978W, InterfaceC4976U interfaceC4976U, AbstractC4993l abstractC4993l, AbstractC4978W abstractC4978W2) {
        AbstractC4978W abstractC4978WU;
        if (abstractC4993l.h()) {
            abstractC4993l.p(interfaceC4976U);
        }
        long jI = abstractC4993l.i();
        if (abstractC4978W2.f() == jI) {
            return abstractC4978W2;
        }
        synchronized (O()) {
            abstractC4978WU = U(abstractC4978W, interfaceC4976U);
        }
        abstractC4978WU.h(jI);
        if (abstractC4978W2.f() != AbstractC4998q.c(1)) {
            abstractC4993l.p(interfaceC4976U);
        }
        return abstractC4978WU;
    }

    private static final boolean a0(InterfaceC4976U interfaceC4976U) {
        AbstractC4978W abstractC4978W;
        long jE = f48532g.e(f48531f);
        AbstractC4978W abstractC4978W2 = null;
        AbstractC4978W abstractC4978WL = null;
        int i10 = 0;
        for (AbstractC4978W abstractC4978WL2 = interfaceC4976U.l(); abstractC4978WL2 != null; abstractC4978WL2 = abstractC4978WL2.e()) {
            long jF = abstractC4978WL2.f();
            if (jF != f48527b) {
                if (AbstractC5504s.j(jF, jE) >= 0) {
                    i10++;
                } else if (abstractC4978W2 == null) {
                    i10++;
                    abstractC4978W2 = abstractC4978WL2;
                } else {
                    if (AbstractC5504s.j(abstractC4978WL2.f(), abstractC4978W2.f()) < 0) {
                        abstractC4978W = abstractC4978W2;
                        abstractC4978W2 = abstractC4978WL2;
                    } else {
                        abstractC4978W = abstractC4978WL2;
                    }
                    if (abstractC4978WL == null) {
                        abstractC4978WL = interfaceC4976U.l();
                        AbstractC4978W abstractC4978W3 = abstractC4978WL;
                        while (true) {
                            if (abstractC4978WL == null) {
                                abstractC4978WL = abstractC4978W3;
                                break;
                            }
                            if (AbstractC5504s.j(abstractC4978WL.f(), jE) >= 0) {
                                break;
                            }
                            if (AbstractC5504s.j(abstractC4978W3.f(), abstractC4978WL.f()) < 0) {
                                abstractC4978W3 = abstractC4978WL;
                            }
                            abstractC4978WL = abstractC4978WL.e();
                        }
                    }
                    abstractC4978W2.h(f48527b);
                    abstractC4978W2.c(abstractC4978WL);
                    abstractC4978W2 = abstractC4978W;
                }
            }
        }
        return i10 > 1;
    }

    public static final void b0(InterfaceC4976U interfaceC4976U) {
        if (a0(interfaceC4976U)) {
            f48533h.a(interfaceC4976U);
        }
    }

    public static final Void c0() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final AbstractC4978W d0(AbstractC4978W abstractC4978W, long j10, C4997p c4997p) {
        AbstractC4978W abstractC4978W2 = null;
        while (abstractC4978W != null) {
            if (n0(abstractC4978W, j10, c4997p) && (abstractC4978W2 == null || AbstractC5504s.j(abstractC4978W2.f(), abstractC4978W.f()) < 0)) {
                abstractC4978W2 = abstractC4978W;
            }
            abstractC4978W = abstractC4978W.e();
        }
        if (abstractC4978W2 != null) {
            return abstractC4978W2;
        }
        return null;
    }

    public static final AbstractC4978W e0(AbstractC4978W abstractC4978W, InterfaceC4976U interfaceC4976U) {
        AbstractC4978W abstractC4978WD0;
        AbstractC4993l.a aVar = AbstractC4993l.f48495e;
        AbstractC4993l abstractC4993lC = aVar.c();
        Function1 function1G = abstractC4993lC.g();
        if (function1G != null) {
            function1G.invoke(interfaceC4976U);
        }
        AbstractC4978W abstractC4978WD02 = d0(abstractC4978W, abstractC4993lC.i(), abstractC4993lC.f());
        if (abstractC4978WD02 != null) {
            return abstractC4978WD02;
        }
        synchronized (O()) {
            AbstractC4993l abstractC4993lC2 = aVar.c();
            AbstractC4978W abstractC4978WL = interfaceC4976U.l();
            AbstractC5504s.f(abstractC4978WL, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            abstractC4978WD0 = d0(abstractC4978WL, abstractC4993lC2.i(), abstractC4993lC2.f());
            if (abstractC4978WD0 == null) {
                c0();
                throw new C2160k();
            }
        }
        return abstractC4978WD0;
    }

    public static final void f0(int i10) {
        f48532g.f(i10);
    }

    public static final Void g0() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public static final Object h0(C4983b c4983b, Function1 function1) {
        long jI = c4983b.i();
        Object objInvoke = function1.invoke(f48530e.n(jI));
        long j10 = f48531f;
        f48531f = ((long) 1) + j10;
        f48530e = f48530e.n(jI);
        c4983b.v(j10);
        c4983b.u(f48530e);
        c4983b.w(0);
        c4983b.Q(null);
        c4983b.q();
        f48530e = f48530e.u(j10);
        return objInvoke;
    }

    public static final AbstractC4993l i0(final Function1 function1) {
        return (AbstractC4993l) F(new Function1() { // from class: i0.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC5003v.j0(function1, (C4997p) obj);
            }
        });
    }

    public static final AbstractC4993l j0(Function1 function1, C4997p c4997p) {
        AbstractC4993l abstractC4993l = (AbstractC4993l) function1.invoke(c4997p);
        synchronized (O()) {
            f48530e = f48530e.u(abstractC4993l.i());
            Td.L l10 = Td.L.f17438a;
        }
        return abstractC4993l;
    }

    public static final int k0(long j10, C4997p c4997p) {
        int iA;
        long jR = c4997p.r(j10);
        synchronized (O()) {
            iA = f48532g.a(jR);
        }
        return iA;
    }

    private static final AbstractC4978W l0(InterfaceC4976U interfaceC4976U) {
        long jE = f48532g.e(f48531f) - ((long) 1);
        C4997p c4997pA = C4997p.f48509e.a();
        AbstractC4978W abstractC4978W = null;
        for (AbstractC4978W abstractC4978WL = interfaceC4976U.l(); abstractC4978WL != null; abstractC4978WL = abstractC4978WL.e()) {
            if (abstractC4978WL.f() != f48527b) {
                if (n0(abstractC4978WL, jE, c4997pA)) {
                    if (abstractC4978W == null) {
                        abstractC4978W = abstractC4978WL;
                    } else if (AbstractC5504s.j(abstractC4978WL.f(), abstractC4978W.f()) >= 0) {
                        return abstractC4978W;
                    }
                }
            }
            return abstractC4978WL;
        }
        return null;
    }

    private static final boolean m0(long j10, long j11, C4997p c4997p) {
        return (j11 == f48527b || AbstractC5504s.j(j11, j10) > 0 || c4997p.p(j11)) ? false : true;
    }

    private static final boolean n0(AbstractC4978W abstractC4978W, long j10, C4997p c4997p) {
        return m0(j10, abstractC4978W.f(), c4997p);
    }

    public static final void o0(AbstractC4993l abstractC4993l) {
        long jE;
        if (f48530e.p(abstractC4993l.i())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot is not open: snapshotId=");
        sb2.append(abstractC4993l.i());
        sb2.append(", disposed=");
        sb2.append(abstractC4993l.e());
        sb2.append(", applied=");
        C4985d c4985d = abstractC4993l instanceof C4985d ? (C4985d) abstractC4993l : null;
        sb2.append(c4985d != null ? Boolean.valueOf(c4985d.D()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (O()) {
            jE = f48532g.e(-1L);
        }
        sb2.append(jE);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final AbstractC4978W p0(AbstractC4978W abstractC4978W, InterfaceC4976U interfaceC4976U, AbstractC4993l abstractC4993l) {
        AbstractC4978W abstractC4978WD0;
        if (abstractC4993l.h()) {
            abstractC4993l.p(interfaceC4976U);
        }
        long jI = abstractC4993l.i();
        AbstractC4978W abstractC4978WD02 = d0(abstractC4978W, jI, abstractC4993l.f());
        if (abstractC4978WD02 == null) {
            c0();
            throw new C2160k();
        }
        if (abstractC4978WD02.f() == abstractC4993l.i()) {
            return abstractC4978WD02;
        }
        synchronized (O()) {
            abstractC4978WD0 = d0(interfaceC4976U.l(), jI, abstractC4993l.f());
            if (abstractC4978WD0 == null) {
                c0();
                throw new C2160k();
            }
            if (abstractC4978WD0.f() != jI) {
                abstractC4978WD0 = W(abstractC4978WD0, interfaceC4976U, abstractC4993l);
            }
        }
        AbstractC5504s.f(abstractC4978WD0, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (abstractC4978WD02.f() != AbstractC4998q.c(1)) {
            abstractC4993l.p(interfaceC4976U);
        }
        return abstractC4978WD0;
    }
}
