package com.facebook.react.views.image;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f37904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f37905b = new c("AUTO", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f37906c = new c("RESIZE", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f37907d = new c("SCALE", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f37908e = new c("NONE", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ c[] f37909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37910g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
        
            if (r3.equals("auto") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        
            if (r3.equals("") == false) goto L31;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.react.views.image.c a(java.lang.String r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L70
                int r0 = r3.hashCode()
                r1 = -934437708(0xffffffffc84d9cb4, float:-210546.81)
                if (r0 == r1) goto L47
                if (r0 == 0) goto L3e
                r1 = 3005871(0x2dddaf, float:4.212122E-39)
                if (r0 == r1) goto L35
                r1 = 3387192(0x33af38, float:4.746467E-39)
                if (r0 == r1) goto L29
                r1 = 109250890(0x683094a, float:4.929037E-35)
                if (r0 == r1) goto L1d
                goto L4f
            L1d:
                java.lang.String r0 = "scale"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L26
                goto L4f
            L26:
                com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.f37907d
                return r3
            L29:
                java.lang.String r0 = "none"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L32
                goto L4f
            L32:
                com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.f37908e
                return r3
            L35:
                java.lang.String r0 = "auto"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L70
                goto L4f
            L3e:
                java.lang.String r0 = ""
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L70
                goto L4f
            L47:
                java.lang.String r0 = "resize"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L6d
            L4f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid resize method: '"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = "'"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "ReactNative"
                z5.AbstractC7283a.I(r0, r3)
                com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.f37905b
                return r3
            L6d:
                com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.f37906c
                return r3
            L70:
                com.facebook.react.views.image.c r3 = com.facebook.react.views.image.c.f37905b
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.c.a.a(java.lang.String):com.facebook.react.views.image.c");
        }

        private a() {
        }
    }

    static {
        c[] cVarArrA = a();
        f37909f = cVarArrA;
        f37910g = AbstractC3048a.a(cVarArrA);
        f37904a = new a(null);
    }

    private c(String str, int i10) {
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f37905b, f37906c, f37907d, f37908e};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f37909f.clone();
    }
}
