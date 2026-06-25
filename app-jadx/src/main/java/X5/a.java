package X5;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC0372a f21653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float f21654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f21655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f21656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f21657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f21658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f21659g;

    /* JADX INFO: renamed from: X5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0372a {
        boolean c();
    }

    public a(Context context) {
        this.f21654b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a c(Context context) {
        return new a(context);
    }

    public void a() {
        this.f21653a = null;
        e();
    }

    public boolean b() {
        return this.f21655c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0372a interfaceC0372a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21655c = true;
            this.f21656d = true;
            this.f21657e = motionEvent.getEventTime();
            this.f21658f = motionEvent.getX();
            this.f21659g = motionEvent.getY();
        } else if (action == 1) {
            this.f21655c = false;
            if (Math.abs(motionEvent.getX() - this.f21658f) > this.f21654b || Math.abs(motionEvent.getY() - this.f21659g) > this.f21654b) {
                this.f21656d = false;
            }
            if (this.f21656d && motionEvent.getEventTime() - this.f21657e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0372a = this.f21653a) != null) {
                interfaceC0372a.c();
            }
            this.f21656d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f21655c = false;
                this.f21656d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f21658f) > this.f21654b || Math.abs(motionEvent.getY() - this.f21659g) > this.f21654b) {
            this.f21656d = false;
        }
        return true;
    }

    public void e() {
        this.f21655c = false;
        this.f21656d = false;
    }

    public void f(InterfaceC0372a interfaceC0372a) {
        this.f21653a = interfaceC0372a;
    }
}
