package ob;

import Ud.S;
import dc.s;
import expo.modules.interfaces.constants.ConstantsInterface;
import gc.c;
import gc.d;
import gc.e;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5972b;

/* JADX INFO: renamed from: ob.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lob/a;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "expo-constants_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C5850a extends c {

    /* JADX INFO: renamed from: ob.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0849a implements InterfaceC5082a {
        C0849a() {
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            Map constants;
            Object obj = C5850a.this.i().E().a().get(ConstantsInterface.class);
            if (!(obj instanceof ConstantsInterface)) {
                obj = null;
            }
            ConstantsInterface constantsInterface = (ConstantsInterface) obj;
            return (constantsInterface == null || (constants = constantsInterface.getConstants()) == null) ? S.i() : constants;
        }
    }

    /* JADX INFO: renamed from: ob.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return System.getProperty("http.agent");
        }
    }

    @Override // gc.c
    public e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            d dVar = new d(this);
            dVar.s("ExponentConstants");
            dVar.c(new C0849a());
            dVar.k().put("getWebViewUserAgentAsync", new s("getWebViewUserAgentAsync", new C5972b[0], new b()));
            return dVar.u();
        } finally {
            X3.a.f();
        }
    }
}
