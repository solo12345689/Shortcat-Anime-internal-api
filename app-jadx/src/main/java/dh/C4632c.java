package dh;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: dh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4632c extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f45650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f45651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f45652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f45653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f45654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f45655h;

    private C4632c(int i10, List list, List list2, long j10, long j11, boolean z10) {
        super(true);
        this.f45654g = 0L;
        this.f45649b = i10;
        this.f45651d = Collections.unmodifiableList(list);
        this.f45652e = Collections.unmodifiableList(list2);
        this.f45654g = j10;
        this.f45653f = j11;
        this.f45650c = z10;
    }

    public static C4632c c(Object obj) throws Throwable {
        Throwable th2;
        DataInputStream dataInputStream;
        if (obj instanceof C4632c) {
            return (C4632c) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int i10 = dataInputStream2.readInt();
            long j10 = dataInputStream2.readLong();
            long j11 = dataInputStream2.readLong();
            boolean z10 = dataInputStream2.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(k.i(obj));
            }
            for (int i12 = 0; i12 < i10 - 1; i12++) {
                arrayList2.add(m.a(obj));
            }
            return new C4632c(i10, arrayList, arrayList2, j10, j11, z10);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return c(Qh.a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream3 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            try {
                C4632c c4632cC = c(dataInputStream);
                dataInputStream.close();
                return c4632cC;
            } catch (Exception unused) {
                C4632c c4632c = new C4632c(k.i(obj), r4.g(), r4.h());
                dataInputStream.close();
                return c4632c;
            }
        } catch (Throwable th4) {
            th2 = th4;
            dataInputStream3 = dataInputStream;
            if (dataInputStream3 == null) {
                throw th2;
            }
            dataInputStream3.close();
            throw th2;
        }
    }

    public static C4632c d(byte[] bArr, byte[] bArr2) throws Throwable {
        C4632c c4632cC = c(bArr);
        c4632cC.f45655h = d.b(bArr2);
        return c4632cC;
    }

    private static C4632c i(C4632c c4632c) {
        try {
            return c(c4632c.getEncoded());
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public synchronized long b() {
        return this.f45654g;
    }

    protected Object clone() {
        return i(this);
    }

    synchronized List e() {
        return this.f45651d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4632c c4632c = (C4632c) obj;
        if (this.f45649b == c4632c.f45649b && this.f45650c == c4632c.f45650c && this.f45653f == c4632c.f45653f && this.f45654g == c4632c.f45654g && this.f45651d.equals(c4632c.f45651d)) {
            return this.f45652e.equals(c4632c.f45652e);
        }
        return false;
    }

    public int f() {
        return this.f45649b;
    }

    public synchronized d g() {
        return new d(this.f45649b, h().m());
    }

    @Override // dh.j, Oh.c
    public synchronized byte[] getEncoded() {
        C4630a c4630aA;
        try {
            c4630aA = C4630a.f().i(0).i(this.f45649b).j(this.f45654g).j(this.f45653f).a(this.f45650c);
            Iterator it = this.f45651d.iterator();
            while (it.hasNext()) {
                c4630aA.c((k) it.next());
            }
            Iterator it2 = this.f45652e.iterator();
            while (it2.hasNext()) {
                c4630aA.c((m) it2.next());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c4630aA.b();
    }

    k h() {
        return (k) this.f45651d.get(0);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f45649b * 31) + (this.f45650c ? 1 : 0)) * 31) + this.f45651d.hashCode()) * 31) + this.f45652e.hashCode()) * 31;
        long j10 = this.f45653f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f45654g;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    void j() {
        boolean z10;
        List listE = e();
        int size = listE.size();
        long[] jArr = new long[size];
        long jB = b();
        for (int size2 = listE.size() - 1; size2 >= 0; size2--) {
            n nVarN = ((k) listE.get(size2)).n();
            jArr[size2] = ((long) ((1 << nVarN.c()) - 1)) & jB;
            jB >>>= nVarN.c();
        }
        k[] kVarArr = (k[]) listE.toArray(new k[listE.size()]);
        List list = this.f45652e;
        m[] mVarArr = (m[]) list.toArray(new m[list.size()]);
        k kVarH = h();
        if (kVarArr[0].g() - 1 != jArr[0]) {
            kVarArr[0] = h.a(kVarH.n(), kVarH.l(), (int) jArr[0], kVarH.f(), kVarH.j());
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            k kVar = kVarArr[i11];
            int iD = kVar.l().d();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[iD];
            q qVar = new q(kVar.f(), kVar.j(), AbstractC4631b.c(kVar.l()));
            qVar.e((int) jArr[i11]);
            qVar.d(-2);
            qVar.a(bArr2, true);
            byte[] bArr3 = new byte[iD];
            qVar.a(bArr3, false);
            System.arraycopy(bArr3, 0, bArr, 0, 16);
            boolean z11 = i10 >= size + (-1) ? jArr[i10] == ((long) kVarArr[i10].g()) : jArr[i10] == ((long) (kVarArr[i10].g() - 1));
            if (!Oh.a.c(bArr, kVarArr[i10].f()) || !Oh.a.c(bArr2, kVarArr[i10].j())) {
                k kVarA = h.a(((k) listE.get(i10)).n(), ((k) listE.get(i10)).l(), (int) jArr[i10], bArr, bArr2);
                kVarArr[i10] = kVarA;
                mVarArr[i11] = h.c(kVarArr[i11], kVarA.m().c());
            } else if (z11) {
                i10++;
            } else {
                kVarArr[i10] = h.a(((k) listE.get(i10)).n(), ((k) listE.get(i10)).l(), (int) jArr[i10], bArr, bArr2);
            }
            z10 = true;
            i10++;
        }
        if (z10) {
            k(kVarArr, mVarArr);
        }
    }

    protected void k(k[] kVarArr, m[] mVarArr) {
        synchronized (this) {
            this.f45651d = Collections.unmodifiableList(Arrays.asList(kVarArr));
            this.f45652e = Collections.unmodifiableList(Arrays.asList(mVarArr));
        }
    }

    public C4632c(k kVar, long j10, long j11) {
        super(true);
        this.f45654g = 0L;
        this.f45649b = 1;
        this.f45651d = Collections.singletonList(kVar);
        this.f45652e = Collections.EMPTY_LIST;
        this.f45654g = j10;
        this.f45653f = j11;
        this.f45650c = false;
        j();
    }
}
