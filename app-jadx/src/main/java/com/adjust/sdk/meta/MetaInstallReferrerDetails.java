package com.adjust.sdk.meta;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class MetaInstallReferrerDetails {
    public long actualTimestampInSec;
    public String installReferrer;
    public boolean isClick;

    MetaInstallReferrerDetails(String str, long j10, boolean z10) {
        this.installReferrer = str;
        this.actualTimestampInSec = j10;
        this.isClick = z10;
    }

    public String toString() {
        return com.adjust.sdk.Util.formatString(" installReferrer : %s actualTimestampInSec : %d isClick : %b", this.installReferrer, Long.valueOf(this.actualTimestampInSec), Boolean.valueOf(this.isClick));
    }
}
