package J3;

import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.O;
import Gf.P;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.m;
import androidx.privacysandbox.ads.adservices.measurement.n;
import androidx.privacysandbox.ads.adservices.measurement.o;
import com.google.common.util.concurrent.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9425a = new b(null);

    /* JADX INFO: renamed from: J3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0127a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.privacysandbox.ads.adservices.measurement.b f9426b;

        /* JADX INFO: renamed from: J3.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0128a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9427a;

            C0128a(androidx.privacysandbox.ads.adservices.measurement.a aVar, Zd.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return C0127a.this.new C0128a(null, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((C0128a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9427a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0127a.this.f9426b;
                    this.f9427a = 1;
                    if (bVar.a(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: J3.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9429a;

            b(Zd.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return C0127a.this.new b(eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9429a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    return obj;
                }
                v.b(obj);
                androidx.privacysandbox.ads.adservices.measurement.b bVar = C0127a.this.f9426b;
                this.f9429a = 1;
                Object objB = bVar.b(this);
                return objB == objF ? objF : objB;
            }
        }

        /* JADX INFO: renamed from: J3.a$a$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9431a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f9433c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ InputEvent f9434d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, Zd.e eVar) {
                super(2, eVar);
                this.f9433c = uri;
                this.f9434d = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return C0127a.this.new c(this.f9433c, this.f9434d, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9431a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0127a.this.f9426b;
                    Uri uri = this.f9433c;
                    InputEvent inputEvent = this.f9434d;
                    this.f9431a = 1;
                    if (bVar.c(uri, inputEvent, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: J3.a$a$d */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class d extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9435a;

            d(m mVar, Zd.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return C0127a.this.new d(null, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9435a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0127a.this.f9426b;
                    this.f9435a = 1;
                    if (bVar.d(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: J3.a$a$e */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class e extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9437a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f9439c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Uri uri, Zd.e eVar) {
                super(2, eVar);
                this.f9439c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return C0127a.this.new e(this.f9439c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((e) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9437a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0127a.this.f9426b;
                    Uri uri = this.f9439c;
                    this.f9437a = 1;
                    if (bVar.e(uri, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: J3.a$a$f */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class f extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9440a;

            f(n nVar, Zd.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return C0127a.this.new f(null, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((f) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9440a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0127a.this.f9426b;
                    this.f9440a = 1;
                    if (bVar.f(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: J3.a$a$g */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class g extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f9442a;

            g(o oVar, Zd.e eVar) {
                super(2, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return C0127a.this.new g(null, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((g) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9442a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0127a.this.f9426b;
                    this.f9442a = 1;
                    if (bVar.g(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return L.f17438a;
            }
        }

        public C0127a(androidx.privacysandbox.ads.adservices.measurement.b mMeasurementManager) {
            AbstractC5504s.h(mMeasurementManager, "mMeasurementManager");
            this.f9426b = mMeasurementManager;
        }

        @Override // J3.a
        public p b() {
            return I3.b.c(AbstractC1617k.b(P.a(C1608f0.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // J3.a
        public p c(Uri trigger) {
            AbstractC5504s.h(trigger, "trigger");
            return I3.b.c(AbstractC1617k.b(P.a(C1608f0.a()), null, null, new e(trigger, null), 3, null), null, 1, null);
        }

        public p e(androidx.privacysandbox.ads.adservices.measurement.a deletionRequest) {
            AbstractC5504s.h(deletionRequest, "deletionRequest");
            return I3.b.c(AbstractC1617k.b(P.a(C1608f0.a()), null, null, new C0128a(deletionRequest, null), 3, null), null, 1, null);
        }

        public p f(Uri attributionSource, InputEvent inputEvent) {
            AbstractC5504s.h(attributionSource, "attributionSource");
            return I3.b.c(AbstractC1617k.b(P.a(C1608f0.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        public p g(m request) {
            AbstractC5504s.h(request, "request");
            return I3.b.c(AbstractC1617k.b(P.a(C1608f0.a()), null, null, new d(request, null), 3, null), null, 1, null);
        }

        public p h(n request) {
            AbstractC5504s.h(request, "request");
            return I3.b.c(AbstractC1617k.b(P.a(C1608f0.a()), null, null, new f(request, null), 3, null), null, 1, null);
        }

        public p i(o request) {
            AbstractC5504s.h(request, "request");
            return I3.b.c(AbstractC1617k.b(P.a(C1608f0.a()), null, null, new g(request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context) {
            AbstractC5504s.h(context, "context");
            androidx.privacysandbox.ads.adservices.measurement.b bVarA = androidx.privacysandbox.ads.adservices.measurement.b.f31612a.a(context);
            if (bVarA != null) {
                return new C0127a(bVarA);
            }
            return null;
        }

        private b() {
        }
    }

    public static final a a(Context context) {
        return f9425a.a(context);
    }

    public abstract p b();

    public abstract p c(Uri uri);
}
