package K2;

import A2.J;
import M2.D;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.AbstractC2886h;
import androidx.media3.exoplayer.O0;
import d3.InterfaceC4565a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import q2.C6078J;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC2886h implements Handler.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f10846A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private C6078J f10847B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f10848C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a f10849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b f10850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Handler f10851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final d3.b f10852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f10853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private InterfaceC4565a f10854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10855y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f10856z;

    public c(b bVar, Looper looper) {
        this(bVar, looper, a.f10845a);
    }

    private void r0(C6078J c6078j, List list) {
        for (int i10 = 0; i10 < c6078j.e(); i10++) {
            C6109x c6109xA = c6078j.d(i10).a();
            if (c6109xA == null || !this.f10849s.b(c6109xA)) {
                list.add(c6078j.d(i10));
            } else {
                InterfaceC4565a interfaceC4565aA = this.f10849s.a(c6109xA);
                byte[] bArr = (byte[]) AbstractC6614a.e(c6078j.d(i10).c());
                this.f10852v.m();
                this.f10852v.x(bArr.length);
                ((ByteBuffer) a0.l(this.f10852v.f65555d)).put(bArr);
                this.f10852v.y();
                C6078J c6078jA = interfaceC4565aA.a(this.f10852v);
                if (c6078jA != null) {
                    r0(c6078jA, list);
                }
            }
        }
    }

    private long s0(long j10) {
        AbstractC6614a.g(j10 != -9223372036854775807L);
        AbstractC6614a.g(this.f10848C != -9223372036854775807L);
        return j10 - this.f10848C;
    }

    private void t0(C6078J c6078j) {
        Handler handler = this.f10851u;
        if (handler != null) {
            handler.obtainMessage(1, c6078j).sendToTarget();
        } else {
            u0(c6078j);
        }
    }

    private void u0(C6078J c6078j) {
        this.f10850t.z(c6078j);
    }

    private boolean v0(long j10) {
        boolean z10;
        C6078J c6078j = this.f10847B;
        if (c6078j == null || (!this.f10853w && c6078j.f56580b > s0(j10))) {
            z10 = false;
        } else {
            t0(this.f10847B);
            this.f10847B = null;
            z10 = true;
        }
        if (this.f10855y && this.f10847B == null) {
            this.f10856z = true;
        }
        return z10;
    }

    private void w0() {
        if (this.f10855y || this.f10847B != null) {
            return;
        }
        this.f10852v.m();
        J jV = V();
        int iO0 = o0(jV, this.f10852v, 0);
        if (iO0 != -4) {
            if (iO0 == -5) {
                this.f10846A = ((C6109x) AbstractC6614a.e(jV.f142b)).f57027t;
                return;
            }
            return;
        }
        if (this.f10852v.q()) {
            this.f10855y = true;
            return;
        }
        if (this.f10852v.f65557f >= X()) {
            d3.b bVar = this.f10852v;
            bVar.f45011j = this.f10846A;
            bVar.y();
            C6078J c6078jA = ((InterfaceC4565a) a0.l(this.f10854x)).a(this.f10852v);
            if (c6078jA != null) {
                ArrayList arrayList = new ArrayList(c6078jA.e());
                r0(c6078jA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f10847B = new C6078J(s0(this.f10852v.f65557f), arrayList);
            }
        }
    }

    @Override // androidx.media3.exoplayer.O0
    public int b(C6109x c6109x) {
        if (this.f10849s.b(c6109x)) {
            return O0.t(c6109x.f57006P == 0 ? 4 : 2);
        }
        return O0.t(0);
    }

    @Override // androidx.media3.exoplayer.N0
    public boolean d() {
        return this.f10856z;
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void d0() {
        this.f10847B = null;
        this.f10854x = null;
        this.f10848C = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.N0
    public void g(long j10, long j11) {
        boolean zV0 = true;
        while (zV0) {
            w0();
            zV0 = v0(j10);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void g0(long j10, boolean z10) {
        this.f10847B = null;
        this.f10855y = false;
        this.f10856z = false;
    }

    @Override // androidx.media3.exoplayer.N0, androidx.media3.exoplayer.O0
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        u0((C6078J) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.N0
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void m0(C6109x[] c6109xArr, long j10, long j11, D.b bVar) {
        this.f10854x = this.f10849s.a(c6109xArr[0]);
        C6078J c6078j = this.f10847B;
        if (c6078j != null) {
            this.f10847B = c6078j.c((c6078j.f56580b + this.f10848C) - j11);
        }
        this.f10848C = j11;
    }

    public c(b bVar, Looper looper, a aVar) {
        this(bVar, looper, aVar, false);
    }

    public c(b bVar, Looper looper, a aVar, boolean z10) {
        super(5);
        this.f10850t = (b) AbstractC6614a.e(bVar);
        this.f10851u = looper == null ? null : a0.B(looper, this);
        this.f10849s = (a) AbstractC6614a.e(aVar);
        this.f10853w = z10;
        this.f10852v = new d3.b();
        this.f10848C = -9223372036854775807L;
    }
}
