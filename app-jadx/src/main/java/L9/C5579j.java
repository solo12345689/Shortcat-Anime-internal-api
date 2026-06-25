package l9;

import R8.O;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l9.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5579j extends S8.a {
    public static final Parcelable.Creator<C5579j> CREATOR = new C5580k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f52721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final O f52722b;

    C5579j(int i10, O o10) {
        this.f52721a = i10;
        this.f52722b = o10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, this.f52721a);
        S8.c.p(parcel, 2, this.f52722b, i10, false);
        S8.c.b(parcel, iA);
    }
}
