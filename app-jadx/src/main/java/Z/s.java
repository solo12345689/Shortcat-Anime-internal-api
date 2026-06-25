package z;

import Pf.a;
import i1.InterfaceC5011d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements r, InterfaceC5011d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC5011d f65416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f65417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f65418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Pf.a f65419d = Pf.g.a(false);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f65420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f65421b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f65423d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65421b = obj;
            this.f65423d |= Integer.MIN_VALUE;
            return s.this.p(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f65424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f65425b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f65427d;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65425b = obj;
            this.f65427d |= Integer.MIN_VALUE;
            return s.this.h1(this);
        }
    }

    public s(InterfaceC5011d interfaceC5011d) {
        this.f65416a = interfaceC5011d;
    }

    @Override // i1.InterfaceC5011d
    public float A(int i10) {
        return this.f65416a.A(i10);
    }

    @Override // i1.InterfaceC5019l
    public long O(float f10) {
        return this.f65416a.O(f10);
    }

    @Override // i1.InterfaceC5011d
    public long Q(long j10) {
        return this.f65416a.Q(j10);
    }

    @Override // i1.InterfaceC5019l
    public float T(long j10) {
        return this.f65416a.T(j10);
    }

    public final void b() {
        this.f65418c = true;
        a.C0227a.c(this.f65419d, null, 1, null);
    }

    @Override // i1.InterfaceC5011d
    public long d0(float f10) {
        return this.f65416a.d0(f10);
    }

    @Override // i1.InterfaceC5011d
    public float e1(float f10) {
        return this.f65416a.e1(f10);
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f65416a.getDensity();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h1(Zd.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof z.s.b
            if (r0 == 0) goto L13
            r0 = r6
            z.s$b r0 = (z.s.b) r0
            int r1 = r0.f65427d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65427d = r1
            goto L18
        L13:
            z.s$b r0 = new z.s$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f65425b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f65427d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f65424a
            z.s r0 = (z.s) r0
            Td.v.b(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            Td.v.b(r6)
            boolean r6 = r5.f65417b
            if (r6 != 0) goto L55
            boolean r6 = r5.f65418c
            if (r6 != 0) goto L55
            Pf.a r6 = r5.f65419d
            r0.f65424a = r5
            r0.f65427d = r4
            java.lang.Object r6 = Pf.a.C0227a.a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            Pf.a r6 = r0.f65419d
            Pf.a.C0227a.c(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.f65417b
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.s.h1(Zd.e):java.lang.Object");
    }

    public final void j() {
        this.f65417b = true;
        a.C0227a.c(this.f65419d, null, 1, null);
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f65416a.j1();
    }

    @Override // i1.InterfaceC5011d
    public float l1(float f10) {
        return this.f65416a.l1(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(Zd.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof z.s.a
            if (r0 == 0) goto L13
            r0 = r5
            z.s$a r0 = (z.s.a) r0
            int r1 = r0.f65423d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65423d = r1
            goto L18
        L13:
            z.s$a r0 = new z.s$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f65421b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f65423d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f65420a
            z.s r0 = (z.s) r0
            Td.v.b(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            Td.v.b(r5)
            Pf.a r5 = r4.f65419d
            r0.f65420a = r4
            r0.f65423d = r3
            r2 = 0
            java.lang.Object r5 = Pf.a.C0227a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.f65417b = r5
            r0.f65418c = r5
            Td.L r5 = Td.L.f17438a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.s.p(Zd.e):java.lang.Object");
    }

    @Override // i1.InterfaceC5011d
    public int s0(float f10) {
        return this.f65416a.s0(f10);
    }

    @Override // i1.InterfaceC5011d
    public long w1(long j10) {
        return this.f65416a.w1(j10);
    }

    @Override // i1.InterfaceC5011d
    public float z0(long j10) {
        return this.f65416a.z0(j10);
    }
}
