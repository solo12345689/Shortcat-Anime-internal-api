package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: a */
    final Uri f39071a;

    /* JADX INFO: renamed from: b */
    final String f39072b;

    /* JADX INFO: renamed from: c */
    final String f39073c;

    /* JADX INFO: renamed from: d */
    final boolean f39074d;

    /* JADX INFO: renamed from: e */
    final boolean f39075e;

    private I(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, Q q10) {
        this.f39071a = uri;
        this.f39072b = "";
        this.f39073c = "";
        this.f39074d = z10;
        this.f39075e = z12;
    }

    public final I a() {
        return new I(null, this.f39071a, this.f39072b, this.f39073c, this.f39074d, false, true, false, null);
    }

    public final I b() {
        if (this.f39072b.isEmpty()) {
            return new I(null, this.f39071a, this.f39072b, this.f39073c, true, false, this.f39075e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final M c(String str, double d10) {
        return new G(this, str, Double.valueOf(0.0d), true);
    }

    public final M d(String str, long j10) {
        return new E(this, str, Long.valueOf(j10), true);
    }

    public final M e(String str, boolean z10) {
        return new F(this, str, Boolean.valueOf(z10), true);
    }

    public final M f(String str, Object obj, N1 n12) {
        return new H(this, "getTokenRefactor__blocked_packages", obj, true, n12);
    }

    public I(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
