package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24201a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View it) {
            AbstractC5504s.h(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f24202a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(View it) {
            AbstractC5504s.h(it, "it");
            Object tag = it.getTag(L.f24194b);
            if (tag instanceof K) {
                return (K) tag;
            }
            return null;
        }
    }

    public static final K a(View view) {
        AbstractC5504s.h(view, "<this>");
        return (K) Cf.l.D(Cf.l.L(Cf.l.p(view, a.f24201a), b.f24202a));
    }

    public static final void b(View view, K onBackPressedDispatcherOwner) {
        AbstractC5504s.h(view, "<this>");
        AbstractC5504s.h(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(L.f24194b, onBackPressedDispatcherOwner);
    }
}
