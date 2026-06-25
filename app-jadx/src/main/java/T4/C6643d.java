package t4;

import android.os.Bundle;
import cg.q;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: t4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6643d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f60724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeUnit f60726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f60727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f60728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f60729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f60730g;

    /* JADX INFO: renamed from: t4.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        SET,
        SET_AND_ALLOW_WHILE_IDLE,
        SET_EXACT,
        SET_EXACT_AND_ALLOW_WHILE_IDLE,
        SET_ALARM_CLOCK
    }

    public C6643d(Bundle bundle) {
        this.f60725b = -1;
        this.f60726c = null;
        this.f60727d = Boolean.FALSE;
        a aVar = a.SET_EXACT;
        this.f60728e = aVar;
        this.f60729f = null;
        this.f60730g = null;
        this.f60724a = bundle;
        if (bundle.containsKey("repeatFrequency")) {
            int iA = q.a(this.f60724a.get("repeatFrequency"));
            this.f60730g = Long.valueOf(q.d(this.f60724a.get(DiagnosticsEntry.TIMESTAMP_KEY)));
            if (iA == 0) {
                this.f60725b = 1;
                this.f60726c = TimeUnit.HOURS;
                this.f60729f = "HOURLY";
            } else if (iA == 1) {
                this.f60725b = 1;
                this.f60726c = TimeUnit.DAYS;
                this.f60729f = "DAILY";
            } else if (iA == 2) {
                this.f60725b = 7;
                this.f60726c = TimeUnit.DAYS;
                this.f60729f = "WEEKLY";
            }
        }
        if (!this.f60724a.containsKey("alarmManager")) {
            if (this.f60724a.containsKey("allowWhileIdle")) {
                this.f60727d = Boolean.TRUE;
                this.f60728e = a.SET_EXACT_AND_ALLOW_WHILE_IDLE;
                return;
            }
            return;
        }
        this.f60727d = Boolean.TRUE;
        Bundle bundle2 = this.f60724a.getBundle("alarmManager");
        Object obj = bundle2.get("type");
        int iA2 = obj != null ? q.a(obj) : 2;
        if (bundle2.containsKey("allowWhileIdle") && bundle2.getBoolean("allowWhileIdle")) {
            iA2 = 3;
        }
        if (iA2 == 0) {
            this.f60728e = a.SET;
            return;
        }
        if (iA2 == 1) {
            this.f60728e = a.SET_AND_ALLOW_WHILE_IDLE;
            return;
        }
        if (iA2 == 3) {
            this.f60728e = a.SET_EXACT_AND_ALLOW_WHILE_IDLE;
        } else if (iA2 != 4) {
            this.f60728e = aVar;
        } else {
            this.f60728e = a.SET_ALARM_CLOCK;
        }
    }

    public void a() {
        long j10;
        if (this.f60729f == null) {
            return;
        }
        long jLongValue = this.f60730g.longValue();
        String str = this.f60729f;
        str.getClass();
        switch (str) {
            case "WEEKLY":
                j10 = 604800000;
                break;
            case "DAILY":
                j10 = 86400000;
                break;
            case "HOURLY":
                j10 = 3600000;
                break;
            default:
                j10 = 0;
                break;
        }
        while (jLongValue < System.currentTimeMillis()) {
            jLongValue += j10;
        }
        this.f60730g = Long.valueOf(jLongValue);
    }
}
