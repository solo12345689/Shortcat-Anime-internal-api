package p3;

import P9.AbstractC2011u;
import U2.H;
import U2.S;
import java.util.Arrays;
import java.util.List;
import p3.AbstractC5928i;
import q2.C6078J;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6609I;

/* JADX INFO: renamed from: p3.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5927h extends AbstractC5928i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f55773o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f55774p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f55775n;

    C5927h() {
    }

    private static boolean n(C6609I c6609i, byte[] bArr) {
        if (c6609i.a() < bArr.length) {
            return false;
        }
        int iG = c6609i.g();
        byte[] bArr2 = new byte[bArr.length];
        c6609i.q(bArr2, 0, bArr.length);
        c6609i.b0(iG);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(C6609I c6609i) {
        return n(c6609i, f55773o);
    }

    @Override // p3.AbstractC5928i
    protected long f(C6609I c6609i) {
        return c(H.e(c6609i.f()));
    }

    @Override // p3.AbstractC5928i
    protected boolean i(C6609I c6609i, long j10, AbstractC5928i.b bVar) {
        if (n(c6609i, f55773o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c6609i.f(), c6609i.j());
            int iC = H.c(bArrCopyOf);
            List listA = H.a(bArrCopyOf);
            if (bVar.f55789a != null) {
                return true;
            }
            bVar.f55789a = new C6109x.b().W("audio/ogg").y0("audio/opus").T(iC).z0(48000).k0(listA).P();
            return true;
        }
        byte[] bArr = f55774p;
        if (!n(c6609i, bArr)) {
            AbstractC6614a.i(bVar.f55789a);
            return false;
        }
        AbstractC6614a.i(bVar.f55789a);
        if (this.f55775n) {
            return true;
        }
        this.f55775n = true;
        c6609i.c0(bArr.length);
        C6078J c6078jD = S.d(AbstractC2011u.x(S.k(c6609i, false, false).f18950b));
        if (c6078jD == null) {
            return true;
        }
        bVar.f55789a = bVar.f55789a.b().r0(c6078jD.b(bVar.f55789a.f57019l)).P();
        return true;
    }

    @Override // p3.AbstractC5928i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f55775n = false;
        }
    }
}
