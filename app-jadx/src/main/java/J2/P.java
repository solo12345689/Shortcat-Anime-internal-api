package J2;

import J2.InterfaceC1737q;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import t2.AbstractC6614a;
import z2.C7278c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC1737q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f9339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1735o f9340b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b implements InterfaceC1737q.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        /* JADX WARN: Type inference failed for: r0v0, types: [J2.P$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // J2.InterfaceC1737q.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public J2.InterfaceC1737q b(J2.InterfaceC1737q.a r7) throws java.lang.Throwable {
            /*
                r6 = this;
                r0 = 0
                android.media.MediaCodec r1 = r6.c(r7)     // Catch: java.lang.RuntimeException -> L40 java.io.IOException -> L42
                java.lang.String r2 = "configureCodec"
                t2.P.a(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.view.Surface r2 = r7.f9402d     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r2 != 0) goto L22
                J2.t r3 = r7.f9399a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                boolean r3 = r3.f9419k     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r3 == 0) goto L22
                int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r4 = 35
                if (r3 < r4) goto L22
                r3 = 8
                goto L23
            L1d:
                r7 = move-exception
            L1e:
                r0 = r1
                goto L43
            L20:
                r7 = move-exception
                goto L1e
            L22:
                r3 = 0
            L23:
                android.media.MediaFormat r4 = r7.f9400b     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.media.MediaCrypto r5 = r7.f9403e     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.configure(r4, r2, r5, r3)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                t2.P.b()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                java.lang.String r2 = "startCodec"
                t2.P.a(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.start()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                t2.P.b()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                J2.P r2 = new J2.P     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                J2.o r7 = r7.f9404f     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r2.<init>(r1, r7)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                return r2
            L40:
                r7 = move-exception
                goto L43
            L42:
                r7 = move-exception
            L43:
                if (r0 == 0) goto L48
                r0.release()
            L48:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: J2.P.b.b(J2.q$a):J2.q");
        }

        protected MediaCodec c(InterfaceC1737q.a aVar) throws IOException {
            AbstractC6614a.e(aVar.f9399a);
            String str = aVar.f9399a.f9409a;
            t2.P.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            t2.P.b();
            return mediaCodecCreateByCodecName;
        }
    }

    public static /* synthetic */ void r(P p10, InterfaceC1737q.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        p10.getClass();
        dVar.a(p10, j10, j11);
    }

    @Override // J2.InterfaceC1737q
    public void a() {
        C1735o c1735o;
        C1735o c1735o2;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                this.f9339a.stop();
            }
            if (i10 >= 35 && (c1735o2 = this.f9340b) != null) {
                c1735o2.d(this.f9339a);
            }
            this.f9339a.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (c1735o = this.f9340b) != null) {
                c1735o.d(this.f9339a);
            }
            this.f9339a.release();
            throw th2;
        }
    }

    @Override // J2.InterfaceC1737q
    public void b(int i10, int i11, C7278c c7278c, long j10, int i12) {
        this.f9339a.queueSecureInputBuffer(i10, i11, c7278c.a(), j10, i12);
    }

    @Override // J2.InterfaceC1737q
    public void c(int i10, int i11, int i12, long j10, int i13) {
        this.f9339a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // J2.InterfaceC1737q
    public void d(Bundle bundle) {
        this.f9339a.setParameters(bundle);
    }

    @Override // J2.InterfaceC1737q
    public MediaFormat e() {
        return this.f9339a.getOutputFormat();
    }

    @Override // J2.InterfaceC1737q
    public void f() {
        this.f9339a.detachOutputSurface();
    }

    @Override // J2.InterfaceC1737q
    public void flush() {
        this.f9339a.flush();
    }

    @Override // J2.InterfaceC1737q
    public void g(final InterfaceC1737q.d dVar, Handler handler) {
        this.f9339a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: J2.O
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                P.r(this.f9337a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // J2.InterfaceC1737q
    public void h(int i10) {
        this.f9339a.setVideoScalingMode(i10);
    }

    @Override // J2.InterfaceC1737q
    public ByteBuffer i(int i10) {
        return this.f9339a.getInputBuffer(i10);
    }

    @Override // J2.InterfaceC1737q
    public void j(Surface surface) {
        this.f9339a.setOutputSurface(surface);
    }

    @Override // J2.InterfaceC1737q
    public boolean k() {
        return false;
    }

    @Override // J2.InterfaceC1737q
    public void l(int i10, long j10) {
        this.f9339a.releaseOutputBuffer(i10, j10);
    }

    @Override // J2.InterfaceC1737q
    public int m() {
        return this.f9339a.dequeueInputBuffer(0L);
    }

    @Override // J2.InterfaceC1737q
    public int o(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f9339a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // J2.InterfaceC1737q
    public void p(int i10, boolean z10) {
        this.f9339a.releaseOutputBuffer(i10, z10);
    }

    @Override // J2.InterfaceC1737q
    public ByteBuffer q(int i10) {
        return this.f9339a.getOutputBuffer(i10);
    }

    private P(MediaCodec mediaCodec, C1735o c1735o) {
        this.f9339a = mediaCodec;
        this.f9340b = c1735o;
        if (Build.VERSION.SDK_INT < 35 || c1735o == null) {
            return;
        }
        c1735o.b(mediaCodec);
    }
}
