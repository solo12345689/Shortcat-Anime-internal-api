package j9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class J extends S8.a {
    public static final Parcelable.Creator<J> CREATOR = new K();

    /* JADX INFO: renamed from: a */
    public final List f51698a;

    J(List list) {
        this.f51698a = list;
    }

    public static J c(G... gArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(gArr[0].zza()));
        return new J(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f51698a;
        int iA = S8.c.a(parcel);
        S8.c.l(parcel, 1, list, false);
        S8.c.b(parcel, iA);
    }
}
