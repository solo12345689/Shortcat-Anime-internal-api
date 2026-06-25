package T1;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f17014b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Throwable readException, int i10) {
        super(i10, null);
        AbstractC5504s.h(readException, "readException");
        this.f17014b = readException;
    }

    public final Throwable b() {
        return this.f17014b;
    }
}
