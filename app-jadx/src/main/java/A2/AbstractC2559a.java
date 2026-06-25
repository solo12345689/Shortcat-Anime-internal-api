package a2;

import L1.B;
import L1.E;
import R1.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.AbstractC2781s;
import androidx.core.view.C2746a;
import androidx.core.view.L0;
import java.util.ArrayList;
import java.util.List;
import y1.AbstractC7194b;

/* JADX INFO: renamed from: a2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2559a extends ViewGroup {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int[] f23670n0 = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final int[] f23671o0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final boolean f23672p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final boolean f23673q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static boolean f23674r0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private CharSequence f23675A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Object f23676B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f23677C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Drawable f23678D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Drawable f23679E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Drawable f23680F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Drawable f23681G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final ArrayList f23682H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Rect f23683I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f23684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f23689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final R1.c f23690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final R1.c f23691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h f23692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f23693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23694k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23695l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private Matrix f23696l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23697m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final E f23698m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23699n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23701p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23702q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f23703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f23704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f23705t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f23706u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f23707v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable f23708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f23709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f23710y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f23711z;

    /* JADX INFO: renamed from: a2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0412a implements E {
        C0412a() {
        }

        @Override // L1.E
        public boolean a(View view, E.a aVar) {
            if (!AbstractC2559a.this.C(view) || AbstractC2559a.this.r(view) == 2) {
                return false;
            }
            AbstractC2559a.this.f(view);
            return true;
        }
    }

    /* JADX INFO: renamed from: a2.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((AbstractC2559a) view).Q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* JADX INFO: renamed from: a2.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends C2746a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f23714d = new Rect();

        c() {
        }

        private void n(B b10, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (AbstractC2559a.A(childAt)) {
                    b10.c(childAt);
                }
            }
        }

        private void o(B b10, B b11) {
            Rect rect = this.f23714d;
            b11.n(rect);
            b10.w0(rect);
            b10.q1(b11.j0());
            b10.U0(b11.F());
            b10.z0(b11.s());
            b10.D0(b11.w());
            b10.H0(b11.W());
            b10.K0(b11.Z());
            b10.s0(b11.R());
            b10.d1(b11.g0());
            b10.a(b11.k());
        }

        @Override // androidx.core.view.C2746a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = AbstractC2559a.this.p();
            if (viewP == null) {
                return true;
            }
            CharSequence charSequenceS = AbstractC2559a.this.s(AbstractC2559a.this.t(viewP));
            if (charSequenceS == null) {
                return true;
            }
            text.add(charSequenceS);
            return true;
        }

        @Override // androidx.core.view.C2746a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, B b10) {
            if (AbstractC2559a.f23672p0) {
                super.g(view, b10);
            } else {
                B bL0 = B.l0(b10);
                super.g(view, bL0);
                b10.f1(view);
                Object objE = AbstractC2747a0.E(view);
                if (objE instanceof View) {
                    b10.W0((View) objE);
                }
                o(b10, bL0);
                bL0.o0();
                n(b10, (ViewGroup) view);
            }
            b10.z0("androidx.drawerlayout.widget.DrawerLayout");
            b10.J0(false);
            b10.K0(false);
            b10.p0(B.a.f11213e);
            b10.p0(B.a.f11214f);
        }

        @Override // androidx.core.view.C2746a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (AbstractC2559a.f23672p0 || AbstractC2559a.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a2.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends C2746a {
        d() {
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, B b10) {
            super.g(view, b10);
            if (AbstractC2559a.A(view)) {
                return;
            }
            b10.W0(null);
        }
    }

    /* JADX INFO: renamed from: a2.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {
        void a(View view);

        void b(View view);

        void c(int i10);

        void d(View view, float f10);
    }

    /* JADX INFO: renamed from: a2.a$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class h extends c.AbstractC0259c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private R1.c f23726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f23727c = new RunnableC0414a();

        /* JADX INFO: renamed from: a2.a$h$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class RunnableC0414a implements Runnable {
            RunnableC0414a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.o();
            }
        }

        h(int i10) {
            this.f23725a = i10;
        }

        private void n() {
            View viewN = AbstractC2559a.this.n(this.f23725a == 3 ? 5 : 3);
            if (viewN != null) {
                AbstractC2559a.this.f(viewN);
            }
        }

        @Override // R1.c.AbstractC0259c
        public int a(View view, int i10, int i11) {
            if (AbstractC2559a.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = AbstractC2559a.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // R1.c.AbstractC0259c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // R1.c.AbstractC0259c
        public int d(View view) {
            if (AbstractC2559a.this.D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // R1.c.AbstractC0259c
        public void f(int i10, int i11) {
            View viewN = (i10 & 1) == 1 ? AbstractC2559a.this.n(3) : AbstractC2559a.this.n(5);
            if (viewN == null || AbstractC2559a.this.r(viewN) != 0) {
                return;
            }
            this.f23726b.b(viewN, i11);
        }

        @Override // R1.c.AbstractC0259c
        public boolean g(int i10) {
            return false;
        }

        @Override // R1.c.AbstractC0259c
        public void h(int i10, int i11) {
            AbstractC2559a.this.postDelayed(this.f23727c, 160L);
        }

        @Override // R1.c.AbstractC0259c
        public void i(View view, int i10) {
            ((f) view.getLayoutParams()).f23718c = false;
            n();
        }

        @Override // R1.c.AbstractC0259c
        public void j(int i10) {
            AbstractC2559a.this.V(i10, this.f23726b.v());
        }

        @Override // R1.c.AbstractC0259c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = (AbstractC2559a.this.c(view, 3) ? i10 + r3 : AbstractC2559a.this.getWidth() - i10) / view.getWidth();
            AbstractC2559a.this.S(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            AbstractC2559a.this.invalidate();
        }

        @Override // R1.c.AbstractC0259c
        public void l(View view, float f10, float f11) {
            int i10;
            float fU = AbstractC2559a.this.u(view);
            int width = view.getWidth();
            if (AbstractC2559a.this.c(view, 3)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = AbstractC2559a.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && fU > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f23726b.O(i10, view.getTop());
            AbstractC2559a.this.invalidate();
        }

        @Override // R1.c.AbstractC0259c
        public boolean m(View view, int i10) {
            return AbstractC2559a.this.D(view) && AbstractC2559a.this.c(view, this.f23725a) && AbstractC2559a.this.r(view) == 0;
        }

        void o() {
            View viewN;
            int width;
            int iX = this.f23726b.x();
            boolean z10 = this.f23725a == 3;
            if (z10) {
                viewN = AbstractC2559a.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + iX;
            } else {
                viewN = AbstractC2559a.this.n(5);
                width = AbstractC2559a.this.getWidth() - iX;
            }
            if (viewN != null) {
                if (((!z10 || viewN.getLeft() >= width) && (z10 || viewN.getLeft() <= width)) || AbstractC2559a.this.r(viewN) != 0) {
                    return;
                }
                f fVar = (f) viewN.getLayoutParams();
                this.f23726b.Q(viewN, width, viewN.getTop());
                fVar.f23718c = true;
                AbstractC2559a.this.invalidate();
                n();
                AbstractC2559a.this.b();
            }
        }

        public void p() {
            AbstractC2559a.this.removeCallbacks(this.f23727c);
        }

        public void q(R1.c cVar) {
            this.f23726b = cVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f23672p0 = true;
        f23673q0 = true;
        f23674r0 = i10 >= 29;
    }

    public AbstractC2559a(Context context) {
        this(context, null);
    }

    static boolean A(View view) {
        return (AbstractC2747a0.w(view) == 4 || AbstractC2747a0.w(view) == 2) ? false : true;
    }

    private boolean F(float f10, float f11, View view) {
        if (this.f23683I == null) {
            this.f23683I = new Rect();
        }
        view.getHitRect(this.f23683I);
        return this.f23683I.contains((int) f10, (int) f11);
    }

    private void G(Drawable drawable, int i10) {
        if (drawable == null || !B1.a.h(drawable)) {
            return;
        }
        B1.a.m(drawable, i10);
    }

    private Drawable N() {
        int iY = AbstractC2747a0.y(this);
        if (iY == 0) {
            Drawable drawable = this.f23678D;
            if (drawable != null) {
                G(drawable, iY);
                return this.f23678D;
            }
        } else {
            Drawable drawable2 = this.f23679E;
            if (drawable2 != null) {
                G(drawable2, iY);
                return this.f23679E;
            }
        }
        return this.f23680F;
    }

    private Drawable O() {
        int iY = AbstractC2747a0.y(this);
        if (iY == 0) {
            Drawable drawable = this.f23679E;
            if (drawable != null) {
                G(drawable, iY);
                return this.f23679E;
            }
        } else {
            Drawable drawable2 = this.f23678D;
            if (drawable2 != null) {
                G(drawable2, iY);
                return this.f23678D;
            }
        }
        return this.f23681G;
    }

    private void P() {
        if (f23673q0) {
            return;
        }
        this.f23709x = N();
        this.f23710y = O();
    }

    private void T(View view) {
        B.a aVar = B.a.f11233y;
        AbstractC2747a0.e0(view, aVar.b());
        if (!C(view) || r(view) == 2) {
            return;
        }
        AbstractC2747a0.g0(view, aVar, null, this.f23698m0);
    }

    private void U(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || D(childAt)) && !(z10 && childAt == view)) {
                AbstractC2747a0.s0(childAt, 4);
            } else {
                AbstractC2747a0.s0(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f23696l0 == null) {
                this.f23696l0 = new Matrix();
            }
            matrix.invert(this.f23696l0);
            motionEventObtain.transform(this.f23696l0);
        }
        return motionEventObtain;
    }

    static String w(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).f23718c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    boolean B(View view) {
        return ((f) view.getLayoutParams()).f23716a == 0;
    }

    public boolean C(View view) {
        if (D(view)) {
            return (((f) view.getLayoutParams()).f23719d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean D(View view) {
        int iB = AbstractC2781s.b(((f) view.getLayoutParams()).f23716a, AbstractC2747a0.y(view));
        return ((iB & 3) == 0 && (iB & 5) == 0) ? false : true;
    }

    public boolean E(View view) {
        if (D(view)) {
            return ((f) view.getLayoutParams()).f23717b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void H(View view, float f10) {
        float fU = u(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (fU * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        S(view, f10);
    }

    public void I(int i10) {
        J(i10, true);
    }

    public void J(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            L(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f23697m) {
            fVar.f23717b = 1.0f;
            fVar.f23719d = 1;
            U(view, true);
            T(view);
        } else if (z10) {
            fVar.f23719d |= 2;
            if (c(view, 3)) {
                this.f23690g.Q(view, 0, view.getTop());
            } else {
                this.f23691h.Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            H(view, 1.0f);
            V(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void M(e eVar) {
        List list;
        if (eVar == null || (list = this.f23705t) == null) {
            return;
        }
        list.remove(eVar);
    }

    public void Q(Object obj, boolean z10) {
        this.f23676B = obj;
        this.f23677C = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void R(int i10, int i11) {
        View viewN;
        int iB = AbstractC2781s.b(i11, AbstractC2747a0.y(this));
        if (i11 == 3) {
            this.f23699n = i10;
        } else if (i11 == 5) {
            this.f23700o = i10;
        } else if (i11 == 8388611) {
            this.f23701p = i10;
        } else if (i11 == 8388613) {
            this.f23702q = i10;
        }
        if (i10 != 0) {
            (iB == 3 ? this.f23690g : this.f23691h).a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewN = n(iB)) != null) {
                K(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(iB);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    void S(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 == fVar.f23717b) {
            return;
        }
        fVar.f23717b = f10;
        l(view, f10);
    }

    void V(int i10, View view) {
        int i11;
        int iA = this.f23690g.A();
        int iA2 = this.f23691h.A();
        if (iA == 1 || iA2 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (iA != 2 && iA2 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f23717b;
            if (f10 == 0.0f) {
                j(view);
            } else if (f10 == 1.0f) {
                k(view);
            }
        }
        if (i11 != this.f23694k) {
            this.f23694k = i11;
            List list = this.f23705t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f23705t.get(size)).c(i11);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f23705t == null) {
            this.f23705t = new ArrayList();
        }
        this.f23705t.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!D(childAt)) {
                this.f23682H.add(childAt);
            } else if (C(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
        }
        if (!z10) {
            int size = this.f23682H.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) this.f23682H.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.f23682H.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (o() != null || D(view)) {
            AbstractC2747a0.s0(view, 4);
        } else {
            AbstractC2747a0.s0(view, 1);
        }
        if (f23672p0) {
            return;
        }
        AbstractC2747a0.k0(view, this.f23684a);
    }

    void b() {
        if (this.f23703r) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f23703r = true;
    }

    boolean c(View view, int i10) {
        return (t(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((f) getChildAt(i10).getLayoutParams()).f23717b);
        }
        this.f23688e = fMax;
        boolean zM = this.f23690g.m(true);
        boolean zM2 = this.f23691h.m(true);
        if (zM || zM2) {
            AbstractC2747a0.b0(this);
        }
    }

    public void d(int i10) {
        e(i10, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f23688e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (F(x10, y10, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zB) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && D(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f10 = this.f23688e;
        if (f10 > 0.0f && zB) {
            this.f23689f.setColor((this.f23687d & 16777215) | (((int) ((((-16777216) & r14) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f23689f);
            return zDrawChild;
        }
        if (this.f23709x != null && c(view, 3)) {
            int intrinsicWidth = this.f23709x.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f23690g.x(), 1.0f));
            this.f23709x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f23709x.setAlpha((int) (fMax * 255.0f));
            this.f23709x.draw(canvas);
            return zDrawChild;
        }
        if (this.f23710y != null && c(view, 5)) {
            int intrinsicWidth2 = this.f23710y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f23691h.x(), 1.0f));
            this.f23710y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f23710y.setAlpha((int) (fMax2 * 255.0f));
            this.f23710y.draw(canvas);
        }
        return zDrawChild;
    }

    public void e(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            g(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z10) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f23697m) {
            fVar.f23717b = 0.0f;
            fVar.f23719d = 0;
        } else if (z10) {
            fVar.f23719d |= 4;
            if (c(view, 3)) {
                this.f23690g.Q(view, -view.getWidth(), view.getTop());
            } else {
                this.f23691h.Q(view, getWidth(), view.getTop());
            }
        } else {
            H(view, 0.0f);
            V(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (f23673q0) {
            return this.f23685b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f23708w;
    }

    public void h() {
        i(false);
    }

    void i(boolean z10) {
        int childCount = getChildCount();
        boolean zQ = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (D(childAt) && (!z10 || fVar.f23718c)) {
                zQ |= c(childAt, 3) ? this.f23690g.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.f23691h.Q(childAt, getWidth(), childAt.getTop());
                fVar.f23718c = false;
            }
        }
        this.f23692i.p();
        this.f23693j.p();
        if (zQ) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f23719d & 1) == 1) {
            fVar.f23719d = 0;
            List list = this.f23705t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f23705t.get(size)).b(view);
                }
            }
            U(view, false);
            T(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f23719d & 1) == 0) {
            fVar.f23719d = 1;
            List list = this.f23705t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f23705t.get(size)).a(view);
                }
            }
            U(view, true);
            T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f10) {
        List list = this.f23705t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((e) this.f23705t.get(size)).d(view, f10);
            }
        }
    }

    View n(int i10) {
        int iB = AbstractC2781s.b(i10, AbstractC2747a0.y(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((t(childAt) & 7) == iB) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f23719d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23697m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23697m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f23677C || this.f23708w == null) {
            return;
        }
        Object obj = this.f23676B;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f23708w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f23708w.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            R1.c r1 = r6.f23690g
            boolean r1 = r1.P(r7)
            R1.c r2 = r6.f23691h
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            R1.c r7 = r6.f23690g
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L36
            a2.a$h r7 = r6.f23692i
            r7.p()
            a2.a$h r7 = r6.f23693j
            r7.p()
            goto L36
        L31:
            r6.i(r2)
            r6.f23703r = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f23706u = r0
            r6.f23707v = r7
            float r4 = r6.f23688e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            R1.c r4 = r6.f23690g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.f23703r = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.y()
            if (r7 != 0) goto L70
            boolean r7 = r6.f23703r
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.AbstractC2559a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !z()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        return viewP != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11 = true;
        this.f23695l = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (fVar.f23717b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i15 - r11) / f12;
                        i14 = i15 - ((int) (fVar.f23717b * f12));
                    }
                    boolean z12 = f10 != fVar.f23717b ? z11 : false;
                    int i18 = fVar.f23716a & 112;
                    if (i18 == 16) {
                        int i19 = i13 - i11;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i22 > i19 - i23) {
                                i20 = (i19 - i23) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight + i24);
                    } else {
                        int i25 = i13 - i11;
                        childAt.layout(i14, (i25 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i25 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z12) {
                        S(childAt, f10);
                    }
                    int i26 = fVar.f23717b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (f23674r0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            A1.b bVarI = L0.z(rootWindowInsets).i();
            R1.c cVar = this.f23690g;
            cVar.L(Math.max(cVar.w(), bVarI.f104a));
            R1.c cVar2 = this.f23691h;
            cVar2.L(Math.max(cVar2.w(), bVarI.f106c));
        }
        this.f23695l = false;
        this.f23697m = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.f23676B != null && AbstractC2747a0.v(this);
        int iY = AbstractC2747a0.y(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int iB = AbstractC2781s.b(fVar.f23716a, iY);
                    if (AbstractC2747a0.v(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f23676B;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f23676B;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!D(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f23673q0) {
                        float fT = AbstractC2747a0.t(childAt);
                        float f10 = this.f23685b;
                        if (fT != f10) {
                            AbstractC2747a0.r0(childAt, f10);
                        }
                    }
                    int iT = t(childAt) & 7;
                    boolean z13 = iT == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(iT) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f23686c + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i10 = gVar.f23720c;
        if (i10 != 0 && (viewN = n(i10)) != null) {
            K(viewN);
        }
        int i11 = gVar.f23721d;
        if (i11 != 3) {
            R(i11, 3);
        }
        int i12 = gVar.f23722e;
        if (i12 != 3) {
            R(i12, 5);
        }
        int i13 = gVar.f23723f;
        if (i13 != 3) {
            R(i13, 8388611);
        }
        int i14 = gVar.f23724g;
        if (i14 != 3) {
            R(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        P();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f23719d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                gVar.f23720c = fVar.f23716a;
                break;
            }
        }
        gVar.f23721d = this.f23699n;
        gVar.f23722e = this.f23700o;
        gVar.f23723f = this.f23701p;
        gVar.f23724g = this.f23702q;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            R1.c r0 = r6.f23690g
            r0.F(r7)
            R1.c r0 = r6.f23691h
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.i(r2)
            r6.f23703r = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            R1.c r3 = r6.f23690g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.f23706u
            float r0 = r0 - r3
            float r3 = r6.f23707v
            float r7 = r7 - r3
            R1.c r3 = r6.f23690g
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5a
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.i(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f23706u = r0
            r6.f23707v = r7
            r6.f23703r = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.AbstractC2559a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (D(childAt) && E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i10) {
        int iY = AbstractC2747a0.y(this);
        if (i10 == 3) {
            int i11 = this.f23699n;
            if (i11 != 3) {
                return i11;
            }
            int i12 = iY == 0 ? this.f23701p : this.f23702q;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f23700o;
            if (i13 != 3) {
                return i13;
            }
            int i14 = iY == 0 ? this.f23702q : this.f23701p;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f23701p;
            if (i15 != 3) {
                return i15;
            }
            int i16 = iY == 0 ? this.f23699n : this.f23700o;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f23702q;
        if (i17 != 3) {
            return i17;
        }
        int i18 = iY == 0 ? this.f23700o : this.f23699n;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public int r(View view) {
        if (D(view)) {
            return q(((f) view.getLayoutParams()).f23716a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f23695l) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i10) {
        int iB = AbstractC2781s.b(i10, AbstractC2747a0.y(this));
        if (iB == 3) {
            return this.f23711z;
        }
        if (iB == 5) {
            return this.f23675A;
        }
        return null;
    }

    public void setDrawerElevation(float f10) {
        this.f23685b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (D(childAt)) {
                AbstractC2747a0.r0(childAt, this.f23685b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f23704s;
        if (eVar2 != null) {
            M(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f23704s = eVar;
    }

    public void setDrawerLockMode(int i10) {
        R(i10, 3);
        R(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f23687d = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f23708w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f23708w = new ColorDrawable(i10);
        invalidate();
    }

    int t(View view) {
        return AbstractC2781s.b(((f) view.getLayoutParams()).f23716a, AbstractC2747a0.y(this));
    }

    float u(View view) {
        return ((f) view.getLayoutParams()).f23717b;
    }

    public AbstractC2559a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Z1.a.f23119a);
    }

    public AbstractC2559a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f23684a = new d();
        this.f23687d = -1728053248;
        this.f23689f = new Paint();
        this.f23697m = true;
        this.f23699n = 3;
        this.f23700o = 3;
        this.f23701p = 3;
        this.f23702q = 3;
        this.f23678D = null;
        this.f23679E = null;
        this.f23680F = null;
        this.f23681G = null;
        this.f23698m0 = new C0412a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f23686c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        h hVar = new h(3);
        this.f23692i = hVar;
        h hVar2 = new h(5);
        this.f23693j = hVar2;
        R1.c cVarN = R1.c.n(this, 1.0f, hVar);
        this.f23690g = cVarN;
        cVarN.M(1);
        cVarN.N(f11);
        hVar.q(cVarN);
        R1.c cVarN2 = R1.c.n(this, 1.0f, hVar2);
        this.f23691h = cVarN2;
        cVarN2.M(2);
        cVarN2.N(f11);
        hVar2.q(cVarN2);
        setFocusableInTouchMode(true);
        AbstractC2747a0.s0(this, 1);
        AbstractC2747a0.k0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (AbstractC2747a0.v(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f23670n0);
            try {
                this.f23708w = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, Z1.c.f23122b, i10, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(Z1.c.f23123c)) {
                this.f23685b = typedArrayObtainStyledAttributes2.getDimension(Z1.c.f23123c, 0.0f);
            } else {
                this.f23685b = getResources().getDimension(Z1.b.f23120a);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f23682H = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f23708w = i10 != 0 ? AbstractC7194b.e(getContext(), i10) : null;
        invalidate();
    }

    /* JADX INFO: renamed from: a2.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f23717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f23718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23719d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f23716a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2559a.f23671o0);
            this.f23716a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(int i10, int i11) {
            super(i10, i11);
            this.f23716a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f23716a = 0;
            this.f23716a = fVar.f23716a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f23716a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f23716a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: a2.a$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static class g extends Q1.a {
        public static final Parcelable.Creator<g> CREATOR = new C0413a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f23723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f23724g;

        /* JADX INFO: renamed from: a2.a$g$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0413a implements Parcelable.ClassLoaderCreator {
            C0413a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f23720c = 0;
            this.f23720c = parcel.readInt();
            this.f23721d = parcel.readInt();
            this.f23722e = parcel.readInt();
            this.f23723f = parcel.readInt();
            this.f23724g = parcel.readInt();
        }

        @Override // Q1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f23720c);
            parcel.writeInt(this.f23721d);
            parcel.writeInt(this.f23722e);
            parcel.writeInt(this.f23723f);
            parcel.writeInt(this.f23724g);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.f23720c = 0;
        }
    }
}
