package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Td.r;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0007\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\f2\u0006\u0010\r\u001a\u00020\u0005H\u0000\u001a\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\fH\u0000\u001a\"\u0010\u0010\u001a\u0004\u0018\u00010\u000b*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\fH\u0000\u001a\"\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\fH\u0000\u001a\"\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\fH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"isLifetime", "", "Lcom/revenuecat/purchases/Package;", "(Lcom/revenuecat/purchases/Package;)Z", "periodUnitAbbreviatedLocalizationKey", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "getPeriodUnitAbbreviatedLocalizationKey", "(Lcom/revenuecat/purchases/Package;)Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "periodUnitLocalizationKey", "getPeriodUnitLocalizationKey", "getStringOrLogError", "", "", SubscriberAttributeKt.JSON_NAME_KEY, "productPeriod", "localizedVariableKeys", "productPeriodAbbreviated", "productPeriodWithUnit", "productPeriodly", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PackagePeriodExtensionsKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.Unit.values().length];
            try {
                iArr[Period.Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final VariableLocalizationKey getPeriodUnitAbbreviatedLocalizationKey(Package r12) {
        AbstractC5504s.h(r12, "<this>");
        if (isLifetime(r12)) {
            return VariableLocalizationKey.LIFETIME;
        }
        Period period = r12.getProduct().getPeriod();
        if (period != null) {
            return PeriodExtensionsKt.getPeriodUnitAbbreviatedLocalizationKey(period);
        }
        return null;
    }

    public static final VariableLocalizationKey getPeriodUnitLocalizationKey(Package r12) {
        AbstractC5504s.h(r12, "<this>");
        if (isLifetime(r12)) {
            return VariableLocalizationKey.LIFETIME;
        }
        Period period = r12.getProduct().getPeriod();
        if (period != null) {
            return PeriodExtensionsKt.getPeriodUnitLocalizationKey(period);
        }
        return null;
    }

    public static final String getStringOrLogError(Map<VariableLocalizationKey, String> map, VariableLocalizationKey key) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(key, "key");
        String str = map.get(key);
        if (str == null) {
            Logger.INSTANCE.e("Could not find localized string for variable key: " + key);
        }
        return str;
    }

    public static final boolean isLifetime(Package r12) {
        AbstractC5504s.h(r12, "<this>");
        return r12.getPackageType() == PackageType.LIFETIME;
    }

    public static final String productPeriod(Package r42, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        AbstractC5504s.h(r42, "<this>");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        Period period = r42.getProduct().getPeriod();
        if (isLifetime(r42)) {
            return getStringOrLogError(localizedVariableKeys, VariableLocalizationKey.LIFETIME);
        }
        if (period == null) {
            return null;
        }
        if (period.getValue() <= 1) {
            VariableLocalizationKey periodUnitLocalizationKey = getPeriodUnitLocalizationKey(r42);
            if (periodUnitLocalizationKey != null) {
                return getStringOrLogError(localizedVariableKeys, periodUnitLocalizationKey);
            }
            return null;
        }
        String stringOrLogError = getStringOrLogError(localizedVariableKeys, PeriodExtensionsKt.getPeriodValueWithUnitLocalizationKey(period));
        if (stringOrLogError == null) {
            return null;
        }
        String str = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(period.getValue())}, 1));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    public static final String productPeriodAbbreviated(Package r42, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        String stringOrLogError;
        AbstractC5504s.h(r42, "<this>");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        Period period = r42.getProduct().getPeriod();
        if (isLifetime(r42)) {
            return getStringOrLogError(localizedVariableKeys, VariableLocalizationKey.LIFETIME);
        }
        if (period == null) {
            return null;
        }
        if (period.getValue() <= 1) {
            VariableLocalizationKey periodUnitAbbreviatedLocalizationKey = getPeriodUnitAbbreviatedLocalizationKey(r42);
            if (periodUnitAbbreviatedLocalizationKey != null) {
                return getStringOrLogError(localizedVariableKeys, periodUnitAbbreviatedLocalizationKey);
            }
            return null;
        }
        VariableLocalizationKey periodValueWithUnitAbbreviatedLocalizationKey = PeriodExtensionsKt.getPeriodValueWithUnitAbbreviatedLocalizationKey(period);
        if (periodValueWithUnitAbbreviatedLocalizationKey == null || (stringOrLogError = getStringOrLogError(localizedVariableKeys, periodValueWithUnitAbbreviatedLocalizationKey)) == null) {
            return null;
        }
        String str = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(period.getValue())}, 1));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    public static final String productPeriodWithUnit(Package r22, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        String stringOrLogError;
        AbstractC5504s.h(r22, "<this>");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        if (isLifetime(r22)) {
            return getStringOrLogError(localizedVariableKeys, VariableLocalizationKey.LIFETIME);
        }
        Period period = r22.getProduct().getPeriod();
        if (period == null || (stringOrLogError = getStringOrLogError(localizedVariableKeys, PeriodExtensionsKt.getPeriodValueWithUnitLocalizationKey(period))) == null) {
            return null;
        }
        String str = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(period.getValue())}, 1));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    public static final String productPeriodly(Package r32, Map<VariableLocalizationKey, String> localizedVariableKeys) {
        VariableLocalizationKey variableLocalizationKey;
        AbstractC5504s.h(r32, "<this>");
        AbstractC5504s.h(localizedVariableKeys, "localizedVariableKeys");
        Period period = r32.getProduct().getPeriod();
        if (isLifetime(r32)) {
            return getStringOrLogError(localizedVariableKeys, VariableLocalizationKey.LIFETIME);
        }
        if (period == null) {
            return null;
        }
        if (period.getValue() > 1) {
            String stringOrLogError = getStringOrLogError(localizedVariableKeys, PeriodExtensionsKt.getPeriodValueWithUnitLocalizationKey(period));
            if (stringOrLogError == null) {
                return null;
            }
            String str = String.format(stringOrLogError, Arrays.copyOf(new Object[]{Integer.valueOf(period.getValue())}, 1));
            AbstractC5504s.g(str, "format(...)");
            return str;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[period.getUnit().ordinal()];
        if (i10 == 1) {
            variableLocalizationKey = VariableLocalizationKey.DAILY;
        } else if (i10 == 2) {
            variableLocalizationKey = VariableLocalizationKey.WEEKLY;
        } else if (i10 == 3) {
            variableLocalizationKey = VariableLocalizationKey.MONTHLY;
        } else if (i10 == 4) {
            variableLocalizationKey = VariableLocalizationKey.YEARLY;
        } else {
            if (i10 != 5) {
                throw new r();
            }
            variableLocalizationKey = null;
        }
        if (variableLocalizationKey != null) {
            return getStringOrLogError(localizedVariableKeys, variableLocalizationKey);
        }
        return null;
    }
}
