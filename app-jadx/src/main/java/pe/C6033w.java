package pe;

import Ud.AbstractC2279u;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pe.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C6033w implements TypeVariable, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6028r f56033a;

    public C6033w(InterfaceC6028r typeParameter) {
        AbstractC5504s.h(typeParameter, "typeParameter");
        this.f56033a = typeParameter;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) obj;
        return AbstractC5504s.c(getName(), typeVariable.getName()) && AbstractC5504s.c(getGenericDeclaration(), typeVariable.getGenericDeclaration());
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        List upperBounds = this.f56033a.getUpperBounds();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC6034x.c((InterfaceC6027q) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new Td.s("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f56033a));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f56033a.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
