package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3826i extends S8.a {
    public static final Parcelable.Creator<C3826i> CREATOR = new C3834j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v6 f41353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f41356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G f41357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f41358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public G f41359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f41360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final G f41361k;

    C3826i(C3826i c3826i) {
        AbstractC2115p.l(c3826i);
        this.f41351a = c3826i.f41351a;
        this.f41352b = c3826i.f41352b;
        this.f41353c = c3826i.f41353c;
        this.f41354d = c3826i.f41354d;
        this.f41355e = c3826i.f41355e;
        this.f41356f = c3826i.f41356f;
        this.f41357g = c3826i.f41357g;
        this.f41358h = c3826i.f41358h;
        this.f41359i = c3826i.f41359i;
        this.f41360j = c3826i.f41360j;
        this.f41361k = c3826i.f41361k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.q(parcel, 2, this.f41351a, false);
        S8.c.q(parcel, 3, this.f41352b, false);
        S8.c.p(parcel, 4, this.f41353c, i10, false);
        S8.c.n(parcel, 5, this.f41354d);
        S8.c.c(parcel, 6, this.f41355e);
        S8.c.q(parcel, 7, this.f41356f, false);
        S8.c.p(parcel, 8, this.f41357g, i10, false);
        S8.c.n(parcel, 9, this.f41358h);
        S8.c.p(parcel, 10, this.f41359i, i10, false);
        S8.c.n(parcel, 11, this.f41360j);
        S8.c.p(parcel, 12, this.f41361k, i10, false);
        S8.c.b(parcel, iA);
    }

    C3826i(String str, String str2, v6 v6Var, long j10, boolean z10, String str3, G g10, long j11, G g11, long j12, G g12) {
        this.f41351a = str;
        this.f41352b = str2;
        this.f41353c = v6Var;
        this.f41354d = j10;
        this.f41355e = z10;
        this.f41356f = str3;
        this.f41357g = g10;
        this.f41358h = j11;
        this.f41359i = g11;
        this.f41360j = j12;
        this.f41361k = g12;
    }
}
