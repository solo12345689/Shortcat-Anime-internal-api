package com.google.android.gms.common;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f39020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f39021c;

    /* synthetic */ y(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, byte[] bArr) {
        this.f39019a = str;
        this.f39020b = z10;
        this.f39021c = z13;
    }

    final boolean a() {
        return this.f39021c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y8.a, android.os.IBinder] */
    final t b(Context context) {
        return new t(this.f39019a, this.f39020b, false, Y8.b.G3(context), false, true, false);
    }
}
