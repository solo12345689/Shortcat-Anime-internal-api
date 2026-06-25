package M0;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5082a f11626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C6226h f11627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5082a f11628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC5082a f11629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC5082a f11630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC5082a f11631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC5082a f11632g;

    public c(InterfaceC5082a interfaceC5082a, C6226h c6226h, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, InterfaceC5082a interfaceC5082a5, InterfaceC5082a interfaceC5082a6) {
        this.f11626a = interfaceC5082a;
        this.f11627b = c6226h;
        this.f11628c = interfaceC5082a2;
        this.f11629d = interfaceC5082a3;
        this.f11630e = interfaceC5082a4;
        this.f11631f = interfaceC5082a5;
        this.f11632g = interfaceC5082a6;
    }

    private final void b(Menu menu, b bVar, InterfaceC5082a interfaceC5082a) {
        if (interfaceC5082a != null && menu.findItem(bVar.b()) == null) {
            a(menu, bVar);
        } else {
            if (interfaceC5082a != null || menu.findItem(bVar.b()) == null) {
                return;
            }
            menu.removeItem(bVar.b());
        }
    }

    public final void a(Menu menu, b bVar) {
        menu.add(0, bVar.b(), bVar.c(), bVar.h()).setShowAsAction(1);
    }

    public final C6226h c() {
        return this.f11627b;
    }

    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        AbstractC5504s.e(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == b.f11616c.b()) {
            InterfaceC5082a interfaceC5082a = this.f11628c;
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
        } else if (itemId == b.f11617d.b()) {
            InterfaceC5082a interfaceC5082a2 = this.f11629d;
            if (interfaceC5082a2 != null) {
                interfaceC5082a2.invoke();
            }
        } else if (itemId == b.f11618e.b()) {
            InterfaceC5082a interfaceC5082a3 = this.f11630e;
            if (interfaceC5082a3 != null) {
                interfaceC5082a3.invoke();
            }
        } else if (itemId == b.f11619f.b()) {
            InterfaceC5082a interfaceC5082a4 = this.f11631f;
            if (interfaceC5082a4 != null) {
                interfaceC5082a4.invoke();
            }
        } else {
            if (itemId != b.f11620g.b()) {
                return false;
            }
            InterfaceC5082a interfaceC5082a5 = this.f11632g;
            if (interfaceC5082a5 != null) {
                interfaceC5082a5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.f11628c != null) {
            a(menu, b.f11616c);
        }
        if (this.f11629d != null) {
            a(menu, b.f11617d);
        }
        if (this.f11630e != null) {
            a(menu, b.f11618e);
        }
        if (this.f11631f != null) {
            a(menu, b.f11619f);
        }
        if (this.f11632g == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        a(menu, b.f11620g);
        return true;
    }

    public final void f() {
        InterfaceC5082a interfaceC5082a = this.f11626a;
        if (interfaceC5082a != null) {
            interfaceC5082a.invoke();
        }
    }

    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        n(menu);
        return true;
    }

    public final void h(InterfaceC5082a interfaceC5082a) {
        this.f11632g = interfaceC5082a;
    }

    public final void i(InterfaceC5082a interfaceC5082a) {
        this.f11628c = interfaceC5082a;
    }

    public final void j(InterfaceC5082a interfaceC5082a) {
        this.f11630e = interfaceC5082a;
    }

    public final void k(InterfaceC5082a interfaceC5082a) {
        this.f11629d = interfaceC5082a;
    }

    public final void l(InterfaceC5082a interfaceC5082a) {
        this.f11631f = interfaceC5082a;
    }

    public final void m(C6226h c6226h) {
        this.f11627b = c6226h;
    }

    public final void n(Menu menu) {
        b(menu, b.f11616c, this.f11628c);
        b(menu, b.f11617d, this.f11629d);
        b(menu, b.f11618e, this.f11630e);
        b(menu, b.f11619f, this.f11631f);
        b(menu, b.f11620g, this.f11632g);
    }

    public /* synthetic */ c(InterfaceC5082a interfaceC5082a, C6226h c6226h, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, InterfaceC5082a interfaceC5082a5, InterfaceC5082a interfaceC5082a6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : interfaceC5082a, (i10 & 2) != 0 ? C6226h.f58334e.a() : c6226h, (i10 & 4) != 0 ? null : interfaceC5082a2, (i10 & 8) != 0 ? null : interfaceC5082a3, (i10 & 16) != 0 ? null : interfaceC5082a4, (i10 & 32) != 0 ? null : interfaceC5082a5, (i10 & 64) != 0 ? null : interfaceC5082a6);
    }
}
