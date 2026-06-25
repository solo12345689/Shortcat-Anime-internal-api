package r3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import s2.C6403a;
import t2.AbstractC6622i;

/* JADX INFO: renamed from: r3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6239c {
    public byte[] a(List list, long j10) {
        ArrayList<? extends Parcelable> arrayListH = AbstractC6622i.h(list, new O9.f() { // from class: r3.b
            @Override // O9.f
            public final Object apply(Object obj) {
                return ((C6403a) obj).e();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListH);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
