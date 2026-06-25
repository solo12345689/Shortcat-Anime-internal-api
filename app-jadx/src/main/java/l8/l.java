package l8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import j8.InterfaceC5342b;
import m8.C5647a;
import m8.C5648b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class l extends com.github.penfeizhou.animation.decode.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f52702A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f52703B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f52704C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private C5648b f52705D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Paint f52706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Paint f52707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f52708y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f52709z;

    public l(InterfaceC5342b interfaceC5342b, b.j jVar) {
        super(interfaceC5342b, jVar);
        Paint paint = new Paint();
        this.f52706w = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        Bitmap bitmapI;
        Bitmap bitmapI2;
        int i10;
        if (aVar == null || this.f38761p == null || this.f38761p.width() <= 0 || this.f38761p.height() <= 0 || (bitmapI = I(this.f38761p.width() / this.f38756k, this.f38761p.height() / this.f38756k)) == null) {
            return;
        }
        Canvas canvas = (Canvas) this.f38759n.get(bitmapI);
        if (canvas == null) {
            canvas = new Canvas(bitmapI);
            this.f38759n.put(bitmapI, canvas);
        }
        Canvas canvas2 = canvas;
        this.f38760o.rewind();
        bitmapI.copyPixelsFromBuffer(this.f38760o);
        int i11 = this.f38750e;
        if (i11 != 0) {
            com.github.penfeizhou.animation.decode.a aVar2 = (com.github.penfeizhou.animation.decode.a) this.f38749d.get(i11 - 1);
            if ((aVar2 instanceof C5562d) && ((C5562d) aVar2).f52689d) {
                int i12 = aVar2.frameX;
                int i13 = this.f38756k;
                canvas2.drawRect((i12 * 2.0f) / i13, (aVar2.frameY * 2.0f) / i13, ((i12 * 2) + aVar2.frameWidth) / i13, ((r7 * 2) + aVar2.frameHeight) / i13, this.f52706w);
            }
        } else if (this.f52703B) {
            canvas2.drawColor(0, PorterDuff.Mode.SRC);
        } else {
            canvas2.drawColor(this.f52704C, PorterDuff.Mode.SRC);
        }
        int i14 = aVar.frameWidth;
        if (i14 <= 0 || (i10 = aVar.frameHeight) <= 0) {
            bitmapI2 = null;
        } else {
            int i15 = this.f38756k;
            bitmapI2 = I(i14 / i15, i10 / i15);
        }
        Bitmap bitmap = bitmapI2;
        L(aVar.draw(canvas2, this.f52707x, this.f38756k, bitmap, C()));
        L(bitmap);
        this.f38760o.rewind();
        bitmapI.copyPixelsToBuffer(this.f38760o);
        L(bitmapI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public C5647a A(Reader reader) {
        return new C5647a(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public C5648b C() {
        if (this.f52705D == null) {
            this.f52705D = new C5648b();
        }
        return this.f52705D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(C5647a c5647a) {
        boolean z10 = false;
        boolean z11 = false;
        for (C5563e c5563e : m.b(c5647a)) {
            if (c5563e instanceof C5569k) {
                C5569k c5569k = (C5569k) c5563e;
                this.f52709z = c5569k.f52700e;
                this.f52702A = c5569k.f52701f;
                this.f52703B = c5569k.d();
                z11 = true;
            } else if (c5563e instanceof C5560b) {
                C5560b c5560b = (C5560b) c5563e;
                this.f52704C = c5560b.f52672d;
                this.f52708y = c5560b.f52673e;
                z10 = true;
            } else if (c5563e instanceof C5561c) {
                this.f38749d.add(new C5562d(c5647a, (C5561c) c5563e));
            }
        }
        if (!z10) {
            if (!z11) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(c5647a.toInputStream(), null, options);
                this.f52709z = options.outWidth;
                this.f52702A = options.outHeight;
            }
            this.f38749d.add(new C5566h(c5647a, this.f52709z, this.f52702A));
            this.f52708y = 1;
        }
        Paint paint = new Paint();
        this.f52707x = paint;
        paint.setAntiAlias(true);
        if (!this.f52703B) {
            this.f52706w.setColor(this.f52704C);
        }
        return new Rect(0, 0, this.f52709z, this.f52702A);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f52708y;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
    }
}
