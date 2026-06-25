package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.google.history.BillingConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f38946a = d.f38949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f38947b = new b();

    b() {
    }

    public static b f() {
        return f38947b;
    }

    public int a(Context context) {
        return d.b(context);
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.h.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f38946a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(X8.e.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(DiagnosticsEntry.ID_KEY, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage(BillingConstants.VENDING_PACKAGE);
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return d(context, i10, i11, null);
    }

    public PendingIntent d(Context context, int i10, int i11, String str) {
        Intent intentB = b(context, i10, str);
        if (intentB == null) {
            return null;
        }
        return androidx.core.app.t.b(context, i11, intentB, 134217728, false);
    }

    public String e(int i10) {
        return d.c(i10);
    }

    public int g(Context context) {
        return h(context, f38946a);
    }

    public int h(Context context, int i10) {
        int iG = d.g(context, i10);
        if (d.h(context, iG)) {
            return 18;
        }
        return iG;
    }

    public boolean i(Context context, String str) {
        return d.l(context, str);
    }

    public boolean j(int i10) {
        return d.j(i10);
    }
}
