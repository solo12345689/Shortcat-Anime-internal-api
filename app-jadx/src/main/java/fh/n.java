package fh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes5.dex */
abstract class n {

    /* JADX INFO: renamed from: a */
    final int f47121a;

    /* JADX INFO: renamed from: b */
    final int f47122b;

    static class a extends n {

        /* JADX INFO: renamed from: c */
        private final Hg.h f47123c;

        /* JADX INFO: renamed from: d */
        private final Hg.h f47124d;

        a() {
            super(168, 136);
            this.f47123c = new Hg.h(128);
            this.f47124d = new Hg.h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        }

        private void e(Hg.h hVar, byte[] bArr, short s10) {
            hVar.p();
            hVar.update(bArr, 0, bArr.length);
            hVar.update(new byte[]{(byte) s10, (byte) (s10 >> 8)}, 0, 2);
        }

        @Override // fh.n
        void a(byte[] bArr, short s10) {
            e(this.f47123c, bArr, s10);
        }

        @Override // fh.n
        void b(byte[] bArr, int i10, int i11) {
            this.f47123c.s(bArr, i10, i11);
        }

        @Override // fh.n
        void c(byte[] bArr, short s10) {
            e(this.f47124d, bArr, s10);
        }

        @Override // fh.n
        void d(byte[] bArr, int i10, int i11) {
            this.f47124d.s(bArr, i10, i11);
        }
    }

    n(int i10, int i11) {
        this.f47121a = i10;
        this.f47122b = i11;
    }

    abstract void a(byte[] bArr, short s10);

    abstract void b(byte[] bArr, int i10, int i11);

    abstract void c(byte[] bArr, short s10);

    abstract void d(byte[] bArr, int i10, int i11);
}
