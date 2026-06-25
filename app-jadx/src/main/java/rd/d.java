package rd;

import Td.z;
import Ud.S;
import android.net.Uri;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;
import sd.EnumC6452b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f58757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f58758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f58759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f58760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f58761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f58762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f58763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f58764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumC6452b f58765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f58766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Date f58767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f58768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f58769m;

    public d(UUID id2, Date commitTime, String runtimeVersion, String scopeKey, JSONObject manifest, Uri uri, Map map) {
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(commitTime, "commitTime");
        AbstractC5504s.h(runtimeVersion, "runtimeVersion");
        AbstractC5504s.h(scopeKey, "scopeKey");
        AbstractC5504s.h(manifest, "manifest");
        this.f58757a = id2;
        this.f58758b = commitTime;
        this.f58759c = runtimeVersion;
        this.f58760d = scopeKey;
        this.f58761e = manifest;
        this.f58762f = uri;
        this.f58763g = map;
        this.f58765i = EnumC6452b.f59349b;
        this.f58767k = new Date();
    }

    public final String a() {
        String string = new JSONObject(S.l(z.a(DiagnosticsEntry.ID_KEY, this.f58757a.toString()), z.a("status", this.f58765i.name()))).toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public final Date b() {
        return this.f58758b;
    }

    public final int c() {
        return this.f58769m;
    }

    public final UUID d() {
        return this.f58757a;
    }

    public final boolean e() {
        return this.f58766j;
    }

    public final Date f() {
        return this.f58767k;
    }

    public final Long g() {
        return this.f58764h;
    }

    public final String h() {
        String string = this.f58757a.toString();
        AbstractC5504s.g(string, "toString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final JSONObject i() {
        return this.f58761e;
    }

    public final Map j() {
        return this.f58763g;
    }

    public final String k() {
        return this.f58759c;
    }

    public final String l() {
        return this.f58760d;
    }

    public final EnumC6452b m() {
        return this.f58765i;
    }

    public final int n() {
        return this.f58768l;
    }

    public final Uri o() {
        return this.f58762f;
    }

    public final void p(Date date) {
        AbstractC5504s.h(date, "<set-?>");
        this.f58758b = date;
    }

    public final void q(int i10) {
        this.f58769m = i10;
    }

    public final void r(boolean z10) {
        this.f58766j = z10;
    }

    public final void s(Date date) {
        AbstractC5504s.h(date, "<set-?>");
        this.f58767k = date;
    }

    public final void t(Long l10) {
        this.f58764h = l10;
    }

    public final void u(String str) {
        AbstractC5504s.h(str, "<set-?>");
        this.f58760d = str;
    }

    public final void v(EnumC6452b enumC6452b) {
        AbstractC5504s.h(enumC6452b, "<set-?>");
        this.f58765i = enumC6452b;
    }

    public final void w(int i10) {
        this.f58768l = i10;
    }
}
