package com.facebook.animated.gif;

import R7.a;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import r6.b;
import r6.c;
import y5.k;
import y6.d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class GifImage implements c, s6.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f35734b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap.Config f35735a = null;
    private long mNativeContext;

    public GifImage() {
    }

    public static GifImage j(ByteBuffer byteBuffer, d dVar) {
        l();
        byteBuffer.rewind();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, dVar.f64838b, dVar.f64843g);
        gifImageNativeCreateFromDirectByteBuffer.f35735a = dVar.f64845i;
        return gifImageNativeCreateFromDirectByteBuffer;
    }

    public static GifImage k(long j10, int i10, d dVar) {
        l();
        k.b(Boolean.valueOf(j10 != 0));
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j10, i10, dVar.f64838b, dVar.f64843g);
        gifImageNativeCreateFromNativeMemory.f35735a = dVar.f64845i;
        return gifImageNativeCreateFromNativeMemory;
    }

    private static synchronized void l() {
        if (!f35734b) {
            f35734b = true;
            a.d("gifimage");
        }
    }

    private static b.EnumC0885b m(int i10) {
        return i10 == 0 ? b.EnumC0885b.DISPOSE_DO_NOT : i10 == 1 ? b.EnumC0885b.DISPOSE_DO_NOT : i10 == 2 ? b.EnumC0885b.DISPOSE_TO_BACKGROUND : i10 == 3 ? b.EnumC0885b.DISPOSE_TO_PREVIOUS : b.EnumC0885b.DISPOSE_DO_NOT;
    }

    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i10, boolean z10);

    private static native GifImage nativeCreateFromFileDescriptor(int i10, int i11, boolean z10);

    private static native GifImage nativeCreateFromNativeMemory(long j10, int i10, int i11, boolean z10);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i10);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    @Override // r6.c
    public int A() {
        return nativeGetSizeInBytes();
    }

    @Override // r6.c
    public int a() {
        return nativeGetFrameCount();
    }

    @Override // r6.c
    public int b() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // r6.c
    public b c(int i10) {
        GifFrame gifFrameF = f(i10);
        try {
            return new b(i10, gifFrameF.b(), gifFrameF.c(), gifFrameF.getWidth(), gifFrameF.getHeight(), b.a.BLEND_WITH_PREVIOUS, m(gifFrameF.d()));
        } finally {
            gifFrameF.dispose();
        }
    }

    @Override // r6.c
    public boolean d() {
        return false;
    }

    @Override // r6.c
    public Bitmap.Config e() {
        return this.f35735a;
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // s6.c
    public c g(ByteBuffer byteBuffer, d dVar) {
        return j(byteBuffer, dVar);
    }

    @Override // r6.c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // r6.c
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // r6.c
    public int[] h() {
        return nativeGetFrameDurations();
    }

    @Override // s6.c
    public c i(long j10, int i10, d dVar) {
        return k(j10, i10, dVar);
    }

    @Override // r6.c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public GifFrame f(int i10) {
        return nativeGetFrame(i10);
    }

    GifImage(long j10) {
        this.mNativeContext = j10;
    }
}
