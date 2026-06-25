package fh;

/* JADX INFO: loaded from: classes5.dex */
abstract class g {
    static byte[] a(i iVar, C4808a c4808a) {
        byte[] bArr = new byte[c4808a.d() - 32];
        for (int i10 = 0; i10 < c4808a.f(); i10++) {
            System.arraycopy(iVar.c(i10).n(), 0, bArr, i10 * 320, 320);
        }
        return bArr;
    }

    static byte[][] b(byte[] bArr, byte[] bArr2, byte[] bArr3, i iVar, j jVar, i iVar2, C4808a c4808a) {
        byte[][] bArr4 = new byte[6][];
        bArr4[0] = bArr;
        bArr4[1] = bArr3;
        bArr4[2] = bArr2;
        bArr4[3] = new byte[c4808a.g() * c4808a.h()];
        for (int i10 = 0; i10 < c4808a.g(); i10++) {
            jVar.b(i10).i(bArr4[3], c4808a.h() * i10);
        }
        bArr4[4] = new byte[c4808a.f() * c4808a.h()];
        for (int i11 = 0; i11 < c4808a.f(); i11++) {
            iVar2.c(i11).i(bArr4[4], c4808a.h() * i11);
        }
        bArr4[5] = new byte[c4808a.f() * 416];
        for (int i12 = 0; i12 < c4808a.f(); i12++) {
            iVar.c(i12).l(bArr4[5], i12 * 416);
        }
        return bArr4;
    }

    static void c(i iVar, j jVar, i iVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, C4808a c4808a) {
        for (int i10 = 0; i10 < c4808a.g(); i10++) {
            jVar.b(i10).j(bArr2, c4808a.h() * i10);
        }
        for (int i11 = 0; i11 < c4808a.f(); i11++) {
            iVar2.c(i11).j(bArr3, c4808a.h() * i11);
        }
        for (int i12 = 0; i12 < c4808a.f(); i12++) {
            iVar.c(i12).m(bArr, i12 * 416);
        }
    }
}
