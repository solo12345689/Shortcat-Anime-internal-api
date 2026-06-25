package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.AbstractC2771m0;
import androidx.core.view.C2767k0;
import i.AbstractC4956a;
import j.AbstractC5323a;
import n.C5704a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class l0 implements J {

    /* JADX INFO: renamed from: a */
    Toolbar f25443a;

    /* JADX INFO: renamed from: b */
    private int f25444b;

    /* JADX INFO: renamed from: c */
    private View f25445c;

    /* JADX INFO: renamed from: d */
    private View f25446d;

    /* JADX INFO: renamed from: e */
    private Drawable f25447e;

    /* JADX INFO: renamed from: f */
    private Drawable f25448f;

    /* JADX INFO: renamed from: g */
    private Drawable f25449g;

    /* JADX INFO: renamed from: h */
    private boolean f25450h;

    /* JADX INFO: renamed from: i */
    CharSequence f25451i;

    /* JADX INFO: renamed from: j */
    private CharSequence f25452j;

    /* JADX INFO: renamed from: k */
    private CharSequence f25453k;

    /* JADX INFO: renamed from: l */
    Window.Callback f25454l;

    /* JADX INFO: renamed from: m */
    boolean f25455m;

    /* JADX INFO: renamed from: n */
    private C2649c f25456n;

    /* JADX INFO: renamed from: o */
    private int f25457o;

    /* JADX INFO: renamed from: p */
    private int f25458p;

    /* JADX INFO: renamed from: q */
    private Drawable f25459q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final C5704a f25460a;

        a() {
            this.f25460a = new C5704a(l0.this.f25443a.getContext(), 0, R.id.home, 0, 0, l0.this.f25451i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l0 l0Var = l0.this;
            Window.Callback callback = l0Var.f25454l;
            if (callback == null || !l0Var.f25455m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f25460a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractC2771m0 {

        /* JADX INFO: renamed from: a */
        private boolean f25462a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f25463b;

        b(int i10) {
            this.f25463b = i10;
        }

        @Override // androidx.core.view.AbstractC2771m0, androidx.core.view.InterfaceC2769l0
        public void a(View view) {
            this.f25462a = true;
        }

        @Override // androidx.core.view.InterfaceC2769l0
        public void b(View view) {
            if (this.f25462a) {
                return;
            }
            l0.this.f25443a.setVisibility(this.f25463b);
        }

        @Override // androidx.core.view.AbstractC2771m0, androidx.core.view.InterfaceC2769l0
        public void c(View view) {
            l0.this.f25443a.setVisibility(0);
        }
    }

    public l0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, i.h.f48110a, i.e.f48034n);
    }

    private void F(CharSequence charSequence) {
        this.f25451i = charSequence;
        if ((this.f25444b & 8) != 0) {
            this.f25443a.setTitle(charSequence);
            if (this.f25450h) {
                AbstractC2747a0.n0(this.f25443a.getRootView(), charSequence);
            }
        }
    }

    private void G() {
        if ((this.f25444b & 4) != 0) {
            if (TextUtils.isEmpty(this.f25453k)) {
                this.f25443a.setNavigationContentDescription(this.f25458p);
            } else {
                this.f25443a.setNavigationContentDescription(this.f25453k);
            }
        }
    }

    private void H() {
        if ((this.f25444b & 4) == 0) {
            this.f25443a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f25443a;
        Drawable drawable = this.f25449g;
        if (drawable == null) {
            drawable = this.f25459q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i10 = this.f25444b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f25448f) == null) {
            drawable = this.f25447e;
        }
        this.f25443a.setLogo(drawable);
    }

    private int y() {
        if (this.f25443a.getNavigationIcon() == null) {
            return 11;
        }
        this.f25459q = this.f25443a.getNavigationIcon();
        return 15;
    }

    public void A(int i10) {
        if (i10 == this.f25458p) {
            return;
        }
        this.f25458p = i10;
        if (TextUtils.isEmpty(this.f25443a.getNavigationContentDescription())) {
            C(this.f25458p);
        }
    }

    public void B(Drawable drawable) {
        this.f25448f = drawable;
        I();
    }

    public void C(int i10) {
        D(i10 == 0 ? null : getContext().getString(i10));
    }

    public void D(CharSequence charSequence) {
        this.f25453k = charSequence;
        G();
    }

    public void E(CharSequence charSequence) {
        this.f25452j = charSequence;
        if ((this.f25444b & 8) != 0) {
            this.f25443a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.J
    public boolean a() {
        return this.f25443a.d();
    }

    @Override // androidx.appcompat.widget.J
    public boolean b() {
        return this.f25443a.w();
    }

    @Override // androidx.appcompat.widget.J
    public boolean c() {
        return this.f25443a.Q();
    }

    @Override // androidx.appcompat.widget.J
    public void collapseActionView() {
        this.f25443a.e();
    }

    @Override // androidx.appcompat.widget.J
    public void d(Menu menu, j.a aVar) {
        if (this.f25456n == null) {
            C2649c c2649c = new C2649c(this.f25443a.getContext());
            this.f25456n = c2649c;
            c2649c.r(i.f.f48071h);
        }
        this.f25456n.e(aVar);
        this.f25443a.K((androidx.appcompat.view.menu.e) menu, this.f25456n);
    }

    @Override // androidx.appcompat.widget.J
    public boolean e() {
        return this.f25443a.B();
    }

    @Override // androidx.appcompat.widget.J
    public void f() {
        this.f25455m = true;
    }

    @Override // androidx.appcompat.widget.J
    public boolean g() {
        return this.f25443a.A();
    }

    @Override // androidx.appcompat.widget.J
    public Context getContext() {
        return this.f25443a.getContext();
    }

    @Override // androidx.appcompat.widget.J
    public CharSequence getTitle() {
        return this.f25443a.getTitle();
    }

    @Override // androidx.appcompat.widget.J
    public boolean h() {
        return this.f25443a.v();
    }

    @Override // androidx.appcompat.widget.J
    public void i(int i10) {
        View view;
        int i11 = this.f25444b ^ i10;
        this.f25444b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i11 & 3) != 0) {
                I();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f25443a.setTitle(this.f25451i);
                    this.f25443a.setSubtitle(this.f25452j);
                } else {
                    this.f25443a.setTitle((CharSequence) null);
                    this.f25443a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f25446d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f25443a.addView(view);
            } else {
                this.f25443a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.J
    public Menu j() {
        return this.f25443a.getMenu();
    }

    @Override // androidx.appcompat.widget.J
    public int k() {
        return this.f25457o;
    }

    @Override // androidx.appcompat.widget.J
    public C2767k0 l(int i10, long j10) {
        return AbstractC2747a0.e(this.f25443a).b(i10 == 0 ? 1.0f : 0.0f).e(j10).g(new b(i10));
    }

    @Override // androidx.appcompat.widget.J
    public ViewGroup m() {
        return this.f25443a;
    }

    @Override // androidx.appcompat.widget.J
    public void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.J
    public void p(boolean z10) {
        this.f25443a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.J
    public void q() {
        this.f25443a.f();
    }

    @Override // androidx.appcompat.widget.J
    public void r(a0 a0Var) {
        View view = this.f25445c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f25443a;
            if (parent == toolbar) {
                toolbar.removeView(this.f25445c);
            }
        }
        this.f25445c = a0Var;
    }

    @Override // androidx.appcompat.widget.J
    public void s(int i10) {
        B(i10 != 0 ? AbstractC5323a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? AbstractC5323a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.J
    public void setTitle(CharSequence charSequence) {
        this.f25450h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowCallback(Window.Callback callback) {
        this.f25454l = callback;
    }

    @Override // androidx.appcompat.widget.J
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f25450h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.J
    public void t(j.a aVar, e.a aVar2) {
        this.f25443a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.J
    public void u(int i10) {
        this.f25443a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.J
    public int v() {
        return this.f25444b;
    }

    @Override // androidx.appcompat.widget.J
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.J
    public void x(Drawable drawable) {
        this.f25449g = drawable;
        H();
    }

    public void z(View view) {
        View view2 = this.f25446d;
        if (view2 != null && (this.f25444b & 16) != 0) {
            this.f25443a.removeView(view2);
        }
        this.f25446d = view;
        if (view == null || (this.f25444b & 16) == 0) {
            return;
        }
        this.f25443a.addView(view);
    }

    public l0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f25457o = 0;
        this.f25458p = 0;
        this.f25443a = toolbar;
        this.f25451i = toolbar.getTitle();
        this.f25452j = toolbar.getSubtitle();
        this.f25450h = this.f25451i != null;
        this.f25449g = toolbar.getNavigationIcon();
        h0 h0VarV = h0.v(toolbar.getContext(), null, i.j.f48258a, AbstractC4956a.f47956c, 0);
        this.f25459q = h0VarV.g(i.j.f48313l);
        if (z10) {
            CharSequence charSequenceP = h0VarV.p(i.j.f48343r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = h0VarV.p(i.j.f48333p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                E(charSequenceP2);
            }
            Drawable drawableG = h0VarV.g(i.j.f48323n);
            if (drawableG != null) {
                B(drawableG);
            }
            Drawable drawableG2 = h0VarV.g(i.j.f48318m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f25449g == null && (drawable = this.f25459q) != null) {
                x(drawable);
            }
            i(h0VarV.k(i.j.f48293h, 0));
            int iN = h0VarV.n(i.j.f48288g, 0);
            if (iN != 0) {
                z(LayoutInflater.from(this.f25443a.getContext()).inflate(iN, (ViewGroup) this.f25443a, false));
                i(this.f25444b | 16);
            }
            int iM = h0VarV.m(i.j.f48303j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f25443a.getLayoutParams();
                layoutParams.height = iM;
                this.f25443a.setLayoutParams(layoutParams);
            }
            int iE = h0VarV.e(i.j.f48283f, -1);
            int iE2 = h0VarV.e(i.j.f48278e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f25443a.J(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = h0VarV.n(i.j.f48348s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f25443a;
                toolbar2.N(toolbar2.getContext(), iN2);
            }
            int iN3 = h0VarV.n(i.j.f48338q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f25443a;
                toolbar3.M(toolbar3.getContext(), iN3);
            }
            int iN4 = h0VarV.n(i.j.f48328o, 0);
            if (iN4 != 0) {
                this.f25443a.setPopupTheme(iN4);
            }
        } else {
            this.f25444b = y();
        }
        h0VarV.x();
        A(i10);
        this.f25453k = this.f25443a.getNavigationContentDescription();
        this.f25443a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.J
    public void setIcon(Drawable drawable) {
        this.f25447e = drawable;
        I();
    }

    @Override // androidx.appcompat.widget.J
    public void n(boolean z10) {
    }
}
