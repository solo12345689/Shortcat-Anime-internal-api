package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class u extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51391b;

    u(String str, String str2) {
        this.f51390a = (String) io.sentry.util.w.c(str, "user is required");
        this.f51391b = (String) io.sentry.util.w.c(str2, "password is required");
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f51390a, this.f51391b.toCharArray());
        }
        return null;
    }
}
