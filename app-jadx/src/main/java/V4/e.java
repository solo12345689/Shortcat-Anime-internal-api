package V4;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements d {
    @Override // V4.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // V4.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // V4.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }

    @Override // V4.d
    public void b() {
    }

    @Override // V4.d
    public void a(int i10) {
    }
}
