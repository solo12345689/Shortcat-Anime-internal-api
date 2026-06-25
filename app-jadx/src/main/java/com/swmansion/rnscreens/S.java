package com.swmansion.rnscreens;

import Ud.AbstractC2279u;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.C4546y;
import db.C4577c;
import db.C4578d;
import db.C4579e;
import db.InterfaceC4575a;
import fb.AbstractC4793c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class S extends A {

    /* JADX INFO: renamed from: r */
    public static final a f44378r = new a(null);

    /* JADX INFO: renamed from: h */
    private final ArrayList f44379h;

    /* JADX INFO: renamed from: i */
    private final Set f44380i;

    /* JADX INFO: renamed from: j */
    private List f44381j;

    /* JADX INFO: renamed from: k */
    private final List f44382k;

    /* JADX INFO: renamed from: l */
    private List f44383l;

    /* JADX INFO: renamed from: m */
    private Y f44384m;

    /* JADX INFO: renamed from: n */
    private boolean f44385n;

    /* JADX INFO: renamed from: o */
    private InterfaceC4575a f44386o;

    /* JADX INFO: renamed from: p */
    private List f44387p;

    /* JADX INFO: renamed from: q */
    private boolean f44388q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean b(G g10, C4546y.d dVar) {
            if (dVar == null) {
                dVar = g10.k().getStackAnimation();
            }
            return (Build.VERSION.SDK_INT >= 33 || dVar == C4546y.d.f44799d || dVar == C4546y.d.f44802g || dVar == C4546y.d.f44803h || dVar == C4546y.d.f44804i) && dVar != C4546y.d.f44797b;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class b {

        /* JADX INFO: renamed from: a */
        private Canvas f44389a;

        /* JADX INFO: renamed from: b */
        private View f44390b;

        /* JADX INFO: renamed from: c */
        private long f44391c;

        public b() {
        }

        public final void a() {
            S.this.c0(this);
            this.f44389a = null;
            this.f44390b = null;
            this.f44391c = 0L;
        }

        public final Canvas b() {
            return this.f44389a;
        }

        public final View c() {
            return this.f44390b;
        }

        public final long d() {
            return this.f44391c;
        }

        public final void e(Canvas canvas) {
            this.f44389a = canvas;
        }

        public final void f(View view) {
            this.f44390b = view;
        }

        public final void g(long j10) {
            this.f44391c = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44393a;

        static {
            int[] iArr = new int[C4546y.e.values().length];
            try {
                iArr[C4546y.e.f44810d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f44393a = iArr;
        }
    }

    public S(Context context) {
        super(context);
        this.f44379h = new ArrayList();
        this.f44380i = new HashSet();
        this.f44381j = new ArrayList();
        this.f44382k = new ArrayList();
        this.f44383l = new ArrayList();
        this.f44387p = new ArrayList();
    }

    private final void O() {
        int iF = com.facebook.react.uimanager.f0.f(this);
        Context context = getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new Ta.t(iF, getId()));
        }
    }

    private final void P() {
        List<b> list = this.f44383l;
        this.f44383l = new ArrayList();
        for (b bVar : list) {
            bVar.a();
            this.f44382k.add(bVar);
        }
    }

    private final b Q() {
        if (this.f44382k.isEmpty()) {
            return new b();
        }
        List list = this.f44382k;
        return (b) list.remove(AbstractC2279u.o(list));
    }

    public static final boolean R(S s10, Y wrapper) {
        AbstractC5504s.h(wrapper, "wrapper");
        return !s10.f44330a.contains(wrapper) || s10.f44380i.contains(wrapper);
    }

    public static final boolean S(kotlin.jvm.internal.N n10, G it) {
        AbstractC5504s.h(it, "it");
        return it != n10.f52259a;
    }

    public static final boolean T(kotlin.jvm.internal.N n10, S s10, G it) {
        AbstractC5504s.h(it, "it");
        return !(it == n10.f52259a || AbstractC2279u.e0(s10.f44380i, it)) || it.k().getActivityState() == C4546y.a.f44787a;
    }

    public static final boolean U(kotlin.jvm.internal.N n10, G it) {
        AbstractC5504s.h(it, "it");
        return it != n10.f52259a;
    }

    public static final void V(G g10) {
        C4546y c4546yK;
        if (g10 == null || (c4546yK = g10.k()) == null) {
            return;
        }
        c4546yK.bringToFront();
    }

    public static final Y W(G it) {
        AbstractC5504s.h(it, "it");
        return (Y) it;
    }

    public static final boolean X(G it) {
        AbstractC5504s.h(it, "it");
        return it.k().getActivityState() == C4546y.a.f44787a;
    }

    public static final boolean Y(S s10, G it) {
        AbstractC5504s.h(it, "it");
        return (AbstractC2279u.e0(s10.f44380i, it) || it.k().getActivityState() == C4546y.a.f44787a) ? false : true;
    }

    public static final boolean Z(G it) {
        AbstractC5504s.h(it, "it");
        return it.l();
    }

    public static final boolean a0(kotlin.jvm.internal.N n10, Y it) {
        AbstractC5504s.h(it, "it");
        return it != n10.f52259a && it.l();
    }

    public final void c0(b bVar) {
        Canvas canvasB = bVar.b();
        AbstractC5504s.e(canvasB);
        super.drawChild(canvasB, bVar.c(), bVar.d());
    }

    private final void e0(G g10) {
        Y y10;
        if (this.f44330a.size() > 1 && g10 != null && (y10 = this.f44384m) != null && y10.l()) {
            ArrayList arrayList = this.f44330a;
            for (G g11 : AbstractC2279u.U(AbstractC2279u.P0(arrayList, AbstractC5874j.x(0, arrayList.size() - 1)))) {
                g11.k().h(4);
                if (AbstractC5504s.c(g11, g10)) {
                    break;
                }
            }
        }
        C4546y topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.h(0);
        }
    }

    @Override // com.swmansion.rnscreens.A
    /* JADX INFO: renamed from: M */
    public Y c(C4546y screen) {
        AbstractC5504s.h(screen, "screen");
        return c.f44393a[screen.getStackPresentation().ordinal()] == 1 ? new X(screen) : new X(screen);
    }

    public final void N(Y screenFragment) {
        AbstractC5504s.h(screenFragment, "screenFragment");
        this.f44380i.add(screenFragment);
        w();
    }

    public final void b0() {
        if (this.f44385n) {
            return;
        }
        O();
    }

    public final boolean d0() {
        int iNextIndex;
        Iterator it = this.f44330a.iterator();
        int i10 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((G) it.next()).k().getActivityState() != C4546y.a.f44787a) {
                break;
            }
            i10++;
        }
        ArrayList arrayList = this.f44330a;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (((G) listIterator.previous()).k().getActivityState() != C4546y.a.f44787a) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (i10 < 0 || iNextIndex <= i10) {
            return false;
        }
        int i11 = i10 + 1;
        if (i11 <= iNextIndex) {
            while (true) {
                p(((G) this.f44330a.get(i11)).k());
                if (i11 == iNextIndex) {
                    break;
                }
                i11++;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        super.dispatchDraw(canvas);
        InterfaceC4575a interfaceC4575a = this.f44386o;
        if (interfaceC4575a != null) {
            interfaceC4575a.a(this.f44383l);
        }
        P();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j10) {
        AbstractC5504s.h(canvas, "canvas");
        AbstractC5504s.h(child, "child");
        List list = this.f44383l;
        b bVarQ = Q();
        bVarQ.e(canvas);
        bVarQ.f(child);
        bVarQ.g(j10);
        list.add(bVarQ);
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        InterfaceC4575a interfaceC4575a;
        AbstractC5504s.h(view, "view");
        super.endViewTransition(view);
        this.f44387p.remove(view);
        if (this.f44387p.isEmpty() && (interfaceC4575a = this.f44386o) != null) {
            interfaceC4575a.disable();
        }
        if (this.f44385n) {
            this.f44385n = false;
            O();
        }
    }

    public final ArrayList<Y> getFragments() {
        return this.f44379h;
    }

    public final boolean getGoingForward() {
        return this.f44388q;
    }

    public final C4546y getRootScreen() {
        Object next;
        C4546y c4546yK;
        Iterator it = this.f44330a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!AbstractC2279u.e0(this.f44380i, (G) next)) {
                break;
            }
        }
        G g10 = (G) next;
        if (g10 == null || (c4546yK = g10.k()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return c4546yK;
    }

    public final List<String> getScreenIds() {
        ArrayList arrayList = this.f44330a;
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((G) it.next()).k().getScreenId());
        }
        return arrayList2;
    }

    @Override // com.swmansion.rnscreens.A
    public C4546y getTopScreen() {
        Y y10 = this.f44384m;
        if (y10 != null) {
            return y10.k();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.A
    public boolean n(G g10) {
        return super.n(g10) && !AbstractC2279u.e0(this.f44380i, g10);
    }

    @Override // com.swmansion.rnscreens.A
    protected void o() {
        Iterator it = this.f44379h.iterator();
        while (it.hasNext()) {
            ((Y) it.next()).p();
        }
    }

    public final void setGoingForward(boolean z10) {
        this.f44388q = z10;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        InterfaceC4575a interfaceC4575a;
        AbstractC5504s.h(view, "view");
        if (!(view instanceof C4579e)) {
            throw new IllegalStateException(("[RNScreens] Unexpected type of ScreenStack direct subview " + view.getClass()).toString());
        }
        super.startViewTransition(view);
        if (((C4579e) view).getFragment$react_native_screens_release().isRemoving()) {
            this.f44387p.add(view);
        }
        if (!this.f44387p.isEmpty() && (interfaceC4575a = this.f44386o) != null) {
            interfaceC4575a.enable();
        }
        this.f44385n = true;
    }

    @Override // com.swmansion.rnscreens.A
    public void u() {
        C4546y.d stackAnimation;
        boolean z10;
        C4546y c4546yK;
        Y y10;
        int iW;
        Object obj;
        C4546y c4546yK2;
        final kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        final kotlin.jvm.internal.N n11 = new kotlin.jvm.internal.N();
        this.f44386o = null;
        Cf.i iVarZ = Cf.l.z(AbstractC2279u.c0(AbstractC2279u.V(this.f44330a)), new Function1() { // from class: com.swmansion.rnscreens.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(S.Y(this.f44368a, (G) obj2));
            }
        });
        n10.f52259a = Cf.l.D(iVarZ);
        G g10 = (G) Cf.l.D(Cf.l.y(iVarZ, new Function1() { // from class: com.swmansion.rnscreens.I
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(S.Z((G) obj2));
            }
        }));
        if (g10 == null || g10 == n10.f52259a) {
            g10 = null;
        }
        n11.f52259a = g10;
        boolean z11 = AbstractC2279u.e0(this.f44379h, n10.f52259a) && !AbstractC2279u.e0(this.f44381j, n10.f52259a);
        Object obj2 = n10.f52259a;
        Y y11 = this.f44384m;
        boolean z12 = obj2 != y11;
        if (obj2 == null || z11) {
            if (obj2 == null || y11 == null || !z12) {
                stackAnimation = null;
                z10 = true;
            } else {
                stackAnimation = (y11 == null || (c4546yK = y11.k()) == null) ? null : c4546yK.getStackAnimation();
                z10 = false;
            }
        } else if (y11 != null) {
            z10 = (y11 != null && this.f44330a.contains(y11)) || (((G) n10.f52259a).k().getReplaceAnimation() == C4546y.c.f44792a);
            if (z10) {
                c4546yK2 = ((G) n10.f52259a).k();
            } else {
                Y y12 = this.f44384m;
                if (y12 == null || (c4546yK2 = y12.k()) == null) {
                    stackAnimation = null;
                }
            }
            stackAnimation = c4546yK2.getStackAnimation();
        } else {
            stackAnimation = C4546y.d.f44797b;
            this.f44388q = true;
            z10 = true;
        }
        this.f44388q = z10;
        if (z10 && (obj = n10.f52259a) != null && f44378r.b((G) obj, stackAnimation) && n11.f52259a == null) {
            this.f44386o = new C4578d();
        } else if (n10.f52259a != null && z11 && (y10 = this.f44384m) != null && y10.l() && !((G) n10.f52259a).l() && (iW = Cf.l.w(Cf.l.R(AbstractC2279u.c0(AbstractC2279u.V(this.f44379h)), new Function1() { // from class: com.swmansion.rnscreens.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(S.a0(n10, (Y) obj3));
            }
        }))) > 1) {
            this.f44386o = new C4577c(Math.max((AbstractC2279u.o(this.f44379h) - iW) + 1, 0));
        }
        androidx.fragment.app.U uG = g();
        if (stackAnimation != null) {
            AbstractC4793c.a(uG, stackAnimation, z10);
        }
        Iterator it = Cf.l.z(AbstractC2279u.c0(this.f44379h), new Function1() { // from class: com.swmansion.rnscreens.K
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(S.R(this.f44370a, (Y) obj3));
            }
        }).iterator();
        while (it.hasNext()) {
            uG.n(((Y) it.next()).a());
        }
        Iterator it2 = Cf.l.z(Cf.l.R(AbstractC2279u.c0(this.f44330a), new Function1() { // from class: com.swmansion.rnscreens.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(S.S(n11, (G) obj3));
            }
        }), new Function1() { // from class: com.swmansion.rnscreens.M
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(S.T(n10, this, (G) obj3));
            }
        }).iterator();
        while (it2.hasNext()) {
            uG.n(((G) it2.next()).a());
        }
        Object obj3 = n11.f52259a;
        if (obj3 == null || ((G) obj3).a().isAdded()) {
            Object obj4 = n10.f52259a;
            if (obj4 != null && !((G) obj4).a().isAdded()) {
                if (Sa.r.c(((G) n10.f52259a).k())) {
                    ((G) n10.f52259a).a().postponeEnterTransition();
                }
                uG.b(getId(), ((G) n10.f52259a).a());
            }
        } else {
            final G g11 = (G) n10.f52259a;
            Iterator it3 = Cf.l.y(AbstractC2279u.c0(this.f44330a), new Function1() { // from class: com.swmansion.rnscreens.N
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    return Boolean.valueOf(S.U(n11, (G) obj5));
                }
            }).iterator();
            while (it3.hasNext()) {
                uG.b(getId(), ((G) it3.next()).a()).q(new Runnable() { // from class: com.swmansion.rnscreens.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        S.V(g11);
                    }
                });
            }
        }
        Object obj5 = n10.f52259a;
        this.f44384m = obj5 instanceof Y ? (Y) obj5 : null;
        this.f44379h.clear();
        AbstractC2279u.C(this.f44379h, Cf.l.K(AbstractC2279u.c0(this.f44330a), new Function1() { // from class: com.swmansion.rnscreens.P
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj6) {
                return S.W((G) obj6);
            }
        }));
        this.f44381j = Cf.l.T(Cf.l.z(AbstractC2279u.c0(this.f44330a), new Function1() { // from class: com.swmansion.rnscreens.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj6) {
                return Boolean.valueOf(S.X((G) obj6));
            }
        }));
        e0((G) n11.f52259a);
        uG.k();
    }

    @Override // com.swmansion.rnscreens.A
    public void x() {
        this.f44380i.clear();
        super.x();
    }

    @Override // com.swmansion.rnscreens.A
    public void z(int i10) {
        Set set = this.f44380i;
        kotlin.jvm.internal.V.a(set).remove(m(i10));
        super.z(i10);
    }
}
