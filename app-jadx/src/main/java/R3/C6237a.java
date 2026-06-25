package r3;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import s2.C6406d;
import t2.AbstractC6614a;
import t2.AbstractC6622i;

/* JADX INFO: renamed from: r3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6237a {
    public d a(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new d(AbstractC6622i.d(new C6406d(), (ArrayList) AbstractC6614a.e(bundle.getParcelableArrayList("c"))), j10, bundle.getLong("d"));
    }
}
