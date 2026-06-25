package U;

import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import i1.C5015h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f17612a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f17613b = C5015h.n(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f17614c = C5015h.n(280);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f17615d = C5015h.n(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f17616e = C5015h.n(2);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f17618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f17619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ B.k f17620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f17621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f17622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ E1 f17623g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f17624h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f17625i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f17626j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f17627k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, boolean z11, B.k kVar, androidx.compose.ui.e eVar, f0 f0Var, E1 e12, float f10, float f11, int i10, int i11) {
            super(2);
            this.f17618b = z10;
            this.f17619c = z11;
            this.f17620d = kVar;
            this.f17621e = eVar;
            this.f17622f = f0Var;
            this.f17623g = e12;
            this.f17624h = f10;
            this.f17625i = f11;
            this.f17626j = i10;
            this.f17627k = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            G.this.a(this.f17618b, this.f17619c, this.f17620d, this.f17621e, this.f17622f, this.f17623g, this.f17624h, this.f17625i, interfaceC2425m, AbstractC2409g1.a(this.f17626j | 1), this.f17627k);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f17628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f17629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ B.k f17630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f17631d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, boolean z11, B.k kVar, f0 f0Var) {
            super(2);
            this.f17628a = z10;
            this.f17629b = z11;
            this.f17630c = kVar;
            this.f17631d = f0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1448570018, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:873)");
            }
            G g10 = G.f17612a;
            g10.a(this.f17628a, this.f17629b, this.f17630c, androidx.compose.ui.e.f26613a, this.f17631d, g10.j(interfaceC2425m, 6), g10.g(), g10.k(), interfaceC2425m, 114822144, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f17634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f17635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f17636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a1.f0 f17637f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ B.k f17638g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f17639h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2 f17640i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2 f17641j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2 f17642k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2 f17643l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2 f17644m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f17645n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2 f17646o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f0 f17647p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ C.A f17648q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function2 f17649r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f17650s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f17651t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f17652u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Function2 function2, boolean z10, boolean z11, a1.f0 f0Var, B.k kVar, boolean z12, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, f0 f0Var2, C.A a10, Function2 function29, int i10, int i11, int i12) {
            super(2);
            this.f17633b = str;
            this.f17634c = function2;
            this.f17635d = z10;
            this.f17636e = z11;
            this.f17637f = f0Var;
            this.f17638g = kVar;
            this.f17639h = z12;
            this.f17640i = function22;
            this.f17641j = function23;
            this.f17642k = function24;
            this.f17643l = function25;
            this.f17644m = function26;
            this.f17645n = function27;
            this.f17646o = function28;
            this.f17647p = f0Var2;
            this.f17648q = a10;
            this.f17649r = function29;
            this.f17650s = i10;
            this.f17651t = i11;
            this.f17652u = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            G.this.b(this.f17633b, this.f17634c, this.f17635d, this.f17636e, this.f17637f, this.f17638g, this.f17639h, this.f17640i, this.f17641j, this.f17642k, this.f17643l, this.f17644m, this.f17645n, this.f17646o, this.f17647p, this.f17648q, this.f17649r, interfaceC2425m, AbstractC2409g1.a(this.f17650s | 1), AbstractC2409g1.a(this.f17651t), this.f17652u);
        }
    }

    private G() {
    }

    public static /* synthetic */ C.A e(G g10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = W.j.r();
        }
        if ((i10 & 2) != 0) {
            f11 = W.j.r();
        }
        if ((i10 & 4) != 0) {
            f12 = W.j.r();
        }
        if ((i10 & 8) != 0) {
            f13 = W.j.r();
        }
        return g10.d(f10, f11, f12, f13);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r21, boolean r22, B.k r23, androidx.compose.ui.e r24, U.f0 r25, s0.E1 r26, float r27, float r28, Y.InterfaceC2425m r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U.G.a(boolean, boolean, B.k, androidx.compose.ui.e, U.f0, s0.E1, float, float, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r37, kotlin.jvm.functions.Function2 r38, boolean r39, boolean r40, a1.f0 r41, B.k r42, boolean r43, kotlin.jvm.functions.Function2 r44, kotlin.jvm.functions.Function2 r45, kotlin.jvm.functions.Function2 r46, kotlin.jvm.functions.Function2 r47, kotlin.jvm.functions.Function2 r48, kotlin.jvm.functions.Function2 r49, kotlin.jvm.functions.Function2 r50, U.f0 r51, C.A r52, kotlin.jvm.functions.Function2 r53, Y.InterfaceC2425m r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instruction units count: 1051
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U.G.b(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, a1.f0, B.k, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, U.f0, C.A, kotlin.jvm.functions.Function2, Y.m, int, int, int):void");
    }

    public final f0 c(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-471651810, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:921)");
        }
        f0 f0VarF = f(D.f17597a.a(interfaceC2425m, 6), interfaceC2425m, (i10 << 3) & 112);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return f0VarF;
    }

    public final C.A d(float f10, float f11, float f12, float f13) {
        return androidx.compose.foundation.layout.p.d(f10, f11, f12, f13);
    }

    public final f0 f(C2175l c2175l, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-292363577, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1071)");
        }
        f0 f0VarH = c2175l.h();
        interfaceC2425m.V(1540400102);
        if (f0VarH == null) {
            X.i iVar = X.i.f21222a;
            long jF = AbstractC2176m.f(c2175l, iVar.p());
            long jF2 = AbstractC2176m.f(c2175l, iVar.v());
            long jQ = C6385r0.q(AbstractC2176m.f(c2175l, iVar.c()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jF3 = AbstractC2176m.f(c2175l, iVar.j());
            C6385r0.a aVar = C6385r0.f58985b;
            f0 f0Var = new f0(jF, jF2, jQ, jF3, aVar.i(), aVar.i(), aVar.i(), aVar.i(), AbstractC2176m.f(c2175l, iVar.a()), AbstractC2176m.f(c2175l, iVar.i()), (Q.J) interfaceC2425m.n(Q.K.b()), AbstractC2176m.f(c2175l, iVar.s()), AbstractC2176m.f(c2175l, iVar.B()), C6385r0.q(AbstractC2176m.f(c2175l, iVar.f()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC2176m.f(c2175l, iVar.m()), AbstractC2176m.f(c2175l, iVar.r()), AbstractC2176m.f(c2175l, iVar.A()), C6385r0.q(AbstractC2176m.f(c2175l, iVar.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC2176m.f(c2175l, iVar.l()), AbstractC2176m.f(c2175l, iVar.u()), AbstractC2176m.f(c2175l, iVar.D()), C6385r0.q(AbstractC2176m.f(c2175l, iVar.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC2176m.f(c2175l, iVar.o()), AbstractC2176m.f(c2175l, iVar.q()), AbstractC2176m.f(c2175l, iVar.z()), C6385r0.q(AbstractC2176m.f(c2175l, iVar.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC2176m.f(c2175l, iVar.k()), AbstractC2176m.f(c2175l, iVar.w()), AbstractC2176m.f(c2175l, iVar.w()), C6385r0.q(AbstractC2176m.f(c2175l, iVar.c()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC2176m.f(c2175l, iVar.w()), AbstractC2176m.f(c2175l, iVar.t()), AbstractC2176m.f(c2175l, iVar.C()), C6385r0.q(AbstractC2176m.f(c2175l, iVar.g()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC2176m.f(c2175l, iVar.n()), AbstractC2176m.f(c2175l, iVar.x()), AbstractC2176m.f(c2175l, iVar.x()), C6385r0.q(AbstractC2176m.f(c2175l, iVar.x()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC2176m.f(c2175l, iVar.x()), AbstractC2176m.f(c2175l, iVar.y()), AbstractC2176m.f(c2175l, iVar.y()), C6385r0.q(AbstractC2176m.f(c2175l, iVar.y()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC2176m.f(c2175l, iVar.y()), null);
            c2175l.X(f0Var);
            f0VarH = f0Var;
        }
        interfaceC2425m.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return f0VarH;
    }

    public final float g() {
        return f17616e;
    }

    public final float h() {
        return f17613b;
    }

    public final float i() {
        return f17614c;
    }

    public final E1 j(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1066756961, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:729)");
        }
        E1 e1D = V.d(X.i.f21222a.b(), interfaceC2425m, 6);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return e1D;
    }

    public final float k() {
        return f17615d;
    }
}
