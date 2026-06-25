package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2767k0;
import i.AbstractC4956a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC2647a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f24871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f24872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f24873k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f24874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f24875m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LinearLayout f24876n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f24877o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f24878p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f24879q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f24880r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f24881s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f24882t;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f24883a;

        a(androidx.appcompat.view.b bVar) {
            this.f24883a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f24883a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f24876n == null) {
            LayoutInflater.from(getContext()).inflate(i.g.f48090a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f24876n = linearLayout;
            this.f24877o = (TextView) linearLayout.findViewById(i.f.f48069f);
            this.f24878p = (TextView) this.f24876n.findViewById(i.f.f48068e);
            if (this.f24879q != 0) {
                this.f24877o.setTextAppearance(getContext(), this.f24879q);
            }
            if (this.f24880r != 0) {
                this.f24878p.setTextAppearance(getContext(), this.f24880r);
            }
        }
        this.f24877o.setText(this.f24871i);
        this.f24878p.setText(this.f24872j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f24871i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f24872j);
        this.f24878p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f24876n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f24876n.getParent() == null) {
            addView(this.f24876n);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC2647a
    public /* bridge */ /* synthetic */ C2767k0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f24873k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC2647a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC2647a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f24872j;
    }

    public CharSequence getTitle() {
        return this.f24871i;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f24873k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f24882t, (ViewGroup) this, false);
            this.f24873k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f24873k);
        }
        View viewFindViewById = this.f24873k.findViewById(i.f.f48073j);
        this.f24874l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        C2649c c2649c = this.f25264d;
        if (c2649c != null) {
            c2649c.A();
        }
        C2649c c2649c2 = new C2649c(getContext());
        this.f25264d = c2649c2;
        c2649c2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f25264d, this.f25262b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f25264d.q(this);
        this.f25263c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f25263c, layoutParams);
    }

    public boolean j() {
        return this.f24881s;
    }

    public void k() {
        removeAllViews();
        this.f24875m = null;
        this.f25263c = null;
        this.f25264d = null;
        View view = this.f24874l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        C2649c c2649c = this.f25264d;
        if (c2649c != null) {
            return c2649c.M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2649c c2649c = this.f25264d;
        if (c2649c != null) {
            c2649c.D();
            this.f25264d.E();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC2647a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = s0.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f24873k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24873k.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC2647a.d(paddingRight, i14, zB);
            paddingRight = AbstractC2647a.d(iD + e(this.f24873k, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f24876n;
        if (linearLayout != null && this.f24875m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f24876n, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f24875m;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f25263c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f25265e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f24873k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24873k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f25263c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f25263c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f24876n;
        if (linearLayout != null && this.f24875m == null) {
            if (this.f24881s) {
                this.f24876n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f24876n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f24876n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f24875m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f24875m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f25265e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbstractC2647a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC2647a
    public void setContentHeight(int i10) {
        this.f25265e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f24875m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f24875m = view;
        if (view != null && (linearLayout = this.f24876n) != null) {
            removeView(linearLayout);
            this.f24876n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f24872j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f24871i = charSequence;
        i();
        AbstractC2747a0.n0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f24881s) {
            requestLayout();
        }
        this.f24881s = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC2647a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47960g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        h0 h0VarV = h0.v(context, attributeSet, i.j.f48378y, i10, 0);
        setBackground(h0VarV.g(i.j.f48383z));
        this.f24879q = h0VarV.n(i.j.f48145D, 0);
        this.f24880r = h0VarV.n(i.j.f48140C, 0);
        this.f25265e = h0VarV.m(i.j.f48135B, 0);
        this.f24882t = h0VarV.n(i.j.f48130A, i.g.f48093d);
        h0VarV.x();
    }
}
