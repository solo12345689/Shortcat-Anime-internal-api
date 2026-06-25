package Rd;

import S4.f;
import V4.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RSRuntimeException;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15466c;

    public b(int i10, int i11) {
        this.f15465b = i10;
        this.f15466c = i11;
    }

    @Override // S4.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.BlurTransformation.1" + this.f15465b + this.f15466c).getBytes(f.f15942a));
    }

    @Override // Rd.a
    protected Bitmap d(Context context, d dVar, Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = this.f15466c;
        Bitmap bitmapD = dVar.d(width / i12, height / i12, Bitmap.Config.ARGB_8888);
        c(bitmap, bitmapD);
        Canvas canvas = new Canvas(bitmapD);
        int i13 = this.f15466c;
        canvas.scale(1.0f / i13, 1.0f / i13);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            return Sd.b.a(context, bitmapD, this.f15465b);
        } catch (RSRuntimeException unused) {
            return Sd.a.a(bitmapD, this.f15465b, true);
        }
    }

    @Override // S4.f
    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f15465b == this.f15465b && bVar.f15466c == this.f15466c;
    }

    @Override // S4.f
    public int hashCode() {
        return 737513610 + (this.f15465b * 1000) + (this.f15466c * 10);
    }

    public String toString() {
        return "BlurTransformation(radius=" + this.f15465b + ", sampling=" + this.f15466c + ")";
    }
}
