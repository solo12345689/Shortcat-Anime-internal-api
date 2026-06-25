package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.f;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f35042a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f35043b = a.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35044c = a.class.getName() + "_PREFS_";

    public static a a() {
        return f35042a;
    }

    public void a(String str, String str2, String str3) {
        com.amazon.device.iap.internal.util.b.a(f35043b, "enter saveEntitlementRecord for v1 Entitlement [" + str2 + "/" + str3 + "], user [" + str + "]");
        try {
            f.a(str, "userId");
            f.a(str2, com.amazon.a.a.o.b.f34612E);
            f.a(str3, "sku");
            Context contextB = com.amazon.device.iap.internal.d.f().b();
            f.a(contextB, "context");
            SharedPreferences.Editor editorEdit = contextB.getSharedPreferences(f35044c + str, 0).edit();
            editorEdit.putString(str3, str2);
            editorEdit.commit();
        } catch (Throwable th2) {
            com.amazon.device.iap.internal.util.b.a(f35043b, "error in saving v1 Entitlement:" + str2 + "/" + str3 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + th2.getMessage());
        }
        com.amazon.device.iap.internal.util.b.a(f35043b, "leaving saveEntitlementRecord for v1 Entitlement [" + str2 + "/" + str3 + "], user [" + str + "]");
    }

    public String a(String str, String str2) {
        com.amazon.device.iap.internal.util.b.a(f35043b, "enter getReceiptIdFromSku for sku [" + str2 + "], user [" + str + "]");
        String string = null;
        try {
            f.a(str, "userId");
            f.a(str2, "sku");
            Context contextB = com.amazon.device.iap.internal.d.f().b();
            f.a(contextB, "context");
            string = contextB.getSharedPreferences(f35044c + str, 0).getString(str2, null);
        } catch (Throwable th2) {
            com.amazon.device.iap.internal.util.b.a(f35043b, "error in saving v1 Entitlement:" + str2 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + th2.getMessage());
        }
        com.amazon.device.iap.internal.util.b.a(f35043b, "leaving saveEntitlementRecord for sku [" + str2 + "], user [" + str + "]");
        return string;
    }
}
