package vc;

import Td.L;
import Ub.d;
import Ub.f;
import Ub.r;
import Ub.w;
import android.content.Context;
import android.view.View;
import bc.InterfaceC3043b;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import expo.modules.adapters.react.NativeModulesProxy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pc.AbstractC5968J;
import pc.C5969K;
import ub.C6752d;

/* JADX INFO: renamed from: vc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C6857a implements InterfaceC6858b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f62039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f62040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f62041d;

    public C6857a(String name, View view, Function1 function1) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(view, "view");
        this.f62038a = name;
        this.f62039b = view;
        this.f62040c = function1;
    }

    private final WritableMap a(Object obj) {
        Object objB = C5969K.b(C5969K.f55891a, obj, null, false, 6, null);
        if ((objB instanceof L) || objB == null) {
            return null;
        }
        if (objB instanceof WritableMap) {
            return (WritableMap) objB;
        }
        WritableMap writableMapB = C5969K.b.f55892a.b();
        AbstractC5968J.b(writableMapB, "payload", objB);
        return writableMapB;
    }

    @Override // vc.InterfaceC6858b
    public void invoke(Object obj) {
        Context context = this.f62039b.getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        NativeModulesProxy nativeModulesProxyA = w.a((ReactContext) context);
        if (nativeModulesProxyA == null) {
            return;
        }
        d dVarF = nativeModulesProxyA.getKotlinInteropModuleRegistry().f();
        if (!this.f62041d) {
            r rVarP = dVarF.C().p(this.f62039b.getClass());
            if (rVarP == null) {
                C6752d.i(f.a(), "⚠️ Cannot get module holder for " + this.f62039b.getClass(), null, 2, null);
                return;
            }
            expo.modules.kotlin.views.r rVarU = dVarF.C().u(rVarP, this.f62039b.getClass());
            expo.modules.kotlin.views.b bVarC = rVarU != null ? rVarU.c() : null;
            if (bVarC == null) {
                C6752d.i(f.a(), "⚠️ Cannot get callbacks for " + rVarP.g().getClass(), null, 2, null);
                return;
            }
            for (String str : bVarC.a()) {
                if (AbstractC5504s.c(str, this.f62038a)) {
                    this.f62041d = true;
                }
            }
            C6752d.i(f.a(), "⚠️ Event " + this.f62038a + " wasn't exported from " + rVarP.g().getClass(), null, 2, null);
            return;
        }
        InterfaceC3043b interfaceC3043bQ = dVarF.q();
        if (interfaceC3043bQ != null) {
            View view = this.f62039b;
            String str2 = this.f62038a;
            WritableMap writableMapA = a(obj);
            Function1 function1 = this.f62040c;
            interfaceC3043bQ.e(view, str2, writableMapA, function1 != null ? (Short) function1.invoke(obj) : null);
        }
    }
}
