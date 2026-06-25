package Kf;

import Gf.F0;
import Jf.InterfaceC1743f;
import Td.L;
import Zd.i;
import ae.AbstractC2605b;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r extends kotlin.coroutines.jvm.internal.d implements InterfaceC1743f, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1743f f11125a;

    /* JADX INFO: renamed from: b */
    public final Zd.i f11126b;

    /* JADX INFO: renamed from: c */
    public final int f11127c;

    /* JADX INFO: renamed from: d */
    private Zd.i f11128d;

    /* JADX INFO: renamed from: e */
    private Zd.e f11129e;

    public r(InterfaceC1743f interfaceC1743f, Zd.i iVar) {
        super(n.f11119a, Zd.j.f23275a);
        this.f11125a = interfaceC1743f;
        this.f11126b = iVar;
        this.f11127c = ((Number) iVar.y1(0, new Function2() { // from class: Kf.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(r.k(((Integer) obj).intValue(), (i.b) obj2));
            }
        })).intValue();
    }

    private final void i(Zd.i iVar, Zd.i iVar2, Object obj) {
        if (iVar2 instanceof k) {
            t((k) iVar2, obj);
        }
        u.b(this, iVar);
    }

    public static final int k(int i10, i.b bVar) {
        return i10 + 1;
    }

    private final Object s(Zd.e eVar, Object obj) {
        Zd.i context = eVar.getContext();
        F0.j(context);
        Zd.i iVar = this.f11128d;
        if (iVar != context) {
            i(context, iVar, obj);
            this.f11128d = context;
        }
        this.f11129e = eVar;
        InterfaceC5096o interfaceC5096o = s.f11130a;
        InterfaceC1743f interfaceC1743f = this.f11125a;
        AbstractC5504s.f(interfaceC1743f, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC5504s.f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = interfaceC5096o.invoke(interfaceC1743f, obj, this);
        if (!AbstractC5504s.c(objInvoke, AbstractC2605b.f())) {
            this.f11129e = null;
        }
        return objInvoke;
    }

    private final void t(k kVar, Object obj) {
        throw new IllegalStateException(Df.r.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + kVar.f11118b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // Jf.InterfaceC1743f
    public Object emit(Object obj, Zd.e eVar) {
        try {
            Object objS = s(eVar, obj);
            if (objS == AbstractC2605b.f()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            return objS == AbstractC2605b.f() ? objS : L.f17438a;
        } catch (Throwable th2) {
            this.f11128d = new k(th2, eVar.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Zd.e eVar = this.f11129e;
        if (eVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) eVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, Zd.e
    public Zd.i getContext() {
        Zd.i iVar = this.f11128d;
        return iVar == null ? Zd.j.f23275a : iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected Object invokeSuspend(Object obj) {
        Throwable thE = Td.u.e(obj);
        if (thE != null) {
            this.f11128d = new k(thE, getContext());
        }
        Zd.e eVar = this.f11129e;
        if (eVar != null) {
            eVar.resumeWith(obj);
        }
        return AbstractC2605b.f();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
