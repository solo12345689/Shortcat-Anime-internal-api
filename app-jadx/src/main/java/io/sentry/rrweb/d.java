package io.sentry.rrweb;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.util.w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends io.sentry.rrweb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f51280c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public boolean a(d dVar, String str, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            if (!str.equals("source")) {
                return false;
            }
            dVar.f51280c = (b) w.c((b) interfaceC5218j1.C0(iLogger, new b.a()), "");
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b implements B0 {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements InterfaceC5267r0 {
            @Override // io.sentry.InterfaceC5267r0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
                return b.values()[interfaceC5218j1.nextInt()];
            }
        }

        @Override // io.sentry.B0
        public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
            interfaceC5223k1.a(ordinal());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public void a(d dVar, InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
            interfaceC5223k1.e("source").j(iLogger, dVar.f51280c);
        }
    }

    public d(b bVar) {
        super(io.sentry.rrweb.c.IncrementalSnapshot);
        this.f51280c = bVar;
    }
}
