package pc;

import Ud.AbstractC2279u;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.EitherOfFour;
import kotlin.jvm.internal.AbstractC5504s;
import pe.C6029s;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: pc.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5991v extends expo.modules.kotlin.types.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6027q f55957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6027q f55958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6027q f55959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6027q f55960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ExpectedType f55965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ExpectedType f55966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ExpectedType f55967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExpectedType f55968l;

    public C5991v(X converterProvider, InterfaceC6027q eitherType) {
        AbstractC5504s.h(converterProvider, "converterProvider");
        AbstractC5504s.h(eitherType, "eitherType");
        C6029s c6029s = (C6029s) AbstractC2279u.p0(eitherType.e(), 0);
        InterfaceC6027q interfaceC6027qC = c6029s != null ? c6029s.c() : null;
        if (interfaceC6027qC == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f55957a = interfaceC6027qC;
        C6029s c6029s2 = (C6029s) AbstractC2279u.p0(eitherType.e(), 1);
        InterfaceC6027q interfaceC6027qC2 = c6029s2 != null ? c6029s2.c() : null;
        if (interfaceC6027qC2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f55958b = interfaceC6027qC2;
        C6029s c6029s3 = (C6029s) AbstractC2279u.p0(eitherType.e(), 2);
        InterfaceC6027q interfaceC6027qC3 = c6029s3 != null ? c6029s3.c() : null;
        if (interfaceC6027qC3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f55959c = interfaceC6027qC3;
        C6029s c6029s4 = (C6029s) AbstractC2279u.p0(eitherType.e(), 3);
        InterfaceC6027q interfaceC6027qC4 = c6029s4 != null ? c6029s4.c() : null;
        if (interfaceC6027qC4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f55960d = interfaceC6027qC4;
        expo.modules.kotlin.types.b bVarA = converterProvider.a(interfaceC6027qC);
        this.f55961e = bVarA;
        expo.modules.kotlin.types.b bVarA2 = converterProvider.a(interfaceC6027qC2);
        this.f55962f = bVarA2;
        expo.modules.kotlin.types.b bVarA3 = converterProvider.a(interfaceC6027qC3);
        this.f55963g = bVarA3;
        expo.modules.kotlin.types.b bVarA4 = converterProvider.a(interfaceC6027qC4);
        this.f55964h = bVarA4;
        this.f55965i = bVarA.c();
        this.f55966j = bVarA2.c();
        this.f55967k = bVarA3.c();
        this.f55968l = bVarA4.c();
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return ExpectedType.INSTANCE.f(this.f55965i, this.f55966j, this.f55967k, this.f55968l);
    }

    @Override // expo.modules.kotlin.types.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public EitherOfFour d(Object value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        return new EitherOfFour(value, AbstractC2279u.d1(AbstractC5995z.d(value, dVar, AbstractC2279u.p(Td.z.a(this.f55965i, this.f55961e), Td.z.a(this.f55966j, this.f55962f), Td.z.a(this.f55967k, this.f55963g), Td.z.a(this.f55968l, this.f55964h)), AbstractC2279u.p(this.f55957a, this.f55958b, this.f55959c, this.f55960d))), AbstractC2279u.p(this.f55957a, this.f55958b, this.f55959c, this.f55960d));
    }
}
