package Ee;

import Oe.InterfaceC1980a;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.T;
import ye.w0;
import ye.x0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class q extends u implements j, A, Oe.g {

    /* JADX INFO: renamed from: a */
    private final Class f5947a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f5948a = new a();

        a() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final Boolean invoke(Member p02) {
            AbstractC5504s.h(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final b f5949a = new b();

        b() {
            super(1, t.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final t invoke(Constructor p02) {
            AbstractC5504s.h(p02, "p0");
            return new t(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class c extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final c f5950a = new c();

        c() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final Boolean invoke(Member p02) {
            AbstractC5504s.h(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class d extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final d f5951a = new d();

        d() {
            super(1, w.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final w invoke(Field p02) {
            AbstractC5504s.h(p02, "p0");
            return new w(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class e extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final e f5952a = new e();

        e() {
            super(1, z.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final z invoke(Method p02) {
            AbstractC5504s.h(p02, "p0");
            return new z(p02);
        }
    }

    public q(Class klass) {
        AbstractC5504s.h(klass, "klass");
        this.f5947a = klass;
    }

    public static final boolean Q(Class cls) {
        String simpleName = cls.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        return simpleName.length() == 0;
    }

    public static final Xe.f R(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!Xe.f.p(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Xe.f.m(simpleName);
        }
        return null;
    }

    public static final boolean S(q qVar, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (!qVar.v()) {
            return true;
        }
        AbstractC5504s.e(method);
        return !qVar.c0(method);
    }

    private final boolean c0(Method method) {
        String name = method.getName();
        if (AbstractC5504s.c(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC5504s.g(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (AbstractC5504s.c(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // Oe.g
    public Cf.i C() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArrC = C1523b.f5919a.c(this.f5947a);
        if (clsArrC != null) {
            ArrayList arrayList = new ArrayList(clsArrC.length);
            for (Class cls : clsArrC) {
                arrayList.add(new s(cls));
            }
            Cf.i iVarC0 = AbstractC2279u.c0(arrayList);
            if (iVarC0 != null) {
                return iVarC0;
            }
        }
        return Cf.l.i();
    }

    @Override // Oe.InterfaceC1983d
    public boolean D() {
        return false;
    }

    @Override // Oe.g
    public boolean J() {
        return this.f5947a.isInterface();
    }

    @Override // Oe.g
    public Oe.D K() {
        return null;
    }

    @Override // Oe.s
    public boolean P() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // Oe.g
    /* JADX INFO: renamed from: W */
    public List i() {
        Constructor<?>[] declaredConstructors = this.f5947a.getDeclaredConstructors();
        AbstractC5504s.g(declaredConstructors, "getDeclaredConstructors(...)");
        return Cf.l.T(Cf.l.K(Cf.l.A(AbstractC2273n.M(declaredConstructors), a.f5948a), b.f5949a));
    }

    @Override // Ee.j
    /* JADX INFO: renamed from: X */
    public Class s() {
        return this.f5947a;
    }

    @Override // Oe.g
    /* JADX INFO: renamed from: Y */
    public List x() {
        Field[] declaredFields = this.f5947a.getDeclaredFields();
        AbstractC5504s.g(declaredFields, "getDeclaredFields(...)");
        return Cf.l.T(Cf.l.K(Cf.l.A(AbstractC2273n.M(declaredFields), c.f5950a), d.f5951a));
    }

    @Override // Oe.g
    /* JADX INFO: renamed from: Z */
    public List A() {
        Class<?>[] declaredClasses = this.f5947a.getDeclaredClasses();
        AbstractC5504s.g(declaredClasses, "getDeclaredClasses(...)");
        return Cf.l.T(Cf.l.L(Cf.l.A(AbstractC2273n.M(declaredClasses), n.f5944a), o.f5945a));
    }

    @Override // Oe.g
    /* JADX INFO: renamed from: a0 */
    public List B() {
        Method[] declaredMethods = this.f5947a.getDeclaredMethods();
        AbstractC5504s.g(declaredMethods, "getDeclaredMethods(...)");
        return Cf.l.T(Cf.l.K(Cf.l.z(AbstractC2273n.M(declaredMethods), new p(this)), e.f5952a));
    }

    @Override // Oe.g
    /* JADX INFO: renamed from: b0 */
    public q l() {
        Class<?> declaringClass = this.f5947a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && AbstractC5504s.c(this.f5947a, ((q) obj).f5947a);
    }

    @Override // Oe.g
    public Xe.c f() {
        return AbstractC1527f.e(this.f5947a).a();
    }

    @Override // Oe.InterfaceC1983d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // Ee.A
    public int getModifiers() {
        return this.f5947a.getModifiers();
    }

    @Override // Oe.t
    public Xe.f getName() {
        if (!this.f5947a.isAnonymousClass()) {
            Xe.f fVarM = Xe.f.m(this.f5947a.getSimpleName());
            AbstractC5504s.e(fVarM);
            return fVarM;
        }
        String name = this.f5947a.getName();
        AbstractC5504s.g(name, "getName(...)");
        Xe.f fVarM2 = Xe.f.m(Df.r.a1(name, ".", null, 2, null));
        AbstractC5504s.e(fVarM2);
        return fVarM2;
    }

    @Override // Oe.z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = this.f5947a.getTypeParameters();
        AbstractC5504s.g(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // Oe.s
    public x0 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? w0.h.f65148c : Modifier.isPrivate(modifiers) ? w0.e.f65145c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? Ce.c.f3078c : Ce.b.f3077c : Ce.a.f3076c;
    }

    @Override // Oe.InterfaceC1983d
    public /* bridge */ /* synthetic */ InterfaceC1980a h(Xe.c cVar) {
        return h(cVar);
    }

    public int hashCode() {
        return this.f5947a.hashCode();
    }

    @Override // Oe.s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // Oe.s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // Oe.g
    public Collection k() {
        Class cls;
        cls = Object.class;
        if (AbstractC5504s.c(this.f5947a, cls)) {
            return AbstractC2279u.m();
        }
        T t10 = new T(2);
        Type genericSuperclass = this.f5947a.getGenericSuperclass();
        t10.a(genericSuperclass != null ? genericSuperclass : Object.class);
        t10.b(this.f5947a.getGenericInterfaces());
        List listP = AbstractC2279u.p(t10.d(new Type[t10.c()]));
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(new s((Type) it.next()));
        }
        return arrayList;
    }

    @Override // Oe.g
    public Collection m() {
        Object[] objArrD = C1523b.f5919a.d(this.f5947a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new D(obj));
        }
        return arrayList;
    }

    @Override // Oe.g
    public boolean o() {
        return this.f5947a.isAnnotation();
    }

    @Override // Oe.g
    public boolean q() throws IllegalAccessException, InvocationTargetException {
        Boolean boolE = C1523b.f5919a.e(this.f5947a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    @Override // Oe.g
    public boolean r() {
        return false;
    }

    public String toString() {
        return q.class.getName() + ": " + this.f5947a;
    }

    @Override // Oe.g
    public boolean v() {
        return this.f5947a.isEnum();
    }

    @Override // Oe.g
    public boolean y() throws IllegalAccessException, InvocationTargetException {
        Boolean boolF = C1523b.f5919a.f(this.f5947a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

    @Override // Ee.j, Oe.InterfaceC1983d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementS = s();
        return (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? AbstractC2279u.m() : listB;
    }

    @Override // Ee.j, Oe.InterfaceC1983d
    public C1528g h(Xe.c fqName) {
        Annotation[] declaredAnnotations;
        AbstractC5504s.h(fqName, "fqName");
        AnnotatedElement annotatedElementS = s();
        if (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, fqName);
    }
}
