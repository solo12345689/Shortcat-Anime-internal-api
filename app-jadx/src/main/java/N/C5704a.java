package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC2748b;
import y1.AbstractC7194b;

/* JADX INFO: renamed from: n.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5704a implements D1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f53759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f53760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f53761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f53762g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f53764i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f53766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f53767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f53768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f53769n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f53770o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53763h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53765j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f53771p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f53772q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f53773r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f53774s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f53775t = 16;

    public C5704a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f53767l = context;
        this.f53756a = i11;
        this.f53757b = i10;
        this.f53758c = i13;
        this.f53759d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f53766k;
        if (drawable != null) {
            if (this.f53773r || this.f53774s) {
                Drawable drawableR = B1.a.r(drawable);
                this.f53766k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f53766k = drawableMutate;
                if (this.f53773r) {
                    B1.a.o(drawableMutate, this.f53771p);
                }
                if (this.f53774s) {
                    B1.a.p(this.f53766k, this.f53772q);
                }
            }
        }
    }

    @Override // D1.b
    public AbstractC2748b a() {
        return null;
    }

    @Override // D1.b
    public D1.b b(AbstractC2748b abstractC2748b) {
        throw new UnsupportedOperationException();
    }

    @Override // D1.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // D1.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public D1.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // D1.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public D1.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // D1.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // D1.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public D1.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // D1.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // D1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f53765j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f53764i;
    }

    @Override // D1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f53769n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f53757b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f53766k;
    }

    @Override // D1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f53771p;
    }

    @Override // D1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f53772q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f53761f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f53756a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // D1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f53763h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f53762g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f53758c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f53759d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f53760e;
        return charSequence != null ? charSequence : this.f53759d;
    }

    @Override // D1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f53770o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // D1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f53775t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f53775t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f53775t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f53775t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f53764i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f53775t = (z10 ? 1 : 0) | (this.f53775t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f53775t = (z10 ? 2 : 0) | (this.f53775t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f53775t = (z10 ? 16 : 0) | (this.f53775t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f53766k = drawable;
        c();
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f53771p = colorStateList;
        this.f53773r = true;
        c();
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f53772q = mode;
        this.f53774s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f53761f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f53762g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f53768m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f53762g = c10;
        this.f53764i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f53759d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f53760e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f53775t = (this.f53775t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f53764i = Character.toLowerCase(c10);
        this.f53765j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public D1.b setContentDescription(CharSequence charSequence) {
        this.f53769n = charSequence;
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f53762g = c10;
        this.f53763h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f53759d = this.f53767l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public D1.b setTooltipText(CharSequence charSequence) {
        this.f53770o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f53766k = AbstractC7194b.e(this.f53767l, i10);
        c();
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f53762g = c10;
        this.f53763h = KeyEvent.normalizeMetaState(i10);
        this.f53764i = Character.toLowerCase(c11);
        this.f53765j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // D1.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
