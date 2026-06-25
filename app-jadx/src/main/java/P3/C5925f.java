package p3;

import U2.AbstractC2257s;
import U2.InterfaceC2256q;
import q2.C6080L;
import t2.C6609I;

/* JADX INFO: renamed from: p3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5925f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f55764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f55765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f55766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f55767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f55770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f55771j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C6609I f55772k = new C6609I(255);

    C5925f() {
    }

    public boolean a(InterfaceC2256q interfaceC2256q, boolean z10) throws C6080L {
        b();
        this.f55772k.X(27);
        if (!AbstractC2257s.c(interfaceC2256q, this.f55772k.f(), 0, 27, z10) || this.f55772k.O() != 1332176723) {
            return false;
        }
        int iM = this.f55772k.M();
        this.f55762a = iM;
        if (iM != 0) {
            if (z10) {
                return false;
            }
            throw C6080L.d("unsupported bit stream revision");
        }
        this.f55763b = this.f55772k.M();
        this.f55764c = this.f55772k.A();
        this.f55765d = this.f55772k.C();
        this.f55766e = this.f55772k.C();
        this.f55767f = this.f55772k.C();
        int iM2 = this.f55772k.M();
        this.f55768g = iM2;
        this.f55769h = iM2 + 27;
        this.f55772k.X(iM2);
        if (!AbstractC2257s.c(interfaceC2256q, this.f55772k.f(), 0, this.f55768g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f55768g; i10++) {
            this.f55771j[i10] = this.f55772k.M();
            this.f55770i += this.f55771j[i10];
        }
        return true;
    }

    public void b() {
        this.f55762a = 0;
        this.f55763b = 0;
        this.f55764c = 0L;
        this.f55765d = 0L;
        this.f55766e = 0L;
        this.f55767f = 0L;
        this.f55768g = 0;
        this.f55769h = 0;
        this.f55770i = 0;
    }

    public boolean c(InterfaceC2256q interfaceC2256q) {
        return d(interfaceC2256q, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.b(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(U2.InterfaceC2256q r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.j()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            t2.AbstractC6614a.a(r0)
            t2.I r0 = r8.f55772k
            r3 = 4
            r0.X(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L51
        L2b:
            t2.I r4 = r8.f55772k
            byte[] r4 = r4.f()
            boolean r4 = U2.AbstractC2257s.c(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            t2.I r0 = r8.f55772k
            r0.b0(r1)
            t2.I r0 = r8.f55772k
            long r4 = r0.O()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.g()
            return r2
        L4d:
            r9.m(r2)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r3 = r9.getPosition()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r3 = r9.b(r2)
            r4 = -1
            if (r3 == r4) goto L63
            goto L51
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C5925f.d(U2.q, long):boolean");
    }
}
