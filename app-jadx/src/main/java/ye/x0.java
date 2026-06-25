package ye;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a */
    private final String f65151a;

    /* JADX INFO: renamed from: b */
    private final boolean f65152b;

    protected x0(String name, boolean z10) {
        AbstractC5504s.h(name, "name");
        this.f65151a = name;
        this.f65152b = z10;
    }

    public Integer a(x0 visibility) {
        AbstractC5504s.h(visibility, "visibility");
        return w0.f65138a.a(this, visibility);
    }

    public String b() {
        return this.f65151a;
    }

    public final boolean c() {
        return this.f65152b;
    }

    public final String toString() {
        return b();
    }

    public x0 d() {
        return this;
    }
}
