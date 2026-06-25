package C2;

import java.nio.ByteBuffer;
import java.util.Arrays;
import r2.o;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C extends r2.q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f2545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f2546j;

    @Override // r2.o
    public void c(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC6614a.e(this.f2546j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.f58448b.f58446d) * this.f58449c.f58446d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                int iS = (t2.a0.S(this.f58448b.f58445c) * i10) + iPosition;
                int i11 = this.f58448b.f58445c;
                if (i11 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iS));
                } else if (i11 == 3) {
                    byteBufferL.put(byteBuffer.get(iS));
                } else if (i11 == 4) {
                    byteBufferL.putFloat(byteBuffer.getFloat(iS));
                } else if (i11 == 21) {
                    t2.a0.i1(byteBufferL, t2.a0.g0(byteBuffer, iS));
                } else {
                    if (i11 != 22) {
                        if (i11 != 268435456) {
                            if (i11 != 1342177280) {
                                if (i11 != 1610612736) {
                                    throw new IllegalStateException("Unexpected encoding: " + this.f58448b.f58445c);
                                }
                            }
                            t2.a0.i1(byteBufferL, t2.a0.g0(byteBuffer, iS));
                        }
                        byteBufferL.putShort(byteBuffer.getShort(iS));
                    }
                    byteBufferL.putInt(byteBuffer.getInt(iS));
                }
            }
            iPosition += this.f58448b.f58446d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // r2.q
    public o.a h(o.a aVar) throws o.b {
        int[] iArr = this.f2545i;
        if (iArr == null) {
            return o.a.f58442e;
        }
        if (!t2.a0.L0(aVar.f58445c)) {
            throw new o.b(aVar);
        }
        boolean z10 = aVar.f58444b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f58444b) {
                throw new o.b("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new o.a(aVar.f58443a, iArr.length, aVar.f58445c) : o.a.f58442e;
    }

    @Override // r2.q
    protected void i() {
        this.f2546j = this.f2545i;
    }

    @Override // r2.q
    protected void k() {
        this.f2546j = null;
        this.f2545i = null;
    }

    public void m(int[] iArr) {
        this.f2545i = iArr;
    }
}
