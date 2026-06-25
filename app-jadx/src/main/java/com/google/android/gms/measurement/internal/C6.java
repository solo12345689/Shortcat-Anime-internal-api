package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        boolean zL = false;
        int iR = 0;
        boolean zL2 = false;
        boolean zL3 = false;
        int iR2 = 0;
        int iR3 = 0;
        long jT = 0;
        long jT2 = 0;
        long jT3 = 0;
        long jT4 = 0;
        long jT5 = 0;
        long jT6 = 0;
        long jT7 = 0;
        String strF = "";
        String strF2 = strF;
        String strF3 = strF2;
        String strF4 = strF3;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        Boolean boolM = null;
        ArrayList arrayListG = null;
        String strF11 = null;
        String strF12 = null;
        int iR4 = 100;
        boolean zL4 = true;
        boolean zL5 = true;
        long jT8 = -2147483648L;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            switch (S8.b.k(iP)) {
                case 2:
                    strF5 = S8.b.f(parcel, iP);
                    break;
                case 3:
                    strF6 = S8.b.f(parcel, iP);
                    break;
                case 4:
                    strF7 = S8.b.f(parcel, iP);
                    break;
                case 5:
                    strF8 = S8.b.f(parcel, iP);
                    break;
                case 6:
                    jT = S8.b.t(parcel, iP);
                    break;
                case 7:
                    jT2 = S8.b.t(parcel, iP);
                    break;
                case 8:
                    strF9 = S8.b.f(parcel, iP);
                    break;
                case 9:
                    zL4 = S8.b.l(parcel, iP);
                    break;
                case 10:
                    zL = S8.b.l(parcel, iP);
                    break;
                case 11:
                    jT8 = S8.b.t(parcel, iP);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    strF10 = S8.b.f(parcel, iP);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                case 33:
                default:
                    S8.b.w(parcel, iP);
                    break;
                case 14:
                    jT3 = S8.b.t(parcel, iP);
                    break;
                case 15:
                    iR = S8.b.r(parcel, iP);
                    break;
                case 16:
                    zL5 = S8.b.l(parcel, iP);
                    break;
                case 18:
                    zL2 = S8.b.l(parcel, iP);
                    break;
                case 21:
                    boolM = S8.b.m(parcel, iP);
                    break;
                case 22:
                    jT4 = S8.b.t(parcel, iP);
                    break;
                case 23:
                    arrayListG = S8.b.g(parcel, iP);
                    break;
                case 25:
                    strF = S8.b.f(parcel, iP);
                    break;
                case 26:
                    strF2 = S8.b.f(parcel, iP);
                    break;
                case 27:
                    strF11 = S8.b.f(parcel, iP);
                    break;
                case 28:
                    zL3 = S8.b.l(parcel, iP);
                    break;
                case 29:
                    jT5 = S8.b.t(parcel, iP);
                    break;
                case 30:
                    iR4 = S8.b.r(parcel, iP);
                    break;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    strF3 = S8.b.f(parcel, iP);
                    break;
                case 32:
                    iR2 = S8.b.r(parcel, iP);
                    break;
                case 34:
                    jT6 = S8.b.t(parcel, iP);
                    break;
                case 35:
                    strF12 = S8.b.f(parcel, iP);
                    break;
                case 36:
                    strF4 = S8.b.f(parcel, iP);
                    break;
                case 37:
                    jT7 = S8.b.t(parcel, iP);
                    break;
                case 38:
                    iR3 = S8.b.r(parcel, iP);
                    break;
            }
        }
        S8.b.j(parcel, iX);
        return new B6(strF5, strF6, strF7, strF8, jT, jT2, strF9, zL4, zL, jT8, strF10, jT3, iR, zL5, zL2, boolM, jT4, arrayListG, strF, strF2, strF11, zL3, jT5, iR4, strF3, iR2, jT6, strF12, strF4, jT7, iR3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new B6[i10];
    }
}
