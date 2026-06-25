package dg;

import java.io.Closeable;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.C5595a;
import tg.C6683h;
import tg.C6686k;
import tg.InterfaceC6685j;
import tg.K;
import tg.N;
import tg.Z;
import tg.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class z implements Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f45632i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final N f45633j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6685j f45634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6686k f45636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6686k f45637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f45640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f45641h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f45642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC6685j f45643b;

        public b(t headers, InterfaceC6685j body) {
            AbstractC5504s.h(headers, "headers");
            AbstractC5504s.h(body, "body");
            this.f45642a = headers;
            this.f45643b = body;
        }

        public final InterfaceC6685j a() {
            return this.f45643b;
        }

        public final t b() {
            return this.f45642a;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f45643b.close();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements Z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0 f45644a = new a0();

        public c() {
        }

        @Override // tg.Z
        public long N0(C6683h sink, long j10) {
            long j11;
            AbstractC5504s.h(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (!AbstractC5504s.c(z.this.f45641h, this)) {
                throw new IllegalStateException("closed");
            }
            a0 a0VarT = z.this.f45634a.t();
            a0 a0Var = this.f45644a;
            z zVar = z.this;
            long jH = a0VarT.h();
            long jA = a0.f61003d.a(a0Var.h(), a0VarT.h());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            a0VarT.g(jA, timeUnit);
            if (!a0VarT.e()) {
                if (a0Var.e()) {
                    a0VarT.d(a0Var.c());
                }
                try {
                    long j12 = zVar.j(j10);
                    long jN0 = j12 == 0 ? -1L : zVar.f45634a.N0(sink, j12);
                    a0VarT.g(jH, timeUnit);
                    if (a0Var.e()) {
                        a0VarT.a();
                    }
                    return jN0;
                } catch (Throwable th2) {
                    a0VarT.g(jH, TimeUnit.NANOSECONDS);
                    if (a0Var.e()) {
                        a0VarT.a();
                    }
                    throw th2;
                }
            }
            long jC = a0VarT.c();
            if (a0Var.e()) {
                j11 = 0;
                a0VarT.d(Math.min(a0VarT.c(), a0Var.c()));
            } else {
                j11 = 0;
            }
            try {
                long j13 = zVar.j(j10);
                long jN02 = j13 == j11 ? -1L : zVar.f45634a.N0(sink, j13);
                a0VarT.g(jH, timeUnit);
                if (a0Var.e()) {
                    a0VarT.d(jC);
                }
                return jN02;
            } catch (Throwable th3) {
                a0VarT.g(jH, TimeUnit.NANOSECONDS);
                if (a0Var.e()) {
                    a0VarT.d(jC);
                }
                throw th3;
            }
        }

        @Override // tg.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (AbstractC5504s.c(z.this.f45641h, this)) {
                z.this.f45641h = null;
            }
        }

        @Override // tg.Z
        public a0 t() {
            return this.f45644a;
        }
    }

    static {
        N.a aVar = N.f60963d;
        C6686k.a aVar2 = C6686k.f61044d;
        f45633j = aVar.d(aVar2.g("\r\n"), aVar2.g("--"), aVar2.g(" "), aVar2.g("\t"));
    }

    public z(InterfaceC6685j source, String boundary) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(boundary, "boundary");
        this.f45634a = source;
        this.f45635b = boundary;
        this.f45636c = new C6683h().s0("--").s0(boundary).p0();
        this.f45637d = new C6683h().s0("\r\n--").s0(boundary).p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long j(long j10) {
        this.f45634a.R0(this.f45637d.K());
        long jH = this.f45634a.s().H(this.f45637d);
        return jH == -1 ? Math.min(j10, (this.f45634a.s().size() - ((long) this.f45637d.K())) + 1) : Math.min(j10, jH);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f45639f) {
            return;
        }
        this.f45639f = true;
        this.f45641h = null;
        this.f45634a.close();
    }

    public final b k() throws ProtocolException {
        if (this.f45639f) {
            throw new IllegalStateException("closed");
        }
        if (this.f45640g) {
            return null;
        }
        if (this.f45638e == 0 && this.f45634a.Q1(0L, this.f45636c)) {
            this.f45634a.skip(this.f45636c.K());
        } else {
            while (true) {
                long j10 = j(8192L);
                if (j10 == 0) {
                    break;
                }
                this.f45634a.skip(j10);
            }
            this.f45634a.skip(this.f45637d.K());
        }
        boolean z10 = false;
        while (true) {
            int iN = this.f45634a.N(f45633j);
            if (iN == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iN == 0) {
                this.f45638e++;
                t tVarA = new C5595a(this.f45634a).a();
                c cVar = new c();
                this.f45641h = cVar;
                return new b(tVarA, K.d(cVar));
            }
            if (iN == 1) {
                if (z10) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.f45638e == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.f45640g = true;
                return null;
            }
            if (iN == 2 || iN == 3) {
                z10 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(F response) throws ProtocolException {
        String strE;
        AbstractC5504s.h(response, "response");
        InterfaceC6685j interfaceC6685jK = response.k();
        x xVarJ = response.j();
        if (xVarJ != null && (strE = xVarJ.e("boundary")) != null) {
            this(interfaceC6685jK, strE);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
