package dc;

import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5972b;
import pc.U;
import rb.AbstractC6300a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends AbstractC4580a {

    /* JADX INFO: renamed from: g */
    private final U f45138g;

    /* JADX INFO: renamed from: h */
    private final Function1 f45139h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String name, C5972b[] argTypes, U returnType, Function1 body) {
        super(name, argTypes);
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(argTypes, "argTypes");
        AbstractC5504s.h(returnType, "returnType");
        AbstractC5504s.h(body, "body");
        this.f45138g = returnType;
        this.f45139h = body;
    }

    public static final Object q(r rVar, String str, Ub.d dVar, Object[] args) throws cc.m {
        CodedException unexpectedException;
        AbstractC5504s.h(args, "args");
        try {
            return rVar.f45138g.b(rVar.o(args, dVar));
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
            throw new cc.m(rVar.g(), str, unexpectedException);
        }
    }

    @Override // dc.AbstractC4580a
    public void a(Ub.d appContext, JSDecoratorsBridgingObject jsObject, String moduleName) {
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(jsObject, "jsObject");
        AbstractC5504s.h(moduleName, "moduleName");
        jsObject.registerSyncFunction(g(), i(), j(), (ExpectedType[]) e().toArray(new ExpectedType[0]), this.f45138g.c().b(), p(moduleName, appContext));
    }

    public final Object o(Object[] args, Ub.d dVar) {
        AbstractC5504s.h(args, "args");
        return this.f45139h.invoke(AbstractC4580a.c(this, args, dVar, false, 4, null));
    }

    public final JNIFunctionBody p(final String moduleName, final Ub.d dVar) {
        AbstractC5504s.h(moduleName, "moduleName");
        return new JNIFunctionBody() { // from class: dc.q
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                return r.q(this.f45135a, moduleName, dVar, objArr);
            }
        };
    }
}
