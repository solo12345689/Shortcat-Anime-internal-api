package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class r extends F {
    r() {
    }

    @Override // com.google.android.gms.internal.play_billing.F
    public final long a() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
