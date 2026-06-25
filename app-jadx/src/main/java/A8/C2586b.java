package a8;

import java.nio.ByteOrder;

/* JADX INFO: renamed from: a8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2586b extends com.github.penfeizhou.animation.io.b {
    @Override // com.github.penfeizhou.animation.io.b
    public void d(int i10) {
        super.d(i10);
        this.f38795a.order(ByteOrder.BIG_ENDIAN);
    }

    public void g(int i10) {
        b((byte) (i10 & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) ((i10 >> 16) & 255));
        b((byte) ((i10 >> 24) & 255));
    }

    public void h(int i10) {
        b((byte) ((i10 >> 24) & 255));
        b((byte) ((i10 >> 16) & 255));
        b((byte) ((i10 >> 8) & 255));
        b((byte) (i10 & 255));
    }
}
