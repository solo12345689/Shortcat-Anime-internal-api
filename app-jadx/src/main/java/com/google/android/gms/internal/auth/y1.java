package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class y1 extends z1 {
    y1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.z1
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f39323a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.z1
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f39323a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.z1
    public final void c(Object obj, long j10, boolean z10) {
        if (A1.f39055g) {
            A1.i(obj, j10, z10);
        } else {
            A1.j(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.auth.z1
    public final void d(Object obj, long j10, double d10) {
        this.f39323a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.auth.z1
    public final void e(Object obj, long j10, float f10) {
        this.f39323a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.auth.z1
    public final boolean f(Object obj, long j10) {
        return A1.f39055g ? A1.q(obj, j10) : A1.r(obj, j10);
    }
}
