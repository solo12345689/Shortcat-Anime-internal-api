package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C2817v extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K f29508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29509b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends C2817v {
        public a(String str) {
            super(str);
        }
    }

    public C2817v(String str) {
        super(str);
        this.f29508a = null;
    }

    static C2817v b() {
        return new C2817v("Protocol message end-group tag did not match expected tag.");
    }

    static C2817v c() {
        return new C2817v("Protocol message contained an invalid tag (zero).");
    }

    static C2817v d() {
        return new C2817v("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C2817v f() {
        return new C2817v("CodedInputStream encountered a malformed varint.");
    }

    static C2817v g() {
        return new C2817v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C2817v h() {
        return new C2817v("Failed to parse the message.");
    }

    static C2817v i() {
        return new C2817v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static C2817v l() {
        return new C2817v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C2817v m() {
        return new C2817v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f29509b;
    }

    void j() {
        this.f29509b = true;
    }

    public C2817v k(K k10) {
        this.f29508a = k10;
        return this;
    }

    public C2817v(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f29508a = null;
    }
}
