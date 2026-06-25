package f6;

import java.util.Date;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f46949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f46950b;

    public m(j frameLoader, Date insertedTime) {
        AbstractC5504s.h(frameLoader, "frameLoader");
        AbstractC5504s.h(insertedTime, "insertedTime");
        this.f46949a = frameLoader;
        this.f46950b = insertedTime;
    }

    public final j a() {
        return this.f46949a;
    }

    public final Date b() {
        return this.f46950b;
    }
}
