package R8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class T extends S8.a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f15224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Scope[] f15227d;

    T(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f15224a = i10;
        this.f15225b = i11;
        this.f15226c = i12;
        this.f15227d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f15224a;
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, i11);
        S8.c.j(parcel, 2, this.f15225b);
        S8.c.j(parcel, 3, this.f15226c);
        S8.c.s(parcel, 4, this.f15227d, i10, false);
        S8.c.b(parcel, iA);
    }
}
