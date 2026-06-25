package V2;

import U2.C2248i;
import U2.C2253n;
import U2.E;
import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import U2.O;
import U2.r;
import U2.u;
import java.io.EOFException;
import java.util.Arrays;
import q2.C6080L;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC2255p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f19711s = new u() { // from class: V2.a
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return b.d();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f19712t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[] f19713u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f19714v = a0.z0("#!AMR\n");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f19715w = a0.z0("#!AMR-WB\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f19716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f19718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f19727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private O f19728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private O f19729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private J f19730o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19731p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f19732q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f19733r;

    public b() {
        this(0);
    }

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new b()};
    }

    private void e() {
        AbstractC6614a.i(this.f19728m);
        a0.l(this.f19727l);
    }

    private static int g(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private J j(long j10, boolean z10) {
        return new C2248i(j10, this.f19723h, g(this.f19724i, 20000L), this.f19724i, z10);
    }

    private int k(int i10) throws C6080L {
        if (o(i10)) {
            return this.f19719d ? f19713u[i10] : f19712t[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f19719d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw C6080L.a(sb2.toString(), null);
    }

    private boolean m(int i10) {
        if (this.f19719d) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    private boolean n(long j10, long j11) {
        return Math.abs(j11 - j10) < 20000;
    }

    private boolean o(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return p(i10) || m(i10);
    }

    private boolean p(int i10) {
        if (this.f19719d) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    private void q() {
        if (this.f19733r) {
            return;
        }
        this.f19733r = true;
        boolean z10 = this.f19719d;
        String str = z10 ? "audio/amr-wb" : "audio/amr";
        this.f19728m.c(new C6109x.b().W(str).y0(z10 ? "audio/amr-wb" : "audio/3gpp").o0(z10 ? f19713u[8] : f19712t[7]).T(1).z0(z10 ? 16000 : 8000).P());
    }

    private void r(long j10, int i10) {
        int i11;
        if (this.f19730o != null) {
            return;
        }
        int i12 = this.f19717b;
        if ((i12 & 4) != 0) {
            this.f19730o = new E(new long[]{this.f19723h}, new long[]{0}, -9223372036854775807L);
        } else if ((i12 & 1) == 0 || !((i11 = this.f19724i) == -1 || i11 == this.f19721f)) {
            this.f19730o = new J.b(-9223372036854775807L);
        } else if (this.f19725j >= 20 || i10 == -1) {
            J j11 = j(j10, (i12 & 2) != 0);
            this.f19730o = j11;
            this.f19728m.d(j11.n());
        }
        J j12 = this.f19730o;
        if (j12 != null) {
            this.f19727l.t(j12);
        }
    }

    private static boolean s(InterfaceC2256q interfaceC2256q, byte[] bArr) {
        interfaceC2256q.g();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC2256q.o(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int t(InterfaceC2256q interfaceC2256q) throws C6080L {
        interfaceC2256q.g();
        interfaceC2256q.o(this.f19716a, 0, 1);
        byte b10 = this.f19716a[0];
        if ((b10 & 131) <= 0) {
            return k((b10 >> 3) & 15);
        }
        throw C6080L.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean u(InterfaceC2256q interfaceC2256q) {
        byte[] bArr = f19714v;
        if (s(interfaceC2256q, bArr)) {
            this.f19719d = false;
            interfaceC2256q.m(bArr.length);
            return true;
        }
        byte[] bArr2 = f19715w;
        if (!s(interfaceC2256q, bArr2)) {
            return false;
        }
        this.f19719d = true;
        interfaceC2256q.m(bArr2.length);
        return true;
    }

    private int v(InterfaceC2256q interfaceC2256q) throws C6080L {
        if (this.f19722g == 0) {
            try {
                int iT = t(interfaceC2256q);
                this.f19721f = iT;
                this.f19722g = iT;
                if (this.f19724i == -1) {
                    this.f19723h = interfaceC2256q.getPosition();
                    this.f19724i = this.f19721f;
                }
                if (this.f19724i == this.f19721f) {
                    this.f19725j++;
                }
                J j10 = this.f19730o;
                if (j10 instanceof E) {
                    E e10 = (E) j10;
                    long j11 = this.f19726k + this.f19720e + 20000;
                    long position = interfaceC2256q.getPosition() + ((long) this.f19721f);
                    if (!e10.b(j11, 100000L)) {
                        e10.a(j11, position);
                    }
                    if (this.f19731p && n(j11, this.f19732q)) {
                        this.f19731p = false;
                        this.f19729n = this.f19728m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iE = this.f19729n.e(interfaceC2256q, this.f19722g, true);
        if (iE == -1) {
            return -1;
        }
        int i10 = this.f19722g - iE;
        this.f19722g = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f19729n.a(this.f19726k + this.f19720e, 1, this.f19721f, 0, null);
        this.f19720e += 20000;
        return 0;
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f19720e = 0L;
        this.f19721f = 0;
        this.f19722g = 0;
        this.f19732q = j11;
        J j12 = this.f19730o;
        if (!(j12 instanceof E)) {
            if (j10 == 0 || !(j12 instanceof C2248i)) {
                this.f19726k = 0L;
                return;
            } else {
                this.f19726k = ((C2248i) j12).b(j10);
                return;
            }
        }
        long jD = ((E) j12).d(j10);
        this.f19726k = jD;
        if (n(jD, this.f19732q)) {
            return;
        }
        this.f19731p = true;
        this.f19729n = this.f19718c;
    }

    @Override // U2.InterfaceC2255p
    public void c(r rVar) {
        this.f19727l = rVar;
        O oE = rVar.e(0, 1);
        this.f19728m = oE;
        this.f19729n = oE;
        rVar.p();
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        return u(interfaceC2256q);
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) throws C6080L {
        e();
        if (interfaceC2256q.getPosition() == 0 && !u(interfaceC2256q)) {
            throw C6080L.a("Could not find AMR header.", null);
        }
        q();
        int iV = v(interfaceC2256q);
        r(interfaceC2256q.getLength(), iV);
        if (iV == -1) {
            J j10 = this.f19730o;
            if (j10 instanceof E) {
                long j11 = this.f19726k + this.f19720e;
                ((E) j10).c(j11);
                this.f19727l.t(this.f19730o);
                this.f19728m.d(j11);
            }
        }
        return iV;
    }

    public b(int i10) {
        this.f19717b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f19716a = new byte[1];
        this.f19724i = -1;
        C2253n c2253n = new C2253n();
        this.f19718c = c2253n;
        this.f19729n = c2253n;
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
