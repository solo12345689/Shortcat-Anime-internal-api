package Qa;

import Qa.AbstractC2081d;
import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.textinput.C3320j;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends AbstractC2081d {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final b f14669R = new b(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final a f14670S = new a();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f14671O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f14672P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private e f14673Q = f14670S;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements e {
        a() {
        }

        @Override // Qa.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // Qa.q.e
        public Boolean b(AbstractC2081d abstractC2081d) {
            return e.a.g(this, abstractC2081d);
        }

        @Override // Qa.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Qa.q.e
        public boolean d() {
            return e.a.h(this);
        }

        @Override // Qa.q.e
        public boolean e(View view) {
            return e.a.b(this, view);
        }

        @Override // Qa.q.e
        public Boolean f(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // Qa.q.e
        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // Qa.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f14674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C3320j f14675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f14676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f14677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14678e;

        public c(q handler, C3320j editText) {
            AbstractC5504s.h(handler, "handler");
            AbstractC5504s.h(editText, "editText");
            this.f14674a = handler;
            this.f14675b = editText;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(editText.getContext());
            this.f14678e = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // Qa.q.e
        public boolean a() {
            return true;
        }

        @Override // Qa.q.e
        public Boolean b(AbstractC2081d handler) {
            AbstractC5504s.h(handler, "handler");
            return Boolean.valueOf(handler.T() > 0 && !(handler instanceof q));
        }

        @Override // Qa.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Qa.q.e
        public boolean d() {
            return true;
        }

        @Override // Qa.q.e
        public boolean e(View view) {
            return e.a.b(this, view);
        }

        @Override // Qa.q.e
        public Boolean f(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // Qa.q.e
        public void g(MotionEvent event) {
            AbstractC5504s.h(event, "event");
            this.f14674a.k();
            this.f14675b.onTouchEvent(event);
            this.f14676c = event.getX();
            this.f14677d = event.getY();
        }

        @Override // Qa.q.e
        public void h(MotionEvent event) {
            AbstractC5504s.h(event, "event");
            if (((event.getX() - this.f14676c) * (event.getX() - this.f14676c)) + ((event.getY() - this.f14677d) * (event.getY() - this.f14677d)) < this.f14678e) {
                this.f14675b.N();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AbstractC2081d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f14679d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f14680b = q.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f14681c = "NativeViewGestureHandler";

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // Qa.AbstractC2081d.c
        public String d() {
            return this.f14681c;
        }

        @Override // Qa.AbstractC2081d.c
        public Class e() {
            return this.f14680b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public q a(Context context) {
            return new q();
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ra.f c(q handler) {
            AbstractC5504s.h(handler, "handler");
            return new Ra.f(handler);
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(q handler, ReadableMap config) {
            AbstractC5504s.h(handler, "handler");
            AbstractC5504s.h(config, "config");
            super.f(handler, config);
            if (config.hasKey("shouldActivateOnStart")) {
                handler.f14671O = config.getBoolean("shouldActivateOnStart");
            }
            if (config.hasKey("disallowInterruption")) {
                handler.f14672P = config.getBoolean("disallowInterruption");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public static void a(e eVar, MotionEvent event) {
                AbstractC5504s.h(event, "event");
            }

            public static boolean b(e eVar, View view) {
                AbstractC5504s.h(view, "view");
                return view.isPressed();
            }

            public static boolean c(e eVar, MotionEvent event) {
                AbstractC5504s.h(event, "event");
                return true;
            }

            public static void d(e eVar, MotionEvent event) {
                AbstractC5504s.h(event, "event");
            }

            public static Boolean e(e eVar, View view, MotionEvent event) {
                AbstractC5504s.h(event, "event");
                if (view != null) {
                    return Boolean.valueOf(view.onTouchEvent(event));
                }
                return null;
            }

            public static boolean f(e eVar) {
                return false;
            }

            public static Boolean g(e eVar, AbstractC2081d handler) {
                AbstractC5504s.h(handler, "handler");
                return null;
            }

            public static boolean h(e eVar) {
                return false;
            }
        }

        boolean a();

        Boolean b(AbstractC2081d abstractC2081d);

        boolean c(MotionEvent motionEvent);

        boolean d();

        boolean e(View view);

        Boolean f(View view, MotionEvent motionEvent);

        void g(MotionEvent motionEvent);

        void h(MotionEvent motionEvent);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f implements e {
        @Override // Qa.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // Qa.q.e
        public Boolean b(AbstractC2081d abstractC2081d) {
            return e.a.g(this, abstractC2081d);
        }

        @Override // Qa.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Qa.q.e
        public boolean d() {
            return e.a.h(this);
        }

        @Override // Qa.q.e
        public boolean e(View view) {
            return e.a.b(this, view);
        }

        @Override // Qa.q.e
        public Boolean f(View view, MotionEvent event) {
            AbstractC5504s.h(event, "event");
            if (view != null) {
                return Boolean.valueOf(view.dispatchTouchEvent(event));
            }
            return null;
        }

        @Override // Qa.q.e
        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // Qa.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class g implements e {
        @Override // Qa.q.e
        public boolean a() {
            return true;
        }

        @Override // Qa.q.e
        public Boolean b(AbstractC2081d abstractC2081d) {
            return e.a.g(this, abstractC2081d);
        }

        @Override // Qa.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Qa.q.e
        public boolean d() {
            return e.a.h(this);
        }

        @Override // Qa.q.e
        public boolean e(View view) {
            return e.a.b(this, view);
        }

        @Override // Qa.q.e
        public Boolean f(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // Qa.q.e
        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // Qa.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f14682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.facebook.react.views.swiperefresh.a f14683b;

        public h(q handler, com.facebook.react.views.swiperefresh.a swipeRefreshLayout) {
            AbstractC5504s.h(handler, "handler");
            AbstractC5504s.h(swipeRefreshLayout, "swipeRefreshLayout");
            this.f14682a = handler;
            this.f14683b = swipeRefreshLayout;
        }

        @Override // Qa.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // Qa.q.e
        public Boolean b(AbstractC2081d abstractC2081d) {
            return e.a.g(this, abstractC2081d);
        }

        @Override // Qa.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Qa.q.e
        public boolean d() {
            return true;
        }

        @Override // Qa.q.e
        public boolean e(View view) {
            return e.a.b(this, view);
        }

        @Override // Qa.q.e
        public Boolean f(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // Qa.q.e
        public void g(MotionEvent event) {
            ArrayList<AbstractC2081d> arrayListS;
            AbstractC5504s.h(event, "event");
            View childAt = this.f14683b.getChildAt(0);
            abstractC2081d = null;
            ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
            if (scrollView == null) {
                return;
            }
            Qa.i iVarP = this.f14682a.P();
            if (iVarP != null && (arrayListS = iVarP.s(scrollView)) != null) {
                for (AbstractC2081d abstractC2081d : arrayListS) {
                    if (abstractC2081d instanceof q) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (abstractC2081d == null || abstractC2081d.S() != 4 || scrollView.getScrollY() <= 0) {
                return;
            }
            this.f14682a.D();
        }

        @Override // Qa.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class i implements e {
        @Override // Qa.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // Qa.q.e
        public Boolean b(AbstractC2081d handler) {
            AbstractC5504s.h(handler, "handler");
            return Boolean.FALSE;
        }

        @Override // Qa.q.e
        public boolean c(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Qa.q.e
        public boolean d() {
            return e.a.h(this);
        }

        @Override // Qa.q.e
        public boolean e(View view) {
            AbstractC5504s.h(view, "view");
            return view instanceof com.facebook.react.views.text.m;
        }

        @Override // Qa.q.e
        public Boolean f(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // Qa.q.e
        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // Qa.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    public q() {
        G0(true);
    }

    private final void W0() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        e eVar = this.f14673Q;
        View viewW = W();
        AbstractC5504s.e(motionEventObtain);
        eVar.f(viewW, motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // Qa.AbstractC2081d
    public boolean K0(AbstractC2081d handler) {
        AbstractC5504s.h(handler, "handler");
        return !this.f14672P;
    }

    @Override // Qa.AbstractC2081d
    public boolean L0(AbstractC2081d handler) {
        AbstractC5504s.h(handler, "handler");
        Boolean boolB = this.f14673Q.b(handler);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        if (super.L0(handler)) {
            return true;
        }
        if ((handler instanceof q) && handler.S() == 4 && ((q) handler).f14672P) {
            return false;
        }
        boolean z10 = this.f14672P;
        return !(S() == 4 && handler.S() == 4 && !z10) && S() == 4 && !z10 && (!this.f14673Q.a() || handler.T() > 0);
    }

    public final boolean X0() {
        return this.f14672P;
    }

    @Override // Qa.AbstractC2081d
    protected void j0() {
        W0();
    }

    @Override // Qa.AbstractC2081d
    protected void k0() {
        W0();
    }

    @Override // Qa.AbstractC2081d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(sourceEvent, "sourceEvent");
        View viewW = W();
        AbstractC5504s.e(viewW);
        Context context = viewW.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        boolean zD = com.swmansion.gesturehandler.react.a.d(context);
        if ((viewW instanceof RNGestureHandlerButtonViewManager.a) && zD) {
            return;
        }
        if (event.getActionMasked() == 1) {
            if (S() != 0 || this.f14673Q.c(event)) {
                this.f14673Q.f(viewW, event);
                if ((S() == 0 || S() == 2) && this.f14673Q.e(viewW)) {
                    k();
                }
                if (S() == 0) {
                    q();
                } else {
                    B();
                }
            } else {
                q();
            }
            this.f14673Q.h(event);
            return;
        }
        if (S() != 0 && S() != 2) {
            if (S() == 4) {
                this.f14673Q.f(viewW, event);
                return;
            }
            return;
        }
        if (this.f14671O) {
            f14669R.b(viewW, event);
            this.f14673Q.f(viewW, event);
            k();
        } else if (f14669R.b(viewW, event)) {
            this.f14673Q.f(viewW, event);
            k();
        } else if (this.f14673Q.d()) {
            this.f14673Q.g(event);
        } else {
            if (S() == 2 || !this.f14673Q.c(event)) {
                return;
            }
            p();
        }
    }

    @Override // Qa.AbstractC2081d
    protected void n0() {
        KeyEvent.Callback callbackW = W();
        if (callbackW instanceof e) {
            this.f14673Q = (e) callbackW;
            return;
        }
        if (callbackW instanceof C3320j) {
            this.f14673Q = new c(this, (C3320j) callbackW);
            return;
        }
        if (callbackW instanceof com.facebook.react.views.swiperefresh.a) {
            this.f14673Q = new h(this, (com.facebook.react.views.swiperefresh.a) callbackW);
            return;
        }
        if (callbackW instanceof com.facebook.react.views.scroll.k) {
            this.f14673Q = new g();
            return;
        }
        if (callbackW instanceof com.facebook.react.views.scroll.j) {
            this.f14673Q = new g();
        } else if (callbackW instanceof com.facebook.react.views.text.m) {
            this.f14673Q = new i();
        } else if (callbackW instanceof com.facebook.react.views.view.g) {
            this.f14673Q = new f();
        }
    }

    @Override // Qa.AbstractC2081d
    protected void o0() {
        this.f14673Q = f14670S;
    }

    @Override // Qa.AbstractC2081d
    public void s0() {
        super.s0();
        this.f14671O = false;
        this.f14672P = false;
        G0(true);
    }
}
