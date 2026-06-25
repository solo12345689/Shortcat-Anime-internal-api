package com.shopify.reactnative.skia;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class j extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    l f44243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f44244b;

    public j(Context context, l lVar, boolean z10) {
        super(context);
        this.f44243a = lVar;
        this.f44244b = z10;
        getHolder().addCallback(this);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44243a.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f44243a.c(surfaceHolder.getSurface(), getWidth(), getHeight());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f44243a.f(surfaceHolder.getSurface(), getWidth(), getHeight());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f44243a.e();
    }
}
