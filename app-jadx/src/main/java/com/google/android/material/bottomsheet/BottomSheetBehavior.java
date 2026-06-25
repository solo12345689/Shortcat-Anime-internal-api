package com.google.android.material.bottomsheet;

import H9.l;
import L1.B;
import L1.E;
import R1.c;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2747a0;
import com.google.android.material.internal.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o9.AbstractC5838a;
import o9.AbstractC5840c;
import o9.AbstractC5846i;
import o9.AbstractC5847j;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f41983l0 = AbstractC5847j.f54884m;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f41984A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final h f41985B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ValueAnimator f41986C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f41987D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f41988E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f41989F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    float f41990G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int f41991H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    float f41992I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f41993J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f41994K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f41995L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f41996M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f41997N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f41998O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    int f41999P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    R1.c f42000Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f42001R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f42002S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f42003T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f42004U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f42005V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    int f42006W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    int f42007X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    WeakReference f42008Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    WeakReference f42009Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42010a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    WeakReference f42011a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42012b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    WeakReference f42013b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42014c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ArrayList f42015c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42016d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private VelocityTracker f42017d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42018e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    C9.b f42019e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42020f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    int f42021f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f42022g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f42023g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f42024h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    boolean f42025h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42026i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Map f42027i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private H9.h f42028j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    final SparseIntArray f42029j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f42030k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final c.AbstractC0259c f42031k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f42032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f42033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42034n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42035o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f42036p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f42037q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f42038r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f42039s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f42040t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f42041u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f42042v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f42043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f42044x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f42045y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private l f42046z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f42047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42048b;

        a(View view, int i10) {
            this.f42047a = view;
            this.f42048b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.e1(this.f42047a, this.f42048b, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f42028j != null) {
                BottomSheetBehavior.this.f42028j.e0(fFloatValue);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f42051a;

        c(boolean z10) {
            this.f42051a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.p.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.core.view.L0 a(android.view.View r11, androidx.core.view.L0 r12, com.google.android.material.internal.p.d r13) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, androidx.core.view.L0, com.google.android.material.internal.p$d):androidx.core.view.L0");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends c.AbstractC0259c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f42053a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f42007X + bottomSheetBehavior.n0()) / 2;
        }

        @Override // R1.c.AbstractC0259c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // R1.c.AbstractC0259c
        public int b(View view, int i10, int i11) {
            return E1.a.b(i10, BottomSheetBehavior.this.n0(), e(view));
        }

        @Override // R1.c.AbstractC0259c
        public int e(View view) {
            return BottomSheetBehavior.this.f0() ? BottomSheetBehavior.this.f42007X : BottomSheetBehavior.this.f41991H;
        }

        @Override // R1.c.AbstractC0259c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f41995L) {
                BottomSheetBehavior.this.X0(1);
            }
        }

        @Override // R1.c.AbstractC0259c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.k0(i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // R1.c.AbstractC0259c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instruction units count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // R1.c.AbstractC0259c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f41998O;
            if (i11 == 1 || bottomSheetBehavior.f42025h0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f42021f0 == i10) {
                WeakReference weakReference = bottomSheetBehavior.f42013b0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f42053a = SystemClock.uptimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f42008Y;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42055a;

        e(int i10) {
            this.f42055a = i10;
        }

        @Override // L1.E
        public boolean a(View view, E.a aVar) {
            BottomSheetBehavior.this.W0(this.f42055a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f42010a = 0;
        this.f42012b = true;
        this.f42014c = false;
        this.f42032l = -1;
        this.f42033m = -1;
        this.f41985B = new h(this, null);
        this.f41990G = 0.5f;
        this.f41992I = -1.0f;
        this.f41995L = true;
        this.f41996M = true;
        this.f41998O = 4;
        this.f41999P = 4;
        this.f42004U = 0.1f;
        this.f42015c0 = new ArrayList();
        this.f42023g0 = -1;
        this.f42029j0 = new SparseIntArray();
        this.f42031k0 = new d();
    }

    private boolean B0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f42011a0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.G(view, i10, i11);
    }

    private boolean C0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f42013b0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.G(view, i10, i11);
    }

    private void E0(View view, B.a aVar, int i10) {
        AbstractC2747a0.g0(view, aVar, null, h0(i10));
    }

    private void F0() {
        this.f42021f0 = -1;
        this.f42023g0 = -1;
        VelocityTracker velocityTracker = this.f42017d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f42017d0 = null;
        }
    }

    private void G0(g gVar) {
        int i10 = this.f42010a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f42020f = gVar.f42058d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f42012b = gVar.f42059e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f41993J = gVar.f42060f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f41994K = gVar.f42061g;
        }
    }

    private void H0(View view, Runnable runnable) {
        if (z0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int X(View view, int i10, int i11) {
        return AbstractC2747a0.c(view, view.getResources().getString(i10), h0(i11));
    }

    private void Y0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || w0() || this.f42022g) ? false : true;
        if (this.f42036p || this.f42037q || this.f42038r || this.f42040t || this.f42041u || this.f42042v || z10) {
            p.b(view, new c(z10));
        }
    }

    private void Z() {
        int iD0 = d0();
        if (this.f42012b) {
            this.f41991H = Math.max(this.f42007X - iD0, this.f41988E);
        } else {
            this.f41991H = this.f42007X - iD0;
        }
    }

    private float a0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    private boolean a1() {
        if (this.f42000Q != null) {
            return this.f41995L || this.f41998O == 1;
        }
        return false;
    }

    private void b0() {
        this.f41989F = (int) (this.f42007X * (1.0f - this.f41990G));
    }

    private float c0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f42028j == null || (weakReference = this.f42008Y) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f42008Y.get();
        if (!u0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(a0(this.f42028j.K(), rootWindowInsets.getRoundedCorner(0)), a0(this.f42028j.L(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int d0() {
        int i10;
        return this.f42022g ? Math.min(Math.max(this.f42024h, this.f42007X - ((this.f42006W * 9) / 16)), this.f42005V) + this.f42043w : (this.f42035o || this.f42036p || (i10 = this.f42034n) <= 0) ? this.f42020f + this.f42043w : Math.max(this.f42020f, i10 + this.f42026i);
    }

    private float e0(int i10) {
        float f10;
        float fN0;
        int i11 = this.f41991H;
        if (i10 > i11 || i11 == n0()) {
            int i12 = this.f41991H;
            f10 = i12 - i10;
            fN0 = this.f42007X - i12;
        } else {
            int i13 = this.f41991H;
            f10 = i13 - i10;
            fN0 = i13 - n0();
        }
        return f10 / fN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1(View view, int i10, boolean z10) {
        int iS0 = s0(i10);
        R1.c cVar = this.f42000Q;
        if (cVar == null || (!z10 ? cVar.Q(view, view.getLeft(), iS0) : cVar.O(view.getLeft(), iS0))) {
            X0(i10);
            return;
        }
        X0(2);
        h1(i10, true);
        this.f41985B.c(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f0() {
        return x0() && y0();
    }

    private void f1() {
        WeakReference weakReference = this.f42008Y;
        if (weakReference != null) {
            g1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f42009Z;
        if (weakReference2 != null) {
            g1((View) weakReference2.get(), 1);
        }
    }

    private void g0(View view, int i10) {
        if (view == null) {
            return;
        }
        AbstractC2747a0.e0(view, 524288);
        AbstractC2747a0.e0(view, 262144);
        AbstractC2747a0.e0(view, 1048576);
        int i11 = this.f42029j0.get(i10, -1);
        if (i11 != -1) {
            AbstractC2747a0.e0(view, i11);
            this.f42029j0.delete(i10);
        }
    }

    private void g1(View view, int i10) {
        if (view == null) {
            return;
        }
        g0(view, i10);
        if (!this.f42012b && this.f41998O != 6) {
            this.f42029j0.put(i10, X(view, AbstractC5846i.f54843a, 6));
        }
        if (this.f41993J && y0() && this.f41998O != 5) {
            E0(view, B.a.f11233y, 5);
        }
        int i11 = this.f41998O;
        if (i11 == 3) {
            E0(view, B.a.f11232x, this.f42012b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            E0(view, B.a.f11231w, this.f42012b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            E0(view, B.a.f11232x, 4);
            E0(view, B.a.f11231w, 3);
        }
    }

    private E h0(int i10) {
        return new e(i10);
    }

    private void h1(int i10, boolean z10) {
        boolean zV0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.f41984A == (zV0 = v0()) || this.f42028j == null) {
            return;
        }
        this.f41984A = zV0;
        if (!z10 || (valueAnimator = this.f41986C) == null) {
            ValueAnimator valueAnimator2 = this.f41986C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f41986C.cancel();
            }
            this.f42028j.e0(this.f41984A ? c0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f41986C.reverse();
        } else {
            this.f41986C.setFloatValues(this.f42028j.C(), zV0 ? c0() : 1.0f);
            this.f41986C.start();
        }
    }

    private void i0(Context context) {
        if (this.f42046z == null) {
            return;
        }
        H9.h hVar = new H9.h(this.f42046z);
        this.f42028j = hVar;
        hVar.R(context);
        ColorStateList colorStateList = this.f42030k;
        if (colorStateList != null) {
            this.f42028j.d0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f42028j.setTint(typedValue.data);
    }

    private void i1(boolean z10) {
        Map map;
        WeakReference weakReference = this.f42008Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f42027i0 != null) {
                    return;
                } else {
                    this.f42027i0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f42008Y.get()) {
                    if (z10) {
                        this.f42027i0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f42014c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f42014c && (map = this.f42027i0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f42027i0.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f42027i0 = null;
            } else if (this.f42014c) {
                ((View) this.f42008Y.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private void j0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c0(), 1.0f);
        this.f41986C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f41986C.addUpdateListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(boolean z10) {
        View view;
        if (this.f42008Y != null) {
            Z();
            if (this.f41998O != 4 || (view = (View) this.f42008Y.get()) == null) {
                return;
            }
            if (z10) {
                W0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private int m0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private int s0(int i10) {
        if (i10 == 3) {
            return n0();
        }
        if (i10 == 4) {
            return this.f41991H;
        }
        if (i10 == 5) {
            return this.f42007X;
        }
        if (i10 == 6) {
            return this.f41989F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float t0() {
        VelocityTracker velocityTracker = this.f42017d0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f42016d);
        return this.f42017d0.getYVelocity(this.f42021f0);
    }

    private boolean u0() {
        WeakReference weakReference = this.f42008Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f42008Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean v0() {
        if (this.f41998O == 3) {
            return this.f42045y || u0();
        }
        return false;
    }

    private boolean z0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f42002S = 0;
        this.f42003T = false;
        return (i10 & 2) != 0;
    }

    public boolean A0() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.n0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.X0(r0)
            return
        Lf:
            boolean r3 = r2.A0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f42013b0
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f42003T
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f42002S
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f42012b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f41989F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f41993J
            if (r3 == 0) goto L49
            float r3 = r2.t0()
            boolean r3 = r2.b1(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f42002S
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f42012b
            if (r1 == 0) goto L68
            int r5 = r2.f41988E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f41991H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f41989F
            if (r3 >= r1) goto L7e
            int r1 = r2.f41991H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.c1()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f41991H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f42012b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f41989F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f41991H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.e1(r4, r0, r3)
            r2.f42003T = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f41998O == 1 && actionMasked == 0) {
            return true;
        }
        if (a1()) {
            this.f42000Q.F(motionEvent);
        }
        if (actionMasked == 0) {
            F0();
        }
        if (this.f42017d0 == null) {
            this.f42017d0 = VelocityTracker.obtain();
        }
        this.f42017d0.addMovement(motionEvent);
        if (a1() && actionMasked == 2 && !this.f42001R && Math.abs(this.f42023g0 - motionEvent.getY()) > this.f42000Q.z()) {
            this.f42000Q.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f42001R;
    }

    public void D0(f fVar) {
        this.f42015c0.remove(fVar);
    }

    public void I0(boolean z10) {
        this.f41995L = z10;
    }

    public void J0(boolean z10) {
        this.f41996M = z10;
    }

    public void K0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f41987D = i10;
        h1(this.f41998O, true);
    }

    public void L0(boolean z10) {
        if (this.f42012b == z10) {
            return;
        }
        this.f42012b = z10;
        if (this.f42008Y != null) {
            Z();
        }
        X0((this.f42012b && this.f41998O == 6) ? 3 : this.f41998O);
        h1(this.f41998O, true);
        f1();
    }

    public void M0(boolean z10) {
        this.f42035o = z10;
    }

    public void N0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f41990G = f10;
        if (this.f42008Y != null) {
            b0();
        }
    }

    public void O0(boolean z10) {
        if (this.f41993J != z10) {
            this.f41993J = z10;
            if (!z10 && this.f41998O == 5) {
                W0(4);
            }
            f1();
        }
    }

    public void P0(int i10) {
        this.f42033m = i10;
    }

    public void Q0(int i10) {
        this.f42032l = i10;
    }

    public void R0(int i10) {
        S0(i10, false);
    }

    public final void S0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f42022g) {
                return;
            } else {
                this.f42022g = true;
            }
        } else {
            if (!this.f42022g && this.f42020f == i10) {
                return;
            }
            this.f42022g = false;
            this.f42020f = Math.max(0, i10);
        }
        j1(z10);
    }

    public void T0(int i10) {
        this.f42010a = i10;
    }

    public void U0(int i10) {
        this.f42018e = i10;
    }

    public void V0(boolean z10) {
        this.f41994K = z10;
    }

    public void W0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.f41993J && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f42012b && s0(i10) <= this.f41988E) ? 3 : i10;
        WeakReference weakReference = this.f42008Y;
        if (weakReference == null || weakReference.get() == null) {
            X0(i10);
        } else {
            View view = (View) this.f42008Y.get();
            H0(view, new a(view, i11));
        }
    }

    void X0(int i10) {
        View view;
        if (this.f41998O == i10) {
            return;
        }
        this.f41998O = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f41993J && i10 == 5)) {
            this.f41999P = i10;
        }
        WeakReference weakReference = this.f42008Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            i1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            i1(false);
        }
        h1(i10, true);
        for (int i11 = 0; i11 < this.f42015c0.size(); i11++) {
            ((f) this.f42015c0.get(i11)).c(view, i10);
        }
        f1();
    }

    public void Y(f fVar) {
        if (this.f42015c0.contains(fVar)) {
            return;
        }
        this.f42015c0.add(fVar);
    }

    public boolean Z0(long j10, float f10) {
        return false;
    }

    boolean b1(View view, float f10) {
        if (this.f41994K) {
            return true;
        }
        if (y0() && view.getTop() >= this.f41991H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f42004U)) - ((float) this.f41991H)) / ((float) d0()) > 0.5f;
        }
        return false;
    }

    public boolean c1() {
        return false;
    }

    public boolean d1() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f42008Y = null;
        this.f42000Q = null;
        this.f42019e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f42008Y = null;
        this.f42000Q = null;
        this.f42019e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        R1.c cVar;
        if (!view.isShown() || !this.f41995L) {
            this.f42001R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            F0();
        }
        if (this.f42017d0 == null) {
            this.f42017d0 = VelocityTracker.obtain();
        }
        this.f42017d0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            this.f42023g0 = y10;
            if (this.f41998O != 2 && C0(coordinatorLayout, x10, y10)) {
                this.f42021f0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!B0(coordinatorLayout, x10, this.f42023g0)) {
                    this.f42025h0 = true;
                }
            }
            this.f42001R = this.f42021f0 == -1 && !coordinatorLayout.G(view, x10, this.f42023g0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f42025h0 = false;
            this.f42021f0 = -1;
            if (this.f42001R) {
                this.f42001R = false;
                return false;
            }
        }
        if (!this.f42001R && (cVar = this.f42000Q) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference weakReference = this.f42013b0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        return (actionMasked != 2 || view2 == null || this.f42001R || this.f41998O == 1 || coordinatorLayout.G(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f42000Q == null || (i10 = this.f42023g0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f42000Q.z())) ? false : true;
    }

    void k0(int i10) {
        View view = (View) this.f42008Y.get();
        if (view == null || this.f42015c0.isEmpty()) {
            return;
        }
        float fE0 = e0(i10);
        for (int i11 = 0; i11 < this.f42015c0.size(); i11++) {
            ((f) this.f42015c0.get(i11)).b(view, fE0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f42008Y == null) {
            this.f42024h = coordinatorLayout.getResources().getDimensionPixelSize(AbstractC5840c.f54725j);
            Y0(view);
            AbstractC2747a0.C0(view, new com.google.android.material.bottomsheet.a(view));
            this.f42008Y = new WeakReference(view);
            this.f42019e0 = new C9.b(view);
            H9.h hVar = this.f42028j;
            if (hVar != null) {
                view.setBackground(hVar);
                H9.h hVar2 = this.f42028j;
                float elevation = this.f41992I;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                hVar2.c0(elevation);
            } else {
                ColorStateList colorStateList = this.f42030k;
                if (colorStateList != null) {
                    AbstractC2747a0.p0(view, colorStateList);
                }
            }
            f1();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f42000Q == null) {
            this.f42000Q = R1.c.o(coordinatorLayout, this.f42031k0);
        }
        int top = view.getTop();
        coordinatorLayout.O(view, i10);
        this.f42006W = coordinatorLayout.getWidth();
        this.f42007X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f42005V = height;
        int iMin = this.f42007X;
        int i11 = iMin - height;
        int i12 = this.f42044x;
        if (i11 < i12) {
            if (this.f42039s) {
                int i13 = this.f42033m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.f42005V = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f42033m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f42005V = iMin2;
            }
        }
        this.f41988E = Math.max(0, this.f42007X - this.f42005V);
        b0();
        Z();
        int i15 = this.f41998O;
        if (i15 == 3) {
            AbstractC2747a0.V(view, n0());
        } else if (i15 == 6) {
            AbstractC2747a0.V(view, this.f41989F);
        } else if (this.f41993J && i15 == 5) {
            AbstractC2747a0.V(view, this.f42007X);
        } else if (i15 == 4) {
            AbstractC2747a0.V(view, this.f41991H);
        } else if (i15 == 1 || i15 == 2) {
            AbstractC2747a0.V(view, top - view.getTop());
        }
        h1(this.f41998O, false);
        this.f42013b0 = new WeakReference(l0(view));
        for (int i16 = 0; i16 < this.f42015c0.size(); i16++) {
            ((f) this.f42015c0.get(i16)).a(view);
        }
        return true;
    }

    View l0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewL0 = l0(viewGroup.getChildAt(i10));
                if (viewL0 != null) {
                    return viewL0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f42032l, marginLayoutParams.width), m0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f42033m, marginLayoutParams.height));
        return true;
    }

    public int n0() {
        if (this.f42012b) {
            return this.f41988E;
        }
        return Math.max(this.f41987D, this.f42039s ? 0 : this.f42044x);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        return A0() && (weakReference = this.f42013b0) != null && view2 == weakReference.get() && (!(this.f41998O == 3 || this.f41997N) || super.o(coordinatorLayout, view, view2, f10, f11));
    }

    public float o0() {
        return this.f41990G;
    }

    public int p0() {
        return this.f42033m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f42013b0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!A0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (!this.f42003T && !this.f41996M && view2 == view3 && view2.canScrollVertically(1)) {
                    this.f41997N = true;
                    return;
                }
                if (i13 < n0()) {
                    int iN0 = top - n0();
                    iArr[1] = iN0;
                    AbstractC2747a0.V(view, -iN0);
                    X0(3);
                } else {
                    if (!this.f41995L) {
                        return;
                    }
                    iArr[1] = i11;
                    AbstractC2747a0.V(view, -i11);
                    X0(1);
                }
            } else if (i11 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.f42003T && !this.f41996M && view2 == view3 && zCanScrollVertically) {
                    this.f41997N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i13 > this.f41991H && !f0()) {
                        int i14 = top - this.f41991H;
                        iArr[1] = i14;
                        AbstractC2747a0.V(view, -i14);
                        X0(4);
                    } else {
                        if (!this.f41995L) {
                            return;
                        }
                        iArr[1] = i11;
                        AbstractC2747a0.V(view, -i11);
                        X0(1);
                    }
                }
            }
            k0(view.getTop());
            this.f42002S = i11;
            this.f42003T = true;
            this.f41997N = false;
        }
    }

    public int q0() {
        if (this.f42022g) {
            return -1;
        }
        return this.f42020f;
    }

    public int r0() {
        return this.f41998O;
    }

    public boolean w0() {
        return this.f42035o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, view, gVar.a());
        G0(gVar);
        int i10 = gVar.f42057c;
        if (i10 == 1 || i10 == 2) {
            this.f41998O = 4;
            this.f41999P = 4;
        } else {
            this.f41998O = i10;
            this.f41999P = i10;
        }
    }

    public boolean x0() {
        return this.f41993J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new g(super.y(coordinatorLayout, view), this);
    }

    public boolean y0() {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f42063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f42064c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f42063b = false;
                R1.c cVar = BottomSheetBehavior.this.f42000Q;
                if (cVar != null && cVar.m(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f42062a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f41998O == 2) {
                    bottomSheetBehavior.X0(hVar2.f42062a);
                }
            }
        }

        private h() {
            this.f42064c = new a();
        }

        void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f42008Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f42062a = i10;
            if (this.f42063b) {
                return;
            }
            ((View) BottomSheetBehavior.this.f42008Y.get()).postOnAnimation(this.f42064c);
            this.f42063b = true;
        }

        /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static class g extends Q1.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f42057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f42058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f42059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f42060f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f42061g;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
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
            this.f42057c = parcel.readInt();
            this.f42058d = parcel.readInt();
            this.f42059e = parcel.readInt() == 1;
            this.f42060f = parcel.readInt() == 1;
            this.f42061g = parcel.readInt() == 1;
        }

        @Override // Q1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f42057c);
            parcel.writeInt(this.f42058d);
            parcel.writeInt(this.f42059e ? 1 : 0);
            parcel.writeInt(this.f42060f ? 1 : 0);
            parcel.writeInt(this.f42061g ? 1 : 0);
        }

        public g(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f42057c = bottomSheetBehavior.f41998O;
            this.f42058d = bottomSheetBehavior.f42020f;
            this.f42059e = bottomSheetBehavior.f42012b;
            this.f42060f = bottomSheetBehavior.f41993J;
            this.f42061g = bottomSheetBehavior.f41994K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f42010a = 0;
        this.f42012b = true;
        this.f42014c = false;
        this.f42032l = -1;
        this.f42033m = -1;
        this.f41985B = new h(this, null);
        this.f41990G = 0.5f;
        this.f41992I = -1.0f;
        this.f41995L = true;
        this.f41996M = true;
        this.f41998O = 4;
        this.f41999P = 4;
        this.f42004U = 0.1f;
        this.f42015c0 = new ArrayList();
        this.f42023g0 = -1;
        this.f42029j0 = new SparseIntArray();
        this.f42031k0 = new d();
        this.f42026i = context.getResources().getDimensionPixelSize(AbstractC5840c.f54730l0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5848k.f55082X);
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5848k.f55116b0)) {
            this.f42030k = E9.c.a(context, typedArrayObtainStyledAttributes, AbstractC5848k.f55116b0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5848k.f55273u0)) {
            this.f42046z = l.e(context, attributeSet, AbstractC5838a.f54629d, f41983l0).m();
        }
        i0(context);
        j0();
        this.f41992I = typedArrayObtainStyledAttributes.getDimension(AbstractC5848k.f55107a0, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5848k.f55090Y)) {
            Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5848k.f55090Y, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5848k.f55098Z)) {
            P0(typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5848k.f55098Z, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(AbstractC5848k.f55177i0);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            R0(i10);
        } else {
            R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5848k.f55177i0, -1));
        }
        O0(typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55169h0, false));
        M0(typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55209m0, false));
        L0(typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55152f0, true));
        V0(typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55201l0, false));
        I0(typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55125c0, true));
        J0(typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55134d0, true));
        T0(typedArrayObtainStyledAttributes.getInt(AbstractC5848k.f55185j0, 0));
        N0(typedArrayObtainStyledAttributes.getFloat(AbstractC5848k.f55161g0, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(AbstractC5848k.f55143e0);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            K0(typedValuePeekValue2.data);
        } else {
            K0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5848k.f55143e0, 0));
        }
        U0(typedArrayObtainStyledAttributes.getInt(AbstractC5848k.f55193k0, 500));
        this.f42036p = typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55241q0, false);
        this.f42037q = typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55249r0, false);
        this.f42038r = typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55257s0, false);
        this.f42039s = typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55265t0, true);
        this.f42040t = typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55217n0, false);
        this.f42041u = typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55225o0, false);
        this.f42042v = typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55233p0, false);
        this.f42045y = typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55281v0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f42016d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class f {
        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);

        void a(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }
}
