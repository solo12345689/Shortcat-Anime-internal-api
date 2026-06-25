package Sa;

import com.swmansion.rnscreens.C4546y;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16021b;

    private final void c(C4546y c4546y) {
        if (this.f16020a && this.f16021b) {
            c4546y.A();
            c4546y.F();
        }
    }

    public final void a(C4546y screen) {
        AbstractC5504s.h(screen, "screen");
        this.f16021b = true;
        c(screen);
    }

    public final void b(C4546y screen) {
        AbstractC5504s.h(screen, "screen");
        this.f16020a = true;
        c(screen);
    }
}
