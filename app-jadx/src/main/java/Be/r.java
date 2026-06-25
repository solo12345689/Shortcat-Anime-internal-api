package Be;

import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7244w;
import ye.Z;
import ze.AbstractC7368b;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r extends AbstractC7368b implements InterfaceC7244w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z f1827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC7374h annotations, Z correspondingProperty) {
        super(annotations);
        AbstractC5504s.h(annotations, "annotations");
        AbstractC5504s.h(correspondingProperty, "correspondingProperty");
        this.f1827b = correspondingProperty;
    }
}
