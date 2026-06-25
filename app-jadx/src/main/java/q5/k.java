package q5;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.adjust.sdk.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import io.sentry.C5322z3;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q5.C6116b;
import q5.e;
import q5.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class k {

    /* JADX INFO: renamed from: d */
    private int f57488d;

    /* JADX INFO: renamed from: a */
    private q5.g f57485a = null;

    /* JADX INFO: renamed from: b */
    private g.J f57486b = null;

    /* JADX INFO: renamed from: c */
    private boolean f57487c = false;

    /* JADX INFO: renamed from: e */
    private boolean f57489e = false;

    /* JADX INFO: renamed from: f */
    private h f57490f = null;

    /* JADX INFO: renamed from: g */
    private StringBuilder f57491g = null;

    /* JADX INFO: renamed from: h */
    private boolean f57492h = false;

    /* JADX INFO: renamed from: i */
    private StringBuilder f57493i = null;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f57494a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f57495b;

        static {
            int[] iArr = new int[g.values().length];
            f57495b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57495b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57495b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57495b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57495b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57495b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57495b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57495b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57495b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57495b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57495b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57495b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57495b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57495b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f57495b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f57495b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f57495b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f57495b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f57495b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f57495b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f57495b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f57495b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f57495b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f57495b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f57495b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f57495b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f57495b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f57495b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f57495b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f57495b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f57495b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f57495b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f57495b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f57495b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f57495b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f57495b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f57495b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f57495b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f57495b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f57495b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f57495b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f57495b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f57495b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f57495b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f57495b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f57495b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f57495b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f57495b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f57495b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f57495b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f57495b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f57495b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f57495b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f57495b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f57495b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f57495b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f57495b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f57495b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f57495b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f57495b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f57495b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f57495b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f57495b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f57495b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f57495b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f57495b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f57495b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f57495b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f57495b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f57495b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f57495b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f57495b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f57495b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f57495b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f57495b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f57495b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f57495b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f57495b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f57495b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f57495b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f57495b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f57495b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f57495b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f57495b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f57495b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f57495b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f57495b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f57495b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f57495b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f57494a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f57494a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f57494a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f57494a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f57494a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f57494a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f57494a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f57494a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f57494a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f57494a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f57494a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f57494a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f57494a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f57494a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f57494a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f57494a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f57494a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f57494a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f57494a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f57494a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f57494a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f57494a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f57494a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f57494a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f57494a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f57494a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f57494a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f57494a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f57494a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f57494a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f57494a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a */
        private static final Map f57496a;

        static {
            HashMap map = new HashMap(10);
            f57496a = map;
            map.put("none", e.a.none);
            map.put("xMinYMin", e.a.xMinYMin);
            map.put("xMidYMin", e.a.xMidYMin);
            map.put("xMaxYMin", e.a.xMaxYMin);
            map.put("xMinYMid", e.a.xMinYMid);
            map.put("xMidYMid", e.a.xMidYMid);
            map.put("xMaxYMid", e.a.xMaxYMid);
            map.put("xMinYMax", e.a.xMinYMax);
            map.put("xMidYMax", e.a.xMidYMax);
            map.put("xMaxYMax", e.a.xMaxYMax);
        }

        static e.a a(String str) {
            return (e.a) f57496a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {

        /* JADX INFO: renamed from: a */
        private static final Map f57497a;

        static {
            HashMap map = new HashMap(47);
            f57497a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", -16777216);
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", -65536);
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        static Integer a(String str) {
            return (Integer) f57497a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d {

        /* JADX INFO: renamed from: a */
        private static final Map f57498a;

        static {
            HashMap map = new HashMap(9);
            f57498a = map;
            g.d0 d0Var = g.d0.pt;
            map.put("xx-small", new g.C6131p(0.694f, d0Var));
            map.put("x-small", new g.C6131p(0.833f, d0Var));
            map.put(Constants.SMALL, new g.C6131p(10.0f, d0Var));
            map.put(Constants.MEDIUM, new g.C6131p(12.0f, d0Var));
            map.put(Constants.LARGE, new g.C6131p(14.4f, d0Var));
            map.put("x-large", new g.C6131p(17.3f, d0Var));
            map.put("xx-large", new g.C6131p(20.7f, d0Var));
            g.d0 d0Var2 = g.d0.percent;
            map.put("smaller", new g.C6131p(83.33f, d0Var2));
            map.put("larger", new g.C6131p(120.0f, d0Var2));
        }

        static g.C6131p a(String str) {
            return (g.C6131p) f57498a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e {

        /* JADX INFO: renamed from: a */
        private static final Map f57499a;

        static {
            HashMap map = new HashMap(13);
            f57499a = map;
            map.put(Constants.NORMAL, 400);
            Integer numValueOf = Integer.valueOf(ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD);
            map.put("bold", numValueOf);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put("100", 100);
            map.put("200", 200);
            map.put("300", 300);
            map.put("400", 400);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", numValueOf);
            map.put("800", 800);
            map.put("900", 900);
        }

        static Integer a(String str) {
            return (Integer) f57499a.get(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class f extends DefaultHandler2 {
        private f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            k.this.c1(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            k.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            k.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            k.this.r(str, k.this.x0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            k.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws q5.j {
            k.this.X0(str, str2, str3, attributes);
        }

        /* synthetic */ f(k kVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* JADX INFO: renamed from: n1 */
        private static final Map f57569n1 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    f57569n1.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    f57569n1.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        public static g a(String str) {
            g gVar = (g) f57569n1.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;


        /* JADX INFO: renamed from: G */
        private static final Map f57601G = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    f57601G.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    f57601G.put(hVar.name(), hVar);
                }
            }
        }

        public static h a(String str) {
            h hVar = (h) f57601G.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class i {

        /* JADX INFO: renamed from: a */
        String f57629a;

        /* JADX INFO: renamed from: c */
        int f57631c;

        /* JADX INFO: renamed from: b */
        int f57630b = 0;

        /* JADX INFO: renamed from: d */
        private q5.d f57632d = new q5.d();

        i(String str) {
            this.f57631c = 0;
            String strTrim = str.trim();
            this.f57629a = strTrim;
            this.f57631c = strTrim.length();
        }

        void A() {
            while (true) {
                int i10 = this.f57630b;
                if (i10 >= this.f57631c || !k(this.f57629a.charAt(i10))) {
                    return;
                } else {
                    this.f57630b++;
                }
            }
        }

        int a() {
            int i10 = this.f57630b;
            int i11 = this.f57631c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.f57630b = i12;
            if (i12 < i11) {
                return this.f57629a.charAt(i12);
            }
            return -1;
        }

        String b() {
            int i10 = this.f57630b;
            while (!h() && !k(this.f57629a.charAt(this.f57630b))) {
                this.f57630b++;
            }
            String strSubstring = this.f57629a.substring(i10, this.f57630b);
            this.f57630b = i10;
            return strSubstring;
        }

        Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        float d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        boolean f(char c10) {
            int i10 = this.f57630b;
            boolean z10 = i10 < this.f57631c && this.f57629a.charAt(i10) == c10;
            if (z10) {
                this.f57630b++;
            }
            return z10;
        }

        boolean g(String str) {
            int length = str.length();
            int i10 = this.f57630b;
            boolean z10 = i10 <= this.f57631c - length && this.f57629a.substring(i10, i10 + length).equals(str);
            if (z10) {
                this.f57630b += length;
            }
            return z10;
        }

        boolean h() {
            return this.f57630b == this.f57631c;
        }

        boolean i() {
            int i10 = this.f57630b;
            if (i10 == this.f57631c) {
                return false;
            }
            char cCharAt = this.f57629a.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                return cCharAt >= 'A' && cCharAt <= 'Z';
            }
            return true;
        }

        boolean j(int i10) {
            return i10 == 10 || i10 == 13;
        }

        boolean k(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        Integer l() {
            int i10 = this.f57630b;
            if (i10 == this.f57631c) {
                return null;
            }
            String str = this.f57629a;
            this.f57630b = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        Boolean m() {
            int i10 = this.f57630b;
            if (i10 == this.f57631c) {
                return null;
            }
            char cCharAt = this.f57629a.charAt(i10);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f57630b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        float n() {
            float fB = this.f57632d.b(this.f57629a, this.f57630b, this.f57631c);
            if (!Float.isNaN(fB)) {
                this.f57630b = this.f57632d.a();
            }
            return fB;
        }

        String o() {
            if (h()) {
                return null;
            }
            int i10 = this.f57630b;
            int iCharAt = this.f57629a.charAt(i10);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = a();
            }
            int i11 = this.f57630b;
            while (k(iCharAt)) {
                iCharAt = a();
            }
            if (iCharAt == 40) {
                this.f57630b++;
                return this.f57629a.substring(i10, i11);
            }
            this.f57630b = i10;
            return null;
        }

        g.C6131p p() {
            float fN = n();
            if (Float.isNaN(fN)) {
                return null;
            }
            g.d0 d0VarV = v();
            return d0VarV == null ? new g.C6131p(fN, g.d0.px) : new g.C6131p(fN, d0VarV);
        }

        String q() {
            if (h()) {
                return null;
            }
            int i10 = this.f57630b;
            char cCharAt = this.f57629a.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.f57630b = i10;
                return null;
            }
            int i11 = this.f57630b;
            this.f57630b = i11 + 1;
            return this.f57629a.substring(i10 + 1, i11);
        }

        String r() {
            return t(' ', false);
        }

        String s(char c10) {
            return t(c10, false);
        }

        String t(char c10, boolean z10) {
            if (h()) {
                return null;
            }
            char cCharAt = this.f57629a.charAt(this.f57630b);
            if ((!z10 && k(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i10 = this.f57630b;
            int iA = a();
            while (iA != -1 && iA != c10 && (z10 || !k(iA))) {
                iA = a();
            }
            return this.f57629a.substring(i10, this.f57630b);
        }

        String u(char c10) {
            return t(c10, true);
        }

        g.d0 v() {
            if (h()) {
                return null;
            }
            if (this.f57629a.charAt(this.f57630b) == '%') {
                this.f57630b++;
                return g.d0.percent;
            }
            int i10 = this.f57630b;
            if (i10 > this.f57631c - 2) {
                return null;
            }
            try {
                g.d0 d0VarValueOf = g.d0.valueOf(this.f57629a.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.f57630b += 2;
                return d0VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String w() {
            if (h()) {
                return null;
            }
            int i10 = this.f57630b;
            char cCharAt = this.f57629a.charAt(i10);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.f57630b = i10;
                return null;
            }
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                    break;
                }
                iA = a();
            }
            return this.f57629a.substring(i10, this.f57630b);
        }

        float x() {
            z();
            float fB = this.f57632d.b(this.f57629a, this.f57630b, this.f57631c);
            if (!Float.isNaN(fB)) {
                this.f57630b = this.f57632d.a();
            }
            return fB;
        }

        String y() {
            if (h()) {
                return null;
            }
            int i10 = this.f57630b;
            this.f57630b = this.f57631c;
            return this.f57629a.substring(i10);
        }

        boolean z() {
            A();
            int i10 = this.f57630b;
            if (i10 == this.f57631c || this.f57629a.charAt(i10) != ',') {
                return false;
            }
            this.f57630b++;
            A();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class j implements Attributes {

        /* JADX INFO: renamed from: a */
        private XmlPullParser f57633a;

        public j(XmlPullParser xmlPullParser) {
            this.f57633a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f57633a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.f57633a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.f57633a.getAttributeName(i10);
            if (this.f57633a.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.f57633a.getAttributePrefix(i10) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.f57633a.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.f57633a.getAttributeValue(i10);
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }
    }

    k() {
    }

    private void A(g.C6120d c6120d, Attributes attributes) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    c6120d.f57350o = o0(strTrim);
                    break;
                case 13:
                    c6120d.f57351p = o0(strTrim);
                    break;
                case 14:
                    g.C6131p c6131pO0 = o0(strTrim);
                    c6120d.f57352q = c6131pO0;
                    if (c6131pO0.h()) {
                        throw new q5.j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    private static Set A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    private void B(g.C6121e c6121e, Attributes attributes) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    c6121e.f57363p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new q5.j("Invalid value for attribute clipPathUnits");
                    }
                    c6121e.f57363p = Boolean.TRUE;
                }
            }
        }
    }

    private static g.C6131p[] B0(String str) {
        g.C6131p c6131pP;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (c6131pP = iVar.p()) == null || c6131pP.h()) {
            return null;
        }
        float fA = c6131pP.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c6131pP);
        while (!iVar.h()) {
            iVar.z();
            g.C6131p c6131pP2 = iVar.p();
            if (c6131pP2 == null || c6131pP2.h()) {
                return null;
            }
            arrayList.add(c6131pP2);
            fA += c6131pP2.a();
        }
        if (fA == 0.0f) {
            return null;
        }
        return (g.C6131p[]) arrayList.toArray(new g.C6131p[arrayList.size()]);
    }

    private void C(g.G g10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 21:
                    g10.e(z0(strTrim));
                    break;
                case 22:
                    g10.k(strTrim);
                    break;
                case 23:
                    g10.i(F0(strTrim));
                    break;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    g10.j(A0(strTrim));
                    break;
                case 25:
                    List listI0 = i0(strTrim);
                    g10.c(listI0 != null ? new HashSet(listI0) : new HashSet(0));
                    break;
            }
        }
    }

    private static g.E.c C0(String str) {
        if ("butt".equals(str)) {
            return g.E.c.Butt;
        }
        if ("round".equals(str)) {
            return g.E.c.Round;
        }
        if ("square".equals(str)) {
            return g.E.c.Square;
        }
        return null;
    }

    private void D(g.L l10, Attributes attributes) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals(DiagnosticsEntry.ID_KEY) || qName.equals("xml:id")) {
                l10.f57310c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    l10.f57311d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        l10.f57311d = Boolean.TRUE;
                        return;
                    }
                    throw new q5.j("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    private static g.E.d D0(String str) {
        if ("miter".equals(str)) {
            return g.E.d.Miter;
        }
        if ("round".equals(str)) {
            return g.E.d.Round;
        }
        if ("bevel".equals(str)) {
            return g.E.d.Bevel;
        }
        return null;
    }

    private void E(g.C6124i c6124i, Attributes attributes) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    g.C6131p c6131pO0 = o0(strTrim);
                    c6124i.f57375q = c6131pO0;
                    if (c6131pO0.h()) {
                        throw new q5.j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    g.C6131p c6131pO02 = o0(strTrim);
                    c6124i.f57376r = c6131pO02;
                    if (c6131pO02.h()) {
                        throw new q5.j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    c6124i.f57373o = o0(strTrim);
                    break;
                case 13:
                    c6124i.f57374p = o0(strTrim);
                    break;
            }
        }
    }

    private static void E0(g.L l10, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strS = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String strU = iVar.u(';');
            if (strU == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l10.f57313f == null) {
                    l10.f57313f = new g.E();
                }
                S0(l10.f57313f, strS, strU);
                iVar.A();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void F(q5.g.AbstractC6125j r5, org.xml.sax.Attributes r6) throws q5.j {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L90
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = q5.k.a.f57495b
            java.lang.String r3 = r6.getLocalName(r0)
            q5.k$g r3 = q5.k.g.a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L72
            switch(r2) {
                case 32: goto L50;
                case 33: goto L49;
                case 34: goto L26;
                default: goto L25;
            }
        L25:
            goto L8c
        L26:
            q5.g$k r2 = q5.g.EnumC6126k.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            r5.f57380k = r2     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L8c
        L2d:
            q5.j r5 = new q5.j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "\" is not a valid value."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L49:
            android.graphics.Matrix r1 = r4.J0(r1)
            r5.f57379j = r1
            goto L8c
        L50:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.f57378i = r1
            goto L8c
        L5d:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.f57378i = r1
            goto L8c
        L6a:
            q5.j r5 = new q5.j
            java.lang.String r6 = "Invalid value for attribute gradientUnits"
            r5.<init>(r6)
            throw r5
        L72:
            java.lang.String r2 = ""
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8a
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8c
        L8a:
            r5.f57381l = r1
        L8c:
            int r0 = r0 + 1
            goto L1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.k.F(q5.g$j, org.xml.sax.Attributes):void");
    }

    private static Set F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            int iIndexOf = strR.indexOf(45);
            if (iIndexOf != -1) {
                strR = strR.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strR, "", "").getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    private void G(g.C6130o c6130o, Attributes attributes) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c6130o.f57389q = o0(strTrim);
            } else if (i11 == 2) {
                c6130o.f57390r = o0(strTrim);
            } else if (i11 == 3) {
                g.C6131p c6131pO0 = o0(strTrim);
                c6130o.f57391s = c6131pO0;
                if (c6131pO0.h()) {
                    throw new q5.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C6131p c6131pO02 = o0(strTrim);
                c6130o.f57392t = c6131pO02;
                if (c6131pO02.h()) {
                    throw new q5.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    w0(c6130o, strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                c6130o.f57388p = strTrim;
            }
        }
    }

    private static g.E.f G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return g.E.f.Middle;
            case "end":
                return g.E.f.End;
            case "start":
                return g.E.f.Start;
            default:
                return null;
        }
    }

    private void H(g.C6132q c6132q, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    c6132q.f57396o = o0(strTrim);
                    break;
                case 16:
                    c6132q.f57397p = o0(strTrim);
                    break;
                case 17:
                    c6132q.f57398q = o0(strTrim);
                    break;
                case 18:
                    c6132q.f57399r = o0(strTrim);
                    break;
            }
        }
    }

    private static g.E.EnumC0868g H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return g.E.EnumC0868g.LineThrough;
            case "underline":
                return g.E.EnumC0868g.Underline;
            case "none":
                return g.E.EnumC0868g.None;
            case "blink":
                return g.E.EnumC0868g.Blink;
            case "overline":
                return g.E.EnumC0868g.Overline;
            default:
                return null;
        }
    }

    private void I(g.M m10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    m10.f57315m = o0(strTrim);
                    break;
                case 16:
                    m10.f57316n = o0(strTrim);
                    break;
                case 17:
                    m10.f57317o = o0(strTrim);
                    break;
                case 18:
                    m10.f57318p = o0(strTrim);
                    break;
            }
        }
    }

    private static g.E.h I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return g.E.h.LTR;
        }
        if (str.equals("rtl")) {
            return g.E.h.RTL;
        }
        return null;
    }

    private void J(g.C6133r c6133r, Attributes attributes) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()]) {
                case 26:
                    c6133r.f57401r = o0(strTrim);
                    break;
                case 27:
                    c6133r.f57402s = o0(strTrim);
                    break;
                case 28:
                    g.C6131p c6131pO0 = o0(strTrim);
                    c6133r.f57403t = c6131pO0;
                    if (c6131pO0.h()) {
                        throw new q5.j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    g.C6131p c6131pO02 = o0(strTrim);
                    c6133r.f57404u = c6131pO02;
                    if (c6131pO02.h()) {
                        throw new q5.j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new q5.j("Invalid value for attribute markerUnits");
                        }
                        c6133r.f57400q = true;
                    } else {
                        c6133r.f57400q = false;
                    }
                    break;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    if ("auto".equals(strTrim)) {
                        c6133r.f57405v = Float.valueOf(Float.NaN);
                    } else {
                        c6133r.f57405v = Float.valueOf(f0(strTrim));
                    }
                    break;
            }
        }
    }

    private Matrix J0(String str) throws q5.j {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String strO = iVar.o();
            if (strO == null) {
                throw new q5.j("Bad transform function encountered in transform list: " + str);
            }
            switch (strO) {
                case "matrix":
                    iVar.A();
                    float fN = iVar.n();
                    iVar.z();
                    float fN2 = iVar.n();
                    iVar.z();
                    float fN3 = iVar.n();
                    iVar.z();
                    float fN4 = iVar.n();
                    iVar.z();
                    float fN5 = iVar.n();
                    iVar.z();
                    float fN6 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN6) || !iVar.f(')')) {
                        throw new q5.j("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    iVar.A();
                    float fN7 = iVar.n();
                    float fX = iVar.x();
                    float fX2 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN7) || !iVar.f(')')) {
                        throw new q5.j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fX)) {
                        matrix.preRotate(fN7);
                    } else {
                        if (Float.isNaN(fX2)) {
                            throw new q5.j("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fN7, fX, fX2);
                    }
                    break;
                    break;
                case "scale":
                    iVar.A();
                    float fN8 = iVar.n();
                    float fX3 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN8) || !iVar.f(')')) {
                        throw new q5.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX3)) {
                        matrix.preScale(fN8, fX3);
                    } else {
                        matrix.preScale(fN8, fN8);
                    }
                    break;
                    break;
                case "skewX":
                    iVar.A();
                    float fN9 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN9) || !iVar.f(')')) {
                        throw new q5.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    iVar.A();
                    float fN10 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN10) || !iVar.f(')')) {
                        throw new q5.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fN10)));
                    break;
                    break;
                case "translate":
                    iVar.A();
                    float fN11 = iVar.n();
                    float fX4 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN11) || !iVar.f(')')) {
                        throw new q5.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX4)) {
                        matrix.preTranslate(fN11, fX4);
                    } else {
                        matrix.preTranslate(fN11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new q5.j("Invalid transform list fn: " + strO + ")");
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    private void K(g.C6134s c6134s, Attributes attributes) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c6134s.f57408q = o0(strTrim);
            } else if (i11 == 2) {
                c6134s.f57409r = o0(strTrim);
            } else if (i11 == 3) {
                g.C6131p c6131pO0 = o0(strTrim);
                c6134s.f57410s = c6131pO0;
                if (c6131pO0.h()) {
                    throw new q5.j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C6131p c6131pO02 = o0(strTrim);
                c6134s.f57411t = c6131pO02;
                if (c6131pO02.h()) {
                    throw new q5.j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i11 != 43) {
                if (i11 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    c6134s.f57407p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new q5.j("Invalid value for attribute maskContentUnits");
                    }
                    c6134s.f57407p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                c6134s.f57406o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new q5.j("Invalid value for attribute maskUnits");
                }
                c6134s.f57406o = Boolean.TRUE;
            }
        }
    }

    private void K0(InputStream inputStream) throws q5.j {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new q5.j("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new q5.j("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new q5.j("SVG parse error", e12);
        }
    }

    private void L(g.C6137v c6137v, Attributes attributes) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                c6137v.f57414o = u0(strTrim);
            } else if (i11 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(f0(strTrim));
                c6137v.f57415p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new q5.j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void L0(InputStream inputStream, boolean z10) throws q5.j {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        i iVar = new i(xmlPullParserNewPullParser.getText());
                        r(iVar.r(), x0(iVar));
                    } else if (eventType == 10) {
                        if (z10 && this.f57485a.m() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                K0(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        c1(xmlPullParserNewPullParser.getText());
                    }
                }
                o();
            } catch (XmlPullParserException e10) {
                throw new q5.j("XML parser problem", e10);
            }
        } catch (IOException e11) {
            throw new q5.j("Stream error", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void M(q5.g.C6140y r6, org.xml.sax.Attributes r7) throws q5.j {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.k.M(q5.g$y, org.xml.sax.Attributes):void");
    }

    private static g.E.i M0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return g.E.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return g.E.i.NonScalingStroke;
        }
        return null;
    }

    private void N(g.C6141z c6141z, Attributes attributes, String str) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.points) {
                i iVar = new i(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float fN = iVar.n();
                    if (Float.isNaN(fN)) {
                        throw new q5.j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float fN2 = iVar.n();
                    if (Float.isNaN(fN2)) {
                        throw new q5.j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                c6141z.f57428o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    c6141z.f57428o[i11] = ((Float) it.next()).floatValue();
                    i11++;
                }
            }
        }
    }

    private static g.C6118b N0(String str) throws q5.j {
        i iVar = new i(str);
        iVar.A();
        float fN = iVar.n();
        iVar.z();
        float fN2 = iVar.n();
        iVar.z();
        float fN3 = iVar.n();
        iVar.z();
        float fN4 = iVar.n();
        if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
            throw new q5.j("Invalid viewBox definition - should have four numbers");
        }
        if (fN3 < 0.0f) {
            throw new q5.j("Invalid viewBox. width cannot be negative");
        }
        if (fN4 >= 0.0f) {
            return new g.C6118b(fN, fN2, fN3, fN4);
        }
        throw new q5.j("Invalid viewBox. height cannot be negative");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x005b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void O(q5.g.Q r5, org.xml.sax.Attributes r6) throws q5.j {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L5e
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = q5.k.a.f57495b
            java.lang.String r3 = r6.getLocalName(r0)
            q5.k$g r3 = q5.k.g.a(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 35
            if (r2 == r3) goto L55
            r3 = 36
            if (r2 == r3) goto L4e
            switch(r2) {
                case 12: goto L47;
                case 13: goto L40;
                case 14: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L5b
        L2b:
            q5.g$p r1 = o0(r1)
            r5.f57324o = r1
            boolean r1 = r1.h()
            if (r1 != 0) goto L38
            goto L5b
        L38:
            q5.j r5 = new q5.j
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L40:
            q5.g$p r1 = o0(r1)
            r5.f57323n = r1
            goto L5b
        L47:
            q5.g$p r1 = o0(r1)
            r5.f57322m = r1
            goto L5b
        L4e:
            q5.g$p r1 = o0(r1)
            r5.f57326q = r1
            goto L5b
        L55:
            q5.g$p r1 = o0(r1)
            r5.f57325p = r1
        L5b:
            int r0 = r0 + 1
            goto L1
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.k.O(q5.g$Q, org.xml.sax.Attributes):void");
    }

    private void O0(Attributes attributes) throws q5.j {
        l("<path>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6137v c6137v = new g.C6137v();
        c6137v.f57319a = this.f57485a;
        c6137v.f57320b = this.f57486b;
        D(c6137v, attributes);
        S(c6137v, attributes);
        W(c6137v, attributes);
        C(c6137v, attributes);
        L(c6137v, attributes);
        this.f57486b.h(c6137v);
    }

    private void P(g.B b10, Attributes attributes) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                b10.f57212o = o0(strTrim);
            } else if (i11 == 2) {
                b10.f57213p = o0(strTrim);
            } else if (i11 == 3) {
                g.C6131p c6131pO0 = o0(strTrim);
                b10.f57214q = c6131pO0;
                if (c6131pO0.h()) {
                    throw new q5.j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C6131p c6131pO02 = o0(strTrim);
                b10.f57215r = c6131pO02;
                if (c6131pO02.h()) {
                    throw new q5.j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i11 == 10) {
                g.C6131p c6131pO03 = o0(strTrim);
                b10.f57216s = c6131pO03;
                if (c6131pO03.h()) {
                    throw new q5.j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 != 11) {
                continue;
            } else {
                g.C6131p c6131pO04 = o0(strTrim);
                b10.f57217t = c6131pO04;
                if (c6131pO04.h()) {
                    throw new q5.j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void P0(Attributes attributes) throws q5.j {
        l("<pattern>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6140y c6140y = new g.C6140y();
        c6140y.f57319a = this.f57485a;
        c6140y.f57320b = this.f57486b;
        D(c6140y, attributes);
        S(c6140y, attributes);
        C(c6140y, attributes);
        Y(c6140y, attributes);
        M(c6140y, attributes);
        this.f57486b.h(c6140y);
        this.f57486b = c6140y;
    }

    private void Q(g.F f10, Attributes attributes) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                f10.f57293q = o0(strTrim);
            } else if (i11 == 2) {
                f10.f57294r = o0(strTrim);
            } else if (i11 == 3) {
                g.C6131p c6131pO0 = o0(strTrim);
                f10.f57295s = c6131pO0;
                if (c6131pO0.h()) {
                    throw new q5.j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C6131p c6131pO02 = o0(strTrim);
                f10.f57296t = c6131pO02;
                if (c6131pO02.h()) {
                    throw new q5.j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                f10.f57297u = strTrim;
            }
        }
    }

    private void Q0(Attributes attributes) throws q5.j {
        l("<polygon>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6141z a10 = new g.A();
        a10.f57319a = this.f57485a;
        a10.f57320b = this.f57486b;
        D(a10, attributes);
        S(a10, attributes);
        W(a10, attributes);
        C(a10, attributes);
        N(a10, attributes, "polygon");
        this.f57486b.h(a10);
    }

    private void R(g.D d10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()] == 37) {
                d10.f57218h = n0(strTrim);
            }
        }
    }

    private void R0(Attributes attributes) throws q5.j {
        l("<polyline>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6141z c6141z = new g.C6141z();
        c6141z.f57319a = this.f57485a;
        c6141z.f57320b = this.f57486b;
        D(c6141z, attributes);
        S(c6141z, attributes);
        W(c6141z, attributes);
        C(c6141z, attributes);
        N(c6141z, attributes, "polyline");
        this.f57486b.h(c6141z);
    }

    private void S(g.L l10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 45) {
                    E0(l10, strTrim);
                } else if (i11 != 46) {
                    if (l10.f57312e == null) {
                        l10.f57312e = new g.E();
                    }
                    S0(l10.f57312e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    l10.f57314g = C6116b.f(strTrim);
                }
            }
        }
    }

    static void S0(g.E e10, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f57495b[g.a(str).ordinal()]) {
                case 47:
                    g.O oT0 = t0(str2);
                    e10.f57232b = oT0;
                    if (oT0 != null) {
                        e10.f57231a |= 1;
                    }
                    break;
                case 48:
                    g.E.a aVarE0 = e0(str2);
                    e10.f57233c = aVarE0;
                    if (aVarE0 != null) {
                        e10.f57231a |= 2;
                    }
                    break;
                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    Float fR0 = r0(str2);
                    e10.f57234d = fR0;
                    if (fR0 != null) {
                        e10.f57231a |= 4;
                    }
                    break;
                case 50:
                    g.O oT02 = t0(str2);
                    e10.f57235e = oT02;
                    if (oT02 != null) {
                        e10.f57231a |= 8;
                    }
                    break;
                case 51:
                    Float fR02 = r0(str2);
                    e10.f57236f = fR02;
                    if (fR02 != null) {
                        e10.f57231a |= 16;
                    }
                    break;
                case 52:
                    e10.f57237g = o0(str2);
                    e10.f57231a |= 32;
                    break;
                case 53:
                    g.E.c cVarC0 = C0(str2);
                    e10.f57238h = cVarC0;
                    if (cVarC0 != null) {
                        e10.f57231a |= 64;
                    }
                    break;
                case 54:
                    g.E.d dVarD0 = D0(str2);
                    e10.f57239i = dVarD0;
                    if (dVarD0 != null) {
                        e10.f57231a |= 128;
                    }
                    break;
                case 55:
                    e10.f57240j = Float.valueOf(f0(str2));
                    e10.f57231a |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        g.C6131p[] c6131pArrB0 = B0(str2);
                        e10.f57241k = c6131pArrB0;
                        if (c6131pArrB0 != null) {
                            e10.f57231a |= 512;
                        }
                    } else {
                        e10.f57241k = null;
                        e10.f57231a |= 512;
                    }
                    break;
                case 57:
                    e10.f57242l = o0(str2);
                    e10.f57231a |= 1024;
                    break;
                case 58:
                    e10.f57244m = r0(str2);
                    e10.f57231a |= 2048;
                    break;
                case 59:
                    e10.f57245n = b0(str2);
                    e10.f57231a |= 4096;
                    break;
                case 60:
                    h0(e10, str2);
                    break;
                case 61:
                    List listI0 = i0(str2);
                    e10.f57246o = listI0;
                    if (listI0 != null) {
                        e10.f57231a |= 8192;
                    }
                    break;
                case 62:
                    g.C6131p c6131pJ0 = j0(str2);
                    e10.f57247p = c6131pJ0;
                    if (c6131pJ0 != null) {
                        e10.f57231a |= 16384;
                    }
                    break;
                case 63:
                    Integer numL0 = l0(str2);
                    e10.f57248q = numL0;
                    if (numL0 != null) {
                        e10.f57231a |= 32768;
                    }
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    g.E.b bVarK0 = k0(str2);
                    e10.f57249r = bVarK0;
                    if (bVarK0 != null) {
                        e10.f57231a |= 65536;
                    }
                    break;
                case 65:
                    g.E.EnumC0868g enumC0868gH0 = H0(str2);
                    e10.f57250s = enumC0868gH0;
                    if (enumC0868gH0 != null) {
                        e10.f57231a |= 131072;
                    }
                    break;
                case 66:
                    g.E.h hVarI0 = I0(str2);
                    e10.f57251t = hVarI0;
                    if (hVarI0 != null) {
                        e10.f57231a |= 68719476736L;
                    }
                    break;
                case 67:
                    g.E.f fVarG0 = G0(str2);
                    e10.f57252u = fVarG0;
                    if (fVarG0 != null) {
                        e10.f57231a |= 262144;
                    }
                    break;
                case 68:
                    Boolean boolS0 = s0(str2);
                    e10.f57253v = boolS0;
                    if (boolS0 != null) {
                        e10.f57231a |= 524288;
                    }
                    break;
                case 69:
                    String strM0 = m0(str2, str);
                    e10.f57255x = strM0;
                    e10.f57256y = strM0;
                    e10.f57257z = strM0;
                    e10.f57231a |= 14680064;
                    break;
                case 70:
                    e10.f57255x = m0(str2, str);
                    e10.f57231a |= 2097152;
                    break;
                case 71:
                    e10.f57256y = m0(str2, str);
                    e10.f57231a |= 4194304;
                    break;
                case 72:
                    e10.f57257z = m0(str2, str);
                    e10.f57231a |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e10.f57219A = Boolean.valueOf(!str2.equals("none"));
                            e10.f57231a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e10.f57220B = Boolean.valueOf(str2.equals("visible"));
                            e10.f57231a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e10.f57221C = g.C0869g.a();
                    } else {
                        try {
                            e10.f57221C = b0(str2);
                        } catch (q5.j e11) {
                            Log.w("SVGParser", e11.getMessage());
                            return;
                        }
                    }
                    e10.f57231a |= 67108864;
                    break;
                case 76:
                    e10.f57222D = r0(str2);
                    e10.f57231a |= 134217728;
                    break;
                case 77:
                    g.C6119c c6119cA0 = a0(str2);
                    e10.f57254w = c6119cA0;
                    if (c6119cA0 != null) {
                        e10.f57231a |= C5322z3.MAX_EVENT_SIZE_BYTES;
                    }
                    break;
                case 78:
                    e10.f57223E = m0(str2, str);
                    e10.f57231a |= 268435456;
                    break;
                case 79:
                    e10.f57224F = e0(str2);
                    e10.f57231a |= 536870912;
                    break;
                case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                    e10.f57225G = m0(str2, str);
                    e10.f57231a |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e10.f57226H = g.C0869g.a();
                    } else {
                        try {
                            e10.f57226H = b0(str2);
                        } catch (q5.j e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                    }
                    e10.f57231a |= 2147483648L;
                    break;
                case 82:
                    e10.f57227I = r0(str2);
                    e10.f57231a |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e10.f57228X = g.C0869g.a();
                    } else {
                        try {
                            e10.f57228X = b0(str2);
                        } catch (q5.j e13) {
                            Log.w("SVGParser", e13.getMessage());
                            return;
                        }
                    }
                    e10.f57231a |= 8589934592L;
                    break;
                case 84:
                    e10.f57229Y = r0(str2);
                    e10.f57231a |= 17179869184L;
                    break;
                case 85:
                    g.E.i iVarM0 = M0(str2);
                    e10.f57230Z = iVarM0;
                    if (iVarM0 != null) {
                        e10.f57231a |= 34359738368L;
                    }
                    break;
                case 86:
                    g.E.e eVarY0 = y0(str2);
                    e10.f57243l0 = eVarY0;
                    if (eVarY0 != null) {
                        e10.f57231a |= 137438953472L;
                    }
                    break;
            }
        } catch (q5.j unused) {
        }
    }

    private void T(g.U u10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()] == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                u10.f57328o = strTrim;
            }
        }
    }

    private void T0(Attributes attributes) throws q5.j {
        l("<radialGradient>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.Q q10 = new g.Q();
        q10.f57319a = this.f57485a;
        q10.f57320b = this.f57486b;
        D(q10, attributes);
        S(q10, attributes);
        F(q10, attributes);
        O(q10, attributes);
        this.f57486b.h(q10);
        this.f57486b = q10;
    }

    private void U(g.Z z10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 39) {
                    z10.f57333p = o0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                z10.f57332o = strTrim;
            }
        }
    }

    private void U0(Attributes attributes) throws q5.j {
        l("<rect>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.B b10 = new g.B();
        b10.f57319a = this.f57485a;
        b10.f57320b = this.f57486b;
        D(b10, attributes);
        S(b10, attributes);
        W(b10, attributes);
        C(b10, attributes);
        P(b10, attributes);
        this.f57486b.h(b10);
    }

    private void V(g.a0 a0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                a0Var.f57336o = p0(strTrim);
            } else if (i11 == 2) {
                a0Var.f57337p = p0(strTrim);
            } else if (i11 == 19) {
                a0Var.f57338q = p0(strTrim);
            } else if (i11 == 20) {
                a0Var.f57339r = p0(strTrim);
            }
        }
    }

    private void V0(Attributes attributes) throws q5.j {
        l("<solidColor>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C c10 = new g.C();
        c10.f57319a = this.f57485a;
        c10.f57320b = this.f57486b;
        D(c10, attributes);
        S(c10, attributes);
        this.f57486b.h(c10);
        this.f57486b = c10;
    }

    private void W(g.InterfaceC6129n interfaceC6129n, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.a(attributes.getLocalName(i10)) == g.transform) {
                interfaceC6129n.l(J0(attributes.getValue(i10)));
            }
        }
    }

    public void W0() {
        this.f57485a = new q5.g();
    }

    private void X(g.e0 e0Var, Attributes attributes) throws q5.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                e0Var.f57365q = o0(strTrim);
            } else if (i11 == 2) {
                e0Var.f57366r = o0(strTrim);
            } else if (i11 == 3) {
                g.C6131p c6131pO0 = o0(strTrim);
                e0Var.f57367s = c6131pO0;
                if (c6131pO0.h()) {
                    throw new q5.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C6131p c6131pO02 = o0(strTrim);
                e0Var.f57368t = c6131pO02;
                if (c6131pO02.h()) {
                    throw new q5.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                e0Var.f57364p = strTrim;
            }
        }
    }

    public void X0(String str, String str2, String str3, Attributes attributes) throws q5.j {
        if (this.f57487c) {
            this.f57488d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarA = h.a(str2);
            switch (a.f57494a[hVarA.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.f57489e = true;
                    this.f57490f = hVarA;
                    break;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    V0(attributes);
                    break;
                default:
                    this.f57487c = true;
                    this.f57488d = 1;
                    break;
            }
        }
    }

    private void Y(g.R r10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                w0(r10, strTrim);
            } else if (i11 == 87) {
                r10.f57327p = N0(strTrim);
            }
        }
    }

    private void Y0(Attributes attributes) throws q5.j {
        l("<stop>", new Object[0]);
        g.J j10 = this.f57486b;
        if (j10 == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof g.AbstractC6125j)) {
            throw new q5.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        g.D d10 = new g.D();
        d10.f57319a = this.f57485a;
        d10.f57320b = this.f57486b;
        D(d10, attributes);
        S(d10, attributes);
        R(d10, attributes);
        this.f57486b.h(d10);
        this.f57486b = d10;
    }

    private void Z(String str) {
        this.f57485a.a(new C6116b(C6116b.f.screen, C6116b.u.Document).d(str));
    }

    private void Z0(Attributes attributes) throws q5.j {
        l("<style>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f57495b[g.a(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i11 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && C6116b.b(str, C6116b.f.screen)) {
            this.f57492h = true;
        } else {
            this.f57487c = true;
            this.f57488d = 1;
        }
    }

    private static g.C6119c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        g.C6131p c6131pQ0 = q0(iVar);
        iVar.z();
        g.C6131p c6131pQ02 = q0(iVar);
        iVar.z();
        g.C6131p c6131pQ03 = q0(iVar);
        iVar.z();
        g.C6131p c6131pQ04 = q0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new g.C6119c(c6131pQ0, c6131pQ02, c6131pQ03, c6131pQ04);
        }
        return null;
    }

    private void a1(Attributes attributes) throws q5.j {
        l("<svg>", new Object[0]);
        g.F f10 = new g.F();
        f10.f57319a = this.f57485a;
        f10.f57320b = this.f57486b;
        D(f10, attributes);
        S(f10, attributes);
        C(f10, attributes);
        Y(f10, attributes);
        Q(f10, attributes);
        g.J j10 = this.f57486b;
        if (j10 == null) {
            this.f57485a.w(f10);
        } else {
            j10.h(f10);
        }
        this.f57486b = f10;
    }

    private static g.C6122f b0(String str) throws q5.j {
        if (str.charAt(0) == '#') {
            q5.c cVarB = q5.c.b(str, 1, str.length());
            if (cVarB == null) {
                throw new q5.j("Bad hex colour value: " + str);
            }
            int iA = cVarB.a();
            if (iA == 4) {
                int iD = cVarB.d();
                int i10 = iD & 3840;
                int i11 = iD & 240;
                int i12 = iD & 15;
                return new g.C6122f(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (iA == 5) {
                int iD2 = cVarB.d();
                int i13 = 61440 & iD2;
                int i14 = iD2 & 3840;
                int i15 = iD2 & 240;
                int i16 = iD2 & 15;
                return new g.C6122f((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            if (iA == 7) {
                return new g.C6122f(cVarB.d() | (-16777216));
            }
            if (iA == 9) {
                return new g.C6122f((cVarB.d() >>> 8) | (cVarB.d() << 24));
            }
            throw new q5.j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            i iVar = new i(str.substring(zStartsWith2 ? 5 : 4));
            iVar.A();
            float fN = iVar.n();
            float fD = iVar.d(fN);
            if (!Float.isNaN(fD)) {
                iVar.f('%');
            }
            float fD2 = iVar.d(fD);
            if (!Float.isNaN(fD2)) {
                iVar.f('%');
            }
            if (!zStartsWith2) {
                iVar.A();
                if (!Float.isNaN(fD2) && iVar.f(')')) {
                    return new g.C6122f(s(fN, fD, fD2) | (-16777216));
                }
                throw new q5.j("Bad hsl() colour value: " + str);
            }
            float fD3 = iVar.d(fD2);
            iVar.A();
            if (!Float.isNaN(fD3) && iVar.f(')')) {
                return new g.C6122f((j(fD3 * 256.0f) << 24) | s(fN, fD, fD2));
            }
            throw new q5.j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(zStartsWith ? 5 : 4));
        iVar2.A();
        float fN2 = iVar2.n();
        if (!Float.isNaN(fN2) && iVar2.f('%')) {
            fN2 = (fN2 * 256.0f) / 100.0f;
        }
        float fD4 = iVar2.d(fN2);
        if (!Float.isNaN(fD4) && iVar2.f('%')) {
            fD4 = (fD4 * 256.0f) / 100.0f;
        }
        float fD5 = iVar2.d(fD4);
        if (!Float.isNaN(fD5) && iVar2.f('%')) {
            fD5 = (fD5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            iVar2.A();
            if (!Float.isNaN(fD5) && iVar2.f(')')) {
                return new g.C6122f((j(fN2) << 16) | (-16777216) | (j(fD4) << 8) | j(fD5));
            }
            throw new q5.j("Bad rgb() colour value: " + str);
        }
        float fD6 = iVar2.d(fD5);
        iVar2.A();
        if (!Float.isNaN(fD6) && iVar2.f(')')) {
            return new g.C6122f((j(fD6 * 256.0f) << 24) | (j(fN2) << 16) | (j(fD4) << 8) | j(fD5));
        }
        throw new q5.j("Bad rgba() colour value: " + str);
    }

    private void b1(Attributes attributes) throws q5.j {
        l("<symbol>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.R t10 = new g.T();
        t10.f57319a = this.f57485a;
        t10.f57320b = this.f57486b;
        D(t10, attributes);
        S(t10, attributes);
        C(t10, attributes);
        Y(t10, attributes);
        this.f57486b.h(t10);
        this.f57486b = t10;
    }

    private static g.C6122f c0(String str) throws q5.j {
        Integer numA = c.a(str);
        if (numA != null) {
            return new g.C6122f(numA.intValue());
        }
        throw new q5.j("Invalid colour keyword: " + str);
    }

    public void c1(String str) {
        if (this.f57487c) {
            return;
        }
        if (this.f57489e) {
            if (this.f57491g == null) {
                this.f57491g = new StringBuilder(str.length());
            }
            this.f57491g.append(str);
        } else if (this.f57492h) {
            if (this.f57493i == null) {
                this.f57493i = new StringBuilder(str.length());
            }
            this.f57493i.append(str);
        } else if (this.f57486b instanceof g.Y) {
            h(str);
        }
    }

    private static g.O d0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return g.C6122f.f57370c;
        }
        if (str.equals("currentColor")) {
            return g.C0869g.a();
        }
        try {
            return b0(str);
        } catch (q5.j unused) {
            return null;
        }
    }

    private void d1(Attributes attributes) throws q5.j {
        l("<text>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.W w10 = new g.W();
        w10.f57319a = this.f57485a;
        w10.f57320b = this.f57486b;
        D(w10, attributes);
        S(w10, attributes);
        W(w10, attributes);
        C(w10, attributes);
        V(w10, attributes);
        this.f57486b.h(w10);
        this.f57486b = w10;
    }

    private static g.E.a e0(String str) {
        if ("nonzero".equals(str)) {
            return g.E.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return g.E.a.EvenOdd;
        }
        return null;
    }

    private void e1(char[] cArr, int i10, int i11) {
        if (this.f57487c) {
            return;
        }
        if (this.f57489e) {
            if (this.f57491g == null) {
                this.f57491g = new StringBuilder(i11);
            }
            this.f57491g.append(cArr, i10, i11);
        } else if (this.f57492h) {
            if (this.f57493i == null) {
                this.f57493i = new StringBuilder(i11);
            }
            this.f57493i.append(cArr, i10, i11);
        } else if (this.f57486b instanceof g.Y) {
            h(new String(cArr, i10, i11));
        }
    }

    private static float f0(String str) throws q5.j {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new q5.j("Invalid float value (empty string)");
    }

    private void f1(Attributes attributes) throws q5.j {
        l("<textPath>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.Z z10 = new g.Z();
        z10.f57319a = this.f57485a;
        z10.f57320b = this.f57486b;
        D(z10, attributes);
        S(z10, attributes);
        C(z10, attributes);
        U(z10, attributes);
        this.f57486b.h(z10);
        this.f57486b = z10;
        g.J j10 = z10.f57320b;
        if (j10 instanceof g.b0) {
            z10.p((g.b0) j10);
        } else {
            z10.p(((g.X) j10).d());
        }
    }

    private static float g0(String str, int i10, int i11) throws q5.j {
        float fB = new q5.d().b(str, i10, i11);
        if (!Float.isNaN(fB)) {
            return fB;
        }
        throw new q5.j("Invalid float value: " + str);
    }

    private void g1(Attributes attributes) throws q5.j {
        l("<tref>", new Object[0]);
        g.J j10 = this.f57486b;
        if (j10 == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof g.Y)) {
            throw new q5.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        g.U u10 = new g.U();
        u10.f57319a = this.f57485a;
        u10.f57320b = this.f57486b;
        D(u10, attributes);
        S(u10, attributes);
        C(u10, attributes);
        T(u10, attributes);
        this.f57486b.h(u10);
        g.J j11 = u10.f57320b;
        if (j11 instanceof g.b0) {
            u10.p((g.b0) j11);
        } else {
            u10.p(((g.X) j11).d());
        }
    }

    private void h(String str) {
        g.H h10 = (g.H) this.f57486b;
        int size = h10.f57298i.size();
        g.N n10 = size == 0 ? null : (g.N) h10.f57298i.get(size - 1);
        if (!(n10 instanceof g.c0)) {
            this.f57486b.h(new g.c0(str));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        g.c0 c0Var = (g.c0) n10;
        sb2.append(c0Var.f57348c);
        sb2.append(str);
        c0Var.f57348c = sb2.toString();
    }

    private static void h0(g.E e10, String str) {
        String strS;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer numA = null;
            g.E.b bVarK0 = null;
            String str2 = null;
            while (true) {
                strS = iVar.s('/');
                iVar.A();
                if (strS != null) {
                    if (numA != null && bVarK0 != null) {
                        break;
                    }
                    if (!strS.equals(Constants.NORMAL) && (numA != null || (numA = e.a(strS)) == null)) {
                        if (bVarK0 != null || (bVarK0 = k0(strS)) == null) {
                            if (str2 != null || !strS.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strS;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            g.C6131p c6131pJ0 = j0(strS);
            if (iVar.f('/')) {
                iVar.A();
                String strR = iVar.r();
                if (strR != null) {
                    try {
                        o0(strR);
                    } catch (q5.j unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e10.f57246o = i0(iVar.y());
            e10.f57247p = c6131pJ0;
            e10.f57248q = Integer.valueOf(numA == null ? 400 : numA.intValue());
            if (bVarK0 == null) {
                bVarK0 = g.E.b.Normal;
            }
            e10.f57249r = bVarK0;
            e10.f57231a |= 122880;
        }
    }

    private void h1(Attributes attributes) throws q5.j {
        l("<tspan>", new Object[0]);
        g.J j10 = this.f57486b;
        if (j10 == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof g.Y)) {
            throw new q5.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        g.V v10 = new g.V();
        v10.f57319a = this.f57485a;
        v10.f57320b = this.f57486b;
        D(v10, attributes);
        S(v10, attributes);
        C(v10, attributes);
        V(v10, attributes);
        this.f57486b.h(v10);
        this.f57486b = v10;
        g.J j11 = v10.f57320b;
        if (j11 instanceof g.b0) {
            v10.p((g.b0) j11);
        } else {
            v10.p(((g.X) j11).d());
        }
    }

    private void i(Attributes attributes) throws q5.j {
        l("<circle>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6120d c6120d = new g.C6120d();
        c6120d.f57319a = this.f57485a;
        c6120d.f57320b = this.f57486b;
        D(c6120d, attributes);
        S(c6120d, attributes);
        W(c6120d, attributes);
        C(c6120d, attributes);
        A(c6120d, attributes);
        this.f57486b.h(c6120d);
    }

    private static List i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String strQ = iVar.q();
            if (strQ == null) {
                strQ = iVar.u(',');
            }
            if (strQ == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    private void i1(Attributes attributes) throws q5.j {
        l("<use>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.e0 e0Var = new g.e0();
        e0Var.f57319a = this.f57485a;
        e0Var.f57320b = this.f57486b;
        D(e0Var, attributes);
        S(e0Var, attributes);
        W(e0Var, attributes);
        C(e0Var, attributes);
        X(e0Var, attributes);
        this.f57486b.h(e0Var);
        this.f57486b = e0Var;
    }

    private static int j(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    private static g.C6131p j0(String str) {
        try {
            g.C6131p c6131pA = d.a(str);
            return c6131pA == null ? o0(str) : c6131pA;
        } catch (q5.j unused) {
            return null;
        }
    }

    private void j1(Attributes attributes) throws q5.j {
        l("<view>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.R f0Var = new g.f0();
        f0Var.f57319a = this.f57485a;
        f0Var.f57320b = this.f57486b;
        D(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        this.f57486b.h(f0Var);
        this.f57486b = f0Var;
    }

    private void k(Attributes attributes) throws q5.j {
        l("<clipPath>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6121e c6121e = new g.C6121e();
        c6121e.f57319a = this.f57485a;
        c6121e.f57320b = this.f57486b;
        D(c6121e, attributes);
        S(c6121e, attributes);
        W(c6121e, attributes);
        C(c6121e, attributes);
        B(c6121e, attributes);
        this.f57486b.h(c6121e);
        this.f57486b = c6121e;
    }

    private static g.E.b k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return g.E.b.Oblique;
            case "italic":
                return g.E.b.Italic;
            case "normal":
                return g.E.b.Normal;
            default:
                return null;
        }
    }

    private void k1(Attributes attributes) throws q5.j {
        l("<switch>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.S s10 = new g.S();
        s10.f57319a = this.f57485a;
        s10.f57320b = this.f57486b;
        D(s10, attributes);
        S(s10, attributes);
        W(s10, attributes);
        C(s10, attributes);
        this.f57486b.h(s10);
        this.f57486b = s10;
    }

    private static Integer l0(String str) {
        return e.a(str);
    }

    private void m(Attributes attributes) throws q5.j {
        l("<defs>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6123h c6123h = new g.C6123h();
        c6123h.f57319a = this.f57485a;
        c6123h.f57320b = this.f57486b;
        D(c6123h, attributes);
        S(c6123h, attributes);
        W(c6123h, attributes);
        this.f57486b.h(c6123h);
        this.f57486b = c6123h;
    }

    private static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private void n(Attributes attributes) throws q5.j {
        l("<ellipse>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6124i c6124i = new g.C6124i();
        c6124i.f57319a = this.f57485a;
        c6124i.f57320b = this.f57486b;
        D(c6124i, attributes);
        S(c6124i, attributes);
        W(c6124i, attributes);
        C(c6124i, attributes);
        E(c6124i, attributes);
        this.f57486b.h(c6124i);
    }

    private Float n0(String str) throws q5.j {
        if (str.length() == 0) {
            throw new q5.j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z10 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z10 = false;
        }
        try {
            float fG0 = g0(str, 0, length);
            float f10 = 100.0f;
            if (z10) {
                fG0 /= 100.0f;
            }
            if (fG0 < 0.0f) {
                f10 = 0.0f;
            } else if (fG0 <= 100.0f) {
                f10 = fG0;
            }
            return Float.valueOf(f10);
        } catch (NumberFormatException e10) {
            throw new q5.j("Invalid offset value in <stop>: " + str, e10);
        }
    }

    static g.C6131p o0(String str) throws q5.j {
        if (str.length() == 0) {
            throw new q5.j("Invalid length value (empty string)");
        }
        int length = str.length();
        g.d0 d0VarValueOf = g.d0.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d0VarValueOf = g.d0.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d0VarValueOf = g.d0.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new q5.j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new g.C6131p(g0(str, 0, length), d0VarValueOf);
        } catch (NumberFormatException e10) {
            throw new q5.j("Invalid length value: " + str, e10);
        }
    }

    public void p(String str, String str2, String str3) {
        if (this.f57487c) {
            int i10 = this.f57488d - 1;
            this.f57488d = i10;
            if (i10 == 0) {
                this.f57487c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f57494a[h.a(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case 22:
                    case 23:
                        this.f57489e = false;
                        StringBuilder sb2 = this.f57491g;
                        if (sb2 != null) {
                            h hVar = this.f57490f;
                            if (hVar == h.title) {
                                this.f57485a.x(sb2.toString());
                            } else if (hVar == h.desc) {
                                this.f57485a.s(sb2.toString());
                            }
                            this.f57491g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb3 = this.f57493i;
                        if (sb3 != null) {
                            this.f57492h = false;
                            Z(sb3.toString());
                            this.f57493i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f57486b = ((g.N) this.f57486b).f57320b;
        }
    }

    private static List p0(String str) throws q5.j {
        if (str.length() == 0) {
            throw new q5.j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float fN = iVar.n();
            if (Float.isNaN(fN)) {
                throw new q5.j("Invalid length list value: " + iVar.b());
            }
            g.d0 d0VarV = iVar.v();
            if (d0VarV == null) {
                d0VarV = g.d0.px;
            }
            arrayList.add(new g.C6131p(fN, d0VarV));
            iVar.z();
        }
        return arrayList;
    }

    private void q(Attributes attributes) throws q5.j {
        l("<g>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6128m c6128m = new g.C6128m();
        c6128m.f57319a = this.f57485a;
        c6128m.f57320b = this.f57486b;
        D(c6128m, attributes);
        S(c6128m, attributes);
        W(c6128m, attributes);
        C(c6128m, attributes);
        this.f57486b.h(c6128m);
        this.f57486b = c6128m;
    }

    private static g.C6131p q0(i iVar) {
        return iVar.g("auto") ? new g.C6131p(0.0f) : iVar.p();
    }

    public void r(String str, Map map) {
        if (str.equals("xml-stylesheet")) {
            q5.g.k();
        }
    }

    private static Float r0(String str) {
        try {
            float fF0 = f0(str);
            float f10 = 0.0f;
            if (fF0 < 0.0f) {
                fF0 = f10;
            } else {
                f10 = 1.0f;
                if (fF0 > 1.0f) {
                    fF0 = f10;
                }
            }
            return Float.valueOf(fF0);
        } catch (q5.j unused) {
            return null;
        }
    }

    private static int s(float f10, float f11, float f12) {
        float f13 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f11 / 100.0f;
        float f16 = f12 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        float f17 = f16 >= 0.0f ? f16 > 1.0f ? 1.0f : f16 : 0.0f;
        float f18 = f17 <= 0.5f ? (f15 + 1.0f) * f17 : (f17 + f15) - (f15 * f17);
        float f19 = (f17 * 2.0f) - f18;
        return j(t(f19, f18, f14 - 2.0f) * 256.0f) | (j(t(f19, f18, f14 + 2.0f) * 256.0f) << 16) | (j(t(f19, f18, f14) * 256.0f) << 8);
    }

    private static Boolean s0(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static float t(float f10, float f11, float f12) {
        float f13;
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            f13 = (f11 - f10) * f12;
        } else {
            if (f12 < 3.0f) {
                return f11;
            }
            if (f12 >= 4.0f) {
                return f10;
            }
            f13 = (f11 - f10) * (4.0f - f12);
        }
        return f13 + f10;
    }

    private static g.O t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new g.C6136u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new g.C6136u(strTrim, strTrim2.length() > 0 ? d0(strTrim2) : null);
    }

    private void u(Attributes attributes) throws q5.j {
        l("<image>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6130o c6130o = new g.C6130o();
        c6130o.f57319a = this.f57485a;
        c6130o.f57320b = this.f57486b;
        D(c6130o, attributes);
        S(c6130o, attributes);
        W(c6130o, attributes);
        C(c6130o, attributes);
        G(c6130o, attributes);
        this.f57486b.h(c6130o);
        this.f57486b = c6130o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x0293, code lost:
    
        android.util.Log.e("SVGParser", "Bad path coords for " + ((char) r11) + " path segment");
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0280 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static q5.g.C6138w u0(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.k.u0(java.lang.String):q5.g$w");
    }

    private void v(Attributes attributes) throws q5.j {
        l("<line>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6132q c6132q = new g.C6132q();
        c6132q.f57319a = this.f57485a;
        c6132q.f57320b = this.f57486b;
        D(c6132q, attributes);
        S(c6132q, attributes);
        W(c6132q, attributes);
        C(c6132q, attributes);
        H(c6132q, attributes);
        this.f57486b.h(c6132q);
    }

    static q5.e v0(String str) throws q5.j {
        e.b bVar;
        i iVar = new i(str);
        iVar.A();
        String strR = iVar.r();
        if ("defer".equals(strR)) {
            iVar.A();
            strR = iVar.r();
        }
        e.a aVarA = b.a(strR);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String strR2 = iVar.r();
            strR2.getClass();
            if (strR2.equals("meet")) {
                bVar = e.b.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new q5.j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = e.b.slice;
            }
        }
        return new q5.e(aVarA, bVar);
    }

    private void w(Attributes attributes) throws q5.j {
        l("<linearGradient>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.M m10 = new g.M();
        m10.f57319a = this.f57485a;
        m10.f57320b = this.f57486b;
        D(m10, attributes);
        S(m10, attributes);
        F(m10, attributes);
        I(m10, attributes);
        this.f57486b.h(m10);
        this.f57486b = m10;
    }

    private static void w0(g.P p10, String str) {
        p10.f57321o = v0(str);
    }

    private void x(Attributes attributes) throws q5.j {
        l("<marker>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6133r c6133r = new g.C6133r();
        c6133r.f57319a = this.f57485a;
        c6133r.f57320b = this.f57486b;
        D(c6133r, attributes);
        S(c6133r, attributes);
        C(c6133r, attributes);
        Y(c6133r, attributes);
        J(c6133r, attributes);
        this.f57486b.h(c6133r);
        this.f57486b = c6133r;
    }

    public Map x0(i iVar) {
        HashMap map = new HashMap();
        iVar.A();
        String strS = iVar.s('=');
        while (strS != null) {
            iVar.f('=');
            map.put(strS, iVar.q());
            iVar.A();
            strS = iVar.s('=');
        }
        return map;
    }

    private void y(Attributes attributes) throws q5.j {
        l("<mask>", new Object[0]);
        if (this.f57486b == null) {
            throw new q5.j("Invalid document. Root element must be <svg>");
        }
        g.C6134s c6134s = new g.C6134s();
        c6134s.f57319a = this.f57485a;
        c6134s.f57320b = this.f57486b;
        D(c6134s, attributes);
        S(c6134s, attributes);
        C(c6134s, attributes);
        K(c6134s, attributes);
        this.f57486b.h(c6134s);
        this.f57486b = c6134s;
    }

    private static g.E.e y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return g.E.e.optimizeQuality;
            case "auto":
                return g.E.e.auto;
            case "optimizeSpeed":
                return g.E.e.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            if (strR.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strR.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    q5.g z(InputStream inputStream, boolean z10) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            L0(inputStream, z10);
            return this.f57485a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public void o() {
    }

    private void l(String str, Object... objArr) {
    }
}
