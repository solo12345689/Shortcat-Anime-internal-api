package com.google.android.material.snackbar;

import H9.h;
import H9.l;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.p;
import o9.AbstractC5838a;
import o9.AbstractC5840c;
import o9.AbstractC5848k;
import p9.AbstractC5946a;
import x9.AbstractC7066a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeInterpolator f42800a = AbstractC5946a.f55827b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TimeInterpolator f42801b = AbstractC5946a.f55826a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TimeInterpolator f42802c = AbstractC5946a.f55829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f42804e = {AbstractC5838a.f54589B0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f42805f = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Handler f42803d = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final b f42806k = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.f42806k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f42806k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            }
            if (i10 != 1) {
                return false;
            }
            android.support.v4.media.session.b.a(message.obj);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.G(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable c(int i10, Resources resources) {
        float dimension = resources.getDimension(AbstractC5840c.f54738p0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h d(int i10, l lVar) {
        h hVar = new h(lVar);
        hVar.d0(ColorStateList.valueOf(i10));
        return hVar;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static class c extends FrameLayout {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final View.OnTouchListener f42807k = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        l f42808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f42809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f42810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f42811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f42812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f42813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ColorStateList f42814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private PorterDuff.Mode f42815h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Rect f42816i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f42817j;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected c(Context context, AttributeSet attributeSet) {
            super(K9.a.d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC5848k.f55222n5);
            if (typedArrayObtainStyledAttributes.hasValue(AbstractC5848k.f55278u5)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5848k.f55278u5, 0));
            }
            this.f42809b = typedArrayObtainStyledAttributes.getInt(AbstractC5848k.f55246q5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(AbstractC5848k.f55294w5) || typedArrayObtainStyledAttributes.hasValue(AbstractC5848k.f55302x5)) {
                this.f42808a = l.e(context2, attributeSet, 0, 0).m();
            }
            this.f42810c = typedArrayObtainStyledAttributes.getFloat(AbstractC5848k.f55254r5, 1.0f);
            setBackgroundTintList(E9.c.a(context2, typedArrayObtainStyledAttributes, AbstractC5848k.f55262s5));
            setBackgroundTintMode(p.h(typedArrayObtainStyledAttributes.getInt(AbstractC5848k.f55270t5, -1), PorterDuff.Mode.SRC_IN));
            this.f42811d = typedArrayObtainStyledAttributes.getFloat(AbstractC5848k.f55238p5, 1.0f);
            this.f42812e = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5848k.f55230o5, -1);
            this.f42813f = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5848k.f55286v5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f42807k);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(a());
            }
        }

        private Drawable a() {
            int iK = AbstractC7066a.k(this, AbstractC5838a.f54604J, AbstractC5838a.f54657r, getBackgroundOverlayColorAlpha());
            l lVar = this.f42808a;
            Drawable drawableD = lVar != null ? BaseTransientBottomBar.d(iK, lVar) : BaseTransientBottomBar.c(iK, getResources());
            if (this.f42814g == null) {
                return B1.a.r(drawableD);
            }
            Drawable drawableR = B1.a.r(drawableD);
            drawableR.setTintList(this.f42814g);
            return drawableR;
        }

        private void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f42816i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        float getActionTextColorAlpha() {
            return this.f42811d;
        }

        int getAnimationMode() {
            return this.f42809b;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f42810c;
        }

        int getMaxInlineActionWidth() {
            return this.f42813f;
        }

        int getMaxWidth() {
            return this.f42812e;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f42812e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f42812e;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f42809b = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f42814g != null) {
                drawable = B1.a.r(drawable.mutate());
                drawable.setTintList(this.f42814g);
                drawable.setTintMode(this.f42815h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f42814g = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = B1.a.r(getBackground().mutate());
                drawableR.setTintList(colorStateList);
                drawableR.setTintMode(this.f42815h);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f42815h = mode;
            if (getBackground() != null) {
                Drawable drawableR = B1.a.r(getBackground().mutate());
                drawableR.setTintMode(mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f42817j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f42807k);
            super.setOnClickListener(onClickListener);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }
    }
}
