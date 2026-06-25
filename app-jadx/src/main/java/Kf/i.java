package Kf;

import Gf.O;
import Gf.P;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Td.L;
import ae.AbstractC2605b;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5096o f11098e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f11100b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1743f f11102d;

        /* JADX INFO: renamed from: Kf.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0174a implements InterfaceC1743f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f11103a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ O f11104b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f11105c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC1743f f11106d;

            /* JADX INFO: renamed from: Kf.i$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0175a extends kotlin.coroutines.jvm.internal.l implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f11107a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ i f11108b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC1743f f11109c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Object f11110d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0175a(i iVar, InterfaceC1743f interfaceC1743f, Object obj, Zd.e eVar) {
                    super(2, eVar);
                    this.f11108b = iVar;
                    this.f11109c = interfaceC1743f;
                    this.f11110d = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Zd.e create(Object obj, Zd.e eVar) {
                    return new C0175a(this.f11108b, this.f11109c, this.f11110d, eVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(O o10, Zd.e eVar) {
                    return ((C0175a) create(o10, eVar)).invokeSuspend(L.f17438a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = AbstractC2605b.f();
                    int i10 = this.f11107a;
                    if (i10 == 0) {
                        Td.v.b(obj);
                        InterfaceC5096o interfaceC5096o = this.f11108b.f11098e;
                        InterfaceC1743f interfaceC1743f = this.f11109c;
                        Object obj2 = this.f11110d;
                        this.f11107a = 1;
                        if (interfaceC5096o.invoke(interfaceC1743f, obj2, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Td.v.b(obj);
                    }
                    return L.f17438a;
                }
            }

            /* JADX INFO: renamed from: Kf.i$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f11111a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f11112b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f11113c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f11114d;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f11116f;

                b(Zd.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f11114d = obj;
                    this.f11116f |= Integer.MIN_VALUE;
                    return C0174a.this.emit(null, this);
                }
            }

            C0174a(N n10, O o10, i iVar, InterfaceC1743f interfaceC1743f) {
                this.f11103a = n10;
                this.f11104b = o10;
                this.f11105c = iVar;
                this.f11106d = interfaceC1743f;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Jf.InterfaceC1743f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, Zd.e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof Kf.i.a.C0174a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    Kf.i$a$a$b r0 = (Kf.i.a.C0174a.b) r0
                    int r1 = r0.f11116f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f11116f = r1
                    goto L18
                L13:
                    Kf.i$a$a$b r0 = new Kf.i$a$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f11114d
                    java.lang.Object r1 = ae.AbstractC2605b.f()
                    int r2 = r0.f11116f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f11113c
                    Gf.C0 r8 = (Gf.C0) r8
                    java.lang.Object r8 = r0.f11112b
                    java.lang.Object r0 = r0.f11111a
                    Kf.i$a$a r0 = (Kf.i.a.C0174a) r0
                    Td.v.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    Td.v.b(r9)
                    kotlin.jvm.internal.N r9 = r7.f11103a
                    java.lang.Object r9 = r9.f52259a
                    Gf.C0 r9 = (Gf.C0) r9
                    if (r9 == 0) goto L5d
                    Kf.j r2 = new Kf.j
                    r2.<init>()
                    r9.k(r2)
                    r0.f11111a = r7
                    r0.f11112b = r8
                    r0.f11113c = r9
                    r0.f11116f = r3
                    java.lang.Object r9 = r9.h0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.N r9 = r0.f11103a
                    Gf.O r1 = r0.f11104b
                    Gf.Q r3 = Gf.Q.f7532d
                    Kf.i$a$a$a r4 = new Kf.i$a$a$a
                    Kf.i r2 = r0.f11105c
                    Jf.f r0 = r0.f11106d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    Gf.C0 r8 = Gf.AbstractC1613i.d(r1, r2, r3, r4, r5, r6)
                    r9.f52259a = r8
                    Td.L r8 = Td.L.f17438a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: Kf.i.a.C0174a.emit(java.lang.Object, Zd.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
            super(2, eVar);
            this.f11102d = interfaceC1743f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = i.this.new a(this.f11102d, eVar);
            aVar.f11100b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f11099a;
            if (i10 == 0) {
                Td.v.b(obj);
                O o10 = (O) this.f11100b;
                N n10 = new N();
                i iVar = i.this;
                InterfaceC1742e interfaceC1742e = iVar.f11094d;
                C0174a c0174a = new C0174a(n10, o10, iVar, this.f11102d);
                this.f11099a = 1;
                if (interfaceC1742e.collect(c0174a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    public /* synthetic */ i(InterfaceC5096o interfaceC5096o, InterfaceC1742e interfaceC1742e, Zd.i iVar, int i10, If.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5096o, interfaceC1742e, (i11 & 4) != 0 ? Zd.j.f23275a : iVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? If.a.f9114a : aVar);
    }

    @Override // Kf.e
    protected e i(Zd.i iVar, int i10, If.a aVar) {
        return new i(this.f11098e, this.f11094d, iVar, i10, aVar);
    }

    @Override // Kf.g
    protected Object q(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
        Object objE = P.e(new a(interfaceC1743f, null), eVar);
        return objE == AbstractC2605b.f() ? objE : L.f17438a;
    }

    public i(InterfaceC5096o interfaceC5096o, InterfaceC1742e interfaceC1742e, Zd.i iVar, int i10, If.a aVar) {
        super(interfaceC1742e, iVar, i10, aVar);
        this.f11098e = interfaceC5096o;
    }
}
