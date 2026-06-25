package d0;

import f0.AbstractC4747a;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends u {
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        AbstractC4747a.a(g());
        n(f() + 2);
        return new C4551b(e()[f() - 2], e()[f() - 1]);
    }
}
