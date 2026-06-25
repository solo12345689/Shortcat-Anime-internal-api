package androidx.media3.ui;

import G3.C1592a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
import s2.C6403a;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f31275A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f31276B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f31277C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f31278D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private StaticLayout f31279E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private StaticLayout f31280F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f31281G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f31282H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f31283I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Rect f31284J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f31285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f31286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f31287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f31288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f31289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f31290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f31291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f31292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f31293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Layout.Alignment f31294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f31295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f31296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f31297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f31298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f31299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f31300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f31301q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f31302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f31303s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f31304t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f31305u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f31306v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f31307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f31308x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f31309y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f31310z;

    public C(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f31289e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f31288d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f31285a = fRound;
        this.f31286b = fRound;
        this.f31287c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f31290f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f31291g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f31292h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f31295k, (Rect) null, this.f31284J, this.f31292h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        AbstractC6614a.e(this.f31284J);
        AbstractC6614a.e(this.f31295k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.f31279E;
        StaticLayout staticLayout2 = this.f31280F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f31281G, this.f31282H);
        if (Color.alpha(this.f31305u) > 0) {
            this.f31291g.setColor(this.f31305u);
            canvas2 = canvas;
            canvas2.drawRect(-this.f31283I, 0.0f, staticLayout.getWidth() + this.f31283I, staticLayout.getHeight(), this.f31291g);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f31307w;
        if (i10 == 1) {
            this.f31290f.setStrokeJoin(Paint.Join.ROUND);
            this.f31290f.setStrokeWidth(this.f31285a);
            this.f31290f.setColor(this.f31306v);
            this.f31290f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f31290f;
            float f10 = this.f31286b;
            float f11 = this.f31287c;
            textPaint.setShadowLayer(f10, f11, f11, this.f31306v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f31306v;
            int i12 = z10 ? this.f31306v : -1;
            float f12 = this.f31286b / 2.0f;
            this.f31290f.setColor(this.f31303s);
            this.f31290f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f31290f.setShadowLayer(this.f31286b, f13, f13, i11);
            staticLayout2.draw(canvas2);
            this.f31290f.setShadowLayer(this.f31286b, f12, f12, i12);
        }
        this.f31290f.setColor(this.f31303s);
        this.f31290f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f31290f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f31295k
            int r1 = r7.f31277C
            int r2 = r7.f31275A
            int r1 = r1 - r2
            int r3 = r7.f31278D
            int r4 = r7.f31276B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f31299o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f31296l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f31301q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f31302r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f31300p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f31298n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f31284J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g() {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C.g():void");
    }

    public void b(C6403a c6403a, C1592a c1592a, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = c6403a.f59049d == null;
        if (!z10) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(c6403a.f59046a)) {
            return;
        } else {
            i14 = c6403a.f59057l ? c6403a.f59058m : c1592a.f7132c;
        }
        if (a(this.f31293i, c6403a.f59046a) && Objects.equals(this.f31294j, c6403a.f59047b) && this.f31295k == c6403a.f59049d && this.f31296l == c6403a.f59050e && this.f31297m == c6403a.f59051f && Integer.valueOf(this.f31298n).equals(Integer.valueOf(c6403a.f59052g)) && this.f31299o == c6403a.f59053h && Integer.valueOf(this.f31300p).equals(Integer.valueOf(c6403a.f59054i)) && this.f31301q == c6403a.f59055j && this.f31302r == c6403a.f59056k && this.f31303s == c1592a.f7130a && this.f31304t == c1592a.f7131b && this.f31305u == i14 && this.f31307w == c1592a.f7133d && this.f31306v == c1592a.f7134e && Objects.equals(this.f31290f.getTypeface(), c1592a.f7135f) && this.f31308x == f10 && this.f31309y == f11 && this.f31310z == f12 && this.f31275A == i10 && this.f31276B == i11 && this.f31277C == i12 && this.f31278D == i13) {
            d(canvas, z10);
            return;
        }
        this.f31293i = c6403a.f59046a;
        this.f31294j = c6403a.f59047b;
        this.f31295k = c6403a.f59049d;
        this.f31296l = c6403a.f59050e;
        this.f31297m = c6403a.f59051f;
        this.f31298n = c6403a.f59052g;
        this.f31299o = c6403a.f59053h;
        this.f31300p = c6403a.f59054i;
        this.f31301q = c6403a.f59055j;
        this.f31302r = c6403a.f59056k;
        this.f31303s = c1592a.f7130a;
        this.f31304t = c1592a.f7131b;
        this.f31305u = i14;
        this.f31307w = c1592a.f7133d;
        this.f31306v = c1592a.f7134e;
        this.f31290f.setTypeface(c1592a.f7135f);
        this.f31308x = f10;
        this.f31309y = f11;
        this.f31310z = f12;
        this.f31275A = i10;
        this.f31276B = i11;
        this.f31277C = i12;
        this.f31278D = i13;
        if (z10) {
            AbstractC6614a.e(this.f31293i);
            g();
        } else {
            AbstractC6614a.e(this.f31295k);
            f();
        }
        d(canvas, z10);
    }
}
