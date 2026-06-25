package df;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ye.H;

/* JADX INFO: renamed from: df.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4617z extends C4593b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S f45178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4617z(List value, S type) {
        super(value, new C4616y(type));
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(type, "type");
        this.f45178c = type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S c(S s10, H it) {
        AbstractC5504s.h(it, "it");
        return s10;
    }

    public final S e() {
        return this.f45178c;
    }
}
