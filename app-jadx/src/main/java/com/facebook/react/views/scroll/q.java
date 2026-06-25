package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VelocityTracker f38158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38160c;

    public final void a(MotionEvent ev) {
        AbstractC5504s.h(ev, "ev");
        if (this.f38158a == null) {
            this.f38158a = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f38158a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(ev);
            int action = ev.getAction() & 255;
            if (action == 1 || action == 3) {
                velocityTracker.computeCurrentVelocity(1);
                this.f38159b = velocityTracker.getXVelocity();
                this.f38160c = velocityTracker.getYVelocity();
                velocityTracker.recycle();
                this.f38158a = null;
            }
        }
    }

    public final float b() {
        return this.f38159b;
    }

    public final float c() {
        return this.f38160c;
    }
}
