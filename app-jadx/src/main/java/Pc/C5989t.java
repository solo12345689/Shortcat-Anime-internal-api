package pc;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import ec.EnumC4666a;
import expo.modules.kotlin.jni.ExpectedType;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pc.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5989t extends AbstractC5990u {
    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(EnumC4666a.f45831d);
    }

    @Override // pc.AbstractC5990u
    public /* bridge */ /* synthetic */ Object e(Object obj, Ub.d dVar, boolean z10) {
        return Ef.a.k(g(obj, dVar, z10));
    }

    @Override // pc.AbstractC5990u
    public /* bridge */ /* synthetic */ Object f(Dynamic dynamic, Ub.d dVar, boolean z10) {
        return Ef.a.k(h(dynamic, dVar, z10));
    }

    public long g(Object value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        return Ef.c.r(((Double) value).doubleValue(), Ef.d.f5971e);
    }

    public long h(Dynamic value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        if (value.getType() == ReadableType.Number) {
            return Ef.c.r(value.asDouble(), Ef.d.f5971e);
        }
        throw new IllegalArgumentException("Expected a number, but received " + value.getType());
    }
}
