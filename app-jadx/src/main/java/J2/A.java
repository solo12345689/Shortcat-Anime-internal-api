package J2;

import A2.C1004b;
import A2.C1005c;
import B2.K1;
import C2.b0;
import F2.InterfaceC1558m;
import J2.InterfaceC1737q;
import J2.N;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.exoplayer.AbstractC2886h;
import androidx.media3.exoplayer.C2907s;
import androidx.media3.exoplayer.N0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import q2.AbstractC6096k;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;
import z2.InterfaceC7277b;
import z2.f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class A extends AbstractC2886h {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static final byte[] f9246h1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final MediaCodec.BufferInfo f9247A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private long f9248A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final ArrayDeque f9249B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private boolean f9250B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final b0 f9251C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private long f9252C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private C6109x f9253D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private int f9254D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private C6109x f9255E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f9256E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private InterfaceC1558m f9257F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private ByteBuffer f9258F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private InterfaceC1558m f9259G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private boolean f9260G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private N0.a f9261H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private boolean f9262H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private MediaCrypto f9263I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private boolean f9264I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private boolean f9265J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private boolean f9266K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private boolean f9267L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f9268M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f9269N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private int f9270O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private boolean f9271P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private boolean f9272Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private boolean f9273R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private long f9274S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private long f9275T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private boolean f9276U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private boolean f9277V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private boolean f9278W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private long f9279X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private boolean f9280X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private float f9281Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private C2907s f9282Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f9283Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    protected C1004b f9284Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private e f9285a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private long f9286b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private boolean f9287c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private boolean f9288d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private boolean f9289e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private long f9290f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private long f9291g1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private InterfaceC1737q f9292l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private C6109x f9293m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private MediaFormat f9294n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f9295o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f9296p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private ArrayDeque f9297q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private c f9298r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC1737q.b f9299s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private t f9300s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final E f9301t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f9302t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f9303u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f9304u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final float f9305v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f9306v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final z2.f f9307w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f9308w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final z2.f f9309x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f9310x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final z2.f f9311y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f9312y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final C1729i f9313z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f9314z0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public static void a(InterfaceC1737q.a aVar, K1 k12) {
            LogSessionId logSessionIdA = k12.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f9400b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class d implements InterfaceC1737q.c {
        private d() {
        }

        @Override // J2.InterfaceC1737q.c
        public void a() {
            if (A.this.f9261H != null) {
                A.this.f9261H.b();
            }
        }

        @Override // J2.InterfaceC1737q.c
        public void b() {
            if (A.this.f9261H != null) {
                A.this.f9261H.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f9321e = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t2.N f9325d = new t2.N();

        public e(long j10, long j11, long j12) {
            this.f9322a = j10;
            this.f9323b = j11;
            this.f9324c = j12;
        }
    }

    public A(int i10, InterfaceC1737q.b bVar, E e10, boolean z10, float f10) {
        super(i10);
        this.f9299s = bVar;
        this.f9301t = (E) AbstractC6614a.e(e10);
        this.f9303u = z10;
        this.f9305v = f10;
        this.f9307w = z2.f.A();
        this.f9309x = new z2.f(0);
        this.f9311y = new z2.f(2);
        C1729i c1729i = new C1729i();
        this.f9313z = c1729i;
        this.f9247A = new MediaCodec.BufferInfo();
        this.f9281Y = 1.0f;
        this.f9283Z = 1.0f;
        this.f9279X = -9223372036854775807L;
        this.f9249B = new ArrayDeque();
        this.f9285a1 = e.f9321e;
        c1729i.x(0);
        c1729i.f65555d.order(ByteOrder.nativeOrder());
        this.f9251C = new b0();
        this.f9296p0 = -1.0f;
        this.f9302t0 = 0;
        this.f9268M0 = 0;
        this.f9254D0 = -1;
        this.f9256E0 = -1;
        this.f9252C0 = -9223372036854775807L;
        this.f9274S0 = -9223372036854775807L;
        this.f9275T0 = -9223372036854775807L;
        this.f9286b1 = -9223372036854775807L;
        this.f9248A0 = -9223372036854775807L;
        this.f9269N0 = 0;
        this.f9270O0 = 0;
        this.f9284Z0 = new C1004b();
        this.f9290f1 = -9223372036854775807L;
        this.f9291g1 = -9223372036854775807L;
    }

    private void A1() throws C2907s {
        int i10 = this.f9270O0;
        if (i10 == 1) {
            J0();
            return;
        }
        if (i10 == 2) {
            J0();
            e2();
        } else if (i10 == 3) {
            E1();
        } else {
            this.f9277V0 = true;
            G1();
        }
    }

    private void B0() {
        this.f9264I0 = false;
        H1();
    }

    private boolean C0() {
        if (this.f9271P0) {
            this.f9269N0 = 1;
            if (this.f9306v0) {
                this.f9270O0 = 3;
                return false;
            }
            this.f9270O0 = 1;
        }
        return true;
    }

    private void C1() {
        this.f9273R0 = true;
        MediaFormat mediaFormatE = ((InterfaceC1737q) AbstractC6614a.e(this.f9292l0)).e();
        if (this.f9302t0 != 0 && mediaFormatE.getInteger("width") == 32 && mediaFormatE.getInteger("height") == 32) {
            this.f9312y0 = true;
        } else {
            this.f9294n0 = mediaFormatE;
            this.f9295o0 = true;
        }
    }

    private void D0() throws C2907s {
        if (!this.f9271P0) {
            E1();
        } else {
            this.f9269N0 = 1;
            this.f9270O0 = 3;
        }
    }

    private boolean D1(int i10) throws C2907s {
        A2.J jV = V();
        this.f9307w.m();
        int iO0 = o0(jV, this.f9307w, i10 | 4);
        if (iO0 == -5) {
            t1(jV);
            return true;
        }
        if (iO0 != -4 || !this.f9307w.q()) {
            return false;
        }
        this.f9276U0 = true;
        A1();
        return false;
    }

    private boolean E0() throws C2907s {
        if (this.f9271P0) {
            this.f9269N0 = 1;
            if (this.f9306v0) {
                this.f9270O0 = 3;
                return false;
            }
            this.f9270O0 = 2;
        } else {
            e2();
        }
        return true;
    }

    private void E1() throws C2907s {
        F1();
        n1();
    }

    private boolean F0(long j10, long j11) throws C2907s {
        boolean z10;
        boolean zB1;
        int iO;
        InterfaceC1737q interfaceC1737q = (InterfaceC1737q) AbstractC6614a.e(this.f9292l0);
        if (!d1()) {
            if (this.f9308w0 && this.f9272Q0) {
                try {
                    iO = interfaceC1737q.o(this.f9247A);
                } catch (IllegalStateException unused) {
                    A1();
                    if (this.f9277V0) {
                        F1();
                    }
                    return false;
                }
            } else {
                iO = interfaceC1737q.o(this.f9247A);
            }
            if (iO < 0) {
                if (iO == -2) {
                    C1();
                    return true;
                }
                if (this.f9314z0 && (this.f9276U0 || this.f9269N0 == 2)) {
                    A1();
                }
                long j12 = this.f9248A0;
                if (j12 != -9223372036854775807L && j12 + 100 < T().a()) {
                    A1();
                }
                return false;
            }
            if (this.f9312y0) {
                this.f9312y0 = false;
                interfaceC1737q.p(iO, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f9247A;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                A1();
                return false;
            }
            this.f9256E0 = iO;
            ByteBuffer byteBufferQ = interfaceC1737q.q(iO);
            this.f9258F0 = byteBufferQ;
            if (byteBufferQ != null) {
                byteBufferQ.position(this.f9247A.offset);
                ByteBuffer byteBuffer = this.f9258F0;
                MediaCodec.BufferInfo bufferInfo2 = this.f9247A;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            f2(this.f9247A.presentationTimeUs);
        }
        this.f9260G0 = this.f9247A.presentationTimeUs < X();
        long j13 = this.f9275T0;
        this.f9262H0 = j13 != -9223372036854775807L && j13 <= this.f9247A.presentationTimeUs;
        if (this.f9289e1) {
            long j14 = this.f9290f1;
            if (j14 == -9223372036854775807L || this.f9247A.presentationTimeUs > j14) {
                this.f9290f1 = this.f9247A.presentationTimeUs;
                this.f9260G0 = true;
                this.f9262H0 = false;
            } else {
                this.f9289e1 = false;
                this.f9290f1 = -9223372036854775807L;
            }
        }
        if (this.f9308w0 && this.f9272Q0) {
            try {
                ByteBuffer byteBuffer2 = this.f9258F0;
                int i10 = this.f9256E0;
                MediaCodec.BufferInfo bufferInfo3 = this.f9247A;
                z10 = false;
                try {
                    zB1 = B1(j10, j11, interfaceC1737q, byteBuffer2, i10, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.f9260G0, this.f9262H0, (C6109x) AbstractC6614a.e(this.f9255E));
                } catch (IllegalStateException unused2) {
                    A1();
                    if (this.f9277V0) {
                        F1();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            ByteBuffer byteBuffer3 = this.f9258F0;
            int i11 = this.f9256E0;
            MediaCodec.BufferInfo bufferInfo4 = this.f9247A;
            zB1 = B1(j10, j11, interfaceC1737q, byteBuffer3, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f9260G0, this.f9262H0, (C6109x) AbstractC6614a.e(this.f9255E));
        }
        if (zB1) {
            w1(this.f9247A.presentationTimeUs);
            boolean z11 = (this.f9247A.flags & 4) != 0 ? true : z10;
            if (!z11 && this.f9272Q0 && this.f9262H0) {
                this.f9248A0 = T().a();
            }
            M1();
            if (!z11) {
                return true;
            }
            A1();
        }
        return z10;
    }

    private boolean G0(t tVar, C6109x c6109x, InterfaceC1558m interfaceC1558m, InterfaceC1558m interfaceC1558m2) {
        InterfaceC7277b interfaceC7277bD;
        InterfaceC7277b interfaceC7277bD2;
        if (interfaceC1558m == interfaceC1558m2) {
            return false;
        }
        if (interfaceC1558m2 != null && interfaceC1558m != null && (interfaceC7277bD = interfaceC1558m2.d()) != null && (interfaceC7277bD2 = interfaceC1558m.d()) != null && interfaceC7277bD.getClass().equals(interfaceC7277bD2.getClass())) {
            if (!(interfaceC7277bD instanceof F2.B)) {
                return false;
            }
            if (!interfaceC1558m2.a().equals(interfaceC1558m.a())) {
                return true;
            }
            UUID uuid = AbstractC6096k.f56897e;
            if (!uuid.equals(interfaceC1558m.a()) && !uuid.equals(interfaceC1558m2.a())) {
                return !tVar.f9415g && (interfaceC1558m2.getState() == 2 || ((interfaceC1558m2.getState() == 3 || interfaceC1558m2.getState() == 4) && interfaceC1558m2.i((String) AbstractC6614a.e(c6109x.f57022o))));
            }
        }
        return true;
    }

    private void H1() {
        K1();
        this.f9266K0 = false;
        this.f9313z.m();
        this.f9311y.m();
        this.f9265J0 = false;
        this.f9251C.d();
    }

    private boolean I0() throws C2907s {
        int i10;
        if (this.f9292l0 == null || (i10 = this.f9269N0) == 2 || this.f9276U0) {
            return false;
        }
        if (i10 == 0 && W1()) {
            D0();
        }
        InterfaceC1737q interfaceC1737q = (InterfaceC1737q) AbstractC6614a.e(this.f9292l0);
        if (this.f9254D0 < 0) {
            int iM = interfaceC1737q.m();
            this.f9254D0 = iM;
            if (iM < 0) {
                return false;
            }
            this.f9309x.f65555d = interfaceC1737q.i(iM);
            this.f9309x.m();
        }
        if (this.f9269N0 == 1) {
            if (!this.f9314z0) {
                this.f9272Q0 = true;
                interfaceC1737q.c(this.f9254D0, 0, 0, 0L, 4);
                L1();
            }
            this.f9269N0 = 2;
            return false;
        }
        if (this.f9310x0) {
            this.f9310x0 = false;
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC6614a.e(this.f9309x.f65555d);
            byte[] bArr = f9246h1;
            byteBuffer.put(bArr);
            interfaceC1737q.c(this.f9254D0, 0, bArr.length, 0L, 0);
            L1();
            this.f9271P0 = true;
            return true;
        }
        if (this.f9268M0 == 1) {
            for (int i11 = 0; i11 < ((C6109x) AbstractC6614a.e(this.f9293m0)).f57025r.size(); i11++) {
                ((ByteBuffer) AbstractC6614a.e(this.f9309x.f65555d)).put((byte[]) this.f9293m0.f57025r.get(i11));
            }
            this.f9268M0 = 2;
        }
        int iPosition = ((ByteBuffer) AbstractC6614a.e(this.f9309x.f65555d)).position();
        A2.J jV = V();
        try {
            int iO0 = o0(jV, this.f9309x, 0);
            if (iO0 == -3) {
                if (i()) {
                    this.f9275T0 = this.f9274S0;
                }
                return false;
            }
            if (iO0 == -5) {
                if (this.f9268M0 == 2) {
                    this.f9309x.m();
                    this.f9268M0 = 1;
                }
                t1(jV);
                return true;
            }
            if (this.f9309x.q()) {
                this.f9275T0 = this.f9274S0;
                if (this.f9268M0 == 2) {
                    this.f9309x.m();
                    this.f9268M0 = 1;
                }
                this.f9276U0 = true;
                if (!this.f9271P0) {
                    A1();
                    return false;
                }
                if (!this.f9314z0) {
                    this.f9272Q0 = true;
                    interfaceC1737q.c(this.f9254D0, 0, 0, 0L, 4);
                    L1();
                }
                return false;
            }
            if (!this.f9271P0 && !this.f9309x.s()) {
                this.f9309x.m();
                if (this.f9268M0 == 2) {
                    this.f9268M0 = 1;
                }
                return true;
            }
            if (T1(this.f9309x)) {
                return true;
            }
            boolean z10 = this.f9309x.z();
            if (z10) {
                this.f9309x.f65554c.b(iPosition);
            }
            long j10 = this.f9309x.f65557f;
            if (this.f9278W0) {
                if (this.f9249B.isEmpty()) {
                    this.f9285a1.f9325d.a(j10, (C6109x) AbstractC6614a.e(this.f9253D));
                } else {
                    ((e) this.f9249B.peekLast()).f9325d.a(j10, (C6109x) AbstractC6614a.e(this.f9253D));
                }
                this.f9278W0 = false;
            }
            this.f9274S0 = Math.max(this.f9274S0, j10);
            if (i() || this.f9309x.t()) {
                this.f9275T0 = this.f9274S0;
            }
            this.f9309x.y();
            if (this.f9309x.p()) {
                c1(this.f9309x);
            }
            y1(this.f9309x);
            int iO02 = O0(this.f9309x);
            if ((Build.VERSION.SDK_INT < 34 || (iO02 & 32) == 0) && !U().f149b) {
                this.f9291g1 = Math.max(this.f9291g1, this.f9309x.f65557f);
            }
            if (z10) {
                ((InterfaceC1737q) AbstractC6614a.e(interfaceC1737q)).b(this.f9254D0, 0, this.f9309x.f65554c, j10, iO02);
            } else {
                ((InterfaceC1737q) AbstractC6614a.e(interfaceC1737q)).c(this.f9254D0, 0, ((ByteBuffer) AbstractC6614a.e(this.f9309x.f65555d)).limit(), j10, iO02);
            }
            L1();
            this.f9271P0 = true;
            this.f9268M0 = 0;
            this.f9284Z0.f183c++;
            return true;
        } catch (f.a e10) {
            q1(e10);
            D1(0);
            J0();
            return true;
        }
    }

    private void J0() {
        try {
            ((InterfaceC1737q) AbstractC6614a.i(this.f9292l0)).flush();
        } finally {
            I1();
        }
    }

    private void K1() {
        this.f9274S0 = -9223372036854775807L;
        this.f9275T0 = -9223372036854775807L;
        this.f9286b1 = -9223372036854775807L;
    }

    private boolean L0() {
        if (this.f9292l0 == null) {
            return false;
        }
        if (X1()) {
            F1();
            return true;
        }
        if (U1()) {
            J0();
        } else {
            z1();
        }
        return false;
    }

    private void L1() {
        this.f9254D0 = -1;
        this.f9309x.f65555d = null;
    }

    private List M0(boolean z10) {
        C6109x c6109x = (C6109x) AbstractC6614a.e(this.f9253D);
        List listU0 = U0(this.f9301t, c6109x, z10);
        if (!listU0.isEmpty() || !z10) {
            return listU0;
        }
        List listU02 = U0(this.f9301t, c6109x, false);
        if (!listU02.isEmpty()) {
            AbstractC6635w.i("MediaCodecRenderer", "Drm session requires secure decoder for " + c6109x.f57022o + ", but no secure decoder available. Trying to proceed with " + listU02 + ".");
        }
        return listU02;
    }

    private void M1() {
        this.f9256E0 = -1;
        this.f9258F0 = null;
    }

    private void N1(InterfaceC1558m interfaceC1558m) {
        InterfaceC1558m.e(this.f9257F, interfaceC1558m);
        this.f9257F = interfaceC1558m;
    }

    private void O1(e eVar) {
        this.f9285a1 = eVar;
        long j10 = eVar.f9324c;
        if (j10 != -9223372036854775807L) {
            this.f9287c1 = true;
            v1(j10);
        }
    }

    private void R1(InterfaceC1558m interfaceC1558m) {
        InterfaceC1558m.e(this.f9259G, interfaceC1558m);
        this.f9259G = interfaceC1558m;
    }

    private boolean S1(long j10) {
        return this.f9279X == -9223372036854775807L || T().c() - j10 < this.f9279X;
    }

    protected static boolean b2(C6109x c6109x) {
        int i10 = c6109x.f57006P;
        return i10 == 0 || i10 == 2;
    }

    private boolean d1() {
        return this.f9256E0 >= 0;
    }

    private boolean d2(C6109x c6109x) throws C2907s {
        if (this.f9292l0 != null && this.f9270O0 != 3 && getState() != 0) {
            float fS0 = S0(this.f9283Z, (C6109x) AbstractC6614a.e(c6109x), Z());
            float f10 = this.f9296p0;
            if (f10 == fS0) {
                return true;
            }
            if (fS0 == -1.0f) {
                D0();
                return false;
            }
            if (f10 == -1.0f && fS0 <= this.f9305v) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fS0);
            ((InterfaceC1737q) AbstractC6614a.e(this.f9292l0)).d(bundle);
            this.f9296p0 = fS0;
        }
        return true;
    }

    private void e2() throws C2907s {
        InterfaceC7277b interfaceC7277bD = ((InterfaceC1558m) AbstractC6614a.e(this.f9259G)).d();
        if (interfaceC7277bD instanceof F2.B) {
            try {
                ((MediaCrypto) AbstractC6614a.e(this.f9263I)).setMediaDrmSession(((F2.B) interfaceC7277bD).f6149b);
            } catch (MediaCryptoException e10) {
                throw R(e10, this.f9253D, 6006);
            }
        }
        N1(this.f9259G);
        this.f9269N0 = 0;
        this.f9270O0 = 0;
    }

    private boolean f1() {
        if (!this.f9313z.H()) {
            return true;
        }
        long jX = X();
        return l1(jX, this.f9313z.F()) == l1(jX, this.f9311y.f65557f);
    }

    private void g1(C6109x c6109x) {
        B0();
        String str = c6109x.f57022o;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f9313z.I(32);
        } else {
            this.f9313z.I(1);
        }
        this.f9264I0 = true;
    }

    private void h1(t tVar, MediaCrypto mediaCrypto) {
        this.f9300s0 = tVar;
        C6109x c6109x = (C6109x) AbstractC6614a.e(this.f9253D);
        String str = tVar.f9409a;
        int i10 = Build.VERSION.SDK_INT;
        float fS0 = S0(this.f9283Z, c6109x, Z());
        if (fS0 <= this.f9305v) {
            fS0 = -1.0f;
        }
        long jC = T().c();
        InterfaceC1737q.a aVarX0 = X0(tVar, c6109x, mediaCrypto, fS0);
        if (i10 >= 31) {
            b.a(aVarX0, Y());
        }
        try {
            t2.P.a("createCodec:" + str);
            InterfaceC1737q interfaceC1737qB = this.f9299s.b(aVarX0);
            this.f9292l0 = interfaceC1737qB;
            this.f9250B0 = interfaceC1737qB.n(new d());
            t2.P.b();
            long jC2 = T().c();
            if (!tVar.p(c6109x)) {
                AbstractC6635w.i("MediaCodecRenderer", a0.I("Format exceeds selected codec's capabilities [%s, %s]", C6109x.l(c6109x), str));
            }
            this.f9296p0 = fS0;
            this.f9293m0 = c6109x;
            this.f9302t0 = v0(str);
            this.f9304u0 = z0(str);
            this.f9306v0 = w0(str);
            this.f9308w0 = x0(str);
            this.f9314z0 = y0(tVar) || R0();
            if (((InterfaceC1737q) AbstractC6614a.e(this.f9292l0)).k()) {
                this.f9267L0 = true;
                this.f9268M0 = 1;
                this.f9310x0 = this.f9302t0 != 0;
            }
            if (getState() == 2) {
                this.f9252C0 = T().c() + 1000;
            }
            this.f9284Z0.f181a++;
            r1(str, aVarX0, jC2, jC2 - jC);
        } catch (Throwable th2) {
            t2.P.b();
            throw th2;
        }
    }

    private boolean i1() throws C2907s {
        AbstractC6614a.g(this.f9263I == null);
        InterfaceC1558m interfaceC1558m = this.f9257F;
        InterfaceC7277b interfaceC7277bD = interfaceC1558m.d();
        if (F2.B.f6147d && (interfaceC7277bD instanceof F2.B)) {
            int state = interfaceC1558m.getState();
            if (state == 1) {
                InterfaceC1558m.a aVar = (InterfaceC1558m.a) AbstractC6614a.e(interfaceC1558m.c());
                throw R(aVar, this.f9253D, aVar.f6253a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (interfaceC7277bD == null) {
            return interfaceC1558m.c() != null;
        }
        if (interfaceC7277bD instanceof F2.B) {
            F2.B b10 = (F2.B) interfaceC7277bD;
            try {
                this.f9263I = new MediaCrypto(b10.f6148a, b10.f6149b);
            } catch (MediaCryptoException e10) {
                throw R(e10, this.f9253D, 6006);
            }
        }
        return true;
    }

    private boolean l1(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        C6109x c6109x = this.f9255E;
        return (c6109x != null && Objects.equals(c6109x.f57022o, "audio/opus") && U2.H.g(j10, j11)) ? false : true;
    }

    private static boolean m1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void o1(MediaCrypto mediaCrypto, boolean z10) throws c {
        C6109x c6109x = (C6109x) AbstractC6614a.e(this.f9253D);
        if (this.f9297q0 == null) {
            try {
                List listM0 = M0(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f9297q0 = arrayDeque;
                if (this.f9303u) {
                    arrayDeque.addAll(listM0);
                } else if (!listM0.isEmpty()) {
                    this.f9297q0.add((t) listM0.get(0));
                }
                this.f9298r0 = null;
            } catch (N.c e10) {
                throw new c(c6109x, e10, z10, -49998);
            }
        }
        if (this.f9297q0.isEmpty()) {
            throw new c(c6109x, (Throwable) null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) AbstractC6614a.e(this.f9297q0);
        while (this.f9292l0 == null) {
            t tVar = (t) AbstractC6614a.e((t) arrayDeque2.peekFirst());
            if (!p1(c6109x) || !V1(tVar)) {
                return;
            }
            try {
                h1(tVar, mediaCrypto);
            } catch (Exception e11) {
                AbstractC6635w.j("MediaCodecRenderer", "Failed to initialize decoder: " + tVar, e11);
                arrayDeque2.removeFirst();
                c cVar = new c(c6109x, e11, z10, tVar);
                q1(cVar);
                if (this.f9298r0 == null) {
                    this.f9298r0 = cVar;
                } else {
                    this.f9298r0 = this.f9298r0.c(cVar);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f9298r0;
                }
            }
        }
        this.f9297q0 = null;
    }

    private void s0() throws C2907s {
        AbstractC6614a.g(!this.f9276U0);
        A2.J jV = V();
        this.f9311y.m();
        do {
            this.f9311y.m();
            int iO0 = o0(jV, this.f9311y, 0);
            if (iO0 == -5) {
                t1(jV);
                return;
            }
            if (iO0 == -4) {
                if (!this.f9311y.q()) {
                    this.f9274S0 = Math.max(this.f9274S0, this.f9311y.f65557f);
                    if (i() || this.f9309x.t()) {
                        this.f9275T0 = this.f9274S0;
                    }
                    if (this.f9278W0) {
                        C6109x c6109x = (C6109x) AbstractC6614a.e(this.f9253D);
                        this.f9255E = c6109x;
                        if (Objects.equals(c6109x.f57022o, "audio/opus") && !this.f9255E.f57025r.isEmpty()) {
                            this.f9255E = this.f9255E.b().d0(U2.H.f((byte[]) this.f9255E.f57025r.get(0))).P();
                        }
                        u1(this.f9255E, null);
                        this.f9278W0 = false;
                    }
                    this.f9311y.y();
                    C6109x c6109x2 = this.f9255E;
                    if (c6109x2 != null && Objects.equals(c6109x2.f57022o, "audio/opus")) {
                        if (this.f9311y.p()) {
                            z2.f fVar = this.f9311y;
                            fVar.f65553b = this.f9255E;
                            c1(fVar);
                        }
                        if (U2.H.g(X(), this.f9311y.f65557f)) {
                            this.f9251C.a(this.f9311y, this.f9255E.f57025r);
                        }
                    }
                    if (!f1()) {
                        break;
                    }
                } else {
                    this.f9276U0 = true;
                    this.f9275T0 = this.f9274S0;
                    return;
                }
            } else {
                if (iO0 != -3) {
                    throw new IllegalStateException();
                }
                if (i()) {
                    this.f9275T0 = this.f9274S0;
                    return;
                }
                return;
            }
        } while (this.f9313z.C(this.f9311y));
        this.f9265J0 = true;
    }

    private boolean t0(long j10, long j11) throws C2907s {
        boolean z10;
        AbstractC6614a.g(!this.f9277V0);
        if (this.f9313z.H()) {
            C1729i c1729i = this.f9313z;
            z10 = false;
            if (!B1(j10, j11, null, c1729i.f65555d, this.f9256E0, 0, c1729i.G(), this.f9313z.E(), l1(X(), this.f9313z.F()), this.f9313z.q(), (C6109x) AbstractC6614a.e(this.f9255E))) {
                return false;
            }
            w1(this.f9313z.F());
            this.f9313z.m();
        } else {
            z10 = false;
        }
        if (this.f9276U0) {
            this.f9277V0 = true;
            return z10;
        }
        if (this.f9265J0) {
            AbstractC6614a.g(this.f9313z.C(this.f9311y));
            this.f9265J0 = z10;
        }
        if (this.f9266K0) {
            if (this.f9313z.H()) {
                return true;
            }
            B0();
            this.f9266K0 = z10;
            n1();
            if (!this.f9264I0) {
                return z10;
            }
        }
        s0();
        if (this.f9313z.H()) {
            this.f9313z.y();
        }
        if (this.f9313z.H() || this.f9276U0 || this.f9266K0) {
            return true;
        }
        return z10;
    }

    private int v0(String str) {
        if (Build.VERSION.SDK_INT > 25 || !"OMX.Exynos.avc.dec.secure".equals(str)) {
            return 0;
        }
        String str2 = Build.MODEL;
        return (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) ? 2 : 0;
    }

    private static boolean w0(String str) {
        return false;
    }

    private static boolean x0(String str) {
        return false;
    }

    private static boolean y0(t tVar) {
        String str = tVar.f9409a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i10 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && tVar.f9415g;
        }
        return true;
    }

    private static boolean z0(String str) {
        return Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void z1() {
        if (this.f9291g1 != -9223372036854775807L) {
            long jX = X();
            long j10 = this.f9291g1;
            if (jX > j10 || this.f9286b1 >= j10) {
                return;
            }
            this.f9289e1 = true;
            this.f9291g1 = -9223372036854775807L;
        }
    }

    protected s A0(Throwable th2, t tVar) {
        return new s(th2, tVar);
    }

    protected abstract boolean B1(long j10, long j11, InterfaceC1737q interfaceC1737q, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C6109x c6109x);

    @Override // androidx.media3.exoplayer.N0
    public final long E(long j10, long j11) {
        return V0(j10, j11, this.f9250B0);
    }

    protected void F1() {
        try {
            InterfaceC1737q interfaceC1737q = this.f9292l0;
            if (interfaceC1737q != null) {
                interfaceC1737q.a();
                this.f9284Z0.f182b++;
                s1(((t) AbstractC6614a.e(this.f9300s0)).f9409a);
            }
            this.f9292l0 = null;
            try {
                MediaCrypto mediaCrypto = this.f9263I;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f9292l0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f9263I;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    protected abstract void G1();

    public void H0() {
        this.f9288d1 = true;
    }

    protected void I1() {
        L1();
        M1();
        K1();
        this.f9252C0 = -9223372036854775807L;
        this.f9272Q0 = false;
        this.f9248A0 = -9223372036854775807L;
        this.f9271P0 = false;
        this.f9310x0 = false;
        this.f9312y0 = false;
        this.f9260G0 = false;
        this.f9262H0 = false;
        this.f9269N0 = 0;
        this.f9270O0 = 0;
        this.f9268M0 = this.f9267L0 ? 1 : 0;
        this.f9289e1 = false;
        this.f9290f1 = -9223372036854775807L;
        this.f9291g1 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.N0
    public void J(float f10, float f11) throws C2907s {
        this.f9281Y = f10;
        this.f9283Z = f11;
        d2(this.f9293m0);
    }

    protected void J1() {
        I1();
        this.f9282Y0 = null;
        this.f9297q0 = null;
        this.f9300s0 = null;
        this.f9293m0 = null;
        this.f9294n0 = null;
        this.f9295o0 = false;
        this.f9273R0 = false;
        this.f9296p0 = -1.0f;
        this.f9302t0 = 0;
        this.f9304u0 = false;
        this.f9306v0 = false;
        this.f9308w0 = false;
        this.f9314z0 = false;
        this.f9250B0 = false;
        this.f9267L0 = false;
        this.f9268M0 = 0;
    }

    protected final boolean K0() throws C2907s {
        boolean zL0 = L0();
        if (zL0) {
            n1();
        }
        return zL0;
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h, androidx.media3.exoplayer.O0
    public final int L() {
        return 8;
    }

    protected final InterfaceC1737q N0() {
        return this.f9292l0;
    }

    protected int O0(z2.f fVar) {
        return 0;
    }

    protected final t P0() {
        return this.f9300s0;
    }

    protected final void P1() {
        this.f9280X0 = true;
    }

    protected final C6109x Q0() {
        return this.f9293m0;
    }

    protected final void Q1(C2907s c2907s) {
        this.f9282Y0 = c2907s;
    }

    protected boolean R0() {
        return false;
    }

    protected abstract float S0(float f10, C6109x c6109x, C6109x[] c6109xArr);

    protected final MediaFormat T0() {
        return this.f9294n0;
    }

    protected boolean T1(z2.f fVar) {
        if (!Y1(fVar)) {
            return false;
        }
        fVar.m();
        this.f9284Z0.f184d++;
        return true;
    }

    protected abstract List U0(E e10, C6109x c6109x, boolean z10);

    protected boolean U1() {
        return true;
    }

    protected long V0(long j10, long j11, boolean z10) {
        return super.E(j10, j11);
    }

    protected boolean V1(t tVar) {
        return true;
    }

    protected long W0() {
        return this.f9275T0;
    }

    protected boolean W1() {
        return false;
    }

    protected abstract InterfaceC1737q.a X0(t tVar, C6109x c6109x, MediaCrypto mediaCrypto, float f10);

    protected boolean X1() {
        int i10 = this.f9270O0;
        if (i10 == 3 || ((this.f9304u0 && !this.f9273R0) || (this.f9306v0 && this.f9272Q0))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        AbstractC6614a.g(true);
        try {
            e2();
            return false;
        } catch (C2907s e10) {
            AbstractC6635w.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    protected final long Y0() {
        return this.f9285a1.f9324c;
    }

    protected boolean Y1(z2.f fVar) {
        return false;
    }

    protected final long Z0() {
        return this.f9285a1.f9323b;
    }

    protected boolean Z1(C6109x c6109x) {
        return false;
    }

    protected float a1() {
        return this.f9281Y;
    }

    protected abstract int a2(E e10, C6109x c6109x);

    @Override // androidx.media3.exoplayer.O0
    public final int b(C6109x c6109x) throws C2907s {
        try {
            return a2(this.f9301t, c6109x);
        } catch (N.c e10) {
            throw R(e10, c6109x, 4002);
        }
    }

    protected final N0.a b1() {
        return this.f9261H;
    }

    protected abstract void c1(z2.f fVar);

    protected final boolean c2() {
        return d2(this.f9293m0);
    }

    @Override // androidx.media3.exoplayer.N0
    public boolean d() {
        return this.f9277V0;
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void d0() {
        this.f9253D = null;
        O1(e.f9321e);
        this.f9249B.clear();
        if (this.f9264I0) {
            B0();
        } else {
            L0();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void e0(boolean z10, boolean z11) {
        this.f9284Z0 = new C1004b();
    }

    protected boolean e1() {
        return this.f9289e1;
    }

    protected final void f2(long j10) {
        C6109x c6109x = (C6109x) this.f9285a1.f9325d.j(j10);
        if (c6109x == null && this.f9287c1 && this.f9294n0 != null) {
            c6109x = (C6109x) this.f9285a1.f9325d.i();
        }
        if (c6109x != null) {
            this.f9255E = c6109x;
        } else if (!this.f9295o0 || this.f9255E == null) {
            return;
        }
        u1((C6109x) AbstractC6614a.e(this.f9255E), this.f9294n0);
        this.f9295o0 = false;
        this.f9287c1 = false;
    }

    @Override // androidx.media3.exoplayer.N0
    public void g(long j10, long j11) throws C2907s {
        boolean z10 = false;
        if (this.f9280X0) {
            this.f9280X0 = false;
            A1();
        }
        C2907s c2907s = this.f9282Y0;
        if (c2907s != null) {
            this.f9282Y0 = null;
            throw c2907s;
        }
        try {
            if (this.f9277V0) {
                G1();
                return;
            }
            if (this.f9253D != null || D1(2)) {
                n1();
                if (this.f9264I0) {
                    t2.P.a("bypassRender");
                    while (t0(j10, j11)) {
                    }
                    t2.P.b();
                } else if (this.f9292l0 != null) {
                    long jC = T().c();
                    t2.P.a("drainAndFeed");
                    while (F0(j10, j11) && S1(jC)) {
                    }
                    while (I0() && S1(jC)) {
                    }
                    t2.P.b();
                } else {
                    this.f9284Z0.f184d += q0(j10);
                    D1(1);
                }
                this.f9284Z0.c();
            }
        } catch (MediaCodec.CryptoException e10) {
            throw R(e10, this.f9253D, a0.d0(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            if (!m1(e11)) {
                throw e11;
            }
            q1(e11);
            if ((e11 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z10 = true;
            }
            if (z10) {
                F1();
            }
            s sVarA0 = A0(e11, P0());
            throw S(sVarA0, this.f9253D, z10, sVarA0.f9408c == 1101 ? 4006 : 4003);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void g0(long j10, boolean z10) throws C2907s {
        this.f9276U0 = false;
        this.f9277V0 = false;
        this.f9280X0 = false;
        if (this.f9264I0) {
            H1();
        } else {
            K0();
        }
        if (this.f9285a1.f9325d.l() > 0) {
            this.f9278W0 = true;
        }
        this.f9285a1.f9325d.c();
        this.f9249B.clear();
    }

    @Override // androidx.media3.exoplayer.N0
    public boolean isReady() {
        if (this.f9253D == null) {
            return false;
        }
        if (c0() || d1()) {
            return true;
        }
        return this.f9252C0 != -9223372036854775807L && T().c() < this.f9252C0;
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void j0() {
        try {
            B0();
            F1();
        } finally {
            R1(null);
        }
    }

    protected final boolean j1() {
        return this.f9264I0;
    }

    protected final boolean k1(C6109x c6109x) {
        return this.f9259G == null && Z1(c6109x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.AbstractC2886h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m0(q2.C6109x[] r12, long r13, long r15, M2.D.b r17) {
        /*
            r11 = this;
            J2.A$e r12 = r11.f9285a1
            long r0 = r12.f9324c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            J2.A$e r4 = new J2.A$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.O1(r4)
            boolean r12 = r11.f9288d1
            if (r12 == 0) goto L56
            r11.x1()
            return
        L24:
            java.util.ArrayDeque r12 = r11.f9249B
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L57
            long r0 = r11.f9274S0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            long r4 = r11.f9286b1
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L57
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 < 0) goto L57
        L3c:
            J2.A$e r4 = new J2.A$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.O1(r4)
            J2.A$e r12 = r11.f9285a1
            long r12 = r12.f9324c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.x1()
        L56:
            return
        L57:
            java.util.ArrayDeque r12 = r11.f9249B
            J2.A$e r0 = new J2.A$e
            long r1 = r11.f9274S0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.A.m0(q2.x[], long, long, M2.D$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void n1() throws androidx.media3.exoplayer.C2907s {
        /*
            r3 = this;
            J2.q r0 = r3.f9292l0
            if (r0 != 0) goto L6b
            boolean r0 = r3.f9264I0
            if (r0 != 0) goto L6b
            q2.x r0 = r3.f9253D
            if (r0 != 0) goto Ld
            goto L6b
        Ld:
            boolean r1 = r3.k1(r0)
            if (r1 == 0) goto L17
            r3.g1(r0)
            return
        L17:
            F2.m r1 = r3.f9259G
            r3.N1(r1)
            F2.m r1 = r3.f9257F
            if (r1 == 0) goto L26
            boolean r1 = r3.i1()
            if (r1 == 0) goto L55
        L26:
            F2.m r1 = r3.f9257F     // Catch: J2.A.c -> L3b
            if (r1 == 0) goto L4f
            int r1 = r1.getState()     // Catch: J2.A.c -> L3b
            r2 = 3
            if (r1 == r2) goto L3d
            F2.m r1 = r3.f9257F     // Catch: J2.A.c -> L3b
            int r1 = r1.getState()     // Catch: J2.A.c -> L3b
            r2 = 4
            if (r1 != r2) goto L4f
            goto L3d
        L3b:
            r1 = move-exception
            goto L64
        L3d:
            F2.m r1 = r3.f9257F     // Catch: J2.A.c -> L3b
            java.lang.String r2 = r0.f57022o     // Catch: J2.A.c -> L3b
            java.lang.Object r2 = t2.AbstractC6614a.i(r2)     // Catch: J2.A.c -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: J2.A.c -> L3b
            boolean r1 = r1.i(r2)     // Catch: J2.A.c -> L3b
            if (r1 == 0) goto L4f
            r1 = 1
            goto L50
        L4f:
            r1 = 0
        L50:
            android.media.MediaCrypto r2 = r3.f9263I     // Catch: J2.A.c -> L3b
            r3.o1(r2, r1)     // Catch: J2.A.c -> L3b
        L55:
            android.media.MediaCrypto r0 = r3.f9263I
            if (r0 == 0) goto L6b
            J2.q r1 = r3.f9292l0
            if (r1 != 0) goto L6b
            r0.release()
            r0 = 0
            r3.f9263I = r0
            return
        L64:
            r2 = 4001(0xfa1, float:5.607E-42)
            androidx.media3.exoplayer.s r0 = r3.R(r1, r0, r2)
            throw r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.A.n1():void");
    }

    protected boolean p1(C6109x c6109x) {
        return true;
    }

    protected abstract void q1(Exception exc);

    protected abstract void r1(String str, InterfaceC1737q.a aVar, long j10, long j11);

    protected abstract void s1(String str);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected A2.C1005c t1(A2.J r12) throws androidx.media3.exoplayer.C2907s {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.A.t1(A2.J):A2.c");
    }

    protected abstract C1005c u0(t tVar, C6109x c6109x, C6109x c6109x2);

    protected abstract void u1(C6109x c6109x, MediaFormat mediaFormat);

    @Override // androidx.media3.exoplayer.AbstractC2886h, androidx.media3.exoplayer.L0.b
    public void v(int i10, Object obj) {
        if (i10 == 11) {
            this.f9261H = (N0.a) AbstractC6614a.e((N0.a) obj);
        } else {
            super.v(i10, obj);
        }
    }

    protected void w1(long j10) {
        this.f9286b1 = j10;
        while (!this.f9249B.isEmpty() && j10 >= ((e) this.f9249B.peek()).f9322a) {
            O1((e) AbstractC6614a.e((e) this.f9249B.poll()));
            x1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f9317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f9318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f9319e;

        public c(C6109x c6109x, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + c6109x, th2, c6109x.f57022o, z10, null, b(i10), null);
        }

        private static String b(int i10) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c c(c cVar) {
            return new c(getMessage(), getCause(), this.f9315a, this.f9316b, this.f9317c, this.f9318d, cVar);
        }

        public c(C6109x c6109x, Throwable th2, boolean z10, t tVar) {
            this("Decoder init failed: " + tVar.f9409a + ", " + c6109x, th2, c6109x.f57022o, z10, tVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
        }

        private c(String str, Throwable th2, String str2, boolean z10, t tVar, String str3, c cVar) {
            super(str, th2);
            this.f9315a = str2;
            this.f9316b = z10;
            this.f9317c = tVar;
            this.f9318d = str3;
            this.f9319e = cVar;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void k0() {
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void l0() {
    }

    protected void x1() {
    }

    protected void v1(long j10) {
    }

    protected void y1(z2.f fVar) {
    }
}
