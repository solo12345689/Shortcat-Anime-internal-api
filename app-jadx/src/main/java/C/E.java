package C;

import java.util.List;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    public static final I0.C a(D d10, int i10, int i11, int i12, int i13, int i14, androidx.compose.ui.layout.l lVar, List list, androidx.compose.ui.layout.s[] sVarArr, int i15, int i16, int[] iArr, int i17) throws Throwable {
        int i18;
        float f10;
        float f11;
        String str;
        String str2;
        long j10;
        String str3;
        String str4;
        String str5;
        long j11;
        Integer num;
        int i19;
        int iM;
        int i20;
        int i21;
        String str6;
        int i22;
        String str7;
        String str8;
        float f12;
        String str9;
        int i23;
        String str10;
        int i24;
        String str11;
        int i25;
        float f13;
        String str12;
        long j12;
        String str13;
        long j13;
        String str14;
        float f14;
        int i26;
        char c10;
        int i27;
        int i28;
        int i29;
        int i30;
        int iMax;
        int i31;
        int i32;
        int i33;
        int i34;
        float f15;
        int[] iArr2;
        D d11;
        int i35;
        int i36 = i13;
        List list2 = list;
        int i37 = i16;
        long j14 = i14;
        int i38 = i37 - i15;
        int[] iArr3 = new int[i38];
        int i39 = 0;
        int i40 = i15;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        float f16 = 0.0f;
        while (true) {
            if (i40 >= i37) {
                break;
            }
            int i46 = i40;
            I0.A a10 = (I0.A) list2.get(i40);
            F fC = C.c(a10);
            float fE = C.e(fC);
            int i47 = (i42 != 0 || C.f(fC)) ? 1 : i39;
            if (fE > 0.0f) {
                i41++;
                f16 += fE;
                i33 = i38;
                i35 = i44;
                iArr2 = iArr3;
            } else {
                if (i36 != Integer.MAX_VALUE && fC != null) {
                    fC.c();
                }
                int i48 = i12 - i44;
                androidx.compose.ui.layout.s sVarV0 = sVarArr[i46];
                if (sVarV0 == null) {
                    i32 = i48;
                    i31 = i41;
                    i33 = i38;
                    i34 = i44;
                    f15 = f16;
                    iArr2 = iArr3;
                    d11 = d10;
                    sVarV0 = a10.v0(D.e(d11, 0, 0, i12 != Integer.MAX_VALUE ? AbstractC5874j.e(i48, i39) : Integer.MAX_VALUE, i36, false, 16, null));
                } else {
                    i31 = i41;
                    i32 = i48;
                    i33 = i38;
                    i34 = i44;
                    f15 = f16;
                    iArr2 = iArr3;
                    d11 = d10;
                }
                int iD = d11.d(sVarV0);
                int iF = d11.f(sVarV0);
                iArr2[i46 - i15] = iD;
                int iMin = Math.min(i14, AbstractC5874j.e(i32 - iD, 0));
                i35 = iD + iMin + i34;
                int iMax2 = Math.max(i45, iF);
                sVarArr[i46] = sVarV0;
                i45 = iMax2;
                i43 = iMin;
                i41 = i31;
                f16 = f15;
            }
            i40 = i46 + 1;
            i36 = i13;
            iArr3 = iArr2;
            i42 = i47;
            i38 = i33;
            i44 = i35;
            i39 = 0;
        }
        int i49 = i41;
        int i50 = i38;
        int i51 = i44;
        int i52 = i45;
        float f17 = f16;
        int[] iArr4 = iArr3;
        D d12 = d10;
        if (i49 == 0) {
            i20 = i51 - i43;
            i19 = i52;
            i18 = i42;
            num = null;
            iM = 0;
        } else {
            int i53 = i12 != Integer.MAX_VALUE ? i12 : i10;
            long j15 = ((long) (i49 - 1)) * j14;
            i18 = i42;
            long jF = AbstractC5874j.f(((long) (i53 - i51)) - j15, 0L);
            float f18 = f17;
            float f19 = jF / f18;
            int i54 = i15;
            long jRound = jF;
            while (true) {
                f10 = f19;
                f11 = f18;
                str = "arrangementSpacingTotal ";
                str2 = "fixedSpace ";
                j10 = jF;
                str3 = "weightChildrenCount ";
                str4 = "remainingToTarget ";
                str5 = "targetSpace ";
                j11 = j15;
                if (i54 >= i37) {
                    break;
                }
                float fE2 = C.e(C.c((I0.A) list2.get(i54)));
                float f20 = f10 * fE2;
                try {
                    jRound -= (long) Math.round(f20);
                    i54++;
                    list2 = list;
                    f19 = f10;
                    f18 = f11;
                    jF = j10;
                    j15 = j11;
                } catch (IllegalArgumentException e10) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i12 + "mainAxisMin " + i10 + "targetSpace " + i53 + "arrangementSpacingPx " + j14 + "weightChildrenCount " + i49 + "fixedSpace " + i51 + "arrangementSpacingTotal " + j11 + str4 + j10 + "totalWeight " + f11 + "weightUnitSpace " + f10 + "itemWeight " + fE2 + "weightedSize " + f20).initCause(e10);
                }
            }
            String str15 = "weightedSize ";
            int i55 = i49;
            String str16 = "weightUnitSpace ";
            String str17 = "mainAxisMin ";
            int i56 = i15;
            int i57 = i52;
            int i58 = 0;
            while (i56 < i37) {
                if (sVarArr[i56] == null) {
                    String str18 = str3;
                    i22 = i56;
                    I0.A a11 = (I0.A) list.get(i56);
                    F fC2 = C.c(a11);
                    float fE3 = C.e(fC2);
                    int i59 = i58;
                    String str19 = str;
                    if (i13 != Integer.MAX_VALUE && fC2 != null) {
                        fC2.c();
                    }
                    if (fE3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int iB = AbstractC5466a.b(jRound);
                    String str20 = str15;
                    jRound -= (long) iB;
                    float f21 = f10 * fE3;
                    int iMax3 = Math.max(0, Math.round(f21) + iB);
                    try {
                    } catch (IllegalArgumentException e11) {
                        e = e11;
                        i25 = iB;
                        f13 = f21;
                        str12 = str2;
                        str8 = str16;
                        f12 = f10;
                        j12 = j10;
                        str13 = str4;
                        j13 = j11;
                        str6 = str19;
                        str14 = str20;
                        f14 = fE3;
                        str9 = str5;
                        i26 = i55;
                        i23 = i51;
                        str10 = str18;
                        str11 = str17;
                    }
                    try {
                        if (C.b(fC2)) {
                            c10 = 65535;
                            if (iMax3 != Integer.MAX_VALUE) {
                                i27 = iB;
                                i28 = iMax3;
                            }
                            i25 = i27;
                            str8 = str16;
                            f12 = f10;
                            f13 = f21;
                            j12 = j10;
                            str13 = str4;
                            j13 = j11;
                            str6 = str19;
                            str14 = str20;
                            f14 = fE3;
                            str12 = str2;
                            i26 = i55;
                            i23 = i51;
                            str10 = str18;
                            str11 = str17;
                            str9 = str5;
                            androidx.compose.ui.layout.s sVarV02 = a11.v0(d10.a(i28, 0, iMax3, i13, true));
                            int iD2 = d10.d(sVarV02);
                            int iF2 = d10.f(sVarV02);
                            iArr4[i22 - i15] = iD2;
                            int iMax4 = Math.max(i57, iF2);
                            sVarArr[i22] = sVarV02;
                            i21 = i59 + iD2;
                            i57 = iMax4;
                            str7 = str12;
                            i24 = i26;
                            j11 = j13;
                            j10 = j12;
                            str15 = str14;
                            str4 = str13;
                        } else {
                            c10 = 65535;
                        }
                        androidx.compose.ui.layout.s sVarV022 = a11.v0(d10.a(i28, 0, iMax3, i13, true));
                        int iD22 = d10.d(sVarV022);
                        int iF22 = d10.f(sVarV022);
                        iArr4[i22 - i15] = iD22;
                        int iMax42 = Math.max(i57, iF22);
                        sVarArr[i22] = sVarV022;
                        i21 = i59 + iD22;
                        i57 = iMax42;
                        str7 = str12;
                        i24 = i26;
                        j11 = j13;
                        j10 = j12;
                        str15 = str14;
                        str4 = str13;
                    } catch (IllegalArgumentException e12) {
                        e = e12;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i12 + str11 + i10 + str9 + i53 + "arrangementSpacingPx " + j14 + str10 + i26 + str12 + i23 + str6 + j13 + str13 + j12 + "totalWeight " + f11 + str8 + f12 + "weight " + f14 + str14 + f13 + "crossAxisDesiredSize " + ((Object) null) + "remainderUnit " + i25 + "childMainAxisSize " + iMax3).initCause(e);
                    }
                    i27 = iB;
                    i28 = 0;
                    i25 = i27;
                    str8 = str16;
                    f12 = f10;
                    f13 = f21;
                    j12 = j10;
                    str13 = str4;
                    j13 = j11;
                    str6 = str19;
                    str14 = str20;
                    f14 = fE3;
                    str12 = str2;
                    i26 = i55;
                    i23 = i51;
                    str10 = str18;
                    str11 = str17;
                    str9 = str5;
                } else {
                    i21 = i58;
                    str6 = str;
                    i22 = i56;
                    str7 = str2;
                    str8 = str16;
                    f12 = f10;
                    str9 = str5;
                    i23 = i51;
                    str10 = str3;
                    i24 = i55;
                    str11 = str17;
                }
                i56 = i22 + 1;
                str5 = str9;
                str17 = str11;
                str2 = str7;
                i58 = i21;
                str16 = str8;
                str = str6;
                i37 = i16;
                i55 = i24;
                str3 = str10;
                i51 = i23;
                f10 = f12;
            }
            num = null;
            int i60 = i58;
            int i61 = i51;
            i19 = i57;
            d12 = d10;
            iM = AbstractC5874j.m((int) (((long) i60) + j11), 0, i12 - i61);
            i20 = i61;
        }
        if (i18 != 0) {
            i29 = i16;
            iMax = 0;
            int iMax5 = 0;
            for (int i62 = i15; i62 < i29; i62++) {
                androidx.compose.ui.layout.s sVar = sVarArr[i62];
                AbstractC5504s.e(sVar);
                AbstractC1141l abstractC1141lA = C.a(C.d(sVar));
                Integer numB = abstractC1141lA != null ? abstractC1141lA.b(sVar) : num;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    int iF3 = d12.f(sVar);
                    iMax = Math.max(iMax, iIntValue != Integer.MIN_VALUE ? numB.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iF3;
                    }
                    iMax5 = Math.max(iMax5, iF3 - iIntValue);
                }
            }
            i30 = iMax5;
        } else {
            i29 = i16;
            i30 = 0;
            iMax = 0;
        }
        int iMax6 = Math.max(AbstractC5874j.e(i20 + iM, 0), i10);
        int iMax7 = Math.max(i19, Math.max(i11, i30 + iMax));
        int[] iArr5 = new int[i50];
        for (int i63 = 0; i63 < i50; i63++) {
            iArr5[i63] = 0;
        }
        d12.b(iMax6, iArr4, iArr5, lVar);
        return d12.c(sVarArr, lVar, iMax, iArr5, iMax6, iMax7, iArr, i17, i15, i29);
    }
}
