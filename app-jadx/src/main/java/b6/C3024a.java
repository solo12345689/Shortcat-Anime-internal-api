package b6;

import a6.C2582c;
import a6.InterfaceC2580a;
import a6.InterfaceC2583d;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import d6.InterfaceC4568a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w6.d;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: b6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3024a implements InterfaceC2580a, C2582c.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0558a f33203r = new C0558a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Class f33204s = C3024a.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f33205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3025b f33206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2583d f33207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f33208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f33209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4568a f33210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d6.b f33211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f33212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Bitmap.Config f33213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f33214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f33215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f33218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Matrix f33219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private InterfaceC2580a.InterfaceC0415a f33221q;

    /* JADX INFO: renamed from: b6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0558a {
        public /* synthetic */ C0558a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0558a() {
        }
    }

    public C3024a(d platformBitmapFactory, InterfaceC3025b bitmapFrameCache, InterfaceC2583d animationInformation, c bitmapFrameRenderer, boolean z10, InterfaceC4568a interfaceC4568a, d6.b bVar, n6.d dVar) {
        AbstractC5504s.h(platformBitmapFactory, "platformBitmapFactory");
        AbstractC5504s.h(bitmapFrameCache, "bitmapFrameCache");
        AbstractC5504s.h(animationInformation, "animationInformation");
        AbstractC5504s.h(bitmapFrameRenderer, "bitmapFrameRenderer");
        this.f33205a = platformBitmapFactory;
        this.f33206b = bitmapFrameCache;
        this.f33207c = animationInformation;
        this.f33208d = bitmapFrameRenderer;
        this.f33209e = z10;
        this.f33210f = interfaceC4568a;
        this.f33211g = bVar;
        this.f33212h = null;
        this.f33213i = Bitmap.Config.ARGB_8888;
        this.f33214j = new Paint(6);
        this.f33218n = new Path();
        this.f33219o = new Matrix();
        this.f33220p = -1;
        s();
    }

    private final void o(int i10, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.f33215k;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f33214j);
        } else if (t(i10, bitmap, rect.width(), rect.height())) {
            canvas.drawPath(this.f33218n, this.f33214j);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f33214j);
        }
    }

    private final boolean p(int i10, C5.a aVar, Canvas canvas, int i11) {
        if (aVar == null || !C5.a.H(aVar)) {
            return false;
        }
        Object objC = aVar.C();
        AbstractC5504s.g(objC, "get(...)");
        o(i10, (Bitmap) objC, canvas);
        if (i11 == 3 || this.f33209e) {
            return true;
        }
        this.f33206b.L(i10, aVar, i11);
        return true;
    }

    private final boolean q(Canvas canvas, int i10, int i11) throws Throwable {
        C5.a aVarM;
        boolean zP;
        C5.a aVar = null;
        try {
            boolean z10 = false;
            int i12 = 1;
            if (this.f33209e) {
                InterfaceC4568a interfaceC4568a = this.f33210f;
                C5.a aVarC = interfaceC4568a != null ? interfaceC4568a.c(i10, canvas.getWidth(), canvas.getHeight()) : null;
                if (aVarC != null) {
                    try {
                        if (aVarC.E()) {
                            Object objC = aVarC.C();
                            AbstractC5504s.g(objC, "get(...)");
                            o(i10, (Bitmap) objC, canvas);
                            C5.a.m(aVarC);
                            return true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = aVarC;
                        C5.a.m(aVar);
                        throw th;
                    }
                }
                InterfaceC4568a interfaceC4568a2 = this.f33210f;
                if (interfaceC4568a2 != null) {
                    interfaceC4568a2.b(canvas.getWidth(), canvas.getHeight(), null);
                }
                C5.a.m(aVarC);
                return false;
            }
            if (i11 == 0) {
                aVarM = this.f33206b.M(i10);
                zP = p(i10, aVarM, canvas, 0);
            } else if (i11 == 1) {
                aVarM = this.f33206b.K(i10, this.f33216l, this.f33217m);
                if (r(i10, aVarM) && p(i10, aVarM, canvas, 1)) {
                    z10 = true;
                }
                zP = z10;
                i12 = 2;
            } else if (i11 == 2) {
                try {
                    aVarM = this.f33205a.b(this.f33216l, this.f33217m, this.f33213i);
                    if (r(i10, aVarM) && p(i10, aVarM, canvas, 2)) {
                        z10 = true;
                    }
                    zP = z10;
                    i12 = 3;
                } catch (RuntimeException e10) {
                    AbstractC7283a.F(f33204s, "Failed to create frame bitmap", e10);
                    C5.a.m(null);
                    return false;
                }
            } else {
                if (i11 != 3) {
                    C5.a.m(null);
                    return false;
                }
                aVarM = this.f33206b.J(i10);
                zP = p(i10, aVarM, canvas, 3);
                i12 = -1;
            }
            C5.a.m(aVarM);
            return (zP || i12 == -1) ? zP : q(canvas, i10, i12);
        } catch (Throwable th3) {
            th = th3;
            C5.a.m(aVar);
            throw th;
        }
    }

    private final boolean r(int i10, C5.a aVar) {
        if (aVar == null || !aVar.E()) {
            return false;
        }
        c cVar = this.f33208d;
        Object objC = aVar.C();
        AbstractC5504s.g(objC, "get(...)");
        boolean zA = cVar.a(i10, (Bitmap) objC);
        if (!zA) {
            C5.a.m(aVar);
        }
        return zA;
    }

    private final void s() {
        int iE = this.f33208d.e();
        this.f33216l = iE;
        if (iE == -1) {
            Rect rect = this.f33215k;
            this.f33216l = rect != null ? rect.width() : -1;
        }
        int iC = this.f33208d.c();
        this.f33217m = iC;
        if (iC == -1) {
            Rect rect2 = this.f33215k;
            this.f33217m = rect2 != null ? rect2.height() : -1;
        }
    }

    private final boolean t(int i10, Bitmap bitmap, float f10, float f11) {
        if (this.f33212h == null) {
            return false;
        }
        if (i10 == this.f33220p) {
            return true;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f33219o.setRectToRect(new RectF(0.0f, 0.0f, this.f33216l, this.f33217m), new RectF(0.0f, 0.0f, f10, f11), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.f33219o);
        this.f33214j.setShader(bitmapShader);
        this.f33218n.addRoundRect(new RectF(0.0f, 0.0f, f10, f11), this.f33212h, Path.Direction.CW);
        this.f33220p = i10;
        return true;
    }

    @Override // a6.InterfaceC2583d
    public int a() {
        return this.f33207c.a();
    }

    @Override // a6.InterfaceC2583d
    public int b() {
        return this.f33207c.b();
    }

    @Override // a6.InterfaceC2580a
    public int c() {
        return this.f33217m;
    }

    @Override // a6.InterfaceC2580a
    public void clear() {
        if (!this.f33209e) {
            this.f33206b.clear();
            return;
        }
        InterfaceC4568a interfaceC4568a = this.f33210f;
        if (interfaceC4568a != null) {
            interfaceC4568a.d();
        }
    }

    @Override // a6.InterfaceC2580a
    public void d(Rect rect) {
        this.f33215k = rect;
        this.f33208d.d(rect);
        s();
    }

    @Override // a6.InterfaceC2580a
    public int e() {
        return this.f33216l;
    }

    @Override // a6.InterfaceC2580a
    public void f(ColorFilter colorFilter) {
        this.f33214j.setColorFilter(colorFilter);
    }

    @Override // a6.InterfaceC2583d
    public int g() {
        return this.f33207c.g();
    }

    @Override // a6.InterfaceC2580a
    public boolean h(Drawable parent, Canvas canvas, int i10) throws Throwable {
        d6.b bVar;
        InterfaceC4568a interfaceC4568a;
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(canvas, "canvas");
        boolean zQ = q(canvas, i10, 0);
        if (!this.f33209e && (bVar = this.f33211g) != null && (interfaceC4568a = this.f33210f) != null) {
            InterfaceC4568a.C0708a.f(interfaceC4568a, bVar, this.f33206b, this, i10, null, 16, null);
        }
        return zQ;
    }

    @Override // a6.C2582c.b
    public void i() {
        if (!this.f33209e) {
            clear();
            return;
        }
        InterfaceC4568a interfaceC4568a = this.f33210f;
        if (interfaceC4568a != null) {
            interfaceC4568a.a();
        }
    }

    @Override // a6.InterfaceC2583d
    public int j() {
        return this.f33207c.j();
    }

    @Override // a6.InterfaceC2583d
    public int k(int i10) {
        return this.f33207c.k(i10);
    }

    @Override // a6.InterfaceC2580a
    public void l(int i10) {
        this.f33214j.setAlpha(i10);
    }

    @Override // a6.InterfaceC2583d
    public int m() {
        return this.f33207c.m();
    }

    @Override // a6.InterfaceC2580a
    public void n(InterfaceC2580a.InterfaceC0415a interfaceC0415a) {
        this.f33221q = interfaceC0415a;
    }
}
