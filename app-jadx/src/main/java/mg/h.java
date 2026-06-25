package mg;

import fg.AbstractC4807e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.d;
import oe.AbstractC5874j;
import oe.C5868d;
import tg.C6683h;
import tg.C6686k;
import tg.InterfaceC6685j;
import tg.Z;
import tg.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f53626e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f53627f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6685j f53628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f53629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f53630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d.a f53631d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return h.f53627f;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        void a(boolean z10, int i10, int i11, List list);

        void b(int i10, long j10);

        void c(int i10, mg.b bVar, C6686k c6686k);

        void e(boolean z10, int i10, InterfaceC6685j interfaceC6685j, int i11);

        void f(int i10, int i11, List list);

        void h(int i10, mg.b bVar);

        void i();

        void j(boolean z10, m mVar);

        void k(boolean z10, int i10, int i11);

        void n(int i10, int i11, int i12, boolean z10);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        AbstractC5504s.g(logger, "getLogger(Http2::class.java.name)");
        f53627f = logger;
    }

    public h(InterfaceC6685j source, boolean z10) {
        AbstractC5504s.h(source, "source");
        this.f53628a = source;
        this.f53629b = z10;
        b bVar = new b(source);
        this.f53630c = bVar;
        this.f53631d = new d.a(bVar, 4096, 0, 4, null);
    }

    private final void C(c cVar, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            cVar.i();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i10);
        }
        m mVar = new m();
        C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, i10), 6);
        int iF = c5868dV.f();
        int i14 = c5868dV.i();
        int iL = c5868dV.l();
        if ((iL > 0 && iF <= i14) || (iL < 0 && i14 <= iF)) {
            while (true) {
                int iE = AbstractC4807e.e(this.f53628a.readShort(), 65535);
                i13 = this.f53628a.readInt();
                if (iE != 2) {
                    if (iE == 3) {
                        iE = 4;
                    } else if (iE != 4) {
                        if (iE == 5 && (i13 < 16384 || i13 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i13 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iE = 7;
                    }
                } else if (i13 != 0 && i13 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                mVar.h(iE, i13);
                if (iF == i14) {
                    break;
                } else {
                    iF += iL;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i13);
        }
        cVar.j(false, mVar);
    }

    private final void D(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
        }
        long jF = AbstractC4807e.f(this.f53628a.readInt(), 2147483647L);
        if (jF == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.b(i12, jF);
    }

    private final void h(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iD = (i11 & 8) != 0 ? AbstractC4807e.d(this.f53628a.readByte(), 255) : 0;
        cVar.e(z10, i12, this.f53628a, f53626e.b(i10, i11, iD));
        this.f53628a.skip(iD);
    }

    private final void j(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f53628a.readInt();
        int i14 = this.f53628a.readInt();
        int i15 = i10 - 8;
        mg.b bVarA = mg.b.f53487b.a(i14);
        if (bVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i14);
        }
        C6686k c6686kY0 = C6686k.f61045e;
        if (i15 > 0) {
            c6686kY0 = this.f53628a.Y0(i15);
        }
        cVar.c(i13, bVarA, c6686kY0);
    }

    private final List k(int i10, int i11, int i12, int i13) throws IOException {
        this.f53630c.h(i10);
        b bVar = this.f53630c;
        bVar.j(bVar.a());
        this.f53630c.k(i11);
        this.f53630c.g(i12);
        this.f53630c.l(i13);
        this.f53631d.k();
        return this.f53631d.e();
    }

    private final void l(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int iD = (i11 & 8) != 0 ? AbstractC4807e.d(this.f53628a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            o(cVar, i12);
            i10 -= 5;
        }
        cVar.a(z10, i12, -1, k(f53626e.b(i10, i11, iD), iD, i11, i12));
    }

    private final void m(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        cVar.k((i11 & 1) != 0, this.f53628a.readInt(), this.f53628a.readInt());
    }

    private final void o(c cVar, int i10) {
        int i11 = this.f53628a.readInt();
        cVar.n(i10, i11 & Integer.MAX_VALUE, AbstractC4807e.d(this.f53628a.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    private final void q(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            o(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    private final void w(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iD = (i11 & 8) != 0 ? AbstractC4807e.d(this.f53628a.readByte(), 255) : 0;
        cVar.f(i12, this.f53628a.readInt() & Integer.MAX_VALUE, k(f53626e.b(i10 - 4, i11, iD), iD, i11, i12));
    }

    private final void z(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f53628a.readInt();
        mg.b bVarA = mg.b.f53487b.a(i13);
        if (bVarA != null) {
            cVar.h(i12, bVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i13);
    }

    public final boolean b(boolean z10, c handler) throws IOException {
        AbstractC5504s.h(handler, "handler");
        try {
            this.f53628a.R0(9L);
            int iK = AbstractC4807e.K(this.f53628a);
            if (iK > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iK);
            }
            int iD = AbstractC4807e.d(this.f53628a.readByte(), 255);
            int iD2 = AbstractC4807e.d(this.f53628a.readByte(), 255);
            int i10 = this.f53628a.readInt() & Integer.MAX_VALUE;
            Logger logger = f53627f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f53535a.c(true, i10, iK, iD, iD2));
            }
            if (z10 && iD != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + e.f53535a.b(iD));
            }
            switch (iD) {
                case 0:
                    h(handler, iK, iD2, i10);
                    return true;
                case 1:
                    l(handler, iK, iD2, i10);
                    return true;
                case 2:
                    q(handler, iK, iD2, i10);
                    return true;
                case 3:
                    z(handler, iK, iD2, i10);
                    return true;
                case 4:
                    C(handler, iK, iD2, i10);
                    return true;
                case 5:
                    w(handler, iK, iD2, i10);
                    return true;
                case 6:
                    m(handler, iK, iD2, i10);
                    return true;
                case 7:
                    j(handler, iK, iD2, i10);
                    return true;
                case 8:
                    D(handler, iK, iD2, i10);
                    return true;
                default:
                    this.f53628a.skip(iK);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f53628a.close();
    }

    public final void g(c handler) throws IOException {
        AbstractC5504s.h(handler, "handler");
        if (this.f53629b) {
            if (!b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC6685j interfaceC6685j = this.f53628a;
        C6686k c6686k = e.f53536b;
        C6686k c6686kY0 = interfaceC6685j.Y0(c6686k.K());
        Logger logger = f53627f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(AbstractC4807e.t("<< CONNECTION " + c6686kY0.u(), new Object[0]));
        }
        if (AbstractC5504s.c(c6686k, c6686kY0)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + c6686kY0.Q());
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC6685j f53632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f53633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f53634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f53635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f53636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f53637f;

        public b(InterfaceC6685j source) {
            AbstractC5504s.h(source, "source");
            this.f53632a = source;
        }

        private final void b() throws IOException {
            int i10 = this.f53635d;
            int iK = AbstractC4807e.K(this.f53632a);
            this.f53636e = iK;
            this.f53633b = iK;
            int iD = AbstractC4807e.d(this.f53632a.readByte(), 255);
            this.f53634c = AbstractC4807e.d(this.f53632a.readByte(), 255);
            a aVar = h.f53626e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f53535a.c(true, this.f53635d, this.f53633b, iD, this.f53634c));
            }
            int i11 = this.f53632a.readInt() & Integer.MAX_VALUE;
            this.f53635d = i11;
            if (iD == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iD + " != TYPE_CONTINUATION");
            }
        }

        @Override // tg.Z
        public long N0(C6683h sink, long j10) throws IOException {
            AbstractC5504s.h(sink, "sink");
            while (true) {
                int i10 = this.f53636e;
                if (i10 != 0) {
                    long jN0 = this.f53632a.N0(sink, Math.min(j10, i10));
                    if (jN0 == -1) {
                        return -1L;
                    }
                    this.f53636e -= (int) jN0;
                    return jN0;
                }
                this.f53632a.skip(this.f53637f);
                this.f53637f = 0;
                if ((this.f53634c & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        public final int a() {
            return this.f53636e;
        }

        public final void g(int i10) {
            this.f53634c = i10;
        }

        public final void h(int i10) {
            this.f53636e = i10;
        }

        public final void j(int i10) {
            this.f53633b = i10;
        }

        public final void k(int i10) {
            this.f53637f = i10;
        }

        public final void l(int i10) {
            this.f53635d = i10;
        }

        @Override // tg.Z
        public a0 t() {
            return this.f53632a.t();
        }

        @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
