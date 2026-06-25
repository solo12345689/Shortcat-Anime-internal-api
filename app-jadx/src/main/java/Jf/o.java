package Jf;

import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract /* synthetic */ class o {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f9587a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f9588b;

        /* JADX INFO: renamed from: c */
        int f9589c;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9588b = obj;
            this.f9589c |= Integer.MIN_VALUE;
            return o.c(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC1742e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1742e f9590a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5096o f9591b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a */
            /* synthetic */ Object f9592a;

            /* JADX INFO: renamed from: b */
            int f9593b;

            /* JADX INFO: renamed from: d */
            Object f9595d;

            /* JADX INFO: renamed from: e */
            Object f9596e;

            public a(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f9592a = obj;
                this.f9593b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(InterfaceC1742e interfaceC1742e, InterfaceC5096o interfaceC5096o) {
            this.f9590a = interfaceC1742e;
            this.f9591b = interfaceC5096o;
        }

        /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0013  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0088  */
        @Override // Jf.InterfaceC1742e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(Jf.InterfaceC1743f r9, Zd.e r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof Jf.o.b.a
                if (r0 == 0) goto L13
                r0 = r10
                Jf.o$b$a r0 = (Jf.o.b.a) r0
                int r1 = r0.f9593b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f9593b = r1
                goto L18
            L13:
                Jf.o$b$a r0 = new Jf.o$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f9592a
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r0.f9593b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L55
                if (r2 == r5) goto L47
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f9595d
                Kf.r r9 = (Kf.r) r9
                Td.v.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L89
            L34:
                r10 = move-exception
                goto L93
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f9595d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                Td.v.b(r10)
                goto Lad
            L47:
                java.lang.Object r9 = r0.f9596e
                Jf.f r9 = (Jf.InterfaceC1743f) r9
                java.lang.Object r2 = r0.f9595d
                Jf.o$b r2 = (Jf.o.b) r2
                Td.v.b(r10)     // Catch: java.lang.Throwable -> L53
                goto L68
            L53:
                r9 = move-exception
                goto L99
            L55:
                Td.v.b(r10)
                Jf.e r10 = r8.f9590a     // Catch: java.lang.Throwable -> L97
                r0.f9595d = r8     // Catch: java.lang.Throwable -> L97
                r0.f9596e = r9     // Catch: java.lang.Throwable -> L97
                r0.f9593b = r5     // Catch: java.lang.Throwable -> L97
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L97
                if (r10 != r1) goto L67
                goto Lac
            L67:
                r2 = r8
            L68:
                Kf.r r10 = new Kf.r
                Zd.i r4 = r0.getContext()
                r10.<init>(r9, r4)
                ie.o r9 = r2.f9591b     // Catch: java.lang.Throwable -> L8f
                r0.f9595d = r10     // Catch: java.lang.Throwable -> L8f
                r0.f9596e = r6     // Catch: java.lang.Throwable -> L8f
                r0.f9593b = r3     // Catch: java.lang.Throwable -> L8f
                r2 = 6
                kotlin.jvm.internal.AbstractC5503q.c(r2)     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8f
                r0 = 7
                kotlin.jvm.internal.AbstractC5503q.c(r0)     // Catch: java.lang.Throwable -> L8f
                if (r9 != r1) goto L88
                goto Lac
            L88:
                r9 = r10
            L89:
                r9.releaseIntercepted()
                Td.L r9 = Td.L.f17438a
                return r9
            L8f:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L93:
                r9.releaseIntercepted()
                throw r10
            L97:
                r9 = move-exception
                r2 = r8
            L99:
                Jf.M r10 = new Jf.M
                r10.<init>(r9)
                ie.o r2 = r2.f9591b
                r0.f9595d = r9
                r0.f9596e = r6
                r0.f9593b = r4
                java.lang.Object r10 = Jf.o.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lad
            Lac:
                return r1
            Lad:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.o.b.collect(Jf.f, Zd.e):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC1742e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function2 f9597a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1742e f9598b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a */
            /* synthetic */ Object f9599a;

            /* JADX INFO: renamed from: b */
            int f9600b;

            /* JADX INFO: renamed from: d */
            Object f9602d;

            /* JADX INFO: renamed from: e */
            Object f9603e;

            /* JADX INFO: renamed from: f */
            Object f9604f;

            public a(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f9599a = obj;
                this.f9600b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Function2 function2, InterfaceC1742e interfaceC1742e) {
            this.f9597a = function2;
            this.f9598b = interfaceC1742e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x0080, code lost:
        
            if (r7.collect(r2, r0) != r1) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
        @Override // Jf.InterfaceC1742e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(Jf.InterfaceC1743f r7, Zd.e r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof Jf.o.c.a
                if (r0 == 0) goto L13
                r0 = r8
                Jf.o$c$a r0 = (Jf.o.c.a) r0
                int r1 = r0.f9600b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f9600b = r1
                goto L18
            L13:
                Jf.o$c$a r0 = new Jf.o$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f9599a
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r0.f9600b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                Td.v.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f9604f
                Kf.r r7 = (Kf.r) r7
                java.lang.Object r2 = r0.f9603e
                Jf.f r2 = (Jf.InterfaceC1743f) r2
                java.lang.Object r4 = r0.f9602d
                Jf.o$c r4 = (Jf.o.c) r4
                Td.v.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                Td.v.b(r8)
                Kf.r r8 = new Kf.r
                Zd.i r2 = r0.getContext()
                r8.<init>(r7, r2)
                kotlin.jvm.functions.Function2 r2 = r6.f9597a     // Catch: java.lang.Throwable -> L86
                r0.f9602d = r6     // Catch: java.lang.Throwable -> L86
                r0.f9603e = r7     // Catch: java.lang.Throwable -> L86
                r0.f9604f = r8     // Catch: java.lang.Throwable -> L86
                r0.f9600b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.AbstractC5503q.c(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.AbstractC5503q.c(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                goto L82
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                Jf.e r7 = r4.f9598b
                r8 = 0
                r0.f9602d = r8
                r0.f9603e = r8
                r0.f9604f = r8
                r0.f9600b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
            L82:
                return r1
            L83:
                Td.L r7 = Td.L.f17438a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.o.c.collect(Jf.f, Zd.e):java.lang.Object");
        }
    }

    public static final void b(InterfaceC1743f interfaceC1743f) throws Throwable {
        if (interfaceC1743f instanceof M) {
            throw ((M) interfaceC1743f).f9558a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(Jf.InterfaceC1743f r4, ie.InterfaceC5096o r5, java.lang.Throwable r6, Zd.e r7) {
        /*
            boolean r0 = r7 instanceof Jf.o.a
            if (r0 == 0) goto L13
            r0 = r7
            Jf.o$a r0 = (Jf.o.a) r0
            int r1 = r0.f9589c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9589c = r1
            goto L18
        L13:
            Jf.o$a r0 = new Jf.o$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9588b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f9589c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f9587a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            Td.v.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            Td.v.b(r7)
            r0.f9587a = r6     // Catch: java.lang.Throwable -> L2e
            r0.f9589c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            Td.L r4 = Td.L.f17438a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            Td.AbstractC2156g.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.o.c(Jf.f, ie.o, java.lang.Throwable, Zd.e):java.lang.Object");
    }

    public static final InterfaceC1742e d(InterfaceC1742e interfaceC1742e, InterfaceC5096o interfaceC5096o) {
        return new b(interfaceC1742e, interfaceC5096o);
    }

    public static final InterfaceC1742e e(InterfaceC1742e interfaceC1742e, Function2 function2) {
        return new c(function2, interfaceC1742e);
    }
}
