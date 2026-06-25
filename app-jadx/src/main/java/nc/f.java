package nc;

import com.facebook.react.bridge.Dynamic;
import ec.EnumC4666a;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedObject;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends expo.modules.kotlin.types.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6027q f54111a;

    public f(InterfaceC6027q type) {
        AbstractC5504s.h(type, "type");
        this.f54111a = type;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(EnumC4666a.f45848u, EnumC4666a.f45832e);
    }

    @Override // expo.modules.kotlin.types.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SharedObject d(Object value, Ub.d dVar, boolean z10) throws cc.e {
        AbstractC5504s.h(value, "value");
        int iB = C5776c.b(value instanceof Dynamic ? ((Dynamic) value).asInt() : ((Integer) value).intValue());
        if (dVar == null) {
            throw new cc.e();
        }
        SharedObject sharedObjectF = C5776c.f(iB, dVar.D());
        AbstractC5504s.f(sharedObjectF, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedObjectTypeConverter");
        return sharedObjectF;
    }
}
