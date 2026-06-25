package R8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class r extends S8.a {
    public static final Parcelable.Creator<r> CREATOR = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f15363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f15365e;

    public r(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f15361a = i10;
        this.f15362b = z10;
        this.f15363c = z11;
        this.f15364d = i11;
        this.f15365e = i12;
    }

    public int c() {
        return this.f15364d;
    }

    public int d() {
        return this.f15365e;
    }

    public boolean e() {
        return this.f15362b;
    }

    public boolean f() {
        return this.f15363c;
    }

    public int i() {
        return this.f15361a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, i());
        S8.c.c(parcel, 2, e());
        S8.c.c(parcel, 3, f());
        S8.c.j(parcel, 4, c());
        S8.c.j(parcel, 5, d());
        S8.c.b(parcel, iA);
    }
}
