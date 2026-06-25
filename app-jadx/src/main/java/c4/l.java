package c4;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface l {

    /* JADX INFO: renamed from: a */
    public static final a f33506a = a.f33507a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f33507a = new a();

        /* JADX INFO: renamed from: b */
        private static Function1 f33508b = C0567a.f33509a;

        /* JADX INFO: renamed from: c4.l$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0567a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final C0567a f33509a = new C0567a();

            C0567a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a */
            public final l invoke(l it) {
                AbstractC5504s.h(it, "it");
                return it;
            }
        }

        private a() {
        }

        public final l a() {
            return (l) f33508b.invoke(m.f33510b);
        }
    }

    k a(Context context);

    k b(Activity activity);
}
