package Qa;

import Qa.AbstractC2081d;
import Qa.w;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends AbstractC2081d {

    /* JADX INFO: renamed from: U */
    public static final a f14745U = new a(null);

    /* JADX INFO: renamed from: O */
    private w f14746O;

    /* JADX INFO: renamed from: P */
    private double f14747P;

    /* JADX INFO: renamed from: Q */
    private double f14748Q;

    /* JADX INFO: renamed from: R */
    private float f14749R = Float.NaN;

    /* JADX INFO: renamed from: S */
    private float f14750S = Float.NaN;

    /* JADX INFO: renamed from: T */
    private final w.a f14751T = new c();

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

        /* JADX INFO: renamed from: b */
        private final Class f14752b = x.class;

        /* JADX INFO: renamed from: c */
        private final String f14753c = "RotationGestureHandler";

        @Override // Qa.AbstractC2081d.c
        public String d() {
            return this.f14753c;
        }

        @Override // Qa.AbstractC2081d.c
        public Class e() {
            return this.f14752b;
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: g */
        public x a(Context context) {
            return new x();
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: h */
        public Ra.i c(x handler) {
            AbstractC5504s.h(handler, "handler");
            return new Ra.i(handler);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements w.a {
        c() {
        }

        @Override // Qa.w.a
        public void a(w detector) {
            AbstractC5504s.h(detector, "detector");
            x.this.B();
        }

        @Override // Qa.w.a
        public boolean b(w detector) {
            AbstractC5504s.h(detector, "detector");
            return true;
        }

        @Override // Qa.w.a
        public boolean c(w detector) {
            AbstractC5504s.h(detector, "detector");
            double dY0 = x.this.Y0();
            x xVar = x.this;
            xVar.f14747P = xVar.Y0() + detector.d();
            long jE = detector.e();
            if (jE > 0) {
                x xVar2 = x.this;
                xVar2.f14748Q = (xVar2.Y0() - dY0) / jE;
            }
            if (Math.abs(x.this.Y0()) < 0.08726646259971647d || x.this.S() != 2) {
                return true;
            }
            x.this.k();
            return true;
        }
    }

    public final float W0() {
        return this.f14749R;
    }

    public final float X0() {
        return this.f14750S;
    }

    public final double Y0() {
        return this.f14747P;
    }

    public final double Z0() {
        return this.f14748Q;
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
        if (S() == 0) {
            t0();
            this.f14746O = new w(this.f14751T);
            this.f14749R = event.getX();
            this.f14750S = event.getY();
            p();
        }
        w wVar = this.f14746O;
        if (wVar != null) {
            wVar.f(sourceEvent);
        }
        w wVar2 = this.f14746O;
        if (wVar2 != null) {
            PointF pointFQ0 = Q0(new PointF(wVar2.b(), wVar2.c()));
            this.f14749R = pointFQ0.x;
            this.f14750S = pointFQ0.y;
        }
        if (sourceEvent.getActionMasked() == 1) {
            if (S() == 4) {
                B();
            } else {
                D();
            }
        }
    }

    @Override // Qa.AbstractC2081d
    protected void o0() {
        this.f14746O = null;
        this.f14749R = Float.NaN;
        this.f14750S = Float.NaN;
        t0();
    }

    @Override // Qa.AbstractC2081d
    public void t0() {
        this.f14748Q = 0.0d;
        this.f14747P = 0.0d;
    }
}
