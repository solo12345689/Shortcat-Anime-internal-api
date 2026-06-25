package H7;

import Ud.AbstractC2279u;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import be.AbstractC3048a;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import java.util.List;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8100c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f8101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f8102b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final H7.r a(com.facebook.react.bridge.ReadableMap r11, android.content.Context r12) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: H7.s.a.a(com.facebook.react.bridge.ReadableMap, android.content.Context):H7.r");
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final double f8103a;

            public a(double d10) {
                super(null);
                this.f8103a = d10;
            }

            public final double a() {
                return this.f8103a;
            }
        }

        /* JADX INFO: renamed from: H7.s$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0106b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c f8104a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0106b(c keyword) {
                super(null);
                AbstractC5504s.h(keyword, "keyword");
                this.f8104a = keyword;
            }

            public final c a() {
                return this.f8104a;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f8105b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f8106c = new c("TO_TOP_RIGHT", 0, "to top right");

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final c f8107d = new c("TO_BOTTOM_RIGHT", 1, "to bottom right");

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f8108e = new c("TO_TOP_LEFT", 2, "to top left");

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final c f8109f = new c("TO_BOTTOM_LEFT", 3, "to bottom left");

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ c[] f8110g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f8111h;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f8112a;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final c a(String str) {
                    for (c cVar : c.values()) {
                        if (AbstractC5504s.c(cVar.b(), str)) {
                            return cVar;
                        }
                    }
                    return null;
                }

                private a() {
                }
            }

            static {
                c[] cVarArrA = a();
                f8110g = cVarArrA;
                f8111h = AbstractC3048a.a(cVarArrA);
                f8105b = new a(null);
            }

            private c(String str, int i10, String str2) {
                this.f8112a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f8106c, f8107d, f8108e, f8109f};
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f8110g.clone();
            }

            public final String b() {
                return this.f8112a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8113a;

        static {
            int[] iArr = new int[b.c.values().length];
            try {
                iArr[b.c.f8106c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.c.f8107d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.c.f8108e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.c.f8109f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8113a = iArr;
        }
    }

    public s(b direction, List colorStops) {
        AbstractC5504s.h(direction, "direction");
        AbstractC5504s.h(colorStops, "colorStops");
        this.f8101a = direction;
        this.f8102b = colorStops;
    }

    private final Pair b(double d10, float f10, float f11) {
        double d11 = 360;
        double d12 = d10 % d11;
        if (d12 < 0.0d) {
            d12 += d11;
        }
        if (d12 == 0.0d) {
            return new Pair(new float[]{0.0f, f10}, new float[]{0.0f, 0.0f});
        }
        if (d12 == 90.0d) {
            return new Pair(new float[]{0.0f, 0.0f}, new float[]{f11, 0.0f});
        }
        if (d12 == 180.0d) {
            return new Pair(new float[]{0.0f, 0.0f}, new float[]{0.0f, f10});
        }
        if (d12 == 270.0d) {
            return new Pair(new float[]{f11, 0.0f}, new float[]{0.0f, 0.0f});
        }
        float fTan = (float) Math.tan(Math.toRadians(((double) 90) - d12));
        float f12 = (-1) / fTan;
        float f13 = 2;
        float f14 = f10 / f13;
        float f15 = f11 / f13;
        float[] fArr = d12 < 90.0d ? new float[]{f15, f14} : d12 < 180.0d ? new float[]{f15, -f14} : d12 < 270.0d ? new float[]{-f15, -f14} : new float[]{-f15, f14};
        float f16 = fArr[1] - (fArr[0] * f12);
        float f17 = f16 / (fTan - f12);
        float f18 = (f12 * f17) + f16;
        return new Pair(new float[]{f15 - f17, f14 + f18}, new float[]{f15 + f17, f14 - f18});
    }

    private final double c(b.c cVar, double d10, double d11) {
        double degrees;
        double d12;
        int i10;
        int i11 = c.f8113a[cVar.ordinal()];
        if (i11 == 1) {
            return ((double) 90) - Math.toDegrees(Math.atan(d10 / d11));
        }
        if (i11 != 2) {
            if (i11 == 3) {
                degrees = Math.toDegrees(Math.atan(d10 / d11));
                i10 = 270;
            } else {
                if (i11 != 4) {
                    throw new Td.r();
                }
                degrees = Math.toDegrees(Math.atan(d11 / d10));
                i10 = SensibleDefaults.X_OFFSET;
            }
            d12 = i10;
        } else {
            degrees = Math.toDegrees(Math.atan(d10 / d11));
            d12 = 90;
        }
        return degrees + d12;
    }

    @Override // H7.r
    public Shader a(float f10, float f11) {
        s sVar;
        double dC;
        b bVar = this.f8101a;
        if (bVar instanceof b.a) {
            dC = ((b.a) bVar).a();
            sVar = this;
        } else {
            if (!(bVar instanceof b.C0106b)) {
                throw new Td.r();
            }
            sVar = this;
            dC = sVar.c(((b.C0106b) bVar).a(), f10, f11);
        }
        Pair pairB = b(dC, f11, f10);
        float[] fArr = (float[]) pairB.getFirst();
        float[] fArr2 = (float[]) pairB.getSecond();
        float f12 = fArr2[0] - fArr[0];
        float f13 = fArr2[1] - fArr[1];
        List listA = o.f8092a.a(sVar.f8102b, (float) Math.sqrt((f12 * f12) + (f13 * f13)));
        int[] iArr = new int[listA.size()];
        float[] fArr3 = new float[listA.size()];
        int i10 = 0;
        for (Object obj : listA) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            w wVar = (w) obj;
            Integer numA = wVar.a();
            if (numA != null && wVar.b() != null) {
                iArr[i10] = numA.intValue();
                fArr3[i10] = wVar.b().floatValue();
            }
            i10 = i11;
        }
        return new LinearGradient(fArr[0], fArr[1], fArr2[0], fArr2[1], iArr, fArr3, Shader.TileMode.CLAMP);
    }
}
