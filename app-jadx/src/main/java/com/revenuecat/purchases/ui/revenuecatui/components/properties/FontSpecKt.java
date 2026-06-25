package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import Td.r;
import Td.y;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import Y0.AbstractC2469d;
import Y0.AbstractC2481p;
import Y0.AbstractC2485u;
import Y0.AbstractC2486v;
import Y0.B;
import Y0.H;
import Y0.InterfaceC2484t;
import Y0.L;
import Z0.c;
import Z0.e;
import android.content.res.AssetManager;
import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.DownloadedFont;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0000*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u000b\u001a\u0004\u0018\u00010\n*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u0004\u0018\u00010\r*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a=\u0010\u0013\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00100\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a6\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u0016*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00002\u0006\u0010\u0015\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00170\u0016*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010#\u001a\u00020 *\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aC\u0010(\u001a\u00020\u0005*\u00020\u00032\u0006\u0010$\u001a\u00020\u00022\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n0\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0\u0000H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010/\u001a\u00020\u0012*\u00020.H\u0002¢\u0006\u0004\b/\u00100\u001a\u001d\u00102\u001a\u0004\u0018\u000101*\u00020\u00032\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b2\u00103\"\u0014\u00105\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"", "Lcom/revenuecat/purchases/FontAlias;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "resourceProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;", "determineFontSpecs", "(Ljava/util/Map;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)Ljava/util/Map;", "", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec$Resource;", "toFontSpecResource", "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec$Resource;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec$Asset;", "toFontSpecAsset", "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec$Asset;", "LTd/y;", "", "LY0/H;", "toFontResourceIdAndData", "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)Ljava/util/List;", "alias", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "getFontSpec-pDyximM", "(Ljava/util/Map;Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "getFontSpec", "recoverFromFontAliasError", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "LY0/L;", "weight", "style", "LY0/u;", "resolve-RetOiIg", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;LY0/L;I)LY0/u;", "resolve", "fontsConfig", "", "resourceFontFamilies", "assetFontFamilies", "determineFontSpec", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;Ljava/util/Map;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;", "fontInfo", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec$Generic;", "getGenericFontSpec", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec$Generic;", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "toComposeFontStyle", "(Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;)I", "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec$Downloaded;", "getDownloadedFontSpec", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec$Downloaded;", "LZ0/c$a;", "GoogleFontsProvider", "LZ0/c$a;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class FontSpecKt {
    private static final c.a GoogleFontsProvider = new c.a("com.google.android.gms.fonts", "com.google.android.gms", R.array.com_google_android_gms_fonts_certs);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FontStyle.values().length];
            try {
                iArr[FontStyle.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FontStyle.ITALIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final FontSpec determineFontSpec(ResourceProvider resourceProvider, UiConfig.AppConfig.FontsConfig fontsConfig, Map<String, FontSpec.Resource> map, Map<String, FontSpec.Asset> map2) {
        FontSpec.Asset asset;
        UiConfig.AppConfig.FontsConfig.FontInfo android2 = fontsConfig.getAndroid();
        if (android2 instanceof UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts) {
            return new FontSpec.Google(((UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts) android2).getValue());
        }
        if (!(android2 instanceof UiConfig.AppConfig.FontsConfig.FontInfo.Name)) {
            throw new r();
        }
        UiConfig.AppConfig.FontsConfig.FontInfo.Name name = (UiConfig.AppConfig.FontsConfig.FontInfo.Name) android2;
        FontSpec.Generic genericFontSpec = getGenericFontSpec(name);
        if (genericFontSpec != null) {
            return genericFontSpec;
        }
        if (name.getFamily() != null) {
            asset = map.get(name.getFamily());
            if (asset == null) {
                asset = map2.get(name.getFamily());
            }
        } else {
            asset = null;
        }
        if (asset != null) {
            return asset;
        }
        FontSpec.Downloaded downloadedFontSpec = getDownloadedFontSpec(resourceProvider, name);
        if (downloadedFontSpec != null) {
            return downloadedFontSpec;
        }
        FontSpec.System system = new FontSpec.System(name.getValue());
        Logger.INSTANCE.d("Could not find a font resource named `" + name.getValue() + "`. Assuming it's an OEM system font. If it isn't, make sure the font exists in the `res/font` folder. See for more info: https://developer.android.com/develop/ui/views/text-and-emoji/fonts-in-xml");
        return system;
    }

    public static final /* synthetic */ Map determineFontSpecs(Map map, ResourceProvider resourceProvider) {
        String family;
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(resourceProvider, "resourceProvider");
        Set setF1 = AbstractC2279u.f1(map.values());
        ArrayList<Pair> arrayList = new ArrayList();
        Iterator it = setF1.iterator();
        while (true) {
            Pair pairA = null;
            if (!it.hasNext()) {
                break;
            }
            UiConfig.AppConfig.FontsConfig.FontInfo android2 = ((UiConfig.AppConfig.FontsConfig) it.next()).getAndroid();
            UiConfig.AppConfig.FontsConfig.FontInfo.Name name = android2 instanceof UiConfig.AppConfig.FontsConfig.FontInfo.Name ? (UiConfig.AppConfig.FontsConfig.FontInfo.Name) android2 : null;
            if (name != null && (family = name.getFamily()) != null) {
                pairA = z.a(family, name);
            }
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            String str = (String) pair.getFirst();
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((UiConfig.AppConfig.FontsConfig.FontInfo.Name) pair.getSecond());
        }
        ArrayList<Pair> arrayList3 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            FontSpec.Resource fontSpecResource = toFontSpecResource((List) entry.getValue(), resourceProvider);
            Pair pairA2 = fontSpecResource != null ? z.a(str2, fontSpecResource) : null;
            if (pairA2 != null) {
                arrayList3.add(pairA2);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(arrayList3, 10)), 16));
        for (Pair pair2 : arrayList3) {
            linkedHashMap2.put((String) pair2.c(), (FontSpec.Resource) pair2.d());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!linkedHashMap2.containsKey(entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList<Pair> arrayList4 = new ArrayList();
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str3 = (String) entry3.getKey();
            FontSpec.Asset fontSpecAsset = toFontSpecAsset((List) entry3.getValue(), resourceProvider);
            Pair pairA3 = fontSpecAsset != null ? z.a(str3, fontSpecAsset) : null;
            if (pairA3 != null) {
                arrayList4.add(pairA3);
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(arrayList4, 10)), 16));
        for (Pair pair3 : arrayList4) {
            linkedHashMap4.put((String) pair3.c(), (FontSpec.Asset) pair3.d());
        }
        Set setF12 = AbstractC2279u.f1(map.values());
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(setF12, 10)), 16));
        for (Object obj : setF12) {
            linkedHashMap5.put(obj, determineFontSpec(resourceProvider, (UiConfig.AppConfig.FontsConfig) obj, linkedHashMap2, linkedHashMap4));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(S.e(map.size()));
        for (Map.Entry entry4 : map.entrySet()) {
            linkedHashMap6.put(entry4.getKey(), (FontSpec) S.j(linkedHashMap5, (UiConfig.AppConfig.FontsConfig) entry4.getValue()));
        }
        return linkedHashMap6;
    }

    private static final FontSpec.Downloaded getDownloadedFontSpec(ResourceProvider resourceProvider, UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        DownloadedFontFamily cachedFontFamilyOrStartDownload = resourceProvider.getCachedFontFamilyOrStartDownload(name);
        if (cachedFontFamilyOrStartDownload != null) {
            return new FontSpec.Downloaded(cachedFontFamilyOrStartDownload);
        }
        return null;
    }

    /* JADX INFO: renamed from: getFontSpec-pDyximM */
    public static final /* synthetic */ Result m481getFontSpecpDyximM(Map getFontSpec, String alias) {
        AbstractC5504s.h(getFontSpec, "$this$getFontSpec");
        AbstractC5504s.h(alias, "alias");
        FontSpec fontSpec = (FontSpec) getFontSpec.get(FontAlias.m133boximpl(alias));
        return fontSpec != null ? new Result.Success(fontSpec) : new Result.Error(new PaywallValidationError.MissingFontAlias(alias, null));
    }

    private static final FontSpec.Generic getGenericFontSpec(UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        String value = name.getValue();
        AbstractC2485u.a aVar = AbstractC2485u.f22726b;
        if (AbstractC5504s.c(value, aVar.d().l())) {
            return FontSpec.Generic.SansSerif.INSTANCE;
        }
        if (AbstractC5504s.c(value, aVar.e().l())) {
            return FontSpec.Generic.Serif.INSTANCE;
        }
        if (AbstractC5504s.c(value, aVar.c().l())) {
            return FontSpec.Generic.Monospace.INSTANCE;
        }
        return null;
    }

    public static final /* synthetic */ Result recoverFromFontAliasError(Result result) {
        AbstractC5504s.h(result, "<this>");
        if (result instanceof Result.Success) {
            return result;
        }
        if (!(result instanceof Result.Error)) {
            throw new r();
        }
        PaywallValidationError paywallValidationError = (PaywallValidationError) ((Result.Error) result).getValue();
        boolean z10 = paywallValidationError instanceof PaywallValidationError.MissingFontAlias;
        if (z10 && Df.r.l0(((PaywallValidationError.MissingFontAlias) paywallValidationError).m830getAliasBejUyPs())) {
            return new Result.Success(null);
        }
        if (!z10) {
            return new Result.Error(paywallValidationError);
        }
        Logger.INSTANCE.w("Font named '" + ((Object) FontAlias.m138toStringimpl(((PaywallValidationError.MissingFontAlias) paywallValidationError).m830getAliasBejUyPs())) + "' was not found in the font config. Try re-adding it in the Paywall editor.");
        return new Result.Success(null);
    }

    /* JADX INFO: renamed from: resolve-RetOiIg */
    public static final /* synthetic */ AbstractC2485u m482resolveRetOiIg(FontSpec resolve, L weight, int i10) {
        AbstractC5504s.h(resolve, "$this$resolve");
        AbstractC5504s.h(weight, "weight");
        if (resolve instanceof FontSpec.Resource) {
            return ((FontSpec.Resource) resolve).getFontFamily();
        }
        if (resolve instanceof FontSpec.Asset) {
            return ((FontSpec.Asset) resolve).getFontFamily();
        }
        if (resolve instanceof FontSpec.Google) {
            return AbstractC2486v.c(e.a(new c(((FontSpec.Google) resolve).getName(), false, 2, null), GoogleFontsProvider, weight, i10));
        }
        if (resolve instanceof FontSpec.Generic) {
            if (AbstractC5504s.c(resolve, FontSpec.Generic.SansSerif.INSTANCE)) {
                return AbstractC2485u.f22726b.d();
            }
            if (AbstractC5504s.c(resolve, FontSpec.Generic.Serif.INSTANCE)) {
                return AbstractC2485u.f22726b.e();
            }
            if (AbstractC5504s.c(resolve, FontSpec.Generic.Monospace.INSTANCE)) {
                return AbstractC2485u.f22726b.c();
            }
            throw new r();
        }
        if (!(resolve instanceof FontSpec.Downloaded)) {
            if (resolve instanceof FontSpec.System) {
                return AbstractC2486v.c(Y0.r.b(AbstractC2481p.a(((FontSpec.System) resolve).getName()), weight, i10, null, 8, null));
            }
            throw new r();
        }
        List<DownloadedFont> fonts = ((FontSpec.Downloaded) resolve).getDownloadedFontFamily().getFonts();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(fonts, 10));
        for (DownloadedFont downloadedFont : fonts) {
            arrayList.add(AbstractC2469d.b(new File(downloadedFont.getFile().getPath()), new L(downloadedFont.getWeight()), toComposeFontStyle(downloadedFont.getStyle()), null, 8, null));
        }
        return AbstractC2486v.b(arrayList);
    }

    private static final int toComposeFontStyle(FontStyle fontStyle) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[fontStyle.ordinal()];
        if (i10 == 1) {
            return H.f22594b.b();
        }
        if (i10 == 2) {
            return H.f22594b.a();
        }
        throw new r();
    }

    private static final List<y> toFontResourceIdAndData(List<UiConfig.AppConfig.FontsConfig.FontInfo.Name> list, ResourceProvider resourceProvider) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (UiConfig.AppConfig.FontsConfig.FontInfo.Name name : list) {
            if (!linkedHashSet.contains(name.getValue())) {
                Integer numValueOf = Integer.valueOf(resourceProvider.getResourceIdentifier(name.getValue(), "font"));
                if (numValueOf.intValue() == 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    linkedHashSet.add(name.getValue());
                    Integer numValueOf2 = Integer.valueOf(numValueOf.intValue());
                    Integer weight = name.getWeight();
                    FontStyle style = name.getStyle();
                    yVar = new y(numValueOf2, weight, style != null ? H.c(toComposeFontStyle(style)) : null);
                }
            }
            if (yVar != null) {
                arrayList.add(yVar);
            }
        }
        return arrayList;
    }

    private static final FontSpec.Asset toFontSpecAsset(List<UiConfig.AppConfig.FontsConfig.FontInfo.Name> list, ResourceProvider resourceProvider) {
        InterfaceC2484t interfaceC2484tD;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UiConfig.AppConfig.FontsConfig.FontInfo.Name) it.next()).getValue());
        }
        Map<String, String> assetFontPaths = resourceProvider.getAssetFontPaths(arrayList);
        AssetManager mockAssetManager = resourceProvider.getMockAssetManager();
        if (assetFontPaths == null || mockAssetManager == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (UiConfig.AppConfig.FontsConfig.FontInfo.Name name : list) {
            String str = assetFontPaths.get(name.getValue());
            if (str == null) {
                interfaceC2484tD = null;
            } else {
                Integer weight = name.getWeight();
                L l10 = weight != null ? new L(weight.intValue()) : L.f22613b.g();
                FontStyle style = name.getStyle();
                interfaceC2484tD = AbstractC2469d.d(str, mockAssetManager, l10, style != null ? toComposeFontStyle(style) : H.f22594b.b(), null, 16, null);
            }
            if (interfaceC2484tD != null) {
                arrayList2.add(interfaceC2484tD);
            }
        }
        return new FontSpec.Asset(AbstractC2486v.b(arrayList2));
    }

    private static final FontSpec.Resource toFontSpecResource(List<UiConfig.AppConfig.FontsConfig.FontInfo.Name> list, ResourceProvider resourceProvider) {
        AbstractC2485u xmlFontFamily;
        List<y> fontResourceIdAndData = toFontResourceIdAndData(list, resourceProvider);
        if (fontResourceIdAndData.isEmpty()) {
            return null;
        }
        if (fontResourceIdAndData.size() == 1 && (xmlFontFamily = resourceProvider.getXmlFontFamily(((Number) ((y) AbstractC2279u.m0(fontResourceIdAndData)).d()).intValue())) != null) {
            return new FontSpec.Resource(xmlFontFamily);
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(fontResourceIdAndData, 10));
        for (y yVar : fontResourceIdAndData) {
            int iIntValue = ((Number) yVar.d()).intValue();
            Integer num = (Integer) yVar.e();
            L l10 = num != null ? new L(num.intValue()) : L.f22613b.g();
            H h10 = (H) yVar.f();
            arrayList.add(B.b(iIntValue, l10, h10 != null ? h10.i() : H.f22594b.b(), 0, 8, null));
        }
        return new FontSpec.Resource(AbstractC2486v.b(arrayList));
    }
}
