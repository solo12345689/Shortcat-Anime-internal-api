package n4;

import android.database.Cursor;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import i4.EnumC5035a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n4.C5745u;

/* JADX INFO: renamed from: n4.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5747w implements InterfaceC5746v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M3.q f53965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.i f53966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M3.h f53967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M3.w f53968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M3.w f53969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final M3.w f53970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M3.w f53971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final M3.w f53972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final M3.w f53973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final M3.w f53974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final M3.w f53975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final M3.w f53976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final M3.w f53977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final M3.w f53978n;

    /* JADX INFO: renamed from: n4.w$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends M3.w {
        a(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: n4.w$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends M3.w {
        b(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: renamed from: n4.w$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends M3.w {
        c(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* JADX INFO: renamed from: n4.w$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends M3.w {
        d(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: n4.w$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e extends M3.i {
        e(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // M3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(S3.k kVar, C5745u c5745u) throws Throwable {
            String str = c5745u.f53943a;
            if (str == null) {
                kVar.I1(1);
            } else {
                kVar.Z0(1, str);
            }
            C5724B c5724b = C5724B.f53901a;
            kVar.m1(2, C5724B.j(c5745u.f53944b));
            String str2 = c5745u.f53945c;
            if (str2 == null) {
                kVar.I1(3);
            } else {
                kVar.Z0(3, str2);
            }
            String str3 = c5745u.f53946d;
            if (str3 == null) {
                kVar.I1(4);
            } else {
                kVar.Z0(4, str3);
            }
            byte[] bArrO = androidx.work.b.o(c5745u.f53947e);
            if (bArrO == null) {
                kVar.I1(5);
            } else {
                kVar.p1(5, bArrO);
            }
            byte[] bArrO2 = androidx.work.b.o(c5745u.f53948f);
            if (bArrO2 == null) {
                kVar.I1(6);
            } else {
                kVar.p1(6, bArrO2);
            }
            kVar.m1(7, c5745u.f53949g);
            kVar.m1(8, c5745u.f53950h);
            kVar.m1(9, c5745u.f53951i);
            kVar.m1(10, c5745u.f53953k);
            kVar.m1(11, C5724B.a(c5745u.f53954l));
            kVar.m1(12, c5745u.f53955m);
            kVar.m1(13, c5745u.f53956n);
            kVar.m1(14, c5745u.f53957o);
            kVar.m1(15, c5745u.f53958p);
            kVar.m1(16, c5745u.f53959q ? 1L : 0L);
            kVar.m1(17, C5724B.h(c5745u.f53960r));
            kVar.m1(18, c5745u.g());
            kVar.m1(19, c5745u.f());
            i4.b bVar = c5745u.f53952j;
            if (bVar == null) {
                kVar.I1(20);
                kVar.I1(21);
                kVar.I1(22);
                kVar.I1(23);
                kVar.I1(24);
                kVar.I1(25);
                kVar.I1(26);
                kVar.I1(27);
                return;
            }
            kVar.m1(20, C5724B.g(bVar.d()));
            kVar.m1(21, bVar.g() ? 1L : 0L);
            kVar.m1(22, bVar.h() ? 1L : 0L);
            kVar.m1(23, bVar.f() ? 1L : 0L);
            kVar.m1(24, bVar.i() ? 1L : 0L);
            kVar.m1(25, bVar.b());
            kVar.m1(26, bVar.a());
            byte[] bArrI = C5724B.i(bVar.c());
            if (bArrI == null) {
                kVar.I1(27);
            } else {
                kVar.p1(27, bArrI);
            }
        }
    }

    /* JADX INFO: renamed from: n4.w$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f extends M3.h {
        f(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // M3.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(S3.k kVar, C5745u c5745u) throws Throwable {
            String str = c5745u.f53943a;
            if (str == null) {
                kVar.I1(1);
            } else {
                kVar.Z0(1, str);
            }
            C5724B c5724b = C5724B.f53901a;
            kVar.m1(2, C5724B.j(c5745u.f53944b));
            String str2 = c5745u.f53945c;
            if (str2 == null) {
                kVar.I1(3);
            } else {
                kVar.Z0(3, str2);
            }
            String str3 = c5745u.f53946d;
            if (str3 == null) {
                kVar.I1(4);
            } else {
                kVar.Z0(4, str3);
            }
            byte[] bArrO = androidx.work.b.o(c5745u.f53947e);
            if (bArrO == null) {
                kVar.I1(5);
            } else {
                kVar.p1(5, bArrO);
            }
            byte[] bArrO2 = androidx.work.b.o(c5745u.f53948f);
            if (bArrO2 == null) {
                kVar.I1(6);
            } else {
                kVar.p1(6, bArrO2);
            }
            kVar.m1(7, c5745u.f53949g);
            kVar.m1(8, c5745u.f53950h);
            kVar.m1(9, c5745u.f53951i);
            kVar.m1(10, c5745u.f53953k);
            kVar.m1(11, C5724B.a(c5745u.f53954l));
            kVar.m1(12, c5745u.f53955m);
            kVar.m1(13, c5745u.f53956n);
            kVar.m1(14, c5745u.f53957o);
            kVar.m1(15, c5745u.f53958p);
            kVar.m1(16, c5745u.f53959q ? 1L : 0L);
            kVar.m1(17, C5724B.h(c5745u.f53960r));
            kVar.m1(18, c5745u.g());
            kVar.m1(19, c5745u.f());
            i4.b bVar = c5745u.f53952j;
            if (bVar != null) {
                kVar.m1(20, C5724B.g(bVar.d()));
                kVar.m1(21, bVar.g() ? 1L : 0L);
                kVar.m1(22, bVar.h() ? 1L : 0L);
                kVar.m1(23, bVar.f() ? 1L : 0L);
                kVar.m1(24, bVar.i() ? 1L : 0L);
                kVar.m1(25, bVar.b());
                kVar.m1(26, bVar.a());
                byte[] bArrI = C5724B.i(bVar.c());
                if (bArrI == null) {
                    kVar.I1(27);
                } else {
                    kVar.p1(27, bArrI);
                }
            } else {
                kVar.I1(20);
                kVar.I1(21);
                kVar.I1(22);
                kVar.I1(23);
                kVar.I1(24);
                kVar.I1(25);
                kVar.I1(26);
                kVar.I1(27);
            }
            String str4 = c5745u.f53943a;
            if (str4 == null) {
                kVar.I1(28);
            } else {
                kVar.Z0(28, str4);
            }
        }
    }

    /* JADX INFO: renamed from: n4.w$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g extends M3.w {
        g(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: n4.w$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h extends M3.w {
        h(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: n4.w$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i extends M3.w {
        i(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: n4.w$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class j extends M3.w {
        j(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: n4.w$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class k extends M3.w {
        k(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: n4.w$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class l extends M3.w {
        l(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: n4.w$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class m extends M3.w {
        m(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public C5747w(M3.q qVar) {
        this.f53965a = qVar;
        this.f53966b = new e(qVar);
        this.f53967c = new f(qVar);
        this.f53968d = new g(qVar);
        this.f53969e = new h(qVar);
        this.f53970f = new i(qVar);
        this.f53971g = new j(qVar);
        this.f53972h = new k(qVar);
        this.f53973i = new l(qVar);
        this.f53974j = new m(qVar);
        this.f53975k = new a(qVar);
        this.f53976l = new b(qVar);
        this.f53977m = new c(qVar);
        this.f53978n = new d(qVar);
    }

    public static List y() {
        return Collections.EMPTY_LIST;
    }

    @Override // n4.InterfaceC5746v
    public void a(String str) {
        this.f53965a.d();
        S3.k kVarB = this.f53968d.b();
        if (str == null) {
            kVarB.I1(1);
        } else {
            kVarB.Z0(1, str);
        }
        this.f53965a.e();
        try {
            kVarB.Z();
            this.f53965a.B();
        } finally {
            this.f53965a.i();
            this.f53968d.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5746v
    public void b() {
        this.f53965a.d();
        S3.k kVarB = this.f53977m.b();
        this.f53965a.e();
        try {
            kVarB.Z();
            this.f53965a.B();
        } finally {
            this.f53965a.i();
            this.f53977m.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5746v
    public void c(String str) {
        this.f53965a.d();
        S3.k kVarB = this.f53970f.b();
        if (str == null) {
            kVarB.I1(1);
        } else {
            kVarB.Z0(1, str);
        }
        this.f53965a.e();
        try {
            kVarB.Z();
            this.f53965a.B();
        } finally {
            this.f53965a.i();
            this.f53970f.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5746v
    public List d(long j10) throws Throwable {
        M3.t tVar;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        M3.t tVarG = M3.t.g("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        tVarG.m1(1, j10);
        this.f53965a.d();
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            iE2 = O3.a.e(cursorB, "state");
            iE3 = O3.a.e(cursorB, "worker_class_name");
            iE4 = O3.a.e(cursorB, "input_merger_class_name");
            iE5 = O3.a.e(cursorB, "input");
            iE6 = O3.a.e(cursorB, "output");
            iE7 = O3.a.e(cursorB, "initial_delay");
            iE8 = O3.a.e(cursorB, "interval_duration");
            iE9 = O3.a.e(cursorB, "flex_duration");
            iE10 = O3.a.e(cursorB, "run_attempt_count");
            iE11 = O3.a.e(cursorB, "backoff_policy");
            iE12 = O3.a.e(cursorB, "backoff_delay_duration");
            iE13 = O3.a.e(cursorB, "last_enqueue_time");
            iE14 = O3.a.e(cursorB, "minimum_retention_duration");
            tVar = tVarG;
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarG;
        }
        try {
            int iE15 = O3.a.e(cursorB, "schedule_requested_at");
            int iE16 = O3.a.e(cursorB, "run_in_foreground");
            int iE17 = O3.a.e(cursorB, "out_of_quota_policy");
            int iE18 = O3.a.e(cursorB, "period_count");
            int iE19 = O3.a.e(cursorB, "generation");
            int iE20 = O3.a.e(cursorB, "required_network_type");
            int iE21 = O3.a.e(cursorB, "requires_charging");
            int iE22 = O3.a.e(cursorB, "requires_device_idle");
            int iE23 = O3.a.e(cursorB, "requires_battery_not_low");
            int iE24 = O3.a.e(cursorB, "requires_storage_not_low");
            int iE25 = O3.a.e(cursorB, "trigger_content_update_delay");
            int iE26 = O3.a.e(cursorB, "trigger_max_content_delay");
            int iE27 = O3.a.e(cursorB, "content_uri_triggers");
            int i10 = iE14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                i4.s sVarF = C5724B.f(cursorB.getInt(iE2));
                String string2 = cursorB.isNull(iE3) ? null : cursorB.getString(iE3);
                String string3 = cursorB.isNull(iE4) ? null : cursorB.getString(iE4);
                androidx.work.b bVarH = androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5));
                androidx.work.b bVarH2 = androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6));
                long j11 = cursorB.getLong(iE7);
                long j12 = cursorB.getLong(iE8);
                long j13 = cursorB.getLong(iE9);
                int i11 = cursorB.getInt(iE10);
                EnumC5035a enumC5035aC = C5724B.c(cursorB.getInt(iE11));
                long j14 = cursorB.getLong(iE12);
                long j15 = cursorB.getLong(iE13);
                int i12 = i10;
                long j16 = cursorB.getLong(i12);
                int i13 = iE;
                int i14 = iE15;
                long j17 = cursorB.getLong(i14);
                iE15 = i14;
                int i15 = iE16;
                boolean z10 = cursorB.getInt(i15) != 0;
                iE16 = i15;
                int i16 = iE17;
                i4.m mVarE = C5724B.e(cursorB.getInt(i16));
                iE17 = i16;
                int i17 = iE18;
                int i18 = cursorB.getInt(i17);
                iE18 = i17;
                int i19 = iE19;
                int i20 = cursorB.getInt(i19);
                iE19 = i19;
                int i21 = iE20;
                i4.j jVarD = C5724B.d(cursorB.getInt(i21));
                iE20 = i21;
                int i22 = iE21;
                boolean z11 = cursorB.getInt(i22) != 0;
                iE21 = i22;
                int i23 = iE22;
                boolean z12 = cursorB.getInt(i23) != 0;
                iE22 = i23;
                int i24 = iE23;
                boolean z13 = cursorB.getInt(i24) != 0;
                iE23 = i24;
                int i25 = iE24;
                boolean z14 = cursorB.getInt(i25) != 0;
                iE24 = i25;
                int i26 = iE25;
                long j18 = cursorB.getLong(i26);
                iE25 = i26;
                int i27 = iE26;
                long j19 = cursorB.getLong(i27);
                iE26 = i27;
                int i28 = iE27;
                iE27 = i28;
                arrayList.add(new C5745u(string, sVarF, string2, string3, bVarH, bVarH2, j11, j12, j13, new i4.b(jVarD, z11, z12, z13, z14, j18, j19, C5724B.b(cursorB.isNull(i28) ? null : cursorB.getBlob(i28))), i11, enumC5035aC, j14, j15, j16, j17, z10, mVarE, i18, i20));
                iE = i13;
                i10 = i12;
            }
            cursorB.close();
            tVar.k();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorB.close();
            tVar.k();
            throw th;
        }
    }

    @Override // n4.InterfaceC5746v
    public List e() throws Throwable {
        M3.t tVar;
        M3.t tVarG = M3.t.g("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f53965a.d();
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            int iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            int iE2 = O3.a.e(cursorB, "state");
            int iE3 = O3.a.e(cursorB, "worker_class_name");
            int iE4 = O3.a.e(cursorB, "input_merger_class_name");
            int iE5 = O3.a.e(cursorB, "input");
            int iE6 = O3.a.e(cursorB, "output");
            int iE7 = O3.a.e(cursorB, "initial_delay");
            int iE8 = O3.a.e(cursorB, "interval_duration");
            int iE9 = O3.a.e(cursorB, "flex_duration");
            int iE10 = O3.a.e(cursorB, "run_attempt_count");
            int iE11 = O3.a.e(cursorB, "backoff_policy");
            int iE12 = O3.a.e(cursorB, "backoff_delay_duration");
            int iE13 = O3.a.e(cursorB, "last_enqueue_time");
            int iE14 = O3.a.e(cursorB, "minimum_retention_duration");
            tVar = tVarG;
            try {
                int iE15 = O3.a.e(cursorB, "schedule_requested_at");
                int iE16 = O3.a.e(cursorB, "run_in_foreground");
                int iE17 = O3.a.e(cursorB, "out_of_quota_policy");
                int iE18 = O3.a.e(cursorB, "period_count");
                int iE19 = O3.a.e(cursorB, "generation");
                int iE20 = O3.a.e(cursorB, "required_network_type");
                int iE21 = O3.a.e(cursorB, "requires_charging");
                int iE22 = O3.a.e(cursorB, "requires_device_idle");
                int iE23 = O3.a.e(cursorB, "requires_battery_not_low");
                int iE24 = O3.a.e(cursorB, "requires_storage_not_low");
                int iE25 = O3.a.e(cursorB, "trigger_content_update_delay");
                int iE26 = O3.a.e(cursorB, "trigger_max_content_delay");
                int iE27 = O3.a.e(cursorB, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                    i4.s sVarF = C5724B.f(cursorB.getInt(iE2));
                    String string2 = cursorB.isNull(iE3) ? null : cursorB.getString(iE3);
                    String string3 = cursorB.isNull(iE4) ? null : cursorB.getString(iE4);
                    androidx.work.b bVarH = androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5));
                    androidx.work.b bVarH2 = androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6));
                    long j10 = cursorB.getLong(iE7);
                    long j11 = cursorB.getLong(iE8);
                    long j12 = cursorB.getLong(iE9);
                    int i11 = cursorB.getInt(iE10);
                    EnumC5035a enumC5035aC = C5724B.c(cursorB.getInt(iE11));
                    long j13 = cursorB.getLong(iE12);
                    long j14 = cursorB.getLong(iE13);
                    int i12 = i10;
                    long j15 = cursorB.getLong(i12);
                    int i13 = iE;
                    int i14 = iE15;
                    long j16 = cursorB.getLong(i14);
                    iE15 = i14;
                    int i15 = iE16;
                    boolean z10 = cursorB.getInt(i15) != 0;
                    iE16 = i15;
                    int i16 = iE17;
                    i4.m mVarE = C5724B.e(cursorB.getInt(i16));
                    iE17 = i16;
                    int i17 = iE18;
                    int i18 = cursorB.getInt(i17);
                    iE18 = i17;
                    int i19 = iE19;
                    int i20 = cursorB.getInt(i19);
                    iE19 = i19;
                    int i21 = iE20;
                    i4.j jVarD = C5724B.d(cursorB.getInt(i21));
                    iE20 = i21;
                    int i22 = iE21;
                    boolean z11 = cursorB.getInt(i22) != 0;
                    iE21 = i22;
                    int i23 = iE22;
                    boolean z12 = cursorB.getInt(i23) != 0;
                    iE22 = i23;
                    int i24 = iE23;
                    boolean z13 = cursorB.getInt(i24) != 0;
                    iE23 = i24;
                    int i25 = iE24;
                    boolean z14 = cursorB.getInt(i25) != 0;
                    iE24 = i25;
                    int i26 = iE25;
                    long j17 = cursorB.getLong(i26);
                    iE25 = i26;
                    int i27 = iE26;
                    long j18 = cursorB.getLong(i27);
                    iE26 = i27;
                    int i28 = iE27;
                    iE27 = i28;
                    arrayList.add(new C5745u(string, sVarF, string2, string3, bVarH, bVarH2, j10, j11, j12, new i4.b(jVarD, z11, z12, z13, z14, j17, j18, C5724B.b(cursorB.isNull(i28) ? null : cursorB.getBlob(i28))), i11, enumC5035aC, j13, j14, j15, j16, z10, mVarE, i18, i20));
                    iE = i13;
                    i10 = i12;
                }
                cursorB.close();
                tVar.k();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorB.close();
                tVar.k();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            tVar = tVarG;
        }
    }

    @Override // n4.InterfaceC5746v
    public List f(String str) {
        M3.t tVarG = M3.t.g("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53965a.d();
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.isNull(0) ? null : cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // n4.InterfaceC5746v
    public i4.s g(String str) {
        M3.t tVarG = M3.t.g("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53965a.d();
        i4.s sVarF = null;
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            if (cursorB.moveToFirst()) {
                Integer numValueOf = cursorB.isNull(0) ? null : Integer.valueOf(cursorB.getInt(0));
                if (numValueOf != null) {
                    C5724B c5724b = C5724B.f53901a;
                    sVarF = C5724B.f(numValueOf.intValue());
                }
            }
            return sVarF;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // n4.InterfaceC5746v
    public C5745u h(String str) throws Throwable {
        M3.t tVar;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        C5745u c5745u;
        M3.t tVarG = M3.t.g("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53965a.d();
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            iE2 = O3.a.e(cursorB, "state");
            iE3 = O3.a.e(cursorB, "worker_class_name");
            iE4 = O3.a.e(cursorB, "input_merger_class_name");
            iE5 = O3.a.e(cursorB, "input");
            iE6 = O3.a.e(cursorB, "output");
            iE7 = O3.a.e(cursorB, "initial_delay");
            iE8 = O3.a.e(cursorB, "interval_duration");
            iE9 = O3.a.e(cursorB, "flex_duration");
            iE10 = O3.a.e(cursorB, "run_attempt_count");
            iE11 = O3.a.e(cursorB, "backoff_policy");
            iE12 = O3.a.e(cursorB, "backoff_delay_duration");
            iE13 = O3.a.e(cursorB, "last_enqueue_time");
            iE14 = O3.a.e(cursorB, "minimum_retention_duration");
            tVar = tVarG;
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarG;
        }
        try {
            int iE15 = O3.a.e(cursorB, "schedule_requested_at");
            int iE16 = O3.a.e(cursorB, "run_in_foreground");
            int iE17 = O3.a.e(cursorB, "out_of_quota_policy");
            int iE18 = O3.a.e(cursorB, "period_count");
            int iE19 = O3.a.e(cursorB, "generation");
            int iE20 = O3.a.e(cursorB, "required_network_type");
            int iE21 = O3.a.e(cursorB, "requires_charging");
            int iE22 = O3.a.e(cursorB, "requires_device_idle");
            int iE23 = O3.a.e(cursorB, "requires_battery_not_low");
            int iE24 = O3.a.e(cursorB, "requires_storage_not_low");
            int iE25 = O3.a.e(cursorB, "trigger_content_update_delay");
            int iE26 = O3.a.e(cursorB, "trigger_max_content_delay");
            int iE27 = O3.a.e(cursorB, "content_uri_triggers");
            if (cursorB.moveToFirst()) {
                c5745u = new C5745u(cursorB.isNull(iE) ? null : cursorB.getString(iE), C5724B.f(cursorB.getInt(iE2)), cursorB.isNull(iE3) ? null : cursorB.getString(iE3), cursorB.isNull(iE4) ? null : cursorB.getString(iE4), androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5)), androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6)), cursorB.getLong(iE7), cursorB.getLong(iE8), cursorB.getLong(iE9), new i4.b(C5724B.d(cursorB.getInt(iE20)), cursorB.getInt(iE21) != 0, cursorB.getInt(iE22) != 0, cursorB.getInt(iE23) != 0, cursorB.getInt(iE24) != 0, cursorB.getLong(iE25), cursorB.getLong(iE26), C5724B.b(cursorB.isNull(iE27) ? null : cursorB.getBlob(iE27))), cursorB.getInt(iE10), C5724B.c(cursorB.getInt(iE11)), cursorB.getLong(iE12), cursorB.getLong(iE13), cursorB.getLong(iE14), cursorB.getLong(iE15), cursorB.getInt(iE16) != 0, C5724B.e(cursorB.getInt(iE17)), cursorB.getInt(iE18), cursorB.getInt(iE19));
            } else {
                c5745u = null;
            }
            cursorB.close();
            tVar.k();
            return c5745u;
        } catch (Throwable th3) {
            th = th3;
            cursorB.close();
            tVar.k();
            throw th;
        }
    }

    @Override // n4.InterfaceC5746v
    public void i(String str, long j10) {
        this.f53965a.d();
        S3.k kVarB = this.f53972h.b();
        kVarB.m1(1, j10);
        if (str == null) {
            kVarB.I1(2);
        } else {
            kVarB.Z0(2, str);
        }
        this.f53965a.e();
        try {
            kVarB.Z();
            this.f53965a.B();
        } finally {
            this.f53965a.i();
            this.f53972h.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5746v
    public List j(String str) {
        M3.t tVarG = M3.t.g("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53965a.d();
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.isNull(0) ? null : cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // n4.InterfaceC5746v
    public List k(String str) {
        M3.t tVarG = M3.t.g("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53965a.d();
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(androidx.work.b.h(cursorB.isNull(0) ? null : cursorB.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // n4.InterfaceC5746v
    public List l(int i10) throws Throwable {
        M3.t tVar;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        M3.t tVarG = M3.t.g("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        tVarG.m1(1, i10);
        this.f53965a.d();
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            iE2 = O3.a.e(cursorB, "state");
            iE3 = O3.a.e(cursorB, "worker_class_name");
            iE4 = O3.a.e(cursorB, "input_merger_class_name");
            iE5 = O3.a.e(cursorB, "input");
            iE6 = O3.a.e(cursorB, "output");
            iE7 = O3.a.e(cursorB, "initial_delay");
            iE8 = O3.a.e(cursorB, "interval_duration");
            iE9 = O3.a.e(cursorB, "flex_duration");
            iE10 = O3.a.e(cursorB, "run_attempt_count");
            iE11 = O3.a.e(cursorB, "backoff_policy");
            iE12 = O3.a.e(cursorB, "backoff_delay_duration");
            iE13 = O3.a.e(cursorB, "last_enqueue_time");
            iE14 = O3.a.e(cursorB, "minimum_retention_duration");
            tVar = tVarG;
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarG;
        }
        try {
            int iE15 = O3.a.e(cursorB, "schedule_requested_at");
            int iE16 = O3.a.e(cursorB, "run_in_foreground");
            int iE17 = O3.a.e(cursorB, "out_of_quota_policy");
            int iE18 = O3.a.e(cursorB, "period_count");
            int iE19 = O3.a.e(cursorB, "generation");
            int iE20 = O3.a.e(cursorB, "required_network_type");
            int iE21 = O3.a.e(cursorB, "requires_charging");
            int iE22 = O3.a.e(cursorB, "requires_device_idle");
            int iE23 = O3.a.e(cursorB, "requires_battery_not_low");
            int iE24 = O3.a.e(cursorB, "requires_storage_not_low");
            int iE25 = O3.a.e(cursorB, "trigger_content_update_delay");
            int iE26 = O3.a.e(cursorB, "trigger_max_content_delay");
            int iE27 = O3.a.e(cursorB, "content_uri_triggers");
            int i11 = iE14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                i4.s sVarF = C5724B.f(cursorB.getInt(iE2));
                String string2 = cursorB.isNull(iE3) ? null : cursorB.getString(iE3);
                String string3 = cursorB.isNull(iE4) ? null : cursorB.getString(iE4);
                androidx.work.b bVarH = androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5));
                androidx.work.b bVarH2 = androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6));
                long j10 = cursorB.getLong(iE7);
                long j11 = cursorB.getLong(iE8);
                long j12 = cursorB.getLong(iE9);
                int i12 = cursorB.getInt(iE10);
                EnumC5035a enumC5035aC = C5724B.c(cursorB.getInt(iE11));
                long j13 = cursorB.getLong(iE12);
                long j14 = cursorB.getLong(iE13);
                int i13 = i11;
                long j15 = cursorB.getLong(i13);
                int i14 = iE;
                int i15 = iE15;
                long j16 = cursorB.getLong(i15);
                iE15 = i15;
                int i16 = iE16;
                boolean z10 = cursorB.getInt(i16) != 0;
                iE16 = i16;
                int i17 = iE17;
                i4.m mVarE = C5724B.e(cursorB.getInt(i17));
                iE17 = i17;
                int i18 = iE18;
                int i19 = cursorB.getInt(i18);
                iE18 = i18;
                int i20 = iE19;
                int i21 = cursorB.getInt(i20);
                iE19 = i20;
                int i22 = iE20;
                i4.j jVarD = C5724B.d(cursorB.getInt(i22));
                iE20 = i22;
                int i23 = iE21;
                boolean z11 = cursorB.getInt(i23) != 0;
                iE21 = i23;
                int i24 = iE22;
                boolean z12 = cursorB.getInt(i24) != 0;
                iE22 = i24;
                int i25 = iE23;
                boolean z13 = cursorB.getInt(i25) != 0;
                iE23 = i25;
                int i26 = iE24;
                boolean z14 = cursorB.getInt(i26) != 0;
                iE24 = i26;
                int i27 = iE25;
                long j17 = cursorB.getLong(i27);
                iE25 = i27;
                int i28 = iE26;
                long j18 = cursorB.getLong(i28);
                iE26 = i28;
                int i29 = iE27;
                iE27 = i29;
                arrayList.add(new C5745u(string, sVarF, string2, string3, bVarH, bVarH2, j10, j11, j12, new i4.b(jVarD, z11, z12, z13, z14, j17, j18, C5724B.b(cursorB.isNull(i29) ? null : cursorB.getBlob(i29))), i12, enumC5035aC, j13, j14, j15, j16, z10, mVarE, i19, i21));
                iE = i14;
                i11 = i13;
            }
            cursorB.close();
            tVar.k();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorB.close();
            tVar.k();
            throw th;
        }
    }

    @Override // n4.InterfaceC5746v
    public int m() {
        this.f53965a.d();
        S3.k kVarB = this.f53976l.b();
        this.f53965a.e();
        try {
            int iZ = kVarB.Z();
            this.f53965a.B();
            return iZ;
        } finally {
            this.f53965a.i();
            this.f53976l.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5746v
    public int n(String str, long j10) {
        this.f53965a.d();
        S3.k kVarB = this.f53975k.b();
        kVarB.m1(1, j10);
        if (str == null) {
            kVarB.I1(2);
        } else {
            kVarB.Z0(2, str);
        }
        this.f53965a.e();
        try {
            int iZ = kVarB.Z();
            this.f53965a.B();
            return iZ;
        } finally {
            this.f53965a.i();
            this.f53975k.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5746v
    public List o(String str) {
        M3.t tVarG = M3.t.g("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53965a.d();
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(new C5745u.b(cursorB.isNull(0) ? null : cursorB.getString(0), C5724B.f(cursorB.getInt(1))));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // n4.InterfaceC5746v
    public List p(int i10) throws Throwable {
        M3.t tVar;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        M3.t tVarG = M3.t.g("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        tVarG.m1(1, i10);
        this.f53965a.d();
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            iE2 = O3.a.e(cursorB, "state");
            iE3 = O3.a.e(cursorB, "worker_class_name");
            iE4 = O3.a.e(cursorB, "input_merger_class_name");
            iE5 = O3.a.e(cursorB, "input");
            iE6 = O3.a.e(cursorB, "output");
            iE7 = O3.a.e(cursorB, "initial_delay");
            iE8 = O3.a.e(cursorB, "interval_duration");
            iE9 = O3.a.e(cursorB, "flex_duration");
            iE10 = O3.a.e(cursorB, "run_attempt_count");
            iE11 = O3.a.e(cursorB, "backoff_policy");
            iE12 = O3.a.e(cursorB, "backoff_delay_duration");
            iE13 = O3.a.e(cursorB, "last_enqueue_time");
            iE14 = O3.a.e(cursorB, "minimum_retention_duration");
            tVar = tVarG;
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarG;
        }
        try {
            int iE15 = O3.a.e(cursorB, "schedule_requested_at");
            int iE16 = O3.a.e(cursorB, "run_in_foreground");
            int iE17 = O3.a.e(cursorB, "out_of_quota_policy");
            int iE18 = O3.a.e(cursorB, "period_count");
            int iE19 = O3.a.e(cursorB, "generation");
            int iE20 = O3.a.e(cursorB, "required_network_type");
            int iE21 = O3.a.e(cursorB, "requires_charging");
            int iE22 = O3.a.e(cursorB, "requires_device_idle");
            int iE23 = O3.a.e(cursorB, "requires_battery_not_low");
            int iE24 = O3.a.e(cursorB, "requires_storage_not_low");
            int iE25 = O3.a.e(cursorB, "trigger_content_update_delay");
            int iE26 = O3.a.e(cursorB, "trigger_max_content_delay");
            int iE27 = O3.a.e(cursorB, "content_uri_triggers");
            int i11 = iE14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                i4.s sVarF = C5724B.f(cursorB.getInt(iE2));
                String string2 = cursorB.isNull(iE3) ? null : cursorB.getString(iE3);
                String string3 = cursorB.isNull(iE4) ? null : cursorB.getString(iE4);
                androidx.work.b bVarH = androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5));
                androidx.work.b bVarH2 = androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6));
                long j10 = cursorB.getLong(iE7);
                long j11 = cursorB.getLong(iE8);
                long j12 = cursorB.getLong(iE9);
                int i12 = cursorB.getInt(iE10);
                EnumC5035a enumC5035aC = C5724B.c(cursorB.getInt(iE11));
                long j13 = cursorB.getLong(iE12);
                long j14 = cursorB.getLong(iE13);
                int i13 = i11;
                long j15 = cursorB.getLong(i13);
                int i14 = iE;
                int i15 = iE15;
                long j16 = cursorB.getLong(i15);
                iE15 = i15;
                int i16 = iE16;
                boolean z10 = cursorB.getInt(i16) != 0;
                iE16 = i16;
                int i17 = iE17;
                i4.m mVarE = C5724B.e(cursorB.getInt(i17));
                iE17 = i17;
                int i18 = iE18;
                int i19 = cursorB.getInt(i18);
                iE18 = i18;
                int i20 = iE19;
                int i21 = cursorB.getInt(i20);
                iE19 = i20;
                int i22 = iE20;
                i4.j jVarD = C5724B.d(cursorB.getInt(i22));
                iE20 = i22;
                int i23 = iE21;
                boolean z11 = cursorB.getInt(i23) != 0;
                iE21 = i23;
                int i24 = iE22;
                boolean z12 = cursorB.getInt(i24) != 0;
                iE22 = i24;
                int i25 = iE23;
                boolean z13 = cursorB.getInt(i25) != 0;
                iE23 = i25;
                int i26 = iE24;
                boolean z14 = cursorB.getInt(i26) != 0;
                iE24 = i26;
                int i27 = iE25;
                long j17 = cursorB.getLong(i27);
                iE25 = i27;
                int i28 = iE26;
                long j18 = cursorB.getLong(i28);
                iE26 = i28;
                int i29 = iE27;
                iE27 = i29;
                arrayList.add(new C5745u(string, sVarF, string2, string3, bVarH, bVarH2, j10, j11, j12, new i4.b(jVarD, z11, z12, z13, z14, j17, j18, C5724B.b(cursorB.isNull(i29) ? null : cursorB.getBlob(i29))), i12, enumC5035aC, j13, j14, j15, j16, z10, mVarE, i19, i21));
                iE = i14;
                i11 = i13;
            }
            cursorB.close();
            tVar.k();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursorB.close();
            tVar.k();
            throw th;
        }
    }

    @Override // n4.InterfaceC5746v
    public int q(i4.s sVar, String str) {
        this.f53965a.d();
        S3.k kVarB = this.f53969e.b();
        kVarB.m1(1, C5724B.j(sVar));
        if (str == null) {
            kVarB.I1(2);
        } else {
            kVarB.Z0(2, str);
        }
        this.f53965a.e();
        try {
            int iZ = kVarB.Z();
            this.f53965a.B();
            return iZ;
        } finally {
            this.f53965a.i();
            this.f53969e.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5746v
    public void r(String str, androidx.work.b bVar) throws Throwable {
        this.f53965a.d();
        S3.k kVarB = this.f53971g.b();
        byte[] bArrO = androidx.work.b.o(bVar);
        if (bArrO == null) {
            kVarB.I1(1);
        } else {
            kVarB.p1(1, bArrO);
        }
        if (str == null) {
            kVarB.I1(2);
        } else {
            kVarB.Z0(2, str);
        }
        this.f53965a.e();
        try {
            kVarB.Z();
            this.f53965a.B();
        } finally {
            this.f53965a.i();
            this.f53971g.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5746v
    public void s(C5745u c5745u) {
        this.f53965a.d();
        this.f53965a.e();
        try {
            this.f53966b.j(c5745u);
            this.f53965a.B();
        } finally {
            this.f53965a.i();
        }
    }

    @Override // n4.InterfaceC5746v
    public List t() throws Throwable {
        M3.t tVar;
        M3.t tVarG = M3.t.g("SELECT * FROM workspec WHERE state=1", 0);
        this.f53965a.d();
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            int iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            int iE2 = O3.a.e(cursorB, "state");
            int iE3 = O3.a.e(cursorB, "worker_class_name");
            int iE4 = O3.a.e(cursorB, "input_merger_class_name");
            int iE5 = O3.a.e(cursorB, "input");
            int iE6 = O3.a.e(cursorB, "output");
            int iE7 = O3.a.e(cursorB, "initial_delay");
            int iE8 = O3.a.e(cursorB, "interval_duration");
            int iE9 = O3.a.e(cursorB, "flex_duration");
            int iE10 = O3.a.e(cursorB, "run_attempt_count");
            int iE11 = O3.a.e(cursorB, "backoff_policy");
            int iE12 = O3.a.e(cursorB, "backoff_delay_duration");
            int iE13 = O3.a.e(cursorB, "last_enqueue_time");
            int iE14 = O3.a.e(cursorB, "minimum_retention_duration");
            tVar = tVarG;
            try {
                int iE15 = O3.a.e(cursorB, "schedule_requested_at");
                int iE16 = O3.a.e(cursorB, "run_in_foreground");
                int iE17 = O3.a.e(cursorB, "out_of_quota_policy");
                int iE18 = O3.a.e(cursorB, "period_count");
                int iE19 = O3.a.e(cursorB, "generation");
                int iE20 = O3.a.e(cursorB, "required_network_type");
                int iE21 = O3.a.e(cursorB, "requires_charging");
                int iE22 = O3.a.e(cursorB, "requires_device_idle");
                int iE23 = O3.a.e(cursorB, "requires_battery_not_low");
                int iE24 = O3.a.e(cursorB, "requires_storage_not_low");
                int iE25 = O3.a.e(cursorB, "trigger_content_update_delay");
                int iE26 = O3.a.e(cursorB, "trigger_max_content_delay");
                int iE27 = O3.a.e(cursorB, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                    i4.s sVarF = C5724B.f(cursorB.getInt(iE2));
                    String string2 = cursorB.isNull(iE3) ? null : cursorB.getString(iE3);
                    String string3 = cursorB.isNull(iE4) ? null : cursorB.getString(iE4);
                    androidx.work.b bVarH = androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5));
                    androidx.work.b bVarH2 = androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6));
                    long j10 = cursorB.getLong(iE7);
                    long j11 = cursorB.getLong(iE8);
                    long j12 = cursorB.getLong(iE9);
                    int i11 = cursorB.getInt(iE10);
                    EnumC5035a enumC5035aC = C5724B.c(cursorB.getInt(iE11));
                    long j13 = cursorB.getLong(iE12);
                    long j14 = cursorB.getLong(iE13);
                    int i12 = i10;
                    long j15 = cursorB.getLong(i12);
                    int i13 = iE;
                    int i14 = iE15;
                    long j16 = cursorB.getLong(i14);
                    iE15 = i14;
                    int i15 = iE16;
                    boolean z10 = cursorB.getInt(i15) != 0;
                    iE16 = i15;
                    int i16 = iE17;
                    i4.m mVarE = C5724B.e(cursorB.getInt(i16));
                    iE17 = i16;
                    int i17 = iE18;
                    int i18 = cursorB.getInt(i17);
                    iE18 = i17;
                    int i19 = iE19;
                    int i20 = cursorB.getInt(i19);
                    iE19 = i19;
                    int i21 = iE20;
                    i4.j jVarD = C5724B.d(cursorB.getInt(i21));
                    iE20 = i21;
                    int i22 = iE21;
                    boolean z11 = cursorB.getInt(i22) != 0;
                    iE21 = i22;
                    int i23 = iE22;
                    boolean z12 = cursorB.getInt(i23) != 0;
                    iE22 = i23;
                    int i24 = iE23;
                    boolean z13 = cursorB.getInt(i24) != 0;
                    iE23 = i24;
                    int i25 = iE24;
                    boolean z14 = cursorB.getInt(i25) != 0;
                    iE24 = i25;
                    int i26 = iE25;
                    long j17 = cursorB.getLong(i26);
                    iE25 = i26;
                    int i27 = iE26;
                    long j18 = cursorB.getLong(i27);
                    iE26 = i27;
                    int i28 = iE27;
                    iE27 = i28;
                    arrayList.add(new C5745u(string, sVarF, string2, string3, bVarH, bVarH2, j10, j11, j12, new i4.b(jVarD, z11, z12, z13, z14, j17, j18, C5724B.b(cursorB.isNull(i28) ? null : cursorB.getBlob(i28))), i11, enumC5035aC, j13, j14, j15, j16, z10, mVarE, i18, i20));
                    iE = i13;
                    i10 = i12;
                }
                cursorB.close();
                tVar.k();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorB.close();
                tVar.k();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            tVar = tVarG;
        }
    }

    @Override // n4.InterfaceC5746v
    public boolean u() {
        boolean z10 = false;
        M3.t tVarG = M3.t.g("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f53965a.d();
        Cursor cursorB = O3.b.b(this.f53965a, tVarG, false, null);
        try {
            if (cursorB.moveToFirst()) {
                if (cursorB.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // n4.InterfaceC5746v
    public int v(String str) {
        this.f53965a.d();
        S3.k kVarB = this.f53974j.b();
        if (str == null) {
            kVarB.I1(1);
        } else {
            kVarB.Z0(1, str);
        }
        this.f53965a.e();
        try {
            int iZ = kVarB.Z();
            this.f53965a.B();
            return iZ;
        } finally {
            this.f53965a.i();
            this.f53974j.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5746v
    public void w(C5745u c5745u) {
        this.f53965a.d();
        this.f53965a.e();
        try {
            this.f53967c.j(c5745u);
            this.f53965a.B();
        } finally {
            this.f53965a.i();
        }
    }

    @Override // n4.InterfaceC5746v
    public int x(String str) {
        this.f53965a.d();
        S3.k kVarB = this.f53973i.b();
        if (str == null) {
            kVarB.I1(1);
        } else {
            kVarB.Z0(1, str);
        }
        this.f53965a.e();
        try {
            int iZ = kVarB.Z();
            this.f53965a.B();
            return iZ;
        } finally {
            this.f53965a.i();
            this.f53973i.h(kVarB);
        }
    }
}
