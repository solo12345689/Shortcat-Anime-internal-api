package Ee;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class t extends y implements Oe.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Constructor f5956a;

    public t(Constructor member) {
        AbstractC5504s.h(member, "member");
        this.f5956a = member;
    }

    @Override // Ee.y
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Constructor R() {
        return this.f5956a;
    }

    @Override // Oe.z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = R().getTypeParameters();
        AbstractC5504s.g(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // Oe.k
    public List j() {
        Type[] genericParameterTypes = R().getGenericParameterTypes();
        AbstractC5504s.e(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return AbstractC2279u.m();
        }
        Class declaringClass = R().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) AbstractC2273n.t(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = R().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + R());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            AbstractC5504s.e(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) AbstractC2273n.t(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        AbstractC5504s.e(genericParameterTypes);
        AbstractC5504s.e(parameterAnnotations);
        return S(genericParameterTypes, parameterAnnotations, R().isVarArgs());
    }
}
