package H7;

import be.AbstractC3048a;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3303t;
import com.facebook.react.uimanager.EnumC3304u;
import java.util.List;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f8143e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f8144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f8145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f8146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8147d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: H7.x$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class C0107a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8148a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.String.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.Map.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f8148a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final H7.r a(com.facebook.react.bridge.ReadableMap r17, android.content.Context r18) {
            /*
                Method dump skipped, instruction units count: 378
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: H7.x.a.a(com.facebook.react.bridge.ReadableMap, android.content.Context):H7.r");
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final C3303t f8149a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final C3303t f8150b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3303t x10, C3303t y10) {
                super(null);
                AbstractC5504s.h(x10, "x");
                AbstractC5504s.h(y10, "y");
                this.f8149a = x10;
                this.f8150b = y10;
            }

            public final C3303t a() {
                return this.f8149a;
            }

            public final C3303t b() {
                return this.f8150b;
            }
        }

        /* JADX INFO: renamed from: H7.x$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0108b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c f8151a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0108b(c keyword) {
                super(null);
                AbstractC5504s.h(keyword, "keyword");
                this.f8151a = keyword;
            }

            public final c a() {
                return this.f8151a;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f8152b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f8153c = new c("CLOSEST_SIDE", 0, "closest-side");

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final c f8154d = new c("FARTHEST_SIDE", 1, "farthest-side");

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f8155e = new c("CLOSEST_CORNER", 2, "closest-corner");

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final c f8156f = new c("FARTHEST_CORNER", 3, "farthest-corner");

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ c[] f8157g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f8158h;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f8159a;

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
                f8157g = cVarArrA;
                f8158h = AbstractC3048a.a(cVarArrA);
                f8152b = new a(null);
            }

            private c(String str, int i10, String str2) {
                this.f8159a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f8153c, f8154d, f8155e, f8156f};
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f8157g.clone();
            }

            public final String b() {
                return this.f8159a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3303t f8160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C3303t f8161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C3303t f8162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final C3303t f8163d;

        public c(C3303t c3303t, C3303t c3303t2, C3303t c3303t3, C3303t c3303t4) {
            this.f8160a = c3303t;
            this.f8161b = c3303t2;
            this.f8162c = c3303t3;
            this.f8163d = c3303t4;
        }

        public final C3303t a() {
            return this.f8163d;
        }

        public final C3303t b() {
            return this.f8161b;
        }

        public final C3303t c() {
            return this.f8162c;
        }

        public final C3303t d() {
            return this.f8160a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f8165b = new d("CIRCLE", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f8166c = new d("ELLIPSE", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ d[] f8167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f8168e;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String value) {
                AbstractC5504s.h(value, "value");
                if (AbstractC5504s.c(value, "circle")) {
                    return d.f8165b;
                }
                if (AbstractC5504s.c(value, "ellipse")) {
                    return d.f8166c;
                }
                return null;
            }

            private a() {
            }
        }

        static {
            d[] dVarArrA = a();
            f8167d = dVarArrA;
            f8168e = AbstractC3048a.a(dVarArrA);
            f8164a = new a(null);
        }

        private d(String str, int i10) {
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f8165b, f8166c};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f8167d.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8169a;

        static {
            int[] iArr = new int[b.c.values().length];
            try {
                iArr[b.c.f8153c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.c.f8154d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.c.f8155e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.c.f8156f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8169a = iArr;
        }
    }

    public x(d shape, b size, c position, List colorStops) {
        AbstractC5504s.h(shape, "shape");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(position, "position");
        AbstractC5504s.h(colorStops, "colorStops");
        this.f8144a = shape;
        this.f8145b = size;
        this.f8146c = position;
        this.f8147d = colorStops;
    }

    private final Pair b(float f10, float f11, float f12) {
        Float fValueOf = Float.valueOf(0.0f);
        if (f12 == 0.0f || Math.abs(f12) > Float.MAX_VALUE) {
            return new Pair(fValueOf, fValueOf);
        }
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11 * f12 * f12));
        return new Pair(Float.valueOf(fSqrt), Float.valueOf(fSqrt / f12));
    }

    private final Pair c(float f10, float f11, float f12, float f13) {
        b bVar = this.f8145b;
        if (bVar instanceof b.C0108b) {
            b.c cVarA = ((b.C0108b) bVar).a();
            int i10 = e.f8169a[cVarA.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return e(f10, f11, f12, f13, cVarA);
            }
            if (i10 == 3 || i10 == 4) {
                return d(f10, f11, f12, f13, cVarA);
            }
            throw new Td.r();
        }
        if (!(bVar instanceof b.a)) {
            return d(f10, f11, f12, f13, b.c.f8156f);
        }
        EnumC3304u enumC3304uA = ((b.a) bVar).a().a();
        EnumC3304u enumC3304u = EnumC3304u.f37833b;
        float fB = enumC3304uA == enumC3304u ? ((b.a) this.f8145b).a().b(f12) : B.f37368a.b(((b.a) this.f8145b).a().b(f12));
        float fB2 = ((b.a) this.f8145b).b().a() == enumC3304u ? ((b.a) this.f8145b).b().b(f13) : B.f37368a.b(((b.a) this.f8145b).b().b(f13));
        if (this.f8144a != d.f8165b) {
            return new Pair(Float.valueOf(fB), Float.valueOf(fB2));
        }
        float fMax = Math.max(fB, fB2);
        return new Pair(Float.valueOf(fMax), Float.valueOf(fMax));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.Pair d(float r10, float r11, float r12, float r13, H7.x.b.c r14) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H7.x.d(float, float, float, float, H7.x$b$c):kotlin.Pair");
    }

    private final Pair e(float f10, float f11, float f12, float f13, b.c cVar) {
        float fMax;
        float fMax2;
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        b.c cVar2 = b.c.f8153c;
        if (cVar == cVar2) {
            fMax = Math.min(f10, f14);
            fMax2 = Math.min(f11, f15);
        } else {
            fMax = Math.max(f10, f14);
            fMax2 = Math.max(f11, f15);
        }
        if (this.f8144a != d.f8165b) {
            return new Pair(Float.valueOf(fMax), Float.valueOf(fMax2));
        }
        float fMin = cVar == cVar2 ? Math.min(fMax, fMax2) : Math.max(fMax, fMax2);
        return new Pair(Float.valueOf(fMin), Float.valueOf(fMin));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    @Override // H7.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Shader a(float r11, float r12) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H7.x.a(float, float):android.graphics.Shader");
    }
}
