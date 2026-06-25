package com.facebook.animated.gif;

import android.graphics.Bitmap;
import r6.d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class GifFrame implements d {
    private long mNativeContext;

    GifFrame(long j10) {
        this.mNativeContext = j10;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDisposalMode();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetTransparentPixelColor();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeHasTransparency();

    private native void nativeRenderFrame(int i10, int i11, Bitmap bitmap);

    @Override // r6.d
    public void a(int i10, int i11, Bitmap bitmap) {
        nativeRenderFrame(i10, i11, bitmap);
    }

    @Override // r6.d
    public int b() {
        return nativeGetXOffset();
    }

    @Override // r6.d
    public int c() {
        return nativeGetYOffset();
    }

    public int d() {
        return nativeGetDisposalMode();
    }

    @Override // r6.d
    public void dispose() {
        nativeDispose();
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // r6.d
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // r6.d
    public int getWidth() {
        return nativeGetWidth();
    }
}
