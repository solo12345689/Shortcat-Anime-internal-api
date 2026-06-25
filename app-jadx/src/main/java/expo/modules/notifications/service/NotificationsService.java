package expo.modules.notifications.service;

import Pc.a;
import Pc.b;
import Pc.c;
import Pc.g;
import Pc.h;
import Pc.j;
import Pc.l;
import Td.L;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Yc.e;
import Yc.f;
import Zc.d;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.core.app.w;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import expo.modules.notifications.service.NotificationsService;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0016J\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u001f\u0010\"\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u001bJ\u001f\u0010#\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u001bJ\u001f\u0010$\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\u001bJ\u001f\u0010%\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\u001bJ\u001f\u0010&\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u0016J\u001f\u0010'\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u0016J\u001f\u0010(\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0016J\u001f\u0010)\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010\u0016J\u001f\u0010*\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010\u0016¨\u0006,"}, d2 = {"Lexpo/modules/notifications/service/NotificationsService;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "LZc/d;", "d", "(Landroid/content/Context;)LZc/d;", "LZc/c;", "c", "(Landroid/content/Context;)LZc/c;", "LZc/a;", "b", "(Landroid/content/Context;)LZc/a;", "LZc/e;", "e", "(Landroid/content/Context;)LZc/e;", "Landroid/content/Intent;", "intent", "LTd/L;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "f", "p", "Landroid/os/Bundle;", "j", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/os/Bundle;", "i", "h", "r", "s", "o", "l", "w", "g", "k", "m", "v", "n", "u", "t", "x", "a", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class NotificationsService extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    private static final List f46259b = AbstractC2279u.p("android.intent.action.BOOT_COMPLETED", "android.intent.action.REBOOT", "android.intent.action.MY_PACKAGE_REPLACED", "android.intent.action.QUICKBOOT_POWERON", "com.htc.intent.action.QUICKBOOT_POWERON");

    /* JADX INFO: renamed from: expo.modules.notifications.service.NotificationsService$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object C(Parcelable.Creator creator, byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            try {
                Parcel parcelObtain = Parcel.obtain();
                AbstractC5504s.g(parcelObtain, "obtain(...)");
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                Object objCreateFromParcel = creator.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                return objCreateFromParcel;
            } catch (Exception e10) {
                Log.e("expo-notifications", "Could not unmarshall NotificationResponse from Intent.extra.", e10);
                return null;
            }
        }

        private final byte[] p(Parcelable parcelable) {
            Parcel parcelObtain = Parcel.obtain();
            AbstractC5504s.g(parcelObtain, "obtain(...)");
            parcelable.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            AbstractC5504s.g(bArrMarshall, "marshall(...)");
            parcelObtain.recycle();
            return bArrMarshall;
        }

        public static /* synthetic */ void r(Companion companion, Context context, a aVar, NotificationBehaviorRecord notificationBehaviorRecord, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                notificationBehaviorRecord = null;
            }
            if ((i10 & 8) != 0) {
                resultReceiver = null;
            }
            companion.q(context, aVar, notificationBehaviorRecord, resultReceiver);
        }

        public static /* synthetic */ void t(Companion companion, Context context, a aVar, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.s(context, aVar, resultReceiver);
        }

        public static /* synthetic */ void w(Companion companion, Context context, String str, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.v(context, str, resultReceiver);
        }

        public static /* synthetic */ void z(Companion companion, Context context, g gVar, ResultReceiver resultReceiver, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                resultReceiver = null;
            }
            companion.y(context, gVar, resultReceiver);
        }

        public final void A(Context context, c category, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(category, "category");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("categories").appendPath(category.b()).build());
            intent.putExtra("type", "setCategory");
            intent.putExtra("notificationCategory", (Parcelable) category);
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final void B(Intent intent, h notificationResponse) {
            AbstractC5504s.h(intent, "intent");
            AbstractC5504s.h(notificationResponse, "notificationResponse");
            try {
                AbstractC5504s.e(intent.putExtra(notificationResponse instanceof l ? "textInputNotificationResponse" : "notificationResponse", p(notificationResponse)));
            } catch (Exception e10) {
                Log.e("expo-notifications", "Could not marshal notification response: " + notificationResponse.b() + ".");
                e10.printStackTrace();
            }
        }

        public final Intent a(Context context, Intent intent) {
            a aVar;
            b bVar;
            b bVar2;
            Bundle bundleO;
            AbstractC5504s.h(context, "context");
            String string = null;
            Bundle extras = intent != null ? intent.getExtras() : null;
            if (extras == null || (aVar = (a) extras.getParcelable("notification")) == null) {
                Parcelable.Creator<a> CREATOR = a.CREATOR;
                AbstractC5504s.g(CREATOR, "CREATOR");
                aVar = (a) C(CREATOR, extras != null ? extras.getByteArray("notificationBytes") : null);
            }
            if (extras == null || (bVar = (b) extras.getParcelable("notificationAction")) == null) {
                Parcelable.Creator<b> CREATOR2 = b.CREATOR;
                AbstractC5504s.g(CREATOR2, "CREATOR");
                bVar = (b) C(CREATOR2, extras != null ? extras.getByteArray("notificationActionBytes") : null);
            }
            if (aVar == null || bVar == null) {
                throw new IllegalArgumentException("notification (" + aVar + ") and action (" + bVar + ") should not be null");
            }
            if (intent != null && (bundleO = w.o(intent)) != null) {
                string = bundleO.getString("userTextResponse");
            }
            boolean z10 = string != null && (bVar instanceof j);
            if (z10) {
                j jVar = (j) bVar;
                bVar2 = new j(jVar.a(), jVar.getTitle(), false, jVar.c());
            } else {
                bVar2 = new b(bVar.a(), bVar.getTitle(), false);
            }
            Intent intent2 = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath(aVar.a().b()).appendPath("actions").appendPath(bVar2.a()).build());
            ActivityInfo activityInfoH = NotificationsService.INSTANCE.h(context, intent2);
            if (activityInfoH != null) {
                intent2.setComponent(new ComponentName(activityInfoH.packageName, activityInfoH.name));
            }
            intent2.putExtra("type", "receiveResponse");
            intent2.putExtra("notification", aVar);
            intent2.putExtra("notificationAction", (Parcelable) bVar2);
            if (z10) {
                w wVarA = new w.e("userTextResponse").a();
                AbstractC5504s.g(wVarA, "build(...)");
                Bundle bundle = new Bundle();
                bundle.putString("userTextResponse", string);
                w.b(new w[]{wVarA}, intent2, bundle);
            }
            return intent2;
        }

        public final PendingIntent b(Context context, a notification, b action) {
            String className;
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(notification, "notification");
            AbstractC5504s.h(action, "action");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath(notification.a().b()).appendPath("actions").appendPath(action.a()).build());
            Companion companion = NotificationsService.INSTANCE;
            ActivityInfo activityInfoH = companion.h(context, intent);
            if (activityInfoH != null) {
                intent.setComponent(new ComponentName(activityInfoH.packageName, activityInfoH.name));
            }
            intent.putExtra("type", "receiveResponse");
            intent.putExtra("notification", notification);
            intent.putExtra("notificationAction", (Parcelable) action);
            byte[] bArrP = companion.p(notification);
            if (bArrP != null) {
                intent.putExtra("notificationBytes", bArrP);
            }
            byte[] bArrP2 = companion.p(action);
            if (bArrP2 != null) {
                intent.putExtra("notificationActionBytes", bArrP2);
            }
            if (action.b() && Build.VERSION.SDK_INT >= 31) {
                return Yc.c.f22903b.b(context, intent);
            }
            int i10 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
            ComponentName component = intent.getComponent();
            PendingIntent broadcast = PendingIntent.getBroadcast(context, (component == null || (className = component.getClassName()) == null) ? NotificationsService.class.hashCode() : className.hashCode(), intent, i10 | 134217728);
            AbstractC5504s.g(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final PendingIntent c(Context context, String identifier) {
            String className;
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(identifier, "identifier");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("scheduled").appendPath(identifier).appendPath("trigger").build());
            ActivityInfo activityInfoH = NotificationsService.INSTANCE.h(context, intent);
            if (activityInfoH != null) {
                intent.setComponent(new ComponentName(activityInfoH.packageName, activityInfoH.name));
            }
            intent.putExtra("type", "trigger");
            intent.putExtra("identifier", identifier);
            int i10 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
            ComponentName component = intent.getComponent();
            PendingIntent broadcast = PendingIntent.getBroadcast(context, (component == null || (className = component.getClassName()) == null) ? NotificationsService.class.hashCode() : className.hashCode(), intent, i10 | 134217728);
            AbstractC5504s.g(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        public final void d(Context context, String identifier, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(identifier, "identifier");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("categories").appendPath(identifier).build());
            intent.putExtra("type", "deleteCategory");
            intent.putExtra("identifier", identifier);
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final void e(Context context, String[] identifiers, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(identifiers, "identifiers");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("dismiss").build());
            intent.putExtra("type", "dismissSelected");
            intent.putExtra("identifiers", identifiers);
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final void f(Context context, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("dismiss").build());
            intent.putExtra("type", "dismissAll");
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final void g(Context context, Intent intent) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(intent, "intent");
            ActivityInfo activityInfoH = h(context, intent);
            if (activityInfoH != null) {
                intent.setComponent(new ComponentName(activityInfoH.packageName, activityInfoH.name));
                context.sendBroadcast(intent);
                return;
            }
            Log.e("expo-notifications", "No service capable of handling notifications found (intent = " + intent.getAction() + "). Ensure that you have configured your AndroidManifest.xml properly.");
        }

        public final h getNotificationResponseFromOpenIntent(Intent intent) {
            AbstractC5504s.h(intent, "intent");
            byte[] byteArrayExtra = intent.getByteArrayExtra("notificationResponse");
            if (byteArrayExtra != null) {
                Companion companion = NotificationsService.INSTANCE;
                Parcelable.Creator<h> CREATOR = h.CREATOR;
                AbstractC5504s.g(CREATOR, "CREATOR");
                return (h) companion.C(CREATOR, byteArrayExtra);
            }
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("textInputNotificationResponse");
            if (byteArrayExtra2 == null) {
                return null;
            }
            Companion companion2 = NotificationsService.INSTANCE;
            Parcelable.Creator<l> CREATOR2 = l.CREATOR;
            AbstractC5504s.g(CREATOR2, "CREATOR");
            return (h) companion2.C(CREATOR2, byteArrayExtra2);
        }

        public final void getScheduledNotification(Context context, String identifier, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(identifier, "identifier");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("scheduled").appendPath(identifier).build());
            intent.putExtra("type", "getScheduled");
            intent.putExtra("identifier", identifier);
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final ActivityInfo h(Context context, Intent intent) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(intent, "intent");
            Intent intent2 = new Intent(intent.getAction()).setPackage(context.getPackageName());
            AbstractC5504s.g(intent2, "setPackage(...)");
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 0);
            AbstractC5504s.g(listQueryBroadcastReceivers, "queryBroadcastReceivers(...)");
            ResolveInfo resolveInfo = (ResolveInfo) AbstractC2279u.o0(listQueryBroadcastReceivers);
            if (resolveInfo != null) {
                return resolveInfo.activityInfo;
            }
            return null;
        }

        public final void i(Context context, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().build());
            intent.putExtra("type", "getAllDisplayed");
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final void j(Context context, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT");
            intent.putExtra("type", "getAllScheduled");
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final void k(Context context, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("categories").build());
            intent.putExtra("type", "getCategories");
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final h l(Intent intent) {
            String string;
            AbstractC5504s.h(intent, "intent");
            a aVar = (a) intent.getParcelableExtra("notification");
            if (aVar == null) {
                Parcelable.Creator<a> CREATOR = a.CREATOR;
                AbstractC5504s.g(CREATOR, "CREATOR");
                aVar = (a) C(CREATOR, intent.getByteArrayExtra("notificationBytes"));
                if (aVar == null) {
                    throw new IllegalArgumentException("notification not found in the intent extras.");
                }
            }
            b bVar = (b) intent.getParcelableExtra("notificationAction");
            if (bVar == null) {
                Parcelable.Creator<b> CREATOR2 = b.CREATOR;
                AbstractC5504s.g(CREATOR2, "CREATOR");
                bVar = (b) C(CREATOR2, intent.getByteArrayExtra("notificationActionBytes"));
                if (bVar == null) {
                    throw new IllegalArgumentException("notificationAction not found in the intent extras.");
                }
            }
            if (!(bVar instanceof j)) {
                return new h(bVar, aVar);
            }
            Bundle bundleO = w.o(intent);
            if (bundleO == null || (string = bundleO.getString("userTextResponse")) == null) {
                string = "";
            }
            return new l(bVar, aVar, string);
        }

        protected final Uri.Builder m() {
            Uri.Builder builderBuildUpon = Uri.parse("expo-notifications://notifications/").buildUpon();
            AbstractC5504s.g(builderBuildUpon, "buildUpon(...)");
            return builderBuildUpon;
        }

        protected final Uri.Builder n(String identifier) {
            AbstractC5504s.h(identifier, "identifier");
            Uri.Builder builderAppendPath = m().appendPath(identifier);
            AbstractC5504s.g(builderAppendPath, "appendPath(...)");
            return builderAppendPath;
        }

        public final void o(Context context) {
            AbstractC5504s.h(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT");
            intent.putExtra("type", "dropped");
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final void q(Context context, a notification, NotificationBehaviorRecord notificationBehaviorRecord, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(notification, "notification");
            String strB = notification.a().b();
            AbstractC5504s.g(strB, "getIdentifier(...)");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", n(strB).appendPath("present").build());
            intent.putExtra("type", "present");
            intent.putExtra("notification", notification);
            intent.putExtra("notificationBehavior", notificationBehaviorRecord);
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final void s(Context context, a notification, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(notification, "notification");
            String strB = notification.a().b();
            AbstractC5504s.g(strB, "getIdentifier(...)");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", n(strB).appendPath("receive").build());
            intent.putExtra("type", "receive");
            intent.putExtra("notification", notification);
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final void u(Context context, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT");
            intent.putExtra("type", "removeAll");
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final void v(Context context, String identifier, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(identifier, "identifier");
            x(context, AbstractC2279u.e(identifier), resultReceiver);
        }

        public final void x(Context context, Collection identifiers, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(identifiers, "identifiers");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("scheduled").build());
            intent.putExtra("type", "removeSelected");
            intent.putExtra("identifiers", (String[]) identifiers.toArray(new String[0]));
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        public final void y(Context context, g notificationRequest, ResultReceiver resultReceiver) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(notificationRequest, "notificationRequest");
            Intent intent = new Intent("expo.modules.notifications.NOTIFICATION_EVENT", m().appendPath("scheduled").appendPath(notificationRequest.b()).build());
            intent.putExtra("type", "schedule");
            intent.putExtra("notificationRequest", (Parcelable) notificationRequest);
            intent.putExtra("receiver", resultReceiver);
            L l10 = L.f17438a;
            g(context, intent);
        }

        private Companion() {
        }
    }

    public static final L q(Intent intent, BroadcastReceiver.PendingResult pendingResult, NotificationsService notificationsService, Context context) {
        if (intent != null) {
            try {
                notificationsService.f(context, intent);
            } catch (Throwable th2) {
                pendingResult.finish();
                throw th2;
            }
        }
        pendingResult.finish();
        return L.f17438a;
    }

    protected Zc.a b(Context context) {
        AbstractC5504s.h(context, "context");
        return new Yc.b(context);
    }

    protected Zc.c c(Context context) {
        AbstractC5504s.h(context, "context");
        return new Yc.c(context);
    }

    protected d d(Context context) {
        AbstractC5504s.h(context, "context");
        return new e(context, null, 2, null);
    }

    protected Zc.e e(Context context) {
        AbstractC5504s.h(context, "context");
        return new f(context);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:157:0x011d A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:101:0x003b, B:103:0x0043, B:104:0x0047, B:106:0x004c, B:108:0x0054, B:157:0x011d, B:111:0x005d, B:113:0x0065, B:114:0x006a, B:116:0x0072, B:117:0x0077, B:119:0x007f, B:120:0x0084, B:122:0x008c, B:123:0x0092, B:125:0x009a, B:126:0x009f, B:128:0x00a7, B:129:0x00ad, B:131:0x00b5, B:132:0x00b9, B:134:0x00c1, B:135:0x00c5, B:137:0x00cd, B:138:0x00d1, B:140:0x00d9, B:141:0x00dd, B:143:0x00e5, B:144:0x00e9, B:146:0x00f1, B:147:0x00f6, B:149:0x00fe, B:150:0x0103, B:152:0x010b, B:153:0x0110, B:155:0x0118, B:159:0x0124, B:160:0x013d), top: B:167:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(android.content.Context r6, android.content.Intent r7) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.notifications.service.NotificationsService.f(android.content.Context, android.content.Intent):void");
    }

    public Bundle g(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        Bundle bundle = new Bundle();
        Zc.a aVarB = b(context);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("identifier") : null;
        AbstractC5504s.e(string);
        bundle.putBoolean("succeeded", aVarB.b(string));
        return bundle;
    }

    public void h(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        d(context).d();
    }

    public void i(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        d dVarD = d(context);
        Bundle extras = intent.getExtras();
        String[] stringArray = extras != null ? extras.getStringArray("identifiers") : null;
        AbstractC5504s.e(stringArray);
        dVarD.a(AbstractC2273n.e(stringArray));
    }

    public Bundle j(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("notifications", new ArrayList<>(d(context).b()));
        return bundle;
    }

    public Bundle k(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("notificationRequests", new ArrayList<>(e(context).f()));
        return bundle;
    }

    public Bundle l(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("notificationCategories", new ArrayList<>(b(context).c()));
        return bundle;
    }

    public Bundle m(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        Bundle bundle = new Bundle();
        Zc.e eVarE = e(context);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("identifier") : null;
        AbstractC5504s.e(string);
        bundle.putParcelable("notificationRequest", eVarE.e(string));
        return bundle;
    }

    public void n(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        Zc.e eVarE = e(context);
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("identifier") : null;
        AbstractC5504s.e(string);
        eVarE.a(string);
    }

    public void o(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        c(context).a();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        AbstractC5504s.h(context, "context");
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Yd.a.b(false, false, null, null, 0, new InterfaceC5082a() { // from class: Xc.b
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return NotificationsService.q(intent, pendingResultGoAsync, this, context);
            }
        }, 31, null);
    }

    public void p(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        d dVarD = d(context);
        Bundle extras = intent.getExtras();
        a aVar = extras != null ? (a) extras.getParcelable("notification") : null;
        AbstractC5504s.e(aVar);
        Bundle extras2 = intent.getExtras();
        dVarD.c(aVar, extras2 != null ? (NotificationBehaviorRecord) extras2.getParcelable("notificationBehavior") : null);
    }

    public void r(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        Zc.c cVarC = c(context);
        Parcelable parcelableExtra = intent.getParcelableExtra("notification");
        AbstractC5504s.e(parcelableExtra);
        cVarC.c((a) parcelableExtra);
    }

    public void s(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        c(context).b(INSTANCE.l(intent));
    }

    public void t(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        e(context).c();
    }

    public void u(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        Zc.e eVarE = e(context);
        Bundle extras = intent.getExtras();
        String[] stringArray = extras != null ? extras.getStringArray("identifiers") : null;
        AbstractC5504s.e(stringArray);
        eVarE.d(AbstractC2273n.e(stringArray));
    }

    public void v(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        Zc.e eVarE = e(context);
        Bundle extras = intent.getExtras();
        g gVar = extras != null ? (g) extras.getParcelable("notificationRequest") : null;
        AbstractC5504s.e(gVar);
        eVarE.g(gVar);
    }

    public Bundle w(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        Bundle bundle = new Bundle();
        Zc.a aVarB = b(context);
        Parcelable parcelableExtra = intent.getParcelableExtra("notificationCategory");
        AbstractC5504s.e(parcelableExtra);
        bundle.putParcelable("notificationCategory", aVarB.a((c) parcelableExtra));
        return bundle;
    }

    public void x(Context context, Intent intent) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(intent, "intent");
        e(context).b();
    }
}
