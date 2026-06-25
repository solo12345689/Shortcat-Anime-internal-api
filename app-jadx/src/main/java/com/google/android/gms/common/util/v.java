package com.google.android.gms.common.util;

import android.os.StrictMode;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (l.i()) {
            StrictMode.setVmPolicy(u.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
