package fh;

/* JADX INFO: loaded from: classes5.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h[] f47118a;

    i(C4808a c4808a) {
        int iF = c4808a.f();
        this.f47118a = new h[iF];
        for (int i10 = 0; i10 < iF; i10++) {
            this.f47118a[i10] = new h(c4808a);
        }
    }

    public void a(i iVar) {
        for (int i10 = 0; i10 < this.f47118a.length; i10++) {
            c(i10).a(iVar.c(i10));
        }
    }

    public void b() {
        for (int i10 = 0; i10 < this.f47118a.length; i10++) {
            c(i10).b();
        }
    }

    h c(int i10) {
        return this.f47118a[i10];
    }

    public void d() {
        for (int i10 = 0; i10 < this.f47118a.length; i10++) {
            c(i10).f();
        }
    }

    public void e(i iVar) {
        for (int i10 = 0; i10 < this.f47118a.length; i10++) {
            c(i10).o(iVar.c(i10));
        }
    }

    public void f() {
        for (int i10 = 0; i10 < this.f47118a.length; i10++) {
            c(i10).p();
        }
    }

    public void g(byte[] bArr, short s10) {
        int i10 = 0;
        while (true) {
            h[] hVarArr = this.f47118a;
            if (i10 >= hVarArr.length) {
                return;
            }
            hVarArr[i10].v(bArr, s10);
            i10++;
            s10 = (short) (s10 + 1);
        }
    }

    public String toString() {
        String str = "[";
        for (int i10 = 0; i10 < this.f47118a.length; i10++) {
            str = str + i10 + " " + c(i10).toString();
            if (i10 != this.f47118a.length - 1) {
                str = str + ",\n";
            }
        }
        return str + "]";
    }
}
