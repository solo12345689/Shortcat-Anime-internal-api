package n;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import t.i0;

/* JADX INFO: renamed from: n.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5705b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f53776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i0 f53777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i0 f53778c;

    AbstractC5705b(Context context) {
        this.f53776a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof D1.b)) {
            return menuItem;
        }
        D1.b bVar = (D1.b) menuItem;
        if (this.f53777b == null) {
            this.f53777b = new i0();
        }
        MenuItem menuItem2 = (MenuItem) this.f53777b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC5706c menuItemC5706c = new MenuItemC5706c(this.f53776a, bVar);
        this.f53777b.put(bVar, menuItemC5706c);
        return menuItemC5706c;
    }

    final void e() {
        i0 i0Var = this.f53777b;
        if (i0Var != null) {
            i0Var.clear();
        }
        i0 i0Var2 = this.f53778c;
        if (i0Var2 != null) {
            i0Var2.clear();
        }
    }

    final void f(int i10) {
        if (this.f53777b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f53777b.size()) {
            if (((D1.b) this.f53777b.g(i11)).getGroupId() == i10) {
                this.f53777b.i(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f53777b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f53777b.size(); i11++) {
            if (((D1.b) this.f53777b.g(i11)).getItemId() == i10) {
                this.f53777b.i(i11);
                return;
            }
        }
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
