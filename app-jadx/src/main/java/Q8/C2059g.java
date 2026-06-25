package Q8;

import R8.AbstractC2115p;
import android.app.Activity;
import androidx.fragment.app.AbstractActivityC2842v;

/* JADX INFO: renamed from: Q8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2059g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f14487a;

    public C2059g(Activity activity) {
        AbstractC2115p.m(activity, "Activity must not be null");
        this.f14487a = activity;
    }

    public final boolean a() {
        return this.f14487a instanceof AbstractActivityC2842v;
    }

    public final boolean b() {
        return this.f14487a instanceof Activity;
    }

    public final Activity c() {
        return (Activity) this.f14487a;
    }

    public final AbstractActivityC2842v d() {
        return (AbstractActivityC2842v) this.f14487a;
    }
}
