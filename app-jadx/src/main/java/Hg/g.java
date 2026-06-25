package Hg;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes5.dex */
public class g extends c {
    public g() {
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
        Oh.g.h(this.f8627l, bArr, i10 + 48);
        Oh.g.h(this.f8628m, bArr, i10 + 56);
        q();
        return 64;
    }

    @Override // Fg.j
    public String c() {
        return "SHA-512";
    }

    @Override // Fg.j
    public int d() {
        return 64;
    }

    @Override // Hg.c
    public void q() {
        super.q();
        this.f8621f = 7640891576956012808L;
        this.f8622g = -4942790177534073029L;
        this.f8623h = 4354685564936845355L;
        this.f8624i = -6534734903238641935L;
        this.f8625j = 5840696475078001361L;
        this.f8626k = -7276294671716946913L;
        this.f8627l = 2270897969802886507L;
        this.f8628m = 6620516959819538809L;
    }

    protected Fg.c r() {
        return i.a(this, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, this.f8616a);
    }

    public g(Fg.d dVar) {
        super(dVar);
        Fg.g.a(r());
        q();
    }
}
