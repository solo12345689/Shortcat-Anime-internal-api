package com.adjust.sdk.meta;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class MetaInstallReferrerResult {
    public String error;
    public MetaInstallReferrerDetails metaInstallReferrerDetails;

    MetaInstallReferrerResult(MetaInstallReferrerDetails metaInstallReferrerDetails) {
        this.metaInstallReferrerDetails = metaInstallReferrerDetails;
    }

    public MetaInstallReferrerResult(String str) {
        this.error = str;
    }
}
