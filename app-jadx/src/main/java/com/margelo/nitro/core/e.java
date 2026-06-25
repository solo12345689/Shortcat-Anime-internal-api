package com.margelo.nitro.core;

import Td.InterfaceC2158i;
import com.margelo.nitro.core.Promise;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.InterfaceC5499m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class e implements Promise.OnRejectedCallback, InterfaceC5499m {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ Function1 f43974a;

    e(Function1 function) {
        AbstractC5504s.h(function, "function");
        this.f43974a = function;
    }

    @Override // kotlin.jvm.internal.InterfaceC5499m
    public final InterfaceC2158i b() {
        return this.f43974a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Promise.OnRejectedCallback) && (obj instanceof InterfaceC5499m)) {
            return AbstractC5504s.c(b(), ((InterfaceC5499m) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // com.margelo.nitro.core.Promise.OnRejectedCallback
    public final /* synthetic */ void onRejected(Throwable th2) {
        this.f43974a.invoke(th2);
    }
}
