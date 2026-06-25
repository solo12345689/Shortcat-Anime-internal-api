package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class E2 extends B3 {

    /* JADX INFO: renamed from: A */
    static final Pair f40713A = new Pair("", 0L);

    /* JADX INFO: renamed from: c */
    private SharedPreferences f40714c;

    /* JADX INFO: renamed from: d */
    private SharedPreferences f40715d;

    /* JADX INFO: renamed from: e */
    public C2 f40716e;

    /* JADX INFO: renamed from: f */
    public final B2 f40717f;

    /* JADX INFO: renamed from: g */
    public final B2 f40718g;

    /* JADX INFO: renamed from: h */
    public final D2 f40719h;

    /* JADX INFO: renamed from: i */
    private String f40720i;

    /* JADX INFO: renamed from: j */
    private boolean f40721j;

    /* JADX INFO: renamed from: k */
    private long f40722k;

    /* JADX INFO: renamed from: l */
    public final B2 f40723l;

    /* JADX INFO: renamed from: m */
    public final C3949z2 f40724m;

    /* JADX INFO: renamed from: n */
    public final D2 f40725n;

    /* JADX INFO: renamed from: o */
    public final A2 f40726o;

    /* JADX INFO: renamed from: p */
    public final C3949z2 f40727p;

    /* JADX INFO: renamed from: q */
    public final B2 f40728q;

    /* JADX INFO: renamed from: r */
    public final B2 f40729r;

    /* JADX INFO: renamed from: s */
    public boolean f40730s;

    /* JADX INFO: renamed from: t */
    public final C3949z2 f40731t;

    /* JADX INFO: renamed from: u */
    public final C3949z2 f40732u;

    /* JADX INFO: renamed from: v */
    public final B2 f40733v;

    /* JADX INFO: renamed from: w */
    public final D2 f40734w;

    /* JADX INFO: renamed from: x */
    public final D2 f40735x;

    /* JADX INFO: renamed from: y */
    public final B2 f40736y;

    /* JADX INFO: renamed from: z */
    public final A2 f40737z;

    E2(X2 x22) {
        super(x22);
        this.f40723l = new B2(this, "session_timeout", 1800000L);
        this.f40724m = new C3949z2(this, "start_new_session", true);
        this.f40728q = new B2(this, "last_pause_time", 0L);
        this.f40729r = new B2(this, "session_id", 0L);
        this.f40725n = new D2(this, "non_personalized_ads", null);
        this.f40726o = new A2(this, "last_received_uri_timestamps_by_source", null);
        this.f40727p = new C3949z2(this, "allow_remote_dynamite", false);
        this.f40717f = new B2(this, "first_open_time", 0L);
        this.f40718g = new B2(this, "app_install_time", 0L);
        this.f40719h = new D2(this, "app_instance_id", null);
        this.f40731t = new C3949z2(this, "app_backgrounded", false);
        this.f40732u = new C3949z2(this, "deep_link_retrieval_complete", false);
        this.f40733v = new B2(this, "deep_link_retrieval_attempts", 0L);
        this.f40734w = new D2(this, "firebase_feature_rollouts", null);
        this.f40735x = new D2(this, "deferred_attribution_cache", null);
        this.f40736y = new B2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f40737z = new A2(this, "default_event_parameters", null);
    }

    final boolean A(long j10) {
        return j10 - this.f40723l.a() > this.f40728q.a();
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final void j() {
        X2 x22 = this.f40611a;
        SharedPreferences sharedPreferences = x22.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f40714c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f40730s = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f40714c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        x22.w();
        this.f40716e = new C2(this, "health_monitor", Math.max(0L, ((Long) AbstractC3789d2.f41202d.b(null)).longValue()), null);
    }

    final Pair o(String str) {
        h();
        if (!w().o(j9.v.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        X2 x22 = this.f40611a;
        long jC = x22.e().c();
        String str2 = this.f40720i;
        if (str2 != null && jC < this.f40722k) {
            return new Pair(str2, Boolean.valueOf(this.f40721j));
        }
        this.f40722k = jC + x22.w().D(str, AbstractC3789d2.f41196b);
        AdvertisingIdClient.a(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(x22.d());
            this.f40720i = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.f40720i = id2;
            }
            this.f40721j = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e10) {
            this.f40611a.a().v().b("Unable to get advertising id", e10);
            this.f40720i = "";
        }
        AdvertisingIdClient.a(false);
        return new Pair(this.f40720i, Boolean.valueOf(this.f40721j));
    }

    protected final SharedPreferences p() {
        h();
        l();
        AbstractC2115p.l(this.f40714c);
        return this.f40714c;
    }

    protected final SharedPreferences q() {
        h();
        l();
        if (this.f40715d == null) {
            X2 x22 = this.f40611a;
            String strValueOf = String.valueOf(x22.d().getPackageName());
            C3873o2 c3873o2W = x22.a().w();
            String strConcat = strValueOf.concat("_preferences");
            c3873o2W.b("Default prefs file", strConcat);
            this.f40715d = x22.d().getSharedPreferences(strConcat, 0);
        }
        return this.f40715d;
    }

    final SparseArray r() {
        Bundle bundleA = this.f40726o.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f40611a.a().o().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    final void s(Boolean bool) {
        h();
        SharedPreferences.Editor editorEdit = p().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final Boolean t() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final C3939y u() {
        h();
        return C3939y.g(p().getString("dma_consent_settings", null));
    }

    final boolean v(int i10) {
        return E3.u(i10, p().getInt("consent_source", 100));
    }

    final E3 w() {
        h();
        return E3.f(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    protected final boolean x(O5 o52) {
        h();
        String string = p().getString("stored_tcf_param", "");
        String strA = o52.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    final void y(boolean z10) {
        h();
        this.f40611a.a().w().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    final boolean z() {
        SharedPreferences sharedPreferences = this.f40714c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
