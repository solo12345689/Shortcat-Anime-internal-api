package y0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import i1.C5015h;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.AbstractC6358h0;
import s0.AbstractC6361i0;
import s0.AbstractC6380o1;
import s0.AbstractC6387s0;
import s0.C6385r0;
import s0.F1;
import s0.G1;
import s0.H1;
import x0.AbstractC7043o;
import x0.C7032d;
import x0.C7038j;
import z1.d;
import z1.n;

/* JADX INFO: renamed from: y0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7192c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f64726a = 0;

    public static final C7032d.a a(C7190a c7190a, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long j10;
        int iZ;
        ColorStateList colorStateListF;
        C7191b c7191b = C7191b.f64700a;
        TypedArray typedArrayL = c7190a.l(resources, theme, attributeSet, c7191b.F());
        boolean zE = c7190a.e(typedArrayL, "autoMirrored", c7191b.a(), false);
        float fH = c7190a.h(typedArrayL, "viewportWidth", c7191b.H(), 0.0f);
        float fH2 = c7190a.h(typedArrayL, "viewportHeight", c7191b.G(), 0.0f);
        if (fH <= 0.0f) {
            throw new XmlPullParserException(typedArrayL.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fH2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayL.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fB = c7190a.b(typedArrayL, c7191b.I(), 0.0f);
        float fB2 = c7190a.b(typedArrayL, c7191b.n(), 0.0f);
        if (typedArrayL.hasValue(c7191b.D())) {
            TypedValue typedValue = new TypedValue();
            typedArrayL.getValue(c7191b.D(), typedValue);
            j10 = (typedValue.type == 2 || (colorStateListF = c7190a.f(typedArrayL, theme, "tint", c7191b.D())) == null) ? C6385r0.f58985b.j() : AbstractC6387s0.b(colorStateListF.getDefaultColor());
        } else {
            j10 = C6385r0.f58985b.j();
        }
        long j11 = j10;
        int iD = c7190a.d(typedArrayL, c7191b.E(), -1);
        if (iD == -1) {
            iZ = androidx.compose.ui.graphics.c.f26737b.z();
        } else if (iD == 3) {
            iZ = androidx.compose.ui.graphics.c.f26737b.B();
        } else if (iD == 5) {
            iZ = androidx.compose.ui.graphics.c.f26737b.z();
        } else if (iD != 9) {
            switch (iD) {
                case 14:
                    iZ = androidx.compose.ui.graphics.c.f26737b.q();
                    break;
                case 15:
                    iZ = androidx.compose.ui.graphics.c.f26737b.v();
                    break;
                case 16:
                    iZ = androidx.compose.ui.graphics.c.f26737b.t();
                    break;
                default:
                    iZ = androidx.compose.ui.graphics.c.f26737b.z();
                    break;
            }
        } else {
            iZ = androidx.compose.ui.graphics.c.f26737b.y();
        }
        int i10 = iZ;
        float fN = C5015h.n(fB / resources.getDisplayMetrics().density);
        float fN2 = C5015h.n(fB2 / resources.getDisplayMetrics().density);
        typedArrayL.recycle();
        return new C7032d.a(null, fN, fN2, fH, fH2, j11, i10, zE, 1, null);
    }

    private static final int b(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : G1.f58877a.c() : G1.f58877a.b() : G1.f58877a.a();
    }

    private static final int c(int i10, int i11) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i11 : H1.f58881a.a() : H1.f58881a.c() : H1.f58881a.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    private static final AbstractC6358h0 e(d dVar) {
        if (!dVar.l()) {
            return null;
        }
        Shader shaderF = dVar.f();
        return shaderF != null ? AbstractC6361i0.a(shaderF) : new F1(AbstractC6387s0.b(dVar.e()), null);
    }

    public static final void f(C7190a c7190a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C7032d.a aVar) {
        C7191b c7191b = C7191b.f64700a;
        TypedArray typedArrayL = c7190a.l(resources, theme, attributeSet, c7191b.b());
        String strJ = c7190a.j(typedArrayL, c7191b.c());
        if (strJ == null) {
            strJ = "";
        }
        String str = strJ;
        String strJ2 = c7190a.j(typedArrayL, c7191b.d());
        List listD = strJ2 == null ? AbstractC7043o.d() : C7038j.b(c7190a.f64687c, strJ2, null, 2, null);
        typedArrayL.recycle();
        C7032d.a.b(aVar, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, listD, 254, null);
    }

    public static final int g(C7190a c7190a, Resources resources, AttributeSet attributeSet, Resources.Theme theme, C7032d.a aVar, int i10) throws XmlPullParserException {
        int eventType = c7190a.k().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !AbstractC5504s.c("group", c7190a.k().getName())) {
                return i10;
            }
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                aVar.g();
            }
            return 0;
        }
        String name = c7190a.k().getName();
        if (name == null) {
            return i10;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i10;
            }
            f(c7190a, resources, theme, attributeSet, aVar);
            return i10 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i10;
            }
            i(c7190a, resources, theme, attributeSet, aVar);
            return i10;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i10;
        }
        h(c7190a, resources, theme, attributeSet, aVar);
        return i10;
    }

    public static final void h(C7190a c7190a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C7032d.a aVar) {
        C7191b c7191b = C7191b.f64700a;
        TypedArray typedArrayL = c7190a.l(resources, theme, attributeSet, c7191b.e());
        float fH = c7190a.h(typedArrayL, "rotation", c7191b.i(), 0.0f);
        float fC = c7190a.c(typedArrayL, c7191b.g(), 0.0f);
        float fC2 = c7190a.c(typedArrayL, c7191b.h(), 0.0f);
        float fH2 = c7190a.h(typedArrayL, "scaleX", c7191b.j(), 1.0f);
        float fH3 = c7190a.h(typedArrayL, "scaleY", c7191b.k(), 1.0f);
        float fH4 = c7190a.h(typedArrayL, "translateX", c7191b.l(), 0.0f);
        float fH5 = c7190a.h(typedArrayL, "translateY", c7191b.m(), 0.0f);
        String strJ = c7190a.j(typedArrayL, c7191b.f());
        if (strJ == null) {
            strJ = "";
        }
        typedArrayL.recycle();
        aVar.a(strJ, fH, fC, fC2, fH2, fH3, fH4, fH5, AbstractC7043o.d());
    }

    public static final void i(C7190a c7190a, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C7032d.a aVar) {
        C7191b c7191b = C7191b.f64700a;
        TypedArray typedArrayL = c7190a.l(resources, theme, attributeSet, c7191b.o());
        if (!n.h(c7190a.k(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strJ = c7190a.j(typedArrayL, c7191b.r());
        if (strJ == null) {
            strJ = "";
        }
        String str = strJ;
        String strJ2 = c7190a.j(typedArrayL, c7191b.s());
        List listD = strJ2 == null ? AbstractC7043o.d() : C7038j.b(c7190a.f64687c, strJ2, null, 2, null);
        d dVarG = c7190a.g(typedArrayL, theme, "fillColor", c7191b.q(), 0);
        float fH = c7190a.h(typedArrayL, "fillAlpha", c7191b.p(), 1.0f);
        int iB = b(c7190a.i(typedArrayL, "strokeLineCap", c7191b.v(), -1), G1.f58877a.a());
        int iC = c(c7190a.i(typedArrayL, "strokeLineJoin", c7191b.w(), -1), H1.f58881a.a());
        float fH2 = c7190a.h(typedArrayL, "strokeMiterLimit", c7191b.x(), 1.0f);
        d dVarG2 = c7190a.g(typedArrayL, theme, "strokeColor", c7191b.u(), 0);
        float fH3 = c7190a.h(typedArrayL, "strokeAlpha", c7191b.t(), 1.0f);
        float fH4 = c7190a.h(typedArrayL, "strokeWidth", c7191b.y(), 1.0f);
        float fH5 = c7190a.h(typedArrayL, "trimPathEnd", c7191b.z(), 1.0f);
        float fH6 = c7190a.h(typedArrayL, "trimPathOffset", c7191b.B(), 0.0f);
        float fH7 = c7190a.h(typedArrayL, "trimPathStart", c7191b.C(), 0.0f);
        int i10 = c7190a.i(typedArrayL, "fillType", c7191b.A(), f64726a);
        typedArrayL.recycle();
        aVar.c(listD, i10 == 0 ? AbstractC6380o1.f58972a.b() : AbstractC6380o1.f58972a.a(), str, e(dVarG), fH, e(dVarG2), fH3, fH4, iB, iC, fH2, fH7, fH5, fH6);
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
