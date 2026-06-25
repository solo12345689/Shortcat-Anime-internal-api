package pa;

import R8.AbstractC2115p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.i;
import com.google.firebase.installations.d;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import ma.InterfaceC5655b;
import n9.l;
import org.json.JSONException;
import org.json.JSONObject;
import pa.AbstractC5953d;
import pa.AbstractC5955f;

/* JADX INFO: renamed from: pa.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5952c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f55855d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f55856e = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f55857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5655b f55858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5954e f55859c = new C5954e();

    public C5952c(Context context, InterfaceC5655b interfaceC5655b) {
        this.f55857a = context;
        this.f55858b = interfaceC5655b;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put(com.amazon.a.a.o.b.f34616I, "a:19.1.0");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f34616I, "a:19.1.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private String f() {
        try {
            Context context = this.f55857a;
            byte[] bArrA = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return i.b(bArrA, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f55857a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f55857a.getPackageName(), e10);
            return null;
        }
    }

    private URL g(String str) throws com.google.firebase.installations.d {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new com.google.firebase.installations.d(e10.getMessage(), d.a.UNAVAILABLE);
        }
    }

    private static byte[] h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes(Constants.ENCODING);
    }

    private static boolean i(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    private static void j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String strO = o(httpURLConnection);
        if (TextUtils.isEmpty(strO)) {
            return;
        }
        Log.w("Firebase-Installations", strO);
        Log.w("Firebase-Installations", a(str, str2, str3));
    }

    private HttpURLConnection l(URL url, String str) throws com.google.firebase.installations.d {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(ColorExtractionConstants.MAX_PIXEL_SAMPLES);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(ColorExtractionConstants.MAX_PIXEL_SAMPLES);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f55857a.getPackageName());
            ka.i iVar = (ka.i) this.f55858b.get();
            if (iVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) l.a(iVar.a()));
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                } catch (ExecutionException e11) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    static long m(String str) {
        AbstractC2115p.b(f55855d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private AbstractC5953d n(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f55856e));
        AbstractC5955f.a aVarA = AbstractC5955f.a();
        AbstractC5953d.a aVarA2 = AbstractC5953d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                aVarA2.f(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarA2.c(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarA2.d(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarA.c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarA.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarA2.b(aVarA.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA2.e(AbstractC5953d.b.OK).a();
    }

    private static String o(HttpURLConnection httpURLConnection) {
        StringBuilder sb2;
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f55856e));
        try {
            try {
                sb2 = new StringBuilder();
            } catch (IOException unused) {
                bufferedReader.close();
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
        } catch (IOException unused3) {
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb2.append(line);
            sb2.append('\n');
            return null;
        }
        String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
        try {
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        return str;
    }

    private AbstractC5955f p(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f55856e));
        AbstractC5955f.a aVarA = AbstractC5955f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarA.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA.b(AbstractC5955f.b.OK).a();
    }

    private void q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        s(httpURLConnection, h(b(str, str2)));
    }

    private void r(HttpURLConnection httpURLConnection) throws IOException {
        s(httpURLConnection, h(c()));
    }

    private static void s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public AbstractC5953d d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC5953d abstractC5953dN;
        if (!this.f55859c.b()) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        URL urlG = g(String.format("projects/%s/installations", str3));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionL = l(urlG, str);
            try {
                try {
                    httpURLConnectionL.setRequestMethod("POST");
                    httpURLConnectionL.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionL.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    q(httpURLConnectionL, str2, str4);
                    responseCode = httpURLConnectionL.getResponseCode();
                    this.f55859c.f(responseCode);
                } catch (Throwable th2) {
                    httpURLConnectionL.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (i(responseCode)) {
                abstractC5953dN = n(httpURLConnectionL);
            } else {
                k(httpURLConnectionL, str4, str, str3);
                if (responseCode == 429) {
                    throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    j();
                    abstractC5953dN = AbstractC5953d.a().e(AbstractC5953d.b.BAD_CONFIG).a();
                }
                httpURLConnectionL.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            httpURLConnectionL.disconnect();
            TrafficStats.clearThreadStatsTag();
            return abstractC5953dN;
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    public AbstractC5955f e(String str, String str2, String str3, String str4) {
        int responseCode;
        AbstractC5955f abstractC5955fP;
        if (!this.f55859c.b()) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        URL urlG = g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionL = l(urlG, str);
            try {
                try {
                    httpURLConnectionL.setRequestMethod("POST");
                    httpURLConnectionL.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionL.setDoOutput(true);
                    r(httpURLConnectionL);
                    responseCode = httpURLConnectionL.getResponseCode();
                    this.f55859c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (i(responseCode)) {
                    abstractC5955fP = p(httpURLConnectionL);
                } else {
                    k(httpURLConnectionL, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        abstractC5955fP = AbstractC5955f.a().b(AbstractC5955f.b.AUTH_ERROR).a();
                    } else {
                        if (responseCode == 429) {
                            throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            j();
                            abstractC5955fP = AbstractC5955f.a().b(AbstractC5955f.b.BAD_CONFIG).a();
                        }
                    }
                }
                return abstractC5955fP;
            } finally {
                httpURLConnectionL.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }
}
