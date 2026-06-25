package Cd;

import Td.AbstractC2163n;
import Td.L;
import Td.z;
import Ud.S;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ie.InterfaceC5082a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f3017r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Lazy f3018s = AbstractC2163n.b(new InterfaceC5082a() { // from class: Cd.a
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return b.b();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f3022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f3023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f3024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f3026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final JSONObject f3027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c f3028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f3029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f3030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final double f3031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Date f3032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f3033o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Date f3034p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Date f3035q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SimpleDateFormat a() {
            return (SimpleDateFormat) b.f3018s.getValue();
        }

        private a() {
        }
    }

    private b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, JSONObject jSONObject, JSONObject jSONObject2, c cVar, d dVar, d dVar2, double d10, Date date, int i11, Date date2, Date date3) {
        this.f3019a = z10;
        this.f3020b = z11;
        this.f3021c = z12;
        this.f3022d = z13;
        this.f3023e = z14;
        this.f3024f = z15;
        this.f3025g = i10;
        this.f3026h = jSONObject;
        this.f3027i = jSONObject2;
        this.f3028j = cVar;
        this.f3029k = dVar;
        this.f3030l = dVar2;
        this.f3031m = d10;
        this.f3032n = date;
        this.f3033o = i11;
        this.f3034p = date2;
        this.f3035q = date3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public final b d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, double d10, boolean z15, int i10, JSONObject jSONObject, JSONObject jSONObject2, c cVar, d dVar, d dVar2, Date date, Date date2, Date date3) {
        return new b(z10, z11, z12, z13, z14, z15, i10, jSONObject, jSONObject2, cVar, dVar, dVar2, d10, date, this.f3033o + 1, date2, date3);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isStartupProcedureRunning", this.f3019a);
        bundle.putBoolean("isUpdateAvailable", this.f3020b);
        bundle.putBoolean("isUpdatePending", this.f3021c);
        bundle.putBoolean("isChecking", this.f3022d);
        bundle.putBoolean("isDownloading", this.f3023e);
        bundle.putBoolean("isRestarting", this.f3024f);
        bundle.putInt("restartCount", this.f3025g);
        bundle.putInt("sequenceNumber", this.f3033o);
        bundle.putDouble("downloadProgress", this.f3031m);
        JSONObject jSONObject = this.f3026h;
        if (jSONObject != null) {
            bundle.putString("latestManifestString", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f3027i;
        if (jSONObject2 != null) {
            bundle.putString("downloadedManifestString", jSONObject2.toString());
        }
        if (this.f3028j != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("commitTime", this.f3028j.a());
            L l10 = L.f17438a;
            bundle.putBundle("rollback", bundle2);
        }
        if (this.f3029k != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("message", this.f3029k.b());
            bundle.putBundle("checkError", bundle3);
        }
        if (this.f3030l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putString("message", this.f3030l.b());
            bundle.putBundle("downloadError", bundle4);
        }
        if (this.f3032n != null) {
            bundle.putString("lastCheckForUpdateTimeString", f3017r.a().format(this.f3032n));
        }
        return bundle;
    }

    public final Map g() {
        Map mapN = S.n(z.a("isStartupProcedureRunning", Boolean.valueOf(this.f3019a)), z.a("isUpdateAvailable", Boolean.valueOf(this.f3020b)), z.a("isUpdatePending", Boolean.valueOf(this.f3021c)), z.a("isChecking", Boolean.valueOf(this.f3022d)), z.a("isDownloading", Boolean.valueOf(this.f3023e)), z.a("isRestarting", Boolean.valueOf(this.f3024f)), z.a("restartCount", Integer.valueOf(this.f3025g)), z.a("downloadProgress", Double.valueOf(this.f3031m)), z.a("sequenceNumber", Integer.valueOf(this.f3033o)));
        JSONObject jSONObject = this.f3026h;
        if (jSONObject != null) {
            mapN.put("latestManifest", jSONObject);
        }
        JSONObject jSONObject2 = this.f3027i;
        if (jSONObject2 != null) {
            mapN.put("downloadedManifest", jSONObject2);
        }
        c cVar = this.f3028j;
        if (cVar != null) {
            mapN.put("rollback", cVar.b());
        }
        d dVar = this.f3029k;
        if (dVar != null) {
            mapN.put("checkError", dVar.a());
        }
        d dVar2 = this.f3030l;
        if (dVar2 != null) {
            mapN.put("downloadError", dVar2.a());
        }
        Date date = this.f3032n;
        if (date != null) {
            mapN.put("lastCheckForUpdateTime", date);
        }
        Date date2 = this.f3034p;
        if (date2 != null) {
            mapN.put("downloadStartTime", Long.valueOf(date2.getTime()));
        }
        Date date3 = this.f3035q;
        if (date3 != null) {
            mapN.put("downloadFinishTime", Long.valueOf(date3.getTime()));
        }
        return mapN;
    }

    public final b h() {
        return new b(false, false, false, false, false, false, this.f3025g + 1, null, null, null, null, null, 0.0d, null, this.f3033o + 1, null, null, 114623, null);
    }

    /* synthetic */ b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, JSONObject jSONObject, JSONObject jSONObject2, c cVar, d dVar, d dVar2, double d10, Date date, int i11, Date date2, Date date3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? false : z15, (i12 & 64) != 0 ? 0 : i10, (i12 & 128) != 0 ? null : jSONObject, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : jSONObject2, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : cVar, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : dVar, (i12 & 2048) != 0 ? null : dVar2, (i12 & 4096) != 0 ? 0.0d : d10, (i12 & 8192) != 0 ? null : date, i11, (32768 & i12) != 0 ? null : date2, (i12 & 65536) != 0 ? null : date3);
    }

    public /* synthetic */ b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, JSONObject jSONObject, JSONObject jSONObject2, c cVar, d dVar, d dVar2, double d10, Date date, Date date2, Date date3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? false : z14, (i11 & 32) != 0 ? false : z15, (i11 & 64) == 0 ? i10 : 0, (i11 & 128) != 0 ? null : jSONObject, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : jSONObject2, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : cVar, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : dVar, (i11 & 2048) != 0 ? null : dVar2, (i11 & 4096) != 0 ? 0.0d : d10, (i11 & 8192) != 0 ? null : date, (i11 & 16384) != 0 ? null : date2, (i11 & 32768) != 0 ? null : date3);
    }

    public b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, JSONObject jSONObject, JSONObject jSONObject2, c cVar, d dVar, d dVar2, double d10, Date date, Date date2, Date date3) {
        this(z10, z11, z12, z13, z14, z15, i10, jSONObject, jSONObject2, cVar, dVar, dVar2, d10, date, 0, date2, date3);
    }
}
