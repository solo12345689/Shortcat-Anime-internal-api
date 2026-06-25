package Vg;

import zg.AbstractC7387B;
import zg.AbstractC7428u;
import zg.AbstractC7432y;
import zg.C7402f;
import zg.C7419n0;
import zg.C7420o;
import zg.G;
import zg.r;
import zg.r0;
import zg.u0;

/* JADX INFO: loaded from: classes5.dex */
public class o extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f20378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f20379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f20380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f20381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f20383h;

    public o(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f20376a = 0;
        this.f20377b = i10;
        this.f20378c = Oh.a.f(bArr);
        this.f20379d = Oh.a.f(bArr2);
        this.f20380e = Oh.a.f(bArr3);
        this.f20381f = Oh.a.f(bArr4);
        this.f20383h = Oh.a.f(bArr5);
        this.f20382g = -1;
    }

    public static o p(Object obj) {
        if (obj instanceof o) {
            return (o) obj;
        }
        if (obj != null) {
            return new o(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(this.f20382g >= 0 ? new C7420o(1L) : new C7420o(0L));
        C7402f c7402f2 = new C7402f();
        c7402f2.a(new C7420o(this.f20377b));
        c7402f2.a(new C7419n0(this.f20378c));
        c7402f2.a(new C7419n0(this.f20379d));
        c7402f2.a(new C7419n0(this.f20380e));
        c7402f2.a(new C7419n0(this.f20381f));
        if (this.f20382g >= 0) {
            c7402f2.a(new u0(false, 0, new C7420o(this.f20382g)));
        }
        c7402f.a(new r0(c7402f2));
        c7402f.a(new u0(true, 0, new C7419n0(this.f20383h)));
        return new r0(c7402f);
    }

    public byte[] l() {
        return Oh.a.f(this.f20383h);
    }

    public int n() {
        return this.f20377b;
    }

    public int r() {
        return this.f20382g;
    }

    public byte[] s() {
        return Oh.a.f(this.f20380e);
    }

    public byte[] t() {
        return Oh.a.f(this.f20381f);
    }

    public byte[] u() {
        return Oh.a.f(this.f20379d);
    }

    public byte[] v() {
        return Oh.a.f(this.f20378c);
    }

    public int w() {
        return this.f20376a;
    }

    public o(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i11) {
        this.f20376a = 1;
        this.f20377b = i10;
        this.f20378c = Oh.a.f(bArr);
        this.f20379d = Oh.a.f(bArr2);
        this.f20380e = Oh.a.f(bArr3);
        this.f20381f = Oh.a.f(bArr4);
        this.f20383h = Oh.a.f(bArr5);
        this.f20382g = i11;
    }

    private o(AbstractC7387B abstractC7387B) {
        int iG;
        C7420o c7420oZ = C7420o.z(abstractC7387B.B(0));
        if (!c7420oZ.D(0) && !c7420oZ.D(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f20376a = c7420oZ.G();
        if (abstractC7387B.size() != 2 && abstractC7387B.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        AbstractC7387B abstractC7387BA = AbstractC7387B.A(abstractC7387B.B(1));
        this.f20377b = C7420o.z(abstractC7387BA.B(0)).G();
        this.f20378c = Oh.a.f(AbstractC7428u.z(abstractC7387BA.B(1)).B());
        this.f20379d = Oh.a.f(AbstractC7428u.z(abstractC7387BA.B(2)).B());
        this.f20380e = Oh.a.f(AbstractC7428u.z(abstractC7387BA.B(3)).B());
        this.f20381f = Oh.a.f(AbstractC7428u.z(abstractC7387BA.B(4)).B());
        if (abstractC7387BA.size() == 6) {
            G G10 = G.G(abstractC7387BA.B(5));
            if (G10.K() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            iG = C7420o.A(G10, false).G();
        } else {
            if (abstractC7387BA.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            iG = -1;
        }
        this.f20382g = iG;
        if (abstractC7387B.size() == 3) {
            this.f20383h = Oh.a.f(AbstractC7428u.A(G.G(abstractC7387B.B(2)), true).B());
        } else {
            this.f20383h = null;
        }
    }
}
