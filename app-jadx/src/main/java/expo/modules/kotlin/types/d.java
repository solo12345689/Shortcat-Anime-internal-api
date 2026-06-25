package expo.modules.kotlin.types;

import Ud.AbstractC2279u;
import ec.EnumC4666a;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import expo.modules.kotlin.types.ValueOrUndefined;
import expo.modules.kotlin.types.b;
import kotlin.jvm.internal.AbstractC5504s;
import pc.X;
import pe.C6029s;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f46198a;

    public d(X converterProvider, InterfaceC6027q innerType) {
        AbstractC5504s.h(converterProvider, "converterProvider");
        AbstractC5504s.h(innerType, "innerType");
        InterfaceC6027q interfaceC6027qC = ((C6029s) AbstractC2279u.m0(innerType.e())).c();
        if (interfaceC6027qC == null) {
            throw new IllegalArgumentException("The ValueOrUndefined type should contain the argument type.");
        }
        this.f46198a = converterProvider.a(interfaceC6027qC);
    }

    @Override // expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(new SingleType(EnumC4666a.f45852y, new ExpectedType[]{this.f46198a.c()}));
    }

    @Override // expo.modules.kotlin.types.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ValueOrUndefined a(Object obj, Ub.d dVar, boolean z10) {
        return obj instanceof ValueOrUndefined.b ? ValueOrUndefined.b.f46196b : new ValueOrUndefined.c(b.a.a(this.f46198a, obj, dVar, false, 4, null));
    }
}
