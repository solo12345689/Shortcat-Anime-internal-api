package z1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import x1.AbstractC7047d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class i {
    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayI = n.i(resources, theme, attributeSet, AbstractC7047d.f63658F);
        float f10 = n.f(typedArrayI, xmlPullParser, "startX", AbstractC7047d.f63667O, 0.0f);
        float f11 = n.f(typedArrayI, xmlPullParser, "startY", AbstractC7047d.f63668P, 0.0f);
        float f12 = n.f(typedArrayI, xmlPullParser, "endX", AbstractC7047d.f63669Q, 0.0f);
        float f13 = n.f(typedArrayI, xmlPullParser, "endY", AbstractC7047d.f63670R, 0.0f);
        float f14 = n.f(typedArrayI, xmlPullParser, "centerX", AbstractC7047d.f63662J, 0.0f);
        float f15 = n.f(typedArrayI, xmlPullParser, "centerY", AbstractC7047d.f63663K, 0.0f);
        int iG = n.g(typedArrayI, xmlPullParser, "type", AbstractC7047d.f63661I, 0);
        int iB = n.b(typedArrayI, xmlPullParser, "startColor", AbstractC7047d.f63659G, 0);
        boolean zH = n.h(xmlPullParser, "centerColor");
        int iB2 = n.b(typedArrayI, xmlPullParser, "centerColor", AbstractC7047d.f63666N, 0);
        int iB3 = n.b(typedArrayI, xmlPullParser, "endColor", AbstractC7047d.f63660H, 0);
        int iG2 = n.g(typedArrayI, xmlPullParser, "tileMode", AbstractC7047d.f63665M, 0);
        float f16 = n.f(typedArrayI, xmlPullParser, "gradientRadius", AbstractC7047d.f63664L, 0.0f);
        typedArrayI.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zH, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f10, f11, f12, f13, aVarA.f65512a, aVarA.f65513b, d(iG2)) : new SweepGradient(f14, f15, aVarA.f65512a, aVarA.f65513b);
        }
        if (f16 > 0.0f) {
            return new RadialGradient(f14, f15, f16, aVarA.f65512a, aVarA.f65513b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new z1.i.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static z1.i.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = x1.AbstractC7047d.f63671S
            android.content.res.TypedArray r3 = z1.n.i(r8, r11, r10, r3)
            int r5 = x1.AbstractC7047d.f63672T
            boolean r5 = r3.hasValue(r5)
            int r6 = x1.AbstractC7047d.f63673U
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = x1.AbstractC7047d.f63672T
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = x1.AbstractC7047d.f63673U
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            z1.i$a r8 = new z1.i$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.i.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):z1.i$a");
    }

    private static Shader.TileMode d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f65512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f65513b;

        a(List list, List list2) {
            int size = list.size();
            this.f65512a = new int[size];
            this.f65513b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f65512a[i10] = ((Integer) list.get(i10)).intValue();
                this.f65513b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f65512a = new int[]{i10, i11};
            this.f65513b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f65512a = new int[]{i10, i11, i12};
            this.f65513b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
