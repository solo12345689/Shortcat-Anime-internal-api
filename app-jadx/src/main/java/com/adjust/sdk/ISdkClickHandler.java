package com.adjust.sdk;

import com.adjust.sdk.network.IActivityPackageSender;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface ISdkClickHandler {
    void init(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void sendPreinstallPayload(String str, String str2);

    void sendReftagReferrers();

    void sendSdkClick(ActivityPackage activityPackage);

    void teardown();
}
