package com.revenuecat.purchases.models;

import Df.InterfaceC1279l;
import Df.p;
import Td.r;
import com.revenuecat.purchases.models.Period;
import ke.AbstractC5466a;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"toPeriod", "Lkotlin/Pair;", "", "Lcom/revenuecat/purchases/models/Period$Unit;", "", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PeriodKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.Unit.values().length];
            try {
                iArr[Period.Unit.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.Unit.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.Unit.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.Unit.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Pair<Integer, Period.Unit> toPeriod(String str) {
        double d10;
        double d11;
        double d12;
        InterfaceC1279l interfaceC1279lG = new p("^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$").g(str);
        if (interfaceC1279lG == null) {
            return new Pair<>(0, Period.Unit.UNKNOWN);
        }
        PeriodKt$toPeriod$1$toInt$1 periodKt$toPeriod$1$toInt$1 = PeriodKt$toPeriod$1$toInt$1.INSTANCE;
        InterfaceC1279l.b bVarA = interfaceC1279lG.a();
        String str2 = (String) bVarA.a().b().get(1);
        String str3 = (String) bVarA.a().b().get(2);
        String str4 = (String) bVarA.a().b().get(3);
        String str5 = (String) bVarA.a().b().get(4);
        int iIntValue = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str2)).intValue();
        int iIntValue2 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str3)).intValue();
        int iIntValue3 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str4)).intValue();
        int iIntValue4 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str5)).intValue();
        Period.Unit unit = iIntValue4 > 0 ? Period.Unit.DAY : iIntValue3 > 0 ? Period.Unit.WEEK : iIntValue2 > 0 ? Period.Unit.MONTH : iIntValue > 0 ? Period.Unit.YEAR : Period.Unit.UNKNOWN;
        int i10 = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                d11 = ((double) iIntValue) * 12.0d;
                d12 = iIntValue2;
            } else if (i10 == 3) {
                d11 = (((double) iIntValue) * 52.142857142857146d) + (((double) iIntValue2) * 4.345238095238096d);
                d12 = iIntValue3;
            } else if (i10 == 4) {
                d11 = (((double) iIntValue) * 365.0d) + (((double) iIntValue2) * 30.0d) + (((double) iIntValue3) * 7.0d);
                d12 = iIntValue4;
            } else {
                if (i10 != 5) {
                    throw new r();
                }
                d10 = 0.0d;
            }
            d10 = d11 + d12;
        } else {
            d10 = iIntValue;
        }
        return new Pair<>(Integer.valueOf(AbstractC5466a.c(d10)), unit);
    }
}
