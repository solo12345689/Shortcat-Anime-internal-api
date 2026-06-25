package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.react.uimanager.t */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3303t {

    /* JADX INFO: renamed from: c */
    public static final a f37827c = new a(null);

    /* JADX INFO: renamed from: a */
    private final float f37828a;

    /* JADX INFO: renamed from: b */
    private final EnumC3304u f37829b;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: com.facebook.react.uimanager.t$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class C0624a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f37830a;

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
                f37830a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C3303t b(a aVar, Dynamic dynamic, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(dynamic, z10);
        }

        public final C3303t a(Dynamic dynamic, boolean z10) {
            AbstractC5504s.h(dynamic, "dynamic");
            int i10 = C0624a.f37830a[dynamic.getType().ordinal()];
            if (i10 == 1) {
                double dAsDouble = dynamic.asDouble();
                if (dAsDouble >= 0.0d || z10) {
                    return new C3303t((float) dAsDouble, EnumC3304u.f37832a);
                }
                return null;
            }
            if (i10 != 2) {
                AbstractC7283a.I("ReactNative", "Unsupported type for radius property: " + dynamic.getType());
                return null;
            }
            String strAsString = dynamic.asString();
            if (strAsString == null || !Df.r.A(strAsString, "%", false, 2, null)) {
                AbstractC7283a.I("ReactNative", "Invalid string value: " + strAsString);
                return null;
            }
            try {
                String strSubstring = strAsString.substring(0, strAsString.length() - 1);
                AbstractC5504s.g(strSubstring, "substring(...)");
                float f10 = Float.parseFloat(strSubstring);
                if (f10 >= 0.0f || z10) {
                    return new C3303t(f10, EnumC3304u.f37833b);
                }
                return null;
            } catch (NumberFormatException unused) {
                AbstractC7283a.I("ReactNative", "Invalid percentage format: " + strAsString);
                return null;
            }
        }

        private a() {
        }
    }

    public C3303t(float f10, EnumC3304u type) {
        AbstractC5504s.h(type, "type");
        this.f37828a = f10;
        this.f37829b = type;
    }

    public final EnumC3304u a() {
        return this.f37829b;
    }

    public final float b(float f10) {
        return this.f37829b == EnumC3304u.f37833b ? (this.f37828a / 100) * f10 : this.f37828a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3303t)) {
            return false;
        }
        C3303t c3303t = (C3303t) obj;
        return Float.compare(this.f37828a, c3303t.f37828a) == 0 && this.f37829b == c3303t.f37829b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f37828a) * 31) + this.f37829b.hashCode();
    }

    public String toString() {
        return "LengthPercentage(value=" + this.f37828a + ", type=" + this.f37829b + ")";
    }
}
