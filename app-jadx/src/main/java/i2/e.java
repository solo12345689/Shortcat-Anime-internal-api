package I2;

import A2.J;
import I2.b;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.AbstractC2886h;
import androidx.media3.exoplayer.C2907s;
import androidx.media3.exoplayer.O0;
import androidx.media3.exoplayer.image.ImageOutput;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.P;
import z2.f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractC2886h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f8778A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f8779B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private C6109x f8780C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private I2.b f8781D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private f f8782E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private ImageOutput f8783F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Bitmap f8784G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f8785H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private b f8786I;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private b f8787X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f8788Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f8789Z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final b.a f8790s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f f8791t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ArrayDeque f8792u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8793v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8794w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private a f8795x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f8796y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f8797z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f8798c = new a(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8800b;

        public a(long j10, long j11) {
            this.f8799a = j10;
            this.f8800b = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f8802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f8803c;

        public b(int i10, long j10) {
            this.f8801a = i10;
            this.f8802b = j10;
        }

        public long a() {
            return this.f8802b;
        }

        public Bitmap b() {
            return this.f8803c;
        }

        public int c() {
            return this.f8801a;
        }

        public boolean d() {
            return this.f8803c != null;
        }

        public void e(Bitmap bitmap) {
            this.f8803c = bitmap;
        }
    }

    public e(b.a aVar, ImageOutput imageOutput) {
        super(4);
        this.f8790s = aVar;
        this.f8783F = v0(imageOutput);
        this.f8791t = f.A();
        this.f8795x = a.f8798c;
        this.f8792u = new ArrayDeque();
        this.f8797z = -9223372036854775807L;
        this.f8796y = -9223372036854775807L;
        this.f8778A = 0;
        this.f8779B = 1;
    }

    private void B0(long j10) {
        this.f8796y = j10;
        while (!this.f8792u.isEmpty() && j10 >= ((a) this.f8792u.peek()).f8799a) {
            this.f8795x = (a) this.f8792u.removeFirst();
        }
    }

    private void D0() {
        this.f8782E = null;
        this.f8778A = 0;
        this.f8797z = -9223372036854775807L;
        I2.b bVar = this.f8781D;
        if (bVar != null) {
            bVar.a();
            this.f8781D = null;
        }
    }

    private void E0(ImageOutput imageOutput) {
        this.f8783F = v0(imageOutput);
    }

    private boolean F0() {
        boolean z10 = getState() == 2;
        int i10 = this.f8779B;
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    private boolean r0(C6109x c6109x) {
        int iB = this.f8790s.b(c6109x);
        return iB == O0.t(4) || iB == O0.t(3);
    }

    private Bitmap s0(int i10) {
        AbstractC6614a.i(this.f8784G);
        int width = this.f8784G.getWidth() / ((C6109x) AbstractC6614a.i(this.f8780C)).f57004N;
        int height = this.f8784G.getHeight() / ((C6109x) AbstractC6614a.i(this.f8780C)).f57005O;
        int i11 = this.f8780C.f57004N;
        return Bitmap.createBitmap(this.f8784G, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    private boolean t0(long j10, long j11) throws C2907s {
        if (this.f8784G != null && this.f8786I == null) {
            return false;
        }
        if (this.f8779B == 0 && getState() != 2) {
            return false;
        }
        if (this.f8784G == null) {
            AbstractC6614a.i(this.f8781D);
            d dVarB = this.f8781D.b();
            if (dVarB == null) {
                return false;
            }
            if (((d) AbstractC6614a.i(dVarB)).q()) {
                if (this.f8778A == 3) {
                    D0();
                    AbstractC6614a.i(this.f8780C);
                    z0();
                } else {
                    ((d) AbstractC6614a.i(dVarB)).w();
                    if (this.f8792u.isEmpty()) {
                        this.f8794w = true;
                    }
                }
                return false;
            }
            AbstractC6614a.j(dVarB.f8777e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f8784G = dVarB.f8777e;
            ((d) AbstractC6614a.i(dVarB)).w();
        }
        if (!this.f8785H || this.f8784G == null || this.f8786I == null) {
            return false;
        }
        AbstractC6614a.i(this.f8780C);
        C6109x c6109x = this.f8780C;
        int i10 = c6109x.f57004N;
        boolean z10 = ((i10 == 1 && c6109x.f57005O == 1) || i10 == -1 || c6109x.f57005O == -1) ? false : true;
        if (!this.f8786I.d()) {
            b bVar = this.f8786I;
            bVar.e(z10 ? s0(bVar.c()) : (Bitmap) AbstractC6614a.i(this.f8784G));
        }
        if (!C0(j10, j11, (Bitmap) AbstractC6614a.i(this.f8786I.b()), this.f8786I.a())) {
            return false;
        }
        B0(((b) AbstractC6614a.i(this.f8786I)).a());
        this.f8779B = 3;
        if (!z10 || ((b) AbstractC6614a.i(this.f8786I)).c() == (((C6109x) AbstractC6614a.i(this.f8780C)).f57005O * ((C6109x) AbstractC6614a.i(this.f8780C)).f57004N) - 1) {
            this.f8784G = null;
        }
        this.f8786I = this.f8787X;
        this.f8787X = null;
        return true;
    }

    private boolean u0(long j10) {
        if (this.f8785H && this.f8786I != null) {
            return false;
        }
        J jV = V();
        I2.b bVar = this.f8781D;
        if (bVar == null || this.f8778A == 3 || this.f8793v) {
            return false;
        }
        if (this.f8782E == null) {
            f fVar = (f) bVar.g();
            this.f8782E = fVar;
            if (fVar == null) {
                return false;
            }
        }
        if (this.f8778A == 2) {
            AbstractC6614a.i(this.f8782E);
            this.f8782E.v(4);
            ((I2.b) AbstractC6614a.i(this.f8781D)).d(this.f8782E);
            this.f8782E = null;
            this.f8778A = 3;
            return false;
        }
        int iO0 = o0(jV, this.f8782E, 0);
        if (iO0 == -5) {
            this.f8780C = (C6109x) AbstractC6614a.i(jV.f142b);
            this.f8789Z = true;
            this.f8778A = 2;
            return true;
        }
        if (iO0 != -4) {
            if (iO0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f8782E.y();
        ByteBuffer byteBuffer = this.f8782E.f65555d;
        boolean z10 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((f) AbstractC6614a.i(this.f8782E)).q();
        if (z10) {
            ((f) AbstractC6614a.i(this.f8782E)).f65553b = this.f8780C;
            ((I2.b) AbstractC6614a.i(this.f8781D)).d((f) AbstractC6614a.i(this.f8782E));
            this.f8788Y = 0;
        }
        y0(j10, (f) AbstractC6614a.i(this.f8782E));
        if (((f) AbstractC6614a.i(this.f8782E)).q()) {
            this.f8793v = true;
            this.f8782E = null;
            return false;
        }
        this.f8797z = Math.max(this.f8797z, ((f) AbstractC6614a.i(this.f8782E)).f65557f);
        if (z10) {
            this.f8782E = null;
        } else {
            ((f) AbstractC6614a.i(this.f8782E)).m();
        }
        return !this.f8785H;
    }

    private static ImageOutput v0(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f31024a : imageOutput;
    }

    private boolean w0(b bVar) {
        return ((C6109x) AbstractC6614a.i(this.f8780C)).f57004N == -1 || this.f8780C.f57005O == -1 || bVar.c() == (((C6109x) AbstractC6614a.i(this.f8780C)).f57005O * this.f8780C.f57004N) - 1;
    }

    private void x0(int i10) {
        this.f8779B = Math.min(this.f8779B, i10);
    }

    private void y0(long j10, f fVar) {
        boolean z10 = true;
        if (fVar.q()) {
            this.f8785H = true;
            return;
        }
        b bVar = new b(this.f8788Y, fVar.f65557f);
        this.f8787X = bVar;
        this.f8788Y++;
        if (!this.f8785H) {
            long jA = bVar.a();
            boolean z11 = jA - HTTPTimeoutManager.DEFAULT_TIMEOUT_MS <= j10 && j10 <= HTTPTimeoutManager.DEFAULT_TIMEOUT_MS + jA;
            b bVar2 = this.f8786I;
            boolean z12 = bVar2 != null && bVar2.a() <= j10 && j10 < jA;
            boolean zW0 = w0((b) AbstractC6614a.i(this.f8787X));
            if (!z11 && !z12 && !zW0) {
                z10 = false;
            }
            this.f8785H = z10;
            if (z12 && !z11) {
                return;
            }
        }
        this.f8786I = this.f8787X;
        this.f8787X = null;
    }

    private boolean z0() throws C2907s {
        if (!A0()) {
            return false;
        }
        if (!this.f8789Z) {
            return true;
        }
        if (!r0((C6109x) AbstractC6614a.e(this.f8780C))) {
            throw R(new c("Provided decoder factory can't create decoder for format."), this.f8780C, 4005);
        }
        I2.b bVar = this.f8781D;
        if (bVar != null) {
            bVar.a();
        }
        this.f8781D = this.f8790s.a();
        this.f8789Z = false;
        return true;
    }

    protected boolean A0() {
        return true;
    }

    protected boolean C0(long j10, long j11, Bitmap bitmap, long j12) {
        long j13 = j12 - j10;
        if (!F0() && j13 >= HTTPTimeoutManager.DEFAULT_TIMEOUT_MS) {
            return false;
        }
        this.f8783F.onImageAvailable(j12 - this.f8795x.f8800b, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.O0
    public int b(C6109x c6109x) {
        return this.f8790s.b(c6109x);
    }

    @Override // androidx.media3.exoplayer.N0
    public boolean d() {
        return this.f8794w;
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void d0() {
        this.f8780C = null;
        this.f8795x = a.f8798c;
        this.f8792u.clear();
        D0();
        this.f8783F.a();
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void e0(boolean z10, boolean z11) {
        this.f8779B = z11 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.N0
    public void g(long j10, long j11) throws C2907s {
        if (this.f8794w) {
            return;
        }
        if (this.f8780C == null) {
            J jV = V();
            this.f8791t.m();
            int iO0 = o0(jV, this.f8791t, 2);
            if (iO0 != -5) {
                if (iO0 == -4) {
                    AbstractC6614a.g(this.f8791t.q());
                    this.f8793v = true;
                    this.f8794w = true;
                    return;
                }
                return;
            }
            this.f8780C = (C6109x) AbstractC6614a.i(jV.f142b);
            this.f8789Z = true;
        }
        if (this.f8781D != null || z0()) {
            try {
                P.a("drainAndFeedDecoder");
                while (t0(j10, j11)) {
                }
                while (u0(j10)) {
                }
                P.b();
            } catch (c e10) {
                throw R(e10, null, 4003);
            }
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void g0(long j10, boolean z10) {
        x0(1);
        this.f8794w = false;
        this.f8793v = false;
        this.f8784G = null;
        this.f8786I = null;
        this.f8787X = null;
        this.f8785H = false;
        this.f8782E = null;
        I2.b bVar = this.f8781D;
        if (bVar != null) {
            bVar.flush();
        }
        this.f8792u.clear();
    }

    @Override // androidx.media3.exoplayer.N0, androidx.media3.exoplayer.O0
    public String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void h0() {
        D0();
    }

    @Override // androidx.media3.exoplayer.N0
    public boolean isReady() {
        int i10 = this.f8779B;
        if (i10 != 3) {
            return i10 == 0 && this.f8785H;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void j0() {
        D0();
        x0(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.AbstractC2886h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m0(q2.C6109x[] r5, long r6, long r8, M2.D.b r10) {
        /*
            r4 = this;
            super.m0(r5, r6, r8, r10)
            r5 = r4
            I2.e$a r6 = r5.f8795x
            long r6 = r6.f8800b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L37
            java.util.ArrayDeque r6 = r5.f8792u
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2a
            long r6 = r5.f8797z
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            long r2 = r5.f8796y
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L2a
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L2a
            goto L37
        L2a:
            java.util.ArrayDeque r6 = r5.f8792u
            I2.e$a r7 = new I2.e$a
            long r0 = r5.f8797z
            r7.<init>(r0, r8)
            r6.add(r7)
            return
        L37:
            I2.e$a r6 = new I2.e$a
            r6.<init>(r0, r8)
            r5.f8795x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.e.m0(q2.x[], long, long, M2.D$b):void");
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h, androidx.media3.exoplayer.L0.b
    public void v(int i10, Object obj) {
        if (i10 != 15) {
            super.v(i10, obj);
        } else {
            E0(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }
}
