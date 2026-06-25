package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3945y5 extends AbstractC3777b6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f41791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B2 f41792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B2 f41793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B2 f41794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B2 f41795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B2 f41796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final B2 f41797j;

    C3945y5(q6 q6Var) {
        super(q6Var);
        this.f41791d = new HashMap();
        E2 e2X = this.f40611a.x();
        Objects.requireNonNull(e2X);
        this.f41792e = new B2(e2X, "last_delete_stale", 0L);
        E2 e2X2 = this.f40611a.x();
        Objects.requireNonNull(e2X2);
        this.f41793f = new B2(e2X2, "last_delete_stale_batch", 0L);
        E2 e2X3 = this.f40611a.x();
        Objects.requireNonNull(e2X3);
        this.f41794g = new B2(e2X3, "backoff", 0L);
        E2 e2X4 = this.f40611a.x();
        Objects.requireNonNull(e2X4);
        this.f41795h = new B2(e2X4, "last_upload", 0L);
        E2 e2X5 = this.f40611a.x();
        Objects.requireNonNull(e2X5);
        this.f41796i = new B2(e2X5, "last_upload_attempt", 0L);
        E2 e2X6 = this.f40611a.x();
        Objects.requireNonNull(e2X6);
        this.f41797j = new B2(e2X6, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3777b6
    protected final boolean l() {
        return false;
    }

    final Pair m(String str, E3 e32) {
        return e32.o(j9.v.AD_STORAGE) ? n(str) : new Pair("", Boolean.FALSE);
    }

    final Pair n(String str) {
        C3938x5 c3938x5;
        AdvertisingIdClient.Info advertisingIdInfo;
        h();
        X2 x22 = this.f40611a;
        long jC = x22.e().c();
        C3938x5 c3938x52 = (C3938x5) this.f41791d.get(str);
        if (c3938x52 != null && jC < c3938x52.f41772c) {
            return new Pair(c3938x52.f41770a, Boolean.valueOf(c3938x52.f41771b));
        }
        AdvertisingIdClient.a(true);
        long jD = x22.w().D(str, AbstractC3789d2.f41196b) + jC;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(x22.d());
            } catch (PackageManager.NameNotFoundException unused) {
                advertisingIdInfo = null;
                if (c3938x52 != null && jC < c3938x52.f41772c + this.f40611a.w().D(str, AbstractC3789d2.f41199c)) {
                    return new Pair(c3938x52.f41770a, Boolean.valueOf(c3938x52.f41771b));
                }
            }
        } catch (Exception e10) {
            this.f40611a.a().v().b("Unable to get advertising id", e10);
            c3938x5 = new C3938x5("", false, jD);
        }
        if (advertisingIdInfo == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = advertisingIdInfo.getId();
        c3938x5 = id2 != null ? new C3938x5(id2, advertisingIdInfo.isLimitAdTrackingEnabled(), jD) : new C3938x5("", advertisingIdInfo.isLimitAdTrackingEnabled(), jD);
        this.f41791d.put(str, c3938x5);
        AdvertisingIdClient.a(false);
        return new Pair(c3938x5.f41770a, Boolean.valueOf(c3938x5.f41771b));
    }

    final String o(String str, boolean z10) {
        h();
        String str2 = z10 ? (String) n(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestC = z6.C();
        if (messageDigestC == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestC.digest(str2.getBytes())));
    }
}
