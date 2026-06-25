package fh;

/* JADX INFO: loaded from: classes5.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j[] f47120a;

    k(C4808a c4808a) {
        int iF = c4808a.f();
        this.f47120a = new j[iF];
        for (int i10 = 0; i10 < iF; i10++) {
            this.f47120a[i10] = new j(c4808a);
        }
    }

    public void a(byte[] bArr) {
        int i10 = 0;
        while (true) {
            j[] jVarArr = this.f47120a;
            if (i10 >= jVarArr.length) {
                return;
            }
            jVarArr[i10].d(bArr, i10 << 8);
            i10++;
        }
    }

    public void b(i iVar, j jVar) {
        for (int i10 = 0; i10 < this.f47120a.length; i10++) {
            iVar.c(i10).g(this.f47120a[i10], jVar);
        }
    }
}
