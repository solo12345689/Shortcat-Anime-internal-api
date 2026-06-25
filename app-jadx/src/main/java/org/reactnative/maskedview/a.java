package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.views.view.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f55651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f55652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f55653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PorterDuffXfermode f55654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55655e;

    public a(Context context) {
        super(context);
        this.f55651a = null;
        this.f55652b = false;
        this.f55655e = 2;
        this.f55653c = new Paint(1);
        this.f55654d = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    public static Bitmap B(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private void C() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setVisibility(0);
            Bitmap bitmap = this.f55651a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f55651a = B(childAt);
            childAt.setVisibility(4);
        }
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f55652b) {
            C();
            this.f55652b = false;
        }
        if (this.f55651a != null) {
            setLayerType(this.f55655e, this.f55653c);
            this.f55653c.setXfermode(this.f55654d);
            canvas.drawBitmap(this.f55651a, 0.0f, 0.0f, this.f55653c);
            this.f55653c.setXfermode(null);
        }
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55652b = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        View childAt;
        super.onDescendantInvalidated(view, view2);
        if (!this.f55652b && (childAt = getChildAt(0)) != null && childAt.equals(view)) {
            this.f55652b = true;
        }
        invalidate();
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            this.f55652b = true;
        }
    }

    public void setRenderingMode(String str) {
        this.f55655e = str.equals("software") ? 1 : 2;
    }
}
