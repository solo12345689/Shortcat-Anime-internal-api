package com.swmansion.rnscreens.gamma.tabs;

import Ud.AbstractC2279u;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.core.view.AbstractC2759g0;
import androidx.fragment.app.K;
import androidx.fragment.app.U;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.C3284b0;
import com.google.android.material.navigation.m;
import com.swmansion.rnscreens.S;
import com.swmansion.rnscreens.gamma.tabs.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import le.AbstractC5591b;
import le.C5590a;
import le.InterfaceC5593d;
import o9.AbstractC5847j;
import pe.InterfaceC6023m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends FrameLayout implements com.swmansion.rnscreens.gamma.tabs.b, com.swmansion.rnscreens.safearea.c, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: A */
    private final InterfaceC5593d f44566A;

    /* JADX INFO: renamed from: B */
    private final InterfaceC5593d f44567B;

    /* JADX INFO: renamed from: C */
    private final InterfaceC5593d f44568C;

    /* JADX INFO: renamed from: D */
    private final InterfaceC5593d f44569D;

    /* JADX INFO: renamed from: E */
    private final Choreographer.FrameCallback f44570E;

    /* JADX INFO: renamed from: a */
    private final C3284b0 f44571a;

    /* JADX INFO: renamed from: b */
    private final b f44572b;

    /* JADX INFO: renamed from: c */
    private final c f44573c;

    /* JADX INFO: renamed from: d */
    private final androidx.appcompat.view.d f44574d;

    /* JADX INFO: renamed from: e */
    private final com.google.android.material.bottomnavigation.c f44575e;

    /* JADX INFO: renamed from: f */
    private final FrameLayout f44576f;

    /* JADX INFO: renamed from: g */
    public com.swmansion.rnscreens.gamma.tabs.s f44577g;

    /* JADX INFO: renamed from: h */
    private K f44578h;

    /* JADX INFO: renamed from: i */
    private final List f44579i;

    /* JADX INFO: renamed from: j */
    private Integer f44580j;

    /* JADX INFO: renamed from: k */
    private boolean f44581k;

    /* JADX INFO: renamed from: l */
    private com.swmansion.rnscreens.safearea.d f44582l;

    /* JADX INFO: renamed from: m */
    private final com.swmansion.rnscreens.gamma.tabs.q f44583m;

    /* JADX INFO: renamed from: n */
    private final com.swmansion.rnscreens.gamma.tabs.o f44584n;

    /* JADX INFO: renamed from: o */
    private final InterfaceC5593d f44585o;

    /* JADX INFO: renamed from: p */
    private final InterfaceC5593d f44586p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC5593d f44587q;

    /* JADX INFO: renamed from: r */
    private final InterfaceC5593d f44588r;

    /* JADX INFO: renamed from: s */
    private final InterfaceC5593d f44589s;

    /* JADX INFO: renamed from: t */
    private final InterfaceC5593d f44590t;

    /* JADX INFO: renamed from: u */
    private final InterfaceC5593d f44591u;

    /* JADX INFO: renamed from: v */
    private final InterfaceC5593d f44592v;

    /* JADX INFO: renamed from: w */
    private final InterfaceC5593d f44593w;

    /* JADX INFO: renamed from: x */
    private final InterfaceC5593d f44594x;

    /* JADX INFO: renamed from: y */
    private final InterfaceC5593d f44595y;

    /* JADX INFO: renamed from: z */
    private final InterfaceC5593d f44596z;

    /* JADX INFO: renamed from: G */
    static final /* synthetic */ InterfaceC6023m[] f44565G = {O.e(new z(l.class, "tabBarBackgroundColor", "getTabBarBackgroundColor()Ljava/lang/Integer;", 0)), O.e(new z(l.class, "tabBarItemActiveIndicatorColor", "getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;", 0)), O.e(new z(l.class, "isTabBarItemActiveIndicatorEnabled", "isTabBarItemActiveIndicatorEnabled()Z", 0)), O.e(new z(l.class, "tabBarItemIconColor", "getTabBarItemIconColor()Ljava/lang/Integer;", 0)), O.e(new z(l.class, "tabBarItemTitleFontFamily", "getTabBarItemTitleFontFamily()Ljava/lang/String;", 0)), O.e(new z(l.class, "tabBarItemIconColorActive", "getTabBarItemIconColorActive()Ljava/lang/Integer;", 0)), O.e(new z(l.class, "tabBarItemTitleFontColor", "getTabBarItemTitleFontColor()Ljava/lang/Integer;", 0)), O.e(new z(l.class, "tabBarItemTitleFontColorActive", "getTabBarItemTitleFontColorActive()Ljava/lang/Integer;", 0)), O.e(new z(l.class, "tabBarItemTitleFontSize", "getTabBarItemTitleFontSize()Ljava/lang/Float;", 0)), O.e(new z(l.class, "tabBarItemTitleFontSizeActive", "getTabBarItemTitleFontSizeActive()Ljava/lang/Float;", 0)), O.e(new z(l.class, "tabBarItemTitleFontWeight", "getTabBarItemTitleFontWeight()Ljava/lang/String;", 0)), O.e(new z(l.class, "tabBarItemTitleFontStyle", "getTabBarItemTitleFontStyle()Ljava/lang/String;", 0)), O.e(new z(l.class, "tabBarItemRippleColor", "getTabBarItemRippleColor()Ljava/lang/Integer;", 0)), O.e(new z(l.class, "tabBarItemLabelVisibilityMode", "getTabBarItemLabelVisibilityMode()Ljava/lang/String;", 0)), O.e(new z(l.class, "tabBarHidden", "getTabBarHidden()Z", 0)), O.e(new z(l.class, "nativeContainerBackgroundColor", "getNativeContainerBackgroundColor()Ljava/lang/Integer;", 0))};

    /* JADX INFO: renamed from: F */
    public static final a f44564F = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class b {

        /* JADX INFO: renamed from: a */
        private boolean f44597a;

        /* JADX INFO: renamed from: b */
        private boolean f44598b;

        /* JADX INFO: renamed from: c */
        private boolean f44599c;

        public b() {
        }

        public static final void f(b bVar) {
            bVar.i();
        }

        private final void i() {
            if (this.f44597a) {
                h();
            }
        }

        public final void b() {
            d();
            c();
        }

        public final void c() {
            this.f44599c = true;
        }

        public final void d() {
            this.f44598b = true;
        }

        public final void e() {
            this.f44597a = true;
            l.this.post(new Runnable() { // from class: com.swmansion.rnscreens.gamma.tabs.m
                @Override // java.lang.Runnable
                public final void run() {
                    l.b.f(this.f44618a);
                }
            });
        }

        public final void g() {
            if (this.f44597a) {
                return;
            }
            e();
        }

        public final void h() {
            this.f44597a = false;
            if (this.f44598b) {
                this.f44598b = false;
                l.this.N();
            }
            if (this.f44599c) {
                this.f44599c = false;
                l.this.I();
                l.this.f44584n.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c {
        public c() {
        }

        public final boolean a() {
            ScrollView scrollViewB;
            S sA;
            FrameLayout frameLayout = l.this.f44576f;
            com.swmansion.rnscreens.gamma.tabs.e currentFocusedTab = l.this.getCurrentFocusedTab();
            if (currentFocusedTab.w().getShouldUseRepeatedTabSelectionPopToRootSpecialEffect() && (sA = Xa.f.f21727a.a(frameLayout)) != null && sA.d0()) {
                return true;
            }
            if (!currentFocusedTab.w().getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect() || (scrollViewB = Xa.f.f21727a.b(frameLayout)) == null || scrollViewB.getScrollY() <= 0) {
                return false;
            }
            scrollViewB.smoothScrollTo(scrollViewB.getScrollX(), 0);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44602b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, l lVar) {
            super(obj);
            this.f44602b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44602b;
            lVar.M((Float) obj, (Float) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, l lVar) {
            super(obj);
            this.f44603b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44603b;
            lVar.M((String) obj, (String) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44604b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, l lVar) {
            super(obj);
            this.f44604b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44604b;
            lVar.M((String) obj, (String) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44605b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj, l lVar) {
            super(obj);
            this.f44605b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44605b;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44606b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, l lVar) {
            super(obj);
            this.f44606b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44606b;
            lVar.M((String) obj, (String) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44607b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Object obj, l lVar) {
            super(obj);
            this.f44607b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            Boolean bool = (Boolean) obj2;
            Boolean bool2 = (Boolean) obj;
            if (bool.booleanValue() != bool2.booleanValue()) {
                l.L(this.f44607b, null, 1, null);
                this.f44607b.M(bool2, bool);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44608b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, l lVar) {
            super(obj);
            this.f44608b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            Integer num = (Integer) obj2;
            if (AbstractC5504s.c(num, (Integer) obj)) {
                return;
            }
            this.f44608b.setBackground(num != null ? new ColorDrawable(num.intValue()) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44609b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Object obj, l lVar) {
            super(obj);
            this.f44609b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44609b;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.tabs.l$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0700l extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44610b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0700l(Object obj, l lVar) {
            super(obj);
            this.f44610b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44610b;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44611b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Object obj, l lVar) {
            super(obj);
            this.f44611b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            Boolean bool = (Boolean) obj2;
            bool.booleanValue();
            Boolean bool2 = (Boolean) obj;
            bool2.booleanValue();
            this.f44611b.M(bool2, bool);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44612b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, l lVar) {
            super(obj);
            this.f44612b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44612b;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44613b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Object obj, l lVar) {
            super(obj);
            this.f44613b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44613b;
            lVar.M((String) obj, (String) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44614b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj, l lVar) {
            super(obj);
            this.f44614b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44614b;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44615b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Object obj, l lVar) {
            super(obj);
            this.f44615b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44615b;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44616b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Object obj, l lVar) {
            super(obj);
            this.f44616b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44616b;
            lVar.M((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s extends AbstractC5591b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l f44617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Object obj, l lVar) {
            super(obj);
            this.f44617b = lVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            l lVar = this.f44617b;
            lVar.M((Float) obj, (Float) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C3284b0 reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f44571a = reactContext;
        this.f44572b = new b();
        this.f44573c = new c();
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(reactContext, AbstractC5847j.f54877f);
        this.f44574d = dVar;
        com.google.android.material.bottomnavigation.c cVar = new com.google.android.material.bottomnavigation.c(dVar);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        this.f44575e = cVar;
        FrameLayout frameLayout = new FrameLayout(reactContext);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(Xa.g.f21728a.a());
        this.f44576f = frameLayout;
        ArrayList arrayList = new ArrayList();
        this.f44579i = arrayList;
        this.f44583m = new com.swmansion.rnscreens.gamma.tabs.q(dVar, cVar, arrayList);
        this.f44584n = new com.swmansion.rnscreens.gamma.tabs.o(cVar, arrayList);
        C5590a c5590a = C5590a.f52755a;
        this.f44585o = new k(null, this);
        this.f44586p = new C0700l(null, this);
        this.f44587q = new m(Boolean.TRUE, this);
        this.f44588r = new n(null, this);
        this.f44589s = new o(null, this);
        this.f44590t = new p(null, this);
        this.f44591u = new q(null, this);
        this.f44592v = new r(null, this);
        this.f44593w = new s(null, this);
        this.f44594x = new d(null, this);
        this.f44595y = new e(null, this);
        this.f44596z = new f(null, this);
        this.f44566A = new g(null, this);
        this.f44567B = new h(null, this);
        this.f44568C = new i(Boolean.FALSE, this);
        this.f44569D = new j(null, this);
        addView(frameLayout);
        addView(cVar);
        cVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.swmansion.rnscreens.gamma.tabs.f
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                l.l(view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        cVar.setOnItemSelectedListener(new m.c() { // from class: com.swmansion.rnscreens.gamma.tabs.g
            @Override // com.google.android.material.navigation.m.c
            public final boolean a(MenuItem menuItem) {
                return l.m(this.f44559a, menuItem);
            }
        });
        this.f44570E = new Choreographer.FrameCallback() { // from class: com.swmansion.rnscreens.gamma.tabs.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                l.z(this.f44560a, j10);
            }
        };
    }

    private final void C() {
        if (this.f44581k || this.f44570E == null) {
            return;
        }
        this.f44581k = true;
        com.facebook.react.modules.core.b.f36977f.a().k(b.a.f36986d, this.f44570E);
    }

    public static final boolean E(com.swmansion.rnscreens.gamma.tabs.a aVar, com.swmansion.rnscreens.gamma.tabs.e it) {
        AbstractC5504s.h(it, "it");
        return it.w() == aVar;
    }

    public static final boolean F(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public final void I() {
        fb.e.f46994a.a("TabsHost", "updateBottomNavigationViewAppearance");
        this.f44583m.c(this);
        Integer selectedTabScreenFragmentId = getSelectedTabScreenFragmentId();
        if (selectedTabScreenFragmentId == null) {
            throw new IllegalStateException("[RNScreens] A single selected tab must be present");
        }
        int iIntValue = selectedTabScreenFragmentId.intValue();
        if (this.f44575e.getSelectedItemId() != iIntValue) {
            this.f44575e.setSelectedItemId(iIntValue);
        }
        post(new Runnable() { // from class: com.swmansion.rnscreens.gamma.tabs.k
            @Override // java.lang.Runnable
            public final void run() {
                l.J(this.f44563a);
            }
        });
    }

    public static final void J(l lVar) {
        lVar.C();
        fb.e.f46994a.a("TabsHost", "BottomNavigationView request layout");
    }

    private final void K(Integer num) {
        int iIntValue = getTabBarHidden() ? 0 : num != null ? num.intValue() : this.f44575e.getHeight();
        com.swmansion.rnscreens.safearea.d dVar = this.f44582l;
        if (dVar != null) {
            dVar.D(new com.swmansion.rnscreens.safearea.a(0.0f, 0.0f, 0.0f, iIntValue));
        }
    }

    static /* synthetic */ void L(l lVar, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        lVar.K(num);
    }

    public final void M(Object obj, Object obj2) {
        if (AbstractC5504s.c(obj2, obj)) {
            return;
        }
        b bVar = this.f44572b;
        bVar.c();
        bVar.g();
    }

    public final void N() {
        com.swmansion.rnscreens.gamma.tabs.e currentFocusedTab = getCurrentFocusedTab();
        List listC0 = getRequireFragmentManager().C0();
        AbstractC5504s.g(listC0, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC0) {
            if (obj instanceof com.swmansion.rnscreens.gamma.tabs.e) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            throw new IllegalStateException("[RNScreens] There can be only a single focused tab");
        }
        com.swmansion.rnscreens.gamma.tabs.e eVar = (com.swmansion.rnscreens.gamma.tabs.e) AbstractC2279u.o0(arrayList);
        if (currentFocusedTab == eVar) {
            return;
        }
        U uV = getRequireFragmentManager().s().v(true);
        if (eVar != null) {
            uV.n(eVar);
        }
        uV.b(this.f44576f.getId(), currentFocusedTab);
        uV.k();
    }

    public final com.swmansion.rnscreens.gamma.tabs.e getCurrentFocusedTab() {
        Object next;
        Iterator it = this.f44579i.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.swmansion.rnscreens.gamma.tabs.e) next).w().b()) {
                break;
            }
        }
        if (next != null) {
            return (com.swmansion.rnscreens.gamma.tabs.e) next;
        }
        throw new IllegalStateException("[RNScreens] No focused tab present");
    }

    private final K getRequireFragmentManager() {
        K k10 = this.f44578h;
        if (k10 != null) {
            return k10;
        }
        throw new IllegalStateException("[RNScreens] Nullish fragment manager");
    }

    private final Integer getSelectedTabScreenFragmentId() {
        if (this.f44579i.isEmpty()) {
            return null;
        }
        Iterator it = this.f44579i.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((com.swmansion.rnscreens.gamma.tabs.e) it.next()).w().b()) {
                break;
            }
            i10++;
        }
        return Integer.valueOf(i10);
    }

    public static final void l(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        fb.e.f46994a.a("TabsHost", "BottomNavigationView layout changed {" + i10 + ", " + i11 + "} {" + (i12 - i10) + ", " + (i13 - i11) + "}");
    }

    public static final boolean m(l lVar, MenuItem item) {
        String tabKey;
        com.swmansion.rnscreens.gamma.tabs.a aVarW;
        AbstractC5504s.h(item, "item");
        fb.e.f46994a.a("TabsHost", "Item selected " + item);
        com.swmansion.rnscreens.gamma.tabs.e eVarV = lVar.v(item.getItemId());
        boolean zA = AbstractC5504s.c(eVarV, lVar.getCurrentFocusedTab()) ? lVar.f44573c.a() : false;
        if (eVarV == null || (aVarW = eVarV.w()) == null || (tabKey = aVarW.getTabKey()) == null) {
            tabKey = "undefined";
        }
        lVar.getEventEmitter$react_native_screens_release().h(tabKey, item.getItemId(), zA);
        return true;
    }

    private final void t(int i10) {
        Integer num = this.f44580j;
        if (num != null && i10 == num.intValue()) {
            return;
        }
        if (i10 == 16) {
            this.f44574d.setTheme(AbstractC5847j.f54881j);
        } else if (i10 != 32) {
            this.f44574d.setTheme(AbstractC5847j.f54877f);
        } else {
            this.f44574d.setTheme(AbstractC5847j.f54876e);
        }
        this.f44583m.c(this);
        this.f44580j = Integer.valueOf(i10);
    }

    private final void u() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    private final com.swmansion.rnscreens.gamma.tabs.e v(int i10) {
        return (com.swmansion.rnscreens.gamma.tabs.e) AbstractC2279u.p0(this.f44579i, i10);
    }

    private final MenuItem x(com.swmansion.rnscreens.gamma.tabs.a aVar) {
        Iterator it = this.f44579i.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((com.swmansion.rnscreens.gamma.tabs.e) it.next()).w() == aVar) {
                break;
            }
            i10++;
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return this.f44575e.getMenu().findItem(numValueOf.intValue());
    }

    public static final void z(l lVar, long j10) {
        lVar.f44581k = false;
        lVar.u();
    }

    public final void A(com.swmansion.rnscreens.gamma.tabs.a tabScreen, int i10) {
        AbstractC5504s.h(tabScreen, "tabScreen");
        if (i10 < this.f44575e.getMaxItemCount()) {
            this.f44579i.add(i10, new com.swmansion.rnscreens.gamma.tabs.e(tabScreen));
            tabScreen.setTabScreenDelegate$react_native_screens_release(this);
            b bVar = this.f44572b;
            bVar.b();
            bVar.g();
            return;
        }
        throw new IllegalArgumentException(("[RNScreens] Attempt to insert TabScreen at index " + i10 + "; BottomNavigationView supports at most " + this.f44575e.getMaxItemCount() + " items").toString());
    }

    public final void B() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabsHost must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new com.swmansion.rnscreens.gamma.tabs.s(this.f44571a, getId()));
    }

    public final void D() {
        Iterator it = this.f44579i.iterator();
        while (it.hasNext()) {
            ((com.swmansion.rnscreens.gamma.tabs.e) it.next()).w().setTabScreenDelegate$react_native_screens_release(null);
        }
        this.f44579i.clear();
        b bVar = this.f44572b;
        bVar.b();
        bVar.g();
    }

    public final void G(final com.swmansion.rnscreens.gamma.tabs.a reactSubview) {
        AbstractC5504s.h(reactSubview, "reactSubview");
        List list = this.f44579i;
        final Function1 function1 = new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(l.E(reactSubview, (e) obj));
            }
        };
        boolean zRemoveIf = list.removeIf(new Predicate() { // from class: com.swmansion.rnscreens.gamma.tabs.j
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l.F(function1, obj);
            }
        });
        Boolean boolValueOf = Boolean.valueOf(zRemoveIf);
        if (!zRemoveIf) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            reactSubview.setTabScreenDelegate$react_native_screens_release(null);
            b bVar = this.f44572b;
            bVar.b();
            bVar.g();
        }
    }

    public final void H(int i10) {
        ((com.swmansion.rnscreens.gamma.tabs.e) this.f44579i.remove(i10)).w().setTabScreenDelegate$react_native_screens_release(null);
        b bVar = this.f44572b;
        bVar.b();
        bVar.g();
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void b(com.swmansion.rnscreens.gamma.tabs.a tabScreen, Configuration config) {
        AbstractC5504s.h(tabScreen, "tabScreen");
        AbstractC5504s.h(config, "config");
        onConfigurationChanged(config);
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void c(com.swmansion.rnscreens.gamma.tabs.a tabScreen) {
        AbstractC5504s.h(tabScreen, "tabScreen");
        MenuItem menuItemX = x(tabScreen);
        if (menuItemX != null) {
            this.f44583m.a(menuItemX, tabScreen);
            this.f44584n.b(menuItemX, tabScreen);
        }
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    public void d(com.swmansion.rnscreens.gamma.tabs.a tabScreen, boolean z10) {
        AbstractC5504s.h(tabScreen, "tabScreen");
        b bVar = this.f44572b;
        bVar.b();
        bVar.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        if (!(windowInsets != null ? windowInsets.isConsumed() : true)) {
            Iterator it = AbstractC2759g0.a(this).iterator();
            while (it.hasNext()) {
                ((View) it.next()).dispatchApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }

    @Override // com.swmansion.rnscreens.safearea.c
    public void e(com.swmansion.rnscreens.safearea.d listener) {
        AbstractC5504s.h(listener, "listener");
        if (AbstractC5504s.c(this.f44582l, listener)) {
            this.f44582l = null;
            this.f44575e.removeOnLayoutChangeListener(this);
        }
    }

    public final com.swmansion.rnscreens.gamma.tabs.s getEventEmitter$react_native_screens_release() {
        com.swmansion.rnscreens.gamma.tabs.s sVar = this.f44577g;
        if (sVar != null) {
            return sVar;
        }
        AbstractC5504s.u("eventEmitter");
        return null;
    }

    @Override // com.swmansion.rnscreens.safearea.c
    public com.swmansion.rnscreens.safearea.a getInterfaceInsets() {
        return new com.swmansion.rnscreens.safearea.a(0.0f, 0.0f, 0.0f, this.f44575e.getHeight());
    }

    public final Integer getNativeContainerBackgroundColor() {
        return (Integer) this.f44569D.a(this, f44565G[15]);
    }

    public final C3284b0 getReactContext() {
        return this.f44571a;
    }

    public final Integer getTabBarBackgroundColor() {
        return (Integer) this.f44585o.a(this, f44565G[0]);
    }

    public final boolean getTabBarHidden() {
        return ((Boolean) this.f44568C.a(this, f44565G[14])).booleanValue();
    }

    public final Integer getTabBarItemActiveIndicatorColor() {
        return (Integer) this.f44586p.a(this, f44565G[1]);
    }

    public final Integer getTabBarItemIconColor() {
        return (Integer) this.f44588r.a(this, f44565G[3]);
    }

    public final Integer getTabBarItemIconColorActive() {
        return (Integer) this.f44590t.a(this, f44565G[5]);
    }

    public final String getTabBarItemLabelVisibilityMode() {
        return (String) this.f44567B.a(this, f44565G[13]);
    }

    public final Integer getTabBarItemRippleColor() {
        return (Integer) this.f44566A.a(this, f44565G[12]);
    }

    public final Integer getTabBarItemTitleFontColor() {
        return (Integer) this.f44591u.a(this, f44565G[6]);
    }

    public final Integer getTabBarItemTitleFontColorActive() {
        return (Integer) this.f44592v.a(this, f44565G[7]);
    }

    public final String getTabBarItemTitleFontFamily() {
        return (String) this.f44589s.a(this, f44565G[4]);
    }

    public final Float getTabBarItemTitleFontSize() {
        return (Float) this.f44593w.a(this, f44565G[8]);
    }

    public final Float getTabBarItemTitleFontSizeActive() {
        return (Float) this.f44594x.a(this, f44565G[9]);
    }

    public final String getTabBarItemTitleFontStyle() {
        return (String) this.f44596z.a(this, f44565G[11]);
    }

    public final String getTabBarItemTitleFontWeight() {
        return (String) this.f44595y.a(this, f44565G[10]);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        fb.e.f46994a.a("TabsHost", "TabsHost [" + getId() + "] attached to window");
        super.onAttachedToWindow();
        K kA = Xa.b.f21725a.a(this);
        if (kA == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        this.f44578h = kA;
        b bVar = this.f44572b;
        bVar.b();
        bVar.h();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            t(configuration.uiMode & 48);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (view instanceof com.google.android.material.bottomnavigation.c) {
            int i18 = i13 - i11;
            if (i18 != i17 - i15) {
                K(Integer.valueOf(i18));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("[RNScreens] TabsHost's onLayoutChange expects BottomNavigationView, received " + view + " instead").toString());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        C();
    }

    public final void setEventEmitter$react_native_screens_release(com.swmansion.rnscreens.gamma.tabs.s sVar) {
        AbstractC5504s.h(sVar, "<set-?>");
        this.f44577g = sVar;
    }

    public final void setNativeContainerBackgroundColor(Integer num) {
        this.f44569D.b(this, f44565G[15], num);
    }

    @Override // com.swmansion.rnscreens.safearea.c
    public void setOnInterfaceInsetsChangeListener(com.swmansion.rnscreens.safearea.d listener) {
        AbstractC5504s.h(listener, "listener");
        if (this.f44582l == null) {
            this.f44575e.addOnLayoutChangeListener(this);
        }
        this.f44582l = listener;
    }

    public final void setTabBarBackgroundColor(Integer num) {
        this.f44585o.b(this, f44565G[0], num);
    }

    public final void setTabBarHidden(boolean z10) {
        this.f44568C.b(this, f44565G[14], Boolean.valueOf(z10));
    }

    public final void setTabBarItemActiveIndicatorColor(Integer num) {
        this.f44586p.b(this, f44565G[1], num);
    }

    public final void setTabBarItemActiveIndicatorEnabled(boolean z10) {
        this.f44587q.b(this, f44565G[2], Boolean.valueOf(z10));
    }

    public final void setTabBarItemIconColor(Integer num) {
        this.f44588r.b(this, f44565G[3], num);
    }

    public final void setTabBarItemIconColorActive(Integer num) {
        this.f44590t.b(this, f44565G[5], num);
    }

    public final void setTabBarItemLabelVisibilityMode(String str) {
        this.f44567B.b(this, f44565G[13], str);
    }

    public final void setTabBarItemRippleColor(Integer num) {
        this.f44566A.b(this, f44565G[12], num);
    }

    public final void setTabBarItemTitleFontColor(Integer num) {
        this.f44591u.b(this, f44565G[6], num);
    }

    public final void setTabBarItemTitleFontColorActive(Integer num) {
        this.f44592v.b(this, f44565G[7], num);
    }

    public final void setTabBarItemTitleFontFamily(String str) {
        this.f44589s.b(this, f44565G[4], str);
    }

    public final void setTabBarItemTitleFontSize(Float f10) {
        this.f44593w.b(this, f44565G[8], f10);
    }

    public final void setTabBarItemTitleFontSizeActive(Float f10) {
        this.f44594x.b(this, f44565G[9], f10);
    }

    public final void setTabBarItemTitleFontStyle(String str) {
        this.f44596z.b(this, f44565G[11], str);
    }

    public final void setTabBarItemTitleFontWeight(String str) {
        this.f44595y.b(this, f44565G[10], str);
    }

    @Override // com.swmansion.rnscreens.gamma.tabs.b
    /* JADX INFO: renamed from: w */
    public com.swmansion.rnscreens.gamma.tabs.e a(com.swmansion.rnscreens.gamma.tabs.a tabScreen) {
        Object next;
        AbstractC5504s.h(tabScreen, "tabScreen");
        Iterator it = this.f44579i.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.swmansion.rnscreens.gamma.tabs.e) next).w() == tabScreen) {
                break;
            }
        }
        return (com.swmansion.rnscreens.gamma.tabs.e) next;
    }

    public final boolean y() {
        return ((Boolean) this.f44587q.a(this, f44565G[2])).booleanValue();
    }
}
