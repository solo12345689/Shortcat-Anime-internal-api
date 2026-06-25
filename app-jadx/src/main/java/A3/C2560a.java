package a3;

import U2.AbstractC2240a;
import U2.O;
import a3.AbstractC2564e;
import java.util.Collections;
import q2.C6109x;
import t2.C6609I;

/* JADX INFO: renamed from: a3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2560a extends AbstractC2564e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f23730e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23733d;

    public C2560a(O o10) {
        super(o10);
    }

    @Override // a3.AbstractC2564e
    protected boolean b(C6609I c6609i) throws AbstractC2564e.a {
        if (this.f23731b) {
            c6609i.c0(1);
        } else {
            int iM = c6609i.M();
            int i10 = (iM >> 4) & 15;
            this.f23733d = i10;
            if (i10 == 2) {
                this.f23754a.c(new C6109x.b().W("video/x-flv").y0("audio/mpeg").T(1).z0(f23730e[(iM >> 2) & 3]).P());
                this.f23732c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f23754a.c(new C6109x.b().W("video/x-flv").y0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").T(1).z0(8000).P());
                this.f23732c = true;
            } else if (i10 != 10) {
                throw new AbstractC2564e.a("Audio format not supported: " + this.f23733d);
            }
            this.f23731b = true;
        }
        return true;
    }

    @Override // a3.AbstractC2564e
    protected boolean c(C6609I c6609i, long j10) {
        if (this.f23733d == 2) {
            int iA = c6609i.a();
            this.f23754a.f(c6609i, iA);
            this.f23754a.a(j10, 1, iA, 0, null);
            return true;
        }
        int iM = c6609i.M();
        if (iM != 0 || this.f23732c) {
            if (this.f23733d == 10 && iM != 1) {
                return false;
            }
            int iA2 = c6609i.a();
            this.f23754a.f(c6609i, iA2);
            this.f23754a.a(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = c6609i.a();
        byte[] bArr = new byte[iA3];
        c6609i.q(bArr, 0, iA3);
        AbstractC2240a.b bVarE = AbstractC2240a.e(bArr);
        this.f23754a.c(new C6109x.b().W("video/x-flv").y0("audio/mp4a-latm").U(bVarE.f18970c).T(bVarE.f18969b).z0(bVarE.f18968a).k0(Collections.singletonList(bArr)).P());
        this.f23732c = true;
        return false;
    }
}
