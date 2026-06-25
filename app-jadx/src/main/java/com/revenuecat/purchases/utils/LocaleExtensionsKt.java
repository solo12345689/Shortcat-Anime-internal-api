package com.revenuecat.purchases.utils;

import Df.r;
import G1.i;
import Ud.AbstractC2273n;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljava/util/Locale;", "convertToCorrectlyFormattedLocale", "(Ljava/util/Locale;)Ljava/util/Locale;", "", "toLocale", "(Ljava/lang/String;)Ljava/util/Locale;", "locale", "", "sharedLanguageCodeWith", "(Ljava/util/Locale;Ljava/util/Locale;)Z", "", "getDefaultLocales", "()Ljava/util/List;", "inferScript", "(Ljava/util/Locale;)Ljava/lang/String;", "LG1/i;", "toList", "(LG1/i;)Ljava/util/List;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LocaleExtensionsKt {
    public static final Locale convertToCorrectlyFormattedLocale(Locale locale) {
        AbstractC5504s.h(locale, "<this>");
        String string = locale.toString();
        AbstractC5504s.g(string, "toString()");
        return toLocale(string);
    }

    public static final List<Locale> getDefaultLocales() {
        i iVarD = i.d();
        AbstractC5504s.g(iVarD, "getDefault()");
        return toList(iVarD);
    }

    private static final String inferScript(Locale locale) {
        String country;
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            String script2 = locale.getScript();
            AbstractC5504s.g(script2, "script");
            return script2;
        }
        if (AbstractC5504s.c(locale.getLanguage(), "zh") && (country = locale.getCountry()) != null) {
            int iHashCode = country.hashCode();
            if (iHashCode != 2155) {
                if (iHashCode != 2307) {
                    if (iHashCode != 2466) {
                        if (iHashCode != 2644) {
                            if (iHashCode == 2691 && country.equals("TW")) {
                                return "Hant";
                            }
                        } else if (country.equals("SG")) {
                            return "Hans";
                        }
                    } else if (country.equals("MO")) {
                        return "Hant";
                    }
                } else if (country.equals("HK")) {
                    return "Hant";
                }
            } else if (country.equals("CN")) {
                return "Hans";
            }
        }
        return "";
    }

    public static final boolean sharedLanguageCodeWith(Locale locale, Locale locale2) {
        AbstractC5504s.h(locale, "<this>");
        AbstractC5504s.h(locale2, "locale");
        try {
            return AbstractC5504s.c(locale.getISO3Language(), locale2.getISO3Language()) && AbstractC5504s.c(inferScript(locale), inferScript(locale2));
        } catch (MissingResourceException e10) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Locale " + locale + " or " + locale2 + " can't obtain ISO3 language code (" + e10 + "). Falling back to language.", null);
            return AbstractC5504s.c(locale.getLanguage(), locale2.getLanguage());
        }
    }

    private static final List<Locale> toList(i iVar) {
        int iG = iVar.g();
        Locale[] localeArr = new Locale[iG];
        for (int i10 = 0; i10 < iG; i10++) {
            localeArr[i10] = iVar.c(i10);
        }
        return AbstractC2273n.U(localeArr);
    }

    public static final Locale toLocale(String str) {
        AbstractC5504s.h(str, "<this>");
        Locale localeForLanguageTag = Locale.forLanguageTag(r.K(str, "_", "-", false, 4, null));
        AbstractC5504s.g(localeForLanguageTag, "forLanguageTag(replace(\"_\", \"-\"))");
        return localeForLanguageTag;
    }
}
