package pc;

import Ud.AbstractC2279u;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.Either;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import pe.C6029s;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: pc.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5993x extends expo.modules.kotlin.types.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6027q f55978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6027q f55979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExpectedType f55982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExpectedType f55983f;

    public C5993x(X converterProvider, InterfaceC6027q eitherType) {
        AbstractC5504s.h(converterProvider, "converterProvider");
        AbstractC5504s.h(eitherType, "eitherType");
        C6029s c6029s = (C6029s) AbstractC2279u.p0(eitherType.e(), 0);
        InterfaceC6027q interfaceC6027qC = c6029s != null ? c6029s.c() : null;
        if (interfaceC6027qC == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f55978a = interfaceC6027qC;
        C6029s c6029s2 = (C6029s) AbstractC2279u.p0(eitherType.e(), 1);
        InterfaceC6027q interfaceC6027qC2 = c6029s2 != null ? c6029s2.c() : null;
        if (interfaceC6027qC2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f55979b = interfaceC6027qC2;
        expo.modules.kotlin.types.b bVarA = converterProvider.a(interfaceC6027qC);
        this.f55980c = bVarA;
        expo.modules.kotlin.types.b bVarA2 = converterProvider.a(interfaceC6027qC2);
        this.f55981d = bVarA2;
        this.f55982e = bVarA.c();
        this.f55983f = bVarA2.c();
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return ExpectedType.INSTANCE.f(this.f55982e, this.f55983f);
    }

    @Override // expo.modules.kotlin.types.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Either d(Object value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        List listP = AbstractC2279u.p(this.f55978a, this.f55979b);
        return new Either(value, AbstractC2279u.d1(AbstractC5995z.d(value, dVar, AbstractC2279u.p(Td.z.a(this.f55982e, this.f55980c), Td.z.a(this.f55983f, this.f55981d)), listP)), listP);
    }
}
