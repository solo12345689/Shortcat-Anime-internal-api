package H9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import o9.AbstractC5838a;
import o9.AbstractC5848k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f8327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f8328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[][] f8329c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d[] f8330d = new d[10];

    private void a(int[] iArr, d dVar) {
        int i10 = this.f8327a;
        if (i10 == 0 || iArr.length == 0) {
            this.f8328b = dVar;
        }
        if (i10 >= this.f8329c.length) {
            f(i10, i10 + 10);
        }
        int[][] iArr2 = this.f8329c;
        int i11 = this.f8327a;
        iArr2[i11] = iArr;
        this.f8330d[i11] = dVar;
        this.f8327a = i11 + 1;
    }

    public static p b(d dVar) {
        p pVar = new p();
        pVar.a(StateSet.WILD_CARD, dVar);
        return pVar;
    }

    public static p c(Context context, TypedArray typedArray, int i10, d dVar) {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0) {
            return b(l.m(typedArray, i10, dVar));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return b(l.m(typedArray, i10, dVar));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                p pVar = new p();
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
                if (xml.getName().equals("selector")) {
                    pVar.i(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return pVar;
            } catch (Throwable th2) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return b(dVar);
        }
    }

    private void f(int i10, int i11) {
        int[][] iArr = new int[i11][];
        System.arraycopy(this.f8329c, 0, iArr, 0, i10);
        this.f8329c = iArr;
        d[] dVarArr = new d[i11];
        System.arraycopy(this.f8330d, 0, dVarArr, 0, i10);
        this.f8330d = dVarArr;
    }

    private int g(int[] iArr) {
        int[][] iArr2 = this.f8329c;
        for (int i10 = 0; i10 < this.f8327a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    private void i(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, AbstractC5848k.f55055T4) : theme.obtainStyledAttributes(attributeSet, AbstractC5848k.f55055T4, 0, 0);
                d dVarM = l.m(typedArrayObtainAttributes, AbstractC5848k.f55103Z4, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != AbstractC5838a.f54620X) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr, i10), dVarM);
            }
        }
    }

    public d d(int[] iArr) {
        int iG = g(iArr);
        if (iG < 0) {
            iG = g(StateSet.WILD_CARD);
        }
        return iG < 0 ? this.f8328b : this.f8330d[iG];
    }

    public d e() {
        return this.f8328b;
    }

    public boolean h() {
        return this.f8327a > 1;
    }
}
