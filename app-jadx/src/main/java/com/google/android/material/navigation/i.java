package com.google.android.material.navigation;

import L1.B;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.transition.C2936a;
import androidx.transition.t;
import androidx.transition.w;
import i.AbstractC4956a;
import j.AbstractC5323a;
import java.util.HashSet;
import o9.AbstractC5838a;
import o9.AbstractC5843f;
import p9.AbstractC5946a;
import q9.C6164a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends ViewGroup implements androidx.appcompat.view.menu.k {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int[] f42695y0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final int[] f42696z0 = {-16842910};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f42697A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f42698B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f42699C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f42700D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f42701E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f42702F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f42703G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f42704H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private H9.l f42705I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f42706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View.OnClickListener f42707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private K1.d f42708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray f42709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h[] f42712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f42713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f42715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f42717l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f42718l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ColorStateList f42719m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private ColorStateList f42720m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42721n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private j f42722n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f42723o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private g f42724o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f42725p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f42726p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f42727q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f42728q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f42729r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f42730r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Drawable f42731s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f42732s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f42733t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f42734t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f42735u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private MenuItem f42736u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final SparseArray f42737v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f42738v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f42739w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f42740w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f42741x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final Rect f42742x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f42743y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f42744z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            androidx.appcompat.view.menu.g itemData = ((e) view).getItemData();
            boolean zE = i.this.f42724o0.e(itemData, i.this.f42722n0, 0);
            if (itemData == null || !itemData.isCheckable()) {
                return;
            }
            if (!zE || itemData.isChecked()) {
                i.this.setCheckedItem(itemData);
            }
        }
    }

    public i(Context context) {
        super(context);
        this.f42709d = new SparseArray();
        this.f42713h = -1;
        this.f42714i = -1;
        this.f42737v = new SparseArray();
        this.f42739w = -1;
        this.f42741x = -1;
        this.f42743y = -1;
        this.f42744z = -1;
        this.f42704H = 49;
        this.f42718l0 = false;
        this.f42730r0 = 1;
        this.f42732s0 = 0;
        this.f42736u0 = null;
        this.f42738v0 = 7;
        this.f42740w0 = false;
        this.f42742x0 = new Rect();
        this.f42719m = e(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f42706a = null;
        } else {
            C2936a c2936a = new C2936a();
            this.f42706a = c2936a;
            c2936a.F0(0);
            c2936a.v(TextView.class, true);
            c2936a.l0(C9.d.f(getContext(), AbstractC5838a.f54652o0, getResources().getInteger(AbstractC5843f.f54815b)));
            c2936a.n0(C9.d.g(getContext(), AbstractC5838a.f54666v0, AbstractC5946a.f55827b));
            c2936a.v0(new com.google.android.material.internal.k());
        }
        this.f42707b = new a();
        setImportantForAccessibility(1);
    }

    private Drawable f() {
        if (this.f42705I == null || this.f42720m0 == null) {
            return null;
        }
        H9.h hVar = new H9.h(this.f42705I);
        hVar.d0(this.f42720m0);
        return hVar;
    }

    private e g(int i10, androidx.appcompat.view.menu.g gVar, boolean z10, boolean z11) {
        this.f42722n0.m(true);
        gVar.setCheckable(true);
        this.f42722n0.m(false);
        e newItem = getNewItem();
        newItem.setShifting(z10);
        newItem.setLabelMaxLines(this.f42730r0);
        newItem.setIconTintList(this.f42715j);
        newItem.setIconSize(this.f42716k);
        newItem.setTextColor(this.f42719m);
        newItem.setTextAppearanceInactive(this.f42721n);
        newItem.setTextAppearanceActive(this.f42723o);
        newItem.setHorizontalTextAppearanceInactive(this.f42725p);
        newItem.setHorizontalTextAppearanceActive(this.f42727q);
        newItem.setTextAppearanceActiveBoldEnabled(this.f42729r);
        newItem.setTextColor(this.f42717l);
        int i11 = this.f42739w;
        if (i11 != -1) {
            newItem.setItemPaddingTop(i11);
        }
        int i12 = this.f42741x;
        if (i12 != -1) {
            newItem.setItemPaddingBottom(i12);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.f42726p0);
        newItem.setLabelFontScalingEnabled(this.f42728q0);
        int i13 = this.f42743y;
        if (i13 != -1) {
            newItem.setActiveIndicatorLabelPadding(i13);
        }
        int i14 = this.f42744z;
        if (i14 != -1) {
            newItem.setIconLabelHorizontalSpacing(i14);
        }
        newItem.setActiveIndicatorWidth(this.f42698B);
        newItem.setActiveIndicatorHeight(this.f42699C);
        newItem.setActiveIndicatorExpandedWidth(this.f42700D);
        newItem.setActiveIndicatorExpandedHeight(this.f42701E);
        newItem.setActiveIndicatorMarginHorizontal(this.f42702F);
        newItem.setItemGravity(this.f42704H);
        newItem.setActiveIndicatorExpandedPadding(this.f42742x0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.f42703G);
        newItem.setActiveIndicatorDrawable(f());
        newItem.setActiveIndicatorResizeable(this.f42718l0);
        newItem.setActiveIndicatorEnabled(this.f42697A);
        Drawable drawable = this.f42731s;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.f42735u);
        }
        newItem.setItemRippleColor(this.f42733t);
        newItem.setLabelVisibilityMode(this.f42710e);
        newItem.setItemIconGravity(this.f42711f);
        newItem.setOnlyShowWhenExpanded(z11);
        newItem.setExpanded(this.f42734t0);
        newItem.c(gVar, 0);
        newItem.setItemPosition(i10);
        int itemId = gVar.getItemId();
        newItem.setOnTouchListener((View.OnTouchListener) this.f42709d.get(itemId));
        newItem.setOnClickListener(this.f42707b);
        int i15 = this.f42713h;
        if (i15 != 0 && itemId == i15) {
            this.f42714i = i10;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f42738v0, this.f42724o0.d());
    }

    private e getNewItem() {
        K1.d dVar = this.f42708c;
        e eVar = dVar != null ? (e) dVar.b() : null;
        return eVar == null ? h(getContext()) : eVar;
    }

    private boolean l() {
        g gVar;
        if (this.f42712g == null || (gVar = this.f42724o0) == null || gVar.g() != this.f42712g.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f42712g.length) {
                return true;
            }
            if ((this.f42724o0.b(i10) instanceof com.google.android.material.navigation.a) && !(this.f42712g[i10] instanceof b)) {
                return false;
            }
            boolean z10 = this.f42724o0.b(i10).hasSubMenu() && !(this.f42712g[i10] instanceof l);
            boolean z11 = (this.f42724o0.b(i10).hasSubMenu() || (this.f42712g[i10] instanceof e)) ? false : true;
            if (!(this.f42724o0.b(i10) instanceof com.google.android.material.navigation.a) && (z10 || z11)) {
                break;
            }
            i10++;
        }
        return false;
    }

    private boolean n(int i10) {
        return i10 != -1;
    }

    private void o() {
        h[] hVarArr = this.f42712g;
        if (hVarArr == null || this.f42708c == null) {
            return;
        }
        for (h hVar : hVarArr) {
            if (hVar instanceof e) {
                e eVar = (e) hVar;
                this.f42708c.a(eVar);
                eVar.g();
            }
        }
    }

    private void p() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f42724o0.g(); i10++) {
            hashSet.add(Integer.valueOf(this.f42724o0.b(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f42737v.size(); i11++) {
            int iKeyAt = this.f42737v.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f42737v.delete(iKeyAt);
            }
        }
    }

    private void setBadgeIfNeeded(e eVar) {
        C6164a c6164a;
        int id2 = eVar.getId();
        if (n(id2) && (c6164a = (C6164a) this.f42737v.get(id2)) != null) {
            eVar.setBadge(c6164a);
        }
    }

    private void u(int i10) {
        if (n(i10)) {
            return;
        }
        throw new IllegalArgumentException(i10 + " is not a valid view id");
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f42724o0 = new g(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d() {
        View viewG;
        removeAllViews();
        o();
        this.f42722n0.m(true);
        this.f42724o0.f();
        this.f42722n0.m(false);
        int iA = this.f42724o0.a();
        if (iA == 0) {
            this.f42713h = 0;
            this.f42714i = 0;
            this.f42712g = null;
            this.f42708c = null;
            return;
        }
        if (this.f42708c == null || this.f42732s0 != iA) {
            this.f42732s0 = iA;
            this.f42708c = new K1.e(iA);
        }
        p();
        int iG = this.f42724o0.g();
        this.f42712g = new h[iG];
        boolean zM = m(this.f42710e, getCurrentVisibleContentItemCount());
        int size = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.f42724o0.b(i11);
            boolean z10 = menuItemB instanceof com.google.android.material.navigation.a;
            if (z10) {
                b bVar = new b(getContext());
                bVar.setOnlyShowWhenExpanded(true);
                bVar.setDividersEnabled(this.f42740w0);
                viewG = bVar;
            } else if (menuItemB.hasSubMenu()) {
                if (size > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                l lVar = new l(getContext());
                int i12 = this.f42727q;
                if (i12 == 0) {
                    i12 = this.f42723o;
                }
                lVar.setTextAppearance(i12);
                lVar.setTextColor(this.f42717l);
                lVar.setOnlyShowWhenExpanded(true);
                lVar.c((androidx.appcompat.view.menu.g) menuItemB, 0);
                size = menuItemB.getSubMenu().size();
                viewG = lVar;
            } else if (size > 0) {
                size--;
                viewG = g(i11, (androidx.appcompat.view.menu.g) menuItemB, zM, true);
            } else {
                androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) menuItemB;
                boolean z11 = i10 >= this.f42738v0;
                i10++;
                viewG = g(i11, gVar, zM, z11);
            }
            if (!z10 && menuItemB.isCheckable() && this.f42714i == -1) {
                this.f42714i = i11;
            }
            this.f42712g[i11] = viewG;
            addView(viewG);
        }
        int iMin = Math.min(iG - 1, this.f42714i);
        this.f42714i = iMin;
        setCheckedItem(this.f42712g[iMin].getItemData());
    }

    public ColorStateList e(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = AbstractC5323a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(AbstractC4956a.f47976w, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = f42696z0;
        return new ColorStateList(new int[][]{iArr, f42695y0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f42743y;
    }

    SparseArray<C6164a> getBadgeDrawables() {
        return this.f42737v;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.f42734t0 ? this.f42724o0.c() : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f42727q;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f42725p;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f42744z;
    }

    public ColorStateList getIconTintList() {
        return this.f42715j;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f42720m0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f42697A;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f42701E;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f42703G;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f42700D;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f42699C;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f42702F;
    }

    public H9.l getItemActiveIndicatorShapeAppearance() {
        return this.f42705I;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f42698B;
    }

    public Drawable getItemBackground() {
        h[] hVarArr = this.f42712g;
        if (hVarArr != null && hVarArr.length > 0) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    return ((e) hVar).getBackground();
                }
            }
        }
        return this.f42731s;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f42735u;
    }

    public int getItemGravity() {
        return this.f42704H;
    }

    public int getItemIconGravity() {
        return this.f42711f;
    }

    public int getItemIconSize() {
        return this.f42716k;
    }

    public int getItemPaddingBottom() {
        return this.f42741x;
    }

    public int getItemPaddingTop() {
        return this.f42739w;
    }

    public ColorStateList getItemRippleColor() {
        return this.f42733t;
    }

    public int getItemTextAppearanceActive() {
        return this.f42723o;
    }

    public int getItemTextAppearanceInactive() {
        return this.f42721n;
    }

    public ColorStateList getItemTextColor() {
        return this.f42717l;
    }

    public int getLabelMaxLines() {
        return this.f42730r0;
    }

    public int getLabelVisibilityMode() {
        return this.f42710e;
    }

    protected g getMenu() {
        return this.f42724o0;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f42728q0;
    }

    public int getSelectedItemId() {
        return this.f42713h;
    }

    protected int getSelectedItemPosition() {
        return this.f42714i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    protected abstract e h(Context context);

    public e i(int i10) {
        u(i10);
        h[] hVarArr = this.f42712g;
        if (hVarArr == null) {
            return null;
        }
        for (h hVar : hVarArr) {
            if (hVar instanceof e) {
                e eVar = (e) hVar;
                if (eVar.getId() == i10) {
                    return eVar;
                }
            }
        }
        return null;
    }

    public C6164a j(int i10) {
        return (C6164a) this.f42737v.get(i10);
    }

    C6164a k(int i10) {
        u(i10);
        C6164a c6164aG = (C6164a) this.f42737v.get(i10);
        if (c6164aG == null) {
            c6164aG = C6164a.g(getContext());
            this.f42737v.put(i10, c6164aG);
        }
        e eVarI = i(i10);
        if (eVarI != null) {
            eVarI.setBadge(c6164aG);
        }
        return c6164aG;
    }

    protected boolean m(int i10, int i11) {
        return i10 == -1 ? i11 > 3 : i10 == 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        B.s1(accessibilityNodeInfo).B0(B.f.b(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    void q(SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            if (this.f42737v.indexOfKey(iKeyAt) < 0) {
                this.f42737v.append(iKeyAt, (C6164a) sparseArray.get(iKeyAt));
            }
        }
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    e eVar = (e) hVar;
                    C6164a c6164a = (C6164a) this.f42737v.get(eVar.getId());
                    if (c6164a != null) {
                        eVar.setBadge(c6164a);
                    }
                }
            }
        }
    }

    public void r(int i10, int i11, int i12, int i13) {
        Rect rect = this.f42742x0;
        rect.left = i10;
        rect.top = i11;
        rect.right = i12;
        rect.bottom = i13;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedPadding(this.f42742x0);
                }
            }
        }
    }

    void s(int i10) {
        int iG = this.f42724o0.g();
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.f42724o0.b(i11);
            if (i10 == menuItemB.getItemId()) {
                this.f42713h = i10;
                this.f42714i = i11;
                setCheckedItem(menuItemB);
                return;
            }
        }
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f42743y = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorLabelPadding(i10);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.f42736u0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f42736u0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f42736u0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f42736u0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i10) {
        this.f42738v0 = i10;
    }

    public void setExpanded(boolean z10) {
        this.f42734t0 = z10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                hVar.setExpanded(z10);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i10) {
        this.f42727q = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setHorizontalTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) {
        this.f42725p = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setHorizontalTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.f42744z = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconLabelHorizontalSpacing(i10);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f42715j = colorStateList;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f42720m0 = colorStateList;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorDrawable(f());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f42697A = z10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorEnabled(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.f42701E = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f42703G = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedMarginHorizontal(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.f42700D = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedWidth(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f42699C = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f42702F = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorMarginHorizontal(i10);
                }
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z10) {
        this.f42718l0 = z10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorResizeable(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(H9.l lVar) {
        this.f42705I = lVar;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorDrawable(f());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f42698B = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorWidth(i10);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f42731s = drawable;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f42735u = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemBackground(i10);
                }
            }
        }
    }

    public void setItemGravity(int i10) {
        this.f42704H = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemGravity(i10);
                }
            }
        }
    }

    public void setItemIconGravity(int i10) {
        this.f42711f = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemIconGravity(i10);
                }
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f42716k = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconSize(i10);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f42741x = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemPaddingBottom(this.f42741x);
                }
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f42739w = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemPaddingTop(i10);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f42733t = colorStateList;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f42723o = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f42729r = z10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceActiveBoldEnabled(z10);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f42721n = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f42717l = colorStateList;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f42728q0 = z10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setLabelFontScalingEnabled(z10);
                }
            }
        }
    }

    public void setLabelMaxLines(int i10) {
        this.f42730r0 = i10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setLabelMaxLines(i10);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f42710e = i10;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z10) {
        this.f42726p0 = z10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setMeasureBottomPaddingFromLabelBaseline(z10);
                }
            }
        }
    }

    public void setPresenter(j jVar) {
        this.f42722n0 = jVar;
    }

    public void setSubmenuDividersEnabled(boolean z10) {
        if (this.f42740w0 == z10) {
            return;
        }
        this.f42740w0 = z10;
        h[] hVarArr = this.f42712g;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof b) {
                    ((b) hVar).setDividersEnabled(z10);
                }
            }
        }
    }

    public void t() {
        w wVar;
        if (this.f42724o0 == null || this.f42712g == null) {
            return;
        }
        this.f42722n0.m(true);
        this.f42724o0.f();
        this.f42722n0.m(false);
        if (!l()) {
            d();
            return;
        }
        int i10 = this.f42713h;
        int iG = this.f42724o0.g();
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.f42724o0.b(i11);
            if (menuItemB.isChecked()) {
                setCheckedItem(menuItemB);
                this.f42713h = menuItemB.getItemId();
                this.f42714i = i11;
            }
        }
        if (i10 != this.f42713h && (wVar = this.f42706a) != null) {
            t.a(this, wVar);
        }
        boolean zM = m(this.f42710e, getCurrentVisibleContentItemCount());
        for (int i12 = 0; i12 < iG; i12++) {
            this.f42722n0.m(true);
            this.f42712g[i12].setExpanded(this.f42734t0);
            h hVar = this.f42712g[i12];
            if (hVar instanceof e) {
                e eVar = (e) hVar;
                eVar.setLabelVisibilityMode(this.f42710e);
                eVar.setItemIconGravity(this.f42711f);
                eVar.setItemGravity(this.f42704H);
                eVar.setShifting(zM);
            }
            if (this.f42724o0.b(i12) instanceof androidx.appcompat.view.menu.g) {
                this.f42712g[i12].c((androidx.appcompat.view.menu.g) this.f42724o0.b(i12), 0);
            }
            this.f42722n0.m(false);
        }
    }
}
