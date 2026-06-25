package Z7;

import a8.C2585a;
import a8.C2586b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends com.github.penfeizhou.animation.decode.a {

    /* JADX INFO: renamed from: f */
    private static final byte[] f23202f = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: g */
    private static final byte[] f23203g = {0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

    /* JADX INFO: renamed from: h */
    private static final ThreadLocal f23204h = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final byte f23205a;

    /* JADX INFO: renamed from: b */
    public final byte f23206b;

    /* JADX INFO: renamed from: c */
    byte[] f23207c;

    /* JADX INFO: renamed from: d */
    List f23208d;

    /* JADX INFO: renamed from: e */
    List f23209e;

    public c(C2585a c2585a, f fVar) {
        super(c2585a);
        this.f23208d = new ArrayList();
        this.f23209e = new ArrayList();
        this.f23205a = fVar.f23223m;
        this.f23206b = fVar.f23222l;
        int i10 = fVar.f23220j * 1000;
        short s10 = fVar.f23221k;
        int i11 = i10 / (s10 == 0 ? (short) 100 : s10);
        this.frameDuration = i11;
        if (i11 < 10) {
            this.frameDuration = 100;
        }
        this.frameWidth = fVar.f23216f;
        this.frameHeight = fVar.f23217g;
        this.frameX = fVar.f23218h;
        this.frameY = fVar.f23219i;
    }

    private int b(C2586b c2586b) {
        int i10;
        Iterator it = this.f23209e.iterator();
        int i11 = 33;
        while (it.hasNext()) {
            i11 += ((e) it.next()).f23210a + 12;
        }
        for (e eVar : this.f23208d) {
            if (eVar instanceof h) {
                i10 = eVar.f23210a + 12;
            } else if (eVar instanceof g) {
                i10 = eVar.f23210a + 8;
            }
            i11 += i10;
        }
        int length = i11 + f23203g.length;
        c2586b.d(length);
        c2586b.c(f23202f);
        c2586b.h(13);
        int iA = c2586b.a();
        c2586b.g(j.f23228h);
        c2586b.h(this.frameWidth);
        c2586b.h(this.frameHeight);
        c2586b.c(this.f23207c);
        CRC32 crc32C = c();
        crc32C.reset();
        crc32C.update(c2586b.f(), iA, 17);
        c2586b.h((int) crc32C.getValue());
        for (e eVar2 : this.f23209e) {
            if (!(eVar2 instanceof i)) {
                ((C2585a) this.reader).reset();
                ((C2585a) this.reader).skip(eVar2.f23213d);
                ((C2585a) this.reader).read(c2586b.f(), c2586b.a(), eVar2.f23210a + 12);
                c2586b.e(eVar2.f23210a + 12);
            }
        }
        for (e eVar3 : this.f23208d) {
            if (eVar3 instanceof h) {
                ((C2585a) this.reader).reset();
                ((C2585a) this.reader).skip(eVar3.f23213d);
                ((C2585a) this.reader).read(c2586b.f(), c2586b.a(), eVar3.f23210a + 12);
                c2586b.e(eVar3.f23210a + 12);
            } else if (eVar3 instanceof g) {
                c2586b.h(eVar3.f23210a - 4);
                int iA2 = c2586b.a();
                c2586b.g(h.f23226e);
                ((C2585a) this.reader).reset();
                ((C2585a) this.reader).skip(eVar3.f23213d + 12);
                ((C2585a) this.reader).read(c2586b.f(), c2586b.a(), eVar3.f23210a - 4);
                c2586b.e(eVar3.f23210a - 4);
                crc32C.reset();
                crc32C.update(c2586b.f(), iA2, eVar3.f23210a);
                c2586b.h((int) crc32C.getValue());
            }
        }
        c2586b.c(f23203g);
        return length;
    }

    private CRC32 c() {
        ThreadLocal threadLocal = f23204h;
        CRC32 crc32 = (CRC32) threadLocal.get();
        if (crc32 != null) {
            return crc32;
        }
        CRC32 crc322 = new CRC32();
        threadLocal.set(crc322);
        return crc322;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* JADX INFO: renamed from: a */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, C2586b c2586b) {
        Bitmap bitmapDecodeByteArray;
        try {
            int iB = b(c2586b);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inSampleSize = i10;
            options.inMutable = true;
            options.inBitmap = bitmap;
            byte[] bArrF = c2586b.f();
            try {
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrF, 0, iB, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i10;
                options2.inMutable = true;
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrF, 0, iB, options2);
            }
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmapDecodeByteArray.getWidth();
            this.srcRect.bottom = bitmapDecodeByteArray.getHeight();
            Rect rect2 = this.dstRect;
            int i11 = this.frameX;
            float f10 = i10;
            rect2.left = (int) (i11 / f10);
            rect2.top = (int) (this.frameY / f10);
            rect2.right = (int) ((i11 / f10) + bitmapDecodeByteArray.getWidth());
            this.dstRect.bottom = (int) ((this.frameY / f10) + bitmapDecodeByteArray.getHeight());
            canvas.drawBitmap(bitmapDecodeByteArray, this.srcRect, this.dstRect, paint);
            return bitmapDecodeByteArray;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
