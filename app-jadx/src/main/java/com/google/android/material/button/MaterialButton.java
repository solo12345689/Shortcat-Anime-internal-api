package com.google.android.material.button;

import H9.h;
import H9.i;
import H9.l;
import H9.o;
import H9.q;
import H9.r;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C2652f;
import b2.AbstractC2978j;
import b2.C2981m;
import b2.C2982n;
import com.google.android.material.internal.m;
import com.google.android.material.internal.p;
import j.AbstractC5323a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o9.AbstractC5838a;
import o9.AbstractC5847j;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends C2652f implements Checkable, o {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int[] f42071F = {R.attr.state_checkable};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final int[] f42072G = {R.attr.state_checked};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final int f42073H = AbstractC5847j.f54891t;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final int f42074I = AbstractC5838a.f54642j0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final AbstractC2978j f42075l0 = new a("widthIncrease");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    r f42076A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f42077B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private float f42078C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private float f42079D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private C2981m f42080E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f42081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f42082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f42083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f42084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f42085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f42086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f42087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f42089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f42090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f42093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f42094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f42095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f42096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f42097t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f42098u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private LinearLayout.LayoutParams f42099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f42100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f42101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f42102y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f42103z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC2978j {
        a(String str) {
            super(str);
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MaterialButton materialButton, float f10) {
            materialButton.setDisplayedWidthIncrease(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c extends Q1.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f42104c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f42104c = parcel.readInt() == 1;
        }

        @Override // Q1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f42104c ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5838a.f54632e0);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f42101x = materialButton.getOpticalCenterShift();
        materialButton.s();
        materialButton.invalidate();
    }

    public static /* synthetic */ void b(MaterialButton materialButton, float f10) {
        int i10 = (int) (f10 * 0.11f);
        if (materialButton.f42101x != i10) {
            materialButton.f42101x = i10;
            materialButton.s();
            materialButton.invalidate();
        }
    }

    private C2982n e() {
        return C9.d.h(getContext(), AbstractC5838a.f54670x0, AbstractC5847j.f54872a);
    }

    private void f() {
        C2981m c2981m = new C2981m(this, f42075l0);
        this.f42080E = c2981m;
        c2981m.z(e());
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f42078C;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        h hVarG;
        if (this.f42100w && this.f42102y && (hVarG = this.f42081d.g()) != null) {
            return (int) (hVarG.z() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private boolean h() {
        int i10 = this.f42094q;
        return i10 == 3 || i10 == 4;
    }

    private boolean i() {
        int i10 = this.f42094q;
        return i10 == 1 || i10 == 2;
    }

    private boolean j() {
        int i10 = this.f42094q;
        return i10 == 16 || i10 == 32;
    }

    private boolean k() {
        return (getParent() instanceof d) && ((d) getParent()).getOrientation() == 0;
    }

    private boolean l() {
        return getLayoutDirection() == 1;
    }

    private boolean m() {
        e eVar = this.f42081d;
        return (eVar == null || eVar.q()) ? false : true;
    }

    private void n(boolean z10) {
        if (this.f42076A == null) {
            return;
        }
        if (this.f42080E == null) {
            f();
        }
        if (this.f42102y) {
            this.f42080E.u(Math.min(this.f42077B, this.f42076A.e(getDrawableState()).f8351a.a(getWidth())));
            if (z10) {
                this.f42080E.A();
            }
        }
    }

    private void p() {
        if (i()) {
            setCompoundDrawablesRelative(this.f42086i, null, null, null);
        } else if (h()) {
            setCompoundDrawablesRelative(null, null, this.f42086i, null);
        } else if (j()) {
            setCompoundDrawablesRelative(null, this.f42086i, null, null);
        }
    }

    private void q(boolean z10) {
        Drawable drawable = this.f42086i;
        if (drawable != null) {
            Drawable drawableMutate = B1.a.r(drawable).mutate();
            this.f42086i = drawableMutate;
            drawableMutate.setTintList(this.f42085h);
            PorterDuff.Mode mode = this.f42084g;
            if (mode != null) {
                this.f42086i.setTintMode(mode);
            }
            int intrinsicWidth = this.f42088k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f42086i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f42088k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f42086i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f42086i;
            int i10 = this.f42089l;
            int i11 = this.f42090m;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f42086i.setVisible(true, z10);
        }
        if (z10) {
            p();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!i() || drawable3 == this.f42086i) && ((!h() || drawable5 == this.f42086i) && (!j() || drawable4 == this.f42086i))) {
            return;
        }
        p();
    }

    private void r(int i10, int i11) {
        if (this.f42086i == null || getLayout() == null) {
            return;
        }
        if (!i() && !h()) {
            if (j()) {
                this.f42089l = 0;
                if (this.f42094q == 16) {
                    this.f42090m = 0;
                    q(false);
                    return;
                }
                int intrinsicHeight = this.f42088k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f42086i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f42091n) - getPaddingBottom()) / 2);
                if (this.f42090m != iMax) {
                    this.f42090m = iMax;
                    q(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f42090m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f42094q;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f42089l = 0;
            q(false);
            return;
        }
        int intrinsicWidth = this.f42088k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f42086i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f42091n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (l() != (this.f42094q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f42089l != textLayoutWidth) {
            this.f42089l = textLayoutWidth;
            q(false);
        }
    }

    private void s() {
        int i10 = (int) (this.f42078C - this.f42079D);
        int i11 = (i10 / 2) + this.f42101x;
        getLayoutParams().width = (int) (this.f42096s + i10);
        setPaddingRelative(this.f42097t + i11, getPaddingTop(), (this.f42098u + i10) - i11, getPaddingBottom());
    }

    private void setCheckedInternal(boolean z10) {
        if (!g() || this.f42092o == z10) {
            return;
        }
        this.f42092o = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).w(this, this.f42092o);
        }
        if (this.f42093p) {
            return;
        }
        this.f42093p = true;
        Iterator it = this.f42082e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f42093p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        if (this.f42078C != f10) {
            this.f42078C = f10;
            s();
            invalidate();
            if (getParent() instanceof d) {
                ((d) getParent()).k(this, (int) this.f42078C);
            }
        }
    }

    public boolean g() {
        e eVar = this.f42081d;
        return eVar != null && eVar.r();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f42087j)) {
            return (g() ? CompoundButton.class : Button.class).getName();
        }
        return this.f42087j;
    }

    int getAllowedWidthDecrease() {
        return this.f42103z;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m()) {
            return this.f42081d.b();
        }
        return 0;
    }

    public C2982n getCornerSpringForce() {
        return this.f42081d.c();
    }

    public Drawable getIcon() {
        return this.f42086i;
    }

    public int getIconGravity() {
        return this.f42094q;
    }

    public int getIconPadding() {
        return this.f42091n;
    }

    public int getIconSize() {
        return this.f42088k;
    }

    public ColorStateList getIconTint() {
        return this.f42085h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f42084g;
    }

    public int getInsetBottom() {
        return this.f42081d.d();
    }

    public int getInsetTop() {
        return this.f42081d.e();
    }

    public ColorStateList getRippleColor() {
        if (m()) {
            return this.f42081d.i();
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        if (m()) {
            return this.f42081d.j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public q getStateListShapeAppearanceModel() {
        if (m()) {
            return this.f42081d.k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m()) {
            return this.f42081d.l();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m()) {
            return this.f42081d.m();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C2652f
    public ColorStateList getSupportBackgroundTintList() {
        return m() ? this.f42081d.n() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C2652f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m() ? this.f42081d.o() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f42092o;
    }

    void o() {
        LinearLayout.LayoutParams layoutParams = this.f42099v;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.f42099v = null;
            this.f42096s = -1.0f;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m()) {
            i.f(this, this.f42081d.g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f42071F);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f42072G);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C2652f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C2652f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C2652f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        r(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.f42095r != i15) {
            this.f42095r = i15;
            this.f42096s = -1.0f;
        }
        if (this.f42096s == -1.0f) {
            this.f42096s = getMeasuredWidth();
            if (this.f42099v == null && (getParent() instanceof d) && ((d) getParent()).getButtonSizeChange() != null) {
                this.f42099v = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f42099v);
                layoutParams.width = (int) this.f42096s;
                setLayoutParams(layoutParams);
            }
        }
        if (this.f42103z == -1) {
            if (this.f42086i == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f42088k;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f42086i.getIntrinsicWidth();
                }
                i14 = iconPadding + intrinsicWidth;
            }
            this.f42103z = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.f42097t == -1) {
            this.f42097t = getPaddingStart();
        }
        if (this.f42098u == -1) {
            this.f42098u = getPaddingEnd();
        }
        this.f42102y = k();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f42104c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f42104c = this.f42092o;
        return cVar;
    }

    @Override // androidx.appcompat.widget.C2652f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.f42081d.s()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f42086i != null) {
            if (this.f42086i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f42087j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (m()) {
            this.f42081d.u(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.C2652f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f42081d.v();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C2652f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? AbstractC5323a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (m()) {
            this.f42081d.w(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    public void setCornerRadius(int i10) {
        if (m()) {
            this.f42081d.x(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (m()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCornerSpringForce(C2982n c2982n) {
        this.f42081d.z(c2982n);
    }

    void setDisplayedWidthDecrease(int i10) {
        this.f42079D = Math.min(i10, this.f42103z);
        s();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (m()) {
            this.f42081d.g().c0(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f42086i != drawable) {
            this.f42086i = drawable;
            q(true);
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f42094q != i10) {
            this.f42094q = i10;
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f42091n != i10) {
            this.f42091n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? AbstractC5323a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f42088k != i10) {
            this.f42088k = i10;
            q(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f42085h != colorStateList) {
            this.f42085h = colorStateList;
            q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f42084g != mode) {
            this.f42084g = mode;
            q(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(AbstractC5323a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f42081d.A(i10);
    }

    public void setInsetTop(int i10) {
        this.f42081d.B(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f42083f = bVar;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.f42100w != z10) {
            this.f42100w = z10;
            if (z10) {
                this.f42081d.y(new h.d() { // from class: com.google.android.material.button.a
                    @Override // H9.h.d
                    public final void a(float f10) {
                        MaterialButton.b(this.f42113a, f10);
                    }
                });
            } else {
                this.f42081d.y(null);
            }
            post(new Runnable() { // from class: com.google.android.material.button.b
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.a(this.f42114a);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f42083f;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
        n(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m()) {
            this.f42081d.C(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (m()) {
            setRippleColor(AbstractC5323a.a(getContext(), i10));
        }
    }

    @Override // H9.o
    public void setShapeAppearanceModel(l lVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f42081d.D(lVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (m()) {
            this.f42081d.E(z10);
        }
    }

    void setSizeChange(r rVar) {
        if (this.f42076A != rVar) {
            this.f42076A = rVar;
            n(true);
        }
    }

    public void setStateListShapeAppearanceModel(q qVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.f42081d.c() == null && qVar.f()) {
            this.f42081d.z(e());
        }
        this.f42081d.F(qVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m()) {
            this.f42081d.G(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (m()) {
            setStrokeColor(AbstractC5323a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (m()) {
            this.f42081d.H(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (m()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.C2652f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m()) {
            this.f42081d.I(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C2652f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m()) {
            this.f42081d.J(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f42081d.K(z10);
    }

    @Override // android.widget.TextView
    public void setWidth(int i10) {
        this.f42096s = -1.0f;
        super.setWidth(i10);
    }

    void setWidthChangeMax(int i10) {
        if (this.f42077B != i10) {
            this.f42077B = i10;
            n(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f42092o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f42073H;
        super(K9.a.e(context, attributeSet, i10, i11, new int[]{f42074I}), attributeSet, i10);
        this.f42082e = new LinkedHashSet();
        this.f42092o = false;
        this.f42093p = false;
        this.f42095r = -1;
        this.f42096s = -1.0f;
        this.f42097t = -1;
        this.f42098u = -1;
        this.f42103z = -1;
        Context context2 = getContext();
        TypedArray typedArrayI = m.i(context2, attributeSet, AbstractC5848k.f55100Z1, i10, i11, new int[0]);
        this.f42091n = typedArrayI.getDimensionPixelSize(AbstractC5848k.f55219n2, 0);
        this.f42084g = p.h(typedArrayI.getInt(AbstractC5848k.f55243q2, -1), PorterDuff.Mode.SRC_IN);
        this.f42085h = E9.c.a(getContext(), typedArrayI, AbstractC5848k.f55235p2);
        this.f42086i = E9.c.e(getContext(), typedArrayI, AbstractC5848k.f55203l2);
        this.f42094q = typedArrayI.getInteger(AbstractC5848k.f55211m2, 1);
        this.f42088k = typedArrayI.getDimensionPixelSize(AbstractC5848k.f55227o2, 0);
        q qVarB = q.b(context2, typedArrayI, AbstractC5848k.f55267t2);
        l lVarC = qVarB != null ? qVarB.c(true) : l.e(context2, attributeSet, i10, i11).m();
        boolean z10 = typedArrayI.getBoolean(AbstractC5848k.f55251r2, false);
        e eVar = new e(this, lVarC);
        this.f42081d = eVar;
        eVar.t(typedArrayI);
        setCheckedInternal(typedArrayI.getBoolean(AbstractC5848k.f55118b2, false));
        if (qVarB != null) {
            eVar.z(e());
            eVar.F(qVarB);
        }
        setOpticalCenterEnabled(z10);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f42091n);
        q(this.f42086i != null);
    }
}
