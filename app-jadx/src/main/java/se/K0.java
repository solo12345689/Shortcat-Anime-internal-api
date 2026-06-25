package se;

import He.AbstractC1668o;
import Td.AbstractC2163n;
import Ve.a;
import We.d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5492f;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6018h;
import pe.InterfaceC6019i;
import pe.InterfaceC6023m;
import qe.C6172b;
import re.AbstractC6308a;
import se.AbstractC6507p;
import se.a1;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class K0 extends AbstractC6453A implements InterfaceC6023m {

    /* JADX INFO: renamed from: m */
    public static final b f59386m = new b(null);

    /* JADX INFO: renamed from: n */
    private static final Object f59387n = new Object();

    /* JADX INFO: renamed from: g */
    private final AbstractC6484d0 f59388g;

    /* JADX INFO: renamed from: h */
    private final String f59389h;

    /* JADX INFO: renamed from: i */
    private final String f59390i;

    /* JADX INFO: renamed from: j */
    private final Object f59391j;

    /* JADX INFO: renamed from: k */
    private final Lazy f59392k;

    /* JADX INFO: renamed from: l */
    private final a1.a f59393l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends AbstractC6453A implements InterfaceC6018h, InterfaceC6023m.a {
        @Override // se.AbstractC6453A
        public AbstractC6484d0 U() {
            return j().U();
        }

        @Override // se.AbstractC6453A
        public te.h V() {
            return null;
        }

        @Override // se.AbstractC6453A
        public boolean Z() {
            return j().Z();
        }

        public abstract ye.Y b0();

        /* JADX INFO: renamed from: c0 */
        public abstract K0 j();

        @Override // pe.InterfaceC6018h
        public boolean isExternal() {
            return b0().isExternal();
        }

        @Override // pe.InterfaceC6018h
        public boolean isInfix() {
            return b0().isInfix();
        }

        @Override // pe.InterfaceC6018h
        public boolean isInline() {
            return b0().isInline();
        }

        @Override // pe.InterfaceC6018h
        public boolean isOperator() {
            return b0().isOperator();
        }

        @Override // pe.InterfaceC6013c, pe.InterfaceC6018h
        public boolean isSuspend() {
            return b0().isSuspend();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c extends a implements InterfaceC6023m.b {

        /* JADX INFO: renamed from: i */
        static final /* synthetic */ InterfaceC6023m[] f59394i = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(c.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

        /* JADX INFO: renamed from: g */
        private final a1.a f59395g = a1.b(new L0(this));

        /* JADX INFO: renamed from: h */
        private final Lazy f59396h = AbstractC2163n.a(Td.q.f17462b, new M0(this));

        public static final te.h f0(c cVar) {
            return P0.b(cVar, true);
        }

        public static final ye.a0 g0(c cVar) {
            ye.a0 a0VarD = cVar.j().b0().d();
            if (a0VarD != null) {
                return a0VarD;
            }
            Be.L lD = bf.h.d(cVar.j().b0(), InterfaceC7374h.f66223k0.b());
            AbstractC5504s.g(lD, "createDefaultGetter(...)");
            return lD;
        }

        @Override // se.AbstractC6453A
        public te.h T() {
            return (te.h) this.f59396h.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && AbstractC5504s.c(j(), ((c) obj).j());
        }

        @Override // pe.InterfaceC6013c
        public String getName() {
            return "<get-" + j().getName() + '>';
        }

        @Override // se.K0.a
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public ye.a0 b0() {
            Object objB = this.f59395g.b(this, f59394i[0]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (ye.a0) objB;
        }

        public int hashCode() {
            return j().hashCode();
        }

        public String toString() {
            return "getter of " + j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class d extends a implements InterfaceC6019i.a {

        /* JADX INFO: renamed from: i */
        static final /* synthetic */ InterfaceC6023m[] f59397i = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(d.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

        /* JADX INFO: renamed from: g */
        private final a1.a f59398g = a1.b(new N0(this));

        /* JADX INFO: renamed from: h */
        private final Lazy f59399h = AbstractC2163n.a(Td.q.f17462b, new O0(this));

        public static final te.h f0(d dVar) {
            return P0.b(dVar, false);
        }

        public static final ye.b0 g0(d dVar) {
            ye.b0 b0VarG = dVar.j().b0().g();
            if (b0VarG != null) {
                return b0VarG;
            }
            ye.Z zB0 = dVar.j().b0();
            InterfaceC7374h.a aVar = InterfaceC7374h.f66223k0;
            Be.M mE = bf.h.e(zB0, aVar.b(), aVar.b());
            AbstractC5504s.g(mE, "createDefaultSetter(...)");
            return mE;
        }

        @Override // se.AbstractC6453A
        public te.h T() {
            return (te.h) this.f59399h.getValue();
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && AbstractC5504s.c(j(), ((d) obj).j());
        }

        @Override // pe.InterfaceC6013c
        public String getName() {
            return "<set-" + j().getName() + '>';
        }

        @Override // se.K0.a
        /* JADX INFO: renamed from: h0 */
        public ye.b0 b0() {
            Object objB = this.f59398g.b(this, f59397i[0]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (ye.b0) objB;
        }

        public int hashCode() {
            return j().hashCode();
        }

        public String toString() {
            return "setter of " + j();
        }
    }

    private K0(AbstractC6484d0 abstractC6484d0, String str, String str2, ye.Z z10, Object obj) {
        this.f59388g = abstractC6484d0;
        this.f59389h = str;
        this.f59390i = str2;
        this.f59391j = obj;
        this.f59392k = AbstractC2163n.a(Td.q.f17462b, new I0(this));
        a1.a aVarC = a1.c(z10, new J0(this));
        AbstractC5504s.g(aVarC, "lazySoft(...)");
        this.f59393l = aVarC;
    }

    public static final ye.Z b0(K0 k02) {
        return k02.U().E(k02.getName(), k02.f59390i);
    }

    public static final Field c0(K0 k02) {
        Class<?> enclosingClass;
        AbstractC6507p abstractC6507pF = f1.f59496a.f(k02.b0());
        if (!(abstractC6507pF instanceof AbstractC6507p.c)) {
            if (abstractC6507pF instanceof AbstractC6507p.a) {
                return ((AbstractC6507p.a) abstractC6507pF).b();
            }
            if ((abstractC6507pF instanceof AbstractC6507p.b) || (abstractC6507pF instanceof AbstractC6507p.d)) {
                return null;
            }
            throw new Td.r();
        }
        AbstractC6507p.c cVar = (AbstractC6507p.c) abstractC6507pF;
        ye.Z zB = cVar.b();
        d.a aVarD = We.h.d(We.h.f20878a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
        if (aVarD == null) {
            return null;
        }
        if (AbstractC1668o.e(zB) || We.h.f(cVar.e())) {
            enclosingClass = k02.U().j().getEnclosingClass();
        } else {
            InterfaceC7235m interfaceC7235mB = zB.b();
            enclosingClass = interfaceC7235mB instanceof InterfaceC7227e ? j1.q((InterfaceC7227e) interfaceC7235mB) : k02.U().j();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(aVarD.e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // se.AbstractC6453A
    public te.h T() {
        return j0().T();
    }

    @Override // se.AbstractC6453A
    public AbstractC6484d0 U() {
        return this.f59388g;
    }

    @Override // se.AbstractC6453A
    public te.h V() {
        return j0().V();
    }

    @Override // se.AbstractC6453A
    public boolean Z() {
        return this.f59391j != AbstractC5492f.NO_RECEIVER;
    }

    public boolean equals(Object obj) {
        K0 k0D = j1.d(obj);
        return k0D != null && AbstractC5504s.c(U(), k0D.U()) && AbstractC5504s.c(getName(), k0D.getName()) && AbstractC5504s.c(this.f59390i, k0D.f59390i) && AbstractC5504s.c(this.f59391j, k0D.f59391j);
    }

    protected final Member f0() {
        if (!b0().B()) {
            return null;
        }
        AbstractC6507p abstractC6507pF = f1.f59496a.f(b0());
        if (abstractC6507pF instanceof AbstractC6507p.c) {
            AbstractC6507p.c cVar = (AbstractC6507p.c) abstractC6507pF;
            if (cVar.f().F()) {
                a.c cVarA = cVar.f().A();
                if (!cVarA.A() || !cVarA.z()) {
                    return null;
                }
                return U().D(cVar.d().getString(cVarA.y()), cVar.d().getString(cVarA.x()));
            }
        }
        return k0();
    }

    public final Object g0() {
        return te.o.h(this.f59391j, b0());
    }

    @Override // pe.InterfaceC6013c
    public String getName() {
        return this.f59389h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object h0(Member member, Object obj, Object obj2) throws C6172b {
        try {
            Object obj3 = f59387n;
            if ((obj == obj3 || obj2 == obj3) && b0().O() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objG0 = Z() ? g0() : obj;
            if (objG0 == obj3) {
                objG0 = null;
            }
            if (!Z()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(AbstractC6308a.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objG0);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objG0 == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    AbstractC5504s.g(cls, "get(...)");
                    objG0 = j1.g(cls);
                }
                return method.invoke(null, objG0);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                AbstractC5504s.g(cls2, "get(...)");
                obj = j1.g(cls2);
            }
            return method2.invoke(null, objG0, obj);
        } catch (IllegalAccessException e10) {
            throw new C6172b(e10);
        }
    }

    public int hashCode() {
        return (((U().hashCode() * 31) + getName().hashCode()) * 31) + this.f59390i.hashCode();
    }

    @Override // se.AbstractC6453A
    /* JADX INFO: renamed from: i0 */
    public ye.Z b0() {
        Object objInvoke = this.f59393l.invoke();
        AbstractC5504s.g(objInvoke, "invoke(...)");
        return (ye.Z) objInvoke;
    }

    @Override // pe.InterfaceC6013c, pe.InterfaceC6018h
    public boolean isSuspend() {
        return false;
    }

    public abstract c j0();

    public final Field k0() {
        return (Field) this.f59392k.getValue();
    }

    public final String l0() {
        return this.f59390i;
    }

    public String toString() {
        return e1.f59490a.k(b0());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K0(AbstractC6484d0 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public K0(AbstractC6484d0 container, ye.Z descriptor) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        AbstractC5504s.g(strB, "asString(...)");
        this(container, strB, f1.f59496a.f(descriptor).a(), descriptor, AbstractC5492f.NO_RECEIVER);
    }
}
