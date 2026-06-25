package Ee;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class x extends AbstractC1529h implements Oe.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f5959c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Xe.f fVar, Object value) {
        super(fVar, null);
        AbstractC5504s.h(value, "value");
        this.f5959c = value;
    }

    @Override // Oe.o
    public Object getValue() {
        return this.f5959c;
    }
}
