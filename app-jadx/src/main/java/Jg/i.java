package jg;

import Td.AbstractC2156g;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IOException f51909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f51910b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IOException firstConnectException) {
        super(firstConnectException);
        AbstractC5504s.h(firstConnectException, "firstConnectException");
        this.f51909a = firstConnectException;
        this.f51910b = firstConnectException;
    }

    public final void a(IOException e10) {
        AbstractC5504s.h(e10, "e");
        AbstractC2156g.a(this.f51909a, e10);
        this.f51910b = e10;
    }

    public final IOException b() {
        return this.f51909a;
    }

    public final IOException c() {
        return this.f51910b;
    }
}
