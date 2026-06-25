package com.facebook.react.uimanager.events;

import android.view.View;
import be.AbstractC3048a;
import com.facebook.react.AbstractC3247l;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f37647a = new t();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37648a = new a("CANCEL", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f37649b = new a("CANCEL_CAPTURE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f37650c = new a("CLICK", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f37651d = new a("CLICK_CAPTURE", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f37652e = new a("DOWN", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f37653f = new a("DOWN_CAPTURE", 5);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f37654g = new a("ENTER", 6);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f37655h = new a("ENTER_CAPTURE", 7);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f37656i = new a("LEAVE", 8);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f37657j = new a("LEAVE_CAPTURE", 9);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f37658k = new a("MOVE", 10);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f37659l = new a("MOVE_CAPTURE", 11);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f37660m = new a("UP", 12);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f37661n = new a("UP_CAPTURE", 13);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f37662o = new a("OUT", 14);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f37663p = new a("OUT_CAPTURE", 15);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f37664q = new a("OVER", 16);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f37665r = new a("OVER_CAPTURE", 17);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ a[] f37666s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f37667t;

        static {
            a[] aVarArrA = a();
            f37666s = aVarArrA;
            f37667t = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f37648a, f37649b, f37650c, f37651d, f37652e, f37653f, f37654g, f37655h, f37656i, f37657j, f37658k, f37659l, f37660m, f37661n, f37662o, f37663p, f37664q, f37665r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f37666s.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37668a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f37652e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f37653f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f37660m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f37661n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f37648a.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.f37649b.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.f37650c.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.f37651d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f37668a = iArr;
        }
    }

    private t() {
    }

    public static final int a(String pointerType, int i10, int i11) {
        AbstractC5504s.h(pointerType, "pointerType");
        int i12 = 0;
        if (AbstractC5504s.c("touch", pointerType)) {
            return 0;
        }
        int i13 = i11 ^ i10;
        if (i13 == 0) {
            return -1;
        }
        if (i13 != 1) {
            i12 = 2;
            if (i13 != 2) {
                if (i13 == 4) {
                    return 1;
                }
                if (i13 != 8) {
                    return i13 != 16 ? -1 : 4;
                }
                return 3;
            }
        }
        return i12;
    }

    public static final int b(String str, String pointerType, int i10) {
        AbstractC5504s.h(pointerType, "pointerType");
        if (f37647a.g(str)) {
            return 0;
        }
        if (AbstractC5504s.c("touch", pointerType)) {
            return 1;
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(java.lang.String r2) {
        /*
            r0 = 2
            if (r2 != 0) goto L4
            return r0
        L4:
            int r1 = r2.hashCode()
            switch(r1) {
                case -1786514288: goto L4d;
                case -1780335505: goto L44;
                case -1304584214: goto L39;
                case -1304316135: goto L30;
                case -1304250340: goto L27;
                case -1065042973: goto L1e;
                case 383186882: goto L15;
                case 1343400710: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L55
        Lc:
            java.lang.String r1 = "topPointerOut"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L56
            goto L55
        L15:
            java.lang.String r1 = "topPointerCancel"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L42
            goto L55
        L1e:
            java.lang.String r1 = "topPointerUp"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L42
            goto L55
        L27:
            java.lang.String r1 = "topPointerOver"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L56
            goto L55
        L30:
            java.lang.String r1 = "topPointerMove"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L56
            goto L55
        L39:
            java.lang.String r1 = "topPointerDown"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L42
            goto L55
        L42:
            r2 = 3
            return r2
        L44:
            java.lang.String r1 = "topPointerLeave"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L56
            goto L55
        L4d:
            java.lang.String r1 = "topPointerEnter"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L56
        L55:
            return r0
        L56:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.t.c(java.lang.String):int");
    }

    public static final double d(int i10, String str) {
        return (f37647a.g(str) || i10 == 0) ? 0.0d : 0.5d;
    }

    public static final String e(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "mouse" : "pen" : "touch";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean f(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -1304584214:
                return str.equals("topPointerDown");
            case -1304316135:
                return str.equals("topPointerMove");
            case -1304250340:
                return str.equals("topPointerOver");
            case -1065042973:
                return str.equals("topPointerUp");
            case 383186882:
                return str.equals("topPointerCancel");
            case 1343400710:
                return str.equals("topPointerOut");
            default:
                return false;
        }
    }

    public static final boolean h(View view, a event) {
        AbstractC5504s.h(event, "event");
        if (view == null) {
            return true;
        }
        switch (b.f37668a[event.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                Object tag = view.getTag(AbstractC3247l.f36927u);
                Integer num = tag instanceof Integer ? (Integer) tag : null;
                if (num == null || (num.intValue() & (1 << event.ordinal())) == 0) {
                }
                break;
        }
        return true;
    }

    public final boolean g(String str) {
        if (str == null) {
            return false;
        }
        int iHashCode = str.hashCode();
        return iHashCode != -1780335505 ? iHashCode != -1065042973 ? iHashCode == 1343400710 && str.equals("topPointerOut") : str.equals("topPointerUp") : str.equals("topPointerLeave");
    }
}
