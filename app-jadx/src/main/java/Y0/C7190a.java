package y0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;
import x0.C7038j;
import z1.d;
import z1.n;

/* JADX INFO: renamed from: y0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7190a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParser f64685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f64686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C7038j f64687c;

    public C7190a(XmlPullParser xmlPullParser, int i10) {
        this.f64685a = xmlPullParser;
        this.f64686b = i10;
        this.f64687c = new C7038j();
    }

    private final void m(int i10) {
        this.f64686b = i10 | this.f64686b;
    }

    public final int a() {
        return this.f64686b;
    }

    public final float b(TypedArray typedArray, int i10, float f10) {
        float dimension = typedArray.getDimension(i10, f10);
        m(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float c(TypedArray typedArray, int i10, float f10) {
        float f11 = typedArray.getFloat(i10, f10);
        m(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int d(TypedArray typedArray, int i10, int i11) {
        int i12 = typedArray.getInt(i10, i11);
        m(typedArray.getChangingConfigurations());
        return i12;
    }

    public final boolean e(TypedArray typedArray, String str, int i10, boolean z10) {
        boolean zA = n.a(typedArray, this.f64685a, str, i10, z10);
        m(typedArray.getChangingConfigurations());
        return zA;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7190a)) {
            return false;
        }
        C7190a c7190a = (C7190a) obj;
        return AbstractC5504s.c(this.f64685a, c7190a.f64685a) && this.f64686b == c7190a.f64686b;
    }

    public final ColorStateList f(TypedArray typedArray, Resources.Theme theme, String str, int i10) {
        ColorStateList colorStateListC = n.c(typedArray, this.f64685a, theme, str, i10);
        m(typedArray.getChangingConfigurations());
        return colorStateListC;
    }

    public final d g(TypedArray typedArray, Resources.Theme theme, String str, int i10, int i11) {
        d dVarE = n.e(typedArray, this.f64685a, theme, str, i10, i11);
        m(typedArray.getChangingConfigurations());
        return dVarE;
    }

    public final float h(TypedArray typedArray, String str, int i10, float f10) {
        float f11 = n.f(typedArray, this.f64685a, str, i10, f10);
        m(typedArray.getChangingConfigurations());
        return f11;
    }

    public int hashCode() {
        return (this.f64685a.hashCode() * 31) + Integer.hashCode(this.f64686b);
    }

    public final int i(TypedArray typedArray, String str, int i10, int i11) {
        int iG = n.g(typedArray, this.f64685a, str, i10, i11);
        m(typedArray.getChangingConfigurations());
        return iG;
    }

    public final String j(TypedArray typedArray, int i10) {
        String string = typedArray.getString(i10);
        m(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser k() {
        return this.f64685a;
    }

    public final TypedArray l(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayI = n.i(resources, theme, attributeSet, iArr);
        m(typedArrayI.getChangingConfigurations());
        return typedArrayI;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f64685a + ", config=" + this.f64686b + ')';
    }

    public /* synthetic */ C7190a(XmlPullParser xmlPullParser, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }
}
