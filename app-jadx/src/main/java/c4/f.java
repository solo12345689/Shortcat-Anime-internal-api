package c4;

import Jf.InterfaceC1742e;
import Td.AbstractC2163n;
import a4.C2569d;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import d4.InterfaceC4566a;
import e4.AbstractC4645a;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f33487a = a.f33488a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final boolean f33489b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f33488a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f33490c = O.b(f.class).v();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Lazy f33491d = AbstractC2163n.b(C0565a.f33493a);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static g f33492e = C3074b.f33459a;

        /* JADX INFO: renamed from: c4.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0565a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0565a f33493a = new C0565a();

            C0565a() {
                super(0);
            }

            @Override // ie.InterfaceC5082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4566a invoke() {
                WindowLayoutComponent windowLayoutComponentG;
                try {
                    ClassLoader loader = f.class.getClassLoader();
                    e eVar = loader != null ? new e(loader, new C2569d(loader)) : null;
                    if (eVar == null || (windowLayoutComponentG = eVar.g()) == null) {
                        return null;
                    }
                    AbstractC4645a.C0724a c0724a = AbstractC4645a.f45797a;
                    AbstractC5504s.g(loader, "loader");
                    return c0724a.a(windowLayoutComponentG, new C2569d(loader));
                } catch (Throwable unused) {
                    if (a.f33489b) {
                        Log.d(a.f33490c, "Failed to load WindowExtensions");
                    }
                    return null;
                }
            }
        }

        private a() {
        }

        public final InterfaceC4566a c() {
            return (InterfaceC4566a) f33491d.getValue();
        }

        public final f d(Context context) {
            AbstractC5504s.h(context, "context");
            InterfaceC4566a interfaceC4566aC = c();
            if (interfaceC4566aC == null) {
                interfaceC4566aC = androidx.window.layout.adapter.sidecar.b.f32632c.a(context);
            }
            return f33492e.a(new i(m.f33510b, interfaceC4566aC));
        }
    }

    InterfaceC1742e a(Context context);
}
