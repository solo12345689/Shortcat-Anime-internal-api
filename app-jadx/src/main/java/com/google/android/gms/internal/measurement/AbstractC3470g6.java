package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3470g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Unsafe f39766a;

    AbstractC3470g6(Unsafe unsafe) {
        this.f39766a = unsafe;
    }

    public abstract void a(Object obj, long j10, byte b10);

    public abstract boolean b(Object obj, long j10);

    public abstract void c(Object obj, long j10, boolean z10);

    public abstract float d(Object obj, long j10);

    public abstract void e(Object obj, long j10, float f10);

    public abstract double f(Object obj, long j10);

    public abstract void g(Object obj, long j10, double d10);
}
