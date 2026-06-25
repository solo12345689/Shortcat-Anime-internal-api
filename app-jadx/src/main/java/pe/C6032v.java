package pe;

import Ud.AbstractC2277s;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pe.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C6032v implements ParameterizedType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f56029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f56030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type[] f56031c;

    /* JADX INFO: renamed from: pe.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f56032a = new a();

        a() {
            super(1, AbstractC6034x.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type p02) {
            AbstractC5504s.h(p02, "p0");
            return AbstractC6034x.h(p02);
        }
    }

    public C6032v(Class rawType, Type type, List typeArguments) {
        AbstractC5504s.h(rawType, "rawType");
        AbstractC5504s.h(typeArguments, "typeArguments");
        this.f56029a = rawType;
        this.f56030b = type;
        this.f56031c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return AbstractC5504s.c(this.f56029a, parameterizedType.getRawType()) && AbstractC5504s.c(this.f56030b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f56031c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f56030b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f56029a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f56030b;
        if (type != null) {
            sb2.append(AbstractC6034x.h(type));
            sb2.append("$");
            sb2.append(this.f56029a.getSimpleName());
        } else {
            sb2.append(AbstractC6034x.h(this.f56029a));
        }
        Type[] typeArr = this.f56031c;
        if (!(typeArr.length == 0)) {
            AbstractC2277s.r0(typeArr, sb2, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : a.f56032a);
        }
        return sb2.toString();
    }

    public int hashCode() {
        int iHashCode = this.f56029a.hashCode();
        Type type = this.f56030b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
