package l9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: l9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5571b extends S8.a implements P8.k {
    public static final Parcelable.Creator<C5571b> CREATOR = new C5572c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f52716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f52718c;

    C5571b(int i10, int i11, Intent intent) {
        this.f52716a = i10;
        this.f52717b = i11;
        this.f52718c = intent;
    }

    @Override // P8.k
    public final Status b() {
        return this.f52717b == 0 ? Status.f38933f : Status.f38937j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f52716a;
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, i11);
        S8.c.j(parcel, 2, this.f52717b);
        S8.c.p(parcel, 3, this.f52718c, i10, false);
        S8.c.b(parcel, iA);
    }
}
