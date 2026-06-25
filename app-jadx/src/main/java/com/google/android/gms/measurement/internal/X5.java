package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class X5 extends S8.a {
    public static final Parcelable.Creator<X5> CREATOR = new Y5();

    /* JADX INFO: renamed from: a */
    public final long f41049a;

    /* JADX INFO: renamed from: b */
    public byte[] f41050b;

    /* JADX INFO: renamed from: c */
    public final String f41051c;

    /* JADX INFO: renamed from: d */
    public final Bundle f41052d;

    /* JADX INFO: renamed from: e */
    public final int f41053e;

    /* JADX INFO: renamed from: f */
    public final long f41054f;

    /* JADX INFO: renamed from: g */
    public String f41055g;

    X5(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f41049a = j10;
        this.f41050b = bArr;
        this.f41051c = str;
        this.f41052d = bundle;
        this.f41053e = i10;
        this.f41054f = j11;
        this.f41055g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f41049a;
        int iA = S8.c.a(parcel);
        S8.c.n(parcel, 1, j10);
        S8.c.f(parcel, 2, this.f41050b, false);
        S8.c.q(parcel, 3, this.f41051c, false);
        S8.c.e(parcel, 4, this.f41052d, false);
        S8.c.j(parcel, 5, this.f41053e);
        S8.c.n(parcel, 6, this.f41054f);
        S8.c.q(parcel, 7, this.f41055g, false);
        S8.c.b(parcel, iA);
    }
}
