package pc;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import ec.EnumC4666a;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;
import kotlin.jvm.internal.AbstractC5504s;
import qb.C6167a;
import qb.InterfaceC6168b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class T extends AbstractC5990u {
    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(EnumC4666a.f45840m);
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InterfaceC6168b e(Object value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        return new C6167a(((ReadableMap) value).toHashMap());
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public InterfaceC6168b f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
        AbstractC5504s.h(value, "value");
        ReadableMap readableMapAsMap = value.asMap();
        if (readableMapAsMap != null) {
            return new C6167a(readableMapAsMap.toHashMap());
        }
        throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableMap.class));
    }
}
