package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class G extends S8.a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f40765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40767d;

    G(G g10, long j10) {
        AbstractC2115p.l(g10);
        this.f40764a = g10.f40764a;
        this.f40765b = g10.f40765b;
        this.f40766c = g10.f40766c;
        this.f40767d = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f40765b);
        String str = this.f40766c;
        int length = String.valueOf(str).length();
        String str2 = this.f40764a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        H.a(this, parcel, i10);
    }

    public G(String str, E e10, String str2, long j10) {
        this.f40764a = str;
        this.f40765b = e10;
        this.f40766c = str2;
        this.f40767d = j10;
    }
}
