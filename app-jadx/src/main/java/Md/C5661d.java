package md;

import A2.Q;
import Gf.C1627p;
import Gf.InterfaceC1623n;
import Gf.O;
import P2.n;
import Td.L;
import Td.u;
import Td.v;
import ae.AbstractC2605b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.C6109x;
import q2.InterfaceC6084P;

/* JADX INFO: renamed from: md.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5661d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f53253h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f53254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExoPlayer f53255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SurfaceTexture f53256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f53257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f53258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Pf.a f53259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f53260g;

    /* JADX INFO: renamed from: md.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: md.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f53261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f53262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f53263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f53264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f53266f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f53268h;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f53266f = obj;
            this.f53268h |= Integer.MIN_VALUE;
            return C5661d.this.r(null, 0L, null, null, this);
        }
    }

    /* JADX INFO: renamed from: md.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1623n f53269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f53270b;

        c(InterfaceC1623n interfaceC1623n, Bitmap bitmap) {
            this.f53269a = interfaceC1623n;
            this.f53270b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public final void onPixelCopyFinished(int i10) {
            if (i10 == 0 && this.f53269a.b()) {
                InterfaceC1623n interfaceC1623n = this.f53269a;
                u.a aVar = u.f17466b;
                interfaceC1623n.resumeWith(u.b(this.f53270b));
            } else if (this.f53269a.b()) {
                InterfaceC1623n interfaceC1623n2 = this.f53269a;
                u.a aVar2 = u.f17466b;
                interfaceC1623n2.resumeWith(u.b(v.a(new C5658a("PixelCopy failed with code: " + i10))));
            }
        }
    }

    /* JADX INFO: renamed from: md.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0830d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f53271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f53272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f53273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f53274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f53275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        double f53276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f53277g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f53279i;

        C0830d(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f53277g = obj;
            this.f53279i |= Integer.MIN_VALUE;
            return C5661d.this.t(null, 0.0d, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: md.d$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f53280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f53281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f53282c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f53284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f53285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map f53286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Integer f53287h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f53288i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(double d10, String str, Map map, Integer num, Integer num2, Zd.e eVar) {
            super(2, eVar);
            this.f53284e = d10;
            this.f53285f = str;
            this.f53286g = map;
            this.f53287h = num;
            this.f53288i = num2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5661d.this.new e(this.f53284e, this.f53285f, this.f53286g, this.f53287h, this.f53288i, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((e) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
        
            if (r0 != r7) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: md.C5661d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: md.d$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f53289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f53290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f53291c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53293e;

        f(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f53291c = obj;
            this.f53293e |= Integer.MIN_VALUE;
            return C5661d.this.u(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: md.d$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1623n f53294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f53295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f53296c;

        g(InterfaceC1623n interfaceC1623n, ExoPlayer exoPlayer, i iVar) {
            this.f53294a = interfaceC1623n;
            this.f53295b = exoPlayer;
            this.f53296c = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f53294a.b()) {
                this.f53295b.H(this.f53296c);
                InterfaceC1623n interfaceC1623n = this.f53294a;
                u.a aVar = u.f17466b;
                interfaceC1623n.resumeWith(u.b(L.f17438a));
            }
        }
    }

    /* JADX INFO: renamed from: md.d$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f53297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f53298b;

        h(ExoPlayer exoPlayer, i iVar) {
            this.f53297a = exoPlayer;
            this.f53298b = iVar;
        }

        public final void a(Throwable th2) {
            this.f53297a.H(this.f53298b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: md.d$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC6084P.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f53299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1623n f53300b;

        i(ExoPlayer exoPlayer, InterfaceC1623n interfaceC1623n) {
            this.f53299a = exoPlayer;
            this.f53300b = interfaceC1623n;
        }

        @Override // q2.InterfaceC6084P.d
        public void T() {
            this.f53299a.H(this);
            if (this.f53300b.b()) {
                InterfaceC1623n interfaceC1623n = this.f53300b;
                u.a aVar = u.f17466b;
                interfaceC1623n.resumeWith(u.b(L.f17438a));
            }
        }
    }

    /* JADX INFO: renamed from: md.d$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1623n f53301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f53302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f53303c;

        j(InterfaceC1623n interfaceC1623n, ExoPlayer exoPlayer, l lVar) {
            this.f53301a = interfaceC1623n;
            this.f53302b = exoPlayer;
            this.f53303c = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f53301a.b()) {
                this.f53302b.H(this.f53303c);
                InterfaceC1623n interfaceC1623n = this.f53301a;
                u.a aVar = u.f17466b;
                interfaceC1623n.resumeWith(u.b(v.a(new C5658a("Player ready timeout"))));
            }
        }
    }

    /* JADX INFO: renamed from: md.d$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f53304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f53305b;

        k(ExoPlayer exoPlayer, l lVar) {
            this.f53304a = exoPlayer;
            this.f53305b = lVar;
        }

        public final void a(Throwable th2) {
            this.f53304a.H(this.f53305b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: md.d$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements InterfaceC6084P.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f53306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1623n f53307b;

        l(ExoPlayer exoPlayer, InterfaceC1623n interfaceC1623n) {
            this.f53306a = exoPlayer;
            this.f53307b = interfaceC1623n;
        }

        @Override // q2.InterfaceC6084P.d
        public void J(int i10) {
            if (i10 == 1) {
                this.f53306a.H(this);
                if (this.f53307b.b()) {
                    InterfaceC1623n interfaceC1623n = this.f53307b;
                    u.a aVar = u.f17466b;
                    interfaceC1623n.resumeWith(u.b(v.a(new C5658a("Player went to IDLE state"))));
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            this.f53306a.H(this);
            if (this.f53307b.b()) {
                InterfaceC1623n interfaceC1623n2 = this.f53307b;
                u.a aVar2 = u.f17466b;
                interfaceC1623n2.resumeWith(u.b(L.f17438a));
            }
        }
    }

    public C5661d(Context context) {
        AbstractC5504s.h(context, "context");
        this.f53254a = context;
        this.f53259f = Pf.g.b(false, 1, null);
        this.f53260g = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(C5661d c5661d) {
        Surface surface = c5661d.f53257d;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = c5661d.f53256c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        ExoPlayer exoPlayer = c5661d.f53255b;
        if (exoPlayer != null) {
            exoPlayer.a();
        }
        c5661d.f53255b = null;
        c5661d.f53257d = null;
        c5661d.f53256c = null;
        c5661d.f53258e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExoPlayer B() throws C5658a {
        ExoPlayer exoPlayer = this.f53255b;
        if (exoPlayer != null) {
            return exoPlayer;
        }
        throw new C5658a("Player not initialized");
    }

    private final Surface C() throws C5658a {
        Surface surface = this.f53257d;
        if (surface != null) {
            return surface;
        }
        throw new C5658a("Surface not initialized");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(ExoPlayer exoPlayer, double d10, long j10) {
        long j11 = (long) (d10 * ((double) 1000));
        w("[" + p(j10) + "ms] Seeking to " + j11 + "ms");
        exoPlayer.z(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(String str) {
        return !AbstractC5504s.c(this.f53258e, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(ExoPlayer exoPlayer, long j10, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        w("[" + p(j10) + "ms] Waiting for frame render...");
        i iVar = new i(exoPlayer, c1627p);
        exoPlayer.a0(iVar);
        this.f53260g.postDelayed(new g(c1627p, exoPlayer, iVar), 500L);
        c1627p.p(new h(exoPlayer, iVar));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : L.f17438a;
    }

    private final Object G(ExoPlayer exoPlayer, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        if (exoPlayer.p() == 3) {
            u.a aVar = u.f17466b;
            c1627p.resumeWith(u.b(L.f17438a));
        } else {
            l lVar = new l(exoPlayer, c1627p);
            exoPlayer.a0(lVar);
            this.f53260g.postDelayed(new j(c1627p, exoPlayer, lVar), HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS);
            c1627p.p(new k(exoPlayer, lVar));
        }
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : L.f17438a;
    }

    private final void m(C6109x c6109x) {
        int i10;
        int i11;
        SurfaceTexture surfaceTexture;
        if (c6109x == null || (i10 = c6109x.f57029v) <= 0 || (i11 = c6109x.f57030w) <= 0 || (surfaceTexture = this.f53256c) == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(i10, i11);
    }

    private final Pair n(int i10, int i11, Integer num, Integer num2) {
        if (num != null && num2 != null) {
            return new Pair(num, num2);
        }
        if (num != null) {
            return new Pair(num, Integer.valueOf((int) (num.intValue() * (i11 / i10))));
        }
        if (num2 == null) {
            return new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
        }
        return new Pair(Integer.valueOf((int) (num2.intValue() * (i10 / i11))), num2);
    }

    private final n o() {
        n nVar = new n(this.f53254a);
        nVar.m(nVar.G().x0(640, 640).v0(true).G());
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long p(long j10) {
        return System.currentTimeMillis() - j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        if (this.f53255b != null) {
            return;
        }
        ExoPlayer exoPlayerI = new ExoPlayer.b(this.f53254a).n(o()).i();
        exoPlayerI.d(Q.f167d);
        exoPlayerI.w(0.0f);
        this.f53255b = exoPlayerI;
        SurfaceTexture surfaceTextureA = AbstractC5659b.a(false);
        surfaceTextureA.setDefaultBufferSize(640, 360);
        this.f53256c = surfaceTextureA;
        Surface surface = new Surface(this.f53256c);
        ExoPlayer exoPlayer = this.f53255b;
        if (exoPlayer != null) {
            exoPlayer.B(surface);
        }
        this.f53257d = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(androidx.media3.exoplayer.ExoPlayer r10, long r11, java.lang.Integer r13, java.lang.Integer r14, Zd.e r15) throws md.C5658a {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: md.C5661d.r(androidx.media3.exoplayer.ExoPlayer, long, java.lang.Integer, java.lang.Integer, Zd.e):java.lang.Object");
    }

    private final Object s(Surface surface, int i10, int i11, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(...)");
        try {
            PixelCopy.request(surface, bitmapCreateBitmap, new c(c1627p, bitmapCreateBitmap), this.f53260g);
        } catch (Exception e10) {
            if (c1627p.b()) {
                u.a aVar = u.f17466b;
                c1627p.resumeWith(u.b(v.a(e10)));
            }
        }
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(androidx.media3.exoplayer.ExoPlayer r9, java.lang.String r10, long r11, java.util.Map r13, Zd.e r14) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: md.C5661d.u(androidx.media3.exoplayer.ExoPlayer, java.lang.String, long, java.util.Map, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(String str, Exception exc) {
        Log.e("FrameExtractor", str + ": " + exc.getMessage(), exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.String r16, double r17, java.lang.Integer r19, java.lang.Integer r20, java.util.Map r21, Zd.e r22) throws java.lang.Throwable {
        /*
            r15 = this;
            r0 = r22
            boolean r2 = r0 instanceof md.C5661d.C0830d
            if (r2 == 0) goto L16
            r2 = r0
            md.d$d r2 = (md.C5661d.C0830d) r2
            int r3 = r2.f53279i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f53279i = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            md.d$d r2 = new md.d$d
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.f53277g
            java.lang.Object r10 = ae.AbstractC2605b.f()
            int r2 = r9.f53279i
            r11 = 2
            r3 = 1
            r12 = 0
            if (r2 == 0) goto L60
            if (r2 == r3) goto L41
            if (r2 != r11) goto L39
            java.lang.Object r2 = r9.f53271a
            Pf.a r2 = (Pf.a) r2
            Td.v.b(r0)     // Catch: java.lang.Throwable -> L36
            goto Laa
        L36:
            r0 = move-exception
            goto Lb2
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L41:
            double r2 = r9.f53276f
            java.lang.Object r4 = r9.f53275e
            Pf.a r4 = (Pf.a) r4
            java.lang.Object r5 = r9.f53274d
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r9.f53273c
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r7 = r9.f53272b
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r8 = r9.f53271a
            java.lang.String r8 = (java.lang.String) r8
            Td.v.b(r0)
            r13 = r7
            r7 = r6
            r6 = r13
            r13 = r4
            r4 = r8
            goto L8b
        L60:
            Td.v.b(r0)
            Pf.a r0 = r15.f53259f
            r2 = r16
            r9.f53271a = r2
            r4 = r19
            r9.f53272b = r4
            r5 = r20
            r9.f53273c = r5
            r6 = r21
            r9.f53274d = r6
            r9.f53275e = r0
            r7 = r17
            r9.f53276f = r7
            r9.f53279i = r3
            java.lang.Object r3 = r0.c(r12, r9)
            if (r3 != r10) goto L84
            goto La8
        L84:
            r13 = r4
            r4 = r2
            r2 = r7
            r7 = r5
            r5 = r6
            r6 = r13
            r13 = r0
        L8b:
            Gf.M0 r14 = Gf.C1608f0.c()     // Catch: java.lang.Throwable -> Lb0
            md.d$e r0 = new md.d$e     // Catch: java.lang.Throwable -> Lb0
            r8 = 0
            r1 = r15
            r0.<init>(r2, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb0
            r9.f53271a = r13     // Catch: java.lang.Throwable -> Lb0
            r9.f53272b = r12     // Catch: java.lang.Throwable -> Lb0
            r9.f53273c = r12     // Catch: java.lang.Throwable -> Lb0
            r9.f53274d = r12     // Catch: java.lang.Throwable -> Lb0
            r9.f53275e = r12     // Catch: java.lang.Throwable -> Lb0
            r9.f53279i = r11     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r0 = Gf.AbstractC1613i.g(r14, r0, r9)     // Catch: java.lang.Throwable -> Lb0
            if (r0 != r10) goto La9
        La8:
            return r10
        La9:
            r2 = r13
        Laa:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L36
            r2.e(r12)
            return r0
        Lb0:
            r0 = move-exception
            r2 = r13
        Lb2:
            r2.e(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: md.C5661d.t(java.lang.String, double, java.lang.Integer, java.lang.Integer, java.util.Map, Zd.e):java.lang.Object");
    }

    public final void z() {
        this.f53260g.post(new Runnable() { // from class: md.c
            @Override // java.lang.Runnable
            public final void run() {
                C5661d.A(this.f53252a);
            }
        });
    }

    private final void v(ExoPlayer exoPlayer) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(String str) {
    }

    private final void y(C6109x c6109x) {
    }
}
