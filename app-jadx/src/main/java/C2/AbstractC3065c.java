package c2;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3065c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f33428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f33429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    AbstractC3066d f33432e = AbstractC3066d.a();

    protected int a(int i10) {
        return i10 + this.f33429b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f33431d) {
            return this.f33429b.getShort(this.f33430c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f33429b = byteBuffer;
        if (byteBuffer == null) {
            this.f33428a = 0;
            this.f33430c = 0;
            this.f33431d = 0;
        } else {
            this.f33428a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f33430c = i11;
            this.f33431d = this.f33429b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f33428a;
        return i11 + this.f33429b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f33428a;
        return this.f33429b.getInt(i11 + this.f33429b.getInt(i11));
    }
}
