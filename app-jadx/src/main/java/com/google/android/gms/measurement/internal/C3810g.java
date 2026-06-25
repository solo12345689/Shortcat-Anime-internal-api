package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3810g extends S8.a {
    public static final Parcelable.Creator<C3810g> CREATOR = new C3818h();

    /* JADX INFO: renamed from: a */
    public final long f41301a;

    /* JADX INFO: renamed from: b */
    public final int f41302b;

    /* JADX INFO: renamed from: c */
    public final long f41303c;

    C3810g(long j10, int i10, long j11) {
        this.f41301a = j10;
        this.f41302b = i10;
        this.f41303c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f41301a;
        int iA = S8.c.a(parcel);
        S8.c.n(parcel, 1, j10);
        S8.c.j(parcel, 2, this.f41302b);
        S8.c.n(parcel, 3, this.f41303c);
        S8.c.b(parcel, iA);
    }
}
