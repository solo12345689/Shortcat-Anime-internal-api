package com.swmansion.gesturehandler.react;

import Qa.AbstractC2081d;
import Qa.B;
import Qa.C2079b;
import Qa.m;
import Qa.o;
import Qa.p;
import Qa.q;
import Qa.t;
import Qa.u;
import Qa.x;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f44286a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC2081d.c[] f44287b = {new q.d(), new B.b(), new o.b(), new t.b(), new u.a(), new x.b(), new C2079b.C0244b(), new p.a(), new m.b()};

    private e() {
    }

    public final AbstractC2081d.c a(AbstractC2081d handler) {
        AbstractC5504s.h(handler, "handler");
        for (AbstractC2081d.c cVar : f44287b) {
            if (AbstractC5504s.c(cVar.e(), handler.getClass())) {
                return cVar;
            }
        }
        return null;
    }

    public final AbstractC2081d.c b(String handlerName) {
        AbstractC5504s.h(handlerName, "handlerName");
        for (AbstractC2081d.c cVar : f44287b) {
            if (AbstractC5504s.c(cVar.d(), handlerName)) {
                return cVar;
            }
        }
        return null;
    }
}
