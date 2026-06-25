package qf;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ye.InterfaceC7230h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class M extends E0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ye.m0[] f57995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B0[] f57996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f57997e;

    public /* synthetic */ M(ye.m0[] m0VarArr, B0[] b0Arr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(m0VarArr, b0Arr, (i10 & 4) != 0 ? false : z10);
    }

    @Override // qf.E0
    public boolean b() {
        return this.f57997e;
    }

    @Override // qf.E0
    public B0 e(S key) {
        AbstractC5504s.h(key, "key");
        InterfaceC7230h interfaceC7230hP = key.N0().p();
        ye.m0 m0Var = interfaceC7230hP instanceof ye.m0 ? (ye.m0) interfaceC7230hP : null;
        if (m0Var == null) {
            return null;
        }
        int index = m0Var.getIndex();
        ye.m0[] m0VarArr = this.f57995c;
        if (index >= m0VarArr.length || !AbstractC5504s.c(m0VarArr[index].l(), m0Var.l())) {
            return null;
        }
        return this.f57996d[index];
    }

    @Override // qf.E0
    public boolean f() {
        return this.f57996d.length == 0;
    }

    public final B0[] i() {
        return this.f57996d;
    }

    public final ye.m0[] j() {
        return this.f57995c;
    }

    public M(ye.m0[] parameters, B0[] arguments, boolean z10) {
        AbstractC5504s.h(parameters, "parameters");
        AbstractC5504s.h(arguments, "arguments");
        this.f57995c = parameters;
        this.f57996d = arguments;
        this.f57997e = z10;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public M(List parameters, List argumentsList) {
        this((ye.m0[]) parameters.toArray(new ye.m0[0]), (B0[]) argumentsList.toArray(new B0[0]), false, 4, null);
        AbstractC5504s.h(parameters, "parameters");
        AbstractC5504s.h(argumentsList, "argumentsList");
    }
}
