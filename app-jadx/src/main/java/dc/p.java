package dc;

import Gf.AbstractC1617k;
import Gf.O;
import Td.L;
import Ub.A;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import ie.InterfaceC5096o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5972b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC5096o f45124h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f45125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f45126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f45127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f45129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ PromiseImpl f45130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f45131g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f45132h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object[] f45133i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Ub.d f45134j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PromiseImpl promiseImpl, p pVar, String str, Object[] objArr, Ub.d dVar, Zd.e eVar) {
            super(2, eVar);
            this.f45130f = promiseImpl;
            this.f45131g = pVar;
            this.f45132h = str;
            this.f45133i = objArr;
            this.f45134j = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f45130f, this.f45131g, this.f45132h, this.f45133i, this.f45134j, eVar);
            aVar.f45129e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: all -> 0x0092, TryCatch #1 {all -> 0x0092, blocks: (B:25:0x006d, B:27:0x0071, B:29:0x0075, B:34:0x009e, B:35:0x00a7, B:32:0x0095, B:33:0x009b, B:13:0x0033), top: B:52:0x0033 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[Catch: all -> 0x0092, TryCatch #1 {all -> 0x0092, blocks: (B:25:0x006d, B:27:0x0071, B:29:0x0075, B:34:0x009e, B:35:0x00a7, B:32:0x0095, B:33:0x009b, B:13:0x0033), top: B:52:0x0033 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dc.p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String name, C5972b[] desiredArgsTypes, InterfaceC5096o body) {
        super(name, desiredArgsTypes);
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(desiredArgsTypes, "desiredArgsTypes");
        AbstractC5504s.h(body, "body");
        this.f45124h = body;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(WeakReference weakReference, String str, p pVar, Ub.d dVar, Object[] args, PromiseImpl promiseImpl) {
        O oY;
        AbstractC5504s.h(args, "args");
        AbstractC5504s.h(promiseImpl, "promiseImpl");
        k kVarM = pVar.m();
        if (kVarM == m.f45116a) {
            oY = dVar.x();
        } else {
            if (kVarM != m.f45117b) {
                throw new Td.r();
            }
            oY = dVar.y();
        }
        AbstractC1617k.d(oY, null, null, new a(promiseImpl, pVar, str, args, dVar, null), 3, null);
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
        jsObject.registerAsyncFunction(strG, zI, zJ, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new JNIAsyncFunctionBody() { // from class: dc.o
            @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
            public final void invoke(Object[] objArr, PromiseImpl promiseImpl) {
                p.q(weakReferenceA, moduleName, this, appContext, objArr, promiseImpl);
            }
        });
    }
}
