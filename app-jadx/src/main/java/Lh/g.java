package lh;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public class g extends e {

    /* JADX INFO: renamed from: d */
    final byte[] f52853d;

    /* JADX INFO: renamed from: e */
    final short[][] f52854e;

    /* JADX INFO: renamed from: f */
    final short[][] f52855f;

    /* JADX INFO: renamed from: g */
    final short[][] f52856g;

    /* JADX INFO: renamed from: h */
    final short[][] f52857h;

    /* JADX INFO: renamed from: i */
    final short[][][] f52858i;

    /* JADX INFO: renamed from: j */
    final short[][][] f52859j;

    /* JADX INFO: renamed from: k */
    final short[][][] f52860k;

    /* JADX INFO: renamed from: l */
    final short[][][] f52861l;

    /* JADX INFO: renamed from: m */
    final short[][][] f52862m;

    /* JADX INFO: renamed from: n */
    final short[][][] f52863n;

    /* JADX INFO: renamed from: o */
    final short[][][] f52864o;

    /* JADX INFO: renamed from: p */
    private final byte[] f52865p;

    /* JADX INFO: renamed from: q */
    private byte[] f52866q;

    public g(f fVar, byte[] bArr) {
        super(true, fVar);
        if (fVar.i() == j.COMPRESSED) {
            byte[] bArrM = Oh.a.m(bArr, 0, fVar.b());
            this.f52865p = bArrM;
            byte[] bArrM2 = Oh.a.m(bArr, fVar.b(), fVar.b() + fVar.c());
            this.f52853d = bArrM2;
            g gVarD = new d(fVar, bArrM, bArrM2).d();
            this.f52866q = gVarD.f52866q;
            this.f52854e = gVarD.f52854e;
            this.f52855f = gVarD.f52855f;
            this.f52856g = gVarD.f52856g;
            this.f52857h = gVarD.f52857h;
            this.f52858i = gVarD.f52858i;
            this.f52859j = gVarD.f52859j;
            this.f52860k = gVarD.f52860k;
            this.f52861l = gVarD.f52861l;
            this.f52862m = gVarD.f52862m;
            this.f52863n = gVarD.f52863n;
            this.f52864o = gVarD.f52864o;
            return;
        }
        int iH = fVar.h();
        int iF = fVar.f();
        int iG = fVar.g();
        Class cls = Short.TYPE;
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) cls, iF, iG);
        this.f52854e = sArr;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, iH, iF);
        this.f52855f = sArr2;
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, iH, iG);
        this.f52857h = sArr3;
        short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) cls, iF, iG);
        this.f52856g = sArr4;
        short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) cls, iF, iH, iH);
        this.f52858i = sArr5;
        short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) cls, iF, iH, iF);
        this.f52859j = sArr6;
        short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) cls, iG, iH, iH);
        this.f52860k = sArr7;
        short[][][] sArr8 = (short[][][]) Array.newInstance((Class<?>) cls, iG, iH, iF);
        this.f52861l = sArr8;
        short[][][] sArr9 = (short[][][]) Array.newInstance((Class<?>) cls, iG, iH, iG);
        this.f52862m = sArr9;
        short[][][] sArr10 = (short[][][]) Array.newInstance((Class<?>) cls, iG, iF, iF);
        this.f52863n = sArr10;
        short[][][] sArr11 = (short[][][]) Array.newInstance((Class<?>) cls, iG, iF, iG);
        this.f52864o = sArr11;
        this.f52865p = null;
        byte[] bArrM3 = Oh.a.m(bArr, 0, fVar.c());
        this.f52853d = bArrM3;
        int length = bArrM3.length;
        int iH2 = length + i.h(sArr, bArr, length);
        int iH3 = iH2 + i.h(sArr2, bArr, iH2);
        int iH4 = iH3 + i.h(sArr3, bArr, iH3);
        int iH5 = iH4 + i.h(sArr4, bArr, iH4);
        int i10 = iH5 + i.i(sArr5, bArr, iH5, true);
        int i11 = i10 + i.i(sArr6, bArr, i10, false);
        int i12 = i11 + i.i(sArr7, bArr, i11, true);
        int i13 = i12 + i.i(sArr8, bArr, i12, false);
        int i14 = i13 + i.i(sArr9, bArr, i13, false);
        int i15 = i14 + i.i(sArr10, bArr, i14, true);
        this.f52866q = Oh.a.m(bArr, i15 + i.i(sArr11, bArr, i15, false), bArr.length);
    }

    public byte[] c() {
        return b().i() == j.COMPRESSED ? Oh.a.h(this.f52865p, this.f52853d) : Oh.a.h(Oh.a.h(Oh.a.h(Oh.a.h(Oh.a.h(Oh.a.h(Oh.a.h(Oh.a.h(Oh.a.h(Oh.a.h(Oh.a.h(this.f52853d, i.e(this.f52854e)), i.e(this.f52855f)), i.e(this.f52857h)), i.e(this.f52856g)), i.f(this.f52858i, true)), i.f(this.f52859j, false)), i.f(this.f52860k, true)), i.f(this.f52861l, false)), i.f(this.f52862m, false)), i.f(this.f52863n, true)), i.f(this.f52864o, false));
    }

    public byte[] getEncoded() {
        return b().i() == j.COMPRESSED ? Oh.a.h(this.f52865p, this.f52853d) : Oh.a.h(c(), this.f52866q);
    }

    g(f fVar, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11, byte[] bArr2) {
        super(true, fVar);
        this.f52865p = null;
        this.f52866q = bArr2;
        this.f52853d = (byte[]) bArr.clone();
        this.f52854e = i.a(sArr);
        this.f52855f = i.a(sArr2);
        this.f52856g = i.a(sArr3);
        this.f52857h = i.a(sArr4);
        this.f52858i = i.b(sArr5);
        this.f52859j = i.b(sArr6);
        this.f52860k = i.b(sArr7);
        this.f52861l = i.b(sArr8);
        this.f52862m = i.b(sArr9);
        this.f52863n = i.b(sArr10);
        this.f52864o = i.b(sArr11);
    }
}
