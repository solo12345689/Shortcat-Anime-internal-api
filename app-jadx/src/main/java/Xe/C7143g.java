package xe;

import Be.C1116k;
import Ud.AbstractC2279u;
import Ud.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import ve.o;
import ye.E;
import ye.EnumC7228f;
import ye.H;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ye.h0;

/* JADX INFO: renamed from: xe.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7143g implements Ae.b {

    /* JADX INFO: renamed from: g */
    private static final Xe.f f64402g;

    /* JADX INFO: renamed from: h */
    private static final Xe.b f64403h;

    /* JADX INFO: renamed from: a */
    private final H f64404a;

    /* JADX INFO: renamed from: b */
    private final Function1 f64405b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6044i f64406c;

    /* JADX INFO: renamed from: e */
    static final /* synthetic */ InterfaceC6023m[] f64400e = {O.k(new F(C7143g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* JADX INFO: renamed from: d */
    public static final a f64399d = new a(null);

    /* JADX INFO: renamed from: f */
    private static final Xe.c f64401f = ve.o.f62147A;

    /* JADX INFO: renamed from: xe.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Xe.b a() {
            return C7143g.f64403h;
        }

        private a() {
        }
    }

    static {
        Xe.d dVar = o.a.f62237d;
        f64402g = dVar.j();
        f64403h = Xe.b.f21759d.c(dVar.m());
    }

    public C7143g(pf.n storageManager, H moduleDescriptor, Function1 computeContainingDeclaration) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(moduleDescriptor, "moduleDescriptor");
        AbstractC5504s.h(computeContainingDeclaration, "computeContainingDeclaration");
        this.f64404a = moduleDescriptor;
        this.f64405b = computeContainingDeclaration;
        this.f64406c = storageManager.c(new C7141e(this, storageManager));
    }

    public static final ve.c d(H module) {
        AbstractC5504s.h(module, "module");
        List listK0 = module.S(f64401f).k0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK0) {
            if (obj instanceof ve.c) {
                arrayList.add(obj);
            }
        }
        return (ve.c) AbstractC2279u.m0(arrayList);
    }

    public static final C1116k h(C7143g c7143g, pf.n nVar) {
        C1116k c1116k = new C1116k((InterfaceC7235m) c7143g.f64405b.invoke(c7143g.f64404a), f64402g, E.f65063e, EnumC7228f.f65098c, AbstractC2279u.e(c7143g.f64404a.n().i()), h0.f65112a, false, nVar);
        c1116k.K0(new C7137a(nVar, c1116k), a0.d(), null);
        return c1116k;
    }

    private final C1116k i() {
        return (C1116k) AbstractC6048m.a(this.f64406c, this, f64400e[0]);
    }

    @Override // Ae.b
    public InterfaceC7227e a(Xe.b classId) {
        AbstractC5504s.h(classId, "classId");
        if (AbstractC5504s.c(classId, f64403h)) {
            return i();
        }
        return null;
    }

    @Override // Ae.b
    public boolean b(Xe.c packageFqName, Xe.f name) {
        AbstractC5504s.h(packageFqName, "packageFqName");
        AbstractC5504s.h(name, "name");
        return AbstractC5504s.c(name, f64402g) && AbstractC5504s.c(packageFqName, f64401f);
    }

    @Override // Ae.b
    public Collection c(Xe.c packageFqName) {
        AbstractC5504s.h(packageFqName, "packageFqName");
        return AbstractC5504s.c(packageFqName, f64401f) ? a0.c(i()) : a0.d();
    }

    public /* synthetic */ C7143g(pf.n nVar, H h10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, h10, (i10 & 4) != 0 ? C7142f.f64398a : function1);
    }
}
