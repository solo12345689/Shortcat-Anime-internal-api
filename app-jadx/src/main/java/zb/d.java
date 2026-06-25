package Zb;

import Td.L;
import Ub.u;
import Ub.v;
import Ud.S;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import dc.f;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.UnexpectedException;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LZb/d;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements InterfaceC5082a {
        a() {
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            NativeModulesProxy nativeModulesProxy;
            Map<String, Object> constants;
            WeakReference weakReferenceW = d.this.i().w();
            return (weakReferenceW == null || (nativeModulesProxy = (NativeModulesProxy) weakReferenceW.get()) == null || (constants = nativeModulesProxy.getConstants()) == null) ? S.i() : constants;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f23264a = new b();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f23265a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: Zb.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0405d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0405d f23266a = new C0405d();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(ReadableArray.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function2 {
        public e() {
        }

        public final void a(Object[] objArr, u promise) throws UnexpectedException {
            NativeModulesProxy nativeModulesProxy;
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            ReadableArray readableArray = (ReadableArray) objArr[2];
            String str = (String) obj2;
            String str2 = (String) obj;
            Promise promiseA = v.a(promise);
            WeakReference weakReferenceW = d.this.i().w();
            if (weakReferenceW == null || (nativeModulesProxy = (NativeModulesProxy) weakReferenceW.get()) == null) {
                throw new UnexpectedException("The legacy modules proxy holder has been lost");
            }
            nativeModulesProxy.callMethod(str2, str, readableArray, promiseA);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws UnexpectedException {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    @Override // gc.c
    public gc.e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("NativeModulesProxy");
            dVar.c(new a());
            X xM = dVar.m();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                c5972b = new C5972b(new M(O.b(String.class), false, b.f23264a), xM);
            }
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b2 == null) {
                c5972b2 = new C5972b(new M(O.b(String.class), false, c.f23265a), xM);
            }
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(O.b(ReadableArray.class), bool));
            if (c5972b3 == null) {
                c5972b3 = new C5972b(new M(O.b(ReadableArray.class), false, C0405d.f23266a), xM);
            }
            dVar.k().put("callMethod", new f("callMethod", new C5972b[]{c5972b, c5972b2, c5972b3}, new e()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
