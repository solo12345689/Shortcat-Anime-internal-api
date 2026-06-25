package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC2748b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e implements D1.a {

    /* JADX INFO: renamed from: A */
    private static final int[] f24730A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    private final Context f24731a;

    /* JADX INFO: renamed from: b */
    private final Resources f24732b;

    /* JADX INFO: renamed from: c */
    private boolean f24733c;

    /* JADX INFO: renamed from: d */
    private boolean f24734d;

    /* JADX INFO: renamed from: e */
    private a f24735e;

    /* JADX INFO: renamed from: m */
    private ContextMenu.ContextMenuInfo f24743m;

    /* JADX INFO: renamed from: n */
    CharSequence f24744n;

    /* JADX INFO: renamed from: o */
    Drawable f24745o;

    /* JADX INFO: renamed from: p */
    View f24746p;

    /* JADX INFO: renamed from: x */
    private g f24754x;

    /* JADX INFO: renamed from: z */
    private boolean f24756z;

    /* JADX INFO: renamed from: l */
    private int f24742l = 0;

    /* JADX INFO: renamed from: q */
    private boolean f24747q = false;

    /* JADX INFO: renamed from: r */
    private boolean f24748r = false;

    /* JADX INFO: renamed from: s */
    private boolean f24749s = false;

    /* JADX INFO: renamed from: t */
    private boolean f24750t = false;

    /* JADX INFO: renamed from: u */
    private boolean f24751u = false;

    /* JADX INFO: renamed from: v */
    private ArrayList f24752v = new ArrayList();

    /* JADX INFO: renamed from: w */
    private CopyOnWriteArrayList f24753w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y */
    private boolean f24755y = false;

    /* JADX INFO: renamed from: f */
    private ArrayList f24736f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private ArrayList f24737g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private boolean f24738h = true;

    /* JADX INFO: renamed from: i */
    private ArrayList f24739i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private ArrayList f24740j = new ArrayList();

    /* JADX INFO: renamed from: k */
    private boolean f24741k = true;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        boolean b(g gVar);
    }

    public e(Context context) {
        this.f24731a = context;
        this.f24732b = context.getResources();
        g0(true);
    }

    private static int D(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f24730A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void Q(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f24736f.size()) {
            return;
        }
        this.f24736f.remove(i10);
        if (z10) {
            N(true);
        }
    }

    private void b0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesE = E();
        if (view != null) {
            this.f24746p = view;
            this.f24744n = null;
            this.f24745o = null;
        } else {
            if (i10 > 0) {
                this.f24744n = resourcesE.getText(i10);
            } else if (charSequence != null) {
                this.f24744n = charSequence;
            }
            if (i11 > 0) {
                this.f24745o = AbstractC7194b.e(w(), i11);
            } else if (drawable != null) {
                this.f24745o = drawable;
            }
            this.f24746p = null;
        }
        N(false);
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f24732b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f24731a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f24731a
            boolean r3 = androidx.core.view.AbstractC2753d0.l(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f24734d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.g0(boolean):void");
    }

    private void i(boolean z10) {
        if (this.f24753w.isEmpty()) {
            return;
        }
        i0();
        for (WeakReference weakReference : this.f24753w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f24753w.remove(weakReference);
            } else {
                jVar.i(z10);
            }
        }
        h0();
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f24753w.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : this.f24753w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f24753w.remove(weakReference);
            } else {
                int id2 = jVar.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    jVar.f(parcelable);
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable parcelableH;
        if (this.f24753w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : this.f24753w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f24753w.remove(weakReference);
            } else {
                int id2 = jVar.getId();
                if (id2 > 0 && (parcelableH = jVar.h()) != null) {
                    sparseArray.put(id2, parcelableH);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private boolean l(m mVar, j jVar) {
        if (this.f24753w.isEmpty()) {
            return false;
        }
        boolean zG = jVar != null ? jVar.g(mVar) : false;
        for (WeakReference weakReference : this.f24753w) {
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null) {
                this.f24753w.remove(weakReference);
            } else if (!zG) {
                zG = jVar2.g(mVar);
            }
        }
        return zG;
    }

    private static int p(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.f24746p;
    }

    public ArrayList B() {
        t();
        return this.f24740j;
    }

    boolean C() {
        return this.f24750t;
    }

    Resources E() {
        return this.f24732b;
    }

    public ArrayList G() {
        if (!this.f24738h) {
            return this.f24737g;
        }
        this.f24737g.clear();
        int size = this.f24736f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f24736f.get(i10);
            if (gVar.isVisible()) {
                this.f24737g.add(gVar);
            }
        }
        this.f24738h = false;
        this.f24741k = true;
        return this.f24737g;
    }

    public boolean H() {
        return !this.f24747q;
    }

    public boolean I() {
        return this.f24755y;
    }

    boolean J() {
        return this.f24733c;
    }

    public boolean K() {
        return this.f24734d;
    }

    void L(g gVar) {
        this.f24741k = true;
        N(true);
    }

    void M(g gVar) {
        this.f24738h = true;
        N(true);
    }

    public void N(boolean z10) {
        if (this.f24747q) {
            this.f24748r = true;
            if (z10) {
                this.f24749s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f24738h = true;
            this.f24741k = true;
        }
        i(z10);
    }

    public boolean O(MenuItem menuItem, int i10) {
        return P(menuItem, null, i10);
    }

    public boolean P(MenuItem menuItem, j jVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        AbstractC2748b abstractC2748bA = gVar.a();
        boolean z10 = abstractC2748bA != null && abstractC2748bA.a();
        if (gVar.j()) {
            boolean zExpandActionView = gVar.expandActionView() | zK;
            if (zExpandActionView) {
                e(true);
            }
            return zExpandActionView;
        }
        if (!gVar.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                e(true);
            }
            return zK;
        }
        if ((i10 & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new m(w(), this, gVar));
        }
        m mVar = (m) gVar.getSubMenu();
        if (z10) {
            abstractC2748bA.e(mVar);
        }
        boolean zL = l(mVar, jVar) | zK;
        if (!zL) {
            e(true);
        }
        return zL;
    }

    public void R(j jVar) {
        for (WeakReference weakReference : this.f24753w) {
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f24753w.remove(weakReference);
            }
        }
    }

    public void S(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(v());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).S(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void T(Bundle bundle) {
        j(bundle);
    }

    public void U(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    public void W(a aVar) {
        this.f24735e = aVar;
    }

    public e X(int i10) {
        this.f24742l = i10;
        return this;
    }

    void Y(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f24736f.size();
        i0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f24736f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        h0();
    }

    protected e Z(int i10) {
        b0(0, null, i10, null, null);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iD = D(i12);
        g gVarG = g(i10, i11, i12, iD, charSequence, this.f24742l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f24743m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f24736f;
        arrayList.add(p(arrayList, iD), gVarG);
        N(true);
        return gVarG;
    }

    protected e a0(Drawable drawable) {
        b0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f24731a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f24731a);
    }

    public void c(j jVar, Context context) {
        this.f24753w.add(new WeakReference(jVar));
        jVar.l(context, this);
        this.f24741k = true;
    }

    protected e c0(int i10) {
        b0(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f24754x;
        if (gVar != null) {
            f(gVar);
        }
        this.f24736f.clear();
        N(true);
    }

    public void clearHeader() {
        this.f24745o = null;
        this.f24744n = null;
        this.f24746p = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f24735e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    protected e d0(CharSequence charSequence) {
        b0(0, charSequence, 0, null, null);
        return this;
    }

    public final void e(boolean z10) {
        if (this.f24751u) {
            return;
        }
        this.f24751u = true;
        for (WeakReference weakReference : this.f24753w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f24753w.remove(weakReference);
            } else {
                jVar.a(this, z10);
            }
        }
        this.f24751u = false;
    }

    protected e e0(View view) {
        b0(0, null, 0, null, view);
        return this;
    }

    public boolean f(g gVar) {
        boolean zK = false;
        if (!this.f24753w.isEmpty() && this.f24754x == gVar) {
            i0();
            for (WeakReference weakReference : this.f24753w) {
                j jVar = (j) weakReference.get();
                if (jVar != null) {
                    zK = jVar.k(this, gVar);
                    if (zK) {
                        break;
                    }
                } else {
                    this.f24753w.remove(weakReference);
                }
            }
            h0();
            if (zK) {
                this.f24754x = null;
            }
        }
        return zK;
    }

    public void f0(boolean z10) {
        this.f24756z = z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f24736f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f24736f.get(i10);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f24735e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public void h0() {
        this.f24747q = false;
        if (this.f24748r) {
            this.f24748r = false;
            N(this.f24749s);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f24756z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((g) this.f24736f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i0() {
        if (this.f24747q) {
            return;
        }
        this.f24747q = true;
        this.f24748r = false;
        this.f24749s = false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return r(i10, keyEvent) != null;
    }

    public boolean m(g gVar) {
        boolean zD = false;
        if (this.f24753w.isEmpty()) {
            return false;
        }
        i0();
        for (WeakReference weakReference : this.f24753w) {
            j jVar = (j) weakReference.get();
            if (jVar != null) {
                zD = jVar.d(this, gVar);
                if (zD) {
                    break;
                }
            } else {
                this.f24753w.remove(weakReference);
            }
        }
        h0();
        if (zD) {
            this.f24754x = gVar;
        }
        return zD;
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    public int o(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((g) this.f24736f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return O(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g gVarR = r(i10, keyEvent);
        boolean zO = gVarR != null ? O(gVarR, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zO;
    }

    public int q(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((g) this.f24736f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    g r(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f24752v;
        arrayList.clear();
        s(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean zJ = J();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) arrayList.get(i11);
            char alphabeticShortcut = zJ ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zJ && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iN = n(i10);
        if (iN >= 0) {
            int size = this.f24736f.size() - iN;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((g) this.f24736f.get(iN)).getGroupId() != i10) {
                    break;
                }
                Q(iN, false);
                i11 = i12;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        Q(q(i10), true);
    }

    void s(List list, int i10, KeyEvent keyEvent) {
        boolean zJ = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f24736f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = (g) this.f24736f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).s(list, i10, keyEvent);
                }
                char alphabeticShortcut = zJ ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zJ ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zJ && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f24736f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f24736f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f24755y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f24736f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f24736f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f24736f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f24736f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f24733c = z10;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f24736f.size();
    }

    public void t() {
        ArrayList arrayListG = G();
        if (this.f24741k) {
            boolean zJ = false;
            for (WeakReference weakReference : this.f24753w) {
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f24753w.remove(weakReference);
                } else {
                    zJ |= jVar.j();
                }
            }
            if (zJ) {
                this.f24739i.clear();
                this.f24740j.clear();
                int size = arrayListG.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = (g) arrayListG.get(i10);
                    if (gVar.l()) {
                        this.f24739i.add(gVar);
                    } else {
                        this.f24740j.add(gVar);
                    }
                }
            } else {
                this.f24739i.clear();
                this.f24740j.clear();
                this.f24740j.addAll(G());
            }
            this.f24741k = false;
        }
    }

    public ArrayList u() {
        t();
        return this.f24739i;
    }

    protected String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f24731a;
    }

    public g x() {
        return this.f24754x;
    }

    public Drawable y() {
        return this.f24745o;
    }

    public CharSequence z() {
        return this.f24744n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f24732b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f24732b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f24731a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f24732b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f24732b.getString(i13));
    }

    public e F() {
        return this;
    }
}
