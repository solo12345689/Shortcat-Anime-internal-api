package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class H0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Z0 f39070a;

    public H0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f39070a = null;
    }

    static H0 a() {
        return new H0("Protocol message contained an invalid tag (zero).");
    }

    static H0 b() {
        return new H0("Protocol message had invalid UTF-8.");
    }

    static H0 c() {
        return new H0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static H0 d() {
        return new H0("Failed to parse the message.");
    }

    static H0 f() {
        return new H0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final H0 e(Z0 z02) {
        this.f39070a = z02;
        return this;
    }

    public H0(String str) {
        super(str);
        this.f39070a = null;
    }
}
