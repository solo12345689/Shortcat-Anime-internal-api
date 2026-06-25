package wd;

import Td.InterfaceC2158i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.InterfaceC5499m;
import wd.InterfaceC6964b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class h implements InterfaceC6964b, InterfaceC5499m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Function1 f63008a;

    h(Function1 function) {
        AbstractC5504s.h(function, "function");
        this.f63008a = function;
    }

    @Override // wd.InterfaceC6964b
    public void a(long j10, long j11) {
        InterfaceC6964b.a.a(this, j10, j11);
    }

    @Override // kotlin.jvm.internal.InterfaceC5499m
    public final InterfaceC2158i b() {
        return this.f63008a;
    }

    @Override // wd.InterfaceC6964b
    public final /* synthetic */ void c(double d10) {
        this.f63008a.invoke(Double.valueOf(d10));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC6964b) && (obj instanceof InterfaceC5499m)) {
            return AbstractC5504s.c(b(), ((InterfaceC5499m) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
