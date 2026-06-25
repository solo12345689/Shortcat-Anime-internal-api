package bf;

import kotlin.jvm.functions.Function2;
import ye.InterfaceC7223a;
import ye.InterfaceC7235m;

/* JADX INFO: loaded from: classes5.dex */
class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7223a f33296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7223a f33297b;

    public f(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2) {
        this.f33296a = interfaceC7223a;
        this.f33297b = interfaceC7223a2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(g.i(this.f33296a, this.f33297b, (InterfaceC7235m) obj, (InterfaceC7235m) obj2));
    }
}
