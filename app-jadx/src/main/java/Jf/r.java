package Jf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract /* synthetic */ class r {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC1743f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ N f9633a;

        public a(N n10) {
            this.f9633a = n10;
        }

        @Override // Jf.InterfaceC1743f
        public Object emit(Object obj, Zd.e eVar) {
            this.f9633a.f52259a = obj;
            throw new Kf.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC1743f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function2 f9634a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ N f9635b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a */
            Object f9636a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f9637b;

            /* JADX INFO: renamed from: c */
            int f9638c;

            /* JADX INFO: renamed from: e */
            Object f9640e;

            public a(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f9637b = obj;
                this.f9638c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, N n10) {
            this.f9634a = function2;
            this.f9635b = n10;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
        @Override // Jf.InterfaceC1743f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r5, Zd.e r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof Jf.r.b.a
                if (r0 == 0) goto L13
                r0 = r6
                Jf.r$b$a r0 = (Jf.r.b.a) r0
                int r1 = r0.f9638c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f9638c = r1
                goto L18
            L13:
                Jf.r$b$a r0 = new Jf.r$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f9637b
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r0.f9638c
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f9640e
                java.lang.Object r0 = r0.f9636a
                Jf.r$b r0 = (Jf.r.b) r0
                Td.v.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                Td.v.b(r6)
                kotlin.jvm.functions.Function2 r6 = r4.f9634a
                r0.f9636a = r4
                r0.f9640e = r5
                r0.f9638c = r3
                r2 = 6
                kotlin.jvm.internal.AbstractC5503q.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.AbstractC5503q.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                Td.L r5 = Td.L.f17438a
                return r5
            L5d:
                kotlin.jvm.internal.N r6 = r0.f9635b
                r6.f52259a = r5
                Kf.a r5 = new Kf.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.r.b.emit(java.lang.Object, Zd.e):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f9641a;

        /* JADX INFO: renamed from: b */
        Object f9642b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f9643c;

        /* JADX INFO: renamed from: d */
        int f9644d;

        c(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9643c = obj;
            this.f9644d |= Integer.MIN_VALUE;
            return AbstractC1744g.n(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f9645a;

        /* JADX INFO: renamed from: b */
        Object f9646b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f9647c;

        /* JADX INFO: renamed from: d */
        int f9648d;

        d(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9647c = obj;
            this.f9648d |= Integer.MIN_VALUE;
            return AbstractC1744g.o(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC1743f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ N f9649a;

        public e(N n10) {
            this.f9649a = n10;
        }

        @Override // Jf.InterfaceC1743f
        public Object emit(Object obj, Zd.e eVar) {
            this.f9649a.f52259a = obj;
            throw new Kf.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f9650a;

        /* JADX INFO: renamed from: b */
        Object f9651b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f9652c;

        /* JADX INFO: renamed from: d */
        int f9653d;

        f(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9652c = obj;
            this.f9653d |= Integer.MIN_VALUE;
            return AbstractC1744g.p(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(Jf.InterfaceC1742e r4, Zd.e r5) {
        /*
            boolean r0 = r5 instanceof Jf.r.c
            if (r0 == 0) goto L13
            r0 = r5
            Jf.r$c r0 = (Jf.r.c) r0
            int r1 = r0.f9644d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9644d = r1
            goto L18
        L13:
            Jf.r$c r0 = new Jf.r$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f9643c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f9644d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f9642b
            Jf.r$a r4 = (Jf.r.a) r4
            java.lang.Object r1 = r0.f9641a
            kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
            Td.v.b(r5)     // Catch: Kf.a -> L31
            goto L69
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Td.v.b(r5)
            kotlin.jvm.internal.N r5 = new kotlin.jvm.internal.N
            r5.<init>()
            Lf.E r2 = Kf.p.f11122a
            r5.f52259a = r2
            Jf.r$a r2 = new Jf.r$a
            r2.<init>(r5)
            r0.f9641a = r5     // Catch: Kf.a -> L5b
            r0.f9642b = r2     // Catch: Kf.a -> L5b
            r0.f9644d = r3     // Catch: Kf.a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: Kf.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r1 = r5
            goto L69
        L5b:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5f:
            Kf.l.a(r5, r4)
            Zd.i r4 = r0.getContext()
            Gf.F0.j(r4)
        L69:
            java.lang.Object r4 = r1.f52259a
            Lf.E r5 = Kf.p.f11122a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.r.a(Jf.e, Zd.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(Jf.InterfaceC1742e r4, kotlin.jvm.functions.Function2 r5, Zd.e r6) {
        /*
            boolean r0 = r6 instanceof Jf.r.d
            if (r0 == 0) goto L13
            r0 = r6
            Jf.r$d r0 = (Jf.r.d) r0
            int r1 = r0.f9648d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9648d = r1
            goto L18
        L13:
            Jf.r$d r0 = new Jf.r$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9647c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f9648d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f9646b
            Jf.r$b r4 = (Jf.r.b) r4
            java.lang.Object r5 = r0.f9645a
            kotlin.jvm.internal.N r5 = (kotlin.jvm.internal.N) r5
            Td.v.b(r6)     // Catch: Kf.a -> L31
            goto L69
        L31:
            r6 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Td.v.b(r6)
            kotlin.jvm.internal.N r6 = new kotlin.jvm.internal.N
            r6.<init>()
            Lf.E r2 = Kf.p.f11122a
            r6.f52259a = r2
            Jf.r$b r2 = new Jf.r$b
            r2.<init>(r5, r6)
            r0.f9645a = r6     // Catch: Kf.a -> L5b
            r0.f9646b = r2     // Catch: Kf.a -> L5b
            r0.f9648d = r3     // Catch: Kf.a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: Kf.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r5 = r6
            goto L69
        L5b:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5f:
            Kf.l.a(r6, r4)
            Zd.i r4 = r0.getContext()
            Gf.F0.j(r4)
        L69:
            java.lang.Object r4 = r5.f52259a
            Lf.E r5 = Kf.p.f11122a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.r.b(Jf.e, kotlin.jvm.functions.Function2, Zd.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(Jf.InterfaceC1742e r4, Zd.e r5) {
        /*
            boolean r0 = r5 instanceof Jf.r.f
            if (r0 == 0) goto L13
            r0 = r5
            Jf.r$f r0 = (Jf.r.f) r0
            int r1 = r0.f9653d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9653d = r1
            goto L18
        L13:
            Jf.r$f r0 = new Jf.r$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f9652c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f9653d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f9651b
            Jf.r$e r4 = (Jf.r.e) r4
            java.lang.Object r1 = r0.f9650a
            kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
            Td.v.b(r5)     // Catch: Kf.a -> L31
            goto L65
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Td.v.b(r5)
            kotlin.jvm.internal.N r5 = new kotlin.jvm.internal.N
            r5.<init>()
            Jf.r$e r2 = new Jf.r$e
            r2.<init>(r5)
            r0.f9650a = r5     // Catch: Kf.a -> L57
            r0.f9651b = r2     // Catch: Kf.a -> L57
            r0.f9653d = r3     // Catch: Kf.a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: Kf.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r1 = r5
            goto L65
        L57:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5b:
            Kf.l.a(r5, r4)
            Zd.i r4 = r0.getContext()
            Gf.F0.j(r4)
        L65:
            java.lang.Object r4 = r1.f52259a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.r.c(Jf.e, Zd.e):java.lang.Object");
    }
}
