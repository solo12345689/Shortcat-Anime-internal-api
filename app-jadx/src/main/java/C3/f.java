package c3;

import P9.AbstractC2011u;
import c3.C3070c;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q2.C6080L;
import t2.AbstractC6635w;
import t2.b0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f33456a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f33457b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f33458c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static C3070c a(String str) {
        try {
            return b(str);
        } catch (NumberFormatException | XmlPullParserException | C6080L unused) {
            AbstractC6635w.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static C3070c b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!b0.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C6080L.a("Couldn't find xmp metadata", null);
        }
        AbstractC2011u abstractC2011uA = AbstractC2011u.A();
        long jE = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (b0.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                abstractC2011uA = c(xmlPullParserNewPullParser);
            } else if (b0.f(xmlPullParserNewPullParser, "Container:Directory")) {
                abstractC2011uA = f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (b0.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                abstractC2011uA = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!b0.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (abstractC2011uA.isEmpty()) {
            return null;
        }
        return new C3070c(jE, abstractC2011uA);
    }

    private static AbstractC2011u c(XmlPullParser xmlPullParser) {
        for (String str : f33458c) {
            String strA = b0.a(xmlPullParser, str);
            if (strA != null) {
                return AbstractC2011u.D(new C3070c.a("image/jpeg", "Primary", 0L, 0L), new C3070c.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return AbstractC2011u.A();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f33456a) {
            String strA = b0.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f33457b) {
            String strA = b0.a(xmlPullParser, str);
            if (strA != null) {
                long j10 = Long.parseLong(strA);
                if (j10 == -1) {
                    return -9223372036854775807L;
                }
                return j10;
            }
        }
        return -9223372036854775807L;
    }

    private static AbstractC2011u f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (b0.f(xmlPullParser, str3)) {
                String strA = b0.a(xmlPullParser, str2 + ":Mime");
                String strA2 = b0.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = b0.a(xmlPullParser, str2 + ":Length");
                String strA4 = b0.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return AbstractC2011u.A();
                }
                aVarT.a(new C3070c.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!b0.d(xmlPullParser, str4));
        return aVarT.k();
    }
}
