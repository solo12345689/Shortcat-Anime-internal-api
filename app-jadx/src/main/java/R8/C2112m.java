package R8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: R8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2112m extends S8.a {
    public static final Parcelable.Creator<C2112m> CREATOR = new J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f15337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f15338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f15339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f15340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f15341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f15342i;

    public C2112m(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f15334a = i10;
        this.f15335b = i11;
        this.f15336c = i12;
        this.f15337d = j10;
        this.f15338e = j11;
        this.f15339f = str;
        this.f15340g = str2;
        this.f15341h = i13;
        this.f15342i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f15334a;
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, i11);
        S8.c.j(parcel, 2, this.f15335b);
        S8.c.j(parcel, 3, this.f15336c);
        S8.c.n(parcel, 4, this.f15337d);
        S8.c.n(parcel, 5, this.f15338e);
        S8.c.q(parcel, 6, this.f15339f, false);
        S8.c.q(parcel, 7, this.f15340g, false);
        S8.c.j(parcel, 8, this.f15341h);
        S8.c.j(parcel, 9, this.f15342i);
        S8.c.b(parcel, iA);
    }
}
