package t2;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (h(xmlPullParser.getAttributeName(i10)).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static boolean c(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        return c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean e(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        return e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) {
        return e(xmlPullParser) && h(xmlPullParser.getName()).equals(str);
    }

    private static String h(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }
}
