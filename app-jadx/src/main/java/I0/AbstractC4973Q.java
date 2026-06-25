package i0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: i0.Q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC4973Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4963G f48444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterator f48445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map.Entry f48447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map.Entry f48448e;

    public AbstractC4973Q(C4963G c4963g, Iterator it) {
        this.f48444a = c4963g;
        this.f48445b = it;
        this.f48446c = c4963g.g();
        e();
    }

    protected final void e() {
        this.f48447d = this.f48448e;
        this.f48448e = this.f48445b.hasNext() ? (Map.Entry) this.f48445b.next() : null;
    }

    protected final Map.Entry f() {
        return this.f48447d;
    }

    public final C4963G g() {
        return this.f48444a;
    }

    public final boolean hasNext() {
        return this.f48448e != null;
    }

    protected final Map.Entry i() {
        return this.f48448e;
    }

    public final void remove() {
        if (g().g() != this.f48446c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f48447d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.f48444a.remove(entry.getKey());
        this.f48447d = null;
        Td.L l10 = Td.L.f17438a;
        this.f48446c = g().g();
    }
}
