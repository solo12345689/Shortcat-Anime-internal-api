package td;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import kotlin.jvm.internal.AbstractC5504s;
import td.InterfaceC6665d;
import xd.C7136g;
import xd.EnumC7131b;

/* JADX INFO: renamed from: td.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6664c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7136g f60872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f60873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f60874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReactMarker.MarkerListener f60876e;

    public C6664c(C7136g logger) {
        AbstractC5504s.h(logger, "logger");
        this.f60872a = logger;
        this.f60873b = new HandlerThread("expo-updates-error-recovery");
        this.f60876e = new ReactMarker.MarkerListener() { // from class: td.a
            @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
            public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
                C6664c.c(this.f60870a, reactMarkerConstants, str, i10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C6664c c6664c, ReactMarkerConstants name, String str, int i10) {
        AbstractC5504s.h(name, "name");
        if (name == ReactMarkerConstants.CONTENT_APPEARED) {
            c6664c.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C6664c c6664c) {
        c6664c.p();
    }

    private final void k() {
        ReactMarker.addListener(this.f60876e);
    }

    private final void l(c7.f fVar) {
        this.f60875d = true;
    }

    private final void o() {
        ReactMarker.removeListener(this.f60876e);
    }

    private final void p() {
        this.f60875d = false;
    }

    public final Handler d() {
        Handler handler = this.f60874c;
        if (handler != null) {
            return handler;
        }
        AbstractC5504s.u("handler");
        return null;
    }

    public final void e() {
        d().sendMessage(d().obtainMessage(1));
        o();
        d().postDelayed(new Runnable() { // from class: td.b
            @Override // java.lang.Runnable
            public final void run() {
                C6664c.f(this.f60871a);
            }
        }, 10000L);
    }

    public final void g(Exception exception) {
        AbstractC5504s.h(exception, "exception");
        this.f60872a.f("ErrorRecovery: exception encountered: " + exception.getLocalizedMessage(), exception, EnumC7131b.f64350l);
        d().sendMessage(d().obtainMessage(0, exception));
    }

    public final void h(InterfaceC6665d delegate) {
        AbstractC5504s.h(delegate, "delegate");
        if (this.f60874c == null) {
            this.f60873b.start();
            Looper looper = this.f60873b.getLooper();
            AbstractC5504s.g(looper, "getLooper(...)");
            m(new HandlerC6667f(looper, delegate, this.f60872a));
        }
    }

    public final void i(InterfaceC6665d.a newStatus) {
        AbstractC5504s.h(newStatus, "newStatus");
        C7136g.k(this.f60872a, "ErrorRecovery: remote load status changed: " + newStatus, null, 2, null);
        d().sendMessage(d().obtainMessage(2, newStatus));
    }

    public final void j(Exception exception) {
        AbstractC5504s.h(exception, "exception");
        if (this.f60875d) {
            g(exception);
        }
    }

    public final void m(Handler handler) {
        AbstractC5504s.h(handler, "<set-?>");
        this.f60874c = handler;
    }

    public final void n(c7.f devSupportManager) {
        AbstractC5504s.h(devSupportManager, "devSupportManager");
        k();
        l(devSupportManager);
    }
}
