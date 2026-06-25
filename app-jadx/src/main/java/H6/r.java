package H6;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements i {
    @Override // B5.f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i10) / 2.0d), Bitmap.Config.RGB_565);
        AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // B5.f, C5.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap value) {
        AbstractC5504s.h(value, "value");
        value.recycle();
    }
}
