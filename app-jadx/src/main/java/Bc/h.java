package bc;

import Ub.r;
import Ud.AbstractC2273n;
import android.os.Bundle;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JavaScriptModuleObject_;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import pc.AbstractC5968J;
import tb.InterfaceC6658a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f33284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r moduleHolder, InterfaceC6658a legacyEventEmitter, WeakReference reactContextHolder) {
        super(legacyEventEmitter, reactContextHolder);
        AbstractC5504s.h(moduleHolder, "moduleHolder");
        AbstractC5504s.h(legacyEventEmitter, "legacyEventEmitter");
        AbstractC5504s.h(reactContextHolder, "reactContextHolder");
        this.f33284c = moduleHolder;
    }

    private final void d(String str) {
        String[] strArrA;
        f fVarD = this.f33284c.e().d();
        if (fVarD == null || (strArrA = fVarD.a()) == null || !AbstractC2273n.R(strArrA, str)) {
            throw new IllegalArgumentException(("Unsupported event: " + str + ".").toString());
        }
    }

    private final void f(String str, Map map) throws Exception {
        lc.b bVarP = this.f33284c.g().p();
        JavaScriptModuleObject_ javaScriptModuleObject_I = this.f33284c.i();
        if (javaScriptModuleObject_I == null) {
            return;
        }
        try {
            JNIUtils.INSTANCE.a(javaScriptModuleObject_I, bVarP.d(), str, map);
        } catch (Exception e10) {
            if (javaScriptModuleObject_I.b()) {
                throw e10;
            }
        }
    }

    @Override // bc.g, tb.InterfaceC6658a
    public void a(String eventName, Bundle bundle) throws Exception {
        AbstractC5504s.h(eventName, "eventName");
        d(eventName);
        f(eventName, bundle != null ? AbstractC5968J.t(bundle) : null);
    }

    @Override // bc.g, bc.InterfaceC3043b
    public void b(String eventName, Map map) throws Exception {
        AbstractC5504s.h(eventName, "eventName");
        d(eventName);
        f(eventName, map != null ? AbstractC5968J.u(map) : null);
    }
}
