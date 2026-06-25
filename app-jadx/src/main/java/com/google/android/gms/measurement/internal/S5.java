package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class S5 extends S8.a {
    public static final Parcelable.Creator<S5> CREATOR = new T5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40964c;

    S5(String str, long j10, int i10) {
        this.f40962a = str;
        this.f40963b = j10;
        this.f40964c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f40962a;
        int iA = S8.c.a(parcel);
        S8.c.q(parcel, 1, str, false);
        S8.c.n(parcel, 2, this.f40963b);
        S8.c.j(parcel, 3, this.f40964c);
        S8.c.b(parcel, iA);
    }
}
