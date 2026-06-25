package pc;

import com.facebook.react.bridge.Dynamic;
import ec.EnumC4666a;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class Q implements expo.modules.kotlin.types.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55903a;

    public Q(expo.modules.kotlin.types.b innerConverter) {
        AbstractC5504s.h(innerConverter, "innerConverter");
        this.f55903a = innerConverter;
    }

    @Override // expo.modules.kotlin.types.b
    public Object a(Object obj, Ub.d dVar, boolean z10) {
        if (obj == null) {
            return null;
        }
        boolean z11 = obj instanceof Dynamic;
        if (z11 && ((Dynamic) obj).isNull()) {
            return null;
        }
        return (!this.f55903a.b() || z10 || z11) ? this.f55903a.a(obj, dVar, z10) : obj;
    }

    @Override // expo.modules.kotlin.types.b
    public boolean b() {
        return this.f55903a.b();
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(new SingleType(EnumC4666a.f45851x, new ExpectedType[]{this.f55903a.c()}));
    }
}
