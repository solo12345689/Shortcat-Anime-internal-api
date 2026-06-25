package com.revenuecat.purchases.react;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
class GoogleUpgradeInfo {
    private final String oldProductIdentifier;
    private final Integer prorationMode;

    public GoogleUpgradeInfo(String str, Integer num) {
        this.oldProductIdentifier = str;
        this.prorationMode = num;
    }

    public String getOldProductIdentifier() {
        return this.oldProductIdentifier;
    }

    public Integer getProrationMode() {
        return this.prorationMode;
    }
}
