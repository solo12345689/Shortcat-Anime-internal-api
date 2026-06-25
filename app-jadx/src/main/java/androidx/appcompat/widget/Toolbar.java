package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC2646a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.AbstractC2781s;
import androidx.core.view.C2793y;
import androidx.core.view.InterfaceC2787v;
import i.AbstractC4956a;
import j.AbstractC5323a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC2787v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ColorStateList f25135A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f25136B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f25137C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final ArrayList f25138D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final ArrayList f25139E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int[] f25140F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final C2793y f25141G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private ArrayList f25142H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    h f25143I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ActionMenuView f25144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f25145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f25146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageButton f25147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f25148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f25149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f25150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ImageButton f25151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f25152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f25153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25155l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final ActionMenuView.e f25156l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25157m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private l0 f25158m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f25159n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private C2649c f25160n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25161o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private f f25162o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f25163p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private j.a f25164p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f25165q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    e.a f25166q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f25167r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f25168r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f25169s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private OnBackInvokedCallback f25170s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Z f25171t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private OnBackInvokedDispatcher f25172t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f25173u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f25174u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f25175v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final Runnable f25176v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f25177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f25178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f25179y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f25180z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f25141G.h(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f25143I;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.f25166q0;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f25144a.H()) {
                Toolbar.this.f25141G.i(eVar);
            }
            e.a aVar = Toolbar.this.f25166q0;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.k0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f25141G.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f25142H = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f25176v0);
        post(this.f25176v0);
    }

    private boolean O() {
        if (!this.f25168r0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = AbstractC2781s.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f25188b == 0 && P(childAt) && p(gVar.f24387a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f25188b == 0 && P(childAt2) && p(gVar2.f24387a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.f25188b = 1;
        if (!z10 || this.f25152i == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f25139E.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f25171t == null) {
            this.f25171t = new Z();
        }
    }

    private void i() {
        if (this.f25148e == null) {
            this.f25148e = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f25144a.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f25144a.getMenu();
            if (this.f25162o0 == null) {
                this.f25162o0 = new f();
            }
            this.f25144a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f25162o0, this.f25153j);
            R();
        }
    }

    private void k() {
        if (this.f25144a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f25144a = actionMenuView;
            actionMenuView.setPopupTheme(this.f25154k);
            this.f25144a.setOnMenuItemClickListener(this.f25156l0);
            this.f25144a.M(this.f25164p0, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f24387a = (this.f25159n & 112) | 8388613;
            this.f25144a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f25144a, false);
        }
    }

    private void l() {
        if (this.f25147d == null) {
            this.f25147d = new C2662p(getContext(), null, AbstractC4956a.f47952N);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f24387a = (this.f25159n & 112) | 8388611;
            this.f25147d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = AbstractC2781s.b(i10, layoutDirection) & 7;
        return (iB == 1 || iB == 3 || iB == 5) ? iB : layoutDirection == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iR = r(gVar.f24387a);
        if (iR == 48) {
            return getPaddingTop() - i11;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f25177w & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.f25139E.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f25144a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f25144a;
        return actionMenuView != null && actionMenuView.H();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f25188b != 2 && childAt != this.f25144a) {
                removeViewAt(childCount);
                this.f25139E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f25171t.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.e eVar, C2649c c2649c) {
        if (eVar == null && this.f25144a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarL = this.f25144a.L();
        if (eVarL == eVar) {
            return;
        }
        if (eVarL != null) {
            eVarL.R(this.f25160n0);
            eVarL.R(this.f25162o0);
        }
        if (this.f25162o0 == null) {
            this.f25162o0 = new f();
        }
        c2649c.I(true);
        if (eVar != null) {
            eVar.c(c2649c, this.f25153j);
            eVar.c(this.f25162o0, this.f25153j);
        } else {
            c2649c.l(this.f25153j, null);
            this.f25162o0.l(this.f25153j, null);
            c2649c.i(true);
            this.f25162o0.i(true);
        }
        this.f25144a.setPopupTheme(this.f25154k);
        this.f25144a.setPresenter(c2649c);
        this.f25160n0 = c2649c;
        R();
    }

    public void L(j.a aVar, e.a aVar2) {
        this.f25164p0 = aVar;
        this.f25166q0 = aVar2;
        ActionMenuView actionMenuView = this.f25144a;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f25157m = i10;
        TextView textView = this.f25146c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f25155l = i10;
        TextView textView = this.f25145b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f25144a;
        return actionMenuView != null && actionMenuView.N();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = v() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f25174u0;
            if (z10 && this.f25172t0 == null) {
                if (this.f25170s0 == null) {
                    this.f25170s0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25418a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f25170s0);
                this.f25172t0 = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f25172t0) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f25170s0);
            this.f25172t0 = null;
        }
    }

    void a() {
        for (int size = this.f25139E.size() - 1; size >= 0; size--) {
            addView((View) this.f25139E.get(size));
        }
        this.f25139E.clear();
    }

    @Override // androidx.core.view.InterfaceC2787v
    public void addMenuProvider(androidx.core.view.B b10) {
        this.f25141G.c(b10);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f25144a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.f25162o0;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f25186b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f25144a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f25151h == null) {
            C2662p c2662p = new C2662p(getContext(), null, AbstractC4956a.f47952N);
            this.f25151h = c2662p;
            c2662p.setImageDrawable(this.f25149f);
            this.f25151h.setContentDescription(this.f25150g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f24387a = (this.f25159n & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f25188b = 2;
            this.f25151h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f25151h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f25151h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f25151h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Z z10 = this.f25171t;
        if (z10 != null) {
            return z10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f25175v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Z z10 = this.f25171t;
        if (z10 != null) {
            return z10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        Z z10 = this.f25171t;
        if (z10 != null) {
            return z10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        Z z10 = this.f25171t;
        if (z10 != null) {
            return z10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f25173u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarL;
        ActionMenuView actionMenuView = this.f25144a;
        return (actionMenuView == null || (eVarL = actionMenuView.L()) == null || !eVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f25175v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f25173u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f25148e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f25148e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f25144a.getMenu();
    }

    View getNavButtonView() {
        return this.f25147d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f25147d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f25147d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C2649c getOuterActionMenuPresenter() {
        return this.f25160n0;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f25144a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f25153j;
    }

    public int getPopupTheme() {
        return this.f25154k;
    }

    public CharSequence getSubtitle() {
        return this.f25179y;
    }

    final TextView getSubtitleTextView() {
        return this.f25146c;
    }

    public CharSequence getTitle() {
        return this.f25178x;
    }

    public int getTitleMarginBottom() {
        return this.f25169s;
    }

    public int getTitleMarginEnd() {
        return this.f25165q;
    }

    public int getTitleMarginStart() {
        return this.f25163p;
    }

    public int getTitleMarginTop() {
        return this.f25167r;
    }

    final TextView getTitleTextView() {
        return this.f25145b;
    }

    public J getWrapper() {
        if (this.f25158m0 == null) {
            this.f25158m0 = new l0(this, true);
        }
        return this.f25158m0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof AbstractC2646a.C0424a ? new g((AbstractC2646a.C0424a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f25176v0);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f25137C = false;
        }
        if (!this.f25137C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f25137C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f25137C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f25140F;
        boolean zB = s0.b(this);
        int i12 = !zB ? 1 : 0;
        if (P(this.f25147d)) {
            F(this.f25147d, i10, 0, i11, 0, this.f25161o);
            measuredWidth = this.f25147d.getMeasuredWidth() + s(this.f25147d);
            iMax = Math.max(0, this.f25147d.getMeasuredHeight() + t(this.f25147d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f25147d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (P(this.f25151h)) {
            F(this.f25151h, i10, 0, i11, 0, this.f25161o);
            measuredWidth = this.f25151h.getMeasuredWidth() + s(this.f25151h);
            iMax = Math.max(iMax, this.f25151h.getMeasuredHeight() + t(this.f25151h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f25151h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (P(this.f25144a)) {
            F(this.f25144a, i10, iMax3, i11, 0, this.f25161o);
            measuredWidth2 = this.f25144a.getMeasuredWidth() + s(this.f25144a);
            iMax = Math.max(iMax, this.f25144a.getMeasuredHeight() + t(this.f25144a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f25144a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (P(this.f25152i)) {
            iArr = iArr2;
            iMax4 += E(this.f25152i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f25152i.getMeasuredHeight() + t(this.f25152i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f25152i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (P(this.f25148e)) {
            iMax4 += E(this.f25148e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f25148e.getMeasuredHeight() + t(this.f25148e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f25148e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f25188b == 0 && P(childAt)) {
                iMax4 += E(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f25167r + this.f25169s;
        int i16 = this.f25163p + this.f25165q;
        if (P(this.f25145b)) {
            E(this.f25145b, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.f25145b.getMeasuredWidth() + s(this.f25145b);
            int measuredHeight2 = this.f25145b.getMeasuredHeight() + t(this.f25145b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f25145b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (P(this.f25146c)) {
            iMax2 = Math.max(iMax2, E(this.f25146c, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f25146c.getMeasuredHeight() + t(this.f25146c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f25146c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f25144a;
        androidx.appcompat.view.menu.e eVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = iVar.f25189c;
        if (i10 != 0 && this.f25162o0 != null && eVarL != null && (menuItemFindItem = eVarL.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f25190d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f25171t.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f25162o0;
        if (fVar != null && (gVar = fVar.f25186b) != null) {
            iVar.f25189c = gVar.getItemId();
        }
        iVar.f25190d = B();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f25136B = false;
        }
        if (!this.f25136B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f25136B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f25136B = false;
        }
        return true;
    }

    @Override // androidx.core.view.InterfaceC2787v
    public void removeMenuProvider(androidx.core.view.B b10) {
        this.f25141G.j(b10);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f25174u0 != z10) {
            this.f25174u0 = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(AbstractC5323a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f25168r0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f25175v) {
            this.f25175v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f25173u) {
            this.f25173u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(AbstractC5323a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(AbstractC5323a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f25147d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f25143I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f25144a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f25154k != i10) {
            this.f25154k = i10;
            if (i10 == 0) {
                this.f25153j = getContext();
            } else {
                this.f25153j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f25169s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f25165q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f25163p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f25167r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        f fVar = this.f25162o0;
        return (fVar == null || fVar.f25186b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f25144a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator it = this.f25142H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        G();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class g extends AbstractC2646a.C0424a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25188b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f25188b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f25188b = 0;
            this.f24387a = 8388627;
        }

        public g(g gVar) {
            super((AbstractC2646a.C0424a) gVar);
            this.f25188b = 0;
            this.f25188b = gVar.f25188b;
        }

        public g(AbstractC2646a.C0424a c0424a) {
            super(c0424a);
            this.f25188b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f25188b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f25188b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47953O);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f25151h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f25151h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f25151h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f25149f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f25148e)) {
                c(this.f25148e, true);
            }
        } else {
            ImageView imageView = this.f25148e;
            if (imageView != null && z(imageView)) {
                removeView(this.f25148e);
                this.f25139E.remove(this.f25148e);
            }
        }
        ImageView imageView2 = this.f25148e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f25148e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f25147d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            m0.a(this.f25147d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f25147d)) {
                c(this.f25147d, true);
            }
        } else {
            ImageButton imageButton = this.f25147d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f25147d);
                this.f25139E.remove(this.f25147d);
            }
        }
        ImageButton imageButton2 = this.f25147d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f25146c;
            if (textView != null && z(textView)) {
                removeView(this.f25146c);
                this.f25139E.remove(this.f25146c);
            }
        } else {
            if (this.f25146c == null) {
                Context context = getContext();
                D d10 = new D(context);
                this.f25146c = d10;
                d10.setSingleLine();
                this.f25146c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f25157m;
                if (i10 != 0) {
                    this.f25146c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f25135A;
                if (colorStateList != null) {
                    this.f25146c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f25146c)) {
                c(this.f25146c, true);
            }
        }
        TextView textView2 = this.f25146c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f25179y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f25135A = colorStateList;
        TextView textView = this.f25146c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f25145b;
            if (textView != null && z(textView)) {
                removeView(this.f25145b);
                this.f25139E.remove(this.f25145b);
            }
        } else {
            if (this.f25145b == null) {
                Context context = getContext();
                D d10 = new D(context);
                this.f25145b = d10;
                d10.setSingleLine();
                this.f25145b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f25155l;
                if (i10 != 0) {
                    this.f25145b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f25180z;
                if (colorStateList != null) {
                    this.f25145b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f25145b)) {
                c(this.f25145b, true);
            }
        }
        TextView textView2 = this.f25145b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f25178x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f25180z = colorStateList;
        TextView textView = this.f25145b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class i extends Q1.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f25190d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f25189c = parcel.readInt();
            this.f25190d = parcel.readInt() != 0;
        }

        @Override // Q1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f25189c);
            parcel.writeInt(this.f25190d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25177w = 8388627;
        this.f25138D = new ArrayList();
        this.f25139E = new ArrayList();
        this.f25140F = new int[2];
        this.f25141G = new C2793y(new Runnable() { // from class: androidx.appcompat.widget.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f25425a.y();
            }
        });
        this.f25142H = new ArrayList();
        this.f25156l0 = new a();
        this.f25176v0 = new b();
        h0 h0VarV = h0.v(getContext(), attributeSet, i.j.f48307j3, i10, 0);
        AbstractC2747a0.i0(this, context, i.j.f48307j3, attributeSet, h0VarV.r(), i10, 0);
        this.f25155l = h0VarV.n(i.j.f48189L3, 0);
        this.f25157m = h0VarV.n(i.j.f48144C3, 0);
        this.f25177w = h0VarV.l(i.j.f48312k3, this.f25177w);
        this.f25159n = h0VarV.l(i.j.f48317l3, 48);
        int iE = h0VarV.e(i.j.f48159F3, 0);
        iE = h0VarV.s(i.j.f48184K3) ? h0VarV.e(i.j.f48184K3, iE) : iE;
        this.f25169s = iE;
        this.f25167r = iE;
        this.f25165q = iE;
        this.f25163p = iE;
        int iE2 = h0VarV.e(i.j.f48174I3, -1);
        if (iE2 >= 0) {
            this.f25163p = iE2;
        }
        int iE3 = h0VarV.e(i.j.f48169H3, -1);
        if (iE3 >= 0) {
            this.f25165q = iE3;
        }
        int iE4 = h0VarV.e(i.j.f48179J3, -1);
        if (iE4 >= 0) {
            this.f25167r = iE4;
        }
        int iE5 = h0VarV.e(i.j.f48164G3, -1);
        if (iE5 >= 0) {
            this.f25169s = iE5;
        }
        this.f25161o = h0VarV.f(i.j.f48372w3, -1);
        int iE6 = h0VarV.e(i.j.f48352s3, Integer.MIN_VALUE);
        int iE7 = h0VarV.e(i.j.f48332o3, Integer.MIN_VALUE);
        int iF = h0VarV.f(i.j.f48342q3, 0);
        int iF2 = h0VarV.f(i.j.f48347r3, 0);
        h();
        this.f25171t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f25171t.g(iE6, iE7);
        }
        this.f25173u = h0VarV.e(i.j.f48357t3, Integer.MIN_VALUE);
        this.f25175v = h0VarV.e(i.j.f48337p3, Integer.MIN_VALUE);
        this.f25149f = h0VarV.g(i.j.f48327n3);
        this.f25150g = h0VarV.p(i.j.f48322m3);
        CharSequence charSequenceP = h0VarV.p(i.j.f48154E3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = h0VarV.p(i.j.f48139B3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f25153j = getContext();
        setPopupTheme(h0VarV.n(i.j.f48134A3, 0));
        Drawable drawableG = h0VarV.g(i.j.f48387z3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = h0VarV.p(i.j.f48382y3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = h0VarV.g(i.j.f48362u3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = h0VarV.p(i.j.f48367v3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (h0VarV.s(i.j.f48194M3)) {
            setTitleTextColor(h0VarV.c(i.j.f48194M3));
        }
        if (h0VarV.s(i.j.f48149D3)) {
            setSubtitleTextColor(h0VarV.c(i.j.f48149D3));
        }
        if (h0VarV.s(i.j.f48377x3)) {
            x(h0VarV.n(i.j.f48377x3, 0));
        }
        h0VarV.x();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class f implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f25185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f25186b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean d(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f25151h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f25151h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f25151h);
            }
            Toolbar.this.f25152i = gVar.getActionView();
            this.f25186b = gVar;
            ViewParent parent2 = Toolbar.this.f25152i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f25152i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f24387a = (toolbar4.f25159n & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f25188b = 2;
                toolbar4.f25152i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f25152i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f25152i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public Parcelable h() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(boolean z10) {
            if (this.f25186b != null) {
                androidx.appcompat.view.menu.e eVar = this.f25185a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f25185a.getItem(i10) == this.f25186b) {
                            return;
                        }
                    }
                }
                k(this.f25185a, this.f25186b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean j() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f25152i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f25152i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f25151h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f25152i = null;
            toolbar3.a();
            this.f25186b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void l(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f25185a;
            if (eVar2 != null && (gVar = this.f25186b) != null) {
                eVar2.f(gVar);
            }
            this.f25185a = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }
    }
}
