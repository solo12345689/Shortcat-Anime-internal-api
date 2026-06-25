package se;

import Ee.AbstractC1527f;
import Td.AbstractC2163n;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import he.AbstractC4945a;
import ie.InterfaceC5082a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC5505t;
import pe.C6029s;
import pe.InterfaceC6016f;
import pe.InterfaceC6023m;
import re.AbstractC6309b;
import se.a1;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class U0 implements InterfaceC5505t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f59425e = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(U0.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(U0.class, "arguments", "getArguments()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qf.S f59426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1.a f59427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a1.a f59428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1.a f59429d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59430a;

        static {
            int[] iArr = new int[qf.N0.values().length];
            try {
                iArr[qf.N0.f57999e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qf.N0.f58000f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qf.N0.f58001g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f59430a = iArr;
        }
    }

    public U0(qf.S type, InterfaceC5082a interfaceC5082a) {
        AbstractC5504s.h(type, "type");
        this.f59426a = type;
        a1.a aVarB = null;
        a1.a aVar = interfaceC5082a instanceof a1.a ? (a1.a) interfaceC5082a : null;
        if (aVar != null) {
            aVarB = aVar;
        } else if (interfaceC5082a != null) {
            aVarB = a1.b(interfaceC5082a);
        }
        this.f59427b = aVarB;
        this.f59428c = a1.b(new Q0(this));
        this.f59429d = a1.b(new R0(this, interfaceC5082a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o(U0 u02, InterfaceC5082a interfaceC5082a) {
        C6029s c6029sD;
        List listL0 = u02.f59426a.L0();
        if (listL0.isEmpty()) {
            return AbstractC2279u.m();
        }
        Lazy lazyA = AbstractC2163n.a(Td.q.f17462b, new S0(u02));
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listL0, 10));
        int i10 = 0;
        for (Object obj : listL0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            qf.B0 b02 = (qf.B0) obj;
            if (b02.a()) {
                c6029sD = C6029s.f56013c.c();
            } else {
                qf.S type = b02.getType();
                AbstractC5504s.g(type, "getType(...)");
                U0 u03 = new U0(type, interfaceC5082a == null ? null : new T0(u02, i10, lazyA));
                int i12 = a.f59430a[b02.b().ordinal()];
                if (i12 == 1) {
                    c6029sD = C6029s.f56013c.d(u03);
                } else if (i12 == 2) {
                    c6029sD = C6029s.f56013c.a(u03);
                } else {
                    if (i12 != 3) {
                        throw new Td.r();
                    }
                    c6029sD = C6029s.f56013c.b(u03);
                }
            }
            arrayList.add(c6029sD);
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q(U0 u02) {
        Type typeF = u02.f();
        AbstractC5504s.e(typeF);
        return AbstractC1527f.h(typeF);
    }

    private static final List r(Lazy lazy) {
        return (List) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type x(U0 u02, int i10, Lazy lazy) {
        Type typeF = u02.f();
        if (typeF instanceof Class) {
            Class cls = (Class) typeF;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            AbstractC5504s.e(componentType);
            return componentType;
        }
        if (typeF instanceof GenericArrayType) {
            if (i10 == 0) {
                Type genericComponentType = ((GenericArrayType) typeF).getGenericComponentType();
                AbstractC5504s.e(genericComponentType);
                return genericComponentType;
            }
            throw new Y0("Array type has been queried for a non-0th argument: " + u02);
        }
        if (!(typeF instanceof ParameterizedType)) {
            throw new Y0("Non-generic type has been queried for arguments: " + u02);
        }
        Type type = (Type) r(lazy).get(i10);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        AbstractC5504s.g(lowerBounds, "getLowerBounds(...)");
        Type type2 = (Type) AbstractC2273n.Y(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            AbstractC5504s.g(upperBounds, "getUpperBounds(...)");
            type2 = (Type) AbstractC2273n.X(upperBounds);
        }
        AbstractC5504s.e(type2);
        return type2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6016f y(U0 u02) {
        return u02.z(u02.f59426a);
    }

    private final InterfaceC6016f z(qf.S s10) {
        qf.S type;
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (!(interfaceC7230hP instanceof InterfaceC7227e)) {
            if (interfaceC7230hP instanceof ye.m0) {
                return new W0(null, (ye.m0) interfaceC7230hP);
            }
            if (!(interfaceC7230hP instanceof ye.l0)) {
                return null;
            }
            throw new Td.s("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class clsQ = j1.q((InterfaceC7227e) interfaceC7230hP);
        if (clsQ == null) {
            return null;
        }
        if (!clsQ.isArray()) {
            if (qf.J0.l(s10)) {
                return new C6475X(clsQ);
            }
            Class clsI = AbstractC1527f.i(clsQ);
            if (clsI != null) {
                clsQ = clsI;
            }
            return new C6475X(clsQ);
        }
        qf.B0 b02 = (qf.B0) AbstractC2279u.O0(s10.L0());
        if (b02 == null || (type = b02.getType()) == null) {
            return new C6475X(clsQ);
        }
        InterfaceC6016f interfaceC6016fZ = z(type);
        if (interfaceC6016fZ != null) {
            return new C6475X(j1.f(AbstractC4945a.b(AbstractC6309b.a(interfaceC6016fZ))));
        }
        throw new Y0("Cannot determine classifier for array element type: " + this);
    }

    public final qf.S A() {
        return this.f59426a;
    }

    @Override // pe.InterfaceC6027q
    public boolean b() {
        return this.f59426a.O0();
    }

    @Override // pe.InterfaceC6027q
    public InterfaceC6016f c() {
        return (InterfaceC6016f) this.f59428c.b(this, f59425e[0]);
    }

    @Override // pe.InterfaceC6027q
    public List e() {
        Object objB = this.f59429d.b(this, f59425e[1]);
        AbstractC5504s.g(objB, "getValue(...)");
        return (List) objB;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u02 = (U0) obj;
        return AbstractC5504s.c(this.f59426a, u02.f59426a) && AbstractC5504s.c(c(), u02.c()) && AbstractC5504s.c(e(), u02.e());
    }

    @Override // kotlin.jvm.internal.InterfaceC5505t
    public Type f() {
        a1.a aVar = this.f59427b;
        if (aVar != null) {
            return (Type) aVar.invoke();
        }
        return null;
    }

    @Override // pe.InterfaceC6012b
    public List getAnnotations() {
        return j1.e(this.f59426a);
    }

    public int hashCode() {
        int iHashCode = this.f59426a.hashCode() * 31;
        InterfaceC6016f interfaceC6016fC = c();
        return ((iHashCode + (interfaceC6016fC != null ? interfaceC6016fC.hashCode() : 0)) * 31) + e().hashCode();
    }

    public String toString() {
        return e1.f59490a.l(this.f59426a);
    }

    public /* synthetic */ U0(qf.S s10, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s10, (i10 & 2) != 0 ? null : interfaceC5082a);
    }
}
