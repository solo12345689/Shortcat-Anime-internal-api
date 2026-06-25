package com.adjust.sdk.meta;

import android.content.Context;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.ReferrerDetails;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Util {
    public static synchronized ReferrerDetails getMetaInstallReferrerDetails(Context context, String str, ILogger iLogger) {
        if (!AdjustMetaReferrer.shouldReadMetaReferrer) {
            return null;
        }
        iLogger.info("getMetaInstallReferrerDetails invoked", new Object[0]);
        MetaInstallReferrerResult metaInstallReferrer = MetaReferrerClient.getMetaInstallReferrer(context, str, iLogger, true);
        if (metaInstallReferrer == null) {
            return null;
        }
        MetaInstallReferrerDetails metaInstallReferrerDetails = metaInstallReferrer.metaInstallReferrerDetails;
        if (metaInstallReferrerDetails == null) {
            return null;
        }
        return new ReferrerDetails(metaInstallReferrerDetails.installReferrer, metaInstallReferrerDetails.actualTimestampInSec, Boolean.valueOf(metaInstallReferrerDetails.isClick));
    }
}
