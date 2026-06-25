package af;

import Td.L;
import Ud.a0;
import af.InterfaceC2616b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.B0;
import qf.S;
import ye.EnumC7228f;
import ye.InterfaceC7227e;
import ye.InterfaceC7231i;
import ye.InterfaceC7235m;
import ye.l0;
import ye.t0;
import ze.EnumC7371e;
import ze.InterfaceC7369c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class n {

    /* JADX INFO: renamed from: a */
    public static final a f23986a;

    /* JADX INFO: renamed from: b */
    public static final n f23987b;

    /* JADX INFO: renamed from: c */
    public static final n f23988c;

    /* JADX INFO: renamed from: d */
    public static final n f23989d;

    /* JADX INFO: renamed from: e */
    public static final n f23990e;

    /* JADX INFO: renamed from: f */
    public static final n f23991f;

    /* JADX INFO: renamed from: g */
    public static final n f23992g;

    /* JADX INFO: renamed from: h */
    public static final n f23993h;

    /* JADX INFO: renamed from: i */
    public static final n f23994i;

    /* JADX INFO: renamed from: j */
    public static final n f23995j;

    /* JADX INFO: renamed from: k */
    public static final n f23996k;

    /* JADX INFO: renamed from: l */
    public static final n f23997l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: af.n$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class C0419a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f23998a;

            static {
                int[] iArr = new int[EnumC7228f.values().length];
                try {
                    iArr[EnumC7228f.f65097b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC7228f.f65098c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC7228f.f65099d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC7228f.f65102g.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC7228f.f65101f.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC7228f.f65100e.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f23998a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InterfaceC7231i classifier) {
            AbstractC5504s.h(classifier, "classifier");
            if (classifier instanceof l0) {
                return "typealias";
            }
            if (!(classifier instanceof InterfaceC7227e)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            InterfaceC7227e interfaceC7227e = (InterfaceC7227e) classifier;
            if (interfaceC7227e.c0()) {
                return "companion object";
            }
            switch (C0419a.f23998a[interfaceC7227e.h().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new Td.r();
            }
        }

        public final n b(Function1 changeOptions) {
            AbstractC5504s.h(changeOptions, "changeOptions");
            z zVar = new z();
            changeOptions.invoke(zVar);
            zVar.q0();
            return new u(zVar);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements b {

            /* JADX INFO: renamed from: a */
            public static final a f23999a = new a();

            private a() {
            }

            @Override // af.n.b
            public void a(t0 parameter, int i10, int i11, StringBuilder builder) {
                AbstractC5504s.h(parameter, "parameter");
                AbstractC5504s.h(builder, "builder");
            }

            @Override // af.n.b
            public void b(int i10, StringBuilder builder) {
                AbstractC5504s.h(builder, "builder");
                builder.append("(");
            }

            @Override // af.n.b
            public void c(t0 parameter, int i10, int i11, StringBuilder builder) {
                AbstractC5504s.h(parameter, "parameter");
                AbstractC5504s.h(builder, "builder");
                if (i10 != i11 - 1) {
                    builder.append(", ");
                }
            }

            @Override // af.n.b
            public void d(int i10, StringBuilder builder) {
                AbstractC5504s.h(builder, "builder");
                builder.append(")");
            }
        }

        void a(t0 t0Var, int i10, int i11, StringBuilder sb2);

        void b(int i10, StringBuilder sb2);

        void c(t0 t0Var, int i10, int i11, StringBuilder sb2);

        void d(int i10, StringBuilder sb2);
    }

    static {
        a aVar = new a(null);
        f23986a = aVar;
        f23987b = aVar.b(C2617c.f23975a);
        f23988c = aVar.b(C2619e.f23977a);
        f23989d = aVar.b(C2620f.f23978a);
        f23990e = aVar.b(C2621g.f23979a);
        f23991f = aVar.b(C2622h.f23980a);
        f23992g = aVar.b(C2623i.f23981a);
        f23993h = aVar.b(C2624j.f23982a);
        f23994i = aVar.b(C2625k.f23983a);
        f23995j = aVar.b(C2626l.f23984a);
        f23996k = aVar.b(m.f23985a);
        f23997l = aVar.b(C2618d.f23976a);
    }

    public static final L A(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.l(a0.d());
        return L.f17438a;
    }

    public static /* synthetic */ String O(n nVar, InterfaceC7369c interfaceC7369c, EnumC7371e enumC7371e, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i10 & 2) != 0) {
            enumC7371e = null;
        }
        return nVar.N(interfaceC7369c, enumC7371e);
    }

    public static final L q(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.b(false);
        withOptions.l(a0.d());
        return L.f17438a;
    }

    public static final L r(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.b(false);
        withOptions.l(a0.d());
        withOptions.d(true);
        return L.f17438a;
    }

    public static final L s(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.b(false);
        return L.f17438a;
    }

    public static final L t(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.l(a0.d());
        withOptions.g(InterfaceC2616b.C0418b.f23973a);
        withOptions.f(EnumC2611D.f23952b);
        return L.f17438a;
    }

    public static final L u(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.m(true);
        withOptions.g(InterfaceC2616b.a.f23972a);
        withOptions.l(v.f24014d);
        return L.f17438a;
    }

    public static final L v(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.l(v.f24013c);
        return L.f17438a;
    }

    public static final L w(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.l(v.f24014d);
        return L.f17438a;
    }

    public static final L x(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.o(EnumC2613F.f23962b);
        withOptions.l(v.f24014d);
        return L.f17438a;
    }

    public static final L y(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.b(false);
        withOptions.l(a0.d());
        withOptions.g(InterfaceC2616b.C0418b.f23973a);
        withOptions.p(true);
        withOptions.f(EnumC2611D.f23953c);
        withOptions.e(true);
        withOptions.n(true);
        withOptions.d(true);
        withOptions.a(true);
        return L.f17438a;
    }

    public static final L z(w withOptions) {
        AbstractC5504s.h(withOptions, "$this$withOptions");
        withOptions.g(InterfaceC2616b.C0418b.f23973a);
        withOptions.f(EnumC2611D.f23952b);
        return L.f17438a;
    }

    public abstract String M(InterfaceC7235m interfaceC7235m);

    public abstract String N(InterfaceC7369c interfaceC7369c, EnumC7371e enumC7371e);

    public abstract String P(String str, String str2, ve.i iVar);

    public abstract String Q(Xe.d dVar);

    public abstract String R(Xe.f fVar, boolean z10);

    public abstract String S(S s10);

    public abstract String T(B0 b02);

    public final n U(Function1 changeOptions) {
        AbstractC5504s.h(changeOptions, "changeOptions");
        AbstractC5504s.f(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        z zVarS = ((u) this).K0().s();
        changeOptions.invoke(zVarS);
        zVarS.q0();
        return new u(zVarS);
    }
}
