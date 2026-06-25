package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class SkiaPictureView extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f44222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44223e;
    private HybridData mHybridData;

    public SkiaPictureView(Context context) {
        super(context);
        this.f44222d = new Paint();
        this.f44223e = false;
        this.mHybridData = initHybrid(((RNSkiaModule) ((ReactContext) context).getNativeModule(RNSkiaModule.class)).getSkiaManager());
    }

    private native HybridData initHybrid(SkiaManager skiaManager);

    @Override // com.shopify.reactnative.skia.i, com.shopify.reactnative.skia.l
    public void c(Surface surface, int i10, int i11) {
        super.c(surface, i10, i11);
    }

    @Override // com.shopify.reactnative.skia.i, com.shopify.reactnative.skia.l
    public void f(Surface surface, int i10, int i11) {
        super.f(surface, i10, i11);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        this.mHybridData.resetNative();
    }

    @Override // com.shopify.reactnative.skia.i, com.shopify.reactnative.skia.l
    public void g(SurfaceTexture surfaceTexture, int i10, int i11) {
        super.g(surfaceTexture, i10, i11);
    }

    protected native int[] getBitmap(int i10, int i11);

    @Override // com.shopify.reactnative.skia.i, com.shopify.reactnative.skia.l
    public void l(SurfaceTexture surfaceTexture, int i10, int i11) {
        super.l(surfaceTexture, i10, i11);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int[] bitmap;
        super.onDraw(canvas);
        if (this.f44223e) {
            int width = getWidth();
            int height = getHeight();
            if (width <= 0 || height <= 0 || (bitmap = getBitmap(width, height)) == null || bitmap.length != width * height) {
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, width, height, Bitmap.Config.ARGB_8888);
            this.f44222d.setFilterBitmap(true);
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f44222d);
        }
    }

    @Override // com.shopify.reactnative.skia.i
    protected native void registerView(int i10);

    public void setAndroidWarmup(boolean z10) {
        this.f44223e = z10;
        setWillNotDraw(!z10);
    }

    protected native void setBgColor(int i10);

    @Override // com.shopify.reactnative.skia.i
    protected native void setDebugMode(boolean z10);

    @Override // com.shopify.reactnative.skia.i
    protected native void surfaceAvailable(Object obj, int i10, int i11, boolean z10);

    @Override // com.shopify.reactnative.skia.i
    protected native void surfaceDestroyed();

    @Override // com.shopify.reactnative.skia.i
    protected native void surfaceSizeChanged(Object obj, int i10, int i11, boolean z10);

    @Override // com.shopify.reactnative.skia.i
    protected native void unregisterView();
}
