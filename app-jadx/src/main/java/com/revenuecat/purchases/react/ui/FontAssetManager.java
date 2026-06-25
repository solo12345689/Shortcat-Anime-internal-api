package com.revenuecat.purchases.react.ui;

import Td.z;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.S;
import Y0.AbstractC2469d;
import Y0.AbstractC2485u;
import Y0.AbstractC2486v;
import Y0.H;
import Y0.InterfaceC2484t;
import Y0.L;
import android.content.res.AssetManager;
import be.AbstractC3048a;
import com.revenuecat.purchases.react.ui.FontAssetManager;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFont;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/react/ui/FontAssetManager;", "", "<init>", "()V", "T", "", "fontFamilyName", "Landroid/content/res/AssetManager;", "assetManager", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;", "createFont", "", "getFontsInFamily", "(Ljava/lang/String;Landroid/content/res/AssetManager;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "LY0/u;", "getFontFamily", "(Ljava/lang/String;Landroid/content/res/AssetManager;)LY0/u;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;", "getPaywallFontFamily", "(Ljava/lang/String;Landroid/content/res/AssetManager;)Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;", "", "fontFamilyCache", "Ljava/util/Map;", "paywallFontFamilyCache", "", "FILE_EXTENSIONS", "[Ljava/lang/String;", "FONT_PATH", "Ljava/lang/String;", "FontStyleExtension", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FontAssetManager {
    private static final String FONT_PATH = "fonts/";
    public static final FontAssetManager INSTANCE = new FontAssetManager();
    private static Map<String, ? extends AbstractC2485u> fontFamilyCache = S.i();
    private static Map<String, PaywallFontFamily> paywallFontFamilyCache = S.i();
    private static final String[] FILE_EXTENSIONS = {".ttf", ".otf"};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0082\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension;", "", "", "extension", "LY0/L;", "weight", "LY0/H;", "style", "<init>", "(Ljava/lang/String;ILjava/lang/String;LY0/L;I)V", "Ljava/lang/String;", "getExtension", "()Ljava/lang/String;", "LY0/L;", "getWeight", "()LY0/L;", "I", "getStyle-_-LCdwA", "()I", "Companion", "REGULAR", "BOLD", "ITALIC", "BOLD_ITALIC", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class FontStyleExtension {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FontStyleExtension[] $VALUES;
        public static final FontStyleExtension BOLD;
        public static final FontStyleExtension BOLD_ITALIC;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FontStyleExtension ITALIC;
        public static final FontStyleExtension REGULAR;
        private final String extension;
        private final int style;
        private final L weight;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/react/ui/FontAssetManager$FontStyleExtension$Companion;", "", "<init>", "()V", "possibleFileNames", "", "", "fontFamilyName", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List<String> possibleFileNames(String fontFamilyName) {
                AbstractC5504s.h(fontFamilyName, "fontFamilyName");
                FontStyleExtension[] fontStyleExtensionArrValues = FontStyleExtension.values();
                ArrayList arrayList = new ArrayList();
                for (FontStyleExtension fontStyleExtension : fontStyleExtensionArrValues) {
                    String[] strArr = FontAssetManager.FILE_EXTENSIONS;
                    ArrayList arrayList2 = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        arrayList2.add(fontFamilyName + fontStyleExtension.getExtension() + str);
                    }
                    AbstractC2279u.D(arrayList, arrayList2);
                }
                return arrayList;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ FontStyleExtension[] $values() {
            return new FontStyleExtension[]{REGULAR, BOLD, ITALIC, BOLD_ITALIC};
        }

        static {
            L.a aVar = L.f22613b;
            L lG = aVar.g();
            H.a aVar2 = H.f22594b;
            REGULAR = new FontStyleExtension("REGULAR", 0, "", lG, aVar2.b());
            BOLD = new FontStyleExtension("BOLD", 1, "_bold", aVar.b(), aVar2.b());
            ITALIC = new FontStyleExtension("ITALIC", 2, "_italic", aVar.g(), aVar2.a());
            BOLD_ITALIC = new FontStyleExtension("BOLD_ITALIC", 3, "_bold_italic", aVar.b(), aVar2.a());
            FontStyleExtension[] fontStyleExtensionArr$values = $values();
            $VALUES = fontStyleExtensionArr$values;
            $ENTRIES = AbstractC3048a.a(fontStyleExtensionArr$values);
            INSTANCE = new Companion(null);
        }

        private FontStyleExtension(String str, int i10, String str2, L l10, int i11) {
            this.extension = str2;
            this.weight = l10;
            this.style = i11;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static FontStyleExtension valueOf(String str) {
            return (FontStyleExtension) Enum.valueOf(FontStyleExtension.class, str);
        }

        public static FontStyleExtension[] values() {
            return (FontStyleExtension[]) $VALUES.clone();
        }

        public final String getExtension() {
            return this.extension;
        }

        /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: not valid java name and from getter */
        public final int getStyle() {
            return this.style;
        }

        public final L getWeight() {
            return this.weight;
        }
    }

    private FontAssetManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2484t getFontFamily$lambda$0(AssetManager assetManager, String fileName, FontStyleExtension styleExtension) {
        AbstractC5504s.h(fileName, "fileName");
        AbstractC5504s.h(styleExtension, "styleExtension");
        return AbstractC2469d.d(FONT_PATH + fileName, assetManager, styleExtension.getWeight(), styleExtension.getStyle(), null, 16, null);
    }

    private final <T> List<T> getFontsInFamily(String fontFamilyName, AssetManager assetManager, Function2 createFont) throws IOException {
        List listM;
        String[] list = assetManager.list(FONT_PATH);
        if (list == null || (listM = AbstractC2273n.V0(list)) == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList();
        for (FontStyleExtension fontStyleExtension : FontStyleExtension.values()) {
            for (String str : FILE_EXTENSIONS) {
                Object obj = fontFamilyName + fontStyleExtension.getExtension() + str;
                if (listM.contains(obj)) {
                    arrayList.add(createFont.invoke(obj, fontStyleExtension));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaywallFont.AssetFont getPaywallFontFamily$lambda$1(String fileName, FontStyleExtension styleExtension) {
        AbstractC5504s.h(fileName, "fileName");
        AbstractC5504s.h(styleExtension, "styleExtension");
        return new PaywallFont.AssetFont(FONT_PATH + fileName, styleExtension.getWeight(), styleExtension.getStyle());
    }

    public final synchronized AbstractC2485u getFontFamily(String fontFamilyName, final AssetManager assetManager) {
        AbstractC2485u abstractC2485uB;
        AbstractC5504s.h(fontFamilyName, "fontFamilyName");
        AbstractC5504s.h(assetManager, "assetManager");
        AbstractC2485u abstractC2485u = fontFamilyCache.get(fontFamilyName);
        if (abstractC2485u != null) {
            return abstractC2485u;
        }
        List fontsInFamily = getFontsInFamily(fontFamilyName, assetManager, new Function2() { // from class: com.revenuecat.purchases.react.ui.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FontAssetManager.getFontFamily$lambda$0(assetManager, (String) obj, (FontAssetManager.FontStyleExtension) obj2);
            }
        });
        if (fontsInFamily.isEmpty()) {
            abstractC2485uB = null;
        } else {
            abstractC2485uB = AbstractC2486v.b(fontsInFamily);
            fontFamilyCache = S.q(fontFamilyCache, z.a(fontFamilyName, abstractC2485uB));
        }
        return abstractC2485uB;
    }

    public final synchronized PaywallFontFamily getPaywallFontFamily(String fontFamilyName, AssetManager assetManager) {
        PaywallFontFamily paywallFontFamily;
        AbstractC5504s.h(fontFamilyName, "fontFamilyName");
        AbstractC5504s.h(assetManager, "assetManager");
        PaywallFontFamily paywallFontFamily2 = paywallFontFamilyCache.get(fontFamilyName);
        if (paywallFontFamily2 != null) {
            return paywallFontFamily2;
        }
        List fontsInFamily = getFontsInFamily(fontFamilyName, assetManager, new Function2() { // from class: com.revenuecat.purchases.react.ui.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FontAssetManager.getPaywallFontFamily$lambda$1((String) obj, (FontAssetManager.FontStyleExtension) obj2);
            }
        });
        if (fontsInFamily.isEmpty()) {
            paywallFontFamily = null;
        } else {
            paywallFontFamily = new PaywallFontFamily(fontsInFamily);
            paywallFontFamilyCache = S.q(paywallFontFamilyCache, z.a(fontFamilyName, paywallFontFamily));
        }
        return paywallFontFamily;
    }
}
