package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class k extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    l f44246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f44247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f44248d;

    public k(Context context, l lVar, boolean z10) {
        super(context);
        this.f44245a = "SkiaTextureView";
        this.f44248d = 0L;
        this.f44246b = lVar;
        this.f44247c = z10;
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Log.i(this.f44245a, "onSurfaceTextureAvailable:  " + i10 + "x" + i11);
        this.f44246b.g(surfaceTexture, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f44246b.e();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        Log.i(this.f44245a, "onSurfaceTextureSizeChanged:  " + i10 + "x" + i11);
        this.f44246b.l(surfaceTexture, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f44247c) {
            long timestamp = surfaceTexture.getTimestamp();
            Log.i("SkiaTextureView", "onSurfaceTextureUpdated " + ((timestamp - this.f44248d) / 1000000) + "ms");
            this.f44248d = timestamp;
        }
    }
}
