package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractServiceC2868w;
import androidx.work.impl.foreground.b;
import i4.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SystemForegroundService extends AbstractServiceC2868w implements b.InterfaceC0549b {

    /* JADX INFO: renamed from: f */
    private static final String f32848f = i.i("SystemFgService");

    /* JADX INFO: renamed from: g */
    private static SystemForegroundService f32849g = null;

    /* JADX INFO: renamed from: b */
    private Handler f32850b;

    /* JADX INFO: renamed from: c */
    private boolean f32851c;

    /* JADX INFO: renamed from: d */
    androidx.work.impl.foreground.b f32852d;

    /* JADX INFO: renamed from: e */
    NotificationManager f32853e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f32854a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Notification f32855b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f32856c;

        a(int i10, Notification notification, int i11) {
            this.f32854a = i10;
            this.f32855b = notification;
            this.f32856c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                e.a(SystemForegroundService.this, this.f32854a, this.f32855b, this.f32856c);
            } else if (i10 >= 29) {
                d.a(SystemForegroundService.this, this.f32854a, this.f32855b, this.f32856c);
            } else {
                SystemForegroundService.this.startForeground(this.f32854a, this.f32855b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f32858a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Notification f32859b;

        b(int i10, Notification notification) {
            this.f32858a = i10;
            this.f32859b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f32853e.notify(this.f32858a, this.f32859b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f32861a;

        c(int i10) {
            this.f32861a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f32853e.cancel(this.f32861a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d {
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e {
        static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                i.e().l(SystemForegroundService.f32848f, "Unable to start foreground service", e10);
            }
        }
    }

    private void f() {
        this.f32850b = new Handler(Looper.getMainLooper());
        this.f32853e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b bVar = new androidx.work.impl.foreground.b(getApplicationContext());
        this.f32852d = bVar;
        bVar.n(this);
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0549b
    public void a(int i10, Notification notification) {
        this.f32850b.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0549b
    public void c(int i10, int i11, Notification notification) {
        this.f32850b.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0549b
    public void d(int i10) {
        this.f32850b.post(new c(i10));
    }

    @Override // androidx.lifecycle.AbstractServiceC2868w, android.app.Service
    public void onCreate() {
        super.onCreate();
        f32849g = this;
        f();
    }

    @Override // androidx.lifecycle.AbstractServiceC2868w, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f32852d.l();
    }

    @Override // androidx.lifecycle.AbstractServiceC2868w, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f32851c) {
            i.e().f(f32848f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f32852d.l();
            f();
            this.f32851c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f32852d.m(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0549b
    public void stop() {
        this.f32851c = true;
        i.e().a(f32848f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f32849g = null;
        stopSelf();
    }
}
