package io.sentry.transport;

import java.net.Authenticator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f51380a = new l();

    private l() {
    }

    public static l a() {
        return f51380a;
    }

    public void b(Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}
