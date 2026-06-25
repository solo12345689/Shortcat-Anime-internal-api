package Bb;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1634e;

    public m(List headers, int i10, String statusText, String url, boolean z10) {
        AbstractC5504s.h(headers, "headers");
        AbstractC5504s.h(statusText, "statusText");
        AbstractC5504s.h(url, "url");
        this.f1630a = headers;
        this.f1631b = i10;
        this.f1632c = statusText;
        this.f1633d = url;
        this.f1634e = z10;
    }

    public final List a() {
        return this.f1630a;
    }

    public final boolean b() {
        return this.f1634e;
    }

    public final int c() {
        return this.f1631b;
    }

    public final String d() {
        return this.f1632c;
    }

    public final String e() {
        return this.f1633d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC5504s.c(this.f1630a, mVar.f1630a) && this.f1631b == mVar.f1631b && AbstractC5504s.c(this.f1632c, mVar.f1632c) && AbstractC5504s.c(this.f1633d, mVar.f1633d) && this.f1634e == mVar.f1634e;
    }

    public int hashCode() {
        return (((((((this.f1630a.hashCode() * 31) + Integer.hashCode(this.f1631b)) * 31) + this.f1632c.hashCode()) * 31) + this.f1633d.hashCode()) * 31) + Boolean.hashCode(this.f1634e);
    }

    public String toString() {
        return "NativeResponseInit(headers=" + this.f1630a + ", status=" + this.f1631b + ", statusText=" + this.f1632c + ", url=" + this.f1633d + ", redirected=" + this.f1634e + ")";
    }
}
