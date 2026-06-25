package Wb;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        String strEncodeToString = Base64.encodeToString(bArrMarshall, 0);
        AbstractC5504s.g(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(null);
        parcelObtain.recycle();
        return bundle;
    }
}
