package com.amazon.a;

import app.notifee.core.event.LogEvent;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends com.amazon.a.a.n.a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34788b = new com.amazon.a.a.o.c("CheckIfAppisBlockedTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f34789c;

    @Override // com.amazon.a.a.n.a.a
    protected void a(j jVar) {
        if (jVar.b() == null || !jVar.b().containsKey(LogEvent.LEVEL_VERBOSE)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) jVar.b().get(LogEvent.LEVEL_VERBOSE)).booleanValue();
        com.amazon.a.a.o.c.f34700b = zBooleanValue;
        com.amazon.a.a.o.c.f34699a = zBooleanValue;
    }

    @Override // com.amazon.a.a.n.a.a
    protected String a_() {
        return "check_blocked_status";
    }

    @Override // com.amazon.a.a.n.a.a
    protected Map<String, Object> b() {
        return null;
    }

    @Override // com.amazon.a.a.n.a.a
    protected String c() {
        return "1.0";
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean d() {
        return true;
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(h hVar) {
        if (m()) {
            n();
        }
        f34788b.c("app is blocked, killing");
        this.f34789c.a((com.amazon.a.a.i.b) new com.amazon.a.a.i.g(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e())));
    }
}
