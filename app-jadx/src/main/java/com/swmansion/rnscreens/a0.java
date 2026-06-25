package com.swmansion.rnscreens;

import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC2646a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.d0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends AbstractC4528f implements com.facebook.react.uimanager.L {

    /* JADX INFO: renamed from: D */
    public static final a f44416D = new a(null);

    /* JADX INFO: renamed from: A */
    private final View.OnClickListener f44417A;

    /* JADX INFO: renamed from: B */
    private boolean f44418B;

    /* JADX INFO: renamed from: C */
    private final c0 f44419C;

    /* JADX INFO: renamed from: g */
    private final com.facebook.react.uimanager.L f44420g;

    /* JADX INFO: renamed from: h */
    private final ArrayList f44421h;

    /* JADX INFO: renamed from: i */
    private final C4527e f44422i;

    /* JADX INFO: renamed from: j */
    private boolean f44423j;

    /* JADX INFO: renamed from: k */
    private boolean f44424k;

    /* JADX INFO: renamed from: l */
    private String f44425l;

    /* JADX INFO: renamed from: m */
    private int f44426m;

    /* JADX INFO: renamed from: n */
    private String f44427n;

    /* JADX INFO: renamed from: o */
    private String f44428o;

    /* JADX INFO: renamed from: p */
    private float f44429p;

    /* JADX INFO: renamed from: q */
    private int f44430q;

    /* JADX INFO: renamed from: r */
    private Integer f44431r;

    /* JADX INFO: renamed from: s */
    private boolean f44432s;

    /* JADX INFO: renamed from: t */
    private boolean f44433t;

    /* JADX INFO: renamed from: u */
    private boolean f44434u;

    /* JADX INFO: renamed from: v */
    private boolean f44435v;

    /* JADX INFO: renamed from: w */
    private int f44436w;

    /* JADX INFO: renamed from: x */
    private boolean f44437x;

    /* JADX INFO: renamed from: y */
    private final int f44438y;

    /* JADX INFO: renamed from: z */
    private final int f44439z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextView a(Toolbar toolbar) {
            AbstractC5504s.h(toolbar, "toolbar");
            int childCount = toolbar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = toolbar.getChildAt(i10);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44440a;

        static {
            int[] iArr = new int[d0.a.values().length];
            try {
                iArr[d0.a.f44454a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.a.f44456c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.a.f44455b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44440a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context, com.facebook.react.uimanager.L pointerEventsImpl) {
        super(context);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(pointerEventsImpl, "pointerEventsImpl");
        this.f44420g = pointerEventsImpl;
        this.f44421h = new ArrayList(3);
        this.f44417A = new View.OnClickListener() { // from class: com.swmansion.rnscreens.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.e(this.f44415a, view);
            }
        };
        this.f44419C = new c0();
        setVisibility(8);
        C4527e c4527e = new C4527e(context, this);
        this.f44422i = c4527e;
        this.f44438y = c4527e.getContentInsetStart();
        this.f44439z = c4527e.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            c4527e.setBackgroundColor(typedValue.data);
        }
        c4527e.setClipChildren(false);
    }

    public static final void e(a0 a0Var, View view) {
        X screenFragment = a0Var.getScreenFragment();
        if (screenFragment != null) {
            S screenStack = a0Var.getScreenStack();
            if (screenStack == null || !AbstractC5504s.c(screenStack.getRootScreen(), screenFragment.k())) {
                if (screenFragment.k().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.Y();
                    return;
                } else {
                    screenFragment.y();
                    return;
                }
            }
            AbstractComponentCallbacksC2838q parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof X) {
                X x10 = (X) parentFragment;
                if (x10.k().getNativeBackButtonDismissalEnabled()) {
                    x10.Y();
                } else {
                    x10.y();
                }
            }
        }
    }

    private final C4546y getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof C4546y) {
            return (C4546y) parent;
        }
        return null;
    }

    private final S getScreenStack() {
        C4546y screen = getScreen();
        A container = screen != null ? screen.getContainer() : null;
        if (container instanceof S) {
            return (S) container;
        }
        return null;
    }

    private final void j() {
        C4546y screen;
        if (getParent() == null || this.f44434u || (screen = getScreen()) == null || screen.n()) {
            return;
        }
        l();
    }

    public final void d(d0 child, int i10) {
        AbstractC5504s.h(child, "child");
        this.f44421h.add(i10, child);
        j();
    }

    public final void f() {
        this.f44434u = true;
    }

    public final d0 g(int i10) {
        Object obj = this.f44421h.get(i10);
        AbstractC5504s.g(obj, "get(...)");
        return (d0) obj;
    }

    public final int getConfigSubviewsCount() {
        return this.f44421h.size();
    }

    public final c0 getHeaderHeightUpdateProxy() {
        return this.f44419C;
    }

    @Override // com.facebook.react.uimanager.L
    public com.facebook.react.uimanager.C getPointerEvents() {
        return this.f44420g.getPointerEvents();
    }

    public final int getPreferredContentInsetEnd() {
        return this.f44438y;
    }

    public final int getPreferredContentInsetStart() {
        return this.f44438y;
    }

    public final int getPreferredContentInsetStartWithNavigation() {
        if (this.f44418B) {
            return 0;
        }
        return this.f44439z;
    }

    public final X getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof C4546y)) {
            return null;
        }
        AbstractComponentCallbacksC2838q fragment = ((C4546y) parent).getFragment();
        if (fragment instanceof X) {
            return (X) fragment;
        }
        return null;
    }

    public final C4527e getToolbar() {
        return this.f44422i;
    }

    public final boolean h() {
        return this.f44423j;
    }

    public final boolean i() {
        return this.f44424k;
    }

    public final void k(Toolbar toolbar, boolean z10) {
        Object next;
        AbstractC5504s.h(toolbar, "toolbar");
        if (z10) {
            int currentContentInsetStart = toolbar.getNavigationIcon() != null ? toolbar.getCurrentContentInsetStart() + toolbar.getPaddingStart() : Math.max(toolbar.getCurrentContentInsetStart(), toolbar.getPaddingStart());
            Iterator it = this.f44421h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((d0) next).getType() == d0.a.f44454a) {
                        break;
                    }
                }
            }
            d0 d0Var = (d0) next;
            if (d0Var != null) {
                currentContentInsetStart = d0Var.getLeft();
            }
            int currentContentInsetEnd = toolbar.getCurrentContentInsetEnd() + toolbar.getPaddingEnd();
            this.f44419C.a(this, getScreen());
            a(toolbar.getWidth(), toolbar.getHeight(), currentContentInsetStart, currentContentInsetEnd);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l() {
        Drawable navigationIcon;
        X screenFragment;
        X screenFragment2;
        ReactContext reactContextR;
        S screenStack = getScreenStack();
        boolean z10 = screenStack == null || AbstractC5504s.c(screenStack.getTopScreen(), getParent());
        if (this.f44437x && z10 && !this.f44434u) {
            X screenFragment3 = getScreenFragment();
            androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (cVar == null) {
                return;
            }
            String str = this.f44428o;
            if (str != null) {
                if (AbstractC5504s.c(str, "rtl")) {
                    this.f44422i.setLayoutDirection(1);
                } else if (AbstractC5504s.c(this.f44428o, "ltr")) {
                    this.f44422i.setLayoutDirection(0);
                }
            }
            C4546y screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    reactContextR = (ReactContext) context;
                } else {
                    G fragmentWrapper = screen.getFragmentWrapper();
                    reactContextR = fragmentWrapper != null ? fragmentWrapper.r() : null;
                }
                g0.f44486a.p(screen, cVar, reactContextR);
            }
            if (this.f44423j) {
                if (this.f44422i.getParent() != null && (screenFragment2 = getScreenFragment()) != null) {
                    screenFragment2.h0();
                }
                this.f44419C.a(this, getScreen());
                return;
            }
            if (this.f44422i.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                screenFragment.o0(this.f44422i);
            }
            cVar.T(this.f44422i);
            AbstractC2646a abstractC2646aK = cVar.K();
            if (abstractC2646aK == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            X screenFragment4 = getScreenFragment();
            abstractC2646aK.r((screenFragment4 == null || !screenFragment4.U() || this.f44432s) ? false : true);
            abstractC2646aK.u(this.f44425l);
            if (TextUtils.isEmpty(this.f44425l)) {
                this.f44418B = true;
            }
            this.f44422i.V();
            this.f44422i.setNavigationOnClickListener(this.f44417A);
            X screenFragment5 = getScreenFragment();
            if (screenFragment5 != null) {
                screenFragment5.p0(this.f44433t);
            }
            X screenFragment6 = getScreenFragment();
            if (screenFragment6 != null) {
                screenFragment6.q0(this.f44424k);
            }
            TextView textViewA = f44416D.a(this.f44422i);
            int i10 = this.f44426m;
            if (i10 != 0) {
                this.f44422i.setTitleTextColor(i10);
            }
            if (textViewA != null) {
                String str2 = this.f44427n;
                if (str2 != null || this.f44430q > 0) {
                    int i11 = this.f44430q;
                    AssetManager assets = getContext().getAssets();
                    AbstractC5504s.g(assets, "getAssets(...)");
                    textViewA.setTypeface(com.facebook.react.views.text.p.a(null, 0, i11, str2, assets));
                }
                float f10 = this.f44429p;
                if (f10 > 0.0f) {
                    textViewA.setTextSize(f10);
                }
            }
            Integer num = this.f44431r;
            if (num != null) {
                this.f44422i.setBackgroundColor(num.intValue());
            }
            if (this.f44436w != 0 && (navigationIcon = this.f44422i.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.f44436w, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount = this.f44422i.getChildCount() - 1; -1 < childCount; childCount--) {
                if (this.f44422i.getChildAt(childCount) instanceof d0) {
                    this.f44422i.removeViewAt(childCount);
                }
            }
            int size = this.f44421h.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = this.f44421h.get(i12);
                AbstractC5504s.g(obj, "get(...)");
                d0 d0Var = (d0) obj;
                d0.a type = d0Var.getType();
                if (type == d0.a.f44457d) {
                    View childAt = d0Var.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                    }
                    abstractC2646aK.s(imageView.getDrawable());
                } else {
                    Toolbar.g gVar = new Toolbar.g(-2, -1);
                    int i13 = b.f44440a[type.ordinal()];
                    if (i13 == 1) {
                        if (!this.f44435v) {
                            this.f44422i.setNavigationIcon((Drawable) null);
                        }
                        this.f44422i.setTitle((CharSequence) null);
                        gVar.f24387a = 8388611;
                    } else if (i13 == 2) {
                        gVar.f24387a = 8388613;
                    } else if (i13 == 3) {
                        ((ViewGroup.MarginLayoutParams) gVar).width = -1;
                        gVar.f24387a = 1;
                        this.f44422i.setTitle((CharSequence) null);
                    }
                    d0Var.setLayoutParams(gVar);
                    this.f44422i.addView(d0Var);
                }
            }
            this.f44419C.a(this, getScreen());
        }
    }

    public final void m() {
        this.f44421h.clear();
        j();
    }

    public final void n(int i10) {
        this.f44421h.remove(i10);
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44437x = true;
        int iF = com.facebook.react.uimanager.f0.f(this);
        Context context = getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new Ta.a(iF, getId()));
        }
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44437x = false;
        int iF = com.facebook.react.uimanager.f0.f(this);
        Context context = getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new Ta.c(iF, getId()));
        }
    }

    public final void setBackButtonInCustomView(boolean z10) {
        this.f44435v = z10;
    }

    public final void setBackgroundColor(Integer num) {
        this.f44431r = num;
    }

    public final void setDirection(String str) {
        this.f44428o = str;
    }

    public final void setHeaderHidden(boolean z10) {
        this.f44423j = z10;
    }

    public final void setHeaderTranslucent(boolean z10) {
        this.f44424k = z10;
    }

    public final void setHidden(boolean z10) {
        this.f44423j = z10;
    }

    public final void setHideBackButton(boolean z10) {
        this.f44432s = z10;
    }

    public final void setHideShadow(boolean z10) {
        this.f44433t = z10;
    }

    public final void setTintColor(int i10) {
        this.f44436w = i10;
    }

    public final void setTitle(String str) {
        this.f44425l = str;
    }

    public final void setTitleColor(int i10) {
        this.f44426m = i10;
    }

    public final void setTitleEmpty(boolean z10) {
        this.f44418B = z10;
    }

    public final void setTitleFontFamily(String str) {
        this.f44427n = str;
    }

    public final void setTitleFontSize(float f10) {
        this.f44429p = f10;
    }

    public final void setTitleFontWeight(String str) {
        this.f44430q = com.facebook.react.views.text.p.d(str);
    }

    public final void setTranslucent(boolean z10) {
        this.f44424k = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(Context context) {
        this(context, new C4539q());
        AbstractC5504s.h(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
