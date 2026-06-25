package B3;

import B3.L;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import io.sentry.C5322z3;
import t2.AbstractC6614a;
import t2.C6608H;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC2255p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final U2.u f1063l = new U2.u() { // from class: B3.B
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return C.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t2.O f1064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f1065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6609I f1066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A f1067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f1071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z f1072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private U2.r f1073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1074k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC1095m f1075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t2.O f1076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C6608H f1077c = new C6608H(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1080f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f1081g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f1082h;

        public a(InterfaceC1095m interfaceC1095m, t2.O o10) {
            this.f1075a = interfaceC1095m;
            this.f1076b = o10;
        }

        private void b() {
            this.f1077c.r(8);
            this.f1078d = this.f1077c.g();
            this.f1079e = this.f1077c.g();
            this.f1077c.r(6);
            this.f1081g = this.f1077c.h(8);
        }

        private void c() {
            this.f1082h = 0L;
            if (this.f1078d) {
                this.f1077c.r(4);
                long jH = ((long) this.f1077c.h(3)) << 30;
                this.f1077c.r(1);
                long jH2 = jH | ((long) (this.f1077c.h(15) << 15));
                this.f1077c.r(1);
                long jH3 = jH2 | ((long) this.f1077c.h(15));
                this.f1077c.r(1);
                if (!this.f1080f && this.f1079e) {
                    this.f1077c.r(4);
                    long jH4 = ((long) this.f1077c.h(3)) << 30;
                    this.f1077c.r(1);
                    long jH5 = jH4 | ((long) (this.f1077c.h(15) << 15));
                    this.f1077c.r(1);
                    long jH6 = jH5 | ((long) this.f1077c.h(15));
                    this.f1077c.r(1);
                    this.f1076b.b(jH6);
                    this.f1080f = true;
                }
                this.f1082h = this.f1076b.b(jH3);
            }
        }

        public void a(C6609I c6609i) {
            c6609i.q(this.f1077c.f60526a, 0, 3);
            this.f1077c.p(0);
            b();
            c6609i.q(this.f1077c.f60526a, 0, this.f1081g);
            this.f1077c.p(0);
            c();
            this.f1075a.f(this.f1082h, 4);
            this.f1075a.b(c6609i);
            this.f1075a.d(false);
        }

        public void d() {
            this.f1080f = false;
            this.f1075a.c();
        }
    }

    public C() {
        this(new t2.O(0L));
    }

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new C()};
    }

    private void e(long j10) {
        if (this.f1074k) {
            return;
        }
        this.f1074k = true;
        if (this.f1067d.c() == -9223372036854775807L) {
            this.f1073j.t(new J.b(this.f1067d.c()));
            return;
        }
        z zVar = new z(this.f1067d.d(), this.f1067d.c(), j10);
        this.f1072i = zVar;
        this.f1073j.t(zVar.b());
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        boolean z10 = this.f1064a.f() == -9223372036854775807L;
        if (!z10) {
            long jD = this.f1064a.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            this.f1064a.i(j11);
        }
        z zVar = this.f1072i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f1065b.size(); i10++) {
            ((a) this.f1065b.valueAt(i10)).d();
        }
    }

    @Override // U2.InterfaceC2255p
    public void c(U2.r rVar) {
        this.f1073j = rVar;
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        byte[] bArr = new byte[14];
        interfaceC2256q.o(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC2256q.k(bArr[13] & 7);
        interfaceC2256q.o(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, U2.I i10) {
        InterfaceC1095m c1096n;
        AbstractC6614a.i(this.f1073j);
        long length = interfaceC2256q.getLength();
        if (length != -1 && !this.f1067d.e()) {
            return this.f1067d.g(interfaceC2256q, i10);
        }
        e(length);
        z zVar = this.f1072i;
        if (zVar != null && zVar.d()) {
            return this.f1072i.c(interfaceC2256q, i10);
        }
        interfaceC2256q.g();
        long j10 = length != -1 ? length - interfaceC2256q.j() : -1L;
        if ((j10 != -1 && j10 < 4) || !interfaceC2256q.e(this.f1066c.f(), 0, 4, true)) {
            return -1;
        }
        this.f1066c.b0(0);
        int iV = this.f1066c.v();
        if (iV == 441) {
            return -1;
        }
        if (iV == 442) {
            interfaceC2256q.o(this.f1066c.f(), 0, 10);
            this.f1066c.b0(9);
            interfaceC2256q.m((this.f1066c.M() & 7) + 14);
            return 0;
        }
        if (iV == 443) {
            interfaceC2256q.o(this.f1066c.f(), 0, 2);
            this.f1066c.b0(0);
            interfaceC2256q.m(this.f1066c.U() + 6);
            return 0;
        }
        if (((iV & (-256)) >> 8) != 1) {
            interfaceC2256q.m(1);
            return 0;
        }
        int i11 = iV & 255;
        a aVar = (a) this.f1065b.get(i11);
        if (!this.f1068e) {
            if (aVar == null) {
                if (i11 == 189) {
                    c1096n = new C1085c("video/mp2p");
                    this.f1069f = true;
                    this.f1071h = interfaceC2256q.getPosition();
                } else if ((iV & 224) == 192) {
                    c1096n = new t("video/mp2p");
                    this.f1069f = true;
                    this.f1071h = interfaceC2256q.getPosition();
                } else if ((iV & 240) == 224) {
                    c1096n = new C1096n("video/mp2p");
                    this.f1070g = true;
                    this.f1071h = interfaceC2256q.getPosition();
                } else {
                    c1096n = null;
                }
                if (c1096n != null) {
                    c1096n.e(this.f1073j, new L.d(i11, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
                    aVar = new a(c1096n, this.f1064a);
                    this.f1065b.put(i11, aVar);
                }
            }
            if (interfaceC2256q.getPosition() > ((this.f1069f && this.f1070g) ? this.f1071h + 8192 : C5322z3.MAX_EVENT_SIZE_BYTES)) {
                this.f1068e = true;
                this.f1073j.p();
            }
        }
        interfaceC2256q.o(this.f1066c.f(), 0, 2);
        this.f1066c.b0(0);
        int iU = this.f1066c.U() + 6;
        if (aVar == null) {
            interfaceC2256q.m(iU);
        } else {
            this.f1066c.X(iU);
            interfaceC2256q.readFully(this.f1066c.f(), 0, iU);
            this.f1066c.b0(6);
            aVar.a(this.f1066c);
            C6609I c6609i = this.f1066c;
            c6609i.a0(c6609i.b());
        }
        return 0;
    }

    public C(t2.O o10) {
        this.f1064a = o10;
        this.f1066c = new C6609I(4096);
        this.f1065b = new SparseArray();
        this.f1067d = new A();
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
