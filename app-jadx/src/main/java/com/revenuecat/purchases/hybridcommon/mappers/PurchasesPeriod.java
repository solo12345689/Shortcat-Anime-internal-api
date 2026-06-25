package com.revenuecat.purchases.hybridcommon.mappers;

import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class PurchasesPeriod {
    final int days;
    final int months;
    final int years;
    private static final PurchasesPeriod ZERO = new PurchasesPeriod(0, 0, 0);
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    private PurchasesPeriod(int i10, int i11, int i12) {
        this.years = i10;
        this.months = i11;
        this.days = i12;
    }

    private static PurchasesPeriod create(int i10, int i11, int i12) {
        return ((i10 | i11) | i12) == 0 ? ZERO : new PurchasesPeriod(i10, i11, i12);
    }

    public static PurchasesPeriod parse(CharSequence charSequence) {
        Matcher matcher = PATTERN.matcher(charSequence);
        if (matcher.matches()) {
            int i10 = "-".equals(matcher.group(1)) ? -1 : 1;
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(3);
            String strGroup3 = matcher.group(4);
            String strGroup4 = matcher.group(5);
            if (strGroup != null || strGroup2 != null || strGroup4 != null || strGroup3 != null) {
                try {
                    return create(parseNumber(charSequence, strGroup, i10), parseNumber(charSequence, strGroup2, i10), PurchasesMath.addExact(parseNumber(charSequence, strGroup4, i10), PurchasesMath.multiplyExact(parseNumber(charSequence, strGroup3, i10), 7)));
                } catch (ArithmeticException | NumberFormatException unused) {
                    Log.e("PURCHASES", "Text cannot be parsed to a Period: " + ((Object) charSequence));
                    return null;
                }
            }
        }
        Log.e("PURCHASES", "Text cannot be parsed to a Period: " + ((Object) charSequence));
        return null;
    }

    private static int parseNumber(CharSequence charSequence, String str, int i10) {
        if (str == null) {
            return 0;
        }
        return PurchasesMath.multiplyExact(Integer.parseInt(str), i10);
    }
}
