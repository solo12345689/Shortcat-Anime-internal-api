package com.swmansion.rnscreens;

import H9.l;
import Ud.AbstractC2279u;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2759g0;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import be.AbstractC3048a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.B;
import fb.AbstractC4791a;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: com.swmansion.rnscreens.y */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4546y extends AbstractC4530h implements B.a, Va.a {

    /* JADX INFO: renamed from: l0 */
    public static final b f44755l0 = new b(null);

    /* JADX INFO: renamed from: A */
    private float f44756A;

    /* JADX INFO: renamed from: B */
    private boolean f44757B;

    /* JADX INFO: renamed from: C */
    private boolean f44758C;

    /* JADX INFO: renamed from: D */
    private boolean f44759D;

    /* JADX INFO: renamed from: E */
    private D f44760E;

    /* JADX INFO: renamed from: F */
    private String f44761F;

    /* JADX INFO: renamed from: G */
    private Boolean f44762G;

    /* JADX INFO: renamed from: H */
    private Boolean f44763H;

    /* JADX INFO: renamed from: I */
    private boolean f44764I;

    /* JADX INFO: renamed from: e */
    private final C3284b0 f44765e;

    /* JADX INFO: renamed from: f */
    private boolean f44766f;

    /* JADX INFO: renamed from: g */
    private G f44767g;

    /* JADX INFO: renamed from: h */
    private A f44768h;

    /* JADX INFO: renamed from: i */
    private a f44769i;

    /* JADX INFO: renamed from: j */
    private boolean f44770j;

    /* JADX INFO: renamed from: k */
    private e f44771k;

    /* JADX INFO: renamed from: l */
    private c f44772l;

    /* JADX INFO: renamed from: m */
    private d f44773m;

    /* JADX INFO: renamed from: n */
    private boolean f44774n;

    /* JADX INFO: renamed from: o */
    private Integer f44775o;

    /* JADX INFO: renamed from: p */
    private String f44776p;

    /* JADX INFO: renamed from: q */
    private Boolean f44777q;

    /* JADX INFO: renamed from: r */
    private boolean f44778r;

    /* JADX INFO: renamed from: s */
    private boolean f44779s;

    /* JADX INFO: renamed from: t */
    private boolean f44780t;

    /* JADX INFO: renamed from: u */
    private float f44781u;

    /* JADX INFO: renamed from: v */
    private boolean f44782v;

    /* JADX INFO: renamed from: w */
    private Sa.p f44783w;

    /* JADX INFO: renamed from: x */
    private int f44784x;

    /* JADX INFO: renamed from: y */
    private int f44785y;

    /* JADX INFO: renamed from: z */
    private boolean f44786z;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final a f44787a = new a("INACTIVE", 0);

        /* JADX INFO: renamed from: b */
        public static final a f44788b = new a("TRANSITIONING_OR_BELOW_TOP", 1);

        /* JADX INFO: renamed from: c */
        public static final a f44789c = new a("ON_TOP", 2);

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ a[] f44790d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ EnumEntries f44791e;

        static {
            a[] aVarArrA = a();
            f44790d = aVarArrA;
            f44791e = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f44787a, f44788b, f44789c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f44790d.clone();
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends Enum {

        /* JADX INFO: renamed from: a */
        public static final c f44792a = new c("PUSH", 0);

        /* JADX INFO: renamed from: b */
        public static final c f44793b = new c("POP", 1);

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ c[] f44794c;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ EnumEntries f44795d;

        static {
            c[] cVarArrA = a();
            f44794c = cVarArrA;
            f44795d = AbstractC3048a.a(cVarArrA);
        }

        private c(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f44792a, f44793b};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f44794c.clone();
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends Enum {

        /* JADX INFO: renamed from: a */
        public static final d f44796a = new d("DEFAULT", 0);

        /* JADX INFO: renamed from: b */
        public static final d f44797b = new d("NONE", 1);

        /* JADX INFO: renamed from: c */
        public static final d f44798c = new d("FADE", 2);

        /* JADX INFO: renamed from: d */
        public static final d f44799d = new d("SLIDE_FROM_BOTTOM", 3);

        /* JADX INFO: renamed from: e */
        public static final d f44800e = new d("SLIDE_FROM_RIGHT", 4);

        /* JADX INFO: renamed from: f */
        public static final d f44801f = new d("SLIDE_FROM_LEFT", 5);

        /* JADX INFO: renamed from: g */
        public static final d f44802g = new d("FADE_FROM_BOTTOM", 6);

        /* JADX INFO: renamed from: h */
        public static final d f44803h = new d("IOS_FROM_RIGHT", 7);

        /* JADX INFO: renamed from: i */
        public static final d f44804i = new d("IOS_FROM_LEFT", 8);

        /* JADX INFO: renamed from: j */
        private static final /* synthetic */ d[] f44805j;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ EnumEntries f44806k;

        static {
            d[] dVarArrA = a();
            f44805j = dVarArrA;
            f44806k = AbstractC3048a.a(dVarArrA);
        }

        private d(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f44796a, f44797b, f44798c, f44799d, f44800e, f44801f, f44802g, f44803h, f44804i};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f44805j.clone();
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends Enum {

        /* JADX INFO: renamed from: a */
        public static final e f44807a = new e("PUSH", 0);

        /* JADX INFO: renamed from: b */
        public static final e f44808b = new e("MODAL", 1);

        /* JADX INFO: renamed from: c */
        public static final e f44809c = new e("TRANSPARENT_MODAL", 2);

        /* JADX INFO: renamed from: d */
        public static final e f44810d = new e("FORM_SHEET", 3);

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ e[] f44811e;

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ EnumEntries f44812f;

        static {
            e[] eVarArrA = a();
            f44811e = eVarArrA;
            f44812f = AbstractC3048a.a(eVarArrA);
        }

        private e(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f44807a, f44808b, f44809c, f44810d};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f44811e.clone();
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44813a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f44809c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f44810d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44813a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.y$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends Enum {

        /* JADX INFO: renamed from: a */
        public static final g f44814a = new g("ORIENTATION", 0);

        /* JADX INFO: renamed from: b */
        public static final g f44815b = new g("STYLE", 1);

        /* JADX INFO: renamed from: c */
        public static final g f44816c = new g("HIDDEN", 2);

        /* JADX INFO: renamed from: d */
        public static final g f44817d = new g("ANIMATED", 3);

        /* JADX INFO: renamed from: e */
        public static final g f44818e = new g("NAVIGATION_BAR_HIDDEN", 4);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ g[] f44819f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ EnumEntries f44820g;

        static {
            g[] gVarArrA = a();
            f44819f = gVarArrA;
            f44820g = AbstractC3048a.a(gVarArrA);
        }

        private g(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ g[] a() {
            return new g[]{f44814a, f44815b, f44816c, f44817d, f44818e};
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f44819f.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4546y(C3284b0 reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f44765e = reactContext;
        this.f44771k = e.f44807a;
        this.f44772l = c.f44793b;
        this.f44773m = d.f44796a;
        this.f44774n = true;
        this.f44782v = true;
        this.f44783w = new Sa.p(AbstractC2279u.e(Double.valueOf(1.0d)));
        this.f44784x = -1;
        this.f44786z = true;
        this.f44756A = 24.0f;
        this.f44758C = true;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.f44764I = true;
    }

    private final int B(int i10, float f10) {
        X xA;
        Sa.o sheetDelegate;
        Integer numQ;
        AbstractComponentCallbacksC2838q fragment = getFragment();
        return (fragment == null || (xA = Ua.a.a(fragment)) == null || (sheetDelegate = xA.getSheetDelegate()) == null || (numQ = sheetDelegate.Q()) == null) ? i10 : AbstractC5874j.i(i10, (int) (numQ.intValue() + f10));
    }

    private final void C(BottomSheetBehavior bottomSheetBehavior, int i10) {
        Sa.a.e(bottomSheetBehavior, Integer.valueOf(i10), false, 2, null);
        requestLayout();
    }

    private final void E(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((viewGroup instanceof androidx.swiperefreshlayout.widget.c) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i10);
                } else if (childAt != null) {
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof a0) {
                    E(((a0) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    E((ViewGroup) childAt);
                }
            }
        }
    }

    private final void G(final BottomSheetBehavior bottomSheetBehavior, int i10, int i11) {
        final float translationY = getTranslationY();
        int iB = B(i10, translationY);
        final int iB2 = B(i11, translationY);
        float f10 = iB2 - iB;
        if (f10 == 0.0f) {
            return;
        }
        if (f10 > 0.0f) {
            setTranslationY(getTranslationY() + f10);
            animate().translationY(translationY).withStartAction(new Runnable() { // from class: com.swmansion.rnscreens.u
                @Override // java.lang.Runnable
                public final void run() {
                    C4546y.H(bottomSheetBehavior, iB2, this);
                }
            }).withEndAction(new Runnable() { // from class: com.swmansion.rnscreens.v
                @Override // java.lang.Runnable
                public final void run() {
                    C4546y.I(this.f44749a);
                }
            }).start();
        } else {
            animate().translationY(translationY - f10).withStartAction(new Runnable() { // from class: com.swmansion.rnscreens.w
                @Override // java.lang.Runnable
                public final void run() {
                    C4546y.J(bottomSheetBehavior, iB2);
                }
            }).withEndAction(new Runnable() { // from class: com.swmansion.rnscreens.x
                @Override // java.lang.Runnable
                public final void run() {
                    C4546y.K(this.f44752a, iB2, translationY);
                }
            }).start();
        }
    }

    public static final void H(BottomSheetBehavior bottomSheetBehavior, int i10, C4546y c4546y) {
        Sa.a.c(bottomSheetBehavior, Integer.valueOf(i10), null, 2, null);
        c4546y.layout(c4546y.getLeft(), c4546y.getBottom() - i10, c4546y.getRight(), c4546y.getBottom());
    }

    public static final void I(C4546y c4546y) {
        c4546y.getParent().requestLayout();
        c4546y.y();
    }

    public static final void J(BottomSheetBehavior bottomSheetBehavior, int i10) {
        Sa.a.c(bottomSheetBehavior, Integer.valueOf(i10), null, 2, null);
    }

    public static final void K(C4546y c4546y, int i10, float f10) {
        c4546y.layout(c4546y.getLeft(), c4546y.getBottom() - i10, c4546y.getRight(), c4546y.getBottom());
        c4546y.setTranslationY(f10);
        c4546y.getParent().requestLayout();
        c4546y.y();
    }

    private final void L(BottomSheetBehavior bottomSheetBehavior, int i10) {
        int iB = B(i10, getTranslationY());
        Sa.a.c(bottomSheetBehavior, Integer.valueOf(iB), null, 2, null);
        layout(getLeft(), getBottom() - iB, getRight(), getBottom());
        getParent().requestLayout();
        b(getWidth(), iB, getTop() + ((int) getTranslationY()));
    }

    private final void i(int i10, int i11, int i12) {
        b(i10, i11, i12);
    }

    private final void j(int i10, boolean z10) {
        int iE = com.facebook.react.uimanager.f0.e(this.f44765e);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.d(new Ta.s(iE, getId(), i10, z10));
        }
    }

    private final void l(ViewGroup viewGroup) {
        for (View view : AbstractC2759g0.a(viewGroup)) {
            viewGroup.endViewTransition(view);
            if (view instanceof a0) {
                l(((a0) view).getToolbar());
            }
            if (view instanceof ViewGroup) {
                l((ViewGroup) view);
            }
        }
    }

    private final boolean m(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && m((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    private final boolean o() {
        return this.f44768h instanceof S;
    }

    public final void A() {
        if (this.f44757B) {
            return;
        }
        this.f44759D = true;
    }

    public final void D() {
        if (this.f44778r) {
            return;
        }
        this.f44778r = true;
        E(this);
    }

    public final void F() {
        if (this.f44759D) {
            this.f44759D = false;
            AbstractComponentCallbacksC2838q fragment = getFragment();
            if (fragment != null) {
                fragment.startPostponedEnterTransition();
            }
        }
    }

    @Override // com.swmansion.rnscreens.B.a
    public void a(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        BottomSheetBehavior<C4546y> sheetBehavior = getSheetBehavior();
        if (Sa.r.d(this) && Sa.r.b(this) && sheetBehavior != null) {
            int iA = Sa.a.a(sheetBehavior);
            boolean z11 = iA == 0;
            if (iA != i14) {
                if (z11) {
                    C(sheetBehavior, i14);
                } else if (this.f44758C) {
                    G(sheetBehavior, iA, i14);
                } else {
                    L(sheetBehavior, i14);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray container) {
        AbstractC5504s.h(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray container) {
        AbstractC5504s.h(container, "container");
    }

    public final a getActivityState() {
        return this.f44769i;
    }

    @Override // Va.a
    public AbstractComponentCallbacksC2838q getAssociatedFragment() {
        return getFragment();
    }

    public final A getContainer() {
        return this.f44768h;
    }

    public final B getContentWrapper() {
        Object next;
        Iterator it = AbstractC2759g0.a(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((View) next) instanceof B) {
                break;
            }
        }
        if (next instanceof B) {
            return (B) next;
        }
        return null;
    }

    public final D getFooter() {
        return this.f44760E;
    }

    public final AbstractComponentCallbacksC2838q getFragment() {
        G g10 = this.f44767g;
        if (g10 != null) {
            return g10.a();
        }
        return null;
    }

    public final G getFragmentWrapper() {
        return this.f44767g;
    }

    public final a0 getHeaderConfig() {
        Object next;
        Iterator it = AbstractC2759g0.a(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((View) next) instanceof a0) {
                break;
            }
        }
        if (next instanceof a0) {
            return (a0) next;
        }
        return null;
    }

    public final boolean getInsetsApplied() {
        return this.f44766f;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f44764I;
    }

    public final C3284b0 getReactContext() {
        return this.f44765e;
    }

    public final EventDispatcher getReactEventDispatcher() {
        return com.facebook.react.uimanager.f0.c(this.f44765e, getId());
    }

    public final c getReplaceAnimation() {
        return this.f44772l;
    }

    public final String getScreenId() {
        return this.f44776p;
    }

    public final Integer getScreenOrientation() {
        return this.f44775o;
    }

    public final BottomSheetBehavior<C4546y> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        CoordinatorLayout.c cVarE = fVar != null ? fVar.e() : null;
        if (cVarE instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarE;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.f44786z;
    }

    public final float getSheetCornerRadius() {
        return this.f44781u;
    }

    public final boolean getSheetDefaultResizeAnimationEnabled() {
        return this.f44758C;
    }

    public final Sa.p getSheetDetents() {
        return this.f44783w;
    }

    public final float getSheetElevation() {
        return this.f44756A;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.f44782v;
    }

    public final int getSheetInitialDetentIndex() {
        return this.f44785y;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.f44784x;
    }

    public final boolean getSheetShouldOverflowTopInset() {
        return this.f44757B;
    }

    public final boolean getShouldTriggerPostponedTransitionAfterLayout() {
        return this.f44759D;
    }

    public final d getStackAnimation() {
        return this.f44773m;
    }

    public final e getStackPresentation() {
        return this.f44771k;
    }

    public final String getStatusBarStyle() {
        return this.f44761F;
    }

    public final void h(int i10) {
        C4527e toolbar;
        setImportantForAccessibility(i10);
        a0 headerConfig = getHeaderConfig();
        if (headerConfig == null || (toolbar = headerConfig.getToolbar()) == null) {
            return;
        }
        toolbar.setImportantForAccessibility(i10);
    }

    public final void k() {
        if (this.f44778r) {
            this.f44778r = false;
            l(this);
        }
    }

    public final boolean n() {
        return this.f44778r;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f44766f = true;
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        AbstractComponentCallbacksC2838q fragment;
        X xA;
        Sa.o sheetDelegate;
        super.onAttachedToWindow();
        if (!Sa.r.d(this) || (fragment = getFragment()) == null || (xA = Ua.a.a(fragment)) == null || (sheetDelegate = xA.getSheetDelegate()) == null) {
            return;
        }
        C4533k.f44637a.a(sheetDelegate);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a0 headerConfig;
        a0 headerConfig2;
        Window window;
        if (z10 && o() && !Sa.r.d(this)) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.f44766f || (headerConfig = getHeaderConfig()) == null || headerConfig.h() || (headerConfig2 = getHeaderConfig()) == null || headerConfig2.i()) {
                i(i14, i15, i11);
                return;
            }
            Activity currentActivity = this.f44765e.getCurrentActivity();
            View decorView = (currentActivity == null || (window = currentActivity.getWindow()) == null) ? null : window.getDecorView();
            if (decorView == null) {
                throw new IllegalArgumentException("[RNScreens] DecorView is required for applying inset correction, but was null.");
            }
            int iA = AbstractC4791a.a(decorView);
            i(i14, i15 - iA, i11 + iA);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (Sa.r.d(this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final Boolean p() {
        return this.f44763H;
    }

    public final Boolean q() {
        return this.f44777q;
    }

    public final Boolean r() {
        return this.f44762G;
    }

    public final boolean s() {
        int i10 = f.f44813a[this.f44771k.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public final void setActivityState(a activityState) {
        AbstractC5504s.h(activityState, "activityState");
        a aVar = this.f44769i;
        if (activityState == aVar) {
            return;
        }
        if ((this.f44768h instanceof S) && aVar != null) {
            AbstractC5504s.e(aVar);
            if (activityState.compareTo(aVar) < 0) {
                throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
            }
        }
        this.f44769i = activityState;
        A a10 = this.f44768h;
        if (a10 != null) {
            a10.r();
        }
    }

    public final void setBeingRemoved(boolean z10) {
        this.f44778r = z10;
    }

    public final void setContainer(A a10) {
        this.f44768h = a10;
    }

    public final void setFooter(D d10) {
        BottomSheetBehavior<C4546y> sheetBehavior;
        if (d10 == null && this.f44760E != null) {
            BottomSheetBehavior<C4546y> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                D d11 = this.f44760E;
                AbstractC5504s.e(d11);
                d11.U(sheetBehavior2);
            }
        } else if (d10 != null && (sheetBehavior = getSheetBehavior()) != null) {
            d10.P(sheetBehavior);
        }
        this.f44760E = d10;
    }

    public final void setFragmentWrapper(G g10) {
        this.f44767g = g10;
    }

    public final void setGestureEnabled(boolean z10) {
        this.f44774n = z10;
    }

    public final void setInsetsApplied(boolean z10) {
        this.f44766f = z10;
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z10) {
        this.f44764I = z10;
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            g0.f44486a.c();
        }
        this.f44763H = bool;
        G g10 = this.f44767g;
        if (g10 != null) {
            g0.f44486a.l(this, g10.m());
        }
    }

    public final void setReplaceAnimation(c cVar) {
        AbstractC5504s.h(cVar, "<set-?>");
        this.f44772l = cVar;
    }

    public final void setScreenId(String str) {
        this.f44776p = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setScreenOrientation(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L6
            r3 = 0
            r2.f44775o = r3
            return
        L6:
            com.swmansion.rnscreens.g0 r0 = com.swmansion.rnscreens.g0.f44486a
            r0.d()
            int r1 = r3.hashCode()
            switch(r1) {
                case -1894896954: goto L57;
                case 96673: goto L4b;
                case 729267099: goto L40;
                case 1430647483: goto L35;
                case 1651658175: goto L2a;
                case 1730732811: goto L1e;
                case 2118770584: goto L13;
                default: goto L12;
            }
        L12:
            goto L5f
        L13:
            java.lang.String r1 = "landscape_right"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L1c
            goto L5f
        L1c:
            r3 = 0
            goto L63
        L1e:
            java.lang.String r1 = "landscape_left"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L27
            goto L5f
        L27:
            r3 = 8
            goto L63
        L2a:
            java.lang.String r1 = "portrait_up"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L33
            goto L5f
        L33:
            r3 = 1
            goto L63
        L35:
            java.lang.String r1 = "landscape"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3e
            goto L5f
        L3e:
            r3 = 6
            goto L63
        L40:
            java.lang.String r1 = "portrait"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L49
            goto L5f
        L49:
            r3 = 7
            goto L63
        L4b:
            java.lang.String r1 = "all"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L54
            goto L5f
        L54:
            r3 = 10
            goto L63
        L57:
            java.lang.String r1 = "portrait_down"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L61
        L5f:
            r3 = -1
            goto L63
        L61:
            r3 = 9
        L63:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f44775o = r3
            com.swmansion.rnscreens.G r3 = r2.f44767g
            if (r3 == 0) goto L74
            android.app.Activity r3 = r3.m()
            r0.m(r2, r3)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C4546y.setScreenOrientation(java.lang.String):void");
    }

    public final void setSheetClosesOnTouchOutside(boolean z10) {
        this.f44786z = z10;
    }

    public final void setSheetCornerRadius(float f10) {
        if (this.f44781u == f10) {
            return;
        }
        this.f44781u = f10;
        this.f44780t = true;
    }

    public final void setSheetDefaultResizeAnimationEnabled(boolean z10) {
        this.f44758C = z10;
    }

    public final void setSheetDetents(Sa.p pVar) {
        AbstractC5504s.h(pVar, "<set-?>");
        this.f44783w = pVar;
    }

    public final void setSheetElevation(float f10) {
        this.f44756A = f10;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z10) {
        this.f44782v = z10;
    }

    public final void setSheetGrabberVisible(boolean z10) {
        this.f44779s = z10;
    }

    public final void setSheetInitialDetentIndex(int i10) {
        this.f44785y = i10;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i10) {
        this.f44784x = i10;
    }

    public final void setSheetShouldOverflowTopInset(boolean z10) {
        this.f44757B = z10;
    }

    public final void setShouldTriggerPostponedTransitionAfterLayout(boolean z10) {
        this.f44759D = z10;
    }

    public final void setStackAnimation(d dVar) {
        AbstractC5504s.h(dVar, "<set-?>");
        this.f44773m = dVar;
    }

    public final void setStackPresentation(e eVar) {
        AbstractC5504s.h(eVar, "<set-?>");
        this.f44771k = eVar;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.f44777q = bool;
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            g0.f44486a.e();
        }
        this.f44762G = bool;
        G g10 = this.f44767g;
        if (g10 != null) {
            g0.f44486a.k(this, g10.m());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            g0.f44486a.e();
        }
        this.f44761F = str;
        G g10 = this.f44767g;
        if (g10 != null) {
            g0.f44486a.o(this, g10.m(), g10.r());
        }
    }

    public final void setTransitioning(boolean z10) {
        if (this.f44770j == z10) {
            return;
        }
        this.f44770j = z10;
        boolean zM = m(this);
        if (!zM || getLayerType() == 2) {
            super.setLayerType((!z10 || zM) ? 0 : 2, null);
        }
    }

    public final void t(int i10) {
        Context context = getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = com.facebook.react.uimanager.f0.e(reactContext);
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c(reactContext, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new Ta.d(iE, getId(), com.facebook.react.uimanager.B.g(i10)));
        }
    }

    public final void u(boolean z10) {
        if (Sa.r.d(this) && o()) {
            if (Sa.r.b(this)) {
                requestLayout();
            }
            if (z10) {
                i(getWidth(), getHeight(), getTop());
            }
            D d10 = this.f44760E;
            if (d10 != null) {
                int left = getLeft();
                int top = getTop();
                int right = getRight();
                int bottom = getBottom();
                A a10 = this.f44768h;
                AbstractC5504s.e(a10);
                d10.O(z10, left, top, right, bottom, a10.getHeight());
            }
        }
    }

    public final void v() {
        if (this.f44780t) {
            this.f44780t = false;
            w();
        }
    }

    public final void w() {
        if (this.f44771k != e.f44810d || getBackground() == null) {
            return;
        }
        Drawable background = getBackground();
        H9.h hVar = background instanceof H9.h ? (H9.h) background : null;
        if (hVar != null) {
            float fMax = Math.max(com.facebook.react.uimanager.B.g(this.f44781u), 0.0f);
            l.b bVar = new l.b();
            bVar.A(0, fMax);
            bVar.F(0, fMax);
            hVar.setShapeAppearanceModel(bVar.m());
        }
    }

    public final void x(int i10, boolean z10) {
        j(i10, z10);
        if (z10) {
            y();
        }
    }

    public final void y() {
        b(getWidth(), getHeight(), getTop() + ((int) getTranslationY()));
    }

    public final void z(B wrapper) {
        AbstractC5504s.h(wrapper, "wrapper");
        wrapper.setDelegate$react_native_screens_release(this);
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
    }
}
