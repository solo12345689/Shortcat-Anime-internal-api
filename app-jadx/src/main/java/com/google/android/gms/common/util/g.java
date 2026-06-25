package com.google.android.gms.common.util;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f38988a = new g();

    private g() {
    }

    public static d d() {
        return f38988a;
    }

    @Override // com.google.android.gms.common.util.d
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.d
    public final long b() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.d
    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}
