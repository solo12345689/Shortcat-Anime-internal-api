package pc;

import ec.EnumC4666a;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pc.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5977g extends expo.modules.kotlin.types.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f55945a;

    public AbstractC5977g(Function1 typedArrayWrapper) {
        AbstractC5504s.h(typedArrayWrapper, "typedArrayWrapper");
        this.f55945a = typedArrayWrapper;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(EnumC4666a.f45842o);
    }

    @Override // expo.modules.kotlin.types.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public oc.j d(Object value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        return f((JavaScriptTypedArray) value);
    }

    public final oc.j f(JavaScriptTypedArray value) {
        AbstractC5504s.h(value, "value");
        return (oc.j) this.f55945a.invoke(value);
    }
}
