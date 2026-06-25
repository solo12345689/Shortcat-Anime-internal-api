package Sc;

import Ic.f;
import Oc.d;
import Pc.g;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.core.app.m;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import r4.AbstractC6254i;
import r4.AbstractC6264t;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Oc.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0276a f16067d = new C0276a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f16068e = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pc.a f16070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NotificationBehaviorRecord f16071c;

    /* JADX INFO: renamed from: Sc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0276a {
        public /* synthetic */ C0276a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0276a() {
        }
    }

    protected a(Context context, Pc.a notification) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(notification, "notification");
        this.f16069a = context;
        this.f16070b = notification;
    }

    private final String e() {
        String string = this.f16069a.getString(Bc.c.f1649a);
        AbstractC5504s.g(string, "getString(...)");
        return string;
    }

    private final NotificationChannel f() {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        NotificationChannel notificationChannel = j().getNotificationChannel("expo_notifications_fallback_notification_channel");
        return notificationChannel == null ? b() : notificationChannel;
    }

    private final NotificationManager j() {
        Object systemService = this.f16069a.getSystemService("notification");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public final m.e a() {
        String strC = c();
        return strC != null ? new m.e(this.f16069a, strC) : new m.e(this.f16069a);
    }

    protected final NotificationChannel b() {
        AbstractC6264t.a();
        NotificationChannel notificationChannelA = AbstractC6254i.a("expo_notifications_fallback_notification_channel", e(), f16068e);
        notificationChannelA.setShowBadge(true);
        notificationChannelA.enableVibration(true);
        j().createNotificationChannel(notificationChannelA);
        return notificationChannelA;
    }

    protected final String c() {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        g gVarA = this.f16070b.a();
        d dVarC = gVarA != null ? gVarA.c() : null;
        if (dVarC == null) {
            U u10 = U.f52264a;
            String str = String.format("Couldn't get channel for the notifications - trigger is 'null'. Fallback to '%s' channel", Arrays.copyOf(new Object[]{"expo_notifications_fallback_notification_channel"}, 1));
            AbstractC5504s.g(str, "format(...)");
            Log.e("notifications", str);
            NotificationChannel notificationChannelF = f();
            AbstractC5504s.e(notificationChannelF);
            return notificationChannelF.getId();
        }
        String strT = dVarC.t();
        if (strT == null) {
            NotificationChannel notificationChannelF2 = f();
            AbstractC5504s.e(notificationChannelF2);
            return notificationChannelF2.getId();
        }
        NotificationChannel notificationChannelB = k().b(strT);
        if (notificationChannelB != null) {
            return notificationChannelB.getId();
        }
        U u11 = U.f52264a;
        String str2 = String.format("Channel '%s' doesn't exists. Fallback to '%s' channel", Arrays.copyOf(new Object[]{strT, "expo_notifications_fallback_notification_channel"}, 2));
        AbstractC5504s.g(str2, "format(...)");
        Log.e("notifications", str2);
        NotificationChannel notificationChannelF3 = f();
        AbstractC5504s.e(notificationChannelF3);
        return notificationChannelF3.getId();
    }

    protected final Context d() {
        return this.f16069a;
    }

    protected final Pc.a g() {
        return this.f16070b;
    }

    protected final NotificationBehaviorRecord h() {
        return this.f16071c;
    }

    protected final Oc.a i() {
        Oc.a aVarA = this.f16070b.a().a();
        AbstractC5504s.g(aVarA, "getContent(...)");
        return aVarA;
    }

    public f k() {
        Context context = this.f16069a;
        return new Ic.d(context, new Ic.b(context));
    }

    public Oc.b l(NotificationBehaviorRecord notificationBehaviorRecord) {
        this.f16071c = notificationBehaviorRecord;
        return this;
    }
}
