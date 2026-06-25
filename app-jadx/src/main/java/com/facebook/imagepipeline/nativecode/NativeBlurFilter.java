package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NativeBlurFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap, int i10, int i11) {
        k.g(bitmap);
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        nativeIterativeBoxBlur(bitmap, i10, i11);
    }

    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i10, int i11);
}
