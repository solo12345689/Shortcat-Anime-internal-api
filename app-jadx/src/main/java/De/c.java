package De;

import Ee.AbstractC1527f;
import Qe.x;
import Ud.AbstractC2273n;
import df.C4597f;
import gf.EnumC4882e;
import he.AbstractC4945a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import ve.o;
import xe.C7139c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3697a = new c();

    private c() {
    }

    private final C4597f a(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            AbstractC5504s.g(cls, "getComponentType(...)");
        }
        if (cls.isPrimitive()) {
            if (AbstractC5504s.c(cls, Void.TYPE)) {
                return new C4597f(Xe.b.f21759d.c(o.a.f62241f.m()), i10);
            }
            ve.l lVarM = EnumC4882e.b(cls.getName()).m();
            AbstractC5504s.g(lVarM, "getPrimitiveType(...)");
            return i10 > 0 ? new C4597f(Xe.b.f21759d.c(lVarM.k()), i10 - 1) : new C4597f(Xe.b.f21759d.c(lVarM.p()), i10);
        }
        Xe.b bVarE = AbstractC1527f.e(cls);
        Xe.b bVarM = C7139c.f64375a.m(bVarE.a());
        if (bVarM != null) {
            bVarE = bVarM;
        }
        return new C4597f(bVarE, i10);
    }

    private final void c(Class cls, x.d dVar) throws InvocationTargetException {
        Iterator itA = AbstractC5489c.a(cls.getDeclaredConstructors());
        while (itA.hasNext()) {
            Constructor constructor = (Constructor) itA.next();
            Xe.f fVar = Xe.h.f21789j;
            m mVar = m.f3711a;
            AbstractC5504s.e(constructor);
            x.e eVarA = dVar.a(fVar, mVar.a(constructor));
            if (eVarA != null) {
                Iterator itA2 = AbstractC5489c.a(constructor.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    AbstractC5504s.e(annotation);
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                AbstractC5504s.e(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        Iterator itA3 = AbstractC5489c.a(parameterAnnotations[i10]);
                        while (itA3.hasNext()) {
                            Annotation annotation2 = (Annotation) itA3.next();
                            Class clsB = AbstractC4945a.b(AbstractC4945a.a(annotation2));
                            Xe.b bVarE = AbstractC1527f.e(clsB);
                            AbstractC5504s.e(annotation2);
                            x.a aVarC = eVarA.c(i10 + length, bVarE, new b(annotation2));
                            if (aVarC != null) {
                                f3697a.h(aVarC, annotation2, clsB);
                            }
                        }
                    }
                }
                eVarA.a();
            }
        }
    }

    private final void d(Class cls, x.d dVar) throws InvocationTargetException {
        Iterator itA = AbstractC5489c.a(cls.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            Xe.f fVarM = Xe.f.m(field.getName());
            AbstractC5504s.g(fVarM, "identifier(...)");
            m mVar = m.f3711a;
            AbstractC5504s.e(field);
            x.c cVarB = dVar.b(fVarM, mVar.b(field), null);
            if (cVarB != null) {
                Iterator itA2 = AbstractC5489c.a(field.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    AbstractC5504s.e(annotation);
                    f(cVarB, annotation);
                }
                cVarB.a();
            }
        }
    }

    private final void e(Class cls, x.d dVar) throws InvocationTargetException {
        Iterator itA = AbstractC5489c.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            Xe.f fVarM = Xe.f.m(method.getName());
            AbstractC5504s.g(fVarM, "identifier(...)");
            m mVar = m.f3711a;
            AbstractC5504s.e(method);
            x.e eVarA = dVar.a(fVarM, mVar.c(method));
            if (eVarA != null) {
                Iterator itA2 = AbstractC5489c.a(method.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    AbstractC5504s.e(annotation);
                    f(eVarA, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                AbstractC5504s.g(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Iterator itA3 = AbstractC5489c.a(annotationArr[i10]);
                    while (itA3.hasNext()) {
                        Annotation annotation2 = (Annotation) itA3.next();
                        Class clsB = AbstractC4945a.b(AbstractC4945a.a(annotation2));
                        Xe.b bVarE = AbstractC1527f.e(clsB);
                        AbstractC5504s.e(annotation2);
                        x.a aVarC = eVarA.c(i10, bVarE, new b(annotation2));
                        if (aVarC != null) {
                            f3697a.h(aVarC, annotation2, clsB);
                        }
                    }
                }
                eVarA.a();
            }
        }
    }

    private final void f(x.c cVar, Annotation annotation) throws InvocationTargetException {
        Class clsB = AbstractC4945a.b(AbstractC4945a.a(annotation));
        x.a aVarB = cVar.b(AbstractC1527f.e(clsB), new b(annotation));
        if (aVarB != null) {
            f3697a.h(aVarB, annotation, clsB);
        }
    }

    private final void g(x.a aVar, Xe.f fVar, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (AbstractC5504s.c(enclosingClass, Class.class)) {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.f(fVar, a((Class) obj));
            return;
        }
        if (i.f3704a.contains(enclosingClass)) {
            aVar.d(fVar, obj);
            return;
        }
        if (AbstractC1527f.l(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            AbstractC5504s.e(enclosingClass);
            Xe.b bVarE = AbstractC1527f.e(enclosingClass);
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            Xe.f fVarM = Xe.f.m(((Enum) obj).name());
            AbstractC5504s.g(fVarM, "identifier(...)");
            aVar.b(fVar, bVarE, fVarM);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            AbstractC5504s.g(interfaces, "getInterfaces(...)");
            Class cls = (Class) AbstractC2273n.H0(interfaces);
            AbstractC5504s.e(cls);
            x.a aVarC = aVar.c(fVar, AbstractC1527f.e(cls));
            if (aVarC == null) {
                return;
            }
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(aVarC, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        x.b bVarE2 = aVar.e(fVar);
        if (bVarE2 == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i10 = 0;
        if (componentType.isEnum()) {
            AbstractC5504s.e(componentType);
            Xe.b bVarE3 = AbstractC1527f.e(componentType);
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i10 < length) {
                Object obj2 = objArr[i10];
                AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                Xe.f fVarM2 = Xe.f.m(((Enum) obj2).name());
                AbstractC5504s.g(fVarM2, "identifier(...)");
                bVarE2.c(bVarE3, fVarM2);
                i10++;
            }
        } else if (AbstractC5504s.c(componentType, Class.class)) {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i10 < length2) {
                Object obj3 = objArr2[i10];
                AbstractC5504s.f(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                bVarE2.d(a((Class) obj3));
                i10++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i10 < length3) {
                Object obj4 = objArr3[i10];
                AbstractC5504s.e(componentType);
                x.a aVarB = bVarE2.b(AbstractC1527f.e(componentType));
                if (aVarB != null) {
                    AbstractC5504s.f(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    h(aVarB, (Annotation) obj4, componentType);
                }
                i10++;
            }
        } else {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i10 < length4) {
                bVarE2.e(objArr4[i10]);
                i10++;
            }
        }
        bVarE2.a();
    }

    private final void h(x.a aVar, Annotation annotation, Class cls) throws InvocationTargetException {
        Iterator itA = AbstractC5489c.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                AbstractC5504s.e(objInvoke);
                Xe.f fVarM = Xe.f.m(method.getName());
                AbstractC5504s.g(fVarM, "identifier(...)");
                g(aVar, fVarM, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(Class klass, x.c visitor) {
        AbstractC5504s.h(klass, "klass");
        AbstractC5504s.h(visitor, "visitor");
        Iterator itA = AbstractC5489c.a(klass.getDeclaredAnnotations());
        while (itA.hasNext()) {
            Annotation annotation = (Annotation) itA.next();
            AbstractC5504s.e(annotation);
            f(visitor, annotation);
        }
        visitor.a();
    }

    public final void i(Class klass, x.d memberVisitor) {
        AbstractC5504s.h(klass, "klass");
        AbstractC5504s.h(memberVisitor, "memberVisitor");
        e(klass, memberVisitor);
        c(klass, memberVisitor);
        d(klass, memberVisitor);
    }
}
