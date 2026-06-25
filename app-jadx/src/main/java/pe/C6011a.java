package pe;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pe.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C6011a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f56007a;

    public C6011a(Type elementType) {
        AbstractC5504s.h(elementType, "elementType");
        this.f56007a = elementType;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC5504s.c(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f56007a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return AbstractC6034x.h(this.f56007a) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
