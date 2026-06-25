package R8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends S8.a {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f15330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    O8.c[] f15331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f15332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C2104e f15333d;

    l0(Bundle bundle, O8.c[] cVarArr, int i10, C2104e c2104e) {
        this.f15330a = bundle;
        this.f15331b = cVarArr;
        this.f15332c = i10;
        this.f15333d = c2104e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.e(parcel, 1, this.f15330a, false);
        S8.c.s(parcel, 2, this.f15331b, i10, false);
        S8.c.j(parcel, 3, this.f15332c);
        S8.c.p(parcel, 4, this.f15333d, i10, false);
        S8.c.b(parcel, iA);
    }
}
