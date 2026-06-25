package J1;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }
    }

    public static Spanned a(String str, int i10) {
        return a.a(str, i10);
    }
}
