package Ee;

import Ee.E;
import Oe.InterfaceC1980a;
import Ud.AbstractC2279u;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class s extends E implements Oe.j {

    /* JADX INFO: renamed from: b */
    private final Type f5954b;

    /* JADX INFO: renamed from: c */
    private final Oe.i f5955c;

    public s(Type reflectType) {
        Oe.i qVar;
        AbstractC5504s.h(reflectType, "reflectType");
        this.f5954b = reflectType;
        Type typeQ = Q();
        if (typeQ instanceof Class) {
            qVar = new q((Class) typeQ);
        } else if (typeQ instanceof TypeVariable) {
            qVar = new F((TypeVariable) typeQ);
        } else {
            if (!(typeQ instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeQ.getClass() + "): " + typeQ);
            }
            Type rawType = ((ParameterizedType) typeQ).getRawType();
            AbstractC5504s.f(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            qVar = new q((Class) rawType);
        }
        this.f5955c = qVar;
    }

    @Override // Oe.InterfaceC1983d
    public boolean D() {
        return false;
    }

    @Override // Oe.j
    public String E() {
        return Q().toString();
    }

    @Override // Oe.j
    public String H() {
        throw new UnsupportedOperationException("Type not found: " + Q());
    }

    @Override // Ee.E
    public Type Q() {
        return this.f5954b;
    }

    @Override // Oe.j
    public Oe.i c() {
        return this.f5955c;
    }

    @Override // Oe.InterfaceC1983d
    public Collection getAnnotations() {
        return AbstractC2279u.m();
    }

    @Override // Ee.E, Oe.InterfaceC1983d
    public InterfaceC1980a h(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return null;
    }

    @Override // Oe.j
    public boolean t() {
        Type typeQ = Q();
        if (typeQ instanceof Class) {
            TypeVariable[] typeParameters = ((Class) typeQ).getTypeParameters();
            AbstractC5504s.g(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // Oe.j
    public List z() {
        List listH = AbstractC1527f.h(Q());
        E.a aVar = E.f5906a;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listH, 10));
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }
}
