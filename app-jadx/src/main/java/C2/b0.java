package C2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f2706d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f2707e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f2708a = r2.o.f58441a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2710c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2709b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int length = i12 + 27 + i11;
        if (this.f2709b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f2706d.length;
            length += f2707e.length + length2;
            i10 = length2;
        } else {
            i10 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f2709b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f2706d);
            }
            byteBufferC.put(f2707e);
        }
        int iJ = this.f2710c + U2.H.j(byteBuffer);
        this.f2710c = iJ;
        f(byteBufferC, iJ, this.f2709b, i12, false);
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 >= 255) {
                byteBufferC.put((byte) -1);
                i11 -= 255;
            } else {
                byteBufferC.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        if (this.f2709b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i10;
            byte[] bArr2 = f2707e;
            byteBufferC.putInt(i10 + bArr2.length + 22, t2.a0.z(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, t2.a0.z(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f2709b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i10) {
        if (this.f2708a.capacity() < i10) {
            this.f2708a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f2708a.clear();
        }
        return this.f2708a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(S9.i.a(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, t2.a0.z(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(S9.i.a(i11));
    }

    public void a(z2.f fVar, List list) {
        AbstractC6614a.e(fVar.f65555d);
        if (fVar.f65555d.limit() - fVar.f65555d.position() == 0) {
            return;
        }
        this.f2708a = b(fVar.f65555d, (this.f2709b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        fVar.m();
        fVar.x(this.f2708a.remaining());
        fVar.f65555d.put(this.f2708a);
        fVar.y();
    }

    public void d() {
        this.f2708a = r2.o.f58441a;
        this.f2710c = 0;
        this.f2709b = 2;
    }
}
