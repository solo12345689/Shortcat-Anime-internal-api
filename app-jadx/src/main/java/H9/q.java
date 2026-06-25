package H9;

import H9.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import o9.AbstractC5838a;
import o9.AbstractC5848k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final l f8332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[][] f8333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final l[] f8334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final p f8335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final p f8336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final p f8337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final p f8338h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l f8340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[][] f8341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private l[] f8342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p f8343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p f8344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p f8345g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private p f8346h;

        private boolean k(int i10, int i11) {
            return (i11 | i10) == i10;
        }

        private void l(int i10, int i11) {
            int[][] iArr = new int[i11][];
            System.arraycopy(this.f8341c, 0, iArr, 0, i10);
            this.f8341c = iArr;
            l[] lVarArr = new l[i11];
            System.arraycopy(this.f8342d, 0, lVarArr, 0, i10);
            this.f8342d = lVarArr;
        }

        private void m() {
            this.f8340b = new l();
            this.f8341c = new int[10][];
            this.f8342d = new l[10];
        }

        public b i(int[] iArr, l lVar) {
            int i10 = this.f8339a;
            if (i10 == 0 || iArr.length == 0) {
                this.f8340b = lVar;
            }
            if (i10 >= this.f8341c.length) {
                l(i10, i10 + 10);
            }
            int[][] iArr2 = this.f8341c;
            int i11 = this.f8339a;
            iArr2[i11] = iArr;
            this.f8342d[i11] = lVar;
            this.f8339a = i11 + 1;
            return this;
        }

        public q j() {
            if (this.f8339a == 0) {
                return null;
            }
            return new q(this);
        }

        public b n(p pVar, int i10) {
            if (k(i10, 1)) {
                this.f8343e = pVar;
            }
            if (k(i10, 2)) {
                this.f8344f = pVar;
            }
            if (k(i10, 4)) {
                this.f8345g = pVar;
            }
            if (k(i10, 8)) {
                this.f8346h = pVar;
            }
            return this;
        }

        public b(q qVar) {
            int i10 = qVar.f8331a;
            this.f8339a = i10;
            this.f8340b = qVar.f8332b;
            int[][] iArr = qVar.f8333c;
            int[][] iArr2 = new int[iArr.length][];
            this.f8341c = iArr2;
            this.f8342d = new l[qVar.f8334d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(qVar.f8334d, 0, this.f8342d, 0, this.f8339a);
            this.f8343e = qVar.f8335e;
            this.f8344f = qVar.f8336f;
            this.f8345g = qVar.f8337g;
            this.f8346h = qVar.f8338h;
        }

        public b(l lVar) {
            m();
            i(StateSet.WILD_CARD, lVar);
        }

        private b(Context context, int i10) {
            int next;
            m();
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            q.g(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
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
                m();
            }
        }
    }

    public static q b(Context context, TypedArray typedArray, int i10) {
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new b(context, resourceId).j();
        }
        return null;
    }

    private int e(int[] iArr) {
        int[][] iArr2 = this.f8333c;
        for (int i10 = 0; i10 < this.f8331a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(b bVar, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, AbstractC5848k.f55316z3) : theme.obtainStyledAttributes(attributeSet, AbstractC5848k.f55316z3, 0, 0);
                l lVarM = l.b(context, typedArrayObtainAttributes.getResourceId(AbstractC5848k.f54902A3, 0), typedArrayObtainAttributes.getResourceId(AbstractC5848k.f54910B3, 0)).m();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != AbstractC5838a.f54674z0 && attributeNameResource != AbstractC5838a.f54587A0) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                bVar.i(StateSet.trimStateSet(iArr, i10), lVarM);
            }
        }
    }

    public static int h(int i10) {
        int i11 = i10 & 5;
        return ((i10 & 10) >> 1) | (i11 << 1);
    }

    public l c(boolean z10) {
        if (!z10 || (this.f8335e == null && this.f8336f == null && this.f8337g == null && this.f8338h == null)) {
            return this.f8332b;
        }
        l.b bVarW = this.f8332b.w();
        p pVar = this.f8335e;
        if (pVar != null) {
            bVarW.E(pVar.e());
        }
        p pVar2 = this.f8336f;
        if (pVar2 != null) {
            bVarW.J(pVar2.e());
        }
        p pVar3 = this.f8337g;
        if (pVar3 != null) {
            bVarW.v(pVar3.e());
        }
        p pVar4 = this.f8338h;
        if (pVar4 != null) {
            bVarW.z(pVar4.e());
        }
        return bVarW.m();
    }

    protected l d(int[] iArr) {
        int iE = e(iArr);
        if (iE < 0) {
            iE = e(StateSet.WILD_CARD);
        }
        if (this.f8335e == null && this.f8336f == null && this.f8337g == null && this.f8338h == null) {
            return this.f8334d[iE];
        }
        l.b bVarW = this.f8334d[iE].w();
        p pVar = this.f8335e;
        if (pVar != null) {
            bVarW.E(pVar.d(iArr));
        }
        p pVar2 = this.f8336f;
        if (pVar2 != null) {
            bVarW.J(pVar2.d(iArr));
        }
        p pVar3 = this.f8337g;
        if (pVar3 != null) {
            bVarW.v(pVar3.d(iArr));
        }
        p pVar4 = this.f8338h;
        if (pVar4 != null) {
            bVarW.z(pVar4.d(iArr));
        }
        return bVarW.m();
    }

    public boolean f() {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        return this.f8331a > 1 || ((pVar = this.f8335e) != null && pVar.h()) || (((pVar2 = this.f8336f) != null && pVar2.h()) || (((pVar3 = this.f8337g) != null && pVar3.h()) || ((pVar4 = this.f8338h) != null && pVar4.h())));
    }

    public b i() {
        return new b(this);
    }

    private q(b bVar) {
        this.f8331a = bVar.f8339a;
        this.f8332b = bVar.f8340b;
        this.f8333c = bVar.f8341c;
        this.f8334d = bVar.f8342d;
        this.f8335e = bVar.f8343e;
        this.f8336f = bVar.f8344f;
        this.f8337g = bVar.f8345g;
        this.f8338h = bVar.f8346h;
    }
}
