package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class H0 extends S8.a {
    public static final Parcelable.Creator<H0> CREATOR = new I0();

    /* JADX INFO: renamed from: a */
    public final long f39355a;

    /* JADX INFO: renamed from: b */
    public final long f39356b;

    /* JADX INFO: renamed from: c */
    public final boolean f39357c;

    /* JADX INFO: renamed from: d */
    public final Bundle f39358d;

    /* JADX INFO: renamed from: e */
    public final String f39359e;

    public H0(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.f39355a = j10;
        this.f39356b = j11;
        this.f39357c = z10;
        this.f39358d = bundle;
        this.f39359e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f39355a;
        int iA = S8.c.a(parcel);
        S8.c.n(parcel, 1, j10);
        S8.c.n(parcel, 2, this.f39356b);
        S8.c.c(parcel, 3, this.f39357c);
        S8.c.e(parcel, 7, this.f39358d, false);
        S8.c.q(parcel, 8, this.f39359e, false);
        S8.c.b(parcel, iA);
    }
}
