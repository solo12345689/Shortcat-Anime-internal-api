package Yc;

import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.O;
import Gf.P;
import Pc.e;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.m;
import androidx.core.app.q;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Zc.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22907c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f22909b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        protected final String a(StatusBarNotification notification) {
            AbstractC5504s.h(notification, "notification");
            Uri.Builder builderBuildUpon = Uri.parse("expo-notifications://foreign_notifications").buildUpon();
            String tag = notification.getTag();
            if (tag != null) {
                builderBuildUpon.appendQueryParameter("tag", tag);
            }
            builderBuildUpon.appendQueryParameter(DiagnosticsEntry.ID_KEY, String.valueOf(notification.getId()));
            String string = builderBuildUpon.toString();
            AbstractC5504s.g(string, "with(...)");
            return string;
        }

        public final Pair b(String identifier) {
            AbstractC5504s.h(identifier, "identifier");
            try {
                Uri uri = Uri.parse(identifier);
                if (!AbstractC5504s.c("expo-notifications", uri.getScheme()) || !AbstractC5504s.c("foreign_notifications", uri.getAuthority())) {
                    return null;
                }
                String queryParameter = uri.getQueryParameter("tag");
                String queryParameter2 = uri.getQueryParameter(DiagnosticsEntry.ID_KEY);
                AbstractC5504s.e(queryParameter2);
                return new Pair(queryParameter, Integer.valueOf(Integer.parseInt(queryParameter2)));
            } catch (NullPointerException e10) {
                Log.e("expo-notifications", "Malformed foreign notification identifier: " + identifier, e10);
                return null;
            } catch (NumberFormatException e11) {
                Log.e("expo-notifications", "Malformed foreign notification identifier: " + identifier, e11);
                return null;
            } catch (UnsupportedOperationException e12) {
                Log.e("expo-notifications", "Malformed foreign notification identifier: " + identifier, e12);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22910a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pc.a f22912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ NotificationBehaviorRecord f22913d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Pc.a aVar, NotificationBehaviorRecord notificationBehaviorRecord, Zd.e eVar) {
            super(2, eVar);
            this.f22912c = aVar;
            this.f22913d = notificationBehaviorRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return e.this.new b(this.f22912c, this.f22913d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f22910a;
            if (i10 == 0) {
                v.b(obj);
                e eVar = e.this;
                Pc.a aVar = this.f22912c;
                NotificationBehaviorRecord notificationBehaviorRecord = this.f22913d;
                this.f22910a = 1;
                obj = eVar.e(aVar, notificationBehaviorRecord, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            q.i(e.this.h()).q(this.f22912c.a().b(), e.this.k(this.f22912c.a()), (Notification) obj);
            return L.f17438a;
        }
    }

    public e(Context context, q notificationManager) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(notificationManager, "notificationManager");
        this.f22908a = context;
        this.f22909b = notificationManager;
    }

    static /* synthetic */ Object f(e eVar, Pc.a aVar, NotificationBehaviorRecord notificationBehaviorRecord, Zd.e eVar2) {
        Sc.c cVar = new Sc.c(eVar.f22908a, aVar, new h(eVar.f22908a));
        cVar.l(notificationBehaviorRecord);
        return cVar.o(eVar2);
    }

    private final Uri j(Pc.a aVar) {
        NotificationChannel notificationChannelL;
        if (Build.VERSION.SDK_INT < 26) {
            return new Dc.e(this.f22908a).b(aVar.a().a().P());
        }
        String strT = aVar.a().c().t();
        if (strT == null || (notificationChannelL = this.f22909b.l(strT)) == null) {
            return null;
        }
        return notificationChannelL.getSound();
    }

    @Override // Zc.d
    public void a(Collection identifiers) {
        Object next;
        AbstractC5504s.h(identifiers, "identifiers");
        Iterator it = identifiers.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Pair pairB = f22907c.b(str);
            if (pairB != null) {
                q qVarI = q.i(this.f22908a);
                String str2 = (String) pairB.first;
                Object second = pairB.second;
                AbstractC5504s.g(second, "second");
                qVarI.c(str2, ((Number) second).intValue());
            } else {
                Iterator it2 = b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (AbstractC5504s.c(((Pc.a) next).a().b(), str)) {
                            break;
                        }
                    }
                }
                Pc.a aVar = (Pc.a) next;
                q.i(this.f22908a).c(str, k(aVar != null ? aVar.a() : null));
            }
        }
    }

    @Override // Zc.d
    public Collection b() {
        Object systemService = this.f22908a.getSystemService("notification");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        StatusBarNotification[] activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
        AbstractC5504s.g(activeNotifications, "getActiveNotifications(...)");
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            AbstractC5504s.e(statusBarNotification);
            Pc.a aVarI = i(statusBarNotification);
            if (aVarI != null) {
                arrayList.add(aVarI);
            }
        }
        return arrayList;
    }

    @Override // Zc.d
    public void c(Pc.a notification, NotificationBehaviorRecord notificationBehaviorRecord) {
        AbstractC5504s.h(notification, "notification");
        if (notificationBehaviorRecord == null || notificationBehaviorRecord.getShouldPresentAlert()) {
            AbstractC1617k.d(P.a(C1608f0.b()), null, null, new b(notification, notificationBehaviorRecord, null), 3, null);
        } else if (notificationBehaviorRecord.getShouldPlaySound()) {
            Uri uriJ = j(notification);
            if (uriJ == null) {
                uriJ = Settings.System.DEFAULT_NOTIFICATION_URI;
            }
            RingtoneManager.getRingtone(this.f22908a, uriJ).play();
        }
    }

    @Override // Zc.d
    public void d() {
        q.i(this.f22908a).d();
    }

    protected Object e(Pc.a aVar, NotificationBehaviorRecord notificationBehaviorRecord, Zd.e eVar) {
        return f(this, aVar, notificationBehaviorRecord, eVar);
    }

    protected JSONObject g(Bundle bundle) {
        AbstractC5504s.h(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
            } catch (JSONException e10) {
                Log.d("expo-notifications", "Error encountered while serializing Android notification extras: " + str + " -> " + bundle.get(str), e10);
            }
        }
        return jSONObject;
    }

    protected final Context h() {
        return this.f22908a;
    }

    protected Pc.a i(StatusBarNotification statusBarNotification) {
        AbstractC5504s.h(statusBarNotification, "statusBarNotification");
        Notification notification = statusBarNotification.getNotification();
        byte[] byteArray = notification.extras.getByteArray("expo.notification_request");
        if (byteArray != null) {
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                Pc.g gVarCreateFromParcel = Pc.g.CREATOR.createFromParcel(parcelObtain);
                AbstractC5504s.g(gVarCreateFromParcel, "createFromParcel(...)");
                parcelObtain.recycle();
                return new Pc.a(gVarCreateFromParcel, new Date(statusBarNotification.getPostTime()));
            } catch (Exception unused) {
                Log.e("expo-notifications", "Could not have unmarshalled NotificationRequest from (" + statusBarNotification.getTag() + ", " + statusBarNotification.getId() + ").");
            }
        }
        e.b bVar = new e.b();
        CharSequence charSequenceC = m.c(notification);
        e.b bVarL = bVar.l(charSequenceC != null ? charSequenceC.toString() : null);
        CharSequence charSequenceB = m.b(notification);
        e.b bVarK = bVarL.k(charSequenceB != null ? charSequenceB.toString() : null);
        CharSequence charSequenceF = m.f(notification);
        e.b bVarH = bVarK.j(charSequenceF != null ? charSequenceF.toString() : null).b(m.a(notification)).i(m.e(notification)).g(Mc.d.c(notification.priority)).m(notification.vibrate).h(notification.sound);
        Bundle extras = notification.extras;
        AbstractC5504s.g(extras, "extras");
        return new Pc.a(new Pc.g(f22907c.a(statusBarNotification), bVarH.d(g(extras)).a(), null), new Date(statusBarNotification.getPostTime()));
    }

    protected int k(Pc.g gVar) {
        return 0;
    }

    public /* synthetic */ e(Context context, q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? q.i(context) : qVar);
    }
}
