package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import Td.r;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import c1.d;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\b\n\u001a:\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\u000e\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u0005*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00030\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u001aX\u0010\u0012\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u0005*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00030\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u001a:\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0005*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\t\u001aX\u0010\u0018\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00150\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\f0\u0005*\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00030\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\t\u001a:\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0005*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\t\u001a\u0016\u0010\u001e\u001a\u00020\u001b*\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\"\u001a\u00020\u001f*\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010#\u001a\u00020\u000b*\u00020\u001fH\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010#\u001a\u00020\u000b*\u00020\u001bH\u0000¢\u0006\u0004\b#\u0010%\u001a\u0013\u0010\"\u001a\u00020\u001f*\u00020\u001bH\u0000¢\u0006\u0004\b\"\u0010&\u001a\u0013\u0010\u001e\u001a\u00020\u001b*\u00020\u001fH\u0000¢\u0006\u0004\b\u001e\u0010'\u001a2\u0010-\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010(*\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010*\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a&\u0010-\u001a\u0004\u0018\u00010\u000b*\b\u0012\u0004\u0012\u00020\u000b0.2\u0006\u0010*\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010/\u001a\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f00*\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\" \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\"\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u001f00*\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107*$\b\u0000\u00109\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/LocalizationDictionary;", SubscriberAttributeKt.JSON_NAME_KEY, "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingStringLocalization;", "string-7v81vok", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "string", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "stringForAllLocales-7v81vok", "stringForAllLocales", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingImageLocalization;", "imageForAllLocales-7v81vok", "imageForAllLocales", "image-7v81vok", "image", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError$MissingVideoLocalization;", "videoForAllLocales-7v81vok", "videoForAllLocales", "video-7v81vok", "video", "Lc1/d;", "toComposeLocale-_KYeFs0", "(Ljava/lang/String;)Lc1/d;", "toComposeLocale", "Ljava/util/Locale;", "toJavaLocale-_KYeFs0", "(Ljava/lang/String;)Ljava/util/Locale;", "toJavaLocale", "toLocaleId", "(Ljava/util/Locale;)Ljava/lang/String;", "(Lc1/d;)Ljava/lang/String;", "(Lc1/d;)Ljava/util/Locale;", "(Ljava/util/Locale;)Lc1/d;", "V", "", "localeId", "getBestMatch-64pKzr8", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "getBestMatch", "", "(Ljava/util/Set;Ljava/lang/String;)Ljava/lang/String;", "", "withFallbackLanguages-_KYeFs0", "(Ljava/lang/String;)Ljava/util/List;", "withFallbackLanguages", "scriptByRegion", "Ljava/util/Map;", "getFallbackLanguages", "(Ljava/util/Locale;)Ljava/util/List;", "fallbackLanguages", "LocalizationDictionary", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LocalizationKt {
    private static final Map<String, String> scriptByRegion = S.l(z.a("CN", "Hans"), z.a("SG", "Hans"), z.a("MY", "Hans"), z.a("TW", "Hant"), z.a("HK", "Hant"), z.a("MO", "Hant"));

    /* JADX INFO: renamed from: getBestMatch-64pKzr8 */
    public static final /* synthetic */ Object m420getBestMatch64pKzr8(Map getBestMatch, String localeId) {
        AbstractC5504s.h(getBestMatch, "$this$getBestMatch");
        AbstractC5504s.h(localeId, "localeId");
        String strM421getBestMatch64pKzr8 = m421getBestMatch64pKzr8(getBestMatch.keySet(), localeId);
        if (strM421getBestMatch64pKzr8 != null) {
            return getBestMatch.get(LocaleId.m307boximpl(strM421getBestMatch64pKzr8));
        }
        return null;
    }

    private static final List<Locale> getFallbackLanguages(Locale locale) {
        String language = locale.getLanguage();
        return AbstractC5504s.c(language, "nb") ? AbstractC2279u.e(new Locale("no", locale.getCountry(), locale.getVariant())) : AbstractC5504s.c(language, "nn") ? AbstractC2279u.e(new Locale("no", locale.getCountry(), locale.getVariant())) : AbstractC2279u.m();
    }

    /* JADX INFO: renamed from: image-7v81vok */
    public static final /* synthetic */ Result m422image7v81vok(NonEmptyMap image, String key) {
        AbstractC5504s.h(image, "$this$image");
        AbstractC5504s.h(key, "key");
        Object obj = image.get(LocalizationKey.m343boximpl(key));
        ThemeImageUrls themeImageUrlsM322unboximpl = obj instanceof LocalizationData.Image ? ((LocalizationData.Image) obj).m322unboximpl() : null;
        return themeImageUrlsM322unboximpl != null ? new Result.Success(themeImageUrlsM322unboximpl) : new Result.Error(new PaywallValidationError.MissingImageLocalization(key, null, 2, null));
    }

    /* JADX INFO: renamed from: imageForAllLocales-7v81vok */
    public static final /* synthetic */ Result m423imageForAllLocales7v81vok(NonEmptyMap imageForAllLocales, String key) {
        AbstractC5504s.h(imageForAllLocales, "$this$imageForAllLocales");
        AbstractC5504s.h(key, "key");
        Map map = imageForAllLocales.all;
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key2 = entry.getKey();
            String strM313unboximpl = ((LocaleId) entry.getKey()).m313unboximpl();
            Result resultM422image7v81vok = m422image7v81vok((NonEmptyMap) entry.getValue(), key);
            if (!(resultM422image7v81vok instanceof Result.Success)) {
                if (!(resultM422image7v81vok instanceof Result.Error)) {
                    throw new r();
                }
                resultM422image7v81vok = new Result.Error(NonEmptyListKt.nonEmptyListOf(new PaywallValidationError.MissingImageLocalization(key, strM313unboximpl, null), new PaywallValidationError.MissingImageLocalization[0]));
            }
            linkedHashMap.put(key2, resultM422image7v81vok);
        }
        NonEmptyMap nonEmptyMapNonEmptyMapOf = NonEmptyMapKt.nonEmptyMapOf(z.a(imageForAllLocales.getEntry().getKey(), S.j(linkedHashMap, imageForAllLocales.getEntry().getKey())), linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Result success = (Result) nonEmptyMapNonEmptyMapOf.getEntry().getValue();
        if (success instanceof Result.Success) {
            success = new Result.Success((ThemeImageUrls) ((Result.Success) success).getValue());
        } else if (!(success instanceof Result.Error)) {
            throw new r();
        }
        if (success instanceof Result.Success) {
            success = new Result.Success(z.a(nonEmptyMapNonEmptyMapOf.getEntry().getKey(), ((Result.Success) success).getValue()));
        } else if (!(success instanceof Result.Error)) {
            throw new r();
        }
        if (!(success instanceof Result.Success) && (success instanceof Result.Error)) {
            arrayList.addAll((NonEmptyList) ((Result.Error) success).getValue());
        }
        Iterator it = nonEmptyMapNonEmptyMapOf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key3 = entry2.getKey();
            Result result = (Result) entry2.getValue();
            if (result instanceof Result.Success) {
                if (arrayList.isEmpty() && !AbstractC5504s.c(key3, nonEmptyMapNonEmptyMapOf.getEntry().getKey())) {
                    linkedHashMap2.put(key3, (ThemeImageUrls) ((Result.Success) result).getValue());
                }
            } else if (result instanceof Result.Error) {
                arrayList.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList);
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(NonEmptyMapKt.nonEmptyMapOf((Pair) ResultKt.getOrThrow(success), linkedHashMap2));
    }

    /* JADX INFO: renamed from: string-7v81vok */
    public static final /* synthetic */ Result m424string7v81vok(NonEmptyMap string, String key) {
        AbstractC5504s.h(string, "$this$string");
        AbstractC5504s.h(key, "key");
        Object obj = string.get(LocalizationKey.m343boximpl(key));
        String strM331unboximpl = obj instanceof LocalizationData.Text ? ((LocalizationData.Text) obj).m331unboximpl() : null;
        return strM331unboximpl != null ? new Result.Success(strM331unboximpl) : new Result.Error(new PaywallValidationError.MissingStringLocalization(key, null, 2, null));
    }

    /* JADX INFO: renamed from: stringForAllLocales-7v81vok */
    public static final /* synthetic */ Result m425stringForAllLocales7v81vok(NonEmptyMap stringForAllLocales, String key) {
        AbstractC5504s.h(stringForAllLocales, "$this$stringForAllLocales");
        AbstractC5504s.h(key, "key");
        Map map = stringForAllLocales.all;
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key2 = entry.getKey();
            String strM313unboximpl = ((LocaleId) entry.getKey()).m313unboximpl();
            Result resultM424string7v81vok = m424string7v81vok((NonEmptyMap) entry.getValue(), key);
            if (!(resultM424string7v81vok instanceof Result.Success)) {
                if (!(resultM424string7v81vok instanceof Result.Error)) {
                    throw new r();
                }
                resultM424string7v81vok = new Result.Error(NonEmptyListKt.nonEmptyListOf(new PaywallValidationError.MissingStringLocalization(key, strM313unboximpl, null), new PaywallValidationError.MissingStringLocalization[0]));
            }
            linkedHashMap.put(key2, resultM424string7v81vok);
        }
        NonEmptyMap nonEmptyMapNonEmptyMapOf = NonEmptyMapKt.nonEmptyMapOf(z.a(stringForAllLocales.getEntry().getKey(), S.j(linkedHashMap, stringForAllLocales.getEntry().getKey())), linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Result success = (Result) nonEmptyMapNonEmptyMapOf.getEntry().getValue();
        if (success instanceof Result.Success) {
            success = new Result.Success((String) ((Result.Success) success).getValue());
        } else if (!(success instanceof Result.Error)) {
            throw new r();
        }
        if (success instanceof Result.Success) {
            success = new Result.Success(z.a(nonEmptyMapNonEmptyMapOf.getEntry().getKey(), ((Result.Success) success).getValue()));
        } else if (!(success instanceof Result.Error)) {
            throw new r();
        }
        if (!(success instanceof Result.Success) && (success instanceof Result.Error)) {
            arrayList.addAll((NonEmptyList) ((Result.Error) success).getValue());
        }
        Iterator it = nonEmptyMapNonEmptyMapOf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key3 = entry2.getKey();
            Result result = (Result) entry2.getValue();
            if (result instanceof Result.Success) {
                if (arrayList.isEmpty() && !AbstractC5504s.c(key3, nonEmptyMapNonEmptyMapOf.getEntry().getKey())) {
                    linkedHashMap2.put(key3, (String) ((Result.Success) result).getValue());
                }
            } else if (result instanceof Result.Error) {
                arrayList.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList);
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(NonEmptyMapKt.nonEmptyMapOf((Pair) ResultKt.getOrThrow(success), linkedHashMap2));
    }

    public static final /* synthetic */ d toComposeLocale(Locale locale) {
        AbstractC5504s.h(locale, "<this>");
        String languageTag = locale.toLanguageTag();
        AbstractC5504s.g(languageTag, "toLanguageTag()");
        return new d(languageTag);
    }

    /* JADX INFO: renamed from: toComposeLocale-_KYeFs0 */
    public static final /* synthetic */ d m426toComposeLocale_KYeFs0(String toComposeLocale) {
        AbstractC5504s.h(toComposeLocale, "$this$toComposeLocale");
        return new d(Df.r.J(toComposeLocale, '_', '-', false, 4, null));
    }

    public static final /* synthetic */ Locale toJavaLocale(d dVar) {
        AbstractC5504s.h(dVar, "<this>");
        Locale localeForLanguageTag = Locale.forLanguageTag(dVar.c());
        AbstractC5504s.g(localeForLanguageTag, "forLanguageTag(toLanguageTag())");
        return localeForLanguageTag;
    }

    /* JADX INFO: renamed from: toJavaLocale-_KYeFs0 */
    public static final /* synthetic */ Locale m427toJavaLocale_KYeFs0(String toJavaLocale) {
        AbstractC5504s.h(toJavaLocale, "$this$toJavaLocale");
        Locale localeForLanguageTag = Locale.forLanguageTag(Df.r.J(toJavaLocale, '_', '-', false, 4, null));
        AbstractC5504s.g(localeForLanguageTag, "forLanguageTag(value.replace('_', '-'))");
        return localeForLanguageTag;
    }

    public static final /* synthetic */ String toLocaleId(Locale locale) {
        AbstractC5504s.h(locale, "<this>");
        String languageTag = locale.toLanguageTag();
        AbstractC5504s.g(languageTag, "toLanguageTag()");
        return LocaleId.m308constructorimpl(Df.r.J(languageTag, '-', '_', false, 4, null));
    }

    /* JADX INFO: renamed from: video-7v81vok */
    public static final /* synthetic */ Result m428video7v81vok(NonEmptyMap video, String key) {
        AbstractC5504s.h(video, "$this$video");
        AbstractC5504s.h(key, "key");
        Object obj = video.get(LocalizationKey.m343boximpl(key));
        ThemeVideoUrls themeVideoUrlsM340unboximpl = obj instanceof LocalizationData.Video ? ((LocalizationData.Video) obj).m340unboximpl() : null;
        return themeVideoUrlsM340unboximpl != null ? new Result.Success(themeVideoUrlsM340unboximpl) : new Result.Error(new PaywallValidationError.MissingVideoLocalization(key, null, 2, null));
    }

    /* JADX INFO: renamed from: videoForAllLocales-7v81vok */
    public static final /* synthetic */ Result m429videoForAllLocales7v81vok(NonEmptyMap videoForAllLocales, String key) {
        AbstractC5504s.h(videoForAllLocales, "$this$videoForAllLocales");
        AbstractC5504s.h(key, "key");
        Map map = videoForAllLocales.all;
        LinkedHashMap linkedHashMap = new LinkedHashMap(S.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key2 = entry.getKey();
            String strM313unboximpl = ((LocaleId) entry.getKey()).m313unboximpl();
            Result resultM428video7v81vok = m428video7v81vok((NonEmptyMap) entry.getValue(), key);
            if (!(resultM428video7v81vok instanceof Result.Success)) {
                if (!(resultM428video7v81vok instanceof Result.Error)) {
                    throw new r();
                }
                resultM428video7v81vok = new Result.Error(NonEmptyListKt.nonEmptyListOf(new PaywallValidationError.MissingVideoLocalization(key, strM313unboximpl, null), new PaywallValidationError.MissingVideoLocalization[0]));
            }
            linkedHashMap.put(key2, resultM428video7v81vok);
        }
        NonEmptyMap nonEmptyMapNonEmptyMapOf = NonEmptyMapKt.nonEmptyMapOf(z.a(videoForAllLocales.getEntry().getKey(), S.j(linkedHashMap, videoForAllLocales.getEntry().getKey())), linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Result success = (Result) nonEmptyMapNonEmptyMapOf.getEntry().getValue();
        if (success instanceof Result.Success) {
            success = new Result.Success((ThemeVideoUrls) ((Result.Success) success).getValue());
        } else if (!(success instanceof Result.Error)) {
            throw new r();
        }
        if (success instanceof Result.Success) {
            success = new Result.Success(z.a(nonEmptyMapNonEmptyMapOf.getEntry().getKey(), ((Result.Success) success).getValue()));
        } else if (!(success instanceof Result.Error)) {
            throw new r();
        }
        if (!(success instanceof Result.Success) && (success instanceof Result.Error)) {
            arrayList.addAll((NonEmptyList) ((Result.Error) success).getValue());
        }
        Iterator it = nonEmptyMapNonEmptyMapOf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key3 = entry2.getKey();
            Result result = (Result) entry2.getValue();
            if (result instanceof Result.Success) {
                if (arrayList.isEmpty() && !AbstractC5504s.c(key3, nonEmptyMapNonEmptyMapOf.getEntry().getKey())) {
                    linkedHashMap2.put(key3, (ThemeVideoUrls) ((Result.Success) result).getValue());
                }
            } else if (result instanceof Result.Error) {
                arrayList.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList);
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(NonEmptyMapKt.nonEmptyMapOf((Pair) ResultKt.getOrThrow(success), linkedHashMap2));
    }

    /* JADX INFO: renamed from: withFallbackLanguages-_KYeFs0 */
    private static final List<Locale> m430withFallbackLanguages_KYeFs0(String str) {
        Locale localeM427toJavaLocale_KYeFs0 = m427toJavaLocale_KYeFs0(str);
        List<Locale> fallbackLanguages = getFallbackLanguages(localeM427toJavaLocale_KYeFs0);
        if (fallbackLanguages.isEmpty()) {
            return AbstractC2279u.e(localeM427toJavaLocale_KYeFs0);
        }
        List listC = AbstractC2279u.c();
        listC.add(localeM427toJavaLocale_KYeFs0);
        listC.addAll(fallbackLanguages);
        return AbstractC2279u.a(listC);
    }

    /* JADX INFO: renamed from: getBestMatch-64pKzr8 */
    public static final /* synthetic */ String m421getBestMatch64pKzr8(Set getBestMatch, String localeId) {
        LocaleId localeIdM307boximpl;
        String strM308constructorimpl;
        String strM308constructorimpl2;
        Object next;
        Object next2;
        Object next3;
        AbstractC5504s.h(getBestMatch, "$this$getBestMatch");
        AbstractC5504s.h(localeId, "localeId");
        if (getBestMatch.contains(LocaleId.m307boximpl(localeId))) {
            return localeId;
        }
        Iterator<T> it = m430withFallbackLanguages_KYeFs0(localeId).iterator();
        while (true) {
            if (!it.hasNext()) {
                localeIdM307boximpl = null;
                break;
            }
            Locale locale = (Locale) it.next();
            String language = locale.getLanguage();
            String country = locale.getCountry();
            String it2 = locale.getScript();
            AbstractC5504s.g(it2, "it");
            if (Df.r.l0(it2)) {
                it2 = null;
            }
            if (it2 == null) {
                it2 = scriptByRegion.get(country);
            }
            AbstractC5504s.g(language, "language");
            String strM308constructorimpl3 = LocaleId.m308constructorimpl(language);
            if (it2 != null) {
                strM308constructorimpl = LocaleId.m308constructorimpl(language + '_' + it2);
            } else {
                strM308constructorimpl = null;
            }
            if (it2 != null) {
                strM308constructorimpl2 = LocaleId.m308constructorimpl(language + '_' + it2 + '_' + country);
            } else {
                strM308constructorimpl2 = null;
            }
            String localeId2 = toLocaleId(locale);
            List listC = AbstractC2279u.c();
            listC.add(LocaleId.m307boximpl(localeId2));
            if (strM308constructorimpl2 != null) {
                listC.add(LocaleId.m307boximpl(strM308constructorimpl2));
            }
            if (strM308constructorimpl != null) {
                listC.add(LocaleId.m307boximpl(strM308constructorimpl));
            }
            listC.add(LocaleId.m307boximpl(strM308constructorimpl3));
            Iterator it3 = AbstractC2279u.a(listC).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (getBestMatch.contains(LocaleId.m307boximpl(((LocaleId) next).m313unboximpl()))) {
                    break;
                }
            }
            LocaleId localeId3 = (LocaleId) next;
            String strM313unboximpl = localeId3 != null ? localeId3.m313unboximpl() : null;
            if (strM313unboximpl == null) {
                Set set = getBestMatch;
                ArrayList arrayList = new ArrayList(AbstractC2279u.x(set, 10));
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    arrayList.add(m427toJavaLocale_KYeFs0(((LocaleId) it4.next()).m313unboximpl()));
                }
                Iterator it5 = arrayList.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it5.next();
                    Locale locale2 = (Locale) next2;
                    if (AbstractC5504s.c(locale2.getLanguage(), language) && AbstractC5504s.c(locale2.getScript(), it2)) {
                        break;
                    }
                }
                Locale locale3 = (Locale) next2;
                if (locale3 != null) {
                    strM313unboximpl = toLocaleId(locale3);
                } else {
                    Iterator it6 = arrayList.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it6.next();
                        if (AbstractC5504s.c(((Locale) next3).getLanguage(), language)) {
                            break;
                        }
                    }
                    Locale locale4 = (Locale) next3;
                    strM313unboximpl = locale4 != null ? toLocaleId(locale4) : null;
                }
            }
            localeIdM307boximpl = strM313unboximpl != null ? LocaleId.m307boximpl(strM313unboximpl) : null;
            if (localeIdM307boximpl != null) {
                break;
            }
        }
        if (localeIdM307boximpl != null) {
            return localeIdM307boximpl.m313unboximpl();
        }
        return null;
    }

    public static final /* synthetic */ String toLocaleId(d dVar) {
        AbstractC5504s.h(dVar, "<this>");
        return LocaleId.m308constructorimpl(Df.r.J(dVar.c(), '-', '_', false, 4, null));
    }
}
