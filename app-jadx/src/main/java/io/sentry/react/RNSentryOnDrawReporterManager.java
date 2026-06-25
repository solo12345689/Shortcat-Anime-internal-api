package io.sentry.react;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.SimpleViewManager;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5249p2;
import io.sentry.android.core.C5131g0;
import io.sentry.android.core.C5174z;
import io.sentry.android.core.Z0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class RNSentryOnDrawReporterManager extends SimpleViewManager<a> {
    public static final String REACT_CLASS = "RNSentryOnDrawReporter";
    public static final String TTFD_PREFIX = "ttfd-";
    public static final String TTID_PREFIX = "ttid-";
    private final ReactApplicationContext mCallerContext;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends View {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final ILogger f51200h = new C5174z("RNSentryOnDrawReporterView");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReactApplicationContext f51201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC5249p2 f51202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C5131g0 f51203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f51204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f51205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f51206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f51207g;

        public a(ReactApplicationContext reactApplicationContext, C5131g0 c5131g0) {
            super(reactApplicationContext);
            this.f51202b = new Z0();
            this.f51204d = false;
            this.f51205e = false;
            this.f51206f = false;
            this.f51207g = null;
            this.f51201a = reactApplicationContext;
            this.f51203c = c5131g0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            Double dValueOf = Double.valueOf(this.f51202b.now().m() / 1.0E9d);
            if (this.f51207g == null) {
                f51200h.c(EnumC5215i3.ERROR, "[TimeToDisplay] parentSpanId removed before frame was rendered.", new Object[0]);
                return;
            }
            if (this.f51204d) {
                w.e(RNSentryOnDrawReporterManager.TTID_PREFIX + this.f51207g, dValueOf);
                return;
            }
            if (!this.f51205e) {
                f51200h.c(EnumC5215i3.DEBUG, "[TimeToDisplay] display type removed before frame was rendered.", new Object[0]);
                return;
            }
            w.e(RNSentryOnDrawReporterManager.TTFD_PREFIX + this.f51207g, dValueOf);
        }

        private void c() {
            if (this.f51207g == null) {
                return;
            }
            if (this.f51206f) {
                f51200h.c(EnumC5215i3.DEBUG, "[TimeToDisplay] Already recorded time to display for spanId: " + this.f51207g, new Object[0]);
                return;
            }
            if (this.f51204d) {
                f51200h.c(EnumC5215i3.DEBUG, "[TimeToDisplay] Register initial display event emitter.", new Object[0]);
            } else {
                if (!this.f51205e) {
                    f51200h.c(EnumC5215i3.DEBUG, "[TimeToDisplay] Not ready, missing displayType prop.", new Object[0]);
                    return;
                }
                f51200h.c(EnumC5215i3.DEBUG, "[TimeToDisplay] Register full display event emitter.", new Object[0]);
            }
            if (this.f51203c == null) {
                f51200h.c(EnumC5215i3.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, buildInfo is null.", new Object[0]);
                return;
            }
            ReactApplicationContext reactApplicationContext = this.f51201a;
            if (reactApplicationContext == null) {
                f51200h.c(EnumC5215i3.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, reactContext is null.", new Object[0]);
                return;
            }
            ILogger iLogger = f51200h;
            Activity activityA = io.sentry.react.utils.a.a(reactApplicationContext, iLogger);
            if (activityA == null) {
                iLogger.c(EnumC5215i3.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, activity is null.", new Object[0]);
            } else {
                this.f51206f = true;
                d(activityA, new Runnable() { // from class: io.sentry.react.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51246a.b();
                    }
                }, this.f51203c);
            }
        }

        protected void d(Activity activity, Runnable runnable, C5131g0 c5131g0) {
            io.sentry.android.core.internal.util.t.d(activity, runnable, c5131g0);
        }

        public void setFullDisplay(boolean z10) {
            if (z10 != this.f51205e) {
                this.f51205e = z10;
                c();
            }
        }

        public void setInitialDisplay(boolean z10) {
            if (z10 != this.f51204d) {
                this.f51204d = z10;
                c();
            }
        }

        public void setParentSpanId(String str) {
            if (Objects.equals(str, this.f51207g)) {
                return;
            }
            this.f51207g = str;
            this.f51206f = false;
            c();
        }
    }

    public RNSentryOnDrawReporterManager(ReactApplicationContext reactApplicationContext) {
        this.mCallerContext = reactApplicationContext;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @B7.a(defaultBoolean = false, name = "fullDisplay")
    public void setFullDisplay(a aVar, boolean z10) {
        aVar.setFullDisplay(z10);
    }

    @B7.a(defaultBoolean = false, name = "initialDisplay")
    public void setInitialDisplay(a aVar, boolean z10) {
        aVar.setInitialDisplay(z10);
    }

    @B7.a(name = "parentSpanId")
    public void setParentSpanId(a aVar, String str) {
        aVar.setParentSpanId(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(C3284b0 c3284b0) {
        return new a(this.mCallerContext, new C5131g0(new C5174z()));
    }
}
