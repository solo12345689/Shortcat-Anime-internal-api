package m3;

import U2.InterfaceC2256q;
import java.util.ArrayDeque;
import q2.C6080L;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: m3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5633a implements InterfaceC5635c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f53055a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f53056b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5639g f53057c = new C5639g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC5634b f53058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f53061g;

    /* JADX INFO: renamed from: m3.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f53062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f53063b;

        private b(int i10, long j10) {
            this.f53062a = i10;
            this.f53063b = j10;
        }
    }

    private long c(InterfaceC2256q interfaceC2256q) {
        interfaceC2256q.g();
        while (true) {
            interfaceC2256q.o(this.f53055a, 0, 4);
            int iC = C5639g.c(this.f53055a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) C5639g.a(this.f53055a, iC, false);
                if (this.f53058d.f(iA)) {
                    interfaceC2256q.m(iC);
                    return iA;
                }
            }
            interfaceC2256q.m(1);
        }
    }

    private double d(InterfaceC2256q interfaceC2256q, int i10) {
        return i10 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(e(interfaceC2256q, i10));
    }

    private long e(InterfaceC2256q interfaceC2256q, int i10) {
        interfaceC2256q.readFully(this.f53055a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f53055a[i11] & 255));
        }
        return j10;
    }

    private static String f(InterfaceC2256q interfaceC2256q, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        interfaceC2256q.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // m3.InterfaceC5635c
    public void a(InterfaceC5634b interfaceC5634b) {
        this.f53058d = interfaceC5634b;
    }

    @Override // m3.InterfaceC5635c
    public boolean b(InterfaceC2256q interfaceC2256q) throws C6080L {
        AbstractC6614a.i(this.f53058d);
        while (true) {
            b bVar = (b) this.f53056b.peek();
            if (bVar != null && interfaceC2256q.getPosition() >= bVar.f53063b) {
                this.f53058d.a(((b) this.f53056b.pop()).f53062a);
                return true;
            }
            if (this.f53059e == 0) {
                long jD = this.f53057c.d(interfaceC2256q, true, false, 4);
                if (jD == -2) {
                    jD = c(interfaceC2256q);
                }
                if (jD == -1) {
                    return false;
                }
                this.f53060f = (int) jD;
                this.f53059e = 1;
            }
            if (this.f53059e == 1) {
                this.f53061g = this.f53057c.d(interfaceC2256q, false, true, 8);
                this.f53059e = 2;
            }
            int iE = this.f53058d.e(this.f53060f);
            if (iE != 0) {
                if (iE == 1) {
                    long position = interfaceC2256q.getPosition();
                    this.f53056b.push(new b(this.f53060f, this.f53061g + position));
                    this.f53058d.h(this.f53060f, position, this.f53061g);
                    this.f53059e = 0;
                    return true;
                }
                if (iE == 2) {
                    long j10 = this.f53061g;
                    if (j10 <= 8) {
                        this.f53058d.d(this.f53060f, e(interfaceC2256q, (int) j10));
                        this.f53059e = 0;
                        return true;
                    }
                    throw C6080L.a("Invalid integer size: " + this.f53061g, null);
                }
                if (iE == 3) {
                    long j11 = this.f53061g;
                    if (j11 <= 2147483647L) {
                        this.f53058d.g(this.f53060f, f(interfaceC2256q, (int) j11));
                        this.f53059e = 0;
                        return true;
                    }
                    throw C6080L.a("String element size: " + this.f53061g, null);
                }
                if (iE == 4) {
                    this.f53058d.c(this.f53060f, (int) this.f53061g, interfaceC2256q);
                    this.f53059e = 0;
                    return true;
                }
                if (iE != 5) {
                    throw C6080L.a("Invalid element type " + iE, null);
                }
                long j12 = this.f53061g;
                if (j12 == 4 || j12 == 8) {
                    this.f53058d.b(this.f53060f, d(interfaceC2256q, (int) j12));
                    this.f53059e = 0;
                    return true;
                }
                throw C6080L.a("Invalid float size: " + this.f53061g, null);
            }
            interfaceC2256q.m((int) this.f53061g);
            this.f53059e = 0;
        }
    }

    @Override // m3.InterfaceC5635c
    public void reset() {
        this.f53059e = 0;
        this.f53056b.clear();
        this.f53057c.e();
    }
}
