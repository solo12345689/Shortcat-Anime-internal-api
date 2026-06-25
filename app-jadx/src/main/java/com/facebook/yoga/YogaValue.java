package com.facebook.yoga;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class YogaValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38639c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final YogaValue f38640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final YogaValue f38641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final YogaValue f38642f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f38644b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final YogaValue a(String str) {
            if (str == null) {
                return null;
            }
            if (AbstractC5504s.c("undefined", str)) {
                return YogaValue.f38640d;
            }
            if (AbstractC5504s.c("auto", str)) {
                return YogaValue.f38642f;
            }
            if (!Df.r.A(str, "%", false, 2, null)) {
                return new YogaValue(Float.parseFloat(str), w.POINT);
            }
            String strSubstring = str.substring(0, str.length() - 1);
            AbstractC5504s.g(strSubstring, "substring(...)");
            return new YogaValue(Float.parseFloat(strSubstring), w.PERCENT);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38645a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f38645a = iArr;
        }
    }

    static {
        float f10 = g.f38662b;
        f38640d = new YogaValue(f10, w.UNDEFINED);
        f38641e = new YogaValue(0.0f, w.POINT);
        f38642f = new YogaValue(f10, w.AUTO);
    }

    public YogaValue(float f10, w unit) {
        AbstractC5504s.h(unit, "unit");
        this.f38643a = f10;
        this.f38644b = unit;
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            w wVar = this.f38644b;
            YogaValue yogaValue = (YogaValue) obj;
            if (wVar == yogaValue.f38644b) {
                return wVar == w.UNDEFINED || wVar == w.AUTO || Float.compare(this.f38643a, yogaValue.f38643a) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f38643a) + this.f38644b.c();
    }

    public String toString() {
        int i10 = b.f38645a[this.f38644b.ordinal()];
        if (i10 == 1) {
            return "undefined";
        }
        if (i10 == 2) {
            return String.valueOf(this.f38643a);
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return this.f38643a + "%";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public YogaValue(float f10, int i10) {
        w wVarB = w.b(i10);
        AbstractC5504s.g(wVarB, "fromInt(...)");
        this(f10, wVarB);
    }
}
