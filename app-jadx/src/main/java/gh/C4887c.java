package gh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: gh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C4887c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4886b f47495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f47502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f47503i;

    public C4887c(C4886b c4886b) {
        this.f47495a = c4886b;
        this.f47496b = c4886b.g();
        this.f47497c = c4886b.k();
        this.f47498d = c4886b.i();
        this.f47499e = c4886b.d();
        this.f47500f = c4886b.j();
        this.f47501g = c4886b.h();
        l lVarL = c4886b.l();
        this.f47502h = lVarL;
        int i10 = lVarL.f47532a;
        this.f47503i = (i10 + 472) / i10;
    }

    private static int e(i iVar, int i10, int i11, byte[] bArr, int i12) {
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            int i15 = i14 + 3;
            if (i15 > i12) {
                break;
            }
            short s10 = (short) (bArr[i14] & 255);
            byte b10 = bArr[i14 + 1];
            short s11 = (short) ((s10 | (((short) (b10 & 255)) << 8)) & 4095);
            short s12 = (short) (((((short) (bArr[i14 + 2] & 255)) << 4) | (((short) (b10 & 255)) >> 4)) & 4095);
            if (s11 < 3329) {
                iVar.j(i10 + i13, s11);
                i13++;
            }
            if (i13 < i11 && s12 < 3329) {
                iVar.j(i10 + i13, s12);
                i13++;
            }
            i14 = i15;
        }
        return i13;
    }

    byte[][] a(byte[] bArr) {
        j jVar = new j(this.f47495a);
        j jVar2 = new j(this.f47495a);
        j jVar3 = new j(this.f47495a);
        byte[] bArr2 = new byte[64];
        this.f47502h.a(bArr2, Oh.a.a(bArr, (byte) this.f47496b));
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        System.arraycopy(bArr2, 32, bArr4, 0, 32);
        j[] jVarArr = new j[this.f47496b];
        for (int i10 = 0; i10 < this.f47496b; i10++) {
            jVarArr[i10] = new j(this.f47495a);
        }
        b(jVarArr, bArr3, false);
        byte b10 = 0;
        for (int i11 = 0; i11 < this.f47496b; i11++) {
            jVar.b(i11).g(bArr4, b10);
            b10 = (byte) (b10 + 1);
        }
        for (int i12 = 0; i12 < this.f47496b; i12++) {
            jVar3.b(i12).g(bArr4, b10);
            b10 = (byte) (b10 + 1);
        }
        jVar.d();
        jVar3.d();
        for (int i13 = 0; i13 < this.f47496b; i13++) {
            j.c(jVar2.b(i13), jVarArr[i13], jVar, this.f47495a);
            jVar2.b(i13).d();
        }
        jVar2.a(jVar3);
        jVar2.e();
        return new byte[][]{c(jVar2, bArr3), d(jVar)};
    }

    public void b(j[] jVarArr, byte[] bArr, boolean z10) {
        byte b10;
        byte b11;
        byte[] bArr2 = new byte[(this.f47503i * this.f47502h.f47532a) + 2];
        for (int i10 = 0; i10 < this.f47496b; i10++) {
            for (int i11 = 0; i11 < this.f47496b; i11++) {
                l lVar = this.f47502h;
                if (z10) {
                    b10 = (byte) i10;
                    b11 = (byte) i11;
                } else {
                    b10 = (byte) i11;
                    b11 = (byte) i10;
                }
                lVar.d(bArr, b10, b11);
                l lVar2 = this.f47502h;
                lVar2.e(bArr2, 0, lVar2.f47532a * this.f47503i);
                int i12 = this.f47503i * this.f47502h.f47532a;
                int iE = e(jVarArr[i10].b(i11), 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, bArr2, i12);
                while (iE < 256) {
                    int i13 = i12 % 3;
                    for (int i14 = 0; i14 < i13; i14++) {
                        bArr2[i14] = bArr2[(i12 - i13) + i14];
                    }
                    l lVar3 = this.f47502h;
                    lVar3.e(bArr2, i13, lVar3.f47532a * 2);
                    i12 = this.f47502h.f47532a + i13;
                    iE += e(jVarArr[i10].b(i11), iE, 256 - iE, bArr2, i12);
                }
            }
        }
    }

    public byte[] c(j jVar, byte[] bArr) {
        byte[] bArr2 = new byte[this.f47497c];
        System.arraycopy(jVar.f(), 0, bArr2, 0, this.f47498d);
        System.arraycopy(bArr, 0, bArr2, this.f47498d, 32);
        return bArr2;
    }

    public byte[] d(j jVar) {
        return jVar.f();
    }
}
