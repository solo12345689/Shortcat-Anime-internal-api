package Ce;

import kotlin.jvm.internal.AbstractC5504s;
import ye.w0;
import ye.x0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f3077c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // ye.x0
    public Integer a(x0 visibility) {
        AbstractC5504s.h(visibility, "visibility");
        if (AbstractC5504s.c(this, visibility)) {
            return 0;
        }
        if (visibility == w0.b.f65142c) {
            return null;
        }
        return w0.f65138a.b(visibility) ? 1 : -1;
    }

    @Override // ye.x0
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // ye.x0
    public x0 d() {
        return w0.g.f65147c;
    }
}
