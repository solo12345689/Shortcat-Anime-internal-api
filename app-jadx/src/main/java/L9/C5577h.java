package l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: renamed from: l9.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5577h extends S8.a implements P8.k {
    public static final Parcelable.Creator<C5577h> CREATOR = new C5578i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f52719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52720b;

    public C5577h(List list, String str) {
        this.f52719a = list;
        this.f52720b = str;
    }

    @Override // P8.k
    public final Status b() {
        return this.f52720b != null ? Status.f38933f : Status.f38937j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f52719a;
        int iA = S8.c.a(parcel);
        S8.c.r(parcel, 1, list, false);
        S8.c.q(parcel, 2, this.f52720b, false);
        S8.c.b(parcel, iA);
    }
}
