package gh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes5.dex */
abstract class l {

    /* JADX INFO: renamed from: a */
    final int f47532a;

    static class a extends l {

        /* JADX INFO: renamed from: b */
        private final Hg.h f47533b;

        /* JADX INFO: renamed from: c */
        private final Hg.f f47534c;

        /* JADX INFO: renamed from: d */
        private final Hg.f f47535d;

        /* JADX INFO: renamed from: e */
        private final Hg.h f47536e;

        a() {
            super(168);
            this.f47533b = new Hg.h(128);
            this.f47536e = new Hg.h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            this.f47535d = new Hg.f(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            this.f47534c = new Hg.f(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
        }

        @Override // gh.l
        void a(byte[] bArr, byte[] bArr2) {
            this.f47534c.update(bArr2, 0, bArr2.length);
            this.f47534c.a(bArr, 0);
        }

        @Override // gh.l
        void b(byte[] bArr, byte[] bArr2, int i10) {
            this.f47535d.update(bArr2, 0, bArr2.length);
            this.f47535d.a(bArr, i10);
        }

        @Override // gh.l
        void c(byte[] bArr, byte[] bArr2, byte b10) {
            int length = bArr2.length + 1;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            bArr3[bArr2.length] = b10;
            this.f47536e.update(bArr3, 0, length);
            this.f47536e.e(bArr, 0, bArr.length);
        }

        @Override // gh.l
        void d(byte[] bArr, byte b10, byte b11) {
            this.f47533b.p();
            byte[] bArr2 = new byte[bArr.length + 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr2[bArr.length] = b10;
            bArr2[bArr.length + 1] = b11;
            this.f47533b.update(bArr2, 0, bArr.length + 2);
        }

        @Override // gh.l
        void e(byte[] bArr, int i10, int i11) {
            this.f47533b.s(bArr, i10, i11);
        }
    }

    l(int i10) {
        this.f47532a = i10;
    }

    abstract void a(byte[] bArr, byte[] bArr2);

    abstract void b(byte[] bArr, byte[] bArr2, int i10);

    abstract void c(byte[] bArr, byte[] bArr2, byte b10);

    abstract void d(byte[] bArr, byte b10, byte b11);

    abstract void e(byte[] bArr, int i10, int i11);
}
