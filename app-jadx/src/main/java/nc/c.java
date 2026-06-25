package Nc;

import Ub.u;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import expo.modules.notifications.service.NotificationsService;
import tb.InterfaceC6658a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a */
    private Handler f12793a;

    /* JADX INFO: renamed from: b */
    private InterfaceC6658a f12794b;

    /* JADX INFO: renamed from: c */
    private Pc.a f12795c;

    /* JADX INFO: renamed from: d */
    private Context f12796d;

    /* JADX INFO: renamed from: e */
    private Nc.a f12797e;

    /* JADX INFO: renamed from: f */
    private Runnable f12798f = new Runnable() { // from class: Nc.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f12792a.h();
        }
    };

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ NotificationBehaviorRecord f12799a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ u f12800b;

        /* JADX INFO: renamed from: Nc.c$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class ResultReceiverC0200a extends ResultReceiver {
            ResultReceiverC0200a(Handler handler) {
                super(handler);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i10, Bundle bundle) {
                super.onReceiveResult(i10, bundle);
                if (i10 == 0) {
                    a.this.f12800b.b();
                } else {
                    a.this.f12800b.reject("ERR_NOTIFICATION_PRESENTATION_FAILED", "Notification presentation failed.", (Exception) bundle.getSerializable("exception"));
                }
            }
        }

        a(NotificationBehaviorRecord notificationBehaviorRecord, u uVar) {
            this.f12799a = notificationBehaviorRecord;
            this.f12800b = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NotificationsService.INSTANCE.q(c.this.f12796d, c.this.f12795c, this.f12799a, new ResultReceiverC0200a(c.this.f12793a));
            c.this.f();
        }
    }

    c(Context context, InterfaceC6658a interfaceC6658a, Handler handler, Pc.a aVar, Nc.a aVar2) {
        this.f12796d = context;
        this.f12793a = handler;
        this.f12794b = interfaceC6658a;
        this.f12795c = aVar;
        this.f12797e = aVar2;
    }

    public void f() {
        this.f12793a.removeCallbacks(this.f12798f);
        this.f12797e.D(this);
    }

    public void h() {
        Bundle bundle = new Bundle();
        bundle.putString(DiagnosticsEntry.ID_KEY, g());
        bundle.putBundle("notification", Dc.c.b(this.f12795c));
        this.f12794b.a("onHandleNotificationTimeout", bundle);
        f();
    }

    String g() {
        return this.f12795c.a().b();
    }

    void i(NotificationBehaviorRecord notificationBehaviorRecord, u uVar) {
        this.f12793a.post(new a(notificationBehaviorRecord, uVar));
    }

    void j() {
        Bundle bundle = new Bundle();
        bundle.putString(DiagnosticsEntry.ID_KEY, g());
        bundle.putBundle("notification", Dc.c.b(this.f12795c));
        this.f12794b.a("onHandleNotification", bundle);
        this.f12793a.postDelayed(this.f12798f, 3000L);
    }

    void k() {
        f();
    }
}
