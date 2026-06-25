package i0;

import Td.C2160k;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Y.AbstractC2454w;
import Y.U;
import Y.U1;
import Y.V0;
import a0.C2507c;
import ie.InterfaceC5082a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6545K;
import t.C6550P;

/* JADX INFO: renamed from: i0.L */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4968L {

    /* JADX INFO: renamed from: l */
    public static final int f48406l = 8;

    /* JADX INFO: renamed from: a */
    private final Function1 f48407a;

    /* JADX INFO: renamed from: c */
    private boolean f48409c;

    /* JADX INFO: renamed from: h */
    private InterfaceC4988g f48414h;

    /* JADX INFO: renamed from: i */
    private boolean f48415i;

    /* JADX INFO: renamed from: j */
    private a f48416j;

    /* JADX INFO: renamed from: b */
    private final AtomicReference f48408b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    private final Function2 f48410d = new Function2() { // from class: i0.I
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C4968L.e(this.f48403a, (Set) obj, (AbstractC4993l) obj2);
        }
    };

    /* JADX INFO: renamed from: e */
    private final Function1 f48411e = new Function1() { // from class: i0.J
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return C4968L.l(this.f48404a, obj);
        }
    };

    /* JADX INFO: renamed from: f */
    private final C2507c f48412f = new C2507c(new a[16], 0);

    /* JADX INFO: renamed from: g */
    private final Object f48413g = new Object();

    /* JADX INFO: renamed from: k */
    private long f48417k = -1;

    /* JADX INFO: renamed from: i0.L$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final Function1 f48418a;

        /* JADX INFO: renamed from: b */
        private Object f48419b;

        /* JADX INFO: renamed from: c */
        private C6545K f48420c;

        /* JADX INFO: renamed from: j */
        private int f48427j;

        /* JADX INFO: renamed from: d */
        private int f48421d = -1;

        /* JADX INFO: renamed from: e */
        private final C6550P f48422e = a0.g.d(null, 1, null);

        /* JADX INFO: renamed from: f */
        private final C6550P f48423f = new C6550P(0, 1, null);

        /* JADX INFO: renamed from: g */
        private final t.Q f48424g = new t.Q(0, 1, null);

        /* JADX INFO: renamed from: h */
        private final C2507c f48425h = new C2507c(new Y.U[16], 0);

        /* JADX INFO: renamed from: i */
        private final Y.V f48426i = new C0770a();

        /* JADX INFO: renamed from: k */
        private final C6550P f48428k = a0.g.d(null, 1, null);

        /* JADX INFO: renamed from: l */
        private final HashMap f48429l = new HashMap();

        /* JADX INFO: renamed from: i0.L$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0770a implements Y.V {
            C0770a() {
            }

            @Override // Y.V
            public void a(Y.U u10) {
                a.this.f48427j++;
            }

            @Override // Y.V
            public void b(Y.U u10) {
                a.this.f48427j--;
            }
        }

        public a(Function1 function1) {
            this.f48418a = function1;
        }

        private final void d(Object obj) {
            int i10 = this.f48421d;
            C6545K c6545k = this.f48420c;
            if (c6545k == null) {
                return;
            }
            long[] jArr = c6545k.f60000a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj2 = c6545k.f60001b[i14];
                            boolean z10 = c6545k.f60002c[i14] != i10;
                            if (z10) {
                                m(obj, obj2);
                            }
                            if (z10) {
                                c6545k.s(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        private final void l(Object obj, int i10, Object obj2, C6545K c6545k) {
            int i11;
            int i12;
            int i13;
            if (this.f48427j > 0) {
                return;
            }
            int iQ = c6545k.q(obj, i10, -1);
            int i14 = 2;
            if (!(obj instanceof Y.U) || iQ == i10) {
                i11 = 2;
                i12 = -1;
            } else {
                U.a aVarO = ((Y.U) obj).o();
                this.f48429l.put(obj, aVarO.a());
                t.T tB = aVarO.b();
                C6550P c6550p = this.f48428k;
                a0.g.h(c6550p, obj);
                Object[] objArr = tB.f60001b;
                long[] jArr = tB.f60000a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j10 & 255) < 128) {
                                    i13 = i14;
                                    InterfaceC4976U interfaceC4976U = (InterfaceC4976U) objArr[(i15 << 3) + i17];
                                    if (interfaceC4976U instanceof AbstractC4977V) {
                                        ((AbstractC4977V) interfaceC4976U).s(AbstractC4989h.a(i13));
                                    }
                                    a0.g.a(c6550p, interfaceC4976U, obj);
                                } else {
                                    i13 = i14;
                                }
                                j10 >>= 8;
                                i17++;
                                i14 = i13;
                            }
                            i11 = i14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            i11 = i14;
                        }
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                        i14 = i11;
                    }
                } else {
                    i11 = 2;
                }
                i12 = -1;
            }
            if (iQ == i12) {
                if (obj instanceof AbstractC4977V) {
                    ((AbstractC4977V) obj).s(AbstractC4989h.a(i11));
                }
                a0.g.a(this.f48422e, obj, obj2);
            }
        }

        private final void m(Object obj, Object obj2) {
            a0.g.g(this.f48422e, obj2, obj);
            if (!(obj2 instanceof Y.U) || a0.g.e(this.f48422e, obj2)) {
                return;
            }
            a0.g.h(this.f48428k, obj2);
            this.f48429l.remove(obj2);
        }

        public final void c() {
            a0.g.b(this.f48422e);
            this.f48423f.k();
            a0.g.b(this.f48428k);
            this.f48429l.clear();
        }

        public final void e(Object obj) {
            C6545K c6545k = (C6545K) this.f48423f.u(obj);
            if (c6545k == null) {
                return;
            }
            Object[] objArr = c6545k.f60001b;
            int[] iArr = c6545k.f60002c;
            long[] jArr = c6545k.f60000a;
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
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            m(obj, obj2);
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

        public final Function1 f() {
            return this.f48418a;
        }

        public final boolean g() {
            return this.f48423f.i();
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h() {
            /*
                r17 = this;
                r0 = r17
                t.Q r1 = r0.f48424g
                kotlin.jvm.functions.Function1 r2 = r0.f48418a
                java.lang.Object[] r3 = r1.f60055b
                long[] r4 = r1.f60054a
                int r5 = r4.length
                int r5 = r5 + (-2)
                if (r5 < 0) goto L49
                r6 = 0
                r7 = r6
            L11:
                r8 = r4[r7]
                long r10 = ~r8
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L44
                int r10 = r7 - r5
                int r10 = ~r10
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L2b:
                if (r12 >= r10) goto L42
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.32E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L3e
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]
                r2.invoke(r13)
            L3e:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L2b
            L42:
                if (r10 != r11) goto L49
            L44:
                if (r7 == r5) goto L49
                int r7 = r7 + 1
                goto L11
            L49:
                r1.m()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.C4968L.a.h():void");
        }

        public final void i(Object obj, Function1 function1, InterfaceC5082a interfaceC5082a) {
            Object obj2 = this.f48419b;
            C6545K c6545k = this.f48420c;
            int i10 = this.f48421d;
            this.f48419b = obj;
            this.f48420c = (C6545K) this.f48423f.e(obj);
            if (this.f48421d == -1) {
                this.f48421d = Long.hashCode(AbstractC5003v.M().i());
            }
            Y.V v10 = this.f48426i;
            C2507c c2507cB = U1.b();
            try {
                c2507cB.c(v10);
                AbstractC4993l.f48495e.g(function1, null, interfaceC5082a);
                c2507cB.y(c2507cB.p() - 1);
                Object obj3 = this.f48419b;
                AbstractC5504s.e(obj3);
                d(obj3);
                this.f48419b = obj2;
                this.f48420c = c6545k;
                this.f48421d = i10;
            } catch (Throwable th2) {
                c2507cB.y(c2507cB.p() - 1);
                throw th2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:357:0x0146 A[PHI: r37
  0x0146: PHI (r37v5 boolean) = (r37v4 boolean), (r37v6 boolean) binds: [B:347:0x011a, B:356:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:360:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:397:0x0233 A[PHI: r11
  0x0233: PHI (r11v55 boolean) = (r11v54 boolean), (r11v56 boolean) binds: [B:388:0x020b, B:396:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:402:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:422:0x02a8 A[PHI: r11
  0x02a8: PHI (r11v44 boolean) = (r11v43 boolean), (r11v45 boolean) binds: [B:413:0x0280, B:421:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:481:0x0402 A[PHI: r13
  0x0402: PHI (r13v8 boolean) = (r13v7 boolean), (r13v10 boolean) binds: [B:472:0x03d6, B:480:0x0400] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:485:0x0414  */
        /* JADX WARN: Removed duplicated region for block: B:519:0x04ca A[PHI: r11
  0x04ca: PHI (r11v15 boolean) = (r11v14 boolean), (r11v16 boolean) binds: [B:510:0x04a2, B:518:0x04c8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:524:0x04dc  */
        /* JADX WARN: Removed duplicated region for block: B:527:0x04e6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean j(java.util.Set r44) {
            /*
                Method dump skipped, instruction units count: 1377
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.C4968L.a.j(java.util.Set):boolean");
        }

        public final void k(Object obj) {
            Object obj2 = this.f48419b;
            AbstractC5504s.e(obj2);
            int i10 = this.f48421d;
            C6545K c6545k = this.f48420c;
            if (c6545k == null) {
                c6545k = new C6545K(0, 1, null);
                this.f48420c = c6545k;
                this.f48423f.x(obj2, c6545k);
                Td.L l10 = Td.L.f17438a;
            }
            l(obj, i10, obj2, c6545k);
        }

        /* JADX WARN: Removed duplicated region for block: B:82:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void n(kotlin.jvm.functions.Function1 r34) {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.C4968L.a.n(kotlin.jvm.functions.Function1):void");
        }

        public final void o(Y.U u10) {
            long[] jArr;
            long[] jArr2;
            int i10;
            C6545K c6545k;
            C6550P c6550p = this.f48423f;
            int iHashCode = Long.hashCode(AbstractC5003v.M().i());
            Object objE = this.f48422e.e(u10);
            if (objE == null) {
                return;
            }
            if (!(objE instanceof t.Q)) {
                C6545K c6545k2 = (C6545K) c6550p.e(objE);
                if (c6545k2 == null) {
                    c6545k2 = new C6545K(0, 1, null);
                    c6550p.x(objE, c6545k2);
                    Td.L l10 = Td.L.f17438a;
                }
                l(u10, iHashCode, objE, c6545k2);
                return;
            }
            t.Q q10 = (t.Q) objE;
            Object[] objArr = q10.f60055b;
            long[] jArr3 = q10.f60054a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            i10 = i12;
                            Object obj = objArr[(i11 << 3) + i14];
                            C6545K c6545k3 = (C6545K) c6550p.e(obj);
                            jArr2 = jArr3;
                            if (c6545k3 == null) {
                                c6545k = new C6545K(0, 1, null);
                                c6550p.x(obj, c6545k);
                                Td.L l11 = Td.L.f17438a;
                            } else {
                                c6545k = c6545k3;
                            }
                            l(u10, iHashCode, obj, c6545k);
                        } else {
                            jArr2 = jArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                jArr3 = jArr;
            }
        }
    }

    public C4968L(Function1 function1) {
        this.f48407a = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d(Set set) {
        Object obj;
        Set setI0;
        do {
            obj = this.f48408b.get();
            if (obj == null) {
                setI0 = set;
            } else if (obj instanceof Set) {
                setI0 = AbstractC2279u.p(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    n();
                    throw new C2160k();
                }
                setI0 = AbstractC2279u.I0((Collection) obj, AbstractC2279u.e(set));
            }
        } while (!w.Y.a(this.f48408b, obj, setI0));
    }

    public static final Td.L e(C4968L c4968l, Set set, AbstractC4993l abstractC4993l) {
        c4968l.d(set);
        if (c4968l.i()) {
            c4968l.o();
        }
        return Td.L.f17438a;
    }

    private final boolean i() {
        boolean z10;
        synchronized (this.f48413g) {
            z10 = this.f48409c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set setM = m();
            if (setM == null) {
                return z11;
            }
            synchronized (this.f48413g) {
                try {
                    C2507c c2507c = this.f48412f;
                    Object[] objArr = c2507c.f23496a;
                    int iP = c2507c.p();
                    for (int i10 = 0; i10 < iP; i10++) {
                        z11 = ((a) objArr[i10]).j(setM) || z11;
                    }
                    Td.L l10 = Td.L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final a j(Function1 function1) {
        Object obj;
        C2507c c2507c = this.f48412f;
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        int i10 = 0;
        while (true) {
            if (i10 >= iP) {
                obj = null;
                break;
            }
            obj = objArr[i10];
            if (((a) obj).f() == function1) {
                break;
            }
            i10++;
        }
        a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        AbstractC5504s.f(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar2 = new a((Function1) kotlin.jvm.internal.V.e(function1, 1));
        this.f48412f.c(aVar2);
        return aVar2;
    }

    public static final Td.L l(C4968L c4968l, Object obj) {
        if (!c4968l.f48415i) {
            synchronized (c4968l.f48413g) {
                a aVar = c4968l.f48416j;
                AbstractC5504s.e(aVar);
                aVar.k(obj);
                Td.L l10 = Td.L.f17438a;
            }
        }
        return Td.L.f17438a;
    }

    private final Set m() {
        Object obj;
        Object objSubList;
        Set set;
        do {
            obj = this.f48408b.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    n();
                    throw new C2160k();
                }
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!w.Y.a(this.f48408b, obj, objSubList));
        return set;
    }

    private final Void n() {
        AbstractC2454w.u("Unexpected notification");
        throw new C2160k();
    }

    private final void o() {
        this.f48407a.invoke(new InterfaceC5082a() { // from class: i0.K
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C4968L.p(this.f48405a);
            }
        });
    }

    public static final Td.L p(C4968L c4968l) {
        do {
            synchronized (c4968l.f48413g) {
                try {
                    if (!c4968l.f48409c) {
                        c4968l.f48409c = true;
                        try {
                            C2507c c2507c = c4968l.f48412f;
                            Object[] objArr = c2507c.f23496a;
                            int iP = c2507c.p();
                            for (int i10 = 0; i10 < iP; i10++) {
                                ((a) objArr[i10]).h();
                            }
                            c4968l.f48409c = false;
                        } finally {
                        }
                    }
                    Td.L l10 = Td.L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (c4968l.i());
        return Td.L.f17438a;
    }

    public final void f() {
        synchronized (this.f48413g) {
            try {
                C2507c c2507c = this.f48412f;
                Object[] objArr = c2507c.f23496a;
                int iP = c2507c.p();
                for (int i10 = 0; i10 < iP; i10++) {
                    ((a) objArr[i10]).c();
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f48413g) {
            try {
                C2507c c2507c = this.f48412f;
                int iP = c2507c.p();
                int i10 = 0;
                for (int i11 = 0; i11 < iP; i11++) {
                    a aVar = (a) c2507c.f23496a[i11];
                    aVar.e(obj);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        Object[] objArr = c2507c.f23496a;
                        objArr[i11 - i10] = objArr[i11];
                    }
                }
                int i12 = iP - i10;
                AbstractC2273n.w(c2507c.f23496a, null, i12, iP);
                c2507c.F(i12);
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(Function1 function1) {
        synchronized (this.f48413g) {
            try {
                C2507c c2507c = this.f48412f;
                int iP = c2507c.p();
                int i10 = 0;
                for (int i11 = 0; i11 < iP; i11++) {
                    a aVar = (a) c2507c.f23496a[i11];
                    aVar.n(function1);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        Object[] objArr = c2507c.f23496a;
                        objArr[i11 - i10] = objArr[i11];
                    }
                }
                int i12 = iP - i10;
                AbstractC2273n.w(c2507c.f23496a, null, i12, iP);
                c2507c.F(i12);
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(Object obj, Function1 function1, InterfaceC5082a interfaceC5082a) {
        a aVarJ;
        synchronized (this.f48413g) {
            aVarJ = j(function1);
        }
        boolean z10 = this.f48415i;
        a aVar = this.f48416j;
        long j10 = this.f48417k;
        if (j10 != -1) {
            if (!(j10 == g0.w.a())) {
                V0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + g0.w.a() + ", name=" + g0.w.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.f48415i = false;
            this.f48416j = aVarJ;
            this.f48417k = g0.w.a();
            aVarJ.i(obj, this.f48411e, interfaceC5082a);
        } finally {
            this.f48416j = aVar;
            this.f48415i = z10;
            this.f48417k = j10;
        }
    }

    public final void q() {
        this.f48414h = AbstractC4993l.f48495e.h(this.f48410d);
    }

    public final void r() {
        InterfaceC4988g interfaceC4988g = this.f48414h;
        if (interfaceC4988g != null) {
            interfaceC4988g.dispose();
        }
    }
}
