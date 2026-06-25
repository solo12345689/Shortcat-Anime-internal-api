package z1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import x1.AbstractC7047d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        private final d[] f65501a;

        public c(d[] dVarArr) {
            this.f65501a = dVarArr;
        }

        public d[] a() {
            return this.f65501a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final String f65502a;

        /* JADX INFO: renamed from: b */
        private final int f65503b;

        /* JADX INFO: renamed from: c */
        private final boolean f65504c;

        /* JADX INFO: renamed from: d */
        private final String f65505d;

        /* JADX INFO: renamed from: e */
        private final int f65506e;

        /* JADX INFO: renamed from: f */
        private final int f65507f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f65502a = str;
            this.f65503b = i10;
            this.f65504c = z10;
            this.f65505d = str2;
            this.f65506e = i11;
            this.f65507f = i12;
        }

        public String a() {
            return this.f65502a;
        }

        public int b() {
            return this.f65507f;
        }

        public int c() {
            return this.f65506e;
        }

        public String d() {
            return this.f65505d;
        }

        public int e() {
            return this.f65503b;
        }

        public boolean f() {
            return this.f65504c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements b {

        /* JADX INFO: renamed from: a */
        private final List f65508a;

        /* JADX INFO: renamed from: b */
        private final int f65509b;

        /* JADX INFO: renamed from: c */
        private final int f65510c;

        /* JADX INFO: renamed from: d */
        private final String f65511d;

        public e(List list, int i10, int i11, String str) {
            this.f65508a = list;
            this.f65510c = i10;
            this.f65509b = i11;
            this.f65511d = str;
        }

        public int a() {
            return this.f65510c;
        }

        public List b() {
            return this.f65508a;
        }

        public String c() {
            return this.f65511d;
        }

        public int d() {
            return this.f65509b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(i(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static H1.f d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List list) throws Exception {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC7047d.f63654B);
        try {
            String string = typedArrayObtainAttributes.getString(AbstractC7047d.f63655C);
            String string2 = typedArrayObtainAttributes.getString(AbstractC7047d.f63656D);
            String string3 = typedArrayObtainAttributes.getString(AbstractC7047d.f63657E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                h(xmlPullParser);
            }
            H1.f fVar = new H1.f(str, str2, string, list, string2, string3);
            z1.e.a(typedArrayObtainAttributes);
            return fVar;
        } catch (Throwable th2) {
            if (typedArrayObtainAttributes == null) {
                throw th2;
            }
            try {
                z1.e.a(typedArrayObtainAttributes);
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return f(xmlPullParser, resources);
        }
        h(xmlPullParser);
        return null;
    }

    private static b f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC7047d.f63681h);
        String string = typedArrayObtainAttributes.getString(AbstractC7047d.f63682i);
        String string2 = typedArrayObtainAttributes.getString(AbstractC7047d.f63687n);
        String string3 = typedArrayObtainAttributes.getString(AbstractC7047d.f63688o);
        String string4 = typedArrayObtainAttributes.getString(AbstractC7047d.f63684k);
        int resourceId = typedArrayObtainAttributes.getResourceId(AbstractC7047d.f63683j, 0);
        int integer = typedArrayObtainAttributes.getInteger(AbstractC7047d.f63685l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(AbstractC7047d.f63686m, 500);
        String string5 = typedArrayObtainAttributes.getString(AbstractC7047d.f63689p);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(g(xmlPullParser, resources));
                    } else {
                        h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        List listC = c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(d(xmlPullParser, resources, string, string2, listC));
                } else {
                    h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new H1.f(string, string2, string3, listC, null, null));
        if (string4 != null) {
            arrayList2.add(new H1.f(string, string2, string4, listC, null, null));
        }
        return new e(arrayList2, integer, integer2, string5);
    }

    private static d g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC7047d.f63690q);
        int i10 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(AbstractC7047d.f63699z) ? AbstractC7047d.f63699z : AbstractC7047d.f63692s, 400);
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(AbstractC7047d.f63697x) ? AbstractC7047d.f63697x : AbstractC7047d.f63693t, 0);
        int i11 = typedArrayObtainAttributes.hasValue(AbstractC7047d.f63653A) ? AbstractC7047d.f63653A : AbstractC7047d.f63694u;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(AbstractC7047d.f63698y) ? AbstractC7047d.f63698y : AbstractC7047d.f63695v);
        int i12 = typedArrayObtainAttributes.getInt(i11, 0);
        int i13 = typedArrayObtainAttributes.hasValue(AbstractC7047d.f63696w) ? AbstractC7047d.f63696w : AbstractC7047d.f63691r;
        int resourceId = typedArrayObtainAttributes.getResourceId(i13, 0);
        String string2 = typedArrayObtainAttributes.getString(i13);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            h(xmlPullParser);
        }
        return new d(string2, i10, z10, string, i12, resourceId);
    }

    private static void h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
