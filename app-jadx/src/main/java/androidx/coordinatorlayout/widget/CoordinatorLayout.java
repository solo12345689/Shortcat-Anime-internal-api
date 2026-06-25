package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.AbstractC2781s;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.I;
import androidx.core.view.L0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w1.AbstractC6924a;
import w1.AbstractC6925b;
import w1.AbstractC6926c;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements F, G {

    /* JADX INFO: renamed from: t */
    static final String f28678t;

    /* JADX INFO: renamed from: u */
    static final Class[] f28679u;

    /* JADX INFO: renamed from: v */
    static final ThreadLocal f28680v;

    /* JADX INFO: renamed from: w */
    static final Comparator f28681w;

    /* JADX INFO: renamed from: x */
    private static final K1.d f28682x;

    /* JADX INFO: renamed from: a */
    private final List f28683a;

    /* JADX INFO: renamed from: b */
    private final androidx.coordinatorlayout.widget.a f28684b;

    /* JADX INFO: renamed from: c */
    private final List f28685c;

    /* JADX INFO: renamed from: d */
    private Paint f28686d;

    /* JADX INFO: renamed from: e */
    private final int[] f28687e;

    /* JADX INFO: renamed from: f */
    private final int[] f28688f;

    /* JADX INFO: renamed from: g */
    private boolean f28689g;

    /* JADX INFO: renamed from: h */
    private boolean f28690h;

    /* JADX INFO: renamed from: i */
    private int[] f28691i;

    /* JADX INFO: renamed from: j */
    private View f28692j;

    /* JADX INFO: renamed from: k */
    private View f28693k;

    /* JADX INFO: renamed from: l */
    private g f28694l;

    /* JADX INFO: renamed from: m */
    private boolean f28695m;

    /* JADX INFO: renamed from: n */
    private L0 f28696n;

    /* JADX INFO: renamed from: o */
    private boolean f28697o;

    /* JADX INFO: renamed from: p */
    private Drawable f28698p;

    /* JADX INFO: renamed from: q */
    ViewGroup.OnHierarchyChangeListener f28699q;

    /* JADX INFO: renamed from: r */
    private I f28700r;

    /* JADX INFO: renamed from: s */
    private final H f28701s;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements I {
        a() {
        }

        @Override // androidx.core.view.I
        public L0 d(View view, L0 l02) {
            return CoordinatorLayout.this.d0(l02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        c getBehavior();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void j() {
        }

        public void g(f fVar) {
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public L0 f(CoordinatorLayout coordinatorLayout, View view, L0 l02) {
            return l02;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f28699q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.N(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f28699q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.N(0);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a */
        public int compare(View view, View view2) {
            float fL = AbstractC2747a0.L(view);
            float fL2 = AbstractC2747a0.L(view2);
            if (fL > fL2) {
                return -1;
            }
            return fL < fL2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f28678t = r02 != null ? r02.getName() : null;
        f28681w = new i();
        f28679u = new Class[]{Context.class, AttributeSet.class};
        f28680v = new ThreadLocal();
        f28682x = new K1.e(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private void A(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iB = AbstractC2781s.b(Y(fVar.f28706c), i10);
        int iB2 = AbstractC2781s.b(Z(fVar.f28707d), i10);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int i15 = iB2 & 7;
        int i16 = iB2 & 112;
        int iWidth = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int B(int i10) {
        int[] iArr = this.f28691i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    private void E(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = f28681w;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean F(View view) {
        return this.f28684b.k(view);
    }

    private void H(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect rectE = e();
        rectE.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f28696n != null && AbstractC2747a0.v(this) && !AbstractC2747a0.v(view)) {
            rectE.left += this.f28696n.k();
            rectE.top += this.f28696n.m();
            rectE.right -= this.f28696n.l();
            rectE.bottom -= this.f28696n.j();
        }
        Rect rectE2 = e();
        AbstractC2781s.a(Z(fVar.f28706c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectE, rectE2, i10);
        view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        V(rectE);
        V(rectE2);
    }

    private void I(View view, View view2, int i10) {
        Rect rectE = e();
        Rect rectE2 = e();
        try {
            y(view2, rectE);
            z(view, i10, rectE, rectE2);
            view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        } finally {
            V(rectE);
            V(rectE2);
        }
    }

    private void J(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int iB = AbstractC2781s.b(a0(fVar.f28706c), i11);
        int i12 = iB & 7;
        int i13 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iB2 = B(i10) - measuredWidth;
        if (i12 == 1) {
            iB2 += measuredWidth / 2;
        } else if (i12 == 5) {
            iB2 += measuredWidth;
        }
        int i14 = i13 != 16 ? i13 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iB2, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private MotionEvent K(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private void L(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (AbstractC2747a0.Q(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            Rect rectE = e();
            Rect rectE2 = e();
            rectE2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarE == null || !cVarE.b(this, view, rectE)) {
                rectE.set(rectE2);
            } else if (!rectE2.contains(rectE)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectE.toShortString() + " | Bounds:" + rectE2.toShortString());
            }
            V(rectE2);
            if (rectE.isEmpty()) {
                V(rectE);
                return;
            }
            int iB = AbstractC2781s.b(fVar.f28711h, i10);
            boolean z12 = true;
            if ((iB & 48) != 48 || (i15 = (rectE.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f28713j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                c0(view, i16 - i15);
                z10 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectE.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f28713j) < (i14 = rect.bottom)) {
                c0(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                c0(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectE.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f28712i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                b0(view, i13 - i12);
                z11 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectE.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f28712i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                b0(view, width - i11);
            }
            if (!z12) {
                b0(view, 0);
            }
            V(rectE);
        }
    }

    static c Q(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f28678t;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + com.amazon.a.a.o.c.a.b.f34706a + str;
            }
        }
        try {
            ThreadLocal threadLocal = f28680v;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f28679u);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean R(c cVar, View view, MotionEvent motionEvent, int i10) {
        if (i10 == 0) {
            return cVar.k(this, view, motionEvent);
        }
        if (i10 == 1) {
            return cVar.D(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    private boolean S(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f28685c;
        E(list);
        int size = list.size();
        MotionEvent motionEventK = null;
        boolean zR = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            if (!(zR || z10) || actionMasked == 0) {
                if (!z10 && !zR && cVarE != null && (zR = R(cVarE, view, motionEvent, i10))) {
                    this.f28692j = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i12 = 0; i12 < i11; i12++) {
                            View view2 = (View) list.get(i12);
                            c cVarE2 = ((f) view2.getLayoutParams()).e();
                            if (cVarE2 != null) {
                                if (motionEventK == null) {
                                    motionEventK = K(motionEvent);
                                }
                                R(cVarE2, view2, motionEventK, i10);
                            }
                        }
                    }
                }
                boolean zC = fVar.c();
                boolean zH = fVar.h(this, view);
                z10 = zH && !zC;
                if (zH && !z10) {
                    break;
                }
            } else if (cVarE != null) {
                if (motionEventK == null) {
                    motionEventK = K(motionEvent);
                }
                R(cVarE, view, motionEventK, i10);
            }
        }
        list.clear();
        if (motionEventK != null) {
            motionEventK.recycle();
        }
        return zR;
    }

    private void T() {
        this.f28683a.clear();
        this.f28684b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVarD = D(childAt);
            fVarD.d(this, childAt);
            this.f28684b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (fVarD.b(this, childAt, childAt2)) {
                        if (!this.f28684b.d(childAt2)) {
                            this.f28684b.b(childAt2);
                        }
                        this.f28684b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f28683a.addAll(this.f28684b.j());
        Collections.reverse(this.f28683a);
    }

    private static void V(Rect rect) {
        rect.setEmpty();
        f28682x.a(rect);
    }

    private void X() {
        View view = this.f28692j;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            if (cVarE != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                cVarE.D(this, this.f28692j, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.f28692j = null;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).l();
        }
        this.f28689g = false;
    }

    private static int Y(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int Z(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int a0(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void b0(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f28712i;
        if (i11 != i10) {
            AbstractC2747a0.U(view, i10 - i11);
            fVar.f28712i = i10;
        }
    }

    private void c0(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f28713j;
        if (i11 != i10) {
            AbstractC2747a0.V(view, i10 - i11);
            fVar.f28713j = i10;
        }
    }

    private static Rect e() {
        Rect rect = (Rect) f28682x.b();
        return rect == null ? new Rect() : rect;
    }

    private void e0() {
        if (!AbstractC2747a0.v(this)) {
            AbstractC2747a0.w0(this, null);
            return;
        }
        if (this.f28700r == null) {
            this.f28700r = new a();
        }
        AbstractC2747a0.w0(this, this.f28700r);
        setSystemUiVisibility(1280);
    }

    private void g() {
        int childCount = getChildCount();
        MotionEvent motionEventObtain = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (cVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                cVarE.k(this, childAt, motionEventObtain);
            }
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
    }

    private static int h(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private void l(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private L0 p(L0 l02) {
        c cVarE;
        if (l02.q()) {
            return l02;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (AbstractC2747a0.v(childAt) && (cVarE = ((f) childAt.getLayoutParams()).e()) != null) {
                l02 = cVarE.f(this, childAt, l02);
                if (l02.q()) {
                    return l02;
                }
            }
        }
        return l02;
    }

    void C(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f D(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f28705b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.n(behavior);
                fVar.f28705b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.n((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            fVar.f28705b = true;
        }
        return fVar;
    }

    public boolean G(View view, int i10, int i11) {
        Rect rectE = e();
        y(view, rectE);
        try {
            return rectE.contains(i10, i11);
        } finally {
            V(rectE);
        }
    }

    void M(View view, int i10) {
        c cVarE;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f28714k != null) {
            Rect rectE = e();
            Rect rectE2 = e();
            Rect rectE3 = e();
            y(fVar.f28714k, rectE);
            v(view, false, rectE2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            A(i10, rectE, rectE3, fVar, measuredWidth, measuredHeight);
            boolean z10 = (rectE3.left == rectE2.left && rectE3.top == rectE2.top) ? false : true;
            l(fVar, rectE3, measuredWidth, measuredHeight);
            int i11 = rectE3.left - rectE2.left;
            int i12 = rectE3.top - rectE2.top;
            if (i11 != 0) {
                AbstractC2747a0.U(view, i11);
            }
            if (i12 != 0) {
                AbstractC2747a0.V(view, i12);
            }
            if (z10 && (cVarE = fVar.e()) != null) {
                cVarE.h(this, view, fVar.f28714k);
            }
            V(rectE);
            V(rectE2);
            V(rectE3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void N(int r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.N(int):void");
    }

    public void O(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f28714k;
        if (view2 != null) {
            I(view, view2, i10);
            return;
        }
        int i11 = fVar.f28708e;
        if (i11 >= 0) {
            J(view, i11, i10);
        } else {
            H(view, i10);
        }
    }

    public void P(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void U(View view, Rect rect) {
        ((f) view.getLayoutParams()).p(rect);
    }

    void W() {
        if (this.f28690h && this.f28694l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f28694l);
        }
        this.f28695m = false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    final L0 d0(L0 l02) {
        if (K1.b.a(this.f28696n, l02)) {
            return l02;
        }
        this.f28696n = l02;
        boolean z10 = false;
        boolean z11 = l02 != null && l02.m() > 0;
        this.f28697o = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        L0 l0P = p(l02);
        requestLayout();
        return l0P;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r2.f28704a
            if (r3 == 0) goto L8f
            float r3 = r3.d(r0, r1)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L8f
            android.graphics.Paint r4 = r0.f28686d
            if (r4 != 0) goto L22
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r0.f28686d = r4
        L22:
            android.graphics.Paint r4 = r0.f28686d
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.f28704a
            int r2 = r2.c(r0, r1)
            r4.setColor(r2)
            android.graphics.Paint r2 = r0.f28686d
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            int r3 = h(r3, r4, r5)
            r2.setAlpha(r3)
            int r2 = r17.save()
            boolean r3 = r1.isOpaque()
            if (r3 == 0) goto L65
            int r3 = r1.getLeft()
            float r5 = (float) r3
            int r3 = r1.getTop()
            float r6 = (float) r3
            int r3 = r1.getRight()
            float r7 = (float) r3
            int r3 = r1.getBottom()
            float r8 = (float) r3
            android.graphics.Region$Op r9 = android.graphics.Region.Op.DIFFERENCE
            r4 = r17
            r4.clipRect(r5, r6, r7, r8, r9)
        L65:
            int r3 = r0.getPaddingLeft()
            float r11 = (float) r3
            int r3 = r0.getPaddingTop()
            float r12 = (float) r3
            int r3 = r0.getWidth()
            int r4 = r0.getPaddingRight()
            int r3 = r3 - r4
            float r13 = (float) r3
            int r3 = r0.getHeight()
            int r4 = r0.getPaddingBottom()
            int r3 = r3 - r4
            float r14 = (float) r3
            android.graphics.Paint r15 = r0.f28686d
            r10 = r17
            r10.drawRect(r11, r12, r13, r14, r15)
            r4 = r10
            r4.restoreToCount(r2)
            goto L91
        L8f:
            r4 = r17
        L91:
            boolean r1 = super.drawChild(r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f28698p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    void f() {
        if (this.f28690h) {
            if (this.f28694l == null) {
                this.f28694l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f28694l);
        }
        this.f28695m = true;
    }

    final List<View> getDependencySortedChildren() {
        T();
        return Collections.unmodifiableList(this.f28683a);
    }

    public final L0 getLastWindowInsets() {
        return this.f28696n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f28701s.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f28698p;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // androidx.core.view.F
    public void i(View view, View view2, int i10, int i11) {
        c cVarE;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f28701s.c(view, view2, i10, i11);
        this.f28693k = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i11) && (cVarE = fVar.e()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                cVarE.v(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // androidx.core.view.F
    public void j(View view, int i10) {
        this.f28701s.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i10)) {
                c cVarE = fVar.e();
                if (cVarE != null) {
                    cVarE.C(this, childAt, view, i10);
                }
                fVar.k(i10);
                fVar.j();
            }
        }
        this.f28693k = null;
    }

    @Override // androidx.core.view.F
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarE;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i12) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f28687e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.q(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, this.f28687e[0]) : Math.min(iMax, this.f28687e[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, this.f28687e[1]) : Math.min(iMax2, this.f28687e[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            N(1);
        }
    }

    @Override // androidx.core.view.G
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVarE;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i14) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f28687e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, this.f28687e[0]) : Math.min(iMax, this.f28687e[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, this.f28687e[1]) : Math.min(iMax2, this.f28687e[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            N(1);
        }
    }

    @Override // androidx.core.view.F
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f28688f);
    }

    @Override // androidx.core.view.F
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarE = fVar.e();
                if (cVarE != null) {
                    boolean zA = cVarE.A(this, childAt, view, view2, i10, i11);
                    z10 |= zA;
                    fVar.q(i11, zA);
                } else {
                    fVar.q(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        X();
        if (this.f28695m) {
            if (this.f28694l == null) {
                this.f28694l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f28694l);
        }
        if (this.f28696n == null && AbstractC2747a0.v(this)) {
            AbstractC2747a0.h0(this);
        }
        this.f28690h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        X();
        if (this.f28695m && this.f28694l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f28694l);
        }
        View view = this.f28693k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f28690h = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f28697o || this.f28698p == null) {
            return;
        }
        L0 l02 = this.f28696n;
        int iM = l02 != null ? l02.m() : 0;
        if (iM > 0) {
            this.f28698p.setBounds(0, 0, getWidth(), iM);
            this.f28698p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            X();
        }
        boolean zS = S(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zS;
        }
        this.f28692j = null;
        X();
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVarE;
        int iY = AbstractC2747a0.y(this);
        int size = this.f28683a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f28683a.get(i14);
            if (view.getVisibility() != 8 && ((cVarE = ((f) view.getLayoutParams()).e()) == null || !cVarE.l(this, view, iY))) {
                O(view, iY);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ff  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
        /*
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L3f
            android.view.View r6 = r11.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1b
        L15:
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            goto L38
        L1b:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            boolean r5 = r4.i(r1)
            if (r5 != 0) goto L28
            goto L15
        L28:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.e()
            if (r4 == 0) goto L15
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            boolean r12 = r4.n(r5, r6, r7, r8, r9, r10)
            r3 = r3 | r12
        L38:
            int r2 = r2 + 1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            goto L7
        L3f:
            r5 = r11
            if (r3 == 0) goto L46
            r12 = 1
            r11.N(r12)
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedFling(android.view.View, float, float, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
        /*
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L3b
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L19
        L15:
            r7 = r11
            r8 = r12
            r9 = r13
            goto L35
        L19:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            boolean r5 = r4.i(r1)
            if (r5 != 0) goto L26
            goto L15
        L26:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.e()
            if (r4 == 0) goto L15
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r11 = r4.o(r5, r6, r7, r8, r9)
            r3 = r3 | r11
        L35:
            int r2 = r2 + 1
            r11 = r7
            r12 = r8
            r13 = r9
            goto L7
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedPreFling(android.view.View, float, float):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray sparseArray = hVar.f28723c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarE = D(childAt).e();
            if (id2 != -1 && cVarE != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                cVarE.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (id2 != -1 && cVarE != null && (parcelableY = cVarE.y(this, childAt)) != null) {
                sparseArray.append(id2, parcelableY);
            }
        }
        hVar.f28723c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zS;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f28692j;
        boolean z10 = false;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            zS = cVarE != null ? cVarE.D(this, this.f28692j, motionEvent) : false;
        } else {
            zS = S(motionEvent, 1);
            if (actionMasked != 0 && zS) {
                z10 = true;
            }
        }
        if (this.f28692j == null || actionMasked == 3) {
            zS |= super.onTouchEvent(motionEvent);
        } else if (z10) {
            MotionEvent motionEventK = K(motionEvent);
            super.onTouchEvent(motionEventK);
            motionEventK.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zS;
        }
        this.f28692j = null;
        X();
        return zS;
    }

    public void q(View view) {
        ArrayList arrayListH = this.f28684b.h(view);
        if (arrayListH == null || arrayListH.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayListH.size(); i10++) {
            View view2 = (View) arrayListH.get(i10);
            c cVarE = ((f) view2.getLayoutParams()).e();
            if (cVarE != null) {
                cVarE.h(this, view2, view);
            }
        }
    }

    void r() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (F(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f28695m) {
            if (z10) {
                f();
            } else {
                W();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVarE = ((f) view.getLayoutParams()).e();
        if (cVarE == null || !cVarE.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f28689g) {
            return;
        }
        if (this.f28692j == null) {
            g();
        }
        X();
        this.f28689g = true;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        e0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f28699q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f28698p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f28698p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f28698p.setState(getDrawableState());
                }
                B1.a.m(this.f28698p, AbstractC2747a0.y(this));
                this.f28698p.setVisible(getVisibility() == 0, false);
                this.f28698p.setCallback(this);
            }
            AbstractC2747a0.b0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? AbstractC7194b.e(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f28698p;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f28698p.setVisible(z10, false);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: u */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void v(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            y(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f28698p;
    }

    public List w(View view) {
        List listI = this.f28684b.i(view);
        return listI == null ? Collections.EMPTY_LIST : listI;
    }

    public List x(View view) {
        List listG = this.f28684b.g(view);
        return listG == null ? Collections.EMPTY_LIST : listG;
    }

    void y(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void z(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        A(i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        l(fVar, rect2, measuredWidth, measuredHeight);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6924a.f62752a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i10);
        this.f28683a = new ArrayList();
        this.f28684b = new androidx.coordinatorlayout.widget.a();
        this.f28685c = new ArrayList();
        this.f28687e = new int[2];
        this.f28688f = new int[2];
        this.f28701s = new H(this);
        if (i10 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6926c.f62754a, 0, AbstractC6925b.f62753a);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6926c.f62754a, i10, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            AbstractC2747a0.i0(coordinatorLayout, context2, AbstractC6926c.f62754a, attributeSet, typedArray, 0, AbstractC6925b.f62753a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            AbstractC2747a0.i0(coordinatorLayout, context2, AbstractC6926c.f62754a, attributeSet, typedArray, i10, 0);
        }
        int resourceId = typedArray.getResourceId(AbstractC6926c.f62755b, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f28691i = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f28691i.length;
            for (int i11 = 0; i11 < length; i11++) {
                coordinatorLayout.f28691i[i11] = (int) (r12[i11] * f10);
            }
        }
        coordinatorLayout.f28698p = typedArray.getDrawable(AbstractC6926c.f62756c);
        typedArray.recycle();
        e0();
        super.setOnHierarchyChangeListener(new e());
        if (AbstractC2747a0.w(this) == 0) {
            AbstractC2747a0.s0(this, 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static class h extends Q1.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        SparseArray f28723c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f28723c = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f28723c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // Q1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f28723c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f28723c.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f28723c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        c f28704a;

        /* JADX INFO: renamed from: b */
        boolean f28705b;

        /* JADX INFO: renamed from: c */
        public int f28706c;

        /* JADX INFO: renamed from: d */
        public int f28707d;

        /* JADX INFO: renamed from: e */
        public int f28708e;

        /* JADX INFO: renamed from: f */
        int f28709f;

        /* JADX INFO: renamed from: g */
        public int f28710g;

        /* JADX INFO: renamed from: h */
        public int f28711h;

        /* JADX INFO: renamed from: i */
        int f28712i;

        /* JADX INFO: renamed from: j */
        int f28713j;

        /* JADX INFO: renamed from: k */
        View f28714k;

        /* JADX INFO: renamed from: l */
        View f28715l;

        /* JADX INFO: renamed from: m */
        private boolean f28716m;

        /* JADX INFO: renamed from: n */
        private boolean f28717n;

        /* JADX INFO: renamed from: o */
        private boolean f28718o;

        /* JADX INFO: renamed from: p */
        private boolean f28719p;

        /* JADX INFO: renamed from: q */
        final Rect f28720q;

        /* JADX INFO: renamed from: r */
        Object f28721r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f28705b = false;
            this.f28706c = 0;
            this.f28707d = 0;
            this.f28708e = -1;
            this.f28709f = -1;
            this.f28710g = 0;
            this.f28711h = 0;
            this.f28720q = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f28709f);
            this.f28714k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f28715l = null;
                    this.f28714k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f28709f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f28715l = null;
                this.f28714k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f28715l = null;
                    this.f28714k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f28715l = viewFindViewById;
        }

        private boolean r(View view, int i10) {
            int iB = AbstractC2781s.b(((f) view.getLayoutParams()).f28710g, i10);
            return iB != 0 && (AbstractC2781s.b(this.f28711h, i10) & iB) == iB;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f28714k.getId() != this.f28709f) {
                return false;
            }
            View view2 = this.f28714k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f28715l = null;
                    this.f28714k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f28715l = view2;
            return true;
        }

        boolean a() {
            return this.f28714k == null && this.f28709f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f28715l || r(view2, AbstractC2747a0.y(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f28704a;
            return cVar != null && cVar.e(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.f28704a == null) {
                this.f28716m = false;
            }
            return this.f28716m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f28709f == -1) {
                this.f28715l = null;
                this.f28714k = null;
                return null;
            }
            if (this.f28714k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f28714k;
        }

        public c e() {
            return this.f28704a;
        }

        boolean f() {
            return this.f28719p;
        }

        Rect g() {
            return this.f28720q;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f28716m;
            if (z10) {
                return true;
            }
            c cVar = this.f28704a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z10;
            this.f28716m = zA;
            return zA;
        }

        boolean i(int i10) {
            if (i10 == 0) {
                return this.f28717n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f28718o;
        }

        void j() {
            this.f28719p = false;
        }

        void k(int i10) {
            q(i10, false);
        }

        void l() {
            this.f28716m = false;
        }

        public void n(c cVar) {
            c cVar2 = this.f28704a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f28704a = cVar;
                this.f28721r = null;
                this.f28705b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void o(boolean z10) {
            this.f28719p = z10;
        }

        void p(Rect rect) {
            this.f28720q.set(rect);
        }

        void q(int i10, boolean z10) {
            if (i10 == 0) {
                this.f28717n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f28718o = z10;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f28705b = false;
            this.f28706c = 0;
            this.f28707d = 0;
            this.f28708e = -1;
            this.f28709f = -1;
            this.f28710g = 0;
            this.f28711h = 0;
            this.f28720q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6926c.f62757d);
            this.f28706c = typedArrayObtainStyledAttributes.getInteger(AbstractC6926c.f62758e, 0);
            this.f28709f = typedArrayObtainStyledAttributes.getResourceId(AbstractC6926c.f62759f, -1);
            this.f28707d = typedArrayObtainStyledAttributes.getInteger(AbstractC6926c.f62760g, 0);
            this.f28708e = typedArrayObtainStyledAttributes.getInteger(AbstractC6926c.f62764k, -1);
            this.f28710g = typedArrayObtainStyledAttributes.getInt(AbstractC6926c.f62763j, 0);
            this.f28711h = typedArrayObtainStyledAttributes.getInt(AbstractC6926c.f62762i, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(AbstractC6926c.f62761h);
            this.f28705b = zHasValue;
            if (zHasValue) {
                this.f28704a = CoordinatorLayout.Q(context, attributeSet, typedArrayObtainStyledAttributes.getString(AbstractC6926c.f62761h));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f28704a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f28705b = false;
            this.f28706c = 0;
            this.f28707d = 0;
            this.f28708e = -1;
            this.f28709f = -1;
            this.f28710g = 0;
            this.f28711h = 0;
            this.f28720q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f28705b = false;
            this.f28706c = 0;
            this.f28707d = 0;
            this.f28708e = -1;
            this.f28709f = -1;
            this.f28710g = 0;
            this.f28711h = 0;
            this.f28720q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f28705b = false;
            this.f28706c = 0;
            this.f28707d = 0;
            this.f28708e = -1;
            this.f28709f = -1;
            this.f28710g = 0;
            this.f28711h = 0;
            this.f28720q = new Rect();
        }
    }
}
