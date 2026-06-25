package v0;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import i1.AbstractC5026s;
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;
import s0.AbstractC6387s0;
import s0.C6335D;
import s0.C6367k0;
import s0.C6385r0;
import s0.InterfaceC6364j0;
import s0.u1;
import u0.C6706a;
import u0.InterfaceC6709d;
import v0.AbstractC6810b;

/* JADX INFO: renamed from: v0.E */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6789E implements InterfaceC6812d {

    /* JADX INFO: renamed from: L */
    public static final b f61721L = new b(null);

    /* JADX INFO: renamed from: M */
    private static final boolean f61722M = !C6801Q.f61768a.a();

    /* JADX INFO: renamed from: N */
    private static final Canvas f61723N = new a();

    /* JADX INFO: renamed from: A */
    private float f61724A;

    /* JADX INFO: renamed from: B */
    private float f61725B;

    /* JADX INFO: renamed from: C */
    private float f61726C;

    /* JADX INFO: renamed from: D */
    private float f61727D;

    /* JADX INFO: renamed from: E */
    private long f61728E;

    /* JADX INFO: renamed from: F */
    private long f61729F;

    /* JADX INFO: renamed from: G */
    private float f61730G;

    /* JADX INFO: renamed from: H */
    private float f61731H;

    /* JADX INFO: renamed from: I */
    private float f61732I;

    /* JADX INFO: renamed from: J */
    private u1 f61733J;

    /* JADX INFO: renamed from: K */
    private final boolean f61734K;

    /* JADX INFO: renamed from: b */
    private final androidx.compose.ui.graphics.layer.view.a f61735b;

    /* JADX INFO: renamed from: c */
    private final long f61736c;

    /* JADX INFO: renamed from: d */
    private final C6367k0 f61737d;

    /* JADX INFO: renamed from: e */
    private final C6802S f61738e;

    /* JADX INFO: renamed from: f */
    private final Resources f61739f;

    /* JADX INFO: renamed from: g */
    private final Rect f61740g;

    /* JADX INFO: renamed from: h */
    private Paint f61741h;

    /* JADX INFO: renamed from: i */
    private final Picture f61742i;

    /* JADX INFO: renamed from: j */
    private final C6706a f61743j;

    /* JADX INFO: renamed from: k */
    private final C6367k0 f61744k;

    /* JADX INFO: renamed from: l */
    private int f61745l;

    /* JADX INFO: renamed from: m */
    private int f61746m;

    /* JADX INFO: renamed from: n */
    private long f61747n;

    /* JADX INFO: renamed from: o */
    private boolean f61748o;

    /* JADX INFO: renamed from: p */
    private boolean f61749p;

    /* JADX INFO: renamed from: q */
    private boolean f61750q;

    /* JADX INFO: renamed from: r */
    private boolean f61751r;

    /* JADX INFO: renamed from: s */
    private final long f61752s;

    /* JADX INFO: renamed from: t */
    private int f61753t;

    /* JADX INFO: renamed from: u */
    private androidx.compose.ui.graphics.d f61754u;

    /* JADX INFO: renamed from: v */
    private int f61755v;

    /* JADX INFO: renamed from: w */
    private float f61756w;

    /* JADX INFO: renamed from: x */
    private boolean f61757x;

    /* JADX INFO: renamed from: y */
    private long f61758y;

    /* JADX INFO: renamed from: z */
    private float f61759z;

    /* JADX INFO: renamed from: v0.E$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Canvas {
        a() {
        }

        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    /* JADX INFO: renamed from: v0.E$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C6789E(androidx.compose.ui.graphics.layer.view.a aVar, long j10, C6367k0 c6367k0, C6706a c6706a) {
        this.f61735b = aVar;
        this.f61736c = j10;
        this.f61737d = c6367k0;
        C6802S c6802s = new C6802S(aVar, c6367k0, c6706a);
        this.f61738e = c6802s;
        this.f61739f = aVar.getResources();
        this.f61740g = new Rect();
        boolean z10 = f61722M;
        this.f61742i = z10 ? new Picture() : null;
        this.f61743j = z10 ? new C6706a() : null;
        this.f61744k = z10 ? new C6367k0() : null;
        aVar.addView(c6802s);
        c6802s.setClipBounds(null);
        this.f61747n = C5025r.f48570b.a();
        this.f61749p = true;
        this.f61752s = View.generateViewId();
        this.f61753t = androidx.compose.ui.graphics.c.f26737b.B();
        this.f61755v = AbstractC6810b.f61788a.a();
        this.f61756w = 1.0f;
        this.f61758y = C6224f.f58329b.c();
        this.f61759z = 1.0f;
        this.f61724A = 1.0f;
        C6385r0.a aVar2 = C6385r0.f58985b;
        this.f61728E = aVar2.a();
        this.f61729F = aVar2.a();
        this.f61734K = z10;
    }

    private final void R(int i10) {
        C6802S c6802s = this.f61738e;
        AbstractC6810b.a aVar = AbstractC6810b.f61788a;
        boolean z10 = true;
        if (AbstractC6810b.e(i10, aVar.c())) {
            this.f61738e.setLayerType(2, this.f61741h);
        } else if (AbstractC6810b.e(i10, aVar.b())) {
            this.f61738e.setLayerType(0, this.f61741h);
            z10 = false;
        } else {
            this.f61738e.setLayerType(0, this.f61741h);
        }
        c6802s.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    private final Paint T() {
        Paint paint = this.f61741h;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.f61741h = paint2;
        return paint2;
    }

    private final void U() {
        try {
            C6367k0 c6367k0 = this.f61737d;
            Canvas canvas = f61723N;
            Canvas canvasA = c6367k0.a().a();
            c6367k0.a().y(canvas);
            C6335D c6335dA = c6367k0.a();
            androidx.compose.ui.graphics.layer.view.a aVar = this.f61735b;
            C6802S c6802s = this.f61738e;
            aVar.a(c6335dA, c6802s, c6802s.getDrawingTime());
            c6367k0.a().y(canvasA);
        } catch (ClassCastException unused) {
        }
    }

    private final boolean V() {
        return AbstractC6810b.e(q(), AbstractC6810b.f61788a.c()) || W();
    }

    private final boolean W() {
        return (androidx.compose.ui.graphics.c.G(j(), androidx.compose.ui.graphics.c.f26737b.B()) && f() == null) ? false : true;
    }

    private final void X() {
        Rect rect;
        if (this.f61748o) {
            C6802S c6802s = this.f61738e;
            if (!S() || this.f61750q) {
                rect = null;
            } else {
                rect = this.f61740g;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.f61738e.getWidth();
                rect.bottom = this.f61738e.getHeight();
            }
            c6802s.setClipBounds(rect);
        }
    }

    private final void Y() {
        if (V()) {
            R(AbstractC6810b.f61788a.c());
        } else {
            R(q());
        }
    }

    @Override // v0.InterfaceC6812d
    public long A() {
        return this.f61728E;
    }

    @Override // v0.InterfaceC6812d
    public void B(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, C6811c c6811c, Function1 function1) {
        C6367k0 c6367k0;
        Canvas canvas;
        if (this.f61738e.getParent() == null) {
            this.f61735b.addView(this.f61738e);
        }
        this.f61738e.b(interfaceC5011d, enumC5027t, c6811c, function1);
        if (this.f61738e.isAttachedToWindow()) {
            this.f61738e.setVisibility(4);
            this.f61738e.setVisibility(0);
            U();
            Picture picture = this.f61742i;
            if (picture != null) {
                long j10 = this.f61747n;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j10 >> 32), (int) (j10 & 4294967295L));
                try {
                    C6367k0 c6367k02 = this.f61744k;
                    if (c6367k02 != null) {
                        Canvas canvasA = c6367k02.a().a();
                        c6367k02.a().y(canvasBeginRecording);
                        C6335D c6335dA = c6367k02.a();
                        C6706a c6706a = this.f61743j;
                        if (c6706a != null) {
                            long jD = AbstractC5026s.d(this.f61747n);
                            InterfaceC5011d density = c6706a.n1().getDensity();
                            EnumC5027t layoutDirection = c6706a.n1().getLayoutDirection();
                            InterfaceC6364j0 interfaceC6364j0B = c6706a.n1().b();
                            c6367k0 = c6367k02;
                            canvas = canvasA;
                            long jF = c6706a.n1().f();
                            C6811c c6811cG = c6706a.n1().g();
                            InterfaceC6709d interfaceC6709dN1 = c6706a.n1();
                            interfaceC6709dN1.c(interfaceC5011d);
                            interfaceC6709dN1.d(enumC5027t);
                            interfaceC6709dN1.h(c6335dA);
                            interfaceC6709dN1.e(jD);
                            interfaceC6709dN1.i(c6811c);
                            c6335dA.p();
                            try {
                                function1.invoke(c6706a);
                                c6335dA.k();
                                InterfaceC6709d interfaceC6709dN12 = c6706a.n1();
                                interfaceC6709dN12.c(density);
                                interfaceC6709dN12.d(layoutDirection);
                                interfaceC6709dN12.h(interfaceC6364j0B);
                                interfaceC6709dN12.e(jF);
                                interfaceC6709dN12.i(c6811cG);
                            } catch (Throwable th2) {
                                c6335dA.k();
                                InterfaceC6709d interfaceC6709dN13 = c6706a.n1();
                                interfaceC6709dN13.c(density);
                                interfaceC6709dN13.d(layoutDirection);
                                interfaceC6709dN13.h(interfaceC6364j0B);
                                interfaceC6709dN13.e(jF);
                                interfaceC6709dN13.i(c6811cG);
                                throw th2;
                            }
                        } else {
                            c6367k0 = c6367k02;
                            canvas = canvasA;
                        }
                        c6367k0.a().y(canvas);
                        Td.L l10 = Td.L.f17438a;
                    }
                    picture.endRecording();
                } catch (Throwable th3) {
                    picture.endRecording();
                    throw th3;
                }
            }
        }
    }

    @Override // v0.InterfaceC6812d
    public float C() {
        return this.f61726C;
    }

    @Override // v0.InterfaceC6812d
    public float D() {
        return this.f61725B;
    }

    @Override // v0.InterfaceC6812d
    public float E() {
        return this.f61730G;
    }

    @Override // v0.InterfaceC6812d
    public void F(float f10) {
        this.f61725B = f10;
        this.f61738e.setTranslationX(f10);
    }

    @Override // v0.InterfaceC6812d
    public void G(u1 u1Var) {
        this.f61733J = u1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            C6808Y.f61782a.a(this.f61738e, u1Var);
        }
    }

    @Override // v0.InterfaceC6812d
    public float H() {
        return this.f61724A;
    }

    @Override // v0.InterfaceC6812d
    public long I() {
        return this.f61729F;
    }

    @Override // v0.InterfaceC6812d
    public Matrix J() {
        return this.f61738e.getMatrix();
    }

    @Override // v0.InterfaceC6812d
    public void K(InterfaceC6364j0 interfaceC6364j0) {
        X();
        Canvas canvasD = s0.E.d(interfaceC6364j0);
        if (canvasD.isHardwareAccelerated()) {
            androidx.compose.ui.graphics.layer.view.a aVar = this.f61735b;
            C6802S c6802s = this.f61738e;
            aVar.a(interfaceC6364j0, c6802s, c6802s.getDrawingTime());
        } else {
            Picture picture = this.f61742i;
            if (picture != null) {
                canvasD.drawPicture(picture);
            }
        }
    }

    @Override // v0.InterfaceC6812d
    public boolean L() {
        return this.f61734K;
    }

    @Override // v0.InterfaceC6812d
    public void M(boolean z10) {
        this.f61749p = z10;
    }

    @Override // v0.InterfaceC6812d
    public void N(Outline outline, long j10) {
        boolean zC = this.f61738e.c(outline);
        if (S() && outline != null) {
            this.f61738e.setClipToOutline(true);
            if (this.f61751r) {
                this.f61751r = false;
                this.f61748o = true;
            }
        }
        this.f61750q = outline != null;
        if (zC) {
            return;
        }
        this.f61738e.invalidate();
        U();
    }

    @Override // v0.InterfaceC6812d
    public void O(long j10) {
        this.f61758y = j10;
        if ((9223372034707292159L & j10) != 9205357640488583168L) {
            this.f61757x = false;
            this.f61738e.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.f61738e.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                C6806W.f61781a.a(this.f61738e);
                return;
            }
            this.f61757x = true;
            this.f61738e.setPivotX(((int) (this.f61747n >> 32)) / 2.0f);
            this.f61738e.setPivotY(((int) (4294967295L & this.f61747n)) / 2.0f);
        }
    }

    @Override // v0.InterfaceC6812d
    public void P(int i10) {
        this.f61755v = i10;
        Y();
    }

    @Override // v0.InterfaceC6812d
    public float Q() {
        return this.f61727D;
    }

    public boolean S() {
        return this.f61751r || this.f61738e.getClipToOutline();
    }

    @Override // v0.InterfaceC6812d
    public float a() {
        return this.f61756w;
    }

    @Override // v0.InterfaceC6812d
    public u1 b() {
        return this.f61733J;
    }

    @Override // v0.InterfaceC6812d
    public void c(int i10) {
        this.f61753t = i10;
        T().setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.b(i10)));
        Y();
    }

    @Override // v0.InterfaceC6812d
    public void d(androidx.compose.ui.graphics.d dVar) {
        this.f61754u = dVar;
        T().setColorFilter(dVar != null ? s0.F.b(dVar) : null);
        Y();
    }

    @Override // v0.InterfaceC6812d
    public void e(float f10) {
        this.f61756w = f10;
        this.f61738e.setAlpha(f10);
    }

    @Override // v0.InterfaceC6812d
    public androidx.compose.ui.graphics.d f() {
        return this.f61754u;
    }

    @Override // v0.InterfaceC6812d
    public void g(float f10) {
        this.f61726C = f10;
        this.f61738e.setTranslationY(f10);
    }

    @Override // v0.InterfaceC6812d
    public float h() {
        return this.f61731H;
    }

    @Override // v0.InterfaceC6812d
    public float i() {
        return this.f61732I;
    }

    @Override // v0.InterfaceC6812d
    public int j() {
        return this.f61753t;
    }

    @Override // v0.InterfaceC6812d
    public void k(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f61728E = j10;
            C6806W.f61781a.b(this.f61738e, AbstractC6387s0.k(j10));
        }
    }

    @Override // v0.InterfaceC6812d
    public void l(float f10) {
        this.f61759z = f10;
        this.f61738e.setScaleX(f10);
    }

    @Override // v0.InterfaceC6812d
    public float m() {
        return this.f61738e.getCameraDistance() / this.f61739f.getDisplayMetrics().densityDpi;
    }

    @Override // v0.InterfaceC6812d
    public void n(boolean z10) {
        boolean z11 = false;
        this.f61751r = z10 && !this.f61750q;
        this.f61748o = true;
        C6802S c6802s = this.f61738e;
        if (z10 && this.f61750q) {
            z11 = true;
        }
        c6802s.setClipToOutline(z11);
    }

    @Override // v0.InterfaceC6812d
    public void o(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f61729F = j10;
            C6806W.f61781a.c(this.f61738e, AbstractC6387s0.k(j10));
        }
    }

    @Override // v0.InterfaceC6812d
    public void p() {
        this.f61735b.removeViewInLayout(this.f61738e);
    }

    @Override // v0.InterfaceC6812d
    public int q() {
        return this.f61755v;
    }

    @Override // v0.InterfaceC6812d
    public void r(float f10) {
        this.f61738e.setCameraDistance(f10 * this.f61739f.getDisplayMetrics().densityDpi);
    }

    @Override // v0.InterfaceC6812d
    public void s(float f10) {
        this.f61730G = f10;
        this.f61738e.setRotationX(f10);
    }

    @Override // v0.InterfaceC6812d
    public void t(float f10) {
        this.f61731H = f10;
        this.f61738e.setRotationY(f10);
    }

    @Override // v0.InterfaceC6812d
    public float u() {
        return this.f61759z;
    }

    @Override // v0.InterfaceC6812d
    public void v(float f10) {
        this.f61727D = f10;
        this.f61738e.setElevation(f10);
    }

    @Override // v0.InterfaceC6812d
    public void w(float f10) {
        this.f61732I = f10;
        this.f61738e.setRotation(f10);
    }

    @Override // v0.InterfaceC6812d
    public void x(int i10, int i11, long j10) {
        if (C5025r.e(this.f61747n, j10)) {
            int i12 = this.f61745l;
            if (i12 != i10) {
                this.f61738e.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f61746m;
            if (i13 != i11) {
                this.f61738e.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (S()) {
                this.f61748o = true;
            }
            int i14 = (int) (j10 >> 32);
            int i15 = (int) (4294967295L & j10);
            this.f61738e.layout(i10, i11, i10 + i14, i11 + i15);
            this.f61747n = j10;
            if (this.f61757x) {
                this.f61738e.setPivotX(i14 / 2.0f);
                this.f61738e.setPivotY(i15 / 2.0f);
            }
        }
        this.f61745l = i10;
        this.f61746m = i11;
    }

    @Override // v0.InterfaceC6812d
    public void y(float f10) {
        this.f61724A = f10;
        this.f61738e.setScaleY(f10);
    }

    public /* synthetic */ C6789E(androidx.compose.ui.graphics.layer.view.a aVar, long j10, C6367k0 c6367k0, C6706a c6706a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j10, (i10 & 4) != 0 ? new C6367k0() : c6367k0, (i10 & 8) != 0 ? new C6706a() : c6706a);
    }
}
