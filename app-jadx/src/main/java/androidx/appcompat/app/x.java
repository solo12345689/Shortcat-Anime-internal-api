package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l0;
import androidx.core.view.AbstractC2747a0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class x extends AbstractC2646a {

    /* JADX INFO: renamed from: a */
    final J f24535a;

    /* JADX INFO: renamed from: b */
    final Window.Callback f24536b;

    /* JADX INFO: renamed from: c */
    final h.f f24537c;

    /* JADX INFO: renamed from: d */
    boolean f24538d;

    /* JADX INFO: renamed from: e */
    private boolean f24539e;

    /* JADX INFO: renamed from: f */
    private boolean f24540f;

    /* JADX INFO: renamed from: g */
    private ArrayList f24541g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final Runnable f24542h = new a();

    /* JADX INFO: renamed from: i */
    private final Toolbar.h f24543i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.y();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return x.this.f24536b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements j.a {

        /* JADX INFO: renamed from: a */
        private boolean f24546a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f24546a) {
                return;
            }
            this.f24546a = true;
            x.this.f24535a.q();
            x.this.f24536b.onPanelClosed(108, eVar);
            this.f24546a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            x.this.f24536b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (x.this.f24535a.e()) {
                x.this.f24536b.onPanelClosed(108, eVar);
            } else if (x.this.f24536b.onPreparePanel(0, null, eVar)) {
                x.this.f24536b.onMenuOpened(108, eVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class e implements h.f {
        e() {
        }

        @Override // androidx.appcompat.app.h.f
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            x xVar = x.this;
            if (xVar.f24538d) {
                return false;
            }
            xVar.f24535a.f();
            x.this.f24538d = true;
            return false;
        }

        @Override // androidx.appcompat.app.h.f
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(x.this.f24535a.getContext());
            }
            return null;
        }
    }

    x(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f24543i = bVar;
        K1.f.g(toolbar);
        l0 l0Var = new l0(toolbar, false);
        this.f24535a = l0Var;
        this.f24536b = (Window.Callback) K1.f.g(callback);
        l0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        l0Var.setWindowTitle(charSequence);
        this.f24537c = new e();
    }

    private Menu x() {
        if (!this.f24539e) {
            this.f24535a.t(new c(), new d());
            this.f24539e = true;
        }
        return this.f24535a.j();
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public boolean f() {
        return this.f24535a.b();
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public boolean g() {
        if (!this.f24535a.h()) {
            return false;
        }
        this.f24535a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void h(boolean z10) {
        if (z10 == this.f24540f) {
            return;
        }
        this.f24540f = z10;
        if (this.f24541g.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f24541g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public int i() {
        return this.f24535a.v();
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public Context j() {
        return this.f24535a.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public boolean k() {
        this.f24535a.m().removeCallbacks(this.f24542h);
        AbstractC2747a0.c0(this.f24535a.m(), this.f24542h);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void l(Configuration configuration) {
        super.l(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    void m() {
        this.f24535a.m().removeCallbacks(this.f24542h);
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public boolean n(int i10, KeyEvent keyEvent) {
        Menu menuX = x();
        if (menuX == null) {
            return false;
        }
        menuX.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuX.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public boolean p() {
        return this.f24535a.c();
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void r(boolean z10) {
        z(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void s(Drawable drawable) {
        this.f24535a.x(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void u(CharSequence charSequence) {
        this.f24535a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void v(CharSequence charSequence) {
        this.f24535a.setWindowTitle(charSequence);
    }

    void y() {
        Menu menuX = x();
        androidx.appcompat.view.menu.e eVar = menuX instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuX : null;
        if (eVar != null) {
            eVar.i0();
        }
        try {
            menuX.clear();
            if (!this.f24536b.onCreatePanelMenu(0, menuX) || !this.f24536b.onPreparePanel(0, null, menuX)) {
                menuX.clear();
            }
            if (eVar != null) {
                eVar.h0();
            }
        } catch (Throwable th2) {
            if (eVar != null) {
                eVar.h0();
            }
            throw th2;
        }
    }

    public void z(int i10, int i11) {
        this.f24535a.i((i10 & i11) | ((~i11) & this.f24535a.v()));
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void q(boolean z10) {
    }

    @Override // androidx.appcompat.app.AbstractC2646a
    public void t(boolean z10) {
    }
}
