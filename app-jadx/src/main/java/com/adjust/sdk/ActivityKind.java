package com.adjust.sdk;

import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.common.verification.SigningManager;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION,
    THIRD_PARTY_SHARING,
    MEASUREMENT_CONSENT,
    PURCHASE_VERIFICATION;

    public static ActivityKind fromString(String str) {
        return "session".equals(str) ? SESSION : "event".equals(str) ? EVENT : "click".equals(str) ? CLICK : "attribution".equals(str) ? ATTRIBUTION : LogEvent.LEVEL_INFO.equals(str) ? INFO : "gdpr".equals(str) ? GDPR : "ad_revenue".equals(str) ? AD_REVENUE : "subscription".equals(str) ? SUBSCRIPTION : "third_party_sharing".equals(str) ? THIRD_PARTY_SHARING : "measurement_consent".equals(str) ? MEASUREMENT_CONSENT : "purchase_verification".equals(str) ? PURCHASE_VERIFICATION : UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (ordinal()) {
            case 1:
                return "session";
            case 2:
                return "event";
            case 3:
                return "click";
            case 4:
                return "attribution";
            case 5:
            case 6:
            case 10:
            default:
                return "unknown";
            case 7:
                return LogEvent.LEVEL_INFO;
            case 8:
                return "gdpr";
            case 9:
                return "ad_revenue";
            case 11:
                return "subscription";
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return "third_party_sharing";
            case 13:
                return "measurement_consent";
            case 14:
                return "purchase_verification";
        }
    }
}
