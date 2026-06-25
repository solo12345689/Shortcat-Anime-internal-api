package f5;

import U4.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends d5.j implements r {
    public e(C4776c c4776c) {
        super(c4776c);
    }

    @Override // U4.v
    public Class a() {
        return C4776c.class;
    }

    @Override // U4.v
    public int getSize() {
        return ((C4776c) this.f45018a).i();
    }

    @Override // d5.j, U4.r
    public void initialize() {
        ((C4776c) this.f45018a).e().prepareToDraw();
    }

    @Override // U4.v
    public void recycle() {
        ((C4776c) this.f45018a).stop();
        ((C4776c) this.f45018a).k();
    }
}
