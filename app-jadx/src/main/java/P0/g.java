package P0;

import P0.b;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import x0.C7032d;
import y0.AbstractC7192c;
import y0.C7190a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final b.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException, IOException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C7190a c7190a = new C7190a(xmlResourceParser, 0, 2, null);
        C7032d.a aVarA = AbstractC7192c.a(c7190a, resources, theme, attributeSetAsAttributeSet);
        int iG = 0;
        while (!AbstractC7192c.d(xmlResourceParser)) {
            iG = AbstractC7192c.g(c7190a, resources, attributeSetAsAttributeSet, theme, aVarA, iG);
            xmlResourceParser.next();
        }
        return new b.a(aVarA.f(), c7190a.a() | i10);
    }
}
