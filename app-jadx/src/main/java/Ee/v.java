package Ee;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class v extends AbstractC1529h implements Oe.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Enum f5957c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Xe.f fVar, Enum value) {
        super(fVar, null);
        AbstractC5504s.h(value, "value");
        this.f5957c = value;
    }

    @Override // Oe.m
    public Xe.b d() {
        Class<?> enclosingClass = this.f5957c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        AbstractC5504s.e(enclosingClass);
        return AbstractC1527f.e(enclosingClass);
    }

    @Override // Oe.m
    public Xe.f e() {
        return Xe.f.m(this.f5957c.name());
    }
}
