package yc;

import Td.L;
import Td.z;
import android.net.Uri;
import dc.r;
import gc.e;
import ie.InterfaceC5082a;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.V;
import pc.C5972b;
import pc.U;

/* JADX INFO: renamed from: yc.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lyc/a;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "Lkotlin/Function1;", "Landroid/net/Uri;", "LTd/L;", "d", "Lkotlin/jvm/functions/Function1;", "onURLReceivedObserver", "e", "a", "expo-linking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C7219a extends gc.c {

    /* JADX INFO: renamed from: f */
    private static Uri f64993f;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function1 onURLReceivedObserver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    private static Set f64994g = new LinkedHashSet();

    /* JADX INFO: renamed from: yc.a$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return C7219a.f64994g;
        }

        public final void b(Uri uri) {
            C7219a.f64993f = uri;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: yc.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: yc.a$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0982a implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ WeakReference f64997a;

            C0982a(WeakReference weakReference) {
                this.f64997a = weakReference;
            }

            public final void a(Uri uri) {
                C7219a c7219a = (C7219a) this.f64997a.get();
                if (c7219a != null) {
                    c7219a.s("onURLReceived", G1.c.a(z.a("url", uri != null ? uri.toString() : null)));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Uri) obj);
                return L.f17438a;
            }
        }

        b() {
        }

        public final void a() {
            C0982a c0982a = new C0982a(new WeakReference(C7219a.this));
            C7219a.INSTANCE.a().add(c0982a);
            C7219a.this.onURLReceivedObserver = c0982a;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: yc.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements InterfaceC5082a {
        c() {
        }

        public final void a() {
            Set setA = C7219a.INSTANCE.a();
            V.a(setA).remove(C7219a.this.onURLReceivedObserver);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: yc.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            Uri uri = C7219a.f64993f;
            if (uri != null) {
                return uri.toString();
            }
            return null;
        }
    }

    @Override // gc.c
    public e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoLinking");
            dVar.d("onURLReceived");
            C5972b[] c5972bArr = new C5972b[0];
            pc.V v10 = pc.V.f55908a;
            U u10 = (U) v10.a().get(O.b(Object.class));
            if (u10 == null) {
                u10 = new U(O.b(Object.class));
                v10.a().put(O.b(Object.class), u10);
            }
            dVar.p().put("getLinkingURL", new r("getLinkingURL", c5972bArr, u10, new d()));
            dVar.f("onURLReceived", new b());
            dVar.h("onURLReceived", new c());
            e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
