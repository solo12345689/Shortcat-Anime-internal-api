package l9;

import R8.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: l9.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5581l extends S8.a {
    public static final Parcelable.Creator<C5581l> CREATOR = new C5582m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f52723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectionResult f52724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q f52725c;

    C5581l(int i10, ConnectionResult connectionResult, Q q10) {
        this.f52723a = i10;
        this.f52724b = connectionResult;
        this.f52725c = q10;
    }

    public final ConnectionResult c() {
        return this.f52724b;
    }

    public final Q d() {
        return this.f52725c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, this.f52723a);
        S8.c.p(parcel, 2, this.f52724b, i10, false);
        S8.c.p(parcel, 3, this.f52725c, i10, false);
        S8.c.b(parcel, iA);
    }
}
