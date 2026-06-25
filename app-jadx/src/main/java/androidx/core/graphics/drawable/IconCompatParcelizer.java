package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f28925a = aVar.p(iconCompat.f28925a, 1);
        iconCompat.f28927c = aVar.j(iconCompat.f28927c, 2);
        iconCompat.f28928d = aVar.r(iconCompat.f28928d, 3);
        iconCompat.f28929e = aVar.p(iconCompat.f28929e, 4);
        iconCompat.f28930f = aVar.p(iconCompat.f28930f, 5);
        iconCompat.f28931g = (ColorStateList) aVar.r(iconCompat.f28931g, 6);
        iconCompat.f28933i = aVar.t(iconCompat.f28933i, 7);
        iconCompat.f28934j = aVar.t(iconCompat.f28934j, 8);
        iconCompat.k();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.l(aVar.f());
        int i10 = iconCompat.f28925a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f28927c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f28928d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f28929e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f28930f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f28931g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f28933i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f28934j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
