package com.google.android.gms.common;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39016a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f39017b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f39018c = null;

    /* synthetic */ x(byte[] bArr) {
    }

    final x a(String str) {
        this.f39016a = str;
        return this;
    }

    final x b(boolean z10) {
        this.f39017b = Boolean.valueOf(z10);
        return this;
    }

    final x c(boolean z10) {
        this.f39018c = Boolean.valueOf(z10);
        return this;
    }

    final y d() {
        Boolean bool = this.f39017b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f39018c != null) {
            return new y(this.f39016a, bool.booleanValue(), false, false, this.f39018c.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
