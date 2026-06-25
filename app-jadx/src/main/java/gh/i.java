package gh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes5.dex */
class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4886b f47523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47525d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l f47527f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f47522a = new short[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47526e = C4886b.c();

    public i(C4886b c4886b) {
        this.f47523b = c4886b;
        this.f47524c = c4886b.h();
        this.f47525d = c4886b.b();
        this.f47527f = c4886b.l();
    }

    public static void b(i iVar, i iVar2, i iVar3) {
        for (int i10 = 0; i10 < 64; i10++) {
            int i11 = i10 * 4;
            short sE = iVar2.e(i11);
            int i12 = i11 + 1;
            short sE2 = iVar2.e(i12);
            short sE3 = iVar3.e(i11);
            short sE4 = iVar3.e(i12);
            short[] sArr = h.f47520a;
            int i13 = i10 + 64;
            h.a(iVar, i11, sE, sE2, sE3, sE4, sArr[i13]);
            int i14 = i11 + 2;
            int i15 = i11 + 3;
            h.a(iVar, i14, iVar2.e(i14), iVar2.e(i15), iVar3.e(i14), iVar3.e(i15), (short) (sArr[i13] * (-1)));
        }
    }

    public void a(i iVar) {
        for (int i10 = 0; i10 < 256; i10++) {
            j(i10, (short) (e(i10) + iVar.e(i10)));
        }
    }

    public void c() {
        for (int i10 = 0; i10 < 256; i10++) {
            j(i10, k.b(e(i10)));
        }
    }

    public void d() {
        for (int i10 = 0; i10 < 256; i10++) {
            j(i10, k.c(e(i10) * 1353));
        }
    }

    public short e(int i10) {
        return this.f47522a[i10];
    }

    public short[] f() {
        return this.f47522a;
    }

    public void g(byte[] bArr, byte b10) {
        byte[] bArr2 = new byte[(this.f47525d * IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) / 4];
        this.f47527f.c(bArr2, bArr, b10);
        AbstractC4885a.c(this, bArr2, this.f47525d);
    }

    public void h() {
        k(h.c(f()));
        i();
    }

    public void i() {
        for (int i10 = 0; i10 < 256; i10++) {
            j(i10, k.a(e(i10)));
        }
    }

    public void j(int i10, short s10) {
        this.f47522a[i10] = s10;
    }

    public void k(short[] sArr) {
        this.f47522a = sArr;
    }

    public byte[] l() {
        byte[] bArr = new byte[384];
        c();
        for (int i10 = 0; i10 < 128; i10++) {
            int i11 = i10 * 2;
            short sE = e(i11);
            short sE2 = e(i11 + 1);
            int i12 = i10 * 3;
            bArr[i12] = (byte) sE;
            bArr[i12 + 1] = (byte) ((sE >> 8) | (sE2 << 4));
            bArr[i12 + 2] = (byte) (sE2 >> 4);
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        int i10 = 0;
        while (true) {
            short[] sArr = this.f47522a;
            if (i10 >= sArr.length) {
                stringBuffer.append("]");
                return stringBuffer.toString();
            }
            stringBuffer.append((int) sArr[i10]);
            if (i10 != this.f47522a.length - 1) {
                stringBuffer.append(", ");
            }
            i10++;
        }
    }
}
