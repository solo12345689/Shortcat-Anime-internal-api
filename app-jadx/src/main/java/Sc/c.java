package Sc;

import Pc.g;
import Pc.j;
import Ud.AbstractC2279u;
import Yc.h;
import Zd.e;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Parcel;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.m;
import androidx.core.app.w;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import expo.modules.notifications.service.NotificationsService;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class c extends Sc.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f16082g = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f16083f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16085b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16087d;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16085b = obj;
            this.f16087d |= Integer.MIN_VALUE;
            return c.p(c.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, Pc.a notification, h store) {
        super(context, notification);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(notification, "notification");
        AbstractC5504s.h(store, "store");
        this.f16083f = store;
    }

    private final void n(Oc.a aVar, m.e eVar) {
        boolean zX = x();
        boolean zY = y();
        if (!zX && !zY) {
            eVar.J(true);
        }
        if (Build.VERSION.SDK_INT < 26) {
            boolean z10 = false;
            boolean z11 = zX && aVar.N();
            if (zY && aVar.K()) {
                z10 = true;
            }
            if (z10 && z11) {
                AbstractC5504s.e(eVar.q(-1));
                return;
            }
            if (zX) {
                if (aVar.P() != null) {
                    eVar.N(new Dc.e(d()).b(aVar.P()));
                } else if (z11) {
                    eVar.q(1);
                    eVar.N(Settings.System.DEFAULT_NOTIFICATION_URI);
                }
            }
            if (zY) {
                long[] jArrG = aVar.G();
                if (jArrG != null) {
                    eVar.T(jArrG);
                } else if (z10) {
                    eVar.q(2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object p(Sc.c r8, Zd.e r9) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Sc.c.p(Sc.c, Zd.e):java.lang.Object");
    }

    private final int v() {
        Mc.d dVarD = i().D();
        NotificationBehaviorRecord notificationBehaviorRecordH = h();
        if (notificationBehaviorRecordH == null) {
            if (dVarD != null) {
                return dVarD.k();
            }
            return 1;
        }
        Mc.d priorityOverride = notificationBehaviorRecordH.getPriorityOverride();
        if (priorityOverride != null) {
            return priorityOverride.k();
        }
        if (dVarD == null) {
            dVarD = Mc.d.DEFAULT;
        }
        int iK = dVarD.k();
        return (int) (notificationBehaviorRecordH.getShouldPresentAlert() ? Math.max(1.0d, iK) : Math.min(0.0d, iK));
    }

    private final boolean x() {
        NotificationBehaviorRecord notificationBehaviorRecordH = h();
        return (notificationBehaviorRecordH != null ? notificationBehaviorRecordH.getShouldPlaySound() : true) && (i().N() || i().P() != null);
    }

    private final boolean y() {
        NotificationBehaviorRecord notificationBehaviorRecordH = h();
        return (notificationBehaviorRecordH != null ? notificationBehaviorRecordH.getShouldPlaySound() : true) && (i().K() || i().G() != null);
    }

    public void m(m.e builder, String categoryIdentifier) {
        AbstractC5504s.h(builder, "builder");
        AbstractC5504s.h(categoryIdentifier, "categoryIdentifier");
        List<Pc.b> listM = AbstractC2279u.m();
        try {
            Pc.c cVarB = this.f16083f.b(categoryIdentifier);
            if (cVarB != null) {
                List listA = cVarB.a();
                AbstractC5504s.g(listA, "getActions(...)");
                listM = listA;
            }
        } catch (IOException e10) {
            U u10 = U.f52264a;
            String str = String.format("Could not read category with identifier: %s. %s", Arrays.copyOf(new Object[]{categoryIdentifier, e10.getMessage()}, 2));
            AbstractC5504s.g(str, "format(...)");
            Log.e("expo-notifications", str);
        } catch (ClassNotFoundException e11) {
            U u11 = U.f52264a;
            String str2 = String.format("Could not read category with identifier: %s. %s", Arrays.copyOf(new Object[]{categoryIdentifier, e11.getMessage()}, 2));
            AbstractC5504s.g(str2, "format(...)");
            Log.e("expo-notifications", str2);
        }
        for (Pc.b bVar : listM) {
            if (bVar instanceof j) {
                builder.b(r((j) bVar));
            } else {
                builder.b(q(bVar));
            }
        }
    }

    public Object o(e eVar) {
        return p(this, eVar);
    }

    protected final m.a q(Pc.b action) {
        AbstractC5504s.h(action, "action");
        m.a aVarB = new m.a.C0493a(t(), action.getTitle(), NotificationsService.INSTANCE.b(d(), g(), action)).b();
        AbstractC5504s.g(aVarB, "build(...)");
        return aVarB;
    }

    protected final m.a r(j action) {
        AbstractC5504s.h(action, "action");
        PendingIntent pendingIntentB = NotificationsService.INSTANCE.b(d(), g(), action);
        w wVarA = new w.e("userTextResponse").e(action.c()).a();
        AbstractC5504s.g(wVarA, "build(...)");
        m.a aVarB = new m.a.C0493a(t(), action.getTitle(), pendingIntentB).a(wVarA).b();
        AbstractC5504s.g(aVarB, "build(...)");
        return aVarB;
    }

    protected Number s() {
        Number numberI = i().I();
        if (numberI == null) {
            numberI = null;
            try {
                ApplicationInfo applicationInfo = d().getPackageManager().getApplicationInfo(d().getPackageName(), 128);
                AbstractC5504s.g(applicationInfo, "getApplicationInfo(...)");
                if (applicationInfo.metaData.containsKey("expo.modules.notifications.default_notification_color")) {
                    return Integer.valueOf(d().getResources().getColor(applicationInfo.metaData.getInt("expo.modules.notifications.default_notification_color"), null));
                }
            } catch (Exception e10) {
                Log.e("expo-notifications", "Could not have fetched default notification color.", e10);
            }
        }
        return numberI;
    }

    protected int t() {
        try {
            ApplicationInfo applicationInfo = d().getPackageManager().getApplicationInfo(d().getPackageName(), 128);
            AbstractC5504s.g(applicationInfo, "getApplicationInfo(...)");
            if (applicationInfo.metaData.containsKey("expo.modules.notifications.default_notification_icon")) {
                return applicationInfo.metaData.getInt("expo.modules.notifications.default_notification_icon");
            }
        } catch (Exception e10) {
            Log.e("expo-notifications", "Could not have fetched default notification icon.", e10);
        }
        return d().getApplicationInfo().icon;
    }

    protected final Bitmap u() {
        try {
            ApplicationInfo applicationInfo = d().getPackageManager().getApplicationInfo(d().getPackageName(), 128);
            AbstractC5504s.g(applicationInfo, "getApplicationInfo(...)");
            if (!applicationInfo.metaData.containsKey("expo.modules.notifications.large_notification_icon")) {
                return null;
            }
            return BitmapFactory.decodeResource(d().getResources(), applicationInfo.metaData.getInt("expo.modules.notifications.large_notification_icon"));
        } catch (Exception e10) {
            Log.e("expo-notifications", "Could not have fetched large notification icon.", e10);
            return null;
        }
    }

    protected final byte[] w(g request) {
        AbstractC5504s.h(request, "request");
        try {
            Parcel parcelObtain = Parcel.obtain();
            AbstractC5504s.g(parcelObtain, "obtain(...)");
            request.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Exception e10) {
            Log.e("expo-notifications", "Could not marshalled notification request: " + request.b() + ".", e10);
            return null;
        }
    }
}
