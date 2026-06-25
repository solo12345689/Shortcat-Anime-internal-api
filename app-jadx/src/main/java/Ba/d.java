package Ba;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final double a(float f10) {
        return f10 / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final double b(float f10) {
        return f10 * Resources.getSystem().getDisplayMetrics().density;
    }
}
