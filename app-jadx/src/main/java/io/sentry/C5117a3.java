package io.sentry;

/* JADX INFO: renamed from: io.sentry.a3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5117a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f49400a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49401b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49402c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f49403d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f49404e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49405f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f49406g = "Report a Bug";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharSequence f49407h = "Send Bug Report";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f49408i = "Cancel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f49409j = "Name";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f49410k = "Your Name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CharSequence f49411l = "Email";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CharSequence f49412m = "your.email@example.org";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f49413n = " (Required)";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f49414o = "Description";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f49415p = "What's the bug? What did you expect?";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f49416q = "Thank you for your report!";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f49417r;

    /* JADX INFO: renamed from: io.sentry.a3$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
    }

    public C5117a3(a aVar) {
        this.f49417r = aVar;
    }

    public boolean a() {
        return this.f49402c;
    }

    public boolean b() {
        return this.f49400a;
    }

    public boolean c() {
        return this.f49405f;
    }

    public boolean d() {
        return this.f49403d;
    }

    public boolean e() {
        return this.f49401b;
    }

    public boolean f() {
        return this.f49404e;
    }

    public void g(a aVar) {
        this.f49417r = aVar;
    }

    public void h(boolean z10) {
        this.f49402c = z10;
    }

    public void i(boolean z10) {
        this.f49400a = z10;
    }

    public void j(boolean z10) {
        this.f49405f = z10;
    }

    public void k(boolean z10) {
        this.f49403d = z10;
    }

    public void l(boolean z10) {
        this.f49401b = z10;
    }

    public void m(boolean z10) {
        this.f49404e = z10;
    }

    public String toString() {
        return "SentryFeedbackOptions{isNameRequired=" + this.f49400a + ", showName=" + this.f49401b + ", isEmailRequired=" + this.f49402c + ", showEmail=" + this.f49403d + ", useSentryUser=" + this.f49404e + ", showBranding=" + this.f49405f + ", formTitle='" + ((Object) this.f49406g) + "', submitButtonLabel='" + ((Object) this.f49407h) + "', cancelButtonLabel='" + ((Object) this.f49408i) + "', nameLabel='" + ((Object) this.f49409j) + "', namePlaceholder='" + ((Object) this.f49410k) + "', emailLabel='" + ((Object) this.f49411l) + "', emailPlaceholder='" + ((Object) this.f49412m) + "', isRequiredLabel='" + ((Object) this.f49413n) + "', messageLabel='" + ((Object) this.f49414o) + "', messagePlaceholder='" + ((Object) this.f49415p) + "'}";
    }
}
