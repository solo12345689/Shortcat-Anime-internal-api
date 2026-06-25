package expo.modules.kotlin.views;

import android.view.View;
import ec.EnumC4666a;
import expo.modules.kotlin.jni.ExpectedType;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;
import pe.InterfaceC6016f;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends expo.modules.kotlin.types.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6027q f46244a;

    public u(InterfaceC6027q type) {
        AbstractC5504s.h(type, "type");
        this.f46244a = type;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(EnumC4666a.f45832e, EnumC4666a.f45847t);
    }

    @Override // expo.modules.kotlin.types.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public View d(Object value, Ub.d dVar, boolean z10) throws cc.j, cc.g, cc.e {
        AbstractC5504s.h(value, "value");
        if (dVar == null) {
            throw new cc.e();
        }
        dVar.g();
        int iIntValue = ((Integer) value).intValue();
        View viewK = dVar.k(iIntValue);
        if (viewK != null) {
            return viewK;
        }
        InterfaceC6016f interfaceC6016fC = this.f46244a.c();
        AbstractC5504s.f(interfaceC6016fC, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        throw new cc.j((InterfaceC6014d) interfaceC6016fC, iIntValue);
    }
}
