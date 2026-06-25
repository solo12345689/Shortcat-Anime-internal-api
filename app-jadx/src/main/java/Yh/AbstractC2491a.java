package Yh;

/* JADX INFO: renamed from: Yh.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2491a extends s {
    @Override // Yh.s
    protected void j(s sVar) {
        if (!(sVar instanceof AbstractC2491a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.j(sVar);
    }

    public AbstractC2491a n() {
        return (AbstractC2491a) super.f();
    }
}
