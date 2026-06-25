package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class X implements Parcelable.Creator {
    static void c(W w10, Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.e(parcel, 2, w10.f43355a, false);
        S8.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a */
    public W createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            if (S8.b.k(iP) != 2) {
                S8.b.w(parcel, iP);
            } else {
                bundleA = S8.b.a(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new W(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b */
    public W[] newArray(int i10) {
        return new W[i10];
    }
}
