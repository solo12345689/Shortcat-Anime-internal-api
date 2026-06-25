package expo.modules.kotlin.views;

import Ub.w;
import Ud.AbstractC2279u;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.CodedException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a */
    private final Function2 f46228a;

    /* JADX INFO: renamed from: b */
    private final Class f46229b;

    /* JADX INFO: renamed from: c */
    private final Map f46230c;

    /* JADX INFO: renamed from: d */
    private final String f46231d;

    /* JADX INFO: renamed from: e */
    private final Function1 f46232e;

    /* JADX INFO: renamed from: f */
    private final b f46233f;

    /* JADX INFO: renamed from: g */
    private final Function1 f46234g;

    /* JADX INFO: renamed from: h */
    private final List f46235h;

    /* JADX INFO: renamed from: i */
    private final List f46236i;

    public r(Function2 viewFactory, Class viewType, Map props, String name, Function1 function1, b bVar, q qVar, Function1 function12, List asyncFunctions) {
        AbstractC5504s.h(viewFactory, "viewFactory");
        AbstractC5504s.h(viewType, "viewType");
        AbstractC5504s.h(props, "props");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(asyncFunctions, "asyncFunctions");
        this.f46228a = viewFactory;
        this.f46229b = viewType;
        this.f46230c = props;
        this.f46231d = name;
        this.f46232e = function1;
        this.f46233f = bVar;
        this.f46234g = function12;
        this.f46235h = asyncFunctions;
        this.f46236i = AbstractC2279u.b1(props.keySet());
    }

    public final View a(Context context, Ub.d appContext) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(appContext, "appContext");
        return (View) this.f46228a.invoke(context, appContext);
    }

    public final List b() {
        return this.f46235h;
    }

    public final b c() {
        return this.f46233f;
    }

    public final String d() {
        return this.f46231d;
    }

    public final Function1 e() {
        return this.f46232e;
    }

    public final Function1 f() {
        return this.f46234g;
    }

    public final Map g() {
        return this.f46230c;
    }

    public final List h() {
        return this.f46236i;
    }

    public final q i() {
        return null;
    }

    public final s j() {
        return ViewGroup.class.isAssignableFrom(this.f46229b) ? s.f46238b : s.f46237a;
    }

    public final Class k() {
        return this.f46229b;
    }

    public final void l(View view, CodedException exception) {
        NativeModulesProxy nativeModulesProxyA;
        Zb.b bVarR;
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(exception, "exception");
        Context context = view.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null || (nativeModulesProxyA = w.a(reactContext)) == null || (bVarR = nativeModulesProxyA.getKotlinInteropModuleRegistry().f().r()) == null) {
            return;
        }
        bVarR.B(exception);
    }
}
