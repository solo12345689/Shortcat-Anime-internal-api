package tc;

import Ub.d;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.worklets.Serializable;
import expo.modules.kotlin.jni.worklets.Worklet;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6661b extends expo.modules.kotlin.types.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f60869a;

    public C6661b(expo.modules.kotlin.types.b serializableTypeConverter) {
        AbstractC5504s.h(serializableTypeConverter, "serializableTypeConverter");
        this.f60869a = serializableTypeConverter;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return this.f60869a.c();
    }

    @Override // expo.modules.kotlin.types.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Worklet d(Object value, d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        Serializable serializable = (Serializable) this.f60869a.a(value, dVar, z10);
        if (serializable == null) {
            throw new IllegalArgumentException("Cannot convert '" + value + "' to Serializable.");
        }
        if (serializable.getType() == Serializable.a.f46163l) {
            return new Worklet(serializable);
        }
        throw new IllegalArgumentException("Expected Serializable of type Worklet but got " + serializable.getType() + ".");
    }
}
