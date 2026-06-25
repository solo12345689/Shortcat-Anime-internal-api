package mg;

import fg.AbstractC4807e;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.d;
import tg.C6683h;
import tg.InterfaceC6684i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f53666g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f53667h = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6684i f53668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f53669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6683h f53670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d.b f53673f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(InterfaceC6684i sink, boolean z10) {
        AbstractC5504s.h(sink, "sink");
        this.f53668a = sink;
        this.f53669b = z10;
        C6683h c6683h = new C6683h();
        this.f53670c = c6683h;
        this.f53671d = 16384;
        this.f53673f = new d.b(0, false, c6683h, 3, null);
    }

    private final void D(int i10, long j10) {
        while (j10 > 0) {
            long jMin = Math.min(this.f53671d, j10);
            j10 -= jMin;
            j(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f53668a.t0(this.f53670c, jMin);
        }
    }

    public final synchronized void C(int i10, long j10) {
        if (this.f53672e) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        j(i10, 4, 8, 0);
        this.f53668a.writeInt((int) j10);
        this.f53668a.flush();
    }

    public final synchronized void a(m peerSettings) {
        try {
            AbstractC5504s.h(peerSettings, "peerSettings");
            if (this.f53672e) {
                throw new IOException("closed");
            }
            this.f53671d = peerSettings.e(this.f53671d);
            if (peerSettings.b() != -1) {
                this.f53673f.e(peerSettings.b());
            }
            j(0, 0, 4, 1);
            this.f53668a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f53672e) {
                throw new IOException("closed");
            }
            if (this.f53669b) {
                Logger logger = f53667h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC4807e.t(">> CONNECTION " + e.f53536b.u(), new Object[0]));
                }
                this.f53668a.A0(e.f53536b);
                this.f53668a.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f53672e = true;
        this.f53668a.close();
    }

    public final synchronized void flush() {
        if (this.f53672e) {
            throw new IOException("closed");
        }
        this.f53668a.flush();
    }

    public final synchronized void g(boolean z10, int i10, C6683h c6683h, int i11) {
        if (this.f53672e) {
            throw new IOException("closed");
        }
        h(i10, z10 ? 1 : 0, c6683h, i11);
    }

    public final void h(int i10, int i11, C6683h c6683h, int i12) {
        j(i10, i12, 0, i11);
        if (i12 > 0) {
            InterfaceC6684i interfaceC6684i = this.f53668a;
            AbstractC5504s.e(c6683h);
            interfaceC6684i.t0(c6683h, i12);
        }
    }

    public final void j(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        Logger logger = f53667h;
        if (logger.isLoggable(Level.FINE)) {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
            logger.fine(e.f53535a.c(false, i14, i15, i16, i17));
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        if (i15 > this.f53671d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f53671d + ": " + i15).toString());
        }
        if ((Integer.MIN_VALUE & i14) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i14).toString());
        }
        AbstractC4807e.c0(this.f53668a, i15);
        this.f53668a.writeByte(i16 & 255);
        this.f53668a.writeByte(i17 & 255);
        this.f53668a.writeInt(Integer.MAX_VALUE & i14);
    }

    public final synchronized void k(int i10, b errorCode, byte[] debugData) {
        try {
            AbstractC5504s.h(errorCode, "errorCode");
            AbstractC5504s.h(debugData, "debugData");
            if (this.f53672e) {
                throw new IOException("closed");
            }
            if (errorCode.b() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            j(0, debugData.length + 8, 7, 0);
            this.f53668a.writeInt(i10);
            this.f53668a.writeInt(errorCode.b());
            if (!(debugData.length == 0)) {
                this.f53668a.write(debugData);
            }
            this.f53668a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void l(boolean z10, int i10, List headerBlock) {
        AbstractC5504s.h(headerBlock, "headerBlock");
        if (this.f53672e) {
            throw new IOException("closed");
        }
        this.f53673f.g(headerBlock);
        long size = this.f53670c.size();
        long jMin = Math.min(this.f53671d, size);
        int i11 = size == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        j(i10, (int) jMin, 1, i11);
        this.f53668a.t0(this.f53670c, jMin);
        if (size > jMin) {
            D(i10, size - jMin);
        }
    }

    public final int m() {
        return this.f53671d;
    }

    public final synchronized void o(boolean z10, int i10, int i11) {
        if (this.f53672e) {
            throw new IOException("closed");
        }
        j(0, 8, 6, z10 ? 1 : 0);
        this.f53668a.writeInt(i10);
        this.f53668a.writeInt(i11);
        this.f53668a.flush();
    }

    public final synchronized void q(int i10, int i11, List requestHeaders) {
        AbstractC5504s.h(requestHeaders, "requestHeaders");
        if (this.f53672e) {
            throw new IOException("closed");
        }
        this.f53673f.g(requestHeaders);
        long size = this.f53670c.size();
        int iMin = (int) Math.min(((long) this.f53671d) - 4, size);
        long j10 = iMin;
        j(i10, iMin + 4, 5, size == j10 ? 4 : 0);
        this.f53668a.writeInt(i11 & Integer.MAX_VALUE);
        this.f53668a.t0(this.f53670c, j10);
        if (size > j10) {
            D(i10, size - j10);
        }
    }

    public final synchronized void w(int i10, b errorCode) {
        AbstractC5504s.h(errorCode, "errorCode");
        if (this.f53672e) {
            throw new IOException("closed");
        }
        if (errorCode.b() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        j(i10, 4, 3, 0);
        this.f53668a.writeInt(errorCode.b());
        this.f53668a.flush();
    }

    public final synchronized void z(m settings) {
        try {
            AbstractC5504s.h(settings, "settings");
            if (this.f53672e) {
                throw new IOException("closed");
            }
            int i10 = 0;
            j(0, settings.i() * 6, 4, 0);
            while (i10 < 10) {
                if (settings.f(i10)) {
                    this.f53668a.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.f53668a.writeInt(settings.a(i10));
                }
                i10++;
            }
            this.f53668a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
