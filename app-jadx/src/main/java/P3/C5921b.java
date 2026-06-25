package p3;

import U2.InterfaceC2256q;
import U2.J;
import U2.v;
import U2.w;
import U2.x;
import U2.y;
import java.util.Arrays;
import p3.AbstractC5928i;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.a0;

/* JADX INFO: renamed from: p3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5921b extends AbstractC5928i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private y f55747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f55748o;

    /* JADX INFO: renamed from: p3.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements InterfaceC5926g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y f55749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y.a f55750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f55751c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f55752d = -1;

        public a(y yVar, y.a aVar) {
            this.f55749a = yVar;
            this.f55750b = aVar;
        }

        @Override // p3.InterfaceC5926g
        public J a() {
            AbstractC6614a.g(this.f55751c != -1);
            return new x(this.f55749a, this.f55751c);
        }

        @Override // p3.InterfaceC5926g
        public long b(InterfaceC2256q interfaceC2256q) {
            long j10 = this.f55752d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f55752d = -1L;
            return j11;
        }

        @Override // p3.InterfaceC5926g
        public void c(long j10) {
            long[] jArr = this.f55750b.f19110a;
            this.f55752d = jArr[a0.k(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f55751c = j10;
        }
    }

    C5921b() {
    }

    private int n(C6609I c6609i) {
        int i10 = (c6609i.f()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            c6609i.c0(4);
            c6609i.V();
        }
        int iJ = v.j(c6609i, i10);
        c6609i.b0(0);
        return iJ;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(C6609I c6609i) {
        return c6609i.a() >= 5 && c6609i.M() == 127 && c6609i.O() == 1179402563;
    }

    @Override // p3.AbstractC5928i
    protected long f(C6609I c6609i) {
        if (o(c6609i.f())) {
            return n(c6609i);
        }
        return -1L;
    }

    @Override // p3.AbstractC5928i
    protected boolean i(C6609I c6609i, long j10, AbstractC5928i.b bVar) {
        byte[] bArrF = c6609i.f();
        y yVar = this.f55747n;
        if (yVar == null) {
            y yVar2 = new y(bArrF, 17);
            this.f55747n = yVar2;
            bVar.f55789a = yVar2.g(Arrays.copyOfRange(bArrF, 9, c6609i.j()), null).b().W("audio/ogg").P();
            return true;
        }
        if ((bArrF[0] & 127) == 3) {
            y.a aVarG = w.g(c6609i);
            y yVarB = yVar.b(aVarG);
            this.f55747n = yVarB;
            this.f55748o = new a(yVarB, aVarG);
            return true;
        }
        if (!o(bArrF)) {
            return true;
        }
        a aVar = this.f55748o;
        if (aVar != null) {
            aVar.d(j10);
            bVar.f55790b = this.f55748o;
        }
        AbstractC6614a.e(bVar.f55789a);
        return false;
    }

    @Override // p3.AbstractC5928i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f55747n = null;
            this.f55748o = null;
        }
    }
}
