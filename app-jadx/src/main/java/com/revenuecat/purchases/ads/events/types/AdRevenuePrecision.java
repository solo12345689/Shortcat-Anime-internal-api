package com.revenuecat.purchases.ads.events.types;

import Df.r;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdRevenuePrecision {
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXACT = m209constructorimpl("exact");
    private static final String PUBLISHER_DEFINED = m209constructorimpl("publisher_defined");
    private static final String ESTIMATED = m209constructorimpl("estimated");
    private static final String UNKNOWN = m209constructorimpl("unknown");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision$Companion;", "", "()V", "ESTIMATED", "Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "getESTIMATED-rAcPn4k", "()Ljava/lang/String;", "Ljava/lang/String;", "EXACT", "getEXACT-rAcPn4k", "PUBLISHER_DEFINED", "getPUBLISHER_DEFINED-rAcPn4k", "UNKNOWN", "getUNKNOWN-rAcPn4k", "fromString", "value", "", "fromString-QAIqrgA", "(Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: fromString-QAIqrgA, reason: not valid java name */
        public final String m215fromStringQAIqrgA(String value) {
            AbstractC5504s.h(value, "value");
            String lowerCase = value.toLowerCase(Locale.ROOT);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            String string = r.k1(lowerCase).toString();
            switch (string.hashCode()) {
                case -623607748:
                    if (string.equals("estimated")) {
                        return m216getESTIMATEDrAcPn4k();
                    }
                    break;
                case -284840886:
                    if (string.equals("unknown")) {
                        return m219getUNKNOWNrAcPn4k();
                    }
                    break;
                case 96946943:
                    if (string.equals("exact")) {
                        return m217getEXACTrAcPn4k();
                    }
                    break;
                case 655944390:
                    if (string.equals("publisher_defined")) {
                        return m218getPUBLISHER_DEFINEDrAcPn4k();
                    }
                    break;
            }
            return AdRevenuePrecision.m209constructorimpl(value);
        }

        /* JADX INFO: renamed from: getESTIMATED-rAcPn4k, reason: not valid java name */
        public final String m216getESTIMATEDrAcPn4k() {
            return AdRevenuePrecision.ESTIMATED;
        }

        /* JADX INFO: renamed from: getEXACT-rAcPn4k, reason: not valid java name */
        public final String m217getEXACTrAcPn4k() {
            return AdRevenuePrecision.EXACT;
        }

        /* JADX INFO: renamed from: getPUBLISHER_DEFINED-rAcPn4k, reason: not valid java name */
        public final String m218getPUBLISHER_DEFINEDrAcPn4k() {
            return AdRevenuePrecision.PUBLISHER_DEFINED;
        }

        /* JADX INFO: renamed from: getUNKNOWN-rAcPn4k, reason: not valid java name */
        public final String m219getUNKNOWNrAcPn4k() {
            return AdRevenuePrecision.UNKNOWN;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AdRevenuePrecision(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdRevenuePrecision m208boximpl(String str) {
        return new AdRevenuePrecision(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m209constructorimpl(String value) {
        AbstractC5504s.h(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m210equalsimpl(String str, Object obj) {
        return (obj instanceof AdRevenuePrecision) && AbstractC5504s.c(str, ((AdRevenuePrecision) obj).getValue());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m211equalsimpl0(String str, String str2) {
        return AbstractC5504s.c(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m212hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m213toStringimpl(String str) {
        return "AdRevenuePrecision(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m210equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m212hashCodeimpl(this.value);
    }

    public String toString() {
        return m213toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }
}
