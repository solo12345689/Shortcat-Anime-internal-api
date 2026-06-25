package Qa;

import Qa.AbstractC2081d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class B extends AbstractC2081d {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final a f14524f0 = new a(null);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f14533W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f14534X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private float f14535Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f14536Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f14537a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f14538b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Handler f14539c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f14540d0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f14525O = Float.MIN_VALUE;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f14526P = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f14527Q = Float.MIN_VALUE;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f14528R = 500;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f14529S = 200;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f14530T = 1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f14531U = 1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f14532V = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Runnable f14541e0 = new Runnable() { // from class: Qa.A
        @Override // java.lang.Runnable
        public final void run() {
            B.d1(this.f14523a);
        }
    };

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

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f14542d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f14543b = B.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f14544c = "TapGestureHandler";

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
            return this.f14544c;
        }

        @Override // Qa.AbstractC2081d.c
        public Class e() {
            return this.f14543b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public B a(Context context) {
            return new B();
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ra.j c(B handler) {
            AbstractC5504s.h(handler, "handler");
            return new Ra.j(handler);
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(B handler, ReadableMap config) {
            AbstractC5504s.h(handler, "handler");
            AbstractC5504s.h(config, "config");
            super.f(handler, config);
            if (config.hasKey("numberOfTaps")) {
                handler.f14530T = config.getInt("numberOfTaps");
            }
            if (config.hasKey("maxDurationMs")) {
                handler.f14528R = config.getInt("maxDurationMs");
            }
            if (config.hasKey("maxDelayMs")) {
                handler.f14529S = config.getInt("maxDelayMs");
            }
            if (config.hasKey("maxDeltaX")) {
                handler.f14525O = com.facebook.react.uimanager.B.h(config.getDouble("maxDeltaX"));
            }
            if (config.hasKey("maxDeltaY")) {
                handler.f14526P = com.facebook.react.uimanager.B.h(config.getDouble("maxDeltaY"));
            }
            if (config.hasKey("maxDist")) {
                handler.f14527Q = com.facebook.react.uimanager.B.h(config.getDouble("maxDist"));
            }
            if (config.hasKey("minPointers")) {
                handler.f14531U = config.getInt("minPointers");
            }
        }
    }

    public B() {
        G0(true);
    }

    private final void c1() {
        Handler handler = this.f14539c0;
        if (handler == null) {
            this.f14539c0 = new Handler(Looper.getMainLooper());
        } else {
            AbstractC5504s.e(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i10 = this.f14540d0 + 1;
        this.f14540d0 = i10;
        if (i10 == this.f14530T && this.f14532V >= this.f14531U) {
            k();
            return;
        }
        Handler handler2 = this.f14539c0;
        AbstractC5504s.e(handler2);
        handler2.postDelayed(this.f14541e0, this.f14529S);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(B b10) {
        b10.D();
    }

    private final boolean e1() {
        float f10 = (this.f14537a0 - this.f14533W) + this.f14535Y;
        if (this.f14525O != Float.MIN_VALUE && Math.abs(f10) > this.f14525O) {
            return true;
        }
        float f11 = (this.f14538b0 - this.f14534X) + this.f14536Z;
        if (this.f14526P != Float.MIN_VALUE && Math.abs(f11) > this.f14526P) {
            return true;
        }
        float f12 = (f11 * f11) + (f10 * f10);
        float f13 = this.f14527Q;
        return f13 != Float.MIN_VALUE && f12 > f13 * f13;
    }

    private final void f1() {
        Handler handler = this.f14539c0;
        if (handler == null) {
            this.f14539c0 = new Handler(Looper.getMainLooper());
        } else {
            AbstractC5504s.e(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f14539c0;
        AbstractC5504s.e(handler2);
        handler2.postDelayed(this.f14541e0, this.f14528R);
    }

    @Override // Qa.AbstractC2081d
    protected void j0() {
        Handler handler = this.f14539c0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Qa.AbstractC2081d
    public void l(boolean z10) {
        super.l(z10);
        B();
    }

    @Override // Qa.AbstractC2081d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            int iS = S();
            int actionMasked = sourceEvent.getActionMasked();
            if (iS == 0) {
                this.f14535Y = 0.0f;
                this.f14536Z = 0.0f;
                k kVar = k.f14643a;
                this.f14533W = kVar.b(sourceEvent, true);
                this.f14534X = kVar.c(sourceEvent, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.f14535Y += this.f14537a0 - this.f14533W;
                this.f14536Z += this.f14538b0 - this.f14534X;
                k kVar2 = k.f14643a;
                this.f14537a0 = kVar2.b(sourceEvent, true);
                float fC = kVar2.c(sourceEvent, true);
                this.f14538b0 = fC;
                this.f14533W = this.f14537a0;
                this.f14534X = fC;
            } else {
                k kVar3 = k.f14643a;
                this.f14537a0 = kVar3.b(sourceEvent, true);
                this.f14538b0 = kVar3.c(sourceEvent, true);
            }
            if (this.f14532V < sourceEvent.getPointerCount()) {
                this.f14532V = sourceEvent.getPointerCount();
            }
            if (e1()) {
                D();
                return;
            }
            if (iS == 0) {
                if (actionMasked == 0 || actionMasked == 11) {
                    p();
                }
                f1();
                return;
            }
            if (iS == 2) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 11) {
                            if (actionMasked != 12) {
                                return;
                            }
                        }
                    }
                    c1();
                    return;
                }
                f1();
            }
        }
    }

    @Override // Qa.AbstractC2081d
    protected void o0() {
        this.f14540d0 = 0;
        this.f14532V = 0;
        Handler handler = this.f14539c0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Qa.AbstractC2081d
    public void s0() {
        super.s0();
        this.f14525O = Float.MIN_VALUE;
        this.f14526P = Float.MIN_VALUE;
        this.f14527Q = Float.MIN_VALUE;
        this.f14528R = 500L;
        this.f14529S = 200L;
        this.f14530T = 1;
        this.f14531U = 1;
        G0(true);
    }
}
