package pe;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pe.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C6035y implements WildcardType, Type {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f56036c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C6035y f56037d = new C6035y(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f56038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f56039b;

    /* JADX INFO: renamed from: pe.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6035y a() {
            return C6035y.f56037d;
        }

        private a() {
        }
    }

    public C6035y(Type type, Type type2) {
        this.f56038a = type;
        this.f56039b = type2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f56039b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        if (this.f56039b != null) {
            return "? super " + AbstractC6034x.h(this.f56039b);
        }
        Type type = this.f56038a;
        if (type == null || AbstractC5504s.c(type, Object.class)) {
            return "?";
        }
        return "? extends " + AbstractC6034x.h(this.f56038a);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.f56038a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
