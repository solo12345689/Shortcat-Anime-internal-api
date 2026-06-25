package com.google.android.material.timepicker;

import L1.B;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import com.google.android.material.timepicker.ClockHandView;
import j.AbstractC5323a;
import java.util.Arrays;
import o9.AbstractC5838a;
import o9.AbstractC5839b;
import o9.AbstractC5840c;
import o9.AbstractC5842e;
import o9.AbstractC5844g;
import o9.AbstractC5847j;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends d implements ClockHandView.b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final ClockHandView f43059B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Rect f43060C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final RectF f43061D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Rect f43062E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final SparseArray f43063F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final C2746a f43064G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int[] f43065H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final float[] f43066I;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final int f43067l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final int f43068m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final int f43069n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final int f43070o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private String[] f43071p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f43072q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final ColorStateList f43073r0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.F(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f43059B.i()) - ClockFaceView.this.f43067l0);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends C2746a {
        b() {
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, B b10) {
            super.g(view, b10);
            int iIntValue = ((Integer) view.getTag(AbstractC5842e.f54803p)).intValue();
            if (iIntValue > 0) {
                b10.l1((View) ClockFaceView.this.f43063F.get(iIntValue - 1));
            }
            b10.C0(B.g.b(0, 1, iIntValue, 1, false, view.isSelected()));
            b10.A0(true);
            b10.b(B.a.f11217i);
        }

        @Override // androidx.core.view.C2746a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f43060C);
            float fCenterX = ClockFaceView.this.f43060C.centerX();
            float fCenterY = ClockFaceView.this.f43060C.centerY();
            ClockFaceView.this.f43059B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f43059B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5838a.f54638h0);
    }

    private void N() {
        RectF rectFE = this.f43059B.e();
        TextView textViewP = P(rectFE);
        for (int i10 = 0; i10 < this.f43063F.size(); i10++) {
            TextView textView = (TextView) this.f43063F.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewP);
                textView.getPaint().setShader(O(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient O(RectF rectF, TextView textView) {
        textView.getHitRect(this.f43060C);
        this.f43061D.set(this.f43060C);
        textView.getLineBounds(0, this.f43062E);
        RectF rectF2 = this.f43061D;
        Rect rect = this.f43062E;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f43061D)) {
            return new RadialGradient(rectF.centerX() - this.f43061D.left, rectF.centerY() - this.f43061D.top, rectF.width() * 0.5f, this.f43065H, this.f43066I, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView P(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f43063F.size(); i10++) {
            TextView textView2 = (TextView) this.f43063F.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f43060C);
                this.f43061D.set(this.f43060C);
                this.f43061D.union(rectF);
                float fWidth = this.f43061D.width() * this.f43061D.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float Q(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void S(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f43063F.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f43071p0.length, size); i11++) {
            TextView textView = (TextView) this.f43063F.get(i11);
            if (i11 >= this.f43071p0.length) {
                removeView(textView);
                this.f43063F.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(AbstractC5844g.f54823g, (ViewGroup) this, false);
                    this.f43063F.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f43071p0[i11]);
                textView.setTag(AbstractC5842e.f54803p, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(AbstractC5842e.f54798k, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                AbstractC2747a0.k0(textView, this.f43064G);
                textView.setTextColor(this.f43073r0);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f43071p0[i11]));
                }
            }
        }
        this.f43059B.q(z10);
    }

    @Override // com.google.android.material.timepicker.d
    public void F(int i10) {
        if (i10 != E()) {
            super.F(i10);
            this.f43059B.m(E());
        }
    }

    @Override // com.google.android.material.timepicker.d
    protected void H() {
        super.H();
        for (int i10 = 0; i10 < this.f43063F.size(); i10++) {
            ((TextView) this.f43063F.get(i10)).setVisibility(0);
        }
    }

    public void R(String[] strArr, int i10) {
        this.f43071p0 = strArr;
        S(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z10) {
        if (Math.abs(this.f43072q0 - f10) > 0.001f) {
            this.f43072q0 = f10;
            N();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        B.s1(accessibilityNodeInfo).B0(B.f.b(1, this.f43071p0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        N();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iQ = (int) (this.f43070o0 / Q(this.f43068m0 / displayMetrics.heightPixels, this.f43069n0 / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iQ, 1073741824);
        setMeasuredDimension(iQ, iQ);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43060C = new Rect();
        this.f43061D = new RectF();
        this.f43062E = new Rect();
        this.f43063F = new SparseArray();
        this.f43066I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5848k.f55234p1, i10, AbstractC5847j.f54870B);
        Resources resources = getResources();
        ColorStateList colorStateListA = E9.c.a(context, typedArrayObtainStyledAttributes, AbstractC5848k.f55250r1);
        this.f43073r0 = colorStateListA;
        LayoutInflater.from(context).inflate(AbstractC5844g.f54824h, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(AbstractC5842e.f54797j);
        this.f43059B = clockHandView;
        this.f43067l0 = resources.getDimensionPixelSize(AbstractC5840c.f54686F);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f43065H = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = AbstractC5323a.a(context, AbstractC5839b.f54676b).getDefaultColor();
        ColorStateList colorStateListA2 = E9.c.a(context, typedArrayObtainStyledAttributes, AbstractC5848k.f55242q1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f43064G = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        R(strArr, 0);
        this.f43068m0 = resources.getDimensionPixelSize(AbstractC5840c.f54700T);
        this.f43069n0 = resources.getDimensionPixelSize(AbstractC5840c.f54701U);
        this.f43070o0 = resources.getDimensionPixelSize(AbstractC5840c.f54688H);
    }
}
