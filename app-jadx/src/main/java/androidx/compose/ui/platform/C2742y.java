package androidx.compose.ui.platform;

import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.C1809w;
import L1.AbstractC1865b;
import L1.AbstractC1866c;
import L1.B;
import R0.C2092a;
import R0.C2099h;
import Td.C2160k;
import U0.C2197e;
import Ud.AbstractC2279u;
import android.R;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.core.view.C2746a;
import androidx.lifecycle.AbstractC2857k;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import d1.AbstractC4555a;
import i1.AbstractC5026s;
import i1.C5023p;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import k1.AbstractC5436a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import r0.C6224f;
import r0.C6226h;
import s0.AbstractC6362i1;
import s0.InterfaceC6374m1;
import t.AbstractC6561k;
import t.AbstractC6563m;
import t.AbstractC6564n;
import t.AbstractC6565o;
import t.AbstractC6566p;
import t.C6538D;
import t.C6540F;
import t.C6541G;
import t.C6550P;
import t.C6552b;

/* JADX INFO: renamed from: androidx.compose.ui.platform.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2742y extends C2746a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final d f27565S = new d(null);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f27566T = 8;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final AbstractC6563m f27567U = AbstractC6564n.a(l0.l.f52360a, l0.l.f52361b, l0.l.f52372m, l0.l.f52383x, l0.l.f52348A, l0.l.f52349B, l0.l.f52350C, l0.l.f52351D, l0.l.f52352E, l0.l.f52353F, l0.l.f52362c, l0.l.f52363d, l0.l.f52364e, l0.l.f52365f, l0.l.f52366g, l0.l.f52367h, l0.l.f52368i, l0.l.f52369j, l0.l.f52370k, l0.l.f52371l, l0.l.f52373n, l0.l.f52374o, l0.l.f52375p, l0.l.f52376q, l0.l.f52377r, l0.l.f52378s, l0.l.f52379t, l0.l.f52380u, l0.l.f52381v, l0.l.f52382w, l0.l.f52384y, l0.l.f52385z);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final C6552b f27568A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final If.g f27569B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f27570C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private f f27571D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private AbstractC6565o f27572E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private C6541G f27573F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private C6538D f27574G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private C6538D f27575H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final String f27576I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final String f27577J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final d1.w f27578K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private C6540F f27579L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private C2715l1 f27580M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f27581N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final C6538D f27582O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final Runnable f27583P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final List f27584Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final Function1 f27585R;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AndroidComposeView f27586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27587e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Function1 f27588f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AccessibilityManager f27589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f27591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f27592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f27593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f27594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f27595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f27596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e f27597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private L1.B f27600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private L1.B f27601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f27602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C6540F f27603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C6540F f27604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private t.j0 f27605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t.j0 f27606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f27607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Integer f27608z;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager = C2742y.this.f27589g;
            C2742y c2742y = C2742y.this;
            c2742y.f27594l = c2742y.f27589g.getEnabledAccessibilityServiceList(-1);
            accessibilityManager.addAccessibilityStateChangeListener(c2742y.f27592j);
            accessibilityManager.addTouchExplorationStateChangeListener(c2742y.f27593k);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C2742y.this.f27596n.removeCallbacks(C2742y.this.f27583P);
            AccessibilityManager accessibilityManager = C2742y.this.f27589g;
            C2742y c2742y = C2742y.this;
            accessibilityManager.removeAccessibilityStateChangeListener(c2742y.f27592j);
            accessibilityManager.removeTouchExplorationStateChangeListener(c2742y.f27593k);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27610a = new b();

        private b() {
        }

        public static final void a(L1.B b10, R0.s sVar) {
            C2092a c2092a;
            if (!AbstractC2744z.n(sVar) || (c2092a = (C2092a) R0.m.a(sVar.y(), R0.l.f14981a.x())) == null) {
                return;
            }
            b10.b(new B.a(R.id.accessibilityActionSetProgress, c2092a.b()));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27611a = new c();

        private c() {
        }

        public static final void a(L1.B b10, R0.s sVar) {
            C2099h c2099h = (C2099h) R0.m.a(sVar.y(), R0.x.f15043a.D());
            if (AbstractC2744z.n(sVar)) {
                if (c2099h == null ? false : C2099h.m(c2099h.p(), C2099h.f14960b.b())) {
                    return;
                }
                SemanticsConfiguration semanticsConfigurationY = sVar.y();
                R0.l lVar = R0.l.f14981a;
                C2092a c2092a = (C2092a) R0.m.a(semanticsConfigurationY, lVar.r());
                if (c2092a != null) {
                    b10.b(new B.a(R.id.accessibilityActionPageUp, c2092a.b()));
                }
                C2092a c2092a2 = (C2092a) R0.m.a(sVar.y(), lVar.o());
                if (c2092a2 != null) {
                    b10.b(new B.a(R.id.accessibilityActionPageDown, c2092a2.b()));
                }
                C2092a c2092a3 = (C2092a) R0.m.a(sVar.y(), lVar.p());
                if (c2092a3 != null) {
                    b10.b(new B.a(R.id.accessibilityActionPageLeft, c2092a3.b()));
                }
                C2092a c2092a4 = (C2092a) R0.m.a(sVar.y(), lVar.q());
                if (c2092a4 != null) {
                    b10.b(new B.a(R.id.accessibilityActionPageRight, c2092a4.b()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class e extends L1.C {
        public e() {
        }

        @Override // L1.C
        public void a(int i10, L1.B b10, String str, Bundle bundle) {
            C2742y.this.N(i10, b10, str, bundle);
        }

        @Override // L1.C
        public L1.B b(int i10) {
            L1.B bV = C2742y.this.V(i10);
            C2742y c2742y = C2742y.this;
            if (c2742y.f27602t) {
                if (i10 == c2742y.f27598p) {
                    c2742y.f27600r = bV;
                }
                if (i10 == c2742y.f27599q) {
                    c2742y.f27601s = bV;
                }
            }
            return bV;
        }

        @Override // L1.C
        public L1.B d(int i10) {
            if (i10 == 1) {
                if (C2742y.this.f27599q == Integer.MIN_VALUE) {
                    return null;
                }
                return b(C2742y.this.f27599q);
            }
            if (i10 == 2) {
                return b(C2742y.this.f27598p);
            }
            throw new IllegalArgumentException("Unknown focus type: " + i10);
        }

        @Override // L1.C
        public boolean f(int i10, int i11, Bundle bundle) {
            return C2742y.this.v0(i10, i11, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final R0.s f27613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f27615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f27616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f27617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f27618f;

        public f(R0.s sVar, int i10, int i11, int i12, int i13, long j10) {
            this.f27613a = sVar;
            this.f27614b = i10;
            this.f27615c = i11;
            this.f27616d = i12;
            this.f27617e = i13;
            this.f27618f = j10;
        }

        public final int a() {
            return this.f27614b;
        }

        public final int b() {
            return this.f27616d;
        }

        public final int c() {
            return this.f27615c;
        }

        public final R0.s d() {
            return this.f27613a;
        }

        public final int e() {
            return this.f27617e;
        }

        public final long f() {
            return this.f27618f;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27621c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27623e;

        g(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27621c = obj;
            this.f27623e |= Integer.MIN_VALUE;
            return C2742y.this.P(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements Function1 {
        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(C2742y.this.l0().getParent().requestSendAccessibilityEvent(C2742y.this.l0(), accessibilityEvent));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2712k1 f27625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2742y f27626b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C2712k1 c2712k1, C2742y c2742y) {
            super(0);
            this.f27625a = c2712k1;
            this.f27626b = c2742y;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m84invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m84invoke() {
            R0.s sVarB;
            K0.J jS;
            R0.j jVarA = this.f27625a.a();
            R0.j jVarE = this.f27625a.e();
            Float fB = this.f27625a.b();
            Float fC = this.f27625a.c();
            float fFloatValue = (jVarA == null || fB == null) ? 0.0f : ((Number) jVarA.c().invoke()).floatValue() - fB.floatValue();
            float fFloatValue2 = (jVarE == null || fC == null) ? 0.0f : ((Number) jVarE.c().invoke()).floatValue() - fC.floatValue();
            if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                int iF0 = this.f27626b.F0(this.f27625a.d());
                R0.u uVar = (R0.u) this.f27626b.d0().c(this.f27626b.f27598p);
                if (uVar != null) {
                    C2742y c2742y = this.f27626b;
                    try {
                        L1.B b10 = c2742y.f27600r;
                        if (b10 != null) {
                            b10.w0(c2742y.O(uVar));
                            Td.L l10 = Td.L.f17438a;
                        }
                    } catch (IllegalStateException unused) {
                        Td.L l11 = Td.L.f17438a;
                    }
                }
                R0.u uVar2 = (R0.u) this.f27626b.d0().c(this.f27626b.f27599q);
                if (uVar2 != null) {
                    C2742y c2742y2 = this.f27626b;
                    try {
                        L1.B b11 = c2742y2.f27601s;
                        if (b11 != null) {
                            b11.w0(c2742y2.O(uVar2));
                            Td.L l12 = Td.L.f17438a;
                        }
                    } catch (IllegalStateException unused2) {
                        Td.L l13 = Td.L.f17438a;
                    }
                }
                this.f27626b.l0().invalidate();
                R0.u uVar3 = (R0.u) this.f27626b.d0().c(iF0);
                if (uVar3 != null && (sVarB = uVar3.b()) != null && (jS = sVarB.s()) != null) {
                    C2742y c2742y3 = this.f27626b;
                    if (jVarA != null) {
                        c2742y3.f27603u.s(iF0, jVarA);
                    }
                    if (jVarE != null) {
                        c2742y3.f27604v.s(iF0, jVarE);
                    }
                    c2742y3.s0(jS);
                }
            }
            if (jVarA != null) {
                this.f27625a.g((Float) jVarA.c().invoke());
            }
            if (jVarE != null) {
                this.f27625a.h((Float) jVarE.c().invoke());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends AbstractC5506u implements Function1 {
        j() {
            super(1);
        }

        public final void a(C2712k1 c2712k1) {
            C2742y.this.D0(c2712k1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2712k1) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f27628a = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(K0.J j10) {
            SemanticsConfiguration semanticsConfigurationE = j10.e();
            boolean z10 = false;
            if (semanticsConfigurationE != null && semanticsConfigurationE.v()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class l extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f27629a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(K0.J j10) {
            return Boolean.valueOf(j10.t0().q(AbstractC1789g0.a(8)));
        }
    }

    public C2742y(AndroidComposeView androidComposeView) {
        this.f27586d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f27589g = accessibilityManager;
        this.f27591i = 100L;
        this.f27592j = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.v
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                C2742y.a0(this.f27504a, z10);
            }
        };
        this.f27593k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.w
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                C2742y.Z0(this.f27509a, z10);
            }
        };
        this.f27594l = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f27596n = new Handler(Looper.getMainLooper());
        this.f27597o = new e();
        this.f27598p = Integer.MIN_VALUE;
        this.f27599q = Integer.MIN_VALUE;
        this.f27603u = new C6540F(0, 1, null);
        this.f27604v = new C6540F(0, 1, null);
        this.f27605w = new t.j0(0, 1, null);
        this.f27606x = new t.j0(0, 1, null);
        this.f27607y = -1;
        this.f27568A = new C6552b(0, 1, null);
        this.f27569B = If.j.b(1, null, null, 6, null);
        this.f27570C = true;
        this.f27572E = AbstractC6566p.b();
        this.f27573F = new C6541G(0, 1, null);
        this.f27574G = new C6538D(0, 1, null);
        this.f27575H = new C6538D(0, 1, null);
        this.f27576I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f27577J = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f27578K = new d1.w();
        this.f27579L = AbstractC6566p.c();
        this.f27580M = new C2715l1(androidComposeView.getSemanticsOwner().d(), AbstractC6566p.b());
        this.f27582O = AbstractC6561k.a();
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.f27583P = new Runnable() { // from class: androidx.compose.ui.platform.x
            @Override // java.lang.Runnable
            public final void run() {
                C2742y.E0(this.f27562a);
            }
        };
        this.f27584Q = new ArrayList();
        this.f27585R = new j();
    }

    private static final boolean A0(R0.j jVar) {
        if (((Number) jVar.c().invoke()).floatValue() >= ((Number) jVar.a().invoke()).floatValue() || jVar.b()) {
            return ((Number) jVar.c().invoke()).floatValue() > 0.0f && jVar.b();
        }
        return true;
    }

    private final boolean B0(int i10, List list) {
        boolean z10;
        C2712k1 c2712k1A = AbstractC2718m1.a(list, i10);
        if (c2712k1A != null) {
            z10 = false;
        } else {
            C2712k1 c2712k1 = new C2712k1(i10, this.f27584Q, null, null, null, null);
            z10 = true;
            c2712k1A = c2712k1;
        }
        this.f27584Q.add(c2712k1A);
        return z10;
    }

    private final boolean C0(int i10) {
        if (!r0() || n0(i10)) {
            return false;
        }
        int i11 = this.f27598p;
        if (i11 != Integer.MIN_VALUE) {
            J0(this, i11, 65536, null, null, 12, null);
        }
        this.f27598p = i10;
        this.f27586d.invalidate();
        J0(this, i10, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(C2712k1 c2712k1) {
        if (c2712k1.J0()) {
            this.f27586d.getSnapshotObserver().i(c2712k1, this.f27585R, new i(c2712k1, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(C2742y c2742y) {
        Trace.beginSection("measureAndLayout");
        try {
            K0.p0.j(c2742y.f27586d, false, 1, null);
            Td.L l10 = Td.L.f17438a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                c2742y.S();
                Trace.endSection();
                c2742y.f27581N = false;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F0(int i10) {
        if (i10 == this.f27586d.getSemanticsOwner().d().q()) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void G0(R0.s r17, androidx.compose.ui.platform.C2715l1 r18) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2742y.G0(R0.s, androidx.compose.ui.platform.l1):void");
    }

    private final boolean H0(AccessibilityEvent accessibilityEvent) {
        if (!p0()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f27602t = true;
        }
        try {
            return ((Boolean) this.f27588f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f27602t = false;
        }
    }

    private final boolean I0(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !p0()) {
            return false;
        }
        AccessibilityEvent accessibilityEventU = U(i10, i11);
        if (num != null) {
            accessibilityEventU.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventU.setContentDescription(AbstractC5436a.e(list, com.amazon.a.a.o.b.f.f34694a, null, null, 0, null, null, 62, null));
        }
        return H0(accessibilityEventU);
    }

    static /* synthetic */ boolean J0(C2742y c2742y, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return c2742y.I0(i10, i11, num, list);
    }

    private final void K0(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventU = U(F0(i10), 32);
        accessibilityEventU.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventU.getText().add(str);
        }
        H0(accessibilityEventU);
    }

    private final void L0(int i10) {
        f fVar = this.f27571D;
        if (fVar != null) {
            if (i10 != fVar.d().q()) {
                return;
            }
            if (SystemClock.uptimeMillis() - fVar.f() <= 1000) {
                AccessibilityEvent accessibilityEventU = U(F0(fVar.d().q()), 131072);
                accessibilityEventU.setFromIndex(fVar.b());
                accessibilityEventU.setToIndex(fVar.e());
                accessibilityEventU.setAction(fVar.a());
                accessibilityEventU.setMovementGranularity(fVar.c());
                accessibilityEventU.getText().add(i0(fVar.d()));
                H0(accessibilityEventU);
            }
        }
        this.f27571D = null;
    }

    private final void M0(AbstractC6565o abstractC6565o) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i10;
        Integer num2;
        int i11;
        Integer num3;
        int i12;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i13;
        Integer num4;
        int i14;
        R0.s sVar;
        int i15;
        boolean zV;
        Object[] objArr;
        int i16;
        int i17;
        long[] jArr3;
        int i18;
        Integer num5;
        Object[] objArr2;
        int i19;
        long[] jArr4;
        long[] jArr5;
        int[] iArr3;
        ArrayList arrayList3;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Integer num6;
        Integer num7;
        int i25;
        int i26;
        boolean z10;
        AccessibilityEvent accessibilityEventX;
        C2742y c2742y = this;
        AbstractC6565o abstractC6565o2 = abstractC6565o;
        Integer num8 = 64;
        ArrayList arrayList4 = new ArrayList(c2742y.f27584Q);
        c2742y.f27584Q.clear();
        int[] iArr4 = abstractC6565o2.f60106b;
        long[] jArr6 = abstractC6565o2.f60105a;
        int i27 = 2;
        int length = jArr6.length - 2;
        int i28 = 0;
        Integer num9 = 0;
        if (length < 0) {
            return;
        }
        int i29 = 0;
        C2742y c2742y2 = c2742y;
        while (true) {
            long j10 = jArr6[i29];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i30 = 8;
                int i31 = 8 - ((~(i29 - length)) >>> 31);
                long j11 = j10;
                int i32 = i28;
                C2742y c2742y3 = c2742y2;
                while (i32 < i31) {
                    if ((j11 & 255) < 128) {
                        int i33 = iArr4[(i29 << 3) + i32];
                        C2715l1 c2715l1 = (C2715l1) c2742y3.f27579L.c(i33);
                        if (c2715l1 == null) {
                            i11 = i32;
                            num3 = num8;
                            i12 = i31;
                            arrayList2 = arrayList4;
                            iArr2 = iArr4;
                            jArr2 = jArr6;
                            i13 = i27;
                            num4 = num9;
                        } else {
                            R0.u uVar = (R0.u) abstractC6565o2.c(i33);
                            R0.s sVarB = uVar != null ? uVar.b() : null;
                            if (sVarB == null) {
                                H0.a.c("no value for specified key");
                                throw new C2160k();
                            }
                            i13 = i27;
                            C6550P c6550pT = sVarB.y().t();
                            Object[] objArr3 = c6550pT.f60044b;
                            int i34 = i31;
                            Object[] objArr4 = c6550pT.f60045c;
                            long[] jArr7 = c6550pT.f60043a;
                            int i35 = i30;
                            int length2 = jArr7.length - 2;
                            if (length2 >= 0) {
                                Integer num10 = num8;
                                zV = false;
                                int i36 = 0;
                                while (true) {
                                    long j12 = jArr7[i36];
                                    int i37 = length2;
                                    sVar = sVarB;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i36 - i37)) >>> 31);
                                        long j13 = j12;
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j13 & 255) < 128) {
                                                int i40 = (i36 << 3) + i39;
                                                Object obj = objArr3[i40];
                                                Object obj2 = objArr4[i40];
                                                R0.B b10 = (R0.B) obj;
                                                R0.x xVar = R0.x.f15043a;
                                                i18 = i32;
                                                if (((AbstractC5504s.c(b10, xVar.l()) || AbstractC5504s.c(b10, xVar.O())) ? c2742y3.B0(i33, arrayList4) : false) || !AbstractC5504s.c(obj2, R0.m.a(c2715l1.b(), b10))) {
                                                    if (AbstractC5504s.c(b10, xVar.A())) {
                                                        AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.String");
                                                        String str = (String) obj2;
                                                        if (c2715l1.b().e(xVar.A())) {
                                                            c2742y3.K0(i33, i35, str);
                                                        }
                                                        Td.L l10 = Td.L.f17438a;
                                                    } else if (AbstractC5504s.c(b10, xVar.H()) || AbstractC5504s.c(b10, xVar.M())) {
                                                        iArr3 = iArr4;
                                                        objArr2 = objArr3;
                                                        Integer num11 = num9;
                                                        i24 = i34;
                                                        num5 = num10;
                                                        i22 = i37;
                                                        i19 = i39;
                                                        arrayList3 = arrayList4;
                                                        jArr5 = jArr6;
                                                        i21 = i36;
                                                        i23 = i33;
                                                        jArr4 = jArr7;
                                                        i20 = i38;
                                                        J0(c2742y3, c2742y3.F0(i23), 2048, num5, null, 8, null);
                                                        num6 = num11;
                                                        J0(c2742y3, c2742y3.F0(i23), 2048, num6, null, 8, null);
                                                    } else if (AbstractC5504s.c(b10, xVar.C())) {
                                                        iArr3 = iArr4;
                                                        i24 = i34;
                                                        i22 = i37;
                                                        i19 = i39;
                                                        arrayList3 = arrayList4;
                                                        Integer num12 = num10;
                                                        i23 = i33;
                                                        jArr5 = jArr6;
                                                        i21 = i36;
                                                        jArr4 = jArr7;
                                                        i20 = i38;
                                                        objArr2 = objArr3;
                                                        J0(c2742y3, c2742y3.F0(i33), 2048, num12, null, 8, null);
                                                        num5 = num12;
                                                        num6 = num9;
                                                        J0(c2742y3, c2742y3.F0(i23), 2048, num6, null, 8, null);
                                                    } else {
                                                        iArr3 = iArr4;
                                                        objArr2 = objArr3;
                                                        i24 = i34;
                                                        num5 = num10;
                                                        i22 = i37;
                                                        i19 = i39;
                                                        arrayList3 = arrayList4;
                                                        jArr5 = jArr6;
                                                        num6 = num9;
                                                        i21 = i36;
                                                        i23 = i33;
                                                        jArr4 = jArr7;
                                                        i20 = i38;
                                                        if (AbstractC5504s.c(b10, xVar.F())) {
                                                            C2099h c2099h = (C2099h) R0.m.a(sVar.y(), xVar.D());
                                                            if (!(c2099h == null ? false : C2099h.m(c2099h.p(), C2099h.f14960b.h()))) {
                                                                J0(c2742y3, c2742y3.F0(i23), 2048, num5, null, 8, null);
                                                                num6 = num6;
                                                                J0(c2742y3, c2742y3.F0(i23), 2048, num6, null, 8, null);
                                                            } else if (AbstractC5504s.c(R0.m.a(sVar.y(), xVar.F()), Boolean.TRUE)) {
                                                                AccessibilityEvent accessibilityEventU = c2742y3.U(c2742y3.F0(i23), 4);
                                                                R0.s sVarB2 = sVar.b();
                                                                List list = (List) R0.m.a(sVarB2.p(), xVar.d());
                                                                String strE = list != null ? AbstractC5436a.e(list, com.amazon.a.a.o.b.f.f34694a, null, null, 0, null, null, 62, null) : null;
                                                                List list2 = (List) R0.m.a(sVarB2.p(), xVar.J());
                                                                String strE2 = list2 != null ? AbstractC5436a.e(list2, com.amazon.a.a.o.b.f.f34694a, null, null, 0, null, null, 62, null) : null;
                                                                if (strE != null) {
                                                                    accessibilityEventU.setContentDescription(strE);
                                                                    Td.L l11 = Td.L.f17438a;
                                                                }
                                                                if (strE2 != null) {
                                                                    accessibilityEventU.getText().add(strE2);
                                                                }
                                                                c2742y3.H0(accessibilityEventU);
                                                            } else {
                                                                J0(c2742y3, c2742y3.F0(i23), 2048, num6, null, 8, null);
                                                            }
                                                        } else if (AbstractC5504s.c(b10, xVar.d())) {
                                                            int iF0 = c2742y3.F0(i23);
                                                            AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                            c2742y3.I0(iF0, 2048, 4, (List) obj2);
                                                        } else {
                                                            if (!AbstractC5504s.c(b10, xVar.g())) {
                                                                num7 = num6;
                                                                if (AbstractC5504s.c(b10, xVar.K())) {
                                                                    C2197e c2197eK0 = c2742y3.k0(sVar.y());
                                                                    String str2 = "";
                                                                    if (c2197eK0 != null) {
                                                                        String strJ = c2197eK0.j();
                                                                        str2 = "";
                                                                        if (strJ != null) {
                                                                            str2 = strJ;
                                                                        }
                                                                    }
                                                                    long jR = ((U0.W0) sVar.y().l(xVar.K())).r();
                                                                    c2742y3.H0(c2742y3.X(c2742y3.F0(i23), Integer.valueOf(U0.W0.n(jR)), Integer.valueOf(U0.W0.i(jR)), Integer.valueOf(str2.length()), c2742y3.b1(str2, 100000)));
                                                                    c2742y3.L0(sVar.q());
                                                                    Td.L l12 = Td.L.f17438a;
                                                                } else {
                                                                    if (AbstractC5504s.c(b10, xVar.l()) || AbstractC5504s.c(b10, xVar.O())) {
                                                                        c2742y3.s0(sVar.s());
                                                                        C2712k1 c2712k1A = AbstractC2718m1.a(c2742y3.f27584Q, i23);
                                                                        AbstractC5504s.e(c2712k1A);
                                                                        c2712k1A.f((R0.j) R0.m.a(sVar.y(), xVar.l()));
                                                                        c2712k1A.i((R0.j) R0.m.a(sVar.y(), xVar.O()));
                                                                        c2742y3.D0(c2712k1A);
                                                                        Td.L l13 = Td.L.f17438a;
                                                                    } else if (AbstractC5504s.c(b10, xVar.i())) {
                                                                        AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                        if (((Boolean) obj2).booleanValue()) {
                                                                            c2742y3.H0(c2742y3.U(c2742y3.F0(sVar.q()), 8));
                                                                        }
                                                                        num6 = num7;
                                                                        J0(c2742y3, c2742y3.F0(sVar.q()), 2048, num6, null, 8, null);
                                                                    } else {
                                                                        R0.l lVar = R0.l.f14981a;
                                                                        if (AbstractC5504s.c(b10, lVar.d())) {
                                                                            List list3 = (List) sVar.y().l(lVar.d());
                                                                            List list4 = (List) R0.m.a(c2715l1.b(), lVar.d());
                                                                            if (list4 != null) {
                                                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                if (list3.size() > 0) {
                                                                                    android.support.v4.media.session.b.a(list3.get(0));
                                                                                    throw null;
                                                                                }
                                                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                if (list4.size() > 0) {
                                                                                    android.support.v4.media.session.b.a(list4.get(0));
                                                                                    throw null;
                                                                                }
                                                                                zV = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                                            } else if (!list3.isEmpty()) {
                                                                                zV = true;
                                                                            }
                                                                            Td.L l14 = Td.L.f17438a;
                                                                        } else {
                                                                            zV = ((obj2 instanceof C2092a) && AbstractC2744z.l((C2092a) obj2, R0.m.a(c2715l1.b(), b10))) ? false : true;
                                                                            Td.L l15 = Td.L.f17438a;
                                                                        }
                                                                    }
                                                                    num6 = num7;
                                                                }
                                                            } else if (sVar.y().e(R0.l.f14981a.z())) {
                                                                C2197e c2197eK02 = c2742y3.k0(c2715l1.b());
                                                                if (c2197eK02 == null) {
                                                                    c2197eK02 = "";
                                                                }
                                                                C2197e c2197eK03 = c2742y3.k0(sVar.y());
                                                                C2197e c2197e = c2197eK03 != null ? c2197eK03 : "";
                                                                CharSequence charSequenceB1 = c2742y3.b1(c2197e, 100000);
                                                                int length3 = c2197eK02.length();
                                                                int length4 = c2197e.length();
                                                                int i41 = AbstractC5874j.i(length3, length4);
                                                                int i42 = 0;
                                                                while (true) {
                                                                    num7 = num6;
                                                                    if (i42 >= i41) {
                                                                        i25 = length3;
                                                                        break;
                                                                    }
                                                                    i25 = length3;
                                                                    if (c2197eK02.charAt(i42) != c2197e.charAt(i42)) {
                                                                        break;
                                                                    }
                                                                    i42++;
                                                                    length3 = i25;
                                                                    num6 = num7;
                                                                }
                                                                int i43 = 0;
                                                                while (true) {
                                                                    if (i43 >= i41 - i42) {
                                                                        i26 = i43;
                                                                        break;
                                                                    }
                                                                    i26 = i43;
                                                                    if (c2197eK02.charAt((i25 - 1) - i43) != c2197e.charAt((length4 - 1) - i26)) {
                                                                        break;
                                                                    } else {
                                                                        i43 = i26 + 1;
                                                                    }
                                                                }
                                                                int i44 = (i25 - i26) - i42;
                                                                int i45 = (length4 - i26) - i42;
                                                                SemanticsConfiguration semanticsConfigurationB = c2715l1.b();
                                                                R0.x xVar2 = R0.x.f15043a;
                                                                boolean zE = semanticsConfigurationB.e(xVar2.B());
                                                                boolean zE2 = sVar.y().e(xVar2.B());
                                                                boolean zE3 = c2715l1.b().e(xVar2.g());
                                                                boolean z11 = zE3 && !zE && zE2;
                                                                boolean z12 = zE3 && zE && !zE2;
                                                                if (z11 || z12) {
                                                                    z10 = z11;
                                                                    accessibilityEventX = c2742y3.X(c2742y3.F0(i23), num7, num7, Integer.valueOf(length4), charSequenceB1);
                                                                } else {
                                                                    z10 = z11;
                                                                    accessibilityEventX = c2742y3.U(c2742y3.F0(i23), 16);
                                                                    accessibilityEventX.setFromIndex(i42);
                                                                    accessibilityEventX.setRemovedCount(i44);
                                                                    accessibilityEventX.setAddedCount(i45);
                                                                    accessibilityEventX.setBeforeText(c2197eK02);
                                                                    accessibilityEventX.getText().add(charSequenceB1);
                                                                }
                                                                accessibilityEventX.setClassName("android.widget.EditText");
                                                                c2742y3.H0(accessibilityEventX);
                                                                if (z10 || z12) {
                                                                    long jR2 = ((U0.W0) sVar.y().l(xVar2.K())).r();
                                                                    accessibilityEventX.setFromIndex(U0.W0.n(jR2));
                                                                    accessibilityEventX.setToIndex(U0.W0.i(jR2));
                                                                    c2742y3.H0(accessibilityEventX);
                                                                }
                                                                Td.L l16 = Td.L.f17438a;
                                                            } else {
                                                                num7 = num6;
                                                                J0(c2742y3, c2742y3.F0(i23), 2048, Integer.valueOf(i13), null, 8, null);
                                                            }
                                                            num6 = num7;
                                                        }
                                                    }
                                                }
                                                j13 >>= 8;
                                                int i46 = i19 + 1;
                                                num9 = num6;
                                                i37 = i22;
                                                i38 = i20;
                                                iArr4 = iArr3;
                                                jArr7 = jArr4;
                                                objArr3 = objArr2;
                                                i35 = 8;
                                                i39 = i46;
                                                i33 = i23;
                                                i36 = i21;
                                                arrayList4 = arrayList3;
                                                jArr6 = jArr5;
                                                i32 = i18;
                                                num10 = num5;
                                                i34 = i24;
                                            } else {
                                                i18 = i32;
                                            }
                                            iArr3 = iArr4;
                                            objArr2 = objArr3;
                                            i24 = i34;
                                            num5 = num10;
                                            i22 = i37;
                                            i19 = i39;
                                            arrayList3 = arrayList4;
                                            jArr5 = jArr6;
                                            num6 = num9;
                                            i21 = i36;
                                            i23 = i33;
                                            jArr4 = jArr7;
                                            i20 = i38;
                                            j13 >>= 8;
                                            int i462 = i19 + 1;
                                            num9 = num6;
                                            i37 = i22;
                                            i38 = i20;
                                            iArr4 = iArr3;
                                            jArr7 = jArr4;
                                            objArr3 = objArr2;
                                            i35 = 8;
                                            i39 = i462;
                                            i33 = i23;
                                            i36 = i21;
                                            arrayList4 = arrayList3;
                                            jArr6 = jArr5;
                                            i32 = i18;
                                            num10 = num5;
                                            i34 = i24;
                                        }
                                        i11 = i32;
                                        objArr = objArr3;
                                        num4 = num9;
                                        i12 = i34;
                                        int i47 = i35;
                                        num3 = num10;
                                        i28 = 0;
                                        arrayList2 = arrayList4;
                                        iArr2 = iArr4;
                                        jArr2 = jArr6;
                                        i17 = i36;
                                        i16 = i37;
                                        i15 = i33;
                                        jArr3 = jArr7;
                                        if (i38 != i47) {
                                            break;
                                        }
                                    } else {
                                        i11 = i32;
                                        iArr2 = iArr4;
                                        objArr = objArr3;
                                        num4 = num9;
                                        i12 = i34;
                                        num3 = num10;
                                        i16 = i37;
                                        i28 = 0;
                                        arrayList2 = arrayList4;
                                        jArr2 = jArr6;
                                        i17 = i36;
                                        i15 = i33;
                                        jArr3 = jArr7;
                                    }
                                    if (i17 == i16) {
                                        break;
                                    }
                                    int i48 = i17 + 1;
                                    num9 = num4;
                                    i33 = i15;
                                    length2 = i16;
                                    arrayList4 = arrayList2;
                                    iArr4 = iArr2;
                                    jArr6 = jArr2;
                                    jArr7 = jArr3;
                                    sVarB = sVar;
                                    objArr3 = objArr;
                                    num10 = num3;
                                    i35 = 8;
                                    i36 = i48;
                                    i34 = i12;
                                    i32 = i11;
                                }
                            } else {
                                i11 = i32;
                                num3 = num8;
                                sVar = sVarB;
                                iArr2 = iArr4;
                                jArr2 = jArr6;
                                num4 = num9;
                                i12 = i34;
                                i28 = 0;
                                arrayList2 = arrayList4;
                                i15 = i33;
                                zV = false;
                            }
                            if (!zV) {
                                zV = AbstractC2744z.v(sVar, c2715l1.b());
                            }
                            if (zV) {
                                J0(c2742y3, c2742y3.F0(i15), 2048, num4, null, 8, null);
                            }
                        }
                        i14 = 8;
                    } else {
                        i11 = i32;
                        num3 = num8;
                        i12 = i31;
                        arrayList2 = arrayList4;
                        iArr2 = iArr4;
                        jArr2 = jArr6;
                        i13 = i27;
                        num4 = num9;
                        i14 = i30;
                    }
                    j11 >>= i14;
                    i30 = i14;
                    num9 = num4;
                    i31 = i12;
                    i27 = i13;
                    arrayList4 = arrayList2;
                    iArr4 = iArr2;
                    jArr6 = jArr2;
                    num8 = num3;
                    abstractC6565o2 = abstractC6565o;
                    i32 = i11 + 1;
                    c2742y3 = this;
                }
                num = num8;
                arrayList = arrayList4;
                iArr = iArr4;
                jArr = jArr6;
                i10 = i27;
                num2 = num9;
                if (i31 != i30) {
                    return;
                }
            } else {
                num = num8;
                arrayList = arrayList4;
                iArr = iArr4;
                jArr = jArr6;
                i10 = i27;
                num2 = num9;
            }
            if (i29 == length) {
                return;
            }
            i29++;
            c2742y2 = this;
            abstractC6565o2 = abstractC6565o;
            num9 = num2;
            i27 = i10;
            arrayList4 = arrayList;
            iArr4 = iArr;
            jArr6 = jArr;
            num8 = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(int i10, L1.B b10, String str, Bundle bundle) {
        R0.s sVarB;
        Region regionW0;
        float[] fArrV0;
        Rect rectU0;
        R0.u uVar = (R0.u) d0().c(i10);
        if (uVar == null || (sVarB = uVar.b()) == null) {
            return;
        }
        String strI0 = i0(sVarB);
        if (AbstractC5504s.c(str, this.f27576I)) {
            int iE = this.f27574G.e(i10, -1);
            if (iE != -1) {
                b10.A().putInt(str, iE);
                return;
            }
            return;
        }
        if (AbstractC5504s.c(str, this.f27577J)) {
            int iE2 = this.f27575H.e(i10, -1);
            if (iE2 != -1) {
                b10.A().putInt(str, iE2);
                return;
            }
            return;
        }
        if (sVarB.y().e(R0.l.f14981a.i()) && bundle != null && AbstractC5504s.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i12 > 0 && i11 >= 0) {
                if (i11 < (strI0 != null ? strI0.length() : Integer.MAX_VALUE)) {
                    U0.T0 t0C = AbstractC2718m1.c(sVarB.y());
                    if (t0C == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < i12; i13++) {
                        int i14 = i11 + i13;
                        if (i14 >= t0C.l().j().length()) {
                            arrayList.add(null);
                        } else {
                            arrayList.add(X0(sVarB, t0C.d(i14)));
                        }
                    }
                    b10.A().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        SemanticsConfiguration semanticsConfigurationY = sVarB.y();
        R0.x xVar = R0.x.f15043a;
        if (semanticsConfigurationY.e(xVar.I()) && bundle != null && AbstractC5504s.c(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) R0.m.a(sVarB.y(), xVar.I());
            if (str2 != null) {
                b10.A().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC5504s.c(str, "androidx.compose.ui.semantics.id")) {
            b10.A().putInt(str, sVarB.q());
            return;
        }
        if (AbstractC5504s.c(str, "androidx.compose.ui.semantics.shapeType")) {
            s0.E1 e12 = (s0.E1) R0.m.a(sVarB.y(), xVar.G());
            if (e12 != null) {
                AbstractC6362i1 abstractC6362i1W = W(e12, sVarB);
                if (abstractC6362i1W instanceof AbstractC6362i1.b) {
                    b10.A().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    b10.A().putParcelable("androidx.compose.ui.semantics.shapeRect", U0(abstractC6362i1W));
                    return;
                } else if (abstractC6362i1W instanceof AbstractC6362i1.c) {
                    b10.A().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    b10.A().putParcelable("androidx.compose.ui.semantics.shapeRect", U0(abstractC6362i1W));
                    b10.A().putFloatArray("androidx.compose.ui.semantics.shapeCorners", V0(abstractC6362i1W));
                    return;
                } else {
                    if (!(abstractC6362i1W instanceof AbstractC6362i1.a)) {
                        throw new Td.r();
                    }
                    b10.A().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    b10.A().putParcelable("androidx.compose.ui.semantics.shapeRegion", W0(abstractC6362i1W));
                    return;
                }
            }
            return;
        }
        if (AbstractC5504s.c(str, "androidx.compose.ui.semantics.shapeRect")) {
            s0.E1 e13 = (s0.E1) R0.m.a(sVarB.y(), xVar.G());
            if (e13 == null || (rectU0 = U0(W(e13, sVarB))) == null) {
                return;
            }
            b10.A().putParcelable("androidx.compose.ui.semantics.shapeRect", rectU0);
            return;
        }
        if (AbstractC5504s.c(str, "androidx.compose.ui.semantics.shapeCorners")) {
            s0.E1 e14 = (s0.E1) R0.m.a(sVarB.y(), xVar.G());
            if (e14 == null || (fArrV0 = V0(W(e14, sVarB))) == null) {
                return;
            }
            b10.A().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrV0);
            return;
        }
        if (AbstractC5504s.c(str, "androidx.compose.ui.semantics.shapeRegion")) {
            s0.E1 e15 = (s0.E1) R0.m.a(sVarB.y(), xVar.G());
            if (e15 == null || (regionW0 = W0(W(e15, sVarB))) == null) {
                return;
            }
            b10.A().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionW0);
            return;
        }
        t.e0 e0VarN = sVarB.y().n();
        if (e0VarN == null) {
            return;
        }
        Object[] objArr = e0VarN.f60055b;
        long[] jArr = e0VarN.f60054a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j10 = jArr[i15];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j10) < 128) {
                        R0.B b11 = (R0.B) objArr[(i15 << 3) + i17];
                        String strA = b11.a();
                        if (AbstractC5504s.c(strA, str)) {
                            Object objA = R0.m.a(sVarB.y(), b11);
                            if (objA instanceof Serializable) {
                                b10.A().putSerializable(strA, (Serializable) objA);
                            } else {
                                if (!(objA instanceof Parcelable)) {
                                    throw new IllegalStateException("Accessibility extra values must be either Serializable or Parcelable.");
                                }
                                b10.A().putParcelable(strA, (Parcelable) objA);
                            }
                        } else {
                            continue;
                        }
                    }
                    j10 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    private final void N0(K0.J j10, C6541G c6541g) {
        SemanticsConfiguration semanticsConfigurationE;
        K0.J jP;
        if (j10.b() && !this.f27586d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(j10)) {
            if (!j10.t0().q(AbstractC1789g0.a(8))) {
                j10 = AbstractC2744z.p(j10, l.f27629a);
            }
            if (j10 == null || (semanticsConfigurationE = j10.e()) == null) {
                return;
            }
            if (!semanticsConfigurationE.v() && (jP = AbstractC2744z.p(j10, k.f27628a)) != null) {
                j10 = jP;
            }
            int iY = j10.y();
            if (c6541g.g(iY)) {
                J0(this, F0(iY), 2048, 1, null, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect O(R0.u uVar) {
        C5023p c5023pA = uVar.a();
        AndroidComposeView androidComposeView = this.f27586d;
        float f10 = c5023pA.f();
        long jB = androidComposeView.B(C6224f.e((((long) Float.floatToRawIntBits(c5023pA.h())) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)));
        long jB2 = this.f27586d.B(C6224f.e((((long) Float.floatToRawIntBits(c5023pA.g())) << 32) | (((long) Float.floatToRawIntBits(c5023pA.d())) & 4294967295L)));
        int i10 = (int) (jB >> 32);
        int i11 = (int) (jB2 >> 32);
        int i12 = (int) (jB & 4294967295L);
        int i13 = (int) (jB2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.floor(Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))));
    }

    private final void O0(K0.J j10) {
        if (j10.b() && !this.f27586d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(j10)) {
            int iY = j10.y();
            R0.j jVar = (R0.j) this.f27603u.c(iY);
            R0.j jVar2 = (R0.j) this.f27604v.c(iY);
            if (jVar == null && jVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventU = U(iY, 4096);
            if (jVar != null) {
                accessibilityEventU.setScrollX((int) ((Number) jVar.c().invoke()).floatValue());
                accessibilityEventU.setMaxScrollX((int) ((Number) jVar.a().invoke()).floatValue());
            }
            if (jVar2 != null) {
                accessibilityEventU.setScrollY((int) ((Number) jVar2.c().invoke()).floatValue());
                accessibilityEventU.setMaxScrollY((int) ((Number) jVar2.a().invoke()).floatValue());
            }
            H0(accessibilityEventU);
        }
    }

    private final boolean P0(R0.s sVar, int i10, int i11, boolean z10) {
        String strI0;
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        R0.l lVar = R0.l.f14981a;
        if (semanticsConfigurationY.e(lVar.y()) && AbstractC2744z.n(sVar)) {
            InterfaceC5096o interfaceC5096o = (InterfaceC5096o) ((C2092a) sVar.y().l(lVar.y())).a();
            if (interfaceC5096o != null) {
                return ((Boolean) interfaceC5096o.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
            return false;
        }
        if ((i10 == i11 && i11 == this.f27607y) || (strI0 = i0(sVar)) == null) {
            return false;
        }
        if (i10 < 0 || i10 != i11 || i11 > strI0.length()) {
            i10 = -1;
        }
        this.f27607y = i10;
        boolean z11 = strI0.length() > 0;
        H0(X(F0(sVar.q()), z11 ? Integer.valueOf(this.f27607y) : null, z11 ? Integer.valueOf(this.f27607y) : null, z11 ? Integer.valueOf(strI0.length()) : null, strI0));
        L0(sVar.q());
        return true;
    }

    private final void Q0(R0.s sVar, L1.B b10) {
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        R0.x xVar = R0.x.f15043a;
        if (semanticsConfigurationY.e(xVar.h())) {
            b10.E0(true);
            b10.I0((CharSequence) R0.m.a(sVar.y(), xVar.h()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean R(t.AbstractC6565o r21, boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2742y.R(t.o, boolean, int, long):boolean");
    }

    private final void S() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (p0()) {
                G0(this.f27586d.getSemanticsOwner().d(), this.f27580M);
            }
            Td.L l10 = Td.L.f17438a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                M0(d0());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    d1();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void S0(R0.s sVar, L1.B b10) {
        C2197e c2197eS = AbstractC2744z.s(sVar);
        b10.i1(c2197eS != null ? Y0(c2197eS) : null);
    }

    private final boolean T(int i10) {
        if (!n0(i10)) {
            return false;
        }
        this.f27598p = Integer.MIN_VALUE;
        this.f27600r = null;
        this.f27586d.invalidate();
        J0(this, i10, 65536, null, null, 12, null);
        return true;
    }

    private final Rect T0(C6226h c6226h) {
        return new Rect((int) c6226h.i(), (int) c6226h.l(), (int) c6226h.j(), (int) c6226h.e());
    }

    private final AccessibilityEvent U(int i10, int i11) {
        R0.u uVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.f27586d.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.f27586d, i10);
        if (p0() && (uVar = (R0.u) d0().c(i10)) != null) {
            SemanticsConfiguration semanticsConfigurationY = uVar.b().y();
            R0.x xVar = R0.x.f15043a;
            accessibilityEventObtain.setPassword(semanticsConfigurationY.e(xVar.B()));
            AbstractC1865b.b(accessibilityEventObtain, AbstractC5504s.c(R0.m.a(uVar.b().y(), xVar.u()), Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    private final Rect U0(AbstractC6362i1 abstractC6362i1) {
        if ((abstractC6362i1 instanceof AbstractC6362i1.b) || (abstractC6362i1 instanceof AbstractC6362i1.c)) {
            return T0(abstractC6362i1.a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final L1.B V(int i10) {
        androidx.lifecycle.r rVarA;
        AbstractC2857k lifecycle;
        AndroidComposeView.b viewTreeOwners = this.f27586d.getViewTreeOwners();
        if (((viewTreeOwners == null || (rVarA = viewTreeOwners.a()) == null || (lifecycle = rVarA.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == AbstractC2857k.b.f30235a) {
            return Z();
        }
        R0.u uVar = (R0.u) d0().c(i10);
        if (uVar == null) {
            return Z();
        }
        R0.s sVarB = uVar.b();
        boolean zC = AbstractC5504s.c(R0.m.a(sVarB.p(), R0.x.f15043a.u()), Boolean.TRUE);
        if (zC && !q0()) {
            return null;
        }
        L1.B bK0 = L1.B.k0();
        bK0.r0(zC);
        if (i10 == -1) {
            ViewParent parentForAccessibility = this.f27586d.getParentForAccessibility();
            bK0.W0(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            R0.s sVarT = sVarB.t();
            Integer numValueOf = sVarT != null ? Integer.valueOf(sVarT.q()) : null;
            if (numValueOf == null) {
                H0.a.c("semanticsNode " + i10 + " has null parent");
                throw new C2160k();
            }
            int iIntValue = numValueOf.intValue();
            bK0.X0(this.f27586d, iIntValue != this.f27586d.getSemanticsOwner().d().q() ? iIntValue : -1);
        }
        bK0.g1(this.f27586d, i10);
        bK0.w0(O(uVar));
        y0(i10, bK0, sVarB);
        return bK0;
    }

    private final float[] V0(AbstractC6362i1 abstractC6362i1) {
        if (!(abstractC6362i1 instanceof AbstractC6362i1.c)) {
            return null;
        }
        AbstractC6362i1.c cVar = (AbstractC6362i1.c) abstractC6362i1;
        return new float[]{Float.intBitsToFloat((int) (cVar.b().h() >> 32)), Float.intBitsToFloat((int) (cVar.b().h() & 4294967295L)), Float.intBitsToFloat((int) (cVar.b().i() >> 32)), Float.intBitsToFloat((int) (cVar.b().i() & 4294967295L)), Float.intBitsToFloat((int) (cVar.b().c() >> 32)), Float.intBitsToFloat((int) (cVar.b().c() & 4294967295L)), Float.intBitsToFloat((int) (cVar.b().b() >> 32)), Float.intBitsToFloat((int) (cVar.b().b() & 4294967295L))};
    }

    private final AbstractC6362i1 W(s0.E1 e12, R0.s sVar) {
        return e12.mo6createOutlinePq9zytI(AbstractC5026s.d(sVar.w()), sVar.r().getLayoutDirection(), this.f27586d.getDensity());
    }

    private final Region W0(AbstractC6362i1 abstractC6362i1) {
        if (!(abstractC6362i1 instanceof AbstractC6362i1.a)) {
            return null;
        }
        AbstractC6362i1.a aVar = (AbstractC6362i1.a) abstractC6362i1;
        Region region = new Region(T0(aVar.a()));
        Region region2 = new Region();
        InterfaceC6374m1 interfaceC6374m1B = aVar.b();
        if (!(interfaceC6374m1B instanceof s0.S)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(((s0.S) interfaceC6374m1B).v(), region);
        return region2;
    }

    private final AccessibilityEvent X(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventU = U(i10, 8192);
        if (num != null) {
            accessibilityEventU.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventU.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventU.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventU.getText().add(charSequence);
        }
        return accessibilityEventU;
    }

    private final RectF X0(R0.s sVar, C6226h c6226h) {
        if (sVar == null) {
            return null;
        }
        C6226h c6226hT = c6226h.t(sVar.u());
        C6226h c6226hK = sVar.k();
        C6226h c6226hP = c6226hT.r(c6226hK) ? c6226hT.p(c6226hK) : null;
        if (c6226hP == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.f27586d;
        float fI = c6226hP.i();
        long jB = androidComposeView.B(C6224f.e((((long) Float.floatToRawIntBits(c6226hP.l())) & 4294967295L) | (((long) Float.floatToRawIntBits(fI)) << 32)));
        long jB2 = this.f27586d.B(C6224f.e((((long) Float.floatToRawIntBits(c6226hP.j())) << 32) | (((long) Float.floatToRawIntBits(c6226hP.e())) & 4294967295L)));
        int i10 = (int) (jB >> 32);
        int i11 = (int) (jB2 >> 32);
        int i12 = (int) (jB & 4294967295L);
        int i13 = (int) (jB2 & 4294967295L);
        return new RectF(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
    }

    private final SpannableString Y0(C2197e c2197e) {
        return (SpannableString) b1(AbstractC4555a.b(c2197e, this.f27586d.getDensity(), this.f27586d.getFontFamilyResolver(), this.f27578K), 100000);
    }

    private final L1.B Z() {
        if (this.f27589g.isEnabled()) {
            return null;
        }
        return L1.B.k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(C2742y c2742y, boolean z10) {
        c2742y.f27594l = c2742y.f27589g.getEnabledAccessibilityServiceList(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(C2742y c2742y, boolean z10) {
        c2742y.f27594l = z10 ? c2742y.f27589g.getEnabledAccessibilityServiceList(-1) : AbstractC2279u.m();
    }

    private final boolean a1(R0.s sVar, int i10, boolean z10, boolean z11) {
        int iC0;
        int i11;
        int iQ = sVar.q();
        Integer num = this.f27608z;
        if (num == null || iQ != num.intValue()) {
            this.f27607y = -1;
            this.f27608z = Integer.valueOf(sVar.q());
        }
        String strI0 = i0(sVar);
        boolean z12 = false;
        if (strI0 != null && strI0.length() != 0) {
            InterfaceC2698g interfaceC2698gJ0 = j0(sVar, i10);
            if (interfaceC2698gJ0 == null) {
                return false;
            }
            int iB0 = b0(sVar);
            if (iB0 == -1) {
                iB0 = z10 ? 0 : strI0.length();
            }
            int[] iArrA = z10 ? interfaceC2698gJ0.a(iB0) : interfaceC2698gJ0.b(iB0);
            if (iArrA == null) {
                return false;
            }
            int i12 = iArrA[0];
            z12 = true;
            int i13 = iArrA[1];
            if (z11 && o0(sVar)) {
                iC0 = c0(sVar);
                if (iC0 == -1) {
                    iC0 = z10 ? i12 : i13;
                }
                i11 = z10 ? i13 : i12;
            } else {
                iC0 = z10 ? i13 : i12;
                i11 = iC0;
            }
            this.f27571D = new f(sVar, z10 ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, i10, i12, i13, SystemClock.uptimeMillis());
            P0(sVar, iC0, i11, true);
        }
        return z12;
    }

    private final int b0(R0.s sVar) {
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        R0.x xVar = R0.x.f15043a;
        return (semanticsConfigurationY.e(xVar.d()) || !sVar.y().e(xVar.K())) ? this.f27607y : U0.W0.i(((U0.W0) sVar.y().l(xVar.K())).r());
    }

    private final CharSequence b1(CharSequence charSequence, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i10) {
            return charSequence;
        }
        int i11 = i10 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i11)) && Character.isLowSurrogate(charSequence.charAt(i10))) {
            i10 = i11;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
        AbstractC5504s.f(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }

    private final int c0(R0.s sVar) {
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        R0.x xVar = R0.x.f15043a;
        return (semanticsConfigurationY.e(xVar.d()) || !sVar.y().e(xVar.K())) ? this.f27607y : U0.W0.n(((U0.W0) sVar.y().l(xVar.K())).r());
    }

    private final void c1(int i10) {
        int i11 = this.f27587e;
        if (i11 == i10) {
            return;
        }
        this.f27587e = i10;
        J0(this, i10, 128, null, null, 12, null);
        J0(this, i11, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC6565o d0() {
        if (this.f27570C) {
            this.f27570C = false;
            this.f27572E = R0.w.a(this.f27586d.getSemanticsOwner(), -1);
            if (p0()) {
                AbstractC2744z.w(this.f27572E, this.f27574G, this.f27575H, this.f27586d.getContext().getResources());
            }
        }
        return this.f27572E;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d1() {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2742y.d1():void");
    }

    private final String i0(R0.s sVar) {
        C2197e c2197e;
        if (sVar == null) {
            return null;
        }
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        R0.x xVar = R0.x.f15043a;
        if (semanticsConfigurationY.e(xVar.d())) {
            return AbstractC5436a.e((List) sVar.y().l(xVar.d()), com.amazon.a.a.o.b.f.f34694a, null, null, 0, null, null, 62, null);
        }
        if (sVar.y().e(xVar.g())) {
            C2197e c2197eK0 = k0(sVar.y());
            if (c2197eK0 != null) {
                return c2197eK0.j();
            }
            return null;
        }
        List list = (List) R0.m.a(sVar.y(), xVar.J());
        if (list == null || (c2197e = (C2197e) AbstractC2279u.o0(list)) == null) {
            return null;
        }
        return c2197e.j();
    }

    private final InterfaceC2698g j0(R0.s sVar, int i10) {
        String strI0;
        U0.T0 t0C;
        if (sVar == null || (strI0 = i0(sVar)) == null || strI0.length() == 0) {
            return null;
        }
        if (i10 == 1) {
            C2686c c2686cA = C2686c.f27417d.a(this.f27586d.getContext().getResources().getConfiguration().locale);
            c2686cA.e(strI0);
            return c2686cA;
        }
        if (i10 == 2) {
            C2701h c2701hA = C2701h.f27455d.a(this.f27586d.getContext().getResources().getConfiguration().locale);
            c2701hA.e(strI0);
            return c2701hA;
        }
        if (i10 != 4) {
            if (i10 == 8) {
                C2695f c2695fA = C2695f.f27450c.a();
                c2695fA.e(strI0);
                return c2695fA;
            }
            if (i10 != 16) {
                return null;
            }
        }
        if (!sVar.y().e(R0.l.f14981a.i()) || (t0C = AbstractC2718m1.c(sVar.y())) == null) {
            return null;
        }
        if (i10 == 4) {
            C2689d c2689dA = C2689d.f27435d.a();
            c2689dA.j(strI0, t0C);
            return c2689dA;
        }
        C2692e c2692eA = C2692e.f27441f.a();
        c2692eA.j(strI0, t0C, sVar);
        return c2692eA;
    }

    private final C2197e k0(SemanticsConfiguration semanticsConfiguration) {
        return (C2197e) R0.m.a(semanticsConfiguration, R0.x.f15043a.g());
    }

    private final boolean n0(int i10) {
        return this.f27598p == i10;
    }

    private final boolean o0(R0.s sVar) {
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        R0.x xVar = R0.x.f15043a;
        return !semanticsConfigurationY.e(xVar.d()) && sVar.y().e(xVar.g());
    }

    private final boolean q0() {
        Boolean bool = this.f27595m;
        if (AbstractC5504s.c(bool, Boolean.TRUE)) {
            return true;
        }
        if (AbstractC5504s.c(bool, Boolean.FALSE)) {
            return false;
        }
        return AbstractC1866c.a(this.f27589g);
    }

    private final boolean r0() {
        if (this.f27590h) {
            return true;
        }
        return this.f27589g.isEnabled() && this.f27589g.isTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(K0.J j10) {
        if (this.f27568A.add(j10)) {
            this.f27569B.d(Td.L.f17438a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01b6 -> B:100:0x01b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:100:0x01b7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean v0(int r20, int r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 1974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2742y.v0(int, int, android.os.Bundle):boolean");
    }

    private static final boolean w0(R0.j jVar, float f10) {
        if (f10 >= 0.0f || ((Number) jVar.c().invoke()).floatValue() <= 0.0f) {
            return f10 > 0.0f && ((Number) jVar.c().invoke()).floatValue() < ((Number) jVar.a().invoke()).floatValue();
        }
        return true;
    }

    private static final float x0(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y0(int r23, L1.B r24, R0.s r25) {
        /*
            Method dump skipped, instruction units count: 2367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2742y.y0(int, L1.B, R0.s):void");
    }

    private static final boolean z0(R0.j jVar) {
        if (((Number) jVar.c().invoke()).floatValue() <= 0.0f || jVar.b()) {
            return ((Number) jVar.c().invoke()).floatValue() < ((Number) jVar.a().invoke()).floatValue() && jVar.b();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (Gf.Z.a(r7, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006c, B:30:0x0074, B:32:0x007d, B:34:0x0086, B:35:0x0097, B:37:0x009e, B:38:0x00a7, B:20:0x0049, B:23:0x0050), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c2 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P(Zd.e r11) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2742y.P(Zd.e):java.lang.Object");
    }

    public final boolean Q(boolean z10, int i10, long j10) {
        if (AbstractC5504s.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return R(d0(), z10, i10, j10);
        }
        return false;
    }

    public final void R0(long j10) {
        this.f27591i = j10;
    }

    public final boolean Y(MotionEvent motionEvent) {
        if (!r0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iM0 = m0(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.f27586d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            c1(iM0);
            if (iM0 == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.f27587e == Integer.MIN_VALUE) {
            return this.f27586d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        c1(Integer.MIN_VALUE);
        return true;
    }

    @Override // androidx.core.view.C2746a
    public L1.C b(View view) {
        return this.f27597o;
    }

    public final String e0() {
        return this.f27577J;
    }

    public final String f0() {
        return this.f27576I;
    }

    public final C6538D g0() {
        return this.f27575H;
    }

    public final C6538D h0() {
        return this.f27574G;
    }

    public final AndroidComposeView l0() {
        return this.f27586d;
    }

    public final int m0(float f10, float f11) {
        int iF0;
        K0.p0.j(this.f27586d, false, 1, null);
        C1809w c1809w = new C1809w();
        K0.J.N0(this.f27586d.getRoot(), C6224f.e((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)), c1809w, 0, false, 12, null);
        int iO = AbstractC2279u.o(c1809w);
        while (true) {
            iF0 = Integer.MIN_VALUE;
            if (-1 >= iO) {
                break;
            }
            K0.J jN = AbstractC1796k.n(c1809w.get(iO));
            if (this.f27586d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(jN) != null) {
                return Integer.MIN_VALUE;
            }
            if (jN.t0().q(AbstractC1789g0.a(8))) {
                iF0 = F0(jN.y());
                R0.s sVarA = R0.t.a(jN, false);
                if (R0.w.d(sVarA) && !sVarA.p().e(R0.x.f15043a.x())) {
                    break;
                }
            }
            iO--;
        }
        return iF0;
    }

    public final boolean p0() {
        if (this.f27590h) {
            return true;
        }
        return this.f27589g.isEnabled() && !this.f27594l.isEmpty();
    }

    public final void t0(K0.J j10) {
        this.f27570C = true;
        if (p0()) {
            s0(j10);
        }
    }

    public final void u0() {
        this.f27570C = true;
        if (!p0() || this.f27581N) {
            return;
        }
        this.f27581N = true;
        this.f27596n.post(this.f27583P);
    }
}
