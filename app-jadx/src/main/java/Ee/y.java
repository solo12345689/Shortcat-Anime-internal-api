package Ee;

import Oe.InterfaceC1980a;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import ye.w0;
import ye.x0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class y extends u implements j, A, Oe.q {
    @Override // Oe.InterfaceC1983d
    public boolean D() {
        return false;
    }

    @Override // Oe.s
    public boolean P() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // Oe.q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public q O() {
        Class<?> declaringClass = R().getDeclaringClass();
        AbstractC5504s.g(declaringClass, "getDeclaringClass(...)");
        return new q(declaringClass);
    }

    public abstract Member R();

    protected final List S(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z10) throws IllegalAccessException, InvocationTargetException {
        String str;
        AbstractC5504s.h(parameterTypes, "parameterTypes");
        AbstractC5504s.h(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List listB = C1524c.f5925a.b(R());
        int size = listB != null ? listB.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i10 = 0;
        while (i10 < length) {
            E eA = E.f5906a.a(parameterTypes[i10]);
            if (listB != null) {
                str = (String) AbstractC2279u.p0(listB, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + eA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new G(eA, parameterAnnotations[i10], str, z10 && i10 == AbstractC2273n.f0(parameterTypes)));
            i10++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && AbstractC5504s.c(R(), ((y) obj).R());
    }

    @Override // Oe.InterfaceC1983d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // Ee.A
    public int getModifiers() {
        return R().getModifiers();
    }

    @Override // Oe.t
    public Xe.f getName() {
        Xe.f fVarM;
        String name = R().getName();
        return (name == null || (fVarM = Xe.f.m(name)) == null) ? Xe.h.f21781b : fVarM;
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
        return R().hashCode();
    }

    @Override // Oe.s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // Oe.s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // Ee.j
    public AnnotatedElement s() {
        Member memberR = R();
        AbstractC5504s.f(memberR, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberR;
    }

    public String toString() {
        return getClass().getName() + ": " + R();
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
