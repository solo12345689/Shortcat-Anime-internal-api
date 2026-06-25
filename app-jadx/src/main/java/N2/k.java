package N2;

import java.util.Arrays;
import q2.C6109x;
import t2.a0;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f12652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f12653k;

    public k(InterfaceC6940g interfaceC6940g, w2.o oVar, int i10, C6109x c6109x, int i11, Object obj, byte[] bArr) {
        super(interfaceC6940g, oVar, i10, c6109x, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f12652j = bArr == null ? a0.f60567f : bArr;
    }

    private void i(int i10) {
        byte[] bArr = this.f12652j;
        if (bArr.length < i10 + 16384) {
            this.f12652j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // Q2.m.e
    public final void a() {
        try {
            this.f12613i.a(this.f12606b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f12653k) {
                i(i11);
                i10 = this.f12613i.read(this.f12652j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f12653k) {
                g(this.f12652j, i11);
            }
            w2.n.a(this.f12613i);
        } catch (Throwable th2) {
            w2.n.a(this.f12613i);
            throw th2;
        }
    }

    @Override // Q2.m.e
    public final void c() {
        this.f12653k = true;
    }

    protected abstract void g(byte[] bArr, int i10);

    public byte[] h() {
        return this.f12652j;
    }
}
