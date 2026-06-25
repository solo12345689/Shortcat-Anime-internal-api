package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C2650d;
import androidx.appcompat.widget.U;
import i.AbstractC4956a;
import java.util.List;
import o9.AbstractC5840c;
import o9.AbstractC5844g;
import o9.AbstractC5848k;
import x9.AbstractC7066a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class v extends C2650d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final U f43027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AccessibilityManager f43028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f43029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f43030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f43031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f43032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f43033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f43034l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            v vVar = v.this;
            Object objV = i10 < 0 ? vVar.f43027e.v() : vVar.getAdapter().getItem(i10);
            v vVar2 = v.this;
            vVar2.setText(vVar2.convertSelectionToString(objV), false);
            AdapterView.OnItemClickListener onItemClickListener = v.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = v.this.f43027e.y();
                    i10 = v.this.f43027e.x();
                    j10 = v.this.f43027e.w();
                }
                onItemClickListener.onItemClick(v.this.f43027e.o(), view, i10, j10);
            }
            v.this.f43027e.dismiss();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b extends ArrayAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ColorStateList f43036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ColorStateList f43037b;

        b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = v.this.f43034l.getColorForState(iArr2, 0);
            int colorForState2 = v.this.f43034l.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{AbstractC7066a.i(v.this.f43033k, colorForState), AbstractC7066a.i(v.this.f43033k, colorForState2), v.this.f43033k});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(v.this.f43033k);
            if (this.f43037b == null) {
                return colorDrawable;
            }
            colorDrawable.setTintList(this.f43036a);
            return new RippleDrawable(this.f43037b, colorDrawable, null);
        }

        private boolean c() {
            return v.this.f43033k != 0;
        }

        private boolean d() {
            return v.this.f43034l != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{v.this.f43034l.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f43037b = e();
            this.f43036a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setBackground(v.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47966m);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f43028f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f43028f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f43028f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i10 = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f43027e.x()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableG = this.f43027e.g();
        if (drawableG != null) {
            drawableG.getPadding(this.f43029g);
            Rect rect = this.f43029g;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.s0();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f43027e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f43032j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.T()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.f43031i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f43033k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f43034l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.T() && super.getHint() == null && com.google.android.material.internal.e.b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43027e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f43027e.m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        U u10 = this.f43027e;
        if (u10 != null) {
            u10.p(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f43032j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof H9.h) {
            ((H9.h) dropDownBackground).d0(this.f43032j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f43027e.M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f43033k = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f43034l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f43027e.c();
        } else {
            super.showDropDown();
        }
    }

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(K9.a.d(context, attributeSet, i10, 0), attributeSet, i10);
        this.f43029g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.m.i(context2, attributeSet, AbstractC5848k.f55036R1, i10, i.i.f48129f, new int[0]);
        if (typedArrayI.hasValue(AbstractC5848k.f55044S1) && typedArrayI.getInt(AbstractC5848k.f55044S1, 0) == 0) {
            setKeyListener(null);
        }
        this.f43030h = typedArrayI.getResourceId(AbstractC5848k.f55068V1, AbstractC5844g.f54829m);
        this.f43031i = typedArrayI.getDimensionPixelOffset(AbstractC5848k.f55052T1, AbstractC5840c.f54726j0);
        if (typedArrayI.hasValue(AbstractC5848k.f55060U1)) {
            this.f43032j = ColorStateList.valueOf(typedArrayI.getColor(AbstractC5848k.f55060U1, 0));
        }
        this.f43033k = typedArrayI.getColor(AbstractC5848k.f55076W1, 0);
        this.f43034l = E9.c.a(context2, typedArrayI, AbstractC5848k.f55084X1);
        this.f43028f = (AccessibilityManager) context2.getSystemService("accessibility");
        U u10 = new U(context2);
        this.f43027e = u10;
        u10.J(true);
        u10.D(this);
        u10.I(2);
        u10.m(getAdapter());
        u10.L(new a());
        if (typedArrayI.hasValue(AbstractC5848k.f55092Y1)) {
            setSimpleItems(typedArrayI.getResourceId(AbstractC5848k.f55092Y1, 0));
        }
        typedArrayI.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f43030h, strArr));
    }
}
