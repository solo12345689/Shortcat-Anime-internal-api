package com.facebook.react.runtime;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.C3299o;
import com.facebook.react.uimanager.C3300p;
import com.facebook.react.uimanager.C3301q;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends com.facebook.react.W {

    /* JADX INFO: renamed from: z */
    private static final a f37310z = new a(null);

    /* JADX INFO: renamed from: t */
    private final j0 f37311t;

    /* JADX INFO: renamed from: u */
    private final C3301q f37312u;

    /* JADX INFO: renamed from: v */
    private C3300p f37313v;

    /* JADX INFO: renamed from: w */
    private boolean f37314w;

    /* JADX INFO: renamed from: x */
    private int f37315x;

    /* JADX INFO: renamed from: y */
    private int f37316y;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, j0 surface) {
        super(context);
        AbstractC5504s.h(surface, "surface");
        this.f37311t = surface;
        this.f37312u = new C3301q(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f37313v = new C3300p(this);
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // com.facebook.react.W, com.facebook.react.uimanager.W
    public void a(View view, MotionEvent ev) {
        C3300p c3300p;
        AbstractC5504s.h(ev, "ev");
        EventDispatcher eventDispatcherH = this.f37311t.h();
        if (eventDispatcherH == null) {
            return;
        }
        C3301q c3301q = this.f37312u;
        ReactHostImpl reactHostImplJ = this.f37311t.j();
        c3301q.h(ev, eventDispatcherH, reactHostImplJ != null ? reactHostImplJ.getCurrentReactContext() : null);
        if (view == null || (c3300p = this.f37313v) == null) {
            return;
        }
        c3300p.p(view, ev, eventDispatcherH);
    }

    @Override // com.facebook.react.W
    protected void e(MotionEvent event, boolean z10) {
        AbstractC5504s.h(event, "event");
        if (this.f37313v == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                AbstractC7283a.I("ReactSurfaceView", "Unable to dispatch pointer events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        EventDispatcher eventDispatcherH = this.f37311t.h();
        if (eventDispatcherH == null) {
            AbstractC7283a.I("ReactSurfaceView", "Unable to dispatch pointer events to JS as the React instance has not been attached");
            return;
        }
        C3300p c3300p = this.f37313v;
        if (c3300p != null) {
            c3300p.k(event, eventDispatcherH, z10);
        }
    }

    @Override // com.facebook.react.W
    protected void f(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        EventDispatcher eventDispatcherH = this.f37311t.h();
        if (eventDispatcherH == null) {
            AbstractC7283a.I("ReactSurfaceView", "Unable to dispatch touch events to JS as the React instance has not been attached");
            return;
        }
        C3301q c3301q = this.f37312u;
        ReactHostImpl reactHostImplJ = this.f37311t.j();
        c3301q.d(event, eventDispatcherH, reactHostImplJ != null ? reactHostImplJ.getCurrentReactContext() : null);
    }

    @Override // com.facebook.react.W
    public void g(Throwable t10) {
        AbstractC5504s.h(t10, "t");
        String string = Objects.toString(t10.getMessage(), "");
        AbstractC5504s.g(string, "toString(...)");
        C3299o c3299o = new C3299o(string, this, t10);
        ReactHostImpl reactHostImplJ = this.f37311t.j();
        if (reactHostImplJ == null) {
            throw c3299o;
        }
        reactHostImplJ.handleHostException$ReactAndroid_release(c3299o);
    }

    @Override // com.facebook.react.W
    public ReactContext getCurrentReactContext() {
        ReactHostImpl reactHostImplJ;
        if (!this.f37311t.n() || (reactHostImplJ = this.f37311t.j()) == null) {
            return null;
        }
        return reactHostImplJ.getCurrentReactContext();
    }

    @Override // com.facebook.react.W, com.facebook.react.uimanager.M
    public String getJSModuleName() {
        return this.f37311t.i();
    }

    @Override // com.facebook.react.W, com.facebook.react.uimanager.M
    public int getUIManagerType() {
        return 2;
    }

    @Override // com.facebook.react.W
    public boolean h() {
        if (!this.f37311t.n()) {
            return false;
        }
        ReactHostImpl reactHostImplJ = this.f37311t.j();
        return (reactHostImplJ != null ? reactHostImplJ.getCurrentReactContext() : null) != null;
    }

    @Override // com.facebook.react.W
    public boolean i() {
        ReactHostImpl reactHostImplJ;
        return this.f37311t.n() && (reactHostImplJ = this.f37311t.j()) != null && reactHostImplJ.isInstanceInitialized$ReactAndroid_release();
    }

    @Override // com.facebook.react.W, com.facebook.react.uimanager.W
    public void j(View childView, MotionEvent ev) {
        AbstractC5504s.h(childView, "childView");
        AbstractC5504s.h(ev, "ev");
        EventDispatcher eventDispatcherH = this.f37311t.h();
        if (eventDispatcherH == null) {
            return;
        }
        this.f37312u.f(ev, eventDispatcherH);
        C3300p c3300p = this.f37313v;
        if (c3300p != null) {
            c3300p.o();
        }
    }

    @Override // com.facebook.react.W
    public boolean o() {
        return this.f37311t.n();
    }

    @Override // com.facebook.react.W, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f37314w && z10) {
            Point viewportOffset = getViewportOffset();
            this.f37311t.p(this.f37315x, this.f37316y, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // com.facebook.react.W, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int size;
        int size2;
        U7.a.c(0L, "ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
            }
            size = iMax;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int iMax2 = 0;
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = getChildAt(i13);
                iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
            }
            size2 = iMax2;
        } else {
            size2 = View.MeasureSpec.getSize(i11);
        }
        setMeasuredDimension(size, size2);
        this.f37314w = true;
        this.f37315x = i10;
        this.f37316y = i11;
        Point viewportOffset = getViewportOffset();
        this.f37311t.p(i10, i11, viewportOffset.x, viewportOffset.y);
        U7.a.i(0L);
    }

    @Override // com.facebook.react.W, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    @Override // com.facebook.react.W
    public void setIsFabric(boolean z10) {
        super.setIsFabric(true);
    }
}
