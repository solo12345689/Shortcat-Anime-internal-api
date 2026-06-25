package com.google.firebase.analytics.connector.internal;

import X9.e;
import aa.C2595c;
import aa.InterfaceC2596d;
import aa.q;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import ja.InterfaceC5359d;
import java.util.Arrays;
import java.util.List;
import ua.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Y9.a lambda$getComponents$0(InterfaceC2596d interfaceC2596d) {
        return Y9.b.c((e) interfaceC2596d.a(e.class), (Context) interfaceC2596d.a(Context.class), (InterfaceC5359d) interfaceC2596d.a(InterfaceC5359d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2595c> getComponents() {
        return Arrays.asList(C2595c.e(Y9.a.class).b(q.k(e.class)).b(q.k(Context.class)).b(q.k(InterfaceC5359d.class)).f(a.f43204a).e().d(), h.b("fire-analytics", "23.0.0"));
    }
}
