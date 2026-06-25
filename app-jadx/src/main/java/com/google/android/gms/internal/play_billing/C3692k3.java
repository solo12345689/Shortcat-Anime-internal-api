package com.google.android.gms.internal.play_billing;

import com.revenuecat.purchases.common.verification.SigningManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3692k3 implements M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final M1 f40496a = new C3692k3();

    private C3692k3() {
    }

    @Override // com.google.android.gms.internal.play_billing.M1
    public final boolean a(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
                return true;
            case 14:
            case 15:
            case 16:
            default:
                return false;
        }
    }
}
