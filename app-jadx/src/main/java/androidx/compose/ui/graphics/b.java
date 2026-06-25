package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import s0.InterfaceC6368k1;
import s0.InterfaceC6377n1;
import s0.Q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC6368k1 {

    /* JADX INFO: renamed from: a */
    private Paint f26728a;

    /* JADX INFO: renamed from: b */
    private int f26729b;

    /* JADX INFO: renamed from: c */
    private Shader f26730c;

    /* JADX INFO: renamed from: d */
    private d f26731d;

    public b(Paint paint) {
        this.f26728a = paint;
        this.f26729b = c.f26737b.B();
    }

    @Override // s0.InterfaceC6368k1
    public void A(float f10) {
        Q.v(this.f26728a, f10);
    }

    @Override // s0.InterfaceC6368k1
    public float B() {
        return Q.i(this.f26728a);
    }

    @Override // s0.InterfaceC6368k1
    public float a() {
        return Q.c(this.f26728a);
    }

    @Override // s0.InterfaceC6368k1
    public long b() {
        return Q.d(this.f26728a);
    }

    @Override // s0.InterfaceC6368k1
    public void c(int i10) {
        if (c.G(this.f26729b, i10)) {
            return;
        }
        this.f26729b = i10;
        Q.m(this.f26728a, i10);
    }

    @Override // s0.InterfaceC6368k1
    public void d(d dVar) {
        this.f26731d = dVar;
        Q.o(this.f26728a, dVar);
    }

    @Override // s0.InterfaceC6368k1
    public void e(float f10) {
        Q.k(this.f26728a, f10);
    }

    @Override // s0.InterfaceC6368k1
    public d f() {
        return this.f26731d;
    }

    @Override // s0.InterfaceC6368k1
    public int j() {
        return this.f26729b;
    }

    @Override // s0.InterfaceC6368k1
    public void k(boolean z10) {
        Q.l(this.f26728a, z10);
    }

    @Override // s0.InterfaceC6368k1
    public void l(int i10) {
        Q.s(this.f26728a, i10);
    }

    @Override // s0.InterfaceC6368k1
    public void m(int i10) {
        Q.p(this.f26728a, i10);
    }

    @Override // s0.InterfaceC6368k1
    public int n() {
        return Q.f(this.f26728a);
    }

    @Override // s0.InterfaceC6368k1
    public void o(int i10) {
        Q.t(this.f26728a, i10);
    }

    @Override // s0.InterfaceC6368k1
    public void p(long j10) {
        Q.n(this.f26728a, j10);
    }

    @Override // s0.InterfaceC6368k1
    public InterfaceC6377n1 q() {
        return null;
    }

    @Override // s0.InterfaceC6368k1
    public int r() {
        return Q.g(this.f26728a);
    }

    @Override // s0.InterfaceC6368k1
    public float s() {
        return Q.h(this.f26728a);
    }

    @Override // s0.InterfaceC6368k1
    public void t(InterfaceC6377n1 interfaceC6377n1) {
        Q.q(this.f26728a, interfaceC6377n1);
    }

    @Override // s0.InterfaceC6368k1
    public Paint u() {
        return this.f26728a;
    }

    @Override // s0.InterfaceC6368k1
    public void v(Shader shader) {
        this.f26730c = shader;
        Q.r(this.f26728a, shader);
    }

    @Override // s0.InterfaceC6368k1
    public Shader w() {
        return this.f26730c;
    }

    @Override // s0.InterfaceC6368k1
    public void x(float f10) {
        Q.u(this.f26728a, f10);
    }

    @Override // s0.InterfaceC6368k1
    public int y() {
        return Q.e(this.f26728a);
    }

    @Override // s0.InterfaceC6368k1
    public void z(int i10) {
        Q.w(this.f26728a, i10);
    }

    public b() {
        this(Q.j());
    }
}
