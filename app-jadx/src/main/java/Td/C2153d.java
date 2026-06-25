package Td;

import Td.u;
import ae.AbstractC2605b;
import ie.InterfaceC5096o;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.V;

/* JADX INFO: renamed from: Td.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C2153d extends AbstractC2152c implements Zd.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC5096o f17443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f17444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Zd.e f17445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f17446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2153d(InterfaceC5096o block, Object obj) {
        super(null);
        AbstractC5504s.h(block, "block");
        this.f17443a = block;
        this.f17444b = obj;
        AbstractC5504s.f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f17445c = this;
        this.f17446d = AbstractC2151b.f17442a;
    }

    @Override // Td.AbstractC2152c
    public Object a(Object obj, Zd.e eVar) {
        AbstractC5504s.f(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f17445c = eVar;
        this.f17444b = obj;
        Object objF = AbstractC2605b.f();
        if (objF == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objF;
    }

    public final Object c() {
        while (true) {
            Object obj = this.f17446d;
            Zd.e eVar = this.f17445c;
            if (eVar == null) {
                v.b(obj);
                return obj;
            }
            if (u.d(AbstractC2151b.f17442a, obj)) {
                try {
                    InterfaceC5096o interfaceC5096o = this.f17443a;
                    Object obj2 = this.f17444b;
                    Object objD = !(interfaceC5096o instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC2605b.d(interfaceC5096o, this, obj2, eVar) : ((InterfaceC5096o) V.e(interfaceC5096o, 3)).invoke(this, obj2, eVar);
                    if (objD != AbstractC2605b.f()) {
                        eVar.resumeWith(u.b(objD));
                    }
                } catch (Throwable th2) {
                    u.a aVar = u.f17466b;
                    eVar.resumeWith(u.b(v.a(th2)));
                }
            } else {
                this.f17446d = AbstractC2151b.f17442a;
                eVar.resumeWith(obj);
            }
        }
    }

    @Override // Zd.e
    public Zd.i getContext() {
        return Zd.j.f23275a;
    }

    @Override // Zd.e
    public void resumeWith(Object obj) {
        this.f17445c = null;
        this.f17446d = obj;
    }
}
