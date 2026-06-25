package com.revenuecat.purchases.ui.revenuecatui.utils;

import Ud.AbstractC2279u;
import Y0.AbstractC2485u;
import Y0.AbstractC2486v;
import Y0.B;
import Y0.H;
import Y0.L;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/utils/FontFamilyXmlParser;", "", "<init>", "()V", "Landroid/content/res/XmlResourceParser;", "parser", "Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;", "parseFontData", "(Landroid/content/res/XmlResourceParser;)Lcom/revenuecat/purchases/ui/revenuecatui/utils/ParsedFont;", "", "getFontResourceId", "(Landroid/content/res/XmlResourceParser;)I", "getFontWeight", "LY0/H;", "getFontStyle-MIvY41s", "getFontStyle", "LY0/u;", "parse", "(Landroid/content/res/XmlResourceParser;)LY0/u;", "", "parseXmlData$revenuecatui_defaultsBc8Release", "(Landroid/content/res/XmlResourceParser;)Ljava/util/List;", "parseXmlData", "UNRECOGNIZED_VALUE", "I", "DEFAULT_FONT_WEIGHT", "", "ANDROID_NAMESPACE", "Ljava/lang/String;", "APP_NAMESPACE", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FontFamilyXmlParser {
    public static final int $stable = 0;
    private static final String ANDROID_NAMESPACE = "http://schemas.android.com/apk/res/android";
    private static final String APP_NAMESPACE = "http://schemas.android.com/apk/res-auto";
    private static final int DEFAULT_FONT_WEIGHT = 400;
    public static final FontFamilyXmlParser INSTANCE = new FontFamilyXmlParser();
    private static final int UNRECOGNIZED_VALUE = -1;

    private FontFamilyXmlParser() {
    }

    private final int getFontResourceId(XmlResourceParser parser) {
        int attributeResourceValue = parser.getAttributeResourceValue(APP_NAMESPACE, "font", -1);
        return attributeResourceValue == -1 ? parser.getAttributeResourceValue(ANDROID_NAMESPACE, "font", -1) : attributeResourceValue;
    }

    /* JADX INFO: renamed from: getFontStyle-MIvY41s, reason: not valid java name */
    private final int m923getFontStyleMIvY41s(XmlResourceParser parser) {
        String attributeValue = parser.getAttributeValue(APP_NAMESPACE, "fontStyle");
        if (attributeValue == null) {
            attributeValue = parser.getAttributeValue(ANDROID_NAMESPACE, "fontStyle");
        }
        return AbstractC5504s.c(attributeValue, "italic") ? H.f22594b.a() : H.f22594b.b();
    }

    private final int getFontWeight(XmlResourceParser parser) {
        int attributeIntValue = parser.getAttributeIntValue(APP_NAMESPACE, "fontWeight", -1);
        if (attributeIntValue == -1) {
            attributeIntValue = parser.getAttributeIntValue(ANDROID_NAMESPACE, "fontWeight", 400);
        }
        if (attributeIntValue == -1) {
            return 400;
        }
        return attributeIntValue;
    }

    private final ParsedFont parseFontData(XmlResourceParser parser) {
        int fontResourceId = getFontResourceId(parser);
        if (fontResourceId == -1) {
            return null;
        }
        return new ParsedFont(fontResourceId, getFontWeight(parser), m923getFontStyleMIvY41s(parser), null);
    }

    public final AbstractC2485u parse(XmlResourceParser parser) throws XmlPullParserException, IOException {
        AbstractC5504s.h(parser, "parser");
        List<ParsedFont> xmlData$revenuecatui_defaultsBc8Release = parseXmlData$revenuecatui_defaultsBc8Release(parser);
        if (xmlData$revenuecatui_defaultsBc8Release.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(xmlData$revenuecatui_defaultsBc8Release, 10));
        for (ParsedFont parsedFont : xmlData$revenuecatui_defaultsBc8Release) {
            int resId = parsedFont.getResId();
            int weight = parsedFont.getWeight();
            arrayList.add(B.b(resId, new L(weight), parsedFont.getStyle(), 0, 8, null));
        }
        return AbstractC2486v.b(arrayList);
    }

    public final List<ParsedFont> parseXmlData$revenuecatui_defaultsBc8Release(XmlResourceParser parser) throws XmlPullParserException, IOException {
        ParsedFont fontData;
        AbstractC5504s.h(parser, "parser");
        ArrayList arrayList = new ArrayList();
        int eventType = parser.getEventType();
        while (eventType != 1) {
            if (eventType == 2 && AbstractC5504s.c(parser.getName(), "font") && (fontData = parseFontData(parser)) != null) {
                arrayList.add(fontData);
            }
            eventType = parser.next();
        }
        return arrayList;
    }
}
