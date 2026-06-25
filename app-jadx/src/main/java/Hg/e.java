package Hg;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes5.dex */
public class e extends c {
    public e() {
        this(Fg.d.ANY);
    }

    @Override // Fg.j
    public int a(byte[] bArr, int i10) {
        m();
        Oh.g.h(this.f8621f, bArr, i10);
        Oh.g.h(this.f8622g, bArr, i10 + 8);
        Oh.g.h(this.f8623h, bArr, i10 + 16);
        Oh.g.h(this.f8624i, bArr, i10 + 24);
        Oh.g.h(this.f8625j, bArr, i10 + 32);
        Oh.g.h(this.f8626k, bArr, i10 + 40);
        q();
        return 48;
    }

    @Override // Fg.j
    public String c() {
        return "SHA-384";
    }

    @Override // Fg.j
    public int d() {
        return 48;
    }

    @Override // Hg.c
    public void q() {
        super.q();
        this.f8621f = -3766243637369397544L;
        this.f8622g = 7105036623409894663L;
        this.f8623h = -7973340178411365097L;
        this.f8624i = 1526699215303891257L;
        this.f8625j = 7436329637833083697L;
        this.f8626k = -8163818279084223215L;
        this.f8627l = -2662702644619276377L;
        this.f8628m = 5167115440072839076L;
    }

    protected Fg.c r() {
        return i.a(this, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, this.f8616a);
    }

    public e(Fg.d dVar) {
        super(dVar);
        Fg.g.a(r());
        q();
    }
}
