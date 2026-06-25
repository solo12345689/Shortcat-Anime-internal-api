package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private boolean f24861a;

    /* JADX INFO: renamed from: b */
    private View f24862b;

    /* JADX INFO: renamed from: c */
    private View f24863c;

    /* JADX INFO: renamed from: d */
    private View f24864d;

    /* JADX INFO: renamed from: e */
    Drawable f24865e;

    /* JADX INFO: renamed from: f */
    Drawable f24866f;

    /* JADX INFO: renamed from: g */
    Drawable f24867g;

    /* JADX INFO: renamed from: h */
    boolean f24868h;

    /* JADX INFO: renamed from: i */
    boolean f24869i;

    /* JADX INFO: renamed from: j */
    private int f24870j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C2648b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f48258a);
        this.f24865e = typedArrayObtainStyledAttributes.getDrawable(i.j.f48263b);
        this.f24866f = typedArrayObtainStyledAttributes.getDrawable(i.j.f48273d);
        this.f24870j = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f48303j, -1);
        boolean z10 = true;
        if (getId() == i.f.f48055I) {
            this.f24868h = true;
            this.f24867g = typedArrayObtainStyledAttributes.getDrawable(i.j.f48268c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f24868h ? this.f24865e != null || this.f24866f != null : this.f24867g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f24865e;
        if (drawable != null && drawable.isStateful()) {
            this.f24865e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f24866f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f24866f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f24867g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f24867g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f24862b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f24865e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f24866f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f24867g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24863c = findViewById(i.f.f48064a);
        this.f24864d = findViewById(i.f.f48070g);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f24861a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0049 A[PHI: r1
  0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:70:0x00a6, B:72:0x00aa, B:54:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            r6 = r5
            android.view.View r8 = r6.f24862b
            r10 = 8
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L14
            int r2 = r8.getVisibility()
            if (r2 == r10) goto L14
            r2 = r0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r8 == 0) goto L34
            int r3 = r8.getVisibility()
            if (r3 == r10) goto L34
            int r10 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r8.getMeasuredHeight()
            int r4 = r10 - r4
            int r3 = r3.bottomMargin
            int r4 = r4 - r3
            int r10 = r10 - r3
            r8.layout(r7, r4, r9, r10)
        L34:
            boolean r7 = r6.f24868h
            if (r7 == 0) goto L4c
            android.graphics.drawable.Drawable r7 = r6.f24867g
            if (r7 == 0) goto L49
            int r8 = r5.getMeasuredWidth()
            int r9 = r5.getMeasuredHeight()
            r7.setBounds(r1, r1, r8, r9)
            goto Lbf
        L49:
            r0 = r1
            goto Lbf
        L4c:
            android.graphics.drawable.Drawable r7 = r6.f24865e
            if (r7 == 0) goto La4
            android.view.View r7 = r6.f24863c
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L76
            android.graphics.drawable.Drawable r7 = r6.f24865e
            android.view.View r9 = r6.f24863c
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f24863c
            int r10 = r10.getTop()
            android.view.View r1 = r6.f24863c
            int r1 = r1.getRight()
            android.view.View r3 = r6.f24863c
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L76:
            android.view.View r7 = r6.f24864d
            if (r7 == 0) goto L9e
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L9e
            android.graphics.drawable.Drawable r7 = r6.f24865e
            android.view.View r9 = r6.f24864d
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f24864d
            int r10 = r10.getTop()
            android.view.View r1 = r6.f24864d
            int r1 = r1.getRight()
            android.view.View r3 = r6.f24864d
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L9e:
            android.graphics.drawable.Drawable r7 = r6.f24865e
            r7.setBounds(r1, r1, r1, r1)
        La3:
            r1 = r0
        La4:
            r6.f24869i = r2
            if (r2 == 0) goto L49
            android.graphics.drawable.Drawable r7 = r6.f24866f
            if (r7 == 0) goto L49
            int r9 = r8.getLeft()
            int r10 = r8.getTop()
            int r1 = r8.getRight()
            int r8 = r8.getBottom()
            r7.setBounds(r9, r10, r1, r8)
        Lbf:
            if (r0 == 0) goto Lc4
            r5.invalidate()
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f24863c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f24870j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f24863c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f24862b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f24863c) ? a(this.f24863c) : !b(this.f24864d) ? a(this.f24864d) : 0) + a(this.f24862b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f24865e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f24865e);
        }
        this.f24865e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f24863c;
            if (view != null) {
                this.f24865e.setBounds(view.getLeft(), this.f24863c.getTop(), this.f24863c.getRight(), this.f24863c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f24868h ? !(this.f24865e != null || this.f24866f != null) : this.f24867g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f24867g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f24867g);
        }
        this.f24867g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f24868h && (drawable2 = this.f24867g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f24868h ? !(this.f24865e != null || this.f24866f != null) : this.f24867g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f24866f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f24866f);
        }
        this.f24866f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f24869i && (drawable2 = this.f24866f) != null) {
                drawable2.setBounds(this.f24862b.getLeft(), this.f24862b.getTop(), this.f24862b.getRight(), this.f24862b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f24868h ? !(this.f24865e != null || this.f24866f != null) : this.f24867g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(a0 a0Var) {
        View view = this.f24862b;
        if (view != null) {
            removeView(view);
        }
        this.f24862b = a0Var;
    }

    public void setTransitioning(boolean z10) {
        this.f24861a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f24865e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f24866f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f24867g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f24865e && !this.f24868h) {
            return true;
        }
        if (drawable == this.f24866f && this.f24869i) {
            return true;
        }
        return (drawable == this.f24867g && this.f24868h) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
