package Ee;

import Ee.E;
import Ud.AbstractC2279u;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class m extends E implements Oe.f {

    /* JADX INFO: renamed from: b */
    private final Type f5940b;

    /* JADX INFO: renamed from: c */
    private final E f5941c;

    /* JADX INFO: renamed from: d */
    private final Collection f5942d;

    /* JADX INFO: renamed from: e */
    private final boolean f5943e;

    public m(Type reflectType) {
        E eA;
        AbstractC5504s.h(reflectType, "reflectType");
        this.f5940b = reflectType;
        Type typeQ = Q();
        if (!(typeQ instanceof GenericArrayType)) {
            if (typeQ instanceof Class) {
                Class cls = (Class) typeQ;
                if (cls.isArray()) {
                    E.a aVar = E.f5906a;
                    Class<?> componentType = cls.getComponentType();
                    AbstractC5504s.g(componentType, "getComponentType(...)");
                    eA = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + Q().getClass() + "): " + Q());
        }
        E.a aVar2 = E.f5906a;
        Type genericComponentType = ((GenericArrayType) typeQ).getGenericComponentType();
        AbstractC5504s.g(genericComponentType, "getGenericComponentType(...)");
        eA = aVar2.a(genericComponentType);
        this.f5941c = eA;
        this.f5942d = AbstractC2279u.m();
    }

    @Override // Oe.InterfaceC1983d
    public boolean D() {
        return this.f5943e;
    }

    @Override // Ee.E
    protected Type Q() {
        return this.f5940b;
    }

    @Override // Oe.f
    /* JADX INFO: renamed from: R */
    public E n() {
        return this.f5941c;
    }

    @Override // Oe.InterfaceC1983d
    public Collection getAnnotations() {
        return this.f5942d;
    }
}
