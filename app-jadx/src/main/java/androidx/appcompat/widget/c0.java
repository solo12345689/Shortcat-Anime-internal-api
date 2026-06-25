package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC2747a0;
import androidx.emoji2.text.e;
import i.AbstractC4956a;
import j.AbstractC5323a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import m.C5599a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends CompoundButton {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Property f25322u0 = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final int[] f25323v0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f25324A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f25325B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f25326C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f25327D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f25328E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f25329F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f25330G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f25331H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final TextPaint f25332I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f25333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f25334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f25335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f25338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f25339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f25340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25344l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private ColorStateList f25345l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25346m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private Layout f25347m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25348n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Layout f25349n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f25350o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private TransformationMethod f25351o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f25352p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    ObjectAnimator f25353p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f25354q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final C f25355q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f25356r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private C2660n f25357r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f25358s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private b f25359s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f25360t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final Rect f25361t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f25362u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f25363v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f25364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private VelocityTracker f25365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f25366y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f25367z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(c0 c0Var) {
            return Float.valueOf(c0Var.f25367z);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(c0 c0Var, Float f10) {
            c0Var.setThumbPosition(f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b extends e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f25368a;

        b(c0 c0Var) {
            this.f25368a = new WeakReference(c0Var);
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable th2) {
            c0 c0Var = (c0) this.f25368a.get();
            if (c0Var != null) {
                c0Var.j();
            }
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            c0 c0Var = (c0) this.f25368a.get();
            if (c0Var != null) {
                c0Var.j();
            }
        }
    }

    public c0(Context context) {
        this(context, null);
    }

    private void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<c0, Float>) f25322u0, z10 ? 1.0f : 0.0f);
        this.f25353p0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f25353p0.setAutoCancel(true);
        this.f25353p0.start();
    }

    private void b() {
        Drawable drawable = this.f25333a;
        if (drawable != null) {
            if (this.f25336d || this.f25337e) {
                Drawable drawableMutate = B1.a.r(drawable).mutate();
                this.f25333a = drawableMutate;
                if (this.f25336d) {
                    B1.a.o(drawableMutate, this.f25334b);
                }
                if (this.f25337e) {
                    B1.a.p(this.f25333a, this.f25335c);
                }
                if (this.f25333a.isStateful()) {
                    this.f25333a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f25338f;
        if (drawable != null) {
            if (this.f25341i || this.f25342j) {
                Drawable drawableMutate = B1.a.r(drawable).mutate();
                this.f25338f = drawableMutate;
                if (this.f25341i) {
                    B1.a.o(drawableMutate, this.f25339g);
                }
                if (this.f25342j) {
                    B1.a.p(this.f25338f, this.f25340h);
                }
                if (this.f25338f.isStateful()) {
                    this.f25338f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f25353p0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f25351o0);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    private C2660n getEmojiTextViewHelper() {
        if (this.f25357r0 == null) {
            this.f25357r0 = new C2660n(this);
        }
        return this.f25357r0;
    }

    private boolean getTargetCheckedState() {
        return this.f25367z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((s0.b(this) ? 1.0f - this.f25367z : this.f25367z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f25338f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f25361t0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f25333a;
        Rect rectD = drawable2 != null ? O.d(drawable2) : O.f25007c;
        return ((((this.f25324A - this.f25326C) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f25333a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f25333a.getPadding(this.f25361t0);
        int i10 = this.f25328E;
        int i11 = this.f25362u;
        int i12 = i10 - i11;
        int i13 = (this.f25327D + thumbOffset) - i11;
        int i14 = this.f25326C + i13;
        Rect rect = this.f25361t0;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f25330G + i11));
    }

    private Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f25332I, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f25354q;
            if (string == null) {
                string = getResources().getString(i.h.f48111b);
            }
            AbstractC2747a0.z0(this, string);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f25350o;
            if (string == null) {
                string = getResources().getString(i.h.f48112c);
            }
            AbstractC2747a0.z0(this, string);
        }
    }

    private void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    private void p() {
        if (this.f25359s0 == null && this.f25357r0.b() && androidx.emoji2.text.e.k()) {
            androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
            int iG = eVarC.g();
            if (iG == 3 || iG == 0) {
                b bVar = new b(this);
                this.f25359s0 = bVar;
                eVarC.v(bVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f25360t = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f25365x.computeCurrentVelocity(1000);
            float xVelocity = this.f25365x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f25366y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!s0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f25354q = charSequence;
        this.f25356r = g(charSequence);
        this.f25349n0 = null;
        if (this.f25358s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f25350o = charSequence;
        this.f25352p = g(charSequence);
        this.f25347m0 = null;
        if (this.f25358s) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f25361t0;
        int i12 = this.f25327D;
        int i13 = this.f25328E;
        int i14 = this.f25329F;
        int i15 = this.f25330G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f25333a;
        Rect rectD = drawable != null ? O.d(drawable) : O.f25007c;
        Drawable drawable2 = this.f25338f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f25338f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f25338f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f25333a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f25326C + rect.right;
            this.f25333a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                B1.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f25333a;
        if (drawable != null) {
            B1.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f25338f;
        if (drawable2 != null) {
            B1.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f25333a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f25338f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!s0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f25324A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f25346m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (s0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f25324A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f25346m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.o(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f25358s;
    }

    public boolean getSplitTrack() {
        return this.f25348n;
    }

    public int getSwitchMinWidth() {
        return this.f25344l;
    }

    public int getSwitchPadding() {
        return this.f25346m;
    }

    public CharSequence getTextOff() {
        return this.f25354q;
    }

    public CharSequence getTextOn() {
        return this.f25350o;
    }

    public Drawable getThumbDrawable() {
        return this.f25333a;
    }

    protected final float getThumbPosition() {
        return this.f25367z;
    }

    public int getThumbTextPadding() {
        return this.f25343k;
    }

    public ColorStateList getThumbTintList() {
        return this.f25334b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f25335c;
    }

    public Drawable getTrackDrawable() {
        return this.f25338f;
    }

    public ColorStateList getTrackTintList() {
        return this.f25339g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f25340h;
    }

    void j() {
        setTextOnInternal(this.f25350o);
        setTextOffInternal(this.f25354q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f25333a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f25338f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f25353p0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f25353p0.end();
        this.f25353p0 = null;
    }

    public void m(Context context, int i10) {
        h0 h0VarT = h0.t(context, i10, i.j.f48223S2);
        ColorStateList colorStateListC = h0VarT.c(i.j.f48243W2);
        if (colorStateListC != null) {
            this.f25345l0 = colorStateListC;
        } else {
            this.f25345l0 = getTextColors();
        }
        int iF = h0VarT.f(i.j.f48228T2, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.f25332I.getTextSize()) {
                this.f25332I.setTextSize(f10);
                requestLayout();
            }
        }
        o(h0VarT.k(i.j.f48233U2, -1), h0VarT.k(i.j.f48238V2, -1));
        if (h0VarT.a(i.j.f48297h3, false)) {
            this.f25351o0 = new C5599a(getContext());
        } else {
            this.f25351o0 = null;
        }
        setTextOnInternal(this.f25350o);
        setTextOffInternal(this.f25354q);
        h0VarT.x();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.f25332I.setFakeBoldText(false);
            this.f25332I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.f25332I.setFakeBoldText((i11 & 1) != 0);
            this.f25332I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f25323v0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f25361t0;
        Drawable drawable = this.f25338f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f25328E;
        int i11 = this.f25330G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f25333a;
        if (drawable != null) {
            if (!this.f25348n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = O.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f25347m0 : this.f25349n0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f25345l0;
            if (colorStateList != null) {
                this.f25332I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f25332I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f25350o : this.f25354q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f25333a != null) {
            Rect rect = this.f25361t0;
            Drawable drawable = this.f25338f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = O.d(this.f25333a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (s0.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f25324A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f25324A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i14 = this.f25325B;
            paddingTop = paddingTop2 - (i14 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f25325B;
                this.f25327D = paddingLeft;
                this.f25328E = paddingTop;
                this.f25330G = height;
                this.f25329F = width;
            }
            paddingTop = getPaddingTop();
            i14 = this.f25325B;
        }
        height = i14 + paddingTop;
        this.f25327D = paddingLeft;
        this.f25328E = paddingTop;
        this.f25330G = height;
        this.f25329F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f25358s) {
            if (this.f25347m0 == null) {
                this.f25347m0 = i(this.f25352p);
            }
            if (this.f25349n0 == null) {
                this.f25349n0 = i(this.f25356r);
            }
        }
        Rect rect = this.f25361t0;
        Drawable drawable = this.f25333a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f25333a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f25333a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f25326C = Math.max(this.f25358s ? Math.max(this.f25347m0.getWidth(), this.f25349n0.getWidth()) + (this.f25343k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f25338f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f25338f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f25333a;
        if (drawable3 != null) {
            Rect rectD = O.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.f25331H ? Math.max(this.f25344l, (this.f25326C * 2) + iMax + iMax2) : this.f25344l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f25324A = iMax3;
        this.f25325B = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f25350o : this.f25354q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f25365x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f25360t
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f25363v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.s0.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f25367z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f25367z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f25363v = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f25363v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f25362u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f25364w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f25362u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f25360t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f25363v = r0
            r6.f25364w = r3
            return r1
        L89:
            int r0 = r6.f25360t
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f25360t = r0
            android.view.VelocityTracker r0 = r6.f25365x
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f25360t = r1
            r6.f25363v = r0
            r6.f25364w = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f25350o);
        setTextOffInternal(this.f25354q);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.f25331H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f25358s != z10) {
            this.f25358s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f25348n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f25344l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f25346m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f25332I.getTypeface() == null || this.f25332I.getTypeface().equals(typeface)) && (this.f25332I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f25332I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f25333a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f25333a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f25367z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(AbstractC5323a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f25343k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f25334b = colorStateList;
        this.f25336d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f25335c = mode;
        this.f25337e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f25338f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f25338f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(AbstractC5323a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f25339g = colorStateList;
        this.f25341i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f25340h = mode;
        this.f25342j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f25333a || drawable == this.f25338f;
    }

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47949K);
    }

    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25334b = null;
        this.f25335c = null;
        this.f25336d = false;
        this.f25337e = false;
        this.f25339g = null;
        this.f25340h = null;
        this.f25341i = false;
        this.f25342j = false;
        this.f25365x = VelocityTracker.obtain();
        this.f25331H = true;
        this.f25361t0 = new Rect();
        d0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f25332I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        h0 h0VarV = h0.v(context, attributeSet, i.j.f48148D2, i10, 0);
        AbstractC2747a0.i0(this, context, i.j.f48148D2, attributeSet, h0VarV.r(), i10, 0);
        Drawable drawableG = h0VarV.g(i.j.f48163G2);
        this.f25333a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = h0VarV.g(i.j.f48208P2);
        this.f25338f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(h0VarV.p(i.j.f48153E2));
        setTextOffInternal(h0VarV.p(i.j.f48158F2));
        this.f25358s = h0VarV.a(i.j.f48168H2, true);
        this.f25343k = h0VarV.f(i.j.f48193M2, 0);
        this.f25344l = h0VarV.f(i.j.f48178J2, 0);
        this.f25346m = h0VarV.f(i.j.f48183K2, 0);
        this.f25348n = h0VarV.a(i.j.f48173I2, false);
        ColorStateList colorStateListC = h0VarV.c(i.j.f48198N2);
        if (colorStateListC != null) {
            this.f25334b = colorStateListC;
            this.f25336d = true;
        }
        PorterDuff.Mode modeE = O.e(h0VarV.k(i.j.f48203O2, -1), null);
        if (this.f25335c != modeE) {
            this.f25335c = modeE;
            this.f25337e = true;
        }
        if (this.f25336d || this.f25337e) {
            b();
        }
        ColorStateList colorStateListC2 = h0VarV.c(i.j.f48213Q2);
        if (colorStateListC2 != null) {
            this.f25339g = colorStateListC2;
            this.f25341i = true;
        }
        PorterDuff.Mode modeE2 = O.e(h0VarV.k(i.j.f48218R2, -1), null);
        if (this.f25340h != modeE2) {
            this.f25340h = modeE2;
            this.f25342j = true;
        }
        if (this.f25341i || this.f25342j) {
            c();
        }
        int iN = h0VarV.n(i.j.f48188L2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        C c10 = new C(this);
        this.f25355q0 = c10;
        c10.m(attributeSet, i10);
        h0VarV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f25362u = viewConfiguration.getScaledTouchSlop();
        this.f25366y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
