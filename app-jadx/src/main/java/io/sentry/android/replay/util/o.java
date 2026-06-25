package io.sentry.android.replay.util;

import android.os.Build;
import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f50437a = new o();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SOC_MODEL = new a("SOC_MODEL", 0);
        public static final a SOC_MANUFACTURER = new a("SOC_MANUFACTURER", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{SOC_MODEL, SOC_MANUFACTURER};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC3048a.a(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50438a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SOC_MODEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SOC_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50438a = iArr;
        }
    }

    private o() {
    }

    public static /* synthetic */ String b(o oVar, a aVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return oVar.a(aVar, str);
    }

    public final String a(a key, String defaultValue) {
        String str;
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(defaultValue, "defaultValue");
        if (Build.VERSION.SDK_INT < 31) {
            return defaultValue;
        }
        int i10 = b.f50438a[key.ordinal()];
        if (i10 == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i10 != 2) {
                throw new Td.r();
            }
            str = Build.SOC_MANUFACTURER;
        }
        AbstractC5504s.e(str);
        return str;
    }
}
