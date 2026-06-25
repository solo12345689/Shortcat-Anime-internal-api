package dc;

import kotlin.jvm.internal.AbstractC5504s;
import pc.C5972b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends AbstractC4580a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k f45115g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String name, C5972b[] desiredArgsTypes) {
        super(name, desiredArgsTypes);
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(desiredArgsTypes, "desiredArgsTypes");
        this.f45115g = m.f45117b;
    }

    protected final k m() {
        return this.f45115g;
    }

    public final g n(m queue) {
        AbstractC5504s.h(queue, "queue");
        this.f45115g = queue;
        return this;
    }
}
