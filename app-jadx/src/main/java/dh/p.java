package dh;

/* JADX INFO: loaded from: classes5.dex */
abstract class p {
    static void a(byte[] bArr, Fg.j jVar) {
        jVar.update(bArr, 0, bArr.length);
    }

    static void b(short s10, Fg.j jVar) {
        jVar.b((byte) (s10 >>> 8));
        jVar.b((byte) s10);
    }

    static void c(int i10, Fg.j jVar) {
        jVar.b((byte) (i10 >>> 24));
        jVar.b((byte) (i10 >>> 16));
        jVar.b((byte) (i10 >>> 8));
        jVar.b((byte) i10);
    }
}
