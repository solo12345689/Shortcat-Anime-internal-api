package v9;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C2653g;
import androidx.appcompat.widget.h0;
import androidx.vectordrawable.graphics.drawable.c;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.m;
import com.google.android.material.internal.p;
import i.AbstractC4956a;
import j.AbstractC5323a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m0.AbstractC5603a;
import m0.AbstractC5604b;
import o9.AbstractC5838a;
import o9.AbstractC5841d;
import o9.AbstractC5842e;
import o9.AbstractC5846i;
import o9.AbstractC5847j;
import o9.AbstractC5848k;
import x9.AbstractC7066a;

/* JADX INFO: renamed from: v9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6854b extends C2653g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int[] f62008A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int[][] f62009B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final int f62010C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f62011y = AbstractC5847j.f54893v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f62012z = {AbstractC5838a.f54597F0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f62013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LinkedHashSet f62014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f62015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f62016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f62017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f62018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f62019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f62020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f62021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f62022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ColorStateList f62023o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ColorStateList f62024p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f62025q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f62026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f62027s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f62028t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f62029u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f62030v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final c f62031w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f62032x;

    /* JADX INFO: renamed from: v9.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = C6854b.this.f62023o;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            C6854b c6854b = C6854b.this;
            ColorStateList colorStateList = c6854b.f62023o;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(c6854b.f62027s, C6854b.this.f62023o.getDefaultColor()));
            }
        }
    }

    /* JADX INFO: renamed from: v9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C0933b extends View.BaseSavedState {
        public static final Parcelable.Creator<C0933b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f62034a;

        /* JADX INFO: renamed from: v9.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0933b createFromParcel(Parcel parcel) {
                return new C0933b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0933b[] newArray(int i10) {
                return new C0933b[i10];
            }
        }

        /* synthetic */ C0933b(Parcel parcel, a aVar) {
            this(parcel);
        }

        private String a() {
            int i10 = this.f62034a;
            return i10 != 1 ? i10 != 2 ? "unchecked" : ReactProgressBarViewManager.PROP_INDETERMINATE : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f62034a));
        }

        C0933b(Parcelable parcelable) {
            super(parcelable);
        }

        private C0933b(Parcel parcel) {
            super(parcel);
            this.f62034a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i10 = AbstractC5838a.f54595E0;
        f62008A = new int[]{i10};
        f62009B = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f62010C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public C6854b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47968o);
    }

    private boolean c(h0 h0Var) {
        return h0Var.n(AbstractC5848k.f55164g3, 0) == f62010C && h0Var.n(AbstractC5848k.f55172h3, 0) == 0;
    }

    private void e() {
        this.f62020l = d.c(this.f62020l, this.f62023o, androidx.core.widget.c.c(this));
        this.f62021m = d.c(this.f62021m, this.f62024p, this.f62025q);
        g();
        h();
        super.setButtonDrawable(d.a(this.f62020l, this.f62021m));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f62029u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        c cVar;
        if (this.f62022n) {
            c cVar2 = this.f62031w;
            if (cVar2 != null) {
                cVar2.f(this.f62032x);
                this.f62031w.b(this.f62032x);
            }
            Drawable drawable = this.f62020l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f62031w) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(AbstractC5842e.f54789b, AbstractC5842e.f54787Y, cVar, false);
            ((AnimatedStateListDrawable) this.f62020l).addTransition(AbstractC5842e.f54795h, AbstractC5842e.f54787Y, this.f62031w, false);
        }
    }

    private String getButtonStateDescription() {
        int i10 = this.f62026r;
        return i10 == 1 ? getResources().getString(AbstractC5846i.f54853k) : i10 == 0 ? getResources().getString(AbstractC5846i.f54855m) : getResources().getString(AbstractC5846i.f54854l);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f62015g == null) {
            int[][] iArr = f62009B;
            int[] iArr2 = new int[iArr.length];
            int iD = AbstractC7066a.d(this, AbstractC4956a.f47972s);
            int iD2 = AbstractC7066a.d(this, AbstractC4956a.f47975v);
            int iD3 = AbstractC7066a.d(this, AbstractC5838a.f54604J);
            int iD4 = AbstractC7066a.d(this, AbstractC5838a.f54657r);
            iArr2[0] = AbstractC7066a.j(iD3, iD2, 1.0f);
            iArr2[1] = AbstractC7066a.j(iD3, iD, 1.0f);
            iArr2[2] = AbstractC7066a.j(iD3, iD4, 0.54f);
            iArr2[3] = AbstractC7066a.j(iD3, iD4, 0.38f);
            iArr2[4] = AbstractC7066a.j(iD3, iD4, 0.38f);
            this.f62015g = new ColorStateList(iArr, iArr2);
        }
        return this.f62015g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f62023o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f62020l;
        if (drawable != null && (colorStateList2 = this.f62023o) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.f62021m;
        if (drawable2 == null || (colorStateList = this.f62024p) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    public boolean d() {
        return this.f62018j;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f62020l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f62021m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f62024p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f62025q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f62023o;
    }

    public int getCheckedState() {
        return this.f62026r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f62019k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f62026r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f62016h && this.f62023o == null && this.f62024p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f62012z);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f62008A);
        }
        this.f62027s = d.e(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f62017i || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (p.g(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f62019k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0933b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0933b c0933b = (C0933b) parcelable;
        super.onRestoreInstanceState(c0933b.getSuperState());
        setCheckedState(c0933b.f62034a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        C0933b c0933b = new C0933b(super.onSaveInstanceState());
        c0933b.f62034a = getCheckedState();
        return c0933b;
    }

    @Override // androidx.appcompat.widget.C2653g, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC5323a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f62021m = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(AbstractC5323a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f62024p == colorStateList) {
            return;
        }
        this.f62024p = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f62025q == mode) {
            return;
        }
        this.f62025q = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f62023o == colorStateList) {
            return;
        }
        this.f62023o = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f62017i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f62026r != i10) {
            this.f62026r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (this.f62028t) {
                return;
            }
            this.f62028t = true;
            LinkedHashSet linkedHashSet = this.f62014f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
            if (this.f62026r != 2 && (onCheckedChangeListener = this.f62030v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = AbstractC5604b.a(getContext().getSystemService(AbstractC5603a.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.f62028t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f62019k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f62018j == z10) {
            return;
        }
        this.f62018j = z10;
        refreshDrawableState();
        Iterator it = this.f62013e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f62030v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f62029u = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f62016h = z10;
        if (z10) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6854b(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f62011y;
        super(K9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f62013e = new LinkedHashSet();
        this.f62014f = new LinkedHashSet();
        this.f62031w = c.a(getContext(), AbstractC5841d.f54757e);
        this.f62032x = new a();
        Context context2 = getContext();
        this.f62020l = androidx.core.widget.c.a(this);
        this.f62023o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        h0 h0VarJ = m.j(context2, attributeSet, AbstractC5848k.f55155f3, i10, i11, new int[0]);
        this.f62021m = h0VarJ.g(AbstractC5848k.f55180i3);
        if (this.f62020l != null && m.g(context2) && c(h0VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f62020l = AbstractC5323a.b(context2, AbstractC5841d.f54756d);
            this.f62022n = true;
            if (this.f62021m == null) {
                this.f62021m = AbstractC5323a.b(context2, AbstractC5841d.f54758f);
            }
        }
        this.f62024p = E9.c.b(context2, h0VarJ, AbstractC5848k.f55188j3);
        this.f62025q = p.h(h0VarJ.k(AbstractC5848k.f55196k3, -1), PorterDuff.Mode.SRC_IN);
        this.f62016h = h0VarJ.a(AbstractC5848k.f55236p3, false);
        this.f62017i = h0VarJ.a(AbstractC5848k.f55204l3, true);
        this.f62018j = h0VarJ.a(AbstractC5848k.f55228o3, false);
        this.f62019k = h0VarJ.p(AbstractC5848k.f55220n3);
        if (h0VarJ.s(AbstractC5848k.f55212m3)) {
            setCheckedState(h0VarJ.k(AbstractC5848k.f55212m3, 0));
        }
        h0VarJ.x();
        e();
    }

    @Override // androidx.appcompat.widget.C2653g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f62020l = drawable;
        this.f62022n = false;
        e();
    }
}
