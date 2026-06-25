package dh;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class k extends j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static a f45695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static a[] f45696m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f45697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f45698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f45699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f45700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f45701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f45702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f45703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Fg.j f45704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f45705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l f45706k;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45707a;

        a(int i10) {
            this.f45707a = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).f45707a == this.f45707a;
        }

        public int hashCode() {
            return this.f45707a;
        }
    }

    static {
        a aVar = new a(1);
        f45695l = aVar;
        a[] aVarArr = new a[129];
        f45696m = aVarArr;
        aVarArr[1] = aVar;
        int i10 = 2;
        while (true) {
            a[] aVarArr2 = f45696m;
            if (i10 >= aVarArr2.length) {
                return;
            }
            aVarArr2[i10] = new a(i10);
            i10++;
        }
    }

    public k(n nVar, e eVar, int i10, byte[] bArr, int i11, byte[] bArr2) {
        super(true);
        this.f45698c = nVar;
        this.f45699d = eVar;
        this.f45705j = i10;
        this.f45697b = Oh.a.f(bArr);
        this.f45700e = i11;
        this.f45701f = Oh.a.f(bArr2);
        this.f45703h = 1 << (nVar.c() + 1);
        this.f45702g = new WeakHashMap();
        this.f45704i = AbstractC4631b.d(nVar);
    }

    private byte[] b(int i10) {
        int iC = 1 << n().c();
        if (i10 >= iC) {
            p.a(f(), this.f45704i);
            p.c(i10, this.f45704i);
            p.b((short) -32126, this.f45704i);
            p.a(o.d(l(), f(), i10 - iC, j()), this.f45704i);
            byte[] bArr = new byte[this.f45704i.d()];
            this.f45704i.a(bArr, 0);
            return bArr;
        }
        int i11 = i10 * 2;
        byte[] bArrC = c(i11);
        byte[] bArrC2 = c(i11 + 1);
        p.a(f(), this.f45704i);
        p.c(i10, this.f45704i);
        p.b((short) -31869, this.f45704i);
        p.a(bArrC, this.f45704i);
        p.a(bArrC2, this.f45704i);
        byte[] bArr2 = new byte[this.f45704i.d()];
        this.f45704i.a(bArr2, 0);
        return bArr2;
    }

    private byte[] d(a aVar) {
        byte[] bArrB;
        synchronized (this.f45702g) {
            try {
                bArrB = (byte[]) this.f45702g.get(aVar);
                if (bArrB == null) {
                    bArrB = b(aVar.f45707a);
                    this.f45702g.put(aVar, bArrB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrB;
    }

    public static k i(Object obj) throws Throwable {
        Throwable th2;
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("expected version 0 lms private key");
            }
            n nVarE = n.e(dataInputStream.readInt());
            e eVarF = e.f(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int i10 = dataInputStream.readInt();
            int i11 = dataInputStream.readInt();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IllegalStateException("secret length less than zero");
            }
            if (i12 <= dataInputStream.available()) {
                byte[] bArr2 = new byte[i12];
                dataInputStream.readFully(bArr2);
                return new k(nVarE, eVarF, i10, bArr, i11, bArr2);
            }
            throw new IOException("secret length exceeded " + dataInputStream.available());
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return i(Qh.a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                k kVarI = i(dataInputStream3);
                dataInputStream3.close();
                return kVarI;
            } catch (Throwable th3) {
                th2 = th3;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 == null) {
                    throw th2;
                }
                dataInputStream2.close();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    byte[] c(int i10) {
        if (i10 >= this.f45703h) {
            return b(i10);
        }
        a[] aVarArr = f45696m;
        return d(i10 < aVarArr.length ? aVarArr[i10] : new a(i10));
    }

    public i e() {
        int iC = n().c();
        int iG = g();
        f fVarK = k();
        int i10 = (1 << iC) + iG;
        byte[][] bArr = new byte[iC][];
        for (int i11 = 0; i11 < iC; i11++) {
            bArr[i11] = c((i10 / (1 << i11)) ^ 1);
        }
        return fVarK.e(n(), bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f45705j != kVar.f45705j || this.f45700e != kVar.f45700e || !Oh.a.c(this.f45697b, kVar.f45697b)) {
            return false;
        }
        n nVar = this.f45698c;
        if (nVar == null ? kVar.f45698c != null : !nVar.equals(kVar.f45698c)) {
            return false;
        }
        e eVar = this.f45699d;
        if (eVar == null ? kVar.f45699d == null : eVar.equals(kVar.f45699d)) {
            return Oh.a.c(this.f45701f, kVar.f45701f);
        }
        return false;
    }

    public byte[] f() {
        return Oh.a.f(this.f45697b);
    }

    public synchronized int g() {
        return this.f45705j;
    }

    @Override // dh.j, Oh.c
    public byte[] getEncoded() {
        return C4630a.f().i(0).i(this.f45698c.f()).i(this.f45699d.g()).d(this.f45697b).i(this.f45705j).i(this.f45700e).i(this.f45701f.length).d(this.f45701f).b();
    }

    public int h() {
        return this.f45700e;
    }

    public int hashCode() {
        int iQ = ((this.f45705j * 31) + Oh.a.q(this.f45697b)) * 31;
        n nVar = this.f45698c;
        int iHashCode = (iQ + (nVar != null ? nVar.hashCode() : 0)) * 31;
        e eVar = this.f45699d;
        return ((((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f45700e) * 31) + Oh.a.q(this.f45701f);
    }

    public byte[] j() {
        return Oh.a.f(this.f45701f);
    }

    f k() {
        f fVar;
        synchronized (this) {
            try {
                int i10 = this.f45705j;
                if (i10 >= this.f45700e) {
                    throw new Wg.a("ots private key exhausted");
                }
                fVar = new f(this.f45699d, this.f45697b, i10, this.f45701f);
                o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public e l() {
        return this.f45699d;
    }

    public l m() {
        l lVar;
        synchronized (this) {
            try {
                if (this.f45706k == null) {
                    this.f45706k = new l(this.f45698c, this.f45699d, d(f45695l), this.f45697b);
                }
                lVar = this.f45706k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    public n n() {
        return this.f45698c;
    }

    synchronized void o() {
        this.f45705j++;
    }
}
