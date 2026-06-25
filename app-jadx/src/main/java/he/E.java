package He;

import java.util.EnumMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f8432a;

    public E(EnumMap defaultQualifiers) {
        AbstractC5504s.h(defaultQualifiers, "defaultQualifiers");
        this.f8432a = defaultQualifiers;
    }

    public final w a(EnumC1656c enumC1656c) {
        return (w) this.f8432a.get(enumC1656c);
    }

    public final EnumMap b() {
        return this.f8432a;
    }
}
