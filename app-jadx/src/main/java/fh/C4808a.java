package fh;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import fh.n;
import java.security.SecureRandom;

/* JADX INFO: renamed from: fh.a */
/* JADX INFO: loaded from: classes5.dex */
class C4808a {

    /* JADX INFO: renamed from: a */
    private final SecureRandom f47071a;

    /* JADX INFO: renamed from: b */
    final Hg.h f47072b = new Hg.h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: c */
    private final int f47073c;

    /* JADX INFO: renamed from: d */
    private final int f47074d;

    /* JADX INFO: renamed from: e */
    private final int f47075e;

    /* JADX INFO: renamed from: f */
    private final int f47076f;

    /* JADX INFO: renamed from: g */
    private final int f47077g;

    /* JADX INFO: renamed from: h */
    private final int f47078h;

    /* JADX INFO: renamed from: i */
    private final int f47079i;

    /* JADX INFO: renamed from: j */
    private final int f47080j;

    /* JADX INFO: renamed from: k */
    private final int f47081k;

    /* JADX INFO: renamed from: l */
    private final int f47082l;

    /* JADX INFO: renamed from: m */
    private final int f47083m;

    /* JADX INFO: renamed from: n */
    private final int f47084n;

    /* JADX INFO: renamed from: o */
    private final int f47085o;

    /* JADX INFO: renamed from: p */
    private final int f47086p;

    /* JADX INFO: renamed from: q */
    private final int f47087q;

    /* JADX INFO: renamed from: r */
    private final int f47088r;

    /* JADX INFO: renamed from: s */
    private final int f47089s;

    /* JADX INFO: renamed from: t */
    private final int f47090t;

    /* JADX INFO: renamed from: u */
    private final n f47091u;

    C4808a(int i10, SecureRandom secureRandom) {
        int i11;
        int i12;
        int i13;
        this.f47077g = i10;
        if (i10 != 2) {
            if (i10 == 3) {
                this.f47078h = 6;
                this.f47079i = 5;
                this.f47080j = 4;
                this.f47081k = 49;
                this.f47082l = 196;
                this.f47083m = 524288;
                this.f47084n = 261888;
                this.f47085o = 55;
                this.f47074d = 640;
                this.f47075e = 128;
                this.f47076f = 128;
                i13 = 48;
            } else {
                if (i10 != 5) {
                    throw new IllegalArgumentException("The mode " + i10 + "is not supported by Crystals Dilithium!");
                }
                this.f47078h = 8;
                this.f47079i = 7;
                this.f47080j = 2;
                this.f47081k = 60;
                this.f47082l = 120;
                this.f47083m = 524288;
                this.f47084n = 261888;
                this.f47085o = 75;
                this.f47074d = 640;
                this.f47075e = 128;
                this.f47076f = 96;
                i13 = 64;
            }
            this.f47086p = i13;
        } else {
            this.f47078h = 4;
            this.f47079i = 4;
            this.f47080j = 2;
            this.f47081k = 39;
            this.f47082l = 78;
            this.f47083m = 131072;
            this.f47084n = 95232;
            this.f47085o = 80;
            this.f47074d = 576;
            this.f47075e = JfifUtil.MARKER_SOFn;
            this.f47076f = 96;
            this.f47086p = 32;
        }
        n.a aVar = new n.a();
        this.f47091u = aVar;
        this.f47071a = secureRandom;
        int i14 = this.f47085o;
        int i15 = this.f47078h;
        int i16 = i14 + i15;
        this.f47073c = i16;
        this.f47087q = (i15 * 320) + 32;
        int i17 = this.f47079i;
        int i18 = this.f47076f;
        this.f47088r = (i17 * i18) + 128 + (i18 * i15) + (i15 * 416);
        this.f47089s = this.f47086p + (i17 * this.f47074d) + i16;
        int i19 = this.f47083m;
        if (i19 == 131072) {
            i11 = aVar.f47122b;
            i12 = i11 + 575;
        } else {
            if (i19 != 524288) {
                throw new RuntimeException("Wrong Dilithium Gamma1!");
            }
            i11 = aVar.f47122b;
            i12 = i11 + 639;
        }
        this.f47090t = i12 / i11;
    }

    protected n a() {
        return this.f47091u;
    }

    byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        k kVar = new k(this);
        j jVar = new j(this);
        i iVar = new i(this);
        i iVar2 = new i(this);
        i iVar3 = new i(this);
        g.c(iVar3, jVar, iVar, bArr6, bArr4, bArr5, this);
        kVar.a(bArr);
        j jVar2 = new j(this);
        jVar.a(jVar2);
        jVar2.c();
        kVar.b(iVar2, jVar2);
        iVar2.f();
        iVar2.d();
        iVar2.a(iVar);
        iVar2.b();
        iVar2.e(iVar3);
        return g.a(iVar2, this);
    }

    byte[][] c(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[32];
        k kVar = new k(this);
        j jVar = new j(this);
        i iVar = new i(this);
        i iVar2 = new i(this);
        i iVar3 = new i(this);
        this.f47072b.update(bArr, 0, 32);
        this.f47072b.b((byte) this.f47078h);
        this.f47072b.b((byte) this.f47079i);
        this.f47072b.e(bArr2, 0, 128);
        System.arraycopy(bArr2, 0, bArr4, 0, 32);
        System.arraycopy(bArr2, 32, bArr5, 0, 64);
        System.arraycopy(bArr2, 96, bArr6, 0, 32);
        kVar.a(bArr4);
        jVar.e(bArr5, (short) 0);
        iVar.g(bArr5, (short) this.f47079i);
        j jVar2 = new j(this);
        jVar.a(jVar2);
        jVar2.c();
        kVar.b(iVar2, jVar2);
        iVar2.f();
        iVar2.d();
        iVar2.a(iVar);
        iVar2.b();
        iVar2.e(iVar3);
        byte[] bArrA = g.a(iVar2, this);
        this.f47072b.update(bArr4, 0, 32);
        this.f47072b.update(bArrA, 0, bArrA.length);
        this.f47072b.e(bArr3, 0, 64);
        byte[][] bArrB = g.b(bArr4, bArr3, bArr6, iVar3, jVar, iVar, this);
        return new byte[][]{bArrB[0], bArrB[1], bArrB[2], bArrB[3], bArrB[4], bArrB[5], bArrA, bArr};
    }

    int d() {
        return this.f47087q;
    }

    int e() {
        return this.f47080j;
    }

    int f() {
        return this.f47078h;
    }

    int g() {
        return this.f47079i;
    }

    int h() {
        return this.f47076f;
    }
}
