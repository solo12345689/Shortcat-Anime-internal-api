package Jf;

/* JADX INFO: renamed from: Jf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1738a implements InterfaceC1742e {

    /* JADX INFO: renamed from: Jf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0131a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9560b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f9562d;

        C0131a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9560b = obj;
            this.f9562d |= Integer.MIN_VALUE;
            return AbstractC1738a.this.collect(null, this);
        }
    }

    public abstract Object b(InterfaceC1743f interfaceC1743f, Zd.e eVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Jf.InterfaceC1742e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(Jf.InterfaceC1743f r6, Zd.e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Jf.AbstractC1738a.C0131a
            if (r0 == 0) goto L13
            r0 = r7
            Jf.a$a r0 = (Jf.AbstractC1738a.C0131a) r0
            int r1 = r0.f9562d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9562d = r1
            goto L18
        L13:
            Jf.a$a r0 = new Jf.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9560b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f9562d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f9559a
            Kf.r r6 = (Kf.r) r6
            Td.v.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            Td.v.b(r7)
            Kf.r r7 = new Kf.r
            Zd.i r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f9559a = r7     // Catch: java.lang.Throwable -> L55
            r0.f9562d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            Td.L r6 = Td.L.f17438a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.AbstractC1738a.collect(Jf.f, Zd.e):java.lang.Object");
    }
}
