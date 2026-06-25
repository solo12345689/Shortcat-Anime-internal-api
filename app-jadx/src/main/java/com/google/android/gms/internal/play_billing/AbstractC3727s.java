package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3727s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F f40546a;

    static {
        F rVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            rVar = new C3718q();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            rVar = new r();
        }
        f40546a = rVar;
    }

    public static F a() {
        return f40546a;
    }
}
