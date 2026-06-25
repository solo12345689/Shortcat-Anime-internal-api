package rd;

import Df.r;
import android.net.Uri;
import java.util.Date;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;
import sd.EnumC6451a;

/* JADX INFO: renamed from: rd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6306a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f58731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f58732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f58733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f58734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f58735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f58736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f58737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Date f58738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f58739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f58740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private EnumC6451a f58741k = EnumC6451a.f59345a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f58742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f58743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f58744n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f58745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f58746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f58747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Float f58748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Float[] f58749s;

    public C6306a(String str, String str2) {
        this.f58731a = str;
        this.f58732b = str2;
    }

    public final void A(JSONObject jSONObject) {
        this.f58735e = jSONObject;
    }

    public final void B(long j10) {
        this.f58733c = j10;
    }

    public final void C(boolean z10) {
        this.f58744n = z10;
    }

    public final void D(boolean z10) {
        this.f58743m = z10;
    }

    public final void E(JSONObject jSONObject) {
        this.f58737g = jSONObject;
    }

    public final void F(String str) {
        this.f58739i = str;
    }

    public final void G(String str) {
        this.f58746p = str;
    }

    public final void H(String str) {
        this.f58747q = str;
    }

    public final void I(Float f10) {
        this.f58748r = f10;
    }

    public final void J(Float[] fArr) {
        this.f58749s = fArr;
    }

    public final void K(Uri uri) {
        this.f58734d = uri;
    }

    public final Date a() {
        return this.f58738h;
    }

    public final String b() {
        return this.f58745o;
    }

    public final String c() {
        return this.f58742l;
    }

    public final JSONObject d() {
        return this.f58736f;
    }

    public final String e() {
        String str = this.f58732b;
        if (str == null) {
            return "";
        }
        if (r.Q(str, ".", false, 2, null)) {
            return str;
        }
        return "." + str;
    }

    public final byte[] f() {
        return this.f58740j;
    }

    public final EnumC6451a g() {
        return this.f58741k;
    }

    public final JSONObject h() {
        return this.f58735e;
    }

    public final long i() {
        return this.f58733c;
    }

    public final String j() {
        return this.f58731a;
    }

    public final boolean k() {
        return this.f58743m;
    }

    public final JSONObject l() {
        return this.f58737g;
    }

    public final String m() {
        return this.f58739i;
    }

    public final String n() {
        return this.f58746p;
    }

    public final String o() {
        return this.f58747q;
    }

    public final Float p() {
        return this.f58748r;
    }

    public final Float[] q() {
        return this.f58749s;
    }

    public final String r() {
        return this.f58732b;
    }

    public final Uri s() {
        return this.f58734d;
    }

    public final boolean t() {
        return this.f58744n;
    }

    public final void u(Date date) {
        this.f58738h = date;
    }

    public final void v(String str) {
        this.f58745o = str;
    }

    public final void w(String str) {
        this.f58742l = str;
    }

    public final void x(JSONObject jSONObject) {
        this.f58736f = jSONObject;
    }

    public final void y(byte[] bArr) {
        this.f58740j = bArr;
    }

    public final void z(EnumC6451a enumC6451a) {
        AbstractC5504s.h(enumC6451a, "<set-?>");
        this.f58741k = enumC6451a;
    }
}
