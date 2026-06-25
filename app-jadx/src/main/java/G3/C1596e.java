package G3;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import q2.AbstractC6079K;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: G3.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C1596e implements E {

    /* JADX INFO: renamed from: a */
    private final Resources f7138a;

    public C1596e(Resources resources) {
        this.f7138a = (Resources) AbstractC6614a.e(resources);
    }

    private String b(C6109x c6109x) {
        int i10 = c6109x.f56997G;
        return (i10 == -1 || i10 < 1) ? "" : i10 != 1 ? i10 != 2 ? (i10 == 6 || i10 == 7) ? this.f7138a.getString(B.f7027B) : i10 != 8 ? this.f7138a.getString(B.f7026A) : this.f7138a.getString(B.f7028C) : this.f7138a.getString(B.f7056z) : this.f7138a.getString(B.f7047q);
    }

    private String c(C6109x c6109x) {
        int i10 = c6109x.f57017j;
        return i10 == -1 ? "" : this.f7138a.getString(B.f7046p, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(C6109x c6109x) {
        return TextUtils.isEmpty(c6109x.f57009b) ? "" : c6109x.f57009b;
    }

    private String e(C6109x c6109x) {
        String strJ = j(f(c6109x), h(c6109x));
        return TextUtils.isEmpty(strJ) ? d(c6109x) : strJ;
    }

    private String f(C6109x c6109x) {
        String str = c6109x.f57011d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Locale localeA0 = a0.a0();
        String displayName = localeForLanguageTag.getDisplayName(localeA0);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeA0) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(C6109x c6109x) {
        int i10 = c6109x.f57029v;
        int i11 = c6109x.f57030w;
        return (i10 == -1 || i11 == -1) ? "" : this.f7138a.getString(B.f7048r, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(C6109x c6109x) {
        String string = (c6109x.f57013f & 2) != 0 ? this.f7138a.getString(B.f7049s) : "";
        if ((c6109x.f57013f & 4) != 0) {
            string = j(string, this.f7138a.getString(B.f7052v));
        }
        if ((c6109x.f57013f & 8) != 0) {
            string = j(string, this.f7138a.getString(B.f7051u));
        }
        return (c6109x.f57013f & 1088) != 0 ? j(string, this.f7138a.getString(B.f7050t)) : string;
    }

    private static int i(C6109x c6109x) {
        int iK = AbstractC6079K.k(c6109x.f57022o);
        if (iK != -1) {
            return iK;
        }
        if (AbstractC6079K.n(c6109x.f57018k) != null) {
            return 2;
        }
        if (AbstractC6079K.c(c6109x.f57018k) != null) {
            return 1;
        }
        if (c6109x.f57029v == -1 && c6109x.f57030w == -1) {
            return (c6109x.f56997G == -1 && c6109x.f56998H == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : this.f7138a.getString(B.f7045o, string, str);
            }
        }
        return string;
    }

    @Override // G3.E
    public String a(C6109x c6109x) {
        int i10 = i(c6109x);
        String strJ = i10 == 2 ? j(h(c6109x), g(c6109x), c(c6109x)) : i10 == 1 ? j(e(c6109x), b(c6109x), c(c6109x)) : e(c6109x);
        if (!strJ.isEmpty()) {
            return strJ;
        }
        String str = c6109x.f57011d;
        return (str == null || str.trim().isEmpty()) ? this.f7138a.getString(B.f7029D) : this.f7138a.getString(B.f7030E, str);
    }
}
