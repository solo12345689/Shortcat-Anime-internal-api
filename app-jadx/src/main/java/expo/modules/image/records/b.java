package expo.modules.image.records;

import Ib.k;
import android.content.Context;
import k5.f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static double a(b bVar) {
            return ((double) (bVar.getWidth() * bVar.getHeight())) * bVar.getScale() * bVar.getScale();
        }

        public static boolean b(b bVar) {
            return true;
        }
    }

    k createGlideModelProvider(Context context);

    f createGlideOptions(Context context);

    int getHeight();

    double getPixelCount();

    double getScale();

    int getWidth();

    boolean usesPlaceholderContentFit();
}
