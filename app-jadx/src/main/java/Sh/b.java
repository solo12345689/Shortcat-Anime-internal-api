package sh;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import sh.j;
import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f59832a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient long f59833b;

    b(long j10) {
        this.f59833b = j10;
    }

    C6534a a(int i10) {
        return (C6534a) this.f59832a.get(Oh.e.b(i10));
    }

    public long b() {
        return this.f59833b;
    }

    void c(int i10, C6534a c6534a) {
        this.f59832a.put(Oh.e.b(i10), c6534a);
    }

    C6534a d(int i10, byte[] bArr, byte[] bArr2, j jVar) {
        return (C6534a) this.f59832a.put(Oh.e.b(i10), ((C6534a) this.f59832a.get(Oh.e.b(i10))).d(bArr, bArr2, jVar));
    }

    void e(r rVar, long j10, byte[] bArr, byte[] bArr2) {
        x xVarH = rVar.h();
        int iB = xVarH.b();
        long j11 = AbstractC6533A.j(j10, iB);
        int i10 = AbstractC6533A.i(j10, iB);
        j jVar = (j) ((j.b) new j.b().h(j11)).p(i10).l();
        int i11 = (1 << iB) - 1;
        if (i10 < i11) {
            if (a(0) == null || i10 == 0) {
                c(0, new C6534a(xVarH, bArr, bArr2, jVar));
            }
            d(0, bArr, bArr2, jVar);
        }
        for (int i12 = 1; i12 < rVar.b(); i12++) {
            int i13 = AbstractC6533A.i(j11, iB);
            j11 = AbstractC6533A.j(j11, iB);
            j jVar2 = (j) ((j.b) ((j.b) new j.b().g(i12)).h(j11)).p(i13).l();
            if (this.f59832a.get(Integer.valueOf(i12)) == null || AbstractC6533A.n(j10, iB, i12)) {
                this.f59832a.put(Integer.valueOf(i12), new C6534a(xVarH, bArr, bArr2, jVar2));
            }
            if (i13 < i11 && AbstractC6533A.m(j10, iB, i12)) {
                d(i12, bArr, bArr2, jVar2);
            }
        }
    }

    public b f(C7427t c7427t) {
        b bVar = new b(this.f59833b);
        for (Integer num : this.f59832a.keySet()) {
            bVar.f59832a.put(num, ((C6534a) this.f59832a.get(num)).h(c7427t));
        }
        return bVar;
    }

    b(b bVar, long j10) {
        for (Integer num : bVar.f59832a.keySet()) {
            this.f59832a.put(num, new C6534a((C6534a) bVar.f59832a.get(num)));
        }
        this.f59833b = j10;
    }

    b(r rVar, long j10, byte[] bArr, byte[] bArr2) {
        this.f59833b = (1 << rVar.a()) - 1;
        for (long j11 = 0; j11 < j10; j11++) {
            e(rVar, j11, bArr, bArr2);
        }
    }
}
