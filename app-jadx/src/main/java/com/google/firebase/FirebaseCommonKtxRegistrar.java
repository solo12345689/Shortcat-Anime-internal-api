package com.google.firebase;

import Gf.AbstractC1637u0;
import Gf.K;
import Ud.AbstractC2279u;
import aa.C2591D;
import aa.C2595c;
import aa.InterfaceC2596d;
import aa.g;
import aa.q;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Laa/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43187a = new a();

        @Override // aa.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC2596d interfaceC2596d) {
            Object objF = interfaceC2596d.f(C2591D.a(Z9.a.class, Executor.class));
            AbstractC5504s.g(objF, "get(...)");
            return AbstractC1637u0.b((Executor) objF);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43188a = new b();

        @Override // aa.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC2596d interfaceC2596d) {
            Object objF = interfaceC2596d.f(C2591D.a(Z9.c.class, Executor.class));
            AbstractC5504s.g(objF, "get(...)");
            return AbstractC1637u0.b((Executor) objF);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f43189a = new c();

        @Override // aa.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC2596d interfaceC2596d) {
            Object objF = interfaceC2596d.f(C2591D.a(Z9.b.class, Executor.class));
            AbstractC5504s.g(objF, "get(...)");
            return AbstractC1637u0.b((Executor) objF);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f43190a = new d();

        @Override // aa.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(InterfaceC2596d interfaceC2596d) {
            Object objF = interfaceC2596d.f(C2591D.a(Z9.d.class, Executor.class));
            AbstractC5504s.g(objF, "get(...)");
            return AbstractC1637u0.b((Executor) objF);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2595c> getComponents() {
        C2595c c2595cD = C2595c.c(C2591D.a(Z9.a.class, K.class)).b(q.j(C2591D.a(Z9.a.class, Executor.class))).f(a.f43187a).d();
        AbstractC5504s.g(c2595cD, "build(...)");
        C2595c c2595cD2 = C2595c.c(C2591D.a(Z9.c.class, K.class)).b(q.j(C2591D.a(Z9.c.class, Executor.class))).f(b.f43188a).d();
        AbstractC5504s.g(c2595cD2, "build(...)");
        C2595c c2595cD3 = C2595c.c(C2591D.a(Z9.b.class, K.class)).b(q.j(C2591D.a(Z9.b.class, Executor.class))).f(c.f43189a).d();
        AbstractC5504s.g(c2595cD3, "build(...)");
        C2595c c2595cD4 = C2595c.c(C2591D.a(Z9.d.class, K.class)).b(q.j(C2591D.a(Z9.d.class, Executor.class))).f(d.f43190a).d();
        AbstractC5504s.g(c2595cD4, "build(...)");
        return AbstractC2279u.p(c2595cD, c2595cD2, c2595cD3, c2595cD4);
    }
}
