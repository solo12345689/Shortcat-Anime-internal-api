package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.AbstractC2748b;
import j.AbstractC5323a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements D1.b {

    /* JADX INFO: renamed from: A */
    private View f24761A;

    /* JADX INFO: renamed from: B */
    private AbstractC2748b f24762B;

    /* JADX INFO: renamed from: C */
    private MenuItem.OnActionExpandListener f24763C;

    /* JADX INFO: renamed from: E */
    private ContextMenu.ContextMenuInfo f24765E;

    /* JADX INFO: renamed from: a */
    private final int f24766a;

    /* JADX INFO: renamed from: b */
    private final int f24767b;

    /* JADX INFO: renamed from: c */
    private final int f24768c;

    /* JADX INFO: renamed from: d */
    private final int f24769d;

    /* JADX INFO: renamed from: e */
    private CharSequence f24770e;

    /* JADX INFO: renamed from: f */
    private CharSequence f24771f;

    /* JADX INFO: renamed from: g */
    private Intent f24772g;

    /* JADX INFO: renamed from: h */
    private char f24773h;

    /* JADX INFO: renamed from: j */
    private char f24775j;

    /* JADX INFO: renamed from: l */
    private Drawable f24777l;

    /* JADX INFO: renamed from: n */
    e f24779n;

    /* JADX INFO: renamed from: o */
    private m f24780o;

    /* JADX INFO: renamed from: p */
    private Runnable f24781p;

    /* JADX INFO: renamed from: q */
    private MenuItem.OnMenuItemClickListener f24782q;

    /* JADX INFO: renamed from: r */
    private CharSequence f24783r;

    /* JADX INFO: renamed from: s */
    private CharSequence f24784s;

    /* JADX INFO: renamed from: z */
    private int f24791z;

    /* JADX INFO: renamed from: i */
    private int f24774i = 4096;

    /* JADX INFO: renamed from: k */
    private int f24776k = 4096;

    /* JADX INFO: renamed from: m */
    private int f24778m = 0;

    /* JADX INFO: renamed from: t */
    private ColorStateList f24785t = null;

    /* JADX INFO: renamed from: u */
    private PorterDuff.Mode f24786u = null;

    /* JADX INFO: renamed from: v */
    private boolean f24787v = false;

    /* JADX INFO: renamed from: w */
    private boolean f24788w = false;

    /* JADX INFO: renamed from: x */
    private boolean f24789x = false;

    /* JADX INFO: renamed from: y */
    private int f24790y = 16;

    /* JADX INFO: renamed from: D */
    private boolean f24764D = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements AbstractC2748b.InterfaceC0496b {
        a() {
        }

        @Override // androidx.core.view.AbstractC2748b.InterfaceC0496b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f24779n.M(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f24779n = eVar;
        this.f24766a = i11;
        this.f24767b = i10;
        this.f24768c = i12;
        this.f24769d = i13;
        this.f24770e = charSequence;
        this.f24791z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f24789x && (this.f24787v || this.f24788w)) {
            drawable = B1.a.r(drawable).mutate();
            if (this.f24787v) {
                B1.a.o(drawable, this.f24785t);
            }
            if (this.f24788w) {
                B1.a.p(drawable, this.f24786u);
            }
            this.f24789x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f24779n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f24791z & 4) == 4;
    }

    @Override // D1.b
    public AbstractC2748b a() {
        return this.f24762B;
    }

    @Override // D1.b
    public D1.b b(AbstractC2748b abstractC2748b) {
        AbstractC2748b abstractC2748b2 = this.f24762B;
        if (abstractC2748b2 != null) {
            abstractC2748b2.g();
        }
        this.f24761A = null;
        this.f24762B = abstractC2748b;
        this.f24779n.N(true);
        AbstractC2748b abstractC2748b3 = this.f24762B;
        if (abstractC2748b3 != null) {
            abstractC2748b3.i(new a());
        }
        return this;
    }

    public void c() {
        this.f24779n.L(this);
    }

    @Override // D1.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f24791z & 8) == 0) {
            return false;
        }
        if (this.f24761A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f24763C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f24779n.f(this);
        }
        return false;
    }

    @Override // D1.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f24763C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f24779n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f24769d;
    }

    char g() {
        return this.f24779n.J() ? this.f24775j : this.f24773h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // D1.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f24761A;
        if (view != null) {
            return view;
        }
        AbstractC2748b abstractC2748b = this.f24762B;
        if (abstractC2748b == null) {
            return null;
        }
        View viewC = abstractC2748b.c(this);
        this.f24761A = viewC;
        return viewC;
    }

    @Override // D1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f24776k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f24775j;
    }

    @Override // D1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f24783r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f24767b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f24777l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f24778m == 0) {
            return null;
        }
        Drawable drawableB = AbstractC5323a.b(this.f24779n.w(), this.f24778m);
        this.f24778m = 0;
        this.f24777l = drawableB;
        return e(drawableB);
    }

    @Override // D1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f24785t;
    }

    @Override // D1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f24786u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f24772g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f24766a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f24765E;
    }

    @Override // D1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f24774i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f24773h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f24768c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f24780o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f24770e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f24771f;
        return charSequence != null ? charSequence : this.f24770e;
    }

    @Override // D1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f24784s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f24779n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f24779n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(i.h.f48122m));
        }
        int i10 = this.f24779n.J() ? this.f24776k : this.f24774i;
        d(sb2, i10, 65536, resources.getString(i.h.f48118i));
        d(sb2, i10, 4096, resources.getString(i.h.f48114e));
        d(sb2, i10, 2, resources.getString(i.h.f48113d));
        d(sb2, i10, 1, resources.getString(i.h.f48119j));
        d(sb2, i10, 4, resources.getString(i.h.f48121l));
        d(sb2, i10, 8, resources.getString(i.h.f48117h));
        if (cG == '\b') {
            sb2.append(resources.getString(i.h.f48115f));
        } else if (cG == '\n') {
            sb2.append(resources.getString(i.h.f48116g));
        } else if (cG != ' ') {
            sb2.append(cG);
        } else {
            sb2.append(resources.getString(i.h.f48120k));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f24780o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // D1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f24764D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f24790y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f24790y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f24790y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC2748b abstractC2748b = this.f24762B;
        return (abstractC2748b == null || !abstractC2748b.f()) ? (this.f24790y & 8) == 0 : (this.f24790y & 8) == 0 && this.f24762B.b();
    }

    public boolean j() {
        AbstractC2748b abstractC2748b;
        if ((this.f24791z & 8) != 0) {
            if (this.f24761A == null && (abstractC2748b = this.f24762B) != null) {
                this.f24761A = abstractC2748b.c(this);
            }
            if (this.f24761A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f24782q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f24779n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f24781p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f24772g != null) {
            try {
                this.f24779n.w().startActivity(this.f24772g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC2748b abstractC2748b = this.f24762B;
        return abstractC2748b != null && abstractC2748b.d();
    }

    public boolean l() {
        return (this.f24790y & 32) == 32;
    }

    public boolean m() {
        return (this.f24790y & 4) != 0;
    }

    public boolean n() {
        return (this.f24791z & 1) == 1;
    }

    public boolean o() {
        return (this.f24791z & 2) == 2;
    }

    @Override // D1.b, android.view.MenuItem
    /* JADX INFO: renamed from: p */
    public D1.b setActionView(int i10) {
        Context contextW = this.f24779n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i10, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    /* JADX INFO: renamed from: q */
    public D1.b setActionView(View view) {
        int i10;
        this.f24761A = view;
        this.f24762B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f24766a) > 0) {
            view.setId(i10);
        }
        this.f24779n.L(this);
        return this;
    }

    public void r(boolean z10) {
        this.f24764D = z10;
        this.f24779n.N(false);
    }

    void s(boolean z10) {
        int i10 = this.f24790y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f24790y = i11;
        if (i10 != i11) {
            this.f24779n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f24775j == c10) {
            return this;
        }
        this.f24775j = Character.toLowerCase(c10);
        this.f24779n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f24790y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f24790y = i11;
        if (i10 != i11) {
            this.f24779n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f24790y & 4) != 0) {
            this.f24779n.Y(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f24790y |= 16;
        } else {
            this.f24790y &= -17;
        }
        this.f24779n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f24778m = 0;
        this.f24777l = drawable;
        this.f24789x = true;
        this.f24779n.N(false);
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24785t = colorStateList;
        this.f24787v = true;
        this.f24789x = true;
        this.f24779n.N(false);
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24786u = mode;
        this.f24788w = true;
        this.f24789x = true;
        this.f24779n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f24772g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f24773h == c10) {
            return this;
        }
        this.f24773h = c10;
        this.f24779n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24763C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24782q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f24773h = c10;
        this.f24775j = Character.toLowerCase(c11);
        this.f24779n.N(false);
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f24791z = i10;
        this.f24779n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f24770e = charSequence;
        this.f24779n.N(false);
        m mVar = this.f24780o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24771f = charSequence;
        this.f24779n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f24779n.M(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f24790y = (z10 ? 4 : 0) | (this.f24790y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f24770e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f24790y |= 32;
        } else {
            this.f24790y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f24765E = contextMenuInfo;
    }

    @Override // D1.b, android.view.MenuItem
    /* JADX INFO: renamed from: w */
    public D1.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f24780o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f24790y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f24790y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f24779n.C();
    }

    @Override // android.view.MenuItem
    public D1.b setContentDescription(CharSequence charSequence) {
        this.f24783r = charSequence;
        this.f24779n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public D1.b setTooltipText(CharSequence charSequence) {
        this.f24784s = charSequence;
        this.f24779n.N(false);
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f24775j == c10 && this.f24776k == i10) {
            return this;
        }
        this.f24775j = Character.toLowerCase(c10);
        this.f24776k = KeyEvent.normalizeMetaState(i10);
        this.f24779n.N(false);
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f24773h == c10 && this.f24774i == i10) {
            return this;
        }
        this.f24773h = c10;
        this.f24774i = KeyEvent.normalizeMetaState(i10);
        this.f24779n.N(false);
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f24773h = c10;
        this.f24774i = KeyEvent.normalizeMetaState(i10);
        this.f24775j = Character.toLowerCase(c11);
        this.f24776k = KeyEvent.normalizeMetaState(i11);
        this.f24779n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f24777l = null;
        this.f24778m = i10;
        this.f24789x = true;
        this.f24779n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f24779n.w().getString(i10));
    }
}
