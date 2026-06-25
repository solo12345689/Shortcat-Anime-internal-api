package T2;

import androidx.media3.exoplayer.AbstractC2886h;
import androidx.media3.exoplayer.O0;
import java.nio.ByteBuffer;
import q2.C6109x;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC2886h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final z2.f f17022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C6609I f17023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f17024u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f17025v;

    public b() {
        super(6);
        this.f17022s = new z2.f(1);
        this.f17023t = new C6609I();
    }

    private float[] r0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f17023t.Z(byteBuffer.array(), byteBuffer.limit());
        this.f17023t.b0(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f17023t.z());
        }
        return fArr;
    }

    private void s0() {
        a aVar = this.f17024u;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // androidx.media3.exoplayer.O0
    public int b(C6109x c6109x) {
        return "application/x-camera-motion".equals(c6109x.f57022o) ? O0.t(4) : O0.t(0);
    }

    @Override // androidx.media3.exoplayer.N0
    public boolean d() {
        return i();
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void d0() {
        s0();
    }

    @Override // androidx.media3.exoplayer.N0
    public void g(long j10, long j11) {
        while (!i() && this.f17025v < 100000 + j10) {
            this.f17022s.m();
            if (o0(V(), this.f17022s, 0) != -4 || this.f17022s.q()) {
                return;
            }
            long j12 = this.f17022s.f65557f;
            this.f17025v = j12;
            boolean z10 = j12 < X();
            if (this.f17024u != null && !z10) {
                this.f17022s.y();
                float[] fArrR0 = r0((ByteBuffer) a0.l(this.f17022s.f65555d));
                if (fArrR0 != null) {
                    ((a) a0.l(this.f17024u)).b(this.f17025v - a0(), fArrR0);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h
    protected void g0(long j10, boolean z10) {
        this.f17025v = Long.MIN_VALUE;
        s0();
    }

    @Override // androidx.media3.exoplayer.N0, androidx.media3.exoplayer.O0
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.N0
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC2886h, androidx.media3.exoplayer.L0.b
    public void v(int i10, Object obj) {
        if (i10 == 8) {
            this.f17024u = (a) obj;
        } else {
            super.v(i10, obj);
        }
    }
}
