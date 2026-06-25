package C;

import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.Y;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.L0;
import i0.AbstractC4993l;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static boolean f2035A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f2036x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f2037y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final WeakHashMap f2038z = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1130a f2039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1130a f2040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1130a f2041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1130a f2042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1130a f2043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1130a f2044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1130a f2045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1130a f2046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1130a f2047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final N f2048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final P f2049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final P f2050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final P f2051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final N f2052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final N f2053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final N f2054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final N f2055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final N f2056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final N f2057s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final N f2058t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f2059u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2060v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final RunnableC1147s f2061w;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: C.Q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0022a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Q f2062a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f2063b;

            /* JADX INFO: renamed from: C.Q$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class C0023a implements Y.X {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Q f2064a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f2065b;

                public C0023a(Q q10, View view) {
                    this.f2064a = q10;
                    this.f2065b = view;
                }

                @Override // Y.X
                public void dispose() {
                    this.f2064a.b(this.f2065b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0022a(Q q10, View view) {
                super(1);
                this.f2062a = q10;
                this.f2063b = view;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Y.X invoke(Y y10) {
                this.f2062a.h(this.f2063b);
                return new C0023a(this.f2062a, this.f2063b);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Q d(View view) {
            Q q10;
            synchronized (Q.f2038z) {
                try {
                    WeakHashMap weakHashMap = Q.f2038z;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        Q q11 = new Q(null, view, false ? 1 : 0);
                        weakHashMap.put(view, q11);
                        obj2 = q11;
                    }
                    q10 = (Q) obj2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return q10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C1130a e(L0 l02, int i10, String str) {
            C1130a c1130a = new C1130a(i10, str);
            if (l02 != null) {
                c1130a.h(l02, i10);
            }
            return c1130a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final N f(L0 l02, int i10, String str) {
            A1.b bVarG;
            if (l02 == null || (bVarG = l02.g(i10)) == null) {
                bVarG = A1.b.f103e;
            }
            return X.a(bVarG, str);
        }

        public final Q c(InterfaceC2425m interfaceC2425m, int i10) {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1366542614, i10, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) interfaceC2425m.n(AndroidCompositionLocals_androidKt.k());
            Q qD = d(view);
            boolean zF = interfaceC2425m.F(qD) | interfaceC2425m.F(view);
            Object objD = interfaceC2425m.D();
            if (zF || objD == InterfaceC2425m.f22370a.a()) {
                objD = new C0022a(qD, view);
                interfaceC2425m.u(objD);
            }
            AbstractC2393b0.b(qD, (Function1) objD, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            return qD;
        }

        private a() {
        }
    }

    public /* synthetic */ Q(L0 l02, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(l02, view);
    }

    public static /* synthetic */ void j(Q q10, L0 l02, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        q10.i(l02, i10);
    }

    public final void b(View view) {
        int i10 = this.f2060v - 1;
        this.f2060v = i10;
        if (i10 == 0) {
            AbstractC2747a0.w0(view, null);
            AbstractC2747a0.C0(view, null);
            view.removeOnAttachStateChangeListener(this.f2061w);
        }
    }

    public final boolean c() {
        return this.f2059u;
    }

    public final C1130a d() {
        return this.f2043e;
    }

    public final P e() {
        return this.f2049k;
    }

    public final C1130a f() {
        return this.f2044f;
    }

    public final C1130a g() {
        return this.f2045g;
    }

    public final void h(View view) {
        if (this.f2060v == 0) {
            AbstractC2747a0.w0(view, this.f2061w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f2061w);
            AbstractC2747a0.C0(view, this.f2061w);
        }
        this.f2060v++;
    }

    public final void i(L0 l02, int i10) {
        if (f2035A) {
            WindowInsets windowInsetsY = l02.y();
            AbstractC5504s.e(windowInsetsY);
            l02 = L0.z(windowInsetsY);
        }
        this.f2039a.h(l02, i10);
        this.f2041c.h(l02, i10);
        this.f2040b.h(l02, i10);
        this.f2043e.h(l02, i10);
        this.f2044f.h(l02, i10);
        this.f2045g.h(l02, i10);
        this.f2046h.h(l02, i10);
        this.f2047i.h(l02, i10);
        this.f2042d.h(l02, i10);
        if (i10 == 0) {
            this.f2052n.f(X.f(l02.g(L0.p.b())));
            this.f2053o.f(X.f(l02.g(L0.p.g())));
            this.f2054p.f(X.f(l02.g(L0.p.h())));
            this.f2055q.f(X.f(l02.g(L0.p.i())));
            this.f2056r.f(X.f(l02.g(L0.p.k())));
            androidx.core.view.r rVarE = l02.e();
            if (rVarE != null) {
                this.f2048j.f(X.f(rVarE.f()));
            }
        }
        AbstractC4993l.f48495e.m();
    }

    public final void k(L0 l02) {
        this.f2058t.f(X.f(l02.f(L0.p.d())));
    }

    public final void l(L0 l02) {
        this.f2057s.f(X.f(l02.f(L0.p.d())));
    }

    private Q(L0 l02, View view) {
        androidx.core.view.r rVarE;
        A1.b bVarF;
        a aVar = f2036x;
        this.f2039a = aVar.e(l02, L0.p.b(), "captionBar");
        C1130a c1130aE = aVar.e(l02, L0.p.c(), "displayCutout");
        this.f2040b = c1130aE;
        C1130a c1130aE2 = aVar.e(l02, L0.p.d(), "ime");
        this.f2041c = c1130aE2;
        C1130a c1130aE3 = aVar.e(l02, L0.p.f(), "mandatorySystemGestures");
        this.f2042d = c1130aE3;
        this.f2043e = aVar.e(l02, L0.p.g(), "navigationBars");
        this.f2044f = aVar.e(l02, L0.p.h(), "statusBars");
        C1130a c1130aE4 = aVar.e(l02, L0.p.i(), "systemBars");
        this.f2045g = c1130aE4;
        C1130a c1130aE5 = aVar.e(l02, L0.p.j(), "systemGestures");
        this.f2046h = c1130aE5;
        C1130a c1130aE6 = aVar.e(l02, L0.p.k(), "tappableElement");
        this.f2047i = c1130aE6;
        N nA = X.a((l02 == null || (rVarE = l02.e()) == null || (bVarF = rVarE.f()) == null) ? A1.b.f103e : bVarF, "waterfall");
        this.f2048j = nA;
        P pF = S.f(S.f(c1130aE4, c1130aE2), c1130aE);
        this.f2049k = pF;
        P pF2 = S.f(S.f(S.f(c1130aE6, c1130aE3), c1130aE5), nA);
        this.f2050l = pF2;
        this.f2051m = S.f(pF, pF2);
        this.f2052n = aVar.f(l02, L0.p.b(), "captionBarIgnoringVisibility");
        this.f2053o = aVar.f(l02, L0.p.g(), "navigationBarsIgnoringVisibility");
        this.f2054p = aVar.f(l02, L0.p.h(), "statusBarsIgnoringVisibility");
        this.f2055q = aVar.f(l02, L0.p.i(), "systemBarsIgnoringVisibility");
        this.f2056r = aVar.f(l02, L0.p.k(), "tappableElementIgnoringVisibility");
        this.f2057s = aVar.f(l02, L0.p.d(), "imeAnimationTarget");
        this.f2058t = aVar.f(l02, L0.p.d(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(l0.l.f52356I) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f2059u = bool != null ? bool.booleanValue() : true;
        this.f2061w = new RunnableC1147s(this);
    }
}
