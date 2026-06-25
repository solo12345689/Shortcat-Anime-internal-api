package C2;

import A2.C1005c;
import C2.InterfaceC1176y;
import C2.InterfaceC1177z;
import J2.C1735o;
import J2.InterfaceC1737q;
import P9.AbstractC2011u;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.exoplayer.C2907s;
import androidx.media3.exoplayer.N0;
import androidx.media3.exoplayer.O0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import q2.AbstractC6079K;
import q2.C6083O;
import q2.C6088c;
import q2.C6092g;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6624k;
import t2.AbstractC6635w;
import t2.AbstractC6638z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class a0 extends J2.A implements A2.L {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private final Context f2689i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private final InterfaceC1176y.a f2690j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private final InterfaceC1177z f2691k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private final C1735o f2692l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private int f2693m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private boolean f2694n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private boolean f2695o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private C6109x f2696p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private C6109x f2697q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private long f2698r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private boolean f2699s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private boolean f2700t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private boolean f2701u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private int f2702v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private boolean f2703w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private long f2704x1;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public static void a(InterfaceC1177z interfaceC1177z, Object obj) {
            interfaceC1177z.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements InterfaceC1177z.d {
        private c() {
        }

        @Override // C2.InterfaceC1177z.d
        public void a(long j10) {
            a0.this.f2690j1.x(j10);
        }

        @Override // C2.InterfaceC1177z.d
        public void b() {
            a0.this.f2701u1 = true;
        }

        @Override // C2.InterfaceC1177z.d
        public void c(InterfaceC1177z.a aVar) {
            a0.this.f2690j1.r(aVar);
        }

        @Override // C2.InterfaceC1177z.d
        public void d(int i10) {
            if (Build.VERSION.SDK_INT >= 35 && a0.this.f2692l1 != null) {
                a0.this.f2692l1.e(i10);
            }
            a0.this.f2690j1.o(i10);
        }

        @Override // C2.InterfaceC1177z.d
        public void e(InterfaceC1177z.a aVar) {
            a0.this.f2690j1.q(aVar);
        }

        @Override // C2.InterfaceC1177z.d
        public void f(boolean z10) {
            a0.this.f2690j1.y(z10);
        }

        @Override // C2.InterfaceC1177z.d
        public void g(Exception exc) {
            AbstractC6635w.e("MediaCodecAudioRenderer", "Audio sink error", exc);
            a0.this.f2690j1.p(exc);
        }

        @Override // C2.InterfaceC1177z.d
        public void h() {
            N0.a aVarB1 = a0.this.b1();
            if (aVarB1 != null) {
                aVarB1.a();
            }
        }

        @Override // C2.InterfaceC1177z.d
        public void i(int i10, long j10, long j11) {
            a0.this.f2690j1.z(i10, j10, j11);
        }

        @Override // C2.InterfaceC1177z.d
        public void j() {
            a0.this.i0();
        }

        @Override // C2.InterfaceC1177z.d
        public void k() {
            a0.this.u2();
        }

        @Override // C2.InterfaceC1177z.d
        public void l() {
            N0.a aVarB1 = a0.this.b1();
            if (aVarB1 != null) {
                aVarB1.b();
            }
        }
    }

    public a0(Context context, InterfaceC1737q.b bVar, J2.E e10, boolean z10, Handler handler, InterfaceC1176y interfaceC1176y, InterfaceC1177z interfaceC1177z) {
        this(context, bVar, e10, z10, handler, interfaceC1176y, interfaceC1177z, Build.VERSION.SDK_INT >= 35 ? new C1735o() : null);
    }

    private static boolean m2(String str) {
        return false;
    }

    private static boolean n2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean o2() {
        return false;
    }

    private int p2(C6109x c6109x) {
        C1163k c1163kF = this.f2691k1.F(c6109x);
        if (!c1163kF.f2759a) {
            return 0;
        }
        int i10 = c1163kF.f2760b ? 1536 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        return c1163kF.f2761c ? i10 | 2048 : i10;
    }

    private int q2(J2.t tVar, C6109x c6109x) {
        "OMX.google.raw.decoder".equals(tVar.f9409a);
        return c6109x.f57023p;
    }

    private static List s2(J2.E e10, C6109x c6109x, boolean z10, InterfaceC1177z interfaceC1177z) {
        J2.t tVarP;
        return c6109x.f57022o == null ? AbstractC2011u.A() : (!interfaceC1177z.b(c6109x) || (tVarP = J2.N.p()) == null) ? J2.N.m(e10, c6109x, z10, false) : AbstractC2011u.B(tVarP);
    }

    private void v2(int i10) {
        C1735o c1735o;
        this.f2691k1.y(i10);
        if (Build.VERSION.SDK_INT < 35 || (c1735o = this.f2692l1) == null) {
            return;
        }
        c1735o.e(i10);
    }

    private void w2() {
        InterfaceC1737q interfaceC1737qN0 = N0();
        if (interfaceC1737qN0 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f2702v1));
            interfaceC1737qN0.d(bundle);
        }
    }

    private void x2() {
        long jL = this.f2691k1.L(d());
        if (jL != Long.MIN_VALUE) {
            if (!this.f2699s1) {
                jL = Math.max(this.f2698r1, jL);
            }
            this.f2698r1 = jL;
            this.f2699s1 = false;
        }
    }

    @Override // J2.A
    protected boolean B1(long j10, long j11, InterfaceC1737q interfaceC1737q, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C6109x c6109x) throws C2907s {
        AbstractC6614a.e(byteBuffer);
        this.f2704x1 = -9223372036854775807L;
        if (this.f2697q1 != null && (i11 & 2) != 0) {
            ((InterfaceC1737q) AbstractC6614a.e(interfaceC1737q)).p(i10, false);
            return true;
        }
        if (z10) {
            if (interfaceC1737q != null) {
                interfaceC1737q.p(i10, false);
            }
            this.f9284Z0.f186f += i12;
            this.f2691k1.N();
            return true;
        }
        try {
            if (!this.f2691k1.G(byteBuffer, j12, i12)) {
                this.f2704x1 = j12;
                return false;
            }
            if (interfaceC1737q != null) {
                interfaceC1737q.p(i10, false);
            }
            this.f9284Z0.f185e += i12;
            return true;
        } catch (InterfaceC1177z.c e10) {
            throw S(e10, this.f2696p1, e10.f2806b, (!j1() || U().f148a == 0) ? 5001 : 5004);
        } catch (InterfaceC1177z.f e11) {
            throw S(e11, c6109x, e11.f2811b, (!j1() || U().f148a == 0) ? 5002 : 5003);
        }
    }

    @Override // J2.A
    protected void G1() throws C2907s {
        try {
            this.f2691k1.I();
            if (W0() != -9223372036854775807L) {
                this.f2704x1 = W0();
            }
        } catch (InterfaceC1177z.f e10) {
            throw S(e10, e10.f2812c, e10.f2811b, j1() ? 5003 : 5002);
        }
    }

    @Override // A2.L
    public long I() {
        if (getState() == 2) {
            x2();
        }
        return this.f2698r1;
    }

    @Override // J2.A
    protected float S0(float f10, C6109x c6109x, C6109x[] c6109xArr) {
        int iMax = -1;
        for (C6109x c6109x2 : c6109xArr) {
            int i10 = c6109x2.f56998H;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // J2.A
    protected List U0(J2.E e10, C6109x c6109x, boolean z10) {
        return J2.N.n(s2(e10, c6109x, z10, this.f2691k1), c6109x);
    }

    @Override // J2.A
    protected long V0(long j10, long j11, boolean z10) {
        boolean z11 = this.f2704x1 != -9223372036854775807L;
        if (!this.f2703w1) {
            return (z11 || super.d()) ? 1000000L : 10000L;
        }
        long jZ = this.f2691k1.z();
        if (!z11 || jZ == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(jZ, this.f2704x1 - j10) / (c() != null ? c().f56601a : 1.0f)) / 2.0f)) - (t2.a0.V0(T().c()) - j11));
    }

    @Override // J2.A
    protected InterfaceC1737q.a X0(J2.t tVar, C6109x c6109x, MediaCrypto mediaCrypto, float f10) {
        this.f2693m1 = r2(tVar, c6109x, Z());
        this.f2694n1 = m2(tVar.f9409a);
        this.f2695o1 = n2(tVar.f9409a);
        MediaFormat mediaFormatT2 = t2(c6109x, tVar.f9411c, this.f2693m1, f10);
        this.f2697q1 = (!"audio/raw".equals(tVar.f9410b) || "audio/raw".equals(c6109x.f57022o)) ? null : c6109x;
        return InterfaceC1737q.a.a(tVar, mediaFormatT2, c6109x, mediaCrypto, this.f2692l1);
    }

    @Override // J2.A
    protected boolean Z1(C6109x c6109x) {
        if (U().f148a != 0) {
            int iP2 = p2(c6109x);
            if ((iP2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                if (U().f148a == 2 || (iP2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                    return true;
                }
                if (c6109x.f57000J == 0 && c6109x.f57001K == 0) {
                    return true;
                }
            }
        }
        return this.f2691k1.b(c6109x);
    }

    @Override // J2.A
    protected int a2(J2.E e10, C6109x c6109x) {
        int iP2;
        boolean z10;
        if (!AbstractC6079K.o(c6109x.f57022o)) {
            return O0.t(0);
        }
        boolean z11 = true;
        boolean z12 = c6109x.f57006P != 0;
        boolean zB2 = J2.A.b2(c6109x);
        int i10 = 8;
        if (!zB2 || (z12 && J2.N.p() == null)) {
            iP2 = 0;
        } else {
            iP2 = p2(c6109x);
            if (this.f2691k1.b(c6109x)) {
                return O0.q(4, 8, 32, iP2);
            }
        }
        if ("audio/raw".equals(c6109x.f57022o) && !this.f2691k1.b(c6109x)) {
            return O0.t(1);
        }
        if (!this.f2691k1.b(t2.a0.n0(2, c6109x.f56997G, c6109x.f56998H))) {
            return O0.t(1);
        }
        List listS2 = s2(e10, c6109x, false, this.f2691k1);
        if (listS2.isEmpty()) {
            return O0.t(1);
        }
        if (!zB2) {
            return O0.t(2);
        }
        J2.t tVar = (J2.t) listS2.get(0);
        boolean zP = tVar.p(c6109x);
        if (zP) {
            z10 = true;
            z11 = zP;
        } else {
            for (int i11 = 1; i11 < listS2.size(); i11++) {
                J2.t tVar2 = (J2.t) listS2.get(i11);
                if (tVar2.p(c6109x)) {
                    z10 = false;
                    tVar = tVar2;
                    break;
                }
            }
            z10 = true;
            z11 = zP;
        }
        int i12 = z11 ? 4 : 3;
        if (z11 && tVar.s(c6109x)) {
            i10 = 16;
        }
        return O0.C(i12, i10, 32, tVar.f9416h ? 64 : 0, z10 ? 128 : 0, iP2);
    }

    @Override // A2.L
    public C6083O c() {
        return this.f2691k1.c();
    }

    @Override // J2.A
    protected void c1(z2.f fVar) {
        C6109x c6109x;
        if (Build.VERSION.SDK_INT < 29 || (c6109x = fVar.f65553b) == null || !Objects.equals(c6109x.f57022o, "audio/opus") || !j1()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC6614a.e(fVar.f65558g);
        int i10 = ((C6109x) AbstractC6614a.e(fVar.f65553b)).f57000J;
        if (byteBuffer.remaining() == 8) {
            this.f2691k1.J(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // J2.A, androidx.media3.exoplayer.N0
    public boolean d() {
        return super.d() && this.f2691k1.d();
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void d0() {
        this.f2700t1 = true;
        this.f2696p1 = null;
        this.f2704x1 = -9223372036854775807L;
        try {
            this.f2691k1.flush();
            try {
                super.d0();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.d0();
                throw th2;
            } finally {
            }
        }
    }

    @Override // A2.L
    public void e(C6083O c6083o) {
        this.f2691k1.e(c6083o);
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void e0(boolean z10, boolean z11) {
        super.e0(z10, z11);
        this.f2690j1.v(this.f9284Z0);
        if (U().f149b) {
            this.f2691k1.O();
        } else {
            this.f2691k1.C();
        }
        this.f2691k1.Q(Y());
        this.f2691k1.H(T());
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void g0(long j10, boolean z10) throws C2907s {
        super.g0(j10, z10);
        this.f2691k1.flush();
        this.f2698r1 = j10;
        this.f2704x1 = -9223372036854775807L;
        this.f2701u1 = false;
        this.f2699s1 = true;
    }

    @Override // androidx.media3.exoplayer.N0, androidx.media3.exoplayer.O0
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void h0() {
        C1735o c1735o;
        this.f2691k1.a();
        if (Build.VERSION.SDK_INT < 35 || (c1735o = this.f2692l1) == null) {
            return;
        }
        c1735o.c();
    }

    @Override // J2.A, androidx.media3.exoplayer.N0
    public boolean isReady() {
        return this.f2691k1.x() || super.isReady();
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void j0() {
        this.f2701u1 = false;
        this.f2704x1 = -9223372036854775807L;
        try {
            super.j0();
        } finally {
            if (this.f2700t1) {
                this.f2700t1 = false;
                this.f2691k1.reset();
            }
        }
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void k0() {
        super.k0();
        this.f2691k1.u();
        this.f2703w1 = true;
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h
    protected void l0() {
        x2();
        this.f2703w1 = false;
        this.f2691k1.pause();
        super.l0();
    }

    @Override // J2.A
    protected void q1(Exception exc) {
        AbstractC6635w.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f2690j1.n(exc);
    }

    @Override // J2.A
    protected void r1(String str, InterfaceC1737q.a aVar, long j10, long j11) {
        this.f2690j1.s(str, j10, j11);
    }

    protected int r2(J2.t tVar, C6109x c6109x, C6109x[] c6109xArr) {
        int iQ2 = q2(tVar, c6109x);
        if (c6109xArr.length == 1) {
            return iQ2;
        }
        for (C6109x c6109x2 : c6109xArr) {
            if (tVar.e(c6109x, c6109x2).f196d != 0) {
                iQ2 = Math.max(iQ2, q2(tVar, c6109x2));
            }
        }
        return iQ2;
    }

    @Override // J2.A
    protected void s1(String str) {
        this.f2690j1.t(str);
    }

    @Override // J2.A
    protected C1005c t1(A2.J j10) throws C2907s {
        C6109x c6109x = (C6109x) AbstractC6614a.e(j10.f142b);
        this.f2696p1 = c6109x;
        C1005c c1005cT1 = super.t1(j10);
        this.f2690j1.w(c6109x, c1005cT1);
        return c1005cT1;
    }

    protected MediaFormat t2(C6109x c6109x, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c6109x.f56997G);
        mediaFormat.setInteger("sample-rate", c6109x.f56998H);
        AbstractC6638z.e(mediaFormat, c6109x.f57025r);
        AbstractC6638z.d(mediaFormat, "max-input-size", i10);
        int i11 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f && !o2()) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if ("audio/ac4".equals(c6109x.f57022o)) {
            Pair pairR = AbstractC6624k.r(c6109x);
            if (pairR != null) {
                AbstractC6638z.d(mediaFormat, "profile", ((Integer) pairR.first).intValue());
                AbstractC6638z.d(mediaFormat, "level", ((Integer) pairR.second).intValue());
            }
            if (i11 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.f2691k1.D(t2.a0.n0(4, c6109x.f56997G, c6109x.f56998H)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f2702v1));
        }
        return mediaFormat;
    }

    @Override // A2.L
    public boolean u() {
        boolean z10 = this.f2701u1;
        this.f2701u1 = false;
        return z10;
    }

    @Override // J2.A
    protected C1005c u0(J2.t tVar, C6109x c6109x, C6109x c6109x2) {
        C1005c c1005cE = tVar.e(c6109x, c6109x2);
        int i10 = c1005cE.f197e;
        if (k1(c6109x2)) {
            i10 |= 32768;
        }
        if (q2(tVar, c6109x2) > this.f2693m1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C1005c(tVar.f9409a, c6109x, c6109x2, i11 != 0 ? 0 : c1005cE.f196d, i11);
    }

    @Override // J2.A
    protected void u1(C6109x c6109x, MediaFormat mediaFormat) throws C2907s {
        int i10;
        C6109x c6109x2 = this.f2697q1;
        int[] iArrA = null;
        if (c6109x2 != null) {
            c6109x = c6109x2;
        } else if (N0() != null) {
            AbstractC6614a.e(mediaFormat);
            C6109x c6109xP = new C6109x.b().y0("audio/raw").s0("audio/raw".equals(c6109x.f57022o) ? c6109x.f56999I : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? t2.a0.l0(mediaFormat.getInteger("v-bits-per-sample")) : 2).d0(c6109x.f57000J).e0(c6109x.f57001K).r0(c6109x.f57019l).Z(c6109x.f57020m).j0(c6109x.f57008a).l0(c6109x.f57009b).m0(c6109x.f57010c).n0(c6109x.f57011d).A0(c6109x.f57012e).w0(c6109x.f57013f).T(mediaFormat.getInteger("channel-count")).z0(mediaFormat.getInteger("sample-rate")).P();
            if (this.f2694n1 && c6109xP.f56997G == 6 && (i10 = c6109x.f56997G) < 6) {
                iArrA = new int[i10];
                for (int i11 = 0; i11 < c6109x.f56997G; i11++) {
                    iArrA[i11] = i11;
                }
            } else if (this.f2695o1) {
                iArrA = U2.S.a(c6109xP.f56997G);
            }
            c6109x = c6109xP;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!j1() || U().f148a == 0) {
                    this.f2691k1.B(0);
                } else {
                    this.f2691k1.B(U().f148a);
                }
            }
            this.f2691k1.K(c6109x, 0, iArrA);
        } catch (InterfaceC1177z.b e10) {
            throw R(e10, e10.f2804a, 5001);
        }
    }

    protected void u2() {
        this.f2699s1 = true;
    }

    @Override // J2.A, androidx.media3.exoplayer.AbstractC2886h, androidx.media3.exoplayer.L0.b
    public void v(int i10, Object obj) {
        if (i10 == 2) {
            this.f2691k1.w(((Float) AbstractC6614a.e(obj)).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f2691k1.P((C6088c) AbstractC6614a.e((C6088c) obj));
            return;
        }
        if (i10 == 6) {
            this.f2691k1.A((C6092g) AbstractC6614a.e((C6092g) obj));
            return;
        }
        if (i10 == 12) {
            b.a(this.f2691k1, obj);
            return;
        }
        if (i10 == 16) {
            this.f2702v1 = ((Integer) AbstractC6614a.e(obj)).intValue();
            w2();
        } else if (i10 == 9) {
            this.f2691k1.R(((Boolean) AbstractC6614a.e(obj)).booleanValue());
        } else if (i10 != 10) {
            super.v(i10, obj);
        } else {
            v2(((Integer) AbstractC6614a.e(obj)).intValue());
        }
    }

    @Override // J2.A
    protected void v1(long j10) {
        this.f2691k1.M(j10);
    }

    @Override // J2.A
    protected void x1() {
        super.x1();
        this.f2691k1.N();
    }

    public a0(Context context, InterfaceC1737q.b bVar, J2.E e10, boolean z10, Handler handler, InterfaceC1176y interfaceC1176y, InterfaceC1177z interfaceC1177z, C1735o c1735o) {
        super(1, bVar, e10, z10, 44100.0f);
        this.f2689i1 = context.getApplicationContext();
        this.f2691k1 = interfaceC1177z;
        this.f2692l1 = c1735o;
        this.f2702v1 = -1000;
        this.f2690j1 = new InterfaceC1176y.a(handler, interfaceC1176y);
        this.f2704x1 = -9223372036854775807L;
        interfaceC1177z.E(new c());
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h, androidx.media3.exoplayer.N0
    public A2.L P() {
        return this;
    }
}
