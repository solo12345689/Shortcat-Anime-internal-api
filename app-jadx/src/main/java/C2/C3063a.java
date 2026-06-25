package c2;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C3063a extends AbstractC3065c {
    public C3063a f(int i10, ByteBuffer byteBuffer) {
        g(i10, byteBuffer);
        return this;
    }

    public void g(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public int h(int i10) {
        int iB = b(16);
        if (iB != 0) {
            return this.f33429b.getInt(d(iB) + (i10 * 4));
        }
        return 0;
    }

    public int i() {
        int iB = b(16);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public boolean j() {
        int iB = b(6);
        return (iB == 0 || this.f33429b.get(iB + this.f33428a) == 0) ? false : true;
    }

    public short k() {
        int iB = b(14);
        if (iB != 0) {
            return this.f33429b.getShort(iB + this.f33428a);
        }
        return (short) 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f33429b.getInt(iB + this.f33428a);
        }
        return 0;
    }

    public short m() {
        int iB = b(8);
        if (iB != 0) {
            return this.f33429b.getShort(iB + this.f33428a);
        }
        return (short) 0;
    }

    public short n() {
        int iB = b(12);
        if (iB != 0) {
            return this.f33429b.getShort(iB + this.f33428a);
        }
        return (short) 0;
    }
}
