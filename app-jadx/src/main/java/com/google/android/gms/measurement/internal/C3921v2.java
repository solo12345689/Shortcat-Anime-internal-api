package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.google.android.gms.internal.measurement.C3431c3;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3921v2 extends AbstractC3777b6 {
    public C3921v2(q6 q6Var) {
        super(q6Var);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3777b6
    protected final boolean l() {
        return false;
    }

    public final boolean m() {
        j();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f40611a.d().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void n(String str, C3785c6 c3785c6, C3431c3 c3431c3, InterfaceC3900s2 interfaceC3900s2) {
        C3921v2 c3921v2;
        String str2;
        h();
        j();
        try {
            URL url = new URI(c3785c6.a()).toURL();
            this.f41010b.K0();
            byte[] bArrB = c3431c3.b();
            c3921v2 = this;
            str2 = str;
            try {
                this.f40611a.b().w(new RunnableC3914u2(c3921v2, str2, url, bArrB, c3785c6.b(), interfaceC3900s2));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                c3921v2.f40611a.a().o().c("Failed to parse URL. Not uploading MeasurementBatch. appId", C3887q2.x(str2), c3785c6.a());
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c3921v2 = this;
            str2 = str;
        }
    }

    public final void o(C3928w2 c3928w2, Map map, InterfaceC3900s2 interfaceC3900s2) {
        C3921v2 c3921v2;
        h();
        j();
        AbstractC2115p.l(c3928w2);
        AbstractC2115p.l(interfaceC3900s2);
        C3793d6 c3793d6C0 = this.f41010b.C0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) AbstractC3789d2.f41208f.b(null)).encodedAuthority((String) AbstractC3789d2.f41211g.b(null)).path("config/app/".concat(String.valueOf(c3928w2.r0()))).appendQueryParameter("platform", "android");
        c3793d6C0.f40611a.w().A();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            c3921v2 = this;
            try {
                this.f40611a.b().w(new RunnableC3914u2(c3921v2, c3928w2.o0(), url, null, map, interfaceC3900s2));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                c3921v2.f40611a.a().o().c("Failed to parse config URL. Not fetching. appId", C3887q2.x(c3928w2.o0()), string);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c3921v2 = this;
        }
    }
}
