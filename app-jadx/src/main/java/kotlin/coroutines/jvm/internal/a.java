package kotlin.coroutines.jvm.internal;

import Td.u;
import Td.v;
import ae.AbstractC2605b;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Zd.e, e, Serializable {
    private final Zd.e completion;

    public a(Zd.e eVar) {
        this.completion = eVar;
    }

    public Zd.e create(Zd.e completion) {
        AbstractC5504s.h(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        Zd.e eVar = this.completion;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public final Zd.e getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    @Override // Zd.e
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        Zd.e eVar = this;
        while (true) {
            h.b(eVar);
            a aVar = (a) eVar;
            Zd.e eVar2 = aVar.completion;
            AbstractC5504s.e(eVar2);
            try {
                objInvokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th2) {
                u.a aVar2 = u.f17466b;
                obj = u.b(v.a(th2));
            }
            if (objInvokeSuspend == AbstractC2605b.f()) {
                return;
            }
            obj = u.b(objInvokeSuspend);
            aVar.releaseIntercepted();
            if (!(eVar2 instanceof a)) {
                eVar2.resumeWith(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public Zd.e create(Object obj, Zd.e completion) {
        AbstractC5504s.h(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    protected void releaseIntercepted() {
    }
}
