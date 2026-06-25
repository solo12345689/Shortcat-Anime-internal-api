package lh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C5598c extends SecureRandom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f52804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f52805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f52806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Fg.j f52807d;

    public C5598c(byte[] bArr, Fg.j jVar) {
        this.f52804a = bArr;
        this.f52807d = jVar;
        c(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
    }

    private void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = 15;
            while (true) {
                if (i11 >= 0) {
                    byte b10 = bArr3[i11];
                    if ((b10 & 255) != 255) {
                        bArr3[i11] = (byte) (b10 + 1);
                        break;
                    } else {
                        bArr3[i11] = 0;
                        i11--;
                    }
                }
            }
            b(bArr2, bArr3, bArr4, i10 * 16);
        }
        if (bArr != null) {
            for (int i12 = 0; i12 < 48; i12++) {
                bArr4[i12] = (byte) (bArr4[i12] ^ bArr[i12]);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, 32, bArr3, 0, bArr3.length);
    }

    private void b(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        try {
            Ig.a aVar = new Ig.a();
            aVar.i(true, new Kg.f(bArr));
            for (int i11 = 0; i11 != bArr2.length; i11 += 16) {
                aVar.l(bArr2, i11, bArr3, i10 + i11);
            }
        } catch (Throwable th2) {
            throw new IllegalStateException("drbg failure: " + th2.getMessage(), th2);
        }
    }

    private void c(int i10) {
        byte[] bArr = this.f52804a;
        if (bArr.length >= 48) {
            d(bArr, i10);
        } else {
            d(Oh.a.h(this.f52804a, i.g(this.f52807d, bArr, 48 - bArr.length)), i10);
        }
    }

    private void d(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[48];
        System.arraycopy(bArr, 0, bArr2, 0, 48);
        byte[] bArr3 = new byte[32];
        this.f52805b = bArr3;
        byte[] bArr4 = new byte[16];
        this.f52806c = bArr4;
        a(bArr2, bArr3, bArr4);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i10 = 0;
        while (length > 0) {
            int i11 = 15;
            while (true) {
                if (i11 < 0) {
                    break;
                }
                byte[] bArr3 = this.f52806c;
                byte b10 = bArr3[i11];
                if ((b10 & 255) != 255) {
                    bArr3[i11] = (byte) (b10 + 1);
                    break;
                } else {
                    bArr3[i11] = 0;
                    i11--;
                }
            }
            b(this.f52805b, this.f52806c, bArr2, 0);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i10, 16);
                i10 += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i10, length);
                length = 0;
            }
        }
        a(null, this.f52805b, this.f52806c);
    }
}
