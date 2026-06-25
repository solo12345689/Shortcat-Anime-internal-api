package c3;

import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import U2.r;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import j3.C5333a;
import o3.n;
import q2.C6078J;
import q2.C6109x;
import r3.r;
import t2.AbstractC6614a;
import t2.C6609I;

/* JADX INFO: renamed from: c3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C3069b implements InterfaceC2255p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f33436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33439e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C5333a f33441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC2256q f33442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C3071d f33443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n f33444j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f33435a = new C6609I(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33440f = -1;

    private void d(InterfaceC2256q interfaceC2256q) {
        this.f33435a.X(2);
        interfaceC2256q.o(this.f33435a.f(), 0, 2);
        interfaceC2256q.k(this.f33435a.U() - 2);
    }

    private void e() {
        ((r) AbstractC6614a.e(this.f33436b)).p();
        this.f33436b.t(new J.b(-9223372036854775807L));
        this.f33437c = 6;
    }

    private static C5333a g(String str, long j10) {
        C3070c c3070cA;
        if (j10 == -1 || (c3070cA = f.a(str)) == null) {
            return null;
        }
        return c3070cA.a(j10);
    }

    private void j(C5333a c5333a) {
        ((r) AbstractC6614a.e(this.f33436b)).e(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 4).c(new C6109x.b().W("image/jpeg").r0(new C6078J(c5333a)).P());
    }

    private int k(InterfaceC2256q interfaceC2256q) {
        this.f33435a.X(2);
        interfaceC2256q.o(this.f33435a.f(), 0, 2);
        return this.f33435a.U();
    }

    private void m(InterfaceC2256q interfaceC2256q) {
        this.f33435a.X(2);
        interfaceC2256q.readFully(this.f33435a.f(), 0, 2);
        int iU = this.f33435a.U();
        this.f33438d = iU;
        if (iU == 65498) {
            if (this.f33440f != -1) {
                this.f33437c = 4;
                return;
            } else {
                e();
                return;
            }
        }
        if ((iU < 65488 || iU > 65497) && iU != 65281) {
            this.f33437c = 1;
        }
    }

    private void n(InterfaceC2256q interfaceC2256q) {
        String strG;
        if (this.f33438d == 65505) {
            C6609I c6609i = new C6609I(this.f33439e);
            interfaceC2256q.readFully(c6609i.f(), 0, this.f33439e);
            if (this.f33441g == null && "http://ns.adobe.com/xap/1.0/".equals(c6609i.G()) && (strG = c6609i.G()) != null) {
                C5333a c5333aG = g(strG, interfaceC2256q.getLength());
                this.f33441g = c5333aG;
                if (c5333aG != null) {
                    this.f33440f = c5333aG.f51617d;
                }
            }
        } else {
            interfaceC2256q.m(this.f33439e);
        }
        this.f33437c = 0;
    }

    private void o(InterfaceC2256q interfaceC2256q) {
        this.f33435a.X(2);
        interfaceC2256q.readFully(this.f33435a.f(), 0, 2);
        this.f33439e = this.f33435a.U() - 2;
        this.f33437c = 2;
    }

    private void p(InterfaceC2256q interfaceC2256q) {
        if (!interfaceC2256q.e(this.f33435a.f(), 0, 1, true)) {
            e();
            return;
        }
        interfaceC2256q.g();
        if (this.f33444j == null) {
            this.f33444j = new n(r.a.f58521a, 8);
        }
        C3071d c3071d = new C3071d(interfaceC2256q, this.f33440f);
        this.f33443i = c3071d;
        if (!this.f33444j.f(c3071d)) {
            e();
        } else {
            this.f33444j.c(new C3072e(this.f33440f, (U2.r) AbstractC6614a.e(this.f33436b)));
            q();
        }
    }

    private void q() {
        j((C5333a) AbstractC6614a.e(this.f33441g));
        this.f33437c = 5;
    }

    @Override // U2.InterfaceC2255p
    public void a() {
        n nVar = this.f33444j;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f33437c = 0;
            this.f33444j = null;
        } else if (this.f33437c == 5) {
            ((n) AbstractC6614a.e(this.f33444j)).b(j10, j11);
        }
    }

    @Override // U2.InterfaceC2255p
    public void c(U2.r rVar) {
        this.f33436b = rVar;
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        if (k(interfaceC2256q) != 65496) {
            return false;
        }
        int iK = k(interfaceC2256q);
        this.f33438d = iK;
        if (iK == 65504) {
            d(interfaceC2256q);
            this.f33438d = k(interfaceC2256q);
        }
        return this.f33438d == 65505;
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) {
        int i11 = this.f33437c;
        if (i11 == 0) {
            m(interfaceC2256q);
            return 0;
        }
        if (i11 == 1) {
            o(interfaceC2256q);
            return 0;
        }
        if (i11 == 2) {
            n(interfaceC2256q);
            return 0;
        }
        if (i11 == 4) {
            long position = interfaceC2256q.getPosition();
            long j10 = this.f33440f;
            if (position != j10) {
                i10.f18917a = j10;
                return 1;
            }
            p(interfaceC2256q);
            return 0;
        }
        if (i11 != 5) {
            if (i11 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f33443i == null || interfaceC2256q != this.f33442h) {
            this.f33442h = interfaceC2256q;
            this.f33443i = new C3071d(interfaceC2256q, this.f33440f);
        }
        int iH = ((n) AbstractC6614a.e(this.f33444j)).h(this.f33443i, i10);
        if (iH == 1) {
            i10.f18917a += this.f33440f;
        }
        return iH;
    }
}
