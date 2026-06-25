package Qa;

import Qa.AbstractC2081d;
import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends AbstractC2081d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2081d.c {

        /* JADX INFO: renamed from: b */
        private final Class f14667b = p.class;

        /* JADX INFO: renamed from: c */
        private final String f14668c = "ManualGestureHandler";

        @Override // Qa.AbstractC2081d.c
        public String d() {
            return this.f14668c;
        }

        @Override // Qa.AbstractC2081d.c
        public Class e() {
            return this.f14667b;
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: g */
        public p a(Context context) {
            return new p();
        }

        @Override // Qa.AbstractC2081d.c
        /* JADX INFO: renamed from: h */
        public Ra.e c(p handler) {
            AbstractC5504s.h(handler, "handler");
            return new Ra.e(handler);
        }
    }

    @Override // Qa.AbstractC2081d
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(sourceEvent, "sourceEvent");
        if (S() == 0) {
            p();
        }
    }
}
