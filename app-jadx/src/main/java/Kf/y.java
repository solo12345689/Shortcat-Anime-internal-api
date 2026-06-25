package Kf;

import Jf.InterfaceC1743f;
import Td.L;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class y implements InterfaceC1743f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zd.i f11136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function2 f11138c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1743f f11141c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
            super(2, eVar);
            this.f11141c = interfaceC1743f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Zd.e eVar) {
            return ((a) create(obj, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f11141c, eVar);
            aVar.f11140b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f11139a;
            if (i10 == 0) {
                Td.v.b(obj);
                Object obj2 = this.f11140b;
                InterfaceC1743f interfaceC1743f = this.f11141c;
                this.f11139a = 1;
                if (interfaceC1743f.emit(obj2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    public y(InterfaceC1743f interfaceC1743f, Zd.i iVar) {
        this.f11136a = iVar;
        this.f11137b = Lf.L.g(iVar);
        this.f11138c = new a(interfaceC1743f, null);
    }

    @Override // Jf.InterfaceC1743f
    public Object emit(Object obj, Zd.e eVar) {
        Object objB = f.b(this.f11136a, obj, this.f11137b, this.f11138c, eVar);
        return objB == AbstractC2605b.f() ? objB : L.f17438a;
    }
}
