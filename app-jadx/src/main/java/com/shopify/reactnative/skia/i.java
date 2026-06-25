package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import com.facebook.react.uimanager.C;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends com.facebook.react.views.view.g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f44240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f44241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f44242c;

    public i(Context context) {
        super(context);
        this.f44241b = false;
        this.f44242c = "SkiaView";
        k kVar = new k(context, this, false);
        this.f44240a = kVar;
        addView(kVar);
    }

    void B() {
        if (RNSkiaModule.isModuleValid()) {
            unregisterView();
        }
    }

    public void c(Surface surface, int i10, int i11) {
        Log.i("SkiaView", "onSurfaceTextureSizeChanged " + i10 + "/" + i11);
        surfaceSizeChanged(surface, i10, i11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C.b(getPointerEvents())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.shopify.reactnative.skia.l
    public void e() {
        surfaceDestroyed();
    }

    public void f(Surface surface, int i10, int i11) {
        surfaceAvailable(surface, i10, i11, true);
    }

    public void g(SurfaceTexture surfaceTexture, int i10, int i11) {
        surfaceAvailable(surfaceTexture, i10, i11, false);
    }

    public void l(SurfaceTexture surfaceTexture, int i10, int i11) {
        Log.i("SkiaView", "onSurfaceTextureSizeChanged " + i10 + "/" + i11);
        surfaceSizeChanged(surfaceTexture, i10, i11, false);
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f44240a.layout(0, 0, i12 - i10, i13 - i11);
    }

    protected abstract void registerView(int i10);

    protected abstract void setDebugMode(boolean z10);

    public void setOpaque(boolean z10) {
        if (z10) {
            View view = this.f44240a;
            if (view instanceof k) {
                removeView(view);
                j jVar = new j(getContext(), this, false);
                this.f44240a = jVar;
                addView(jVar);
                return;
            }
        }
        if (z10) {
            return;
        }
        View view2 = this.f44240a;
        if (view2 instanceof j) {
            removeView(view2);
            k kVar = new k(getContext(), this, false);
            this.f44240a = kVar;
            addView(kVar);
        }
    }

    protected abstract void surfaceAvailable(Object obj, int i10, int i11, boolean z10);

    protected abstract void surfaceDestroyed();

    protected abstract void surfaceSizeChanged(Object obj, int i10, int i11, boolean z10);

    protected abstract void unregisterView();
}
