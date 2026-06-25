package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3847k4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f41398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Uri f41399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f41400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f41401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3854l4 f41402e;

    RunnableC3847k4(C3854l4 c3854l4, boolean z10, Uri uri, String str, String str2) {
        this.f41398a = z10;
        this.f41399b = uri;
        this.f41400c = str;
        this.f41401d = str2;
        Objects.requireNonNull(c3854l4);
        this.f41402e = c3854l4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleS0;
        Bundle bundleS02;
        C3854l4 c3854l4 = this.f41402e;
        C3937x4 c3937x4 = c3854l4.f41415a;
        c3937x4.h();
        String str = this.f41401d;
        Uri uri = this.f41399b;
        try {
            X2 x22 = c3937x4.f40611a;
            z6 z6VarC = x22.C();
            if (TextUtils.isEmpty(str)) {
                bundleS0 = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleS0 = z6VarC.s0(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleS0 != null) {
                    bundleS0.putString("_cis", Constants.REFERRER);
                }
            } else {
                z6VarC.f40611a.a().v().a("Activity created with data 'referrer' without required params");
                bundleS0 = null;
            }
            String str2 = this.f41400c;
            if (this.f41398a && (bundleS02 = x22.C().s0(uri)) != null) {
                bundleS02.putString("_cis", "intent");
                if (!bundleS02.containsKey("gclid") && bundleS0 != null && bundleS0.containsKey("gclid")) {
                    bundleS02.putString("_cer", String.format("gclid=%s", bundleS0.getString("gclid")));
                }
                c3937x4.t(str2, "_cmp", bundleS02);
                c3937x4.f41764r.b(str2, bundleS02);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            x22.a().v().b("Activity created with referrer", str);
            if (x22.w().H(null, AbstractC3789d2.f41156H0)) {
                if (bundleS0 != null) {
                    c3937x4.t(str2, "_cmp", bundleS0);
                    c3937x4.f41764r.b(str2, bundleS0);
                } else {
                    x22.a().v().b("Referrer does not contain valid parameters", str);
                }
                c3937x4.y("auto", "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                x22.a().v().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                c3937x4.y("auto", "_ldl", str, true);
            }
        } catch (RuntimeException e10) {
            c3854l4.f41415a.f40611a.a().o().b("Throwable caught in handleReferrerForOnActivityCreated", e10);
        }
    }
}
