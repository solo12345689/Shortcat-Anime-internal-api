package Zb;

import Td.L;
import Ud.AbstractC2279u;
import android.os.Bundle;
import bc.C3042a;
import bc.EnumC3046e;
import expo.modules.kotlin.exception.CodedException;
import gc.e;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import ub.AbstractC6749a;
import ub.C6752d;
import ub.EnumC6751c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"LZb/b;", "Lgc/c;", "<init>", "()V", "", "message", "Landroid/os/Bundle;", "z", "(Ljava/lang/String;)Landroid/os/Bundle;", "Lub/c;", "type", "LTd/L;", "C", "(Lub/c;Ljava/lang/String;)V", "Lgc/e;", "n", "()Lgc/e;", "Lexpo/modules/kotlin/exception/CodedException;", "codedException", "B", "(Lexpo/modules/kotlin/exception/CodedException;)V", "Lub/d;", "value", "d", "Lub/d;", "A", "()Lub/d;", "logger", "a", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C6752d logger;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends AbstractC6749a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f23260a;

        public a(b module) {
            AbstractC5504s.h(module, "module");
            this.f23260a = new WeakReference(module);
        }

        @Override // ub.AbstractC6749a
        public void a(EnumC6751c type, String message, Throwable th2) {
            AbstractC5504s.h(type, "type");
            AbstractC5504s.h(message, "message");
            if (th2 != null) {
                message = message + ". " + th2.getMessage();
            }
            b bVar = (b) this.f23260a.get();
            if (bVar != null) {
                bVar.C(type, message);
            }
        }
    }

    /* JADX INFO: renamed from: Zb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0404b implements InterfaceC5082a {
        public C0404b() {
        }

        public final void a() {
            a aVar = new a(b.this);
            b.this.logger = new C6752d(AbstractC2279u.e(aVar));
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(EnumC6751c type, String message) {
        String strB = c.b(type);
        Bundle bundle = new Bundle();
        bundle.putString("message", message);
        L l10 = L.f17438a;
        s(strB, bundle);
    }

    private final Bundle z(String message) {
        Bundle bundle = new Bundle();
        bundle.putString("message", message);
        return bundle;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final C6752d getLogger() {
        return this.logger;
    }

    public final void B(CodedException codedException) {
        AbstractC5504s.h(codedException, "codedException");
        String message = codedException.getMessage();
        if (message == null) {
            message = codedException.toString();
        }
        s("ExpoModulesCoreJSLogger.onNewError", z(message));
    }

    @Override // gc.c
    public e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoModulesCoreJSLogger");
            dVar.d("ExpoModulesCoreJSLogger.onNewError", "ExpoModulesCoreJSLogger.onNewWarning", "ExpoModulesCoreJSLogger.onNewDebug", "ExpoModulesCoreJSLogger.onNewInfo", "ExpoModulesCoreJSLogger.onNewTrace");
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33268a;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new C0404b()));
            return dVar.u();
        } finally {
            X3.a.f();
        }
    }
}
