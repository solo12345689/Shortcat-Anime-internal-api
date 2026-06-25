package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.util.concurrent.ExecutionException;
import p8.AbstractC5939d;
import p8.AbstractC5941f;
import p8.C5938c;
import p8.InterfaceC5942g;
import p8.InterfaceC5944i;
import sa.C6444a;
import sa.C6445b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class L {
    static void A(String str, Bundle bundle) {
        try {
            X9.e.n();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strD = d(bundle);
            if (strD != null) {
                bundle2.putString("_nmid", strD);
            }
            String strE = e(bundle);
            if (strE != null) {
                bundle2.putString("_nmn", strE);
            }
            String strI = i(bundle);
            if (!TextUtils.isEmpty(strI)) {
                bundle2.putString("label", strI);
            }
            String strG = g(bundle);
            if (!TextUtils.isEmpty(strG)) {
                bundle2.putString("message_channel", strG);
            }
            String strR = r(bundle);
            if (strR != null) {
                bundle2.putString("_nt", strR);
            }
            String strL = l(bundle);
            if (strL != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strL));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String strT = t(bundle);
            if (strT != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strT));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String strN = n(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strN);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            Y9.a aVar = (Y9.a) X9.e.n().j(Y9.a.class);
            if (aVar != null) {
                aVar.a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    static void B(boolean z10) {
        X9.e.n().l().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z10).apply();
    }

    private static void C(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        Y9.a aVar = (Y9.a) X9.e.n().j(Y9.a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (aVar == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        aVar.b("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString(Constants.MEDIUM, "notification");
        bundle2.putString("campaign", string);
        aVar.a("fcm", "_cmp", bundle2);
    }

    public static boolean D(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return a();
    }

    public static boolean E(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return F(intent.getExtras());
    }

    public static boolean F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            X9.e.n();
            Context contextL = X9.e.n().l();
            SharedPreferences sharedPreferences = contextL.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextL.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextL.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static C6444a b(C6444a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C6444a.C0898a c0898aJ = C6444a.p().n(s(extras)).e(bVar).f(f(extras)).i(o()).l(C6444a.d.ANDROID).h(m(extras)).j(k(extras));
        String strH = h(extras);
        if (strH != null) {
            c0898aJ.g(strH);
        }
        String strR = r(extras);
        if (strR != null) {
            c0898aJ.m(strR);
        }
        String strC = c(extras);
        if (strC != null) {
            c0898aJ.c(strC);
        }
        String strI = i(extras);
        if (strI != null) {
            c0898aJ.b(strI);
        }
        String strE = e(extras);
        if (strE != null) {
            c0898aJ.d(strE);
        }
        long jQ = q(extras);
        if (jQ > 0) {
            c0898aJ.k(jQ);
        }
        return c0898aJ.a();
    }

    static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) n9.l.a(com.google.firebase.installations.c.q(X9.e.n()).getId());
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    private static int j(String str) {
        if (Constants.HIGH.equals(str)) {
            return 1;
        }
        return Constants.NORMAL.equals(str) ? 2 : 0;
    }

    static int k(Bundle bundle) {
        int iP = p(bundle);
        if (iP == 2) {
            return 5;
        }
        return iP == 1 ? 10 : 0;
    }

    static String l(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static C6444a.c m(Bundle bundle) {
        return (bundle == null || !N.t(bundle)) ? C6444a.c.DATA_MESSAGE : C6444a.c.DISPLAY_NOTIFICATION;
    }

    static String n(Bundle bundle) {
        return (bundle == null || !N.t(bundle)) ? "data" : "display";
    }

    static String o() {
        return X9.e.n().l().getPackageName();
    }

    static int p(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return j(string);
    }

    static long q(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing project number", e10);
            }
        }
        X9.e eVarN = X9.e.n();
        String strF = eVarN.q().f();
        if (strF != null) {
            try {
                return Long.parseLong(strF);
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e11);
            }
        }
        String strC = eVarN.q().c();
        if (strC.startsWith("1:")) {
            String[] strArrSplit = strC.split(com.revenuecat.purchases.common.Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e12) {
                Log.w("FirebaseMessaging", "error parsing app ID", e12);
            }
        } else {
            try {
                return Long.parseLong(strC);
            } catch (NumberFormatException e13) {
                Log.w("FirebaseMessaging", "error parsing app ID", e13);
            }
        }
        return 0L;
    }

    static String r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int s(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    static String t(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static boolean u(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A("_nd", intent.getExtras());
    }

    public static void w(Intent intent) {
        A("_nf", intent.getExtras());
    }

    public static void x(Bundle bundle) {
        C(bundle);
        A("_no", bundle);
    }

    public static void y(Intent intent) {
        if (E(intent)) {
            A("_nr", intent.getExtras());
        }
        if (D(intent)) {
            z(C6444a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.y());
        }
    }

    private static void z(C6444a.b bVar, Intent intent, InterfaceC5944i interfaceC5944i) {
        if (interfaceC5944i == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C6444a c6444aB = b(bVar, intent);
        if (c6444aB == null) {
            return;
        }
        try {
            interfaceC5944i.a("FCM_CLIENT_EVENT_LOGGING", C6445b.class, C5938c.b("proto"), new InterfaceC5942g() { // from class: com.google.firebase.messaging.K
                @Override // p8.InterfaceC5942g
                public final Object apply(Object obj) {
                    return ((C6445b) obj).c();
                }
            }).a(AbstractC5939d.f(C6445b.b().b(c6444aB).a(), AbstractC5941f.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e10);
        }
    }
}
