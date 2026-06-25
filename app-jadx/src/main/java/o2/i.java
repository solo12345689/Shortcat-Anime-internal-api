package O2;

import A2.J;
import M2.D;
import P9.AbstractC2011u;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.AbstractC2886h;
import androidx.media3.exoplayer.O0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import q2.AbstractC6079K;
import q2.C6109x;
import r3.C6237a;
import r3.j;
import r3.k;
import r3.l;
import r3.o;
import r3.p;
import s2.C6407e;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC2886h implements Handler.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private p f12911A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private p f12912B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f12913C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Handler f12914D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final h f12915E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final J f12916F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f12917G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f12918H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private C6109x f12919I;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private long f12920X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private long f12921Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f12922Z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C6237a f12923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z2.f f12924t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f12925u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final g f12926v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f12927w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f12928x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private k f12929y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private o f12930z;

    public i(h hVar, Looper looper) {
        this(hVar, looper, g.f12909a);
    }

    private static boolean A0(C6109x c6109x) {
        return Objects.equals(c6109x.f57022o, "application/x-media3-cues");
    }

    private boolean B0(long j10) {
        if (this.f12917G || o0(this.f12916F, this.f12924t, 0) != -4) {
            return false;
        }
        if (this.f12924t.q()) {
            this.f12917G = true;
            return false;
        }
        this.f12924t.y();
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC6614a.e(this.f12924t.f65555d);
        r3.d dVarA = this.f12923s.a(this.f12924t.f65557f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f12924t.m();
        return this.f12925u.a(dVarA, j10);
    }

    private void C0() {
        this.f12930z = null;
        this.f12913C = -1;
        p pVar = this.f12911A;
        if (pVar != null) {
            pVar.w();
            this.f12911A = null;
        }
        p pVar2 = this.f12912B;
        if (pVar2 != null) {
            pVar2.w();
            this.f12912B = null;
        }
    }

    private void D0() {
        C0();
        ((k) AbstractC6614a.e(this.f12929y)).a();
        this.f12929y = null;
        this.f12928x = 0;
    }

    private void E0(long j10) {
        boolean zB0 = B0(j10);
        long jD = this.f12925u.d(this.f12920X);
        if (jD == Long.MIN_VALUE && this.f12917G && !zB0) {
            this.f12918H = true;
        }
        if (jD != Long.MIN_VALUE && jD <= j10) {
            zB0 = true;
        }
        if (zB0) {
            AbstractC2011u abstractC2011uB = this.f12925u.b(j10);
            long jC = this.f12925u.c(j10);
            I0(new C6407e(abstractC2011uB, v0(jC)));
            this.f12925u.e(jC);
        }
        this.f12920X = j10;
    }

    private void F0(long j10) {
        boolean z10;
        this.f12920X = j10;
        if (this.f12912B == null) {
            ((k) AbstractC6614a.e(this.f12929y)).c(j10);
            try {
                this.f12912B = (p) ((k) AbstractC6614a.e(this.f12929y)).b();
            } catch (l e10) {
                w0(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f12911A != null) {
            long jU0 = u0();
            z10 = false;
            while (jU0 <= j10) {
                this.f12913C++;
                jU0 = u0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        p pVar = this.f12912B;
        if (pVar != null) {
            if (pVar.q()) {
                if (!z10 && u0() == Long.MAX_VALUE) {
                    if (this.f12928x == 2) {
                        G0();
                    } else {
                        C0();
                        this.f12918H = true;
                    }
                }
            } else if (pVar.f65563b <= j10) {
                p pVar2 = this.f12911A;
                if (pVar2 != null) {
                    pVar2.w();
                }
                this.f12913C = pVar.a(j10);
                this.f12911A = pVar;
                this.f12912B = null;
                z10 = true;
            }
        }
        if (z10) {
            AbstractC6614a.e(this.f12911A);
            I0(new C6407e(this.f12911A.b(j10), v0(t0(j10))));
        }
        if (this.f12928x == 2) {
            return;
        }
        while (!this.f12917G) {
            try {
                o oVar = this.f12930z;
                if (oVar == null) {
                    oVar = (o) ((k) AbstractC6614a.e(this.f12929y)).g();
                    if (oVar == null) {
                        return;
                    } else {
                        this.f12930z = oVar;
                    }
                }
                if (this.f12928x == 1) {
                    oVar.v(4);
                    ((k) AbstractC6614a.e(this.f12929y)).e(oVar);
                    this.f12930z = null;
                    this.f12928x = 2;
                    return;
                }
                int iO0 = o0(this.f12916F, oVar, 0);
                if (iO0 == -4) {
                    if (oVar.q()) {
                        this.f12917G = true;
                        this.f12927w = false;
                    } else {
                        C6109x c6109x = this.f12916F.f142b;
                        if (c6109x == null) {
                            return;
                        }
                        oVar.f58517j = c6109x.f57027t;
                        oVar.y();
                        this.f12927w &= !oVar.s();
                    }
                    if (!this.f12927w) {
                        ((k) AbstractC6614a.e(this.f12929y)).e(oVar);
                        this.f12930z = null;
                    }
                } else if (iO0 == -3) {
                    return;
                }
            } catch (l e11) {
                w0(e11);
                return;
            }
        }
    }

    private void G0() {
        D0();
        y0();
    }

    private void I0(C6407e c6407e) {
        Handler handler = this.f12914D;
        if (handler != null) {
            handler.obtainMessage(1, c6407e).sendToTarget();
        } else {
            z0(c6407e);
        }
    }

    private void r0() {
        AbstractC6614a.h(this.f12922Z || Objects.equals(this.f12919I.f57022o, "application/cea-608") || Objects.equals(this.f12919I.f57022o, "application/x-mp4-cea-608") || Objects.equals(this.f12919I.f57022o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f12919I.f57022o + " samples (expected application/x-media3-cues).");
    }

    private void s0() {
        I0(new C6407e(AbstractC2011u.A(), v0(this.f12920X)));
    }

    private long t0(long j10) {
        int iA = this.f12911A.a(j10);
        if (iA == 0 || this.f12911A.h() == 0) {
            return this.f12911A.f65563b;
        }
        if (iA != -1) {
            return this.f12911A.c(iA - 1);
        }
        return this.f12911A.c(r2.h() - 1);
    }

    private long u0() {
        if (this.f12913C == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC6614a.e(this.f12911A);
        if (this.f12913C >= this.f12911A.h()) {
            return Long.MAX_VALUE;
        }
        return this.f12911A.c(this.f12913C);
    }

    private long v0(long j10) {
        AbstractC6614a.g(j10 != -9223372036854775807L);
        return j10 - a0();
    }

    private void w0(l lVar) {
        AbstractC6635w.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f12919I, lVar);
        s0();
        G0();
    }

    private static boolean x0(j jVar, long j10) {
        return jVar != null && jVar.h() > 0 && jVar.c(jVar.h() - 1) > j10;
    }

    private void y0() {
        this.f12927w = true;
        k kVarA = this.f12926v.a((C6109x) AbstractC6614a.e(this.f12919I));
        this.f12929y = kVarA;
        kVarA.f(X());
    }

    private void z0(C6407e c6407e) {
        this.f12915E.p(c6407e.f59086a);
        this.f12915E.t(c6407e);
    }

    public void H0(long j10) {
        AbstractC6614a.g(A());
        this.f12921Y = j10;
    }

    @Override // androidx.media3.exoplayer.O0
    public int b(C6109x c6109x) {
        if (A0(c6109x) || this.f12926v.b(c6109x)) {
            return O0.t(c6109x.f57006P == 0 ? 4 : 2);
        }
        return AbstractC6079K.s(c6109x.f57022o) ? O0.t(1) : O0.t(0);
    }

    @Override // androidx.media3.exoplayer.N0
    public boolean d() {
        return this.f12918H;
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void d0() {
        this.f12919I = null;
        this.f12921Y = -9223372036854775807L;
        s0();
        this.f12920X = -9223372036854775807L;
        if (this.f12929y != null) {
            D0();
        }
    }

    @Override // androidx.media3.exoplayer.N0
    public void g(long j10, long j11) {
        if (A()) {
            long j12 = this.f12921Y;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                C0();
                this.f12918H = true;
            }
        }
        if (this.f12918H) {
            return;
        }
        if (A0((C6109x) AbstractC6614a.e(this.f12919I))) {
            AbstractC6614a.e(this.f12925u);
            E0(j10);
        } else {
            r0();
            F0(j10);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void g0(long j10, boolean z10) {
        this.f12920X = j10;
        a aVar = this.f12925u;
        if (aVar != null) {
            aVar.clear();
        }
        s0();
        this.f12917G = false;
        this.f12918H = false;
        this.f12921Y = -9223372036854775807L;
        C6109x c6109x = this.f12919I;
        if (c6109x == null || A0(c6109x)) {
            return;
        }
        if (this.f12928x != 0) {
            G0();
            return;
        }
        C0();
        k kVar = (k) AbstractC6614a.e(this.f12929y);
        kVar.flush();
        kVar.f(X());
    }

    @Override // androidx.media3.exoplayer.N0, androidx.media3.exoplayer.O0
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        z0((C6407e) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.N0
    public boolean isReady() {
        C6109x c6109x = this.f12919I;
        if (c6109x == null) {
            return true;
        }
        if (!A0((C6109x) AbstractC6614a.e(c6109x))) {
            return !this.f12918H && (!this.f12917G || x0(this.f12911A, this.f12920X) || x0(this.f12912B, this.f12920X) || this.f12930z == null);
        }
        if (((a) AbstractC6614a.e(this.f12925u)).d(this.f12920X) != Long.MIN_VALUE) {
            return true;
        }
        try {
            x();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void m0(C6109x[] c6109xArr, long j10, long j11, D.b bVar) {
        C6109x c6109x = c6109xArr[0];
        this.f12919I = c6109x;
        if (A0(c6109x)) {
            this.f12925u = this.f12919I.f57003M == 1 ? new e() : new f();
            return;
        }
        r0();
        if (this.f12929y != null) {
            this.f12928x = 1;
        } else {
            y0();
        }
    }

    public i(h hVar, Looper looper, g gVar) {
        super(3);
        this.f12915E = (h) AbstractC6614a.e(hVar);
        this.f12914D = looper == null ? null : a0.B(looper, this);
        this.f12926v = gVar;
        this.f12923s = new C6237a();
        this.f12924t = new z2.f(1);
        this.f12916F = new J();
        this.f12921Y = -9223372036854775807L;
        this.f12920X = -9223372036854775807L;
        this.f12922Z = false;
    }
}
