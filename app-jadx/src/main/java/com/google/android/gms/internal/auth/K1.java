package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class K1 implements J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f39081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f39082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f39083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M f39084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M f39085e;

    static {
        I iA = new I(A.a("com.google.android.gms.auth_account")).b().a();
        f39081a = iA.e("Aang__create_auth_exception_with_pending_intent", false);
        f39082b = iA.e("Aang__enable_add_account_restrictions", false);
        f39083c = iA.e("Aang__log_missing_gaia_id_event", true);
        f39084d = iA.e("Aang__log_obfuscated_gaiaid_status", true);
        f39085e = iA.e("Aang__switch_clear_token_to_aang", false);
    }

    @Override // com.google.android.gms.internal.auth.J1
    public final boolean zza() {
        return ((Boolean) f39081a.b()).booleanValue();
    }
}
