package expo.modules.fetch;

import Bb.g;
import Bb.h;
import Bb.m;
import Bb.o;
import Bb.p;
import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.O;
import Td.L;
import Td.v;
import Td.z;
import Ub.d;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Zd.e;
import ae.AbstractC2605b;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import com.amazon.a.a.o.b.f;
import dg.E;
import dg.F;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import dg.t;
import expo.modules.fetch.NativeResponse;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import tg.InterfaceC6685j;
import ub.AbstractC6754f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001YB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\r\u0010 \u001a\u00020\u0016¢\u0006\u0004\b \u0010\u001aJ/\u0010%\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160#¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R*\u0010=\u001a\u00020\n2\u0006\u00107\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b*\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010B\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0#j\u0002`?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR(\u0010G\u001a\u0004\u0018\u00010\u00112\b\u00107\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR4\u0010M\u001a\n\u0018\u00010Hj\u0004\u0018\u0001`I2\u000e\u00107\u001a\n\u0018\u00010Hj\u0004\u0018\u0001`I8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010J\u001a\u0004\bK\u0010LR$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0011\u0010X\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Ldg/f;", "LUb/d;", "appContext", "LGf/O;", "coroutineScope", "<init>", "(LUb/d;LGf/O;)V", "", "LBb/p;", "validStates", "", "u1", "([LBb/p;)Z", "Ldg/E;", "response", "LBb/m;", "B0", "(Ldg/E;)LBb/m;", "Ltg/j;", "stream", "LTd/L;", "D1", "(Ltg/j;)V", "b", "()V", "A1", "", "Y1", "()[B", "p0", "F0", "", "states", "Lkotlin/Function1;", "callback", "Z1", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Ldg/e;", "call", "Ljava/io/IOException;", "e", "j", "(Ldg/e;Ljava/io/IOException;)V", "h", "(Ldg/e;Ldg/E;)V", "c", "LGf/O;", "LBb/o;", "d", "LBb/o;", "q1", "()LBb/o;", "sink", "value", "LBb/p;", "t1", "()LBb/p;", "S1", "(LBb/p;)V", "state", "", "Lexpo/modules/fetch/StateChangeListener;", "f", "Ljava/util/List;", "stateChangeOnceListeners", "g", "LBb/m;", "a1", "()LBb/m;", "responseInit", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "M0", "()Ljava/lang/Exception;", LogEvent.LEVEL_ERROR, "Lexpo/modules/fetch/NativeRequestRedirect;", "i", "Lexpo/modules/fetch/NativeRequestRedirect;", "getRedirectMode", "()Lexpo/modules/fetch/NativeRequestRedirect;", "O1", "(Lexpo/modules/fetch/NativeRequestRedirect;)V", "redirectMode", "G0", "()Z", "bodyUsed", "a", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeResponse extends SharedObject implements InterfaceC4625f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f46075k = NativeResponse.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final O coroutineScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o sink;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private p state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List stateChangeOnceListeners;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private m responseInit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Exception error;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private NativeRequestRedirect redirectMode;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f46084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NativeResponse f46085c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(E e10, NativeResponse nativeResponse, e eVar) {
            super(2, eVar);
            this.f46084b = e10;
            this.f46085c = nativeResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new b(this.f46084b, this.f46085c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC6685j interfaceC6685jK;
            AbstractC2605b.f();
            if (this.f46083a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            F fJ = this.f46084b.j();
            if (fJ == null || (interfaceC6685jK = fJ.k()) == null) {
                return L.f17438a;
            }
            this.f46085c.D1(interfaceC6685jK);
            this.f46084b.close();
            if (this.f46085c.t1() == p.f1642f) {
                this.f46085c.g("didComplete", new Object[0]);
            }
            this.f46085c.S1(p.f1641e);
            this.f46085c.g("readyForJSFinalization", new Object[0]);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f46086a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f46088c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p pVar, e eVar) {
            super(2, eVar);
            this.f46088c = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i(p pVar, Function1 function1) {
            return ((Boolean) function1.invoke(pVar)).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return NativeResponse.this.new c(this.f46088c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f46086a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            List list = NativeResponse.this.stateChangeOnceListeners;
            final p pVar = this.f46088c;
            AbstractC2279u.K(list, new Function1() { // from class: expo.modules.fetch.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(NativeResponse.c.i(pVar, (Function1) obj2));
                }
            });
            return L.f17438a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeResponse(d appContext, O coroutineScope) {
        super(appContext);
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.sink = new o();
        this.state = p.f1638b;
        this.stateChangeOnceListeners = new ArrayList();
    }

    private final m B0(E response) {
        int iO = response.o();
        String strO = response.O();
        t<Pair> tVarE = response.E();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(tVarE, 10));
        for (Pair pair : tVarE) {
            arrayList.add(z.a(pair.c(), pair.d()));
        }
        return new m(arrayList, iO, strO, response.F0().p().toString(), response.H());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(InterfaceC6685j stream) {
        while (!stream.f1()) {
            try {
                p pVar = p.f1640d;
                p pVar2 = p.f1642f;
                if (u1(pVar, pVar2, p.f1643g)) {
                    return;
                }
                if (t1() == pVar) {
                    this.sink.a(stream.s().e1());
                } else if (t1() != pVar2) {
                    return;
                } else {
                    g("didReceiveResponseData", stream.s().e1());
                }
            } catch (IOException e10) {
                this.error = e10;
                if (t1() == p.f1642f) {
                    g("didFailWithError", AbstractC6754f.a(e10));
                }
                S1(p.f1644h);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1(p pVar) {
        synchronized (this) {
            this.state = pVar;
            L l10 = L.f17438a;
        }
        AbstractC1617k.d(this.coroutineScope, null, null, new c(pVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a2(List list, Function1 function1, p newState) {
        AbstractC5504s.h(newState, "newState");
        if (!list.contains(newState)) {
            return false;
        }
        function1.invoke(newState);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p t1() {
        p pVar;
        synchronized (this) {
            pVar = this.state;
        }
        return pVar;
    }

    private final boolean u1(p... validStates) {
        if (AbstractC2273n.R(validStates, t1())) {
            return false;
        }
        String strY0 = AbstractC2273n.y0(validStates, f.f34694a, null, null, 0, null, new Function1() { // from class: Bb.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NativeResponse.y1((p) obj);
            }
        }, 30, null);
        Log.w(f46075k, "Invalid state - currentState[" + t1().b() + "] validStates[" + strY0 + "]");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence y1(p it) {
        AbstractC5504s.h(it, "it");
        return String.valueOf(it.b());
    }

    public final void A1() {
        if (u1(p.f1638b)) {
            return;
        }
        S1(p.f1639c);
    }

    public final void F0() {
        h hVar = new h();
        this.error = hVar;
        if (t1() == p.f1642f) {
            g("didFailWithError", AbstractC6754f.a(hVar));
        }
        S1(p.f1644h);
    }

    public final boolean G0() {
        return this.sink.c();
    }

    /* JADX INFO: renamed from: M0, reason: from getter */
    public final Exception getError() {
        return this.error;
    }

    public final void O1(NativeRequestRedirect nativeRequestRedirect) {
        this.redirectMode = nativeRequestRedirect;
    }

    public final byte[] Y1() {
        p pVar = p.f1640d;
        p pVar2 = p.f1641e;
        if (u1(pVar, pVar2)) {
            return null;
        }
        if (t1() == pVar) {
            S1(p.f1642f);
            g("didReceiveResponseData", this.sink.b(false).array());
        } else if (t1() == pVar2) {
            return this.sink.b(false).array();
        }
        return null;
    }

    public final void Z1(final List states, final Function1 callback) {
        AbstractC5504s.h(states, "states");
        AbstractC5504s.h(callback, "callback");
        if (states.contains(t1())) {
            callback.invoke(t1());
        } else {
            this.stateChangeOnceListeners.add(new Function1() { // from class: Bb.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(NativeResponse.a2(states, callback, (p) obj));
                }
            });
        }
    }

    /* JADX INFO: renamed from: a1, reason: from getter */
    public final m getResponseInit() {
        return this.responseInit;
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void b() {
        this.sink.b(false);
        super.b();
    }

    @Override // dg.InterfaceC4625f
    public void h(InterfaceC4624e call, E response) {
        AbstractC5504s.h(call, "call");
        AbstractC5504s.h(response, "response");
        if (!response.H() || this.redirectMode != NativeRequestRedirect.ERROR) {
            this.responseInit = B0(response);
            S1(p.f1640d);
            AbstractC1617k.d(this.coroutineScope, C1608f0.b(), null, new b(response, this, null), 2, null);
            return;
        }
        response.close();
        g gVar = new g();
        this.error = gVar;
        if (t1() == p.f1642f) {
            g("didFailWithError", AbstractC6754f.a(gVar));
        }
        S1(p.f1644h);
        g("readyForJSFinalization", new Object[0]);
    }

    @Override // dg.InterfaceC4625f
    public void j(InterfaceC4624e call, IOException e10) {
        AbstractC5504s.h(call, "call");
        AbstractC5504s.h(e10, "e");
        if (AbstractC5504s.c(e10.getMessage(), "Canceled")) {
            return;
        }
        p pVar = p.f1639c;
        p pVar2 = p.f1640d;
        p pVar3 = p.f1642f;
        if (u1(pVar, pVar2, pVar3, p.f1643g)) {
            return;
        }
        if (t1() == pVar3) {
            g("didFailWithError", AbstractC6754f.a(e10));
        }
        this.error = e10;
        S1(p.f1644h);
        g("readyForJSFinalization", new Object[0]);
    }

    public final void p0() {
        if (u1(p.f1642f)) {
            return;
        }
        S1(p.f1643g);
    }

    /* JADX INFO: renamed from: q1, reason: from getter */
    public final o getSink() {
        return this.sink;
    }
}
