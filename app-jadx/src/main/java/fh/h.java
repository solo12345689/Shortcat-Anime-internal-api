package fh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes5.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f47115b = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4808a f47116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f47117d;

    public h(C4808a c4808a) {
        this.f47116c = c4808a;
        n nVarA = c4808a.a();
        this.f47117d = nVarA;
        int i10 = nVarA.f47121a;
        this.f47114a = (i10 + 767) / i10;
    }

    private static int q(h hVar, int i10, int i11, byte[] bArr, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11 && i15 < i12) {
            byte b10 = bArr[i15];
            int i16 = b10 & 15;
            i15++;
            int i17 = (b10 & 255) >> 4;
            if (i13 == 2) {
                if (i16 < 15) {
                    hVar.s(i10 + i14, 2 - (i16 - (((i16 * 205) >> 10) * 5)));
                    i14++;
                }
                if (i17 < 15 && i14 < i11) {
                    hVar.s(i10 + i14, 2 - (i17 - (((i17 * 205) >> 10) * 5)));
                    i14++;
                }
            } else if (i13 == 4) {
                if (i16 < 9) {
                    hVar.s(i10 + i14, 4 - i16);
                    i14++;
                }
                if (i17 < 9 && i14 < i11) {
                    hVar.s(i10 + i14, 4 - i17);
                    i14++;
                }
            }
        }
        return i14;
    }

    private static int r(h hVar, int i10, int i11, byte[] bArr, int i12) {
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11 && i14 + 3 <= i12) {
            int i15 = i14 + 2;
            int i16 = ((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255);
            i14 += 3;
            int i17 = (i16 | ((bArr[i15] & 255) << 16)) & 8388607;
            if (i17 < 8380417) {
                hVar.s(i10 + i13, i17);
                i13++;
            }
        }
        return i13;
    }

    public void a(h hVar) {
        for (int i10 = 0; i10 < 256; i10++) {
            s(i10, d(i10) + hVar.d(i10));
        }
    }

    public void b() {
        for (int i10 = 0; i10 < 256; i10++) {
            s(i10, l.a(d(i10)));
        }
    }

    void c(h hVar) {
        System.arraycopy(this.f47115b, 0, hVar.f47115b, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
    }

    public int d(int i10) {
        return this.f47115b[i10];
    }

    public int[] e() {
        return this.f47115b;
    }

    public void f() {
        t(f.a(e()));
    }

    public void g(j jVar, j jVar2) {
        h hVar = new h(this.f47116c);
        h(jVar.b(0), jVar2.b(0));
        for (int i10 = 1; i10 < this.f47116c.g(); i10++) {
            hVar.h(jVar.b(i10), jVar2.b(i10));
            a(hVar);
        }
    }

    public void h(h hVar, h hVar2) {
        for (int i10 = 0; i10 < 256; i10++) {
            s(i10, l.b(((long) hVar.d(i10)) * ((long) hVar2.d(i10))));
        }
    }

    public byte[] i(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[8];
        if (this.f47116c.e() == 2) {
            for (int i11 = 0; i11 < 32; i11++) {
                int i12 = i11 * 8;
                bArr2[0] = (byte) (this.f47116c.e() - d(i12));
                bArr2[1] = (byte) (this.f47116c.e() - d(i12 + 1));
                bArr2[2] = (byte) (this.f47116c.e() - d(i12 + 2));
                bArr2[3] = (byte) (this.f47116c.e() - d(i12 + 3));
                bArr2[4] = (byte) (this.f47116c.e() - d(i12 + 4));
                bArr2[5] = (byte) (this.f47116c.e() - d(i12 + 5));
                bArr2[6] = (byte) (this.f47116c.e() - d(i12 + 6));
                bArr2[7] = (byte) (this.f47116c.e() - d(i12 + 7));
                int i13 = (i11 * 3) + i10;
                bArr[i13] = (byte) (bArr2[0] | (bArr2[1] << 3) | (bArr2[2] << 6));
                bArr[i13 + 1] = (byte) ((bArr2[3] << 1) | (bArr2[2] >> 2) | (bArr2[4] << 4) | (bArr2[5] << 7));
                bArr[i13 + 2] = (byte) ((bArr2[5] >> 1) | (bArr2[6] << 2) | (bArr2[7] << 5));
            }
        } else {
            if (this.f47116c.e() != 4) {
                throw new RuntimeException("Eta needs to be 2 or 4!");
            }
            for (int i14 = 0; i14 < 128; i14++) {
                int i15 = i14 * 2;
                bArr2[0] = (byte) (this.f47116c.e() - d(i15));
                byte bE = (byte) (this.f47116c.e() - d(i15 + 1));
                bArr2[1] = bE;
                bArr[i10 + i14] = (byte) ((bE << 4) | bArr2[0]);
            }
        }
        return bArr;
    }

    public void j(byte[] bArr, int i10) {
        int iE = this.f47116c.e();
        int i11 = 0;
        if (this.f47116c.e() != 2) {
            if (this.f47116c.e() == 4) {
                while (i11 < 128) {
                    int i12 = i11 * 2;
                    int i13 = i10 + i11;
                    s(i12, bArr[i13] & 15);
                    int i14 = i12 + 1;
                    s(i14, (bArr[i13] & 255) >> 4);
                    s(i12, iE - d(i12));
                    s(i14, iE - d(i14));
                    i11++;
                }
                return;
            }
            return;
        }
        while (i11 < 32) {
            int i15 = (i11 * 3) + i10;
            int i16 = i11 * 8;
            s(i16, bArr[i15] & 7);
            int i17 = i16 + 1;
            s(i17, ((bArr[i15] & 255) >> 3) & 7);
            int i18 = i16 + 2;
            int i19 = i15 + 1;
            s(i18, ((bArr[i15] & 255) >> 6) | (((bArr[i19] & 255) << 2) & 7));
            int i20 = i16 + 3;
            s(i20, ((bArr[i19] & 255) >> 1) & 7);
            int i21 = i16 + 4;
            s(i21, ((bArr[i19] & 255) >> 4) & 7);
            int i22 = i16 + 5;
            int i23 = i15 + 2;
            s(i22, ((bArr[i19] & 255) >> 7) | (((bArr[i23] & 255) << 1) & 7));
            int i24 = i16 + 6;
            s(i24, ((bArr[i23] & 255) >> 2) & 7);
            int i25 = i16 + 7;
            s(i25, ((bArr[i23] & 255) >> 5) & 7);
            s(i16, iE - d(i16));
            s(i17, iE - d(i17));
            s(i18, iE - d(i18));
            s(i20, iE - d(i20));
            s(i21, iE - d(i21));
            s(i22, iE - d(i22));
            s(i24, iE - d(i24));
            s(i25, iE - d(i25));
            i11++;
        }
    }

    public void k() {
        t(f.b(this.f47115b));
    }

    public byte[] l(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 32; i11++) {
            int i12 = i11 * 8;
            int[] iArr = {4096 - d(i12), 4096 - d(i12 + 1), 4096 - d(i12 + 2), 4096 - d(i12 + 3), 4096 - d(i12 + 4), 4096 - d(i12 + 5), 4096 - d(i12 + 6), 4096 - d(i12 + 7)};
            int i13 = (i11 * 13) + i10;
            int i14 = iArr[0];
            bArr[i13] = (byte) i14;
            int i15 = i13 + 1;
            byte b10 = (byte) (i14 >> 8);
            bArr[i15] = b10;
            int i16 = iArr[1];
            bArr[i15] = (byte) (b10 | ((byte) (i16 << 5)));
            bArr[i13 + 2] = (byte) (i16 >> 3);
            int i17 = i13 + 3;
            byte b11 = (byte) (i16 >> 11);
            bArr[i17] = b11;
            int i18 = iArr[2];
            bArr[i17] = (byte) (b11 | ((byte) (i18 << 2)));
            int i19 = i13 + 4;
            byte b12 = (byte) (i18 >> 6);
            bArr[i19] = b12;
            int i20 = iArr[3];
            bArr[i19] = (byte) (b12 | ((byte) (i20 << 7)));
            bArr[i13 + 5] = (byte) (i20 >> 1);
            int i21 = i13 + 6;
            byte b13 = (byte) (i20 >> 9);
            bArr[i21] = b13;
            int i22 = iArr[4];
            bArr[i21] = (byte) (b13 | ((byte) (i22 << 4)));
            bArr[i13 + 7] = (byte) (i22 >> 4);
            int i23 = i13 + 8;
            byte b14 = (byte) (i22 >> 12);
            bArr[i23] = b14;
            int i24 = iArr[5];
            bArr[i23] = (byte) (b14 | ((byte) (i24 << 1)));
            int i25 = i13 + 9;
            byte b15 = (byte) (i24 >> 7);
            bArr[i25] = b15;
            int i26 = iArr[6];
            bArr[i25] = (byte) (b15 | ((byte) (i26 << 6)));
            bArr[i13 + 10] = (byte) (i26 >> 2);
            int i27 = i13 + 11;
            byte b16 = (byte) (i26 >> 10);
            bArr[i27] = b16;
            int i28 = iArr[7];
            bArr[i27] = (byte) (((byte) (i28 << 3)) | b16);
            bArr[i13 + 12] = (byte) (i28 >> 5);
        }
        return bArr;
    }

    public void m(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 32; i11++) {
            int i12 = (i11 * 13) + i10;
            int i13 = i11 * 8;
            int i14 = i12 + 1;
            s(i13, ((bArr[i12] & 255) | ((bArr[i14] & 255) << 8)) & 8191);
            int i15 = i13 + 1;
            int i16 = i12 + 3;
            s(i15, (((bArr[i14] & 255) >> 5) | ((bArr[i12 + 2] & 255) << 3) | ((bArr[i16] & 255) << 11)) & 8191);
            int i17 = i13 + 2;
            int i18 = i12 + 4;
            s(i17, (((bArr[i16] & 255) >> 2) | ((bArr[i18] & 255) << 6)) & 8191);
            int i19 = i13 + 3;
            int i20 = i12 + 6;
            s(i19, (((bArr[i18] & 255) >> 7) | ((bArr[i12 + 5] & 255) << 1) | ((bArr[i20] & 255) << 9)) & 8191);
            int i21 = i13 + 4;
            int i22 = i12 + 8;
            s(i21, (((bArr[i20] & 255) >> 4) | ((bArr[i12 + 7] & 255) << 4) | ((bArr[i22] & 255) << 12)) & 8191);
            int i23 = i13 + 5;
            int i24 = i12 + 9;
            s(i23, (((bArr[i22] & 255) >> 1) | ((bArr[i24] & 255) << 7)) & 8191);
            int i25 = i13 + 6;
            int i26 = i12 + 11;
            s(i25, (((bArr[i24] & 255) >> 6) | ((bArr[i12 + 10] & 255) << 2) | ((bArr[i26] & 255) << 10)) & 8191);
            int i27 = i13 + 7;
            s(i27, (((bArr[i12 + 12] & 255) << 5) | ((bArr[i26] & 255) >> 3)) & 8191);
            s(i13, 4096 - d(i13));
            s(i15, 4096 - d(i15));
            s(i17, 4096 - d(i17));
            s(i19, 4096 - d(i19));
            s(i21, 4096 - d(i21));
            s(i23, 4096 - d(i23));
            s(i25, 4096 - d(i25));
            s(i27, 4096 - d(i27));
        }
    }

    public byte[] n() {
        byte[] bArr = new byte[320];
        for (int i10 = 0; i10 < 64; i10++) {
            int i11 = i10 * 5;
            int[] iArr = this.f47115b;
            int i12 = i10 * 4;
            int i13 = iArr[i12];
            bArr[i11] = (byte) i13;
            int i14 = iArr[i12 + 1];
            bArr[i11 + 1] = (byte) ((i13 >> 8) | (i14 << 2));
            int i15 = i14 >> 6;
            int i16 = iArr[i12 + 2];
            bArr[i11 + 2] = (byte) (i15 | (i16 << 4));
            int i17 = iArr[i12 + 3];
            bArr[i11 + 3] = (byte) ((i17 << 6) | (i16 >> 4));
            bArr[i11 + 4] = (byte) (i17 >> 2);
        }
        return bArr;
    }

    public void o(h hVar) {
        for (int i10 = 0; i10 < 256; i10++) {
            int[] iArrA = m.a(d(i10));
            s(i10, iArrA[0]);
            hVar.s(i10, iArrA[1]);
        }
    }

    public void p() {
        for (int i10 = 0; i10 < 256; i10++) {
            s(i10, l.c(d(i10)));
        }
    }

    public void s(int i10, int i11) {
        this.f47115b[i10] = i11;
    }

    public void t(int[] iArr) {
        this.f47115b = iArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        int i10 = 0;
        while (true) {
            int[] iArr = this.f47115b;
            if (i10 >= iArr.length) {
                stringBuffer.append("]");
                return stringBuffer.toString();
            }
            stringBuffer.append(iArr[i10]);
            if (i10 != this.f47115b.length - 1) {
                stringBuffer.append(", ");
            }
            i10++;
        }
    }

    public void u(byte[] bArr, short s10) {
        int i10 = this.f47114a;
        n nVar = this.f47117d;
        int i11 = i10 * nVar.f47121a;
        byte[] bArr2 = new byte[i11 + 2];
        nVar.a(bArr, s10);
        this.f47117d.b(bArr2, 0, i11);
        int iR = r(this, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, bArr2, i11);
        while (iR < 256) {
            int i12 = i11 % 3;
            for (int i13 = 0; i13 < i12; i13++) {
                bArr2[i13] = bArr2[(i11 - i12) + i13];
            }
            n nVar2 = this.f47117d;
            nVar2.b(bArr2, i12, nVar2.f47121a);
            i11 = this.f47117d.f47121a + i12;
            iR += r(this, iR, 256 - iR, bArr2, i11);
        }
    }

    public void v(byte[] bArr, short s10) {
        int i10;
        int i11;
        int iE = this.f47116c.e();
        if (this.f47116c.e() == 2) {
            i10 = this.f47117d.f47122b;
            i11 = i10 + 135;
        } else {
            if (this.f47116c.e() != 4) {
                throw new RuntimeException("Wrong Dilithium Eta!");
            }
            i10 = this.f47117d.f47122b;
            i11 = i10 + 226;
        }
        int i12 = i11 / i10;
        n nVar = this.f47117d;
        int i13 = i12 * nVar.f47122b;
        byte[] bArr2 = new byte[i13];
        nVar.c(bArr, s10);
        this.f47117d.d(bArr2, 0, i13);
        h hVar = this;
        int iQ = q(hVar, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, bArr2, i13, iE);
        while (iQ < 256) {
            n nVar2 = hVar.f47117d;
            nVar2.d(bArr2, 0, nVar2.f47122b);
            iQ += q(hVar, iQ, 256 - iQ, bArr2, hVar.f47117d.f47122b, iE);
            hVar = this;
        }
    }
}
