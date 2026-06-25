package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: c2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C3064b extends AbstractC3065c {
    public static C3064b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new C3064b());
    }

    public static C3064b i(ByteBuffer byteBuffer, C3064b c3064b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c3064b.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public C3064b f(int i10, ByteBuffer byteBuffer) {
        g(i10, byteBuffer);
        return this;
    }

    public void g(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public C3063a j(C3063a c3063a, int i10) {
        int iB = b(6);
        if (iB != 0) {
            return c3063a.f(a(d(iB) + (i10 * 4)), this.f33429b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f33429b.getInt(iB + this.f33428a);
        }
        return 0;
    }
}
