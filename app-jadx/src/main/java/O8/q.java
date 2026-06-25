package O8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends S8.a {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* JADX INFO: renamed from: a */
    private final boolean f13065a;

    /* JADX INFO: renamed from: b */
    private final String f13066b;

    /* JADX INFO: renamed from: c */
    private final int f13067c;

    /* JADX INFO: renamed from: d */
    private final int f13068d;

    /* JADX INFO: renamed from: e */
    private final long f13069e;

    q(boolean z10, String str, int i10, int i11, long j10) {
        this.f13065a = z10;
        this.f13066b = str;
        this.f13067c = s.a(i10) - 1;
        this.f13068d = p.a(i11) - 1;
        this.f13069e = j10;
    }

    public final String c() {
        return this.f13066b;
    }

    public final long d() {
        return this.f13069e;
    }

    public final int e() {
        return s.a(this.f13067c);
    }

    public final int f() {
        return p.a(this.f13068d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.c(parcel, 1, this.f13065a);
        S8.c.q(parcel, 2, this.f13066b, false);
        S8.c.j(parcel, 3, this.f13067c);
        S8.c.j(parcel, 4, this.f13068d);
        S8.c.n(parcel, 5, this.f13069e);
        S8.c.b(parcel, iA);
    }

    public final boolean zza() {
        return this.f13065a;
    }
}
