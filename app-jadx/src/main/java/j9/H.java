package j9;

import R8.AbstractC2115p;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H {
    public static String a(Context context, String str, String str2) {
        AbstractC2115p.l(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = o.a(context);
        }
        return o.b("google_app_id", resources, str2);
    }

    public static String b(String str, String[] strArr, String[] strArr2) {
        AbstractC2115p.l(strArr);
        AbstractC2115p.l(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }
}
