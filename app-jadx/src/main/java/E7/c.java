package E7;

import H7.j;
import H7.k;
import H7.m;
import H7.p;
import H7.q;
import H7.t;
import Td.r;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3295k;
import com.facebook.react.uimanager.Z;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import le.AbstractC5591b;
import le.InterfaceC5593d;
import oe.AbstractC5874j;
import pe.InterfaceC6023m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends Drawable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f5719z = {O.e(new z(c.class, "borderStyle", "getBorderStyle()Lcom/facebook/react/uimanager/style/BorderStyle;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z f5721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f5722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private H7.h f5723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5593d f5724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer[] f5725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m f5726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p f5727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f5729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f5730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f5731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Path f5733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Path f5734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Path f5735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f5736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Path f5737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PointF f5738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PointF f5739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PointF f5740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private PointF f5741v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private RectF f5742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private RectF f5743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private RectF f5744y;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5745a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f8073b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f8074c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.f8075d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5745a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5591b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f5746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, c cVar) {
            super(obj);
            this.f5746b = cVar;
        }

        @Override // le.AbstractC5591b
        protected void c(InterfaceC6023m property, Object obj, Object obj2) {
            AbstractC5504s.h(property, "property");
            if (AbstractC5504s.c(obj, obj2)) {
                return;
            }
            this.f5746b.f5732m = true;
            this.f5746b.invalidateSelf();
        }
    }

    public c(Context context, Z z10, j jVar, H7.h hVar, k kVar) {
        AbstractC5504s.h(context, "context");
        this.f5720a = context;
        this.f5721b = z10;
        this.f5722c = jVar;
        this.f5723d = hVar;
        this.f5724e = m(kVar);
        this.f5726g = new m(0, 0, 0, 0, 15, null);
        this.f5728i = 255;
        this.f5729j = 0.8f;
        this.f5731l = new Paint(1);
        this.f5732m = true;
    }

    private final RectF b() {
        RectF rectFA;
        H7.h hVar = this.f5723d;
        if (hVar == null || (rectFA = hVar.a(getLayoutDirection(), this.f5720a)) == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return new RectF(Float.isNaN(rectFA.left) ? 0.0f : B.f37368a.b(rectFA.left), Float.isNaN(rectFA.top) ? 0.0f : B.f37368a.b(rectFA.top), Float.isNaN(rectFA.right) ? 0.0f : B.f37368a.b(rectFA.right), Float.isNaN(rectFA.bottom) ? 0.0f : B.f37368a.b(rectFA.bottom));
    }

    private final void c(Canvas canvas, int i10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (i10 == 0) {
            return;
        }
        if (this.f5730k == null) {
            this.f5730k = new Path();
        }
        this.f5731l.setColor(n(i10, this.f5728i));
        Path path = this.f5730k;
        if (path != null) {
            path.reset();
        }
        Path path2 = this.f5730k;
        if (path2 != null) {
            path2.moveTo(f10, f11);
        }
        Path path3 = this.f5730k;
        if (path3 != null) {
            path3.lineTo(f12, f13);
        }
        Path path4 = this.f5730k;
        if (path4 != null) {
            path4.lineTo(f14, f15);
        }
        Path path5 = this.f5730k;
        if (path5 != null) {
            path5.lineTo(f16, f17);
        }
        Path path6 = this.f5730k;
        if (path6 != null) {
            path6.lineTo(f10, f11);
        }
        Path path7 = this.f5730k;
        if (path7 != null) {
            canvas.drawPath(path7, this.f5731l);
        }
    }

    private final void d(Canvas canvas) {
        RectF rectFB = b();
        int iD = AbstractC5466a.d(rectFB.left);
        int iD2 = AbstractC5466a.d(rectFB.top);
        int iD3 = AbstractC5466a.d(rectFB.right);
        int iD4 = AbstractC5466a.d(rectFB.bottom);
        if (iD > 0 || iD3 > 0 || iD2 > 0 || iD4 > 0) {
            Rect bounds = getBounds();
            AbstractC5504s.g(bounds, "getBounds(...)");
            int i10 = bounds.left;
            int i11 = bounds.top;
            int iF = f(iD, iD2, iD3, iD4, this.f5726g.b(), this.f5726g.d(), this.f5726g.c(), this.f5726g.a());
            if (iF == 0) {
                this.f5731l.setAntiAlias(false);
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                if (iD > 0) {
                    float f10 = i10;
                    float f11 = i10 + iD;
                    int iB = this.f5726g.b();
                    c(canvas, iB, f10, i11, f11, i11 + iD2, f11, r1 - iD4, f10, i11 + iHeight);
                }
                if (iD2 > 0) {
                    float f12 = i11;
                    float f13 = i11 + iD2;
                    int iD5 = this.f5726g.d();
                    c(canvas, iD5, i10, f12, i10 + iD, f13, r1 - iD3, f13, i10 + iWidth, f12);
                }
                if (iD3 > 0) {
                    int i12 = i10 + iWidth;
                    float f14 = i12;
                    int i13 = i11 + iHeight;
                    float f15 = i12 - iD3;
                    c(canvas, this.f5726g.c(), f14, i11, f14, i13, f15, i13 - iD4, f15, i11 + iD2);
                }
                if (iD4 > 0) {
                    int i14 = i11 + iHeight;
                    float f16 = i14;
                    float f17 = i14 - iD4;
                    c(canvas, this.f5726g.a(), i10, f16, i10 + iWidth, f16, r1 - iD3, f17, i10 + iD, f17);
                }
                this.f5731l.setAntiAlias(true);
                return;
            }
            if (Color.alpha(iF) != 0) {
                int i15 = bounds.right;
                int i16 = bounds.bottom;
                this.f5731l.setColor(n(iF, this.f5728i));
                this.f5731l.setStyle(Paint.Style.STROKE);
                Path path = new Path();
                this.f5733n = path;
                if (iD > 0) {
                    path.reset();
                    int iD6 = AbstractC5466a.d(rectFB.left);
                    v(iD6);
                    this.f5731l.setStrokeWidth(iD6);
                    Path path2 = this.f5733n;
                    if (path2 != null) {
                        path2.moveTo((iD6 / 2) + i10, i11);
                    }
                    Path path3 = this.f5733n;
                    if (path3 != null) {
                        path3.lineTo((iD6 / 2) + i10, i16);
                    }
                    Path path4 = this.f5733n;
                    if (path4 != null) {
                        canvas.drawPath(path4, this.f5731l);
                    }
                }
                if (iD2 > 0) {
                    Path path5 = this.f5733n;
                    if (path5 != null) {
                        path5.reset();
                    }
                    int iD7 = AbstractC5466a.d(rectFB.top);
                    v(iD7);
                    this.f5731l.setStrokeWidth(iD7);
                    Path path6 = this.f5733n;
                    if (path6 != null) {
                        path6.moveTo(i10, (iD7 / 2) + i11);
                    }
                    Path path7 = this.f5733n;
                    if (path7 != null) {
                        path7.lineTo(i15, (iD7 / 2) + i11);
                    }
                    Path path8 = this.f5733n;
                    if (path8 != null) {
                        canvas.drawPath(path8, this.f5731l);
                    }
                }
                if (iD3 > 0) {
                    Path path9 = this.f5733n;
                    if (path9 != null) {
                        path9.reset();
                    }
                    int iD8 = AbstractC5466a.d(rectFB.right);
                    v(iD8);
                    this.f5731l.setStrokeWidth(iD8);
                    Path path10 = this.f5733n;
                    if (path10 != null) {
                        path10.moveTo(i15 - (iD8 / 2), i11);
                    }
                    Path path11 = this.f5733n;
                    if (path11 != null) {
                        path11.lineTo(i15 - (iD8 / 2), i16);
                    }
                    Path path12 = this.f5733n;
                    if (path12 != null) {
                        canvas.drawPath(path12, this.f5731l);
                    }
                }
                if (iD4 > 0) {
                    Path path13 = this.f5733n;
                    if (path13 != null) {
                        path13.reset();
                    }
                    int iD9 = AbstractC5466a.d(rectFB.bottom);
                    v(iD9);
                    this.f5731l.setStrokeWidth(iD9);
                    Path path14 = this.f5733n;
                    if (path14 != null) {
                        path14.moveTo(i10, i16 - (iD9 / 2));
                    }
                    Path path15 = this.f5733n;
                    if (path15 != null) {
                        path15.lineTo(i15, i16 - (iD9 / 2));
                    }
                    Path path16 = this.f5733n;
                    if (path16 != null) {
                        canvas.drawPath(path16, this.f5731l);
                    }
                }
            }
        }
    }

    private final void e(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        q qVarC;
        q qVarC2;
        q qVarC3;
        q qVarC4;
        t();
        canvas.save();
        Path path = this.f5736q;
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        canvas.clipPath(path);
        RectF rectFB = b();
        float fB = 0.0f;
        if (rectFB.top > 0.0f || rectFB.bottom > 0.0f || rectFB.left > 0.0f || rectFB.right > 0.0f) {
            float fJ = j();
            int iG = g(t.f8115b);
            if (rectFB.top != fJ || rectFB.bottom != fJ || rectFB.left != fJ || rectFB.right != fJ || this.f5726g.b() != iG || this.f5726g.d() != iG || this.f5726g.c() != iG || this.f5726g.a() != iG) {
                this.f5731l.setStyle(Paint.Style.FILL);
                if (Build.VERSION.SDK_INT >= 26) {
                    Path path2 = this.f5737r;
                    if (path2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.clipOutPath(path2);
                } else {
                    Path path3 = this.f5737r;
                    if (path3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.clipPath(path3, Region.Op.DIFFERENCE);
                }
                RectF rectF = this.f5743x;
                if (rectF == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                float f14 = rectF.left;
                float f15 = rectF.right;
                float f16 = rectF.top;
                float f17 = rectF.bottom;
                PointF pointF5 = this.f5740u;
                if (pointF5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF6 = this.f5741v;
                if (pointF6 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF7 = this.f5738s;
                if (pointF7 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF8 = this.f5739t;
                if (pointF8 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (rectFB.left > 0.0f) {
                    float f18 = this.f5729j;
                    f10 = 0.0f;
                    float f19 = f18 + f17;
                    f13 = f17;
                    pointF4 = pointF8;
                    f11 = f15;
                    pointF2 = pointF6;
                    f12 = f16;
                    pointF3 = pointF7;
                    pointF = pointF5;
                    c(canvas, this.f5726g.b(), f14, f16 - f18, pointF5.x, pointF5.y - f18, pointF7.x, pointF7.y + f18, f14, f19);
                } else {
                    f10 = 0.0f;
                    f11 = f15;
                    f12 = f16;
                    f13 = f17;
                    pointF = pointF5;
                    pointF2 = pointF6;
                    pointF3 = pointF7;
                    pointF4 = pointF8;
                }
                if (rectFB.top > f10) {
                    float f20 = this.f5729j;
                    c(canvas, this.f5726g.d(), f14 - f20, f12, pointF.x - f20, pointF.y, pointF2.x + f20, pointF2.y, f11 + f20, f12);
                }
                if (rectFB.right > f10) {
                    float f21 = this.f5729j;
                    c(canvas, this.f5726g.c(), f11, f12 - f21, pointF2.x, pointF2.y - f21, pointF4.x, pointF4.y + f21, f11, f13 + f21);
                }
                if (rectFB.bottom > f10) {
                    float f22 = this.f5729j;
                    c(canvas, this.f5726g.a(), f14 - f22, f13, pointF3.x - f22, pointF3.y, pointF4.x + f22, pointF4.y, f11 + f22, f13);
                }
            } else if (fJ > 0.0f) {
                this.f5731l.setColor(n(iG, this.f5728i));
                this.f5731l.setStyle(Paint.Style.STROKE);
                this.f5731l.setStrokeWidth(fJ);
                p pVar = this.f5727h;
                if (pVar == null || !pVar.f()) {
                    Path path4 = this.f5735p;
                    if (path4 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path4, this.f5731l);
                } else {
                    RectF rectF2 = this.f5744y;
                    if (rectF2 != null) {
                        p pVar2 = this.f5727h;
                        float fA = ((pVar2 == null || (qVarC3 = pVar2.c()) == null || (qVarC4 = qVarC3.c()) == null) ? 0.0f : qVarC4.a()) - (rectFB.left * 0.5f);
                        p pVar3 = this.f5727h;
                        if (pVar3 != null && (qVarC = pVar3.c()) != null && (qVarC2 = qVarC.c()) != null) {
                            fB = qVarC2.b();
                        }
                        canvas.drawRoundRect(rectF2, fA, fB - (rectFB.top * 0.5f), this.f5731l);
                    }
                }
            }
        }
        canvas.restore();
    }

    private final int f(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (Color.alpha(i14) >= 255 && Color.alpha(i15) >= 255 && Color.alpha(i16) >= 255 && Color.alpha(i17) >= 255) {
            int i18 = (i13 > 0 ? i17 : -1) & (i10 > 0 ? i14 : -1) & (i11 > 0 ? i15 : -1) & (i12 > 0 ? i16 : -1);
            if (i10 <= 0) {
                i14 = 0;
            }
            if (i11 <= 0) {
                i15 = 0;
            }
            int i19 = i14 | i15;
            if (i12 <= 0) {
                i16 = 0;
            }
            int i20 = i19 | i16;
            if (i13 <= 0) {
                i17 = 0;
            }
            if (i18 == (i20 | i17)) {
                return i18;
            }
        }
        return 0;
    }

    private final void i(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, PointF pointF) {
        double d18 = 2;
        double d19 = (d10 + d12) / d18;
        double d20 = (d11 + d13) / d18;
        double d21 = d14 - d19;
        double d22 = d15 - d20;
        double dAbs = Math.abs(d12 - d10) / d18;
        double dAbs2 = Math.abs(d13 - d11) / d18;
        double d23 = ((d17 - d20) - d22) / ((d16 - d19) - d21);
        double d24 = d22 - (d21 * d23);
        double d25 = dAbs2 * dAbs2;
        double d26 = dAbs * dAbs;
        double d27 = d25 + (d26 * d23 * d23);
        double d28 = d18 * dAbs * dAbs * d24 * d23;
        double d29 = d18 * d27;
        double dSqrt = ((-d28) / d29) - Math.sqrt(((-(d26 * ((d24 * d24) - d25))) / d27) + Math.pow(d28 / d29, 2.0d));
        double d30 = (d23 * dSqrt) + d24;
        double d31 = dSqrt + d19;
        double d32 = d30 + d20;
        if (Double.isNaN(d31) || Double.isNaN(d32)) {
            return;
        }
        pointF.x = (float) d31;
        pointF.y = (float) d32;
    }

    private final float j() {
        Z z10 = this.f5721b;
        float fB = z10 != null ? z10.b(8) : Float.NaN;
        if (Float.isNaN(fB)) {
            return 0.0f;
        }
        return fB;
    }

    private final float k(float f10, float f11) {
        return AbstractC5874j.d(f10 - f11, 0.0f);
    }

    private final PathEffect l(k kVar, float f10) {
        int i10 = a.f5745a[kVar.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            float f11 = f10 * 3;
            return new DashPathEffect(new float[]{f11, f11, f11, f11}, 0.0f);
        }
        if (i10 == 3) {
            return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
        }
        throw new r();
    }

    private final InterfaceC5593d m(Object obj) {
        return new b(obj, this);
    }

    private final int n(int i10, int i11) {
        if (i11 == 255) {
            return i10;
        }
        if (i11 == 0) {
            return i10 & 16777215;
        }
        return (i10 & 16777215) | ((((i10 >>> 24) * ((i11 + (i11 >> 7)) >> 7)) >> 8) << 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void t() {
        /*
            Method dump skipped, instruction units count: 1229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E7.c.t():void");
    }

    private final void u() {
        k kVarH = h();
        if (kVarH != null) {
            this.f5731l.setPathEffect(h() != null ? l(kVarH, j()) : null);
        }
    }

    private final void v(int i10) {
        k kVarH = h();
        if (kVarH != null) {
            this.f5731l.setPathEffect(h() != null ? l(kVarH, i10) : null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m mVarC;
        AbstractC5504s.h(canvas, "canvas");
        u();
        Integer[] numArr = this.f5725f;
        if (numArr == null || (mVarC = H7.g.c(numArr, getLayoutDirection(), this.f5720a)) == null) {
            mVarC = this.f5726g;
        }
        this.f5726g = mVarC;
        j jVar = this.f5722c;
        if (jVar == null || !jVar.b()) {
            d(canvas);
        } else {
            e(canvas);
        }
    }

    public final int g(t position) {
        Integer num;
        AbstractC5504s.h(position, "position");
        Integer[] numArr = this.f5725f;
        if (numArr == null || (num = numArr[position.ordinal()]) == null) {
            return -16777216;
        }
        return num.intValue();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (Xd.a.h(Color.alpha(n(this.f5726g.b(), this.f5728i)), Color.alpha(n(this.f5726g.d(), this.f5728i)), Color.alpha(n(this.f5726g.c(), this.f5728i)), Color.alpha(n(this.f5726g.a(), this.f5728i))) == 0) {
            return -2;
        }
        return Xd.a.i(Color.alpha(n(this.f5726g.b(), this.f5728i)), Color.alpha(n(this.f5726g.d(), this.f5728i)), Color.alpha(n(this.f5726g.c(), this.f5728i)), Color.alpha(n(this.f5726g.a(), this.f5728i))) == 255 ? -1 : -3;
    }

    public final k h() {
        return (k) this.f5724e.a(this, f5719z[0]);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f5732m = true;
        super.invalidateSelf();
    }

    public final void o(t position, Integer num) {
        AbstractC5504s.h(position, "position");
        Integer[] numArrB = this.f5725f;
        if (numArrB == null) {
            numArrB = H7.g.b(null, 1, null);
        }
        this.f5725f = numArrB;
        if (numArrB != null) {
            numArrB[position.ordinal()] = num;
        }
        this.f5732m = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        AbstractC5504s.h(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f5732m = true;
    }

    public final void p(H7.h hVar) {
        this.f5723d = hVar;
    }

    public final void q(j jVar) {
        this.f5722c = jVar;
    }

    public final void r(k kVar) {
        this.f5724e.b(this, f5719z[0], kVar);
    }

    public final void s(int i10, float f10) {
        Z z10 = this.f5721b;
        if (C3295k.b(z10 != null ? Float.valueOf(z10.b(i10)) : null, Float.valueOf(f10))) {
            return;
        }
        Z z11 = this.f5721b;
        if (z11 != null) {
            z11.c(i10, f10);
        }
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) {
            this.f5732m = true;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f5728i = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
