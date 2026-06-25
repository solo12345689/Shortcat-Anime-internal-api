package Qa;

import Qa.AbstractC2081d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.swmansion.gesturehandler.react.k;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractC2081d {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final a f14645R = new a(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final com.swmansion.gesturehandler.react.o f14646S = new com.swmansion.gesturehandler.react.o();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Handler f14647O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Runnable f14648P = new Runnable() { // from class: Qa.l
        @Override // java.lang.Runnable
        public final void run() {
            m.W0(this.f14644a);
        }
    };

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private z f14649Q = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC2081d.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f14650b = m.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f14651c = "HoverGestureHandler";

        @Override // Qa.AbstractC2081d.c
        public String d() {
            return this.f14651c;
        }

        @Override // Qa.AbstractC2081d.c
        public Class e() {
            return this.f14650b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public m a(Context context) {
            return new m();
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ra.c c(m handler) {
            AbstractC5504s.h(handler, "handler");
            return new Ra.c(handler);
        }
    }

    private final void V0() {
        int iS = S();
        if (iS == 0) {
            q();
        } else if (iS == 2) {
            D();
        } else {
            if (iS != 4) {
                return;
            }
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W0(m mVar) {
        mVar.V0();
    }

    private final boolean Y0(AbstractC2081d abstractC2081d) {
        View viewW = abstractC2081d.W();
        while (viewW != null) {
            if (AbstractC5504s.c(viewW, W())) {
                return true;
            }
            Object parent = viewW.getParent();
            viewW = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    private final Boolean Z0(View view, View view2, View view3) {
        if (AbstractC5504s.c(view3, view2)) {
            return Boolean.TRUE;
        }
        if (AbstractC5504s.c(view3, view)) {
            return Boolean.FALSE;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Boolean boolZ0 = Z0(view, view2, f14646S.c(viewGroup, i10));
            if (boolZ0 != null) {
                return boolZ0;
            }
        }
        return null;
    }

    static /* synthetic */ Boolean a1(m mVar, View view, View view2, View view3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            view3 = view.getRootView();
        }
        return mVar.Z0(view, view2, view3);
    }

    @Override // Qa.AbstractC2081d
    public boolean K0(AbstractC2081d handler) {
        AbstractC5504s.h(handler, "handler");
        if (!(handler instanceof m) || ((m) handler).Y0(this)) {
            return super.K0(handler);
        }
        View viewW = handler.W();
        AbstractC5504s.e(viewW);
        View viewW2 = W();
        AbstractC5504s.e(viewW2);
        Boolean boolA1 = a1(this, viewW, viewW2, null, 4, null);
        AbstractC5504s.e(boolA1);
        return boolA1.booleanValue();
    }

    @Override // Qa.AbstractC2081d
    public boolean L0(AbstractC2081d handler) {
        AbstractC5504s.h(handler, "handler");
        if (((handler instanceof m) && (Y0(handler) || ((m) handler).Y0(this))) || (handler instanceof k.b)) {
            return true;
        }
        return super.L0(handler);
    }

    @Override // Qa.AbstractC2081d
    public boolean M0(AbstractC2081d handler) {
        AbstractC5504s.h(handler, "handler");
        if ((handler instanceof m) && !Y0(handler) && !((m) handler).Y0(this)) {
            View viewW = W();
            AbstractC5504s.e(viewW);
            View viewW2 = handler.W();
            AbstractC5504s.e(viewW2);
            Boolean boolA1 = a1(this, viewW, viewW2, null, 4, null);
            if (boolA1 != null) {
                return boolA1.booleanValue();
            }
        }
        return super.M0(handler);
    }

    public final z X0() {
        return this.f14649Q;
    }

    @Override // Qa.AbstractC2081d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(sourceEvent, "sourceEvent");
        if (event.getAction() == 0) {
            Handler handler = this.f14647O;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f14647O = null;
            return;
        }
        if (event.getAction() != 1 || f0()) {
            return;
        }
        V0();
    }

    @Override // Qa.AbstractC2081d
    protected void m0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(sourceEvent, "sourceEvent");
        if (event.getAction() == 10) {
            if (this.f14647O == null) {
                this.f14647O = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.f14647O;
            AbstractC5504s.e(handler);
            handler.postDelayed(this.f14648P, 4L);
            return;
        }
        if (!f0()) {
            V0();
            return;
        }
        if (S() == 4 && event.getToolType(0) == 2) {
            this.f14649Q = z.f14780f.a(event);
            return;
        }
        if (S() == 0) {
            if (event.getAction() == 7 || event.getAction() == 9) {
                p();
                k();
            }
        }
    }

    @Override // Qa.AbstractC2081d
    protected void o0() {
        super.o0();
        this.f14649Q = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }
}
