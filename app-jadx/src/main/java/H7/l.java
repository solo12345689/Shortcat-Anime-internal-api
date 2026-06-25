package H7;

import android.content.Context;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f8078g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f8080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f8081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Float f8082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Float f8083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Boolean f8084f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: H7.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class C0105a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8085a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.Map.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f8085a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(ReadableMap readableMap, Context context) {
            Integer num;
            Integer numValueOf;
            AbstractC5504s.h(context, "context");
            if (readableMap == null || !readableMap.hasKey("offsetX") || !readableMap.hasKey("offsetY")) {
                return null;
            }
            float f10 = (float) readableMap.getDouble("offsetX");
            float f11 = (float) readableMap.getDouble("offsetY");
            if (readableMap.hasKey("color")) {
                ReadableType type = readableMap.getType("color");
                int i10 = C0105a.f8085a[type.ordinal()];
                if (i10 == 1) {
                    numValueOf = Integer.valueOf(readableMap.getInt("color"));
                } else {
                    if (i10 != 2) {
                        throw new JSApplicationCausedNativeException("Unsupported color type " + type);
                    }
                    numValueOf = ColorPropConverter.getColor(readableMap.getMap("color"), context);
                }
                num = numValueOf;
            } else {
                num = null;
            }
            return new l(f10, f11, num, readableMap.hasKey("blurRadius") ? Float.valueOf((float) readableMap.getDouble("blurRadius")) : null, readableMap.hasKey("spreadDistance") ? Float.valueOf((float) readableMap.getDouble("spreadDistance")) : null, readableMap.hasKey("inset") ? Boolean.valueOf(readableMap.getBoolean("inset")) : null);
        }

        private a() {
        }
    }

    public l(float f10, float f11, Integer num, Float f12, Float f13, Boolean bool) {
        this.f8079a = f10;
        this.f8080b = f11;
        this.f8081c = num;
        this.f8082d = f12;
        this.f8083e = f13;
        this.f8084f = bool;
    }

    public final Float a() {
        return this.f8082d;
    }

    public final Integer b() {
        return this.f8081c;
    }

    public final Boolean c() {
        return this.f8084f;
    }

    public final float d() {
        return this.f8079a;
    }

    public final float e() {
        return this.f8080b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f8079a, lVar.f8079a) == 0 && Float.compare(this.f8080b, lVar.f8080b) == 0 && AbstractC5504s.c(this.f8081c, lVar.f8081c) && AbstractC5504s.c(this.f8082d, lVar.f8082d) && AbstractC5504s.c(this.f8083e, lVar.f8083e) && AbstractC5504s.c(this.f8084f, lVar.f8084f);
    }

    public final Float f() {
        return this.f8083e;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f8079a) * 31) + Float.hashCode(this.f8080b)) * 31;
        Integer num = this.f8081c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f10 = this.f8082d;
        int iHashCode3 = (iHashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f8083e;
        int iHashCode4 = (iHashCode3 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Boolean bool = this.f8084f;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BoxShadow(offsetX=" + this.f8079a + ", offsetY=" + this.f8080b + ", color=" + this.f8081c + ", blurRadius=" + this.f8082d + ", spreadDistance=" + this.f8083e + ", inset=" + this.f8084f + ")";
    }
}
