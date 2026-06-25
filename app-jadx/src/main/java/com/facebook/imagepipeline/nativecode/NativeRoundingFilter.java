package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NativeRoundingFilter {
    static {
        b.a();
    }

    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i10, int i11, int i12, int i13);

    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z10);

    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z10);

    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i10, int i11, boolean z10);

    public static void toCircle(Bitmap bitmap, boolean z10) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z10);
    }

    public static void toCircleFast(Bitmap bitmap, boolean z10) {
        k.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z10);
    }
}
