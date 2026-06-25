package com.facebook.react.views.virtual.view;

import Q7.e;
import Td.r;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.uimanager.F;
import com.facebook.react.uimanager.M;
import com.facebook.react.views.scroll.j;
import com.facebook.react.views.scroll.k;
import com.facebook.react.views.scroll.n;
import com.facebook.react.views.scroll.p;
import com.facebook.react.views.view.g;
import h7.C4914b;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends g implements n.i, n.f, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Q7.a f38496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f38497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Q7.b f38498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f38499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f38500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f38501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewTreeObserver.OnWindowFocusChangeListener f38502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f38503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f38504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f38505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f38506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Rect f38507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f38510o;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38511a;

        static {
            int[] iArr = new int[Q7.a.values().length];
            try {
                iArr[Q7.a.f14375b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q7.a.f14376c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q7.a.f14377d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38511a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        this.f38497b = e.f14385b;
        this.f38499d = C4914b.T();
        this.f38500e = C4914b.B();
        this.f38501f = C4914b.S();
        this.f38502g = C4914b.D() ? new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.facebook.react.views.virtual.view.a
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                b.I(this.f38495a, z10);
            }
        } : null;
        this.f38504i = new Rect();
        this.f38505j = new Rect();
        this.f38506k = new Rect();
        this.f38507l = new Rect();
    }

    private final void C() {
        K(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void D(boolean r19) {
        /*
            Method dump skipped, instruction units count: 937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.virtual.view.b.D(boolean):void");
    }

    private final void F(Q7.a aVar) {
        Q7.b bVar = this.f38498c;
        if (bVar != null) {
            bVar.a(aVar, this.f38505j, this.f38506k, false);
        }
    }

    private final void G(Q7.a aVar) {
        Q7.b bVar = this.f38498c;
        if (bVar != null) {
            bVar.a(aVar, this.f38505j, this.f38506k, true);
        }
    }

    private final void H(Q7.a aVar, Q7.a aVar2) {
        if (getDebugLogEnabled$ReactAndroid_release()) {
            if (c.f38512a) {
                int id2 = getId();
                String nativeId$ReactAndroid_release = getNativeId$ReactAndroid_release();
                AbstractC7283a.b("ReactVirtualView:Mode change", ((Object) (aVar + "->" + aVar2)) + " [" + id2 + "][" + nativeId$ReactAndroid_release + "]");
            } else {
                int id3 = getId();
                String nativeId$ReactAndroid_release2 = getNativeId$ReactAndroid_release();
                AbstractC7283a.I("ReactVirtualView:Mode change", ((Object) (aVar + "->" + aVar2)) + " [" + id3 + "][" + nativeId$ReactAndroid_release2 + "]");
            }
        }
        U7.a.c(0L, "VirtualView::mode change " + aVar + " -> " + aVar2 + ", nativeID=" + getNativeId$ReactAndroid_release());
        int i10 = a.f38511a[aVar2.ordinal()];
        if (i10 == 1) {
            e eVar = this.f38497b;
            if (eVar == e.f14385b || aVar != Q7.a.f14376c || eVar != e.f14386c) {
                G(Q7.a.f14375b);
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new r();
            }
            F(Q7.a.f14377d);
        } else if (aVar != Q7.a.f14375b) {
            F(Q7.a.f14376c);
        }
        U7.a.i(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(b bVar, boolean z10) {
        bVar.D(false);
    }

    private final boolean J(Rect rect, Rect rect2) {
        return rect.top < rect2.bottom && rect2.top < rect.bottom && rect.left < rect2.right && rect2.left < rect.right;
    }

    private final ViewGroup K(boolean z10) {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof k) {
                return (ViewGroup) parent;
            }
            if (parent instanceof j) {
                return (ViewGroup) parent;
            }
            if (parent instanceof M) {
                return null;
            }
            if (parent instanceof View) {
                View view = (View) parent;
                view.removeOnLayoutChangeListener(this);
                if (z10) {
                    view.addOnLayoutChangeListener(this);
                }
            }
        }
        return null;
    }

    private final void L() {
        View view = this.f38503h;
        if (view == null) {
            return;
        }
        this.f38508m = 0;
        this.f38509n = 0;
        this.f38510o = false;
        for (ViewParent parent = getParent(); parent != null && !AbstractC5504s.c(parent, view); parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = (View) parent;
                this.f38508m += view2.getLeft();
                this.f38509n += view2.getTop();
            }
        }
    }

    private final ViewGroup getParentScrollView() {
        return K(true);
    }

    public final void E() {
        ViewGroup parentScrollView = getParentScrollView();
        if (parentScrollView != null) {
            this.f38510o = true;
            n.b(this);
            n.a(this);
        } else {
            parentScrollView = null;
        }
        this.f38503h = parentScrollView;
        if (getDebugLogEnabled$ReactAndroid_release()) {
            if (c.f38512a) {
                AbstractC7283a.b("ReactVirtualView:onAttachedToWindow", ((Object) "") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            } else {
                AbstractC7283a.I("ReactVirtualView:onAttachedToWindow", ((Object) "") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            }
        }
        if (this.f38502g != null) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.f38502g);
        }
        D(false);
    }

    @Override // com.facebook.react.views.scroll.n.i
    public void b(ViewGroup viewGroup) {
        if (AbstractC5504s.c(viewGroup, this.f38503h)) {
            D(false);
        }
    }

    public final boolean getDebugLogEnabled$ReactAndroid_release() {
        return this.f38500e;
    }

    public final Q7.a getMode$ReactAndroid_release() {
        return this.f38496a;
    }

    public final Q7.b getModeChangeEmitter$ReactAndroid_release() {
        return this.f38498c;
    }

    public final String getNativeId$ReactAndroid_release() {
        Object tag = getTag(AbstractC3247l.f36906G);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public final double getPrerenderRatio$ReactAndroid_release() {
        return this.f38499d;
    }

    public final e getRenderState$ReactAndroid_release() {
        return this.f38497b;
    }

    @Override // com.facebook.react.views.scroll.n.i
    public void h(ViewGroup viewGroup, p pVar, float f10, float f11) {
        if (AbstractC5504s.c(viewGroup, this.f38503h)) {
            D(false);
        }
    }

    @Override // com.facebook.react.views.scroll.n.f
    public void k(ViewGroup scrollView) {
        AbstractC5504s.h(scrollView, "scrollView");
        if (AbstractC5504s.c(scrollView, this.f38503h)) {
            this.f38510o = true;
            D(false);
        }
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        E();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n.x(this);
        n.w(this);
        if (this.f38502g != null) {
            getViewTreeObserver().removeOnWindowFocusChangeListener(this.f38502g);
        }
        C();
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            this.f38510o = true;
            D(false);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f38510o = (!this.f38510o && i14 == i10 && i15 == i11) ? false : true;
        D(true);
    }

    @Override // com.facebook.react.views.view.g, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        D(true);
    }

    @Override // com.facebook.react.views.view.g
    public void recycleView$ReactAndroid_release() {
        n.x(this);
        n.w(this);
        C();
        this.f38496a = null;
        this.f38498c = null;
        this.f38504i.setEmpty();
        this.f38503h = null;
        this.f38508m = 0;
        this.f38509n = 0;
        this.f38510o = false;
        this.f38507l.setEmpty();
    }

    public final void setMode$ReactAndroid_release(Q7.a aVar) {
        this.f38496a = aVar;
    }

    public final void setModeChangeEmitter$ReactAndroid_release(Q7.b bVar) {
        this.f38498c = bVar;
    }

    public final void setPrerenderRatio$ReactAndroid_release(double d10) {
        this.f38499d = d10;
    }

    public final void setRenderState$ReactAndroid_release(e eVar) {
        AbstractC5504s.h(eVar, "<set-?>");
        this.f38497b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.views.view.g, com.facebook.react.uimanager.F
    public void updateClippingRect(Set set) {
        if (get_removeClippedSubviews$ReactAndroid_release()) {
            if (this.f38503h == null) {
                super.updateClippingRect(set);
                return;
            }
            Rect clippingRect$ReactAndroid_release = getClippingRect$ReactAndroid_release();
            if (clippingRect$ReactAndroid_release == null) {
                throw new IllegalStateException("Required value was null.");
            }
            KeyEvent.Callback callback = this.f38503h;
            if (callback == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC5504s.f(callback, "null cannot be cast to non-null type com.facebook.react.uimanager.ReactClippingViewGroup");
            F f10 = (F) callback;
            if (C4914b.z()) {
                if (f10.getRemoveClippedSubviews()) {
                    f10.getClippingRect(clippingRect$ReactAndroid_release);
                } else {
                    ((View) f10).getDrawingRect(clippingRect$ReactAndroid_release);
                }
            } else {
                if (!f10.getRemoveClippedSubviews()) {
                    super.updateClippingRect(set);
                    return;
                }
                f10.getClippingRect(clippingRect$ReactAndroid_release);
            }
            clippingRect$ReactAndroid_release.intersect(this.f38505j);
            Rect rect = this.f38505j;
            clippingRect$ReactAndroid_release.offset(-rect.left, -rect.top);
            if (AbstractC5504s.c(this.f38507l, clippingRect$ReactAndroid_release)) {
                return;
            }
            updateClippingToRect$ReactAndroid_release(clippingRect$ReactAndroid_release, set);
            this.f38507l.set(clippingRect$ReactAndroid_release);
        }
    }
}
