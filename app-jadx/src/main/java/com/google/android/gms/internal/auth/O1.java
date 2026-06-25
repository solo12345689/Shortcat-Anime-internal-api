package com.google.android.gms.internal.auth;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class O1 implements M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f39102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f39103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f39104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M f39105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M f39106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M f39107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M f39108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final M f39109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final M f39110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final M f39111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final M f39112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final M f39113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final M f39114m;

    static {
        I iA = new I(A.a("com.google.android.gms.auth_account")).b().a();
        f39102a = iA.c("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        f39103b = iA.e("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        f39104c = iA.d("getTokenRefactor__account_manager_timeout_seconds", 20L);
        f39105d = iA.d("getTokenRefactor__android_id_shift", 0L);
        try {
            f39106e = iA.f("getTokenRefactor__blocked_packages", H1.r(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), N1.f39101a);
            f39107f = iA.e("getTokenRefactor__chimera_get_token_evolved", true);
            f39108g = iA.d("getTokenRefactor__clear_token_timeout_seconds", 20L);
            f39109h = iA.d("getTokenRefactor__default_task_timeout_seconds", 20L);
            f39110i = iA.e("getTokenRefactor__gaul_accounts_api_evolved", false);
            f39111j = iA.e("getTokenRefactor__gaul_token_api_evolved", false);
            f39112k = iA.d("getTokenRefactor__get_token_timeout_seconds", 120L);
            f39113l = iA.e("getTokenRefactor__gms_account_authenticator_evolved", true);
            f39114m = iA.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (Exception e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.auth.M1
    public final boolean k() {
        return ((Boolean) f39111j.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.auth.M1
    public final H1 zza() {
        return (H1) f39106e.b();
    }
}
