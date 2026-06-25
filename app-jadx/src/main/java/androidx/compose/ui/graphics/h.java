package androidx.compose.ui.graphics;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.AbstractC5013f;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.internal.AbstractC5504s;
import r0.C6230l;
import s0.AbstractC6338a1;
import s0.AbstractC6362i1;
import s0.C6385r0;
import s0.E1;
import s0.t1;
import s0.u1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a */
    private int f26770a;

    /* JADX INFO: renamed from: e */
    private float f26774e;

    /* JADX INFO: renamed from: f */
    private float f26775f;

    /* JADX INFO: renamed from: g */
    private float f26776g;

    /* JADX INFO: renamed from: j */
    private float f26779j;

    /* JADX INFO: renamed from: k */
    private float f26780k;

    /* JADX INFO: renamed from: l */
    private float f26781l;

    /* JADX INFO: renamed from: p */
    private boolean f26785p;

    /* JADX INFO: renamed from: u */
    private u1 f26790u;

    /* JADX INFO: renamed from: v */
    private d f26791v;

    /* JADX INFO: renamed from: x */
    private AbstractC6362i1 f26793x;

    /* JADX INFO: renamed from: b */
    private float f26771b = 1.0f;

    /* JADX INFO: renamed from: c */
    private float f26772c = 1.0f;

    /* JADX INFO: renamed from: d */
    private float f26773d = 1.0f;

    /* JADX INFO: renamed from: h */
    private long f26777h = AbstractC6338a1.a();

    /* JADX INFO: renamed from: i */
    private long f26778i = AbstractC6338a1.a();

    /* JADX INFO: renamed from: m */
    private float f26782m = 8.0f;

    /* JADX INFO: renamed from: n */
    private long f26783n = j.f26818b.a();

    /* JADX INFO: renamed from: o */
    private E1 f26784o = t1.a();

    /* JADX INFO: renamed from: q */
    private int f26786q = e.f26765b.a();

    /* JADX INFO: renamed from: r */
    private long f26787r = C6230l.f58350b.a();

    /* JADX INFO: renamed from: s */
    private InterfaceC5011d f26788s = AbstractC5013f.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: t */
    private EnumC5027t f26789t = EnumC5027t.f48573a;

    /* JADX INFO: renamed from: w */
    private int f26792w = c.f26737b.B();

    public int B() {
        return this.f26786q;
    }

    @Override // androidx.compose.ui.graphics.g
    public float C() {
        return this.f26775f;
    }

    @Override // androidx.compose.ui.graphics.g
    public float D() {
        return this.f26774e;
    }

    @Override // androidx.compose.ui.graphics.g
    public float E() {
        return this.f26779j;
    }

    @Override // androidx.compose.ui.graphics.g
    public void F(float f10) {
        if (this.f26774e == f10) {
            return;
        }
        this.f26770a |= 8;
        this.f26774e = f10;
    }

    @Override // androidx.compose.ui.graphics.g
    public void G(u1 u1Var) {
        if (AbstractC5504s.c(this.f26790u, u1Var)) {
            return;
        }
        this.f26770a |= 131072;
        this.f26790u = u1Var;
    }

    @Override // androidx.compose.ui.graphics.g
    public float H() {
        return this.f26772c;
    }

    public final InterfaceC5011d I() {
        return this.f26788s;
    }

    public final EnumC5027t L() {
        return this.f26789t;
    }

    public final int N() {
        return this.f26770a;
    }

    public final AbstractC6362i1 S() {
        return this.f26793x;
    }

    public u1 U() {
        return this.f26790u;
    }

    public float V() {
        return this.f26776g;
    }

    public E1 W() {
        return this.f26784o;
    }

    @Override // androidx.compose.ui.graphics.g
    public void X(int i10) {
        if (e.g(this.f26786q, i10)) {
            return;
        }
        this.f26770a |= 32768;
        this.f26786q = i10;
    }

    public long Y() {
        return this.f26778i;
    }

    public final void Z() {
        l(1.0f);
        y(1.0f);
        e(1.0f);
        F(0.0f);
        g(0.0f);
        v(0.0f);
        k(AbstractC6338a1.a());
        o(AbstractC6338a1.a());
        s(0.0f);
        t(0.0f);
        w(0.0f);
        r(8.0f);
        t0(j.f26818b.a());
        s1(t1.a());
        n(false);
        G(null);
        d(null);
        c(c.f26737b.B());
        X(e.f26765b.a());
        h0(C6230l.f58350b.a());
        this.f26793x = null;
        this.f26770a = 0;
    }

    public float b() {
        return this.f26773d;
    }

    @Override // androidx.compose.ui.graphics.g
    public void c(int i10) {
        if (c.G(this.f26792w, i10)) {
            return;
        }
        this.f26770a |= 524288;
        this.f26792w = i10;
    }

    public final void c0(InterfaceC5011d interfaceC5011d) {
        this.f26788s = interfaceC5011d;
    }

    @Override // androidx.compose.ui.graphics.g
    public void d(d dVar) {
        if (AbstractC5504s.c(this.f26791v, dVar)) {
            return;
        }
        this.f26770a |= 262144;
        this.f26791v = dVar;
    }

    @Override // androidx.compose.ui.graphics.g
    public void e(float f10) {
        if (this.f26773d == f10) {
            return;
        }
        this.f26770a |= 4;
        this.f26773d = f10;
    }

    public long f() {
        return this.f26787r;
    }

    public final void f0(EnumC5027t enumC5027t) {
        this.f26789t = enumC5027t;
    }

    @Override // androidx.compose.ui.graphics.g
    public void g(float f10) {
        if (this.f26775f == f10) {
            return;
        }
        this.f26770a |= 16;
        this.f26775f = f10;
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f26788s.getDensity();
    }

    @Override // androidx.compose.ui.graphics.g
    public float h() {
        return this.f26780k;
    }

    public void h0(long j10) {
        this.f26787r = j10;
    }

    @Override // androidx.compose.ui.graphics.g
    public float i() {
        return this.f26781l;
    }

    public long j() {
        return this.f26777h;
    }

    public final void j0() {
        this.f26793x = W().mo6createOutlinePq9zytI(f(), this.f26789t, this.f26788s);
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f26788s.j1();
    }

    @Override // androidx.compose.ui.graphics.g
    public void k(long j10) {
        if (C6385r0.s(this.f26777h, j10)) {
            return;
        }
        this.f26770a |= 64;
        this.f26777h = j10;
    }

    @Override // androidx.compose.ui.graphics.g
    public void l(float f10) {
        if (this.f26771b == f10) {
            return;
        }
        this.f26770a |= 1;
        this.f26771b = f10;
    }

    @Override // androidx.compose.ui.graphics.g
    public float m() {
        return this.f26782m;
    }

    @Override // androidx.compose.ui.graphics.g
    public void n(boolean z10) {
        if (this.f26785p != z10) {
            this.f26770a |= 16384;
            this.f26785p = z10;
        }
    }

    @Override // androidx.compose.ui.graphics.g
    public void o(long j10) {
        if (C6385r0.s(this.f26778i, j10)) {
            return;
        }
        this.f26770a |= 128;
        this.f26778i = j10;
    }

    public int p() {
        return this.f26792w;
    }

    public boolean q() {
        return this.f26785p;
    }

    @Override // androidx.compose.ui.graphics.g
    public void r(float f10) {
        if (this.f26782m == f10) {
            return;
        }
        this.f26770a |= 2048;
        this.f26782m = f10;
    }

    @Override // androidx.compose.ui.graphics.g
    public long r0() {
        return this.f26783n;
    }

    @Override // androidx.compose.ui.graphics.g
    public void s(float f10) {
        if (this.f26779j == f10) {
            return;
        }
        this.f26770a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        this.f26779j = f10;
    }

    @Override // androidx.compose.ui.graphics.g
    public void s1(E1 e12) {
        if (AbstractC5504s.c(this.f26784o, e12)) {
            return;
        }
        this.f26770a |= 8192;
        this.f26784o = e12;
    }

    @Override // androidx.compose.ui.graphics.g
    public void t(float f10) {
        if (this.f26780k == f10) {
            return;
        }
        this.f26770a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        this.f26780k = f10;
    }

    @Override // androidx.compose.ui.graphics.g
    public void t0(long j10) {
        if (j.e(this.f26783n, j10)) {
            return;
        }
        this.f26770a |= 4096;
        this.f26783n = j10;
    }

    @Override // androidx.compose.ui.graphics.g
    public float u() {
        return this.f26771b;
    }

    @Override // androidx.compose.ui.graphics.g
    public void v(float f10) {
        if (this.f26776g == f10) {
            return;
        }
        this.f26770a |= 32;
        this.f26776g = f10;
    }

    @Override // androidx.compose.ui.graphics.g
    public void w(float f10) {
        if (this.f26781l == f10) {
            return;
        }
        this.f26770a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        this.f26781l = f10;
    }

    @Override // androidx.compose.ui.graphics.g
    public void y(float f10) {
        if (this.f26772c == f10) {
            return;
        }
        this.f26770a |= 2;
        this.f26772c = f10;
    }

    public d z() {
        return this.f26791v;
    }
}
