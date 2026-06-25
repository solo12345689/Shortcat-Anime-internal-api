package Z7;

import a8.C2585a;
import a8.C2586b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class k extends com.github.penfeizhou.animation.decode.a {
    public k(C2585a c2585a) {
        super(c2585a);
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, C2586b c2586b) {
        Bitmap bitmapDecodeStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap2 = null;
        try {
            ((C2585a) this.reader).reset();
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(((C2585a) this.reader).toInputStream(), null, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i10;
                options2.inMutable = true;
                bitmapDecodeStream = BitmapFactory.decodeStream(((C2585a) this.reader).toInputStream(), null, options2);
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            paint.setXfermode(null);
            canvas.drawBitmap(bitmapDecodeStream, 0.0f, 0.0f, paint);
            return bitmapDecodeStream;
        } catch (IOException e11) {
            e = e11;
            bitmap2 = bitmapDecodeStream;
            e.printStackTrace();
            return bitmap2;
        }
    }
}
