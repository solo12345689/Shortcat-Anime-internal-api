package C2;

import java.nio.ByteBuffer;
import r2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends r2.q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f2734i = Float.floatToIntBits(Float.NaN);

    private static void m(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f2734i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // r2.o
    public void c(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferL;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f58448b.f58445c;
        if (i11 == 21) {
            byteBufferL = l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferL);
                iPosition += 3;
            }
        } else if (i11 == 22) {
            byteBufferL = l(i10);
            while (iPosition < iLimit) {
                m((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferL);
                iPosition += 4;
            }
        } else if (i11 == 1342177280) {
            byteBufferL = l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                m(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferL);
                iPosition += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferL = l(i10);
            while (iPosition < iLimit) {
                m((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferL);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferL.flip();
    }

    @Override // r2.q
    public o.a h(o.a aVar) throws o.b {
        int i10 = aVar.f58445c;
        if (t2.a0.K0(i10)) {
            return i10 != 4 ? new o.a(aVar.f58443a, aVar.f58444b, 4) : o.a.f58442e;
        }
        throw new o.b(aVar);
    }
}
