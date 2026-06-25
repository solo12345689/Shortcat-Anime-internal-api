package U;

import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import Y.h2;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.C5009b;
import i1.C5015h;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import r0.AbstractC6225g;
import r0.AbstractC6231m;
import r0.C6230l;
import s0.G1;
import u0.C6716k;
import u0.InterfaceC6711f;
import w.C6919x;
import w.S;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a */
    private static final float f17776a;

    /* JADX INFO: renamed from: b */
    private static final androidx.compose.ui.e f17777b;

    /* JADX INFO: renamed from: c */
    private static final float f17778c;

    /* JADX INFO: renamed from: d */
    private static final float f17779d;

    /* JADX INFO: renamed from: e */
    private static final float f17780e;

    /* JADX INFO: renamed from: f */
    private static final C6919x f17781f;

    /* JADX INFO: renamed from: g */
    private static final C6919x f17782g;

    /* JADX INFO: renamed from: h */
    private static final C6919x f17783h;

    /* JADX INFO: renamed from: i */
    private static final C6919x f17784i;

    /* JADX INFO: renamed from: j */
    private static final C6919x f17785j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f17786a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C6716k f17787b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ h2 f17788c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ h2 f17789d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ h2 f17790e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ h2 f17791f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ float f17792g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ long f17793h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, C6716k c6716k, h2 h2Var, h2 h2Var2, h2 h2Var3, h2 h2Var4, float f10, long j11) {
            super(1);
            this.f17786a = j10;
            this.f17787b = c6716k;
            this.f17788c = h2Var;
            this.f17789d = h2Var2;
            this.f17790e = h2Var3;
            this.f17791f = h2Var4;
            this.f17792g = f10;
            this.f17793h = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6711f) obj);
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC6711f interfaceC6711f) {
            K.g(interfaceC6711f, this.f17786a, this.f17787b);
            K.h(interfaceC6711f, ((Number) this.f17790e.getValue()).floatValue() + (((((Number) this.f17788c.getValue()).floatValue() * 216.0f) % 360.0f) - 90.0f) + ((Number) this.f17791f.getValue()).floatValue(), this.f17792g, Math.abs(((Number) this.f17789d.getValue()).floatValue() - ((Number) this.f17790e.getValue()).floatValue()), this.f17793h, this.f17787b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f17794a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f17795b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f17796c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f17797d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f17798e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f17799f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f17800g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, long j10, float f10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f17794a = eVar;
            this.f17795b = j10;
            this.f17796c = f10;
            this.f17797d = j11;
            this.f17798e = i10;
            this.f17799f = i11;
            this.f17800g = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            K.a(this.f17794a, this.f17795b, this.f17796c, this.f17797d, this.f17798e, interfaceC2425m, AbstractC2409g1.a(this.f17799f | 1), this.f17800g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final c f17801a = new c();

        c() {
            super(1);
        }

        public final void a(S.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 0), K.f17785j);
            bVar.f(Float.valueOf(290.0f), 666);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((S.b) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final d f17802a = new d();

        d() {
            super(1);
        }

        public final void a(S.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 666), K.f17785j);
            bVar.f(Float.valueOf(290.0f), bVar.b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((S.b) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        public static final e f17803a = new e();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ androidx.compose.ui.layout.s f17804a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f17805b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.s sVar, int i10) {
                super(1);
                this.f17804a = sVar;
                this.f17805b = i10;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return Td.L.f17438a;
            }

            public final void invoke(s.a aVar) {
                s.a.N(aVar, this.f17804a, 0, -this.f17805b, 0.0f, 4, null);
            }
        }

        e() {
            super(3);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m42invoke3p2s80s((androidx.compose.ui.layout.l) obj, (I0.A) obj2, ((C5009b) obj3).r());
        }

        /* JADX INFO: renamed from: invoke-3p2s80s */
        public final I0.C m42invoke3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
            int iS0 = lVar.s0(K.f17776a);
            int i10 = iS0 * 2;
            androidx.compose.ui.layout.s sVarV0 = a10.v0(AbstractC5010c.j(j10, 0, i10));
            return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), sVarV0.P0() - i10, null, new a(sVarV0, iS0), 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final f f17806a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((R0.C) obj);
            return Td.L.f17438a;
        }

        public final void invoke(R0.C c10) {
        }
    }

    static {
        float fN = C5015h.n(10);
        f17776a = fN;
        f17777b = androidx.compose.foundation.layout.p.k(R0.r.e(androidx.compose.ui.layout.i.a(androidx.compose.ui.e.f26613a, e.f17803a), true, f.f17806a), 0.0f, fN, 1, null);
        f17778c = C5015h.n(240);
        X.k kVar = X.k.f21347a;
        f17779d = kVar.e();
        f17780e = C5015h.n(kVar.c() - C5015h.n(kVar.e() * 2));
        f17781f = new C6919x(0.2f, 0.0f, 0.8f, 1.0f);
        f17782g = new C6919x(0.4f, 0.0f, 1.0f, 1.0f);
        f17783h = new C6919x(0.0f, 0.0f, 0.65f, 1.0f);
        f17784i = new C6919x(0.1f, 0.0f, 0.45f, 1.0f);
        f17785j = new C6919x(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r32, long r33, float r35, long r36, int r38, Y.InterfaceC2425m r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U.K.a(androidx.compose.ui.e, long, float, long, int, Y.m, int, int):void");
    }

    private static final void f(InterfaceC6711f interfaceC6711f, float f10, float f11, long j10, C6716k c6716k) {
        float f12 = 2;
        float f13 = c6716k.f() / f12;
        float fI = C6230l.i(interfaceC6711f.f()) - (f12 * f13);
        InterfaceC6711f.b0(interfaceC6711f, j10, f10, f11, false, AbstractC6225g.a(f13, f13), AbstractC6231m.a(fI, fI), 0.0f, c6716k, null, 0, 832, null);
    }

    public static final void g(InterfaceC6711f interfaceC6711f, long j10, C6716k c6716k) {
        f(interfaceC6711f, 0.0f, 360.0f, j10, c6716k);
    }

    public static final void h(InterfaceC6711f interfaceC6711f, float f10, float f11, float f12, long j10, C6716k c6716k) {
        f(interfaceC6711f, f10 + (G1.e(c6716k.b(), G1.f58877a.a()) ? 0.0f : ((f11 / C5015h.n(f17780e / 2)) * 57.29578f) / 2.0f), Math.max(f12, 0.1f), j10, c6716k);
    }
}
