package x3;

import android.text.Layout;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r3.j;
import r3.l;
import r3.r;
import t2.AbstractC6614a;
import t2.AbstractC6625l;
import t2.AbstractC6635w;
import t2.InterfaceC6627n;
import t2.a0;
import t2.b0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements r {

    /* JADX INFO: renamed from: b */
    private static final Pattern f63825b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c */
    private static final Pattern f63826c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d */
    private static final Pattern f63827d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e */
    static final Pattern f63828e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f */
    static final Pattern f63829f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g */
    private static final Pattern f63830g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h */
    private static final Pattern f63831h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i */
    private static final a f63832i = new a(30.0f, 1, 1);

    /* JADX INFO: renamed from: a */
    private final XmlPullParserFactory f63833a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a */
        final float f63834a;

        /* JADX INFO: renamed from: b */
        final int f63835b;

        /* JADX INFO: renamed from: c */
        final int f63836c;

        a(float f10, int i10, int i11) {
            this.f63834a = f10;
            this.f63835b = i10;
            this.f63836c = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a */
        final int f63837a;

        /* JADX INFO: renamed from: b */
        final int f63838b;

        b(int i10, int i11) {
            this.f63837a = i10;
            this.f63838b = i11;
        }
    }

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f63833a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static g d(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment f(String str) {
        String strE = O9.c.e(str);
        strE.getClass();
        switch (strE) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int g(XmlPullParser xmlPullParser, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i10;
        }
        Matcher matcher = f63831h.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC6635w.i("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
        boolean z10 = true;
        try {
            int i11 = Integer.parseInt((String) AbstractC6614a.e(matcher.group(1)));
            int i12 = Integer.parseInt((String) AbstractC6614a.e(matcher.group(2)));
            if (i11 == 0 || i12 == 0) {
                z10 = false;
            }
            AbstractC6614a.b(z10, "Invalid cell resolution " + i11 + " " + i12);
            return i12;
        } catch (NumberFormatException unused) {
            AbstractC6635w.i("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
    }

    private static void h(String str, g gVar) throws l {
        Matcher matcher;
        String str2;
        String[] strArrV1 = a0.v1(str, "\\s+");
        if (strArrV1.length == 1) {
            matcher = f63827d.matcher(str);
        } else {
            if (strArrV1.length != 2) {
                throw new l("Invalid number of entries for fontSize: " + strArrV1.length + ".");
            }
            matcher = f63827d.matcher(strArrV1[1]);
            AbstractC6635w.i("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new l("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) AbstractC6614a.e(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                gVar.C(3);
                break;
            case "em":
                gVar.C(2);
                break;
            case "px":
                gVar.C(1);
                break;
            default:
                throw new l("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.B(Float.parseFloat((String) AbstractC6614a.e(matcher.group(1))));
    }

    private static a i(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            AbstractC6614a.b(a0.v1(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        a aVar = f63832i;
        int i11 = aVar.f63835b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = aVar.f63836c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new a(i10 * f10, i11, i12);
    }

    private static Map j(XmlPullParser xmlPullParser, Map map, int i10, b bVar, Map map2, Map map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (b0.f(xmlPullParser, "style")) {
                String strA = b0.a(xmlPullParser, "style");
                g gVarO = o(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : p(strA)) {
                        gVarO.a((g) map.get(str));
                    }
                }
                String strH = gVarO.h();
                if (strH != null) {
                    map.put(strH, gVarO);
                }
            } else if (b0.f(xmlPullParser, "region")) {
                e eVarM = m(xmlPullParser, i10, bVar, map);
                if (eVarM != null) {
                    map2.put(eVarM.f63839a, eVarM);
                }
            } else if (b0.f(xmlPullParser, "metadata")) {
                k(xmlPullParser, map3);
            }
        } while (!b0.d(xmlPullParser, "head"));
        return map;
    }

    private static void k(XmlPullParser xmlPullParser, Map map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (b0.f(xmlPullParser, "image") && (strA = b0.a(xmlPullParser, DiagnosticsEntry.ID_KEY)) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!b0.d(xmlPullParser, "metadata"));
    }

    private static C7051c l(XmlPullParser xmlPullParser, C7051c c7051c, Map map, a aVar) throws l {
        String attributeValue;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        g gVarO = o(xmlPullParser2, null);
        long jQ = -9223372036854775807L;
        long jQ2 = -9223372036854775807L;
        long jQ3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i10);
            int i11 = attributeCount;
            attributeValue = xmlPullParser2.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i10++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i11;
                    break;
                case "dur":
                    jQ3 = q(attributeValue, aVar);
                    break;
                case "end":
                    jQ2 = q(attributeValue, aVar);
                    break;
                case "begin":
                    jQ = q(attributeValue, aVar);
                    break;
                case "style":
                    String[] strArrP = p(attributeValue);
                    if (strArrP.length > 0) {
                        strArr = strArrP;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i10++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i11;
        }
        if (c7051c != null) {
            long j10 = c7051c.f63815d;
            if (j10 != -9223372036854775807L) {
                if (jQ != -9223372036854775807L) {
                    jQ += j10;
                }
                if (jQ2 != -9223372036854775807L) {
                    jQ2 += j10;
                }
            }
        }
        long j11 = jQ;
        if (jQ2 == -9223372036854775807L) {
            if (jQ3 != -9223372036854775807L) {
                jQ2 = j11 + jQ3;
            } else if (c7051c != null) {
                long j12 = c7051c.f63816e;
                if (j12 != -9223372036854775807L) {
                    jQ2 = j12;
                }
            }
        }
        return C7051c.c(xmlPullParser.getName(), j11, jQ2, gVarO, strArr, str, strSubstring, c7051c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:194:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static x3.e m(org.xmlpull.v1.XmlPullParser r17, int r18, x3.d.b r19, java.util.Map r20) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.d.m(org.xmlpull.v1.XmlPullParser, int, x3.d$b, java.util.Map):x3.e");
    }

    private static float n(String str) {
        Matcher matcher = f63828e.matcher(str);
        if (!matcher.matches()) {
            AbstractC6635w.i("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC6614a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            AbstractC6635w.j("TtmlParser", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    private static g o(XmlPullParser xmlPullParser, g gVar) {
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    gVar = d(gVar).E("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "extent":
                    gVar = d(gVar).y(attributeValue);
                    break;
                case "fontFamily":
                    gVar = d(gVar).A(attributeValue);
                    break;
                case "textAlign":
                    gVar = d(gVar).L(f(attributeValue));
                    break;
                case "origin":
                    gVar = d(gVar).H(attributeValue);
                    break;
                case "textDecoration":
                    String strE = O9.c.e(attributeValue);
                    strE.getClass();
                    switch (strE) {
                        case "nounderline":
                            gVar = d(gVar).O(false);
                            break;
                        case "underline":
                            gVar = d(gVar).O(true);
                            break;
                        case "nolinethrough":
                            gVar = d(gVar).F(false);
                            break;
                        case "linethrough":
                            gVar = d(gVar).F(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    gVar = d(gVar).x("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        gVar = d(gVar).D(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strE2 = O9.c.e(attributeValue);
                    strE2.getClass();
                    switch (strE2) {
                        case "baseContainer":
                        case "base":
                            gVar = d(gVar).J(2);
                            break;
                        case "container":
                            gVar = d(gVar).J(1);
                            break;
                        case "delimiter":
                            gVar = d(gVar).J(4);
                            break;
                        case "textContainer":
                        case "text":
                            gVar = d(gVar).J(3);
                            break;
                    }
                    break;
                case "color":
                    gVar = d(gVar);
                    try {
                        gVar.z(AbstractC6625l.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        AbstractC6635w.i("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    gVar = d(gVar).K(n(attributeValue));
                    break;
                case "textCombine":
                    String strE3 = O9.c.e(attributeValue);
                    strE3.getClass();
                    if (!strE3.equals("all")) {
                        if (strE3.equals("none")) {
                            gVar = d(gVar).M(false);
                        }
                        break;
                    } else {
                        gVar = d(gVar).M(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        gVar = d(gVar);
                        h(attributeValue, gVar);
                        break;
                    } catch (l unused2) {
                        AbstractC6635w.i("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    gVar = d(gVar).N(C7050b.a(attributeValue));
                    break;
                case "rubyPosition":
                    String strE4 = O9.c.e(attributeValue);
                    strE4.getClass();
                    if (!strE4.equals("before")) {
                        if (strE4.equals("after")) {
                            gVar = d(gVar).I(2);
                        }
                        break;
                    } else {
                        gVar = d(gVar).I(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    gVar = d(gVar);
                    try {
                        gVar.w(AbstractC6625l.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        AbstractC6635w.i("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    gVar = d(gVar).G(f(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    private static String[] p(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : a0.v1(strTrim, "\\s+");
    }

    private static long q(String str, a aVar) throws l {
        double d10;
        double d11;
        double d12;
        Matcher matcher = f63825b.matcher(str);
        if (matcher.matches()) {
            double d13 = (Long.parseLong((String) AbstractC6614a.e(matcher.group(1))) * 3600) + (Long.parseLong((String) AbstractC6614a.e(matcher.group(2))) * 60) + Long.parseLong((String) AbstractC6614a.e(matcher.group(3)));
            String strGroup = matcher.group(4);
            return (long) ((d13 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / aVar.f63834a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) aVar.f63835b)) / ((double) aVar.f63834a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f63826c.matcher(str);
        if (!matcher2.matches()) {
            throw new l("Malformed time expression: " + str);
        }
        d10 = Double.parseDouble((String) AbstractC6614a.e(matcher2.group(1)));
        String str2 = (String) AbstractC6614a.e(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d11 = aVar.f63834a;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            case "h":
                d12 = 3600.0d;
                break;
            case "m":
                d12 = 60.0d;
                break;
            case "t":
                d11 = aVar.f63836c;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            case "ms":
                d11 = 1000.0d;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            default:
                return (long) (d10 * 1000000.0d);
        }
        d10 *= d12;
        return (long) (d10 * 1000000.0d);
    }

    private static b r(XmlPullParser xmlPullParser) {
        String strA = b0.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f63830g.matcher(strA);
        if (!matcher.matches()) {
            AbstractC6635w.i("TtmlParser", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) AbstractC6614a.e(matcher.group(1))), Integer.parseInt((String) AbstractC6614a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            AbstractC6635w.i("TtmlParser", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // r3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC6627n interfaceC6627n) {
        r3.h.c(b(bArr, i10, i11), bVar, interfaceC6627n);
    }

    @Override // r3.r
    public j b(byte[] bArr, int i10, int i11) {
        char c10;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f63833a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            h hVar = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = 0;
            int iG = 15;
            a aVarI = f63832i;
            b bVarR = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C7051c c7051c = (C7051c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVarI = i(xmlPullParserNewPullParser);
                            c10 = 15;
                            iG = g(xmlPullParserNewPullParser, 15);
                            bVarR = r(xmlPullParserNewPullParser);
                        } else {
                            c10 = 15;
                        }
                        a aVar = aVarI;
                        b bVar = bVarR;
                        int i13 = iG;
                        if (e(name)) {
                            if ("head".equals(name)) {
                                j(xmlPullParserNewPullParser, map, i13, bVar, map2, map3);
                            } else {
                                try {
                                    C7051c c7051cL = l(xmlPullParserNewPullParser, c7051c, map2, aVar);
                                    arrayDeque.push(c7051cL);
                                    if (c7051c != null) {
                                        c7051c.a(c7051cL);
                                    }
                                } catch (l e10) {
                                    AbstractC6635w.j("TtmlParser", "Suppressing parser error", e10);
                                    i12++;
                                }
                            }
                            iG = i13;
                            bVarR = bVar;
                            aVarI = aVar;
                        } else {
                            AbstractC6635w.g("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        iG = i13;
                        bVarR = bVar;
                        aVarI = aVar;
                    } else {
                        c10 = 15;
                        if (eventType == 4) {
                            ((C7051c) AbstractC6614a.e(c7051c)).a(C7051c.d(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                hVar = new h((C7051c) AbstractC6614a.e((C7051c) arrayDeque.peek()), map, map2, map3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (j) AbstractC6614a.e(hVar);
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // r3.r
    public int c() {
        return 1;
    }
}
