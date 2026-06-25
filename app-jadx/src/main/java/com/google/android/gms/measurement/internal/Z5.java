package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z5 extends S8.a {
    public static final Parcelable.Creator<Z5> CREATOR = new C3769a6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41084a;

    Z5(List list) {
        this.f41084a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f41084a;
        int iA = S8.c.a(parcel);
        S8.c.t(parcel, 1, list, false);
        S8.c.b(parcel, iA);
    }
}
