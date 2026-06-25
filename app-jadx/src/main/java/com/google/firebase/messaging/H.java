package com.google.firebase.messaging;

import N8.C1974c;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import ka.j;
import ma.InterfaceC5655b;
import n9.InterfaceC5757a;
import na.InterfaceC5769e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class H {

    /* JADX INFO: renamed from: a */
    private final X9.e f43332a;

    /* JADX INFO: renamed from: b */
    private final M f43333b;

    /* JADX INFO: renamed from: c */
    private final C1974c f43334c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5655b f43335d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC5655b f43336e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC5769e f43337f;

    H(X9.e eVar, M m10, InterfaceC5655b interfaceC5655b, InterfaceC5655b interfaceC5655b2, InterfaceC5769e interfaceC5769e) {
        this(eVar, m10, new C1974c(eVar.l()), interfaceC5655b, interfaceC5655b2, interfaceC5769e);
    }

    public static /* synthetic */ String a(H h10, n9.i iVar) {
        h10.getClass();
        return h10.h((Bundle) iVar.l(IOException.class));
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private n9.i d(n9.i iVar) {
        return iVar.h(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5757a() { // from class: com.google.firebase.messaging.G
            @Override // n9.InterfaceC5757a
            public final Object a(n9.i iVar2) {
                return H.a(this.f43331a, iVar2);
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f43332a.p().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String h(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString(LogEvent.LEVEL_ERROR);
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private void j(String str, String str2, Bundle bundle) {
        j.a aVarB;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f43332a.q().c());
        bundle.putString("gmsv", Integer.toString(this.f43333b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f43333b.a());
        bundle.putString("app_ver_name", this.f43333b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String strB = ((com.google.firebase.installations.g) n9.l.a(this.f43337f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) n9.l.a(this.f43337f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        ka.j jVar = (ka.j) this.f43336e.get();
        ua.i iVar = (ua.i) this.f43335d.get();
        if (jVar == null || iVar == null || (aVarB = jVar.b("fire-iid")) == j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.b()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private n9.i l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f43334c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return n9.l.e(e10);
        }
    }

    n9.i c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(l(M.c(this.f43332a), "*", bundle));
    }

    n9.i f() {
        return this.f43334c.a();
    }

    n9.i g() {
        return d(l(M.c(this.f43332a), "*", new Bundle()));
    }

    n9.i k(boolean z10) {
        return this.f43334c.d(z10);
    }

    n9.i m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(l(str, "/topics/" + str2, bundle));
    }

    n9.i n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(l(str, "/topics/" + str2, bundle));
    }

    H(X9.e eVar, M m10, C1974c c1974c, InterfaceC5655b interfaceC5655b, InterfaceC5655b interfaceC5655b2, InterfaceC5769e interfaceC5769e) {
        this.f43332a = eVar;
        this.f43333b = m10;
        this.f43334c = c1974c;
        this.f43335d = interfaceC5655b;
        this.f43336e = interfaceC5655b2;
        this.f43337f = interfaceC5769e;
    }
}
