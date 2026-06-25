package com.revenuecat.purchases.ads.events.types;

import Df.r;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdFormat {
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String OTHER = m177constructorimpl("other");
    private static final String BANNER = m177constructorimpl("banner");
    private static final String INTERSTITIAL = m177constructorimpl("interstitial");
    private static final String REWARDED = m177constructorimpl("rewarded");
    private static final String REWARDED_INTERSTITIAL = m177constructorimpl("rewarded_interstitial");
    private static final String NATIVE = m177constructorimpl("native");
    private static final String APP_OPEN = m177constructorimpl("app_open");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdFormat$Companion;", "", "()V", "APP_OPEN", "Lcom/revenuecat/purchases/ads/events/types/AdFormat;", "getAPP_OPEN-y0COY5Q", "()Ljava/lang/String;", "Ljava/lang/String;", "BANNER", "getBANNER-y0COY5Q", "INTERSTITIAL", "getINTERSTITIAL-y0COY5Q", "NATIVE", "getNATIVE-y0COY5Q", "OTHER", "getOTHER-y0COY5Q", "REWARDED", "getREWARDED-y0COY5Q", "REWARDED_INTERSTITIAL", "getREWARDED_INTERSTITIAL-y0COY5Q", "fromString", "value", "", "fromString-XxFlno4", "(Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: fromString-XxFlno4, reason: not valid java name */
        public final String m183fromStringXxFlno4(String value) {
            AbstractC5504s.h(value, "value");
            String string = r.k1(value).toString();
            switch (string.hashCode()) {
                case -1396342996:
                    if (string.equals("banner")) {
                        return m185getBANNERy0COY5Q();
                    }
                    break;
                case -1052618729:
                    if (string.equals("native")) {
                        return m187getNATIVEy0COY5Q();
                    }
                    break;
                case -239580146:
                    if (string.equals("rewarded")) {
                        return m189getREWARDEDy0COY5Q();
                    }
                    break;
                case 106069776:
                    if (string.equals("other")) {
                        return m188getOTHERy0COY5Q();
                    }
                    break;
                case 604727084:
                    if (string.equals("interstitial")) {
                        return m186getINTERSTITIALy0COY5Q();
                    }
                    break;
                case 1167692200:
                    if (string.equals("app_open")) {
                        return m184getAPP_OPENy0COY5Q();
                    }
                    break;
                case 1911491517:
                    if (string.equals("rewarded_interstitial")) {
                        return m190getREWARDED_INTERSTITIALy0COY5Q();
                    }
                    break;
            }
            return AdFormat.m177constructorimpl(value);
        }

        /* JADX INFO: renamed from: getAPP_OPEN-y0COY5Q, reason: not valid java name */
        public final String m184getAPP_OPENy0COY5Q() {
            return AdFormat.APP_OPEN;
        }

        /* JADX INFO: renamed from: getBANNER-y0COY5Q, reason: not valid java name */
        public final String m185getBANNERy0COY5Q() {
            return AdFormat.BANNER;
        }

        /* JADX INFO: renamed from: getINTERSTITIAL-y0COY5Q, reason: not valid java name */
        public final String m186getINTERSTITIALy0COY5Q() {
            return AdFormat.INTERSTITIAL;
        }

        /* JADX INFO: renamed from: getNATIVE-y0COY5Q, reason: not valid java name */
        public final String m187getNATIVEy0COY5Q() {
            return AdFormat.NATIVE;
        }

        /* JADX INFO: renamed from: getOTHER-y0COY5Q, reason: not valid java name */
        public final String m188getOTHERy0COY5Q() {
            return AdFormat.OTHER;
        }

        /* JADX INFO: renamed from: getREWARDED-y0COY5Q, reason: not valid java name */
        public final String m189getREWARDEDy0COY5Q() {
            return AdFormat.REWARDED;
        }

        /* JADX INFO: renamed from: getREWARDED_INTERSTITIAL-y0COY5Q, reason: not valid java name */
        public final String m190getREWARDED_INTERSTITIALy0COY5Q() {
            return AdFormat.REWARDED_INTERSTITIAL;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AdFormat(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdFormat m176boximpl(String str) {
        return new AdFormat(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m177constructorimpl(String value) {
        AbstractC5504s.h(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m178equalsimpl(String str, Object obj) {
        return (obj instanceof AdFormat) && AbstractC5504s.c(str, ((AdFormat) obj).getValue());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m179equalsimpl0(String str, String str2) {
        return AbstractC5504s.c(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m180hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m181toStringimpl(String str) {
        return "AdFormat(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m178equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m180hashCodeimpl(this.value);
    }

    public String toString() {
        return m181toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }
}
