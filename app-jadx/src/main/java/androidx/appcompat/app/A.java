package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.AbstractC2771m0;
import androidx.core.view.C2767k0;
import androidx.core.view.InterfaceC2769l0;
import androidx.core.view.InterfaceC2773n0;
import i.AbstractC4956a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class A extends AbstractC2646a implements ActionBarOverlayLayout.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final Interpolator f24246D = new AccelerateInterpolator();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Interpolator f24247E = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f24251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f24253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f24254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f24255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    J f24256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ActionBarContextView f24257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    View f24258h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f24261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    d f24262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f24263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    b.a f24264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f24265o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f24267q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f24270t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f24271u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f24272v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f24274x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f24275y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f24276z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f24259i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f24260j = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ArrayList f24266p = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f24268r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f24269s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f24273w = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final InterfaceC2769l0 f24248A = new a();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final InterfaceC2769l0 f24249B = new b();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final InterfaceC2773n0 f24250C = new c();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC2771m0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC2769l0
        public void b(View view) {
            View view2;
            A a10 = A.this;
            if (a10.f24269s && (view2 = a10.f24258h) != null) {
                view2.setTranslationY(0.0f);
                A.this.f24255e.setTranslationY(0.0f);
            }
            A.this.f24255e.setVisibility(8);
            A.this.f24255e.setTransitioning(false);
            A a11 = A.this;
            a11.f24274x = null;
            a11.z();
            ActionBarOverlayLayout actionBarOverlayLayout = A.this.f24254d;
            if (actionBarOverlayLayout != null) {
                AbstractC2747a0.h0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractC2771m0 {
        b() {
        }

        @Override // androidx.core.view.InterfaceC2769l0
        public void b(View view) {
            A a10 = A.this;
            a10.f24274x = null;
            a10.f24255e.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements InterfaceC2773n0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC2773n0
        public void a(View view) {
            ((View) A.this.f24255e.getParent()).invalidate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class d extends androidx.appcompat.view.b implements e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f24280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f24281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b.a f24282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private WeakReference f24283f;

        public d(Context context, b.a aVar) {
            this.f24280c = context;
            this.f24282e = aVar;
            androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(context).X(1);
            this.f24281d = eVarX;
            eVarX.W(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f24282e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f24282e == null) {
                return;
            }
            k();
            A.this.f24257g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            A a10 = A.this;
            if (a10.f24262l != this) {
                return;
            }
            if (A.y(a10.f24270t, a10.f24271u, false)) {
                this.f24282e.a(this);
            } else {
                A a11 = A.this;
                a11.f24263m = this;
                a11.f24264n = this.f24282e;
            }
            this.f24282e = null;
            A.this.x(false);
            A.this.f24257g.g();
            A a12 = A.this;
            a12.f24254d.setHideOnContentScrollEnabled(a12.f24276z);
            A.this.f24262l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f24283f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f24281d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f24280c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return A.this.f24257g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return A.this.f24257g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (A.this.f24262l != this) {
                return;
            }
            this.f24281d.i0();
            try {
                this.f24282e.d(this, this.f24281d);
            } finally {
                this.f24281d.h0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return A.this.f24257g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            A.this.f24257g.setCustomView(view);
            this.f24283f = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(A.this.f24251a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            A.this.f24257g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(A.this.f24251a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            A.this.f24257g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            A.this.f24257g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f24281d.i0();
            try {
                return this.f24282e.b(this, this.f24281d);
            } finally {
                this.f24281d.h0();
            }
        }
    }

    public A(Activity activity, boolean z10) {
        this.f24253c = activity;
        View decorView = activity.getWindow().getDecorView();
        F(decorView);
        if (z10) {
            return;
        }
        this.f24258h = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private J C(View view) {
        if (view instanceof J) {
            return (J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void E() {
        if (this.f24272v) {
            this.f24272v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f24254d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            N(false);
        }
    }

    private void F(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(i.f.f48080q);
        this.f24254d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f24256f = C(view.findViewById(i.f.f48064a));
        this.f24257g = (ActionBarContextView) view.findViewById(i.f.f48070g);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(i.f.f48066c);
        this.f24255e = actionBarContainer;
        J j10 = this.f24256f;
        if (j10 == null || this.f24257g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f24251a = j10.getContext();
        boolean z10 = (this.f24256f.v() & 4) != 0;
        if (z10) {
            this.f24261k = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f24251a);
        K(aVarB.a() || z10);
        I(aVarB.e());
        TypedArray typedArrayObtainStyledAttributes = this.f24251a.obtainStyledAttributes(null, i.j.f48258a, AbstractC4956a.f47956c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f48308k, false)) {
            J(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f48298i, 0);
        if (dimensionPixelSize != 0) {
            H(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void I(boolean z10) {
        this.f24267q = z10;
        if (z10) {
            this.f24255e.setTabContainer(null);
            this.f24256f.r(null);
        } else {
            this.f24256f.r(null);
            this.f24255e.setTabContainer(null);
        }
        boolean z11 = false;
        boolean z12 = D() == 2;
        this.f24256f.p(!this.f24267q && z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f24254d;
        if (!this.f24267q && z12) {
            z11 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z11);
    }

    private boolean L() {
        return this.f24255e.isLaidOut();
    }

    private void M() {
        if (this.f24272v) {
            return;
        }
        this.f24272v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f24254d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        N(false);
    }

    private void N(boolean z10) {
        if (y(this.f24270t, this.f24271u, this.f24272v)) {
            if (this.f24273w) {
                return;
            }
            this.f24273w = true;
            B(z10);
            return;
        }
        if (this.f24273w) {
            this.f24273w = false;
            A(z10);
        }
    }

    static boolean y(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    public void A(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f24274x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f24268r != 0 || (!this.f24275y && !z10)) {
            this.f24248A.b(null);
            return;
        }
        this.f24255e.setAlpha(1.0f);
        this.f24255e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f24255e.getHeight();
        if (z10) {
            this.f24255e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        C2767k0 c2767k0L = AbstractC2747a0.e(this.f24255e).l(f10);
        c2767k0L.j(this.f24250C);
        hVar2.c(c2767k0L);
        if (this.f24269s && (view = this.f24258h) != null) {
            hVar2.c(AbstractC2747a0.e(view).l(f10));
        }
        hVar2.f(f24246D);
        hVar2.e(250L);
        hVar2.g(this.f24248A);
        this.f24274x = hVar2;
        hVar2.h();
    }

    public void B(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f24274x;
        if (hVar != null) {
            hVar.a();
        }
        this.f24255e.setVisibility(0);
        if (this.f24268r == 0 && (this.f24275y || z10)) {
            this.f24255e.setTranslationY(0.0f);
            float f10 = -this.f24255e.getHeight();
            if (z10) {
                this.f24255e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f24255e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            C2767k0 c2767k0L = AbstractC2747a0.e(this.f24255e).l(0.0f);
            c2767k0L.j(this.f24250C);
            hVar2.c(c2767k0L);
            if (this.f24269s && (view2 = this.f24258h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(AbstractC2747a0.e(this.f24258h).l(0.0f));
            }
            hVar2.f(f24247E);
            hVar2.e(250L);
            hVar2.g(this.f24249B);
            this.f24274x = hVar2;
            hVar2.h();
        } else {
            this.f24255e.setAlpha(1.0f);
            this.f24255e.setTranslationY(0.0f);
            if (this.f24269s && (view = this.f24258h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f24249B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f24254d;
        if (actionBarOverlayLayout != null) {
            AbstractC2747a0.h0(actionBarOverlayLayout);
        }
    }

    public int D() {
        return this.f24256f.k();
    }

    public void G(int i10, int i11) {
        int iV = this.f24256f.v();
        if ((i11 & 4) != 0) {
            this.f24261k = true;
        }
        this.f24256f.i((i10 & i11) | ((~i11) & iV));
    }

    public void H(float f10) {
        AbstractC2747a0.r0(this.f24255e, f10);
    }

    public void J(boolean z10) {
        if (z10 && !this.f24254d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f24276z = z10;
        this.f24254d.setHideOnContentScrollEnabled(z10);
    }

    public void K(boolean z10) {
        this.f24256f.n(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f24271u) {
            this.f24271u = false;
            N(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f24269s = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f24271u) {
            return;
        }
        this.f24271u = true;
        N(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f24274x;
        if (hVar != null) {
            hVar.a();
            this.f24274x = null;
        }
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public boolean g() {
        J j10 = this.f24256f;
        if (j10 == null || !j10.h()) {
            return false;
        }
        this.f24256f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void h(boolean z10) {
        if (z10 == this.f24265o) {
            return;
        }
        this.f24265o = z10;
        if (this.f24266p.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f24266p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public int i() {
        return this.f24256f.v();
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public Context j() {
        if (this.f24252b == null) {
            TypedValue typedValue = new TypedValue();
            this.f24251a.getTheme().resolveAttribute(AbstractC4956a.f47958e, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f24252b = new ContextThemeWrapper(this.f24251a, i10);
            } else {
                this.f24252b = this.f24251a;
            }
        }
        return this.f24252b;
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void l(Configuration configuration) {
        I(androidx.appcompat.view.a.b(this.f24251a).e());
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public boolean n(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f24262l;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f24268r = i10;
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void q(boolean z10) {
        if (this.f24261k) {
            return;
        }
        r(z10);
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void r(boolean z10) {
        G(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void s(Drawable drawable) {
        this.f24256f.x(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void t(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f24275y = z10;
        if (z10 || (hVar = this.f24274x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void u(CharSequence charSequence) {
        this.f24256f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void v(CharSequence charSequence) {
        this.f24256f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public androidx.appcompat.view.b w(b.a aVar) {
        d dVar = this.f24262l;
        if (dVar != null) {
            dVar.c();
        }
        this.f24254d.setHideOnContentScrollEnabled(false);
        this.f24257g.k();
        d dVar2 = new d(this.f24257g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f24262l = dVar2;
        dVar2.k();
        this.f24257g.h(dVar2);
        x(true);
        return dVar2;
    }

    public void x(boolean z10) {
        C2767k0 c2767k0L;
        C2767k0 c2767k0F;
        if (z10) {
            M();
        } else {
            E();
        }
        if (!L()) {
            if (z10) {
                this.f24256f.u(4);
                this.f24257g.setVisibility(0);
                return;
            } else {
                this.f24256f.u(0);
                this.f24257g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            c2767k0F = this.f24256f.l(4, 100L);
            c2767k0L = this.f24257g.f(0, 200L);
        } else {
            c2767k0L = this.f24256f.l(0, 200L);
            c2767k0F = this.f24257g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(c2767k0F, c2767k0L);
        hVar.h();
    }

    void z() {
        b.a aVar = this.f24264n;
        if (aVar != null) {
            aVar.a(this.f24263m);
            this.f24263m = null;
            this.f24264n = null;
        }
    }

    public A(Dialog dialog) {
        F(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }
}
