package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2748b;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: n.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class MenuItemC5706c extends AbstractC5705b implements MenuItem {

    /* JADX INFO: renamed from: d */
    private final D1.b f53779d;

    /* JADX INFO: renamed from: e */
    private Method f53780e;

    /* JADX INFO: renamed from: n.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends AbstractC2748b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d */
        private AbstractC2748b.InterfaceC0496b f53781d;

        /* JADX INFO: renamed from: e */
        private final ActionProvider f53782e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f53782e = actionProvider;
        }

        @Override // androidx.core.view.AbstractC2748b
        public boolean a() {
            return this.f53782e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC2748b
        public boolean b() {
            return this.f53782e.isVisible();
        }

        @Override // androidx.core.view.AbstractC2748b
        public View c(MenuItem menuItem) {
            return this.f53782e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC2748b
        public boolean d() {
            return this.f53782e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC2748b
        public void e(SubMenu subMenu) {
            this.f53782e.onPrepareSubMenu(MenuItemC5706c.this.d(subMenu));
        }

        @Override // androidx.core.view.AbstractC2748b
        public boolean f() {
            return this.f53782e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC2748b
        public void i(AbstractC2748b.InterfaceC0496b interfaceC0496b) {
            this.f53781d = interfaceC0496b;
            this.f53782e.setVisibilityListener(interfaceC0496b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC2748b.InterfaceC0496b interfaceC0496b = this.f53781d;
            if (interfaceC0496b != null) {
                interfaceC0496b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* JADX INFO: renamed from: n.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* JADX INFO: renamed from: a */
        final CollapsibleActionView f53784a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f53784a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f53784a;
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewCollapsed() {
            this.f53784a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewExpanded() {
            this.f53784a.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: n.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class MenuItemOnActionExpandListenerC0837c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        private final MenuItem.OnActionExpandListener f53785a;

        MenuItemOnActionExpandListenerC0837c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f53785a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f53785a.onMenuItemActionCollapse(MenuItemC5706c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f53785a.onMenuItemActionExpand(MenuItemC5706c.this.c(menuItem));
        }
    }

    /* JADX INFO: renamed from: n.c$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        private final MenuItem.OnMenuItemClickListener f53787a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f53787a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f53787a.onMenuItemClick(MenuItemC5706c.this.c(menuItem));
        }
    }

    public MenuItemC5706c(Context context, D1.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f53779d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f53779d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f53779d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC2748b abstractC2748bA = this.f53779d.a();
        if (abstractC2748bA instanceof a) {
            return ((a) abstractC2748bA).f53782e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f53779d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f53779d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f53779d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f53779d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f53779d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f53779d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f53779d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f53779d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f53779d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f53779d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f53779d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f53779d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f53779d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f53779d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f53779d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f53779d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f53779d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f53779d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f53780e == null) {
                this.f53780e = this.f53779d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f53780e.invoke(this.f53779d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f53779d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f53779d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f53779d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f53779d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f53779d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f53779d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f53776a, actionProvider);
        D1.b bVar = this.f53779d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f53779d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f53779d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f53779d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f53779d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f53779d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f53779d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f53779d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f53779d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f53779d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f53779d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f53779d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f53779d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0837c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f53779d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f53779d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f53779d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f53779d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f53779d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f53779d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f53779d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f53779d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f53779d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f53779d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f53779d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f53779d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f53779d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f53779d.setActionView(i10);
        View actionView = this.f53779d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f53779d.setActionView(new b(actionView));
        }
        return this;
    }
}
