package Jf;

import ae.AbstractC2605b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.N;

/* JADX INFO: renamed from: Jf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1741d implements InterfaceC1742e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1742e f9569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f9570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f9571c;

    /* JADX INFO: renamed from: Jf.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements InterfaceC1743f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f9573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1743f f9574c;

        /* JADX INFO: renamed from: Jf.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0132a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f9575a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f9577c;

            C0132a(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f9575a = obj;
                this.f9577c |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        a(N n10, InterfaceC1743f interfaceC1743f) {
            this.f9573b = n10;
            this.f9574c = interfaceC1743f;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Jf.InterfaceC1743f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, Zd.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof Jf.C1741d.a.C0132a
                if (r0 == 0) goto L13
                r0 = r7
                Jf.d$a$a r0 = (Jf.C1741d.a.C0132a) r0
                int r1 = r0.f9577c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f9577c = r1
                goto L18
            L13:
                Jf.d$a$a r0 = new Jf.d$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f9575a
                java.lang.Object r1 = ae.AbstractC2605b.f()
                int r2 = r0.f9577c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Td.v.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                Td.v.b(r7)
                Jf.d r7 = Jf.C1741d.this
                kotlin.jvm.functions.Function1 r7 = r7.f9570b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.N r2 = r5.f9573b
                java.lang.Object r2 = r2.f52259a
                Lf.E r4 = Kf.p.f11122a
                if (r2 == r4) goto L58
                Jf.d r4 = Jf.C1741d.this
                kotlin.jvm.functions.Function2 r4 = r4.f9571c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                Td.L r6 = Td.L.f17438a
                return r6
            L58:
                kotlin.jvm.internal.N r2 = r5.f9573b
                r2.f52259a = r7
                Jf.f r7 = r5.f9574c
                r0.f9577c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                Td.L r6 = Td.L.f17438a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Jf.C1741d.a.emit(java.lang.Object, Zd.e):java.lang.Object");
        }
    }

    public C1741d(InterfaceC1742e interfaceC1742e, Function1 function1, Function2 function2) {
        this.f9569a = interfaceC1742e;
        this.f9570b = function1;
        this.f9571c = function2;
    }

    @Override // Jf.InterfaceC1742e
    public Object collect(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
        N n10 = new N();
        n10.f52259a = Kf.p.f11122a;
        Object objCollect = this.f9569a.collect(new a(n10, interfaceC1743f), eVar);
        return objCollect == AbstractC2605b.f() ? objCollect : Td.L.f17438a;
    }
}
