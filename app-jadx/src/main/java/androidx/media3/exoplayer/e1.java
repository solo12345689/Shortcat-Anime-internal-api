package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import androidx.media3.exoplayer.e1;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6620g;
import t2.InterfaceC6623j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f30750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6620g f30751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioManager f30752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f30753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30754f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void F(int i10, boolean z10);

        void a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f30755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f30757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f30758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f30759e;

        public c(int i10, int i11, boolean z10, int i12, int i13) {
            this.f30755a = i10;
            this.f30756b = i11;
            this.f30757c = z10;
            this.f30758d = i12;
            this.f30759e = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class d extends BroadcastReceiver {
        private d() {
        }

        public static /* synthetic */ void a(d dVar) {
            if (e1.this.f30753e == null) {
                return;
            }
            e1.this.f30751c.g(e1.this.s(((c) e1.this.f30751c.d()).f30755a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e1.this.f30751c.e(new Runnable() { // from class: androidx.media3.exoplayer.f1
                @Override // java.lang.Runnable
                public final void run() {
                    e1.d.a(this.f30763a);
                }
            });
        }
    }

    public e1(Context context, b bVar, final int i10, Looper looper, Looper looper2, InterfaceC6623j interfaceC6623j) {
        this.f30749a = context.getApplicationContext();
        this.f30750b = bVar;
        C6620g c6620g = new C6620g(new c(i10, 0, false, 0, 0), looper, looper2, interfaceC6623j, new C6620g.a() { // from class: androidx.media3.exoplayer.Q0
            @Override // t2.C6620g.a
            public final void a(Object obj, Object obj2) {
                this.f30468a.y((e1.c) obj, (e1.c) obj2);
            }
        });
        this.f30751c = c6620g;
        c6620g.e(new Runnable() { // from class: androidx.media3.exoplayer.V0
            @Override // java.lang.Runnable
            public final void run() {
                e1.m(this.f30481a, i10);
            }
        });
    }

    public static /* synthetic */ c a(e1 e1Var, boolean z10, c cVar) {
        e1Var.getClass();
        return new c(cVar.f30755a, cVar.f30757c == z10 ? cVar.f30756b : z10 ? 0 : e1Var.f30754f, z10, cVar.f30758d, cVar.f30759e);
    }

    public static /* synthetic */ c b(int i10, c cVar) {
        return new c(i10, cVar.f30756b, cVar.f30757c, cVar.f30758d, cVar.f30759e);
    }

    public static /* synthetic */ c d(int i10, c cVar) {
        int i11 = cVar.f30755a;
        int i12 = cVar.f30758d;
        return new c(i11, (i10 < i12 || i10 > cVar.f30759e) ? cVar.f30756b : i10, i10 == 0, i12, cVar.f30759e);
    }

    public static /* synthetic */ c e(c cVar) {
        int i10 = cVar.f30755a;
        int i11 = cVar.f30756b;
        int i12 = cVar.f30758d;
        return new c(i10, i11 > i12 ? i11 - 1 : i12, i11 <= 1, i12, cVar.f30759e);
    }

    public static /* synthetic */ c f(e1 e1Var, int i10, c cVar) {
        e1Var.getClass();
        if (cVar.f30756b <= cVar.f30758d) {
            return cVar;
        }
        ((AudioManager) AbstractC6614a.e(e1Var.f30752d)).adjustStreamVolume(cVar.f30755a, -1, i10);
        return e1Var.s(cVar.f30755a);
    }

    public static /* synthetic */ c g(e1 e1Var, int i10, int i11, c cVar) {
        e1Var.getClass();
        if (i10 == cVar.f30756b || i10 < cVar.f30758d || i10 > cVar.f30759e) {
            return cVar;
        }
        ((AudioManager) AbstractC6614a.e(e1Var.f30752d)).setStreamVolume(cVar.f30755a, i10, i11);
        return e1Var.s(cVar.f30755a);
    }

    public static /* synthetic */ c h(e1 e1Var, int i10, c cVar) {
        e1Var.getClass();
        return cVar.f30755a == i10 ? cVar : e1Var.s(i10);
    }

    public static /* synthetic */ c i(e1 e1Var, c cVar) {
        d dVar = e1Var.f30753e;
        if (dVar != null) {
            try {
                e1Var.f30749a.unregisterReceiver(dVar);
            } catch (RuntimeException e10) {
                AbstractC6635w.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            e1Var.f30753e = null;
        }
        return cVar;
    }

    public static /* synthetic */ c j(e1 e1Var, boolean z10, int i10, c cVar) {
        e1Var.getClass();
        if (cVar.f30757c == z10) {
            return cVar;
        }
        AbstractC6614a.e(e1Var.f30752d);
        e1Var.f30752d.adjustStreamVolume(cVar.f30755a, z10 ? -100 : 100, i10);
        return e1Var.s(cVar.f30755a);
    }

    public static /* synthetic */ c k(e1 e1Var, int i10, c cVar) {
        e1Var.getClass();
        if (cVar.f30756b >= cVar.f30759e) {
            return cVar;
        }
        ((AudioManager) AbstractC6614a.e(e1Var.f30752d)).adjustStreamVolume(cVar.f30755a, 1, i10);
        return e1Var.s(cVar.f30755a);
    }

    public static /* synthetic */ void m(e1 e1Var, int i10) {
        e1Var.f30752d = (AudioManager) AbstractC6614a.i((AudioManager) e1Var.f30749a.getSystemService("audio"));
        d dVar = new d();
        try {
            e1Var.f30749a.registerReceiver(dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            e1Var.f30753e = dVar;
        } catch (RuntimeException e10) {
            AbstractC6635w.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
        e1Var.f30751c.g(e1Var.s(i10));
    }

    public static /* synthetic */ c n(c cVar) {
        int i10 = cVar.f30755a;
        int i11 = cVar.f30756b;
        int i12 = cVar.f30759e;
        return new c(i10, i11 < i12 ? i11 + 1 : i12, false, cVar.f30758d, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c s(int i10) {
        AbstractC6614a.e(this.f30752d);
        return new c(i10, r2.m.f(this.f30752d, i10), r2.m.g(this.f30752d, i10), r2.m.e(this.f30752d, i10), r2.m.d(this.f30752d, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(c cVar, c cVar2) {
        boolean z10 = cVar.f30757c;
        if (!z10 && cVar2.f30757c) {
            this.f30754f = cVar.f30756b;
        }
        int i10 = cVar.f30756b;
        int i11 = cVar2.f30756b;
        if (i10 != i11 || z10 != cVar2.f30757c) {
            this.f30750b.F(i11, cVar2.f30757c);
        }
        int i12 = cVar.f30755a;
        int i13 = cVar2.f30755a;
        if (i12 == i13 && cVar.f30758d == cVar2.f30758d && cVar.f30759e == cVar2.f30759e) {
            return;
        }
        this.f30750b.a(i13);
    }

    public void A(final boolean z10, final int i10) {
        this.f30751c.h(new O9.f() { // from class: androidx.media3.exoplayer.c1
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.a(this.f30587a, z10, (e1.c) obj);
            }
        }, new O9.f() { // from class: androidx.media3.exoplayer.d1
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.j(this.f30597a, z10, i10, (e1.c) obj);
            }
        });
    }

    public void B(final int i10) {
        this.f30751c.h(new O9.f() { // from class: androidx.media3.exoplayer.T0
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.b(i10, (e1.c) obj);
            }
        }, new O9.f() { // from class: androidx.media3.exoplayer.U0
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.h(this.f30478a, i10, (e1.c) obj);
            }
        });
    }

    public void C(final int i10, final int i11) {
        this.f30751c.h(new O9.f() { // from class: androidx.media3.exoplayer.a1
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.d(i10, (e1.c) obj);
            }
        }, new O9.f() { // from class: androidx.media3.exoplayer.b1
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.g(this.f30582a, i10, i11, (e1.c) obj);
            }
        });
    }

    public void r(final int i10) {
        this.f30751c.h(new O9.f() { // from class: androidx.media3.exoplayer.Y0
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.e((e1.c) obj);
            }
        }, new O9.f() { // from class: androidx.media3.exoplayer.Z0
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.f(this.f30575a, i10, (e1.c) obj);
            }
        });
    }

    public int t() {
        return ((c) this.f30751c.d()).f30759e;
    }

    public int u() {
        return ((c) this.f30751c.d()).f30758d;
    }

    public int v() {
        return ((c) this.f30751c.d()).f30756b;
    }

    public void w(final int i10) {
        this.f30751c.h(new O9.f() { // from class: androidx.media3.exoplayer.R0
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.n((e1.c) obj);
            }
        }, new O9.f() { // from class: androidx.media3.exoplayer.S0
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.k(this.f30470a, i10, (e1.c) obj);
            }
        });
    }

    public boolean x() {
        return ((c) this.f30751c.d()).f30757c;
    }

    public void z() {
        this.f30751c.h(new O9.f() { // from class: androidx.media3.exoplayer.W0
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.c((e1.c) obj);
            }
        }, new O9.f() { // from class: androidx.media3.exoplayer.X0
            @Override // O9.f
            public final Object apply(Object obj) {
                return e1.i(this.f30485a, (e1.c) obj);
            }
        });
    }

    public static /* synthetic */ c c(c cVar) {
        return cVar;
    }
}
