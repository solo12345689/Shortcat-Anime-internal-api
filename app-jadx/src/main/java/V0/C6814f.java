package v0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import i1.AbstractC5026s;
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
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

/* JADX INFO: renamed from: v0.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6814f implements InterfaceC6812d {

    /* JADX INFO: renamed from: H */
    private static boolean f61826H;

    /* JADX INFO: renamed from: A */
    private float f61828A;

    /* JADX INFO: renamed from: B */
    private boolean f61829B;

    /* JADX INFO: renamed from: C */
    private boolean f61830C;

    /* JADX INFO: renamed from: D */
    private boolean f61831D;

    /* JADX INFO: renamed from: E */
    private u1 f61832E;

    /* JADX INFO: renamed from: F */
    private boolean f61833F;

    /* JADX INFO: renamed from: b */
    private final long f61834b;

    /* JADX INFO: renamed from: c */
    private final C6367k0 f61835c;

    /* JADX INFO: renamed from: d */
    private final C6706a f61836d;

    /* JADX INFO: renamed from: e */
    private final RenderNode f61837e;

    /* JADX INFO: renamed from: f */
    private long f61838f;

    /* JADX INFO: renamed from: g */
    private Paint f61839g;

    /* JADX INFO: renamed from: h */
    private Matrix f61840h;

    /* JADX INFO: renamed from: i */
    private boolean f61841i;

    /* JADX INFO: renamed from: j */
    private long f61842j;

    /* JADX INFO: renamed from: k */
    private int f61843k;

    /* JADX INFO: renamed from: l */
    private int f61844l;

    /* JADX INFO: renamed from: m */
    private androidx.compose.ui.graphics.d f61845m;

    /* JADX INFO: renamed from: n */
    private float f61846n;

    /* JADX INFO: renamed from: o */
    private boolean f61847o;

    /* JADX INFO: renamed from: p */
    private long f61848p;

    /* JADX INFO: renamed from: q */
    private float f61849q;

    /* JADX INFO: renamed from: r */
    private float f61850r;

    /* JADX INFO: renamed from: s */
    private float f61851s;

    /* JADX INFO: renamed from: t */
    private float f61852t;

    /* JADX INFO: renamed from: u */
    private float f61853u;

    /* JADX INFO: renamed from: v */
    private long f61854v;

    /* JADX INFO: renamed from: w */
    private long f61855w;

    /* JADX INFO: renamed from: x */
    private float f61856x;

    /* JADX INFO: renamed from: y */
    private float f61857y;

    /* JADX INFO: renamed from: z */
    private float f61858z;

    /* JADX INFO: renamed from: G */
    public static final a f61825G = new a(null);

    /* JADX INFO: renamed from: I */
    private static final AtomicBoolean f61827I = new AtomicBoolean(true);

    /* JADX INFO: renamed from: v0.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6814f(View view, long j10, C6367k0 c6367k0, C6706a c6706a) {
        this.f61834b = j10;
        this.f61835c = c6367k0;
        this.f61836d = c6706a;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.f61837e = renderNodeCreate;
        C5025r.a aVar = C5025r.f48570b;
        this.f61838f = aVar.a();
        this.f61842j = aVar.a();
        if (f61827I.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            Y(renderNodeCreate);
            T();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (f61826H) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        AbstractC6810b.a aVar2 = AbstractC6810b.f61788a;
        S(aVar2.a());
        this.f61843k = aVar2.a();
        this.f61844l = androidx.compose.ui.graphics.c.f26737b.B();
        this.f61846n = 1.0f;
        this.f61848p = C6224f.f58329b.b();
        this.f61849q = 1.0f;
        this.f61850r = 1.0f;
        C6385r0.a aVar3 = C6385r0.f58985b;
        this.f61854v = aVar3.a();
        this.f61855w = aVar3.a();
        this.f61828A = 8.0f;
        this.f61833F = true;
    }

    private final void R() {
        boolean z10 = false;
        boolean z11 = U() && !this.f61841i;
        if (U() && this.f61841i) {
            z10 = true;
        }
        if (z11 != this.f61830C) {
            this.f61830C = z11;
            this.f61837e.setClipToBounds(z11);
        }
        if (z10 != this.f61831D) {
            this.f61831D = z10;
            this.f61837e.setClipToOutline(z10);
        }
    }

    private final void S(int i10) {
        RenderNode renderNode = this.f61837e;
        AbstractC6810b.a aVar = AbstractC6810b.f61788a;
        if (AbstractC6810b.e(i10, aVar.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f61839g);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC6810b.e(i10, aVar.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f61839g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f61839g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint V() {
        Paint paint = this.f61839g;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.f61839g = paint2;
        return paint2;
    }

    private final boolean W() {
        return (!AbstractC6810b.e(q(), AbstractC6810b.f61788a.c()) && androidx.compose.ui.graphics.c.G(j(), androidx.compose.ui.graphics.c.f26737b.B()) && f() == null) ? false : true;
    }

    private final void X() {
        if (W()) {
            S(AbstractC6810b.f61788a.c());
        } else {
            S(q());
        }
    }

    private final void Y(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            C6799O c6799o = C6799O.f61766a;
            c6799o.c(renderNode, c6799o.a(renderNode));
            c6799o.d(renderNode, c6799o.b(renderNode));
        }
    }

    @Override // v0.InterfaceC6812d
    public long A() {
        return this.f61854v;
    }

    @Override // v0.InterfaceC6812d
    public void B(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, C6811c c6811c, Function1 function1) {
        Canvas canvasStart = this.f61837e.start(Math.max((int) (this.f61838f >> 32), (int) (this.f61842j >> 32)), Math.max((int) (this.f61838f & 4294967295L), (int) (this.f61842j & 4294967295L)));
        try {
            C6367k0 c6367k0 = this.f61835c;
            Canvas canvasA = c6367k0.a().a();
            c6367k0.a().y(canvasStart);
            C6335D c6335dA = c6367k0.a();
            C6706a c6706a = this.f61836d;
            long jD = AbstractC5026s.d(this.f61838f);
            InterfaceC5011d density = c6706a.n1().getDensity();
            EnumC5027t layoutDirection = c6706a.n1().getLayoutDirection();
            InterfaceC6364j0 interfaceC6364j0B = c6706a.n1().b();
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
                c6367k0.a().y(canvasA);
                this.f61837e.end(canvasStart);
                M(false);
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
        } catch (Throwable th3) {
            this.f61837e.end(canvasStart);
            throw th3;
        }
    }

    @Override // v0.InterfaceC6812d
    public float C() {
        return this.f61852t;
    }

    @Override // v0.InterfaceC6812d
    public float D() {
        return this.f61851s;
    }

    @Override // v0.InterfaceC6812d
    public float E() {
        return this.f61856x;
    }

    @Override // v0.InterfaceC6812d
    public void F(float f10) {
        this.f61851s = f10;
        this.f61837e.setTranslationX(f10);
    }

    @Override // v0.InterfaceC6812d
    public void G(u1 u1Var) {
        this.f61832E = u1Var;
    }

    @Override // v0.InterfaceC6812d
    public float H() {
        return this.f61850r;
    }

    @Override // v0.InterfaceC6812d
    public long I() {
        return this.f61855w;
    }

    @Override // v0.InterfaceC6812d
    public Matrix J() {
        Matrix matrix = this.f61840h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f61840h = matrix;
        }
        this.f61837e.getMatrix(matrix);
        return matrix;
    }

    @Override // v0.InterfaceC6812d
    public void K(InterfaceC6364j0 interfaceC6364j0) {
        DisplayListCanvas displayListCanvasD = s0.E.d(interfaceC6364j0);
        AbstractC5504s.f(displayListCanvasD, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasD.drawRenderNode(this.f61837e);
    }

    @Override // v0.InterfaceC6812d
    public void M(boolean z10) {
        this.f61833F = z10;
    }

    @Override // v0.InterfaceC6812d
    public void N(Outline outline, long j10) {
        this.f61842j = j10;
        this.f61837e.setOutline(outline);
        this.f61841i = outline != null;
        R();
    }

    @Override // v0.InterfaceC6812d
    public void O(long j10) {
        this.f61848p = j10;
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            this.f61847o = true;
            this.f61837e.setPivotX(((int) (this.f61838f >> 32)) / 2.0f);
            this.f61837e.setPivotY(((int) (4294967295L & this.f61838f)) / 2.0f);
        } else {
            this.f61847o = false;
            this.f61837e.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.f61837e.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }

    @Override // v0.InterfaceC6812d
    public void P(int i10) {
        this.f61843k = i10;
        X();
    }

    @Override // v0.InterfaceC6812d
    public float Q() {
        return this.f61853u;
    }

    public final void T() {
        C6798N.f61765a.a(this.f61837e);
    }

    public boolean U() {
        return this.f61829B;
    }

    @Override // v0.InterfaceC6812d
    public float a() {
        return this.f61846n;
    }

    @Override // v0.InterfaceC6812d
    public u1 b() {
        return this.f61832E;
    }

    @Override // v0.InterfaceC6812d
    public void c(int i10) {
        if (androidx.compose.ui.graphics.c.G(this.f61844l, i10)) {
            return;
        }
        this.f61844l = i10;
        V().setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.b(i10)));
        X();
    }

    @Override // v0.InterfaceC6812d
    public void d(androidx.compose.ui.graphics.d dVar) {
        this.f61845m = dVar;
        if (dVar == null) {
            X();
            return;
        }
        S(AbstractC6810b.f61788a.c());
        RenderNode renderNode = this.f61837e;
        Paint paintV = V();
        paintV.setColorFilter(s0.F.b(dVar));
        renderNode.setLayerPaint(paintV);
    }

    @Override // v0.InterfaceC6812d
    public void e(float f10) {
        this.f61846n = f10;
        this.f61837e.setAlpha(f10);
    }

    @Override // v0.InterfaceC6812d
    public androidx.compose.ui.graphics.d f() {
        return this.f61845m;
    }

    @Override // v0.InterfaceC6812d
    public void g(float f10) {
        this.f61852t = f10;
        this.f61837e.setTranslationY(f10);
    }

    @Override // v0.InterfaceC6812d
    public float h() {
        return this.f61857y;
    }

    @Override // v0.InterfaceC6812d
    public float i() {
        return this.f61858z;
    }

    @Override // v0.InterfaceC6812d
    public int j() {
        return this.f61844l;
    }

    @Override // v0.InterfaceC6812d
    public void k(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f61854v = j10;
            C6799O.f61766a.c(this.f61837e, AbstractC6387s0.k(j10));
        }
    }

    @Override // v0.InterfaceC6812d
    public void l(float f10) {
        this.f61849q = f10;
        this.f61837e.setScaleX(f10);
    }

    @Override // v0.InterfaceC6812d
    public float m() {
        return this.f61828A;
    }

    @Override // v0.InterfaceC6812d
    public void n(boolean z10) {
        this.f61829B = z10;
        R();
    }

    @Override // v0.InterfaceC6812d
    public void o(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f61855w = j10;
            C6799O.f61766a.d(this.f61837e, AbstractC6387s0.k(j10));
        }
    }

    @Override // v0.InterfaceC6812d
    public void p() {
        T();
    }

    @Override // v0.InterfaceC6812d
    public int q() {
        return this.f61843k;
    }

    @Override // v0.InterfaceC6812d
    public void r(float f10) {
        this.f61828A = f10;
        this.f61837e.setCameraDistance(-f10);
    }

    @Override // v0.InterfaceC6812d
    public void s(float f10) {
        this.f61856x = f10;
        this.f61837e.setRotationX(f10);
    }

    @Override // v0.InterfaceC6812d
    public void t(float f10) {
        this.f61857y = f10;
        this.f61837e.setRotationY(f10);
    }

    @Override // v0.InterfaceC6812d
    public float u() {
        return this.f61849q;
    }

    @Override // v0.InterfaceC6812d
    public void v(float f10) {
        this.f61853u = f10;
        this.f61837e.setElevation(f10);
    }

    @Override // v0.InterfaceC6812d
    public void w(float f10) {
        this.f61858z = f10;
        this.f61837e.setRotation(f10);
    }

    @Override // v0.InterfaceC6812d
    public void x(int i10, int i11, long j10) {
        int i12 = (int) (j10 >> 32);
        int i13 = (int) (4294967295L & j10);
        this.f61837e.setLeftTopRightBottom(i10, i11, i10 + i12, i11 + i13);
        if (C5025r.e(this.f61838f, j10)) {
            return;
        }
        if (this.f61847o) {
            this.f61837e.setPivotX(i12 / 2.0f);
            this.f61837e.setPivotY(i13 / 2.0f);
        }
        this.f61838f = j10;
    }

    @Override // v0.InterfaceC6812d
    public void y(float f10) {
        this.f61850r = f10;
        this.f61837e.setScaleY(f10);
    }

    @Override // v0.InterfaceC6812d
    public boolean z() {
        return this.f61837e.isValid();
    }

    public /* synthetic */ C6814f(View view, long j10, C6367k0 c6367k0, C6706a c6706a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j10, (i10 & 4) != 0 ? new C6367k0() : c6367k0, (i10 & 8) != 0 ? new C6706a() : c6706a);
    }
}
