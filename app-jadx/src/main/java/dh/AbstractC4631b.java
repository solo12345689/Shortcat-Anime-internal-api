package dh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import zg.C7427t;

/* JADX INFO: renamed from: dh.b */
/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractC4631b {

    /* JADX INFO: renamed from: dh.b$a */
    static class a implements Fg.j {

        /* JADX INFO: renamed from: a */
        private final Fg.j f45647a;

        /* JADX INFO: renamed from: b */
        private final int f45648b;

        a(Fg.j jVar, int i10) {
            this.f45647a = jVar;
            this.f45648b = i10;
        }

        @Override // Fg.j
        public int a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[this.f45647a.d()];
            this.f45647a.a(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i10, this.f45648b);
            return this.f45648b;
        }

        @Override // Fg.j
        public void b(byte b10) {
            this.f45647a.b(b10);
        }

        @Override // Fg.j
        public String c() {
            return this.f45647a.c() + "/" + (this.f45648b * 8);
        }

        @Override // Fg.j
        public int d() {
            return this.f45648b;
        }

        @Override // Fg.j
        public void update(byte[] bArr, int i10, int i11) {
            this.f45647a.update(bArr, i10, i11);
        }
    }

    private static Fg.j a(C7427t c7427t) {
        if (c7427t.u(Bg.a.f1958c)) {
            return new Hg.d();
        }
        if (c7427t.u(Bg.a.f1992t)) {
            return new Hg.h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c7427t);
    }

    private static Fg.j b(C7427t c7427t, int i10) {
        Fg.j jVarA = a(c7427t);
        return (Bg.a.f1992t.u(c7427t) || jVarA.d() != i10) ? new a(jVarA, i10) : jVarA;
    }

    static Fg.j c(e eVar) {
        return b(eVar.b(), eVar.d());
    }

    static Fg.j d(n nVar) {
        return b(nVar.b(), nVar.d());
    }
}
