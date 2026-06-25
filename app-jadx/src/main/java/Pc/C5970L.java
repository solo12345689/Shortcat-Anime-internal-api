package pc;

import Ud.AbstractC2279u;
import ec.EnumC4666a;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;
import kotlin.jvm.internal.AbstractC5504s;
import pe.C6029s;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: pc.L, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5970L extends expo.modules.kotlin.types.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6027q f55893a;

    public C5970L(InterfaceC6027q type) {
        AbstractC5504s.h(type, "type");
        this.f55893a = type;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(EnumC4666a.f45849v);
    }

    @Override // expo.modules.kotlin.types.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public JavaScriptFunction d(Object value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        JavaScriptFunction javaScriptFunction = (JavaScriptFunction) value;
        InterfaceC6027q interfaceC6027qC = ((C6029s) AbstractC2279u.m0(this.f55893a.e())).c();
        if (interfaceC6027qC == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        javaScriptFunction.b(interfaceC6027qC);
        return javaScriptFunction;
    }
}
