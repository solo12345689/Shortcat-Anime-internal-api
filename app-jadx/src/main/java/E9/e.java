package E9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import i.j;
import o9.AbstractC5848k;
import x1.AbstractC7047d;
import z1.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f5792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f5793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f5794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f5800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f5801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f5802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f5804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f5805n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f5806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f5807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5808q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f5809r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Typeface f5810s;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f5811a;

        a(g gVar) {
            this.f5811a = gVar;
        }

        @Override // z1.k.e
        public void f(int i10) {
            e.this.f5808q = true;
            this.f5811a.a(i10);
        }

        @Override // z1.k.e
        public void g(Typeface typeface) {
            e eVar = e.this;
            eVar.f5810s = Typeface.create(typeface, eVar.f5797f);
            e.this.f5808q = true;
            this.f5811a.b(e.this.f5810s, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f5813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f5814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f5815c;

        b(Context context, TextPaint textPaint, g gVar) {
            this.f5813a = context;
            this.f5814b = textPaint;
            this.f5815c = gVar;
        }

        @Override // E9.g
        public void a(int i10) {
            this.f5815c.a(i10);
        }

        @Override // E9.g
        public void b(Typeface typeface, boolean z10) {
            e.this.r(this.f5813a, this.f5814b, typeface);
            this.f5815c.b(typeface, z10);
        }
    }

    public e(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, j.f48223S2);
        o(typedArrayObtainStyledAttributes.getDimension(j.f48228T2, 0.0f));
        n(c.a(context, typedArrayObtainStyledAttributes, j.f48243W2));
        this.f5792a = c.a(context, typedArrayObtainStyledAttributes, j.f48248X2);
        this.f5793b = c.a(context, typedArrayObtainStyledAttributes, j.f48253Y2);
        this.f5797f = typedArrayObtainStyledAttributes.getInt(j.f48238V2, 0);
        this.f5798g = typedArrayObtainStyledAttributes.getInt(j.f48233U2, 1);
        int iG = c.g(typedArrayObtainStyledAttributes, j.f48287f3, j.f48277d3);
        this.f5807p = typedArrayObtainStyledAttributes.getResourceId(iG, 0);
        this.f5795d = typedArrayObtainStyledAttributes.getString(iG);
        this.f5799h = typedArrayObtainStyledAttributes.getBoolean(j.f48297h3, false);
        this.f5794c = c.a(context, typedArrayObtainStyledAttributes, j.f48257Z2);
        this.f5800i = typedArrayObtainStyledAttributes.getFloat(j.f48262a3, 0.0f);
        this.f5801j = typedArrayObtainStyledAttributes.getFloat(j.f48267b3, 0.0f);
        this.f5802k = typedArrayObtainStyledAttributes.getFloat(j.f48272c3, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, AbstractC5848k.f54950G3);
        this.f5803l = typedArrayObtainStyledAttributes2.hasValue(AbstractC5848k.f54958H3);
        this.f5804m = typedArrayObtainStyledAttributes2.getFloat(AbstractC5848k.f54958H3, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5796e = typedArrayObtainStyledAttributes2.getString(c.g(typedArrayObtainStyledAttributes2, AbstractC5848k.f54982K3, AbstractC5848k.f54966I3));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f5810s == null && (str = this.f5795d) != null) {
            this.f5810s = Typeface.create(str, this.f5797f);
        }
        if (this.f5810s == null) {
            int i10 = this.f5798g;
            if (i10 == 1) {
                this.f5810s = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f5810s = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f5810s = Typeface.DEFAULT;
            } else {
                this.f5810s = Typeface.MONOSPACE;
            }
            this.f5810s = Typeface.create(this.f5810s, this.f5797f);
        }
    }

    private Typeface i(Context context) {
        Typeface typefaceCreate;
        if (this.f5809r) {
            return null;
        }
        this.f5809r = true;
        String strM = m(context, this.f5807p);
        if (strM == null || (typefaceCreate = Typeface.create(strM, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.f5797f);
    }

    private boolean l(Context context) {
        if (f.a()) {
            f(context);
            return true;
        }
        if (this.f5808q) {
            return true;
        }
        int i10 = this.f5807p;
        if (i10 == 0) {
            return false;
        }
        Typeface typefaceC = k.c(context, i10);
        if (typefaceC != null) {
            this.f5810s = typefaceC;
            this.f5808q = true;
            return true;
        }
        Typeface typefaceI = i(context);
        if (typefaceI == null) {
            return false;
        }
        this.f5810s = typefaceI;
        this.f5808q = true;
        return true;
    }

    private static String m(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 0 && resources.getResourceTypeName(i10).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), AbstractC7047d.f63681h);
                        String string = typedArrayObtainAttributes.getString(AbstractC7047d.f63689p);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public Typeface e() {
        d();
        return this.f5810s;
    }

    public Typeface f(Context context) {
        if (this.f5808q) {
            return this.f5810s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = k.h(context, this.f5807p);
                this.f5810s = typefaceH;
                if (typefaceH != null) {
                    this.f5810s = Typeface.create(typefaceH, this.f5797f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f5795d, e10);
            }
        }
        d();
        this.f5808q = true;
        return this.f5810s;
    }

    public void g(Context context, g gVar) {
        if (!l(context)) {
            d();
        }
        int i10 = this.f5807p;
        if (i10 == 0) {
            this.f5808q = true;
        }
        if (this.f5808q) {
            gVar.b(this.f5810s, true);
            return;
        }
        try {
            k.j(context, i10, new a(gVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f5808q = true;
            gVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f5795d, e10);
            this.f5808q = true;
            gVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, g gVar) {
        r(context, textPaint, e());
        g(context, new b(context, textPaint, gVar));
    }

    public ColorStateList j() {
        return this.f5805n;
    }

    public float k() {
        return this.f5806o;
    }

    public void n(ColorStateList colorStateList) {
        this.f5805n = colorStateList;
    }

    public void o(float f10) {
        this.f5806o = f10;
    }

    public void p(Context context, TextPaint textPaint, g gVar) {
        q(context, textPaint, gVar);
        ColorStateList colorStateList = this.f5805n;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f5802k;
        float f11 = this.f5800i;
        float f12 = this.f5801j;
        ColorStateList colorStateList2 = this.f5794c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void q(Context context, TextPaint textPaint, g gVar) {
        Typeface typeface;
        if (l(context) && this.f5808q && (typeface = this.f5810s) != null) {
            r(context, textPaint, typeface);
        } else {
            h(context, textPaint, gVar);
        }
    }

    public void r(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = i.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f5797f & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f5806o);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f5796e);
        }
        if (this.f5803l) {
            textPaint.setLetterSpacing(this.f5804m);
        }
    }
}
