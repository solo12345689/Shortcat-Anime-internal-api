package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3452e6 extends AbstractC3470g6 {
    C3452e6(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3470g6
    public final void a(Object obj, long j10, byte b10) {
        if (AbstractC3479h6.f39785h) {
            AbstractC3479h6.d(obj, j10, b10);
        } else {
            AbstractC3479h6.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3470g6
    public final boolean b(Object obj, long j10) {
        return AbstractC3479h6.f39785h ? AbstractC3479h6.z(obj, j10) : AbstractC3479h6.A(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3470g6
    public final void c(Object obj, long j10, boolean z10) {
        if (AbstractC3479h6.f39785h) {
            AbstractC3479h6.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC3479h6.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3470g6
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f39766a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3470g6
    public final void e(Object obj, long j10, float f10) {
        this.f39766a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3470g6
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(this.f39766a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3470g6
    public final void g(Object obj, long j10, double d10) {
        this.f39766a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
