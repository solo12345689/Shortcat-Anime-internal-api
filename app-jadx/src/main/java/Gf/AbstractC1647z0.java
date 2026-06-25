package Gf;

import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Gf.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1647z0 {

    /* JADX INFO: renamed from: Gf.z0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f7617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f7618c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5082a interfaceC5082a, Zd.e eVar) {
            super(2, eVar);
            this.f7618c = interfaceC5082a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f7618c, eVar);
            aVar.f7617b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f7616a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            return AbstractC1647z0.d(((O) this.f7617b).getCoroutineContext(), this.f7618c);
        }
    }

    public static final Object b(Zd.i iVar, InterfaceC5082a interfaceC5082a, Zd.e eVar) {
        return AbstractC1613i.g(iVar, new a(interfaceC5082a, null), eVar);
    }

    public static /* synthetic */ Object c(Zd.i iVar, InterfaceC5082a interfaceC5082a, Zd.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = Zd.j.f23275a;
        }
        return b(iVar, interfaceC5082a, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Zd.i iVar, InterfaceC5082a interfaceC5082a) throws Throwable {
        try {
            a1 a1Var = new a1();
            a1Var.B(F0.k(iVar));
            try {
                return interfaceC5082a.invoke();
            } finally {
                a1Var.y();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
