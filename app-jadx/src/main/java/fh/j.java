package fh;

/* JADX INFO: loaded from: classes5.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h[] f47119a;

    j(C4808a c4808a) {
        int iG = c4808a.g();
        this.f47119a = new h[iG];
        for (int i10 = 0; i10 < iG; i10++) {
            this.f47119a[i10] = new h(c4808a);
        }
    }

    void a(j jVar) {
        int i10 = 0;
        while (true) {
            h[] hVarArr = this.f47119a;
            if (i10 >= hVarArr.length) {
                return;
            }
            hVarArr[i10].c(jVar.f47119a[i10]);
            i10++;
        }
    }

    public h b(int i10) {
        return this.f47119a[i10];
    }

    public void c() {
        int i10 = 0;
        while (true) {
            h[] hVarArr = this.f47119a;
            if (i10 >= hVarArr.length) {
                return;
            }
            hVarArr[i10].k();
            i10++;
        }
    }

    void d(byte[] bArr, int i10) {
        int i11 = 0;
        while (true) {
            h[] hVarArr = this.f47119a;
            if (i11 >= hVarArr.length) {
                return;
            }
            hVarArr[i11].u(bArr, (short) (i10 + i11));
            i11++;
        }
    }

    public void e(byte[] bArr, short s10) {
        int i10 = 0;
        while (i10 < this.f47119a.length) {
            b(i10).v(bArr, s10);
            i10++;
            s10 = (short) (s10 + 1);
        }
    }

    public String toString() {
        String str = "\n[";
        for (int i10 = 0; i10 < this.f47119a.length; i10++) {
            str = str + "Inner Matrix " + i10 + " " + b(i10).toString();
            if (i10 != this.f47119a.length - 1) {
                str = str + ",\n";
            }
        }
        return str + "]";
    }
}
