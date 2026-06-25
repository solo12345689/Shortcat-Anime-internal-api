package com.google.firebase.installations;

import aa.C2591D;
import aa.C2595c;
import aa.InterfaceC2596d;
import aa.q;
import ba.AbstractC3039j;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import na.InterfaceC5769e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ InterfaceC5769e a(InterfaceC2596d interfaceC2596d) {
        return new c((X9.e) interfaceC2596d.a(X9.e.class), interfaceC2596d.e(ka.i.class), (ExecutorService) interfaceC2596d.f(C2591D.a(Z9.a.class, ExecutorService.class)), AbstractC3039j.a((Executor) interfaceC2596d.f(C2591D.a(Z9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2595c> getComponents() {
        return Arrays.asList(C2595c.e(InterfaceC5769e.class).h(LIBRARY_NAME).b(q.k(X9.e.class)).b(q.i(ka.i.class)).b(q.j(C2591D.a(Z9.a.class, ExecutorService.class))).b(q.j(C2591D.a(Z9.b.class, Executor.class))).f(new aa.g() { // from class: na.f
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return FirebaseInstallationsRegistrar.a(interfaceC2596d);
            }
        }).d(), ka.h.a(), ua.h.b(LIBRARY_NAME, "19.1.0"));
    }
}
