package J2;

import J2.C1723c;
import J2.InterfaceC1737q;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import q2.AbstractC6079K;
import q2.C6109x;
import z2.C7278c;

/* JADX INFO: renamed from: J2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1723c implements InterfaceC1737q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f9344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1728h f9345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f9346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1735o f9347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9349f;

    /* JADX INFO: renamed from: J2.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC1737q.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final O9.t f9350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final O9.t f9351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f9352d;

        public b(final int i10) {
            this(new O9.t() { // from class: J2.d
                @Override // O9.t
                public final Object get() {
                    return C1723c.b.d(i10);
                }
            }, new O9.t() { // from class: J2.e
                @Override // O9.t
                public final Object get() {
                    return C1723c.b.c(i10);
                }
            });
        }

        public static /* synthetic */ HandlerThread c(int i10) {
            return new HandlerThread(C1723c.w(i10));
        }

        public static /* synthetic */ HandlerThread d(int i10) {
            return new HandlerThread(C1723c.v(i10));
        }

        private static boolean g(C6109x c6109x) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || AbstractC6079K.t(c6109x.f57022o);
        }

        @Override // J2.InterfaceC1737q.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1723c b(InterfaceC1737q.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            r c1726f;
            int i10;
            C1723c c1723c;
            String str = aVar.f9399a.f9409a;
            C1723c c1723c2 = null;
            try {
                t2.P.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f9352d && g(aVar.f9401c)) {
                        c1726f = new Q(mediaCodecCreateByCodecName);
                        i10 = 4;
                    } else {
                        c1726f = new C1726f(mediaCodecCreateByCodecName, (HandlerThread) this.f9351c.get());
                        i10 = 0;
                    }
                    c1723c = new C1723c(mediaCodecCreateByCodecName, (HandlerThread) this.f9350b.get(), c1726f, aVar.f9404f);
                } catch (Exception e10) {
                    exc = e10;
                }
            } catch (Exception e11) {
                exc = e11;
                mediaCodecCreateByCodecName = null;
            }
            try {
                t2.P.b();
                Surface surface = aVar.f9402d;
                if (surface == null && aVar.f9399a.f9419k && Build.VERSION.SDK_INT >= 35) {
                    i10 |= 8;
                }
                c1723c.y(aVar.f9400b, surface, aVar.f9403e, i10);
                return c1723c;
            } catch (Exception e12) {
                exc = e12;
                c1723c2 = c1723c;
                if (c1723c2 != null) {
                    c1723c2.a();
                    throw exc;
                }
                if (mediaCodecCreateByCodecName == null) {
                    throw exc;
                }
                mediaCodecCreateByCodecName.release();
                throw exc;
            }
        }

        public void f(boolean z10) {
            this.f9352d = z10;
        }

        public b(O9.t tVar, O9.t tVar2) {
            this.f9350b = tVar;
            this.f9351c = tVar2;
            this.f9352d = false;
        }
    }

    public static /* synthetic */ void r(C1723c c1723c, InterfaceC1737q.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        c1723c.getClass();
        dVar.a(c1723c, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(int i10) {
        return x(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String w(int i10) {
        return x(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String x(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        C1735o c1735o;
        this.f9345b.h(this.f9344a);
        t2.P.a("configureCodec");
        this.f9344a.configure(mediaFormat, surface, mediaCrypto, i10);
        t2.P.b();
        this.f9346c.start();
        t2.P.a("startCodec");
        this.f9344a.start();
        t2.P.b();
        if (Build.VERSION.SDK_INT >= 35 && (c1735o = this.f9347d) != null) {
            c1735o.b(this.f9344a);
        }
        this.f9349f = 1;
    }

    @Override // J2.InterfaceC1737q
    public void a() {
        C1735o c1735o;
        C1735o c1735o2;
        try {
            if (this.f9349f == 1) {
                this.f9346c.shutdown();
                this.f9345b.q();
            }
            this.f9349f = 2;
            if (this.f9348e) {
                return;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30 && i10 < 33) {
                    this.f9344a.stop();
                }
                if (i10 >= 35 && (c1735o2 = this.f9347d) != null) {
                    c1735o2.d(this.f9344a);
                }
                this.f9344a.release();
                this.f9348e = true;
            } finally {
            }
        } catch (Throwable th2) {
            if (!this.f9348e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f9344a.stop();
                    }
                    if (i11 >= 35 && (c1735o = this.f9347d) != null) {
                        c1735o.d(this.f9344a);
                    }
                    this.f9344a.release();
                    this.f9348e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override // J2.InterfaceC1737q
    public void b(int i10, int i11, C7278c c7278c, long j10, int i12) {
        this.f9346c.b(i10, i11, c7278c, j10, i12);
    }

    @Override // J2.InterfaceC1737q
    public void c(int i10, int i11, int i12, long j10, int i13) {
        this.f9346c.c(i10, i11, i12, j10, i13);
    }

    @Override // J2.InterfaceC1737q
    public void d(Bundle bundle) {
        this.f9346c.d(bundle);
    }

    @Override // J2.InterfaceC1737q
    public MediaFormat e() {
        return this.f9345b.g();
    }

    @Override // J2.InterfaceC1737q
    public void f() {
        this.f9344a.detachOutputSurface();
    }

    @Override // J2.InterfaceC1737q
    public void flush() {
        this.f9346c.flush();
        this.f9344a.flush();
        this.f9345b.e();
        this.f9344a.start();
    }

    @Override // J2.InterfaceC1737q
    public void g(final InterfaceC1737q.d dVar, Handler handler) {
        this.f9344a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: J2.b
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                C1723c.r(this.f9342a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // J2.InterfaceC1737q
    public void h(int i10) {
        this.f9344a.setVideoScalingMode(i10);
    }

    @Override // J2.InterfaceC1737q
    public ByteBuffer i(int i10) {
        return this.f9344a.getInputBuffer(i10);
    }

    @Override // J2.InterfaceC1737q
    public void j(Surface surface) {
        this.f9344a.setOutputSurface(surface);
    }

    @Override // J2.InterfaceC1737q
    public boolean k() {
        return false;
    }

    @Override // J2.InterfaceC1737q
    public void l(int i10, long j10) {
        this.f9344a.releaseOutputBuffer(i10, j10);
    }

    @Override // J2.InterfaceC1737q
    public int m() {
        this.f9346c.a();
        return this.f9345b.c();
    }

    @Override // J2.InterfaceC1737q
    public boolean n(InterfaceC1737q.c cVar) {
        this.f9345b.p(cVar);
        return true;
    }

    @Override // J2.InterfaceC1737q
    public int o(MediaCodec.BufferInfo bufferInfo) {
        this.f9346c.a();
        return this.f9345b.d(bufferInfo);
    }

    @Override // J2.InterfaceC1737q
    public void p(int i10, boolean z10) {
        this.f9344a.releaseOutputBuffer(i10, z10);
    }

    @Override // J2.InterfaceC1737q
    public ByteBuffer q(int i10) {
        return this.f9344a.getOutputBuffer(i10);
    }

    private C1723c(MediaCodec mediaCodec, HandlerThread handlerThread, r rVar, C1735o c1735o) {
        this.f9344a = mediaCodec;
        this.f9345b = new C1728h(handlerThread);
        this.f9346c = rVar;
        this.f9347d = c1735o;
        this.f9349f = 0;
    }
}
