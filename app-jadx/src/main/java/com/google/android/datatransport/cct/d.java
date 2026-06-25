package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.cct.d;
import fa.InterfaceC4790a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p8.C5938c;
import q8.AbstractC6148a;
import q8.AbstractC6157j;
import q8.AbstractC6158k;
import q8.AbstractC6159l;
import q8.AbstractC6160m;
import q8.AbstractC6161n;
import q8.AbstractC6162o;
import q8.EnumC6163p;
import r8.AbstractC6283i;
import r8.C6282h;
import s8.f;
import s8.g;
import s8.m;
import v8.AbstractC6852a;
import w8.AbstractC6953b;
import w8.InterfaceC6952a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4790a f38813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f38814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f38815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final URL f38816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B8.a f38817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final B8.a f38818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f38819g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final URL f38820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AbstractC6157j f38821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f38822c;

        a(URL url, AbstractC6157j abstractC6157j, String str) {
            this.f38820a = url;
            this.f38821b = abstractC6157j;
            this.f38822c = str;
        }

        a a(URL url) {
            return new a(url, this.f38821b, this.f38822c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f38823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final URL f38824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f38825c;

        b(int i10, URL url, long j10) {
            this.f38823a = i10;
            this.f38824b = url;
            this.f38825c = j10;
        }
    }

    d(Context context, B8.a aVar, B8.a aVar2, int i10) {
        this.f38813a = AbstractC6157j.b();
        this.f38815c = context;
        this.f38814b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f38816d = m(com.google.android.datatransport.cct.a.f38804c);
        this.f38817e = aVar2;
        this.f38818f = aVar;
        this.f38819g = i10;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f38824b;
        if (url == null) {
            return null;
        }
        AbstractC6852a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f38824b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        AbstractC6852a.f("CctTransportBackend", "Making request to: %s", aVar.f38820a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f38820a.openConnection();
        httpURLConnection.setConnectTimeout(Constants.CONNECTION_TIMEOUT_VERIFY);
        httpURLConnection.setReadTimeout(this.f38819g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f38822c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f38813a.a(aVar.f38821b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC6852a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC6852a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC6852a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamL = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC6161n.b(new BufferedReader(new InputStreamReader(inputStreamL))).c());
                            if (inputStreamL != null) {
                                inputStreamL.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } finally {
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (fa.b e10) {
            e = e10;
            AbstractC6852a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            AbstractC6852a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            AbstractC6852a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            AbstractC6852a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC6162o.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC6162o.b.COMBINED.b();
        }
        if (AbstractC6162o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC6162o.c.NONE.b() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC6852a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private AbstractC6157j i(f fVar) {
        AbstractC6159l.a aVarJ;
        HashMap map = new HashMap();
        for (AbstractC6283i abstractC6283i : fVar.b()) {
            String strJ = abstractC6283i.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(abstractC6283i);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC6283i);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            AbstractC6283i abstractC6283i2 = (AbstractC6283i) ((List) entry.getValue()).get(0);
            AbstractC6160m.a aVarB = AbstractC6160m.a().f(EnumC6163p.DEFAULT).g(this.f38818f.a()).h(this.f38817e.a()).b(AbstractC6158k.a().c(AbstractC6158k.b.ANDROID_FIREBASE).b(AbstractC6148a.a().m(Integer.valueOf(abstractC6283i2.g("sdk-version"))).j(abstractC6283i2.b("model")).f(abstractC6283i2.b("hardware")).d(abstractC6283i2.b("device")).l(abstractC6283i2.b("product")).k(abstractC6283i2.b("os-uild")).h(abstractC6283i2.b("manufacturer")).e(abstractC6283i2.b("fingerprint")).c(abstractC6283i2.b("country")).g(abstractC6283i2.b("locale")).i(abstractC6283i2.b("mcc_mnc")).b(abstractC6283i2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC6283i abstractC6283i3 : (List) entry.getValue()) {
                C6282h c6282hE = abstractC6283i3.e();
                C5938c c5938cB = c6282hE.b();
                if (c5938cB.equals(C5938c.b("proto"))) {
                    aVarJ = AbstractC6159l.j(c6282hE.a());
                } else if (c5938cB.equals(C5938c.b("json"))) {
                    aVarJ = AbstractC6159l.i(new String(c6282hE.a(), Charset.forName(Constants.ENCODING)));
                } else {
                    AbstractC6852a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", c5938cB);
                }
                aVarJ.c(abstractC6283i3.f()).d(abstractC6283i3.k()).h(abstractC6283i3.h("tz-offset")).e(AbstractC6162o.a().c(AbstractC6162o.c.a(abstractC6283i3.g("net-type"))).b(AbstractC6162o.b.a(abstractC6283i3.g("mobile-subtype"))).a());
                if (abstractC6283i3.d() != null) {
                    aVarJ.b(abstractC6283i3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return AbstractC6157j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    private static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // s8.m
    public g a(f fVar) {
        AbstractC6157j abstractC6157jI = i(fVar);
        URL urlM = this.f38816d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlM = m(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) AbstractC6953b.a(5, new a(urlM, abstractC6157jI, strD), new InterfaceC6952a() { // from class: com.google.android.datatransport.cct.b
                @Override // w8.InterfaceC6952a
                public final Object apply(Object obj) {
                    return this.f38812a.e((d.a) obj);
                }
            }, new w8.c() { // from class: com.google.android.datatransport.cct.c
                @Override // w8.c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f38823a;
            if (i10 == 200) {
                return g.e(bVar.f38825c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e10) {
            AbstractC6852a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    @Override // s8.m
    public AbstractC6283i b(AbstractC6283i abstractC6283i) {
        NetworkInfo activeNetworkInfo = this.f38814b.getActiveNetworkInfo();
        return abstractC6283i.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f38815c).getSimOperator()).c("application_build", Integer.toString(h(this.f38815c))).d();
    }

    d(Context context, B8.a aVar, B8.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
