package androidx.media3.exoplayer.dash;

import F2.C1557l;
import F2.u;
import F2.w;
import M2.AbstractC1911a;
import M2.B;
import M2.C;
import M2.C1921k;
import M2.C1934y;
import M2.D;
import M2.InterfaceC1920j;
import M2.L;
import M2.M;
import Q2.j;
import Q2.k;
import Q2.m;
import Q2.n;
import Q2.o;
import R2.b;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import androidx.media3.exoplayer.dash.f;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q2.AbstractC6076H;
import q2.C6071C;
import q2.C6080L;
import q2.Y;
import r3.r;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;
import w2.InterfaceC6932F;
import w2.InterfaceC6940g;
import w2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource extends AbstractC1911a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private m f30600A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private InterfaceC6932F f30601B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private IOException f30602C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Handler f30603D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private C6071C.g f30604E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Uri f30605F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Uri f30606G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private E2.c f30607H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f30608I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f30609J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f30610K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f30611L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f30612M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f30613N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f30614O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private C6071C f30615P;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f30616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC6940g.a f30617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0521a f30618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC1920j f30619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u f30620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final k f30621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final D2.b f30622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f30623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f30624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final L.a f30625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o.a f30626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final e f30627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f30628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final SparseArray f30629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f30630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f30631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final f.b f30632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final n f30633y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private InterfaceC6940g f30634z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Factory implements M {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int f30635k = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a.InterfaceC0521a f30636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC6940g.a f30637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private w f30638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InterfaceC1920j f30639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private k f30640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f30641h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f30642i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private o.a f30643j;

        public Factory(InterfaceC6940g.a aVar) {
            this(new d.a(aVar), aVar);
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public DashMediaSource e(C6071C c6071c) {
            AbstractC6614a.e(c6071c.f56328b);
            o.a dVar = this.f30643j;
            if (dVar == null) {
                dVar = new E2.d();
            }
            List list = c6071c.f56328b.f56433e;
            return new DashMediaSource(c6071c, null, this.f30637d, !list.isEmpty() ? new L2.b(dVar, list) : dVar, this.f30636c, this.f30639f, null, this.f30638e.a(c6071c), this.f30640g, this.f30641h, this.f30642i, null);
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory c(boolean z10) {
            this.f30636c.c(z10);
            return this;
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory b(int i10) {
            this.f30636c.b(i10);
            return this;
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory f(w wVar) {
            this.f30638e = (w) AbstractC6614a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory d(k kVar) {
            this.f30640g = (k) AbstractC6614a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory a(r.a aVar) {
            this.f30636c.a((r.a) AbstractC6614a.e(aVar));
            return this;
        }

        public Factory(a.InterfaceC0521a interfaceC0521a, InterfaceC6940g.a aVar) {
            this.f30636c = (a.InterfaceC0521a) AbstractC6614a.e(interfaceC0521a);
            this.f30637d = aVar;
            this.f30638e = new C1557l();
            this.f30640g = new j();
            this.f30641h = HTTPTimeoutManager.DEFAULT_TIMEOUT_MS;
            this.f30642i = 5000000L;
            this.f30639f = new C1921k();
            c(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements b.InterfaceC0261b {
        a() {
        }

        @Override // R2.b.InterfaceC0261b
        public void a(IOException iOException) {
            DashMediaSource.this.Y(iOException);
        }

        @Override // R2.b.InterfaceC0261b
        public void b() {
            DashMediaSource.this.Z(R2.b.i());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends Y {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f30645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f30646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f30647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f30648h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f30649i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f30650j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f30651k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final E2.c f30652l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final C6071C f30653m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C6071C.g f30654n;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, E2.c cVar, C6071C c6071c, C6071C.g gVar) {
            AbstractC6614a.g(cVar.f4211d == (gVar != null));
            this.f30645e = j10;
            this.f30646f = j11;
            this.f30647g = j12;
            this.f30648h = i10;
            this.f30649i = j13;
            this.f30650j = j14;
            this.f30651k = j15;
            this.f30652l = cVar;
            this.f30653m = c6071c;
            this.f30654n = gVar;
        }

        private long x(long j10) {
            D2.f fVarB;
            long j11 = this.f30651k;
            if (!y(this.f30652l)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f30650j) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.f30649i + j11;
            long jG = this.f30652l.g(0);
            int i10 = 0;
            while (i10 < this.f30652l.e() - 1 && j12 >= jG) {
                j12 -= jG;
                i10++;
                jG = this.f30652l.g(i10);
            }
            E2.g gVarD = this.f30652l.d(i10);
            int iA = gVarD.a(2);
            return (iA == -1 || (fVarB = ((E2.j) ((E2.a) gVarD.f4246c.get(iA)).f4200c.get(0)).b()) == null || fVarB.j(jG) == 0) ? j11 : (j11 + fVarB.d(fVarB.i(j12, jG))) - j12;
        }

        private static boolean y(E2.c cVar) {
            return cVar.f4211d && cVar.f4212e != -9223372036854775807L && cVar.f4209b == -9223372036854775807L;
        }

        @Override // q2.Y
        public int f(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f30648h) >= 0 && iIntValue < m()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // q2.Y
        public Y.b k(int i10, Y.b bVar, boolean z10) {
            AbstractC6614a.c(i10, 0, m());
            return bVar.t(z10 ? this.f30652l.d(i10).f4244a : null, z10 ? Integer.valueOf(this.f30648h + i10) : null, 0, this.f30652l.g(i10), a0.V0(this.f30652l.d(i10).f4245b - this.f30652l.d(0).f4245b) - this.f30649i);
        }

        @Override // q2.Y
        public int m() {
            return this.f30652l.e();
        }

        @Override // q2.Y
        public Object q(int i10) {
            AbstractC6614a.c(i10, 0, m());
            return Integer.valueOf(this.f30648h + i10);
        }

        @Override // q2.Y
        public Y.d s(int i10, Y.d dVar, long j10) {
            AbstractC6614a.c(i10, 0, 1);
            long jX = x(j10);
            Object obj = Y.d.f56668q;
            C6071C c6071c = this.f30653m;
            E2.c cVar = this.f30652l;
            return dVar.h(obj, c6071c, cVar, this.f30645e, this.f30646f, this.f30647g, true, y(cVar), this.f30654n, jX, this.f30650j, 0, m() - 1, this.f30649i);
        }

        @Override // q2.Y
        public int t() {
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements f.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.dash.f.b
        public void a(long j10) {
            DashMediaSource.this.Q(j10);
        }

        @Override // androidx.media3.exoplayer.dash.f.b
        public void b() {
            DashMediaSource.this.R();
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Pattern f30656a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // Q2.o.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = f30656a.matcher(line);
                if (!matcher.matches()) {
                    throw C6080L.c("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j10 * (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw C6080L.c(null, e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class e implements m.b {
        private e() {
        }

        @Override // Q2.m.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void h(o oVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.S(oVar, j10, j11);
        }

        @Override // Q2.m.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, long j10, long j11) {
            DashMediaSource.this.T(oVar, j10, j11);
        }

        @Override // Q2.m.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public m.c n(o oVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.U(oVar, j10, j11, iOException, i10);
        }

        @Override // Q2.m.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void v(o oVar, long j10, long j11, int i10) {
            DashMediaSource.this.V(oVar, j10, j11, i10);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class f implements n {
        f() {
        }

        private void a() throws IOException {
            if (DashMediaSource.this.f30602C != null) {
                throw DashMediaSource.this.f30602C;
            }
        }

        @Override // Q2.n
        public void b() throws IOException {
            DashMediaSource.this.f30600A.b();
            a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class g implements m.b {
        private g() {
        }

        @Override // Q2.m.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void h(o oVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.S(oVar, j10, j11);
        }

        @Override // Q2.m.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, long j10, long j11) {
            DashMediaSource.this.W(oVar, j10, j11);
        }

        @Override // Q2.m.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public m.c n(o oVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.X(oVar, j10, j11, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class h implements o.a {
        private h() {
        }

        @Override // Q2.o.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(a0.d1(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        AbstractC6076H.a("media3.exoplayer.dash");
    }

    /* synthetic */ DashMediaSource(C6071C c6071c, E2.c cVar, InterfaceC6940g.a aVar, o.a aVar2, a.InterfaceC0521a interfaceC0521a, InterfaceC1920j interfaceC1920j, Q2.e eVar, u uVar, k kVar, long j10, long j11, a aVar3) {
        this(c6071c, cVar, aVar, aVar2, interfaceC0521a, interfaceC1920j, eVar, uVar, kVar, j10, j11);
    }

    private static long J(E2.g gVar, long j10, long j11) {
        long jV0 = a0.V0(gVar.f4245b);
        boolean zN = N(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f4246c.size(); i10++) {
            E2.a aVar = (E2.a) gVar.f4246c.get(i10);
            List list = aVar.f4200c;
            int i11 = aVar.f4199b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zN || !z10) && !list.isEmpty()) {
                D2.f fVarB = ((E2.j) list.get(0)).b();
                if (fVarB == null) {
                    return jV0 + j10;
                }
                long jM = fVarB.m(j10, j11);
                if (jM == 0) {
                    return jV0;
                }
                long jF = (fVarB.f(j10, j11) + jM) - 1;
                jMin = Math.min(jMin, fVarB.e(jF, j10) + fVarB.d(jF) + jV0);
            }
        }
        return jMin;
    }

    private static long K(E2.g gVar, long j10, long j11) {
        long jV0 = a0.V0(gVar.f4245b);
        boolean zN = N(gVar);
        long jMax = jV0;
        for (int i10 = 0; i10 < gVar.f4246c.size(); i10++) {
            E2.a aVar = (E2.a) gVar.f4246c.get(i10);
            List list = aVar.f4200c;
            int i11 = aVar.f4199b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zN || !z10) && !list.isEmpty()) {
                D2.f fVarB = ((E2.j) list.get(0)).b();
                if (fVarB == null || fVarB.m(j10, j11) == 0) {
                    return jV0;
                }
                jMax = Math.max(jMax, fVarB.d(fVarB.f(j10, j11)) + jV0);
            }
        }
        return jMax;
    }

    private static long L(E2.c cVar, long j10) {
        D2.f fVarB;
        int iE = cVar.e() - 1;
        E2.g gVarD = cVar.d(iE);
        long jV0 = a0.V0(gVarD.f4245b);
        long jG = cVar.g(iE);
        long jV02 = a0.V0(j10);
        long jV03 = a0.V0(cVar.f4208a);
        long jV04 = a0.V0(cVar.f4212e);
        if (jV04 == -9223372036854775807L || jV04 >= 5000000) {
            jV04 = 5000000;
        }
        for (int i10 = 0; i10 < gVarD.f4246c.size(); i10++) {
            List list = ((E2.a) gVarD.f4246c.get(i10)).f4200c;
            if (!list.isEmpty() && (fVarB = ((E2.j) list.get(0)).b()) != null) {
                long jG2 = ((jV03 + jV0) + fVarB.g(jG, jV02)) - jV02;
                if (jG2 > 0 && (jG2 < jV04 - 100000 || (jG2 > jV04 && jG2 < jV04 + 100000))) {
                    jV04 = jG2;
                }
            }
        }
        return R9.e.b(jV04, 1000L, RoundingMode.CEILING);
    }

    private long M() {
        return Math.min((this.f30612M - 1) * 1000, 5000);
    }

    private static boolean N(E2.g gVar) {
        for (int i10 = 0; i10 < gVar.f4246c.size(); i10++) {
            int i11 = ((E2.a) gVar.f4246c.get(i10)).f4199b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean O(E2.g gVar) {
        for (int i10 = 0; i10 < gVar.f4246c.size(); i10++) {
            D2.f fVarB = ((E2.j) ((E2.a) gVar.f4246c.get(i10)).f4200c.get(0)).b();
            if (fVarB == null || fVarB.k()) {
                return true;
            }
        }
        return false;
    }

    private void P() {
        R2.b.l(this.f30600A, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(IOException iOException) {
        AbstractC6635w.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f30611L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        a0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(long j10) {
        this.f30611L = j10;
        a0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(boolean z10) {
        long j10;
        long j11;
        long j12;
        for (int i10 = 0; i10 < this.f30629u.size(); i10++) {
            int iKeyAt = this.f30629u.keyAt(i10);
            if (iKeyAt >= this.f30614O) {
                ((androidx.media3.exoplayer.dash.c) this.f30629u.valueAt(i10)).P(this.f30607H, iKeyAt - this.f30614O);
            }
        }
        E2.g gVarD = this.f30607H.d(0);
        int iE = this.f30607H.e() - 1;
        E2.g gVarD2 = this.f30607H.d(iE);
        long jG = this.f30607H.g(iE);
        long jV0 = a0.V0(a0.k0(this.f30611L));
        long jK = K(gVarD, this.f30607H.g(0), jV0);
        long J10 = J(gVarD2, jG, jV0);
        boolean z11 = this.f30607H.f4211d && !O(gVarD2);
        if (z11) {
            long j13 = this.f30607H.f4213f;
            if (j13 != -9223372036854775807L) {
                jK = Math.max(jK, J10 - a0.V0(j13));
            }
        }
        long j14 = J10 - jK;
        E2.c cVar = this.f30607H;
        if (cVar.f4211d) {
            AbstractC6614a.g(cVar.f4208a != -9223372036854775807L);
            long jV02 = (jV0 - a0.V0(this.f30607H.f4208a)) - jK;
            h0(jV02, j14);
            long jF1 = this.f30607H.f4208a + a0.F1(jK);
            long jV03 = jV02 - a0.V0(this.f30604E.f56411a);
            j10 = 0;
            long jMin = Math.min(this.f30624p, j14 / 2);
            j11 = jF1;
            j12 = jV03 < jMin ? jMin : jV03;
        } else {
            j10 = 0;
            j11 = -9223372036854775807L;
            j12 = 0;
        }
        long jV04 = jK - a0.V0(gVarD.f4245b);
        E2.c cVar2 = this.f30607H;
        B(new b(cVar2.f4208a, j11, this.f30611L, this.f30614O, jV04, j14, j12, cVar2, a(), this.f30607H.f4211d ? this.f30604E : null));
        if (this.f30616h) {
            return;
        }
        this.f30603D.removeCallbacks(this.f30631w);
        if (z11) {
            this.f30603D.postDelayed(this.f30631w, L(this.f30607H, a0.k0(this.f30611L)));
        }
        if (this.f30608I) {
            g0();
            return;
        }
        if (z10) {
            E2.c cVar3 = this.f30607H;
            if (cVar3.f4211d) {
                long j15 = cVar3.f4212e;
                if (j15 != -9223372036854775807L) {
                    if (j15 == j10) {
                        j15 = HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS;
                    }
                    e0(Math.max(j10, (this.f30609J + j15) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void b0(E2.o oVar) {
        String str = oVar.f4298a;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            c0(oVar);
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            d0(oVar, new d());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            d0(oVar, new h(null));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            P();
        } else {
            Y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void c0(E2.o oVar) {
        try {
            Z(a0.d1(oVar.f4299b) - this.f30610K);
        } catch (C6080L e10) {
            Y(e10);
        }
    }

    private void d0(E2.o oVar, o.a aVar) {
        f0(new o(this.f30634z, Uri.parse(oVar.f4299b), 5, aVar), new g(this, null), 1);
    }

    private void e0(long j10) {
        this.f30603D.postDelayed(this.f30630v, j10);
    }

    private void f0(o oVar, m.b bVar, int i10) {
        this.f30600A.n(oVar, bVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        Uri uri;
        this.f30603D.removeCallbacks(this.f30630v);
        if (this.f30600A.i()) {
            return;
        }
        if (this.f30600A.j()) {
            this.f30608I = true;
            return;
        }
        synchronized (this.f30628t) {
            uri = this.f30605F;
        }
        this.f30608I = false;
        f0(new o(this.f30634z, new o.b().i(uri).b(1).a(), 4, this.f30626r), this.f30627s, this.f30621m.a(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h0(long r19, long r21) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.h0(long, long):void");
    }

    @Override // M2.AbstractC1911a
    protected void A(InterfaceC6932F interfaceC6932F) {
        this.f30601B = interfaceC6932F;
        this.f30620l.e(Looper.myLooper(), y());
        this.f30620l.s();
        if (this.f30616h) {
            a0(false);
            return;
        }
        this.f30634z = this.f30617i.a();
        this.f30600A = new m("DashMediaSource");
        this.f30603D = a0.C();
        g0();
    }

    @Override // M2.AbstractC1911a
    protected void C() {
        this.f30608I = false;
        this.f30634z = null;
        m mVar = this.f30600A;
        if (mVar != null) {
            mVar.l();
            this.f30600A = null;
        }
        this.f30609J = 0L;
        this.f30610K = 0L;
        this.f30605F = this.f30606G;
        this.f30602C = null;
        Handler handler = this.f30603D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f30603D = null;
        }
        this.f30611L = -9223372036854775807L;
        this.f30612M = 0;
        this.f30613N = -9223372036854775807L;
        this.f30629u.clear();
        this.f30622n.i();
        this.f30620l.a();
    }

    void Q(long j10) {
        long j11 = this.f30613N;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.f30613N = j10;
        }
    }

    void R() {
        this.f30603D.removeCallbacks(this.f30631w);
        g0();
    }

    void S(Q2.o oVar, long j10, long j11) {
        C1934y c1934y = new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f30621m.d(oVar.f14345a);
        this.f30625q.l(c1934y, oVar.f14347c);
    }

    void T(Q2.o oVar, long j10, long j11) {
        C1934y c1934y = new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f30621m.d(oVar.f14345a);
        this.f30625q.o(c1934y, oVar.f14347c);
        E2.c cVar = (E2.c) oVar.e();
        E2.c cVar2 = this.f30607H;
        int iE = cVar2 == null ? 0 : cVar2.e();
        long j12 = cVar.d(0).f4245b;
        int i10 = 0;
        while (i10 < iE && this.f30607H.d(i10).f4245b < j12) {
            i10++;
        }
        if (cVar.f4211d) {
            if (iE - i10 > cVar.e()) {
                AbstractC6635w.i("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.f30613N;
                if (j13 == -9223372036854775807L || cVar.f4215h * 1000 > j13) {
                    this.f30612M = 0;
                } else {
                    AbstractC6635w.i("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f4215h + ", " + this.f30613N);
                }
            }
            int i11 = this.f30612M;
            this.f30612M = i11 + 1;
            if (i11 < this.f30621m.a(oVar.f14347c)) {
                e0(M());
                return;
            } else {
                this.f30602C = new D2.c();
                return;
            }
        }
        this.f30607H = cVar;
        this.f30608I = cVar.f4211d & this.f30608I;
        this.f30609J = j10 - j11;
        this.f30610K = j10;
        this.f30614O += i10;
        synchronized (this.f30628t) {
            if (oVar.f14346b.f62825a.equals(this.f30605F)) {
                Uri uriB = this.f30607H.f4218k;
                if (uriB == null) {
                    uriB = Q2.f.b(oVar.f());
                }
                this.f30605F = uriB;
            }
        }
        E2.c cVar3 = this.f30607H;
        if (!cVar3.f4211d || this.f30611L != -9223372036854775807L) {
            a0(true);
            return;
        }
        E2.o oVar2 = cVar3.f4216i;
        if (oVar2 != null) {
            b0(oVar2);
        } else {
            P();
        }
    }

    m.c U(Q2.o oVar, long j10, long j11, IOException iOException, int i10) {
        C1934y c1934y = new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        long jC = this.f30621m.c(new k.c(c1934y, new B(oVar.f14347c), iOException, i10));
        m.c cVarH = jC == -9223372036854775807L ? m.f14328g : m.h(false, jC);
        boolean zC = cVarH.c();
        this.f30625q.s(c1934y, oVar.f14347c, iOException, !zC);
        if (!zC) {
            this.f30621m.d(oVar.f14345a);
        }
        return cVarH;
    }

    void V(Q2.o oVar, long j10, long j11, int i10) {
        this.f30625q.u(i10 == 0 ? new C1934y(oVar.f14345a, oVar.f14346b, j10) : new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f14347c, i10);
    }

    void W(Q2.o oVar, long j10, long j11) {
        C1934y c1934y = new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b());
        this.f30621m.d(oVar.f14345a);
        this.f30625q.o(c1934y, oVar.f14347c);
        Z(((Long) oVar.e()).longValue() - j10);
    }

    m.c X(Q2.o oVar, long j10, long j11, IOException iOException) {
        this.f30625q.s(new C1934y(oVar.f14345a, oVar.f14346b, oVar.f(), oVar.d(), j10, j11, oVar.b()), oVar.f14347c, iOException, true);
        this.f30621m.d(oVar.f14345a);
        Y(iOException);
        return m.f14327f;
    }

    @Override // M2.D
    public synchronized C6071C a() {
        return this.f30615P;
    }

    @Override // M2.D
    public boolean e(C6071C c6071c) {
        C6071C c6071cA = a();
        C6071C.h hVar = (C6071C.h) AbstractC6614a.e(c6071cA.f56328b);
        C6071C.h hVar2 = c6071c.f56328b;
        return hVar2 != null && hVar2.f56429a.equals(hVar.f56429a) && hVar2.f56433e.equals(hVar.f56433e) && Objects.equals(hVar2.f56431c, hVar.f56431c) && c6071cA.f56330d.equals(c6071c.f56330d);
    }

    @Override // M2.D
    public C f(D.b bVar, Q2.b bVar2, long j10) {
        int iIntValue = ((Integer) bVar.f11662a).intValue() - this.f30614O;
        L.a aVarV = v(bVar);
        androidx.media3.exoplayer.dash.c cVar = new androidx.media3.exoplayer.dash.c(this.f30614O + iIntValue, this.f30607H, this.f30622n, iIntValue, this.f30618j, this.f30601B, null, this.f30620l, t(bVar), this.f30621m, aVarV, this.f30611L, this.f30633y, bVar2, this.f30619k, this.f30632x, y());
        this.f30629u.put(cVar.f30662a, cVar);
        return cVar;
    }

    @Override // M2.D
    public synchronized void j(C6071C c6071c) {
        this.f30615P = c6071c;
    }

    @Override // M2.D
    public void l() {
        this.f30633y.b();
    }

    @Override // M2.D
    public void m(C c10) {
        androidx.media3.exoplayer.dash.c cVar = (androidx.media3.exoplayer.dash.c) c10;
        cVar.L();
        this.f30629u.remove(cVar.f30662a);
    }

    private DashMediaSource(C6071C c6071c, E2.c cVar, InterfaceC6940g.a aVar, o.a aVar2, a.InterfaceC0521a interfaceC0521a, InterfaceC1920j interfaceC1920j, Q2.e eVar, u uVar, k kVar, long j10, long j11) {
        this.f30615P = c6071c;
        this.f30604E = c6071c.f56330d;
        this.f30605F = ((C6071C.h) AbstractC6614a.e(c6071c.f56328b)).f56429a;
        this.f30606G = c6071c.f56328b.f56429a;
        this.f30607H = cVar;
        this.f30617i = aVar;
        this.f30626r = aVar2;
        this.f30618j = interfaceC0521a;
        this.f30620l = uVar;
        this.f30621m = kVar;
        this.f30623o = j10;
        this.f30624p = j11;
        this.f30619k = interfaceC1920j;
        this.f30622n = new D2.b();
        boolean z10 = cVar != null;
        this.f30616h = z10;
        a aVar3 = null;
        this.f30625q = v(null);
        this.f30628t = new Object();
        this.f30629u = new SparseArray();
        this.f30632x = new c(this, aVar3);
        this.f30613N = -9223372036854775807L;
        this.f30611L = -9223372036854775807L;
        if (!z10) {
            this.f30627s = new e(this, aVar3);
            this.f30633y = new f();
            this.f30630v = new Runnable() { // from class: D2.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3543a.g0();
                }
            };
            this.f30631w = new Runnable() { // from class: D2.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3544a.a0(false);
                }
            };
            return;
        }
        AbstractC6614a.g(true ^ cVar.f4211d);
        this.f30627s = null;
        this.f30630v = null;
        this.f30631w = null;
        this.f30633y = new n.a();
    }
}
