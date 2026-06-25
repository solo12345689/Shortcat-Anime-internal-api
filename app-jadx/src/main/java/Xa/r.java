package xa;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class r extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC7070D f64265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f64266b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends r {
        public a(String str) {
            super(str);
        }
    }

    public r(String str) {
        super(str);
        this.f64265a = null;
    }

    static r b() {
        return new r("Protocol message end-group tag did not match expected tag.");
    }

    static r c() {
        return new r("Protocol message contained an invalid tag (zero).");
    }

    static r d() {
        return new r("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static r f() {
        return new r("CodedInputStream encountered a malformed varint.");
    }

    static r g() {
        return new r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static r h() {
        return new r("Failed to parse the message.");
    }

    static r i() {
        return new r("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static r l() {
        return new r("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static r m() {
        return new r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f64266b;
    }

    void j() {
        this.f64266b = true;
    }

    public r k(InterfaceC7070D interfaceC7070D) {
        this.f64265a = interfaceC7070D;
        return this;
    }

    public r(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f64265a = null;
    }
}
