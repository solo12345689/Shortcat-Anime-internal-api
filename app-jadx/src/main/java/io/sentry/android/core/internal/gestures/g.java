package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.C5191e;
import io.sentry.E1;
import io.sentry.EnumC5215i3;
import io.sentry.G1;
import io.sentry.H;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5217j0;
import io.sentry.Y;
import io.sentry.a4;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.i4;
import io.sentry.internal.gestures.b;
import io.sentry.k4;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f49773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5114a0 f49774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f49775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.internal.gestures.b f49776d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC5217j0 f49777e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f49778f = b.Unknown;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f49779g = new c(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49780a;

        static {
            int[] iArr = new int[b.values().length];
            f49780a = iArr;
            try {
                iArr[b.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49780a[b.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49780a[b.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49780a[b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum b {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    public g(Activity activity, InterfaceC5114a0 interfaceC5114a0, SentryAndroidOptions sentryAndroidOptions) {
        this.f49773a = new WeakReference(activity);
        this.f49774b = interfaceC5114a0;
        this.f49775c = sentryAndroidOptions;
    }

    public static /* synthetic */ void b(g gVar, Y y10, InterfaceC5217j0 interfaceC5217j0, InterfaceC5217j0 interfaceC5217j02) {
        if (interfaceC5217j02 != null) {
            gVar.f49775c.getLogger().c(EnumC5215i3.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC5217j0.getName());
        } else {
            gVar.getClass();
            y10.x(interfaceC5217j0);
        }
    }

    public static /* synthetic */ void d(g gVar, Y y10, InterfaceC5217j0 interfaceC5217j0) {
        if (interfaceC5217j0 == gVar.f49777e) {
            y10.B();
        }
    }

    private void e(io.sentry.internal.gestures.b bVar, b bVar2, Map map, MotionEvent motionEvent) {
        if (this.f49775c.isEnableUserInteractionBreadcrumbs()) {
            String strJ = j(bVar2);
            H h10 = new H();
            h10.k("android:motionEvent", motionEvent);
            h10.k("android:view", bVar.f());
            this.f49774b.e(C5191e.J(strJ, bVar.d(), bVar.a(), bVar.e(), map), h10);
        }
    }

    private View h(String str) {
        Activity activity = (Activity) this.f49773a.get();
        if (activity == null) {
            this.f49775c.getLogger().c(EnumC5215i3.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.f49775c.getLogger().c(EnumC5215i3.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.f49775c.getLogger().c(EnumC5215i3.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    private String i(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private static String j(b bVar) {
        int i10 = a.f49780a[bVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "unknown" : "swipe" : "scroll" : "click";
    }

    private void l(io.sentry.internal.gestures.b bVar, b bVar2) {
        boolean z10 = bVar2 == b.Click || !(bVar2 == this.f49778f && bVar.equals(this.f49776d));
        if (!this.f49775c.isTracingEnabled() || !this.f49775c.isEnableUserInteractionTracing()) {
            if (z10) {
                if (this.f49775c.isEnableAutoTraceIdGeneration()) {
                    io.sentry.util.H.h(this.f49774b);
                }
                this.f49776d = bVar;
                this.f49778f = bVar2;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f49773a.get();
        if (activity == null) {
            this.f49775c.getLogger().c(EnumC5215i3.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String strB = bVar.b();
        InterfaceC5217j0 interfaceC5217j0 = this.f49777e;
        if (interfaceC5217j0 != null) {
            if (!z10 && !interfaceC5217j0.isFinished()) {
                this.f49775c.getLogger().c(EnumC5215i3.DEBUG, "The view with id: " + strB + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.f49775c.getIdleTimeout() != null) {
                    this.f49777e.p();
                    return;
                }
                return;
            }
            m(a4.OK);
        }
        String str = i(activity) + "." + strB;
        String str2 = "ui.action." + j(bVar2);
        k4 k4Var = new k4();
        k4Var.v(true);
        long deadlineTimeout = this.f49775c.getDeadlineTimeout();
        k4Var.s(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        k4Var.t(this.f49775c.getIdleTimeout());
        k4Var.i(true);
        k4Var.g("auto.ui.gesture_listener." + bVar.c());
        final InterfaceC5217j0 interfaceC5217j0Z = this.f49774b.z(new i4(str, io.sentry.protocol.H.COMPONENT, str2), k4Var);
        this.f49774b.r(new G1() { // from class: io.sentry.android.core.internal.gestures.d
            @Override // io.sentry.G1
            public final void a(Y y10) {
                this.f49766a.f(y10, interfaceC5217j0Z);
            }
        });
        this.f49777e = interfaceC5217j0Z;
        this.f49776d = bVar;
        this.f49778f = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(final Y y10, final InterfaceC5217j0 interfaceC5217j0) {
        y10.O(new E1.c() { // from class: io.sentry.android.core.internal.gestures.e
            @Override // io.sentry.E1.c
            public final void a(InterfaceC5217j0 interfaceC5217j02) {
                g.b(this.f49768a, y10, interfaceC5217j0, interfaceC5217j02);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(final Y y10) {
        y10.O(new E1.c() { // from class: io.sentry.android.core.internal.gestures.f
            @Override // io.sentry.E1.c
            public final void a(InterfaceC5217j0 interfaceC5217j0) {
                g.d(this.f49771a, y10, interfaceC5217j0);
            }
        });
    }

    public void k(MotionEvent motionEvent) {
        View viewH = h("onUp");
        io.sentry.internal.gestures.b bVar = this.f49779g.f49782b;
        if (viewH == null || bVar == null) {
            return;
        }
        if (this.f49779g.f49781a == b.Unknown) {
            this.f49775c.getLogger().c(EnumC5215i3.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        e(bVar, this.f49779g.f49781a, Collections.singletonMap("direction", this.f49779g.i(motionEvent)), motionEvent);
        l(bVar, this.f49779g.f49781a);
        this.f49779g.j();
    }

    void m(a4 a4Var) {
        InterfaceC5217j0 interfaceC5217j0 = this.f49777e;
        if (interfaceC5217j0 != null) {
            if (interfaceC5217j0.b() == null) {
                this.f49777e.j(a4Var);
            } else {
                this.f49777e.d();
            }
        }
        this.f49774b.r(new G1() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // io.sentry.G1
            public final void a(Y y10) {
                this.f49765a.g(y10);
            }
        });
        this.f49777e = null;
        if (this.f49776d != null) {
            this.f49776d = null;
        }
        this.f49778f = b.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f49779g.j();
        this.f49779g.f49783c = motionEvent.getX();
        this.f49779g.f49784d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f49779g.f49781a = b.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        View viewH = h("onScroll");
        if (viewH != null && motionEvent != null && this.f49779g.f49781a == b.Unknown) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f49775c, viewH, motionEvent.getX(), motionEvent.getY(), b.a.SCROLLABLE);
            if (bVarA == null) {
                this.f49775c.getLogger().c(EnumC5215i3.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                this.f49779g.f49781a = b.Scroll;
                return false;
            }
            this.f49775c.getLogger().c(EnumC5215i3.DEBUG, "Scroll target found: " + bVarA.b(), new Object[0]);
            this.f49779g.k(bVarA);
            this.f49779g.f49781a = b.Scroll;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewH = h("onSingleTapUp");
        if (viewH != null && motionEvent != null) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f49775c, viewH, motionEvent.getX(), motionEvent.getY(), b.a.CLICKABLE);
            if (bVarA == null) {
                this.f49775c.getLogger().c(EnumC5215i3.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            b bVar = b.Click;
            e(bVarA, bVar, Collections.EMPTY_MAP, motionEvent);
            l(bVarA, bVar);
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f49781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.sentry.internal.gestures.b f49782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f49783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f49784d;

        private c() {
            this.f49781a = b.Unknown;
            this.f49783c = 0.0f;
            this.f49784d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String i(MotionEvent motionEvent) {
            float x10 = motionEvent.getX() - this.f49783c;
            float y10 = motionEvent.getY() - this.f49784d;
            return Math.abs(x10) > Math.abs(y10) ? x10 > 0.0f ? "right" : "left" : y10 > 0.0f ? "down" : "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.f49782b = null;
            this.f49781a = b.Unknown;
            this.f49783c = 0.0f;
            this.f49784d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(io.sentry.internal.gestures.b bVar) {
            this.f49782b = bVar;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }
}
