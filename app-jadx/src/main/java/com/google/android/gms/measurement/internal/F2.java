package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class F2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.U f40752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnection f40753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ G2 f40754c;

    F2(G2 g22, com.google.android.gms.internal.measurement.U u10, ServiceConnection serviceConnection) {
        this.f40752a = u10;
        this.f40753b = serviceConnection;
        Objects.requireNonNull(g22);
        this.f40754c = g22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleL2;
        G2 g22 = this.f40754c;
        H2 h22 = g22.f40771b;
        X2 x22 = h22.f40788a;
        x22.b().h();
        Bundle bundle = new Bundle();
        String strA = g22.a();
        bundle.putString("package_name", strA);
        try {
            bundleL2 = this.f40752a.l2(bundle);
        } catch (Exception e10) {
            h22.f40788a.a().o().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        if (bundleL2 == null) {
            x22.a().o().a("Install Referrer Service returned a null response");
            bundleL2 = null;
        }
        X2 x23 = h22.f40788a;
        x23.b().h();
        X2.q();
        if (bundleL2 != null) {
            long j10 = bundleL2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                x23.a().r().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleL2.getString(Constants.INSTALL_REFERRER);
                if (string == null || string.isEmpty()) {
                    x23.a().o().a("No referrer defined in Install Referrer response");
                } else {
                    x23.a().w().b("InstallReferrer API result", string);
                    Bundle bundleS0 = x23.C().s0(Uri.parse("?".concat(string)));
                    if (bundleS0 == null) {
                        x23.a().o().a("No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) AbstractC3789d2.f41216h1.b(null)).split(com.amazon.a.a.o.b.f.f34694a));
                        Iterator<String> it = bundleS0.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (listAsList.contains(it.next())) {
                                long j11 = bundleL2.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j11 > 0) {
                                    bundleS0.putLong("click_timestamp", j11);
                                }
                            }
                        }
                        if (j10 == x23.x().f40718g.a()) {
                            x23.a().w().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (x23.g()) {
                            x23.x().f40718g.b(j10);
                            x23.a().w().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleS0.putString("_cis", "referrer API v2");
                            x23.B().w("auto", "_cmp", bundleS0, strA);
                        }
                    }
                }
            }
        }
        V8.a.b().c(x23.d(), this.f40753b);
    }
}
