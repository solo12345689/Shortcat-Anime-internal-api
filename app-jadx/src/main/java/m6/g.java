package M6;

import E6.k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements c {

    /* JADX INFO: renamed from: d */
    public static final a f12241d = new a(null);

    /* JADX INFO: renamed from: a */
    private final boolean f12242a;

    /* JADX INFO: renamed from: b */
    private final int f12243b;

    /* JADX INFO: renamed from: c */
    private final String f12244c = "SimpleImageTranscoder";

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bitmap.CompressFormat b(q6.c cVar) {
            return cVar == null ? Bitmap.CompressFormat.JPEG : cVar == q6.b.f57656b ? Bitmap.CompressFormat.JPEG : cVar == q6.b.f57657c ? Bitmap.CompressFormat.PNG : q6.b.a(cVar) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }

        private a() {
        }
    }

    public g(boolean z10, int i10) {
        this.f12242a = z10;
        this.f12243b = i10;
    }

    private final int e(k kVar, y6.h hVar, y6.g gVar) {
        if (this.f12242a) {
            return M6.a.b(hVar, gVar, kVar, this.f12243b);
        }
        return 1;
    }

    @Override // M6.c
    public String a() {
        return this.f12244c;
    }

    @Override // M6.c
    public b b(k encodedImage, OutputStream outputStream, y6.h hVar, y6.g gVar, q6.c cVar, Integer num, ColorSpace colorSpace) throws Throwable {
        Bitmap bitmapCreateBitmap;
        AbstractC5504s.h(encodedImage, "encodedImage");
        AbstractC5504s.h(outputStream, "outputStream");
        Integer num2 = num == null ? 85 : num;
        y6.h hVarA = hVar == null ? y6.h.f64872c.a() : hVar;
        int iE = e(encodedImage, hVarA, gVar);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iE;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.q(), null, options);
            if (bitmapDecodeStream == null) {
                AbstractC7283a.m("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new b(2);
            }
            Matrix matrixG = e.g(encodedImage, hVarA);
            if (matrixG != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrixG, false);
                } catch (OutOfMemoryError e10) {
                    e = e10;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    AbstractC7283a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    b bVar = new b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmapCreateBitmap.compress(f12241d.b(cVar), num2.intValue(), outputStream);
                    b bVar2 = new b(iE > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return bVar2;
                } catch (Throwable th3) {
                    th = th3;
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } catch (OutOfMemoryError e11) {
                e = e11;
                AbstractC7283a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                b bVar3 = new b(2);
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                return bVar3;
            }
        } catch (OutOfMemoryError e12) {
            AbstractC7283a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e12);
            return new b(2);
        }
    }

    @Override // M6.c
    public boolean c(k encodedImage, y6.h hVar, y6.g gVar) {
        AbstractC5504s.h(encodedImage, "encodedImage");
        if (hVar == null) {
            hVar = y6.h.f64872c.a();
        }
        return this.f12242a && M6.a.b(hVar, gVar, encodedImage, this.f12243b) > 1;
    }

    @Override // M6.c
    public boolean d(q6.c imageFormat) {
        AbstractC5504s.h(imageFormat, "imageFormat");
        return imageFormat == q6.b.f57666l || imageFormat == q6.b.f57656b;
    }
}
