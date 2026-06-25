package com.google.firebase.messaging;

import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.m;
import java.util.concurrent.atomic.AtomicInteger;
import r4.AbstractC6254i;
import y1.AbstractC7194b;

/* JADX INFO: renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3966d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f43420a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: com.google.firebase.messaging.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m.e f43421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f43422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43423c;

        a(m.e eVar, String str, int i10) {
            this.f43421a = eVar;
            this.f43422b = str;
            this.f43423c = i10;
        }
    }

    private static PendingIntent a(Context context, N n10, String str, PackageManager packageManager) {
        Intent intentF = f(str, n10, packageManager);
        if (intentF == null) {
            return null;
        }
        intentF.addFlags(67108864);
        intentF.putExtras(n10.y());
        if (q(n10)) {
            intentF.putExtra("gcm.n.analytics_data", n10.x());
        }
        return PendingIntent.getActivity(context, g(), intentF, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, N n10) {
        if (q(n10)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(n10.x()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, N n10, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        m.e eVar = new m.e(context2, str);
        String strN = n10.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strN)) {
            eVar.p(strN);
        }
        String strN2 = n10.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strN2)) {
            eVar.o(strN2);
            eVar.O(new m.c().h(strN2));
        }
        eVar.K(m(packageManager, resources, packageName, n10.p("gcm.n.icon"), bundle));
        Uri uriN = n(packageName, n10, resources);
        if (uriN != null) {
            eVar.N(uriN);
        }
        eVar.n(a(context, n10, packageName, packageManager));
        PendingIntent pendingIntentB = b(context, context2, n10);
        if (pendingIntentB != null) {
            eVar.r(pendingIntentB);
        }
        Integer numH = h(context2, n10.p("gcm.n.color"), bundle);
        if (numH != null) {
            eVar.l(numH.intValue());
        }
        eVar.g(!n10.a("gcm.n.sticky"));
        eVar.A(n10.a("gcm.n.local_only"));
        String strP = n10.p("gcm.n.ticker");
        if (strP != null) {
            eVar.Q(strP);
        }
        Integer numM = n10.m();
        if (numM != null) {
            eVar.E(numM.intValue());
        }
        Integer numR = n10.r();
        if (numR != null) {
            eVar.U(numR.intValue());
        }
        Integer numL = n10.l();
        if (numL != null) {
            eVar.B(numL.intValue());
        }
        Long lJ = n10.j("gcm.n.event_time");
        if (lJ != null) {
            eVar.I(true);
            eVar.V(lJ.longValue());
        }
        long[] jArrQ = n10.q();
        if (jArrQ != null) {
            eVar.T(jArrQ);
        }
        int[] iArrE = n10.e();
        if (iArrE != null) {
            eVar.z(iArrE[0], iArrE[1], iArrE[2]);
        }
        eVar.q(i(n10));
        return new a(eVar, o(n10), 0);
    }

    static a e(Context context, N n10) {
        Bundle bundleJ = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, n10, k(context, n10.k(), bundleJ), bundleJ);
    }

    private static Intent f(String str, N n10, PackageManager packageManager) {
        String strP = n10.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strP)) {
            Intent intent = new Intent(strP);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriF = n10.f();
        if (uriF != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriF);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f43420a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(AbstractC7194b.c(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int i(N n10) {
        boolean zA = n10.a("gcm.n.default_sound");
        ?? r02 = zA;
        if (n10.a("gcm.n.default_vibrate_timings")) {
            r02 = (zA ? 1 : 0) | 2;
        }
        return n10.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(AbstractC6254i.a("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i10) {
        return i10 | 67108864;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        return (i10 == 0 || !p(resources, i10)) ? R.drawable.sym_def_app_icon : i10;
    }

    private static Uri n(String str, N n10, Resources resources) {
        String strO = n10.o();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        if ("default".equals(strO) || resources.getIdentifier(strO, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strO);
    }

    private static String o(N n10) {
        String strP = n10.p("gcm.n.tag");
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC3965c.a(resources.getDrawable(i10, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(N n10) {
        return n10.a("google.c.a.e");
    }
}
