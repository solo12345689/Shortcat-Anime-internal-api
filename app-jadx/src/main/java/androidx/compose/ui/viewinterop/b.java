package androidx.compose.ui.viewinterop;

import E0.N;
import Gf.AbstractC1617k;
import Gf.O;
import I0.AbstractC1691q;
import I0.B;
import I0.C;
import I0.InterfaceC1687m;
import I0.InterfaceC1690p;
import K0.AbstractC1785e0;
import K0.J;
import K0.p0;
import K0.q0;
import K0.r0;
import Td.L;
import Td.v;
import Y.AbstractC2460y;
import Y.InterfaceC2413i;
import ae.AbstractC2605b;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.AbstractC2691d1;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.K1;
import androidx.compose.ui.viewinterop.b;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2777p0;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.I;
import androidx.core.view.L0;
import androidx.lifecycle.Z;
import i1.AbstractC5013f;
import i1.AbstractC5022o;
import i1.C5009b;
import i1.C5021n;
import i1.C5025r;
import i1.InterfaceC5011d;
import i1.z;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import r0.C6224f;
import s0.E;
import s0.InterfaceC6364j0;
import u0.InterfaceC6711f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends ViewGroup implements G, InterfaceC2413i, q0, I {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final c f27656A = new c(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f27657B = 8;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final Function1 f27658C = C0474b.f27686a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D0.b f27660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f27661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p0 f27662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC5082a f27663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC5082a f27665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC5082a f27666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.compose.ui.e f27667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Function1 f27668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC5011d f27669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Function1 f27670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.lifecycle.r f27671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private P3.i f27672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int[] f27673o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f27674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private L0 f27675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC5082a f27676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC5082a f27677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Function1 f27678t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int[] f27679u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f27680v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27681w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final H f27682x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f27683y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final J f27684z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends C2777p0.b {
        a() {
            super(1);
        }

        @Override // androidx.core.view.C2777p0.b
        public L0 onProgress(L0 l02, List list) {
            return b.this.A(l02);
        }

        @Override // androidx.core.view.C2777p0.b
        public C2777p0.a onStart(C2777p0 c2777p0, C2777p0.a aVar) {
            return b.this.z(aVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0474b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0474b f27686a = new C0474b();

        C0474b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC5082a interfaceC5082a) {
            interfaceC5082a.invoke();
        }

        public final void b(b bVar) {
            Handler handler = bVar.getHandler();
            final InterfaceC5082a interfaceC5082a = bVar.f27676r;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.C0474b.c(interfaceC5082a);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((b) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f27687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f27688b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(J j10, androidx.compose.ui.e eVar) {
            super(1);
            this.f27687a = j10;
            this.f27688b = eVar;
        }

        public final void a(androidx.compose.ui.e eVar) {
            this.f27687a.m(eVar.then(this.f27688b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.e) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f27689a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(J j10) {
            super(1);
            this.f27689a = j10;
        }

        public final void a(InterfaceC5011d interfaceC5011d) {
            this.f27689a.c(interfaceC5011d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC5011d) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f27691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(J j10) {
            super(1);
            this.f27691b = j10;
        }

        public final void a(p0 p0Var) {
            AndroidComposeView androidComposeView = p0Var instanceof AndroidComposeView ? (AndroidComposeView) p0Var : null;
            if (androidComposeView != null) {
                androidComposeView.l0(b.this, this.f27691b);
            }
            ViewParent parent = b.this.getView().getParent();
            b bVar = b.this;
            if (parent != bVar) {
                bVar.addView(bVar.getView());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function1 {
        g() {
            super(1);
        }

        public final void a(p0 p0Var) {
            if (l0.h.f52331d && b.this.hasFocus()) {
                p0Var.getFocusOwner().v(true);
            }
            AndroidComposeView androidComposeView = p0Var instanceof AndroidComposeView ? (AndroidComposeView) p0Var : null;
            if (androidComposeView != null) {
                androidComposeView.Q0(b.this);
            }
            b.this.removeAllViewsInLayout();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p0) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f27694b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27695a = new a();

            a() {
                super(1);
            }

            public final void invoke(s.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.b$h$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0475b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f27696a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ J f27697b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0475b(b bVar, J j10) {
                super(1);
                this.f27696a = bVar;
                this.f27697b = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return L.f17438a;
            }

            public final void invoke(s.a aVar) {
                androidx.compose.ui.viewinterop.d.f(this.f27696a, this.f27697b);
            }
        }

        h(J j10) {
            this.f27694b = j10;
        }

        private final int a(int i10) {
            b bVar = b.this;
            ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
            AbstractC5504s.e(layoutParams);
            bVar.measure(bVar.D(0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return b.this.getMeasuredHeight();
        }

        private final int b(int i10) {
            b bVar = b.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            b bVar2 = b.this;
            ViewGroup.LayoutParams layoutParams = bVar2.getLayoutParams();
            AbstractC5504s.e(layoutParams);
            bVar.measure(iMakeMeasureSpec, bVar2.D(0, i10, layoutParams.height));
            return b.this.getMeasuredWidth();
        }

        @Override // I0.B
        public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
            return a(i10);
        }

        @Override // I0.B
        public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
            return b(i10);
        }

        @Override // I0.B
        /* JADX INFO: renamed from: measure-3p2s80s */
        public C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
            if (b.this.getChildCount() == 0) {
                return androidx.compose.ui.layout.l.u0(lVar, C5009b.n(j10), C5009b.m(j10), null, a.f27695a, 4, null);
            }
            if (C5009b.n(j10) != 0) {
                b.this.getChildAt(0).setMinimumWidth(C5009b.n(j10));
            }
            if (C5009b.m(j10) != 0) {
                b.this.getChildAt(0).setMinimumHeight(C5009b.m(j10));
            }
            b bVar = b.this;
            int iN = C5009b.n(j10);
            int iL = C5009b.l(j10);
            ViewGroup.LayoutParams layoutParams = b.this.getLayoutParams();
            AbstractC5504s.e(layoutParams);
            int iD = bVar.D(iN, iL, layoutParams.width);
            b bVar2 = b.this;
            int iM = C5009b.m(j10);
            int iK = C5009b.k(j10);
            ViewGroup.LayoutParams layoutParams2 = b.this.getLayoutParams();
            AbstractC5504s.e(layoutParams2);
            bVar.measure(iD, bVar2.D(iM, iK, layoutParams2.height));
            return androidx.compose.ui.layout.l.u0(lVar, b.this.getMeasuredWidth(), b.this.getMeasuredHeight(), null, new C0475b(b.this, this.f27694b), 4, null);
        }

        @Override // I0.B
        public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
            return a(i10);
        }

        @Override // I0.B
        public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
            return b(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f27698a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((R0.C) obj);
            return L.f17438a;
        }

        public final void invoke(R0.C c10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f27700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f27701c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(J j10, b bVar) {
            super(1);
            this.f27700b = j10;
            this.f27701c = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6711f) obj);
            return L.f17438a;
        }

        public final void invoke(InterfaceC6711f interfaceC6711f) {
            b bVar = b.this;
            J j10 = this.f27700b;
            b bVar2 = this.f27701c;
            InterfaceC6364j0 interfaceC6364j0B = interfaceC6711f.n1().b();
            if (bVar.getView().getVisibility() != 8) {
                bVar.f27683y = true;
                p0 p0VarZ0 = j10.z0();
                AndroidComposeView androidComposeView = p0VarZ0 instanceof AndroidComposeView ? (AndroidComposeView) p0VarZ0 : null;
                if (androidComposeView != null) {
                    androidComposeView.u0(bVar2, E.d(interfaceC6364j0B));
                }
                bVar.f27683y = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f27703b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(J j10) {
            super(1);
            this.f27703b = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1690p) obj);
            return L.f17438a;
        }

        public final void invoke(InterfaceC1690p interfaceC1690p) {
            WindowInsets windowInsetsY;
            androidx.compose.ui.viewinterop.d.f(b.this, this.f27703b);
            b.this.f27662d.i(b.this);
            int i10 = b.this.f27673o[0];
            int i11 = b.this.f27673o[1];
            b.this.getView().getLocationOnScreen(b.this.f27673o);
            long j10 = b.this.f27674p;
            b.this.f27674p = interfaceC1690p.a();
            L0 l02 = b.this.f27675q;
            if (l02 != null) {
                if ((i10 == b.this.f27673o[0] && i11 == b.this.f27673o[1] && C5025r.e(j10, b.this.f27674p)) || (windowInsetsY = b.this.A(l02).y()) == null) {
                    return;
                }
                b.this.getView().dispatchApplyWindowInsets(windowInsetsY);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class l extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f27706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f27707d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, b bVar, long j10, Zd.e eVar) {
            super(2, eVar);
            this.f27705b = z10;
            this.f27706c = bVar;
            this.f27707d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new l(this.f27705b, this.f27706c, this.f27707d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((l) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r10.f27704a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Td.v.b(r11)
                goto L5e
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                Td.v.b(r11)
                r6 = r10
                goto L3f
            L1f:
                Td.v.b(r11)
                boolean r11 = r10.f27705b
                if (r11 != 0) goto L45
                androidx.compose.ui.viewinterop.b r11 = r10.f27706c
                D0.b r4 = androidx.compose.ui.viewinterop.b.c(r11)
                i1.y$a r11 = i1.y.f48587b
                long r5 = r11.a()
                long r7 = r10.f27707d
                r10.f27704a = r3
                r9 = r10
                java.lang.Object r11 = r4.a(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L3f
                goto L5d
            L3f:
                i1.y r11 = (i1.y) r11
                r11.o()
                goto L63
            L45:
                r6 = r10
                androidx.compose.ui.viewinterop.b r11 = r6.f27706c
                D0.b r1 = androidx.compose.ui.viewinterop.b.c(r11)
                r11 = r2
                long r2 = r6.f27707d
                i1.y$a r4 = i1.y.f48587b
                long r4 = r4.a()
                r6.f27704a = r11
                java.lang.Object r11 = r1.a(r2, r4, r6)
                if (r11 != r0) goto L5e
            L5d:
                return r0
            L5e:
                i1.y r11 = (i1.y) r11
                r11.o()
            L63:
                Td.L r11 = Td.L.f17438a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.b.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class m extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27708a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f27710c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(long j10, Zd.e eVar) {
            super(2, eVar);
            this.f27710c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return b.this.new m(this.f27710c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((m) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f27708a;
            if (i10 == 0) {
                v.b(obj);
                D0.b bVar = b.this.f27660b;
                long j10 = this.f27710c;
                this.f27708a = 1;
                if (bVar.c(j10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class n extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f27711a = new n();

        n() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m86invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m86invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class o extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f27712a = new o();

        o() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m87invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m87invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class p extends AbstractC5506u implements InterfaceC5082a {
        p() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m88invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m88invoke() {
            b.this.getLayoutNode().P0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class q extends AbstractC5506u implements InterfaceC5082a {
        q() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m89invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m89invoke() {
            if (b.this.f27664f && b.this.isAttachedToWindow()) {
                ViewParent parent = b.this.getView().getParent();
                b bVar = b.this;
                if (parent == bVar) {
                    bVar.getSnapshotObserver().i(b.this, b.f27658C, b.this.getUpdate());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class r extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f27715a = new r();

        r() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m90invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m90invoke();
            return L.f17438a;
        }
    }

    public b(Context context, AbstractC2460y abstractC2460y, int i10, D0.b bVar, View view, p0 p0Var) {
        super(context);
        this.f27659a = i10;
        this.f27660b = bVar;
        this.f27661c = view;
        this.f27662d = p0Var;
        if (abstractC2460y != null) {
            K1.i(this, abstractC2460y);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        AbstractC2747a0.C0(this, new a());
        AbstractC2747a0.w0(this, this);
        this.f27663e = r.f27715a;
        this.f27665g = o.f27712a;
        this.f27666h = n.f27711a;
        e.a aVar = androidx.compose.ui.e.f26613a;
        this.f27667i = aVar;
        this.f27669k = AbstractC5013f.b(1.0f, 0.0f, 2, null);
        this.f27673o = new int[2];
        this.f27674p = C5025r.f48570b.a();
        this.f27676r = new q();
        this.f27677s = new p();
        this.f27679u = new int[2];
        this.f27680v = Integer.MIN_VALUE;
        this.f27681w = Integer.MIN_VALUE;
        this.f27682x = new H(this);
        byte b10 = 0 == true ? 1 : 0;
        J j10 = new J(false, b10, 3, null);
        j10.Q1(this);
        androidx.compose.ui.e eVarA = androidx.compose.ui.layout.n.a(androidx.compose.ui.draw.b.b(N.a(R0.r.e(androidx.compose.ui.input.nestedscroll.a.a(aVar, androidx.compose.ui.viewinterop.d.f27717a, bVar), true, i.f27698a), this), new j(j10, this)), new k(j10));
        j10.f(i10);
        j10.m(this.f27667i.then(eVarA));
        this.f27668j = new d(j10, eVarA);
        j10.c(this.f27669k);
        this.f27670l = new e(j10);
        j10.W1(new f(j10));
        j10.X1(new g());
        j10.o(new h(j10));
        this.f27684z = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L0 A(L0 l02) {
        if (l02.n()) {
            AbstractC1785e0 abstractC1785e0X = this.f27684z.X();
            if (abstractC1785e0X.b()) {
                long jD = AbstractC5022o.d(AbstractC1691q.e(abstractC1785e0X));
                int iK = C5021n.k(jD);
                if (iK < 0) {
                    iK = 0;
                }
                int iL = C5021n.l(jD);
                if (iL < 0) {
                    iL = 0;
                }
                long jA = AbstractC1691q.d(abstractC1785e0X).a();
                int i10 = (int) (jA >> 32);
                int i11 = (int) (jA & 4294967295L);
                long jA2 = abstractC1785e0X.a();
                long jD2 = AbstractC5022o.d(abstractC1785e0X.E0(C6224f.e((((long) Float.floatToRawIntBits((int) (jA2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jA2 >> 32))) << 32))));
                int iK2 = i10 - C5021n.k(jD2);
                if (iK2 < 0) {
                    iK2 = 0;
                }
                int iL2 = i11 - C5021n.l(jD2);
                int i12 = iL2 < 0 ? 0 : iL2;
                if (iK != 0 || iL != 0 || iK2 != 0 || i12 != 0) {
                    return l02.o(iK, iL, iK2, i12);
                }
            }
        }
        return l02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(InterfaceC5082a interfaceC5082a) {
        interfaceC5082a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int D(int i10, int i11, int i12) {
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(AbstractC5874j.m(i12, i10, i11), 1073741824) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            H0.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f27662d.getSnapshotObserver();
    }

    private final A1.b y(A1.b bVar, int i10, int i11, int i12, int i13) {
        int i14 = bVar.f104a - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = bVar.f105b - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = bVar.f106c - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = bVar.f107d - i13;
        return A1.b.c(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2777p0.a z(C2777p0.a aVar) {
        AbstractC1785e0 abstractC1785e0X = this.f27684z.X();
        if (abstractC1785e0X.b()) {
            long jD = AbstractC5022o.d(AbstractC1691q.e(abstractC1785e0X));
            int iK = C5021n.k(jD);
            if (iK < 0) {
                iK = 0;
            }
            int iL = C5021n.l(jD);
            int i10 = iL < 0 ? 0 : iL;
            long jA = AbstractC1691q.d(abstractC1785e0X).a();
            int i11 = (int) (jA >> 32);
            int i12 = (int) (jA & 4294967295L);
            long jA2 = abstractC1785e0X.a();
            long jD2 = AbstractC5022o.d(abstractC1785e0X.E0(C6224f.e((4294967295L & ((long) Float.floatToRawIntBits((int) (jA2 & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (jA2 >> 32))) << 32))));
            int iK2 = i11 - C5021n.k(jD2);
            if (iK2 < 0) {
                iK2 = 0;
            }
            int iL2 = i12 - C5021n.l(jD2);
            int i13 = iL2 >= 0 ? iL2 : 0;
            if (iK != 0 || i10 != 0 || iK2 != 0 || i13 != 0) {
                int i14 = iK;
                int i15 = iK2;
                return new C2777p0.a(y(aVar.a(), i14, i10, i15, i13), y(aVar.b(), i14, i10, i15, i13));
            }
        }
        return aVar;
    }

    public final void B() {
        if (!this.f27683y) {
            this.f27684z.P0();
            return;
        }
        View view = this.f27661c;
        final InterfaceC5082a interfaceC5082a = this.f27677s;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                b.C(interfaceC5082a);
            }
        });
    }

    public void E() {
        if (this.f27661c.getParent() != this) {
            addView(this.f27661c);
        } else {
            this.f27665g.invoke();
        }
    }

    public final void F() {
        int i10;
        int i11 = this.f27680v;
        if (i11 == Integer.MIN_VALUE || (i10 = this.f27681w) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // K0.q0
    public boolean J0() {
        return isAttachedToWindow();
    }

    @Override // Y.InterfaceC2413i
    public void a() {
        this.f27666h.invoke();
    }

    @Override // androidx.core.view.I
    public L0 d(View view, L0 l02) {
        this.f27675q = new L0(l02);
        return A(l02);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f27679u);
        int[] iArr = this.f27679u;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.f27679u[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC5011d getDensity() {
        return this.f27669k;
    }

    public final View getInteropView() {
        return this.f27661c;
    }

    public final J getLayoutNode() {
        return this.f27684z;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f27661c.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final androidx.lifecycle.r getLifecycleOwner() {
        return this.f27671m;
    }

    public final androidx.compose.ui.e getModifier() {
        return this.f27667i;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f27682x.a();
    }

    public final Function1 getOnDensityChanged$ui_release() {
        return this.f27670l;
    }

    public final Function1 getOnModifierChanged$ui_release() {
        return this.f27668j;
    }

    public final Function1 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f27678t;
    }

    public final InterfaceC5082a getRelease() {
        return this.f27666h;
    }

    public final InterfaceC5082a getReset() {
        return this.f27665g;
    }

    public final P3.i getSavedStateRegistryOwner() {
        return this.f27672n;
    }

    public final InterfaceC5082a getUpdate() {
        return this.f27663e;
    }

    public final View getView() {
        return this.f27661c;
    }

    @Override // Y.InterfaceC2413i
    public void h() {
        this.f27665g.invoke();
        removeAllViewsInLayout();
    }

    @Override // androidx.core.view.F
    public void i(View view, View view2, int i10, int i11) {
        this.f27682x.c(view, view2, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        B();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f27661c.isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.F
    public void j(View view, int i10) {
        this.f27682x.e(view, i10);
    }

    @Override // androidx.core.view.F
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (isNestedScrollingEnabled()) {
            D0.b bVar = this.f27660b;
            float fG = androidx.compose.ui.viewinterop.d.g(i10);
            long jD = bVar.d(C6224f.e((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(i11))) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32)), androidx.compose.ui.viewinterop.d.i(i12));
            iArr[0] = AbstractC2691d1.b(Float.intBitsToFloat((int) (jD >> 32)));
            iArr[1] = AbstractC2691d1.b(Float.intBitsToFloat((int) (jD & 4294967295L)));
        }
    }

    @Override // androidx.core.view.G
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            D0.b bVar = this.f27660b;
            float fG = androidx.compose.ui.viewinterop.d.g(i10);
            long jE = C6224f.e((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(i11))) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32));
            float fG2 = androidx.compose.ui.viewinterop.d.g(i12);
            long jB = bVar.b(jE, C6224f.e((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(i13))) & 4294967295L) | (Float.floatToRawIntBits(fG2) << 32)), androidx.compose.ui.viewinterop.d.i(i14));
            iArr[0] = AbstractC2691d1.b(Float.intBitsToFloat((int) (jB >> 32)));
            iArr[1] = AbstractC2691d1.b(Float.intBitsToFloat((int) (jB & 4294967295L)));
        }
    }

    @Override // androidx.core.view.F
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (isNestedScrollingEnabled()) {
            D0.b bVar = this.f27660b;
            float fG = androidx.compose.ui.viewinterop.d.g(i10);
            long jE = C6224f.e((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(i11))) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32));
            float fG2 = androidx.compose.ui.viewinterop.d.g(i12);
            bVar.b(jE, C6224f.e((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(i13))) & 4294967295L) | (Float.floatToRawIntBits(fG2) << 32)), androidx.compose.ui.viewinterop.d.i(i14));
        }
    }

    @Override // androidx.core.view.F
    public boolean o(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27676r.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        B();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f27661c.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f27661c.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (this.f27661c.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.f27661c.measure(i10, i11);
        setMeasuredDimension(this.f27661c.getMeasuredWidth(), this.f27661c.getMeasuredHeight());
        this.f27680v = i10;
        this.f27681w = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC1617k.d(this.f27660b.e(), null, null, new l(z10, this, z.a(androidx.compose.ui.viewinterop.d.h(f10), androidx.compose.ui.viewinterop.d.h(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC1617k.d(this.f27660b.e(), null, null, new m(z.a(androidx.compose.ui.viewinterop.d.h(f10), androidx.compose.ui.viewinterop.d.h(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        Function1 function1 = this.f27678t;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(InterfaceC5011d interfaceC5011d) {
        if (interfaceC5011d != this.f27669k) {
            this.f27669k = interfaceC5011d;
            Function1 function1 = this.f27670l;
            if (function1 != null) {
                function1.invoke(interfaceC5011d);
            }
        }
    }

    public final void setLifecycleOwner(androidx.lifecycle.r rVar) {
        if (rVar != this.f27671m) {
            this.f27671m = rVar;
            Z.b(this, rVar);
        }
    }

    public final void setModifier(androidx.compose.ui.e eVar) {
        if (eVar != this.f27667i) {
            this.f27667i = eVar;
            Function1 function1 = this.f27668j;
            if (function1 != null) {
                function1.invoke(eVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1 function1) {
        this.f27670l = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1 function1) {
        this.f27668j = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1 function1) {
        this.f27678t = function1;
    }

    protected final void setRelease(InterfaceC5082a interfaceC5082a) {
        this.f27666h = interfaceC5082a;
    }

    protected final void setReset(InterfaceC5082a interfaceC5082a) {
        this.f27665g = interfaceC5082a;
    }

    public final void setSavedStateRegistryOwner(P3.i iVar) {
        if (iVar != this.f27672n) {
            this.f27672n = iVar;
            P3.m.b(this, iVar);
        }
    }

    protected final void setUpdate(InterfaceC5082a interfaceC5082a) {
        this.f27663e = interfaceC5082a;
        this.f27664f = true;
        this.f27676r.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }
}
