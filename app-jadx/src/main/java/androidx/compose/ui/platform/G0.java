package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6226h;
import t.C6545K;
import t.C6550P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f27215f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27216g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f27217h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f27218a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f27219b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f27220c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f27221d = new c(new c.a() { // from class: androidx.compose.ui.platform.F0
        @Override // androidx.compose.ui.platform.G0.c.a
        public final View a(View view, View view2) {
            return G0.p(this.f27214a, view, view2);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f27222e = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public G0 initialValue() {
            return new G0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final G0 a() {
            Object obj = G0.f27217h.get();
            AbstractC5504s.e(obj);
            return (G0) obj;
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f27223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C6550P f27224b = t.d0.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t.Q f27225c = t.f0.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final C6550P f27226d = t.d0.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C6545K f27227e = t.U.b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f27228f;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public interface a {
            View a(View view, View view2);
        }

        public c(a aVar) {
            this.f27223a = aVar;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            if (view == view2) {
                return 0;
            }
            if (view == null) {
                return -1;
            }
            if (view2 == null) {
                return 1;
            }
            View view3 = (View) this.f27226d.e(view);
            View view4 = (View) this.f27226d.e(view2);
            if (view3 == view4 && view3 != null) {
                if (view == view3) {
                    return -1;
                }
                return (view2 == view3 || this.f27224b.e(view) == null) ? 1 : -1;
            }
            if (view3 != null) {
                view = view3;
            }
            if (view4 != null) {
                view2 = view4;
            }
            if (view3 == null && view4 == null) {
                return 0;
            }
            return this.f27227e.c(view) < this.f27227e.c(view2) ? -1 : 1;
        }

        public final void b() {
            this.f27228f = null;
            this.f27226d.k();
            this.f27225c.m();
            this.f27227e.j();
            this.f27224b.k();
        }

        public final void c(ArrayList arrayList, View view) {
            this.f27228f = view;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f27227e.u((View) arrayList.get(i10), i10);
            }
            int size2 = arrayList.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i11 = size2 - 1;
                    View view2 = (View) arrayList.get(size2);
                    View viewA = this.f27223a.a(view, view2);
                    if (viewA != null && this.f27227e.a(viewA)) {
                        this.f27224b.x(view2, viewA);
                        this.f27225c.h(viewA);
                    }
                    if (i11 < 0) {
                        break;
                    } else {
                        size2 = i11;
                    }
                }
            }
            int size3 = arrayList.size() - 1;
            if (size3 < 0) {
                return;
            }
            while (true) {
                int i12 = size3 - 1;
                View view3 = (View) arrayList.get(size3);
                if (((View) this.f27224b.e(view3)) != null && !this.f27225c.a(view3)) {
                    d(view3);
                }
                if (i12 < 0) {
                    return;
                } else {
                    size3 = i12;
                }
            }
        }

        public final void d(View view) {
            View view2 = view;
            while (view != null) {
                View view3 = (View) this.f27226d.e(view);
                if (view3 != null) {
                    if (view3 == view2) {
                        return;
                    }
                    view = view2;
                    view2 = view3;
                }
                this.f27226d.x(view, view2);
                view = (View) this.f27224b.e(view);
            }
        }
    }

    private final View c(ViewGroup viewGroup, Rect rect, int i10) {
        ViewGroup viewGroupJ = j(viewGroup, null);
        ArrayList arrayList = this.f27222e;
        try {
            arrayList.clear();
            H0.d(viewGroupJ, arrayList, i10);
            if (arrayList.isEmpty()) {
                arrayList.clear();
                return null;
            }
            View viewE = e(viewGroupJ, null, rect, i10, arrayList);
            arrayList.clear();
            return viewE;
        } catch (Throwable th2) {
            arrayList.clear();
            throw th2;
        }
    }

    private final View e(ViewGroup viewGroup, View view, Rect rect, int i10, ArrayList arrayList) {
        Rect rect2 = this.f27218a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 17 || i10 == 33) {
                    n(viewGroup, rect2);
                } else if (i10 == 66 || i10 == 130) {
                    o(viewGroup, rect2);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                n(viewGroup, rect2);
            } else {
                o(viewGroup, rect2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            o(viewGroup, rect2);
        } else {
            n(viewGroup, rect2);
        }
        if (i10 == 1 || i10 == 2) {
            return h(arrayList, viewGroup, view, i10);
        }
        if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
            return g(viewGroup, view, rect2, arrayList, i10);
        }
        throw new IllegalArgumentException("Unknown direction: " + i10);
    }

    private final View g(ViewGroup viewGroup, View view, Rect rect, ArrayList arrayList, int i10) {
        this.f27219b.set(rect);
        if (i10 == 17) {
            this.f27219b.offset(rect.width() + 1, 0);
        } else if (i10 == 33) {
            this.f27219b.offset(0, rect.height() + 1);
        } else if (i10 == 66) {
            this.f27219b.offset((-rect.width()) - 1, 0);
        } else if (i10 == 130) {
            this.f27219b.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = (View) arrayList.get(i11);
            if (!AbstractC5504s.c(view3, view) && !AbstractC5504s.c(view3, viewGroup)) {
                view3.getFocusedRect(this.f27220c);
                viewGroup.offsetDescendantRectToMyCoords(view3, this.f27220c);
                C6226h c6226hE = s0.s1.e(this.f27220c);
                C6226h c6226hE2 = s0.s1.e(this.f27219b);
                C6226h c6226hE3 = s0.s1.e(rect);
                androidx.compose.ui.focus.d dVarD = androidx.compose.ui.focus.f.d(i10);
                if (androidx.compose.ui.focus.w.m(c6226hE, c6226hE2, c6226hE3, dVarD != null ? dVarD.o() : androidx.compose.ui.focus.d.f26651b.e())) {
                    this.f27219b.set(this.f27220c);
                    view2 = view3;
                }
            }
        }
        return view2;
    }

    private final View h(ArrayList arrayList, ViewGroup viewGroup, View view, int i10) {
        ArrayList arrayList2;
        try {
            this.f27221d.c(arrayList, viewGroup);
            Collections.sort(arrayList, this.f27221d);
            this.f27221d.b();
            int size = arrayList.size();
            View viewL = null;
            if (size < 2) {
                return null;
            }
            if (i10 == 1) {
                arrayList2 = arrayList;
                viewL = l(view, arrayList2, size);
            } else if (i10 == 2) {
                arrayList2 = arrayList;
                viewL = k(view, arrayList2, size);
            } else if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
                arrayList2 = arrayList;
                viewL = g(viewGroup, view, this.f27218a, arrayList2, i10);
            } else {
                arrayList2 = arrayList;
            }
            return viewL == null ? (View) arrayList2.get(size - 1) : viewL;
        } catch (Throwable th2) {
            this.f27221d.b();
            throw th2;
        }
    }

    private final View i(ViewGroup viewGroup, View view, int i10) {
        View viewF = H0.f(view, viewGroup, i10);
        boolean z10 = true;
        View viewF2 = viewF;
        while (viewF != null) {
            if (viewF.isFocusable() && viewF.getVisibility() == 0 && (!viewF.isInTouchMode() || viewF.isFocusableInTouchMode())) {
                return viewF;
            }
            viewF = H0.f(viewF, viewGroup, i10);
            boolean z11 = !z10;
            if (!z10) {
                viewF2 = viewF2 != null ? H0.f(viewF2, viewGroup, i10) : null;
                if (viewF2 == viewF) {
                    break;
                }
            }
            z10 = z11;
        }
        return null;
    }

    private final ViewGroup j(ViewGroup viewGroup, View view) {
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == viewGroup) {
                    if (viewGroup2 == null) {
                        break;
                    }
                    return viewGroup2;
                }
                ViewGroup viewGroup3 = (ViewGroup) parent;
                if (viewGroup3.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup2 = viewGroup3;
                }
                parent = viewGroup3.getParent();
            }
        }
        return viewGroup;
    }

    private final View k(View view, ArrayList arrayList, int i10) {
        int iLastIndexOf;
        int i11;
        if (i10 < 2) {
            return null;
        }
        return (view == null || (iLastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i11 = iLastIndexOf + 1) >= i10) ? (View) arrayList.get(0) : (View) arrayList.get(i11);
    }

    private final View l(View view, ArrayList arrayList, int i10) {
        int iIndexOf;
        if (i10 < 2) {
            return null;
        }
        return (view == null || (iIndexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(i10 - 1) : (View) arrayList.get(iIndexOf - 1);
    }

    private final boolean m(int i10) {
        return (i10 == 0 || i10 == -1) ? false : true;
    }

    private final void n(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY() + viewGroup.getHeight();
        int scrollX = viewGroup.getScrollX() + viewGroup.getWidth();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    private final void o(ViewGroup viewGroup, Rect rect) {
        int scrollY = viewGroup.getScrollY();
        int scrollX = viewGroup.getScrollX();
        rect.set(scrollX, scrollY, scrollX, scrollY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View p(G0 g02, View view, View view2) {
        if (g02.m(view2.getNextFocusForwardId())) {
            return H0.f(view2, view, 2);
        }
        return null;
    }

    public final View d(ViewGroup viewGroup, View view, int i10) {
        ViewGroup viewGroupJ = j(viewGroup, view);
        View viewI = i(viewGroupJ, view, i10);
        if (viewI != null) {
            return viewI;
        }
        ArrayList arrayList = this.f27222e;
        try {
            arrayList.clear();
            H0.d(viewGroupJ, arrayList, i10);
            if (!arrayList.isEmpty()) {
                viewI = e(viewGroupJ, view, null, i10, arrayList);
            }
            arrayList.clear();
            return viewI;
        } catch (Throwable th2) {
            arrayList.clear();
            throw th2;
        }
    }

    public final View f(ViewGroup viewGroup, Rect rect, int i10) {
        this.f27218a.set(rect);
        return c(viewGroup, this.f27218a, i10);
    }
}
