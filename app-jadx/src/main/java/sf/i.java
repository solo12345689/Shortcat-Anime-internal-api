package sf;

import Ud.AbstractC2279u;
import java.util.Arrays;
import java.util.List;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import qf.AbstractC6183d0;
import qf.r0;
import qf.v0;
import rf.AbstractC6317g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends AbstractC6183d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f59627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5387k f59628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f59629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f59630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f59631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f59632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f59633h;

    public /* synthetic */ i(v0 v0Var, InterfaceC5387k interfaceC5387k, k kVar, List list, boolean z10, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0Var, interfaceC5387k, kVar, (i10 & 8) != 0 ? AbstractC2279u.m() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    @Override // qf.S
    public List L0() {
        return this.f59630e;
    }

    @Override // qf.S
    public r0 M0() {
        return r0.f58089b.k();
    }

    @Override // qf.S
    public v0 N0() {
        return this.f59627b;
    }

    @Override // qf.S
    public boolean O0() {
        return this.f59631f;
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: U0 */
    public AbstractC6183d0 R0(boolean z10) {
        v0 v0VarN0 = N0();
        InterfaceC5387k interfaceC5387kO = o();
        k kVar = this.f59629d;
        List listL0 = L0();
        String[] strArr = this.f59632g;
        return new i(v0VarN0, interfaceC5387kO, kVar, listL0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: V0 */
    public AbstractC6183d0 T0(r0 newAttributes) {
        AbstractC5504s.h(newAttributes, "newAttributes");
        return this;
    }

    public final String W0() {
        return this.f59633h;
    }

    public final k X0() {
        return this.f59629d;
    }

    @Override // qf.M0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public i X0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public final i Z0(List newArguments) {
        AbstractC5504s.h(newArguments, "newArguments");
        v0 v0VarN0 = N0();
        InterfaceC5387k interfaceC5387kO = o();
        k kVar = this.f59629d;
        boolean zO0 = O0();
        String[] strArr = this.f59632g;
        return new i(v0VarN0, interfaceC5387kO, kVar, newArguments, zO0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // qf.S
    public InterfaceC5387k o() {
        return this.f59628c;
    }

    public i(v0 constructor, InterfaceC5387k memberScope, k kind, List arguments, boolean z10, String... formatParams) {
        AbstractC5504s.h(constructor, "constructor");
        AbstractC5504s.h(memberScope, "memberScope");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(arguments, "arguments");
        AbstractC5504s.h(formatParams, "formatParams");
        this.f59627b = constructor;
        this.f59628c = memberScope;
        this.f59629d = kind;
        this.f59630e = arguments;
        this.f59631f = z10;
        this.f59632g = formatParams;
        U u10 = U.f52264a;
        String strB = kind.b();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC5504s.g(str, "format(...)");
        this.f59633h = str;
    }
}
