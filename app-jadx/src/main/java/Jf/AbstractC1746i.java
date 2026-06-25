package Jf;

import ae.AbstractC2605b;

/* JADX INFO: renamed from: Jf.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract /* synthetic */ class AbstractC1746i {

    /* JADX INFO: renamed from: Jf.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f9579a;

        /* JADX INFO: renamed from: b */
        Object f9580b;

        /* JADX INFO: renamed from: c */
        Object f9581c;

        /* JADX INFO: renamed from: d */
        boolean f9582d;

        /* JADX INFO: renamed from: e */
        /* synthetic */ Object f9583e;

        /* JADX INFO: renamed from: f */
        int f9584f;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9583e = obj;
            this.f9584f |= Integer.MIN_VALUE;
            return AbstractC1746i.c(null, null, false, this);
        }
    }

    public static final Object b(InterfaceC1743f interfaceC1743f, If.v vVar, Zd.e eVar) {
        Object objC = c(interfaceC1743f, vVar, true, eVar);
        return objC == AbstractC2605b.f() ? objC : Td.L.f17438a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:59:0x0036, B:70:0x0062, B:74:0x0077, B:76:0x007f, B:66:0x0054, B:69:0x005e), top: B:88:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0091 -> B:60:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(Jf.InterfaceC1743f r6, If.v r7, boolean r8, Zd.e r9) {
        /*
            boolean r0 = r9 instanceof Jf.AbstractC1746i.a
            if (r0 == 0) goto L13
            r0 = r9
            Jf.i$a r0 = (Jf.AbstractC1746i.a) r0
            int r1 = r0.f9584f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9584f = r1
            goto L18
        L13:
            Jf.i$a r0 = new Jf.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9583e
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f9584f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f9582d
            java.lang.Object r6 = r0.f9581c
            If.i r6 = (If.i) r6
            java.lang.Object r7 = r0.f9580b
            If.v r7 = (If.v) r7
            java.lang.Object r2 = r0.f9579a
            Jf.f r2 = (Jf.InterfaceC1743f) r2
            Td.v.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f9582d
            java.lang.Object r6 = r0.f9581c
            If.i r6 = (If.i) r6
            java.lang.Object r7 = r0.f9580b
            If.v r7 = (If.v) r7
            java.lang.Object r2 = r0.f9579a
            Jf.f r2 = (Jf.InterfaceC1743f) r2
            Td.v.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            Td.v.b(r9)
            Jf.AbstractC1744g.m(r6)
            If.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f9579a = r6     // Catch: java.lang.Throwable -> L3c
            r0.f9580b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f9581c = r9     // Catch: java.lang.Throwable -> L3c
            r0.f9582d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f9584f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f9579a = r2     // Catch: java.lang.Throwable -> L3c
            r0.f9580b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f9581c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f9582d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f9584f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            If.n.a(r7, r6)
        L9a:
            Td.L r6 = Td.L.f17438a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            If.n.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.AbstractC1746i.c(Jf.f, If.v, boolean, Zd.e):java.lang.Object");
    }
}
