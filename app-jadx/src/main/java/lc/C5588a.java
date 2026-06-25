package lc;

import Td.L;
import Ub.A;
import Ub.d;
import Ub.f;
import Ub.r;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.jni.MainRuntimeInstaller;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;
import nc.C5775b;
import nc.e;
import ub.C6752d;

/* JADX INFO: renamed from: lc.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5588a extends b {

    /* JADX INFO: renamed from: a */
    private final WeakReference f52740a;

    /* JADX INFO: renamed from: b */
    private final WeakReference f52741b;

    /* JADX INFO: renamed from: c */
    public JSIContext f52742c;

    /* JADX INFO: renamed from: d */
    private final r f52743d;

    /* JADX INFO: renamed from: e */
    private final JNIDeallocator f52744e;

    /* JADX INFO: renamed from: f */
    private final e f52745f;

    /* JADX INFO: renamed from: g */
    private final C5775b f52746g;

    public C5588a(d appContext, WeakReference reactContextHolder) {
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(reactContextHolder, "reactContextHolder");
        this.f52740a = reactContextHolder;
        WeakReference weakReferenceA = A.a(appContext);
        this.f52741b = weakReferenceA;
        Zb.a aVar = new Zb.a();
        aVar.w(weakReferenceA);
        this.f52743d = new r(aVar, null);
        this.f52744e = new JNIDeallocator(false, 1, null);
        this.f52745f = new e(this);
        this.f52746g = new C5775b();
    }

    private final boolean m() {
        return this.f52742c != null;
    }

    @Override // lc.b
    public d a() {
        return (d) this.f52741b.get();
    }

    @Override // lc.b
    public C5775b b() {
        return this.f52746g;
    }

    @Override // lc.b
    public JSIContext d() {
        JSIContext jSIContext = this.f52742c;
        if (jSIContext != null) {
            return jSIContext;
        }
        AbstractC5504s.u("jsiContext");
        return null;
    }

    @Override // lc.b
    public e e() {
        return this.f52745f;
    }

    public void f() {
        c().b();
    }

    public JavaScriptValue g(String source) {
        AbstractC5504s.h(source, "source");
        return d().evaluateScript(source);
    }

    public final r h() {
        return this.f52743d;
    }

    @Override // lc.b
    /* JADX INFO: renamed from: i */
    public JNIDeallocator c() {
        return this.f52744e;
    }

    public ReactApplicationContext j() {
        return (ReactApplicationContext) this.f52740a.get();
    }

    public final WeakReference k() {
        return this.f52740a;
    }

    /* JADX WARN: Finally extract failed */
    public final void l() {
        JavaScriptContextHolder javaScriptContextHolder;
        synchronized (this) {
            if (m()) {
                C6752d.i(f.a(), "⚠️ JSI interop was already installed", null, 2, null);
                return;
            }
            X3.a.c("[ExpoModulesCore] " + (this + ".install"));
            try {
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) k().get();
                if (reactApplicationContext != null && (javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder()) != null) {
                    Long lValueOf = Long.valueOf(javaScriptContextHolder.getContext());
                    if (lValueOf.longValue() == 0) {
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        C6752d.c(f.a(), "❌ Cannot install JSI interop - JS runtime pointer is null", null, 2, null);
                    } else {
                        long jLongValue = lValueOf.longValue();
                        MainRuntimeInstaller mainRuntimeInstaller = new MainRuntimeInstaller(this);
                        RuntimeExecutor runtimeExecutor = reactApplicationContext.getCatalystInstance().getRuntimeExecutor();
                        AbstractC5504s.e(runtimeExecutor);
                        n(mainRuntimeInstaller.a(jLongValue, runtimeExecutor));
                        f.a().d("✅ JSI interop was installed");
                    }
                }
            } catch (Throwable th2) {
                try {
                    f.a().b("❌ Cannot install JSI interop: " + th2, th2);
                } finally {
                    X3.a.f();
                }
            }
            L l10 = L.f17438a;
        }
    }

    public void n(JSIContext jSIContext) {
        AbstractC5504s.h(jSIContext, "<set-?>");
        this.f52742c = jSIContext;
    }
}
