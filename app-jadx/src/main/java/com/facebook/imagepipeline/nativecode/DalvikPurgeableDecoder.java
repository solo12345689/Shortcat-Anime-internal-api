package com.facebook.imagepipeline.nativecode;

import E6.k;
import H6.g;
import H6.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imageutils.BitmapUtil;
import java.util.Locale;
import y5.p;
import y6.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DalvikPurgeableDecoder implements I6.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final byte[] f35991b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f35992a = h.a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class OreoUtils {
        private OreoUtils() {
        }

        static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
        f35991b = new byte[]{-1, -39};
    }

    protected DalvikPurgeableDecoder() {
    }

    public static boolean e(C5.a aVar, int i10) {
        B5.h hVar = (B5.h) aVar.C();
        return i10 >= 2 && hVar.G(i10 + (-2)) == -1 && hVar.G(i10 - 1) == -39;
    }

    public static BitmapFactory.Options f(int i10, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i10;
        options.inMutable = true;
        return options;
    }

    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // I6.d
    public C5.a a(k kVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(kVar.z(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        C5.a aVarJ = kVar.j();
        y5.k.g(aVarJ);
        try {
            return g(d(aVarJ, i10, optionsF));
        } finally {
            C5.a.m(aVarJ);
        }
    }

    @Override // I6.d
    public C5.a b(k kVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(kVar.z(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        C5.a aVarJ = kVar.j();
        y5.k.g(aVarJ);
        try {
            return g(c(aVarJ, optionsF));
        } finally {
            C5.a.m(aVarJ);
        }
    }

    protected abstract Bitmap c(C5.a aVar, BitmapFactory.Options options);

    protected abstract Bitmap d(C5.a aVar, int i10, BitmapFactory.Options options);

    public C5.a g(Bitmap bitmap) {
        y5.k.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f35992a.g(bitmap)) {
                return C5.a.S(bitmap, this.f35992a.e());
            }
            int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
            bitmap.recycle();
            throw new i(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(sizeInBytes), Integer.valueOf(this.f35992a.b()), Long.valueOf(this.f35992a.f()), Integer.valueOf(this.f35992a.c()), Integer.valueOf(this.f35992a.d())));
        } catch (Exception e10) {
            bitmap.recycle();
            throw p.a(e10);
        }
    }
}
