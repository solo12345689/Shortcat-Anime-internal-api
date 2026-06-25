package Qa;

import Td.L;
import Ud.AbstractC2279u;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.swmansion.gesturehandler.react.k;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: n */
    public static final a f14623n = new a(null);

    /* JADX INFO: renamed from: o */
    private static final PointF f14624o = new PointF();

    /* JADX INFO: renamed from: p */
    private static final float[] f14625p = new float[2];

    /* JADX INFO: renamed from: q */
    private static final Matrix f14626q = new Matrix();

    /* JADX INFO: renamed from: r */
    private static final float[] f14627r = new float[2];

    /* JADX INFO: renamed from: s */
    private static final Comparator f14628s = new Comparator() { // from class: Qa.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return i.t((AbstractC2081d) obj, (AbstractC2081d) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    private final ViewGroup f14629a;

    /* JADX INFO: renamed from: b */
    private final j f14630b;

    /* JADX INFO: renamed from: c */
    private final D f14631c;

    /* JADX INFO: renamed from: d */
    private final ViewGroup f14632d;

    /* JADX INFO: renamed from: e */
    private float f14633e;

    /* JADX INFO: renamed from: f */
    private final ArrayList f14634f;

    /* JADX INFO: renamed from: g */
    private final ArrayList f14635g;

    /* JADX INFO: renamed from: h */
    private final ArrayList f14636h;

    /* JADX INFO: renamed from: i */
    private final HashSet f14637i;

    /* JADX INFO: renamed from: j */
    private boolean f14638j;

    /* JADX INFO: renamed from: k */
    private int f14639k;

    /* JADX INFO: renamed from: l */
    private boolean f14640l;

    /* JADX INFO: renamed from: m */
    private int f14641m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean h(AbstractC2081d abstractC2081d, AbstractC2081d abstractC2081d2) {
            return abstractC2081d == abstractC2081d2 || abstractC2081d.L0(abstractC2081d2) || abstractC2081d2.L0(abstractC2081d);
        }

        public final boolean i(int i10) {
            return i10 == 3 || i10 == 1 || i10 == 5;
        }

        public final boolean j(float f10, float f11, View view) {
            return 0.0f <= f10 && f10 <= ((float) view.getWidth()) && 0.0f <= f11 && f11 <= ((float) view.getHeight());
        }

        public final boolean k(AbstractC2081d abstractC2081d, AbstractC2081d abstractC2081d2) {
            if (!abstractC2081d.Y(abstractC2081d2) || h(abstractC2081d, abstractC2081d2)) {
                return false;
            }
            if (abstractC2081d == abstractC2081d2) {
                return true;
            }
            if (abstractC2081d.a0() || abstractC2081d.S() == 4) {
                return abstractC2081d.K0(abstractC2081d2);
            }
            return true;
        }

        public final boolean l(AbstractC2081d abstractC2081d, AbstractC2081d abstractC2081d2) {
            if (abstractC2081d != abstractC2081d2) {
                return abstractC2081d.N0(abstractC2081d2) || abstractC2081d2.M0(abstractC2081d);
            }
            return false;
        }

        public final boolean m(View view, float[] fArr) {
            return !((view instanceof ViewGroup) && view.getBackground() == null) && j(fArr[0], fArr[1], view);
        }

        public final void n(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f10 + viewGroup.getScrollX()) - view.getLeft();
            float scrollY = (f11 + viewGroup.getScrollY()) - view.getTop();
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = i.f14625p;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(i.f14626q);
                i.f14626q.mapPoints(fArr);
                float f12 = fArr[0];
                scrollY = fArr[1];
                scrollX = f12;
            }
            pointF.set(scrollX, scrollY);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14642a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.f14729a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.f14731c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.f14730b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v.f14732d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14642a = iArr;
        }
    }

    public i(ViewGroup wrapperView, j handlerRegistry, D viewConfigHelper, ViewGroup rootView) {
        AbstractC5504s.h(wrapperView, "wrapperView");
        AbstractC5504s.h(handlerRegistry, "handlerRegistry");
        AbstractC5504s.h(viewConfigHelper, "viewConfigHelper");
        AbstractC5504s.h(rootView, "rootView");
        this.f14629a = wrapperView;
        this.f14630b = handlerRegistry;
        this.f14631c = viewConfigHelper;
        this.f14632d = rootView;
        this.f14634f = new ArrayList();
        this.f14635g = new ArrayList();
        this.f14636h = new ArrayList();
        this.f14637i = new HashSet();
    }

    private final void C(AbstractC2081d abstractC2081d, View view) {
        if (this.f14634f.contains(abstractC2081d)) {
            return;
        }
        this.f14634f.add(abstractC2081d);
        abstractC2081d.w0(false);
        abstractC2081d.x0(false);
        abstractC2081d.v0(Integer.MAX_VALUE);
        abstractC2081d.q0(view, this);
    }

    private final boolean D(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        boolean z10;
        ArrayList arrayListA = this.f14630b.a(view);
        if (arrayListA != null) {
            synchronized (arrayListA) {
                try {
                    Iterator it = arrayListA.iterator();
                    AbstractC5504s.g(it, "iterator(...)");
                    z10 = false;
                    while (it.hasNext()) {
                        AbstractC2081d abstractC2081d = (AbstractC2081d) it.next();
                        if (abstractC2081d.d0() && abstractC2081d.g0(view, fArr[0], fArr[1]) && !I(abstractC2081d, motionEvent)) {
                            C(abstractC2081d, view);
                            abstractC2081d.O0(i10);
                            z10 = true;
                        }
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            z10 = false;
        }
        float width = view.getWidth();
        float f10 = fArr[0];
        if (0.0f <= f10 && f10 <= width) {
            float height = view.getHeight();
            float f11 = fArr[1];
            if (0.0f <= f11 && f11 <= height && y(view) && p(view, fArr, i10)) {
                return true;
            }
        }
        return z10;
    }

    private final void E() {
        if (this.f14638j || this.f14639k != 0) {
            this.f14640l = true;
        } else {
            l();
        }
    }

    private final boolean G(AbstractC2081d abstractC2081d) {
        ArrayList<AbstractC2081d> arrayList = this.f14634f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC2081d abstractC2081d2 : arrayList) {
            if (abstractC2081d.Y(abstractC2081d2) && abstractC2081d2.S() == 4 && !f14623n.h(abstractC2081d, abstractC2081d2) && abstractC2081d.c0(abstractC2081d2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean H(AbstractC2081d abstractC2081d) {
        ArrayList<AbstractC2081d> arrayList = this.f14634f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC2081d abstractC2081d2 : arrayList) {
            if (f14623n.l(abstractC2081d, abstractC2081d2) && abstractC2081d2.S() == 5) {
                return true;
            }
        }
        return false;
    }

    private final boolean I(AbstractC2081d abstractC2081d, MotionEvent motionEvent) {
        return ((abstractC2081d instanceof m) || (abstractC2081d instanceof k.b) || !com.swmansion.gesturehandler.react.a.c(motionEvent)) ? false : true;
    }

    private final boolean J(View view) {
        return (view instanceof com.swmansion.gesturehandler.react.l) && !AbstractC5504s.c(view, this.f14629a) && ((com.swmansion.gesturehandler.react.l) view).C();
    }

    private final boolean M(View view, float[] fArr, int i10, MotionEvent motionEvent) {
        if (J(view)) {
            return false;
        }
        int i11 = b.f14642a[this.f14631c.a(view).ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return D(view, fArr, i10, motionEvent) || f14623n.m(view, fArr);
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return D(view, fArr, i10, motionEvent) || (view instanceof ViewGroup ? r((ViewGroup) view, fArr, i10, motionEvent) : false) || f14623n.m(view, fArr);
            }
            throw new Td.r();
        }
        if (!(view instanceof ViewGroup)) {
            if (view instanceof EditText) {
                return D(view, fArr, i10, motionEvent);
            }
            return false;
        }
        boolean zR = r((ViewGroup) view, fArr, i10, motionEvent);
        if (zR) {
            D(view, fArr, i10, motionEvent);
        }
        return zR;
    }

    private final void N(AbstractC2081d abstractC2081d) {
        if (H(abstractC2081d) || G(abstractC2081d)) {
            abstractC2081d.q();
        } else if (u(abstractC2081d)) {
            h(abstractC2081d);
        } else {
            z(abstractC2081d);
            abstractC2081d.x0(false);
        }
    }

    public static final L g(AbstractC2081d abstractC2081d) {
        abstractC2081d.p();
        abstractC2081d.k();
        abstractC2081d.B();
        return L.f17438a;
    }

    private final void h(AbstractC2081d abstractC2081d) {
        if (this.f14635g.contains(abstractC2081d)) {
            return;
        }
        this.f14635g.add(abstractC2081d);
        this.f14637i.add(Integer.valueOf(abstractC2081d.T()));
        abstractC2081d.x0(true);
        int i10 = this.f14641m;
        this.f14641m = i10 + 1;
        abstractC2081d.v0(i10);
    }

    private final boolean i(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f14633e;
    }

    private final void j() {
        Iterator it = AbstractC2279u.b1(AbstractC2279u.V(this.f14635g)).iterator();
        while (it.hasNext()) {
            ((AbstractC2081d) it.next()).q();
        }
        this.f14636h.clear();
        this.f14636h.addAll(this.f14634f);
        Iterator it2 = AbstractC2279u.V(this.f14634f).iterator();
        while (it2.hasNext()) {
            ((AbstractC2081d) it2.next()).q();
        }
    }

    private final void k() {
        for (AbstractC2081d abstractC2081d : AbstractC2279u.b1(this.f14635g)) {
            if (!abstractC2081d.a0()) {
                this.f14635g.remove(abstractC2081d);
                this.f14637i.remove(Integer.valueOf(abstractC2081d.T()));
            }
        }
    }

    private final void l() {
        for (AbstractC2081d abstractC2081d : AbstractC2279u.V(this.f14634f)) {
            if (f14623n.i(abstractC2081d.S()) && !abstractC2081d.a0()) {
                abstractC2081d.r0();
                abstractC2081d.w0(false);
                abstractC2081d.x0(false);
                abstractC2081d.v0(Integer.MAX_VALUE);
            }
        }
        AbstractC2279u.K(this.f14634f, new Function1() { // from class: Qa.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(i.m((AbstractC2081d) obj));
            }
        });
        this.f14640l = false;
    }

    public static final boolean m(AbstractC2081d it) {
        AbstractC5504s.h(it, "it");
        return f14623n.i(it.S()) && !it.a0();
    }

    private final void n(AbstractC2081d abstractC2081d, MotionEvent motionEvent) {
        if (!x(abstractC2081d.W())) {
            abstractC2081d.q();
            return;
        }
        if (abstractC2081d.S0(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            View viewW = abstractC2081d.W();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            AbstractC5504s.g(motionEventObtain, "obtain(...)");
            MotionEvent motionEventK = K(viewW, motionEventObtain);
            if (abstractC2081d.N() && abstractC2081d.S() != 0) {
                abstractC2081d.R0(motionEventK, motionEvent);
            }
            if (!abstractC2081d.a0() || actionMasked != 2) {
                boolean z10 = abstractC2081d.S() == 0;
                abstractC2081d.X(motionEventK, motionEvent);
                if (abstractC2081d.Z()) {
                    if (abstractC2081d.R()) {
                        abstractC2081d.H0(false);
                        abstractC2081d.t0();
                    }
                    abstractC2081d.v(motionEventK);
                }
                if (abstractC2081d.N() && z10) {
                    abstractC2081d.R0(motionEventK, motionEvent);
                }
                if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                    abstractC2081d.P0(motionEventK.getPointerId(motionEventK.getActionIndex()));
                }
            }
            motionEventK.recycle();
        }
    }

    private final void o(MotionEvent motionEvent) {
        this.f14636h.clear();
        this.f14636h.addAll(this.f14634f);
        AbstractC2279u.B(this.f14636h, f14628s);
        Iterator it = this.f14636h.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            n((AbstractC2081d) it.next(), motionEvent);
        }
    }

    private final boolean p(View view, float[] fArr, int i10) {
        boolean z10 = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                if ((parent instanceof com.swmansion.gesturehandler.react.l) && ((com.swmansion.gesturehandler.react.l) parent).C()) {
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList arrayListA = this.f14630b.a((View) parent);
                if (arrayListA != null) {
                    synchronized (arrayListA) {
                        try {
                            Iterator it = arrayListA.iterator();
                            AbstractC5504s.g(it, "iterator(...)");
                            while (it.hasNext()) {
                                AbstractC2081d abstractC2081d = (AbstractC2081d) it.next();
                                if (abstractC2081d.d0() && abstractC2081d.g0(view, fArr[0], fArr[1])) {
                                    C(abstractC2081d, viewGroup);
                                    abstractC2081d.O0(i10);
                                    z10 = true;
                                }
                            }
                            L l10 = L.f17438a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return z10;
    }

    private final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f14627r;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        M(this.f14629a, fArr, pointerId, motionEvent);
        r(this.f14629a, fArr, pointerId, motionEvent);
    }

    private final boolean r(ViewGroup viewGroup, float[] fArr, int i10, MotionEvent motionEvent) {
        ViewGroup viewGroup2;
        if (J(viewGroup)) {
            return false;
        }
        int childCount = viewGroup.getChildCount() - 1;
        while (-1 < childCount) {
            View viewC = this.f14631c.c(viewGroup, childCount);
            if (i(viewC)) {
                PointF pointF = f14624o;
                a aVar = f14623n;
                viewGroup2 = viewGroup;
                aVar.n(fArr[0], fArr[1], viewGroup2, viewC, pointF);
                float f10 = fArr[0];
                float f11 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean zM = (!w(viewC) || aVar.j(fArr[0], fArr[1], viewC)) ? M(viewC, fArr, i10, motionEvent) : false;
                fArr[0] = f10;
                fArr[1] = f11;
                if (zM) {
                    return true;
                }
            } else {
                viewGroup2 = viewGroup;
            }
            childCount--;
            viewGroup = viewGroup2;
        }
        return false;
    }

    public static final int t(AbstractC2081d abstractC2081d, AbstractC2081d abstractC2081d2) {
        if ((abstractC2081d.Z() && abstractC2081d2.Z()) || (abstractC2081d.a0() && abstractC2081d2.a0())) {
            return Integer.signum(abstractC2081d2.G() - abstractC2081d.G());
        }
        if (abstractC2081d.Z()) {
            return -1;
        }
        if (abstractC2081d2.Z()) {
            return 1;
        }
        if (abstractC2081d.a0()) {
            return -1;
        }
        return abstractC2081d2.a0() ? 1 : 0;
    }

    private final boolean u(AbstractC2081d abstractC2081d) {
        ArrayList<AbstractC2081d> arrayList = this.f14634f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (AbstractC2081d abstractC2081d2 : arrayList) {
            a aVar = f14623n;
            if (!aVar.i(abstractC2081d2.S()) && aVar.l(abstractC2081d, abstractC2081d2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean w(View view) {
        return !(view instanceof ViewGroup) || this.f14631c.b((ViewGroup) view);
    }

    private final boolean x(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f14629a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f14629a) {
            parent = parent.getParent();
        }
        return parent == this.f14629a;
    }

    private final boolean y(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f14625p;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        return left < 0.0f || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < 0.0f || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight());
    }

    private final void z(AbstractC2081d abstractC2081d) {
        int iS = abstractC2081d.S();
        abstractC2081d.x0(false);
        abstractC2081d.w0(true);
        abstractC2081d.H0(true);
        int i10 = this.f14641m;
        this.f14641m = i10 + 1;
        abstractC2081d.v0(i10);
        for (AbstractC2081d abstractC2081d2 : AbstractC2279u.V(this.f14634f)) {
            if (f14623n.k(abstractC2081d2, abstractC2081d)) {
                abstractC2081d2.q();
            }
        }
        for (AbstractC2081d abstractC2081d3 : AbstractC2279u.V(this.f14635g)) {
            if (f14623n.k(abstractC2081d3, abstractC2081d)) {
                abstractC2081d3.x0(false);
            }
        }
        k();
        if (iS == 1 || iS == 3) {
            return;
        }
        abstractC2081d.w(4, 2);
        if (iS != 4) {
            abstractC2081d.w(5, 4);
            if (iS != 5) {
                abstractC2081d.w(0, 5);
            }
        }
    }

    public final void A(AbstractC2081d handler, int i10, int i11) {
        AbstractC5504s.h(handler, "handler");
        this.f14639k++;
        if (f14623n.i(i10)) {
            for (AbstractC2081d abstractC2081d : AbstractC2279u.b1(this.f14635g)) {
                if (f14623n.l(abstractC2081d, handler) && this.f14637i.contains(Integer.valueOf(abstractC2081d.T()))) {
                    if (i10 == 5) {
                        abstractC2081d.q();
                        if (abstractC2081d.S() == 5) {
                            abstractC2081d.w(3, 2);
                        }
                        abstractC2081d.x0(false);
                    } else {
                        N(abstractC2081d);
                    }
                }
            }
            k();
        }
        if (i10 == 4) {
            N(handler);
        } else if (i11 == 4 || i11 == 5) {
            if (handler.Z()) {
                handler.w(i10, i11);
            } else if (i11 == 4 && (i10 == 3 || i10 == 1)) {
                handler.w(i10, 2);
            }
        } else if (i11 != 0 || i10 != 3) {
            handler.w(i10, i11);
        }
        this.f14639k--;
        E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.AbstractC5504s.h(r5, r0)
            r0 = 1
            r4.f14638j = r0
            int r1 = r5.getActionMasked()
            r2 = 3
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L18
            r3 = 5
            if (r1 == r3) goto L1c
            r3 = 7
            if (r1 == r3) goto L1c
            goto L1f
        L18:
            r4.j()
            goto L1f
        L1c:
            r4.q(r5)
        L1f:
            r4.o(r5)
            r3 = 0
            r4.f14638j = r3
            boolean r3 = r4.f14640l
            if (r3 == 0) goto L30
            int r3 = r4.f14639k
            if (r3 != 0) goto L30
            r4.l()
        L30:
            if (r1 == r0) goto L39
            if (r1 == r2) goto L39
            r2 = 10
            if (r1 == r2) goto L39
            goto L4d
        L39:
            java.util.ArrayList r1 = r4.f14634f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L4d
            android.view.ViewGroup r1 = r4.f14632d
            boolean r2 = r1 instanceof com.facebook.react.uimanager.W
            if (r2 == 0) goto L4d
            r2 = r1
            com.facebook.react.uimanager.W r2 = (com.facebook.react.uimanager.W) r2
            r2.j(r1, r5)
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa.i.B(android.view.MotionEvent):boolean");
    }

    public final void F(float f10) {
        this.f14633e = f10;
    }

    public final MotionEvent K(View view, MotionEvent event) {
        AbstractC5504s.h(event, "event");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!AbstractC5504s.c(viewGroup, this.f14629a)) {
                K(viewGroup, event);
            }
            if (viewGroup != null) {
                event.setLocation((event.getX() + viewGroup.getScrollX()) - view.getLeft(), (event.getY() + viewGroup.getScrollY()) - view.getTop());
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f14626q;
                matrix.invert(matrix2);
                event.transform(matrix2);
            }
        }
        return event;
    }

    public final PointF L(View view, PointF point) {
        AbstractC5504s.h(point, "point");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!AbstractC5504s.c(viewGroup, this.f14629a)) {
                L(viewGroup, point);
            }
            if (viewGroup != null) {
                point.x += viewGroup.getScrollX() - view.getLeft();
                point.y += viewGroup.getScrollY() - view.getTop();
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f14626q;
                matrix.invert(matrix2);
                float[] fArr = f14627r;
                fArr[0] = point.x;
                fArr[1] = point.y;
                matrix2.mapPoints(fArr);
                point.x = fArr[0];
                point.y = fArr[1];
            }
        }
        return point;
    }

    public final void f(View view) {
        AbstractC5504s.h(view, "view");
        ArrayList<AbstractC2081d> arrayListA = this.f14630b.a(view);
        if (arrayListA != null) {
            for (final AbstractC2081d abstractC2081d : arrayListA) {
                if (abstractC2081d instanceof q) {
                    C(abstractC2081d, view);
                    abstractC2081d.T0(new InterfaceC5082a() { // from class: Qa.h
                        @Override // ie.InterfaceC5082a
                        public final Object invoke() {
                            return i.g(abstractC2081d);
                        }
                    });
                }
            }
        }
    }

    public final ArrayList s(View view) {
        AbstractC5504s.h(view, "view");
        return this.f14630b.a(view);
    }

    public final boolean v() {
        ArrayList arrayList = this.f14634f;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((AbstractC2081d) it.next()).S() == 4) {
                return true;
            }
        }
        return false;
    }
}
