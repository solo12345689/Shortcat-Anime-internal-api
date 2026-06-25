package io.sentry;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public enum a4 implements B0 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(RCHTTPStatusCodes.NOT_FOUND),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(RCHTTPStatusCodes.FORBIDDEN),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(RCHTTPStatusCodes.UNAUTHORIZED);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public a4 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            return a4.valueOf(interfaceC5218j1.X0().toUpperCase(Locale.ROOT));
        }
    }

    a4(int i10) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i10;
    }

    public static a4 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static a4 fromHttpStatusCode(int i10) {
        for (a4 a4Var : values()) {
            if (a4Var.matches(i10)) {
                return a4Var;
            }
        }
        return null;
    }

    private boolean matches(int i10) {
        return i10 >= this.minHttpStatusCode && i10 <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.f(apiName());
    }

    public static a4 fromHttpStatusCode(Integer num, a4 a4Var) {
        a4 a4VarFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : a4Var;
        return a4VarFromHttpStatusCode != null ? a4VarFromHttpStatusCode : a4Var;
    }

    a4(int i10, int i11) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i11;
    }
}
