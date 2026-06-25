package Qa;

import Qa.AbstractC2081d;
import Ud.AbstractC2279u;
import Ud.O;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends AbstractC2081d {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final a f14653Y = new a(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f14654O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final float f14655P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f14656Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f14657R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f14658S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f14659T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private long f14660U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private long f14661V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Handler f14662W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f14663X;

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
        public static final a f14664d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f14665b = o.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f14666c = "LongPressGestureHandler";

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
            return this.f14666c;
        }

        @Override // Qa.AbstractC2081d.c
        public Class e() {
            return this.f14665b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public o a(Context context) {
            AbstractC5504s.e(context);
            return new o(context);
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Ra.d c(o handler) {
            AbstractC5504s.h(handler, "handler");
            return new Ra.d(handler);
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(o handler, ReadableMap config) {
            AbstractC5504s.h(handler, "handler");
            AbstractC5504s.h(config, "config");
            super.f(handler, config);
            if (config.hasKey("minDurationMs")) {
                handler.a1(config.getInt("minDurationMs"));
            }
            if (config.hasKey("maxDist")) {
                handler.f14656Q = com.facebook.react.uimanager.B.h(config.getDouble("maxDist"));
            }
            if (config.hasKey("numberOfPointers")) {
                handler.D0(config.getInt("numberOfPointers"));
            }
        }
    }

    public o(Context context) {
        AbstractC5504s.h(context, "context");
        this.f14654O = 500L;
        G0(true);
        float f10 = context.getResources().getDisplayMetrics().density * 10.0f;
        this.f14655P = f10;
        this.f14656Q = f10;
        this.f14657R = 1;
    }

    private final Pair W0(MotionEvent motionEvent, boolean z10) {
        if (z10) {
            int pointerCount = motionEvent.getPointerCount();
            float x10 = 0.0f;
            float y10 = 0.0f;
            for (int i10 = 0; i10 < pointerCount; i10++) {
                if (i10 != motionEvent.getActionIndex()) {
                    x10 += motionEvent.getX(i10);
                    y10 += motionEvent.getY(i10);
                }
            }
            return new Pair(Float.valueOf(x10 / (motionEvent.getPointerCount() - 1)), Float.valueOf(y10 / (motionEvent.getPointerCount() - 1)));
        }
        C5870f c5870fX = AbstractC5874j.x(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(c5870fX, 10));
        Iterator it = c5870fX.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(motionEvent.getX(((O) it).nextInt())));
        }
        float fD0 = (float) AbstractC2279u.d0(arrayList);
        C5870f c5870fX2 = AbstractC5874j.x(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(c5870fX2, 10));
        Iterator it2 = c5870fX2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(motionEvent.getY(((O) it2).nextInt())));
        }
        return new Pair(Float.valueOf(fD0), Float.valueOf((float) AbstractC2279u.d0(arrayList2)));
    }

    static /* synthetic */ Pair X0(o oVar, MotionEvent motionEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return oVar.W0(motionEvent, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(o oVar) {
        oVar.k();
    }

    public final int Y0() {
        return (int) (this.f14661V - this.f14660U);
    }

    public final void a1(long j10) {
        this.f14654O = j10;
    }

    @Override // Qa.AbstractC2081d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            if (S() == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.f14661V = jUptimeMillis;
                this.f14660U = jUptimeMillis;
                p();
                Pair pairX0 = X0(this, sourceEvent, false, 2, null);
                float fFloatValue = ((Number) pairX0.getFirst()).floatValue();
                float fFloatValue2 = ((Number) pairX0.getSecond()).floatValue();
                this.f14658S = fFloatValue;
                this.f14659T = fFloatValue2;
                this.f14663X++;
            }
            if (sourceEvent.getActionMasked() == 5) {
                this.f14663X++;
                Pair pairX02 = X0(this, sourceEvent, false, 2, null);
                float fFloatValue3 = ((Number) pairX02.getFirst()).floatValue();
                float fFloatValue4 = ((Number) pairX02.getSecond()).floatValue();
                this.f14658S = fFloatValue3;
                this.f14659T = fFloatValue4;
                if (this.f14663X > this.f14657R) {
                    D();
                    this.f14663X = 0;
                }
            }
            if (S() == 2 && this.f14663X == this.f14657R && (sourceEvent.getActionMasked() == 0 || sourceEvent.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.f14662W = handler;
                long j10 = this.f14654O;
                if (j10 > 0) {
                    AbstractC5504s.e(handler);
                    handler.postDelayed(new Runnable() { // from class: Qa.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            o.Z0(this.f14652a);
                        }
                    }, this.f14654O);
                } else if (j10 == 0) {
                    k();
                }
            }
            if (sourceEvent.getActionMasked() == 1 || sourceEvent.getActionMasked() == 12) {
                this.f14663X--;
                Handler handler2 = this.f14662W;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.f14662W = null;
                }
                if (S() == 4) {
                    B();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (sourceEvent.getActionMasked() == 6) {
                int i10 = this.f14663X - 1;
                this.f14663X = i10;
                if (i10 < this.f14657R && S() != 4) {
                    D();
                    this.f14663X = 0;
                    return;
                }
                Pair pairW0 = W0(sourceEvent, true);
                float fFloatValue5 = ((Number) pairW0.getFirst()).floatValue();
                float fFloatValue6 = ((Number) pairW0.getSecond()).floatValue();
                this.f14658S = fFloatValue5;
                this.f14659T = fFloatValue6;
                return;
            }
            Pair pairX03 = X0(this, sourceEvent, false, 2, null);
            float fFloatValue7 = ((Number) pairX03.getFirst()).floatValue();
            float fFloatValue8 = ((Number) pairX03.getSecond()).floatValue();
            float f10 = fFloatValue7 - this.f14658S;
            float f11 = fFloatValue8 - this.f14659T;
            float f12 = (f10 * f10) + (f11 * f11);
            float f13 = this.f14656Q;
            if (f12 > f13 * f13) {
                if (S() == 4) {
                    q();
                } else {
                    D();
                }
            }
        }
    }

    @Override // Qa.AbstractC2081d
    protected void o0() {
        super.o0();
        this.f14663X = 0;
    }

    @Override // Qa.AbstractC2081d
    protected void p0(int i10, int i11) {
        Handler handler = this.f14662W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f14662W = null;
        }
    }

    @Override // Qa.AbstractC2081d
    public void s0() {
        super.s0();
        this.f14654O = 500L;
        this.f14656Q = this.f14655P;
        G0(true);
    }

    @Override // Qa.AbstractC2081d
    public void v(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        this.f14661V = SystemClock.uptimeMillis();
        super.v(event);
    }

    @Override // Qa.AbstractC2081d
    public void w(int i10, int i11) {
        this.f14661V = SystemClock.uptimeMillis();
        super.w(i10, i11);
    }
}
