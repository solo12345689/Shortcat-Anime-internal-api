package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
enum EnumC3732t {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Q f40569q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40571a;

    static {
        P p10 = new P();
        for (EnumC3732t enumC3732t : values()) {
            p10.a(Integer.valueOf(enumC3732t.f40571a), enumC3732t);
        }
        f40569q = p10.b();
    }

    EnumC3732t(int i10) {
        this.f40571a = i10;
    }

    static EnumC3732t a(int i10) {
        Q q10 = f40569q;
        Integer numValueOf = Integer.valueOf(i10);
        return !q10.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (EnumC3732t) q10.get(numValueOf);
    }
}
