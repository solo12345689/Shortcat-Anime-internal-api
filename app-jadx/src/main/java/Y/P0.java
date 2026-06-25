package Y;

import Y.InterfaceC2446t0;
import Zd.i;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class P0 implements InterfaceC2446t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2446t0 f22169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2432o0 f22170b = new C2432o0();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f22171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f22172b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f22174d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22172b = obj;
            this.f22174d |= Integer.MIN_VALUE;
            return P0.this.A1(null, this);
        }
    }

    public P0(InterfaceC2446t0 interfaceC2446t0) {
        this.f22169a = interfaceC2446t0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Y.InterfaceC2446t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A1(kotlin.jvm.functions.Function1 r6, Zd.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Y.P0.a
            if (r0 == 0) goto L13
            r0 = r7
            Y.P0$a r0 = (Y.P0.a) r0
            int r1 = r0.f22174d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22174d = r1
            goto L18
        L13:
            Y.P0$a r0 = new Y.P0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f22172b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f22174d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Td.v.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f22171a
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            Td.v.b(r7)
            goto L4c
        L3c:
            Td.v.b(r7)
            Y.o0 r7 = r5.f22170b
            r0.f22171a = r6
            r0.f22174d = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L4c
            goto L59
        L4c:
            Y.t0 r7 = r5.f22169a
            r2 = 0
            r0.f22171a = r2
            r0.f22174d = r3
            java.lang.Object r6 = r7.A1(r6, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.P0.A1(kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }

    public final void a() {
        this.f22170b.d();
    }

    @Override // Zd.i
    public Zd.i a1(i.c cVar) {
        return InterfaceC2446t0.a.c(this, cVar);
    }

    public final void c() {
        this.f22170b.f();
    }

    @Override // Zd.i.b, Zd.i
    public i.b l(i.c cVar) {
        return InterfaceC2446t0.a.b(this, cVar);
    }

    @Override // Zd.i
    public Zd.i w(Zd.i iVar) {
        return InterfaceC2446t0.a.d(this, iVar);
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 function2) {
        return InterfaceC2446t0.a.a(this, obj, function2);
    }
}
