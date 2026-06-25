package s0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import s0.C6344c1;
import t0.AbstractC6580c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class O {
    public static final InterfaceC6341b1 a(int i10, int i11, int i12, boolean z10, AbstractC6580c abstractC6580c) {
        Bitmap bitmapCreateBitmap;
        Bitmap.Config configD = d(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Z.a(i10, i11, i12, z10, abstractC6580c);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configD);
            bitmapCreateBitmap.setHasAlpha(z10);
        }
        return new L(bitmapCreateBitmap);
    }

    public static final Bitmap b(InterfaceC6341b1 interfaceC6341b1) {
        if (interfaceC6341b1 instanceof L) {
            return ((L) interfaceC6341b1).c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final InterfaceC6341b1 c(Bitmap bitmap) {
        return new L(bitmap);
    }

    public static final Bitmap.Config d(int i10) {
        C6344c1.a aVar = C6344c1.f58930b;
        if (C6344c1.i(i10, aVar.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (C6344c1.i(i10, aVar.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (C6344c1.i(i10, aVar.e())) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || !C6344c1.i(i10, aVar.c())) ? (i11 < 26 || !C6344c1.i(i10, aVar.d())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final int e(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return C6344c1.f58930b.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return C6344c1.f58930b.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return C6344c1.f58930b.b();
        }
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || config != Bitmap.Config.RGBA_F16) ? (i10 < 26 || config != Bitmap.Config.HARDWARE) ? C6344c1.f58930b.b() : C6344c1.f58930b.d() : C6344c1.f58930b.c();
    }
}
