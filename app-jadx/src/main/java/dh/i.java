package dh;

/* JADX INFO: loaded from: classes5.dex */
public class i implements Fg.j {

    /* JADX INFO: renamed from: a */
    private final byte[] f45689a;

    /* JADX INFO: renamed from: b */
    private final f f45690b;

    /* JADX INFO: renamed from: c */
    private final n f45691c;

    /* JADX INFO: renamed from: d */
    private final byte[][] f45692d;

    /* JADX INFO: renamed from: e */
    private final Object f45693e = null;

    /* JADX INFO: renamed from: f */
    private volatile Fg.j f45694f;

    i(f fVar, n nVar, Fg.j jVar, byte[] bArr, byte[][] bArr2) {
        this.f45690b = fVar;
        this.f45691c = nVar;
        this.f45694f = jVar;
        this.f45689a = bArr;
        this.f45692d = bArr2;
    }

    @Override // Fg.j
    public int a(byte[] bArr, int i10) {
        return this.f45694f.a(bArr, i10);
    }

    @Override // Fg.j
    public void b(byte b10) {
        this.f45694f.b(b10);
    }

    @Override // Fg.j
    public String c() {
        return this.f45694f.c();
    }

    @Override // Fg.j
    public int d() {
        return this.f45694f.d();
    }

    byte[] f() {
        return this.f45689a;
    }

    byte[][] g() {
        return this.f45692d;
    }

    f h() {
        return this.f45690b;
    }

    byte[] i() {
        byte[] bArr = new byte[34];
        this.f45694f.a(bArr, 0);
        this.f45694f = null;
        return bArr;
    }

    n j() {
        return this.f45691c;
    }

    @Override // Fg.j
    public void update(byte[] bArr, int i10, int i11) {
        this.f45694f.update(bArr, i10, i11);
    }
}
