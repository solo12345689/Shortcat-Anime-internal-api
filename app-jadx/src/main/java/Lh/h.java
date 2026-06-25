package lh;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public class h extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    short[][][] f52867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    byte[] f52868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    short[][][] f52869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    short[][][] f52870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    short[][][] f52871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    short[][][] f52872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    short[][][] f52873j;

    public h(f fVar, byte[] bArr) {
        super(false, fVar);
        int iD = fVar.d();
        int iE = fVar.e();
        j jVarI = b().i();
        j jVar = j.CLASSIC;
        Class cls = Short.TYPE;
        if (jVarI != jVar) {
            this.f52868e = Oh.a.m(bArr, 0, fVar.b());
            this.f52869f = (short[][][]) Array.newInstance((Class<?>) cls, fVar.f(), fVar.h(), fVar.g());
            this.f52870g = (short[][][]) Array.newInstance((Class<?>) cls, fVar.f(), fVar.f(), fVar.f());
            this.f52871h = (short[][][]) Array.newInstance((Class<?>) cls, fVar.f(), fVar.f(), fVar.g());
            this.f52872i = (short[][][]) Array.newInstance((Class<?>) cls, fVar.f(), fVar.g(), fVar.g());
            this.f52873j = (short[][][]) Array.newInstance((Class<?>) cls, fVar.g(), fVar.g(), fVar.g());
            int iB = fVar.b();
            int i10 = iB + i.i(this.f52869f, bArr, iB, false);
            int i11 = i10 + i.i(this.f52870g, bArr, i10, true);
            int i12 = i11 + i.i(this.f52871h, bArr, i11, false);
            int i13 = i12 + i.i(this.f52872i, bArr, i12, true);
            if (i13 + i.i(this.f52873j, bArr, i13, true) != bArr.length) {
                throw new IllegalArgumentException("unparsed data in key encoding");
            }
            return;
        }
        this.f52867d = (short[][][]) Array.newInstance((Class<?>) cls, iD, iE, iE);
        int i14 = 0;
        for (int i15 = 0; i15 < iE; i15++) {
            for (int i16 = 0; i16 < iE; i16++) {
                for (int i17 = 0; i17 < iD; i17++) {
                    short[][][] sArr = this.f52867d;
                    if (i15 > i16) {
                        sArr[i17][i15][i16] = 0;
                    } else {
                        sArr[i17][i15][i16] = (short) (bArr[i14] & 255);
                        i14++;
                    }
                }
            }
        }
    }

    public byte[] getEncoded() {
        return b().i() != j.CLASSIC ? Oh.a.h(Oh.a.h(Oh.a.h(Oh.a.h(Oh.a.h(this.f52868e, i.f(this.f52869f, false)), i.f(this.f52870g, true)), i.f(this.f52871h, false)), i.f(this.f52872i, true)), i.f(this.f52873j, true)) : i.f(this.f52867d, true);
    }
}
