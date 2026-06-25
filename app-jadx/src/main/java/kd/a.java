package Kd;

import B2.K1;
import M2.D;
import M2.n0;
import P2.A;
import androidx.media3.exoplayer.InterfaceC2903p0;
import java.util.HashMap;
import java.util.Iterator;
import q2.Y;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements InterfaceC2903p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q2.g f10975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f10976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f10977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f10978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f10979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f10980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f10981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected long f10982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f10983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final HashMap f10984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f10985k;

    /* JADX INFO: renamed from: Kd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static class C0173a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10987b;

        protected C0173a() {
        }
    }

    public a() {
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
        if (this.f10984j.remove(k12) != null) {
            q();
        }
    }

    private void p(K1 k12) {
        C0173a c0173a = (C0173a) AbstractC6614a.e((C0173a) this.f10984j.get(k12));
        int i10 = this.f10980f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        c0173a.f10987b = i10;
        c0173a.f10986a = false;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public boolean a(InterfaceC2903p0.a aVar) {
        long jP0 = a0.p0(aVar.f31180e, aVar.f31181f);
        long jMin = aVar.f31183h ? this.f10979e : this.f10978d;
        long j10 = aVar.f31184i;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || jP0 >= jMin) {
            return true;
        }
        return !this.f10981g && this.f10975a.f() >= m();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public void b(K1 k12) {
        o(k12);
        if (this.f10984j.isEmpty()) {
            this.f10985k = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public boolean c(Y y10, D.b bVar, long j10) {
        Iterator it = this.f10984j.values().iterator();
        while (it.hasNext()) {
            if (((C0173a) it.next()).f10986a) {
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
    public void e(InterfaceC2903p0.a aVar, n0 n0Var, A[] aArr) {
        C0173a c0173a = (C0173a) AbstractC6614a.e((C0173a) this.f10984j.get(aVar.f31176a));
        int iL = this.f10980f;
        if (iL == -1) {
            iL = l(aArr);
        }
        c0173a.f10987b = iL;
        q();
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public Q2.b f() {
        return this.f10975a;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public void g(K1 k12) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f10985k;
        AbstractC6614a.h(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f10985k = id2;
        if (!this.f10984j.containsKey(k12)) {
            this.f10984j.put(k12, new C0173a());
        }
        p(k12);
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public long h(K1 k12) {
        return this.f10982h;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public boolean i(InterfaceC2903p0.a aVar) {
        C0173a c0173a = (C0173a) AbstractC6614a.e((C0173a) this.f10984j.get(aVar.f31176a));
        boolean z10 = true;
        boolean z11 = this.f10975a.f() >= m();
        long jMin = this.f10976b;
        float f10 = aVar.f31181f;
        if (f10 > 1.0f) {
            jMin = Math.min(a0.j0(jMin, f10), this.f10977c);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = aVar.f31180e;
        if (j10 < jMax) {
            if (!this.f10981g && z11) {
                z10 = false;
            }
            c0173a.f10986a = z10;
            if (!z10 && j10 < 500000) {
                AbstractC6635w.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f10977c || z11) {
            c0173a.f10986a = false;
        }
        return c0173a.f10986a;
    }

    @Override // androidx.media3.exoplayer.InterfaceC2903p0
    public boolean j(K1 k12) {
        return this.f10983i;
    }

    protected int l(A[] aArr) {
        int iN = 0;
        for (A a10 : aArr) {
            if (a10 != null) {
                iN += n(a10.m().f56704c);
            }
        }
        return Math.max(13107200, iN);
    }

    int m() {
        Iterator it = this.f10984j.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((C0173a) it.next()).f10987b;
        }
        return i10;
    }

    protected void q() {
        if (this.f10984j.isEmpty()) {
            this.f10975a.g();
        } else {
            this.f10975a.h(m());
        }
    }

    protected a(Q2.g gVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        k(i12, 0, "bufferForPlaybackMs", "0");
        k(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        k(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(i11, i10, "maxBufferMs", "minBufferMs");
        k(i15, 0, "backBufferDurationMs", "0");
        this.f10975a = gVar;
        this.f10976b = a0.V0(i10);
        this.f10977c = a0.V0(i11);
        this.f10978d = a0.V0(i12);
        this.f10979e = a0.V0(i13);
        this.f10980f = i14;
        this.f10981g = z10;
        this.f10982h = a0.V0(i15);
        this.f10983i = z11;
        this.f10984j = new HashMap();
        this.f10985k = -1L;
    }
}
