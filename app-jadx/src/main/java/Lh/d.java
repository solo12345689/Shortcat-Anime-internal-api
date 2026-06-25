package lh;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private short[][][] f52808A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private short[][][] f52809B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f52811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f52812c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f52817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f52818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[][] f52819j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private short[][] f52820k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[][] f52821l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private short[][] f52822m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[][] f52823n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private short[][][] f52824o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private short[][][] f52825p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private short[][][] f52826q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private short[][][] f52827r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private short[][][] f52828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private short[][][] f52829t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private short[][][] f52830u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private short[][][] f52831v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private short[][][] f52832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private short[][][] f52833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private short[][][] f52834y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private short[][][] f52835z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C5596a f52813d = new C5596a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SecureRandom f52810a = null;

    public d(f fVar, byte[] bArr, byte[] bArr2) {
        this.f52812c = fVar;
        this.f52811b = fVar.i();
        this.f52818i = bArr;
        this.f52817h = bArr2;
        this.f52814e = this.f52812c.h();
        this.f52815f = this.f52812c.f();
        this.f52816g = this.f52812c.g();
    }

    private void a() {
        this.f52824o = i.b(this.f52831v);
        this.f52825p = new short[this.f52815f][][];
        for (int i10 = 0; i10 < this.f52815f; i10++) {
            this.f52825p[i10] = this.f52813d.b(this.f52831v[i10]);
            short[][][] sArr = this.f52825p;
            sArr[i10] = this.f52813d.c(sArr[i10], this.f52820k);
            short[][][] sArr2 = this.f52825p;
            sArr2[i10] = this.f52813d.a(sArr2[i10], this.f52832w[i10]);
        }
        int i11 = this.f52816g;
        this.f52827r = new short[i11][][];
        this.f52828s = new short[i11][][];
        this.f52829t = new short[i11][][];
        this.f52830u = new short[i11][][];
        this.f52826q = i.b(this.f52833x);
        for (int i12 = 0; i12 < this.f52816g; i12++) {
            short[][] sArrB = this.f52813d.b(this.f52833x[i12]);
            this.f52827r[i12] = this.f52813d.c(sArrB, this.f52820k);
            short[][][] sArr3 = this.f52827r;
            sArr3[i12] = this.f52813d.a(sArr3[i12], this.f52834y[i12]);
            this.f52828s[i12] = this.f52813d.c(sArrB, this.f52823n);
            short[][] sArrC = this.f52813d.c(this.f52834y[i12], this.f52822m);
            short[][][] sArr4 = this.f52828s;
            sArr4[i12] = this.f52813d.a(sArr4[i12], sArrC);
            short[][][] sArr5 = this.f52828s;
            sArr5[i12] = this.f52813d.a(sArr5[i12], this.f52835z[i12]);
            short[][] sArrA = this.f52813d.a(this.f52813d.c(this.f52833x[i12], this.f52820k), this.f52834y[i12]);
            short[][] sArrF = this.f52813d.f(this.f52820k);
            this.f52829t[i12] = this.f52813d.c(sArrF, sArrA);
            short[][][] sArr6 = this.f52829t;
            sArr6[i12] = this.f52813d.a(sArr6[i12], this.f52808A[i12]);
            short[][][] sArr7 = this.f52829t;
            sArr7[i12] = this.f52813d.e(sArr7[i12]);
            this.f52830u[i12] = this.f52813d.c(sArrF, this.f52828s[i12]);
            C5596a c5596a = this.f52813d;
            short[][] sArrC2 = c5596a.c(c5596a.f(this.f52834y[i12]), this.f52823n);
            short[][][] sArr8 = this.f52830u;
            sArr8[i12] = this.f52813d.a(sArr8[i12], sArrC2);
            short[][] sArrC3 = this.f52813d.c(this.f52813d.b(this.f52808A[i12]), this.f52822m);
            short[][][] sArr9 = this.f52830u;
            sArr9[i12] = this.f52813d.a(sArr9[i12], sArrC3);
            short[][][] sArr10 = this.f52830u;
            sArr10[i12] = this.f52813d.a(sArr10[i12], this.f52809B[i12]);
        }
    }

    private void b() {
        this.f52823n = this.f52813d.a(this.f52813d.c(this.f52820k, this.f52822m), this.f52821l);
    }

    private void c() {
        C5598c c5598c = new C5598c(this.f52817h, this.f52812c.a());
        C5598c c5598c2 = new C5598c(this.f52818i, this.f52812c.a());
        f(c5598c);
        b();
        e(c5598c2);
        this.f52831v = this.f52813d.d(this.f52819j, this.f52833x, this.f52831v);
        this.f52832w = this.f52813d.d(this.f52819j, this.f52834y, this.f52832w);
        a();
    }

    private void e(SecureRandom secureRandom) {
        int i10 = this.f52815f;
        int i11 = this.f52814e;
        this.f52831v = i.c(secureRandom, i10, i11, i11, true);
        int i12 = this.f52815f;
        this.f52832w = i.c(secureRandom, i12, this.f52814e, i12, false);
        int i13 = this.f52816g;
        int i14 = this.f52814e;
        this.f52833x = i.c(secureRandom, i13, i14, i14, true);
        this.f52834y = i.c(secureRandom, this.f52816g, this.f52814e, this.f52815f, false);
        int i15 = this.f52816g;
        this.f52835z = i.c(secureRandom, i15, this.f52814e, i15, false);
        int i16 = this.f52816g;
        int i17 = this.f52815f;
        this.f52808A = i.c(secureRandom, i16, i17, i17, true);
        int i18 = this.f52816g;
        this.f52809B = i.c(secureRandom, i18, this.f52815f, i18, false);
    }

    private void f(SecureRandom secureRandom) {
        this.f52819j = i.d(secureRandom, this.f52815f, this.f52816g);
        this.f52820k = i.d(secureRandom, this.f52814e, this.f52815f);
        this.f52821l = i.d(secureRandom, this.f52814e, this.f52816g);
        this.f52822m = i.d(secureRandom, this.f52815f, this.f52816g);
    }

    g d() {
        this.f52817h = Oh.a.f(this.f52817h);
        this.f52818i = Oh.a.f(this.f52818i);
        c();
        return new g(this.f52812c, this.f52817h, this.f52819j, this.f52820k, this.f52822m, this.f52823n, this.f52824o, this.f52825p, this.f52826q, this.f52827r, this.f52828s, this.f52829t, this.f52830u, null);
    }
}
