package pc;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pc.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5984n extends AbstractC5988s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f55955a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5984n(Object convertedValue) {
        super(null);
        AbstractC5504s.h(convertedValue, "convertedValue");
        this.f55955a = convertedValue;
    }

    public final Object a() {
        return this.f55955a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5984n) && AbstractC5504s.c(this.f55955a, ((C5984n) obj).f55955a);
    }

    public int hashCode() {
        return this.f55955a.hashCode();
    }

    public String toString() {
        return "ConvertedValue(convertedValue=" + this.f55955a + ")";
    }
}
