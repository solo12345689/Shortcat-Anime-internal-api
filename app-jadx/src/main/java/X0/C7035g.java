package x0;

import Td.AbstractC2163n;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6358h0;
import s0.InterfaceC6374m1;
import s0.U;
import s0.V;
import s0.p1;
import u0.C6716k;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: x0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7035g extends AbstractC7040l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC6358h0 f63471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f63472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f63473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f63475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f63476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC6358h0 f63477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f63478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f63479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f63480l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f63481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f63482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f63483o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f63484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f63485q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f63486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C6716k f63487s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC6374m1 f63488t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private InterfaceC6374m1 f63489u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Lazy f63490v;

    /* JADX INFO: renamed from: x0.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f63491a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p1 invoke() {
            return U.a();
        }
    }

    public C7035g() {
        super(null);
        this.f63470b = "";
        this.f63472d = 1.0f;
        this.f63473e = AbstractC7043o.d();
        this.f63474f = AbstractC7043o.a();
        this.f63475g = 1.0f;
        this.f63478j = AbstractC7043o.b();
        this.f63479k = AbstractC7043o.c();
        this.f63480l = 4.0f;
        this.f63482n = 1.0f;
        this.f63484p = true;
        this.f63485q = true;
        InterfaceC6374m1 interfaceC6374m1A = V.a();
        this.f63488t = interfaceC6374m1A;
        this.f63489u = interfaceC6374m1A;
        this.f63490v = AbstractC2163n.a(Td.q.f17463c, a.f63491a);
    }

    private final p1 f() {
        return (p1) this.f63490v.getValue();
    }

    private final void v() {
        AbstractC7039k.c(this.f63473e, this.f63488t);
        w();
    }

    private final void w() {
        if (this.f63481m == 0.0f && this.f63482n == 1.0f) {
            this.f63489u = this.f63488t;
            return;
        }
        if (AbstractC5504s.c(this.f63489u, this.f63488t)) {
            this.f63489u = V.a();
        } else {
            int iR = this.f63489u.r();
            this.f63489u.C();
            this.f63489u.h(iR);
        }
        f().a(this.f63488t, false);
        float length = f().getLength();
        float f10 = this.f63481m;
        float f11 = this.f63483o;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.f63482n + f11) % 1.0f) * length;
        if (f12 <= f13) {
            f().b(f12, f13, this.f63489u, true);
        } else {
            f().b(f12, length, this.f63489u, true);
            f().b(0.0f, f13, this.f63489u, true);
        }
    }

    @Override // x0.AbstractC7040l
    public void a(InterfaceC6711f interfaceC6711f) {
        C6716k c6716k;
        if (this.f63484p) {
            v();
        } else if (this.f63486r) {
            w();
        }
        this.f63484p = false;
        this.f63486r = false;
        AbstractC6358h0 abstractC6358h0 = this.f63471c;
        if (abstractC6358h0 != null) {
            InterfaceC6711f.i0(interfaceC6711f, this.f63489u, abstractC6358h0, this.f63472d, null, null, 0, 56, null);
        }
        AbstractC6358h0 abstractC6358h02 = this.f63477i;
        if (abstractC6358h02 != null) {
            C6716k c6716k2 = this.f63487s;
            if (this.f63485q || c6716k2 == null) {
                C6716k c6716k3 = new C6716k(this.f63476h, this.f63480l, this.f63478j, this.f63479k, null, 16, null);
                this.f63487s = c6716k3;
                this.f63485q = false;
                c6716k = c6716k3;
            } else {
                c6716k = c6716k2;
            }
            InterfaceC6711f.i0(interfaceC6711f, this.f63489u, abstractC6358h02, this.f63475g, c6716k, null, 0, 48, null);
        }
    }

    public final AbstractC6358h0 e() {
        return this.f63471c;
    }

    public final AbstractC6358h0 g() {
        return this.f63477i;
    }

    public final void h(AbstractC6358h0 abstractC6358h0) {
        this.f63471c = abstractC6358h0;
        c();
    }

    public final void i(float f10) {
        this.f63472d = f10;
        c();
    }

    public final void j(String str) {
        this.f63470b = str;
        c();
    }

    public final void k(List list) {
        this.f63473e = list;
        this.f63484p = true;
        c();
    }

    public final void l(int i10) {
        this.f63474f = i10;
        this.f63489u.h(i10);
        c();
    }

    public final void m(AbstractC6358h0 abstractC6358h0) {
        this.f63477i = abstractC6358h0;
        c();
    }

    public final void n(float f10) {
        this.f63475g = f10;
        c();
    }

    public final void o(int i10) {
        this.f63478j = i10;
        this.f63485q = true;
        c();
    }

    public final void p(int i10) {
        this.f63479k = i10;
        this.f63485q = true;
        c();
    }

    public final void q(float f10) {
        this.f63480l = f10;
        this.f63485q = true;
        c();
    }

    public final void r(float f10) {
        this.f63476h = f10;
        this.f63485q = true;
        c();
    }

    public final void s(float f10) {
        this.f63482n = f10;
        this.f63486r = true;
        c();
    }

    public final void t(float f10) {
        this.f63483o = f10;
        this.f63486r = true;
        c();
    }

    public String toString() {
        return this.f63488t.toString();
    }

    public final void u(float f10) {
        this.f63481m = f10;
        this.f63486r = true;
        c();
    }
}
