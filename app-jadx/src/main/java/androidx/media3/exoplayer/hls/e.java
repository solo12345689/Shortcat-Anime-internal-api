package androidx.media3.exoplayer.hls;

import B2.K1;
import H2.f;
import N2.m;
import P9.AbstractC2011u;
import Q2.f;
import U2.C2249j;
import U2.InterfaceC2256q;
import android.net.Uri;
import androidx.media3.exoplayer.hls.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C6078J;
import q2.C6102q;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.O;
import t2.Q;
import w2.InterfaceC6940g;
import w2.n;
import w2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class e extends m {

    /* JADX INFO: renamed from: O */
    private static final AtomicInteger f30868O = new AtomicInteger();

    /* JADX INFO: renamed from: A */
    private final boolean f30869A;

    /* JADX INFO: renamed from: B */
    private final boolean f30870B;

    /* JADX INFO: renamed from: C */
    private final K1 f30871C;

    /* JADX INFO: renamed from: D */
    private final long f30872D;

    /* JADX INFO: renamed from: E */
    private G2.f f30873E;

    /* JADX INFO: renamed from: F */
    private l f30874F;

    /* JADX INFO: renamed from: G */
    private int f30875G;

    /* JADX INFO: renamed from: H */
    private boolean f30876H;

    /* JADX INFO: renamed from: I */
    private volatile boolean f30877I;

    /* JADX INFO: renamed from: J */
    private boolean f30878J;

    /* JADX INFO: renamed from: K */
    private AbstractC2011u f30879K;

    /* JADX INFO: renamed from: L */
    private boolean f30880L;

    /* JADX INFO: renamed from: M */
    private long f30881M;

    /* JADX INFO: renamed from: N */
    private boolean f30882N;

    /* JADX INFO: renamed from: k */
    public final int f30883k;

    /* JADX INFO: renamed from: l */
    public final int f30884l;

    /* JADX INFO: renamed from: m */
    public final Uri f30885m;

    /* JADX INFO: renamed from: n */
    public final boolean f30886n;

    /* JADX INFO: renamed from: o */
    public final int f30887o;

    /* JADX INFO: renamed from: p */
    private final InterfaceC6940g f30888p;

    /* JADX INFO: renamed from: q */
    private final o f30889q;

    /* JADX INFO: renamed from: r */
    private final G2.f f30890r;

    /* JADX INFO: renamed from: s */
    private final boolean f30891s;

    /* JADX INFO: renamed from: t */
    private final boolean f30892t;

    /* JADX INFO: renamed from: u */
    private final O f30893u;

    /* JADX INFO: renamed from: v */
    private final G2.e f30894v;

    /* JADX INFO: renamed from: w */
    private final List f30895w;

    /* JADX INFO: renamed from: x */
    private final C6102q f30896x;

    /* JADX INFO: renamed from: y */
    private final i3.h f30897y;

    /* JADX INFO: renamed from: z */
    private final C6609I f30898z;

    private e(G2.e eVar, InterfaceC6940g interfaceC6940g, o oVar, C6109x c6109x, boolean z10, InterfaceC6940g interfaceC6940g2, o oVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, O o10, long j13, C6102q c6102q, G2.f fVar, i3.h hVar, C6609I c6609i, boolean z15, boolean z16, K1 k12) {
        super(interfaceC6940g, oVar, c6109x, i10, obj, j10, j11, j12);
        this.f30869A = z10;
        this.f30887o = i11;
        this.f30881M = z12 ? j11 - j10 : -9223372036854775807L;
        this.f30884l = i12;
        this.f30889q = oVar2;
        this.f30888p = interfaceC6940g2;
        this.f30876H = oVar2 != null;
        this.f30870B = z11;
        this.f30885m = uri;
        this.f30891s = z14;
        this.f30893u = o10;
        this.f30872D = j13;
        this.f30892t = z13;
        this.f30894v = eVar;
        this.f30895w = list;
        this.f30896x = c6102q;
        this.f30890r = fVar;
        this.f30897y = hVar;
        this.f30898z = c6609i;
        this.f30882N = z15;
        this.f30886n = z16;
        this.f30871C = k12;
        this.f30879K = AbstractC2011u.A();
        this.f30883k = f30868O.getAndIncrement();
    }

    private static InterfaceC6940g i(InterfaceC6940g interfaceC6940g, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return interfaceC6940g;
        }
        AbstractC6614a.e(bArr2);
        return new a(interfaceC6940g, bArr, bArr2);
    }

    public static e k(G2.e eVar, InterfaceC6940g interfaceC6940g, C6109x c6109x, long j10, H2.f fVar, c.e eVar2, Uri uri, List list, int i10, Object obj, boolean z10, G2.j jVar, long j11, e eVar3, byte[] bArr, byte[] bArr2, boolean z11, boolean z12, K1 k12, f.a aVar) {
        boolean z13;
        InterfaceC6940g interfaceC6940gI;
        o oVarA;
        boolean z14;
        Uri uri2;
        i3.h hVar;
        C6609I c6609i;
        G2.f fVar2;
        f.g gVar = eVar2.f30862a;
        o oVarA2 = new o.b().i(Q.g(fVar.f7823a, gVar.f7786a)).h(gVar.f7794i).g(gVar.f7795j).b(eVar2.f30865d ? 8 : 0).a();
        boolean z15 = bArr != null;
        InterfaceC6940g interfaceC6940gI2 = i(interfaceC6940g, bArr, z15 ? m((String) AbstractC6614a.e(gVar.f7793h)) : null);
        f.C0100f c0100f = gVar.f7787b;
        if (c0100f != null) {
            boolean z16 = bArr2 != null;
            byte[] bArrM = z16 ? m((String) AbstractC6614a.e(c0100f.f7793h)) : null;
            z13 = true;
            oVarA = new o.b().i(Q.g(fVar.f7823a, c0100f.f7786a)).h(c0100f.f7794i).g(c0100f.f7795j).a();
            interfaceC6940gI = i(interfaceC6940g, bArr2, bArrM);
            z14 = z16;
        } else {
            z13 = true;
            interfaceC6940gI = null;
            oVarA = null;
            z14 = false;
        }
        long j12 = j10 + gVar.f7790e;
        long j13 = j12 + gVar.f7788c;
        int i11 = fVar.f7727j + gVar.f7789d;
        if (eVar3 != null) {
            o oVar = eVar3.f30889q;
            boolean z17 = (oVarA == oVar || (oVarA != null && oVar != null && oVarA.f62825a.equals(oVar.f62825a) && oVarA.f62831g == eVar3.f30889q.f62831g)) ? z13 : false;
            uri2 = uri;
            boolean z18 = (uri2.equals(eVar3.f30885m) && eVar3.f30878J) ? z13 : false;
            hVar = eVar3.f30897y;
            c6609i = eVar3.f30898z;
            fVar2 = (z17 && z18 && !eVar3.f30880L && eVar3.f30884l == i11) ? eVar3.f30873E : null;
        } else {
            uri2 = uri;
            hVar = new i3.h();
            c6609i = new C6609I(10);
            fVar2 = null;
        }
        return new e(eVar, interfaceC6940gI2, oVarA2, c6109x, z15, interfaceC6940gI, oVarA, z14, uri2, list, i10, obj, j12, j13, eVar2.f30863b, eVar2.f30864c, !eVar2.f30865d, i11, gVar.f7796k, z10, jVar.a(i11), j11, gVar.f7791f, fVar2, hVar, c6609i, z11, z12, k12);
    }

    private void l(InterfaceC6940g interfaceC6940g, o oVar, boolean z10, boolean z11) {
        o oVarE;
        long position;
        if (z10) {
            z = this.f30875G != 0;
            oVarE = oVar;
        } else {
            oVarE = oVar.e(this.f30875G);
        }
        try {
            C2249j c2249jV = v(interfaceC6940g, oVarE, z11);
            if (z) {
                c2249jV.m(this.f30875G);
            }
            do {
                try {
                    try {
                        if (this.f30877I) {
                            break;
                        }
                    } catch (EOFException e10) {
                        if ((this.f12608d.f57013f & 16384) == 0) {
                            throw e10;
                        }
                        this.f30873E.d();
                        position = c2249jV.getPosition();
                    }
                } catch (Throwable th2) {
                    this.f30875G = (int) (c2249jV.getPosition() - oVar.f62831g);
                    throw th2;
                }
            } while (this.f30873E.b(c2249jV));
            position = c2249jV.getPosition();
            this.f30875G = (int) (position - oVar.f62831g);
        } finally {
            n.a(interfaceC6940g);
        }
    }

    private static byte[] m(String str) {
        if (O9.c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private void s() {
        l(this.f12613i, this.f12606b, this.f30869A, true);
    }

    private void t() {
        if (this.f30876H) {
            AbstractC6614a.e(this.f30888p);
            AbstractC6614a.e(this.f30889q);
            l(this.f30888p, this.f30889q, this.f30870B, false);
            this.f30875G = 0;
            this.f30876H = false;
        }
    }

    private long u(InterfaceC2256q interfaceC2256q) throws Throwable {
        interfaceC2256q.g();
        try {
            this.f30898z.X(10);
            interfaceC2256q.o(this.f30898z.f(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f30898z.P() != 4801587) {
            return -9223372036854775807L;
        }
        this.f30898z.c0(3);
        int iL = this.f30898z.L();
        int i10 = iL + 10;
        if (i10 > this.f30898z.b()) {
            byte[] bArrF = this.f30898z.f();
            this.f30898z.X(i10);
            System.arraycopy(bArrF, 0, this.f30898z.f(), 0, 10);
        }
        interfaceC2256q.o(this.f30898z.f(), 10, iL);
        C6078J c6078jE = this.f30897y.e(this.f30898z.f(), iL);
        if (c6078jE == null) {
            return -9223372036854775807L;
        }
        int iE = c6078jE.e();
        for (int i11 = 0; i11 < iE; i11++) {
            C6078J.a aVarD = c6078jE.d(i11);
            if (aVarD instanceof i3.m) {
                i3.m mVar = (i3.m) aVarD;
                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f48630b)) {
                    System.arraycopy(mVar.f48631c, 0, this.f30898z.f(), 0, 8);
                    this.f30898z.b0(0);
                    this.f30898z.a0(8);
                    return this.f30898z.F() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private C2249j v(InterfaceC6940g interfaceC6940g, o oVar, boolean z10) throws Throwable {
        G2.f fVarE;
        long jA = interfaceC6940g.a(oVar);
        if (z10) {
            try {
                this.f30893u.j(this.f30891s, this.f12611g, this.f30872D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e10) {
                throw new IOException(e10);
            }
        }
        C2249j c2249j = new C2249j(interfaceC6940g, oVar.f62831g, jA);
        if (this.f30873E == null) {
            long jU = u(c2249j);
            c2249j.g();
            G2.f fVar = this.f30890r;
            if (fVar != null) {
                fVarE = fVar.g();
            } else {
                fVarE = this.f30894v.e(oVar.f62825a, this.f12608d, this.f30895w, this.f30893u, interfaceC6940g.f(), c2249j, this.f30871C);
                c2249j = c2249j;
            }
            this.f30873E = fVarE;
            if (fVarE.f()) {
                this.f30874F.r0(jU != -9223372036854775807L ? this.f30893u.b(jU) : this.f12611g);
            } else {
                this.f30874F.r0(0L);
            }
            this.f30874F.d0();
            this.f30873E.c(this.f30874F);
        }
        this.f30874F.o0(this.f30896x);
        return c2249j;
    }

    public static boolean y(e eVar, long j10, Uri uri, boolean z10, c.e eVar2, long j11) {
        if (eVar == null) {
            return false;
        }
        if (uri.equals(eVar.f30885m) && eVar.f30878J) {
            return false;
        }
        return !z10 || j11 + eVar2.f30862a.f7790e < j10;
    }

    @Override // Q2.m.e
    public void a() {
        G2.f fVar;
        AbstractC6614a.e(this.f30874F);
        if (this.f30873E == null && (fVar = this.f30890r) != null && fVar.e()) {
            this.f30873E = this.f30890r;
            this.f30876H = false;
        }
        t();
        if (this.f30877I) {
            return;
        }
        if (!this.f30892t) {
            s();
        }
        this.f30878J = !this.f30877I;
    }

    @Override // Q2.m.e
    public void c() {
        this.f30877I = true;
    }

    @Override // N2.m
    public boolean h() {
        return this.f30878J;
    }

    public void j() {
        this.f30882N = false;
    }

    public int n(int i10) {
        AbstractC6614a.g(!this.f30882N);
        if (i10 >= this.f30879K.size()) {
            return 0;
        }
        return ((Integer) this.f30879K.get(i10)).intValue();
    }

    public long o() {
        long j10 = this.f30881M;
        if (j10 != -9223372036854775807L) {
            return this.f12611g + j10;
        }
        return -9223372036854775807L;
    }

    public void p(l lVar, AbstractC2011u abstractC2011u) {
        this.f30874F = lVar;
        this.f30879K = abstractC2011u;
    }

    public void q() {
        this.f30880L = true;
    }

    public boolean r() {
        return this.f30881M != -9223372036854775807L;
    }

    public void w(long j10) {
        this.f30881M = j10;
    }

    public boolean x() {
        return this.f30882N;
    }
}
