package Bd;

import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;
import wd.u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final expo.modules.updates.d f1654a;

    public d(expo.modules.updates.d config) {
        AbstractC5504s.h(config, "config");
        this.f1654a = config;
    }

    @Override // Bd.c
    public boolean a(rd.d dVar, rd.d dVar2, JSONObject jSONObject) {
        if (dVar == null) {
            return false;
        }
        g gVar = g.f1655a;
        if (!gVar.a(dVar, jSONObject)) {
            return false;
        }
        if (dVar2 == null || !gVar.a(dVar2, jSONObject)) {
            return true;
        }
        if (dVar.o() != null && !AbstractC5504s.c(dVar.o(), this.f1654a.t())) {
            return false;
        }
        if (dVar.j() != null && !AbstractC5504s.c(dVar.j(), this.f1654a.p())) {
            return false;
        }
        if (dVar2.o() != null && !AbstractC5504s.c(dVar2.o(), this.f1654a.t())) {
            return true;
        }
        if (dVar2.j() == null || AbstractC5504s.c(dVar2.j(), this.f1654a.p())) {
            return dVar.b().after(dVar2.b());
        }
        return true;
    }

    @Override // Bd.c
    public boolean b(u.c directive, rd.d embeddedUpdate, rd.d dVar, JSONObject jSONObject) {
        AbstractC5504s.h(directive, "directive");
        AbstractC5504s.h(embeddedUpdate, "embeddedUpdate");
        g gVar = g.f1655a;
        if (!gVar.a(embeddedUpdate, jSONObject)) {
            return false;
        }
        if (dVar != null && gVar.a(dVar, jSONObject)) {
            return directive.b().after(dVar.b());
        }
        return true;
    }
}
