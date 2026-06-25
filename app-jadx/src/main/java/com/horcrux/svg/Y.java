package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class Y extends l0 {

    /* JADX INFO: renamed from: q */
    private Path f43706q;

    /* JADX INFO: renamed from: r */
    String f43707r;

    /* JADX INFO: renamed from: s */
    private Z f43708s;

    /* JADX INFO: renamed from: t */
    private final ArrayList f43709t;

    /* JADX INFO: renamed from: u */
    private final ArrayList f43710u;

    /* JADX INFO: renamed from: v */
    private final AssetManager f43711v;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f43712a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f43713b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f43714c;

        static {
            int[] iArr = new int[a0.values().length];
            f43714c = iArr;
            try {
                iArr[a0.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43714c[a0.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43714c[a0.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43714c[a0.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43714c[a0.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43714c[a0.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43714c[a0.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43714c[a0.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43714c[a0.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f43714c[a0.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f43714c[a0.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f43714c[a0.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f43714c[a0.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f43714c[a0.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f43714c[a0.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f43714c[a0.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[g0.values().length];
            f43713b = iArr2;
            try {
                iArr2[g0.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f43713b[g0.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[e0.values().length];
            f43712a = iArr3;
            try {
                iArr3[e0.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f43712a[e0.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f43712a[e0.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public Y(ReactContext reactContext) {
        super(reactContext);
        this.f43709t = new ArrayList();
        this.f43710u = new ArrayList();
        this.f43711v = this.mContext.getResources().getAssets();
    }

    private void d0(Paint paint, C4015x c4015x) {
        int i10 = Build.VERSION.SDK_INT;
        double d10 = c4015x.f43920n;
        paint.setLetterSpacing((float) (d10 / (c4015x.f43907a * ((double) this.mScale))));
        if (d10 == 0.0d && c4015x.f43915i == c0.normal) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + c4015x.f43913g);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + c4015x.f43913g);
        }
        if (i10 >= 26) {
            paint.setFontVariationSettings("'wght' " + c4015x.f43912f + c4015x.f43914h);
        }
    }

    private void e0(Paint paint, C4015x c4015x) {
        int i10 = 0;
        boolean z10 = c4015x.f43911e == d0.Bold || c4015x.f43912f >= 550;
        boolean z11 = c4015x.f43909c == b0.italic;
        if (z10 && z11) {
            i10 = 3;
        } else if (z10) {
            i10 = 1;
        } else if (z11) {
            i10 = 2;
        }
        int i11 = c4015x.f43912f;
        String str = c4015x.f43908b;
        Typeface typefaceD = null;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                X.a();
                Typeface.Builder builderA = Y0.l0.a(this.f43711v, str2);
                builderA.setFontVariationSettings("'wght' " + i11 + c4015x.f43914h);
                builderA.setWeight(i11);
                builderA.setItalic(z11);
                typefaceD = builderA.build();
                if (typefaceD == null) {
                    X.a();
                    Typeface.Builder builderA2 = Y0.l0.a(this.f43711v, str3);
                    builderA2.setFontVariationSettings("'wght' " + i11 + c4015x.f43914h);
                    builderA2.setWeight(i11);
                    builderA2.setItalic(z11);
                    typefaceD = builderA2.build();
                }
            } else {
                try {
                    try {
                        typefaceD = Typeface.create(Typeface.createFromAsset(this.f43711v, str2), i10);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    typefaceD = Typeface.create(Typeface.createFromAsset(this.f43711v, str3), i10);
                }
            }
        }
        if (typefaceD == null) {
            try {
                typefaceD = com.facebook.react.views.text.e.c().d(str, i10, this.f43711v);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typefaceD = Typeface.create(typefaceD, i11, z11);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typefaceD);
        paint.setTextSize((float) (c4015x.f43907a * ((double) this.mScale)));
        paint.setLetterSpacing(0.0f);
    }

    private void f0(Canvas canvas, Paint paint) {
        C4017z c4017zF = F();
        H();
        C4015x c4015xB = c4017zF.b();
        TextPaint textPaint = new TextPaint(paint);
        e0(textPaint, c4015xB);
        d0(textPaint, c4015xB);
        double dC = c4017zF.c();
        int i10 = a.f43712a[c4015xB.f43916j.ordinal()];
        StaticLayout staticLayoutI0 = i0(textPaint, i10 != 2 ? i10 != 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER, true, new SpannableString(this.f43707r), (int) M.a(this.f43836f, canvas.getWidth(), 0.0d, this.mScale, dC));
        int lineAscent = staticLayoutI0.getLineAscent(0);
        float fL = (float) c4017zF.l(0.0d);
        float fM = (float) (c4017zF.m() + ((double) lineAscent));
        G();
        canvas.save();
        canvas.translate(fL, fM);
        staticLayoutI0.draw(canvas);
        canvas.restore();
    }

    private double g0(SVGLength sVGLength, double d10, double d11) {
        return M.a(sVGLength, d10, 0.0d, this.mScale, d11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0295 A[PHI: r0
  0x0295: PHI (r0v9 double) = 
  (r0v8 double)
  (r0v8 double)
  (r0v8 double)
  (r0v8 double)
  (r0v8 double)
  (r0v36 double)
  (r0v37 double)
  (r0v8 double)
  (r0v8 double)
  (r0v8 double)
  (r0v42 double)
  (r0v43 double)
 binds: [B:276:0x0238, B:278:0x023e, B:280:0x024a, B:282:0x024e, B:299:0x0281, B:324:0x0301, B:313:0x02d4, B:302:0x0299, B:304:0x029f, B:306:0x02a5, B:311:0x02c1, B:300:0x0284] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x02d4 A[PHI: r31
  0x02d4: PHI (r31v4 double) = (r31v3 double), (r31v3 double), (r31v5 double) binds: [B:321:0x02f3, B:323:0x02ff, B:312:0x02d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Path h0(java.lang.String r69, android.graphics.Paint r70, android.graphics.Canvas r71) {
        /*
            Method dump skipped, instruction units count: 1420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.Y.h0(java.lang.String, android.graphics.Paint, android.graphics.Canvas):android.graphics.Path");
    }

    private StaticLayout i0(TextPaint textPaint, Layout.Alignment alignment, boolean z10, SpannableString spannableString, int i10) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    private double j0(e0 e0Var, double d10) {
        int i10 = a.f43712a[e0Var.ordinal()];
        if (i10 == 2) {
            return (-d10) / 2.0d;
        }
        if (i10 != 3) {
            return 0.0d;
        }
        return -d10;
    }

    private void l0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == Z.class) {
                this.f43708s = (Z) parent;
                return;
            } else {
                if (!(parent instanceof l0)) {
                    return;
                }
            }
        }
    }

    public static String m0(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            bArr[i10] = (byte) bidi.getRunLevel(i10);
            numArr[i10] = Integer.valueOf(i10);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < runCount; i11++) {
            int iIntValue = numArr[i11].intValue();
            int runStart = bidi.getRunStart(iIntValue);
            int runLimit = bidi.getRunLimit(iIntValue);
            if ((bArr[iIntValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb2.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb2.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb2.toString();
    }

    @Override // com.horcrux.svg.l0
    double P(Paint paint) {
        if (!Double.isNaN(this.f43846p)) {
            return this.f43846p;
        }
        String str = this.f43707r;
        double dP = 0.0d;
        if (str == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof l0) {
                    dP += ((l0) childAt).P(paint);
                }
            }
            this.f43846p = dP;
            return dP;
        }
        if (str.length() == 0) {
            this.f43846p = 0.0d;
            return 0.0d;
        }
        C4015x c4015xB = F().b();
        e0(paint, c4015xB);
        d0(paint, c4015xB);
        double dMeasureText = paint.measureText(str);
        this.f43846p = dMeasureText;
        return dMeasureText;
    }

    @Override // com.horcrux.svg.l0, com.horcrux.svg.VirtualView
    void clearCache() {
        this.f43706q = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.l0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        if (this.f43707r == null) {
            clip(canvas, paint);
            B(canvas, paint, f10);
            return;
        }
        SVGLength sVGLength = this.f43836f;
        if (sVGLength != null && sVGLength.f43656a != 0.0d) {
            if (setupFillPaint(paint, this.fillOpacity * f10)) {
                f0(canvas, paint);
            }
            if (setupStrokePaint(paint, f10 * this.strokeOpacity)) {
                f0(canvas, paint);
                return;
            }
            return;
        }
        int size = this.f43709t.size();
        if (size > 0) {
            e0(paint, F().b());
            for (int i10 = 0; i10 < size; i10++) {
                String str = (String) this.f43709t.get(i10);
                Matrix matrix = (Matrix) this.f43710u.get(i10);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        C(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.l0, com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.f43706q;
        if (path != null) {
            return path;
        }
        if (this.f43707r == null) {
            Path pathO = O(canvas, paint);
            this.f43706q = pathO;
            return pathO;
        }
        l0();
        H();
        this.f43706q = h0(m0(this.f43707r), paint, canvas);
        G();
        return this.f43706q;
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        Region region;
        if (this.f43707r == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.l0, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.f43706q = null;
        super.invalidate();
    }

    public void k0(String str) {
        this.f43707r = str;
        invalidate();
    }
}
