package C2;

import B2.K1;
import C2.B;
import C2.C1161i;
import C2.InterfaceC1177z;
import C2.W;
import P9.AbstractC2011u;
import U2.AbstractC2241b;
import U2.AbstractC2242c;
import U2.AbstractC2254o;
import U2.AbstractC2257s;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q2.AbstractC6079K;
import q2.C6083O;
import q2.C6088c;
import q2.C6092g;
import q2.C6109x;
import r2.o;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.InterfaceC6623j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC1177z {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static boolean f2557q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Object f2558r0 = new Object();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static ScheduledExecutorService f2559s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static int f2560t0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private C1157e f2561A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private C1161i f2562B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private l f2563C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private C6088c f2564D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private k f2565E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private k f2566F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private C6083O f2567G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f2568H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private ByteBuffer f2569I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f2570J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f2571K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f2572L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private long f2573M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f2574N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f2575O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f2576P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f2577Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f2578R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f2579S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private ByteBuffer f2580T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f2581U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private ByteBuffer f2582V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f2583W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f2584X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f2585Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f2586Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2587a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f2588a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r2.p f2589b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f2590b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2591c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f2592c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C f2593d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private C6092g f2594d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0 f2595e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private C1162j f2596e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r2.t f2597f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f2598f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e0 f2599g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private long f2600g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2011u f2601h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private long f2602h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final B f2603i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f2604i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque f2605j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f2606j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f2607k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Looper f2608k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2609l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private long f2610l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o f2611m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private long f2612m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m f2613n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Handler f2614n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m f2615o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private Context f2616o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e f2617p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f2618p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d f2619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ExoPlayer.a f2620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final f f2621s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f2622t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private K1 f2623u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private InterfaceC1177z.d f2624v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h f2625w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private h f2626x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private r2.n f2627y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private AudioTrack f2628z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public static long a(AudioTrack audioTrack, h hVar) {
            return hVar.f2644c == 0 ? hVar.d(audioTrack.getBufferSizeInFrames()) : t2.a0.o1(audioTrack.getBufferSizeInFrames(), 1000000L, P.a0(hVar.f2648g), RoundingMode.DOWN);
        }

        public static void b(AudioTrack audioTrack, C1162j c1162j) {
            audioTrack.setPreferredDevice(c1162j == null ? null : c1162j.f2757a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {
        public static void a(AudioTrack audioTrack, K1 k12) {
            LogSessionId logSessionIdA = k12.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface d {
        C1163k a(C6109x c6109x, C6088c c6088c);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f2629a = new W.a().h();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f2630a = new Z();

        AudioTrack a(InterfaceC1177z.a aVar, C6088c c6088c, int i10, Context context);

        default int b(int i10) {
            return t2.a0.O(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f2631a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private r2.p f2633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f2634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f2636f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private d f2639i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ExoPlayer.a f2641k;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f2640j = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C1157e f2632b = C1157e.f2725c;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e f2637g = e.f2629a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private f f2638h = f.f2630a;

        public g(Context context) {
            this.f2631a = context;
        }

        public P k() {
            AbstractC6614a.g(!this.f2636f);
            this.f2636f = true;
            if (this.f2633c == null) {
                this.f2633c = new i(new r2.o[0]);
            }
            if (this.f2639i == null) {
                this.f2639i = new E(this.f2631a);
            }
            return new P(this);
        }

        public g l(boolean z10) {
            this.f2635e = z10;
            return this;
        }

        public g m(boolean z10) {
            this.f2634d = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6109x f2642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f2645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f2646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2647f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f2648g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f2649h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final r2.n f2650i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f2651j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f2652k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f2653l;

        public h(C6109x c6109x, int i10, int i11, int i12, int i13, int i14, int i15, int i16, r2.n nVar, boolean z10, boolean z11, boolean z12) {
            this.f2642a = c6109x;
            this.f2643b = i10;
            this.f2644c = i11;
            this.f2645d = i12;
            this.f2646e = i13;
            this.f2647f = i14;
            this.f2648g = i15;
            this.f2649h = i16;
            this.f2650i = nVar;
            this.f2651j = z10;
            this.f2652k = z11;
            this.f2653l = z12;
        }

        public InterfaceC1177z.a a() {
            return new InterfaceC1177z.a(this.f2648g, this.f2646e, this.f2647f, this.f2653l, this.f2644c == 1, this.f2649h);
        }

        public boolean b(h hVar) {
            return hVar.f2644c == this.f2644c && hVar.f2648g == this.f2648g && hVar.f2646e == this.f2646e && hVar.f2647f == this.f2647f && hVar.f2645d == this.f2645d && hVar.f2651j == this.f2651j && hVar.f2652k == this.f2652k;
        }

        public h c(int i10) {
            return new h(this.f2642a, this.f2643b, this.f2644c, this.f2645d, this.f2646e, this.f2647f, this.f2648g, i10, this.f2650i, this.f2651j, this.f2652k, this.f2653l);
        }

        public long d(long j10) {
            return t2.a0.l1(j10, this.f2646e);
        }

        public long e(long j10) {
            return t2.a0.l1(j10, this.f2642a.f56998H);
        }

        public boolean f() {
            return this.f2644c == 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class i implements r2.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r2.o[] f2654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d0 f2655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final r2.s f2656c;

        public i(r2.o... oVarArr) {
            this(oVarArr, new d0(), new r2.s());
        }

        @Override // r2.p
        public long a(long j10) {
            return this.f2656c.b() ? this.f2656c.h(j10) : j10;
        }

        @Override // r2.p
        public r2.o[] b() {
            return this.f2654a;
        }

        @Override // r2.p
        public C6083O c(C6083O c6083o) {
            this.f2656c.j(c6083o.f56601a);
            this.f2656c.i(c6083o.f56602b);
            return c6083o;
        }

        @Override // r2.p
        public long d() {
            return this.f2655b.u();
        }

        @Override // r2.p
        public boolean e(boolean z10) {
            this.f2655b.D(z10);
            return z10;
        }

        public i(r2.o[] oVarArr, d0 d0Var, r2.s sVar) {
            r2.o[] oVarArr2 = new r2.o[oVarArr.length + 2];
            this.f2654a = oVarArr2;
            System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            this.f2655b = d0Var;
            this.f2656c = sVar;
            oVarArr2[oVarArr.length] = d0Var;
            oVarArr2[oVarArr.length + 1] = sVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends RuntimeException {
        private j(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6083O f2657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f2658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f2659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f2660d;

        private k(C6083O c6083o, long j10, long j11) {
            this.f2657a = c6083o;
            this.f2658b = j10;
            this.f2659c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f2661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1161i f2662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f2663c = new AudioRouting.OnRoutingChangedListener() { // from class: C2.S
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f2673a.b(audioRouting);
            }
        };

        public l(AudioTrack audioTrack, C1161i c1161i) {
            this.f2661a = audioTrack;
            this.f2662b = c1161i;
            audioTrack.addOnRoutingChangedListener(this.f2663c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.f2663c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.f2662b.j(routedDevice);
        }

        public void c() {
            this.f2661a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) AbstractC6614a.e(this.f2663c));
            this.f2663c = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Exception f2664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f2665b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f2666c = -9223372036854775807L;

        public void a() {
            this.f2664a = null;
            this.f2665b = -9223372036854775807L;
            this.f2666c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f2664a == null) {
                return false;
            }
            return P.e0() || SystemClock.elapsedRealtime() < this.f2666c;
        }

        public void c(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f2664a == null) {
                this.f2664a = exc;
            }
            if (this.f2665b == -9223372036854775807L && !P.e0()) {
                this.f2665b = 200 + jElapsedRealtime;
            }
            long j10 = this.f2665b;
            if (j10 == -9223372036854775807L || jElapsedRealtime < j10) {
                this.f2666c = jElapsedRealtime + 50;
                return;
            }
            Exception exc2 = this.f2664a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f2664a;
            a();
            throw exc3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class n implements B.a {
        private n() {
        }

        @Override // C2.B.a
        public void a(long j10) {
            if (P.this.f2624v != null) {
                P.this.f2624v.a(j10);
            }
        }

        @Override // C2.B.a
        public void b(int i10, long j10) {
            if (P.this.f2624v != null) {
                P.this.f2624v.i(i10, j10, SystemClock.elapsedRealtime() - P.this.f2602h0);
            }
        }

        @Override // C2.B.a
        public void c(long j10) {
            AbstractC6635w.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // C2.B.a
        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + P.this.b0() + ", " + P.this.c0();
            if (P.f2557q0) {
                throw new j(str);
            }
            AbstractC6635w.i("DefaultAudioSink", str);
        }

        @Override // C2.B.a
        public void e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + P.this.b0() + ", " + P.this.c0();
            if (P.f2557q0) {
                throw new j(str);
            }
            AbstractC6635w.i("DefaultAudioSink", str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f2668a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f2669b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f2671a;

            a(P p10) {
                this.f2671a = p10;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(P.this.f2628z) && P.this.f2624v != null && P.this.f2586Z) {
                    P.this.f2624v.l();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(P.this.f2628z)) {
                    P.this.f2585Y = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(P.this.f2628z) && P.this.f2624v != null && P.this.f2586Z) {
                    P.this.f2624v.l();
                }
            }
        }

        public o() {
            this.f2669b = new a(P.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f2668a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new V(handler), this.f2669b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f2669b);
            this.f2668a.removeCallbacksAndMessages(null);
        }
    }

    private boolean A0() {
        h hVar = this.f2626x;
        return hVar != null && hVar.f2651j;
    }

    private static int B0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int C0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f2569I == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f2569I = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f2569I.putInt(1431633921);
        }
        if (this.f2570J == 0) {
            this.f2569I.putInt(4, i10);
            this.f2569I.putLong(8, j10 * 1000);
            this.f2569I.position(0);
            this.f2570J = i10;
        }
        int iRemaining = this.f2569I.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f2569I, iRemaining, 1);
            if (iWrite < 0) {
                this.f2570J = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iB0 = B0(audioTrack, byteBuffer, i10);
        if (iB0 < 0) {
            this.f2570J = 0;
            return iB0;
        }
        this.f2570J -= iB0;
        return iB0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.media.AudioTrack S(C2.P.h r9) throws C2.InterfaceC1177z.c {
        /*
            r8 = this;
            int r0 = r8.f2590b0     // Catch: C2.InterfaceC1177z.c -> L46
            int r1 = r8.f2622t     // Catch: C2.InterfaceC1177z.c -> L46
            r2 = -1
            if (r1 == r2) goto L26
            android.content.Context r2 = r8.f2587a     // Catch: C2.InterfaceC1177z.c -> L1c
            if (r2 == 0) goto L26
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: C2.InterfaceC1177z.c -> L1c
            r4 = 34
            if (r3 < r4) goto L26
            android.content.Context r0 = r8.f2616o0     // Catch: C2.InterfaceC1177z.c -> L1c
            if (r0 != 0) goto L20
            android.content.Context r0 = C2.K.a(r2, r1)     // Catch: C2.InterfaceC1177z.c -> L1c
            r8.f2616o0 = r0     // Catch: C2.InterfaceC1177z.c -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L49
        L20:
            android.content.Context r0 = r8.f2616o0     // Catch: C2.InterfaceC1177z.c -> L1c
            r1 = 0
            r7 = r0
            r5 = r1
            goto L29
        L26:
            r1 = 0
            r5 = r0
            r7 = r1
        L29:
            C2.z$a r3 = r9.a()     // Catch: C2.InterfaceC1177z.c -> L46
            q2.c r4 = r8.f2564D     // Catch: C2.InterfaceC1177z.c -> L46
            q2.x r6 = r9.f2642a     // Catch: C2.InterfaceC1177z.c -> L46
            r2 = r8
            android.media.AudioTrack r9 = r2.v(r3, r4, r5, r6, r7)     // Catch: C2.InterfaceC1177z.c -> L42
            androidx.media3.exoplayer.ExoPlayer$a r0 = r2.f2620r     // Catch: C2.InterfaceC1177z.c -> L42
            if (r0 == 0) goto L45
            boolean r1 = i0(r9)     // Catch: C2.InterfaceC1177z.c -> L42
            r0.D(r1)     // Catch: C2.InterfaceC1177z.c -> L42
            return r9
        L42:
            r0 = move-exception
        L43:
            r9 = r0
            goto L49
        L45:
            return r9
        L46:
            r0 = move-exception
            r2 = r8
            goto L43
        L49:
            C2.z$d r0 = r2.f2624v
            if (r0 == 0) goto L50
            r0.g(r9)
        L50:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.P.S(C2.P$h):android.media.AudioTrack");
    }

    private AudioTrack T() throws InterfaceC1177z.c {
        try {
            return S((h) AbstractC6614a.e(this.f2626x));
        } catch (InterfaceC1177z.c e10) {
            h hVar = this.f2626x;
            if (hVar.f2649h > 1000000) {
                h hVarC = hVar.c(1000000);
                try {
                    AudioTrack audioTrackS = S(hVarC);
                    this.f2626x = hVarC;
                    return audioTrackS;
                } catch (InterfaceC1177z.c e11) {
                    e10.addSuppressed(e11);
                    j0();
                    throw e10;
                }
            }
            j0();
            throw e10;
        }
    }

    private void U(long j10) throws Exception {
        P p10;
        int iB0;
        InterfaceC1177z.d dVar;
        if (this.f2582V == null || this.f2615o.b()) {
            return;
        }
        int iRemaining = this.f2582V.remaining();
        if (this.f2598f0) {
            AbstractC6614a.g(j10 != -9223372036854775807L);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f2600g0;
            } else {
                this.f2600g0 = j10;
            }
            p10 = this;
            iB0 = p10.C0(this.f2628z, this.f2582V, iRemaining, j10);
        } else {
            p10 = this;
            iB0 = B0(p10.f2628z, p10.f2582V, iRemaining);
        }
        p10.f2602h0 = SystemClock.elapsedRealtime();
        if (iB0 < 0) {
            if (g0(iB0)) {
                if (c0() > 0) {
                    z = true;
                } else if (i0(p10.f2628z)) {
                    j0();
                    z = true;
                }
            }
            InterfaceC1177z.f fVar = new InterfaceC1177z.f(iB0, p10.f2626x.f2642a, z);
            InterfaceC1177z.d dVar2 = p10.f2624v;
            if (dVar2 != null) {
                dVar2.g(fVar);
            }
            if (!fVar.f2811b || p10.f2587a == null) {
                p10.f2615o.c(fVar);
                return;
            }
            C1157e c1157e = C1157e.f2725c;
            p10.f2561A = c1157e;
            p10.f2562B.g(c1157e);
            throw fVar;
        }
        p10.f2615o.a();
        if (i0(p10.f2628z)) {
            if (p10.f2574N > 0) {
                p10.f2606j0 = false;
            }
            if (p10.f2586Z && (dVar = p10.f2624v) != null && iB0 < iRemaining && !p10.f2606j0) {
                dVar.h();
            }
        }
        int i10 = p10.f2626x.f2644c;
        if (i10 == 0) {
            p10.f2573M += (long) iB0;
        }
        if (iB0 == iRemaining) {
            if (i10 != 0) {
                AbstractC6614a.g(p10.f2582V == p10.f2580T);
                p10.f2574N += ((long) p10.f2575O) * ((long) p10.f2581U);
            }
            p10.f2582V = null;
        }
    }

    private boolean V() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f2627y.f()) {
            U(Long.MIN_VALUE);
            return this.f2582V == null;
        }
        this.f2627y.h();
        p0(Long.MIN_VALUE);
        return this.f2627y.e() && ((byteBuffer = this.f2582V) == null || !byteBuffer.hasRemaining());
    }

    private static int W(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        AbstractC6614a.g(minBufferSize != -2);
        return minBufferSize;
    }

    private static int X(Context context) {
        int deviceId = context.getDeviceId();
        if (deviceId == 0 || deviceId == -1) {
            return -1;
        }
        return deviceId;
    }

    private static int Y(int i10, ByteBuffer byteBuffer) {
        if (i10 == 20) {
            return U2.H.h(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iM = U2.F.m(t2.a0.R(byteBuffer, byteBuffer.position()));
                    if (iM != -1) {
                        return iM;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                case 11:
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int iB = AbstractC2241b.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return AbstractC2241b.i(byteBuffer, iB) * 16;
                        case 15:
                            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        case 16:
                            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        case 17:
                            return AbstractC2242c.f(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i10);
                    }
                    break;
            }
            return AbstractC2241b.e(byteBuffer);
        }
        return AbstractC2254o.f(byteBuffer);
    }

    private static String Z(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a0(int i10) {
        int iB = AbstractC2257s.b(i10);
        AbstractC6614a.g(iB != -2147483647);
        return iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long b0() {
        h hVar = this.f2626x;
        return hVar.f2644c == 0 ? this.f2571K / ((long) hVar.f2643b) : this.f2572L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long c0() {
        return this.f2626x.f2644c == 0 ? t2.a0.o(this.f2573M, r0.f2645d) : this.f2574N;
    }

    private void d0(long j10) {
        this.f2612m0 += j10;
        if (this.f2614n0 == null) {
            this.f2614n0 = new Handler(Looper.myLooper());
        }
        this.f2614n0.removeCallbacksAndMessages(null);
        this.f2614n0.postDelayed(new Runnable() { // from class: C2.N
            @Override // java.lang.Runnable
            public final void run() {
                this.f2554a.l0();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e0() {
        boolean z10;
        synchronized (f2558r0) {
            z10 = f2560t0 > 0;
        }
        return z10;
    }

    private boolean f0() throws InterfaceC1177z.c {
        K1 k12;
        if (this.f2613n.b()) {
            return false;
        }
        AudioTrack audioTrackT = T();
        this.f2628z = audioTrackT;
        if (i0(audioTrackT)) {
            q0(this.f2628z);
            h hVar = this.f2626x;
            if (hVar.f2652k) {
                AudioTrack audioTrack = this.f2628z;
                C6109x c6109x = hVar.f2642a;
                audioTrack.setOffloadDelayPadding(c6109x.f57000J, c6109x.f57001K);
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (k12 = this.f2623u) != null) {
            c.a(this.f2628z, k12);
        }
        B b10 = this.f2603i;
        AudioTrack audioTrack2 = this.f2628z;
        h hVar2 = this.f2626x;
        b10.u(audioTrack2, hVar2.f2644c == 2, hVar2.f2648g, hVar2.f2645d, hVar2.f2649h, this.f2618p0);
        w0();
        int i10 = this.f2594d0.f56874a;
        if (i10 != 0) {
            this.f2628z.attachAuxEffect(i10);
            this.f2628z.setAuxEffectSendLevel(this.f2594d0.f56875b);
        }
        C1162j c1162j = this.f2596e0;
        if (c1162j != null) {
            b.b(this.f2628z, c1162j);
            C1161i c1161i = this.f2562B;
            if (c1161i != null) {
                c1161i.j(this.f2596e0.f2757a);
            }
        }
        C1161i c1161i2 = this.f2562B;
        if (c1161i2 != null) {
            this.f2563C = new l(this.f2628z, c1161i2);
        }
        this.f2577Q = true;
        int audioSessionId = this.f2628z.getAudioSessionId();
        boolean z10 = audioSessionId != this.f2590b0;
        this.f2590b0 = audioSessionId;
        InterfaceC1177z.d dVar = this.f2624v;
        if (dVar != null) {
            dVar.e(this.f2626x.a());
            if (z10) {
                this.f2592c0 = true;
                this.f2624v.d(this.f2590b0);
            }
        }
        return true;
    }

    private static boolean g0(int i10) {
        return i10 == -6 || i10 == -32;
    }

    public static /* synthetic */ void h(AudioTrack audioTrack, final InterfaceC1177z.d dVar, Handler handler, final InterfaceC1177z.a aVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: C2.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.c(aVar);
                    }
                });
            }
            synchronized (f2558r0) {
                try {
                    int i10 = f2560t0 - 1;
                    f2560t0 = i10;
                    if (i10 == 0) {
                        f2559s0.shutdown();
                        f2559s0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: C2.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.c(aVar);
                    }
                });
            }
            synchronized (f2558r0) {
                try {
                    int i11 = f2560t0 - 1;
                    f2560t0 = i11;
                    if (i11 == 0) {
                        f2559s0.shutdown();
                        f2559s0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    private boolean h0() {
        return this.f2628z != null;
    }

    private static boolean i0(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void j0() {
        if (this.f2626x.f()) {
            this.f2604i0 = true;
        }
    }

    private ByteBuffer k0(ByteBuffer byteBuffer) {
        if (this.f2626x.f2644c == 0) {
            int iH = (int) t2.a0.H(t2.a0.V0(20L), this.f2626x.f2646e);
            long jC0 = c0();
            if (jC0 < iH) {
                h hVar = this.f2626x;
                return c0.a(byteBuffer, hVar.f2648g, hVar.f2645d, (int) jC0, iH);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        if (this.f2612m0 >= 300000) {
            this.f2624v.b();
            this.f2612m0 = 0L;
        }
    }

    private void m0() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        AbstractC6614a.h(this.f2562B == null || this.f2608k0 == looperMyLooper, "DefaultAudioSink accessed on multiple threads: " + Z(this.f2608k0) + " and " + Z(looperMyLooper));
        if (this.f2562B == null && (context = this.f2587a) != null) {
            this.f2608k0 = looperMyLooper;
            C1161i c1161i = new C1161i(context, new C1161i.f() { // from class: C2.M
                @Override // C2.C1161i.f
                public final void a(C1157e c1157e) {
                    this.f2553a.n0(c1157e);
                }
            }, this.f2564D, this.f2596e0);
            this.f2562B = c1161i;
            this.f2561A = c1161i.h();
        }
        AbstractC6614a.e(this.f2561A);
    }

    private void o0() {
        if (this.f2584X) {
            return;
        }
        this.f2584X = true;
        this.f2603i.h(c0());
        if (i0(this.f2628z)) {
            this.f2585Y = false;
        }
        this.f2628z.stop();
        this.f2570J = 0;
    }

    private void p0(long j10) throws Exception {
        U(j10);
        if (this.f2582V != null) {
            return;
        }
        if (!this.f2627y.f()) {
            ByteBuffer byteBuffer = this.f2580T;
            if (byteBuffer != null) {
                v0(byteBuffer);
                U(j10);
                return;
            }
            return;
        }
        while (!this.f2627y.e()) {
            do {
                ByteBuffer byteBufferD = this.f2627y.d();
                if (byteBufferD.hasRemaining()) {
                    v0(byteBufferD);
                    U(j10);
                } else {
                    ByteBuffer byteBuffer2 = this.f2580T;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f2627y.i(this.f2580T);
                    }
                }
            } while (this.f2582V == null);
            return;
        }
    }

    private void q0(AudioTrack audioTrack) {
        if (this.f2611m == null) {
            this.f2611m = new o();
        }
        this.f2611m.a(audioTrack);
    }

    private void r(long j10) {
        C6083O c6083oC;
        if (A0()) {
            c6083oC = C6083O.f56598d;
        } else {
            c6083oC = y0() ? this.f2589b.c(this.f2567G) : C6083O.f56598d;
            this.f2567G = c6083oC;
        }
        C6083O c6083o = c6083oC;
        this.f2568H = y0() ? this.f2589b.e(this.f2568H) : false;
        this.f2605j.add(new k(c6083o, Math.max(0L, j10), this.f2626x.d(c0())));
        x0();
        InterfaceC1177z.d dVar = this.f2624v;
        if (dVar != null) {
            dVar.f(this.f2568H);
        }
    }

    private static void r0(final AudioTrack audioTrack, final InterfaceC1177z.d dVar, final InterfaceC1177z.a aVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f2558r0) {
            try {
                if (f2559s0 == null) {
                    f2559s0 = t2.a0.X0("ExoPlayer:AudioTrackReleaseThread");
                }
                f2560t0++;
                f2559s0.schedule(new Runnable() { // from class: C2.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        P.h(audioTrack, dVar, handler, aVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private long s(long j10) {
        while (!this.f2605j.isEmpty() && j10 >= ((k) this.f2605j.getFirst()).f2659c) {
            this.f2566F = (k) this.f2605j.remove();
        }
        k kVar = this.f2566F;
        long j11 = j10 - kVar.f2659c;
        long jJ0 = t2.a0.j0(j11, kVar.f2657a.f56601a);
        if (!this.f2605j.isEmpty()) {
            k kVar2 = this.f2566F;
            return kVar2.f2658b + jJ0 + kVar2.f2660d;
        }
        long jA = this.f2589b.a(j11);
        k kVar3 = this.f2566F;
        long j12 = kVar3.f2658b + jA;
        kVar3.f2660d = jA - jJ0;
        return j12;
    }

    private void s0() {
        this.f2571K = 0L;
        this.f2572L = 0L;
        this.f2573M = 0L;
        this.f2574N = 0L;
        this.f2606j0 = false;
        this.f2575O = 0;
        this.f2566F = new k(this.f2567G, 0L, 0L);
        this.f2578R = 0L;
        this.f2565E = null;
        this.f2605j.clear();
        this.f2580T = null;
        this.f2581U = 0;
        this.f2582V = null;
        this.f2584X = false;
        this.f2583W = false;
        this.f2585Y = false;
        this.f2569I = null;
        this.f2570J = 0;
        this.f2595e.n();
        x0();
    }

    private long t(long j10) {
        long jD = this.f2589b.d();
        long jD2 = j10 + this.f2626x.d(jD);
        long j11 = this.f2610l0;
        if (jD > j11) {
            long jD3 = this.f2626x.d(jD - j11);
            this.f2610l0 = jD;
            d0(jD3);
        }
        return jD2;
    }

    private void t0(C6083O c6083o) {
        k kVar = new k(c6083o, -9223372036854775807L, -9223372036854775807L);
        if (h0()) {
            this.f2565E = kVar;
        } else {
            this.f2566F = kVar;
        }
    }

    private void u0() {
        if (h0()) {
            try {
                this.f2628z.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f2567G.f56601a).setPitch(this.f2567G.f56602b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                AbstractC6635w.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            C6083O c6083o = new C6083O(this.f2628z.getPlaybackParams().getSpeed(), this.f2628z.getPlaybackParams().getPitch());
            this.f2567G = c6083o;
            this.f2603i.v(c6083o.f56601a);
        }
    }

    private AudioTrack v(InterfaceC1177z.a aVar, C6088c c6088c, int i10, C6109x c6109x, Context context) throws InterfaceC1177z.c {
        try {
            AudioTrack audioTrackA = this.f2621s.a(aVar, c6088c, i10, context);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new InterfaceC1177z.c(state, aVar.f2799b, aVar.f2800c, aVar.f2798a, aVar.f2803f, c6109x, aVar.f2802e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new InterfaceC1177z.c(0, aVar.f2799b, aVar.f2800c, aVar.f2798a, aVar.f2803f, c6109x, aVar.f2802e, e10);
        }
    }

    private void v0(ByteBuffer byteBuffer) {
        AbstractC6614a.g(this.f2582V == null);
        if (byteBuffer.hasRemaining()) {
            this.f2582V = k0(byteBuffer);
        }
    }

    private void w0() {
        if (h0()) {
            this.f2628z.setVolume(this.f2579S);
        }
    }

    private void x0() {
        r2.n nVar = this.f2626x.f2650i;
        this.f2627y = nVar;
        nVar.b();
    }

    private boolean y0() {
        if (this.f2598f0) {
            return false;
        }
        h hVar = this.f2626x;
        return hVar.f2644c == 0 && !z0(hVar.f2642a.f56999I);
    }

    private boolean z0(int i10) {
        return this.f2591c && t2.a0.K0(i10);
    }

    @Override // C2.InterfaceC1177z
    public void A(C6092g c6092g) {
        if (this.f2594d0.equals(c6092g)) {
            return;
        }
        int i10 = c6092g.f56874a;
        float f10 = c6092g.f56875b;
        AudioTrack audioTrack = this.f2628z;
        if (audioTrack != null) {
            if (this.f2594d0.f56874a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f2628z.setAuxEffectSendLevel(f10);
            }
        }
        this.f2594d0 = c6092g;
    }

    @Override // C2.InterfaceC1177z
    public void B(int i10) {
        AbstractC6614a.g(Build.VERSION.SDK_INT >= 29);
        this.f2609l = i10;
    }

    @Override // C2.InterfaceC1177z
    public void C() {
        if (this.f2598f0) {
            this.f2598f0 = false;
            flush();
        }
    }

    @Override // C2.InterfaceC1177z
    public int D(C6109x c6109x) {
        m0();
        if (!"audio/raw".equals(c6109x.f57022o)) {
            return this.f2561A.j(c6109x, this.f2564D) ? 2 : 0;
        }
        if (t2.a0.L0(c6109x.f56999I)) {
            int i10 = c6109x.f56999I;
            return (i10 == 2 || (this.f2591c && i10 == 4)) ? 2 : 1;
        }
        AbstractC6635w.i("DefaultAudioSink", "Invalid PCM encoding: " + c6109x.f56999I);
        return 0;
    }

    @Override // C2.InterfaceC1177z
    public void E(InterfaceC1177z.d dVar) {
        this.f2624v = dVar;
    }

    @Override // C2.InterfaceC1177z
    public C1163k F(C6109x c6109x) {
        return this.f2604i0 ? C1163k.f2758d : this.f2619q.a(c6109x, this.f2564D);
    }

    @Override // C2.InterfaceC1177z
    public boolean G(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.f2580T;
        AbstractC6614a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f2625w != null) {
            if (!V()) {
                return false;
            }
            if (this.f2625w.b(this.f2626x)) {
                this.f2626x = this.f2625w;
                this.f2625w = null;
                AudioTrack audioTrack = this.f2628z;
                if (audioTrack != null && i0(audioTrack) && this.f2626x.f2652k) {
                    if (this.f2628z.getPlayState() == 3) {
                        this.f2628z.setOffloadEndOfStream();
                        this.f2603i.a();
                    }
                    AudioTrack audioTrack2 = this.f2628z;
                    C6109x c6109x = this.f2626x.f2642a;
                    audioTrack2.setOffloadDelayPadding(c6109x.f57000J, c6109x.f57001K);
                    this.f2606j0 = true;
                }
            } else {
                o0();
                if (x()) {
                    return false;
                }
                flush();
            }
            r(j10);
        }
        if (!h0()) {
            try {
                if (!f0()) {
                    return false;
                }
            } catch (InterfaceC1177z.c e10) {
                if (e10.f2806b) {
                    throw e10;
                }
                this.f2613n.c(e10);
                return false;
            }
        }
        this.f2613n.a();
        if (this.f2577Q) {
            this.f2578R = Math.max(0L, j10);
            this.f2576P = false;
            this.f2577Q = false;
            if (A0()) {
                u0();
            }
            r(j10);
            if (this.f2586Z) {
                u();
            }
        }
        if (!this.f2603i.m(c0())) {
            return false;
        }
        if (this.f2580T == null) {
            AbstractC6614a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.f2626x;
            if (hVar.f2644c != 0 && this.f2575O == 0) {
                int iY = Y(hVar.f2648g, byteBuffer);
                this.f2575O = iY;
                if (iY == 0) {
                    return true;
                }
            }
            if (this.f2565E != null) {
                if (!V()) {
                    return false;
                }
                r(j10);
                this.f2565E = null;
            }
            long jE = this.f2578R + this.f2626x.e(b0() - this.f2595e.m());
            if (!this.f2576P && Math.abs(jE - j10) > 200000) {
                InterfaceC1177z.d dVar = this.f2624v;
                if (dVar != null) {
                    dVar.g(new InterfaceC1177z.e(j10, jE));
                }
                this.f2576P = true;
            }
            if (this.f2576P) {
                if (!V()) {
                    return false;
                }
                long j11 = j10 - jE;
                this.f2578R += j11;
                this.f2576P = false;
                r(j10);
                InterfaceC1177z.d dVar2 = this.f2624v;
                if (dVar2 != null && j11 != 0) {
                    dVar2.k();
                }
            }
            if (this.f2626x.f2644c == 0) {
                this.f2571K += (long) byteBuffer.remaining();
            } else {
                this.f2572L += ((long) this.f2575O) * ((long) i10);
            }
            this.f2580T = byteBuffer;
            this.f2581U = i10;
        }
        p0(j10);
        if (!this.f2580T.hasRemaining()) {
            this.f2580T = null;
            this.f2581U = 0;
            return true;
        }
        if (!this.f2603i.l(c0())) {
            return false;
        }
        AbstractC6635w.i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // C2.InterfaceC1177z
    public void H(InterfaceC6623j interfaceC6623j) {
        this.f2603i.w(interfaceC6623j);
    }

    @Override // C2.InterfaceC1177z
    public void I() {
        if (!this.f2583W && h0() && V()) {
            o0();
            this.f2583W = true;
        }
    }

    @Override // C2.InterfaceC1177z
    public void J(int i10, int i11) {
        h hVar;
        AudioTrack audioTrack = this.f2628z;
        if (audioTrack == null || !i0(audioTrack) || (hVar = this.f2626x) == null || !hVar.f2652k) {
            return;
        }
        this.f2628z.setOffloadDelayPadding(i10, i11);
    }

    @Override // C2.InterfaceC1177z
    public void K(C6109x c6109x, int i10, int[] iArr) throws InterfaceC1177z.b {
        int i11;
        int i12;
        int iO0;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        r2.n nVar;
        int i15;
        int i16;
        int iA;
        m0();
        if ("audio/raw".equals(c6109x.f57022o)) {
            AbstractC6614a.a(t2.a0.L0(c6109x.f56999I));
            iO0 = t2.a0.o0(c6109x.f56999I, c6109x.f56997G);
            AbstractC2011u.a aVar = new AbstractC2011u.a();
            aVar.j(this.f2601h);
            if (z0(c6109x.f56999I)) {
                aVar.a(this.f2599g);
            } else {
                aVar.a(this.f2597f);
                aVar.i(this.f2589b.b());
            }
            r2.n nVar2 = new r2.n(aVar.k());
            if (nVar2.equals(this.f2627y)) {
                nVar2 = this.f2627y;
            }
            this.f2595e.o(c6109x.f57000J, c6109x.f57001K);
            this.f2593d.m(iArr);
            try {
                o.a aVarA = nVar2.a(new o.a(c6109x));
                int i17 = aVarA.f58445c;
                i11 = aVarA.f58443a;
                int iB = this.f2621s.b(aVarA.f58444b);
                int iO02 = t2.a0.o0(i17, aVarA.f58444b);
                i12 = 0;
                i13 = i17;
                i14 = iB;
                z11 = this.f2607k;
                nVar = nVar2;
                i15 = iO02;
                z10 = false;
            } catch (o.b e10) {
                throw new InterfaceC1177z.b(e10, c6109x);
            }
        } else {
            r2.n nVar3 = new r2.n(AbstractC2011u.A());
            i11 = c6109x.f56998H;
            C1163k c1163kF = this.f2609l != 0 ? F(c6109x) : C1163k.f2758d;
            if (this.f2609l == 0 || !c1163kF.f2759a) {
                Pair pairH = this.f2561A.h(c6109x, this.f2564D);
                if (pairH == null) {
                    throw new InterfaceC1177z.b("Unable to configure passthrough for: " + c6109x, c6109x);
                }
                int iIntValue = ((Integer) pairH.first).intValue();
                int iIntValue2 = ((Integer) pairH.second).intValue();
                i12 = 2;
                iO0 = -1;
                z10 = false;
                i13 = iIntValue;
                i14 = iIntValue2;
                z11 = this.f2607k;
                nVar = nVar3;
            } else {
                int iF = AbstractC6079K.f((String) AbstractC6614a.e(c6109x.f57022o), c6109x.f57018k);
                int iB2 = this.f2621s.b(c6109x.f56997G);
                z10 = c1163kF.f2760b;
                iO0 = -1;
                nVar = nVar3;
                i13 = iF;
                i14 = iB2;
                z11 = true;
                i12 = 1;
            }
            i15 = iO0;
        }
        if (i13 == 0) {
            throw new InterfaceC1177z.b("Invalid output encoding (mode=" + i12 + ") for: " + c6109x, c6109x);
        }
        if (i14 == 0) {
            throw new InterfaceC1177z.b("Invalid output channel config (mode=" + i12 + ") for: " + c6109x, c6109x);
        }
        int i18 = c6109x.f57017j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(c6109x.f57022o) && i18 == -1) {
            i18 = 768000;
        }
        int i19 = i18;
        if (i10 != 0) {
            iA = i10;
            i16 = i11;
        } else {
            i16 = i11;
            iA = this.f2617p.a(W(i11, i14, i13), i13, i12, i15 != -1 ? i15 : 1, i16, i19, z11 ? 8.0d : 1.0d);
        }
        this.f2604i0 = false;
        boolean z12 = z10;
        int i20 = i12;
        h hVar = new h(c6109x, iO0, i20, i15, i16, i14, i13, iA, nVar, z11, z12, this.f2598f0);
        if (h0()) {
            this.f2625w = hVar;
        } else {
            this.f2626x = hVar;
        }
    }

    @Override // C2.InterfaceC1177z
    public long L(boolean z10) {
        if (!h0() || this.f2577Q) {
            return Long.MIN_VALUE;
        }
        return t(s(Math.min(this.f2603i.c(), this.f2626x.d(c0()))));
    }

    @Override // C2.InterfaceC1177z
    public void N() {
        this.f2576P = true;
    }

    @Override // C2.InterfaceC1177z
    public void O() {
        AbstractC6614a.g(this.f2588a0);
        if (this.f2598f0) {
            return;
        }
        this.f2598f0 = true;
        flush();
    }

    @Override // C2.InterfaceC1177z
    public void P(C6088c c6088c) {
        if (this.f2564D.equals(c6088c)) {
            return;
        }
        this.f2564D = c6088c;
        if (this.f2598f0) {
            return;
        }
        C1161i c1161i = this.f2562B;
        if (c1161i != null) {
            c1161i.i(c6088c);
        }
        flush();
    }

    @Override // C2.InterfaceC1177z
    public void Q(K1 k12) {
        this.f2623u = k12;
    }

    @Override // C2.InterfaceC1177z
    public void R(boolean z10) {
        this.f2568H = z10;
        t0(A0() ? C6083O.f56598d : this.f2567G);
    }

    @Override // C2.InterfaceC1177z
    public void a() {
        C1161i c1161i = this.f2562B;
        if (c1161i != null) {
            c1161i.k();
        }
    }

    @Override // C2.InterfaceC1177z
    public boolean b(C6109x c6109x) {
        return D(c6109x) != 0;
    }

    @Override // C2.InterfaceC1177z
    public C6083O c() {
        return this.f2567G;
    }

    @Override // C2.InterfaceC1177z
    public boolean d() {
        if (h0()) {
            return this.f2583W && !x();
        }
        return true;
    }

    @Override // C2.InterfaceC1177z
    public void e(C6083O c6083o) {
        this.f2567G = new C6083O(t2.a0.q(c6083o.f56601a, 0.1f, 8.0f), t2.a0.q(c6083o.f56602b, 0.1f, 8.0f));
        if (A0()) {
            u0();
        } else {
            t0(c6083o);
        }
    }

    @Override // C2.InterfaceC1177z
    public void flush() {
        if (h0()) {
            s0();
            if (this.f2603i.k()) {
                this.f2628z.pause();
            }
            if (i0(this.f2628z)) {
                ((o) AbstractC6614a.e(this.f2611m)).b(this.f2628z);
            }
            InterfaceC1177z.a aVarA = this.f2626x.a();
            h hVar = this.f2625w;
            if (hVar != null) {
                this.f2626x = hVar;
                this.f2625w = null;
            }
            this.f2603i.s();
            l lVar = this.f2563C;
            if (lVar != null) {
                lVar.c();
                this.f2563C = null;
            }
            r0(this.f2628z, this.f2624v, aVarA);
            this.f2628z = null;
        }
        this.f2615o.a();
        this.f2613n.a();
        this.f2610l0 = 0L;
        this.f2612m0 = 0L;
        Handler handler = this.f2614n0;
        if (handler != null) {
            ((Handler) AbstractC6614a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    public void n0(C1157e c1157e) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC6614a.h(this.f2608k0 == looperMyLooper, "Current looper (" + Z(looperMyLooper) + ") is not the playback looper (" + Z(this.f2608k0) + ")");
        C1157e c1157e2 = this.f2561A;
        if (c1157e2 == null || c1157e.equals(c1157e2)) {
            return;
        }
        this.f2561A = c1157e;
        InterfaceC1177z.d dVar = this.f2624v;
        if (dVar != null) {
            dVar.j();
        }
    }

    @Override // C2.InterfaceC1177z
    public void pause() {
        this.f2586Z = false;
        if (h0()) {
            this.f2603i.r();
            if (!this.f2584X || i0(this.f2628z)) {
                this.f2628z.pause();
            }
        }
    }

    @Override // C2.InterfaceC1177z
    public void reset() {
        flush();
        P9.X it = this.f2601h.iterator();
        while (it.hasNext()) {
            ((r2.o) it.next()).reset();
        }
        this.f2597f.reset();
        this.f2599g.reset();
        r2.n nVar = this.f2627y;
        if (nVar != null) {
            nVar.j();
        }
        this.f2586Z = false;
        this.f2604i0 = false;
    }

    @Override // C2.InterfaceC1177z
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f2596e0 = audioDeviceInfo == null ? null : new C1162j(audioDeviceInfo);
        C1161i c1161i = this.f2562B;
        if (c1161i != null) {
            c1161i.j(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f2628z;
        if (audioTrack != null) {
            b.b(audioTrack, this.f2596e0);
        }
    }

    @Override // C2.InterfaceC1177z
    public void u() {
        this.f2586Z = true;
        if (h0()) {
            this.f2603i.x();
            if (!this.f2584X || i0(this.f2628z)) {
                this.f2628z.play();
            }
        }
    }

    @Override // C2.InterfaceC1177z
    public void w(float f10) {
        if (this.f2579S != f10) {
            this.f2579S = f10;
            w0();
        }
    }

    @Override // C2.InterfaceC1177z
    public boolean x() {
        if (h0()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.f2628z.isOffloadedPlayback() && this.f2585Y) && this.f2603i.j(c0());
        }
        return false;
    }

    @Override // C2.InterfaceC1177z
    public void y(int i10) {
        if (this.f2592c0) {
            if (this.f2590b0 != i10) {
                return;
            } else {
                this.f2592c0 = false;
            }
        }
        if (this.f2590b0 != i10) {
            this.f2590b0 = i10;
            this.f2588a0 = i10 != 0;
            flush();
        }
    }

    @Override // C2.InterfaceC1177z
    public long z() {
        if (h0()) {
            return b.a(this.f2628z, this.f2626x);
        }
        return -9223372036854775807L;
    }

    private P(g gVar) {
        Context applicationContext = gVar.f2631a == null ? null : gVar.f2631a.getApplicationContext();
        this.f2587a = applicationContext;
        this.f2564D = C6088c.f56745h;
        this.f2561A = applicationContext != null ? null : gVar.f2632b;
        this.f2589b = gVar.f2633c;
        this.f2591c = gVar.f2634d;
        int i10 = Build.VERSION.SDK_INT;
        this.f2607k = gVar.f2635e;
        this.f2609l = 0;
        this.f2617p = gVar.f2637g;
        this.f2619q = (d) AbstractC6614a.e(gVar.f2639i);
        this.f2603i = new B(new n());
        C c10 = new C();
        this.f2593d = c10;
        f0 f0Var = new f0();
        this.f2595e = f0Var;
        this.f2597f = new r2.t();
        this.f2599g = new e0();
        this.f2601h = AbstractC2011u.D(f0Var, c10);
        this.f2579S = 1.0f;
        this.f2590b0 = 0;
        this.f2594d0 = new C6092g(0, 0.0f);
        C6083O c6083o = C6083O.f56598d;
        this.f2566F = new k(c6083o, 0L, 0L);
        this.f2567G = c6083o;
        this.f2568H = false;
        this.f2605j = new ArrayDeque();
        this.f2613n = new m();
        this.f2615o = new m();
        this.f2620r = gVar.f2641k;
        this.f2621s = gVar.f2638h;
        this.f2622t = (i10 < 34 || gVar.f2631a == null) ? -1 : X(gVar.f2631a);
        this.f2618p0 = gVar.f2640j;
    }
}
