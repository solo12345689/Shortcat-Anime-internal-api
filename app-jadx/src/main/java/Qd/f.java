package qd;

import M3.q;
import M3.t;
import M3.w;
import S3.k;
import Ud.AbstractC2279u;
import android.database.Cursor;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import pd.C5997b;
import rd.C6306a;
import sd.EnumC6452b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends qd.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f57937l = new j(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f57938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.i f57939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5997b f57940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M3.h f57941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f57942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f57943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f57944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f57945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f57946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f57947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f57948k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends M3.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f57949d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, f fVar) {
            super(qVar);
            this.f57949d = fVar;
        }

        @Override // M3.w
        protected String e() {
            return "INSERT OR ABORT INTO `updates` (`id`,`commit_time`,`runtime_version`,`scope_key`,`manifest`,`url`,`headers`,`launch_asset_id`,`status`,`keep`,`last_accessed`,`successful_launch_count`,`failed_launch_count`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, rd.d entity) throws JSONException {
            AbstractC5504s.h(statement, "statement");
            AbstractC5504s.h(entity, "entity");
            statement.p1(1, this.f57949d.f57940c.n(entity.d()));
            Long lB = this.f57949d.f57940c.b(entity.b());
            if (lB == null) {
                statement.I1(2);
            } else {
                statement.m1(2, lB.longValue());
            }
            statement.Z0(3, entity.k());
            statement.Z0(4, entity.l());
            String strF = this.f57949d.f57940c.f(entity.i());
            if (strF == null) {
                statement.I1(5);
            } else {
                statement.Z0(5, strF);
            }
            String strM = this.f57949d.f57940c.m(entity.o());
            if (strM == null) {
                statement.I1(6);
            } else {
                statement.Z0(6, strM);
            }
            String strI = this.f57949d.f57940c.i(entity.j());
            if (strI == null) {
                statement.I1(7);
            } else {
                statement.Z0(7, strI);
            }
            Long lG = entity.g();
            if (lG == null) {
                statement.I1(8);
            } else {
                statement.m1(8, lG.longValue());
            }
            statement.m1(9, this.f57949d.f57940c.h(entity.m()));
            statement.m1(10, entity.e() ? 1L : 0L);
            Long lB2 = this.f57949d.f57940c.b(entity.f());
            if (lB2 == null) {
                statement.I1(11);
            } else {
                statement.m1(11, lB2.longValue());
            }
            statement.m1(12, entity.n());
            statement.m1(13, entity.c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends M3.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f57950d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, f fVar) {
            super(qVar);
            this.f57950d = fVar;
        }

        @Override // M3.w
        protected String e() {
            return "DELETE FROM `updates` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M3.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, rd.d entity) {
            AbstractC5504s.h(statement, "statement");
            AbstractC5504s.h(entity, "entity");
            statement.p1(1, this.f57950d.f57940c.n(entity.d()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends w {
        c(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE updates SET keep = 1 WHERE id = ?;";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends w {
        d(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE updates SET status = ? WHERE id = ?;";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends w {
        e(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE updates SET scope_key = ? WHERE id = ?;";
        }
    }

    /* JADX INFO: renamed from: qd.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0876f extends w {
        C0876f(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE updates SET commit_time = ? WHERE id = ?;";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends w {
        g(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE updates SET last_accessed = ? WHERE id = ?;";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends w {
        h(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE updates SET successful_launch_count = successful_launch_count + 1 WHERE id = ?;";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends w {
        i(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE updates SET failed_launch_count = failed_launch_count + 1 WHERE id = ?;";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return AbstractC2279u.m();
        }

        private j() {
        }
    }

    public f(q __db) {
        AbstractC5504s.h(__db, "__db");
        this.f57940c = new C5997b();
        this.f57938a = __db;
        this.f57939b = new a(__db, this);
        this.f57941d = new b(__db, this);
        this.f57942e = new c(__db);
        this.f57943f = new d(__db);
        this.f57944g = new e(__db);
        this.f57945h = new C0876f(__db);
        this.f57946i = new g(__db);
        this.f57947j = new h(__db);
        this.f57948k = new i(__db);
    }

    @Override // qd.e
    public void a(UUID id2, String newScopeKey) {
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(newScopeKey, "newScopeKey");
        this.f57938a.d();
        k kVarB = this.f57944g.b();
        kVarB.Z0(1, newScopeKey);
        kVarB.p1(2, this.f57940c.n(id2));
        try {
            this.f57938a.e();
            try {
                kVarB.Z();
                this.f57938a.B();
            } finally {
                this.f57938a.i();
            }
        } finally {
            this.f57944g.h(kVarB);
        }
    }

    @Override // qd.e
    public void b(List updates) {
        AbstractC5504s.h(updates, "updates");
        this.f57938a.d();
        this.f57938a.e();
        try {
            this.f57941d.k(updates);
            this.f57938a.B();
        } finally {
            this.f57938a.i();
        }
    }

    @Override // qd.e
    public void d(UUID id2) {
        AbstractC5504s.h(id2, "id");
        this.f57938a.d();
        k kVarB = this.f57948k.b();
        kVarB.p1(1, this.f57940c.n(id2));
        try {
            this.f57938a.e();
            try {
                kVarB.Z();
                this.f57938a.B();
            } finally {
                this.f57938a.i();
            }
        } finally {
            this.f57948k.h(kVarB);
        }
    }

    @Override // qd.e
    protected void f(UUID id2) {
        AbstractC5504s.h(id2, "id");
        this.f57938a.d();
        k kVarB = this.f57947j.b();
        kVarB.p1(1, this.f57940c.n(id2));
        try {
            this.f57938a.e();
            try {
                kVarB.Z();
                this.f57938a.B();
            } finally {
                this.f57938a.i();
            }
        } finally {
            this.f57947j.h(kVarB);
        }
    }

    @Override // qd.e
    public void g(rd.d update) {
        AbstractC5504s.h(update, "update");
        this.f57938a.d();
        this.f57938a.e();
        try {
            this.f57939b.j(update);
            this.f57938a.B();
        } finally {
            this.f57938a.i();
        }
    }

    @Override // qd.e
    protected void h(UUID id2) {
        AbstractC5504s.h(id2, "id");
        this.f57938a.d();
        k kVarB = this.f57942e.b();
        kVarB.p1(1, this.f57940c.n(id2));
        try {
            this.f57938a.e();
            try {
                kVarB.Z();
                this.f57938a.B();
            } finally {
                this.f57938a.i();
            }
        } finally {
            this.f57942e.h(kVarB);
        }
    }

    @Override // qd.e
    public List i() throws Throwable {
        t tVar;
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
        String str;
        String string;
        String str2 = "getString(...)";
        t tVarA = t.f12198i.a("SELECT * FROM updates;", 0);
        this.f57938a.d();
        Cursor cursorB = O3.b.b(this.f57938a, tVarA, false, null);
        try {
            iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            iE2 = O3.a.e(cursorB, "commit_time");
            iE3 = O3.a.e(cursorB, "runtime_version");
            iE4 = O3.a.e(cursorB, "scope_key");
            iE5 = O3.a.e(cursorB, "manifest");
            iE6 = O3.a.e(cursorB, "url");
            iE7 = O3.a.e(cursorB, "headers");
            iE8 = O3.a.e(cursorB, "launch_asset_id");
            iE9 = O3.a.e(cursorB, "status");
            iE10 = O3.a.e(cursorB, "keep");
            iE11 = O3.a.e(cursorB, "last_accessed");
            iE12 = O3.a.e(cursorB, "successful_launch_count");
            tVar = tVarA;
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarA;
        }
        try {
            int iE13 = O3.a.e(cursorB, "failed_launch_count");
            int i10 = iE12;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                byte[] blob = cursorB.getBlob(iE);
                int i11 = iE;
                AbstractC5504s.g(blob, "getBlob(...)");
                UUID uuidA = this.f57940c.a(blob);
                Date dateG = this.f57940c.g(cursorB.isNull(iE2) ? null : Long.valueOf(cursorB.getLong(iE2)));
                if (dateG == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                String string2 = cursorB.getString(iE3);
                AbstractC5504s.g(string2, str2);
                String string3 = cursorB.getString(iE4);
                AbstractC5504s.g(string3, str2);
                if (cursorB.isNull(iE5)) {
                    str = str2;
                    string = null;
                } else {
                    str = str2;
                    string = cursorB.getString(iE5);
                }
                JSONObject jSONObjectJ = this.f57940c.j(string);
                if (jSONObjectJ == null) {
                    throw new IllegalStateException("Expected NON-NULL 'org.json.JSONObject', but it was NULL.");
                }
                rd.d dVar = new rd.d(uuidA, dateG, string2, string3, jSONObjectJ, this.f57940c.l(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)), this.f57940c.k(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                if (cursorB.isNull(iE8)) {
                    dVar.t(null);
                } else {
                    dVar.t(Long.valueOf(cursorB.getLong(iE8)));
                }
                int i12 = iE2;
                dVar.v(this.f57940c.e(cursorB.getInt(iE9)));
                dVar.r(cursorB.getInt(iE10) != 0);
                Date dateG2 = this.f57940c.g(cursorB.isNull(iE11) ? null : Long.valueOf(cursorB.getLong(iE11)));
                if (dateG2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                dVar.s(dateG2);
                int i13 = i10;
                dVar.w(cursorB.getInt(i13));
                int i14 = iE13;
                dVar.q(cursorB.getInt(i14));
                arrayList.add(dVar);
                i10 = i13;
                iE13 = i14;
                iE = i11;
                iE2 = i12;
                str2 = str;
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

    @Override // qd.e
    protected C6306a k(UUID updateId) throws Throwable {
        t tVar;
        C6306a c6306a;
        AbstractC5504s.h(updateId, "updateId");
        t tVarA = t.f12198i.a("SELECT assets.* FROM assets INNER JOIN updates ON updates.launch_asset_id = assets.id WHERE updates.id = ?;", 1);
        tVarA.p1(1, this.f57940c.n(updateId));
        this.f57938a.d();
        Cursor cursorB = O3.b.b(this.f57938a, tVarA, false, null);
        try {
            int iE = O3.a.e(cursorB, SubscriberAttributeKt.JSON_NAME_KEY);
            int iE2 = O3.a.e(cursorB, "type");
            int iE3 = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            int iE4 = O3.a.e(cursorB, "url");
            int iE5 = O3.a.e(cursorB, "headers");
            int iE6 = O3.a.e(cursorB, "extra_request_headers");
            int iE7 = O3.a.e(cursorB, "metadata");
            int iE8 = O3.a.e(cursorB, "download_time");
            int iE9 = O3.a.e(cursorB, "relative_path");
            int iE10 = O3.a.e(cursorB, "hash");
            int iE11 = O3.a.e(cursorB, "hash_type");
            int iE12 = O3.a.e(cursorB, "expected_hash");
            int iE13 = O3.a.e(cursorB, "marked_for_deletion");
            if (cursorB.moveToFirst()) {
                tVar = tVarA;
                try {
                    C6306a c6306a2 = new C6306a(cursorB.isNull(iE) ? null : cursorB.getString(iE), cursorB.isNull(iE2) ? null : cursorB.getString(iE2));
                    c6306a2.B(cursorB.getLong(iE3));
                    c6306a2.K(this.f57940c.l(cursorB.isNull(iE4) ? null : cursorB.getString(iE4)));
                    c6306a2.A(this.f57940c.j(cursorB.isNull(iE5) ? null : cursorB.getString(iE5)));
                    c6306a2.x(this.f57940c.j(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)));
                    c6306a2.E(this.f57940c.j(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    c6306a2.u(this.f57940c.g(cursorB.isNull(iE8) ? null : Long.valueOf(cursorB.getLong(iE8))));
                    if (cursorB.isNull(iE9)) {
                        c6306a2.F(null);
                    } else {
                        c6306a2.F(cursorB.getString(iE9));
                    }
                    if (cursorB.isNull(iE10)) {
                        c6306a2.y(null);
                    } else {
                        c6306a2.y(cursorB.getBlob(iE10));
                    }
                    c6306a2.z(this.f57940c.d(cursorB.getInt(iE11)));
                    if (cursorB.isNull(iE12)) {
                        c6306a2.w(null);
                    } else {
                        c6306a2.w(cursorB.getString(iE12));
                    }
                    c6306a2.D(cursorB.getInt(iE13) != 0);
                    c6306a = c6306a2;
                } catch (Throwable th2) {
                    th = th2;
                    cursorB.close();
                    tVar.k();
                    throw th;
                }
            } else {
                tVar = tVarA;
                c6306a = null;
            }
            cursorB.close();
            tVar.k();
            return c6306a;
        } catch (Throwable th3) {
            th = th3;
            tVar = tVarA;
        }
    }

    @Override // qd.e
    protected List l(String scopeKey, List statuses) throws Throwable {
        t tVar;
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
        String str;
        String string;
        String str2 = "getString(...)";
        AbstractC5504s.h(scopeKey, "scopeKey");
        AbstractC5504s.h(statuses, "statuses");
        StringBuilder sbB = O3.d.b();
        sbB.append("SELECT * FROM updates WHERE scope_key = ");
        sbB.append("?");
        sbB.append(" AND (successful_launch_count > 0 OR failed_launch_count < 1) AND status IN (");
        int size = statuses.size();
        O3.d.a(sbB, size);
        sbB.append(");");
        String string2 = sbB.toString();
        AbstractC5504s.g(string2, "toString(...)");
        t tVarA = t.f12198i.a(string2, size + 1);
        tVarA.Z0(1, scopeKey);
        Iterator it = statuses.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            tVarA.m1(i10, this.f57940c.h((EnumC6452b) it.next()));
            i10++;
        }
        this.f57938a.d();
        Cursor cursorB = O3.b.b(this.f57938a, tVarA, false, null);
        try {
            iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            iE2 = O3.a.e(cursorB, "commit_time");
            iE3 = O3.a.e(cursorB, "runtime_version");
            iE4 = O3.a.e(cursorB, "scope_key");
            iE5 = O3.a.e(cursorB, "manifest");
            iE6 = O3.a.e(cursorB, "url");
            iE7 = O3.a.e(cursorB, "headers");
            iE8 = O3.a.e(cursorB, "launch_asset_id");
            iE9 = O3.a.e(cursorB, "status");
            iE10 = O3.a.e(cursorB, "keep");
            iE11 = O3.a.e(cursorB, "last_accessed");
            iE12 = O3.a.e(cursorB, "successful_launch_count");
            tVar = tVarA;
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarA;
        }
        try {
            int iE13 = O3.a.e(cursorB, "failed_launch_count");
            int i11 = iE12;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                byte[] blob = cursorB.getBlob(iE);
                int i12 = iE;
                AbstractC5504s.g(blob, "getBlob(...)");
                UUID uuidA = this.f57940c.a(blob);
                Date dateG = this.f57940c.g(cursorB.isNull(iE2) ? null : Long.valueOf(cursorB.getLong(iE2)));
                if (dateG == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                String string3 = cursorB.getString(iE3);
                AbstractC5504s.g(string3, str2);
                String string4 = cursorB.getString(iE4);
                AbstractC5504s.g(string4, str2);
                if (cursorB.isNull(iE5)) {
                    str = str2;
                    string = null;
                } else {
                    str = str2;
                    string = cursorB.getString(iE5);
                }
                JSONObject jSONObjectJ = this.f57940c.j(string);
                if (jSONObjectJ == null) {
                    throw new IllegalStateException("Expected NON-NULL 'org.json.JSONObject', but it was NULL.");
                }
                rd.d dVar = new rd.d(uuidA, dateG, string3, string4, jSONObjectJ, this.f57940c.l(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)), this.f57940c.k(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                if (cursorB.isNull(iE8)) {
                    dVar.t(null);
                } else {
                    dVar.t(Long.valueOf(cursorB.getLong(iE8)));
                }
                int i13 = iE2;
                dVar.v(this.f57940c.e(cursorB.getInt(iE9)));
                dVar.r(cursorB.getInt(iE10) != 0);
                Date dateG2 = this.f57940c.g(cursorB.isNull(iE11) ? null : Long.valueOf(cursorB.getLong(iE11)));
                if (dateG2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                dVar.s(dateG2);
                int i14 = i11;
                dVar.w(cursorB.getInt(i14));
                int i15 = iE13;
                dVar.q(cursorB.getInt(i15));
                arrayList.add(dVar);
                i11 = i14;
                iE13 = i15;
                iE = i12;
                iE2 = i13;
                str2 = str;
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

    @Override // qd.e
    public List n() {
        t tVarA = t.f12198i.a("SELECT id FROM updates WHERE failed_launch_count > 0 ORDER BY commit_time DESC LIMIT 5;", 0);
        this.f57938a.d();
        Cursor cursorB = O3.b.b(this.f57938a, tVarA, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                byte[] blob = cursorB.getBlob(0);
                AbstractC5504s.g(blob, "getBlob(...)");
                arrayList.add(this.f57940c.a(blob));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tVarA.k();
        }
    }

    @Override // qd.e
    protected List p(UUID id2) throws Throwable {
        t tVar;
        String str;
        String string;
        String str2 = "getString(...)";
        AbstractC5504s.h(id2, "id");
        t tVarA = t.f12198i.a("SELECT * FROM updates WHERE id = ?;", 1);
        tVarA.p1(1, this.f57940c.n(id2));
        this.f57938a.d();
        Cursor cursorB = O3.b.b(this.f57938a, tVarA, false, null);
        try {
            int iE = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            int iE2 = O3.a.e(cursorB, "commit_time");
            int iE3 = O3.a.e(cursorB, "runtime_version");
            int iE4 = O3.a.e(cursorB, "scope_key");
            int iE5 = O3.a.e(cursorB, "manifest");
            int iE6 = O3.a.e(cursorB, "url");
            int iE7 = O3.a.e(cursorB, "headers");
            int iE8 = O3.a.e(cursorB, "launch_asset_id");
            int iE9 = O3.a.e(cursorB, "status");
            int iE10 = O3.a.e(cursorB, "keep");
            int iE11 = O3.a.e(cursorB, "last_accessed");
            int iE12 = O3.a.e(cursorB, "successful_launch_count");
            tVar = tVarA;
            try {
                int iE13 = O3.a.e(cursorB, "failed_launch_count");
                int i10 = iE12;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    byte[] blob = cursorB.getBlob(iE);
                    int i11 = iE;
                    AbstractC5504s.g(blob, "getBlob(...)");
                    UUID uuidA = this.f57940c.a(blob);
                    Date dateG = this.f57940c.g(cursorB.isNull(iE2) ? null : Long.valueOf(cursorB.getLong(iE2)));
                    if (dateG == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                    }
                    String string2 = cursorB.getString(iE3);
                    AbstractC5504s.g(string2, str2);
                    int i12 = iE2;
                    String string3 = cursorB.getString(iE4);
                    AbstractC5504s.g(string3, str2);
                    if (cursorB.isNull(iE5)) {
                        str = str2;
                        string = null;
                    } else {
                        str = str2;
                        string = cursorB.getString(iE5);
                    }
                    JSONObject jSONObjectJ = this.f57940c.j(string);
                    if (jSONObjectJ == null) {
                        throw new IllegalStateException("Expected NON-NULL 'org.json.JSONObject', but it was NULL.");
                    }
                    rd.d dVar = new rd.d(uuidA, dateG, string2, string3, jSONObjectJ, this.f57940c.l(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)), this.f57940c.k(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    if (cursorB.isNull(iE8)) {
                        dVar.t(null);
                    } else {
                        dVar.t(Long.valueOf(cursorB.getLong(iE8)));
                    }
                    dVar.v(this.f57940c.e(cursorB.getInt(iE9)));
                    dVar.r(cursorB.getInt(iE10) != 0);
                    Date dateG2 = this.f57940c.g(cursorB.isNull(iE11) ? null : Long.valueOf(cursorB.getLong(iE11)));
                    if (dateG2 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                    }
                    dVar.s(dateG2);
                    int i13 = i10;
                    dVar.w(cursorB.getInt(i13));
                    int i14 = iE13;
                    dVar.q(cursorB.getInt(i14));
                    arrayList.add(dVar);
                    i10 = i13;
                    iE13 = i14;
                    iE = i11;
                    iE2 = i12;
                    str2 = str;
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
            tVar = tVarA;
        }
    }

    @Override // qd.e
    protected void r(UUID id2, Date lastAccessed) {
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(lastAccessed, "lastAccessed");
        this.f57938a.d();
        k kVarB = this.f57946i.b();
        Long lB = this.f57940c.b(lastAccessed);
        if (lB == null) {
            kVarB.I1(1);
        } else {
            kVarB.m1(1, lB.longValue());
        }
        kVarB.p1(2, this.f57940c.n(id2));
        try {
            this.f57938a.e();
            try {
                kVarB.Z();
                this.f57938a.B();
            } finally {
                this.f57938a.i();
            }
        } finally {
            this.f57946i.h(kVarB);
        }
    }

    @Override // qd.e
    public void t(rd.d update, boolean z10) {
        AbstractC5504s.h(update, "update");
        this.f57938a.e();
        try {
            super.t(update, z10);
            this.f57938a.B();
        } finally {
            this.f57938a.i();
        }
    }

    @Override // qd.e
    protected void u(EnumC6452b status, UUID id2) {
        AbstractC5504s.h(status, "status");
        AbstractC5504s.h(id2, "id");
        this.f57938a.d();
        k kVarB = this.f57943f.b();
        kVarB.m1(1, this.f57940c.h(status));
        kVarB.p1(2, this.f57940c.n(id2));
        try {
            this.f57938a.e();
            try {
                kVarB.Z();
                this.f57938a.B();
            } finally {
                this.f57938a.i();
            }
        } finally {
            this.f57943f.h(kVarB);
        }
    }

    @Override // qd.e
    public void w(UUID id2, Date commitTime) {
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(commitTime, "commitTime");
        this.f57938a.d();
        k kVarB = this.f57945h.b();
        Long lB = this.f57940c.b(commitTime);
        if (lB == null) {
            kVarB.I1(1);
        } else {
            kVarB.m1(1, lB.longValue());
        }
        kVarB.p1(2, this.f57940c.n(id2));
        try {
            this.f57938a.e();
            try {
                kVarB.Z();
                this.f57938a.B();
            } finally {
                this.f57938a.i();
            }
        } finally {
            this.f57945h.h(kVarB);
        }
    }
}
