package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e extends b implements e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f24569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActionBarContextView f24570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f24571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f24572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f24575i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f24569c = context;
        this.f24570d = actionBarContextView;
        this.f24571e = aVar;
        androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).X(1);
        this.f24575i = eVarX;
        eVarX.W(this);
        this.f24574h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f24571e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f24570d.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f24573g) {
            return;
        }
        this.f24573g = true;
        this.f24571e.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f24572f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f24575i;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f24570d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f24570d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f24570d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f24571e.d(this, this.f24575i);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f24570d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f24570d.setCustomView(view);
        this.f24572f = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f24569c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f24570d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f24569c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f24570d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f24570d.setTitleOptional(z10);
    }
}
