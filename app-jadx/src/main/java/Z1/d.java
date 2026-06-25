package z1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private final Shader f65498a;

    /* JADX INFO: renamed from: b */
    private final ColorStateList f65499b;

    /* JADX INFO: renamed from: c */
    private int f65500c;

    private d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f65498a = shader;
        this.f65499b = colorStateList;
        this.f65500c = i10;
    }

    private static d a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return d(i.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(AbstractC7275c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i10) {
        return new d(null, null, i10);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    public int e() {
        return this.f65500c;
    }

    public Shader f() {
        return this.f65498a;
    }

    public boolean h() {
        return this.f65498a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f65498a == null && (colorStateList = this.f65499b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (!i()) {
            return false;
        }
        ColorStateList colorStateList = this.f65499b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f65500c) {
            return false;
        }
        this.f65500c = colorForState;
        return true;
    }

    public void k(int i10) {
        this.f65500c = i10;
    }

    public boolean l() {
        return h() || this.f65500c != 0;
    }
}
