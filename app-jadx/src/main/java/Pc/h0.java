package pc;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends AbstractC5988s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f55948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f55950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f55951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Object unconvertedValue, expo.modules.kotlin.types.b typeConverter, Ub.d dVar) {
        super(null);
        AbstractC5504s.h(unconvertedValue, "unconvertedValue");
        AbstractC5504s.h(typeConverter, "typeConverter");
        this.f55948a = unconvertedValue;
        this.f55949b = typeConverter;
        this.f55950c = new WeakReference(dVar);
    }

    public final Object a() {
        if (this.f55951d == null) {
            this.f55951d = this.f55949b.a(this.f55948a, (Ub.d) this.f55950c.get(), true);
        }
        Object obj = this.f55951d;
        AbstractC5504s.e(obj);
        return obj;
    }
}
