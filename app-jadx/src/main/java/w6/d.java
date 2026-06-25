package w6;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public C5.a a(int i10, int i11) {
        return b(i10, i11, Bitmap.Config.ARGB_8888);
    }

    public C5.a b(int i10, int i11, Bitmap.Config config) {
        return c(i10, i11, config, null);
    }

    public C5.a c(int i10, int i11, Bitmap.Config config, Object obj) {
        return d(i10, i11, config);
    }

    public abstract C5.a d(int i10, int i11, Bitmap.Config config);
}
