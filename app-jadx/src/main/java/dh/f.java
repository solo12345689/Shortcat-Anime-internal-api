package dh;

/* JADX INFO: loaded from: classes5.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f45682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f45683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f45685d;

    f(e eVar, byte[] bArr, int i10, byte[] bArr2) {
        this.f45682a = eVar;
        this.f45683b = bArr;
        this.f45684c = i10;
        this.f45685d = bArr2;
    }

    q a() {
        q qVar = new q(this.f45683b, this.f45685d, AbstractC4631b.c(this.f45682a));
        qVar.e(this.f45684c);
        return qVar;
    }

    public byte[] b() {
        return this.f45683b;
    }

    public e c() {
        return this.f45682a;
    }

    public int d() {
        return this.f45684c;
    }

    i e(n nVar, byte[][] bArr) {
        byte[] bArr2 = new byte[this.f45682a.d()];
        q qVarA = a();
        qVarA.d(-3);
        qVarA.a(bArr2, false);
        Fg.j jVarC = AbstractC4631b.c(this.f45682a);
        p.a(b(), jVarC);
        p.c(d(), jVarC);
        p.b((short) -32383, jVarC);
        p.a(bArr2, jVarC);
        return new i(this, nVar, jVarC, bArr2, bArr);
    }
}
