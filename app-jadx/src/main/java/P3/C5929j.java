package p3;

import P9.AbstractC2011u;
import U2.S;
import java.util.ArrayList;
import java.util.Arrays;
import p3.AbstractC5928i;
import q2.C6080L;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6609I;

/* JADX INFO: renamed from: p3.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5929j extends AbstractC5928i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f55791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f55792o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f55793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private S.c f55794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private S.a f55795r;

    /* JADX INFO: renamed from: p3.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S.c f55796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S.a f55797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f55798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final S.b[] f55799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f55800e;

        public a(S.c cVar, S.a aVar, byte[] bArr, S.b[] bVarArr, int i10) {
            this.f55796a = cVar;
            this.f55797b = aVar;
            this.f55798c = bArr;
            this.f55799d = bVarArr;
            this.f55800e = i10;
        }
    }

    C5929j() {
    }

    static void n(C6609I c6609i, long j10) {
        if (c6609i.b() < c6609i.j() + 4) {
            c6609i.Y(Arrays.copyOf(c6609i.f(), c6609i.j() + 4));
        } else {
            c6609i.a0(c6609i.j() + 4);
        }
        byte[] bArrF = c6609i.f();
        bArrF[c6609i.j() - 4] = (byte) (j10 & 255);
        bArrF[c6609i.j() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrF[c6609i.j() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrF[c6609i.j() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f55799d[p(b10, aVar.f55800e, 1)].f18952a ? aVar.f55796a.f18962g : aVar.f55796a.f18963h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(C6609I c6609i) {
        try {
            return S.o(1, c6609i, true);
        } catch (C6080L unused) {
            return false;
        }
    }

    @Override // p3.AbstractC5928i
    protected void e(long j10) {
        super.e(j10);
        this.f55793p = j10 != 0;
        S.c cVar = this.f55794q;
        this.f55792o = cVar != null ? cVar.f18962g : 0;
    }

    @Override // p3.AbstractC5928i
    protected long f(C6609I c6609i) {
        if ((c6609i.f()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(c6609i.f()[0], (a) AbstractC6614a.i(this.f55791n));
        long j10 = this.f55793p ? (this.f55792o + iO) / 4 : 0;
        n(c6609i, j10);
        this.f55793p = true;
        this.f55792o = iO;
        return j10;
    }

    @Override // p3.AbstractC5928i
    protected boolean i(C6609I c6609i, long j10, AbstractC5928i.b bVar) throws C6080L {
        if (this.f55791n != null) {
            AbstractC6614a.e(bVar.f55789a);
            return false;
        }
        a aVarQ = q(c6609i);
        this.f55791n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        S.c cVar = aVarQ.f55796a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f18965j);
        arrayList.add(aVarQ.f55798c);
        bVar.f55789a = new C6109x.b().W("audio/ogg").y0("audio/vorbis").S(cVar.f18960e).t0(cVar.f18959d).T(cVar.f18957b).z0(cVar.f18958c).k0(arrayList).r0(S.d(AbstractC2011u.x(aVarQ.f55797b.f18950b))).P();
        return true;
    }

    @Override // p3.AbstractC5928i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f55791n = null;
            this.f55794q = null;
            this.f55795r = null;
        }
        this.f55792o = 0;
        this.f55793p = false;
    }

    a q(C6609I c6609i) throws C6080L {
        S.c cVar = this.f55794q;
        if (cVar == null) {
            this.f55794q = S.l(c6609i);
            return null;
        }
        S.a aVar = this.f55795r;
        if (aVar == null) {
            this.f55795r = S.j(c6609i);
            return null;
        }
        byte[] bArr = new byte[c6609i.j()];
        System.arraycopy(c6609i.f(), 0, bArr, 0, c6609i.j());
        return new a(cVar, aVar, bArr, S.m(c6609i, cVar.f18957b), S.b(r4.length - 1));
    }
}
