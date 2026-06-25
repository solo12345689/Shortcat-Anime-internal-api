package A1;

import H1.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.List;
import t.C6575z;
import z1.h;
import z1.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a */
    private static final z f113a;

    /* JADX INFO: renamed from: b */
    private static final C6575z f114b;

    /* JADX INFO: renamed from: c */
    private static Paint f115c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends j.c {

        /* JADX INFO: renamed from: a */
        private k.e f116a;

        public a(k.e eVar) {
            this.f116a = eVar;
        }

        @Override // H1.j.c
        public void a(int i10) {
            k.e eVar = this.f116a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // H1.j.c
        public void b(Typeface typeface) {
            k.e eVar = this.f116a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        X3.a.c("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f113a = new y();
        } else if (i10 >= 29) {
            f113a = new x();
        } else if (i10 >= 28) {
            f113a = new w();
        } else if (i10 >= 26) {
            f113a = new v();
        } else if (u.k()) {
            f113a = new u();
        } else {
            f113a = new t();
        }
        f114b = new C6575z(16);
        f115c = null;
        X3.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, j.b[] bVarArr, int i10) {
        X3.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f113a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            X3.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        X3.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f113a.c(context, cancellationSignal, list, i10);
        } finally {
            X3.a.f();
        }
    }

    public static Typeface d(Context context, h.b bVar, Resources resources, int i10, String str, int i11, int i12, k.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof h.e) {
            h.e eVar2 = (h.e) bVar;
            Typeface typefaceI = i(eVar2);
            if (typefaceI != null) {
                if (eVar != null) {
                    eVar.d(typefaceI, handler);
                }
                f114b.f(f(resources, i10, str, i11, i12), typefaceI);
                return typefaceI;
            }
            typefaceA = H1.j.d(context, eVar2.b(), i12, !z10 ? eVar != null : eVar2.a() != 0, z10 ? eVar2.d() : -1, k.e.e(handler), new a(eVar));
        } else {
            typefaceA = f113a.a(context, (h.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f114b.f(f(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceE = f113a.e(context, resources, i10, str, i12);
        if (typefaceE != null) {
            f114b.f(f(resources, i10, str, i11, i12), typefaceE);
        }
        return typefaceE;
    }

    private static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f114b.d(f(resources, i10, str, i11, i12));
    }

    public static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00ec, code lost:
    
        return r0.build();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface i(z1.h.e r8) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.s.i(z1.h$e):android.graphics.Typeface");
    }

    public static Font j(Typeface typeface) {
        if (f115c == null) {
            f115c = new Paint();
        }
        f115c.setTextSize(10.0f);
        f115c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f115c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
