package Y;

import Y.U;
import a0.C2507c;
import i0.AbstractC4977V;
import i0.AbstractC4978W;
import i0.AbstractC4993l;
import i0.AbstractC5003v;
import i0.InterfaceC4976U;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6545K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class T extends AbstractC4977V implements U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f22209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T1 f22210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f22211d = new a(AbstractC5003v.M().i());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC4978W implements U.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0379a f22212h = new C0379a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f22213i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final Object f22214j = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f22215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f22216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private t.T f22217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f22218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f22219g;

        /* JADX INFO: renamed from: Y.T$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0379a {
            public /* synthetic */ C0379a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object a() {
                return a.f22214j;
            }

            private C0379a() {
            }
        }

        public a(long j10) {
            super(j10);
            this.f22217e = t.U.a();
            this.f22218f = f22214j;
        }

        @Override // Y.U.a
        public Object a() {
            return this.f22218f;
        }

        @Override // Y.U.a
        public t.T b() {
            return this.f22217e;
        }

        @Override // i0.AbstractC4978W
        public void c(AbstractC4978W abstractC4978W) {
            AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) abstractC4978W;
            m(aVar.b());
            this.f22218f = aVar.f22218f;
            this.f22219g = aVar.f22219g;
        }

        @Override // i0.AbstractC4978W
        public AbstractC4978W d(long j10) {
            return new a(j10);
        }

        public final Object j() {
            return this.f22218f;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean k(Y.U r6, i0.AbstractC4993l r7) {
            /*
                r5 = this;
                java.lang.Object r0 = i0.AbstractC5003v.O()
                monitor-enter(r0)
                long r1 = r5.f22215c     // Catch: java.lang.Throwable -> L1c
                long r3 = r7.i()     // Catch: java.lang.Throwable -> L1c
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L1e
                int r1 = r5.f22216d     // Catch: java.lang.Throwable -> L1c
                int r4 = r7.j()     // Catch: java.lang.Throwable -> L1c
                if (r1 == r4) goto L1a
                goto L1e
            L1a:
                r1 = r3
                goto L1f
            L1c:
                r6 = move-exception
                goto L4f
            L1e:
                r1 = r2
            L1f:
                monitor-exit(r0)
                java.lang.Object r0 = r5.f22218f
                java.lang.Object r4 = Y.T.a.f22214j
                if (r0 == r4) goto L31
                if (r1 == 0) goto L32
                int r0 = r5.f22219g
                int r6 = r5.l(r6, r7)
                if (r0 != r6) goto L31
                goto L32
            L31:
                r2 = r3
            L32:
                if (r2 == 0) goto L4e
                if (r1 == 0) goto L4e
                java.lang.Object r6 = i0.AbstractC5003v.O()
                monitor-enter(r6)
                long r0 = r7.i()     // Catch: java.lang.Throwable -> L4b
                r5.f22215c = r0     // Catch: java.lang.Throwable -> L4b
                int r7 = r7.j()     // Catch: java.lang.Throwable -> L4b
                r5.f22216d = r7     // Catch: java.lang.Throwable -> L4b
                Td.L r7 = Td.L.f17438a     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r6)
                return r2
            L4b:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            L4e:
                return r2
            L4f:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.T.a.k(Y.U, i0.l):boolean");
        }

        public final int l(U u10, AbstractC4993l abstractC4993l) {
            t.T tB;
            int iA;
            int i10;
            int i11;
            int i12;
            synchronized (AbstractC5003v.O()) {
                tB = b();
            }
            int i13 = 7;
            if (!tB.h()) {
                return 7;
            }
            C2507c c2507cB = U1.b();
            Object[] objArr = c2507cB.f23496a;
            int iP = c2507cB.p();
            for (int i14 = 0; i14 < iP; i14++) {
                ((V) objArr[i14]).a(u10);
            }
            try {
                Object[] objArr2 = tB.f60001b;
                int[] iArr = tB.f60002c;
                long[] jArr = tB.f60000a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iA = 7;
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << i13) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8;
                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j10 & 255) < 128) {
                                    int i19 = (i15 << 3) + i18;
                                    i11 = i13;
                                    InterfaceC4976U interfaceC4976U = (InterfaceC4976U) objArr2[i19];
                                    i12 = i16;
                                    if (iArr[i19] == 1) {
                                        AbstractC4978W abstractC4978WX = interfaceC4976U instanceof T ? ((T) interfaceC4976U).x(abstractC4993l) : AbstractC5003v.L(interfaceC4976U.l(), abstractC4993l);
                                        iA = (((iA * 31) + g0.t.a(abstractC4978WX)) * 31) + Long.hashCode(abstractC4978WX.f());
                                    }
                                } else {
                                    i11 = i13;
                                    i12 = i16;
                                }
                                j10 >>= i12;
                                i18++;
                                i16 = i12;
                                i13 = i11;
                            }
                            i10 = i13;
                            if (i17 != i16) {
                                break;
                            }
                        } else {
                            i10 = i13;
                        }
                        if (i15 == length) {
                            i13 = iA;
                            break;
                        }
                        i15++;
                        i13 = i10;
                    }
                }
                iA = i13;
                Td.L l10 = Td.L.f17438a;
                Object[] objArr3 = c2507cB.f23496a;
                int iP2 = c2507cB.p();
                for (int i20 = 0; i20 < iP2; i20++) {
                    ((V) objArr3[i20]).b(u10);
                }
                return iA;
            } catch (Throwable th2) {
                Object[] objArr4 = c2507cB.f23496a;
                int iP3 = c2507cB.p();
                for (int i21 = 0; i21 < iP3; i21++) {
                    ((V) objArr4[i21]).b(u10);
                }
                throw th2;
            }
        }

        public void m(t.T t10) {
            this.f22217e = t10;
        }

        public final void n(Object obj) {
            this.f22218f = obj;
        }

        public final void o(int i10) {
            this.f22219g = i10;
        }

        public final void p(long j10) {
            this.f22215c = j10;
        }

        public final void q(int i10) {
            this.f22216d = i10;
        }
    }

    public T(InterfaceC5082a interfaceC5082a, T1 t12) {
        this.f22209b = interfaceC5082a;
        this.f22210c = t12;
    }

    private final String A() {
        a aVar = (a) AbstractC5003v.K(this.f22211d);
        return aVar.k(this, AbstractC4993l.f48495e.c()) ? String.valueOf(aVar.j()) : "<Not calculated>";
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Y.T.a y(Y.T.a r22, i0.AbstractC4993l r23, boolean r24, ie.InterfaceC5082a r25) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.T.y(Y.T$a, i0.l, boolean, ie.a):Y.T$a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L z(T t10, g0.k kVar, C6545K c6545k, int i10, Object obj) {
        if (obj == t10) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof InterfaceC4976U) {
            c6545k.u(obj, Math.min(kVar.a() - i10, c6545k.e(obj, Integer.MAX_VALUE)));
        }
        return Td.L.f17438a;
    }

    @Override // Y.U
    public T1 d() {
        return this.f22210c;
    }

    @Override // Y.h2
    public Object getValue() {
        AbstractC4993l.a aVar = AbstractC4993l.f48495e;
        Function1 function1G = aVar.c().g();
        if (function1G != null) {
            function1G.invoke(this);
        }
        AbstractC4993l abstractC4993lC = aVar.c();
        return y((a) AbstractC5003v.L(this.f22211d, abstractC4993lC), abstractC4993lC, true, this.f22209b).j();
    }

    @Override // i0.InterfaceC4976U
    public AbstractC4978W l() {
        return this.f22211d;
    }

    @Override // Y.U
    public U.a o() {
        AbstractC4993l abstractC4993lC = AbstractC4993l.f48495e.c();
        return y((a) AbstractC5003v.L(this.f22211d, abstractC4993lC), abstractC4993lC, false, this.f22209b);
    }

    @Override // i0.InterfaceC4976U
    public void r(AbstractC4978W abstractC4978W) {
        AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f22211d = (a) abstractC4978W;
    }

    public String toString() {
        return "DerivedState(value=" + A() + ")@" + hashCode();
    }

    public final AbstractC4978W x(AbstractC4993l abstractC4993l) {
        return y((a) AbstractC5003v.L(this.f22211d, abstractC4993l), abstractC4993l, false, this.f22209b);
    }
}
