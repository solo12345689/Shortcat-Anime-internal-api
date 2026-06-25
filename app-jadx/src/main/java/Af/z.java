package af;

import Ud.a0;
import af.InterfaceC2616b;
import af.n;
import af.w;
import app.notifee.core.event.LogEvent;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import le.AbstractC5591b;
import le.C5590a;
import le.InterfaceC5593d;
import pe.InterfaceC6014d;
import pe.InterfaceC6023m;
import qf.S;
import ye.t0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class z implements w {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f24034Z = {O.e(new kotlin.jvm.internal.z(z.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "startFromName", "getStartFromName()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "debugMode", "getDebugMode()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, LogEvent.LEVEL_VERBOSE, "getVerbose()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "unitReturnType", "getUnitReturnType()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), O.e(new kotlin.jvm.internal.z(z.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), O.e(new kotlin.jvm.internal.z(z.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final InterfaceC5593d f24035A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final InterfaceC5593d f24036B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final InterfaceC5593d f24037C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final InterfaceC5593d f24038D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final InterfaceC5593d f24039E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final InterfaceC5593d f24040F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final InterfaceC5593d f24041G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final InterfaceC5593d f24042H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final InterfaceC5593d f24043I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final InterfaceC5593d f24044J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final InterfaceC5593d f24045K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final InterfaceC5593d f24046L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final InterfaceC5593d f24047M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final InterfaceC5593d f24048N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC5593d f24049O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final InterfaceC5593d f24050P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final InterfaceC5593d f24051Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final InterfaceC5593d f24052R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final InterfaceC5593d f24053S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final InterfaceC5593d f24054T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final InterfaceC5593d f24055U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final InterfaceC5593d f24056V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final InterfaceC5593d f24057W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final InterfaceC5593d f24058X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final InterfaceC5593d f24059Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5593d f24061b = r0(InterfaceC2616b.c.f23974a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5593d f24062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5593d f24063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5593d f24064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC5593d f24065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC5593d f24066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC5593d f24067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC5593d f24068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC5593d f24069j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC5593d f24070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC5593d f24071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC5593d f24072m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC5593d f24073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC5593d f24074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC5593d f24075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC5593d f24076q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC5593d f24077r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC5593d f24078s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC5593d f24079t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final InterfaceC5593d f24080u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final InterfaceC5593d f24081v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final InterfaceC5593d f24082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final InterfaceC5593d f24083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final InterfaceC5593d f24084y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final InterfaceC5593d f24085z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5591b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f24086b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, z zVar) {
            super(obj);
            this.f24086b = zVar;
        }

        @Override // le.AbstractC5591b
        protected boolean d(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            if (this.f24086b.p0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public z() {
        Boolean bool = Boolean.TRUE;
        this.f24062c = r0(bool);
        this.f24063d = r0(bool);
        this.f24064e = r0(v.f24013c);
        Boolean bool2 = Boolean.FALSE;
        this.f24065f = r0(bool2);
        this.f24066g = r0(bool2);
        this.f24067h = r0(bool2);
        this.f24068i = r0(bool2);
        this.f24069j = r0(bool2);
        this.f24070k = r0(bool);
        this.f24071l = r0(bool2);
        this.f24072m = r0(bool2);
        this.f24073n = r0(bool2);
        this.f24074o = r0(bool);
        this.f24075p = r0(bool);
        this.f24076q = r0(bool2);
        this.f24077r = r0(bool2);
        this.f24078s = r0(bool2);
        this.f24079t = r0(bool2);
        this.f24080u = r0(bool2);
        this.f24081v = r0(null);
        this.f24082w = r0(bool2);
        this.f24083x = r0(bool2);
        this.f24084y = r0(x.f24032a);
        this.f24085z = r0(y.f24033a);
        this.f24035A = r0(bool);
        this.f24036B = r0(EnumC2610C.f23947b);
        this.f24037C = r0(n.b.a.f23999a);
        this.f24038D = r0(EnumC2613F.f23961a);
        this.f24039E = r0(EnumC2611D.f23951a);
        this.f24040F = r0(bool2);
        this.f24041G = r0(bool2);
        this.f24042H = r0(EnumC2612E.f23957b);
        this.f24043I = r0(bool2);
        this.f24044J = r0(bool2);
        this.f24045K = r0(a0.d());
        this.f24046L = r0(C2608A.f23943a.a());
        this.f24047M = r0(null);
        this.f24048N = r0(EnumC2615a.f23965c);
        this.f24049O = r0(bool2);
        this.f24050P = r0(bool);
        this.f24051Q = r0(bool);
        this.f24052R = r0(bool2);
        this.f24053S = r0(bool2);
        this.f24054T = r0(bool);
        this.f24055U = r0(bool);
        this.f24056V = r0(bool2);
        this.f24057W = r0(bool2);
        this.f24058X = r0(bool2);
        this.f24059Y = r0(bool);
    }

    private final InterfaceC5593d r0(Object obj) {
        C5590a c5590a = C5590a.f52755a;
        return new a(obj, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S s0(S it) {
        AbstractC5504s.h(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(t0 it) {
        AbstractC5504s.h(it, "it");
        return "...";
    }

    public Function1 A() {
        return (Function1) this.f24085z.a(this, f24034Z[24]);
    }

    public boolean B() {
        return ((Boolean) this.f24044J.a(this, f24034Z[34])).booleanValue();
    }

    public Set C() {
        return (Set) this.f24045K.a(this, f24034Z[35]);
    }

    public boolean D() {
        return ((Boolean) this.f24054T.a(this, f24034Z[44])).booleanValue();
    }

    public boolean E() {
        return w.a.a(this);
    }

    public boolean F() {
        return w.a.b(this);
    }

    public boolean G() {
        return ((Boolean) this.f24080u.a(this, f24034Z[19])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.f24059Y.a(this, f24034Z[49])).booleanValue();
    }

    public Set I() {
        return (Set) this.f24064e.a(this, f24034Z[3]);
    }

    public boolean J() {
        return ((Boolean) this.f24073n.a(this, f24034Z[12])).booleanValue();
    }

    public EnumC2610C K() {
        return (EnumC2610C) this.f24036B.a(this, f24034Z[26]);
    }

    public EnumC2611D L() {
        return (EnumC2611D) this.f24039E.a(this, f24034Z[29]);
    }

    public boolean M() {
        return ((Boolean) this.f24055U.a(this, f24034Z[45])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.f24057W.a(this, f24034Z[47])).booleanValue();
    }

    public EnumC2612E O() {
        return (EnumC2612E) this.f24042H.a(this, f24034Z[32]);
    }

    public Function1 P() {
        return (Function1) this.f24081v.a(this, f24034Z[20]);
    }

    public boolean Q() {
        return ((Boolean) this.f24040F.a(this, f24034Z[30])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.f24053S.a(this, f24034Z[43])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f24041G.a(this, f24034Z[31])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f24076q.a(this, f24034Z[15])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f24050P.a(this, f24034Z[40])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f24043I.a(this, f24034Z[33])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f24075p.a(this, f24034Z[14])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f24074o.a(this, f24034Z[13])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f24077r.a(this, f24034Z[16])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f24052R.a(this, f24034Z[42])).booleanValue();
    }

    @Override // af.w
    public void a(boolean z10) {
        this.f24065f.b(this, f24034Z[4], Boolean.valueOf(z10));
    }

    public boolean a0() {
        return ((Boolean) this.f24051Q.a(this, f24034Z[41])).booleanValue();
    }

    @Override // af.w
    public void b(boolean z10) {
        this.f24062c.b(this, f24034Z[1], Boolean.valueOf(z10));
    }

    public boolean b0() {
        return ((Boolean) this.f24035A.a(this, f24034Z[25])).booleanValue();
    }

    @Override // af.w
    public boolean c() {
        return ((Boolean) this.f24072m.a(this, f24034Z[11])).booleanValue();
    }

    public boolean c0() {
        return ((Boolean) this.f24066g.a(this, f24034Z[5])).booleanValue();
    }

    @Override // af.w
    public void d(boolean z10) {
        this.f24083x.b(this, f24034Z[22], Boolean.valueOf(z10));
    }

    public boolean d0() {
        return ((Boolean) this.f24065f.a(this, f24034Z[4])).booleanValue();
    }

    @Override // af.w
    public void e(boolean z10) {
        this.f24040F.b(this, f24034Z[30], Boolean.valueOf(z10));
    }

    public EnumC2613F e0() {
        return (EnumC2613F) this.f24038D.a(this, f24034Z[28]);
    }

    @Override // af.w
    public void f(EnumC2611D enumC2611D) {
        AbstractC5504s.h(enumC2611D, "<set-?>");
        this.f24039E.b(this, f24034Z[29], enumC2611D);
    }

    public Function1 f0() {
        return (Function1) this.f24084y.a(this, f24034Z[23]);
    }

    @Override // af.w
    public void g(InterfaceC2616b interfaceC2616b) {
        AbstractC5504s.h(interfaceC2616b, "<set-?>");
        this.f24061b.b(this, f24034Z[0], interfaceC2616b);
    }

    public boolean g0() {
        return ((Boolean) this.f24079t.a(this, f24034Z[18])).booleanValue();
    }

    @Override // af.w
    public Set h() {
        return (Set) this.f24046L.a(this, f24034Z[36]);
    }

    public boolean h0() {
        return ((Boolean) this.f24070k.a(this, f24034Z[9])).booleanValue();
    }

    @Override // af.w
    public boolean i() {
        return ((Boolean) this.f24067h.a(this, f24034Z[6])).booleanValue();
    }

    public n.b i0() {
        return (n.b) this.f24037C.a(this, f24034Z[27]);
    }

    @Override // af.w
    public EnumC2615a j() {
        return (EnumC2615a) this.f24048N.a(this, f24034Z[38]);
    }

    public boolean j0() {
        return ((Boolean) this.f24069j.a(this, f24034Z[8])).booleanValue();
    }

    @Override // af.w
    public void k(Set set) {
        AbstractC5504s.h(set, "<set-?>");
        this.f24046L.b(this, f24034Z[36], set);
    }

    public boolean k0() {
        return ((Boolean) this.f24062c.a(this, f24034Z[1])).booleanValue();
    }

    @Override // af.w
    public void l(Set set) {
        AbstractC5504s.h(set, "<set-?>");
        this.f24064e.b(this, f24034Z[3], set);
    }

    public boolean l0() {
        return ((Boolean) this.f24063d.a(this, f24034Z[2])).booleanValue();
    }

    @Override // af.w
    public void m(boolean z10) {
        this.f24067h.b(this, f24034Z[6], Boolean.valueOf(z10));
    }

    public boolean m0() {
        return ((Boolean) this.f24071l.a(this, f24034Z[10])).booleanValue();
    }

    @Override // af.w
    public void n(boolean z10) {
        this.f24041G.b(this, f24034Z[31], Boolean.valueOf(z10));
    }

    public boolean n0() {
        return ((Boolean) this.f24083x.a(this, f24034Z[22])).booleanValue();
    }

    @Override // af.w
    public void o(EnumC2613F enumC2613F) {
        AbstractC5504s.h(enumC2613F, "<set-?>");
        this.f24038D.b(this, f24034Z[28], enumC2613F);
    }

    public boolean o0() {
        return ((Boolean) this.f24082w.a(this, f24034Z[21])).booleanValue();
    }

    @Override // af.w
    public void p(boolean z10) {
        this.f24082w.b(this, f24034Z[21], Boolean.valueOf(z10));
    }

    public final boolean p0() {
        return this.f24060a;
    }

    public final void q0() {
        this.f24060a = true;
    }

    public final z s() {
        z zVar = new z();
        Iterator itA = AbstractC5489c.a(z.class.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                AbstractC5591b abstractC5591b = obj instanceof AbstractC5591b ? (AbstractC5591b) obj : null;
                if (abstractC5591b != null) {
                    String name = field.getName();
                    AbstractC5504s.g(name, "getName(...)");
                    Df.r.Q(name, "is", false, 2, null);
                    InterfaceC6014d interfaceC6014dB = O.b(z.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(com.amazon.a.a.o.b.au);
                    String name3 = field.getName();
                    AbstractC5504s.g(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        AbstractC5504s.g(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(zVar, zVar.r0(abstractC5591b.a(this, new kotlin.jvm.internal.F(interfaceC6014dB, name2, sb2.toString()))));
                }
            }
        }
        return zVar;
    }

    public boolean u() {
        return ((Boolean) this.f24078s.a(this, f24034Z[17])).booleanValue();
    }

    public boolean v() {
        return ((Boolean) this.f24049O.a(this, f24034Z[39])).booleanValue();
    }

    public Function1 w() {
        return (Function1) this.f24047M.a(this, f24034Z[37]);
    }

    public boolean x() {
        return ((Boolean) this.f24058X.a(this, f24034Z[48])).booleanValue();
    }

    public boolean y() {
        return ((Boolean) this.f24068i.a(this, f24034Z[7])).booleanValue();
    }

    public InterfaceC2616b z() {
        return (InterfaceC2616b) this.f24061b.a(this, f24034Z[0]);
    }
}
