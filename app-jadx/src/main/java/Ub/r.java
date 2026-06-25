package Ub;

import Gf.AbstractC1617k;
import Gf.O;
import Td.AbstractC2163n;
import Td.L;
import ae.AbstractC2605b;
import bc.AbstractC3044c;
import bc.C3042a;
import bc.C3045d;
import bc.EnumC3046e;
import dc.AbstractC4584e;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JavaScriptModuleObject_;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import hc.C4936h;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import rb.AbstractC6300a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a */
    private final gc.c f19438a;

    /* JADX INFO: renamed from: b */
    private final String f19439b;

    /* JADX INFO: renamed from: c */
    private final gc.e f19440c;

    /* JADX INFO: renamed from: d */
    private boolean f19441d;

    /* JADX INFO: renamed from: e */
    private final Lazy f19442e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f19443a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f19444b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ r f19445c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, r rVar, Zd.e eVar) {
            super(2, eVar);
            this.f19444b = function2;
            this.f19445c = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f19444b, this.f19445c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f19443a;
            if (i10 == 0) {
                Td.v.b(obj);
                Function2 function2 = this.f19444b;
                Wb.m mVarM = this.f19445c.g().i().m();
                this.f19443a = 1;
                if (function2.invoke(mVarM, this) == objF) {
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

    public r(gc.c module, String str) {
        AbstractC5504s.h(module, "module");
        this.f19438a = module;
        this.f19439b = str;
        this.f19440c = module.n();
        this.f19442e = AbstractC2163n.b(new InterfaceC5082a() { // from class: Ub.q
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return r.j(this.f19437a);
            }
        });
    }

    public final void d(JSDecoratorsBridgingObject jSDecoratorsBridgingObject, d dVar, lc.b bVar) {
        jSDecoratorsBridgingObject.k(h());
        gc.e eVar = this.f19440c;
        C4936h c4936hF = eVar.f();
        jSDecoratorsBridgingObject.e(c4936hF);
        jSDecoratorsBridgingObject.f(c4936hF, eVar.e(), dVar);
        jSDecoratorsBridgingObject.g(c4936hF, dVar);
        jSDecoratorsBridgingObject.j(eVar.h(), eVar.e(), dVar, bVar);
        jSDecoratorsBridgingObject.d(eVar.b(), dVar, bVar);
    }

    public static final JavaScriptModuleObject_ j(r rVar) {
        rVar.f19441d = true;
        X3.a.c("[ExpoModulesCore] " + (rVar.h() + ".jsObject"));
        try {
            d dVarI = rVar.g().i();
            lc.b bVarP = rVar.g().p();
            JNIDeallocator jNIDeallocatorC = bVarP.c();
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(jNIDeallocatorC);
            rVar.d(jSDecoratorsBridgingObject, dVarI, bVarP);
            JavaScriptModuleObject_ javaScriptModuleObject_ = new JavaScriptModuleObject_(jNIDeallocatorC, rVar.h());
            javaScriptModuleObject_.decorate(jSDecoratorsBridgingObject);
            return javaScriptModuleObject_;
        } finally {
            X3.a.f();
        }
    }

    public final void c(String methodName, Object[] args, u promise) throws cc.m {
        CodedException unexpectedException;
        AbstractC5504s.h(methodName, "methodName");
        AbstractC5504s.h(args, "args");
        AbstractC5504s.h(promise, "promise");
        try {
            dc.g gVar = (dc.g) e().a().get(methodName);
            if (gVar == null) {
                throw new cc.q();
            }
            if (gVar instanceof AbstractC4584e) {
                ((AbstractC4584e) gVar).s(args, promise, g().i());
                L l10 = L.f17438a;
            } else {
                throw new IllegalStateException("Cannot call a " + gVar + " method in test context");
            }
        } catch (Throwable th2) {
            if (th2 instanceof CodedException) {
                unexpectedException = (CodedException) th2;
            } else if (th2 instanceof AbstractC6300a) {
                AbstractC6300a abstractC6300a = (AbstractC6300a) th2;
                String strA = abstractC6300a.a();
                AbstractC5504s.g(strA, "getCode(...)");
                unexpectedException = new CodedException(strA, abstractC6300a.getMessage(), abstractC6300a.getCause());
            } else {
                unexpectedException = new UnexpectedException(th2);
            }
            throw new cc.m(methodName, h(), unexpectedException);
        }
    }

    public final gc.e e() {
        return this.f19440c;
    }

    public final JavaScriptModuleObject_ f() {
        return (JavaScriptModuleObject_) this.f19442e.getValue();
    }

    public final gc.c g() {
        return this.f19438a;
    }

    public final String h() {
        String str = this.f19439b;
        return str == null ? this.f19440c.e() : str;
    }

    public final JavaScriptModuleObject_ i() {
        if (this.f19441d) {
            return f();
        }
        return null;
    }

    public final void k(EnumC3046e eventName) {
        AbstractC5504s.h(eventName, "eventName");
        AbstractC3044c abstractC3044c = (AbstractC3044c) this.f19440c.c().get(eventName);
        if (abstractC3044c == null) {
            return;
        }
        C3042a c3042a = abstractC3044c instanceof C3042a ? (C3042a) abstractC3044c : null;
        if (c3042a != null) {
            c3042a.a();
        }
    }

    public final void l(EnumC3046e eventName, Object obj) {
        AbstractC5504s.h(eventName, "eventName");
    }

    public final void m(EnumC3046e eventName, Object obj, Object obj2) {
        AbstractC5504s.h(eventName, "eventName");
        AbstractC3044c abstractC3044c = (AbstractC3044c) this.f19440c.c().get(eventName);
        if (abstractC3044c == null) {
            return;
        }
        C3045d c3045d = abstractC3044c instanceof C3045d ? (C3045d) abstractC3044c : null;
        if (c3045d != null) {
            c3045d.a(obj, obj2);
        }
    }

    public final void n() {
        Function2 function2G = this.f19440c.g();
        if (function2G != null) {
            AbstractC1617k.d(this.f19438a.i().x(), null, null, new a(function2G, this, null), 3, null);
        }
    }
}
