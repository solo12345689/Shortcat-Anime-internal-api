package qf;

import kotlin.jvm.internal.AbstractC5504s;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: qf.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6215z extends E0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E0 f58128c;

    public AbstractC6215z(E0 substitution) {
        AbstractC5504s.h(substitution, "substitution");
        this.f58128c = substitution;
    }

    @Override // qf.E0
    public boolean a() {
        return this.f58128c.a();
    }

    @Override // qf.E0
    public InterfaceC7374h d(InterfaceC7374h annotations) {
        AbstractC5504s.h(annotations, "annotations");
        return this.f58128c.d(annotations);
    }

    @Override // qf.E0
    public B0 e(S key) {
        AbstractC5504s.h(key, "key");
        return this.f58128c.e(key);
    }

    @Override // qf.E0
    public boolean f() {
        return this.f58128c.f();
    }

    @Override // qf.E0
    public S g(S topLevelType, N0 position) {
        AbstractC5504s.h(topLevelType, "topLevelType");
        AbstractC5504s.h(position, "position");
        return this.f58128c.g(topLevelType, position);
    }
}
