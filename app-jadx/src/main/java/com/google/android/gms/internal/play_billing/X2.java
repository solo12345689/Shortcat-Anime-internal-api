package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class X2 implements M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final M1 f40420a = new X2();

    private X2() {
    }

    @Override // com.google.android.gms.internal.play_billing.M1
    public final boolean a(int i10) {
        return (i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Y2.ALTERNATIVE_BILLING_ACTION : Y2.LOCAL_PURCHASES_UPDATED_ACTION : Y2.PURCHASES_UPDATED_ACTION : Y2.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}
