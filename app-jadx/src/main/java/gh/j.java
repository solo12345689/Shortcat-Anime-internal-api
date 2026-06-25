package gh;

/* JADX INFO: loaded from: classes5.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i[] f47528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4886b f47529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47531d;

    public j(C4886b c4886b) {
        this.f47529b = c4886b;
        this.f47530c = c4886b.g();
        this.f47531d = c4886b.i();
        this.f47528a = new i[this.f47530c];
        for (int i10 = 0; i10 < this.f47530c; i10++) {
            this.f47528a[i10] = new i(c4886b);
        }
    }

    public static void c(i iVar, j jVar, j jVar2, C4886b c4886b) {
        i iVar2 = new i(c4886b);
        i.b(iVar, jVar.b(0), jVar2.b(0));
        for (int i10 = 1; i10 < c4886b.g(); i10++) {
            i.b(iVar2, jVar.b(i10), jVar2.b(i10));
            iVar.a(iVar2);
        }
        iVar.i();
    }

    public void a(j jVar) {
        for (int i10 = 0; i10 < this.f47530c; i10++) {
            b(i10).a(jVar.b(i10));
        }
    }

    public i b(int i10) {
        return this.f47528a[i10];
    }

    public void d() {
        for (int i10 = 0; i10 < this.f47530c; i10++) {
            b(i10).h();
        }
    }

    public void e() {
        for (int i10 = 0; i10 < this.f47530c; i10++) {
            b(i10).i();
        }
    }

    public byte[] f() {
        byte[] bArr = new byte[this.f47531d];
        for (int i10 = 0; i10 < this.f47530c; i10++) {
            System.arraycopy(this.f47528a[i10].l(), 0, bArr, i10 * 384, 384);
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i10 = 0; i10 < this.f47530c; i10++) {
            stringBuffer.append(this.f47528a[i10].toString());
            if (i10 != this.f47530c - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
