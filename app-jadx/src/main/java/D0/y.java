package d0;

import f0.AbstractC4747a;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends u {

    /* JADX INFO: renamed from: d */
    private final i f44938d;

    public y(i iVar) {
        this.f44938d = iVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: o */
    public Map.Entry next() {
        AbstractC4747a.a(g());
        n(f() + 2);
        return new C4552c(this.f44938d, e()[f() - 2], e()[f() - 1]);
    }
}
