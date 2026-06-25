package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Bitmaps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35990a = 0;

    static {
        a.a();
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        k.b(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        k.b(Boolean.valueOf(bitmap.isMutable()));
        k.b(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        k.b(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    private static native void nativeCopyBitmap(Bitmap bitmap, int i10, Bitmap bitmap2, int i11, int i12);
}
