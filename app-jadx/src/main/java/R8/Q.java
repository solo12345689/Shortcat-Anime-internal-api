package R8;

import R8.InterfaceC2109j;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q extends S8.a {
    public static final Parcelable.Creator<Q> CREATOR = new S();

    /* JADX INFO: renamed from: a */
    final int f15219a;

    /* JADX INFO: renamed from: b */
    final IBinder f15220b;

    /* JADX INFO: renamed from: c */
    private final ConnectionResult f15221c;

    /* JADX INFO: renamed from: d */
    private final boolean f15222d;

    /* JADX INFO: renamed from: e */
    private final boolean f15223e;

    Q(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f15219a = i10;
        this.f15220b = iBinder;
        this.f15221c = connectionResult;
        this.f15222d = z10;
        this.f15223e = z11;
    }

    public final ConnectionResult c() {
        return this.f15221c;
    }

    public final InterfaceC2109j d() {
        IBinder iBinder = this.f15220b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC2109j.a.e(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return this.f15221c.equals(q10.f15221c) && AbstractC2113n.a(d(), q10.d());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, this.f15219a);
        S8.c.i(parcel, 2, this.f15220b, false);
        S8.c.p(parcel, 3, this.f15221c, i10, false);
        S8.c.c(parcel, 4, this.f15222d);
        S8.c.c(parcel, 5, this.f15223e);
        S8.c.b(parcel, iA);
    }
}
