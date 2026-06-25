package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.C2767k0;
import i.AbstractC4956a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.AbstractC5410a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class P extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f25014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f25020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C2767k0 f25024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.core.widget.f f25025l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    f f25026m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Method f25027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f25028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f25029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f25030d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f25027a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f25028b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f25029c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f25030d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        static boolean a() {
            return f25030d;
        }

        static void b(P p10, int i10, View view) {
            try {
                f25027a.invoke(p10, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f25028b.invoke(p10, Integer.valueOf(i10));
                f25029c.invoke(p10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends AbstractC5410a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25031b;

        d(Drawable drawable) {
            super(drawable);
            this.f25031b = true;
        }

        void b(boolean z10) {
            this.f25031b = z10;
        }

        @Override // k.AbstractC5410a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f25031b) {
                super.draw(canvas);
            }
        }

        @Override // k.AbstractC5410a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f25031b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // k.AbstractC5410a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f25031b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // k.AbstractC5410a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f25031b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // k.AbstractC5410a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f25031b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Field f25032a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f25032a = declaredField;
        }

        static boolean a(AbsListView absListView) {
            Field field = f25032a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z10) {
            Field field = f25032a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class f implements Runnable {
        f() {
        }

        public void a() {
            P p10 = P.this;
            p10.f25026m = null;
            p10.removeCallbacks(this);
        }

        public void b() {
            P.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            P p10 = P.this;
            p10.f25026m = null;
            p10.drawableStateChanged();
        }
    }

    P(Context context, boolean z10) {
        super(context, null, AbstractC4956a.f47979z);
        this.f25014a = new Rect();
        this.f25015b = 0;
        this.f25016c = 0;
        this.f25017d = 0;
        this.f25018e = 0;
        this.f25022i = z10;
        setCacheColorHint(0);
    }

    private void a() {
        this.f25023j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f25019f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C2767k0 c2767k0 = this.f25024k;
        if (c2767k0 != null) {
            c2767k0.c();
            this.f25024k = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f25014a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f25014a);
        selector.draw(canvas);
    }

    private void f(int i10, View view) {
        Rect rect = this.f25014a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f25015b;
        rect.top -= this.f25016c;
        rect.right += this.f25017d;
        rect.bottom += this.f25018e;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f25014a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            B1.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        B1.a.k(selector, f10, f11);
    }

    private void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f25023j = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f25019f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f25019f = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z10) {
        d dVar = this.f25020g;
        if (dVar != null) {
            dVar.b(z10);
        }
    }

    private boolean k() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void l(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    private boolean m() {
        return this.f25023j;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f25026m != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.f r9 = r7.f25025l
            if (r9 != 0) goto L5a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f25025l = r9
        L5a:
            androidx.core.widget.f r9 = r7.f25025l
            r9.m(r1)
            androidx.core.widget.f r9 = r7.f25025l
            r9.onTouch(r7, r8)
            return r3
        L65:
            androidx.core.widget.f r8 = r7.f25025l
            if (r8 == 0) goto L6c
            r8.m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.P.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f25022i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f25022i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f25022i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f25022i && this.f25021h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f25026m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f25026m == null) {
            f fVar = new f();
            this.f25026m = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !b.a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, iPointToPosition, childAt);
                }
            }
            n();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f25019f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f25026m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z10) {
        this.f25021h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f25020g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f25015b = rect.left;
        this.f25016c = rect.top;
        this.f25017d = rect.right;
        this.f25018e = rect.bottom;
    }
}
