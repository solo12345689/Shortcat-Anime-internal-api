package Rh;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    byte[] f15553A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f15554B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f15555C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f15556D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f15557E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f15558F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    int f15559G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    byte[] f15560H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f15561I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    int f15562J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    int f15563K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f15564L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f15565M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f15566N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f15567O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    int f15568P;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f15573U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    int f15574V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    int f15575W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    int f15576X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    int f15577Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    byte[] f15578Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f15580b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte[] f15582d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f15585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f15586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f15587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f15588j;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f15601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f15602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f15603y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    byte[] f15604z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f15579a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final a f15581c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int[] f15583e = new int[3240];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int[] f15584f = new int[3240];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final h f15589k = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final h f15590l = new h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final h f15591m = new h();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int[] f15592n = new int[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final int[] f15593o = new int[3];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final int[] f15594p = new int[6];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int[] f15595q = {16, 15, 11, 4};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f15596r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f15597s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f15598t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f15599u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f15600v = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    int f15569Q = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    long f15570R = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    byte[] f15571S = new byte[0];

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    int f15572T = 0;

    k() {
    }

    static void a(k kVar) throws IOException {
        int i10 = kVar.f15579a;
        if (i10 == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i10 == 11) {
            return;
        }
        kVar.f15579a = 11;
        a.b(kVar.f15581c);
    }

    private static int b(a aVar) {
        if (a.i(aVar, 1) == 0) {
            return 16;
        }
        int i10 = a.i(aVar, 3);
        if (i10 != 0) {
            return i10 + 17;
        }
        int i11 = a.i(aVar, 3);
        if (i11 != 0) {
            return i11 + 8;
        }
        return 17;
    }

    static void c(k kVar, InputStream inputStream) {
        if (kVar.f15579a != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        a.e(kVar.f15581c, inputStream);
        int iB = b(kVar.f15581c);
        if (iB == 9) {
            throw new c("Invalid 'windowBits' code");
        }
        int i10 = 1 << iB;
        kVar.f15568P = i10;
        kVar.f15567O = i10 - 16;
        kVar.f15579a = 1;
    }
}
