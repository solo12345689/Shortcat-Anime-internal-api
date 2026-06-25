package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.C5191e;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5247p0;
import io.sentry.android.core.C5123c0;
import io.sentry.util.C5288a;
import java.io.Closeable;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class SystemEventsBreadcrumbsIntegration implements InterfaceC5247p0, Closeable, C5123c0.a {

    /* JADX INFO: renamed from: a */
    private final Context f49605a;

    /* JADX INFO: renamed from: b */
    volatile b f49606b;

    /* JADX INFO: renamed from: c */
    private SentryAndroidOptions f49607c;

    /* JADX INFO: renamed from: d */
    private InterfaceC5114a0 f49608d;

    /* JADX INFO: renamed from: e */
    private final String[] f49609e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f49610f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f49611g;

    /* JADX INFO: renamed from: h */
    private volatile IntentFilter f49612h;

    /* JADX INFO: renamed from: i */
    private volatile HandlerThread f49613i;

    /* JADX INFO: renamed from: j */
    private final AtomicBoolean f49614j;

    /* JADX INFO: renamed from: k */
    private final C5288a f49615k;

    /* JADX INFO: renamed from: l */
    private a f49616l;

    /* JADX INFO: renamed from: m */
    Handler f49617m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a */
        private final Integer f49618a;

        /* JADX INFO: renamed from: b */
        private final Boolean f49619b;

        a(Integer num, Boolean bool) {
            this.f49618a = num;
            this.f49619b = bool;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return io.sentry.util.w.a(this.f49618a, aVar.f49618a) && io.sentry.util.w.a(this.f49619b, aVar.f49619b);
        }

        public int hashCode() {
            return io.sentry.util.w.b(this.f49618a, this.f49619b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5114a0 f49620a;

        /* JADX INFO: renamed from: b */
        private final SentryAndroidOptions f49621b;

        /* JADX INFO: renamed from: c */
        private final io.sentry.android.core.internal.util.p f49622c = new io.sentry.android.core.internal.util.p(io.sentry.android.core.internal.util.h.a(), 60000, 0);

        /* JADX INFO: renamed from: d */
        private final char[] f49623d = new char[64];

        b(InterfaceC5114a0 interfaceC5114a0, SentryAndroidOptions sentryAndroidOptions) {
            this.f49620a = interfaceC5114a0;
            this.f49621b = sentryAndroidOptions;
        }

        private C5191e a(long j10, Intent intent, String str, a aVar) {
            Bundle extras;
            C5191e c5191e = new C5191e(j10);
            c5191e.H("system");
            c5191e.C("device.event");
            String strB = b(str);
            if (strB != null) {
                c5191e.D("action", strB);
            }
            if (aVar != null) {
                if (aVar.f49618a != null) {
                    c5191e.D("level", aVar.f49618a);
                }
                if (aVar.f49619b != null) {
                    c5191e.D("charging", aVar.f49619b);
                }
            } else if (this.f49621b.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                HashMap map = new HashMap(extras.size());
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            map.put(str2, obj.toString());
                        }
                    } catch (Throwable th2) {
                        this.f49621b.getLogger().a(EnumC5215i3.ERROR, th2, "%s key of the %s action threw an error.", str2, str);
                    }
                }
                c5191e.D("extras", map);
            }
            c5191e.E(EnumC5215i3.INFO);
            return c5191e;
        }

        String b(String str) {
            if (str == null) {
                return null;
            }
            int length = str.length();
            int length2 = this.f49623d.length;
            for (int i10 = length - 1; i10 >= 0; i10--) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '.') {
                    char[] cArr = this.f49623d;
                    return new String(cArr, length2, cArr.length - length2);
                }
                if (length2 == 0) {
                    return io.sentry.util.D.d(str);
                }
                length2--;
                this.f49623d[length2] = cCharAt;
            }
            return str;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a aVar;
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                aVar = null;
            } else {
                if (this.f49622c.a()) {
                    return;
                }
                Float fE = C5175z0.e(intent, this.f49621b);
                a aVar2 = new a(fE != null ? Integer.valueOf(fE.intValue()) : null, C5175z0.v(intent, this.f49621b));
                if (aVar2.equals(SystemEventsBreadcrumbsIntegration.this.f49616l)) {
                    return;
                }
                SystemEventsBreadcrumbsIntegration.this.f49616l = aVar2;
                aVar = aVar2;
            }
            C5191e c5191eA = a(System.currentTimeMillis(), intent, action, aVar);
            io.sentry.H h10 = new io.sentry.H();
            h10.k("android:intent", intent);
            this.f49620a.e(c5191eA, h10);
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, m(), null);
    }

    public static /* synthetic */ void h(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, InterfaceC5114a0 interfaceC5114a0, SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC5192e0 interfaceC5192e0A = systemEventsBreadcrumbsIntegration.f49615k.a();
        try {
            if (!systemEventsBreadcrumbsIntegration.f49610f && !systemEventsBreadcrumbsIntegration.f49611g && systemEventsBreadcrumbsIntegration.f49606b == null) {
                systemEventsBreadcrumbsIntegration.f49606b = systemEventsBreadcrumbsIntegration.new b(interfaceC5114a0, sentryAndroidOptions);
                if (systemEventsBreadcrumbsIntegration.f49612h == null) {
                    systemEventsBreadcrumbsIntegration.f49612h = new IntentFilter();
                    for (String str : systemEventsBreadcrumbsIntegration.f49609e) {
                        systemEventsBreadcrumbsIntegration.f49612h.addAction(str);
                    }
                }
                if (systemEventsBreadcrumbsIntegration.f49617m == null && systemEventsBreadcrumbsIntegration.f49613i == null) {
                    systemEventsBreadcrumbsIntegration.f49613i = new HandlerThread("SystemEventsReceiver", 10);
                    systemEventsBreadcrumbsIntegration.f49613i.start();
                }
                try {
                    Handler handler = systemEventsBreadcrumbsIntegration.f49617m;
                    if (handler == null) {
                        handler = new Handler(systemEventsBreadcrumbsIntegration.f49613i.getLooper());
                    }
                    AbstractC5156p0.t(systemEventsBreadcrumbsIntegration.f49605a, sentryAndroidOptions, systemEventsBreadcrumbsIntegration.f49606b, systemEventsBreadcrumbsIntegration.f49612h, handler);
                    if (!systemEventsBreadcrumbsIntegration.f49614j.getAndSet(true)) {
                        sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        io.sentry.util.n.a("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions.getLogger().b(EnumC5215i3.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th2);
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                    return;
                }
                return;
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th3) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    private static String[] m() {
        return new String[]{"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
    }

    private void o(final InterfaceC5114a0 interfaceC5114a0, final SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f49610f && !this.f49611g && this.f49606b == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystemEventsBreadcrumbsIntegration.h(this.f49738a, interfaceC5114a0, sentryAndroidOptions);
                    }
                });
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().c(EnumC5215i3.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    private void q() {
        SentryAndroidOptions sentryAndroidOptions = this.f49607c;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.e1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49727a.w();
                }
            });
        } catch (RejectedExecutionException unused) {
            w();
        }
    }

    public void w() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49615k.a();
        try {
            this.f49611g = true;
            b bVar = this.f49606b;
            this.f49606b = null;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            if (bVar != null) {
                this.f49605a.unregisterReceiver(bVar);
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.C5123c0.a
    public void a() {
        if (this.f49608d == null || this.f49607c == null) {
            return;
        }
        this.f49611g = false;
        o(this.f49608d, this.f49607c);
    }

    @Override // io.sentry.android.core.C5123c0.a
    public void b() {
        q();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49615k.a();
        try {
            this.f49610f = true;
            this.f49612h = null;
            if (this.f49613i != null) {
                this.f49613i.quit();
            }
            this.f49613i = null;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            C5123c0.l().q(this);
            q();
            SentryAndroidOptions sentryAndroidOptions = this.f49607c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(c5322z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5322z3 : null, "SentryAndroidOptions is required");
        this.f49607c = sentryAndroidOptions;
        this.f49608d = interfaceC5114a0;
        sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f49607c.isEnableSystemEventBreadcrumbs()));
        if (this.f49607c.isEnableSystemEventBreadcrumbs()) {
            C5123c0.l().h(this);
            if (AbstractC5156p0.s()) {
                o(this.f49608d, this.f49607c);
            }
        }
    }

    SystemEventsBreadcrumbsIntegration(Context context, String[] strArr, Handler handler) {
        this.f49610f = false;
        this.f49611g = false;
        this.f49612h = null;
        this.f49613i = null;
        this.f49614j = new AtomicBoolean(false);
        this.f49615k = new C5288a();
        this.f49617m = null;
        this.f49605a = AbstractC5156p0.g(context);
        this.f49609e = strArr;
        this.f49617m = handler;
    }
}
