package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import be.AbstractC3048a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.d0;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends com.facebook.react.views.view.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f44648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f44649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f44650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f44651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f44652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f44653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f44654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f44655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f44656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f44657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private o0 f44658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f44659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f44660m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44661a = new a("NONE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f44662b = new a("WORDS", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44663c = new a("SENTENCES", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f44664d = new a("CHARACTERS", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f44665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f44666f;

        static {
            a[] aVarArrA = a();
            f44665e = aVarArrA;
            f44666f = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f44661a, f44662b, f44663c, f44664d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f44665e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f44667a = new d("TEXT", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f44668b = new c("PHONE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f44669c = new C0701b("NUMBER", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f44670d = new a("EMAIL", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f44671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f44672f;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.n0.b
            public int b(a capitalize) {
                AbstractC5504s.h(capitalize, "capitalize");
                return 32;
            }
        }

        /* JADX INFO: renamed from: com.swmansion.rnscreens.n0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0701b extends b {
            C0701b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.n0.b
            public int b(a capitalize) {
                AbstractC5504s.h(capitalize, "capitalize");
                return 2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends b {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.n0.b
            public int b(a capitalize) {
                AbstractC5504s.h(capitalize, "capitalize");
                return 3;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class d extends b {

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f44673a;

                static {
                    int[] iArr = new int[a.values().length];
                    try {
                        iArr[a.f44661a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a.f44662b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[a.f44663c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[a.f44664d.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f44673a = iArr;
                }
            }

            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.n0.b
            public int b(a capitalize) {
                AbstractC5504s.h(capitalize, "capitalize");
                int i10 = a.f44673a[capitalize.ordinal()];
                if (i10 == 1) {
                    return 1;
                }
                if (i10 == 2) {
                    return 8192;
                }
                if (i10 == 3) {
                    return 16384;
                }
                if (i10 == 4) {
                    return 4096;
                }
                throw new Td.r();
            }
        }

        static {
            b[] bVarArrA = a();
            f44671e = bVarArrA;
            f44672f = AbstractC3048a.a(bVarArrA);
        }

        public /* synthetic */ b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f44667a, f44668b, f44669c, f44670d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f44671e.clone();
        }

        public abstract int b(a aVar);

        private b(String str, int i10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements SearchView.m {
        c() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            n0.this.P(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            n0.this.Q(str);
            return true;
        }
    }

    public n0(ReactContext reactContext) {
        super(reactContext);
        this.f44648a = b.f44667a;
        this.f44649b = a.f44661a;
        this.f44654g = "";
        this.f44655h = true;
        this.f44657j = true;
        this.f44660m = com.facebook.react.uimanager.f0.f(this);
    }

    private final void K() {
        U(new Ta.o(this.f44660m, getId()));
        setToolbarElementsVisibility(0);
    }

    private final void L(boolean z10) {
        U(z10 ? new Ta.p(this.f44660m, getId()) : new Ta.m(this.f44660m, getId()));
    }

    private final void N() {
        U(new Ta.q(this.f44660m, getId()));
        setToolbarElementsVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(String str) {
        U(new Ta.n(this.f44660m, getId(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(String str) {
        U(new Ta.r(this.f44660m, getId(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L S(n0 n0Var, C4526d newSearchView) {
        X screenStackFragment;
        C4526d searchView;
        AbstractC5504s.h(newSearchView, "newSearchView");
        if (n0Var.f44658k == null) {
            n0Var.f44658k = new o0(newSearchView);
        }
        n0Var.Y();
        if (n0Var.f44656i && (screenStackFragment = n0Var.getScreenStackFragment()) != null && (searchView = screenStackFragment.getSearchView()) != null) {
            searchView.q0();
        }
        return Td.L.f17438a;
    }

    private final void U(com.facebook.react.uimanager.events.d dVar) {
        Context context = getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(n0 n0Var, View view, boolean z10) {
        n0Var.L(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean W(n0 n0Var) {
        n0Var.K();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(n0 n0Var, View view) {
        n0Var.N();
    }

    private final void Y() {
        X screenStackFragment = getScreenStackFragment();
        C4526d searchView = screenStackFragment != null ? screenStackFragment.getSearchView() : null;
        if (searchView != null) {
            if (!this.f44659l) {
                setSearchViewListeners(searchView);
                this.f44659l = true;
            }
            searchView.setInputType(this.f44648a.b(this.f44649b));
            o0 o0Var = this.f44658k;
            if (o0Var != null) {
                o0Var.h(this.f44650c);
            }
            o0 o0Var2 = this.f44658k;
            if (o0Var2 != null) {
                o0Var2.i(this.f44651d);
            }
            o0 o0Var3 = this.f44658k;
            if (o0Var3 != null) {
                o0Var3.e(this.f44652e);
            }
            o0 o0Var4 = this.f44658k;
            if (o0Var4 != null) {
                o0Var4.f(this.f44653f);
            }
            o0 o0Var5 = this.f44658k;
            if (o0Var5 != null) {
                o0Var5.g(this.f44654g, this.f44657j);
            }
            searchView.setOverrideBackAction(this.f44655h);
        }
    }

    private final a0 getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof d0) {
            return ((d0) parent).getConfig();
        }
        return null;
    }

    private final X getScreenStackFragment() {
        a0 headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new c());
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.swmansion.rnscreens.k0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                n0.V(this.f44643a, view, z10);
            }
        });
        searchView.setOnCloseListener(new SearchView.l() { // from class: com.swmansion.rnscreens.l0
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean a() {
                return n0.W(this.f44645a);
            }
        });
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.X(this.f44647a, view);
            }
        });
    }

    private final void setToolbarElementsVisibility(int i10) {
        int i11 = 0;
        int configSubviewsCount = getHeaderConfig() != null ? r0.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            a0 headerConfig = getHeaderConfig();
            d0 d0VarG = headerConfig != null ? headerConfig.g(i11) : null;
            if ((d0VarG != null ? d0VarG.getType() : null) != d0.a.f44458e && d0VarG != null) {
                d0VarG.setVisibility(i10);
            }
            if (i11 == configSubviewsCount) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void H() {
        C4526d searchView;
        X screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.clearFocus();
    }

    public final void I() {
        C4526d searchView;
        X screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.o0();
    }

    public final void J() {
        C4526d searchView;
        X screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.p0();
    }

    public final void M() {
        C4526d searchView;
        X screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.q0();
    }

    public final void O(String str) {
        X screenStackFragment;
        C4526d searchView;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.setText(str);
    }

    public final void T() {
        Y();
    }

    public final a getAutoCapitalize() {
        return this.f44649b;
    }

    public final boolean getAutoFocus() {
        return this.f44656i;
    }

    public final Integer getHeaderIconColor() {
        return this.f44652e;
    }

    public final Integer getHintTextColor() {
        return this.f44653f;
    }

    public final b getInputType() {
        return this.f44648a;
    }

    public final String getPlaceholder() {
        return this.f44654g;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.f44655h;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.f44657j;
    }

    public final Integer getTextColor() {
        return this.f44650c;
    }

    public final Integer getTintColor() {
        return this.f44651d;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        X screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.n0(new Function1() { // from class: com.swmansion.rnscreens.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n0.S(this.f44636a, (C4526d) obj);
                }
            });
        }
    }

    public final void setAutoCapitalize(a aVar) {
        AbstractC5504s.h(aVar, "<set-?>");
        this.f44649b = aVar;
    }

    public final void setAutoFocus(boolean z10) {
        this.f44656i = z10;
    }

    public final void setHeaderIconColor(Integer num) {
        this.f44652e = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f44653f = num;
    }

    public final void setInputType(b bVar) {
        AbstractC5504s.h(bVar, "<set-?>");
        this.f44648a = bVar;
    }

    public final void setPlaceholder(String str) {
        AbstractC5504s.h(str, "<set-?>");
        this.f44654g = str;
    }

    public final void setShouldOverrideBackButton(boolean z10) {
        this.f44655h = z10;
    }

    public final void setShouldShowHintSearchIcon(boolean z10) {
        this.f44657j = z10;
    }

    public final void setTextColor(Integer num) {
        this.f44650c = num;
    }

    public final void setTintColor(Integer num) {
        this.f44651d = num;
    }

    public final void R(boolean z10) {
    }
}
