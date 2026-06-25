package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class H6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X2 f40794a;

    public H6(X2 x22) {
        this.f40794a = x22;
    }

    final void a() {
        X2 x22 = this.f40794a;
        x22.b().h();
        if (e()) {
            if (d()) {
                x22.x().f40735x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(Constants.MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                x22.B().t("auto", "_cmpx", bundle);
            } else {
                String strA = x22.x().f40735x.a();
                if (TextUtils.isEmpty(strA)) {
                    x22.a().p().a("Cache still valid but referrer not found");
                } else {
                    long jA = x22.x().f40736y.a() / 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                    Object obj = pair.first;
                    x22.B().t(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                x22.x().f40735x.b(null);
            }
            x22.x().f40736y.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String string;
        X2 x22 = this.f40794a;
        x22.b().h();
        if (x22.g()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        x22.x().f40735x.b(string);
        x22.x().f40736y.b(x22.e().a());
    }

    final void c() {
        if (e() && d()) {
            this.f40794a.x().f40735x.b(null);
        }
    }

    final boolean d() {
        if (!e()) {
            return false;
        }
        X2 x22 = this.f40794a;
        return x22.e().a() - x22.x().f40736y.a() > x22.w().D(null, AbstractC3789d2.f41224k0);
    }

    final boolean e() {
        return this.f40794a.x().f40736y.a() > 0;
    }
}
