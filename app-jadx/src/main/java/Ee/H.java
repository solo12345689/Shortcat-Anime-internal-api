package Ee;

import Ee.E;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class H extends E implements Oe.C {

    /* JADX INFO: renamed from: b */
    private final WildcardType f5912b;

    /* JADX INFO: renamed from: c */
    private final Collection f5913c;

    /* JADX INFO: renamed from: d */
    private final boolean f5914d;

    public H(WildcardType reflectType) {
        AbstractC5504s.h(reflectType, "reflectType");
        this.f5912b = reflectType;
        this.f5913c = AbstractC2279u.m();
    }

    @Override // Oe.InterfaceC1983d
    public boolean D() {
        return this.f5914d;
    }

    @Override // Oe.C
    public boolean L() {
        AbstractC5504s.g(Q().getUpperBounds(), "getUpperBounds(...)");
        return !AbstractC5504s.c(AbstractC2273n.Y(r0), Object.class);
    }

    @Override // Oe.C
    /* JADX INFO: renamed from: R */
    public E w() {
        Type[] upperBounds = Q().getUpperBounds();
        Type[] lowerBounds = Q().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + Q());
        }
        if (lowerBounds.length == 1) {
            E.a aVar = E.f5906a;
            AbstractC5504s.e(lowerBounds);
            Object objH0 = AbstractC2273n.H0(lowerBounds);
            AbstractC5504s.g(objH0, "single(...)");
            return aVar.a((Type) objH0);
        }
        if (upperBounds.length == 1) {
            AbstractC5504s.e(upperBounds);
            Type type = (Type) AbstractC2273n.H0(upperBounds);
            if (!AbstractC5504s.c(type, Object.class)) {
                E.a aVar2 = E.f5906a;
                AbstractC5504s.e(type);
                return aVar2.a(type);
            }
        }
        return null;
    }

    @Override // Ee.E
    /* JADX INFO: renamed from: S */
    public WildcardType Q() {
        return this.f5912b;
    }

    @Override // Oe.InterfaceC1983d
    public Collection getAnnotations() {
        return this.f5913c;
    }
}
