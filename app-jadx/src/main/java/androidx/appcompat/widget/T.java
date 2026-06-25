package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC2747a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class T extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f25126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f25128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f25129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f25130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f25133n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25134o;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public T(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(int r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3b
            android.view.View r3 = r9.q(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.T$a r1 = (androidx.appcompat.widget.T.a) r1
            int r2 = r1.height
            r4 = -1
            if (r2 != r4) goto L36
            int r8 = r1.width
            int r2 = r3.getMeasuredWidth()
            r1.width = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r4 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.width = r8
            goto L37
        L36:
            r4 = r11
        L37:
            int r0 = r0 + 1
            r11 = r4
            goto Lb
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.T.i(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j(int r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3b
            android.view.View r3 = r9.q(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L36
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.T$a r1 = (androidx.appcompat.widget.T.a) r1
            int r2 = r1.width
            r5 = -1
            if (r2 != r5) goto L36
            int r8 = r1.height
            int r2 = r3.getMeasuredHeight()
            r1.height = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r6 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.height = r8
            goto L37
        L36:
            r6 = r11
        L37:
            int r0 = r0 + 1
            r11 = r6
            goto Lb
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.T.j(int, int):void");
    }

    private void y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void e(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = s0.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View viewQ = q(i11);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i11)) {
                a aVar = (a) viewQ.getLayoutParams();
                h(canvas, zB ? viewQ.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewQ.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f25131l);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            if (viewQ2 != null) {
                a aVar2 = (a) viewQ2.getLayoutParams();
                if (zB) {
                    left = viewQ2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f25131l;
                    right = left - i10;
                } else {
                    right = viewQ2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f25131l;
                right = left - i10;
            }
            h(canvas, right);
        }
    }

    void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewQ = q(i10);
            if (viewQ != null && viewQ.getVisibility() != 8 && r(i10)) {
                g(canvas, (viewQ.getTop() - ((LinearLayout.LayoutParams) ((a) viewQ.getLayoutParams())).topMargin) - this.f25132m);
            }
        }
        if (r(virtualChildCount)) {
            View viewQ2 = q(virtualChildCount - 1);
            g(canvas, viewQ2 == null ? (getHeight() - getPaddingBottom()) - this.f25132m : viewQ2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewQ2.getLayoutParams())).bottomMargin);
        }
    }

    void g(Canvas canvas, int i10) {
        this.f25130k.setBounds(getPaddingLeft() + this.f25134o, i10, (getWidth() - getPaddingRight()) - this.f25134o, this.f25132m + i10);
        this.f25130k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f25121b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f25121b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f25121b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f25122c;
        if (this.f25123d == 1 && (i10 = this.f25124e & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f25125f) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f25125f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f25121b;
    }

    public Drawable getDividerDrawable() {
        return this.f25130k;
    }

    public int getDividerPadding() {
        return this.f25134o;
    }

    public int getDividerWidth() {
        return this.f25131l;
    }

    public int getGravity() {
        return this.f25124e;
    }

    public int getOrientation() {
        return this.f25123d;
    }

    public int getShowDividers() {
        return this.f25133n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f25126g;
    }

    void h(Canvas canvas, int i10) {
        this.f25130k.setBounds(i10, getPaddingTop() + this.f25134o, this.f25131l + i10, (getHeight() - getPaddingBottom()) - this.f25134o);
        this.f25130k.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f25123d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    int n(View view, int i10) {
        return 0;
    }

    int o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f25130k == null) {
            return;
        }
        if (this.f25123d == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f25123d == 1) {
            t(i10, i11, i12, i13);
        } else {
            s(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f25123d == 1) {
            x(i10, i11);
        } else {
            v(i10, i11);
        }
    }

    int p(View view) {
        return 0;
    }

    View q(int i10) {
        return getChildAt(i10);
    }

    protected boolean r(int i10) {
        if (i10 == 0) {
            return (this.f25133n & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f25133n & 4) != 0;
        }
        if ((this.f25133n & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void s(int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.T.s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f25120a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f25121b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f25130k) {
            return;
        }
        this.f25130k = drawable;
        if (drawable != null) {
            this.f25131l = drawable.getIntrinsicWidth();
            this.f25132m = drawable.getIntrinsicHeight();
        } else {
            this.f25131l = 0;
            this.f25132m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f25134o = i10;
    }

    public void setGravity(int i10) {
        if (this.f25124e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f25124e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f25124e;
        if ((8388615 & i12) != i11) {
            this.f25124e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f25127h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f25123d != i10) {
            this.f25123d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f25133n) {
            requestLayout();
        }
        this.f25133n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f25124e;
        if ((i12 & 112) != i11) {
            this.f25124e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f25126g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void t(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r11.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.f25124e
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L35
            r4 = 80
            if (r3 == r4) goto L2a
            int r13 = r11.getPaddingTop()
            goto L41
        L2a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.f25125f
            int r13 = r3 - r13
            goto L41
        L35:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.f25125f
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r3 + r15
        L41:
            r15 = 0
        L42:
            if (r15 >= r1) goto Lb9
            android.view.View r4 = r11.q(r15)
            r9 = 1
            if (r4 != 0) goto L52
            int r3 = r11.w(r15)
            int r13 = r13 + r3
        L50:
            r3 = r11
            goto Lb7
        L52:
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto L50
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r10 = r3
            androidx.appcompat.widget.T$a r10 = (androidx.appcompat.widget.T.a) r10
            int r3 = r10.gravity
            if (r3 >= 0) goto L6e
            r3 = r2
        L6e:
            int r5 = r11.getLayoutDirection()
            int r3 = androidx.core.view.AbstractC2781s.b(r3, r5)
            r3 = r3 & 7
            if (r3 == r9) goto L88
            r5 = 5
            if (r3 == r5) goto L82
            int r3 = r10.leftMargin
            int r3 = r3 + r0
        L80:
            r5 = r3
            goto L93
        L82:
            int r3 = r12 - r7
            int r5 = r10.rightMargin
        L86:
            int r3 = r3 - r5
            goto L80
        L88:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r5 = r10.leftMargin
            int r3 = r3 + r5
            int r5 = r10.rightMargin
            goto L86
        L93:
            boolean r3 = r11.r(r15)
            if (r3 == 0) goto L9c
            int r3 = r11.f25132m
            int r13 = r13 + r3
        L9c:
            int r3 = r10.topMargin
            int r13 = r13 + r3
            int r3 = r11.o(r4)
            int r6 = r13 + r3
            r3 = r11
            r3.y(r4, r5, r6, r7, r8)
            int r5 = r10.bottomMargin
            int r8 = r8 + r5
            int r5 = r11.p(r4)
            int r8 = r8 + r5
            int r13 = r13 + r8
            int r4 = r11.n(r4, r15)
            int r15 = r15 + r4
        Lb7:
            int r15 = r15 + r9
            goto L42
        Lb9:
            r3 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.T.t(int, int, int, int):void");
    }

    void u(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void v(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.T.v(int, int):void");
    }

    int w(int i10) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void x(int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.T.x(int, int):void");
    }

    public T(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25120a = true;
        this.f25121b = -1;
        this.f25122c = 0;
        this.f25124e = 8388659;
        h0 h0VarV = h0.v(context, attributeSet, i.j.f48260a1, i10, 0);
        AbstractC2747a0.i0(this, context, i.j.f48260a1, attributeSet, h0VarV.r(), i10, 0);
        int iK = h0VarV.k(i.j.f48270c1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = h0VarV.k(i.j.f48265b1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = h0VarV.a(i.j.f48275d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f25126g = h0VarV.i(i.j.f48285f1, -1.0f);
        this.f25121b = h0VarV.k(i.j.f48280e1, -1);
        this.f25127h = h0VarV.a(i.j.f48300i1, false);
        setDividerDrawable(h0VarV.g(i.j.f48290g1));
        this.f25133n = h0VarV.k(i.j.f48305j1, 0);
        this.f25134o = h0VarV.f(i.j.f48295h1, 0);
        h0VarV.x();
    }
}
