package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    public static final a f31612a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0524a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Context f31613a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0524a(Context context) {
                super(1);
                this.f31613a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a */
            public final d invoke(Context it) {
                AbstractC5504s.h(it, "it");
                return new d(this.f31613a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            AbstractC5504s.h(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            H3.b bVar = H3.b.f7905a;
            sb2.append(bVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (bVar.a() >= 5) {
                return new g(context);
            }
            if (bVar.b() >= 9) {
                return (b) H3.c.f7908a.a(context, "MeasurementManager", new C0524a(context));
            }
            return null;
        }

        private a() {
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, Zd.e eVar);

    public abstract Object b(Zd.e eVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, Zd.e eVar);

    public abstract Object d(m mVar, Zd.e eVar);

    public abstract Object e(Uri uri, Zd.e eVar);

    public abstract Object f(n nVar, Zd.e eVar);

    public abstract Object g(o oVar, Zd.e eVar);
}
