package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l.AbstractC5511a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.C6573x;
import t.C6575z;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: i */
    private static X f25243i;

    /* JADX INFO: renamed from: a */
    private WeakHashMap f25245a;

    /* JADX INFO: renamed from: b */
    private t.i0 f25246b;

    /* JADX INFO: renamed from: c */
    private t.j0 f25247c;

    /* JADX INFO: renamed from: d */
    private final WeakHashMap f25248d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e */
    private TypedValue f25249e;

    /* JADX INFO: renamed from: f */
    private boolean f25250f;

    /* JADX INFO: renamed from: g */
    private c f25251g;

    /* JADX INFO: renamed from: h */
    private static final PorterDuff.Mode f25242h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j */
    private static final a f25244j = new a(6);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends C6575z {
        public a(int i10) {
            super(i10);
        }

        private static int m(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter n(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) d(Integer.valueOf(m(i10, mode)));
        }

        PorterDuffColorFilter o(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) f(Integer.valueOf(m(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        Drawable a(X x10, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C6573x c6573x = (C6573x) this.f25248d.get(context);
            if (c6573x == null) {
                c6573x = new C6573x();
                this.f25248d.put(context, c6573x);
            }
            c6573x.i(j10, new WeakReference(constantState));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f25245a == null) {
            this.f25245a = new WeakHashMap();
        }
        t.j0 j0Var = (t.j0) this.f25245a.get(context);
        if (j0Var == null) {
            j0Var = new t.j0();
            this.f25245a.put(context, j0Var);
        }
        j0Var.a(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f25250f) {
            return;
        }
        this.f25250f = true;
        Drawable drawableI = i(context, AbstractC5511a.f52292a);
        if (drawableI == null || !p(drawableI)) {
            this.f25250f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i10) {
        if (this.f25249e == null) {
            this.f25249e = new TypedValue();
        }
        TypedValue typedValue = this.f25249e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f25251g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i10);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized X g() {
        try {
            if (f25243i == null) {
                X x10 = new X();
                f25243i = x10;
                o(x10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f25243i;
    }

    private synchronized Drawable h(Context context, long j10) {
        C6573x c6573x = (C6573x) this.f25248d.get(context);
        if (c6573x == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c6573x.e(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c6573x.j(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterN;
        a aVar = f25244j;
        porterDuffColorFilterN = aVar.n(i10, mode);
        if (porterDuffColorFilterN == null) {
            porterDuffColorFilterN = new PorterDuffColorFilter(i10, mode);
            aVar.o(i10, mode, porterDuffColorFilterN);
        }
        return porterDuffColorFilterN;
    }

    private ColorStateList m(Context context, int i10) {
        t.j0 j0Var;
        WeakHashMap weakHashMap = this.f25245a;
        if (weakHashMap == null || (j0Var = (t.j0) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) j0Var.f(i10);
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i10) {
        int next;
        t.i0 i0Var = this.f25246b;
        if (i0Var == null || i0Var.isEmpty()) {
            return null;
        }
        t.j0 j0Var = this.f25247c;
        if (j0Var != null) {
            String str = (String) j0Var.f(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f25246b.get(str) == null)) {
                return null;
            }
        } else {
            this.f25247c = new t.j0();
        }
        if (this.f25249e == null) {
            this.f25249e = new TypedValue();
        }
        TypedValue typedValue = this.f25249e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
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
                this.f25247c.a(i10, name);
                b bVar = (b) this.f25246b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableH == null) {
            this.f25247c.a(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL != null) {
            Drawable drawableR = B1.a.r(drawable.mutate());
            B1.a.o(drawableR, colorStateListL);
            PorterDuff.Mode modeN = n(i10);
            if (modeN != null) {
                B1.a.p(drawableR, modeN);
            }
            return drawableR;
        }
        c cVar = this.f25251g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, f0 f0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = f0Var.f25399d;
        if (z10 || f0Var.f25398c) {
            drawable.setColorFilter(f(z10 ? f0Var.f25396a : null, f0Var.f25398c ? f0Var.f25397b : f25242h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = e(context, i10);
            }
            if (drawableQ == null) {
                drawableQ = AbstractC7194b.e(context, i10);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i10, z10, drawableQ);
            }
            if (drawableQ != null) {
                O.b(drawableQ);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f25251g;
            colorStateListM = cVar == null ? null : cVar.b(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f25251g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    public synchronized void r(Context context) {
        C6573x c6573x = (C6573x) this.f25248d.get(context);
        if (c6573x != null) {
            c6573x.a();
        }
    }

    synchronized Drawable s(Context context, r0 r0Var, int i10) {
        try {
            Drawable drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = r0Var.a(i10);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i10, false, drawableQ);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(c cVar) {
        this.f25251g = cVar;
    }

    boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f25251g;
        return cVar != null && cVar.c(context, i10, drawable);
    }

    private static void o(X x10) {
    }
}
