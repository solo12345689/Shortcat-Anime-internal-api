package J2;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import t2.AbstractC6614a;
import t2.C6626m;
import t2.a0;
import w.Y;
import z2.C7278c;

/* JADX INFO: renamed from: J2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C1726f implements r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f9355g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f9356h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f9357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f9358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f9359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f9360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6626m f9361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9362f;

    /* JADX INFO: renamed from: J2.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1726f.this.j(message);
        }
    }

    /* JADX INFO: renamed from: J2.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f9367d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9369f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f9364a = i10;
            this.f9365b = i11;
            this.f9366c = i12;
            this.f9368e = j10;
            this.f9369f = i13;
        }
    }

    public C1726f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C6626m());
    }

    private void f() {
        this.f9361e.d();
        ((Handler) AbstractC6614a.e(this.f9359c)).obtainMessage(3).sendToTarget();
        this.f9361e.a();
    }

    private static void g(C7278c c7278c, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c7278c.f65546f;
        cryptoInfo.numBytesOfClearData = i(c7278c.f65544d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(c7278c.f65545e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) AbstractC6614a.e(h(c7278c.f65542b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) AbstractC6614a.e(h(c7278c.f65541a, cryptoInfo.iv));
        cryptoInfo.mode = c7278c.f65543c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c7278c.f65547g, c7278c.f65548h));
    }

    private static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(android.os.Message r9) {
        /*
            r8 = this;
            int r2 = r9.what
            r3 = 1
            if (r2 == r3) goto L43
            r3 = 2
            if (r2 == r3) goto L2e
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L28
            r3 = 4
            if (r2 == r3) goto L20
            java.util.concurrent.atomic.AtomicReference r2 = r8.f9360d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            int r1 = r9.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
            w.Y.a(r2, r4, r3)
            goto L57
        L20:
            java.lang.Object r1 = r9.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            r8.m(r1)
            goto L57
        L28:
            t2.m r1 = r8.f9361e
            r1.f()
            goto L57
        L2e:
            java.lang.Object r1 = r9.obj
            r7 = r1
            J2.f$b r7 = (J2.C1726f.b) r7
            int r1 = r7.f9364a
            int r2 = r7.f9365b
            android.media.MediaCodec$CryptoInfo r3 = r7.f9367d
            long r4 = r7.f9368e
            int r6 = r7.f9369f
            r0 = r8
            r0.l(r1, r2, r3, r4, r6)
        L41:
            r4 = r7
            goto L57
        L43:
            java.lang.Object r0 = r9.obj
            r7 = r0
            J2.f$b r7 = (J2.C1726f.b) r7
            int r1 = r7.f9364a
            int r2 = r7.f9365b
            int r3 = r7.f9366c
            long r4 = r7.f9368e
            int r6 = r7.f9369f
            r0 = r8
            r0.k(r1, r2, r3, r4, r6)
            goto L41
        L57:
            if (r4 == 0) goto L5c
            p(r4)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.C1726f.j(android.os.Message):void");
    }

    private void k(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f9357a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            Y.a(this.f9360d, null, e10);
        }
    }

    private void l(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f9356h) {
                this.f9357a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            Y.a(this.f9360d, null, e10);
        }
    }

    private void m(Bundle bundle) {
        try {
            this.f9357a.setParameters(bundle);
        } catch (RuntimeException e10) {
            Y.a(this.f9360d, null, e10);
        }
    }

    private void n() {
        ((Handler) AbstractC6614a.e(this.f9359c)).removeCallbacksAndMessages(null);
        f();
    }

    private static b o() {
        ArrayDeque arrayDeque = f9355g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void p(b bVar) {
        ArrayDeque arrayDeque = f9355g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // J2.r
    public void a() {
        RuntimeException runtimeException = (RuntimeException) this.f9360d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // J2.r
    public void b(int i10, int i11, C7278c c7278c, long j10, int i12) {
        a();
        b bVarO = o();
        bVarO.a(i10, i11, 0, j10, i12);
        g(c7278c, bVarO.f9367d);
        ((Handler) a0.l(this.f9359c)).obtainMessage(2, bVarO).sendToTarget();
    }

    @Override // J2.r
    public void c(int i10, int i11, int i12, long j10, int i13) {
        a();
        b bVarO = o();
        bVarO.a(i10, i11, i12, j10, i13);
        ((Handler) a0.l(this.f9359c)).obtainMessage(1, bVarO).sendToTarget();
    }

    @Override // J2.r
    public void d(Bundle bundle) {
        a();
        ((Handler) a0.l(this.f9359c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // J2.r
    public void flush() {
        if (this.f9362f) {
            try {
                n();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // J2.r
    public void shutdown() {
        if (this.f9362f) {
            flush();
            this.f9358b.quit();
        }
        this.f9362f = false;
    }

    @Override // J2.r
    public void start() {
        if (this.f9362f) {
            return;
        }
        this.f9358b.start();
        this.f9359c = new a(this.f9358b.getLooper());
        this.f9362f = true;
    }

    C1726f(MediaCodec mediaCodec, HandlerThread handlerThread, C6626m c6626m) {
        this.f9357a = mediaCodec;
        this.f9358b = handlerThread;
        this.f9361e = c6626m;
        this.f9360d = new AtomicReference();
    }
}
