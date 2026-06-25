package androidx.media3.exoplayer.dash;

import A2.J;
import M2.b0;
import U2.O;
import android.os.Handler;
import android.os.Message;
import f3.C4768a;
import f3.C4769b;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import q2.C6078J;
import q2.C6080L;
import q2.C6109x;
import q2.InterfaceC6098m;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q2.b f30730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f30731b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private E2.c f30735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f30736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f30737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30739j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TreeMap f30734e = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f30733d = a0.D(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4769b f30732c = new C4769b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f30740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f30741b;

        public a(long j10, long j11) {
            this.f30740a = j10;
            this.f30741b = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(long j10);

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class c implements O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0 f30742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final J f30743b = new J();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d3.b f30744c = new d3.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f30745d = -9223372036854775807L;

        c(Q2.b bVar) {
            this.f30742a = b0.m(bVar);
        }

        private d3.b h() {
            this.f30744c.m();
            if (this.f30742a.U(this.f30743b, this.f30744c, 0, false) != -4) {
                return null;
            }
            this.f30744c.y();
            return this.f30744c;
        }

        private void l(long j10, long j11) {
            f.this.f30733d.sendMessage(f.this.f30733d.obtainMessage(1, new a(j10, j11)));
        }

        private void m() {
            while (this.f30742a.N(false)) {
                d3.b bVarH = h();
                if (bVarH != null) {
                    long j10 = bVarH.f65557f;
                    C6078J c6078jA = f.this.f30732c.a(bVarH);
                    if (c6078jA != null) {
                        C4768a c4768a = (C4768a) c6078jA.d(0);
                        if (f.h(c4768a.f46835a, c4768a.f46836b)) {
                            n(j10, c4768a);
                        }
                    }
                }
            }
            this.f30742a.t();
        }

        private void n(long j10, C4768a c4768a) {
            long jF = f.f(c4768a);
            if (jF == -9223372036854775807L) {
                return;
            }
            l(j10, jF);
        }

        @Override // U2.O
        public void a(long j10, int i10, int i11, int i12, O.a aVar) {
            this.f30742a.a(j10, i10, i11, i12, aVar);
            m();
        }

        @Override // U2.O
        public int b(InterfaceC6098m interfaceC6098m, int i10, boolean z10, int i11) {
            return this.f30742a.e(interfaceC6098m, i10, z10);
        }

        @Override // U2.O
        public void c(C6109x c6109x) {
            this.f30742a.c(c6109x);
        }

        @Override // U2.O
        public void g(C6609I c6609i, int i10, int i11) {
            this.f30742a.f(c6609i, i10);
        }

        public boolean i(long j10) {
            return f.this.j(j10);
        }

        public void j(N2.e eVar) {
            long j10 = this.f30745d;
            if (j10 == -9223372036854775807L || eVar.f12612h > j10) {
                this.f30745d = eVar.f12612h;
            }
            f.this.m(eVar);
        }

        public boolean k(N2.e eVar) {
            long j10 = this.f30745d;
            return f.this.n(j10 != -9223372036854775807L && j10 < eVar.f12611g);
        }

        public void o() {
            this.f30742a.V();
        }
    }

    public f(E2.c cVar, b bVar, Q2.b bVar2) {
        this.f30735f = cVar;
        this.f30731b = bVar;
        this.f30730a = bVar2;
    }

    private Map.Entry e(long j10) {
        return this.f30734e.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(C4768a c4768a) {
        try {
            return a0.d1(a0.J(c4768a.f46839e));
        } catch (C6080L unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = (Long) this.f30734e.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f30734e.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f30734e.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    private void i() {
        if (this.f30737h) {
            this.f30738i = true;
            this.f30737h = false;
            this.f30731b.b();
        }
    }

    private void l() {
        this.f30731b.a(this.f30736g);
    }

    private void p() {
        Iterator it = this.f30734e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f30735f.f4215h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f30739j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f30740a, aVar.f30741b);
        return true;
    }

    boolean j(long j10) {
        E2.c cVar = this.f30735f;
        boolean z10 = false;
        if (!cVar.f4211d) {
            return false;
        }
        if (this.f30738i) {
            return true;
        }
        Map.Entry entryE = e(cVar.f4215h);
        if (entryE != null && ((Long) entryE.getValue()).longValue() < j10) {
            this.f30736g = ((Long) entryE.getKey()).longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f30730a);
    }

    void m(N2.e eVar) {
        this.f30737h = true;
    }

    boolean n(boolean z10) {
        if (!this.f30735f.f4211d) {
            return false;
        }
        if (this.f30738i) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f30739j = true;
        this.f30733d.removeCallbacksAndMessages(null);
    }

    public void q(E2.c cVar) {
        this.f30738i = false;
        this.f30736g = -9223372036854775807L;
        this.f30735f = cVar;
        p();
    }
}
