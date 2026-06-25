package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.AbstractC2747a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class a extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animation.AnimationListener f32224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32226c;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0535a extends OvalShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f32227a = new Paint();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f32228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f32229c;

        C0535a(a aVar, int i10) {
            this.f32229c = aVar;
            this.f32228b = i10;
            a((int) rect().width());
        }

        private void a(int i10) {
            float f10 = i10 / 2;
            this.f32227a.setShader(new RadialGradient(f10, f10, this.f32228b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f32229c.getWidth() / 2;
            float height = this.f32229c.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f32227a);
            canvas.drawCircle(width, height, r0 - this.f32228b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    a(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f32225b = (int) (3.5f * f10);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(W3.a.f20698f);
        this.f32226c = typedArrayObtainStyledAttributes.getColor(W3.a.f20699g, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            AbstractC2747a0.r0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0535a(this, this.f32225b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f32225b, i11, i10, 503316480);
            int i12 = this.f32225b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f32226c);
        AbstractC2747a0.o0(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f32224a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f32224a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f32224a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f32225b * 2), getMeasuredHeight() + (this.f32225b * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f32226c = i10;
        }
    }
}
