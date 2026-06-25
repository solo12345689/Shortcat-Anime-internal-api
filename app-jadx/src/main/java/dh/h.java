package dh;

/* JADX INFO: loaded from: classes5.dex */
abstract class h {
    public static k a(n nVar, e eVar, int i10, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr2.length >= nVar.d()) {
            return new k(nVar, eVar, i10, bArr, 1 << nVar.c(), bArr2);
        }
        throw new IllegalArgumentException("root seed is less than " + nVar.d());
    }

    public static m b(i iVar) {
        return new m(iVar.h().d(), o.c(iVar.h(), iVar.i(), iVar.f()), iVar.j(), iVar.g());
    }

    public static m c(k kVar, byte[] bArr) {
        i iVarE = kVar.e();
        iVarE.update(bArr, 0, bArr.length);
        return b(iVarE);
    }
}
