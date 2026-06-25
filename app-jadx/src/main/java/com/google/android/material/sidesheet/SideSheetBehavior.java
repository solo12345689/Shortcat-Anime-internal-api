package com.google.android.material.sidesheet;

import H9.h;
import H9.l;
import L1.B;
import L1.E;
import R1.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2747a0;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import o9.AbstractC5846i;
import o9.AbstractC5847j;
import o9.AbstractC5848k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.c f42766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f42767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f42768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f42769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f42770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f42771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f42772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private R1.c f42776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f42778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f42780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f42781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f42782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f42783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f42784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f42785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private VelocityTracker f42786u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C9.c f42787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f42788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set f42789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final c.AbstractC0259c f42790y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f42765z = AbstractC5846i.f54842D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f42764A = AbstractC5847j.f54888q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends c.AbstractC0259c {
        a() {
        }

        @Override // R1.c.AbstractC0259c
        public int a(View view, int i10, int i11) {
            return E1.a.b(i10, SideSheetBehavior.this.f42766a.f(), SideSheetBehavior.this.f42766a.e());
        }

        @Override // R1.c.AbstractC0259c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // R1.c.AbstractC0259c
        public int d(View view) {
            return SideSheetBehavior.this.f42779n + SideSheetBehavior.this.d0();
        }

        @Override // R1.c.AbstractC0259c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f42773h) {
                SideSheetBehavior.this.z0(1);
            }
        }

        @Override // R1.c.AbstractC0259c
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewZ = SideSheetBehavior.this.Z();
            if (viewZ != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewZ.getLayoutParams()) != null) {
                SideSheetBehavior.this.f42766a.n(marginLayoutParams, view.getLeft(), view.getRight());
                viewZ.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i10);
        }

        @Override // R1.c.AbstractC0259c
        public void l(View view, float f10, float f11) {
            int iR = SideSheetBehavior.this.R(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.E0(view, iR, sideSheetBehavior.D0());
        }

        @Override // R1.c.AbstractC0259c
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f42774i == 1 || SideSheetBehavior.this.f42783r == null || SideSheetBehavior.this.f42783r.get() != view) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f42794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f42795c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.a(this.f42799a);
            }
        };

        c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.f42794b = false;
            if (SideSheetBehavior.this.f42776k != null && SideSheetBehavior.this.f42776k.m(true)) {
                cVar.b(cVar.f42793a);
            } else if (SideSheetBehavior.this.f42774i == 2) {
                SideSheetBehavior.this.z0(cVar.f42793a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f42783r == null || SideSheetBehavior.this.f42783r.get() == null) {
                return;
            }
            this.f42793a = i10;
            if (this.f42794b) {
                return;
            }
            ((View) SideSheetBehavior.this.f42783r.get()).postOnAnimation(this.f42795c);
            this.f42794b = true;
        }
    }

    public SideSheetBehavior() {
        this.f42771f = new c();
        this.f42773h = true;
        this.f42774i = 5;
        this.f42775j = 5;
        this.f42778m = 0.1f;
        this.f42785t = -1;
        this.f42789x = new LinkedHashSet();
        this.f42790y = new a();
    }

    private boolean A0() {
        if (this.f42776k != null) {
            return this.f42773h || this.f42774i == 1;
        }
        return false;
    }

    private boolean C0(View view) {
        return (view.isShown() || AbstractC2747a0.n(view) != null) && this.f42773h;
    }

    public static /* synthetic */ boolean E(SideSheetBehavior sideSheetBehavior, int i10, View view, E.a aVar) {
        sideSheetBehavior.y0(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(View view, int i10, boolean z10) {
        if (!p0(view, i10, z10)) {
            z0(i10);
        } else {
            z0(2);
            this.f42771f.b(i10);
        }
    }

    public static /* synthetic */ void F(SideSheetBehavior sideSheetBehavior, int i10) {
        View view = (View) sideSheetBehavior.f42783r.get();
        if (view != null) {
            sideSheetBehavior.E0(view, i10, false);
        }
    }

    private void F0() {
        View view;
        WeakReference weakReference = this.f42783r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC2747a0.e0(view, 262144);
        AbstractC2747a0.e0(view, 1048576);
        if (this.f42774i != 5) {
            r0(view, B.a.f11233y, 5);
        }
        if (this.f42774i != 3) {
            r0(view, B.a.f11231w, 3);
        }
    }

    private void G0(l lVar) {
        h hVar = this.f42768c;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
    }

    private void H0(View view) {
        int i10 = this.f42774i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int P(int i10, View view) {
        int i11 = this.f42774i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f42766a.g(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f42766a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f42774i);
    }

    private float Q(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R(View view, float f10, float f11) {
        if (n0(f10)) {
            return 3;
        }
        if (B0(view, f10)) {
            return (this.f42766a.l(f10, f11) || this.f42766a.k(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && d.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - a0()) < Math.abs(left - this.f42766a.d()) ? 3 : 5;
    }

    private void S() {
        WeakReference weakReference = this.f42784s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f42784s = null;
    }

    private E T(final int i10) {
        return new E() { // from class: I9.a
            @Override // L1.E
            public final boolean a(View view, E.a aVar) {
                return SideSheetBehavior.E(this.f8858a, i10, view, aVar);
            }
        };
    }

    private void U(Context context) {
        if (this.f42770e == null) {
            return;
        }
        h hVar = new h(this.f42770e);
        this.f42768c = hVar;
        hVar.R(context);
        ColorStateList colorStateList = this.f42769d;
        if (colorStateList != null) {
            this.f42768c.d0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f42768c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(View view, int i10) {
        if (this.f42789x.isEmpty()) {
            return;
        }
        this.f42766a.b(i10);
        Iterator it = this.f42789x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void W(View view) {
        if (AbstractC2747a0.n(view) == null) {
            AbstractC2747a0.n0(view, view.getResources().getString(f42765z));
        }
    }

    private int X(int i10, int i11, int i12, int i13) {
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

    private CoordinatorLayout.f j0() {
        View view;
        WeakReference weakReference = this.f42783r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean k0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).leftMargin > 0;
    }

    private boolean l0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).rightMargin > 0;
    }

    private boolean m0(MotionEvent motionEvent) {
        return A0() && Q((float) this.f42788w, motionEvent.getX()) > ((float) this.f42776k.z());
    }

    private boolean n0(float f10) {
        return this.f42766a.j(f10);
    }

    private boolean o0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    private boolean p0(View view, int i10, boolean z10) {
        int iE0 = e0(i10);
        R1.c cVarI0 = i0();
        if (cVarI0 != null) {
            return z10 ? cVarI0.O(iE0, view.getTop()) : cVarI0.Q(view, iE0, view.getTop());
        }
        return false;
    }

    private void q0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f42784s != null || (i10 = this.f42785t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f42784s = new WeakReference(viewFindViewById);
    }

    private void r0(View view, B.a aVar, int i10) {
        AbstractC2747a0.g0(view, aVar, null, T(i10));
    }

    private void s0() {
        VelocityTracker velocityTracker = this.f42786u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f42786u = null;
        }
    }

    private void t0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void w0(int i10) {
        com.google.android.material.sidesheet.c cVar = this.f42766a;
        if (cVar == null || cVar.i() != i10) {
            if (i10 == 0) {
                this.f42766a = new com.google.android.material.sidesheet.b(this);
                if (this.f42770e == null || l0()) {
                    return;
                }
                l.b bVarW = this.f42770e.w();
                bVarW.I(0.0f).y(0.0f);
                G0(bVarW.m());
                return;
            }
            if (i10 == 1) {
                this.f42766a = new com.google.android.material.sidesheet.a(this);
                if (this.f42770e == null || k0()) {
                    return;
                }
                l.b bVarW2 = this.f42770e.w();
                bVarW2.D(0.0f).u(0.0f);
                G0(bVarW2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private void x0(View view, int i10) {
        w0(Gravity.getAbsoluteGravity(((CoordinatorLayout.f) view.getLayoutParams()).f28706c, i10) == 3 ? 1 : 0);
    }

    boolean B0(View view, float f10) {
        return this.f42766a.m(view, f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f42774i == 1 && actionMasked == 0) {
            return true;
        }
        if (A0()) {
            this.f42776k.F(motionEvent);
        }
        if (actionMasked == 0) {
            s0();
        }
        if (this.f42786u == null) {
            this.f42786u = VelocityTracker.obtain();
        }
        this.f42786u.addMovement(motionEvent);
        if (A0() && actionMasked == 2 && !this.f42777l && m0(motionEvent)) {
            this.f42776k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f42777l;
    }

    public boolean D0() {
        return true;
    }

    int Y() {
        return this.f42779n;
    }

    public View Z() {
        WeakReference weakReference = this.f42784s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f42766a.c();
    }

    public float b0() {
        return this.f42778m;
    }

    float c0() {
        return 0.5f;
    }

    int d0() {
        return this.f42782q;
    }

    int e0(int i10) {
        if (i10 == 3) {
            return a0();
        }
        if (i10 == 5) {
            return this.f42766a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int f0() {
        return this.f42781p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f42783r = null;
        this.f42776k = null;
        this.f42787v = null;
    }

    int g0() {
        return this.f42780o;
    }

    int h0() {
        return 500;
    }

    R1.c i0() {
        return this.f42776k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f42783r = null;
        this.f42776k = null;
        this.f42787v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        R1.c cVar;
        if (!C0(view)) {
            this.f42777l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s0();
        }
        if (this.f42786u == null) {
            this.f42786u = VelocityTracker.obtain();
        }
        this.f42786u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f42788w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f42777l) {
            this.f42777l = false;
            return false;
        }
        return (this.f42777l || (cVar = this.f42776k) == null || !cVar.P(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f42783r == null) {
            this.f42783r = new WeakReference(view);
            this.f42787v = new C9.c(view);
            h hVar = this.f42768c;
            if (hVar != null) {
                view.setBackground(hVar);
                h hVar2 = this.f42768c;
                float elevation = this.f42772g;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                hVar2.c0(elevation);
            } else {
                ColorStateList colorStateList = this.f42769d;
                if (colorStateList != null) {
                    AbstractC2747a0.p0(view, colorStateList);
                }
            }
            H0(view);
            F0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            W(view);
        }
        x0(view, i10);
        if (this.f42776k == null) {
            this.f42776k = R1.c.o(coordinatorLayout, this.f42790y);
        }
        int iG = this.f42766a.g(view);
        coordinatorLayout.O(view, i10);
        this.f42780o = coordinatorLayout.getWidth();
        this.f42781p = this.f42766a.h(coordinatorLayout);
        this.f42779n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f42782q = marginLayoutParams != null ? this.f42766a.a(marginLayoutParams) : 0;
        AbstractC2747a0.U(view, P(iG, view));
        q0(coordinatorLayout);
        Iterator it = this.f42789x.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), X(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public void u0(int i10) {
        this.f42785t = i10;
        S();
        WeakReference weakReference = this.f42783r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 == -1 || !view.isLaidOut()) {
                return;
            }
            view.requestLayout();
        }
    }

    public void v0(boolean z10) {
        this.f42773h = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.a() != null) {
            super.x(coordinatorLayout, view, bVar.a());
        }
        int i10 = bVar.f42792c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f42774i = i10;
        this.f42775j = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new b(super.y(coordinatorLayout, view), this);
    }

    public void y0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference weakReference = this.f42783r;
        if (weakReference == null || weakReference.get() == null) {
            z0(i10);
        } else {
            t0((View) this.f42783r.get(), new Runnable() { // from class: I9.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.F(this.f8860a, i10);
                }
            });
        }
    }

    void z0(int i10) {
        View view;
        if (this.f42774i == i10) {
            return;
        }
        this.f42774i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f42775j = i10;
        }
        WeakReference weakReference = this.f42783r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        H0(view);
        Iterator it = this.f42789x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        F0();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static class b extends Q1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f42792c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f42792c = parcel.readInt();
        }

        @Override // Q1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f42792c);
        }

        public b(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f42792c = sideSheetBehavior.f42774i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42771f = new c();
        this.f42773h = true;
        this.f42774i = 5;
        this.f42775j = 5;
        this.f42778m = 0.1f;
        this.f42785t = -1;
        this.f42789x = new LinkedHashSet();
        this.f42790y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5848k.f55157f5);
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5848k.f55174h5)) {
            this.f42769d = E9.c.a(context, typedArrayObtainStyledAttributes, AbstractC5848k.f55174h5);
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5848k.f55198k5)) {
            this.f42770e = l.e(context, attributeSet, 0, f42764A).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5848k.f55190j5)) {
            u0(typedArrayObtainStyledAttributes.getResourceId(AbstractC5848k.f55190j5, -1));
        }
        U(context);
        this.f42772g = typedArrayObtainStyledAttributes.getDimension(AbstractC5848k.f55166g5, -1.0f);
        v0(typedArrayObtainStyledAttributes.getBoolean(AbstractC5848k.f55182i5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f42767b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
