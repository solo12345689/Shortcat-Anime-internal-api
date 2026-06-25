package expo.modules.updates;

import Td.r;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;
import nd.EnumC5782f;
import ud.InterfaceC6765a;
import xd.C7136g;
import xd.EnumC7131b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f46454a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c f46455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile d f46456c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46457a;

        static {
            int[] iArr = new int[EnumC5782f.values().length];
            try {
                iArr[EnumC5782f.f54120a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5782f.f54121b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5782f.f54122c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5782f.f54123d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f46457a = iArr;
        }
    }

    private f() {
    }

    public static final c a() {
        c cVar = f46455b;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("UpdatesController.instance was called before the module was initialized");
    }

    public static final synchronized void b(Context context, boolean z10) {
        AbstractC5504s.h(context, "context");
        if (f46455b == null) {
            d(context, z10);
            c cVar = f46455b;
            if (cVar != null) {
                cVar.start();
            }
        }
    }

    public static /* synthetic */ void c(Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        b(context, z10);
    }

    public static final void d(Context context, boolean z10) throws IOException {
        c aVar;
        AbstractC5504s.h(context, "context");
        if (f46455b != null) {
            return;
        }
        if (z10 && !UpdatesPackage.f46293a.b()) {
            f46455b = new expo.modules.updates.a(context, null);
            return;
        }
        File filesDir = context.getFilesDir();
        AbstractC5504s.g(filesDir, "getFilesDir(...)");
        C7136g c7136g = new C7136g(filesDir);
        try {
            File fileE = g.f46458a.e(context);
            d dVar = f46456c;
            if (dVar == null) {
                int i10 = a.f46457a[d.f46408u.s(context, null).ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        c7136g.o("The expo-updates system is explicitly disabled. To enable it, set the enabled setting to true.", EnumC7131b.f64349k);
                    } else if (i10 == 3) {
                        c7136g.o("The expo-updates system is disabled due to an invalid configuration. Ensure a valid URL is supplied.", EnumC7131b.f64349k);
                    } else {
                        if (i10 != 4) {
                            throw new r();
                        }
                        c7136g.o("The expo-updates system is disabled due to an invalid configuration. Ensure a runtime version is supplied.", EnumC7131b.f64349k);
                    }
                    dVar = null;
                } else {
                    dVar = new d(context, null);
                }
            }
            if (dVar != null) {
                aVar = new b(context, dVar, fileE);
                Ed.a.f5899a.b(new WeakReference(aVar));
            } else {
                aVar = new expo.modules.updates.a(context, null);
                Ed.a.f5899a.b(new WeakReference(aVar));
            }
            f46455b = aVar;
        } catch (Exception e10) {
            c7136g.f("The expo-updates system is disabled due to a storage access error", e10, EnumC7131b.f64349k);
            f46455b = new expo.modules.updates.a(context, e10);
        }
    }

    public final void e() {
        InterfaceC6765a interfaceC6765aD;
        c cVar = f46455b;
        if (cVar == null || (interfaceC6765aD = cVar.d()) == null) {
            return;
        }
        interfaceC6765aD.a(null);
    }

    public final void f(WeakReference observer) {
        InterfaceC6765a interfaceC6765aD;
        AbstractC5504s.h(observer, "observer");
        c cVar = f46455b;
        if (cVar != null && (interfaceC6765aD = cVar.d()) != null) {
            interfaceC6765aD.a(observer);
        }
        c cVar2 = f46455b;
        if (cVar2 != null) {
            cVar2.n();
        }
    }
}
