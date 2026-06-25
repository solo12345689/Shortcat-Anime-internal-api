package com.google.android.gms.internal.play_billing;

import N4.C1970j;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.C3160e;
import com.android.billingclient.api.C3164i;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.google.history.BillingConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class V {

    /* JADX INFO: renamed from: a */
    public static final int f40412a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return o(intent.getExtras(), "ProxyBillingActivity");
        }
        m("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        if (bundle == null) {
            m(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get(BillingConstants.RESPONSE_CODE);
        if (obj == null) {
            l(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle c(Bundle bundle, String str, String str2, long j10) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j10);
        return bundle;
    }

    public static Bundle d(C3160e c3160e, R2 r22) {
        Bundle bundle = new Bundle();
        bundle.putInt(BillingConstants.RESPONSE_CODE, c3160e.c());
        bundle.putString("DEBUG_MESSAGE", c3160e.a());
        bundle.putInt("LOG_REASON", r22.zza());
        return bundle;
    }

    public static Bundle e(C3160e c3160e, R2 r22, String str) {
        Bundle bundleD = d(c3160e, r22);
        if (str != null) {
            bundleD.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleD;
    }

    public static Bundle f(String str, String str2, ArrayList arrayList, String str3, String str4, C3638a c3638a, long j10) {
        Bundle bundle = new Bundle();
        c(bundle, str, str2, j10);
        bundle.putBoolean(com.amazon.a.a.o.b.f34637ac, true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(N.v("subs", "inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(N.u("inapp")));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (c3638a.f40436a) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C3164i.b bVar = (C3164i.b) arrayList.get(i10);
            arrayList2.add(null);
            z10 |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z11 |= !TextUtils.isEmpty(null);
            if (bVar.c().equals("first_party")) {
                A.c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                arrayList3.add(null);
            }
        }
        if (z10) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z11) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static C3160e g(Intent intent, String str) {
        if (intent != null) {
            C3160e.a aVarD = C3160e.d();
            aVarD.d(b(intent.getExtras(), str));
            aVarD.b(i(intent.getExtras(), str));
            return aVarD.a();
        }
        m("BillingHelper", "Got null intent!");
        C3160e.a aVarD2 = C3160e.d();
        aVarD2.d(6);
        aVarD2.b("An internal error occurred.");
        return aVarD2.a();
    }

    public static C1970j h(Bundle bundle, String str) {
        return bundle == null ? new C1970j(0, null) : new C1970j(o(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String i(Bundle bundle, String str) {
        if (bundle == null) {
            m(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            l(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String j(int i10) {
        return EnumC3732t.a(i10).toString();
    }

    public static List k(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(BillingConstants.INAPP_PURCHASE_DATA_LIST);
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(BillingConstants.INAPP_DATA_SIGNATURE_LIST);
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseP = p(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseP == null) {
                l("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseP);
            return arrayList;
        }
        l("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
            Purchase purchaseP2 = p(stringArrayList.get(i10), stringArrayList2.get(i10));
            if (purchaseP2 != null) {
                arrayList.add(purchaseP2);
            }
        }
        return arrayList;
    }

    public static void l(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i10 = 40000;
            while (!str2.isEmpty() && i10 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i10));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i10 -= iMin;
            }
        }
    }

    public static void m(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th2) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th2 == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static int o(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        m(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase p(String str, String str2) {
        if (str == null || str2 == null) {
            l("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e10) {
            m("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
            return null;
        }
    }
}
