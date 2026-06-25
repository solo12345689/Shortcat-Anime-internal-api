package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3509l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39816a;

    static {
        f39816a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
