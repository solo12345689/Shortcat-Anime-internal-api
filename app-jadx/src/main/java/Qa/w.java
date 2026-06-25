package Qa;

import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f14735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f14737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f14738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f14739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f14740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f14741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f14743i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f14744j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(w wVar);

        boolean b(w wVar);

        boolean c(w wVar);
    }

    public w(a aVar) {
        this.f14735a = aVar;
    }

    private final void a() {
        if (this.f14742h) {
            this.f14744j = false;
            this.f14742h = false;
            a aVar = this.f14735a;
            if (aVar != null) {
                aVar.a(this);
            }
        }
    }

    private final void g() {
        if (this.f14744j) {
            return;
        }
        this.f14744j = true;
    }

    private final void h(double d10) {
        if (this.f14744j) {
            this.f14738d = d10;
            this.f14744j = false;
        }
    }

    private final void i(MotionEvent motionEvent) {
        this.f14737c = this.f14736b;
        this.f14736b = motionEvent.getEventTime();
        int iFindPointerIndex = motionEvent.findPointerIndex(this.f14743i[0]);
        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f14743i[1]);
        if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
            return;
        }
        float x10 = motionEvent.getX(iFindPointerIndex);
        float y10 = motionEvent.getY(iFindPointerIndex);
        float x11 = motionEvent.getX(iFindPointerIndex2);
        float y11 = motionEvent.getY(iFindPointerIndex2);
        this.f14740f = (x10 + x11) * 0.5f;
        this.f14741g = (y10 + y11) * 0.5f;
        double d10 = -Math.atan2(y11 - y10, x11 - x10);
        h(d10);
        double d11 = Double.isNaN(this.f14738d) ? 0.0d : this.f14738d - d10;
        this.f14739e = d11;
        this.f14738d = d10;
        if (d11 > 3.141592653589793d) {
            this.f14739e = d11 - 3.141592653589793d;
        } else if (d11 < -3.141592653589793d) {
            this.f14739e = d11 + 3.141592653589793d;
        }
        double d12 = this.f14739e;
        if (d12 > 1.5707963267948966d) {
            this.f14739e = d12 - 3.141592653589793d;
        } else if (d12 < -1.5707963267948966d) {
            this.f14739e = d12 + 3.141592653589793d;
        }
    }

    public final float b() {
        return this.f14740f;
    }

    public final float c() {
        return this.f14741g;
    }

    public final double d() {
        return this.f14739e;
    }

    public final long e() {
        return this.f14736b - this.f14737c;
    }

    public final boolean f(MotionEvent event) {
        a aVar;
        AbstractC5504s.h(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f14742h = false;
            this.f14743i[0] = event.getPointerId(event.getActionIndex());
            this.f14743i[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.f14742h || this.f14744j) {
                    this.f14743i[1] = event.getPointerId(event.getActionIndex());
                    i(event);
                }
                if (!this.f14742h) {
                    this.f14742h = true;
                    this.f14737c = event.getEventTime();
                    this.f14738d = Double.NaN;
                    a aVar2 = this.f14735a;
                    if (aVar2 != null) {
                        aVar2.b(this);
                    }
                }
            } else if (actionMasked == 6 && this.f14742h) {
                int pointerId = event.getPointerId(event.getActionIndex());
                int[] iArr = this.f14743i;
                if (pointerId == iArr[0]) {
                    iArr[0] = iArr[1];
                    iArr[1] = -1;
                    g();
                } else if (pointerId == iArr[1]) {
                    iArr[1] = -1;
                    g();
                }
            }
        } else if (this.f14742h) {
            i(event);
            if (!this.f14744j && (aVar = this.f14735a) != null) {
                aVar.c(this);
            }
        }
        return true;
    }
}
