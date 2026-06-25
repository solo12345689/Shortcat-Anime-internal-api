package R8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: R8.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2118t extends S8.a {
    public static final Parcelable.Creator<C2118t> CREATOR = new C2123y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f15378b;

    public C2118t(int i10, List list) {
        this.f15377a = i10;
        this.f15378b = list;
    }

    public final int c() {
        return this.f15377a;
    }

    public final List d() {
        return this.f15378b;
    }

    public final void e(C2112m c2112m) {
        if (this.f15378b == null) {
            this.f15378b = new ArrayList();
        }
        this.f15378b.add(c2112m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, this.f15377a);
        S8.c.t(parcel, 2, this.f15378b, false);
        S8.c.b(parcel, iA);
    }
}
