package Wf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Wf.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2361e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f20912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumC2357a f20913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f20916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f20919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f20920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Yf.e f20921q;

    public C2361e(AbstractC2358b json) {
        AbstractC5504s.h(json, "json");
        this.f20905a = json.f().i();
        this.f20906b = json.f().j();
        this.f20907c = json.f().k();
        this.f20908d = json.f().q();
        this.f20909e = json.f().m();
        this.f20910f = json.f().n();
        this.f20911g = json.f().g();
        this.f20912h = json.f().e();
        this.f20913i = json.f().f();
        this.f20914j = json.f().o();
        json.f().l();
        this.f20915k = json.f().h();
        this.f20916l = json.f().d();
        this.f20917m = json.f().a();
        this.f20918n = json.f().b();
        this.f20919o = json.f().c();
        this.f20920p = json.f().p();
        this.f20921q = json.a();
    }

    public final C2363g a() {
        if (this.f20920p) {
            if (!AbstractC5504s.c(this.f20912h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.f20913i != EnumC2357a.f20892c) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.f20909e) {
            if (!AbstractC5504s.c(this.f20910f, "    ")) {
                String str = this.f20910f;
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f20910f).toString());
                    }
                }
            }
        } else if (!AbstractC5504s.c(this.f20910f, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new C2363g(this.f20905a, this.f20907c, this.f20908d, this.f20919o, this.f20909e, this.f20906b, this.f20910f, this.f20911g, this.f20920p, this.f20912h, this.f20918n, this.f20914j, null, this.f20915k, this.f20916l, this.f20917m, this.f20913i);
    }

    public final Yf.e b() {
        return this.f20921q;
    }

    public final void c(String str) {
        AbstractC5504s.h(str, "<set-?>");
        this.f20912h = str;
    }

    public final void d(boolean z10) {
        this.f20905a = z10;
    }

    public final void e(boolean z10) {
        this.f20906b = z10;
    }

    public final void f(boolean z10) {
        this.f20907c = z10;
    }

    public final void g(Yf.e eVar) {
        AbstractC5504s.h(eVar, "<set-?>");
        this.f20921q = eVar;
    }
}
