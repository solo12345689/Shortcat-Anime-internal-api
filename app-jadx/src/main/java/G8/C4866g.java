package g8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.gif.decode.GifFrame;
import com.github.penfeizhou.animation.gif.io.GifReader;
import com.github.penfeizhou.animation.io.Reader;
import h8.C4923a;
import j8.InterfaceC5342b;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: g8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4866g extends com.github.penfeizhou.animation.decode.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f47373A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C4923a f47374w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Paint f47375x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f47376y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final b f47377z;

    /* JADX INFO: renamed from: g8.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ByteBuffer f47378a;

        private b() {
        }
    }

    public C4866g(InterfaceC5342b interfaceC5342b, b.j jVar) {
        super(interfaceC5342b, jVar);
        this.f47374w = new C4923a();
        Paint paint = new Paint();
        this.f47375x = paint;
        this.f47376y = 0;
        this.f47377z = new b();
        this.f47373A = 1;
        paint.setAntiAlias(true);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
        this.f47377z.f47378a = null;
        this.f47374w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        GifFrame gifFrame = (GifFrame) aVar;
        Bitmap bitmapI = I(this.f38761p.width() / this.f38756k, this.f38761p.height() / this.f38756k);
        Canvas canvas = (Canvas) this.f38759n.get(bitmapI);
        if (canvas == null) {
            canvas = new Canvas(bitmapI);
            this.f38759n.put(bitmapI, canvas);
        }
        this.f38760o.rewind();
        bitmapI.copyPixelsFromBuffer(this.f38760o);
        int i10 = !gifFrame.transparencyFlag() ? this.f47376y : 0;
        int i11 = this.f38750e;
        if (i11 == 0) {
            bitmapI.eraseColor(i10);
        } else {
            GifFrame gifFrame2 = (GifFrame) this.f38749d.get(i11 - 1);
            canvas.save();
            int i12 = gifFrame2.frameX;
            int i13 = this.f38756k;
            int i14 = gifFrame2.frameY;
            canvas.clipRect(i12 / i13, i14 / i13, (i12 + gifFrame2.frameWidth) / i13, (i14 + gifFrame2.frameHeight) / i13);
            int i15 = gifFrame2.disposalMethod;
            if (i15 == 2) {
                canvas.drawColor(this.f47376y, PorterDuff.Mode.CLEAR);
            } else if (i15 == 3) {
                this.f47377z.f47378a.rewind();
                canvas.drawColor(this.f47376y, PorterDuff.Mode.CLEAR);
                Bitmap bitmapI2 = I(this.f38761p.width() / this.f38756k, this.f38761p.height() / this.f38756k);
                bitmapI2.copyPixelsFromBuffer(this.f47377z.f47378a);
                canvas.drawBitmap(bitmapI2, 0.0f, 0.0f, this.f47375x);
                L(bitmapI2);
            }
            canvas.restore();
            if (gifFrame.disposalMethod == 3 && gifFrame2.disposalMethod != 3) {
                this.f38760o.rewind();
                this.f47377z.f47378a.rewind();
                this.f47377z.f47378a.put(this.f38760o);
            }
        }
        int i16 = aVar.frameWidth;
        int i17 = this.f38756k;
        Bitmap bitmapI3 = I(i16 / i17, aVar.frameHeight / i17);
        gifFrame.draw(canvas, this.f47375x, this.f38756k, bitmapI3, C());
        canvas.drawColor(i10, PorterDuff.Mode.DST_OVER);
        L(bitmapI3);
        this.f38760o.rewind();
        bitmapI.copyPixelsToBuffer(this.f38760o);
        L(bitmapI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public GifReader A(Reader reader) {
        return new GifReader(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public C4923a C() {
        if (this.f47374w == null) {
            this.f47374w = new C4923a();
        }
        return this.f47374w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(GifReader gifReader) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        C4862c c4862c = null;
        C4868i c4868i = null;
        for (InterfaceC4861b interfaceC4861b : AbstractC4867h.c(gifReader)) {
            if (interfaceC4861b instanceof k) {
                k kVar = (k) interfaceC4861b;
                i11 = kVar.f47391a;
                i12 = kVar.f47392b;
                if (kVar.b()) {
                    i10 = kVar.f47394d & 255;
                }
            } else if (interfaceC4861b instanceof C4862c) {
                c4862c = (C4862c) interfaceC4861b;
            } else if (interfaceC4861b instanceof C4868i) {
                c4868i = (C4868i) interfaceC4861b;
            } else if (interfaceC4861b instanceof j) {
                this.f38749d.add(new GifFrame(gifReader, c4862c, c4868i, (j) interfaceC4861b));
            } else if (interfaceC4861b instanceof C4860a) {
                C4860a c4860a = (C4860a) interfaceC4861b;
                if ("NETSCAPE2.0".equals(c4860a.f47367b)) {
                    int i13 = c4860a.f47366a;
                    if (i13 == 0) {
                        this.f47373A = 0;
                    } else if (i13 > 0) {
                        this.f47373A = i13 + 1;
                    }
                }
            }
        }
        int i14 = this.f38756k;
        long j10 = (((((long) i11) * ((long) i12)) / (((long) i14) * ((long) i14))) + 1) * 4;
        int i15 = (int) j10;
        try {
            this.f38760o = ByteBuffer.allocate(i15);
            this.f47377z.f47378a = ByteBuffer.allocate(i15);
            if (c4862c != null && i10 >= 0 && i10 < c4862c.b().length) {
                int i16 = c4862c.b()[i10];
                this.f47376y = Color.rgb(i16 & 255, (i16 >> 8) & 255, (i16 >> 16) & 255);
            }
            return new Rect(0, 0, i11, i12);
        } catch (OutOfMemoryError e10) {
            Log.e("GifDecoder", String.format("OutOfMemoryError in GifDecoder: Buffer needed: %.2fMB (%,d bytes)", Double.valueOf(j10 / 1048576.0d), Long.valueOf(j10)));
            this.f38760o = null;
            this.f47377z.f47378a = null;
            throw e10;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int t(int i10, int i11) {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f47373A;
    }
}
