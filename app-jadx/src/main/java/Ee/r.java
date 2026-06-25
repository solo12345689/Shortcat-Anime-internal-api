package Ee;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r extends AbstractC1529h implements Oe.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f5953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Xe.f fVar, Class klass) {
        super(fVar, null);
        AbstractC5504s.h(klass, "klass");
        this.f5953c = klass;
    }

    @Override // Oe.h
    public Oe.x b() {
        return E.f5906a.a(this.f5953c);
    }
}
