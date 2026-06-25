package Ee;

import Oe.InterfaceC1980a;
import Oe.InterfaceC1982c;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends AbstractC1529h implements InterfaceC1982c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Annotation f5938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Xe.f fVar, Annotation annotation) {
        super(fVar, null);
        AbstractC5504s.h(annotation, "annotation");
        this.f5938c = annotation;
    }

    @Override // Oe.InterfaceC1982c
    public InterfaceC1980a a() {
        return new C1528g(this.f5938c);
    }
}
