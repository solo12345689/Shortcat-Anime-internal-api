package R8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: R8.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2104e extends S8.a {
    public static final Parcelable.Creator<C2104e> CREATOR = new n0();

    /* JADX INFO: renamed from: a */
    private final r f15285a;

    /* JADX INFO: renamed from: b */
    private final boolean f15286b;

    /* JADX INFO: renamed from: c */
    private final boolean f15287c;

    /* JADX INFO: renamed from: d */
    private final int[] f15288d;

    /* JADX INFO: renamed from: e */
    private final int f15289e;

    /* JADX INFO: renamed from: f */
    private final int[] f15290f;

    public C2104e(r rVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f15285a = rVar;
        this.f15286b = z10;
        this.f15287c = z11;
        this.f15288d = iArr;
        this.f15289e = i10;
        this.f15290f = iArr2;
    }

    public int c() {
        return this.f15289e;
    }

    public int[] d() {
        return this.f15288d;
    }

    public int[] e() {
        return this.f15290f;
    }

    public boolean f() {
        return this.f15286b;
    }

    public boolean i() {
        return this.f15287c;
    }

    public final r l() {
        return this.f15285a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.p(parcel, 1, this.f15285a, i10, false);
        S8.c.c(parcel, 2, f());
        S8.c.c(parcel, 3, i());
        S8.c.k(parcel, 4, d(), false);
        S8.c.j(parcel, 5, c());
        S8.c.k(parcel, 6, e(), false);
        S8.c.b(parcel, iA);
    }
}
