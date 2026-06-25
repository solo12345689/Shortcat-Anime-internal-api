package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.W;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f24807v = i.g.f48102m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f24808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f24809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f24810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f24811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f24812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f24813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f24814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final W f24815i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f24818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f24819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    View f24820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j.a f24821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ViewTreeObserver f24822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f24823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f24824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f24825s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f24827u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f24816j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f24817k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f24826t = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.b() || l.this.f24815i.B()) {
                return;
            }
            View view = l.this.f24820n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f24815i.c();
            }
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f24808b = context;
        this.f24809c = eVar;
        this.f24811e = z10;
        this.f24810d = new d(eVar, LayoutInflater.from(context), z10, f24807v);
        this.f24813g = i10;
        this.f24814h = i11;
        Resources resources = context.getResources();
        this.f24812f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f47990b));
        this.f24819m = view;
        this.f24815i = new W(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean B() {
        View view;
        if (b()) {
            return true;
        }
        if (this.f24823q || (view = this.f24819m) == null) {
            return false;
        }
        this.f24820n = view;
        this.f24815i.K(this);
        this.f24815i.L(this);
        this.f24815i.J(true);
        View view2 = this.f24820n;
        boolean z10 = this.f24822p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f24822p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f24816j);
        }
        view2.addOnAttachStateChangeListener(this.f24817k);
        this.f24815i.D(view2);
        this.f24815i.G(this.f24826t);
        if (!this.f24824r) {
            this.f24825s = h.q(this.f24810d, null, this.f24808b, this.f24812f);
            this.f24824r = true;
        }
        this.f24815i.F(this.f24825s);
        this.f24815i.I(2);
        this.f24815i.H(p());
        this.f24815i.c();
        ListView listViewO = this.f24815i.o();
        listViewO.setOnKeyListener(this);
        if (this.f24827u && this.f24809c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f24808b).inflate(i.g.f48101l, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f24809c.z());
            }
            frameLayout.setEnabled(false);
            listViewO.addHeaderView(frameLayout, null, false);
        }
        this.f24815i.m(this.f24810d);
        this.f24815i.c();
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z10) {
        if (eVar != this.f24809c) {
            return;
        }
        dismiss();
        j.a aVar = this.f24821o;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    @Override // n.InterfaceC5708e
    public boolean b() {
        return !this.f24823q && this.f24815i.b();
    }

    @Override // n.InterfaceC5708e
    public void c() {
        if (!B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // n.InterfaceC5708e
    public void dismiss() {
        if (b()) {
            this.f24815i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f24821o = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f24808b, mVar, this.f24820n, this.f24811e, this.f24813g, this.f24814h);
            iVar.j(this.f24821o);
            iVar.g(h.z(mVar));
            iVar.i(this.f24818l);
            this.f24818l = null;
            this.f24809c.e(false);
            int iA = this.f24815i.a();
            int iL = this.f24815i.l();
            if ((Gravity.getAbsoluteGravity(this.f24826t, this.f24819m.getLayoutDirection()) & 7) == 5) {
                iA += this.f24819m.getWidth();
            }
            if (iVar.n(iA, iL)) {
                j.a aVar = this.f24821o;
                if (aVar == null) {
                    return true;
                }
                aVar.b(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        this.f24824r = false;
        d dVar = this.f24810d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // n.InterfaceC5708e
    public ListView o() {
        return this.f24815i.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f24823q = true;
        this.f24809c.close();
        ViewTreeObserver viewTreeObserver = this.f24822p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f24822p = this.f24820n.getViewTreeObserver();
            }
            this.f24822p.removeGlobalOnLayoutListener(this.f24816j);
            this.f24822p = null;
        }
        this.f24820n.removeOnAttachStateChangeListener(this.f24817k);
        PopupWindow.OnDismissListener onDismissListener = this.f24818l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(View view) {
        this.f24819m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(boolean z10) {
        this.f24810d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(int i10) {
        this.f24826t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f24815i.e(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.f24818l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(boolean z10) {
        this.f24827u = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void y(int i10) {
        this.f24815i.i(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f24822p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f24822p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f24822p.removeGlobalOnLayoutListener(lVar.f24816j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.h
    public void m(e eVar) {
    }
}
