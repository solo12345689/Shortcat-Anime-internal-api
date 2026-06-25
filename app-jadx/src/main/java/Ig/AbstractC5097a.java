package ig;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ig.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5097a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f48882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f48883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48884d;

    public AbstractC5097a(String name, boolean z10) {
        AbstractC5504s.h(name, "name");
        this.f48881a = name;
        this.f48882b = z10;
        this.f48884d = -1L;
    }

    public final boolean a() {
        return this.f48882b;
    }

    public final String b() {
        return this.f48881a;
    }

    public final long c() {
        return this.f48884d;
    }

    public final d d() {
        return this.f48883c;
    }

    public final void e(d queue) {
        AbstractC5504s.h(queue, "queue");
        d dVar = this.f48883c;
        if (dVar == queue) {
            return;
        }
        if (dVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f48883c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f48884d = j10;
    }

    public String toString() {
        return this.f48881a;
    }

    public /* synthetic */ AbstractC5097a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
