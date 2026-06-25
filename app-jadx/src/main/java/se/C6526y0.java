package se;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import he.C4946b;
import ie.InterfaceC5082a;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import oe.C5870f;
import pe.InterfaceC6022l;
import pe.InterfaceC6023m;
import pe.InterfaceC6027q;
import se.a1;
import te.n;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;

/* JADX INFO: renamed from: se.y0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6526y0 implements InterfaceC6022l {

    /* JADX INFO: renamed from: f */
    static final /* synthetic */ InterfaceC6023m[] f59583f = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(C6526y0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(C6526y0.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a */
    private final AbstractC6453A f59584a;

    /* JADX INFO: renamed from: b */
    private final int f59585b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6022l.a f59586c;

    /* JADX INFO: renamed from: d */
    private final a1.a f59587d;

    /* JADX INFO: renamed from: e */
    private final a1.a f59588e;

    /* JADX INFO: renamed from: se.y0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Type {

        /* JADX INFO: renamed from: a */
        private final Type[] f59589a;

        /* JADX INFO: renamed from: b */
        private final int f59590b;

        public a(Type[] types) {
            AbstractC5504s.h(types, "types");
            this.f59589a = types;
            this.f59590b = Arrays.hashCode(types);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Arrays.equals(this.f59589a, ((a) obj).f59589a);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return AbstractC2273n.y0(this.f59589a, ", ", "[", "]", 0, null, null, 56, null);
        }

        public int hashCode() {
            return this.f59590b;
        }

        public String toString() {
            return getTypeName();
        }
    }

    public C6526y0(AbstractC6453A callable, int i10, InterfaceC6022l.a kind, InterfaceC5082a computeDescriptor) {
        AbstractC5504s.h(callable, "callable");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(computeDescriptor, "computeDescriptor");
        this.f59584a = callable;
        this.f59585b = i10;
        this.f59586c = kind;
        this.f59587d = a1.b(computeDescriptor);
        this.f59588e = a1.b(new C6522w0(this));
    }

    public static final Type j(C6526y0 c6526y0) {
        List listP0;
        ye.W wR = c6526y0.r();
        if ((wR instanceof ye.c0) && AbstractC5504s.c(j1.i(c6526y0.f59584a.b0()), wR) && c6526y0.f59584a.b0().h() == InterfaceC7224b.a.FAKE_OVERRIDE) {
            InterfaceC7235m interfaceC7235mB = c6526y0.f59584a.b0().b();
            AbstractC5504s.f(interfaceC7235mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class clsQ = j1.q((InterfaceC7227e) interfaceC7235mB);
            if (clsQ != null) {
                return clsQ;
            }
            throw new Y0("Cannot determine receiver Java type of inherited declaration: " + wR);
        }
        te.h hVarT = c6526y0.f59584a.T();
        if (!(hVarT instanceof te.n)) {
            if (!(hVarT instanceof n.b)) {
                return (Type) hVarT.a().get(c6526y0.getIndex());
            }
            Class[] clsArr = (Class[]) ((Collection) ((n.b) hVarT).e().get(c6526y0.getIndex())).toArray(new Class[0]);
            return c6526y0.o((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (c6526y0.f59584a.Z()) {
            te.n nVar = (te.n) hVarT;
            C5870f c5870fF = nVar.f(c6526y0.getIndex() + 1);
            int i10 = nVar.f(0).i() + 1;
            listP0 = AbstractC2279u.P0(nVar.a(), new C5870f(c5870fF.f() - i10, c5870fF.i() - i10));
        } else {
            te.n nVar2 = (te.n) hVarT;
            listP0 = AbstractC2279u.P0(nVar2.a(), nVar2.f(c6526y0.getIndex()));
        }
        Type[] typeArr = (Type[]) listP0.toArray(new Type[0]);
        return c6526y0.o((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    public static final List n(C6526y0 c6526y0) {
        return j1.e(c6526y0.r());
    }

    private final Type o(Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) AbstractC2273n.H0(typeArr);
        }
        throw new C4946b("Expected at least 1 type for compound type");
    }

    private final ye.W r() {
        Object objB = this.f59587d.b(this, f59583f[0]);
        AbstractC5504s.g(objB, "getValue(...)");
        return (ye.W) objB;
    }

    @Override // pe.InterfaceC6022l
    public boolean a() {
        ye.W wR = r();
        return (wR instanceof ye.t0) && ((ye.t0) wR).v0() != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6526y0)) {
            return false;
        }
        C6526y0 c6526y0 = (C6526y0) obj;
        return AbstractC5504s.c(this.f59584a, c6526y0.f59584a) && getIndex() == c6526y0.getIndex();
    }

    @Override // pe.InterfaceC6012b
    public List getAnnotations() {
        Object objB = this.f59588e.b(this, f59583f[1]);
        AbstractC5504s.g(objB, "getValue(...)");
        return (List) objB;
    }

    @Override // pe.InterfaceC6022l
    public int getIndex() {
        return this.f59585b;
    }

    @Override // pe.InterfaceC6022l
    public String getName() {
        ye.W wR = r();
        ye.t0 t0Var = wR instanceof ye.t0 ? (ye.t0) wR : null;
        if (t0Var == null || t0Var.b().i0()) {
            return null;
        }
        Xe.f name = t0Var.getName();
        AbstractC5504s.g(name, "getName(...)");
        if (name.n()) {
            return null;
        }
        return name.b();
    }

    @Override // pe.InterfaceC6022l
    public InterfaceC6027q getType() {
        qf.S type = r().getType();
        AbstractC5504s.g(type, "getType(...)");
        return new U0(type, new C6524x0(this));
    }

    @Override // pe.InterfaceC6022l
    public InterfaceC6022l.a h() {
        return this.f59586c;
    }

    public int hashCode() {
        return (this.f59584a.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    @Override // pe.InterfaceC6022l
    public boolean p() {
        ye.W wR = r();
        ye.t0 t0Var = wR instanceof ye.t0 ? (ye.t0) wR : null;
        if (t0Var != null) {
            return ff.e.f(t0Var);
        }
        return false;
    }

    public final AbstractC6453A q() {
        return this.f59584a;
    }

    public String toString() {
        return e1.f59490a.j(this);
    }
}
