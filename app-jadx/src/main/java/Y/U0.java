package Y;

import b0.f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface U0 extends b0.f, I, E {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a extends f.a {
        @Override // b0.f.a
        U0 build();
    }

    @Override // b0.f
    a builder();

    @Override // Y.E
    default Object c(D d10) {
        return J.b(this, d10);
    }

    U0 x(D d10, n2 n2Var);
}
