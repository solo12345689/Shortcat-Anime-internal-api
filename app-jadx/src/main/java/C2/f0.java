package C2;

import java.nio.ByteBuffer;
import r2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends r2.q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f2739m = t2.a0.f60567f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f2741o;

    @Override // r2.q, r2.o
    public ByteBuffer a() {
        int i10;
        if (super.d() && (i10 = this.f2740n) > 0) {
            l(i10).put(this.f2739m, 0, this.f2740n).flip();
            this.f2740n = 0;
        }
        return super.a();
    }

    @Override // r2.o
    public void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f2738l);
        this.f2741o += (long) (iMin / this.f58448b.f58446d);
        this.f2738l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f2738l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f2740n + i11) - this.f2739m.length;
        ByteBuffer byteBufferL = l(length);
        int iR = t2.a0.r(length, 0, this.f2740n);
        byteBufferL.put(this.f2739m, 0, iR);
        int iR2 = t2.a0.r(length - iR, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iR2);
        byteBufferL.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iR2;
        int i13 = this.f2740n - iR;
        this.f2740n = i13;
        byte[] bArr = this.f2739m;
        System.arraycopy(bArr, iR, bArr, 0, i13);
        byteBuffer.get(this.f2739m, this.f2740n, i12);
        this.f2740n += i12;
        byteBufferL.flip();
    }

    @Override // r2.q, r2.o
    public boolean d() {
        return super.d() && this.f2740n == 0;
    }

    @Override // r2.q
    public o.a h(o.a aVar) throws o.b {
        if (!t2.a0.L0(aVar.f58445c)) {
            throw new o.b(aVar);
        }
        this.f2737k = true;
        return (this.f2735i == 0 && this.f2736j == 0) ? o.a.f58442e : aVar;
    }

    @Override // r2.q
    protected void i() {
        if (this.f2737k) {
            this.f2737k = false;
            int i10 = this.f2736j;
            int i11 = this.f58448b.f58446d;
            this.f2739m = new byte[i10 * i11];
            this.f2738l = this.f2735i * i11;
        }
        this.f2740n = 0;
    }

    @Override // r2.q
    protected void j() {
        if (this.f2737k) {
            int i10 = this.f2740n;
            if (i10 > 0) {
                this.f2741o += (long) (i10 / this.f58448b.f58446d);
            }
            this.f2740n = 0;
        }
    }

    @Override // r2.q
    protected void k() {
        this.f2739m = t2.a0.f60567f;
    }

    public long m() {
        return this.f2741o;
    }

    public void n() {
        this.f2741o = 0L;
    }

    public void o(int i10, int i11) {
        this.f2735i = i10;
        this.f2736j = i11;
    }
}
