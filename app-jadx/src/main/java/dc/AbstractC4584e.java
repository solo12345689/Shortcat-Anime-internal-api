package dc;

import Gf.AbstractC1617k;
import Gf.O;
import Td.L;
import Td.v;
import Ub.A;
import Ub.u;
import ae.AbstractC2605b;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5972b;
import rb.AbstractC6300a;

/* JADX INFO: renamed from: dc.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4584e extends g {

    /* JADX INFO: renamed from: dc.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f45110a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5082a f45111b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5082a interfaceC5082a, Zd.e eVar) {
            super(2, eVar);
            this.f45111b = interfaceC5082a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f45111b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f45110a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f45111b.invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: dc.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f45112a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5082a f45113b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5082a interfaceC5082a, Zd.e eVar) {
            super(2, eVar);
            this.f45113b = interfaceC5082a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new b(this.f45113b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f45112a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f45113b.invoke();
            return L.f17438a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4584e(String name, C5972b[] desiredArgsTypes) {
        super(name, desiredArgsTypes);
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(desiredArgsTypes, "desiredArgsTypes");
    }

    public static final void q(WeakReference weakReference, final String str, final AbstractC4584e abstractC4584e, final Ub.d dVar, final Object[] args, final PromiseImpl promiseImpl) {
        AbstractC5504s.h(args, "args");
        AbstractC5504s.h(promiseImpl, "promiseImpl");
        abstractC4584e.t(dVar, new InterfaceC5082a() { // from class: dc.d
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return AbstractC4584e.r(promiseImpl, abstractC4584e, str, args, dVar);
            }
        });
    }

    public static final L r(PromiseImpl promiseImpl, AbstractC4584e abstractC4584e, String str, Object[] objArr, Ub.d dVar) {
        CodedException unexpectedException;
        CodedException codedException;
        CodedException unexpectedException2;
        try {
            abstractC4584e.s(objArr, promiseImpl, dVar);
            L l10 = L.f17438a;
            return L.f17438a;
        } catch (Throwable th2) {
            try {
                if (th2 instanceof CodedException) {
                    unexpectedException2 = (CodedException) th2;
                } else if (th2 instanceof AbstractC6300a) {
                    String strA = ((AbstractC6300a) th2).a();
                    AbstractC5504s.g(strA, "getCode(...)");
                    unexpectedException2 = new CodedException(strA, ((AbstractC6300a) th2).getMessage(), ((AbstractC6300a) th2).getCause());
                } else {
                    unexpectedException2 = new UnexpectedException(th2);
                }
                throw new cc.m(abstractC4584e.g(), str, unexpectedException2);
            } catch (Throwable th3) {
                if (promiseImpl.getWasSettled()) {
                    throw th3;
                }
                if (th3 instanceof CodedException) {
                    codedException = (CodedException) th3;
                } else {
                    if (th3 instanceof AbstractC6300a) {
                        AbstractC6300a abstractC6300a = (AbstractC6300a) th3;
                        String strA2 = abstractC6300a.a();
                        AbstractC5504s.g(strA2, "getCode(...)");
                        unexpectedException = new CodedException(strA2, abstractC6300a.getMessage(), abstractC6300a.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th3);
                    }
                    codedException = unexpectedException;
                }
                promiseImpl.h(codedException);
            }
        }
    }

    private final void t(Ub.d dVar, InterfaceC5082a interfaceC5082a) {
        k kVarM = m();
        if (kVarM == m.f45117b) {
            AbstractC1617k.d(dVar.y(), null, null, new a(interfaceC5082a, null), 3, null);
        } else {
            if (kVarM != m.f45116a) {
                throw new Td.r();
            }
            AbstractC1617k.d(dVar.x(), null, null, new b(interfaceC5082a, null), 3, null);
        }
    }

    @Override // dc.AbstractC4580a
    public void a(final Ub.d appContext, JSDecoratorsBridgingObject jsObject, final String moduleName) {
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(jsObject, "jsObject");
        AbstractC5504s.h(moduleName, "moduleName");
        final WeakReference weakReferenceA = A.a(appContext);
        String strG = g();
        boolean zI = i();
        boolean zJ = j();
        C5972b[] c5972bArrF = f();
        ArrayList arrayList = new ArrayList(c5972bArrF.length);
        for (C5972b c5972b : c5972bArrF) {
            arrayList.add(c5972b.f());
        }
        jsObject.registerAsyncFunction(strG, zI, zJ, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new JNIAsyncFunctionBody() { // from class: dc.c
            @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
            public final void invoke(Object[] objArr, PromiseImpl promiseImpl) {
                AbstractC4584e.q(weakReferenceA, moduleName, this, appContext, objArr, promiseImpl);
            }
        });
    }

    public abstract void s(Object[] objArr, u uVar, Ub.d dVar);
}
