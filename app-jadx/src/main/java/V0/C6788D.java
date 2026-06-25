package v0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import i1.AbstractC5026s;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;
import r0.C6230l;
import s0.AbstractC6387s0;
import s0.C6335D;
import s0.C6367k0;
import s0.C6385r0;
import s0.InterfaceC6364j0;
import s0.u1;
import u0.C6706a;
import u0.InterfaceC6709d;
import v0.AbstractC6810b;
import x.AbstractC7018p;

/* JADX INFO: renamed from: v0.D */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6788D implements InterfaceC6812d {

    /* JADX INFO: renamed from: A */
    private boolean f61692A;

    /* JADX INFO: renamed from: B */
    private u1 f61693B;

    /* JADX INFO: renamed from: C */
    private int f61694C;

    /* JADX INFO: renamed from: D */
    private boolean f61695D;

    /* JADX INFO: renamed from: b */
    private final long f61696b;

    /* JADX INFO: renamed from: c */
    private final C6367k0 f61697c;

    /* JADX INFO: renamed from: d */
    private final C6706a f61698d;

    /* JADX INFO: renamed from: e */
    private final RenderNode f61699e;

    /* JADX INFO: renamed from: f */
    private long f61700f;

    /* JADX INFO: renamed from: g */
    private Paint f61701g;

    /* JADX INFO: renamed from: h */
    private Matrix f61702h;

    /* JADX INFO: renamed from: i */
    private boolean f61703i;

    /* JADX INFO: renamed from: j */
    private float f61704j;

    /* JADX INFO: renamed from: k */
    private int f61705k;

    /* JADX INFO: renamed from: l */
    private androidx.compose.ui.graphics.d f61706l;

    /* JADX INFO: renamed from: m */
    private long f61707m;

    /* JADX INFO: renamed from: n */
    private float f61708n;

    /* JADX INFO: renamed from: o */
    private float f61709o;

    /* JADX INFO: renamed from: p */
    private float f61710p;

    /* JADX INFO: renamed from: q */
    private float f61711q;

    /* JADX INFO: renamed from: r */
    private float f61712r;

    /* JADX INFO: renamed from: s */
    private long f61713s;

    /* JADX INFO: renamed from: t */
    private long f61714t;

    /* JADX INFO: renamed from: u */
    private float f61715u;

    /* JADX INFO: renamed from: v */
    private float f61716v;

    /* JADX INFO: renamed from: w */
    private float f61717w;

    /* JADX INFO: renamed from: x */
    private float f61718x;

    /* JADX INFO: renamed from: y */
    private boolean f61719y;

    /* JADX INFO: renamed from: z */
    private boolean f61720z;

    public C6788D(long j10, C6367k0 c6367k0, C6706a c6706a) {
        this.f61696b = j10;
        this.f61697c = c6367k0;
        this.f61698d = c6706a;
        RenderNode renderNodeA = AbstractC7018p.a("graphicsLayer");
        this.f61699e = renderNodeA;
        this.f61700f = C6230l.f58350b.b();
        renderNodeA.setClipToBounds(false);
        AbstractC6810b.a aVar = AbstractC6810b.f61788a;
        S(renderNodeA, aVar.a());
        this.f61704j = 1.0f;
        this.f61705k = androidx.compose.ui.graphics.c.f26737b.B();
        this.f61707m = C6224f.f58329b.b();
        this.f61708n = 1.0f;
        this.f61709o = 1.0f;
        C6385r0.a aVar2 = C6385r0.f58985b;
        this.f61713s = aVar2.a();
        this.f61714t = aVar2.a();
        this.f61718x = 8.0f;
        this.f61694C = aVar.a();
        this.f61695D = true;
    }

    private final void R() {
        boolean z10 = false;
        boolean z11 = T() && !this.f61703i;
        if (T() && this.f61703i) {
            z10 = true;
        }
        if (z11 != this.f61720z) {
            this.f61720z = z11;
            this.f61699e.setClipToBounds(z11);
        }
        if (z10 != this.f61692A) {
            this.f61692A = z10;
            this.f61699e.setClipToOutline(z10);
        }
    }

    private final void S(RenderNode renderNode, int i10) {
        AbstractC6810b.a aVar = AbstractC6810b.f61788a;
        if (AbstractC6810b.e(i10, aVar.c())) {
            renderNode.setUseCompositingLayer(true, this.f61701g);
            renderNode.setHasOverlappingRendering(true);
        } else if (AbstractC6810b.e(i10, aVar.b())) {
            renderNode.setUseCompositingLayer(false, this.f61701g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f61701g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint U() {
        Paint paint = this.f61701g;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.f61701g = paint2;
        return paint2;
    }

    private final boolean V() {
        return AbstractC6810b.e(q(), AbstractC6810b.f61788a.c()) || W() || b() != null;
    }

    private final boolean W() {
        return (androidx.compose.ui.graphics.c.G(j(), androidx.compose.ui.graphics.c.f26737b.B()) && f() == null) ? false : true;
    }

    private final void X() {
        if (V()) {
            S(this.f61699e, AbstractC6810b.f61788a.c());
        } else {
            S(this.f61699e, q());
        }
    }

    @Override // v0.InterfaceC6812d
    public long A() {
        return this.f61713s;
    }

    @Override // v0.InterfaceC6812d
    public void B(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, C6811c c6811c, Function1 function1) {
        RecordingCanvas recordingCanvasBeginRecording = this.f61699e.beginRecording();
        try {
            C6367k0 c6367k0 = this.f61697c;
            Canvas canvasA = c6367k0.a().a();
            c6367k0.a().y(recordingCanvasBeginRecording);
            C6335D c6335dA = c6367k0.a();
            InterfaceC6709d interfaceC6709dN1 = this.f61698d.n1();
            interfaceC6709dN1.c(interfaceC5011d);
            interfaceC6709dN1.d(enumC5027t);
            interfaceC6709dN1.i(c6811c);
            interfaceC6709dN1.e(this.f61700f);
            interfaceC6709dN1.h(c6335dA);
            function1.invoke(this.f61698d);
            c6367k0.a().y(canvasA);
            this.f61699e.endRecording();
            M(false);
        } catch (Throwable th2) {
            this.f61699e.endRecording();
            throw th2;
        }
    }

    @Override // v0.InterfaceC6812d
    public float C() {
        return this.f61711q;
    }

    @Override // v0.InterfaceC6812d
    public float D() {
        return this.f61710p;
    }

    @Override // v0.InterfaceC6812d
    public float E() {
        return this.f61715u;
    }

    @Override // v0.InterfaceC6812d
    public void F(float f10) {
        this.f61710p = f10;
        this.f61699e.setTranslationX(f10);
    }

    @Override // v0.InterfaceC6812d
    public void G(u1 u1Var) {
        this.f61693B = u1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            C6800P.f61767a.a(this.f61699e, u1Var);
        }
    }

    @Override // v0.InterfaceC6812d
    public float H() {
        return this.f61709o;
    }

    @Override // v0.InterfaceC6812d
    public long I() {
        return this.f61714t;
    }

    @Override // v0.InterfaceC6812d
    public Matrix J() {
        Matrix matrix = this.f61702h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f61702h = matrix;
        }
        this.f61699e.getMatrix(matrix);
        return matrix;
    }

    @Override // v0.InterfaceC6812d
    public void K(InterfaceC6364j0 interfaceC6364j0) {
        s0.E.d(interfaceC6364j0).drawRenderNode(this.f61699e);
    }

    @Override // v0.InterfaceC6812d
    public void M(boolean z10) {
        this.f61695D = z10;
    }

    @Override // v0.InterfaceC6812d
    public void N(Outline outline, long j10) {
        this.f61699e.setOutline(outline);
        this.f61703i = outline != null;
        R();
    }

    @Override // v0.InterfaceC6812d
    public void O(long j10) {
        this.f61707m = j10;
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            this.f61699e.resetPivot();
        } else {
            this.f61699e.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.f61699e.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }

    @Override // v0.InterfaceC6812d
    public void P(int i10) {
        this.f61694C = i10;
        X();
    }

    @Override // v0.InterfaceC6812d
    public float Q() {
        return this.f61712r;
    }

    public boolean T() {
        return this.f61719y;
    }

    @Override // v0.InterfaceC6812d
    public float a() {
        return this.f61704j;
    }

    @Override // v0.InterfaceC6812d
    public u1 b() {
        return this.f61693B;
    }

    @Override // v0.InterfaceC6812d
    public void c(int i10) {
        this.f61705k = i10;
        U().setBlendMode(androidx.compose.ui.graphics.a.a(i10));
        X();
    }

    @Override // v0.InterfaceC6812d
    public void d(androidx.compose.ui.graphics.d dVar) {
        this.f61706l = dVar;
        U().setColorFilter(dVar != null ? s0.F.b(dVar) : null);
        X();
    }

    @Override // v0.InterfaceC6812d
    public void e(float f10) {
        this.f61704j = f10;
        this.f61699e.setAlpha(f10);
    }

    @Override // v0.InterfaceC6812d
    public androidx.compose.ui.graphics.d f() {
        return this.f61706l;
    }

    @Override // v0.InterfaceC6812d
    public void g(float f10) {
        this.f61711q = f10;
        this.f61699e.setTranslationY(f10);
    }

    @Override // v0.InterfaceC6812d
    public float h() {
        return this.f61716v;
    }

    @Override // v0.InterfaceC6812d
    public float i() {
        return this.f61717w;
    }

    @Override // v0.InterfaceC6812d
    public int j() {
        return this.f61705k;
    }

    @Override // v0.InterfaceC6812d
    public void k(long j10) {
        this.f61713s = j10;
        this.f61699e.setAmbientShadowColor(AbstractC6387s0.k(j10));
    }

    @Override // v0.InterfaceC6812d
    public void l(float f10) {
        this.f61708n = f10;
        this.f61699e.setScaleX(f10);
    }

    @Override // v0.InterfaceC6812d
    public float m() {
        return this.f61718x;
    }

    @Override // v0.InterfaceC6812d
    public void n(boolean z10) {
        this.f61719y = z10;
        R();
    }

    @Override // v0.InterfaceC6812d
    public void o(long j10) {
        this.f61714t = j10;
        this.f61699e.setSpotShadowColor(AbstractC6387s0.k(j10));
    }

    @Override // v0.InterfaceC6812d
    public void p() {
        this.f61699e.discardDisplayList();
    }

    @Override // v0.InterfaceC6812d
    public int q() {
        return this.f61694C;
    }

    @Override // v0.InterfaceC6812d
    public void r(float f10) {
        this.f61718x = f10;
        this.f61699e.setCameraDistance(f10);
    }

    @Override // v0.InterfaceC6812d
    public void s(float f10) {
        this.f61715u = f10;
        this.f61699e.setRotationX(f10);
    }

    @Override // v0.InterfaceC6812d
    public void t(float f10) {
        this.f61716v = f10;
        this.f61699e.setRotationY(f10);
    }

    @Override // v0.InterfaceC6812d
    public float u() {
        return this.f61708n;
    }

    @Override // v0.InterfaceC6812d
    public void v(float f10) {
        this.f61712r = f10;
        this.f61699e.setElevation(f10);
    }

    @Override // v0.InterfaceC6812d
    public void w(float f10) {
        this.f61717w = f10;
        this.f61699e.setRotationZ(f10);
    }

    @Override // v0.InterfaceC6812d
    public void x(int i10, int i11, long j10) {
        this.f61699e.setPosition(i10, i11, ((int) (j10 >> 32)) + i10, ((int) (4294967295L & j10)) + i11);
        this.f61700f = AbstractC5026s.d(j10);
    }

    @Override // v0.InterfaceC6812d
    public void y(float f10) {
        this.f61709o = f10;
        this.f61699e.setScaleY(f10);
    }

    @Override // v0.InterfaceC6812d
    public boolean z() {
        return this.f61699e.hasDisplayList();
    }

    public /* synthetic */ C6788D(long j10, C6367k0 c6367k0, C6706a c6706a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? new C6367k0() : c6367k0, (i10 & 4) != 0 ? new C6706a() : c6706a);
    }
}
