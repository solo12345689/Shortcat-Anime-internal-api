package Y0;

import kotlin.jvm.internal.AbstractC5504s;
import t.C6550P;
import t.C6575z;

/* JADX INFO: renamed from: Y0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2479n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22696a = a.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6575z f22697b = new C6575z(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6550P f22698c = t.d0.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d1.u f22699d = new d1.u();

    /* JADX INFO: renamed from: Y0.n$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC2484t f22701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f22702b;

        public b(InterfaceC2484t interfaceC2484t, Object obj) {
            this.f22701a = interfaceC2484t;
            this.f22702b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(this.f22701a, bVar.f22701a) && AbstractC5504s.c(this.f22702b, bVar.f22702b);
        }

        public int hashCode() {
            int iHashCode = this.f22701a.hashCode() * 31;
            Object obj = this.f22702b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.f22701a + ", loaderKey=" + this.f22702b + ')';
        }
    }

    /* JADX INFO: renamed from: Y0.n$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f22703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f22704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f22705c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22707e;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22705c = obj;
            this.f22707e |= Integer.MIN_VALUE;
            return C2479n.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(C2479n c2479n, InterfaceC2484t interfaceC2484t, U u10, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c2479n.e(interfaceC2484t, u10, obj, z10);
    }

    public final a d(InterfaceC2484t interfaceC2484t, U u10) {
        a aVar;
        b bVar = new b(interfaceC2484t, u10.a());
        synchronized (this.f22699d) {
            aVar = (a) this.f22697b.d(bVar);
            if (aVar == null) {
                aVar = (a) this.f22698c.e(bVar);
            }
        }
        return aVar;
    }

    public final void e(InterfaceC2484t interfaceC2484t, U u10, Object obj, boolean z10) {
        b bVar = new b(interfaceC2484t, u10.a());
        synchronized (this.f22699d) {
            try {
                if (obj == null) {
                    this.f22698c.x(bVar, a.a(this.f22696a));
                    Td.L l10 = Td.L.f17438a;
                } else if (z10) {
                    this.f22698c.x(bVar, a.a(a.b(obj)));
                    Td.L l11 = Td.L.f17438a;
                } else {
                    this.f22697b.f(bVar, a.a(a.b(obj)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(Y0.InterfaceC2484t r6, Y0.U r7, boolean r8, kotlin.jvm.functions.Function1 r9, Zd.e r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof Y0.C2479n.c
            if (r0 == 0) goto L13
            r0 = r10
            Y0.n$c r0 = (Y0.C2479n.c) r0
            int r1 = r0.f22707e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22707e = r1
            goto L18
        L13:
            Y0.n$c r0 = new Y0.n$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f22705c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f22707e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r8 = r0.f22703a
            java.lang.Object r6 = r0.f22704b
            Y0.n$b r6 = (Y0.C2479n.b) r6
            Td.v.b(r10)
            goto L76
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            Td.v.b(r10)
            Y0.n$b r10 = new Y0.n$b
            java.lang.Object r7 = r7.a()
            r10.<init>(r6, r7)
            d1.u r6 = r5.f22699d
            monitor-enter(r6)
            t.z r7 = r5.f22697b     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.d(r10)     // Catch: java.lang.Throwable -> L59
            Y0.n$a r7 = (Y0.C2479n.a) r7     // Catch: java.lang.Throwable -> L59
            if (r7 != 0) goto L5b
            t.P r7 = r5.f22698c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.e(r10)     // Catch: java.lang.Throwable -> L59
            Y0.n$a r7 = (Y0.C2479n.a) r7     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r7 = move-exception
            goto Lac
        L5b:
            if (r7 == 0) goto L63
            java.lang.Object r7 = r7.g()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r6)
            return r7
        L63:
            Td.L r7 = Td.L.f17438a     // Catch: java.lang.Throwable -> L59
            monitor-exit(r6)
            r0.f22704b = r10
            r0.f22703a = r8
            r0.f22707e = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L73
            return r1
        L73:
            r4 = r10
            r10 = r6
            r6 = r4
        L76:
            d1.u r7 = r5.f22699d
            monitor-enter(r7)
            if (r10 != 0) goto L89
            t.P r8 = r5.f22698c     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = r5.f22696a     // Catch: java.lang.Throwable -> L87
            Y0.n$a r9 = Y0.C2479n.a.a(r9)     // Catch: java.lang.Throwable -> L87
            r8.x(r6, r9)     // Catch: java.lang.Throwable -> L87
            goto La6
        L87:
            r6 = move-exception
            goto Laa
        L89:
            if (r8 == 0) goto L99
            t.P r8 = r5.f22698c     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = Y0.C2479n.a.b(r10)     // Catch: java.lang.Throwable -> L87
            Y0.n$a r9 = Y0.C2479n.a.a(r9)     // Catch: java.lang.Throwable -> L87
            r8.x(r6, r9)     // Catch: java.lang.Throwable -> L87
            goto La6
        L99:
            t.z r8 = r5.f22697b     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = Y0.C2479n.a.b(r10)     // Catch: java.lang.Throwable -> L87
            Y0.n$a r9 = Y0.C2479n.a.a(r9)     // Catch: java.lang.Throwable -> L87
            r8.f(r6, r9)     // Catch: java.lang.Throwable -> L87
        La6:
            Td.L r6 = Td.L.f17438a     // Catch: java.lang.Throwable -> L87
            monitor-exit(r7)
            return r10
        Laa:
            monitor-exit(r7)
            throw r6
        Lac:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.C2479n.g(Y0.t, Y0.U, boolean, kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }

    /* JADX INFO: renamed from: Y0.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f22700a;

        private /* synthetic */ a(Object obj) {
            this.f22700a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && AbstractC5504s.c(obj, ((a) obj2).g());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f22700a, obj);
        }

        public final /* synthetic */ Object g() {
            return this.f22700a;
        }

        public int hashCode() {
            return d(this.f22700a);
        }

        public String toString() {
            return f(this.f22700a);
        }

        public static Object b(Object obj) {
            return obj;
        }
    }
}
