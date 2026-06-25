package com.amazon.device.iap.model;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum LWAConsentStatus {
    CONSENTED,
    UNAVAILABLE;

    public static LWAConsentStatus getEnumForValue(String str) {
        for (LWAConsentStatus lWAConsentStatus : values()) {
            if (lWAConsentStatus.toString().equals(str)) {
                return lWAConsentStatus;
            }
        }
        return UNAVAILABLE;
    }
}
