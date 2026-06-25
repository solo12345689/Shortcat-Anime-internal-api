package B;

import Gf.O;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Td.L;
import Td.v;
import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import Y.b2;
import Y.h2;
import ae.AbstractC2605b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0 f778c;

        /* JADX INFO: renamed from: B.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0013a implements InterfaceC1743f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f779a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0 f780b;

            C0013a(List list, C0 c02) {
                this.f779a = list;
                this.f780b = c02;
            }

            @Override // Jf.InterfaceC1743f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(j jVar, Zd.e eVar) {
                if (jVar instanceof g) {
                    this.f779a.add(jVar);
                } else if (jVar instanceof h) {
                    this.f779a.remove(((h) jVar).a());
                }
                this.f780b.setValue(kotlin.coroutines.jvm.internal.b.a(!this.f779a.isEmpty()));
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, C0 c02, Zd.e eVar) {
            super(2, eVar);
            this.f777b = kVar;
            this.f778c = c02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f777b, this.f778c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f776a;
            if (i10 == 0) {
                v.b(obj);
                ArrayList arrayList = new ArrayList();
                InterfaceC1742e interfaceC1742eB = this.f777b.b();
                C0013a c0013a = new C0013a(arrayList, this.f778c);
                this.f776a = 1;
                if (interfaceC1742eB.collect(c0013a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    public static final h2 a(k kVar, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1206586544, i10, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:64)");
        }
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            objD = b2.e(Boolean.FALSE, null, 2, null);
            interfaceC2425m.u(objD);
        }
        C0 c02 = (C0) objD;
        int i11 = i10 & 14;
        boolean z10 = ((i11 ^ 6) > 4 && interfaceC2425m.U(kVar)) || (i10 & 6) == 4;
        Object objD2 = interfaceC2425m.D();
        if (z10 || objD2 == aVar.a()) {
            objD2 = new a(kVar, c02, null);
            interfaceC2425m.u(objD2);
        }
        AbstractC2393b0.e(kVar, (Function2) objD2, interfaceC2425m, i11);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c02;
    }
}
