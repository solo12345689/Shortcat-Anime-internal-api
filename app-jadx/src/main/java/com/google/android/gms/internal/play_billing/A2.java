package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class A2 extends B2 {
    A2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.B2
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f40133a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.B2
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f40133a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.B2
    public final void c(Object obj, long j10, boolean z10) {
        if (C2.f40146h) {
            C2.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            C2.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.B2
    public final void d(Object obj, long j10, byte b10) {
        if (C2.f40146h) {
            C2.d(obj, j10, b10);
        } else {
            C2.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.B2
    public final void e(Object obj, long j10, double d10) {
        this.f40133a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.B2
    public final void f(Object obj, long j10, float f10) {
        this.f40133a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.B2
    public final boolean g(Object obj, long j10) {
        return C2.f40146h ? C2.y(obj, j10) : C2.z(obj, j10);
    }
}
