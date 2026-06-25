package F;

import I0.InterfaceC1690p;
import Td.u;

/* JADX INFO: renamed from: F.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1531b implements I0.G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Zd.e f6034c;

    /* JADX INFO: renamed from: F.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f6036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6037c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6039e;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6037c = obj;
            this.f6039e |= Integer.MIN_VALUE;
            return C1531b.this.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(Zd.e r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof F.C1531b.a
            if (r0 == 0) goto L13
            r0 = r5
            F.b$a r0 = (F.C1531b.a) r0
            int r1 = r0.f6039e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6039e = r1
            goto L18
        L13:
            F.b$a r0 = new F.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f6037c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f6039e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f6036b
            Zd.e r1 = (Zd.e) r1
            java.lang.Object r0 = r0.f6035a
            F.b r0 = (F.C1531b) r0
            Td.v.b(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            Td.v.b(r5)
            boolean r5 = r4.f6033b
            if (r5 != 0) goto L71
            Zd.e r5 = r4.f6034c
            r0.f6035a = r4
            r0.f6036b = r5
            r0.f6039e = r3
            Zd.k r2 = new Zd.k
            Zd.e r3 = ae.AbstractC2605b.c(r0)
            r2.<init>(r3)
            r4.f6034c = r2
            java.lang.Object r2 = r2.a()
            java.lang.Object r3 = ae.AbstractC2605b.f()
            if (r2 != r3) goto L60
            kotlin.coroutines.jvm.internal.h.c(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            Td.u$a r5 = Td.u.f17466b
            Td.L r5 = Td.L.f17438a
            java.lang.Object r5 = Td.u.b(r5)
            r1.resumeWith(r5)
        L71:
            Td.L r5 = Td.L.f17438a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: F.C1531b.a(Zd.e):java.lang.Object");
    }

    @Override // I0.G
    public void p(InterfaceC1690p interfaceC1690p) {
        if (this.f6033b) {
            return;
        }
        this.f6033b = true;
        Zd.e eVar = this.f6034c;
        if (eVar != null) {
            u.a aVar = Td.u.f17466b;
            eVar.resumeWith(Td.u.b(Td.L.f17438a));
        }
        this.f6034c = null;
    }
}
