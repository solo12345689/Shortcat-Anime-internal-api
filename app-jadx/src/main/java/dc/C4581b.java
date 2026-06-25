package dc;

import kotlin.jvm.internal.AbstractC5504s;
import pc.X;

/* JADX INFO: renamed from: dc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4581b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X f45099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f45100c;

    public C4581b(String name, X x10) {
        AbstractC5504s.h(name, "name");
        this.f45098a = name;
        this.f45099b = x10;
    }

    public final g a() {
        g gVar = this.f45100c;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final X b() {
        return this.f45099b;
    }

    public final String c() {
        return this.f45098a;
    }

    public final void d(g gVar) {
        this.f45100c = gVar;
    }
}
