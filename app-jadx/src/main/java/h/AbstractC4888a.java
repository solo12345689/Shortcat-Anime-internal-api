package h;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: h.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4888a {

    /* JADX INFO: renamed from: h.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0764a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f47537a;

        public C0764a(Object obj) {
            this.f47537a = obj;
        }

        public final Object a() {
            return this.f47537a;
        }
    }

    public abstract Intent createIntent(Context context, Object obj);

    public C0764a getSynchronousResult(Context context, Object obj) {
        AbstractC5504s.h(context, "context");
        return null;
    }

    public abstract Object parseResult(int i10, Intent intent);
}
