package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class a extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Map f38835a;

    a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f38835a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f38835a;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        E8.a.a(builderBuildUpon.build().toString());
    }
}
