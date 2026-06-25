package Bd;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;
import wd.u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f1657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f1658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f1659c;

    public h(a launcherSelectionPolicy, c loaderSelectionPolicy, e reaperSelectionPolicy) {
        AbstractC5504s.h(launcherSelectionPolicy, "launcherSelectionPolicy");
        AbstractC5504s.h(loaderSelectionPolicy, "loaderSelectionPolicy");
        AbstractC5504s.h(reaperSelectionPolicy, "reaperSelectionPolicy");
        this.f1657a = launcherSelectionPolicy;
        this.f1658b = loaderSelectionPolicy;
        this.f1659c = reaperSelectionPolicy;
    }

    public final rd.d a(List updates, JSONObject jSONObject) {
        AbstractC5504s.h(updates, "updates");
        return this.f1657a.a(updates, jSONObject);
    }

    public final List b(List updates, rd.d launchedUpdate, JSONObject jSONObject) {
        AbstractC5504s.h(updates, "updates");
        AbstractC5504s.h(launchedUpdate, "launchedUpdate");
        return this.f1659c.a(updates, launchedUpdate, jSONObject);
    }

    public final boolean c(rd.d dVar, rd.d dVar2, JSONObject jSONObject) {
        return this.f1658b.a(dVar, dVar2, jSONObject);
    }

    public final boolean d(u.c directive, rd.d embeddedUpdate, rd.d dVar, JSONObject jSONObject) {
        AbstractC5504s.h(directive, "directive");
        AbstractC5504s.h(embeddedUpdate, "embeddedUpdate");
        return this.f1658b.b(directive, embeddedUpdate, dVar, jSONObject);
    }
}
