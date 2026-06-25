package a3;

import U2.C2243d;
import U2.O;
import a3.AbstractC2564e;
import q2.C6080L;
import q2.C6109x;
import t2.C6609I;
import u2.AbstractC6726h;

/* JADX INFO: renamed from: a3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2565f extends AbstractC2564e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f23755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6609I f23756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23760g;

    public C2565f(O o10) {
        super(o10);
        this.f23755b = new C6609I(AbstractC6726h.f61236a);
        this.f23756c = new C6609I(4);
    }

    @Override // a3.AbstractC2564e
    protected boolean b(C6609I c6609i) throws AbstractC2564e.a {
        int iM = c6609i.M();
        int i10 = (iM >> 4) & 15;
        int i11 = iM & 15;
        if (i11 == 7) {
            this.f23760g = i10;
            return i10 != 5;
        }
        throw new AbstractC2564e.a("Video format not supported: " + i11);
    }

    @Override // a3.AbstractC2564e
    protected boolean c(C6609I c6609i, long j10) throws C6080L {
        int iM = c6609i.M();
        long jW = j10 + (((long) c6609i.w()) * 1000);
        if (iM == 0 && !this.f23758e) {
            C6609I c6609i2 = new C6609I(new byte[c6609i.a()]);
            c6609i.q(c6609i2.f(), 0, c6609i.a());
            C2243d c2243dB = C2243d.b(c6609i2);
            this.f23757d = c2243dB.f18998b;
            this.f23754a.c(new C6109x.b().W("video/x-flv").y0("video/avc").U(c2243dB.f19008l).F0(c2243dB.f18999c).h0(c2243dB.f19000d).u0(c2243dB.f19007k).k0(c2243dB.f18997a).P());
            this.f23758e = true;
            return false;
        }
        if (iM != 1 || !this.f23758e) {
            return false;
        }
        int i10 = this.f23760g == 1 ? 1 : 0;
        if (!this.f23759f && i10 == 0) {
            return false;
        }
        byte[] bArrF = this.f23756c.f();
        bArrF[0] = 0;
        bArrF[1] = 0;
        bArrF[2] = 0;
        int i11 = 4 - this.f23757d;
        int i12 = 0;
        while (c6609i.a() > 0) {
            c6609i.q(this.f23756c.f(), i11, this.f23757d);
            this.f23756c.b0(0);
            int iQ = this.f23756c.Q();
            this.f23755b.b0(0);
            this.f23754a.f(this.f23755b, 4);
            this.f23754a.f(c6609i, iQ);
            i12 = i12 + 4 + iQ;
        }
        this.f23754a.a(jW, i10, i12, 0, null);
        this.f23759f = true;
        return true;
    }
}
