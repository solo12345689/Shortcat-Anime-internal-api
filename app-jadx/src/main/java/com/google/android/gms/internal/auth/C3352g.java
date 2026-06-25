package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3352g extends S8.a {
    public static final Parcelable.Creator<C3352g> CREATOR = new C3355h();

    /* JADX INFO: renamed from: a */
    final int f39175a;

    /* JADX INFO: renamed from: b */
    String f39176b;

    public C3352g() {
        this.f39175a = 1;
    }

    public final C3352g c(String str) {
        this.f39176b = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, this.f39175a);
        S8.c.q(parcel, 2, this.f39176b, false);
        S8.c.b(parcel, iA);
    }

    C3352g(int i10, String str) {
        this.f39175a = i10;
        this.f39176b = str;
    }
}
