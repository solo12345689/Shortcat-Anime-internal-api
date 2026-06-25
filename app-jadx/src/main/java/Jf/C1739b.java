package Jf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Jf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1739b extends AbstractC1740c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f9563e;

    /* JADX INFO: renamed from: Jf.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9565b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f9567d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9565b = obj;
            this.f9567d |= Integer.MIN_VALUE;
            return C1739b.this.g(null, this);
        }
    }

    public /* synthetic */ C1739b(Function2 function2, Zd.i iVar, int i10, If.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? Zd.j.f23275a : iVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? If.a.f9114a : aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Jf.AbstractC1740c, Kf.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object g(If.u r5, Zd.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Jf.C1739b.a
            if (r0 == 0) goto L13
            r0 = r6
            Jf.b$a r0 = (Jf.C1739b.a) r0
            int r1 = r0.f9567d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9567d = r1
            goto L18
        L13:
            Jf.b$a r0 = new Jf.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9565b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f9567d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f9564a
            If.u r5 = (If.u) r5
            Td.v.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            Td.v.b(r6)
            r0.f9564a = r5
            r0.f9567d = r3
            java.lang.Object r6 = super.g(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.m()
            if (r5 == 0) goto L4c
            Td.L r5 = Td.L.f17438a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.C1739b.g(If.u, Zd.e):java.lang.Object");
    }

    @Override // Kf.e
    protected Kf.e i(Zd.i iVar, int i10, If.a aVar) {
        return new C1739b(this.f9563e, iVar, i10, aVar);
    }

    public C1739b(Function2 function2, Zd.i iVar, int i10, If.a aVar) {
        super(function2, iVar, i10, aVar);
        this.f9563e = function2;
    }
}
