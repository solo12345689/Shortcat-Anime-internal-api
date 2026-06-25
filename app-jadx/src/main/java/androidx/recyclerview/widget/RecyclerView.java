package androidx.recyclerview.widget;

import L1.AbstractC1865b;
import L1.B;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.AbstractC2753d0;
import androidx.core.view.C2746a;
import androidx.core.view.ScrollingView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, androidx.core.view.D {

    /* JADX INFO: renamed from: a1 */
    private static final int[] f31728a1 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: b1 */
    private static final float f31729b1 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: c1 */
    static final boolean f31730c1 = false;

    /* JADX INFO: renamed from: d1 */
    static final boolean f31731d1 = true;

    /* JADX INFO: renamed from: e1 */
    static final boolean f31732e1 = true;

    /* JADX INFO: renamed from: f1 */
    static final boolean f31733f1 = true;

    /* JADX INFO: renamed from: g1 */
    private static final boolean f31734g1 = false;

    /* JADX INFO: renamed from: h1 */
    private static final boolean f31735h1 = false;

    /* JADX INFO: renamed from: i1 */
    private static final Class[] f31736i1;

    /* JADX INFO: renamed from: j1 */
    static final Interpolator f31737j1;

    /* JADX INFO: renamed from: k1 */
    static final B f31738k1;

    /* JADX INFO: renamed from: A */
    private int f31739A;

    /* JADX INFO: renamed from: A0 */
    private final int f31740A0;

    /* JADX INFO: renamed from: B */
    boolean f31741B;

    /* JADX INFO: renamed from: B0 */
    private float f31742B0;

    /* JADX INFO: renamed from: C */
    private final AccessibilityManager f31743C;

    /* JADX INFO: renamed from: C0 */
    private float f31744C0;

    /* JADX INFO: renamed from: D */
    private List f31745D;

    /* JADX INFO: renamed from: D0 */
    private boolean f31746D0;

    /* JADX INFO: renamed from: E */
    boolean f31747E;

    /* JADX INFO: renamed from: E0 */
    final D f31748E0;

    /* JADX INFO: renamed from: F */
    boolean f31749F;

    /* JADX INFO: renamed from: F0 */
    e f31750F0;

    /* JADX INFO: renamed from: G */
    private int f31751G;

    /* JADX INFO: renamed from: G0 */
    e.b f31752G0;

    /* JADX INFO: renamed from: H */
    private int f31753H;

    /* JADX INFO: renamed from: H0 */
    final A f31754H0;

    /* JADX INFO: renamed from: I */
    private l f31755I;

    /* JADX INFO: renamed from: I0 */
    private t f31756I0;

    /* JADX INFO: renamed from: J0 */
    private List f31757J0;

    /* JADX INFO: renamed from: K0 */
    boolean f31758K0;

    /* JADX INFO: renamed from: L0 */
    boolean f31759L0;

    /* JADX INFO: renamed from: M0 */
    private m.a f31760M0;

    /* JADX INFO: renamed from: N0 */
    boolean f31761N0;

    /* JADX INFO: renamed from: O0 */
    androidx.recyclerview.widget.k f31762O0;

    /* JADX INFO: renamed from: P0 */
    private final int[] f31763P0;

    /* JADX INFO: renamed from: Q0 */
    private androidx.core.view.E f31764Q0;

    /* JADX INFO: renamed from: R0 */
    private final int[] f31765R0;

    /* JADX INFO: renamed from: S0 */
    private final int[] f31766S0;

    /* JADX INFO: renamed from: T0 */
    final int[] f31767T0;

    /* JADX INFO: renamed from: U0 */
    final List f31768U0;

    /* JADX INFO: renamed from: V0 */
    private Runnable f31769V0;

    /* JADX INFO: renamed from: W0 */
    private boolean f31770W0;

    /* JADX INFO: renamed from: X0 */
    private int f31771X0;

    /* JADX INFO: renamed from: Y0 */
    private int f31772Y0;

    /* JADX INFO: renamed from: Z0 */
    private final p.b f31773Z0;

    /* JADX INFO: renamed from: a */
    private final float f31774a;

    /* JADX INFO: renamed from: b */
    private final x f31775b;

    /* JADX INFO: renamed from: c */
    final v f31776c;

    /* JADX INFO: renamed from: d */
    y f31777d;

    /* JADX INFO: renamed from: e */
    a f31778e;

    /* JADX INFO: renamed from: f */
    b f31779f;

    /* JADX INFO: renamed from: g */
    final androidx.recyclerview.widget.p f31780g;

    /* JADX INFO: renamed from: h */
    boolean f31781h;

    /* JADX INFO: renamed from: i */
    final Runnable f31782i;

    /* JADX INFO: renamed from: j */
    final Rect f31783j;

    /* JADX INFO: renamed from: k */
    private final Rect f31784k;

    /* JADX INFO: renamed from: l */
    final RectF f31785l;

    /* JADX INFO: renamed from: l0 */
    private EdgeEffect f31786l0;

    /* JADX INFO: renamed from: m */
    h f31787m;

    /* JADX INFO: renamed from: m0 */
    private EdgeEffect f31788m0;

    /* JADX INFO: renamed from: n */
    p f31789n;

    /* JADX INFO: renamed from: n0 */
    private EdgeEffect f31790n0;

    /* JADX INFO: renamed from: o */
    final List f31791o;

    /* JADX INFO: renamed from: o0 */
    private EdgeEffect f31792o0;

    /* JADX INFO: renamed from: p */
    final ArrayList f31793p;

    /* JADX INFO: renamed from: p0 */
    m f31794p0;

    /* JADX INFO: renamed from: q */
    private final ArrayList f31795q;

    /* JADX INFO: renamed from: q0 */
    private int f31796q0;

    /* JADX INFO: renamed from: r */
    private s f31797r;

    /* JADX INFO: renamed from: r0 */
    private int f31798r0;

    /* JADX INFO: renamed from: s */
    boolean f31799s;

    /* JADX INFO: renamed from: s0 */
    private VelocityTracker f31800s0;

    /* JADX INFO: renamed from: t */
    boolean f31801t;

    /* JADX INFO: renamed from: t0 */
    private int f31802t0;

    /* JADX INFO: renamed from: u */
    boolean f31803u;

    /* JADX INFO: renamed from: u0 */
    private int f31804u0;

    /* JADX INFO: renamed from: v */
    boolean f31805v;

    /* JADX INFO: renamed from: v0 */
    private int f31806v0;

    /* JADX INFO: renamed from: w */
    private int f31807w;

    /* JADX INFO: renamed from: w0 */
    private int f31808w0;

    /* JADX INFO: renamed from: x */
    boolean f31809x;

    /* JADX INFO: renamed from: x0 */
    private int f31810x0;

    /* JADX INFO: renamed from: y */
    boolean f31811y;

    /* JADX INFO: renamed from: y0 */
    private r f31812y0;

    /* JADX INFO: renamed from: z */
    private boolean f31813z;

    /* JADX INFO: renamed from: z0 */
    private final int f31814z0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class A {

        /* JADX INFO: renamed from: b */
        private SparseArray f31816b;

        /* JADX INFO: renamed from: m */
        int f31827m;

        /* JADX INFO: renamed from: n */
        long f31828n;

        /* JADX INFO: renamed from: o */
        int f31829o;

        /* JADX INFO: renamed from: p */
        int f31830p;

        /* JADX INFO: renamed from: q */
        int f31831q;

        /* JADX INFO: renamed from: a */
        int f31815a = -1;

        /* JADX INFO: renamed from: c */
        int f31817c = 0;

        /* JADX INFO: renamed from: d */
        int f31818d = 0;

        /* JADX INFO: renamed from: e */
        int f31819e = 1;

        /* JADX INFO: renamed from: f */
        int f31820f = 0;

        /* JADX INFO: renamed from: g */
        boolean f31821g = false;

        /* JADX INFO: renamed from: h */
        boolean f31822h = false;

        /* JADX INFO: renamed from: i */
        boolean f31823i = false;

        /* JADX INFO: renamed from: j */
        boolean f31824j = false;

        /* JADX INFO: renamed from: k */
        boolean f31825k = false;

        /* JADX INFO: renamed from: l */
        boolean f31826l = false;

        void a(int i10) {
            if ((this.f31819e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f31819e));
        }

        public int b() {
            return this.f31822h ? this.f31817c - this.f31818d : this.f31820f;
        }

        public int c() {
            return this.f31815a;
        }

        public boolean d() {
            return this.f31815a != -1;
        }

        public boolean e() {
            return this.f31822h;
        }

        void f(h hVar) {
            this.f31819e = 1;
            this.f31820f = hVar.e();
            this.f31822h = false;
            this.f31823i = false;
            this.f31824j = false;
        }

        public boolean g() {
            return this.f31826l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f31815a + ", mData=" + this.f31816b + ", mItemCount=" + this.f31820f + ", mIsMeasuring=" + this.f31824j + ", mPreviousLayoutItemCount=" + this.f31817c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f31818d + ", mStructureChanged=" + this.f31821g + ", mInPreLayout=" + this.f31822h + ", mRunSimpleAnimations=" + this.f31825k + ", mRunPredictiveAnimations=" + this.f31826l + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class B extends l {
        B() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class C {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class D implements Runnable {

        /* JADX INFO: renamed from: a */
        private int f31832a;

        /* JADX INFO: renamed from: b */
        private int f31833b;

        /* JADX INFO: renamed from: c */
        OverScroller f31834c;

        /* JADX INFO: renamed from: d */
        Interpolator f31835d;

        /* JADX INFO: renamed from: e */
        private boolean f31836e;

        /* JADX INFO: renamed from: f */
        private boolean f31837f;

        D() {
            Interpolator interpolator = RecyclerView.f31737j1;
            this.f31835d = interpolator;
            this.f31836e = false;
            this.f31837f = false;
            this.f31834c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC2747a0.c0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f31833b = 0;
            this.f31832a = 0;
            Interpolator interpolator = this.f31835d;
            Interpolator interpolator2 = RecyclerView.f31737j1;
            if (interpolator != interpolator2) {
                this.f31835d = interpolator2;
                this.f31834c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f31834c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f31836e) {
                this.f31837f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f31737j1;
            }
            if (this.f31835d != interpolator) {
                this.f31835d = interpolator;
                this.f31834c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f31833b = 0;
            this.f31832a = 0;
            RecyclerView.this.setScrollState(2);
            this.f31834c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f31834c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f31789n == null) {
                f();
                return;
            }
            this.f31837f = false;
            this.f31836e = true;
            recyclerView.x();
            OverScroller overScroller = this.f31834c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f31832a;
                int i13 = currY - this.f31833b;
                this.f31832a = currX;
                this.f31833b = currY;
                int iU = RecyclerView.this.u(i12);
                int iW = RecyclerView.this.w(i13);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f31767T0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.I(iU, iW, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f31767T0;
                    iU -= iArr2[0];
                    iW -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(iU, iW);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f31787m != null) {
                    int[] iArr3 = recyclerView3.f31767T0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m1(iU, iW, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f31767T0;
                    int i14 = iArr4[0];
                    int i15 = iArr4[1];
                    iU -= i14;
                    iW -= i15;
                    z zVar = recyclerView4.f31789n.f31889g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int iB = RecyclerView.this.f31754H0.b();
                        if (iB == 0) {
                            zVar.r();
                        } else if (zVar.f() >= iB) {
                            zVar.p(iB - 1);
                            zVar.j(i14, i15);
                        } else {
                            zVar.j(i14, i15);
                        }
                    }
                    i11 = i15;
                    i10 = i14;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i16 = iU;
                int i17 = iW;
                if (!RecyclerView.this.f31793p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f31767T0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.J(i10, i11, i16, i17, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f31767T0;
                int i18 = i16 - iArr6[0];
                int i19 = i17 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.L(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                z zVar2 = RecyclerView.this.f31789n.f31889g;
                if ((zVar2 == null || !zVar2.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i20, currVelocity);
                    }
                    if (RecyclerView.f31733f1) {
                        RecyclerView.this.f31752G0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    e eVar = recyclerView7.f31750F0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i11);
                    }
                }
            }
            z zVar3 = RecyclerView.this.f31789n.f31889g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f31836e = false;
            if (this.f31837f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.B1(1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class E {

        /* JADX INFO: renamed from: t */
        private static final List f31839t = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: a */
        public final View f31840a;

        /* JADX INFO: renamed from: b */
        WeakReference f31841b;

        /* JADX INFO: renamed from: j */
        int f31849j;

        /* JADX INFO: renamed from: r */
        RecyclerView f31857r;

        /* JADX INFO: renamed from: s */
        h f31858s;

        /* JADX INFO: renamed from: c */
        int f31842c = -1;

        /* JADX INFO: renamed from: d */
        int f31843d = -1;

        /* JADX INFO: renamed from: e */
        long f31844e = -1;

        /* JADX INFO: renamed from: f */
        int f31845f = -1;

        /* JADX INFO: renamed from: g */
        int f31846g = -1;

        /* JADX INFO: renamed from: h */
        E f31847h = null;

        /* JADX INFO: renamed from: i */
        E f31848i = null;

        /* JADX INFO: renamed from: k */
        List f31850k = null;

        /* JADX INFO: renamed from: l */
        List f31851l = null;

        /* JADX INFO: renamed from: m */
        private int f31852m = 0;

        /* JADX INFO: renamed from: n */
        v f31853n = null;

        /* JADX INFO: renamed from: o */
        boolean f31854o = false;

        /* JADX INFO: renamed from: p */
        private int f31855p = 0;

        /* JADX INFO: renamed from: q */
        int f31856q = -1;

        public E(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f31840a = view;
        }

        private void g() {
            if (this.f31850k == null) {
                ArrayList arrayList = new ArrayList();
                this.f31850k = arrayList;
                this.f31851l = Collections.unmodifiableList(arrayList);
            }
        }

        boolean A() {
            return (this.f31849j & 2) != 0;
        }

        void B(int i10, boolean z10) {
            if (this.f31843d == -1) {
                this.f31843d = this.f31842c;
            }
            if (this.f31846g == -1) {
                this.f31846g = this.f31842c;
            }
            if (z10) {
                this.f31846g += i10;
            }
            this.f31842c += i10;
            if (this.f31840a.getLayoutParams() != null) {
                ((q) this.f31840a.getLayoutParams()).f31909c = true;
            }
        }

        void C(RecyclerView recyclerView) {
            int i10 = this.f31856q;
            if (i10 != -1) {
                this.f31855p = i10;
            } else {
                this.f31855p = AbstractC2747a0.w(this.f31840a);
            }
            recyclerView.p1(this, 4);
        }

        void D(RecyclerView recyclerView) {
            recyclerView.p1(this, this.f31855p);
            this.f31855p = 0;
        }

        void E() {
            this.f31849j = 0;
            this.f31842c = -1;
            this.f31843d = -1;
            this.f31844e = -1L;
            this.f31846g = -1;
            this.f31852m = 0;
            this.f31847h = null;
            this.f31848i = null;
            d();
            this.f31855p = 0;
            this.f31856q = -1;
            RecyclerView.r(this);
        }

        void F() {
            if (this.f31843d == -1) {
                this.f31843d = this.f31842c;
            }
        }

        void G(int i10, int i11) {
            this.f31849j = (i10 & i11) | (this.f31849j & (~i11));
        }

        public final void H(boolean z10) {
            int i10 = this.f31852m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f31852m = i11;
            if (i11 < 0) {
                this.f31852m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i11 == 1) {
                this.f31849j |= 16;
            } else if (z10 && i11 == 0) {
                this.f31849j &= -17;
            }
        }

        void I(v vVar, boolean z10) {
            this.f31853n = vVar;
            this.f31854o = z10;
        }

        boolean J() {
            return (this.f31849j & 16) != 0;
        }

        boolean K() {
            return (this.f31849j & 128) != 0;
        }

        void L() {
            this.f31853n.O(this);
        }

        boolean M() {
            return (this.f31849j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            } else if ((1024 & this.f31849j) == 0) {
                g();
                this.f31850k.add(obj);
            }
        }

        void b(int i10) {
            this.f31849j = i10 | this.f31849j;
        }

        void c() {
            this.f31843d = -1;
            this.f31846g = -1;
        }

        void d() {
            List list = this.f31850k;
            if (list != null) {
                list.clear();
            }
            this.f31849j &= -1025;
        }

        void e() {
            this.f31849j &= -33;
        }

        void f() {
            this.f31849j &= -257;
        }

        boolean h() {
            return (this.f31849j & 16) == 0 && AbstractC2747a0.N(this.f31840a);
        }

        void i(int i10, int i11, boolean z10) {
            b(8);
            B(i11, z10);
            this.f31842c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.f31857r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.e0(this);
        }

        public final int k() {
            RecyclerView recyclerView;
            h adapter;
            int iE0;
            if (this.f31858s == null || (recyclerView = this.f31857r) == null || (adapter = recyclerView.getAdapter()) == null || (iE0 = this.f31857r.e0(this)) == -1) {
                return -1;
            }
            return adapter.d(this.f31858s, this, iE0);
        }

        public final long l() {
            return this.f31844e;
        }

        public final int m() {
            return this.f31845f;
        }

        public final int n() {
            int i10 = this.f31846g;
            return i10 == -1 ? this.f31842c : i10;
        }

        public final int o() {
            return this.f31843d;
        }

        List p() {
            if ((this.f31849j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                return f31839t;
            }
            List list = this.f31850k;
            return (list == null || list.size() == 0) ? f31839t : this.f31851l;
        }

        boolean q(int i10) {
            return (i10 & this.f31849j) != 0;
        }

        boolean r() {
            return (this.f31849j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 || u();
        }

        boolean s() {
            return (this.f31840a.getParent() == null || this.f31840a.getParent() == this.f31857r) ? false : true;
        }

        boolean t() {
            return (this.f31849j & 1) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f31842c + " id=" + this.f31844e + ", oldPos=" + this.f31843d + ", pLpos:" + this.f31846g);
            if (x()) {
                sb2.append(" scrap ");
                sb2.append(this.f31854o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (u()) {
                sb2.append(" invalid");
            }
            if (!t()) {
                sb2.append(" unbound");
            }
            if (A()) {
                sb2.append(" update");
            }
            if (w()) {
                sb2.append(" removed");
            }
            if (K()) {
                sb2.append(" ignored");
            }
            if (y()) {
                sb2.append(" tmpDetached");
            }
            if (!v()) {
                sb2.append(" not recyclable(" + this.f31852m + ")");
            }
            if (r()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f31840a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        boolean u() {
            return (this.f31849j & 4) != 0;
        }

        public final boolean v() {
            return (this.f31849j & 16) == 0 && !AbstractC2747a0.N(this.f31840a);
        }

        boolean w() {
            return (this.f31849j & 8) != 0;
        }

        boolean x() {
            return this.f31853n != null;
        }

        boolean y() {
            return (this.f31849j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        }

        boolean z() {
            return (this.f31849j & 2) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class RunnableC2931a implements Runnable {
        RunnableC2931a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f31805v || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f31799s) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f31811y) {
                recyclerView2.f31809x = true;
            } else {
                recyclerView2.x();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class RunnableC2932b implements Runnable {
        RunnableC2932b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f31794p0;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.f31761N0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class InterpolatorC2933c implements Interpolator {
        InterpolatorC2933c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C2934d implements p.b {
        C2934d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(E e10, m.b bVar, m.b bVar2) {
            RecyclerView.this.l(e10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(E e10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f31789n.q1(e10.f31840a, recyclerView.f31776c);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(E e10, m.b bVar, m.b bVar2) {
            RecyclerView.this.f31776c.O(e10);
            RecyclerView.this.n(e10, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(E e10, m.b bVar, m.b bVar2) {
            e10.H(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f31747E) {
                if (recyclerView.f31794p0.b(e10, e10, bVar, bVar2)) {
                    RecyclerView.this.Q0();
                }
            } else if (recyclerView.f31794p0.d(e10, bVar, bVar2)) {
                RecyclerView.this.Q0();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C2935e implements b.InterfaceC0528b {
        C2935e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0528b
        public void a(View view) {
            E eI0 = RecyclerView.i0(view);
            if (eI0 != null) {
                eI0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0528b
        public E b(View view) {
            return RecyclerView.i0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0528b
        public void c(int i10) {
            E eI0;
            View childAt = getChildAt(i10);
            if (childAt != null && (eI0 = RecyclerView.i0(childAt)) != null) {
                if (eI0.y() && !eI0.K()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + eI0 + RecyclerView.this.S());
                }
                eI0.b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0528b
        public void d(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.B(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0528b
        public void e() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                RecyclerView.this.C(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0528b
        public int f(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0528b
        public void g(View view) {
            E eI0 = RecyclerView.i0(view);
            if (eI0 != null) {
                eI0.D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0528b
        public View getChildAt(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0528b
        public int getChildCount() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0528b
        public void h(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.C(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0528b
        public void i(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            E eI0 = RecyclerView.i0(view);
            if (eI0 != null) {
                if (!eI0.y() && !eI0.K()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + eI0 + RecyclerView.this.S());
                }
                eI0.f();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f implements a.InterfaceC0527a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0527a
        public void a(int i10, int i11) {
            RecyclerView.this.G0(i10, i11);
            RecyclerView.this.f31758K0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0527a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0527a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0527a
        public void d(int i10, int i11) {
            RecyclerView.this.H0(i10, i11, false);
            RecyclerView.this.f31758K0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0527a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.E1(i10, i11, obj);
            RecyclerView.this.f31759L0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0527a
        public E f(int i10) {
            E eC0 = RecyclerView.this.c0(i10, true);
            if (eC0 == null || RecyclerView.this.f31779f.n(eC0.f31840a)) {
                return null;
            }
            return eC0;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0527a
        public void g(int i10, int i11) {
            RecyclerView.this.F0(i10, i11);
            RecyclerView.this.f31758K0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0527a
        public void h(int i10, int i11) {
            RecyclerView.this.H0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f31758K0 = true;
            recyclerView.f31754H0.f31818d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f32007a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f31789n.V0(recyclerView, bVar.f32008b, bVar.f32010d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f31789n.Y0(recyclerView2, bVar.f32008b, bVar.f32010d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f31789n.a1(recyclerView3, bVar.f32008b, bVar.f32010d, bVar.f32009c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f31789n.X0(recyclerView4, bVar.f32008b, bVar.f32010d, 1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class g {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f31864a;

        static {
            int[] iArr = new int[h.a.values().length];
            f31864a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31864a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class i extends Observable {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class j {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface k {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class l {
        protected abstract EdgeEffect a(RecyclerView recyclerView, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class n implements m.a {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.a
        public void a(E e10) {
            e10.H(true);
            if (e10.f31847h != null && e10.f31848i == null) {
                e10.f31847h = null;
            }
            e10.f31848i = null;
            if (e10.J() || RecyclerView.this.b1(e10.f31840a) || !e10.y()) {
                return;
            }
            RecyclerView.this.removeDetachedView(e10.f31840a, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class r {
        public abstract boolean a(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class u {

        /* JADX INFO: renamed from: a */
        SparseArray f31911a = new SparseArray();

        /* JADX INFO: renamed from: b */
        int f31912b = 0;

        /* JADX INFO: renamed from: c */
        Set f31913c = Collections.newSetFromMap(new IdentityHashMap());

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a {

            /* JADX INFO: renamed from: a */
            final ArrayList f31914a = new ArrayList();

            /* JADX INFO: renamed from: b */
            int f31915b = 5;

            /* JADX INFO: renamed from: c */
            long f31916c = 0;

            /* JADX INFO: renamed from: d */
            long f31917d = 0;

            a() {
            }
        }

        private a i(int i10) {
            a aVar = (a) this.f31911a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f31911a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f31912b++;
        }

        void b(h hVar) {
            this.f31913c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f31911a.size(); i10++) {
                a aVar = (a) this.f31911a.valueAt(i10);
                Iterator it = aVar.f31914a.iterator();
                while (it.hasNext()) {
                    P1.a.b(((E) it.next()).f31840a);
                }
                aVar.f31914a.clear();
            }
        }

        void d() {
            this.f31912b--;
        }

        void e(h hVar, boolean z10) {
            this.f31913c.remove(hVar);
            if (this.f31913c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f31911a.size(); i10++) {
                SparseArray sparseArray = this.f31911a;
                ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i10))).f31914a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    P1.a.b(((E) arrayList.get(i11)).f31840a);
                }
            }
        }

        void f(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f31917d = l(aVarI.f31917d, j10);
        }

        void g(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f31916c = l(aVarI.f31916c, j10);
        }

        public E h(int i10) {
            a aVar = (a) this.f31911a.get(i10);
            if (aVar == null || aVar.f31914a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f31914a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((E) arrayList.get(size)).s()) {
                    return (E) arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h hVar, h hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f31912b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(E e10) {
            int iM = e10.m();
            ArrayList arrayList = i(iM).f31914a;
            if (((a) this.f31911a.get(iM)).f31915b <= arrayList.size()) {
                P1.a.b(e10.f31840a);
            } else {
                e10.E();
                arrayList.add(e10);
            }
        }

        long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f31917d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f31916c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface w {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class x extends j {
        x() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class z {

        /* JADX INFO: renamed from: b */
        private RecyclerView f31929b;

        /* JADX INFO: renamed from: c */
        private p f31930c;

        /* JADX INFO: renamed from: d */
        private boolean f31931d;

        /* JADX INFO: renamed from: e */
        private boolean f31932e;

        /* JADX INFO: renamed from: f */
        private View f31933f;

        /* JADX INFO: renamed from: h */
        private boolean f31935h;

        /* JADX INFO: renamed from: a */
        private int f31928a = -1;

        /* JADX INFO: renamed from: g */
        private final a f31934g = new a(0, 0);

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class a {

            /* JADX INFO: renamed from: a */
            private int f31936a;

            /* JADX INFO: renamed from: b */
            private int f31937b;

            /* JADX INFO: renamed from: c */
            private int f31938c;

            /* JADX INFO: renamed from: d */
            private int f31939d;

            /* JADX INFO: renamed from: e */
            private Interpolator f31940e;

            /* JADX INFO: renamed from: f */
            private boolean f31941f;

            /* JADX INFO: renamed from: g */
            private int f31942g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f31940e != null && this.f31938c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f31938c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f31939d >= 0;
            }

            public void b(int i10) {
                this.f31939d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f31939d;
                if (i10 >= 0) {
                    this.f31939d = -1;
                    recyclerView.z0(i10);
                    this.f31941f = false;
                } else {
                    if (!this.f31941f) {
                        this.f31942g = 0;
                        return;
                    }
                    e();
                    recyclerView.f31748E0.e(this.f31936a, this.f31937b, this.f31938c, this.f31940e);
                    int i11 = this.f31942g + 1;
                    this.f31942g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f31941f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f31936a = i10;
                this.f31937b = i11;
                this.f31938c = i12;
                this.f31940e = interpolator;
                this.f31941f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f31939d = -1;
                this.f31941f = false;
                this.f31942g = 0;
                this.f31936a = i10;
                this.f31937b = i11;
                this.f31938c = i12;
                this.f31940e = interpolator;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public interface b {
            PointF d(int i10);
        }

        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).d(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f31929b.f31789n.H(i10);
        }

        public int c() {
            return this.f31929b.f31789n.O();
        }

        public int d(View view) {
            return this.f31929b.g0(view);
        }

        public p e() {
            return this.f31930c;
        }

        public int f() {
            return this.f31928a;
        }

        public boolean g() {
            return this.f31931d;
        }

        public boolean h() {
            return this.f31932e;
        }

        protected void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f31929b;
            if (this.f31928a == -1 || recyclerView == null) {
                r();
            }
            if (this.f31931d && this.f31933f == null && this.f31930c != null && (pointFA = a(this.f31928a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.m1((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f31931d = false;
            View view = this.f31933f;
            if (view != null) {
                if (d(view) == this.f31928a) {
                    o(this.f31933f, recyclerView.f31754H0, this.f31934g);
                    this.f31934g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f31933f = null;
                }
            }
            if (this.f31932e) {
                l(i10, i11, recyclerView.f31754H0, this.f31934g);
                boolean zA = this.f31934g.a();
                this.f31934g.c(recyclerView);
                if (zA && this.f31932e) {
                    this.f31931d = true;
                    recyclerView.f31748E0.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f31933f = view;
            }
        }

        protected abstract void l(int i10, int i11, A a10, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, A a10, a aVar);

        public void p(int i10) {
            this.f31928a = i10;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.f31748E0.f();
            if (this.f31935h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f31929b = recyclerView;
            this.f31930c = pVar;
            int i10 = this.f31928a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f31754H0.f31815a = i10;
            this.f31932e = true;
            this.f31931d = true;
            this.f31933f = b(f());
            m();
            this.f31929b.f31748E0.d();
            this.f31935h = true;
        }

        protected final void r() {
            if (this.f31932e) {
                this.f31932e = false;
                n();
                this.f31929b.f31754H0.f31815a = -1;
                this.f31933f = null;
                this.f31928a = -1;
                this.f31931d = false;
                this.f31930c.j1(this);
                this.f31930c = null;
                this.f31929b = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        f31736i1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f31737j1 = new InterpolatorC2933c();
        f31738k1 = new B();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, L3.a.f11249a);
    }

    private boolean A(int i10, int i11) {
        X(this.f31763P0);
        int[] iArr = this.f31763P0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void C0(int i10, int i11, MotionEvent motionEvent, int i12) {
        p pVar = this.f31789n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f31811y) {
            return;
        }
        int[] iArr = this.f31767T0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zP = pVar.p();
        boolean zQ = this.f31789n.q();
        int i13 = zQ ? (zP ? 1 : 0) | 2 : zP ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iY0 = i10 - Y0(i10, height);
        int iZ0 = i11 - Z0(i11, width);
        y1(i13, i12);
        if (I(zP ? iY0 : 0, zQ ? iZ0 : 0, this.f31767T0, this.f31765R0, i12)) {
            int[] iArr2 = this.f31767T0;
            iY0 -= iArr2[0];
            iZ0 -= iArr2[1];
        }
        l1(zP ? iY0 : 0, zQ ? iZ0 : 0, motionEvent, i12);
        e eVar = this.f31750F0;
        if (eVar != null && (iY0 != 0 || iZ0 != 0)) {
            eVar.f(this, iY0, iZ0);
        }
        B1(i12);
    }

    private void D() {
        int i10 = this.f31739A;
        this.f31739A = 0;
        if (i10 == 0 || !w0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AbstractC1865b.c(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void D1() {
        this.f31748E0.f();
        p pVar = this.f31789n;
        if (pVar != null) {
            pVar.O1();
        }
    }

    private void F() {
        this.f31754H0.a(1);
        T(this.f31754H0);
        this.f31754H0.f31824j = false;
        x1();
        this.f31780g.f();
        K0();
        S0();
        j1();
        A a10 = this.f31754H0;
        a10.f31823i = a10.f31825k && this.f31759L0;
        this.f31759L0 = false;
        this.f31758K0 = false;
        a10.f31822h = a10.f31826l;
        a10.f31820f = this.f31787m.e();
        X(this.f31763P0);
        if (this.f31754H0.f31825k) {
            int iG = this.f31779f.g();
            for (int i10 = 0; i10 < iG; i10++) {
                E eI0 = i0(this.f31779f.f(i10));
                if (!eI0.K() && (!eI0.u() || this.f31787m.i())) {
                    this.f31780g.e(eI0, this.f31794p0.t(this.f31754H0, eI0, m.e(eI0), eI0.p()));
                    if (this.f31754H0.f31823i && eI0.z() && !eI0.w() && !eI0.K() && !eI0.u()) {
                        this.f31780g.c(f0(eI0), eI0);
                    }
                }
            }
        }
        if (this.f31754H0.f31826l) {
            k1();
            A a11 = this.f31754H0;
            boolean z10 = a11.f31821g;
            a11.f31821g = false;
            this.f31789n.b1(this.f31776c, a11);
            this.f31754H0.f31821g = z10;
            for (int i11 = 0; i11 < this.f31779f.g(); i11++) {
                E eI02 = i0(this.f31779f.f(i11));
                if (!eI02.K() && !this.f31780g.i(eI02)) {
                    int iE = m.e(eI02);
                    boolean zQ = eI02.q(8192);
                    if (!zQ) {
                        iE |= 4096;
                    }
                    m.b bVarT = this.f31794p0.t(this.f31754H0, eI02, iE, eI02.p());
                    if (zQ) {
                        V0(eI02, bVarT);
                    } else {
                        this.f31780g.a(eI02, bVarT);
                    }
                }
            }
            s();
        } else {
            s();
        }
        L0();
        A1(false);
        this.f31754H0.f31819e = 2;
    }

    private void G() {
        x1();
        K0();
        this.f31754H0.a(6);
        this.f31778e.j();
        this.f31754H0.f31820f = this.f31787m.e();
        this.f31754H0.f31818d = 0;
        if (this.f31777d != null && this.f31787m.b()) {
            Parcelable parcelable = this.f31777d.f31927c;
            if (parcelable != null) {
                this.f31789n.g1(parcelable);
            }
            this.f31777d = null;
        }
        A a10 = this.f31754H0;
        a10.f31822h = false;
        this.f31789n.b1(this.f31776c, a10);
        A a11 = this.f31754H0;
        a11.f31821g = false;
        a11.f31825k = a11.f31825k && this.f31794p0 != null;
        a11.f31819e = 4;
        L0();
        A1(false);
    }

    private void H() {
        RecyclerView recyclerView;
        this.f31754H0.a(4);
        x1();
        K0();
        A a10 = this.f31754H0;
        a10.f31819e = 1;
        if (a10.f31825k) {
            for (int iG = this.f31779f.g() - 1; iG >= 0; iG--) {
                E eI0 = i0(this.f31779f.f(iG));
                if (!eI0.K()) {
                    long jF0 = f0(eI0);
                    m.b bVarS = this.f31794p0.s(this.f31754H0, eI0);
                    E eG = this.f31780g.g(jF0);
                    if (eG == null || eG.K()) {
                        this.f31780g.d(eI0, bVarS);
                    } else {
                        boolean zH = this.f31780g.h(eG);
                        boolean zH2 = this.f31780g.h(eI0);
                        if (zH && eG == eI0) {
                            this.f31780g.d(eI0, bVarS);
                        } else {
                            m.b bVarN = this.f31780g.n(eG);
                            this.f31780g.d(eI0, bVarS);
                            m.b bVarM = this.f31780g.m(eI0);
                            if (bVarN == null) {
                                o0(jF0, eI0, eG);
                            } else {
                                m(eG, eI0, bVarN, bVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f31780g.o(recyclerView.f31773Z0);
        } else {
            recyclerView = this;
        }
        recyclerView.f31789n.p1(recyclerView.f31776c);
        A a11 = recyclerView.f31754H0;
        a11.f31817c = a11.f31820f;
        recyclerView.f31747E = false;
        recyclerView.f31749F = false;
        a11.f31825k = false;
        a11.f31826l = false;
        recyclerView.f31789n.f31890h = false;
        ArrayList arrayList = recyclerView.f31776c.f31919b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.f31789n;
        if (pVar.f31896n) {
            pVar.f31895m = 0;
            pVar.f31896n = false;
            recyclerView.f31776c.P();
        }
        recyclerView.f31789n.c1(recyclerView.f31754H0);
        L0();
        A1(false);
        recyclerView.f31780g.f();
        int[] iArr = recyclerView.f31763P0;
        if (A(iArr[0], iArr[1])) {
            L(0, 0);
        }
        W0();
        h1();
    }

    private boolean N(MotionEvent motionEvent) {
        s sVar = this.f31797r;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return W(motionEvent);
        }
        sVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f31797r = null;
        }
        return true;
    }

    private void N0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f31798r0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f31798r0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f31806v0 = x10;
            this.f31802t0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f31808w0 = y10;
            this.f31804u0 = y10;
        }
    }

    private boolean R0() {
        return this.f31794p0 != null && this.f31789n.P1();
    }

    private void S0() {
        boolean z10;
        if (this.f31747E) {
            this.f31778e.u();
            if (this.f31749F) {
                this.f31789n.W0(this);
            }
        }
        if (R0()) {
            this.f31778e.s();
        } else {
            this.f31778e.j();
        }
        boolean z11 = this.f31758K0 || this.f31759L0;
        this.f31754H0.f31825k = this.f31805v && this.f31794p0 != null && ((z10 = this.f31747E) || z11 || this.f31789n.f31890h) && (!z10 || this.f31787m.i());
        A a10 = this.f31754H0;
        a10.f31826l = a10.f31825k && z11 && !this.f31747E && R0();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void U0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.P()
            android.widget.EdgeEffect r1 = r6.f31786l0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.d.d(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.Q()
            android.widget.EdgeEffect r1 = r6.f31790n0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.d(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.R()
            android.widget.EdgeEffect r9 = r6.f31788m0
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.d.d(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.O()
            android.widget.EdgeEffect r9 = r6.f31792o0
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.d.d(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            androidx.core.view.AbstractC2747a0.b0(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.U0(float, float, float, float):void");
    }

    private boolean W(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f31795q.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = (s) this.f31795q.get(i10);
            if (sVar.b(this, motionEvent) && action != 3) {
                this.f31797r = sVar;
                return true;
            }
        }
        return false;
    }

    private void W0() {
        View viewFindViewById;
        if (!this.f31746D0 || this.f31787m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f31735h1 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f31779f.n(focusedChild)) {
                    return;
                }
            } else if (this.f31779f.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewZ = null;
        E eB0 = (this.f31754H0.f31828n == -1 || !this.f31787m.i()) ? null : b0(this.f31754H0.f31828n);
        if (eB0 != null && !this.f31779f.n(eB0.f31840a) && eB0.f31840a.hasFocusable()) {
            viewZ = eB0.f31840a;
        } else if (this.f31779f.g() > 0) {
            viewZ = Z();
        }
        if (viewZ != null) {
            int i10 = this.f31754H0.f31829o;
            if (i10 != -1 && (viewFindViewById = viewZ.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewZ = viewFindViewById;
            }
            viewZ.requestFocus();
        }
    }

    private void X(int[] iArr) {
        int iG = this.f31779f.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iG; i12++) {
            E eI0 = i0(this.f31779f.f(i12));
            if (!eI0.K()) {
                int iN = eI0.n();
                if (iN < i10) {
                    i10 = iN;
                }
                if (iN > i11) {
                    i11 = iN;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    private void X0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f31786l0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f31786l0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f31788m0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f31788m0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f31790n0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f31790n0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f31792o0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f31792o0.isFinished();
        }
        if (zIsFinished) {
            AbstractC2747a0.b0(this);
        }
    }

    static RecyclerView Y(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewY = Y(viewGroup.getChildAt(i10));
            if (recyclerViewY != null) {
                return recyclerViewY;
            }
        }
        return null;
    }

    private int Y0(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f31786l0;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f31790n0;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f31790n0.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.f31790n0, width, height);
                    if (androidx.core.widget.d.b(this.f31790n0) == 0.0f) {
                        this.f31790n0.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f31786l0.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.f31786l0, -width, 1.0f - height);
                if (androidx.core.widget.d.b(this.f31786l0) == 0.0f) {
                    this.f31786l0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private View Z() {
        E eA0;
        A a10 = this.f31754H0;
        int i10 = a10.f31827m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = a10.b();
        for (int i11 = i10; i11 < iB; i11++) {
            E eA02 = a0(i11);
            if (eA02 == null) {
                break;
            }
            if (eA02.f31840a.hasFocusable()) {
                return eA02.f31840a;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (eA0 = a0(iMin)) == null) {
                return null;
            }
        } while (!eA0.f31840a.hasFocusable());
        return eA0.f31840a;
    }

    private int Z0(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f31788m0;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f31792o0;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f31792o0.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.f31792o0, height, 1.0f - width);
                    if (androidx.core.widget.d.b(this.f31792o0) == 0.0f) {
                        this.f31792o0.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f31788m0.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.f31788m0, -height, width);
                if (androidx.core.widget.d.b(this.f31788m0) == 0.0f) {
                    this.f31788m0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private void g(E e10) {
        View view = e10.f31840a;
        boolean z10 = view.getParent() == this;
        this.f31776c.O(h0(view));
        if (e10.y()) {
            this.f31779f.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f31779f.k(view);
        } else {
            this.f31779f.b(view, true);
        }
    }

    private void g1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f31783j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f31909c) {
                Rect rect = qVar.f31908b;
                Rect rect2 = this.f31783j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f31783j);
            offsetRectIntoDescendantCoords(view, this.f31783j);
        }
        this.f31789n.w1(this, view, this.f31783j, !this.f31805v, view2 == null);
    }

    private androidx.core.view.E getScrollingChildHelper() {
        if (this.f31764Q0 == null) {
            this.f31764Q0 = new androidx.core.view.E(this);
        }
        return this.f31764Q0;
    }

    private void h1() {
        A a10 = this.f31754H0;
        a10.f31828n = -1L;
        a10.f31827m = -1;
        a10.f31829o = -1;
    }

    static E i0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f31907a;
    }

    private void i1() {
        VelocityTracker velocityTracker = this.f31800s0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        B1(0);
        X0();
    }

    static void j0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f31908b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private void j1() {
        View focusedChild = (this.f31746D0 && hasFocus() && this.f31787m != null) ? getFocusedChild() : null;
        E eV = focusedChild != null ? V(focusedChild) : null;
        if (eV == null) {
            h1();
            return;
        }
        this.f31754H0.f31828n = this.f31787m.i() ? eV.l() : -1L;
        this.f31754H0.f31827m = this.f31747E ? -1 : eV.w() ? eV.f31843d : eV.j();
        this.f31754H0.f31829o = k0(eV.f31840a);
    }

    private int k0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String l0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + com.amazon.a.a.o.c.a.b.f34706a + str;
    }

    private void m(E e10, E e11, m.b bVar, m.b bVar2, boolean z10, boolean z11) {
        e10.H(false);
        if (z10) {
            g(e10);
        }
        if (e10 != e11) {
            if (z11) {
                g(e11);
            }
            e10.f31847h = e11;
            g(e10);
            this.f31776c.O(e10);
            e11.H(false);
            e11.f31848i = e10;
        }
        if (this.f31794p0.b(e10, e11, bVar, bVar2)) {
            Q0();
        }
    }

    private float n0(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f31774a * 0.015f));
        float f10 = f31729b1;
        return (float) (((double) (this.f31774a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private void o0(long j10, E e10, E e11) {
        int iG = this.f31779f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            E eI0 = i0(this.f31779f.f(i10));
            if (eI0 != e10 && f0(eI0) == j10) {
                h hVar = this.f31787m;
                if (hVar == null || !hVar.i()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + eI0 + " \n View Holder 2:" + e10 + S());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + eI0 + " \n View Holder 2:" + e10 + S());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e11 + " cannot be found but it is necessary for " + e10 + S());
    }

    private void o1(h hVar, boolean z10, boolean z11) {
        h hVar2 = this.f31787m;
        if (hVar2 != null) {
            hVar2.u(this.f31775b);
            this.f31787m.n(this);
        }
        if (!z10 || z11) {
            a1();
        }
        this.f31778e.u();
        h hVar3 = this.f31787m;
        this.f31787m = hVar;
        if (hVar != null) {
            hVar.s(this.f31775b);
            hVar.j(this);
        }
        p pVar = this.f31789n;
        if (pVar != null) {
            pVar.I0(hVar3, this.f31787m);
        }
        this.f31776c.y(hVar3, this.f31787m, z10);
        this.f31754H0.f31821g = true;
    }

    private void q() {
        i1();
        setScrollState(0);
    }

    private boolean q0() {
        int iG = this.f31779f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            E eI0 = i0(this.f31779f.f(i10));
            if (eI0 != null && !eI0.K() && eI0.z()) {
                return true;
            }
        }
        return false;
    }

    private boolean q1(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return n0(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) i11);
    }

    static void r(E e10) {
        WeakReference weakReference = e10.f31841b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == e10.f31840a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            e10.f31841b = null;
        }
    }

    private void s0() {
        if (AbstractC2747a0.x(this) == 0) {
            AbstractC2747a0.u0(this, 8);
        }
    }

    private void t0() {
        this.f31779f = new b(new C2935e());
    }

    private int v(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i11) / 4.0f) * androidx.core.widget.d.d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || androidx.core.widget.d.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.d.d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    private void y(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strL0 = l0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strL0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f31736i1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strL0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strL0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strL0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strL0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strL0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strL0, e16);
            }
        }
    }

    private boolean y0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || U(view2) == null) {
            return false;
        }
        if (view == null || U(view) == null) {
            return true;
        }
        this.f31783j.set(0, 0, view.getWidth(), view.getHeight());
        this.f31784k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f31783j);
        offsetDescendantRectToMyCoords(view2, this.f31784k);
        byte b10 = -1;
        int i12 = this.f31789n.d0() == 1 ? -1 : 1;
        Rect rect = this.f31783j;
        int i13 = rect.left;
        Rect rect2 = this.f31784k;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            b10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b10 = 0;
            }
        }
        if (i10 == 1) {
            return b10 < 0 || (b10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return b10 > 0 || (b10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + S());
    }

    private boolean z1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f31786l0;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            androidx.core.widget.d.d(this.f31786l0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.f31790n0;
        if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.d.d(this.f31790n0, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.f31788m0;
        if (edgeEffect3 != null && androidx.core.widget.d.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.d.d(this.f31788m0, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.f31792o0;
        if (edgeEffect4 == null || androidx.core.widget.d.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        androidx.core.widget.d.d(this.f31792o0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    void A0() {
        int iJ = this.f31779f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((q) this.f31779f.i(i10).getLayoutParams()).f31909c = true;
        }
        this.f31776c.s();
    }

    void A1(boolean z10) {
        if (this.f31807w < 1) {
            this.f31807w = 1;
        }
        if (!z10 && !this.f31811y) {
            this.f31809x = false;
        }
        if (this.f31807w == 1) {
            if (z10 && this.f31809x && !this.f31811y && this.f31789n != null && this.f31787m != null) {
                E();
            }
            if (!this.f31811y) {
                this.f31809x = false;
            }
        }
        this.f31807w--;
    }

    void B(View view) {
        int size;
        E eI0 = i0(view);
        I0(view);
        h hVar = this.f31787m;
        if (hVar != null && eI0 != null) {
            hVar.p(eI0);
        }
        if (this.f31745D == null || r2.size() - 1 < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f31745D.get(size));
        throw null;
    }

    void B0() {
        int iJ = this.f31779f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            E eI0 = i0(this.f31779f.i(i10));
            if (eI0 != null && !eI0.K()) {
                eI0.b(6);
            }
        }
        A0();
        this.f31776c.t();
    }

    public void B1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    void C(View view) {
        int size;
        E eI0 = i0(view);
        J0(view);
        h hVar = this.f31787m;
        if (hVar != null && eI0 != null) {
            hVar.q(eI0);
        }
        if (this.f31745D == null || r2.size() - 1 < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f31745D.get(size));
        throw null;
    }

    public void C1() {
        setScrollState(0);
        D1();
    }

    public void D0(int i10) {
        int iG = this.f31779f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f31779f.f(i11).offsetLeftAndRight(i10);
        }
    }

    void E() {
        if (this.f31787m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f31789n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f31754H0.f31824j = false;
        boolean z10 = this.f31770W0 && !(this.f31771X0 == getWidth() && this.f31772Y0 == getHeight());
        this.f31771X0 = 0;
        this.f31772Y0 = 0;
        this.f31770W0 = false;
        if (this.f31754H0.f31819e == 1) {
            F();
            this.f31789n.D1(this);
            G();
        } else if (this.f31778e.q() || z10 || this.f31789n.s0() != getWidth() || this.f31789n.b0() != getHeight()) {
            this.f31789n.D1(this);
            G();
        } else {
            this.f31789n.D1(this);
        }
        H();
    }

    public void E0(int i10) {
        int iG = this.f31779f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f31779f.f(i11).offsetTopAndBottom(i10);
        }
    }

    void E1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f31779f.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f31779f.i(i14);
            E eI0 = i0(viewI);
            if (eI0 != null && !eI0.K() && (i12 = eI0.f31842c) >= i10 && i12 < i13) {
                eI0.b(2);
                eI0.a(obj);
                ((q) viewI.getLayoutParams()).f31909c = true;
            }
        }
        this.f31776c.R(i10, i11);
    }

    void F0(int i10, int i11) {
        int iJ = this.f31779f.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            E eI0 = i0(this.f31779f.i(i12));
            if (eI0 != null && !eI0.K() && eI0.f31842c >= i10) {
                eI0.B(i11, false);
                this.f31754H0.f31821g = true;
            }
        }
        this.f31776c.v(i10, i11);
        requestLayout();
    }

    void G0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f31779f.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            E eI0 = i0(this.f31779f.i(i16));
            if (eI0 != null && (i15 = eI0.f31842c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    eI0.B(i11 - i10, false);
                } else {
                    eI0.B(i14, false);
                }
                this.f31754H0.f31821g = true;
            }
        }
        this.f31776c.w(i10, i11);
        requestLayout();
    }

    void H0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f31779f.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            E eI0 = i0(this.f31779f.i(i13));
            if (eI0 != null && !eI0.K()) {
                int i14 = eI0.f31842c;
                if (i14 >= i12) {
                    eI0.B(-i11, z10);
                    this.f31754H0.f31821g = true;
                } else if (i14 >= i10) {
                    eI0.i(i10 - 1, -i11, z10);
                    this.f31754H0.f31821g = true;
                }
            }
        }
        this.f31776c.x(i10, i11, z10);
        requestLayout();
    }

    public boolean I(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public final void J(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    void K(int i10) {
        p pVar = this.f31789n;
        if (pVar != null) {
            pVar.i1(i10);
        }
        O0(i10);
        t tVar = this.f31756I0;
        if (tVar != null) {
            tVar.a(this, i10);
        }
        List list = this.f31757J0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.f31757J0.get(size)).a(this, i10);
            }
        }
    }

    void K0() {
        this.f31751G++;
    }

    void L(int i10, int i11) {
        this.f31753H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        P0(i10, i11);
        t tVar = this.f31756I0;
        if (tVar != null) {
            tVar.b(this, i10, i11);
        }
        List list = this.f31757J0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((t) this.f31757J0.get(size)).b(this, i10, i11);
            }
        }
        this.f31753H--;
    }

    void L0() {
        M0(true);
    }

    void M() {
        int i10;
        for (int size = this.f31768U0.size() - 1; size >= 0; size--) {
            E e10 = (E) this.f31768U0.get(size);
            if (e10.f31840a.getParent() == this && !e10.K() && (i10 = e10.f31856q) != -1) {
                AbstractC2747a0.s0(e10.f31840a, i10);
                e10.f31856q = -1;
            }
        }
        this.f31768U0.clear();
    }

    void M0(boolean z10) {
        int i10 = this.f31751G - 1;
        this.f31751G = i10;
        if (i10 < 1) {
            this.f31751G = 0;
            if (z10) {
                D();
                M();
            }
        }
    }

    void O() {
        if (this.f31792o0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f31755I.a(this, 3);
        this.f31792o0 = edgeEffectA;
        if (this.f31781h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void P() {
        if (this.f31786l0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f31755I.a(this, 0);
        this.f31786l0 = edgeEffectA;
        if (this.f31781h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void Q() {
        if (this.f31790n0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f31755I.a(this, 2);
        this.f31790n0 = edgeEffectA;
        if (this.f31781h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void Q0() {
        if (this.f31761N0 || !this.f31799s) {
            return;
        }
        AbstractC2747a0.c0(this, this.f31769V0);
        this.f31761N0 = true;
    }

    void R() {
        if (this.f31788m0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f31755I.a(this, 1);
        this.f31788m0 = edgeEffectA;
        if (this.f31781h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String S() {
        return " " + super.toString() + ", adapter:" + this.f31787m + ", layout:" + this.f31789n + ", context:" + getContext();
    }

    final void T(A a10) {
        if (getScrollState() != 2) {
            a10.f31830p = 0;
            a10.f31831q = 0;
        } else {
            OverScroller overScroller = this.f31748E0.f31834c;
            a10.f31830p = overScroller.getFinalX() - overScroller.getCurrX();
            a10.f31831q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    void T0(boolean z10) {
        this.f31749F = z10 | this.f31749F;
        this.f31747E = true;
        B0();
    }

    public View U(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public E V(View view) {
        View viewU = U(view);
        if (viewU == null) {
            return null;
        }
        return h0(viewU);
    }

    void V0(E e10, m.b bVar) {
        e10.G(0, 8192);
        if (this.f31754H0.f31823i && e10.z() && !e10.w() && !e10.K()) {
            this.f31780g.c(f0(e10), e10);
        }
        this.f31780g.e(e10, bVar);
    }

    public E a0(int i10) {
        E e10 = null;
        if (this.f31747E) {
            return null;
        }
        int iJ = this.f31779f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            E eI0 = i0(this.f31779f.i(i11));
            if (eI0 != null && !eI0.w() && e0(eI0) == i10) {
                if (!this.f31779f.n(eI0.f31840a)) {
                    return eI0;
                }
                e10 = eI0;
            }
        }
        return e10;
    }

    void a1() {
        m mVar = this.f31794p0;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.f31789n;
        if (pVar != null) {
            pVar.o1(this.f31776c);
            this.f31789n.p1(this.f31776c);
        }
        this.f31776c.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        p pVar = this.f31789n;
        if (pVar == null || !pVar.J0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    void b(int i10, int i11) {
        if (i10 < 0) {
            P();
            if (this.f31786l0.isFinished()) {
                this.f31786l0.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            Q();
            if (this.f31790n0.isFinished()) {
                this.f31790n0.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            R();
            if (this.f31788m0.isFinished()) {
                this.f31788m0.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            O();
            if (this.f31792o0.isFinished()) {
                this.f31792o0.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        AbstractC2747a0.b0(this);
    }

    public E b0(long j10) {
        h hVar = this.f31787m;
        E e10 = null;
        if (hVar != null && hVar.i()) {
            int iJ = this.f31779f.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                E eI0 = i0(this.f31779f.i(i10));
                if (eI0 != null && !eI0.w() && eI0.l() == j10) {
                    if (!this.f31779f.n(eI0.f31840a)) {
                        return eI0;
                    }
                    e10 = eI0;
                }
            }
        }
        return e10;
    }

    boolean b1(View view) {
        x1();
        boolean zR = this.f31779f.r(view);
        if (zR) {
            E eI0 = i0(view);
            this.f31776c.O(eI0);
            this.f31776c.H(eI0);
        }
        A1(!zR);
        return zR;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.E c0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f31779f
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f31779f
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$E r3 = i0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.w()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f31842c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.n()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f31779f
            android.view.View r4 = r3.f31840a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c0(int, boolean):androidx.recyclerview.widget.RecyclerView$E");
    }

    public void c1(o oVar) {
        p pVar = this.f31789n;
        if (pVar != null) {
            pVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f31793p.remove(oVar);
        if (this.f31793p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        A0();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f31789n.r((q) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        p pVar = this.f31789n;
        if (pVar != null && pVar.p()) {
            return this.f31789n.v(this.f31754H0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        p pVar = this.f31789n;
        if (pVar != null && pVar.p()) {
            return this.f31789n.w(this.f31754H0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        p pVar = this.f31789n;
        if (pVar != null && pVar.p()) {
            return this.f31789n.x(this.f31754H0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        p pVar = this.f31789n;
        if (pVar != null && pVar.q()) {
            return this.f31789n.y(this.f31754H0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        p pVar = this.f31789n;
        if (pVar != null && pVar.q()) {
            return this.f31789n.z(this.f31754H0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        p pVar = this.f31789n;
        if (pVar != null && pVar.q()) {
            return this.f31789n.A(this.f31754H0);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean d0(int i10, int i11) {
        int iMax;
        int i12;
        p pVar = this.f31789n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f31811y) {
            return false;
        }
        int iP = pVar.p();
        boolean zQ = this.f31789n.q();
        if (iP == 0 || Math.abs(i10) < this.f31814z0) {
            i10 = 0;
        }
        if (!zQ || Math.abs(i11) < this.f31814z0) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.f31786l0;
            if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f31790n0;
                if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                    if (q1(this.f31790n0, i10, getWidth())) {
                        this.f31790n0.onAbsorb(i10);
                        i10 = 0;
                    }
                    iMax = i10;
                    i10 = 0;
                }
                iMax = 0;
            } else {
                int i13 = -i10;
                if (q1(this.f31786l0, i13, getWidth())) {
                    this.f31786l0.onAbsorb(i13);
                    i10 = 0;
                }
                iMax = i10;
                i10 = 0;
            }
        }
        if (i11 == 0) {
            i12 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.f31788m0;
            if (edgeEffect3 == null || androidx.core.widget.d.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.f31792o0;
                if (edgeEffect4 != null && androidx.core.widget.d.b(edgeEffect4) != 0.0f) {
                    if (q1(this.f31792o0, i11, getHeight())) {
                        this.f31792o0.onAbsorb(i11);
                        i11 = 0;
                    }
                    i12 = 0;
                }
                i12 = i11;
                i11 = 0;
            } else {
                int i14 = -i11;
                if (q1(this.f31788m0, i14, getHeight())) {
                    this.f31788m0.onAbsorb(i14);
                    i11 = 0;
                }
                i12 = 0;
            }
        }
        if (iMax != 0 || i11 != 0) {
            int i15 = this.f31740A0;
            iMax = Math.max(-i15, Math.min(iMax, i15));
            int i16 = this.f31740A0;
            i11 = Math.max(-i16, Math.min(i11, i16));
            this.f31748E0.b(iMax, i11);
        }
        if (i10 == 0 && i12 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i12;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = iP != 0 || zQ;
            dispatchNestedFling(f10, f11, z10);
            r rVar = this.f31812y0;
            if (rVar != null && rVar.a(i10, i12)) {
                return true;
            }
            if (z10) {
                if (zQ) {
                    iP = (iP == true ? 1 : 0) | 2;
                }
                y1(iP, 1);
                int i17 = this.f31740A0;
                int iMax2 = Math.max(-i17, Math.min(i10, i17));
                int i18 = this.f31740A0;
                this.f31748E0.b(iMax2, Math.max(-i18, Math.min(i12, i18)));
                return true;
            }
        }
        return false;
    }

    public void d1(s sVar) {
        this.f31795q.remove(sVar);
        if (this.f31797r == sVar) {
            this.f31797r = null;
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f31793p.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f31793p.get(i10)).i(canvas, this, this.f31754H0);
        }
        EdgeEffect edgeEffect = this.f31786l0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f31781h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f31786l0;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f31788m0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f31781h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f31788m0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f31790n0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f31781h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f31790n0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f31792o0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f31781h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f31792o0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f31794p0 == null || this.f31793p.size() <= 0 || !this.f31794p0.p()) ? z10 : true) {
            AbstractC2747a0.b0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    int e0(E e10) {
        if (e10.q(524) || !e10.t()) {
            return -1;
        }
        return this.f31778e.e(e10.f31842c);
    }

    public void e1(t tVar) {
        List list = this.f31757J0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    long f0(E e10) {
        return this.f31787m.i() ? e10.l() : e10.f31842c;
    }

    void f1() {
        E e10;
        int iG = this.f31779f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f31779f.f(i10);
            E eH0 = h0(viewF);
            if (eH0 != null && (e10 = eH0.f31848i) != null) {
                View view = e10.f31840a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewN0;
        boolean z10;
        View viewU0 = this.f31789n.U0(view, i10);
        if (viewU0 != null) {
            return viewU0;
        }
        boolean z11 = (this.f31787m == null || this.f31789n == null || x0() || this.f31811y) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f31789n.q()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f31734g1) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f31789n.p()) {
                int i12 = (this.f31789n.d0() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (f31734g1) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                x();
                if (U(view) == null) {
                    return null;
                }
                x1();
                this.f31789n.N0(view, i10, this.f31776c, this.f31754H0);
                A1(false);
            }
            viewN0 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                x();
                if (U(view) == null) {
                    return null;
                }
                x1();
                viewN0 = this.f31789n.N0(view, i10, this.f31776c, this.f31754H0);
                A1(false);
            } else {
                viewN0 = viewFindNextFocus;
            }
        }
        if (viewN0 == null || viewN0.hasFocusable()) {
            return y0(view, viewN0, i10) ? viewN0 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        g1(viewN0, null);
        return view;
    }

    public int g0(View view) {
        E eI0 = i0(view);
        if (eI0 != null) {
            return eI0.n();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f31789n;
        if (pVar != null) {
            return pVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + S());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f31789n;
        if (pVar != null) {
            return pVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + S());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f31787m;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.f31789n;
        return pVar != null ? pVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f31781h;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.f31762O0;
    }

    public l getEdgeEffectFactory() {
        return this.f31755I;
    }

    public m getItemAnimator() {
        return this.f31794p0;
    }

    public int getItemDecorationCount() {
        return this.f31793p.size();
    }

    public p getLayoutManager() {
        return this.f31789n;
    }

    public int getMaxFlingVelocity() {
        return this.f31740A0;
    }

    public int getMinFlingVelocity() {
        return this.f31814z0;
    }

    long getNanoTime() {
        if (f31733f1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.f31812y0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f31746D0;
    }

    public u getRecycledViewPool() {
        return this.f31776c.i();
    }

    public int getScrollState() {
        return this.f31796q0;
    }

    public void h(o oVar) {
        i(oVar, -1);
    }

    public E h0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return i0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(o oVar, int i10) {
        p pVar = this.f31789n;
        if (pVar != null) {
            pVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f31793p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f31793p.add(oVar);
        } else {
            this.f31793p.add(i10, oVar);
        }
        A0();
        requestLayout();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f31799s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f31811y;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(s sVar) {
        this.f31795q.add(sVar);
    }

    public void k(t tVar) {
        if (this.f31757J0 == null) {
            this.f31757J0 = new ArrayList();
        }
        this.f31757J0.add(tVar);
    }

    void k1() {
        int iJ = this.f31779f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            E eI0 = i0(this.f31779f.i(i10));
            if (!eI0.K()) {
                eI0.F();
            }
        }
    }

    void l(E e10, m.b bVar, m.b bVar2) {
        e10.H(false);
        if (this.f31794p0.a(e10, bVar, bVar2)) {
            Q0();
        }
    }

    boolean l1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        x();
        if (this.f31787m != null) {
            int[] iArr = this.f31767T0;
            iArr[0] = 0;
            iArr[1] = 0;
            m1(i10, i11, iArr);
            int[] iArr2 = this.f31767T0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f31793p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f31767T0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        J(i13, i14, i15, i16, this.f31765R0, i12, iArr3);
        int[] iArr4 = this.f31767T0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.f31806v0;
        int[] iArr5 = this.f31765R0;
        int i24 = iArr5[0];
        this.f31806v0 = i23 - i24;
        int i25 = this.f31808w0;
        int i26 = iArr5[1];
        this.f31808w0 = i25 - i26;
        int[] iArr6 = this.f31766S0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.C.a(motionEvent, 8194)) {
                U0(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            t(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            L(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    Rect m0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f31909c) {
            return qVar.f31908b;
        }
        if (this.f31754H0.e() && (qVar.b() || qVar.d())) {
            return qVar.f31908b;
        }
        Rect rect = qVar.f31908b;
        rect.set(0, 0, 0, 0);
        int size = this.f31793p.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f31783j.set(0, 0, 0, 0);
            ((o) this.f31793p.get(i10)).e(this.f31783j, view, this, this.f31754H0);
            int i11 = rect.left;
            Rect rect2 = this.f31783j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f31909c = false;
        return rect;
    }

    void m1(int i10, int i11, int[] iArr) {
        x1();
        K0();
        G1.n.a("RV Scroll");
        T(this.f31754H0);
        int iA1 = i10 != 0 ? this.f31789n.A1(i10, this.f31776c, this.f31754H0) : 0;
        int iC1 = i11 != 0 ? this.f31789n.C1(i11, this.f31776c, this.f31754H0) : 0;
        G1.n.b();
        f1();
        L0();
        A1(false);
        if (iArr != null) {
            iArr[0] = iA1;
            iArr[1] = iC1;
        }
    }

    void n(E e10, m.b bVar, m.b bVar2) {
        g(e10);
        e10.H(false);
        if (this.f31794p0.c(e10, bVar, bVar2)) {
            Q0();
        }
    }

    public void n1(int i10) {
        if (this.f31811y) {
            return;
        }
        C1();
        p pVar = this.f31789n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.B1(i10);
            awakenScrollBars();
        }
    }

    void o(String str) {
        if (x0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + S());
        }
        if (this.f31753H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + S()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f31751G = r0
            r1 = 1
            r5.f31799s = r1
            boolean r2 = r5.f31805v
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f31805v = r1
            androidx.recyclerview.widget.RecyclerView$v r1 = r5.f31776c
            r1.z()
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.f31789n
            if (r1 == 0) goto L23
            r1.E(r5)
        L23:
            r5.f31761N0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f31733f1
            if (r0 == 0) goto L66
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f32103e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f31750F0 = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f31750F0 = r1
            android.view.Display r1 = androidx.core.view.AbstractC2747a0.s(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.e r2 = r5.f31750F0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f32107c = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.e r0 = r5.f31750F0
            r0.a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        m mVar = this.f31794p0;
        if (mVar != null) {
            mVar.k();
        }
        C1();
        this.f31799s = false;
        p pVar = this.f31789n;
        if (pVar != null) {
            pVar.F(this, this.f31776c);
        }
        this.f31768U0.clear();
        removeCallbacks(this.f31769V0);
        this.f31780g.j();
        this.f31776c.A();
        P1.a.c(this);
        if (!f31733f1 || (eVar = this.f31750F0) == null) {
            return;
        }
        eVar.j(this);
        this.f31750F0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f31793p.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f31793p.get(i10)).g(canvas, this, this.f31754H0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f31789n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f31811y
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f31789n
            boolean r0 = r0.q()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f31789n
            boolean r3 = r3.p()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f31789n
            boolean r3 = r3.q()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f31789n
            boolean r3 = r3.p()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.f31742B0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f31744C0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.C0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f31811y) {
            return false;
        }
        this.f31797r = null;
        if (W(motionEvent)) {
            q();
            return true;
        }
        p pVar = this.f31789n;
        if (pVar == null) {
            return false;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f31789n.q();
        if (this.f31800s0 == null) {
            this.f31800s0 = VelocityTracker.obtain();
        }
        this.f31800s0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f31813z) {
                this.f31813z = false;
            }
            this.f31798r0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f31806v0 = x10;
            this.f31802t0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f31808w0 = y10;
            this.f31804u0 = y10;
            if (z1(motionEvent) || this.f31796q0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                B1(1);
            }
            int[] iArr = this.f31766S0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zP;
            if (zQ) {
                i10 = (zP ? 1 : 0) | 2;
            }
            y1(i10, 0);
        } else if (actionMasked == 1) {
            this.f31800s0.clear();
            B1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f31798r0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f31798r0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f31796q0 != 1) {
                int i11 = x11 - this.f31802t0;
                int i12 = y11 - this.f31804u0;
                if (!zP || Math.abs(i11) <= this.f31810x0) {
                    z10 = false;
                } else {
                    this.f31806v0 = x11;
                    z10 = true;
                }
                if (zQ && Math.abs(i12) > this.f31810x0) {
                    this.f31808w0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.f31798r0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f31806v0 = x12;
            this.f31802t0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f31808w0 = y12;
            this.f31804u0 = y12;
        } else if (actionMasked == 6) {
            N0(motionEvent);
        }
        return this.f31796q0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        G1.n.a("RV OnLayout");
        E();
        G1.n.b();
        this.f31805v = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        p pVar = this.f31789n;
        if (pVar == null) {
            z(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.w0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f31789n.d1(this.f31776c, this.f31754H0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f31770W0 = z10;
            if (z10 || this.f31787m == null) {
                return;
            }
            if (this.f31754H0.f31819e == 1) {
                F();
            }
            this.f31789n.E1(i10, i11);
            this.f31754H0.f31824j = true;
            G();
            this.f31789n.H1(i10, i11);
            if (this.f31789n.K1()) {
                this.f31789n.E1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f31754H0.f31824j = true;
                G();
                this.f31789n.H1(i10, i11);
            }
            this.f31771X0 = getMeasuredWidth();
            this.f31772Y0 = getMeasuredHeight();
            return;
        }
        if (this.f31801t) {
            this.f31789n.d1(this.f31776c, this.f31754H0, i10, i11);
            return;
        }
        if (this.f31741B) {
            x1();
            K0();
            S0();
            L0();
            A a10 = this.f31754H0;
            if (a10.f31826l) {
                a10.f31822h = true;
            } else {
                this.f31778e.j();
                this.f31754H0.f31822h = false;
            }
            this.f31741B = false;
            A1(false);
        } else if (this.f31754H0.f31826l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f31787m;
        if (hVar != null) {
            this.f31754H0.f31820f = hVar.e();
        } else {
            this.f31754H0.f31820f = 0;
        }
        x1();
        this.f31789n.d1(this.f31776c, this.f31754H0, i10, i11);
        A1(false);
        this.f31754H0.f31822h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (x0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.f31777d = yVar;
        super.onRestoreInstanceState(yVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.f31777d;
        if (yVar2 != null) {
            yVar.b(yVar2);
            return yVar;
        }
        p pVar = this.f31789n;
        if (pVar != null) {
            yVar.f31927c = pVar.h1();
            return yVar;
        }
        yVar.f31927c = null;
        return yVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        v0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00df A[PHI: r1
  0x00df: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:147:0x00c8, B:151:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    boolean p(E e10) {
        m mVar = this.f31794p0;
        return mVar == null || mVar.g(e10, e10.p());
    }

    public boolean p0() {
        return !this.f31805v || this.f31747E || this.f31778e.p();
    }

    boolean p1(E e10, int i10) {
        if (!x0()) {
            AbstractC2747a0.s0(e10.f31840a, i10);
            return true;
        }
        e10.f31856q = i10;
        this.f31768U0.add(e10);
        return false;
    }

    void r0() {
        this.f31778e = new a(new f());
    }

    boolean r1(AccessibilityEvent accessibilityEvent) {
        if (!x0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? AbstractC1865b.a(accessibilityEvent) : 0;
        this.f31739A |= iA != 0 ? iA : 0;
        return true;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        E eI0 = i0(view);
        if (eI0 != null) {
            if (eI0.y()) {
                eI0.f();
            } else if (!eI0.K()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + eI0 + S());
            }
        }
        view.clearAnimation();
        C(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f31789n.f1(this, this.f31754H0, view, view2) && view2 != null) {
            g1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f31789n.v1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f31795q.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) this.f31795q.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f31807w != 0 || this.f31811y) {
            this.f31809x = true;
        } else {
            super.requestLayout();
        }
    }

    void s() {
        int iJ = this.f31779f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            E eI0 = i0(this.f31779f.i(i10));
            if (!eI0.K()) {
                eI0.c();
            }
        }
        this.f31776c.d();
    }

    public void s1(int i10, int i11) {
        t1(i10, i11, null);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.f31789n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f31811y) {
            return;
        }
        boolean zP = pVar.p();
        boolean zQ = this.f31789n.q();
        if (zP || zQ) {
            if (!zP) {
                i10 = 0;
            }
            if (!zQ) {
                i11 = 0;
            }
            l1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (r1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.f31762O0 = kVar;
        AbstractC2747a0.k0(this, kVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        o1(hVar, false, true);
        T0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f31781h) {
            v0();
        }
        this.f31781h = z10;
        super.setClipToPadding(z10);
        if (this.f31805v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        K1.f.g(lVar);
        this.f31755I = lVar;
        v0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f31801t = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.f31794p0;
        if (mVar2 != null) {
            mVar2.k();
            this.f31794p0.v(null);
        }
        this.f31794p0 = mVar;
        if (mVar != null) {
            mVar.v(this.f31760M0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f31776c.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.f31789n) {
            return;
        }
        C1();
        if (this.f31789n != null) {
            m mVar = this.f31794p0;
            if (mVar != null) {
                mVar.k();
            }
            this.f31789n.o1(this.f31776c);
            this.f31789n.p1(this.f31776c);
            this.f31776c.c();
            if (this.f31799s) {
                this.f31789n.F(this, this.f31776c);
            }
            this.f31789n.I1(null);
            this.f31789n = null;
        } else {
            this.f31776c.c();
        }
        this.f31779f.o();
        this.f31789n = pVar;
        if (pVar != null) {
            if (pVar.f31884b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f31884b.S());
            }
            pVar.I1(this);
            if (this.f31799s) {
                this.f31789n.E(this);
            }
        }
        this.f31776c.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(r rVar) {
        this.f31812y0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.f31756I0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f31746D0 = z10;
    }

    public void setRecycledViewPool(u uVar) {
        this.f31776c.J(uVar);
    }

    void setScrollState(int i10) {
        if (i10 == this.f31796q0) {
            return;
        }
        this.f31796q0 = i10;
        if (i10 != 2) {
            D1();
        }
        K(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f31810x0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f31810x0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C c10) {
        this.f31776c.K(c10);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f31811y) {
            o("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f31811y = true;
                this.f31813z = true;
                C1();
                return;
            }
            this.f31811y = false;
            if (this.f31809x && this.f31789n != null && this.f31787m != null) {
                requestLayout();
            }
            this.f31809x = false;
        }
    }

    void t(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f31786l0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f31786l0.onRelease();
            zIsFinished = this.f31786l0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f31790n0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f31790n0.onRelease();
            zIsFinished |= this.f31790n0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f31788m0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f31788m0.onRelease();
            zIsFinished |= this.f31788m0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f31792o0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f31792o0.onRelease();
            zIsFinished |= this.f31792o0.isFinished();
        }
        if (zIsFinished) {
            AbstractC2747a0.b0(this);
        }
    }

    public void t1(int i10, int i11, Interpolator interpolator) {
        u1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    int u(int i10) {
        return v(i10, this.f31786l0, this.f31790n0, getWidth());
    }

    void u0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(L3.b.f11250a), resources.getDimensionPixelSize(L3.b.f11252c), resources.getDimensionPixelOffset(L3.b.f11251b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + S());
        }
    }

    public void u1(int i10, int i11, Interpolator interpolator, int i12) {
        v1(i10, i11, interpolator, i12, false);
    }

    void v0() {
        this.f31792o0 = null;
        this.f31788m0 = null;
        this.f31790n0 = null;
        this.f31786l0 = null;
    }

    void v1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.f31789n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f31811y) {
            return;
        }
        if (!pVar.p()) {
            i10 = 0;
        }
        if (!this.f31789n.q()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            y1(i13, 1);
        }
        this.f31748E0.e(i10, i11, i12, interpolator);
    }

    int w(int i10) {
        return v(i10, this.f31788m0, this.f31792o0, getHeight());
    }

    boolean w0() {
        AccessibilityManager accessibilityManager = this.f31743C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void w1(int i10) {
        if (this.f31811y) {
            return;
        }
        p pVar = this.f31789n;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.M1(this, this.f31754H0, i10);
        }
    }

    void x() {
        if (!this.f31805v || this.f31747E) {
            G1.n.a("RV FullInvalidate");
            E();
            G1.n.b();
            return;
        }
        if (this.f31778e.p()) {
            if (!this.f31778e.o(4) || this.f31778e.o(11)) {
                if (this.f31778e.p()) {
                    G1.n.a("RV FullInvalidate");
                    E();
                    G1.n.b();
                    return;
                }
                return;
            }
            G1.n.a("RV PartialInvalidate");
            x1();
            K0();
            this.f31778e.s();
            if (!this.f31809x) {
                if (q0()) {
                    E();
                } else {
                    this.f31778e.i();
                }
            }
            A1(true);
            L0();
            G1.n.b();
        }
    }

    public boolean x0() {
        return this.f31751G > 0;
    }

    void x1() {
        int i10 = this.f31807w + 1;
        this.f31807w = i10;
        if (i10 != 1 || this.f31811y) {
            return;
        }
        this.f31809x = false;
    }

    public boolean y1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    void z(int i10, int i11) {
        setMeasuredDimension(p.s(i10, getPaddingLeft() + getPaddingRight(), AbstractC2747a0.A(this)), p.s(i11, getPaddingTop() + getPaddingBottom(), AbstractC2747a0.z(this)));
    }

    void z0(int i10) {
        if (this.f31789n == null) {
            return;
        }
        setScrollState(2);
        this.f31789n.B1(i10);
        awakenScrollBars();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f31775b = new x();
        this.f31776c = new v();
        this.f31780g = new androidx.recyclerview.widget.p();
        this.f31782i = new RunnableC2931a();
        this.f31783j = new Rect();
        this.f31784k = new Rect();
        this.f31785l = new RectF();
        this.f31791o = new ArrayList();
        this.f31793p = new ArrayList();
        this.f31795q = new ArrayList();
        this.f31807w = 0;
        this.f31747E = false;
        this.f31749F = false;
        this.f31751G = 0;
        this.f31753H = 0;
        this.f31755I = f31738k1;
        this.f31794p0 = new c();
        this.f31796q0 = 0;
        this.f31798r0 = -1;
        this.f31742B0 = Float.MIN_VALUE;
        this.f31744C0 = Float.MIN_VALUE;
        this.f31746D0 = true;
        this.f31748E0 = new D();
        this.f31752G0 = f31733f1 ? new e.b() : null;
        this.f31754H0 = new A();
        this.f31758K0 = false;
        this.f31759L0 = false;
        this.f31760M0 = new n();
        this.f31761N0 = false;
        this.f31763P0 = new int[2];
        this.f31765R0 = new int[2];
        this.f31766S0 = new int[2];
        this.f31767T0 = new int[2];
        this.f31768U0 = new ArrayList();
        this.f31769V0 = new RunnableC2932b();
        this.f31771X0 = 0;
        this.f31772Y0 = 0;
        this.f31773Z0 = new C2934d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f31810x0 = viewConfiguration.getScaledTouchSlop();
        this.f31742B0 = AbstractC2753d0.f(viewConfiguration, context);
        this.f31744C0 = AbstractC2753d0.j(viewConfiguration, context);
        this.f31814z0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f31740A0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f31774a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f31794p0.v(this.f31760M0);
        r0();
        t0();
        s0();
        if (AbstractC2747a0.w(this) == 0) {
            AbstractC2747a0.s0(this, 1);
        }
        this.f31743C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L3.c.f11253a, i10, 0);
        AbstractC2747a0.i0(this, context, L3.c.f11253a, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(L3.c.f11262j);
        if (typedArrayObtainStyledAttributes.getInt(L3.c.f11256d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f31781h = typedArrayObtainStyledAttributes.getBoolean(L3.c.f11255c, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(L3.c.f11257e, false);
        this.f31803u = z10;
        if (z10) {
            u0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(L3.c.f11260h), typedArrayObtainStyledAttributes.getDrawable(L3.c.f11261i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(L3.c.f11258f), typedArrayObtainStyledAttributes.getDrawable(L3.c.f11259g));
        }
        typedArrayObtainStyledAttributes.recycle();
        y(context, string, attributeSet, i10, 0);
        int[] iArr = f31728a1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        AbstractC2747a0.i0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        P1.a.h(this, true);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class y extends Q1.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        Parcelable f31927c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public y createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b */
            public y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c */
            public y[] newArray(int i10) {
                return new y[i10];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f31927c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(y yVar) {
            this.f31927c = yVar.f31927c;
        }

        @Override // Q1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f31927c, 0);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class q extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        E f31907a;

        /* JADX INFO: renamed from: b */
        final Rect f31908b;

        /* JADX INFO: renamed from: c */
        boolean f31909c;

        /* JADX INFO: renamed from: d */
        boolean f31910d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31908b = new Rect();
            this.f31909c = true;
            this.f31910d = false;
        }

        public int a() {
            return this.f31907a.n();
        }

        public boolean b() {
            return this.f31907a.z();
        }

        public boolean c() {
            return this.f31907a.w();
        }

        public boolean d() {
            return this.f31907a.u();
        }

        public q(int i10, int i11) {
            super(i10, i11);
            this.f31908b = new Rect();
            this.f31909c = true;
            this.f31910d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f31908b = new Rect();
            this.f31909c = true;
            this.f31910d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f31908b = new Rect();
            this.f31909c = true;
            this.f31910d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f31908b = new Rect();
            this.f31909c = true;
            this.f31910d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f31789n;
        if (pVar != null) {
            return pVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + S());
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class h {

        /* JADX INFO: renamed from: a */
        private final i f31865a = new i();

        /* JADX INFO: renamed from: b */
        private boolean f31866b = false;

        /* JADX INFO: renamed from: c */
        private a f31867c = a.ALLOW;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void a(E e10, int i10) {
            boolean z10 = e10.f31858s == null;
            if (z10) {
                e10.f31842c = i10;
                if (i()) {
                    e10.f31844e = f(i10);
                }
                e10.G(1, 519);
                G1.n.a("RV OnBindView");
            }
            e10.f31858s = this;
            l(e10, i10, e10.p());
            if (z10) {
                e10.d();
                ViewGroup.LayoutParams layoutParams = e10.f31840a.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f31909c = true;
                }
                G1.n.b();
            }
        }

        boolean b() {
            int i10 = g.f31864a[this.f31867c.ordinal()];
            return i10 != 1 && (i10 != 2 || e() > 0);
        }

        public final E c(ViewGroup viewGroup, int i10) {
            try {
                G1.n.a("RV CreateView");
                E eM = m(viewGroup, i10);
                if (eM.f31840a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                eM.f31845f = i10;
                return eM;
            } finally {
                G1.n.b();
            }
        }

        public int d(h hVar, E e10, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int e();

        public long f(int i10) {
            return -1L;
        }

        public int g(int i10) {
            return 0;
        }

        public final boolean h() {
            return this.f31865a.a();
        }

        public final boolean i() {
            return this.f31866b;
        }

        public abstract void k(E e10, int i10);

        public void l(E e10, int i10, List list) {
            k(e10, i10);
        }

        public abstract E m(ViewGroup viewGroup, int i10);

        public boolean o(E e10) {
            return false;
        }

        public void s(j jVar) {
            this.f31865a.registerObserver(jVar);
        }

        public void t(boolean z10) {
            if (h()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f31866b = z10;
        }

        public void u(j jVar) {
            this.f31865a.unregisterObserver(jVar);
        }

        public void j(RecyclerView recyclerView) {
        }

        public void n(RecyclerView recyclerView) {
        }

        public void p(E e10) {
        }

        public void q(E e10) {
        }

        public void r(E e10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class m {

        /* JADX INFO: renamed from: a */
        private a f31872a = null;

        /* JADX INFO: renamed from: b */
        private ArrayList f31873b = new ArrayList();

        /* JADX INFO: renamed from: c */
        private long f31874c = 120;

        /* JADX INFO: renamed from: d */
        private long f31875d = 120;

        /* JADX INFO: renamed from: e */
        private long f31876e = 250;

        /* JADX INFO: renamed from: f */
        private long f31877f = 250;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        interface a {
            void a(E e10);
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class b {

            /* JADX INFO: renamed from: a */
            public int f31878a;

            /* JADX INFO: renamed from: b */
            public int f31879b;

            /* JADX INFO: renamed from: c */
            public int f31880c;

            /* JADX INFO: renamed from: d */
            public int f31881d;

            public b a(E e10) {
                return b(e10, 0);
            }

            public b b(E e10, int i10) {
                View view = e10.f31840a;
                this.f31878a = view.getLeft();
                this.f31879b = view.getTop();
                this.f31880c = view.getRight();
                this.f31881d = view.getBottom();
                return this;
            }
        }

        static int e(E e10) {
            int i10 = e10.f31849j;
            int i11 = i10 & 14;
            if (e10.u()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int iO = e10.o();
                int iJ = e10.j();
                if (iO != -1 && iJ != -1 && iO != iJ) {
                    return i11 | 2048;
                }
            }
            return i11;
        }

        public abstract boolean a(E e10, b bVar, b bVar2);

        public abstract boolean b(E e10, E e11, b bVar, b bVar2);

        public abstract boolean c(E e10, b bVar, b bVar2);

        public abstract boolean d(E e10, b bVar, b bVar2);

        public abstract boolean f(E e10);

        public boolean g(E e10, List list) {
            return f(e10);
        }

        public final void h(E e10) {
            r(e10);
            a aVar = this.f31872a;
            if (aVar != null) {
                aVar.a(e10);
            }
        }

        public final void i() {
            if (this.f31873b.size() <= 0) {
                this.f31873b.clear();
            } else {
                android.support.v4.media.session.b.a(this.f31873b.get(0));
                throw null;
            }
        }

        public abstract void j(E e10);

        public abstract void k();

        public long l() {
            return this.f31874c;
        }

        public long m() {
            return this.f31877f;
        }

        public long n() {
            return this.f31876e;
        }

        public long o() {
            return this.f31875d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public b s(A a10, E e10) {
            return q().a(e10);
        }

        public b t(A a10, E e10, int i10, List list) {
            return q().a(e10);
        }

        public abstract void u();

        void v(a aVar) {
            this.f31872a = aVar;
        }

        public void r(E e10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class p {

        /* JADX INFO: renamed from: a */
        androidx.recyclerview.widget.b f31883a;

        /* JADX INFO: renamed from: b */
        RecyclerView f31884b;

        /* JADX INFO: renamed from: c */
        private final o.b f31885c;

        /* JADX INFO: renamed from: d */
        private final o.b f31886d;

        /* JADX INFO: renamed from: e */
        androidx.recyclerview.widget.o f31887e;

        /* JADX INFO: renamed from: f */
        androidx.recyclerview.widget.o f31888f;

        /* JADX INFO: renamed from: g */
        z f31889g;

        /* JADX INFO: renamed from: h */
        boolean f31890h;

        /* JADX INFO: renamed from: i */
        boolean f31891i;

        /* JADX INFO: renamed from: j */
        boolean f31892j;

        /* JADX INFO: renamed from: k */
        private boolean f31893k;

        /* JADX INFO: renamed from: l */
        private boolean f31894l;

        /* JADX INFO: renamed from: m */
        int f31895m;

        /* JADX INFO: renamed from: n */
        boolean f31896n;

        /* JADX INFO: renamed from: o */
        private int f31897o;

        /* JADX INFO: renamed from: p */
        private int f31898p;

        /* JADX INFO: renamed from: q */
        private int f31899q;

        /* JADX INFO: renamed from: r */
        private int f31900r;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements o.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public int a(View view) {
                return p.this.V(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return p.this.i0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.s0() - p.this.j0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return p.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public View getChildAt(int i10) {
                return p.this.N(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b implements o.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public int a(View view) {
                return p.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return p.this.k0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.b0() - p.this.h0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return p.this.T(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public View getChildAt(int i10) {
                return p.this.N(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public interface c {
            void a(int i10, int i11);
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class d {

            /* JADX INFO: renamed from: a */
            public int f31903a;

            /* JADX INFO: renamed from: b */
            public int f31904b;

            /* JADX INFO: renamed from: c */
            public boolean f31905c;

            /* JADX INFO: renamed from: d */
            public boolean f31906d;
        }

        public p() {
            a aVar = new a();
            this.f31885c = aVar;
            b bVar = new b();
            this.f31886d = bVar;
            this.f31887e = new androidx.recyclerview.widget.o(aVar);
            this.f31888f = new androidx.recyclerview.widget.o(bVar);
            this.f31890h = false;
            this.f31891i = false;
            this.f31892j = false;
            this.f31893k = true;
            this.f31894l = true;
        }

        private static boolean A0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void D(int i10, View view) {
            this.f31883a.d(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int P(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.P(int, int, int, int, boolean):int");
        }

        private int[] Q(View view, Rect rect) {
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iI0;
            int iMin = Math.min(0, i10);
            int i11 = top - iK0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iS0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iB0);
            if (d0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void k(View view, int i10, boolean z10) {
            E eI0 = RecyclerView.i0(view);
            if (z10 || eI0.w()) {
                this.f31884b.f31780g.b(eI0);
            } else {
                this.f31884b.f31780g.p(eI0);
            }
            q qVar = (q) view.getLayoutParams();
            if (eI0.M() || eI0.x()) {
                if (eI0.x()) {
                    eI0.L();
                } else {
                    eI0.e();
                }
                this.f31883a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f31884b) {
                int iM = this.f31883a.m(view);
                if (i10 == -1) {
                    i10 = this.f31883a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f31884b.indexOfChild(view) + this.f31884b.S());
                }
                if (iM != i10) {
                    this.f31884b.f31789n.F0(iM, i10);
                }
            } else {
                this.f31883a.a(view, i10, false);
                qVar.f31909c = true;
                z zVar = this.f31889g;
                if (zVar != null && zVar.h()) {
                    this.f31889g.k(view);
                }
            }
            if (qVar.f31910d) {
                eI0.f31840a.invalidate();
                qVar.f31910d = false;
            }
        }

        public static d m0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L3.c.f11253a, i10, i11);
            dVar.f31903a = typedArrayObtainStyledAttributes.getInt(L3.c.f11254b, 1);
            dVar.f31904b = typedArrayObtainStyledAttributes.getInt(L3.c.f11264l, 1);
            dVar.f31905c = typedArrayObtainStyledAttributes.getBoolean(L3.c.f11263k, false);
            dVar.f31906d = typedArrayObtainStyledAttributes.getBoolean(L3.c.f11265m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private boolean x0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            Rect rect = this.f31884b.f31783j;
            U(focusedChild, rect);
            return rect.left - i10 < iS0 && rect.right - i10 > iI0 && rect.top - i11 < iB0 && rect.bottom - i11 > iK0;
        }

        private void z1(v vVar, int i10, View view) {
            E eI0 = RecyclerView.i0(view);
            if (eI0.K()) {
                return;
            }
            if (eI0.u() && !eI0.w() && !this.f31884b.f31787m.i()) {
                u1(i10);
                vVar.H(eI0);
            } else {
                C(i10);
                vVar.I(view);
                this.f31884b.f31780g.k(eI0);
            }
        }

        public abstract int A(A a10);

        public abstract int A1(int i10, v vVar, A a10);

        public void B(v vVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                z1(vVar, iO, N(iO));
            }
        }

        public boolean B0() {
            z zVar = this.f31889g;
            return zVar != null && zVar.h();
        }

        public abstract void B1(int i10);

        public void C(int i10) {
            D(i10, N(i10));
        }

        public boolean C0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f31887e.b(view, 24579) && this.f31888f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public abstract int C1(int i10, v vVar, A a10);

        public void D0(View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f31908b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        void D1(RecyclerView recyclerView) {
            E1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void E(RecyclerView recyclerView) {
            this.f31891i = true;
            K0(recyclerView);
        }

        public void E0(View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect rectM0 = this.f31884b.m0(view);
            int i12 = i10 + rectM0.left + rectM0.right;
            int i13 = i11 + rectM0.top + rectM0.bottom;
            int iP = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) qVar).width, p());
            int iP2 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, q());
            if (J1(view, iP, iP2, qVar)) {
                view.measure(iP, iP2);
            }
        }

        void E1(int i10, int i11) {
            this.f31899q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f31897o = mode;
            if (mode == 0 && !RecyclerView.f31731d1) {
                this.f31899q = 0;
            }
            this.f31900r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f31898p = mode2;
            if (mode2 != 0 || RecyclerView.f31731d1) {
                return;
            }
            this.f31900r = 0;
        }

        void F(RecyclerView recyclerView, v vVar) {
            this.f31891i = false;
            M0(recyclerView, vVar);
        }

        public void F0(int i10, int i11) {
            View viewN = N(i10);
            if (viewN != null) {
                C(i10);
                m(viewN, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f31884b.toString());
            }
        }

        public void F1(int i10, int i11) {
            this.f31884b.setMeasuredDimension(i10, i11);
        }

        public View G(View view) {
            View viewU;
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView == null || (viewU = recyclerView.U(view)) == null || this.f31883a.n(viewU)) {
                return null;
            }
            return viewU;
        }

        public void G0(int i10) {
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView != null) {
                recyclerView.D0(i10);
            }
        }

        public void G1(Rect rect, int i10, int i11) {
            F1(s(i10, rect.width() + i0() + j0(), g0()), s(i11, rect.height() + k0() + h0(), f0()));
        }

        public View H(int i10) {
            int iO = O();
            for (int i11 = 0; i11 < iO; i11++) {
                View viewN = N(i11);
                E eI0 = RecyclerView.i0(viewN);
                if (eI0 != null && eI0.n() == i10 && !eI0.K() && (this.f31884b.f31754H0.e() || !eI0.w())) {
                    return viewN;
                }
            }
            return null;
        }

        public void H0(int i10) {
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView != null) {
                recyclerView.E0(i10);
            }
        }

        void H1(int i10, int i11) {
            int iO = O();
            if (iO == 0) {
                this.f31884b.z(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iO; i16++) {
                View viewN = N(i16);
                Rect rect = this.f31884b.f31783j;
                U(viewN, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f31884b.f31783j.set(i15, i13, i12, i14);
            G1(this.f31884b.f31783j, i10, i11);
        }

        public abstract q I();

        void I1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f31884b = null;
                this.f31883a = null;
                this.f31899q = 0;
                this.f31900r = 0;
            } else {
                this.f31884b = recyclerView;
                this.f31883a = recyclerView.f31779f;
                this.f31899q = recyclerView.getWidth();
                this.f31900r = recyclerView.getHeight();
            }
            this.f31897o = 1073741824;
            this.f31898p = 1073741824;
        }

        public q J(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public boolean J0(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
            return false;
        }

        boolean J1(View view, int i10, int i11, q qVar) {
            return (!view.isLayoutRequested() && this.f31893k && A0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public q K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        boolean K1() {
            return false;
        }

        public int L() {
            return -1;
        }

        boolean L1(View view, int i10, int i11, q qVar) {
            return (this.f31893k && A0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && A0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int M(View view) {
            return ((q) view.getLayoutParams()).f31908b.bottom;
        }

        public void M0(RecyclerView recyclerView, v vVar) {
            L0(recyclerView);
        }

        public abstract void M1(RecyclerView recyclerView, A a10, int i10);

        public View N(int i10) {
            androidx.recyclerview.widget.b bVar = this.f31883a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public abstract View N0(View view, int i10, v vVar, A a10);

        public void N1(z zVar) {
            z zVar2 = this.f31889g;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.f31889g.r();
            }
            this.f31889g = zVar;
            zVar.q(this.f31884b, this);
        }

        public int O() {
            androidx.recyclerview.widget.b bVar = this.f31883a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void O0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f31884b;
            P0(recyclerView.f31776c, recyclerView.f31754H0, accessibilityEvent);
        }

        void O1() {
            z zVar = this.f31889g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public void P0(v vVar, A a10, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f31884b.canScrollVertically(-1) && !this.f31884b.canScrollHorizontally(-1) && !this.f31884b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f31884b.f31787m;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.e());
            }
        }

        public boolean P1() {
            return false;
        }

        void Q0(L1.B b10) {
            RecyclerView recyclerView = this.f31884b;
            R0(recyclerView.f31776c, recyclerView.f31754H0, b10);
        }

        public boolean R() {
            RecyclerView recyclerView = this.f31884b;
            return recyclerView != null && recyclerView.f31781h;
        }

        public void R0(v vVar, A a10, L1.B b10) {
            if (this.f31884b.canScrollVertically(-1) || this.f31884b.canScrollHorizontally(-1)) {
                b10.a(8192);
                b10.c1(true);
            }
            if (this.f31884b.canScrollVertically(1) || this.f31884b.canScrollHorizontally(1)) {
                b10.a(4096);
                b10.c1(true);
            }
            b10.B0(B.f.b(o0(vVar, a10), S(vVar, a10), z0(vVar, a10), p0(vVar, a10)));
        }

        public int S(v vVar, A a10) {
            return -1;
        }

        void S0(View view, L1.B b10) {
            E eI0 = RecyclerView.i0(view);
            if (eI0 == null || eI0.w() || this.f31883a.n(eI0.f31840a)) {
                return;
            }
            RecyclerView recyclerView = this.f31884b;
            T0(recyclerView.f31776c, recyclerView.f31754H0, view, b10);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        public void U(View view, Rect rect) {
            RecyclerView.j0(view, rect);
        }

        public View U0(View view, int i10) {
            return null;
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public int W(View view) {
            Rect rect = ((q) view.getLayoutParams()).f31908b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int X(View view) {
            Rect rect = ((q) view.getLayoutParams()).f31908b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int Y(View view) {
            return view.getRight() + n0(view);
        }

        public int Z(View view) {
            return view.getTop() - q0(view);
        }

        public int a() {
            RecyclerView recyclerView = this.f31884b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.e();
            }
            return 0;
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f31883a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            Z0(recyclerView, i10, i11);
        }

        public int b0() {
            return this.f31900r;
        }

        public abstract void b1(v vVar, A a10);

        public int c0() {
            return this.f31898p;
        }

        public int d0() {
            return AbstractC2747a0.y(this.f31884b);
        }

        public void d1(v vVar, A a10, int i10, int i11) {
            this.f31884b.z(i10, i11);
        }

        public int e0(View view) {
            return ((q) view.getLayoutParams()).f31908b.left;
        }

        public boolean e1(RecyclerView recyclerView, View view, View view2) {
            return B0() || recyclerView.x0();
        }

        public int f0() {
            return AbstractC2747a0.z(this.f31884b);
        }

        public boolean f1(RecyclerView recyclerView, A a10, View view, View view2) {
            return e1(recyclerView, view, view2);
        }

        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return AbstractC2747a0.A(this.f31884b);
        }

        public void h(View view, int i10) {
            k(view, i10, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable h1() {
            return null;
        }

        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void j(View view, int i10) {
            k(view, i10, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void j1(z zVar) {
            if (this.f31889g == zVar) {
                this.f31889g = null;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean k1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f31884b;
            return l1(recyclerView.f31776c, recyclerView.f31754H0, i10, bundle);
        }

        public void l(String str) {
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int l0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public boolean l1(v vVar, A a10, int i10, Bundle bundle) {
            int iK0;
            int iI0;
            int i11;
            int i12;
            if (this.f31884b == null) {
                return false;
            }
            int iB0 = b0();
            int iS0 = s0();
            Rect rect = new Rect();
            if (this.f31884b.getMatrix().isIdentity() && this.f31884b.getGlobalVisibleRect(rect)) {
                iB0 = rect.height();
                iS0 = rect.width();
            }
            if (i10 == 4096) {
                iK0 = this.f31884b.canScrollVertically(1) ? (iB0 - k0()) - h0() : 0;
                if (this.f31884b.canScrollHorizontally(1)) {
                    iI0 = (iS0 - i0()) - j0();
                    i11 = iK0;
                    i12 = iI0;
                }
                i11 = iK0;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                iK0 = this.f31884b.canScrollVertically(-1) ? -((iB0 - k0()) - h0()) : 0;
                if (this.f31884b.canScrollHorizontally(-1)) {
                    iI0 = -((iS0 - i0()) - j0());
                    i11 = iK0;
                    i12 = iI0;
                }
                i11 = iK0;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f31884b.v1(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void m(View view, int i10) {
            n(view, i10, (q) view.getLayoutParams());
        }

        boolean m1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f31884b;
            return n1(recyclerView.f31776c, recyclerView.f31754H0, view, i10, bundle);
        }

        public void n(View view, int i10, q qVar) {
            E eI0 = RecyclerView.i0(view);
            if (eI0.w()) {
                this.f31884b.f31780g.b(eI0);
            } else {
                this.f31884b.f31780g.p(eI0);
            }
            this.f31883a.c(view, i10, qVar, eI0.w());
        }

        public int n0(View view) {
            return ((q) view.getLayoutParams()).f31908b.right;
        }

        public boolean n1(v vVar, A a10, View view, int i10, Bundle bundle) {
            return false;
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m0(view));
            }
        }

        public int o0(v vVar, A a10) {
            return -1;
        }

        public void o1(v vVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!RecyclerView.i0(N(iO)).K()) {
                    r1(iO, vVar);
                }
            }
        }

        public abstract boolean p();

        public int p0(v vVar, A a10) {
            return 0;
        }

        void p1(v vVar) {
            int iJ = vVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = vVar.n(i10);
                E eI0 = RecyclerView.i0(viewN);
                if (!eI0.K()) {
                    eI0.H(false);
                    if (eI0.y()) {
                        this.f31884b.removeDetachedView(viewN, false);
                    }
                    m mVar = this.f31884b.f31794p0;
                    if (mVar != null) {
                        mVar.j(eI0);
                    }
                    eI0.H(true);
                    vVar.D(viewN);
                }
            }
            vVar.e();
            if (iJ > 0) {
                this.f31884b.invalidate();
            }
        }

        public abstract boolean q();

        public int q0(View view) {
            return ((q) view.getLayoutParams()).f31908b.top;
        }

        public void q1(View view, v vVar) {
            t1(view);
            vVar.G(view);
        }

        public boolean r(q qVar) {
            return qVar != null;
        }

        public void r0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f31908b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f31884b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f31884b.f31785l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(int i10, v vVar) {
            View viewN = N(i10);
            u1(i10);
            vVar.G(viewN);
        }

        public int s0() {
            return this.f31899q;
        }

        public boolean s1(Runnable runnable) {
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int t0() {
            return this.f31897o;
        }

        public void t1(View view) {
            this.f31883a.p(view);
        }

        boolean u0() {
            int iO = O();
            for (int i10 = 0; i10 < iO; i10++) {
                ViewGroup.LayoutParams layoutParams = N(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void u1(int i10) {
            if (N(i10) != null) {
                this.f31883a.q(i10);
            }
        }

        public abstract int v(A a10);

        public boolean v0() {
            return this.f31891i;
        }

        public boolean v1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return w1(recyclerView, view, rect, z10, false);
        }

        public abstract int w(A a10);

        public abstract boolean w0();

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrQ = Q(view, rect);
            int i10 = iArrQ[0];
            int i11 = iArrQ[1];
            if ((z11 && !x0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.s1(i10, i11);
            }
            return true;
        }

        public abstract int x(A a10);

        public void x1() {
            RecyclerView recyclerView = this.f31884b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int y(A a10);

        public final boolean y0() {
            return this.f31894l;
        }

        public void y1() {
            this.f31890h = true;
        }

        public abstract int z(A a10);

        public boolean z0(v vVar, A a10) {
            return false;
        }

        public void K0(RecyclerView recyclerView) {
        }

        public void L0(RecyclerView recyclerView) {
        }

        public void W0(RecyclerView recyclerView) {
        }

        public void c1(A a10) {
        }

        public void g1(Parcelable parcelable) {
        }

        public void i1(int i10) {
        }

        public void I0(h hVar, h hVar2) {
        }

        public void u(int i10, c cVar) {
        }

        public void V0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void Y0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void Z0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void T0(v vVar, A a10, View view, L1.B b10) {
        }

        public void X0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void t(int i10, int i11, A a10, c cVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class v {

        /* JADX INFO: renamed from: a */
        final ArrayList f31918a;

        /* JADX INFO: renamed from: b */
        ArrayList f31919b;

        /* JADX INFO: renamed from: c */
        final ArrayList f31920c;

        /* JADX INFO: renamed from: d */
        private final List f31921d;

        /* JADX INFO: renamed from: e */
        private int f31922e;

        /* JADX INFO: renamed from: f */
        int f31923f;

        /* JADX INFO: renamed from: g */
        u f31924g;

        public v() {
            ArrayList arrayList = new ArrayList();
            this.f31918a = arrayList;
            this.f31919b = null;
            this.f31920c = new ArrayList();
            this.f31921d = Collections.unmodifiableList(arrayList);
            this.f31922e = 2;
            this.f31923f = 2;
        }

        private void B(h hVar) {
            C(hVar, false);
        }

        private void C(h hVar, boolean z10) {
            u uVar = this.f31924g;
            if (uVar != null) {
                uVar.e(hVar, z10);
            }
        }

        private boolean M(E e10, int i10, int i11, long j10) {
            e10.f31858s = null;
            e10.f31857r = RecyclerView.this;
            int iM = e10.m();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f31924g.m(iM, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.f31787m.a(e10, i10);
            this.f31924g.f(e10.m(), RecyclerView.this.getNanoTime() - nanoTime);
            b(e10);
            if (!RecyclerView.this.f31754H0.e()) {
                return true;
            }
            e10.f31846g = i11;
            return true;
        }

        private void b(E e10) {
            if (RecyclerView.this.w0()) {
                View view = e10.f31840a;
                if (AbstractC2747a0.w(view) == 0) {
                    AbstractC2747a0.s0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.f31762O0;
                if (kVar == null) {
                    return;
                }
                C2746a c2746aN = kVar.n();
                if (c2746aN instanceof k.a) {
                    ((k.a) c2746aN).o(view);
                }
                AbstractC2747a0.k0(view, c2746aN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(E e10) {
            View view = e10.f31840a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f31924g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f31787m == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f31924g.b(RecyclerView.this.f31787m);
            }
        }

        void A() {
            for (int i10 = 0; i10 < this.f31920c.size(); i10++) {
                P1.a.b(((E) this.f31920c.get(i10)).f31840a);
            }
            B(RecyclerView.this.f31787m);
        }

        void D(View view) {
            E eI0 = RecyclerView.i0(view);
            eI0.f31853n = null;
            eI0.f31854o = false;
            eI0.e();
            H(eI0);
        }

        void E() {
            for (int size = this.f31920c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f31920c.clear();
            if (RecyclerView.f31733f1) {
                RecyclerView.this.f31752G0.b();
            }
        }

        void F(int i10) {
            a((E) this.f31920c.get(i10), true);
            this.f31920c.remove(i10);
        }

        public void G(View view) {
            E eI0 = RecyclerView.i0(view);
            if (eI0.y()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (eI0.x()) {
                eI0.L();
            } else if (eI0.M()) {
                eI0.e();
            }
            H(eI0);
            if (RecyclerView.this.f31794p0 == null || eI0.v()) {
                return;
            }
            RecyclerView.this.f31794p0.j(eI0);
        }

        void H(E e10) {
            boolean z10;
            boolean z11 = true;
            if (e10.x() || e10.f31840a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(e10.x());
                sb2.append(" isAttached:");
                sb2.append(e10.f31840a.getParent() != null);
                sb2.append(RecyclerView.this.S());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (e10.y()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e10 + RecyclerView.this.S());
            }
            if (e10.K()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.S());
            }
            boolean zH = e10.h();
            h hVar = RecyclerView.this.f31787m;
            if ((hVar != null && zH && hVar.o(e10)) || e10.v()) {
                if (this.f31923f <= 0 || e10.q(526)) {
                    z10 = false;
                } else {
                    int size = this.f31920c.size();
                    if (size >= this.f31923f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.f31733f1 && size > 0 && !RecyclerView.this.f31752G0.d(e10.f31842c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f31752G0.d(((E) this.f31920c.get(i10)).f31842c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f31920c.add(size, e10);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(e10, true);
                }
                z = z10;
            } else {
                z11 = false;
            }
            RecyclerView.this.f31780g.q(e10);
            if (z || z11 || !zH) {
                return;
            }
            P1.a.b(e10.f31840a);
            e10.f31858s = null;
            e10.f31857r = null;
        }

        void I(View view) {
            E eI0 = RecyclerView.i0(view);
            if (!eI0.q(12) && eI0.z() && !RecyclerView.this.p(eI0)) {
                if (this.f31919b == null) {
                    this.f31919b = new ArrayList();
                }
                eI0.I(this, true);
                this.f31919b.add(eI0);
                return;
            }
            if (!eI0.u() || eI0.w() || RecyclerView.this.f31787m.i()) {
                eI0.I(this, false);
                this.f31918a.add(eI0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.S());
            }
        }

        void J(u uVar) {
            B(RecyclerView.this.f31787m);
            u uVar2 = this.f31924g;
            if (uVar2 != null) {
                uVar2.d();
            }
            this.f31924g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f31924g.a();
            }
            u();
        }

        public void L(int i10) {
            this.f31922e = i10;
            P();
        }

        /* JADX WARN: Removed duplicated region for block: B:116:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x01cb A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:191:0x01ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.E N(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instruction units count: 522
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$E");
        }

        void O(E e10) {
            if (e10.f31854o) {
                this.f31919b.remove(e10);
            } else {
                this.f31918a.remove(e10);
            }
            e10.f31853n = null;
            e10.f31854o = false;
            e10.e();
        }

        void P() {
            p pVar = RecyclerView.this.f31789n;
            this.f31923f = this.f31922e + (pVar != null ? pVar.f31895m : 0);
            for (int size = this.f31920c.size() - 1; size >= 0 && this.f31920c.size() > this.f31923f; size--) {
                F(size);
            }
        }

        boolean Q(E e10) {
            if (e10.w()) {
                return RecyclerView.this.f31754H0.e();
            }
            int i10 = e10.f31842c;
            if (i10 >= 0 && i10 < RecyclerView.this.f31787m.e()) {
                if (RecyclerView.this.f31754H0.e() || RecyclerView.this.f31787m.g(e10.f31842c) == e10.m()) {
                    return !RecyclerView.this.f31787m.i() || e10.l() == RecyclerView.this.f31787m.f(e10.f31842c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e10 + RecyclerView.this.S());
        }

        void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f31920c.size() - 1; size >= 0; size--) {
                E e10 = (E) this.f31920c.get(size);
                if (e10 != null && (i12 = e10.f31842c) >= i10 && i12 < i13) {
                    e10.b(2);
                    F(size);
                }
            }
        }

        void a(E e10, boolean z10) {
            RecyclerView.r(e10);
            View view = e10.f31840a;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.f31762O0;
            if (kVar != null) {
                C2746a c2746aN = kVar.n();
                AbstractC2747a0.k0(view, c2746aN instanceof k.a ? ((k.a) c2746aN).n(view) : null);
            }
            if (z10) {
                g(e10);
            }
            e10.f31858s = null;
            e10.f31857r = null;
            i().k(e10);
        }

        public void c() {
            this.f31918a.clear();
            E();
        }

        void d() {
            int size = this.f31920c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((E) this.f31920c.get(i10)).c();
            }
            int size2 = this.f31918a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((E) this.f31918a.get(i11)).c();
            }
            ArrayList arrayList = this.f31919b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((E) this.f31919b.get(i12)).c();
                }
            }
        }

        void e() {
            this.f31918a.clear();
            ArrayList arrayList = this.f31919b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f31754H0.b()) {
                return !RecyclerView.this.f31754H0.e() ? i10 : RecyclerView.this.f31778e.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f31754H0.b() + RecyclerView.this.S());
        }

        void g(E e10) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f31791o.size() > 0) {
                android.support.v4.media.session.b.a(RecyclerView.this.f31791o.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.f31787m;
            if (hVar != null) {
                hVar.r(e10);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f31754H0 != null) {
                recyclerView.f31780g.q(e10);
            }
        }

        E h(int i10) {
            int size;
            int iM;
            ArrayList arrayList = this.f31919b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    E e10 = (E) this.f31919b.get(i11);
                    if (!e10.M() && e10.n() == i10) {
                        e10.b(32);
                        return e10;
                    }
                }
                if (RecyclerView.this.f31787m.i() && (iM = RecyclerView.this.f31778e.m(i10)) > 0 && iM < RecyclerView.this.f31787m.e()) {
                    long jF = RecyclerView.this.f31787m.f(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        E e11 = (E) this.f31919b.get(i12);
                        if (!e11.M() && e11.l() == jF) {
                            e11.b(32);
                            return e11;
                        }
                    }
                }
            }
            return null;
        }

        u i() {
            if (this.f31924g == null) {
                this.f31924g = new u();
                u();
            }
            return this.f31924g;
        }

        int j() {
            return this.f31918a.size();
        }

        public List k() {
            return this.f31921d;
        }

        E l(long j10, int i10, boolean z10) {
            for (int size = this.f31918a.size() - 1; size >= 0; size--) {
                E e10 = (E) this.f31918a.get(size);
                if (e10.l() == j10 && !e10.M()) {
                    if (i10 == e10.m()) {
                        e10.b(32);
                        if (e10.w() && !RecyclerView.this.f31754H0.e()) {
                            e10.G(2, 14);
                        }
                        return e10;
                    }
                    if (!z10) {
                        this.f31918a.remove(size);
                        RecyclerView.this.removeDetachedView(e10.f31840a, false);
                        D(e10.f31840a);
                    }
                }
            }
            int size2 = this.f31920c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                E e11 = (E) this.f31920c.get(size2);
                if (e11.l() == j10 && !e11.s()) {
                    if (i10 == e11.m()) {
                        if (!z10) {
                            this.f31920c.remove(size2);
                        }
                        return e11;
                    }
                    if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        E m(int i10, boolean z10) {
            View viewE;
            int size = this.f31918a.size();
            for (int i11 = 0; i11 < size; i11++) {
                E e10 = (E) this.f31918a.get(i11);
                if (!e10.M() && e10.n() == i10 && !e10.u() && (RecyclerView.this.f31754H0.f31822h || !e10.w())) {
                    e10.b(32);
                    return e10;
                }
            }
            if (z10 || (viewE = RecyclerView.this.f31779f.e(i10)) == null) {
                int size2 = this.f31920c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    E e11 = (E) this.f31920c.get(i12);
                    if (!e11.u() && e11.n() == i10 && !e11.s()) {
                        if (!z10) {
                            this.f31920c.remove(i12);
                        }
                        return e11;
                    }
                }
                return null;
            }
            E eI0 = RecyclerView.i0(viewE);
            RecyclerView.this.f31779f.s(viewE);
            int iM = RecyclerView.this.f31779f.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f31779f.d(iM);
                I(viewE);
                eI0.b(8224);
                return eI0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + eI0 + RecyclerView.this.S());
        }

        View n(int i10) {
            return ((E) this.f31918a.get(i10)).f31840a;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return N(i10, z10, Long.MAX_VALUE).f31840a;
        }

        void s() {
            int size = this.f31920c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) ((E) this.f31920c.get(i10)).f31840a.getLayoutParams();
                if (qVar != null) {
                    qVar.f31909c = true;
                }
            }
        }

        void t() {
            int size = this.f31920c.size();
            for (int i10 = 0; i10 < size; i10++) {
                E e10 = (E) this.f31920c.get(i10);
                if (e10 != null) {
                    e10.b(6);
                    e10.a(null);
                }
            }
            h hVar = RecyclerView.this.f31787m;
            if (hVar == null || !hVar.i()) {
                E();
            }
        }

        void v(int i10, int i11) {
            int size = this.f31920c.size();
            for (int i12 = 0; i12 < size; i12++) {
                E e10 = (E) this.f31920c.get(i12);
                if (e10 != null && e10.f31842c >= i10) {
                    e10.B(i11, false);
                }
            }
        }

        void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f31920c.size();
            for (int i16 = 0; i16 < size; i16++) {
                E e10 = (E) this.f31920c.get(i16);
                if (e10 != null && (i15 = e10.f31842c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        e10.B(i11 - i10, false);
                    } else {
                        e10.B(i12, false);
                    }
                }
            }
        }

        void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f31920c.size() - 1; size >= 0; size--) {
                E e10 = (E) this.f31920c.get(size);
                if (e10 != null) {
                    int i13 = e10.f31842c;
                    if (i13 >= i12) {
                        e10.B(-i11, z10);
                    } else if (i13 >= i10) {
                        e10.b(8);
                        F(size);
                    }
                }
            }
        }

        void y(h hVar, h hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        void z() {
            u();
        }

        void K(C c10) {
        }
    }

    public void I0(View view) {
    }

    public void J0(View view) {
    }

    public void O0(int i10) {
    }

    @Deprecated
    public void setRecyclerListener(w wVar) {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class o {
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, A a10) {
            d(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void g(Canvas canvas, RecyclerView recyclerView, A a10) {
            f(canvas, recyclerView);
        }

        public void i(Canvas canvas, RecyclerView recyclerView, A a10) {
            h(canvas, recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class t {
        public abstract void b(RecyclerView recyclerView, int i10, int i11);

        public void a(RecyclerView recyclerView, int i10) {
        }
    }

    public void P0(int i10, int i11) {
    }
}
