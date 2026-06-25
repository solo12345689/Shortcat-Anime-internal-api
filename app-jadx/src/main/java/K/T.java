package K;

import B.o;
import E0.V;
import Gf.AbstractC1617k;
import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import Y.U1;
import Y.b2;
import Y.h2;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6224f;
import z.AbstractC7254A;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f9826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ B.m f9827b;

        /* JADX INFO: renamed from: K.T$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0140a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0 f9828a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ B.m f9829b;

            /* JADX INFO: renamed from: K.T$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class C0141a implements Y.X {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ C0 f9830a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ B.m f9831b;

                public C0141a(C0 c02, B.m mVar) {
                    this.f9830a = c02;
                    this.f9831b = mVar;
                }

                @Override // Y.X
                public void dispose() {
                    o.b bVar = (o.b) this.f9830a.getValue();
                    if (bVar != null) {
                        o.a aVar = new o.a(bVar);
                        B.m mVar = this.f9831b;
                        if (mVar != null) {
                            mVar.a(aVar);
                        }
                        this.f9830a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0140a(C0 c02, B.m mVar) {
                super(1);
                this.f9828a = c02;
                this.f9829b = mVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Y.X invoke(Y.Y y10) {
                return new C0141a(this.f9828a, this.f9829b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9832a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f9833b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Gf.O f9834c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ C0 f9835d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ B.m f9836e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ h2 f9837f;

            /* JADX INFO: renamed from: K.T$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0142a extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f9838a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f9839b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ long f9840c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Gf.O f9841d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ C0 f9842e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ B.m f9843f;

                /* JADX INFO: renamed from: K.T$a$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                static final class C0143a extends kotlin.coroutines.jvm.internal.l implements Function2 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f9844a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f9845b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C0 f9846c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ long f9847d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ B.m f9848e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0143a(C0 c02, long j10, B.m mVar, Zd.e eVar) {
                        super(2, eVar);
                        this.f9846c = c02;
                        this.f9847d = j10;
                        this.f9848e = mVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Zd.e create(Object obj, Zd.e eVar) {
                        return new C0143a(this.f9846c, this.f9847d, this.f9848e, eVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Gf.O o10, Zd.e eVar) {
                        return ((C0143a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                    @Override // kotlin.coroutines.jvm.internal.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.Object r0 = ae.AbstractC2605b.f()
                            int r1 = r7.f9845b
                            r2 = 0
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L27
                            if (r1 == r4) goto L1f
                            if (r1 != r3) goto L17
                            java.lang.Object r0 = r7.f9844a
                            B.o$b r0 = (B.o.b) r0
                            Td.v.b(r8)
                            goto L66
                        L17:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L1f:
                            java.lang.Object r1 = r7.f9844a
                            Y.C0 r1 = (Y.C0) r1
                            Td.v.b(r8)
                            goto L4b
                        L27:
                            Td.v.b(r8)
                            Y.C0 r8 = r7.f9846c
                            java.lang.Object r8 = r8.getValue()
                            B.o$b r8 = (B.o.b) r8
                            if (r8 == 0) goto L4f
                            B.m r1 = r7.f9848e
                            Y.C0 r5 = r7.f9846c
                            B.o$a r6 = new B.o$a
                            r6.<init>(r8)
                            if (r1 == 0) goto L4c
                            r7.f9844a = r5
                            r7.f9845b = r4
                            java.lang.Object r8 = r1.c(r6, r7)
                            if (r8 != r0) goto L4a
                            goto L64
                        L4a:
                            r1 = r5
                        L4b:
                            r5 = r1
                        L4c:
                            r5.setValue(r2)
                        L4f:
                            B.o$b r8 = new B.o$b
                            long r4 = r7.f9847d
                            r8.<init>(r4, r2)
                            B.m r1 = r7.f9848e
                            if (r1 == 0) goto L67
                            r7.f9844a = r8
                            r7.f9845b = r3
                            java.lang.Object r1 = r1.c(r8, r7)
                            if (r1 != r0) goto L65
                        L64:
                            return r0
                        L65:
                            r0 = r8
                        L66:
                            r8 = r0
                        L67:
                            Y.C0 r0 = r7.f9846c
                            r0.setValue(r8)
                            Td.L r8 = Td.L.f17438a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: K.T.a.b.C0142a.C0143a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: renamed from: K.T$a$b$a$b, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                static final class C0144b extends kotlin.coroutines.jvm.internal.l implements Function2 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f9849a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f9850b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C0 f9851c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ boolean f9852d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ B.m f9853e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0144b(C0 c02, boolean z10, B.m mVar, Zd.e eVar) {
                        super(2, eVar);
                        this.f9851c = c02;
                        this.f9852d = z10;
                        this.f9853e = mVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Zd.e create(Object obj, Zd.e eVar) {
                        return new C0144b(this.f9851c, this.f9852d, this.f9853e, eVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Gf.O o10, Zd.e eVar) {
                        return ((C0144b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        C0 c02;
                        C0 c03;
                        Object objF = AbstractC2605b.f();
                        int i10 = this.f9850b;
                        if (i10 == 0) {
                            Td.v.b(obj);
                            o.b bVar = (o.b) this.f9851c.getValue();
                            if (bVar != null) {
                                boolean z10 = this.f9852d;
                                B.m mVar = this.f9853e;
                                c02 = this.f9851c;
                                B.j cVar = z10 ? new o.c(bVar) : new o.a(bVar);
                                if (mVar != null) {
                                    this.f9849a = c02;
                                    this.f9850b = 1;
                                    if (mVar.c(cVar, this) == objF) {
                                        return objF;
                                    }
                                    c03 = c02;
                                }
                                c02.setValue(null);
                            }
                            return Td.L.f17438a;
                        }
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c03 = (C0) this.f9849a;
                        Td.v.b(obj);
                        c02 = c03;
                        c02.setValue(null);
                        return Td.L.f17438a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0142a(Gf.O o10, C0 c02, B.m mVar, Zd.e eVar) {
                    super(3, eVar);
                    this.f9841d = o10;
                    this.f9842e = c02;
                    this.f9843f = mVar;
                }

                public final Object a(z.r rVar, long j10, Zd.e eVar) {
                    C0142a c0142a = new C0142a(this.f9841d, this.f9842e, this.f9843f, eVar);
                    c0142a.f9839b = rVar;
                    c0142a.f9840c = j10;
                    return c0142a.invokeSuspend(Td.L.f17438a);
                }

                @Override // ie.InterfaceC5096o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return a((z.r) obj, ((C6224f) obj2).u(), (Zd.e) obj3);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = AbstractC2605b.f();
                    int i10 = this.f9838a;
                    if (i10 == 0) {
                        Td.v.b(obj);
                        z.r rVar = (z.r) this.f9839b;
                        AbstractC1617k.d(this.f9841d, null, null, new C0143a(this.f9842e, this.f9840c, this.f9843f, null), 3, null);
                        this.f9838a = 1;
                        obj = rVar.h1(this);
                        if (obj == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Td.v.b(obj);
                    }
                    AbstractC1617k.d(this.f9841d, null, null, new C0144b(this.f9842e, ((Boolean) obj).booleanValue(), this.f9843f, null), 3, null);
                    return Td.L.f17438a;
                }
            }

            /* JADX INFO: renamed from: K.T$a$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0145b extends AbstractC5506u implements Function1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ h2 f9854a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0145b(h2 h2Var) {
                    super(1);
                    this.f9854a = h2Var;
                }

                public final void a(long j10) {
                    ((Function1) this.f9854a.getValue()).invoke(C6224f.d(j10));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((C6224f) obj).u());
                    return Td.L.f17438a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Gf.O o10, C0 c02, B.m mVar, h2 h2Var, Zd.e eVar) {
                super(2, eVar);
                this.f9834c = o10;
                this.f9835d = c02;
                this.f9836e = mVar;
                this.f9837f = h2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                b bVar = new b(this.f9834c, this.f9835d, this.f9836e, this.f9837f, eVar);
                bVar.f9833b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(E0.L l10, Zd.e eVar) {
                return ((b) create(l10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9832a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    E0.L l10 = (E0.L) this.f9833b;
                    C0142a c0142a = new C0142a(this.f9834c, this.f9835d, this.f9836e, null);
                    C0145b c0145b = new C0145b(this.f9837f);
                    this.f9832a = 1;
                    if (AbstractC7254A.h(l10, c0142a, c0145b, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                }
                return Td.L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, B.m mVar) {
            super(3);
            this.f9826a = function1;
            this.f9827b = mVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(-102778667);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-102778667, i10, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
            }
            Object objD = interfaceC2425m.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                Object l10 = new Y.L(AbstractC2393b0.i(Zd.j.f23275a, interfaceC2425m));
                interfaceC2425m.u(l10);
                objD = l10;
            }
            Gf.O oA = ((Y.L) objD).a();
            Object objD2 = interfaceC2425m.D();
            if (objD2 == aVar.a()) {
                objD2 = b2.e(null, null, 2, null);
                interfaceC2425m.u(objD2);
            }
            C0 c02 = (C0) objD2;
            h2 h2VarO = U1.o(this.f9826a, interfaceC2425m, 0);
            Object obj = this.f9827b;
            boolean zU = interfaceC2425m.U(obj);
            B.m mVar = this.f9827b;
            Object objD3 = interfaceC2425m.D();
            if (zU || objD3 == aVar.a()) {
                objD3 = new C0140a(c02, mVar);
                interfaceC2425m.u(objD3);
            }
            AbstractC2393b0.b(obj, (Function1) objD3, interfaceC2425m, 0);
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            B.m mVar2 = this.f9827b;
            boolean zF = interfaceC2425m.F(oA) | interfaceC2425m.U(this.f9827b) | interfaceC2425m.U(h2VarO);
            B.m mVar3 = this.f9827b;
            Object objD4 = interfaceC2425m.D();
            if (zF || objD4 == aVar.a()) {
                Object bVar = new b(oA, c02, mVar3, h2VarO, null);
                interfaceC2425m.u(bVar);
                objD4 = bVar;
            }
            androidx.compose.ui.e eVarThen = aVar2.then(new SuspendPointerInputElement(mVar2, null, null, new V.a((Function2) objD4), 6, null));
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarThen;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, B.m mVar, boolean z10, Function1 function1) {
        return z10 ? androidx.compose.ui.c.c(eVar, null, new a(function1, mVar), 1, null) : eVar;
    }
}
