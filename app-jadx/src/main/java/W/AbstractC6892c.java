package w;

import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.b2;
import Y.h2;
import ae.AbstractC2605b;
import i1.C5015h;
import i1.C5021n;
import i1.C5025r;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.C5498l;
import r0.C6224f;
import r0.C6226h;
import r0.C6230l;

/* JADX INFO: renamed from: w.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6892c {

    /* JADX INFO: renamed from: a */
    private static final C6903h0 f62484a = AbstractC6906j.h(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b */
    private static final C6903h0 f62485b = AbstractC6906j.h(0.0f, 0.0f, C5015h.h(I0.a(C5015h.f48547b)), 3, null);

    /* JADX INFO: renamed from: c */
    private static final C6903h0 f62486c = AbstractC6906j.h(0.0f, 0.0f, C6230l.c(I0.f(C6230l.f58350b)), 3, null);

    /* JADX INFO: renamed from: d */
    private static final C6903h0 f62487d = AbstractC6906j.h(0.0f, 0.0f, C6224f.d(I0.e(C6224f.f58329b)), 3, null);

    /* JADX INFO: renamed from: e */
    private static final C6903h0 f62488e = AbstractC6906j.h(0.0f, 0.0f, I0.g(C6226h.f58334e), 3, null);

    /* JADX INFO: renamed from: f */
    private static final C6903h0 f62489f = AbstractC6906j.h(0.0f, 0.0f, Integer.valueOf(I0.b(kotlin.jvm.internal.r.f52290a)), 3, null);

    /* JADX INFO: renamed from: g */
    private static final C6903h0 f62490g = AbstractC6906j.h(0.0f, 0.0f, C5021n.c(I0.c(C5021n.f48560b)), 3, null);

    /* JADX INFO: renamed from: h */
    private static final C6903h0 f62491h = AbstractC6906j.h(0.0f, 0.0f, C5025r.b(I0.d(C5025r.f48570b)), 3, null);

    /* JADX INFO: renamed from: w.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ If.g f62492a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object f62493b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(If.g gVar, Object obj) {
            super(0);
            this.f62492a = gVar;
            this.f62493b = obj;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m972invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m972invoke() {
            this.f62492a.d(this.f62493b);
        }
    }

    /* JADX INFO: renamed from: w.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f62494a;

        /* JADX INFO: renamed from: b */
        int f62495b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Object f62496c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ If.g f62497d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C6888a f62498e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ h2 f62499f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ h2 f62500g;

        /* JADX INFO: renamed from: w.c$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f62501a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Object f62502b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C6888a f62503c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ h2 f62504d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ h2 f62505e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, C6888a c6888a, h2 h2Var, h2 h2Var2, Zd.e eVar) {
                super(2, eVar);
                this.f62502b = obj;
                this.f62503c = c6888a;
                this.f62504d = h2Var;
                this.f62505e = h2Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new a(this.f62502b, this.f62503c, this.f62504d, this.f62505e, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar;
                Object objF = AbstractC2605b.f();
                int i10 = this.f62501a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    if (AbstractC5504s.c(this.f62502b, this.f62503c.k())) {
                        return Td.L.f17438a;
                    }
                    C6888a c6888a = this.f62503c;
                    Object obj2 = this.f62502b;
                    InterfaceC6904i interfaceC6904iG = AbstractC6892c.g(this.f62504d);
                    this.f62501a = 1;
                    aVar = this;
                    if (C6888a.f(c6888a, obj2, interfaceC6904iG, null, null, aVar, 12, null) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                    aVar = this;
                }
                Function1 function1F = AbstractC6892c.f(aVar.f62505e);
                if (function1F != null) {
                    function1F.invoke(aVar.f62503c.m());
                }
                return Td.L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(If.g gVar, C6888a c6888a, h2 h2Var, h2 h2Var2, Zd.e eVar) {
            super(2, eVar);
            this.f62497d = gVar;
            this.f62498e = c6888a;
            this.f62499f = h2Var;
            this.f62500g = h2Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f62497d, this.f62498e, this.f62499f, this.f62500g, eVar);
            bVar.f62496c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0039 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0037 -> B:33:0x003a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r11.f62495b
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r11.f62494a
                If.i r1 = (If.i) r1
                java.lang.Object r3 = r11.f62496c
                Gf.O r3 = (Gf.O) r3
                Td.v.b(r12)
                goto L3a
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                Td.v.b(r12)
                java.lang.Object r12 = r11.f62496c
                Gf.O r12 = (Gf.O) r12
                If.g r1 = r11.f62497d
                If.i r1 = r1.iterator()
                r3 = r12
            L2d:
                r11.f62496c = r3
                r11.f62494a = r1
                r11.f62495b = r2
                java.lang.Object r12 = r1.a(r11)
                if (r12 != r0) goto L3a
                return r0
            L3a:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L6a
                java.lang.Object r12 = r1.next()
                If.g r4 = r11.f62497d
                java.lang.Object r4 = r4.f()
                java.lang.Object r4 = If.k.f(r4)
                if (r4 != 0) goto L54
                r6 = r12
                goto L55
            L54:
                r6 = r4
            L55:
                w.c$b$a r5 = new w.c$b$a
                w.a r7 = r11.f62498e
                Y.h2 r8 = r11.f62499f
                Y.h2 r9 = r11.f62500g
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r7 = 3
                r8 = 0
                r4 = 0
                r6 = r5
                r5 = 0
                Gf.AbstractC1613i.d(r3, r4, r5, r6, r7, r8)
                goto L2d
            L6a:
                Td.L r12 = Td.L.f17438a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: w.AbstractC6892c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final h2 c(float f10, InterfaceC6904i interfaceC6904i, String str, Function1 function1, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6904i = f62485b;
        }
        InterfaceC6904i interfaceC6904i2 = interfaceC6904i;
        if ((i11 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1407150062, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i12 = i10 << 6;
        h2 h2VarE = e(C5015h.h(f10), u0.b(C5015h.f48547b), interfaceC6904i2, null, str2, function12, interfaceC2425m, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarE;
    }

    public static final h2 d(float f10, InterfaceC6904i interfaceC6904i, float f11, String str, Function1 function1, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6904i = f62484a;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.01f;
        }
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        Function1 function12 = (i11 & 16) != 0 ? null : function1;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(668842840, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        if (interfaceC6904i == f62484a) {
            interfaceC2425m.V(1125598679);
            boolean z10 = (((i10 & 896) ^ 384) > 256 && interfaceC2425m.b(f11)) || (i10 & 384) == 256;
            Object objD = interfaceC2425m.D();
            if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                objD = AbstractC6906j.h(0.0f, 0.0f, Float.valueOf(f11), 3, null);
                interfaceC2425m.u(objD);
            }
            interfaceC6904i = (C6903h0) objD;
            interfaceC2425m.O();
        } else {
            interfaceC2425m.V(1125708605);
            interfaceC2425m.O();
        }
        InterfaceC6904i interfaceC6904i2 = interfaceC6904i;
        Float fValueOf = Float.valueOf(f10);
        s0 s0VarF = u0.f(C5498l.f52289a);
        Float fValueOf2 = Float.valueOf(f11);
        int i12 = i10 << 3;
        h2 h2VarE = e(fValueOf, s0VarF, interfaceC6904i2, fValueOf2, str2, function12, interfaceC2425m, (i10 & 14) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarE;
    }

    public static final h2 e(Object obj, s0 s0Var, InterfaceC6904i interfaceC6904i, Object obj2, String str, Function1 function1, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        InterfaceC6904i interfaceC6904iG;
        If.g gVar;
        if ((i11 & 4) != 0) {
            Object objD = interfaceC2425m.D();
            if (objD == InterfaceC2425m.f22370a.a()) {
                objD = AbstractC6906j.h(0.0f, 0.0f, null, 7, null);
                interfaceC2425m.u(objD);
            }
            interfaceC6904iG = (C6903h0) objD;
        } else {
            interfaceC6904iG = interfaceC6904i;
        }
        Object obj3 = (i11 & 8) != 0 ? null : obj2;
        String str2 = (i11 & 16) != 0 ? "ValueAnimation" : str;
        Function1 function12 = (i11 & 32) != 0 ? null : function1;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1994373980, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        Object objD2 = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD2 == aVar.a()) {
            objD2 = b2.e(null, null, 2, null);
            interfaceC2425m.u(objD2);
        }
        Y.C0 c02 = (Y.C0) objD2;
        Object objD3 = interfaceC2425m.D();
        if (objD3 == aVar.a()) {
            objD3 = new C6888a(obj, s0Var, obj3, str2);
            interfaceC2425m.u(objD3);
        }
        C6888a c6888a = (C6888a) objD3;
        h2 h2VarO = U1.o(function12, interfaceC2425m, (i10 >> 15) & 14);
        if (obj3 != null && (interfaceC6904iG instanceof C6903h0)) {
            C6903h0 c6903h0 = (C6903h0) interfaceC6904iG;
            if (!AbstractC5504s.c(c6903h0.h(), obj3)) {
                interfaceC6904iG = AbstractC6906j.g(c6903h0.f(), c6903h0.g(), obj3);
            }
        }
        h2 h2VarO2 = U1.o(interfaceC6904iG, interfaceC2425m, 0);
        Object objD4 = interfaceC2425m.D();
        if (objD4 == aVar.a()) {
            objD4 = If.j.b(-1, null, null, 6, null);
            interfaceC2425m.u(objD4);
        }
        If.g gVar2 = (If.g) objD4;
        boolean zF = ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.F(obj)) || (i10 & 6) == 4) | interfaceC2425m.F(gVar2);
        Object objD5 = interfaceC2425m.D();
        if (zF || objD5 == aVar.a()) {
            objD5 = new a(gVar2, obj);
            interfaceC2425m.u(objD5);
        }
        AbstractC2393b0.g((InterfaceC5082a) objD5, interfaceC2425m, 0);
        boolean zF2 = interfaceC2425m.F(gVar2) | interfaceC2425m.F(c6888a) | interfaceC2425m.U(h2VarO2) | interfaceC2425m.U(h2VarO);
        Object objD6 = interfaceC2425m.D();
        if (zF2 || objD6 == aVar.a()) {
            gVar = gVar2;
            Object bVar = new b(gVar, c6888a, h2VarO2, h2VarO, null);
            interfaceC2425m.u(bVar);
            objD6 = bVar;
        } else {
            gVar = gVar2;
        }
        AbstractC2393b0.e(gVar, (Function2) objD6, interfaceC2425m, 0);
        h2 h2VarG = (h2) c02.getValue();
        if (h2VarG == null) {
            h2VarG = c6888a.g();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarG;
    }

    public static final Function1 f(h2 h2Var) {
        return (Function1) h2Var.getValue();
    }

    public static final InterfaceC6904i g(h2 h2Var) {
        return (InterfaceC6904i) h2Var.getValue();
    }
}
