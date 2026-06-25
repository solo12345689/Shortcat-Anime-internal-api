package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import java.util.ArrayList;
import n.MenuC5707d;
import n.MenuItemC5706c;
import t.i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f24576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f24577b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f24578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f24579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f24580c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final i0 f24581d = new i0();

        public a(Context context, ActionMode.Callback callback) {
            this.f24579b = context;
            this.f24578a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f24581d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC5707d menuC5707d = new MenuC5707d(this.f24579b, (D1.a) menu);
            this.f24581d.put(menu, menuC5707d);
            return menuC5707d;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f24578a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f24578a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f24578a.onActionItemClicked(e(bVar), new MenuItemC5706c(this.f24579b, (D1.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f24578a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f24580c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f24580c.get(i10);
                if (fVar != null && fVar.f24577b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f24579b, bVar);
            this.f24580c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f24576a = context;
        this.f24577b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f24577b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f24577b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC5707d(this.f24576a, (D1.a) this.f24577b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f24577b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f24577b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f24577b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f24577b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f24577b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f24577b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f24577b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f24577b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f24577b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f24577b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f24577b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f24577b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f24577b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f24577b.q(i10);
    }
}
