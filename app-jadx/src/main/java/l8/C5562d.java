package l8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import java.io.IOException;
import m8.C5647a;
import m8.C5648b;

/* JADX INFO: renamed from: l8.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5562d extends com.github.penfeizhou.animation.decode.a {

    /* JADX INFO: renamed from: f */
    private static final PorterDuffXfermode f52684f = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);

    /* JADX INFO: renamed from: g */
    private static final PorterDuffXfermode f52685g = new PorterDuffXfermode(PorterDuff.Mode.SRC);

    /* JADX INFO: renamed from: a */
    final int f52686a;

    /* JADX INFO: renamed from: b */
    final int f52687b;

    /* JADX INFO: renamed from: c */
    final boolean f52688c;

    /* JADX INFO: renamed from: d */
    final boolean f52689d;

    /* JADX INFO: renamed from: e */
    private final boolean f52690e;

    public C5562d(C5647a c5647a, C5561c c5561c) {
        super(c5647a);
        this.frameWidth = c5561c.f52677f;
        this.frameHeight = c5561c.f52678g;
        this.frameX = c5561c.f52675d;
        this.frameY = c5561c.f52676e;
        int i10 = c5561c.f52679h;
        this.frameDuration = i10;
        if (i10 == 0) {
            this.frameDuration = 100;
        }
        this.f52688c = c5561c.d();
        this.f52689d = c5561c.e();
        this.f52686a = c5561c.f52693c + 24;
        int i11 = c5561c.f52692b;
        this.f52687b = (i11 - 16) + (i11 & 1);
        this.f52690e = c5561c.f52681j != null;
    }

    private int b(C5648b c5648b) {
        int i10 = 30 + this.f52687b;
        c5648b.d(i10);
        c5648b.h("RIFF");
        c5648b.j(i10);
        c5648b.h("WEBP");
        c5648b.j(C5569k.f52698g);
        c5648b.j(10);
        c5648b.b((byte) (this.f52690e ? 16 : 0));
        c5648b.i(0);
        c5648b.g(this.frameWidth);
        c5648b.g(this.frameHeight);
        try {
            ((C5647a) this.reader).reset();
            ((C5647a) this.reader).skip(this.f52686a);
            ((C5647a) this.reader).read(c5648b.f(), c5648b.a(), this.f52687b);
            return i10;
        } catch (IOException e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* JADX INFO: renamed from: a */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, C5648b c5648b) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        options.inMutable = true;
        options.inBitmap = bitmap;
        int iB = b(c5648b);
        byte[] bArrF = c5648b.f();
        try {
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrF, 0, iB, options);
        } catch (IllegalArgumentException unused) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = false;
            options2.inSampleSize = i10;
            options2.inMutable = true;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrF, 0, iB, options2);
        }
        if (bitmapDecodeByteArray == null) {
            return bitmap;
        }
        if (this.f52688c) {
            paint.setXfermode(f52685g);
        } else {
            paint.setXfermode(f52684f);
        }
        Rect rect = this.srcRect;
        rect.left = 0;
        rect.top = 0;
        rect.right = bitmapDecodeByteArray.getWidth();
        this.srcRect.bottom = bitmapDecodeByteArray.getHeight();
        Rect rect2 = this.dstRect;
        int i11 = this.frameX;
        float f10 = i10;
        rect2.left = (int) ((i11 * 2.0f) / f10);
        rect2.top = (int) ((this.frameY * 2.0f) / f10);
        rect2.right = (int) (((i11 * 2.0f) / f10) + bitmapDecodeByteArray.getWidth());
        this.dstRect.bottom = (int) (((this.frameY * 2.0f) / f10) + bitmapDecodeByteArray.getHeight());
        canvas.drawBitmap(bitmapDecodeByteArray, this.srcRect, this.dstRect, paint);
        return bitmapDecodeByteArray;
    }
}
