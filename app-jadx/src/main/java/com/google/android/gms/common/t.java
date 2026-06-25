package com.google.android.gms.common;

import Y8.a;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends S8.a {
    public static final Parcelable.Creator<t> CREATOR = new u();

    /* JADX INFO: renamed from: a */
    private final String f38978a;

    /* JADX INFO: renamed from: b */
    private final boolean f38979b;

    /* JADX INFO: renamed from: c */
    private final boolean f38980c;

    /* JADX INFO: renamed from: d */
    private final Context f38981d;

    /* JADX INFO: renamed from: e */
    private final boolean f38982e;

    /* JADX INFO: renamed from: f */
    private final boolean f38983f;

    /* JADX INFO: renamed from: g */
    private final boolean f38984g;

    t(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f38978a = str;
        this.f38979b = z10;
        this.f38980c = z11;
        this.f38981d = (Context) Y8.b.h(a.AbstractBinderC0389a.e(iBinder));
        this.f38982e = z12;
        this.f38983f = z13;
        this.f38984g = z14;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [Y8.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f38978a;
        int iA = S8.c.a(parcel);
        S8.c.q(parcel, 1, str, false);
        S8.c.c(parcel, 2, this.f38979b);
        S8.c.c(parcel, 3, this.f38980c);
        S8.c.i(parcel, 4, Y8.b.G3(this.f38981d), false);
        S8.c.c(parcel, 5, this.f38982e);
        S8.c.c(parcel, 6, this.f38983f);
        S8.c.c(parcel, 8, this.f38984g);
        S8.c.b(parcel, iA);
    }
}
