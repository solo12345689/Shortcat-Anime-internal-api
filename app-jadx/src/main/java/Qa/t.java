package Qa;

import Qa.AbstractC2081d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends AbstractC2081d {

    /* JADX INFO: renamed from: r0 */
    public static final a f14685r0 = new a(null);

    /* JADX INFO: renamed from: O */
    private float f14686O;

    /* JADX INFO: renamed from: P */
    private float f14687P;

    /* JADX INFO: renamed from: Q */
    private final float f14688Q;

    /* JADX INFO: renamed from: R */
    private float f14689R;

    /* JADX INFO: renamed from: f0 */
    private float f14703f0;

    /* JADX INFO: renamed from: g0 */
    private float f14704g0;

    /* JADX INFO: renamed from: h0 */
    private float f14705h0;

    /* JADX INFO: renamed from: i0 */
    private float f14706i0;

    /* JADX INFO: renamed from: j0 */
    private float f14707j0;

    /* JADX INFO: renamed from: k0 */
    private float f14708k0;

    /* JADX INFO: renamed from: l0 */
    private VelocityTracker f14709l0;

    /* JADX INFO: renamed from: m0 */
    private boolean f14710m0;

    /* JADX INFO: renamed from: n0 */
    private long f14711n0;

    /* JADX INFO: renamed from: p0 */
    private Handler f14713p0;

    /* JADX INFO: renamed from: S */
    private float f14690S = Float.MAX_VALUE;

    /* JADX INFO: renamed from: T */
    private float f14691T = Float.MIN_VALUE;

    /* JADX INFO: renamed from: U */
    private float f14692U = Float.MIN_VALUE;

    /* JADX INFO: renamed from: V */
    private float f14693V = Float.MAX_VALUE;

    /* JADX INFO: renamed from: W */
    private float f14694W = Float.MAX_VALUE;

    /* JADX INFO: renamed from: X */
    private float f14695X = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Y */
    private float f14696Y = Float.MIN_VALUE;

    /* JADX INFO: renamed from: Z */
    private float f14697Z = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a0 */
    private float f14698a0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: b0 */
    private float f14699b0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: c0 */
    private float f14700c0 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: d0 */
    private int f14701d0 = 1;

    /* JADX INFO: renamed from: e0 */
    private int f14702e0 = 10;

    /* JADX INFO: renamed from: o0 */
    private final Runnable f14712o0 = new Runnable() { // from class: Qa.s
        @Override // java.lang.Runnable
        public final void run() {
            t.l1(this.f14684a);
        }
    };

    /* JADX INFO: renamed from: q0 */
    private z f14714q0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void b(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            AbstractC5504s.e(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC2081d.c {

        /* JADX INFO: renamed from: d */
        public static final a f14715d = new a(null);

        /* JADX INFO: renamed from: b */
        private final Class f14716b = t.class;

        /* JADX INFO: renamed from: c */
        private final String f14717c = "PanGestureHandler";

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
            return this.f14717c;
        }

        @Override // Qa.AbstractC2081d.c
        public Class e() {
            return this.f14716b;
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: g */
        public t a(Context context) {
            return new t(context);
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: h */
        public Ra.g c(t handler) {
            AbstractC5504s.h(handler, "handler");
            return new Ra.g(handler);
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: i */
        public void f(t handler, ReadableMap config) {
            boolean z10;
            AbstractC5504s.h(handler, "handler");
            AbstractC5504s.h(config, "config");
            super.f(handler, config);
            boolean z11 = true;
            if (config.hasKey("activeOffsetXStart")) {
                handler.f14690S = com.facebook.react.uimanager.B.h(config.getDouble("activeOffsetXStart"));
                z10 = true;
            } else {
                z10 = false;
            }
            if (config.hasKey("activeOffsetXEnd")) {
                handler.f14691T = com.facebook.react.uimanager.B.h(config.getDouble("activeOffsetXEnd"));
                z10 = true;
            }
            if (config.hasKey("failOffsetXStart")) {
                handler.f14692U = com.facebook.react.uimanager.B.h(config.getDouble("failOffsetXStart"));
                z10 = true;
            }
            if (config.hasKey("failOffsetXEnd")) {
                handler.f14693V = com.facebook.react.uimanager.B.h(config.getDouble("failOffsetXEnd"));
                z10 = true;
            }
            if (config.hasKey("activeOffsetYStart")) {
                handler.f14694W = com.facebook.react.uimanager.B.h(config.getDouble("activeOffsetYStart"));
                z10 = true;
            }
            if (config.hasKey("activeOffsetYEnd")) {
                handler.f14695X = com.facebook.react.uimanager.B.h(config.getDouble("activeOffsetYEnd"));
                z10 = true;
            }
            if (config.hasKey("failOffsetYStart")) {
                handler.f14696Y = com.facebook.react.uimanager.B.h(config.getDouble("failOffsetYStart"));
                z10 = true;
            }
            if (config.hasKey("failOffsetYEnd")) {
                handler.f14697Z = com.facebook.react.uimanager.B.h(config.getDouble("failOffsetYEnd"));
                z10 = true;
            }
            if (config.hasKey("minVelocity")) {
                handler.f14700c0 = com.facebook.react.uimanager.B.h(config.getDouble("minVelocity"));
                z10 = true;
            }
            if (config.hasKey("minVelocityX")) {
                handler.f14698a0 = com.facebook.react.uimanager.B.h(config.getDouble("minVelocityX"));
                z10 = true;
            }
            if (config.hasKey("minVelocityY")) {
                handler.f14699b0 = com.facebook.react.uimanager.B.h(config.getDouble("minVelocityY"));
            } else {
                z11 = z10;
            }
            if (config.hasKey("minDist")) {
                handler.f14689R = com.facebook.react.uimanager.B.h(config.getDouble("minDist"));
            } else if (z11) {
                handler.f14689R = Float.MAX_VALUE;
            }
            if (config.hasKey("minPointers")) {
                handler.f14701d0 = config.getInt("minPointers");
            }
            if (config.hasKey("maxPointers")) {
                handler.f14702e0 = config.getInt("maxPointers");
            }
            if (config.hasKey("avgTouches")) {
                handler.f14710m0 = config.getBoolean("avgTouches");
            }
            if (config.hasKey("activateAfterLongPress")) {
                handler.f14711n0 = config.getInt("activateAfterLongPress");
            }
        }
    }

    public t(Context context) {
        this.f14689R = Float.MIN_VALUE;
        AbstractC5504s.e(context);
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f14688Q = scaledTouchSlop;
        this.f14689R = scaledTouchSlop;
    }

    public static final void l1(t tVar) {
        tVar.k();
    }

    private final boolean r1() {
        float f10 = (this.f14707j0 - this.f14703f0) + this.f14705h0;
        float f11 = this.f14690S;
        if (f11 != Float.MAX_VALUE && f10 < f11) {
            return true;
        }
        float f12 = this.f14691T;
        if (f12 != Float.MIN_VALUE && f10 > f12) {
            return true;
        }
        float f13 = (this.f14708k0 - this.f14704g0) + this.f14706i0;
        float f14 = this.f14694W;
        if (f14 != Float.MAX_VALUE && f13 < f14) {
            return true;
        }
        float f15 = this.f14695X;
        if (f15 != Float.MIN_VALUE && f13 > f15) {
            return true;
        }
        float f16 = (f10 * f10) + (f13 * f13);
        float f17 = this.f14689R;
        if (f17 != Float.MAX_VALUE && f16 >= f17 * f17) {
            return true;
        }
        float f18 = this.f14686O;
        float f19 = this.f14698a0;
        if (f19 != Float.MAX_VALUE && ((f19 < 0.0f && f18 <= f19) || (0.0f <= f19 && f19 <= f18))) {
            return true;
        }
        float f20 = this.f14687P;
        float f21 = this.f14699b0;
        if (f21 != Float.MAX_VALUE && ((f21 < 0.0f && f18 <= f21) || (0.0f <= f21 && f21 <= f18))) {
            return true;
        }
        float f22 = (f18 * f18) + (f20 * f20);
        float f23 = this.f14700c0;
        return f23 != Float.MAX_VALUE && f22 >= f23 * f23;
    }

    private final boolean s1() {
        float f10 = (this.f14707j0 - this.f14703f0) + this.f14705h0;
        float f11 = (this.f14708k0 - this.f14704g0) + this.f14706i0;
        if (this.f14711n0 > 0) {
            float f12 = (f10 * f10) + (f11 * f11);
            float f13 = this.f14688Q;
            if (f12 > f13 * f13) {
                Handler handler = this.f14713p0;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                return true;
            }
        }
        float f14 = this.f14692U;
        if (f14 != Float.MIN_VALUE && f10 < f14) {
            return true;
        }
        float f15 = this.f14693V;
        if (f15 != Float.MAX_VALUE && f10 > f15) {
            return true;
        }
        float f16 = this.f14696Y;
        if (f16 != Float.MIN_VALUE && f11 < f16) {
            return true;
        }
        float f17 = this.f14697Z;
        return f17 != Float.MAX_VALUE && f11 > f17;
    }

    @Override // Qa.AbstractC2081d
    protected void j0() {
        Handler handler = this.f14713p0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Qa.AbstractC2081d
    public void l(boolean z10) {
        if (S() != 4) {
            t0();
        }
        super.l(z10);
    }

    @Override // Qa.AbstractC2081d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            if (event.getToolType(0) == 2) {
                this.f14714q0 = z.f14780f.a(event);
            }
            int iS = S();
            int actionMasked = sourceEvent.getActionMasked();
            if (actionMasked == 5 || actionMasked == 6) {
                this.f14705h0 += this.f14707j0 - this.f14703f0;
                this.f14706i0 += this.f14708k0 - this.f14704g0;
                k kVar = k.f14643a;
                this.f14707j0 = kVar.b(sourceEvent, this.f14710m0);
                float fC = kVar.c(sourceEvent, this.f14710m0);
                this.f14708k0 = fC;
                this.f14703f0 = this.f14707j0;
                this.f14704g0 = fC;
            } else {
                k kVar2 = k.f14643a;
                this.f14707j0 = kVar2.b(sourceEvent, this.f14710m0);
                this.f14708k0 = kVar2.c(sourceEvent, this.f14710m0);
            }
            if (iS != 0 || sourceEvent.getPointerCount() < this.f14701d0) {
                VelocityTracker velocityTracker = this.f14709l0;
                if (velocityTracker != null) {
                    f14685r0.b(velocityTracker, sourceEvent);
                    VelocityTracker velocityTracker2 = this.f14709l0;
                    AbstractC5504s.e(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    VelocityTracker velocityTracker3 = this.f14709l0;
                    AbstractC5504s.e(velocityTracker3);
                    this.f14686O = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.f14709l0;
                    AbstractC5504s.e(velocityTracker4);
                    this.f14687P = velocityTracker4.getYVelocity();
                }
            } else {
                t0();
                this.f14705h0 = 0.0f;
                this.f14706i0 = 0.0f;
                this.f14686O = 0.0f;
                this.f14687P = 0.0f;
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.f14709l0 = velocityTrackerObtain;
                f14685r0.b(velocityTrackerObtain, sourceEvent);
                p();
                if (this.f14711n0 > 0) {
                    if (this.f14713p0 == null) {
                        this.f14713p0 = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = this.f14713p0;
                    AbstractC5504s.e(handler);
                    handler.postDelayed(this.f14712o0, this.f14711n0);
                }
            }
            if (actionMasked == 1 || actionMasked == 12) {
                if (iS == 4) {
                    B();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (actionMasked == 5 && sourceEvent.getPointerCount() > this.f14702e0) {
                if (iS == 4) {
                    q();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (actionMasked == 6 && iS == 4 && sourceEvent.getPointerCount() < this.f14701d0) {
                D();
                return;
            }
            if (iS == 2) {
                if (s1()) {
                    D();
                } else if (r1()) {
                    k();
                }
            }
        }
    }

    public final z m1() {
        return this.f14714q0;
    }

    public final float n1() {
        return (this.f14707j0 - this.f14703f0) + this.f14705h0;
    }

    @Override // Qa.AbstractC2081d
    protected void o0() {
        Handler handler = this.f14713p0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.f14709l0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f14709l0 = null;
        }
        this.f14714q0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public final float o1() {
        return (this.f14708k0 - this.f14704g0) + this.f14706i0;
    }

    public final float p1() {
        return this.f14686O;
    }

    public final float q1() {
        return this.f14687P;
    }

    @Override // Qa.AbstractC2081d
    public void s0() {
        super.s0();
        this.f14690S = Float.MAX_VALUE;
        this.f14691T = Float.MIN_VALUE;
        this.f14692U = Float.MIN_VALUE;
        this.f14693V = Float.MAX_VALUE;
        this.f14694W = Float.MAX_VALUE;
        this.f14695X = Float.MIN_VALUE;
        this.f14696Y = Float.MIN_VALUE;
        this.f14697Z = Float.MAX_VALUE;
        this.f14698a0 = Float.MAX_VALUE;
        this.f14699b0 = Float.MAX_VALUE;
        this.f14700c0 = Float.MAX_VALUE;
        this.f14689R = this.f14688Q;
        this.f14701d0 = 1;
        this.f14702e0 = 10;
        this.f14711n0 = 0L;
        this.f14710m0 = false;
    }

    @Override // Qa.AbstractC2081d
    public void t0() {
        this.f14703f0 = this.f14707j0;
        this.f14704g0 = this.f14708k0;
    }
}
