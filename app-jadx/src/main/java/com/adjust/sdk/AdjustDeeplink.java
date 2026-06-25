package com.adjust.sdk;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AdjustDeeplink {
    Uri referrer;
    Uri url;

    public AdjustDeeplink(Uri uri) {
        this.url = uri;
    }

    public Uri getReferrer() {
        return this.referrer;
    }

    public Uri getUrl() {
        return this.url;
    }

    public boolean isValid() {
        Uri uri = this.url;
        return (uri == null || uri.toString().isEmpty()) ? false : true;
    }

    public void setReferrer(Uri uri) {
        this.referrer = uri;
    }
}
