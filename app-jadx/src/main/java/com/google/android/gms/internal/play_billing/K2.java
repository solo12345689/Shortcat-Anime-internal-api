package com.google.android.gms.internal.play_billing;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class K2 implements M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final M1 f40220a = new K2();

    private K2() {
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
            case 14:
            case 15:
                return true;
            default:
                switch (i10) {
                    case 22:
                    case 23:
                    case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
