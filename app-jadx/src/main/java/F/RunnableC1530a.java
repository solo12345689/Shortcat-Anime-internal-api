package F;

import Y.InterfaceC2453v1;
import a0.C2507c;
import android.view.Choreographer;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: F.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1530a implements N, InterfaceC2453v1, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0063a f6023g = new C0063a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f6024h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f6025i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f6026a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6028c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6031f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2507c f6027b = new C2507c(new L[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Choreographer f6029d = Choreographer.getInstance();

    /* JADX INFO: renamed from: F.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0063a {
        public /* synthetic */ C0063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = F.RunnableC1530a.b()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L2c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L21
                if (r0 == 0) goto L21
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r5 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                F.RunnableC1530a.f(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: F.RunnableC1530a.C0063a.b(android.view.View):void");
        }

        private C0063a() {
        }
    }

    /* JADX INFO: renamed from: F.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements M {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f6032a;

        public b(long j10) {
            this.f6032a = j10;
        }

        @Override // F.M
        public long a() {
            return Math.max(0L, this.f6032a - System.nanoTime());
        }
    }

    public RunnableC1530a(View view) {
        this.f6026a = view;
        f6023g.b(view);
    }

    @Override // F.N
    public void a(L l10) {
        this.f6027b.c(l10);
        if (this.f6028c) {
            return;
        }
        this.f6028c = true;
        this.f6026a.post(this);
    }

    @Override // Y.InterfaceC2453v1
    public void c() {
        this.f6030e = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.f6030e) {
            this.f6031f = j10;
            this.f6026a.post(this);
        }
    }

    @Override // Y.InterfaceC2453v1
    public void e() {
        this.f6030e = false;
        this.f6026a.removeCallbacks(this);
        this.f6029d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f6027b.s() || !this.f6028c || !this.f6030e || this.f6026a.getWindowVisibility() != 0) {
            this.f6028c = false;
            return;
        }
        b bVar = new b(this.f6031f + f6025i);
        boolean z10 = false;
        while (this.f6027b.t() && !z10) {
            if (bVar.a() <= 0 || ((L) this.f6027b.o()[0]).b(bVar)) {
                z10 = true;
            } else {
                this.f6027b.y(0);
            }
        }
        if (z10) {
            this.f6029d.postFrameCallback(this);
        } else {
            this.f6028c = false;
        }
    }

    @Override // Y.InterfaceC2453v1
    public void d() {
    }
}
