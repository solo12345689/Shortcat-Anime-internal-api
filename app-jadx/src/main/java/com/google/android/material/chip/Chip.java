package com.google.android.material.chip;

import E9.e;
import E9.g;
import H9.i;
import H9.l;
import H9.o;
import L1.B;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C2653g;
import androidx.core.view.AbstractC2747a0;
import com.adjust.sdk.network.ErrorCodes;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;
import com.google.android.material.internal.f;
import com.google.android.material.internal.m;
import java.util.List;
import o9.AbstractC5838a;
import o9.AbstractC5846i;
import o9.AbstractC5847j;
import o9.AbstractC5848k;
import p9.C5948c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Chip extends C2653g implements a.InterfaceC0640a, o, Checkable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f42225w = AbstractC5847j.f54892u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Rect f42226x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int[] f42227y = {R.attr.state_selected};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f42228z = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.material.chip.a f42229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InsetDrawable f42230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RippleDrawable f42231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View.OnClickListener f42232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f42233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f42234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f42237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f42239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f42240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f42241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f42242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f42243s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f42244t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f42245u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final g f42246v;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f42229e != null) {
                Chip.this.f42229e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c extends R1.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // R1.a
        protected int B(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // R1.a
        protected void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f42232h != null) {
                list.add(1);
            }
        }

        @Override // R1.a
        protected boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // R1.a
        protected void M(B b10) {
            b10.x0(Chip.this.r());
            b10.A0(Chip.this.isClickable());
            b10.z0(Chip.this.getAccessibilityClassName());
            b10.i1(Chip.this.getText());
        }

        @Override // R1.a
        protected void N(int i10, B b10) {
            if (i10 != 1) {
                b10.D0("");
                b10.v0(Chip.f42226x);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                b10.D0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                b10.D0(Chip.this.getContext().getString(AbstractC5846i.f54856n, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            b10.v0(Chip.this.getCloseIconTouchBoundsInt());
            b10.b(B.a.f11217i);
            b10.H0(Chip.this.isEnabled());
            b10.z0(Button.class.getName());
        }

        @Override // R1.a
        protected void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f42237m = z10;
            }
            if (Chip.this.f42229e.G1(Chip.this.f42237m)) {
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5838a.f54631e);
    }

    private void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f42229e) == null) {
            return;
        }
        int iS0 = (int) (aVar.S0() + this.f42229e.s1() + this.f42229e.z0());
        int iX0 = (int) (this.f42229e.X0() + this.f42229e.t1() + this.f42229e.v0());
        if (this.f42230f != null) {
            Rect rect = new Rect();
            this.f42230f.getPadding(rect);
            iX0 += rect.left;
            iS0 += rect.right;
        }
        setPaddingRelative(iX0, getPaddingTop(), iS0, getPaddingBottom());
    }

    private void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.p(getContext(), paint, this.f42246v);
        }
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f42233i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f42245u.setEmpty();
        if (n() && this.f42232h != null) {
            this.f42229e.h1(this.f42245u);
        }
        return this.f42245u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f42244t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f42244t;
    }

    private e getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.r1();
        }
        return null;
    }

    private void k(com.google.android.material.chip.a aVar) {
        aVar.z2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] l() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f42237m) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f42236l) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f42235k) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f42237m) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f42236l) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f42235k) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f42229e;
        return (aVar == null || aVar.a1() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayI = m.i(context, attributeSet, AbstractC5848k.f55305y0, i10, f42225w, new int[0]);
        this.f42238n = typedArrayI.getBoolean(AbstractC5848k.f55144e1, false);
        this.f42240p = (int) Math.ceil(typedArrayI.getDimension(AbstractC5848k.f55043S0, E9.b.e(context)));
        typedArrayI.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f42230f = new InsetDrawable((Drawable) this.f42229e, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f42236l != z10) {
            this.f42236l = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f42235k != z10) {
            this.f42235k = z10;
            refreshDrawableState();
        }
    }

    private void u() {
        if (this.f42230f != null) {
            this.f42230f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    private void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.z2(null);
        }
    }

    private void x() {
        if (n() && s() && this.f42232h != null) {
            AbstractC2747a0.k0(this, this.f42242r);
            this.f42243s = true;
        } else {
            AbstractC2747a0.k0(this, null);
            this.f42243s = false;
        }
    }

    private void y() {
        z();
    }

    private void z() {
        this.f42231g = new RippleDrawable(F9.a.d(this.f42229e.o1()), getBackgroundDrawable(), null);
        this.f42229e.V2(false);
        setBackground(this.f42231g);
        A();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0640a
    public void a() {
        m(this.f42240p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f42243s ? super.dispatchHoverEvent(motionEvent) : this.f42242r.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f42243s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f42242r.w(keyEvent) || this.f42242r.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.C2653g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f42229e;
        if ((aVar == null || !aVar.y1()) ? false : this.f42229e.v2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f42241q)) {
            return this.f42241q;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f42230f;
        return insetDrawable == null ? this.f42229e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.R0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f42229e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.U0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.c1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.e1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.g1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f42243s && (this.f42242r.A() == 1 || this.f42242r.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C5948c getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.l1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.m1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.n1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.o1();
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        return this.f42229e.H();
    }

    public C5948c getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.p1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.s1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            return aVar.t1();
        }
        return 0.0f;
    }

    public boolean m(int i10) {
        this.f42240p = i10;
        if (!v()) {
            if (this.f42230f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f42229e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f42229e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f42230f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f42230f != null) {
            Rect rect = new Rect();
            this.f42230f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.f(this, this.f42229e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f42227y);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f42228z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f42243s) {
            this.f42242r.I(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f42239o != i10) {
            this.f42239o = i10;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f42235k
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f42235k
            if (r0 == 0) goto L35
            r5.t()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f42229e;
        return aVar != null && aVar.x1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f42229e;
        return aVar != null && aVar.z1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f42241q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f42231g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C2653g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f42231g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C2653g, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.H1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.I1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar == null) {
            this.f42234j = z10;
        } else if (aVar.x1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.J1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.K1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.L1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.M1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.P1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.R1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.S1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f42229e;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f42229e = aVar;
            aVar.K2(false);
            k(this.f42229e);
            m(this.f42240p);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.T1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.U1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.V1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.W1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.X1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.Y1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.Z1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.a2(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.b2(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.d2(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.e2(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.f2(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.g2(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.h2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.i2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.j2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.k2(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.m2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.n2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.o2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.p2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.q2(i10);
        }
        x();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.r2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.s2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.t2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.u2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.w2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.x2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.C2653g, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.C2653g, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.c0(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f42229e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.A2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f42238n = z10;
        m(this.f42240p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(C5948c c5948c) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.B2(c5948c);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.C2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.D2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.E2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.F2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.G2(i10);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f42229e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.H2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f42233i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f42232h = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.I2(colorStateList);
        }
        if (this.f42229e.v1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.J2(i10);
            if (this.f42229e.v1()) {
                return;
            }
            z();
        }
    }

    @Override // H9.o
    public void setShapeAppearanceModel(l lVar) {
        this.f42229e.setShapeAppearanceModel(lVar);
    }

    public void setShowMotionSpec(C5948c c5948c) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.L2(c5948c);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.M2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.W2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f42229e;
        if (aVar2 != null) {
            aVar2.N2(charSequence);
        }
    }

    public void setTextAppearance(e eVar) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.O2(eVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.Q2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.R2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.S2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.T2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.U2(i10);
        }
    }

    public boolean t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f42232h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f42243s) {
            this.f42242r.U(1, 1);
        }
        return z10;
    }

    public boolean v() {
        return this.f42238n;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f42225w;
        super(K9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f42244t = new Rect();
        this.f42245u = new RectF();
        this.f42246v = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a aVarE0 = com.google.android.material.chip.a.E0(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(aVarE0);
        aVarE0.c0(getElevation());
        TypedArray typedArrayI = m.i(context2, attributeSet, AbstractC5848k.f55305y0, i10, i11, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(AbstractC5848k.f55186j1);
        typedArrayI.recycle();
        this.f42242r = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f42234j);
        setText(aVarE0.q1());
        setEllipsize(aVarE0.k1());
        B();
        if (!this.f42229e.W2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.f42240p);
        }
        this.f42239o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: w9.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip.b(this.f62939a, compoundButton, z10);
            }
        });
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.y2(z10);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.O1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.c2(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.P2(i10);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f42229e;
        if (aVar != null) {
            aVar.P2(i10);
        }
        B();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends g {
        a() {
        }

        @Override // E9.g
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f42229e.W2() ? Chip.this.f42229e.q1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        @Override // E9.g
        public void a(int i10) {
        }
    }

    public void setInternalOnCheckedChangeListener(f fVar) {
    }
}
