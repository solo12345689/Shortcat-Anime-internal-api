package ve;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import pe.InterfaceC6023m;
import qf.C6197k0;
import qf.S;
import qf.V;
import qf.r0;
import ve.o;
import ye.AbstractC7246y;
import ye.H;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.M;
import ye.m0;
import yf.AbstractC7248a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M f62136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f62137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f62138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f62139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f62140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f62141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f62142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f62143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f62144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f62145j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f62135l = {O.k(new F(n.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), O.k(new F(n.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), O.k(new F(n.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), O.k(new F(n.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), O.k(new F(n.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), O.k(new F(n.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), O.k(new F(n.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), O.k(new F(n.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f62134k = new b(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62146a;

        public a(int i10) {
            this.f62146a = i10;
        }

        public final InterfaceC7227e a(n types, InterfaceC6023m property) {
            AbstractC5504s.h(types, "types");
            AbstractC5504s.h(property, "property");
            return types.c(AbstractC7248a.a(property.getName()), this.f62146a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final S a(H module) {
            AbstractC5504s.h(module, "module");
            InterfaceC7227e interfaceC7227eB = AbstractC7246y.b(module, o.a.f62276w0);
            if (interfaceC7227eB == null) {
                return null;
            }
            r0 r0VarK = r0.f58089b.k();
            List parameters = interfaceC7227eB.l().getParameters();
            AbstractC5504s.g(parameters, "getParameters(...)");
            Object objM0 = AbstractC2279u.M0(parameters);
            AbstractC5504s.g(objM0, "single(...)");
            return V.h(r0VarK, interfaceC7227eB, AbstractC2279u.e(new C6197k0((m0) objM0)));
        }

        private b() {
        }
    }

    public n(H module, M notFoundClasses) {
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(notFoundClasses, "notFoundClasses");
        this.f62136a = notFoundClasses;
        this.f62137b = AbstractC2163n.a(Td.q.f17462b, new m(module));
        this.f62138c = new a(1);
        this.f62139d = new a(1);
        this.f62140e = new a(1);
        this.f62141f = new a(2);
        this.f62142g = new a(3);
        this.f62143h = new a(1);
        this.f62144i = new a(2);
        this.f62145j = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7227e c(String str, int i10) {
        Xe.f fVarM = Xe.f.m(str);
        AbstractC5504s.g(fVarM, "identifier(...)");
        InterfaceC7230h interfaceC7230hE = e().e(fVarM, Ge.d.f7462h);
        InterfaceC7227e interfaceC7227e = interfaceC7230hE instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hE : null;
        return interfaceC7227e == null ? this.f62136a.d(new Xe.b(o.f62180x, fVarM), AbstractC2279u.e(Integer.valueOf(i10))) : interfaceC7227e;
    }

    private final InterfaceC5387k e() {
        return (InterfaceC5387k) this.f62137b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5387k f(H h10) {
        return h10.S(o.f62180x).o();
    }

    public final InterfaceC7227e d() {
        return this.f62138c.a(this, f62135l[0]);
    }
}
