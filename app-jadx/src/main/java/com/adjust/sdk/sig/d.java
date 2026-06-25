package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.AdjustConfig;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.UnrecoverableKeyException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f34191a = false;

    public static void a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }

    public static void a(Context context, c cVar, a aVar, Map map, String str, String str2) throws Exception {
        byte[] bArrA;
        if (f34191a) {
            Log.e("SignerInstance", "sign: library received error. It has locked down");
            return;
        }
        if (map == null || map.isEmpty() || str == null || str2 == null) {
            Log.e("SignerInstance", "sign: One or more parameters are null");
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        boolean zEquals = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
        if (zEquals) {
            Log.v("SignerInstance", "Signing all the parameters begin: " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i10 = 2;
        while (true) {
            bArrA = null;
            if (i10 <= 0) {
                break;
            }
            try {
                cVar.a(context);
                bArrA = cVar.a(context, map.toString().getBytes(StandardCharsets.UTF_8));
                break;
            } catch (b e10) {
                Log.e("SignerInstance", "sign: Api is less than JellyBean-4-18");
                f34191a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e10;
            } catch (InvalidKeyException e11) {
                e = e11;
            } catch (UnrecoverableKeyException e12) {
                e = e12;
            } catch (Exception e13) {
                Log.e("SignerInstance", "sign: Received an Exception: " + e13.getMessage(), e13);
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e13;
            }
            Log.e("SignerInstance", "sign: Received a retriable exception: " + e.getMessage(), e);
            Log.e("SignerInstance", "sign: Attempting retry #" + i10);
            i10 += -1;
            cVar.getClass();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry("key2");
            context.getSharedPreferences("adjust_keys", 0).edit().remove("encrypted_key").apply();
        }
        if (i10 == 0) {
            f34191a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        if (zEquals) {
            Log.v("SignerInstance", "Calling native begin: " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
        byte[] bArrB = ((NativeLibHelper) aVar).b(context, map, bArrA, cVar.f34190a);
        if (zEquals) {
            Log.v("SignerInstance", "Calling native end  : " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
        if (bArrB == null) {
            Log.e("SignerInstance", "sign: Returned an null signature. Exiting...");
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        map.put("signature", Base64.encodeToString(bArrB, 2));
        map.remove("activity_kind");
        map.remove("client_sdk");
        if (zEquals) {
            Log.v("SignerInstance", "Signing all the parameters end  : " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }
    }
}
