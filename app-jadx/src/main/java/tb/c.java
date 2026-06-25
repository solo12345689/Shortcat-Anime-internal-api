package Tb;

import android.app.Activity;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ub.d f17385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f17386b = new LinkedHashSet();

    public c(Ub.d dVar) {
        this.f17385a = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Activity activity) {
        activity.getWindow().addFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Activity activity) {
        activity.getWindow().clearFlags(128);
    }

    private final Activity g() throws cc.e {
        Ub.d dVar = this.f17385a;
        if (dVar != null) {
            return dVar.F();
        }
        throw new cc.e();
    }

    public final void c(String tag) throws cc.e {
        AbstractC5504s.h(tag, "tag");
        final Activity activityG = g();
        if (!h()) {
            activityG.runOnUiThread(new Runnable() { // from class: Tb.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(activityG);
                }
            });
        }
        this.f17386b.add(tag);
    }

    public final void e(String tag) throws cc.e {
        AbstractC5504s.h(tag, "tag");
        final Activity activityG = g();
        if (this.f17386b.size() == 1 && this.f17386b.contains(tag)) {
            activityG.runOnUiThread(new Runnable() { // from class: Tb.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.f(activityG);
                }
            });
        }
        this.f17386b.remove(tag);
    }

    public final boolean h() {
        return !this.f17386b.isEmpty();
    }
}
