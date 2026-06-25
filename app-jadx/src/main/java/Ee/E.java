package Ee;

import Oe.InterfaceC1980a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class E implements Oe.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5906a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(Type type) {
            AbstractC5504s.h(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new m(type) : type instanceof WildcardType ? new H((WildcardType) type) : new s(type);
        }

        private a() {
        }
    }

    protected abstract Type Q();

    public boolean equals(Object obj) {
        return (obj instanceof E) && AbstractC5504s.c(Q(), ((E) obj).Q());
    }

    @Override // Oe.InterfaceC1983d
    public InterfaceC1980a h(Xe.c fqName) {
        Object obj;
        AbstractC5504s.h(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Xe.b bVarG = ((InterfaceC1980a) next).g();
            if (AbstractC5504s.c(bVarG != null ? bVarG.a() : null, fqName)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC1980a) obj;
    }

    public int hashCode() {
        return Q().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + Q();
    }
}
