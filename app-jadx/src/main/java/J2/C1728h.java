package J2;

import J2.InterfaceC1737q;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import t.C6555e;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: renamed from: J2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1728h extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f9372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f9373c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f9378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f9379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f9380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f9381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f9382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f9383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IllegalStateException f9384n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC1737q.c f9385o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9371a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6555e f9374d = new C6555e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6555e f9375e = new C6555e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f9376f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f9377g = new ArrayDeque();

    C1728h(HandlerThread handlerThread) {
        this.f9372b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f9375e.a(-2);
        this.f9377g.add(mediaFormat);
    }

    private void f() {
        if (!this.f9377g.isEmpty()) {
            this.f9379i = (MediaFormat) this.f9377g.getLast();
        }
        this.f9374d.b();
        this.f9375e.b();
        this.f9376f.clear();
        this.f9377g.clear();
    }

    private boolean i() {
        return this.f9382l > 0 || this.f9383m;
    }

    private void j() {
        k();
        m();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f9384n;
        if (illegalStateException == null) {
            return;
        }
        this.f9384n = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f9381k;
        if (cryptoException == null) {
            return;
        }
        this.f9381k = null;
        throw cryptoException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f9380j;
        if (codecException == null) {
            return;
        }
        this.f9380j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.f9371a) {
            try {
                if (this.f9383m) {
                    return;
                }
                long j10 = this.f9382l - 1;
                this.f9382l = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f9371a) {
            this.f9384n = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f9371a) {
            try {
                j();
                int iE = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f9374d.d()) {
                    iE = this.f9374d.e();
                }
                return iE;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f9371a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f9375e.d()) {
                    return -1;
                }
                int iE = this.f9375e.e();
                if (iE >= 0) {
                    AbstractC6614a.i(this.f9378h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f9376f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    this.f9378h = (MediaFormat) this.f9377g.remove();
                }
                return iE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f9371a) {
            this.f9382l++;
            ((Handler) a0.l(this.f9373c)).post(new Runnable() { // from class: J2.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9370a.n();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f9371a) {
            try {
                mediaFormat = this.f9378h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        AbstractC6614a.g(this.f9373c == null);
        this.f9372b.start();
        Handler handler = new Handler(this.f9372b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f9373c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f9371a) {
            this.f9381k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f9371a) {
            this.f9380j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f9371a) {
            try {
                this.f9374d.a(i10);
                InterfaceC1737q.c cVar = this.f9385o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f9371a) {
            try {
                MediaFormat mediaFormat = this.f9379i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f9379i = null;
                }
                this.f9375e.a(i10);
                this.f9376f.add(bufferInfo);
                InterfaceC1737q.c cVar = this.f9385o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f9371a) {
            b(mediaFormat);
            this.f9379i = null;
        }
    }

    public void p(InterfaceC1737q.c cVar) {
        synchronized (this.f9371a) {
            this.f9385o = cVar;
        }
    }

    public void q() {
        synchronized (this.f9371a) {
            this.f9383m = true;
            this.f9372b.quit();
            f();
        }
    }
}
