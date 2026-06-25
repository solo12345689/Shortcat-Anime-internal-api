package J2;

import java.nio.ByteBuffer;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: J2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1729i extends z2.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f9386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f9388l;

    public C1729i() {
        super(2);
        this.f9388l = 32;
    }

    private boolean D(z2.f fVar) {
        ByteBuffer byteBuffer;
        if (!H()) {
            return true;
        }
        if (this.f9387k >= this.f9388l) {
            return false;
        }
        ByteBuffer byteBuffer2 = fVar.f65555d;
        return byteBuffer2 == null || (byteBuffer = this.f65555d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean C(z2.f fVar) {
        AbstractC6614a.a(!fVar.z());
        AbstractC6614a.a(!fVar.p());
        AbstractC6614a.a(!fVar.q());
        if (!D(fVar)) {
            return false;
        }
        int i10 = this.f9387k;
        this.f9387k = i10 + 1;
        if (i10 == 0) {
            this.f65557f = fVar.f65557f;
            if (fVar.s()) {
                v(1);
            }
        }
        ByteBuffer byteBuffer = fVar.f65555d;
        if (byteBuffer != null) {
            x(byteBuffer.remaining());
            this.f65555d.put(byteBuffer);
        }
        this.f9386j = fVar.f65557f;
        return true;
    }

    public long E() {
        return this.f65557f;
    }

    public long F() {
        return this.f9386j;
    }

    public int G() {
        return this.f9387k;
    }

    public boolean H() {
        return this.f9387k > 0;
    }

    public void I(int i10) {
        AbstractC6614a.a(i10 > 0);
        this.f9388l = i10;
    }

    @Override // z2.f, z2.AbstractC7276a
    public void m() {
        super.m();
        this.f9387k = 0;
    }
}
