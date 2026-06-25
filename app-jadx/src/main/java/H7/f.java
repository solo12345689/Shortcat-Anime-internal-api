package H7;

import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3303t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8038c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3303t f8039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3303t f8040b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: H7.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class C0104a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8041a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f8041a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final H7.f a(com.facebook.react.bridge.ReadableMap r11) {
            /*
                r10 = this;
                r0 = 0
                if (r11 != 0) goto L4
                return r0
            L4:
                java.lang.String r1 = "x"
                boolean r2 = r11.hasKey(r1)
                java.lang.String r3 = "%"
                java.lang.String r4 = "auto"
                r5 = 1
                r6 = 0
                r7 = 2
                if (r2 == 0) goto L2b
                com.facebook.react.bridge.ReadableType r2 = r11.getType(r1)
                com.facebook.react.bridge.ReadableType r8 = com.facebook.react.bridge.ReadableType.Null
                if (r2 == r8) goto L2b
                com.facebook.react.bridge.ReadableType r2 = r11.getType(r1)
                int[] r8 = H7.f.a.C0104a.f8041a
                int r2 = r2.ordinal()
                r2 = r8[r2]
                if (r2 == r5) goto L4b
                if (r2 == r7) goto L2d
            L2b:
                r1 = r0
                goto L55
            L2d:
                java.lang.String r2 = r11.getString(r1)
                boolean r8 = kotlin.jvm.internal.AbstractC5504s.c(r2, r4)
                if (r8 == 0) goto L38
                goto L2b
            L38:
                if (r2 == 0) goto L2b
                boolean r2 = Df.r.A(r2, r3, r6, r7, r0)
                if (r2 == 0) goto L2b
                com.facebook.react.uimanager.t$a r2 = com.facebook.react.uimanager.C3303t.f37827c
                com.facebook.react.bridge.Dynamic r1 = r11.getDynamic(r1)
                com.facebook.react.uimanager.t r1 = com.facebook.react.uimanager.C3303t.a.b(r2, r1, r6, r7, r0)
                goto L55
            L4b:
                com.facebook.react.uimanager.t$a r2 = com.facebook.react.uimanager.C3303t.f37827c
                com.facebook.react.bridge.Dynamic r1 = r11.getDynamic(r1)
                com.facebook.react.uimanager.t r1 = com.facebook.react.uimanager.C3303t.a.b(r2, r1, r6, r7, r0)
            L55:
                java.lang.String r2 = "y"
                boolean r8 = r11.hasKey(r2)
                if (r8 == 0) goto L9e
                com.facebook.react.bridge.ReadableType r8 = r11.getType(r2)
                com.facebook.react.bridge.ReadableType r9 = com.facebook.react.bridge.ReadableType.Null
                if (r8 == r9) goto L9e
                com.facebook.react.bridge.ReadableType r8 = r11.getType(r2)
                int[] r9 = H7.f.a.C0104a.f8041a
                int r8 = r8.ordinal()
                r8 = r9[r8]
                if (r8 == r5) goto L94
                if (r8 == r7) goto L76
                goto L9e
            L76:
                java.lang.String r5 = r11.getString(r2)
                boolean r4 = kotlin.jvm.internal.AbstractC5504s.c(r5, r4)
                if (r4 == 0) goto L81
                goto L9e
            L81:
                if (r5 == 0) goto L9e
                boolean r3 = Df.r.A(r5, r3, r6, r7, r0)
                if (r3 == 0) goto L9e
                com.facebook.react.uimanager.t$a r3 = com.facebook.react.uimanager.C3303t.f37827c
                com.facebook.react.bridge.Dynamic r11 = r11.getDynamic(r2)
                com.facebook.react.uimanager.t r0 = com.facebook.react.uimanager.C3303t.a.b(r3, r11, r6, r7, r0)
                goto L9e
            L94:
                com.facebook.react.uimanager.t$a r3 = com.facebook.react.uimanager.C3303t.f37827c
                com.facebook.react.bridge.Dynamic r11 = r11.getDynamic(r2)
                com.facebook.react.uimanager.t r0 = com.facebook.react.uimanager.C3303t.a.b(r3, r11, r6, r7, r0)
            L9e:
                H7.f r11 = new H7.f
                r11.<init>(r1, r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: H7.f.a.a(com.facebook.react.bridge.ReadableMap):H7.f");
        }

        private a() {
        }
    }

    public f(C3303t c3303t, C3303t c3303t2) {
        this.f8039a = c3303t;
        this.f8040b = c3303t2;
    }

    public final C3303t a() {
        return this.f8039a;
    }

    public final C3303t b() {
        return this.f8040b;
    }
}
