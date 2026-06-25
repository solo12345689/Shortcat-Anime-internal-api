package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f28074a;

    /* JADX INFO: renamed from: b */
    int f28075b = -1;

    /* JADX INFO: renamed from: c */
    int f28076c = -1;

    /* JADX INFO: renamed from: d */
    private SparseArray f28077d = new SparseArray();

    /* JADX INFO: renamed from: e */
    private SparseArray f28078e = new SparseArray();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a */
        int f28079a;

        /* JADX INFO: renamed from: b */
        ArrayList f28080b = new ArrayList();

        /* JADX INFO: renamed from: c */
        int f28081c;

        /* JADX INFO: renamed from: d */
        e f28082d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f28081c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f28466c7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f28475d7) {
                    this.f28079a = typedArrayObtainStyledAttributes.getResourceId(index, this.f28079a);
                } else if (index == i.f28484e7) {
                    this.f28081c = typedArrayObtainStyledAttributes.getResourceId(index, this.f28081c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f28081c);
                    context.getResources().getResourceName(this.f28081c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f28082d = eVar;
                        eVar.e(context, this.f28081c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f28080b.add(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a */
        float f28083a;

        /* JADX INFO: renamed from: b */
        float f28084b;

        /* JADX INFO: renamed from: c */
        float f28085c;

        /* JADX INFO: renamed from: d */
        float f28086d;

        /* JADX INFO: renamed from: e */
        int f28087e;

        /* JADX INFO: renamed from: f */
        e f28088f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f28083a = Float.NaN;
            this.f28084b = Float.NaN;
            this.f28085c = Float.NaN;
            this.f28086d = Float.NaN;
            this.f28087e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f28229A7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f28238B7) {
                    this.f28087e = typedArrayObtainStyledAttributes.getResourceId(index, this.f28087e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f28087e);
                    context.getResources().getResourceName(this.f28087e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f28088f = eVar;
                        eVar.e(context, this.f28087e);
                    }
                } else if (index == i.f28247C7) {
                    this.f28086d = typedArrayObtainStyledAttributes.getDimension(index, this.f28086d);
                } else if (index == i.f28256D7) {
                    this.f28084b = typedArrayObtainStyledAttributes.getDimension(index, this.f28084b);
                } else if (index == i.f28265E7) {
                    this.f28085c = typedArrayObtainStyledAttributes.getDimension(index, this.f28085c);
                } else if (index == i.f28274F7) {
                    this.f28083a = typedArrayObtainStyledAttributes.getDimension(index, this.f28083a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f28074a = constraintLayout;
        a(context, i10);
    }

    private void a(Context context, int i10) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                aVar = new a(context, xml);
                                this.f28077d.put(aVar.f28079a, aVar);
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xml);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && DiagnosticsEntry.ID_KEY.equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), DiagnosticsEntry.ID_KEY, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.l(context, xmlPullParser);
                this.f28078e.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }
}
