package pc;

import Ud.AbstractC2279u;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.EitherOfThree;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import pe.C6029s;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: pc.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5992w extends expo.modules.kotlin.types.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6027q f55969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6027q f55970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6027q f55971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ExpectedType f55975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExpectedType f55976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ExpectedType f55977i;

    public C5992w(X converterProvider, InterfaceC6027q eitherType) {
        AbstractC5504s.h(converterProvider, "converterProvider");
        AbstractC5504s.h(eitherType, "eitherType");
        C6029s c6029s = (C6029s) AbstractC2279u.p0(eitherType.e(), 0);
        InterfaceC6027q interfaceC6027qC = c6029s != null ? c6029s.c() : null;
        if (interfaceC6027qC == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f55969a = interfaceC6027qC;
        C6029s c6029s2 = (C6029s) AbstractC2279u.p0(eitherType.e(), 1);
        InterfaceC6027q interfaceC6027qC2 = c6029s2 != null ? c6029s2.c() : null;
        if (interfaceC6027qC2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f55970b = interfaceC6027qC2;
        C6029s c6029s3 = (C6029s) AbstractC2279u.p0(eitherType.e(), 2);
        InterfaceC6027q interfaceC6027qC3 = c6029s3 != null ? c6029s3.c() : null;
        if (interfaceC6027qC3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f55971c = interfaceC6027qC3;
        expo.modules.kotlin.types.b bVarA = converterProvider.a(interfaceC6027qC);
        this.f55972d = bVarA;
        expo.modules.kotlin.types.b bVarA2 = converterProvider.a(interfaceC6027qC2);
        this.f55973e = bVarA2;
        expo.modules.kotlin.types.b bVarA3 = converterProvider.a(interfaceC6027qC3);
        this.f55974f = bVarA3;
        this.f55975g = bVarA.c();
        this.f55976h = bVarA2.c();
        this.f55977i = bVarA3.c();
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return ExpectedType.INSTANCE.f(this.f55975g, this.f55976h, this.f55977i);
    }

    @Override // expo.modules.kotlin.types.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public EitherOfThree d(Object value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        List listP = AbstractC2279u.p(this.f55969a, this.f55970b, this.f55971c);
        return new EitherOfThree(value, AbstractC2279u.d1(AbstractC5995z.d(value, dVar, AbstractC2279u.p(Td.z.a(this.f55975g, this.f55972d), Td.z.a(this.f55976h, this.f55973e), Td.z.a(this.f55977i, this.f55974f)), listP)), listP);
    }
}
