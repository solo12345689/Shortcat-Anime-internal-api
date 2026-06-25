package Y0;

import Y0.K;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static final a0 a() {
        return Build.VERSION.SDK_INT >= 28 ? new c0() : new d0();
    }

    public static final String b(String str, L l10) {
        int iV = l10.v() / 100;
        if (iV >= 0 && iV < 2) {
            return str + "-thin";
        }
        if (2 <= iV && iV < 4) {
            return str + "-light";
        }
        if (iV == 4) {
            return str;
        }
        if (iV == 5) {
            return str + "-medium";
        }
        if ((6 <= iV && iV < 8) || 8 > iV || iV >= 11) {
            return str;
        }
        return str + "-black";
    }

    public static final Typeface c(Typeface typeface, K.d dVar, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? o0.f22708a.a(typeface, dVar, context) : typeface;
    }
}
