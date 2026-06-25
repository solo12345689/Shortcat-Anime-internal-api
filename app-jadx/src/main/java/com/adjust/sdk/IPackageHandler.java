package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.network.IActivityPackageSender;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface IPackageHandler {
    void addPackage(ActivityPackage activityPackage);

    void flush();

    void init(IActivityHandler iActivityHandler, Context context, boolean z10, IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void sendFirstPackage();

    void teardown();
}
