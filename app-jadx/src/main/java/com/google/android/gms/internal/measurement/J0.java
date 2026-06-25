package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class J0 extends S8.a {
    public static final Parcelable.Creator<J0> CREATOR = new K0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f39396c;

    public J0(int i10, String str, Intent intent) {
        this.f39394a = i10;
        this.f39395b = str;
        this.f39396c = intent;
    }

    public static J0 c(Activity activity) {
        return new J0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        return this.f39394a == j02.f39394a && Objects.equals(this.f39395b, j02.f39395b) && Objects.equals(this.f39396c, j02.f39396c);
    }

    public final int hashCode() {
        return this.f39394a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f39394a;
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, i11);
        S8.c.q(parcel, 2, this.f39395b, false);
        S8.c.p(parcel, 3, this.f39396c, i10, false);
        S8.c.b(parcel, iA);
    }
}
