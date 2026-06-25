package lc;

import Td.L;
import Ub.A;
import Ub.d;
import Ub.f;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.WorkletRuntimeInstaller;
import expo.modules.kotlin.jni.worklets.WorkletNativeRuntime;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;
import nc.C5775b;
import nc.e;
import ub.C6752d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f52747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSIContext f52748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkletNativeRuntime f52749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference f52750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f52751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5775b f52752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JNIDeallocator f52753g;

    public c(d appContext, WeakReference reactContextHolder) {
        AbstractC5504s.h(appContext, "appContext");
        AbstractC5504s.h(reactContextHolder, "reactContextHolder");
        this.f52747a = reactContextHolder;
        this.f52750d = A.a(appContext);
        this.f52751e = new e(this);
        this.f52752f = new C5775b();
        this.f52753g = new JNIDeallocator(false, 1, null);
    }

    private final boolean i() {
        return this.f52748b != null;
    }

    @Override // lc.b
    public d a() {
        return (d) this.f52750d.get();
    }

    @Override // lc.b
    public C5775b b() {
        return this.f52752f;
    }

    @Override // lc.b
    public JSIContext d() {
        JSIContext jSIContext = this.f52748b;
        if (jSIContext != null) {
            return jSIContext;
        }
        AbstractC5504s.u("jsiContext");
        return null;
    }

    @Override // lc.b
    public e e() {
        return this.f52751e;
    }

    public void f() {
        c().b();
    }

    @Override // lc.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public JNIDeallocator c() {
        return this.f52753g;
    }

    public final void h(long j10) {
        synchronized (this) {
            if (i()) {
                C6752d.i(f.a(), "⚠️ JSI interop was already installed", null, 2, null);
                return;
            }
            X3.a.c("[ExpoModulesCore] " + (this + ".install on runtime " + j10));
            try {
                k(new WorkletNativeRuntime(j10));
                j(new WorkletRuntimeInstaller(this).a(j10));
                f.a().d("✅ JSI interop was installed");
                L l10 = L.f17438a;
            } finally {
                X3.a.f();
            }
        }
    }

    public void j(JSIContext jSIContext) {
        AbstractC5504s.h(jSIContext, "<set-?>");
        this.f52748b = jSIContext;
    }

    public final void k(WorkletNativeRuntime workletNativeRuntime) {
        this.f52749c = workletNativeRuntime;
    }
}
