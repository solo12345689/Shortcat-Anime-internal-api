package oa;

import X9.e;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.Constants;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f55335c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f55336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f55337b;

    public b(e eVar) {
        this.f55336a = eVar.l().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f55337b = b(eVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + f.f34696c + str2;
    }

    private static String b(e eVar) {
        String strF = eVar.q().f();
        if (strF != null) {
            return strF;
        }
        String strC = eVar.q().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f55336a) {
            string = this.f55336a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f55336a) {
            try {
                String string = this.f55336a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String f() {
        synchronized (this.f55336a) {
            try {
                String strG = g();
                if (strG != null) {
                    return strG;
                }
                return h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String i() {
        synchronized (this.f55336a) {
            try {
                for (String str : f55335c) {
                    String string = this.f55336a.getString(a(this.f55337b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
