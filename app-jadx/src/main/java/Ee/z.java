package Ee;

import Ee.E;
import Oe.InterfaceC1981b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class z extends y implements Oe.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f5960a;

    public z(Method member) {
        AbstractC5504s.h(member, "member");
        this.f5960a = member;
    }

    @Override // Oe.r
    public boolean M() {
        return p() != null;
    }

    @Override // Ee.y
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Method R() {
        return this.f5960a;
    }

    @Override // Oe.r
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public E getReturnType() {
        E.a aVar = E.f5906a;
        Type genericReturnType = R().getGenericReturnType();
        AbstractC5504s.g(genericReturnType, "getGenericReturnType(...)");
        return aVar.a(genericReturnType);
    }

    @Override // Oe.z
    public List getTypeParameters() {
        TypeVariable<Method>[] typeParameters = R().getTypeParameters();
        AbstractC5504s.g(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // Oe.r
    public List j() {
        Type[] genericParameterTypes = R().getGenericParameterTypes();
        AbstractC5504s.g(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = R().getParameterAnnotations();
        AbstractC5504s.g(parameterAnnotations, "getParameterAnnotations(...)");
        return S(genericParameterTypes, parameterAnnotations, R().isVarArgs());
    }

    @Override // Oe.r
    public InterfaceC1981b p() {
        Object defaultValue = R().getDefaultValue();
        if (defaultValue != null) {
            return AbstractC1529h.f5936b.a(defaultValue, null);
        }
        return null;
    }
}
