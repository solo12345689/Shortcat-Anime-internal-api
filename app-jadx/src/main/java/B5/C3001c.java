package b5;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import o5.AbstractC5830g;

/* JADX INFO: renamed from: b5.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3001c implements S4.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S4.g f33159b = S4.g.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S4.g f33160c = S4.g.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V4.b f33161a;

    public C3001c(V4.b bVar) {
        this.f33161a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, S4.h hVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.c(f33160c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // S4.k
    public S4.c a(S4.h hVar) {
        return S4.c.TRANSFORMED;
    }

    @Override // S4.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(U4.v vVar, File file, S4.h hVar) {
        boolean z10;
        Bitmap bitmap = (Bitmap) vVar.get();
        Bitmap.CompressFormat compressFormatD = d(bitmap, hVar);
        p5.b.d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatD);
        try {
            long jB = AbstractC5830g.b();
            int iIntValue = ((Integer) hVar.c(f33159b)).intValue();
            OutputStream cVar = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        cVar = this.f33161a != null ? new com.bumptech.glide.load.data.c(fileOutputStream, this.f33161a) : fileOutputStream;
                        bitmap.compress(compressFormatD, iIntValue, cVar);
                        cVar.close();
                        try {
                            cVar.close();
                        } catch (IOException unused) {
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        e = e10;
                        cVar = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z10 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar = fileOutputStream;
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
                if (Log.isLoggable("BitmapEncoder", 2)) {
                    Log.v("BitmapEncoder", "Compressed with type: " + compressFormatD + " of size " + o5.l.i(bitmap) + " in " + AbstractC5830g.a(jB) + ", options format: " + hVar.c(f33160c) + ", hasAlpha: " + bitmap.hasAlpha());
                }
                return z10;
            } catch (Throwable th3) {
                th = th3;
            }
        } finally {
            p5.b.e();
        }
    }
}
