package n8;

import Td.AbstractC2163n;
import Td.q;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5506u;
import r0.AbstractC6231m;
import r0.C6230l;

/* JADX INFO: renamed from: n8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5755a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f53998a = AbstractC2163n.a(q.f17463c, C0839a.f53999a);

    /* JADX INFO: renamed from: n8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0839a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0839a f53999a = new C0839a();

        C0839a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? C6230l.f58350b.a() : AbstractC6231m.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler d() {
        return (Handler) f53998a.getValue();
    }
}
