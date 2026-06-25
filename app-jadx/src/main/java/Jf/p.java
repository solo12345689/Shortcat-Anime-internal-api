package Jf;

import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract /* synthetic */ class p {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC1742e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1742e f9605a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f9606b;

        public a(InterfaceC1742e interfaceC1742e, Function2 function2) {
            this.f9605a = interfaceC1742e;
            this.f9606b = function2;
        }

        @Override // Jf.InterfaceC1742e
        public Object collect(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
            Object objCollect = this.f9605a.collect(new b(new kotlin.jvm.internal.J(), interfaceC1743f, this.f9606b), eVar);
            return objCollect == AbstractC2605b.f() ? objCollect : Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements InterfaceC1743f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.J f9607a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1743f f9608b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f9609c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a */
            Object f9610a;

            /* JADX INFO: renamed from: b */
            Object f9611b;

            /* JADX INFO: renamed from: c */
            /* synthetic */ Object f9612c;

            /* JADX INFO: renamed from: e */
            int f9614e;

            a(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f9612c = obj;
                this.f9614e |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        b(kotlin.jvm.internal.J j10, InterfaceC1743f interfaceC1743f, Function2 function2) {
            this.f9607a = j10;
            this.f9608b = interfaceC1743f;
            this.f9609c = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L71;
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x008b  */
        @Override // Jf.InterfaceC1743f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, Zd.e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof Jf.p.b.a
                if (r0 == 0) goto L13
                r0 = r8
                Jf.p$b$a r0 = (Jf.p.b.a) r0
                int r1 = r0.f9614e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f9614e = r1
                goto L18
            L13:
                Jf.p$b$a r0 = new Jf.p$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f9612c
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r0.f9614e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                Td.v.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f9611b
                java.lang.Object r2 = r0.f9610a
                Jf.p$b r2 = (Jf.p.b) r2
                Td.v.b(r8)
                goto L6c
            L41:
                Td.v.b(r8)
                goto L59
            L45:
                Td.v.b(r8)
                kotlin.jvm.internal.J r8 = r6.f9607a
                boolean r8 = r8.f52255a
                if (r8 == 0) goto L5c
                Jf.f r8 = r6.f9608b
                r0.f9614e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                Td.L r7 = Td.L.f17438a
                return r7
            L5c:
                kotlin.jvm.functions.Function2 r8 = r6.f9609c
                r0.f9610a = r6
                r0.f9611b = r7
                r0.f9614e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.J r8 = r2.f9607a
                r8.f52255a = r5
                Jf.f r8 = r2.f9608b
                r2 = 0
                r0.f9610a = r2
                r0.f9611b = r2
                r0.f9614e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                Td.L r7 = Td.L.f17438a
                return r7
            L8b:
                Td.L r7 = Td.L.f17438a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.p.b.emit(java.lang.Object, Zd.e):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC1742e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1742e f9615a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f9616b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a */
            /* synthetic */ Object f9617a;

            /* JADX INFO: renamed from: b */
            int f9618b;

            /* JADX INFO: renamed from: d */
            Object f9620d;

            public a(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f9617a = obj;
                this.f9618b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(InterfaceC1742e interfaceC1742e, Function2 function2) {
            this.f9615a = interfaceC1742e;
            this.f9616b = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
        @Override // Jf.InterfaceC1742e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(Jf.InterfaceC1743f r6, Zd.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Jf.p.c.a
                if (r0 == 0) goto L13
                r0 = r7
                Jf.p$c$a r0 = (Jf.p.c.a) r0
                int r1 = r0.f9618b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f9618b = r1
                goto L18
            L13:
                Jf.p$c$a r0 = new Jf.p$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f9617a
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r0.f9618b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f9620d
                Jf.p$d r6 = (Jf.p.d) r6
                Td.v.b(r7)     // Catch: Kf.a -> L2d
                goto L5a
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                Td.v.b(r7)
                Jf.e r7 = r5.f9615a
                Jf.p$d r2 = new Jf.p$d
                kotlin.jvm.functions.Function2 r4 = r5.f9616b
                r2.<init>(r4, r6)
                r0.f9620d = r2     // Catch: Kf.a -> L4e
                r0.f9618b = r3     // Catch: Kf.a -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: Kf.a -> L4e
                if (r6 != r1) goto L5a
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                Kf.l.a(r7, r6)
                Zd.i r6 = r0.getContext()
                Gf.F0.j(r6)
            L5a:
                Td.L r6 = Td.L.f17438a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.p.c.collect(Jf.f, Zd.e):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC1743f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function2 f9621a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1743f f9622b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a */
            Object f9623a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f9624b;

            /* JADX INFO: renamed from: c */
            int f9625c;

            /* JADX INFO: renamed from: e */
            Object f9627e;

            public a(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f9624b = obj;
                this.f9625c |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        public d(Function2 function2, InterfaceC1743f interfaceC1743f) {
            this.f9621a = function2;
            this.f9622b = interfaceC1743f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0081  */
        @Override // Jf.InterfaceC1743f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r8, Zd.e r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof Jf.p.d.a
                if (r0 == 0) goto L13
                r0 = r9
                Jf.p$d$a r0 = (Jf.p.d.a) r0
                int r1 = r0.f9625c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f9625c = r1
                goto L18
            L13:
                Jf.p$d$a r0 = new Jf.p$d$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f9624b
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r0.f9625c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f9623a
                Jf.p$d r8 = (Jf.p.d) r8
                Td.v.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f9627e
                java.lang.Object r2 = r0.f9623a
                Jf.p$d r2 = (Jf.p.d) r2
                Td.v.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                Td.v.b(r9)
                kotlin.jvm.functions.Function2 r9 = r7.f9621a
                r0.f9623a = r7
                r0.f9627e = r8
                r0.f9625c = r4
                r2 = 6
                kotlin.jvm.internal.AbstractC5503q.c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.AbstractC5503q.c(r2)
                if (r9 != r1) goto L60
                goto L7a
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                Jf.f r2 = r8.f9622b
                r0.f9623a = r8
                r5 = 0
                r0.f9627e = r5
                r0.f9625c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
            L7a:
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                Td.L r8 = Td.L.f17438a
                return r8
            L81:
                Kf.a r9 = new Kf.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.p.d.emit(java.lang.Object, Zd.e):java.lang.Object");
        }
    }

    public static final InterfaceC1742e a(InterfaceC1742e interfaceC1742e, Function2 function2) {
        return new a(interfaceC1742e, function2);
    }

    public static final InterfaceC1742e b(InterfaceC1742e interfaceC1742e, Function2 function2) {
        return new c(interfaceC1742e, function2);
    }
}
