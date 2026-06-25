package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import h7.C4914b;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f38163i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f38164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f38165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f38166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f38167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f38168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f38169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewTreeObserver.OnWindowFocusChangeListener f38170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f38171h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a(ViewGroup scrollView) {
            AbstractC5504s.h(scrollView, "scrollView");
            return C4914b.A() ? new x(scrollView) : new w(scrollView);
        }

        private a() {
        }
    }

    public v(ViewGroup scrollView) {
        AbstractC5504s.h(scrollView, "scrollView");
        this.f38164a = C4914b.T();
        this.f38165b = C4914b.S();
        this.f38166c = new Rect();
        this.f38167d = new Rect();
        this.f38168e = new Rect();
        this.f38169f = new Rect();
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = C4914b.D() ? new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.facebook.react.views.scroll.u
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                v.n(this.f38162a, z10);
            }
        } : null;
        this.f38170g = onWindowFocusChangeListener;
        this.f38171h = scrollView;
        if (onWindowFocusChangeListener != null) {
            scrollView.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
        }
    }

    public static final v c(ViewGroup viewGroup) {
        return f38163i.a(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(v vVar, boolean z10) {
        if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerState:onWindowFocusChanged", "");
        }
        q(vVar, null, 1, null);
    }

    public static /* synthetic */ void q(v vVar, r rVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateModes");
        }
        if ((i10 & 1) != 0) {
            rVar = null;
        }
        vVar.p(rVar);
    }

    public final void b() {
        if (this.f38170g != null) {
            this.f38171h.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f38170g);
        }
    }

    protected final Rect d() {
        return this.f38166c;
    }

    protected final double e() {
        return this.f38165b;
    }

    protected final Rect f() {
        return this.f38169f;
    }

    protected final ViewTreeObserver.OnWindowFocusChangeListener g() {
        return this.f38170g;
    }

    protected final double h() {
        return this.f38164a;
    }

    protected final Rect i() {
        return this.f38168e;
    }

    protected final ViewGroup j() {
        return this.f38171h;
    }

    protected abstract Collection k();

    protected final Rect l() {
        return this.f38167d;
    }

    public void m(r virtualView) {
        AbstractC5504s.h(virtualView, "virtualView");
        if (k().add(virtualView)) {
            if (t.a() && C4914b.B()) {
                AbstractC7283a.b("VirtualViewContainerState:add", "virtualViewID=" + virtualView.getVirtualViewID());
            }
        } else if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerState:update", "virtualViewID=" + virtualView.getVirtualViewID());
        }
        p(virtualView);
    }

    public void o(r virtualView) {
        AbstractC5504s.h(virtualView, "virtualView");
        k().remove(virtualView);
        if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerState:remove", "virtualViewID=" + virtualView.getVirtualViewID());
        }
    }

    protected abstract void p(r rVar);

    protected final void r() {
        this.f38171h.getDrawingRect(this.f38167d);
        if (this.f38167d.isEmpty()) {
            if (t.a() && C4914b.B()) {
                AbstractC7283a.b("VirtualViewContainerState:updateRects", "scrollView visibleRect is empty");
            }
            this.f38168e.set(this.f38167d);
            this.f38169f.set(this.f38168e);
            return;
        }
        this.f38168e.set(this.f38167d);
        Rect rect = this.f38168e;
        rect.inset((int) (((double) (-rect.width())) * this.f38164a), (int) (((double) (-this.f38168e.height())) * this.f38164a));
        this.f38169f.set(this.f38168e);
        this.f38169f.inset((int) (((double) (-this.f38167d.width())) * this.f38165b), (int) (((double) (-this.f38167d.height())) * this.f38165b));
        if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerState:updateRects", "visibleRect " + this.f38167d + " prerenderRect " + this.f38168e + " hysteresisRect " + this.f38169f);
        }
    }

    public final void s() {
        if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerState:updateState", "");
        }
        q(this, null, 1, null);
    }
}
