package l8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.IOException;
import m8.C5647a;
import m8.C5648b;

/* JADX INFO: renamed from: l8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5566h extends com.github.penfeizhou.animation.decode.a {
    public C5566h(C5647a c5647a, int i10, int i11) {
        super(c5647a);
        this.frameWidth = i10;
        this.frameHeight = i11;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, C5648b c5648b) {
        Bitmap bitmapDecodeStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap2 = null;
        try {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(((C5647a) this.reader).toInputStream(), null, options);
            } catch (IOException e10) {
                e = e10;
                e.printStackTrace();
                return bitmap2;
            }
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = false;
            options2.inSampleSize = i10;
            options2.inMutable = true;
            bitmapDecodeStream = BitmapFactory.decodeStream(((C5647a) this.reader).toInputStream(), null, options2);
        }
        try {
            paint.setXfermode(null);
            canvas.drawBitmap(bitmapDecodeStream, 0.0f, 0.0f, paint);
            return bitmapDecodeStream;
        } catch (IOException e12) {
            e = e12;
            bitmap2 = bitmapDecodeStream;
            e.printStackTrace();
            return bitmap2;
        }
    }
}
