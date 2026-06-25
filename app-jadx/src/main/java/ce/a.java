package Ce;

import kotlin.jvm.internal.AbstractC5504s;
import ye.w0;
import ye.x0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3076c = new a();

    private a() {
        super("package", false);
    }

    @Override // ye.x0
    public Integer a(x0 visibility) {
        AbstractC5504s.h(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        return w0.f65138a.b(visibility) ? 1 : -1;
    }

    @Override // ye.x0
    public String b() {
        return "public/*package*/";
    }

    @Override // ye.x0
    public x0 d() {
        return w0.g.f65147c;
    }
}
