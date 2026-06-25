package ye;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class I extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f65067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f65068b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(List underlyingPropertyNamesToTypes) {
        super(null);
        AbstractC5504s.h(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f65067a = underlyingPropertyNamesToTypes;
        this.f65068b = Ud.S.w(c());
    }

    @Override // ye.r0
    public boolean a(Xe.f name) {
        AbstractC5504s.h(name, "name");
        return this.f65068b.containsKey(name);
    }

    public List c() {
        return this.f65067a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
