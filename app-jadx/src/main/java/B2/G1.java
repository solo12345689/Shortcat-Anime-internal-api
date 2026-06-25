package B2;

import A2.C1004b;
import B2.H1;
import B2.InterfaceC1024b;
import C2.InterfaceC1177z;
import F2.C1553h;
import F2.InterfaceC1558m;
import J2.A;
import M2.C1934y;
import M2.D;
import P9.AbstractC2011u;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.exoplayer.C2907s;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import q2.AbstractC6096k;
import q2.C6071C;
import q2.C6080L;
import q2.C6082N;
import q2.C6102q;
import q2.C6109x;
import q2.InterfaceC6084P;
import q2.Y;
import q2.h0;
import t2.AbstractC6614a;
import t2.AbstractC6616c;
import t2.C6602B;
import w2.C6933G;
import w2.t;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class G1 implements InterfaceC1024b, H1.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f827A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f828B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f829a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H1 f831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PlaybackSession f832d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PlaybackMetrics.Builder f839k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f840l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C6082N f843o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C6109x f847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C6109x f848t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private C6109x f849u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f850v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f851w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f852x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f853y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f854z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f830b = AbstractC6616c.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Y.d f834f = new Y.d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Y.b f835g = new Y.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashMap f837i = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f836h = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f833e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f841m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f842n = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f856b;

        public a(int i10, int i11) {
            this.f855a = i10;
            this.f856b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6109x f857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f859c;

        public b(C6109x c6109x, int i10, String str) {
            this.f857a = c6109x;
            this.f858b = i10;
            this.f859c = str;
        }
    }

    private G1(Context context, PlaybackSession playbackSession) {
        this.f829a = context.getApplicationContext();
        this.f832d = playbackSession;
        C1082z0 c1082z0 = new C1082z0();
        this.f831c = c1082z0;
        c1082z0.c(this);
    }

    private boolean I0(b bVar) {
        return bVar != null && bVar.f859c.equals(this.f831c.a());
    }

    public static G1 J0(Context context) {
        MediaMetricsManager mediaMetricsManagerA = w1.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new G1(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private void K0() {
        PlaybackMetrics.Builder builder = this.f839k;
        if (builder != null && this.f828B) {
            builder.setAudioUnderrunCount(this.f827A);
            this.f839k.setVideoFramesDropped(this.f853y);
            this.f839k.setVideoFramesPlayed(this.f854z);
            Long l10 = (Long) this.f836h.get(this.f838j);
            this.f839k.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f837i.get(this.f838j);
            this.f839k.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f839k.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.f839k.build();
            this.f830b.execute(new Runnable() { // from class: B2.E1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f818a.f832d.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.f839k = null;
        this.f838j = null;
        this.f827A = 0;
        this.f853y = 0;
        this.f854z = 0;
        this.f847s = null;
        this.f848t = null;
        this.f849u = null;
        this.f828B = false;
    }

    private static int L0(int i10) {
        switch (t2.a0.d0(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static C6102q M0(AbstractC2011u abstractC2011u) {
        C6102q c6102q;
        P9.X it = abstractC2011u.iterator();
        while (it.hasNext()) {
            h0.a aVar = (h0.a) it.next();
            for (int i10 = 0; i10 < aVar.f56884a; i10++) {
                if (aVar.i(i10) && (c6102q = aVar.d(i10).f57026s) != null) {
                    return c6102q;
                }
            }
        }
        return null;
    }

    private static int N0(C6102q c6102q) {
        for (int i10 = 0; i10 < c6102q.f56944d; i10++) {
            UUID uuid = c6102q.e(i10).f56946b;
            if (uuid.equals(AbstractC6096k.f56896d)) {
                return 3;
            }
            if (uuid.equals(AbstractC6096k.f56897e)) {
                return 2;
            }
            if (uuid.equals(AbstractC6096k.f56895c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a O0(C6082N c6082n, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (c6082n.f56595a == 1001) {
            return new a(20, 0);
        }
        if (c6082n instanceof C2907s) {
            C2907s c2907s = (C2907s) c6082n;
            z11 = c2907s.f31212j == 1;
            i10 = c2907s.f31216n;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) AbstractC6614a.e(c6082n.getCause());
        if (!(th2 instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof A.c) {
                return new a(13, t2.a0.e0(((A.c) th2).f9318d));
            }
            if (th2 instanceof J2.s) {
                return new a(14, ((J2.s) th2).f9408c);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof InterfaceC1177z.c) {
                return new a(17, ((InterfaceC1177z.c) th2).f2805a);
            }
            if (th2 instanceof InterfaceC1177z.f) {
                return new a(18, ((InterfaceC1177z.f) th2).f2810a);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(L0(errorCode), errorCode);
        }
        if (th2 instanceof w2.x) {
            return new a(5, ((w2.x) th2).f62894d);
        }
        if ((th2 instanceof w2.w) || (th2 instanceof C6080L)) {
            return new a(z10 ? 10 : 11, 0);
        }
        boolean z12 = th2 instanceof w2.v;
        if (z12 || (th2 instanceof C6933G.a)) {
            if (C6602B.e(context).g() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z12 && ((w2.v) th2).f62892c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (c6082n.f56595a == 1002) {
            return new a(21, 0);
        }
        if (th2 instanceof InterfaceC1558m.a) {
            Throwable th3 = (Throwable) AbstractC6614a.e(th2.getCause());
            if (!(th3 instanceof MediaDrm.MediaDrmStateException)) {
                return th3 instanceof MediaDrmResetException ? new a(27, 0) : th3 instanceof NotProvisionedException ? new a(24, 0) : th3 instanceof DeniedByServerException ? new a(29, 0) : th3 instanceof F2.O ? new a(23, 0) : th3 instanceof C1553h.e ? new a(28, 0) : new a(30, 0);
            }
            int iE0 = t2.a0.e0(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
            return new a(L0(iE0), iE0);
        }
        if (!(th2 instanceof t.b) || !(th2.getCause() instanceof FileNotFoundException)) {
            return new a(9, 0);
        }
        Throwable cause2 = ((Throwable) AbstractC6614a.e(th2.getCause())).getCause();
        return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
    }

    private static Pair P0(String str) {
        String[] strArrV1 = t2.a0.v1(str, "-");
        return Pair.create(strArrV1[0], strArrV1.length >= 2 ? strArrV1[1] : null);
    }

    private static int R0(Context context) {
        switch (C6602B.e(context).g()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int S0(C6071C c6071c) {
        C6071C.h hVar = c6071c.f56328b;
        if (hVar == null) {
            return 0;
        }
        int iF0 = t2.a0.F0(hVar.f56429a, hVar.f56430b);
        if (iF0 == 0) {
            return 3;
        }
        if (iF0 != 1) {
            return iF0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int T0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void U0(InterfaceC1024b.C0016b c0016b) {
        for (int i10 = 0; i10 < c0016b.d(); i10++) {
            int iB = c0016b.b(i10);
            InterfaceC1024b.a aVarC = c0016b.c(iB);
            if (iB == 0) {
                this.f831c.e(aVarC);
            } else if (iB == 11) {
                this.f831c.g(aVarC, this.f840l);
            } else {
                this.f831c.b(aVarC);
            }
        }
    }

    private void V0(long j10) {
        int iR0 = R0(this.f829a);
        if (iR0 != this.f842n) {
            this.f842n = iR0;
            final NetworkEvent networkEventBuild = L0.a().setNetworkType(iR0).setTimeSinceCreatedMillis(j10 - this.f833e).build();
            this.f830b.execute(new Runnable() { // from class: B2.C1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f808a.f832d.reportNetworkEvent(networkEventBuild);
                }
            });
        }
    }

    private void W0(long j10) {
        C6082N c6082n = this.f843o;
        if (c6082n == null) {
            return;
        }
        a aVarO0 = O0(c6082n, this.f829a, this.f851w == 4);
        final PlaybackErrorEvent playbackErrorEventBuild = AbstractC1044h1.a().setTimeSinceCreatedMillis(j10 - this.f833e).setErrorCode(aVarO0.f855a).setSubErrorCode(aVarO0.f856b).setException(c6082n).build();
        this.f830b.execute(new Runnable() { // from class: B2.D1
            @Override // java.lang.Runnable
            public final void run() {
                this.f812a.f832d.reportPlaybackErrorEvent(playbackErrorEventBuild);
            }
        });
        this.f828B = true;
        this.f843o = null;
    }

    private void X0(InterfaceC6084P interfaceC6084P, InterfaceC1024b.C0016b c0016b, long j10) {
        if (interfaceC6084P.p() != 2) {
            this.f850v = false;
        }
        if (interfaceC6084P.y() == null) {
            this.f852x = false;
        } else if (c0016b.a(10)) {
            this.f852x = true;
        }
        int iF1 = f1(interfaceC6084P);
        if (this.f841m != iF1) {
            this.f841m = iF1;
            this.f828B = true;
            final PlaybackStateEvent playbackStateEventBuild = s1.a().setState(this.f841m).setTimeSinceCreatedMillis(j10 - this.f833e).build();
            this.f830b.execute(new Runnable() { // from class: B2.F1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f822a.f832d.reportPlaybackStateEvent(playbackStateEventBuild);
                }
            });
        }
    }

    private void Y0(InterfaceC6084P interfaceC6084P, InterfaceC1024b.C0016b c0016b, long j10) {
        if (c0016b.a(2)) {
            q2.h0 h0VarY = interfaceC6084P.Y();
            boolean zD = h0VarY.d(2);
            boolean zD2 = h0VarY.d(1);
            boolean zD3 = h0VarY.d(3);
            if (zD || zD2 || zD3) {
                if (!zD) {
                    d1(j10, null, 0);
                }
                if (!zD2) {
                    Z0(j10, null, 0);
                }
                if (!zD3) {
                    b1(j10, null, 0);
                }
            }
        }
        if (I0(this.f844p)) {
            b bVar = this.f844p;
            C6109x c6109x = bVar.f857a;
            if (c6109x.f57030w != -1) {
                d1(j10, c6109x, bVar.f858b);
                this.f844p = null;
            }
        }
        if (I0(this.f845q)) {
            b bVar2 = this.f845q;
            Z0(j10, bVar2.f857a, bVar2.f858b);
            this.f845q = null;
        }
        if (I0(this.f846r)) {
            b bVar3 = this.f846r;
            b1(j10, bVar3.f857a, bVar3.f858b);
            this.f846r = null;
        }
    }

    private void Z0(long j10, C6109x c6109x, int i10) {
        if (Objects.equals(this.f848t, c6109x)) {
            return;
        }
        if (this.f848t == null && i10 == 0) {
            i10 = 1;
        }
        this.f848t = c6109x;
        e1(0, j10, c6109x, i10);
    }

    private void a1(InterfaceC6084P interfaceC6084P, InterfaceC1024b.C0016b c0016b) {
        C6102q c6102qM0;
        if (c0016b.a(0)) {
            InterfaceC1024b.a aVarC = c0016b.c(0);
            if (this.f839k != null) {
                c1(aVarC.f912b, aVarC.f914d);
            }
        }
        if (c0016b.a(2) && this.f839k != null && (c6102qM0 = M0(interfaceC6084P.Y().b())) != null) {
            R0.a(t2.a0.l(this.f839k)).setDrmType(N0(c6102qM0));
        }
        if (c0016b.a(1011)) {
            this.f827A++;
        }
    }

    private void b1(long j10, C6109x c6109x, int i10) {
        if (Objects.equals(this.f849u, c6109x)) {
            return;
        }
        if (this.f849u == null && i10 == 0) {
            i10 = 1;
        }
        this.f849u = c6109x;
        e1(2, j10, c6109x, i10);
    }

    private void c1(q2.Y y10, D.b bVar) {
        int iF;
        PlaybackMetrics.Builder builder = this.f839k;
        if (bVar == null || (iF = y10.f(bVar.f11662a)) == -1) {
            return;
        }
        y10.j(iF, this.f835g);
        y10.r(this.f835g.f56653c, this.f834f);
        builder.setStreamType(S0(this.f834f.f56680c));
        Y.d dVar = this.f834f;
        if (dVar.f56690m != -9223372036854775807L && !dVar.f56688k && !dVar.f56686i && !dVar.g()) {
            builder.setMediaDurationMillis(this.f834f.e());
        }
        builder.setPlaybackType(this.f834f.g() ? 2 : 1);
        this.f828B = true;
    }

    private void d1(long j10, C6109x c6109x, int i10) {
        if (Objects.equals(this.f847s, c6109x)) {
            return;
        }
        if (this.f847s == null && i10 == 0) {
            i10 = 1;
        }
        this.f847s = c6109x;
        e1(1, j10, c6109x, i10);
    }

    private void e1(int i10, long j10, C6109x c6109x, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = A0.a(i10).setTimeSinceCreatedMillis(j10 - this.f833e);
        if (c6109x != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(T0(i11));
            String str = c6109x.f57021n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c6109x.f57022o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c6109x.f57018k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = c6109x.f57017j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = c6109x.f57029v;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = c6109x.f57030w;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = c6109x.f56997G;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = c6109x.f56998H;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = c6109x.f57011d;
            if (str4 != null) {
                Pair pairP0 = P0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairP0.first);
                Object obj = pairP0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = c6109x.f57033z;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f828B = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f830b.execute(new Runnable() { // from class: B2.B1
            @Override // java.lang.Runnable
            public final void run() {
                this.f804a.f832d.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    private int f1(InterfaceC6084P interfaceC6084P) {
        int iP = interfaceC6084P.p();
        if (this.f850v) {
            return 5;
        }
        if (this.f852x) {
            return 13;
        }
        if (iP == 4) {
            return 11;
        }
        if (iP == 2) {
            int i10 = this.f841m;
            if (i10 == 0 || i10 == 2 || i10 == 12) {
                return 2;
            }
            if (interfaceC6084P.q0()) {
                return interfaceC6084P.g0() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (iP == 3) {
            if (interfaceC6084P.q0()) {
                return interfaceC6084P.g0() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iP != 1 || this.f841m == 0) {
            return this.f841m;
        }
        return 12;
    }

    @Override // B2.InterfaceC1024b
    public void K(InterfaceC1024b.a aVar, M2.B b10) {
        if (aVar.f914d == null) {
            return;
        }
        b bVar = new b((C6109x) AbstractC6614a.e(b10.f11656c), b10.f11657d, this.f831c.d(aVar.f912b, (D.b) AbstractC6614a.e(aVar.f914d)));
        int i10 = b10.f11655b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f845q = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f846r = bVar;
                return;
            }
        }
        this.f844p = bVar;
    }

    @Override // B2.H1.a
    public void M(InterfaceC1024b.a aVar, String str, boolean z10) {
        D.b bVar = aVar.f914d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f838j)) {
            K0();
        }
        this.f836h.remove(str);
        this.f837i.remove(str);
    }

    public LogSessionId Q0() {
        return this.f832d.getSessionId();
    }

    @Override // B2.InterfaceC1024b
    public void R(InterfaceC1024b.a aVar, int i10, long j10, long j11) {
        D.b bVar = aVar.f914d;
        if (bVar != null) {
            String strD = this.f831c.d(aVar.f912b, (D.b) AbstractC6614a.e(bVar));
            Long l10 = (Long) this.f837i.get(strD);
            Long l11 = (Long) this.f836h.get(strD);
            this.f837i.put(strD, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f836h.put(strD, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    @Override // B2.InterfaceC1024b
    public void S(InterfaceC1024b.a aVar, C6082N c6082n) {
        this.f843o = c6082n;
    }

    @Override // B2.InterfaceC1024b
    public void Y(InterfaceC1024b.a aVar, C1934y c1934y, M2.B b10, IOException iOException, boolean z10) {
        this.f851w = b10.f11654a;
    }

    @Override // B2.InterfaceC1024b
    public void Z(InterfaceC6084P interfaceC6084P, InterfaceC1024b.C0016b c0016b) {
        if (c0016b.d() == 0) {
            return;
        }
        U0(c0016b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a1(interfaceC6084P, c0016b);
        W0(jElapsedRealtime);
        Y0(interfaceC6084P, c0016b, jElapsedRealtime);
        V0(jElapsedRealtime);
        X0(interfaceC6084P, c0016b, jElapsedRealtime);
        if (c0016b.a(1028)) {
            this.f831c.f(c0016b.c(1028));
        }
    }

    @Override // B2.InterfaceC1024b
    public void g(InterfaceC1024b.a aVar, q2.l0 l0Var) {
        b bVar = this.f844p;
        if (bVar != null) {
            C6109x c6109x = bVar.f857a;
            if (c6109x.f57030w == -1) {
                this.f844p = new b(c6109x.b().F0(l0Var.f56923a).h0(l0Var.f56924b).P(), bVar.f858b, bVar.f859c);
            }
        }
    }

    @Override // B2.InterfaceC1024b
    public void p0(InterfaceC1024b.a aVar, InterfaceC6084P.e eVar, InterfaceC6084P.e eVar2, int i10) {
        if (i10 == 1) {
            this.f850v = true;
        }
        this.f840l = i10;
    }

    @Override // B2.H1.a
    public void u0(InterfaceC1024b.a aVar, String str) {
        D.b bVar = aVar.f914d;
        if (bVar == null || !bVar.b()) {
            K0();
            this.f838j = str;
            this.f839k = W0.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            c1(aVar.f912b, aVar.f914d);
        }
    }

    @Override // B2.InterfaceC1024b
    public void z(InterfaceC1024b.a aVar, C1004b c1004b) {
        this.f853y += c1004b.f187g;
        this.f854z += c1004b.f185e;
    }

    @Override // B2.H1.a
    public void z0(InterfaceC1024b.a aVar, String str) {
    }

    @Override // B2.H1.a
    public void y(InterfaceC1024b.a aVar, String str, String str2) {
    }
}
