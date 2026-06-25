package K8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends S8.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: a */
    final int f10940a;

    /* JADX INFO: renamed from: b */
    private int f10941b;

    /* JADX INFO: renamed from: c */
    private Bundle f10942c;

    a(int i10, int i11, Bundle bundle) {
        this.f10940a = i10;
        this.f10941b = i11;
        this.f10942c = bundle;
    }

    public int c() {
        return this.f10941b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, this.f10940a);
        S8.c.j(parcel, 2, c());
        S8.c.e(parcel, 3, this.f10942c, false);
        S8.c.b(parcel, iA);
    }
}
