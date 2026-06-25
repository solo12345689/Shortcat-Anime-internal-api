package androidx.media3.exoplayer;

import B2.K1;
import M2.D;
import androidx.media3.exoplayer.InterfaceC2903p0;
import java.util.HashMap;
import java.util.Iterator;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: renamed from: androidx.media3.exoplayer.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2890j implements InterfaceC2903p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q2.g f31025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f31028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f31029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f31030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f31031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f31032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f31033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HashMap f31034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f31035k;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.j$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f31036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f31037b;

        private b() {
        }
    }

    public C2890j() {
        this(new Q2.g(true, 65536), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    private static void k(int i10, int i11, String str, String str2) {
        AbstractC6614a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    private static int n(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 26214400;
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void o(K1 k12) {
        if (this.f31034j.remove(k12) != null) {
            q();
        }
    }

    private void p(K1 k12) {
        b bVar = (b) AbstractC6614a.e((b) this.f31034j.get(k12));
        int i10 = this.f31030f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        bVar.f31037b = i10;
        bVar.f31036a = false;
    }

    private void q() {
        if (this.f31034j.isEmpty()) {
            this.f31025a.g();
        } else {
            this.f31025a.h(m());
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public boolean a(InterfaceC2903p0.a aVar) {
        long jP0 = t2.a0.p0(aVar.f31180e, aVar.f31181f);
        long jMin = aVar.f31183h ? this.f31029e : this.f31028d;
        long j10 = aVar.f31184i;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || jP0 >= jMin) {
            return true;
        }
        return !this.f31031g && this.f31025a.f() >= m();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public void b(K1 k12) {
        o(k12);
        if (this.f31034j.isEmpty()) {
            this.f31035k = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public boolean c(q2.Y y10, D.b bVar, long j10) {
        Iterator it = this.f31034j.values().iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f31036a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public void d(K1 k12) {
        o(k12);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public void e(InterfaceC2903p0.a aVar, M2.n0 n0Var, P2.A[] aArr) {
        b bVar = (b) AbstractC6614a.e((b) this.f31034j.get(aVar.f31176a));
        int iL = this.f31030f;
        if (iL == -1) {
            iL = l(aArr);
        }
        bVar.f31037b = iL;
        q();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public Q2.b f() {
        return this.f31025a;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public void g(K1 k12) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f31035k;
        AbstractC6614a.h(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f31035k = id2;
        if (!this.f31034j.containsKey(k12)) {
            this.f31034j.put(k12, new b());
        }
        p(k12);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public long h(K1 k12) {
        return this.f31032h;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public boolean i(InterfaceC2903p0.a aVar) {
        b bVar = (b) AbstractC6614a.e((b) this.f31034j.get(aVar.f31176a));
        boolean z10 = true;
        boolean z11 = this.f31025a.f() >= m();
        long jMin = this.f31026b;
        float f10 = aVar.f31181f;
        if (f10 > 1.0f) {
            jMin = Math.min(t2.a0.j0(jMin, f10), this.f31027c);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = aVar.f31180e;
        if (j10 < jMax) {
            if (!this.f31031g && z11) {
                z10 = false;
            }
            bVar.f31036a = z10;
            if (!z10 && j10 < 500000) {
                AbstractC6635w.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f31027c || z11) {
            bVar.f31036a = false;
        }
        return bVar.f31036a;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public boolean j(K1 k12) {
        return this.f31033i;
    }

    protected int l(P2.A[] aArr) {
        int iN = 0;
        for (P2.A a10 : aArr) {
            if (a10 != null) {
                iN += n(a10.m().f56704c);
            }
        }
        return Math.max(13107200, iN);
    }

    int m() {
        Iterator it = this.f31034j.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((b) it.next()).f31037b;
        }
        return i10;
    }

    protected C2890j(Q2.g gVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        k(i12, 0, "bufferForPlaybackMs", "0");
        k(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        k(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(i11, i10, "maxBufferMs", "minBufferMs");
        k(i15, 0, "backBufferDurationMs", "0");
        this.f31025a = gVar;
        this.f31026b = t2.a0.V0(i10);
        this.f31027c = t2.a0.V0(i11);
        this.f31028d = t2.a0.V0(i12);
        this.f31029e = t2.a0.V0(i13);
        this.f31030f = i14;
        this.f31031g = z10;
        this.f31032h = t2.a0.V0(i15);
        this.f31033i = z11;
        this.f31034j = new HashMap();
        this.f31035k = -1L;
    }
}
