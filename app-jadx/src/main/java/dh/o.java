package dh;

/* JADX INFO: loaded from: classes5.dex */
abstract class o {
    public static int a(byte[] bArr, int i10, e eVar) {
        int iH = (1 << eVar.h()) - 1;
        int iB = 0;
        for (int i11 = 0; i11 < (i10 * 8) / eVar.h(); i11++) {
            iB = (iB + iH) - b(bArr, i11, eVar.h());
        }
        return iB << eVar.c();
    }

    public static int b(byte[] bArr, int i10, int i11) {
        int i12 = (i10 * i11) / 8;
        return (bArr[i12] >>> (((~i10) & ((8 / i11) - 1)) * i11)) & ((1 << i11) - 1);
    }

    public static g c(f fVar, byte[] bArr, byte[] bArr2) {
        e eVarC = fVar.c();
        int iD = eVarC.d();
        int iE = eVarC.e();
        int iH = eVarC.h();
        byte[] bArr3 = new byte[iE * iD];
        Fg.j jVarC = AbstractC4631b.c(eVarC);
        q qVarA = fVar.a();
        int iA = a(bArr, iD, eVarC);
        bArr[iD] = (byte) ((iA >>> 8) & 255);
        bArr[iD + 1] = (byte) iA;
        int i10 = iD + 23;
        byte[] bArrB = C4630a.f().d(fVar.b()).i(fVar.d()).g(0, i10).b();
        qVarA.d(0);
        int i11 = 0;
        while (i11 < iE) {
            Oh.g.k((short) i11, bArrB, 20);
            qVarA.b(bArrB, i11 < iE + (-1), 23);
            int iB = b(bArr, i11, iH);
            for (int i12 = 0; i12 < iB; i12++) {
                bArrB[22] = (byte) i12;
                jVarC.update(bArrB, 0, i10);
                jVarC.a(bArrB, 23);
            }
            System.arraycopy(bArrB, 23, bArr3, iD * i11, iD);
            i11++;
        }
        return new g(eVarC, bArr2, bArr3);
    }

    static byte[] d(e eVar, byte[] bArr, int i10, byte[] bArr2) {
        Fg.j jVarC = AbstractC4631b.c(eVar);
        byte[] bArrB = C4630a.f().d(bArr).i(i10).h(-32640).g(0, 22).b();
        jVarC.update(bArrB, 0, bArrB.length);
        Fg.j jVarC2 = AbstractC4631b.c(eVar);
        byte[] bArrB2 = C4630a.f().d(bArr).i(i10).g(0, jVarC2.d() + 23).b();
        q qVar = new q(bArr, bArr2, AbstractC4631b.c(eVar));
        qVar.e(i10);
        qVar.d(0);
        int iE = eVar.e();
        int iD = eVar.d();
        int iH = (1 << eVar.h()) - 1;
        int i11 = 0;
        while (i11 < iE) {
            qVar.b(bArrB2, i11 < iE + (-1), 23);
            Oh.g.k((short) i11, bArrB2, 20);
            for (int i12 = 0; i12 < iH; i12++) {
                bArrB2[22] = (byte) i12;
                jVarC2.update(bArrB2, 0, bArrB2.length);
                jVarC2.a(bArrB2, 23);
            }
            jVarC.update(bArrB2, 23, iD);
            i11++;
        }
        byte[] bArr3 = new byte[jVarC.d()];
        jVarC.a(bArr3, 0);
        return bArr3;
    }
}
