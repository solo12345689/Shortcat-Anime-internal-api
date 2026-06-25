package H9;

import H9.l;
import H9.m;
import H9.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import b2.AbstractC2978j;
import b2.C2981m;
import b2.C2982n;
import java.util.BitSet;
import o9.AbstractC5838a;
import x9.AbstractC7066a;
import z9.C7345a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h extends Drawable implements o {

    /* JADX INFO: renamed from: F */
    private static final String f8193F = "h";

    /* JADX INFO: renamed from: G */
    static final l f8194G = l.a().q(0, 0.0f).m();

    /* JADX INFO: renamed from: H */
    private static final Paint f8195H;

    /* JADX INFO: renamed from: I */
    private static final e[] f8196I;

    /* JADX INFO: renamed from: A */
    private C2982n f8197A;

    /* JADX INFO: renamed from: B */
    C2981m[] f8198B;

    /* JADX INFO: renamed from: C */
    private float[] f8199C;

    /* JADX INFO: renamed from: D */
    private float[] f8200D;

    /* JADX INFO: renamed from: E */
    private d f8201E;

    /* JADX INFO: renamed from: a */
    private final l.c f8202a;

    /* JADX INFO: renamed from: b */
    private c f8203b;

    /* JADX INFO: renamed from: c */
    private final n.g[] f8204c;

    /* JADX INFO: renamed from: d */
    private final n.g[] f8205d;

    /* JADX INFO: renamed from: e */
    private final BitSet f8206e;

    /* JADX INFO: renamed from: f */
    private boolean f8207f;

    /* JADX INFO: renamed from: g */
    private boolean f8208g;

    /* JADX INFO: renamed from: h */
    private final Matrix f8209h;

    /* JADX INFO: renamed from: i */
    private final Path f8210i;

    /* JADX INFO: renamed from: j */
    private final Path f8211j;

    /* JADX INFO: renamed from: k */
    private final RectF f8212k;

    /* JADX INFO: renamed from: l */
    private final RectF f8213l;

    /* JADX INFO: renamed from: m */
    private final Region f8214m;

    /* JADX INFO: renamed from: n */
    private final Region f8215n;

    /* JADX INFO: renamed from: o */
    private final Paint f8216o;

    /* JADX INFO: renamed from: p */
    private final Paint f8217p;

    /* JADX INFO: renamed from: q */
    private final G9.a f8218q;

    /* JADX INFO: renamed from: r */
    private final m.b f8219r;

    /* JADX INFO: renamed from: s */
    private final m f8220s;

    /* JADX INFO: renamed from: t */
    private PorterDuffColorFilter f8221t;

    /* JADX INFO: renamed from: u */
    private PorterDuffColorFilter f8222u;

    /* JADX INFO: renamed from: v */
    private int f8223v;

    /* JADX INFO: renamed from: w */
    private final RectF f8224w;

    /* JADX INFO: renamed from: x */
    private boolean f8225x;

    /* JADX INFO: renamed from: y */
    private boolean f8226y;

    /* JADX INFO: renamed from: z */
    private l f8227z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements l.c {
        a() {
        }

        @Override // H9.l.c
        public H9.d a(H9.d dVar) {
            return dVar instanceof j ? dVar : new H9.b(-h.this.I(), dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements m.b {
        b() {
        }

        @Override // H9.m.b
        public void a(n nVar, Matrix matrix, int i10) {
            h.this.f8206e.set(i10 + 4, nVar.e());
            h.this.f8205d[i10] = nVar.f(matrix);
        }

        @Override // H9.m.b
        public void b(n nVar, Matrix matrix, int i10) {
            h.this.f8206e.set(i10, nVar.e());
            h.this.f8204c[i10] = nVar.f(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        void a(float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e extends AbstractC2978j {

        /* JADX INFO: renamed from: b */
        private final int f8253b;

        e(int i10) {
            super("cornerSizeAtIndex" + i10);
            this.f8253b = i10;
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: c */
        public float a(h hVar) {
            if (hVar.f8199C != null) {
                return hVar.f8199C[this.f8253b];
            }
            return 0.0f;
        }

        @Override // b2.AbstractC2978j
        /* JADX INFO: renamed from: d */
        public void b(h hVar, float f10) {
            if (hVar.f8199C == null || hVar.f8199C[this.f8253b] == f10) {
                return;
            }
            hVar.f8199C[this.f8253b] = f10;
            if (hVar.f8201E != null) {
                hVar.f8201E.a(hVar.z());
            }
            hVar.invalidateSelf();
        }
    }

    static {
        int i10 = 0;
        Paint paint = new Paint(1);
        f8195H = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f8196I = new e[4];
        while (true) {
            e[] eVarArr = f8196I;
            if (i10 >= eVarArr.length) {
                return;
            }
            eVarArr[i10] = new e(i10);
            i10++;
        }
    }

    public h() {
        this(new l());
    }

    public float I() {
        if (Q()) {
            return this.f8217p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean O() {
        c cVar = this.f8203b;
        int i10 = cVar.f8247r;
        if (i10 == 1 || cVar.f8248s <= 0) {
            return false;
        }
        return i10 == 2 || Y();
    }

    private boolean P() {
        Paint.Style style = this.f8203b.f8252w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean Q() {
        Paint.Style style = this.f8203b.f8252w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f8217p.getStrokeWidth() > 0.0f;
    }

    private void S() {
        super.invalidateSelf();
    }

    private void V(Canvas canvas) {
        if (O()) {
            canvas.save();
            X(canvas);
            if (!this.f8225x) {
                s(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f8224w.width() - getBounds().width());
            int iHeight = (int) (this.f8224w.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f8224w.width()) + (this.f8203b.f8248s * 2) + iWidth, ((int) this.f8224w.height()) + (this.f8203b.f8248s * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f8203b.f8248s) - iWidth;
            float f11 = (getBounds().top - this.f8203b.f8248s) - iHeight;
            canvas2.translate(-f10, -f11);
            s(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int W(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void X(Canvas canvas) {
        canvas.translate(F(), G());
    }

    private PorterDuffColorFilter j(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iQ = q(color);
        this.f8223v = iQ;
        if (iQ != color) {
            return new PorterDuffColorFilter(iQ, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void k(RectF rectF, Path path) {
        l(rectF, path);
        if (this.f8203b.f8240k != 1.0f) {
            this.f8209h.reset();
            Matrix matrix = this.f8209h;
            float f10 = this.f8203b.f8240k;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f8209h);
        }
        path.computeBounds(this.f8224w, true);
    }

    private float m(RectF rectF, l lVar, float[] fArr) {
        if (fArr == null) {
            if (lVar.v(rectF)) {
                return lVar.r().a(rectF);
            }
            return -1.0f;
        }
        if (B9.a.a(fArr) && lVar.u()) {
            return fArr[0];
        }
        return -1.0f;
    }

    private void n() {
        q0();
        this.f8220s.d(this.f8227z, this.f8200D, this.f8203b.f8241l, y(), null, this.f8211j);
    }

    private boolean n0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f8203b.f8234e == null || color2 == (colorForState2 = this.f8203b.f8234e.getColorForState(iArr, (color2 = this.f8216o.getColor())))) {
            z10 = false;
        } else {
            this.f8216o.setColor(colorForState2);
            z10 = true;
        }
        if (this.f8203b.f8235f == null || color == (colorForState = this.f8203b.f8235f.getColorForState(iArr, (color = this.f8217p.getColor())))) {
            return z10;
        }
        this.f8217p.setColor(colorForState);
        return true;
    }

    private PorterDuffColorFilter o(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = q(colorForState);
        }
        this.f8223v = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private void o0(int[] iArr) {
        p0(iArr, false);
    }

    private PorterDuffColorFilter p(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? j(paint, z10) : o(colorStateList, mode, z10);
    }

    private void p0(int[] iArr, boolean z10) {
        RectF rectFX = x();
        if (this.f8203b.f8231b == null || rectFX.isEmpty()) {
            return;
        }
        boolean z11 = z10 | (this.f8197A == null);
        if (this.f8199C == null) {
            this.f8199C = new float[4];
        }
        l lVarD = this.f8203b.f8231b.d(iArr);
        for (int i10 = 0; i10 < 4; i10++) {
            float fA = this.f8220s.f(i10, lVarD).a(rectFX);
            if (z11) {
                this.f8199C[i10] = fA;
            }
            C2981m c2981m = this.f8198B[i10];
            if (c2981m != null) {
                c2981m.u(fA);
                if (z11) {
                    this.f8198B[i10].A();
                }
            }
        }
        if (z11) {
            invalidateSelf();
        }
    }

    private void q0() {
        this.f8227z = H().z(this.f8202a);
        float[] fArr = this.f8199C;
        if (fArr == null) {
            this.f8200D = null;
            return;
        }
        if (this.f8200D == null) {
            this.f8200D = new float[fArr.length];
        }
        float fI = I();
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.f8199C;
            if (i10 >= fArr2.length) {
                return;
            }
            this.f8200D[i10] = Math.max(0.0f, fArr2[i10] - fI);
            i10++;
        }
    }

    public static h r(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(AbstractC7066a.c(context, AbstractC5838a.f54604J, h.class.getSimpleName()));
        }
        h hVar = new h();
        hVar.R(context);
        hVar.d0(colorStateList);
        hVar.c0(f10);
        return hVar;
    }

    private boolean r0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f8221t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f8222u;
        c cVar = this.f8203b;
        this.f8221t = p(cVar.f8237h, cVar.f8238i, this.f8216o, true);
        c cVar2 = this.f8203b;
        this.f8222u = p(cVar2.f8236g, cVar2.f8238i, this.f8217p, false);
        c cVar3 = this.f8203b;
        if (cVar3.f8251v) {
            this.f8218q.d(cVar3.f8237h.getColorForState(getState(), 0));
        }
        return (K1.b.a(porterDuffColorFilter, this.f8221t) && K1.b.a(porterDuffColorFilter2, this.f8222u)) ? false : true;
    }

    private void s(Canvas canvas) {
        if (this.f8206e.cardinality() > 0) {
            Log.w(f8193F, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f8203b.f8249t != 0) {
            canvas.drawPath(this.f8210i, this.f8218q.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f8204c[i10].a(this.f8218q, this.f8203b.f8248s, canvas);
            this.f8205d[i10].a(this.f8218q, this.f8203b.f8248s, canvas);
        }
        if (this.f8225x) {
            int iF = F();
            int iG = G();
            canvas.translate(-iF, -iG);
            canvas.drawPath(this.f8210i, f8195H);
            canvas.translate(iF, iG);
        }
    }

    private void s0() {
        float fN = N();
        this.f8203b.f8248s = (int) Math.ceil(0.75f * fN);
        this.f8203b.f8249t = (int) Math.ceil(fN * 0.25f);
        r0();
        S();
    }

    private void t(Canvas canvas) {
        u(canvas, this.f8216o, this.f8210i, this.f8203b.f8230a, this.f8199C, x());
    }

    private void u(Canvas canvas, Paint paint, Path path, l lVar, float[] fArr, RectF rectF) {
        float fM = m(rectF, lVar, fArr);
        if (fM < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f10 = fM * this.f8203b.f8241l;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    private RectF y() {
        this.f8213l.set(x());
        float fI = I();
        this.f8213l.inset(fI, fI);
        return this.f8213l;
    }

    public float A() {
        return this.f8203b.f8245p;
    }

    public ColorStateList B() {
        return this.f8203b.f8234e;
    }

    public float C() {
        return this.f8203b.f8241l;
    }

    public float D() {
        return this.f8203b.f8244o;
    }

    public int E() {
        return this.f8223v;
    }

    public int F() {
        return (int) (((double) this.f8203b.f8249t) * Math.sin(Math.toRadians(r0.f8250u)));
    }

    public int G() {
        return (int) (((double) this.f8203b.f8249t) * Math.cos(Math.toRadians(r0.f8250u)));
    }

    public l H() {
        return this.f8203b.f8230a;
    }

    public ColorStateList J() {
        return this.f8203b.f8237h;
    }

    public float K() {
        float[] fArr = this.f8199C;
        return fArr != null ? fArr[3] : this.f8203b.f8230a.r().a(x());
    }

    public float L() {
        float[] fArr = this.f8199C;
        return fArr != null ? fArr[0] : this.f8203b.f8230a.t().a(x());
    }

    public float M() {
        return this.f8203b.f8246q;
    }

    public float N() {
        return A() + M();
    }

    public void R(Context context) {
        this.f8203b.f8232c = new C7345a(context);
        s0();
    }

    public boolean T() {
        C7345a c7345a = this.f8203b.f8232c;
        return c7345a != null && c7345a.d();
    }

    public boolean U() {
        if (this.f8203b.f8230a.v(x())) {
            return true;
        }
        float[] fArr = this.f8199C;
        return fArr != null && B9.a.a(fArr) && this.f8203b.f8230a.u();
    }

    public boolean Y() {
        return (U() || this.f8210i.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Z(float f10) {
        setShapeAppearanceModel(this.f8203b.f8230a.x(f10));
    }

    public void a0(H9.d dVar) {
        setShapeAppearanceModel(this.f8203b.f8230a.y(dVar));
    }

    public void b0(C2982n c2982n) {
        if (this.f8197A == c2982n) {
            return;
        }
        this.f8197A = c2982n;
        int i10 = 0;
        while (true) {
            C2981m[] c2981mArr = this.f8198B;
            if (i10 >= c2981mArr.length) {
                p0(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (c2981mArr[i10] == null) {
                    c2981mArr[i10] = new C2981m(this, f8196I[i10]);
                }
                this.f8198B[i10].z(new C2982n().f(c2982n.a()).h(c2982n.c()));
                i10++;
            }
        }
    }

    public void c0(float f10) {
        c cVar = this.f8203b;
        if (cVar.f8245p != f10) {
            cVar.f8245p = f10;
            s0();
        }
    }

    public void d0(ColorStateList colorStateList) {
        c cVar = this.f8203b;
        if (cVar.f8234e != colorStateList) {
            cVar.f8234e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f8216o.setColorFilter(this.f8221t);
        int alpha = this.f8216o.getAlpha();
        this.f8216o.setAlpha(W(alpha, this.f8203b.f8243n));
        this.f8217p.setColorFilter(this.f8222u);
        this.f8217p.setStrokeWidth(this.f8203b.f8242m);
        int alpha2 = this.f8217p.getAlpha();
        this.f8217p.setAlpha(W(alpha2, this.f8203b.f8243n));
        if (P()) {
            if (this.f8207f) {
                k(x(), this.f8210i);
                this.f8207f = false;
            }
            V(canvas);
            t(canvas);
        }
        if (Q()) {
            if (this.f8208g) {
                n();
                this.f8208g = false;
            }
            w(canvas);
        }
        this.f8216o.setAlpha(alpha);
        this.f8217p.setAlpha(alpha2);
    }

    public void e0(float f10) {
        c cVar = this.f8203b;
        if (cVar.f8241l != f10) {
            cVar.f8241l = f10;
            this.f8207f = true;
            this.f8208g = true;
            invalidateSelf();
        }
    }

    public void f0(d dVar) {
        this.f8201E = dVar;
    }

    public void g0(int i10, int i11, int i12, int i13) {
        c cVar = this.f8203b;
        if (cVar.f8239j == null) {
            cVar.f8239j = new Rect();
        }
        this.f8203b.f8239j.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8203b.f8243n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f8203b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f8203b.f8247r == 2) {
            return;
        }
        RectF rectFX = x();
        if (rectFX.isEmpty()) {
            return;
        }
        float fM = m(rectFX, this.f8203b.f8230a, this.f8199C);
        if (fM >= 0.0f) {
            outline.setRoundRect(getBounds(), fM * this.f8203b.f8241l);
            return;
        }
        if (this.f8207f) {
            k(rectFX, this.f8210i);
            this.f8207f = false;
        }
        com.google.android.material.drawable.d.j(outline, this.f8210i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f8203b.f8239j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f8214m.set(getBounds());
        k(x(), this.f8210i);
        this.f8215n.setPath(this.f8210i, this.f8214m);
        this.f8214m.op(this.f8215n, Region.Op.DIFFERENCE);
        return this.f8214m;
    }

    public void h0(float f10) {
        c cVar = this.f8203b;
        if (cVar.f8244o != f10) {
            cVar.f8244o = f10;
            s0();
        }
    }

    public void i0(q qVar) {
        c cVar = this.f8203b;
        if (cVar.f8231b != qVar) {
            cVar.f8231b = qVar;
            p0(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f8207f = true;
        this.f8208g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f8203b.f8237h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f8203b.f8236g;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f8203b.f8235f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f8203b.f8234e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        q qVar = this.f8203b.f8231b;
        return qVar != null && qVar.f();
    }

    public void j0(float f10, int i10) {
        m0(f10);
        l0(ColorStateList.valueOf(i10));
    }

    public void k0(float f10, ColorStateList colorStateList) {
        m0(f10);
        l0(colorStateList);
    }

    protected final void l(RectF rectF, Path path) {
        m mVar = this.f8220s;
        c cVar = this.f8203b;
        mVar.d(cVar.f8230a, this.f8199C, cVar.f8241l, rectF, this.f8219r, path);
    }

    public void l0(ColorStateList colorStateList) {
        c cVar = this.f8203b;
        if (cVar.f8235f != colorStateList) {
            cVar.f8235f = colorStateList;
            onStateChange(getState());
        }
    }

    public void m0(float f10) {
        this.f8203b.f8242m = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f8203b = new c(this.f8203b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f8207f = true;
        this.f8208g = true;
        super.onBoundsChange(rect);
        if (this.f8203b.f8231b != null && !rect.isEmpty()) {
            p0(getState(), this.f8226y);
        }
        this.f8226y = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.f8203b.f8231b != null) {
            o0(iArr);
        }
        boolean z10 = n0(iArr) || r0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    protected int q(int i10) {
        float fN = N() + D();
        C7345a c7345a = this.f8203b.f8232c;
        return c7345a != null ? c7345a.c(i10, fN) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f8203b;
        if (cVar.f8243n != i10) {
            cVar.f8243n = i10;
            S();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8203b.f8233d = colorFilter;
        S();
    }

    @Override // H9.o
    public void setShapeAppearanceModel(l lVar) {
        c cVar = this.f8203b;
        cVar.f8230a = lVar;
        cVar.f8231b = null;
        this.f8199C = null;
        this.f8200D = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f8203b.f8237h = colorStateList;
        r0();
        S();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f8203b;
        if (cVar.f8238i != mode) {
            cVar.f8238i = mode;
            r0();
            S();
        }
    }

    protected void v(Canvas canvas, Paint paint, Path path, RectF rectF) {
        u(canvas, paint, path, this.f8203b.f8230a, this.f8199C, rectF);
    }

    protected void w(Canvas canvas) {
        u(canvas, this.f8217p, this.f8211j, this.f8227z, this.f8200D, y());
    }

    protected RectF x() {
        this.f8212k.set(getBounds());
        return this.f8212k;
    }

    public float z() {
        float fA;
        float fA2;
        float[] fArr = this.f8199C;
        if (fArr != null) {
            fA = (fArr[3] + fArr[2]) - fArr[1];
            fA2 = fArr[0];
        } else {
            RectF rectFX = x();
            fA = (this.f8220s.f(3, H()).a(rectFX) + this.f8220s.f(2, H()).a(rectFX)) - this.f8220s.f(1, H()).a(rectFX);
            fA2 = this.f8220s.f(0, H()).a(rectFX);
        }
        return (fA - fA2) / 2.0f;
    }

    public h(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(l.e(context, attributeSet, i10, i11).m());
    }

    public h(l lVar) {
        this(new c(lVar, null));
    }

    protected h(c cVar) {
        m mVar;
        this.f8202a = new a();
        this.f8204c = new n.g[4];
        this.f8205d = new n.g[4];
        this.f8206e = new BitSet(8);
        this.f8209h = new Matrix();
        this.f8210i = new Path();
        this.f8211j = new Path();
        this.f8212k = new RectF();
        this.f8213l = new RectF();
        this.f8214m = new Region();
        this.f8215n = new Region();
        Paint paint = new Paint(1);
        this.f8216o = paint;
        Paint paint2 = new Paint(1);
        this.f8217p = paint2;
        this.f8218q = new G9.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = m.j();
        } else {
            mVar = new m();
        }
        this.f8220s = mVar;
        this.f8224w = new RectF();
        this.f8225x = true;
        this.f8226y = true;
        this.f8198B = new C2981m[4];
        this.f8203b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r0();
        n0(getState());
        this.f8219r = new b();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        l f8230a;

        /* JADX INFO: renamed from: b */
        q f8231b;

        /* JADX INFO: renamed from: c */
        C7345a f8232c;

        /* JADX INFO: renamed from: d */
        ColorFilter f8233d;

        /* JADX INFO: renamed from: e */
        ColorStateList f8234e;

        /* JADX INFO: renamed from: f */
        ColorStateList f8235f;

        /* JADX INFO: renamed from: g */
        ColorStateList f8236g;

        /* JADX INFO: renamed from: h */
        ColorStateList f8237h;

        /* JADX INFO: renamed from: i */
        PorterDuff.Mode f8238i;

        /* JADX INFO: renamed from: j */
        Rect f8239j;

        /* JADX INFO: renamed from: k */
        float f8240k;

        /* JADX INFO: renamed from: l */
        float f8241l;

        /* JADX INFO: renamed from: m */
        float f8242m;

        /* JADX INFO: renamed from: n */
        int f8243n;

        /* JADX INFO: renamed from: o */
        float f8244o;

        /* JADX INFO: renamed from: p */
        float f8245p;

        /* JADX INFO: renamed from: q */
        float f8246q;

        /* JADX INFO: renamed from: r */
        int f8247r;

        /* JADX INFO: renamed from: s */
        int f8248s;

        /* JADX INFO: renamed from: t */
        int f8249t;

        /* JADX INFO: renamed from: u */
        int f8250u;

        /* JADX INFO: renamed from: v */
        boolean f8251v;

        /* JADX INFO: renamed from: w */
        Paint.Style f8252w;

        public c(l lVar, C7345a c7345a) {
            this.f8234e = null;
            this.f8235f = null;
            this.f8236g = null;
            this.f8237h = null;
            this.f8238i = PorterDuff.Mode.SRC_IN;
            this.f8239j = null;
            this.f8240k = 1.0f;
            this.f8241l = 1.0f;
            this.f8243n = 255;
            this.f8244o = 0.0f;
            this.f8245p = 0.0f;
            this.f8246q = 0.0f;
            this.f8247r = 0;
            this.f8248s = 0;
            this.f8249t = 0;
            this.f8250u = 0;
            this.f8251v = false;
            this.f8252w = Paint.Style.FILL_AND_STROKE;
            this.f8230a = lVar;
            this.f8232c = c7345a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h(this);
            hVar.f8207f = true;
            hVar.f8208g = true;
            return hVar;
        }

        public c(c cVar) {
            this.f8234e = null;
            this.f8235f = null;
            this.f8236g = null;
            this.f8237h = null;
            this.f8238i = PorterDuff.Mode.SRC_IN;
            this.f8239j = null;
            this.f8240k = 1.0f;
            this.f8241l = 1.0f;
            this.f8243n = 255;
            this.f8244o = 0.0f;
            this.f8245p = 0.0f;
            this.f8246q = 0.0f;
            this.f8247r = 0;
            this.f8248s = 0;
            this.f8249t = 0;
            this.f8250u = 0;
            this.f8251v = false;
            this.f8252w = Paint.Style.FILL_AND_STROKE;
            this.f8230a = cVar.f8230a;
            this.f8231b = cVar.f8231b;
            this.f8232c = cVar.f8232c;
            this.f8242m = cVar.f8242m;
            this.f8233d = cVar.f8233d;
            this.f8234e = cVar.f8234e;
            this.f8235f = cVar.f8235f;
            this.f8238i = cVar.f8238i;
            this.f8237h = cVar.f8237h;
            this.f8243n = cVar.f8243n;
            this.f8240k = cVar.f8240k;
            this.f8249t = cVar.f8249t;
            this.f8247r = cVar.f8247r;
            this.f8251v = cVar.f8251v;
            this.f8241l = cVar.f8241l;
            this.f8244o = cVar.f8244o;
            this.f8245p = cVar.f8245p;
            this.f8246q = cVar.f8246q;
            this.f8248s = cVar.f8248s;
            this.f8250u = cVar.f8250u;
            this.f8236g = cVar.f8236g;
            this.f8252w = cVar.f8252w;
            if (cVar.f8239j != null) {
                this.f8239j = new Rect(cVar.f8239j);
            }
        }
    }
}
