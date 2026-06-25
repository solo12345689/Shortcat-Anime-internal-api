package M2;

import M2.b0;
import Q2.b;
import U2.O;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import q2.InterfaceC6098m;
import t2.AbstractC6614a;
import t2.C6609I;
import z2.C7278c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class Z {

    /* JADX INFO: renamed from: a */
    private final Q2.b f11821a;

    /* JADX INFO: renamed from: b */
    private final int f11822b;

    /* JADX INFO: renamed from: c */
    private final C6609I f11823c;

    /* JADX INFO: renamed from: d */
    private a f11824d;

    /* JADX INFO: renamed from: e */
    private a f11825e;

    /* JADX INFO: renamed from: f */
    private a f11826f;

    /* JADX INFO: renamed from: g */
    private long f11827g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements b.a {

        /* JADX INFO: renamed from: a */
        public long f11828a;

        /* JADX INFO: renamed from: b */
        public long f11829b;

        /* JADX INFO: renamed from: c */
        public Q2.a f11830c;

        /* JADX INFO: renamed from: d */
        public a f11831d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // Q2.b.a
        public Q2.a a() {
            return (Q2.a) AbstractC6614a.e(this.f11830c);
        }

        public a b() {
            this.f11830c = null;
            a aVar = this.f11831d;
            this.f11831d = null;
            return aVar;
        }

        public void c(Q2.a aVar, a aVar2) {
            this.f11830c = aVar;
            this.f11831d = aVar2;
        }

        public void d(long j10, int i10) {
            AbstractC6614a.g(this.f11830c == null);
            this.f11828a = j10;
            this.f11829b = j10 + ((long) i10);
        }

        public int e(long j10) {
            return ((int) (j10 - this.f11828a)) + this.f11830c.f14267b;
        }

        @Override // Q2.b.a
        public b.a next() {
            a aVar = this.f11831d;
            if (aVar == null || aVar.f11830c == null) {
                return null;
            }
            return aVar;
        }
    }

    public Z(Q2.b bVar) {
        this.f11821a = bVar;
        int iE = bVar.e();
        this.f11822b = iE;
        this.f11823c = new C6609I(32);
        a aVar = new a(0L, iE);
        this.f11824d = aVar;
        this.f11825e = aVar;
        this.f11826f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f11830c == null) {
            return;
        }
        this.f11821a.a(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f11829b) {
            aVar = aVar.f11831d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f11827g + ((long) i10);
        this.f11827g = j10;
        a aVar = this.f11826f;
        if (j10 == aVar.f11829b) {
            this.f11826f = aVar.f11831d;
        }
    }

    private int h(int i10) {
        a aVar = this.f11826f;
        if (aVar.f11830c == null) {
            aVar.c(this.f11821a.b(), new a(this.f11826f.f11829b, this.f11822b));
        }
        return Math.min(i10, (int) (this.f11826f.f11829b - this.f11827g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarD = d(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarD.f11829b - j10));
            byteBuffer.put(aVarD.f11830c.f14266a, aVarD.e(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f11829b) {
                aVarD = aVarD.f11831d;
            }
        }
        return aVarD;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a aVarD = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarD.f11829b - j10));
            System.arraycopy(aVarD.f11830c.f14266a, aVarD.e(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f11829b) {
                aVarD = aVarD.f11831d;
            }
        }
        return aVarD;
    }

    private static a k(a aVar, z2.f fVar, b0.b bVar, C6609I c6609i) {
        long j10 = bVar.f11873b;
        int iU = 1;
        c6609i.X(1);
        a aVarJ = j(aVar, j10, c6609i.f(), 1);
        long j11 = j10 + 1;
        byte b10 = c6609i.f()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        C7278c c7278c = fVar.f65554c;
        byte[] bArr = c7278c.f65541a;
        if (bArr == null) {
            c7278c.f65541a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j11, c7278c.f65541a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            c6609i.X(2);
            aVarJ2 = j(aVarJ2, j12, c6609i.f(), 2);
            j12 += 2;
            iU = c6609i.U();
        }
        int i11 = iU;
        int[] iArr = c7278c.f65544d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c7278c.f65545e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            c6609i.X(i12);
            aVarJ2 = j(aVarJ2, j12, c6609i.f(), i12);
            j12 += (long) i12;
            c6609i.b0(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = c6609i.U();
                iArr4[i13] = c6609i.Q();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f11872a - ((int) (j12 - bVar.f11873b));
        }
        O.a aVar2 = (O.a) t2.a0.l(bVar.f11874c);
        c7278c.c(i11, iArr2, iArr4, aVar2.f18935b, c7278c.f65541a, aVar2.f18934a, aVar2.f18936c, aVar2.f18937d);
        long j13 = bVar.f11873b;
        int i14 = (int) (j12 - j13);
        bVar.f11873b = j13 + ((long) i14);
        bVar.f11872a -= i14;
        return aVarJ2;
    }

    private static a l(a aVar, z2.f fVar, b0.b bVar, C6609I c6609i) {
        if (fVar.z()) {
            aVar = k(aVar, fVar, bVar, c6609i);
        }
        if (!fVar.p()) {
            fVar.x(bVar.f11872a);
            return i(aVar, bVar.f11873b, fVar.f65555d, bVar.f11872a);
        }
        c6609i.X(4);
        a aVarJ = j(aVar, bVar.f11873b, c6609i.f(), 4);
        int iQ = c6609i.Q();
        bVar.f11873b += 4;
        bVar.f11872a -= 4;
        fVar.x(iQ);
        a aVarI = i(aVarJ, bVar.f11873b, fVar.f65555d, iQ);
        bVar.f11873b += (long) iQ;
        int i10 = bVar.f11872a - iQ;
        bVar.f11872a = i10;
        fVar.B(i10);
        return i(aVarI, bVar.f11873b, fVar.f65558g, bVar.f11872a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f11824d;
            if (j10 < aVar.f11829b) {
                break;
            }
            this.f11821a.c(aVar.f11830c);
            this.f11824d = this.f11824d.b();
        }
        if (this.f11825e.f11828a < aVar.f11828a) {
            this.f11825e = aVar;
        }
    }

    public void c(long j10) {
        AbstractC6614a.a(j10 <= this.f11827g);
        this.f11827g = j10;
        if (j10 != 0) {
            a aVar = this.f11824d;
            if (j10 != aVar.f11828a) {
                while (this.f11827g > aVar.f11829b) {
                    aVar = aVar.f11831d;
                }
                a aVar2 = (a) AbstractC6614a.e(aVar.f11831d);
                a(aVar2);
                a aVar3 = new a(aVar.f11829b, this.f11822b);
                aVar.f11831d = aVar3;
                if (this.f11827g == aVar.f11829b) {
                    aVar = aVar3;
                }
                this.f11826f = aVar;
                if (this.f11825e == aVar2) {
                    this.f11825e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f11824d);
        a aVar4 = new a(this.f11827g, this.f11822b);
        this.f11824d = aVar4;
        this.f11825e = aVar4;
        this.f11826f = aVar4;
    }

    public long e() {
        return this.f11827g;
    }

    public void f(z2.f fVar, b0.b bVar) {
        l(this.f11825e, fVar, bVar, this.f11823c);
    }

    public void m(z2.f fVar, b0.b bVar) {
        this.f11825e = l(this.f11825e, fVar, bVar, this.f11823c);
    }

    public void n() {
        a(this.f11824d);
        this.f11824d.d(0L, this.f11822b);
        a aVar = this.f11824d;
        this.f11825e = aVar;
        this.f11826f = aVar;
        this.f11827g = 0L;
        this.f11821a.d();
    }

    public void o() {
        this.f11825e = this.f11824d;
    }

    public int p(InterfaceC6098m interfaceC6098m, int i10, boolean z10) throws EOFException {
        int iH = h(i10);
        a aVar = this.f11826f;
        int i11 = interfaceC6098m.read(aVar.f11830c.f14266a, aVar.e(this.f11827g), iH);
        if (i11 != -1) {
            g(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(C6609I c6609i, int i10) {
        while (i10 > 0) {
            int iH = h(i10);
            a aVar = this.f11826f;
            c6609i.q(aVar.f11830c.f14266a, aVar.e(this.f11827g), iH);
            i10 -= iH;
            g(iH);
        }
    }
}
