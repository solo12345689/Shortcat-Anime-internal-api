package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class m extends e implements SubMenu {

    /* JADX INFO: renamed from: B */
    private e f24830B;

    /* JADX INFO: renamed from: C */
    private g f24831C;

    public m(Context context, e eVar, g gVar) {
        super(context);
        this.f24830B = eVar;
        this.f24831C = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e F() {
        return this.f24830B.F();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.f24830B.I();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean J() {
        return this.f24830B.J();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean K() {
        return this.f24830B.K();
    }

    @Override // androidx.appcompat.view.menu.e
    public void W(e.a aVar) {
        this.f24830B.W(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f24830B.f(gVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f24831C;
    }

    @Override // androidx.appcompat.view.menu.e
    boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f24830B.h(eVar, menuItem);
    }

    public Menu j0() {
        return this.f24830B;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean m(g gVar) {
        return this.f24830B.m(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f24830B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.d0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.e0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f24831C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f24830B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.e
    public String v() {
        g gVar = this.f24831C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.v() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.Z(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.c0(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f24831C.setIcon(i10);
        return this;
    }
}
