package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3802f {
    C3802f(Context context) {
    }

    public static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
