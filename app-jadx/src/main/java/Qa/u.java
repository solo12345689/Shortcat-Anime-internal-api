package Qa;

import Qa.AbstractC2081d;
import Qa.y;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends AbstractC2081d {

    /* JADX INFO: renamed from: O */
    private double f14718O;

    /* JADX INFO: renamed from: P */
    private double f14719P;

    /* JADX INFO: renamed from: S */
    private y f14722S;

    /* JADX INFO: renamed from: T */
    private float f14723T;

    /* JADX INFO: renamed from: U */
    private float f14724U;

    /* JADX INFO: renamed from: Q */
    private float f14720Q = Float.NaN;

    /* JADX INFO: renamed from: R */
    private float f14721R = Float.NaN;

    /* JADX INFO: renamed from: V */
    private final y.b f14725V = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2081d.c {

        /* JADX INFO: renamed from: b */
        private final Class f14726b = u.class;

        /* JADX INFO: renamed from: c */
        private final String f14727c = "PinchGestureHandler";

        @Override // Qa.AbstractC2081d.c
        public String d() {
            return this.f14727c;
        }

        @Override // Qa.AbstractC2081d.c
        public Class e() {
            return this.f14726b;
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: g */
        public u a(Context context) {
            return new u();
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: h */
        public Ra.h c(u handler) {
            AbstractC5504s.h(handler, "handler");
            return new Ra.h(handler);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements y.b {
        b() {
        }

        @Override // Qa.y.b
        public boolean a(y detector) {
            AbstractC5504s.h(detector, "detector");
            u.this.f14723T = detector.d();
            return true;
        }

        @Override // Qa.y.b
        public boolean b(y detector) {
            AbstractC5504s.h(detector, "detector");
            double dB1 = u.this.b1();
            u uVar = u.this;
            uVar.f14718O = uVar.b1() * ((double) detector.g());
            double dI = detector.i();
            if (dI > 0.0d) {
                u uVar2 = u.this;
                uVar2.f14719P = (uVar2.b1() - dB1) / dI;
            }
            if (Math.abs(u.this.f14723T - detector.d()) < u.this.f14724U || u.this.S() != 2) {
                return true;
            }
            u.this.k();
            return true;
        }

        @Override // Qa.y.b
        public void c(y detector) {
            AbstractC5504s.h(detector, "detector");
        }
    }

    public final float Z0() {
        return this.f14720Q;
    }

    public final float a1() {
        return this.f14721R;
    }

    public final double b1() {
        return this.f14718O;
    }

    public final double c1() {
        return this.f14719P;
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
            View viewW = W();
            AbstractC5504s.e(viewW);
            Context context = viewW.getContext();
            t0();
            this.f14722S = new y(context, this.f14725V);
            this.f14724U = ViewConfiguration.get(context).getScaledTouchSlop();
            this.f14720Q = event.getX();
            this.f14721R = event.getY();
            p();
        }
        y yVar = this.f14722S;
        if (yVar != null) {
            yVar.k(sourceEvent);
        }
        y yVar2 = this.f14722S;
        if (yVar2 != null) {
            PointF pointFQ0 = Q0(new PointF(yVar2.e(), yVar2.f()));
            this.f14720Q = pointFQ0.x;
            this.f14721R = pointFQ0.y;
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
        this.f14722S = null;
        this.f14720Q = Float.NaN;
        this.f14721R = Float.NaN;
        t0();
    }

    @Override // Qa.AbstractC2081d
    public void t0() {
        this.f14719P = 0.0d;
        this.f14718O = 1.0d;
    }
}
