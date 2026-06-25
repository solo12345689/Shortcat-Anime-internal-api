package Ke;

import Oe.InterfaceC1980a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f11057a;

    public f(g gVar) {
        this.f11057a = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return g.d(this.f11057a, (InterfaceC1980a) obj);
    }
}
