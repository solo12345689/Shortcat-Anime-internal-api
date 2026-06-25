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
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.C5997b;
import rd.C6306a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC6170a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f57909l = new j(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f57910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.i f57911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5997b f57912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M3.i f57913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M3.h f57914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f57915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f57916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f57917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f57918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f57919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f57920k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends M3.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f57921d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, b bVar) {
            super(qVar);
            this.f57921d = bVar;
        }

        @Override // M3.w
        protected String e() {
            return "INSERT OR REPLACE INTO `assets` (`key`,`type`,`id`,`url`,`headers`,`extra_request_headers`,`metadata`,`download_time`,`relative_path`,`hash`,`hash_type`,`expected_hash`,`marked_for_deletion`) VALUES (?,?,nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, C6306a entity) {
            AbstractC5504s.h(statement, "statement");
            AbstractC5504s.h(entity, "entity");
            String strJ = entity.j();
            if (strJ == null) {
                statement.I1(1);
            } else {
                statement.Z0(1, strJ);
            }
            String strR = entity.r();
            if (strR == null) {
                statement.I1(2);
            } else {
                statement.Z0(2, strR);
            }
            statement.m1(3, entity.i());
            String strM = this.f57921d.f57912c.m(entity.s());
            if (strM == null) {
                statement.I1(4);
            } else {
                statement.Z0(4, strM);
            }
            String strF = this.f57921d.f57912c.f(entity.h());
            if (strF == null) {
                statement.I1(5);
            } else {
                statement.Z0(5, strF);
            }
            String strF2 = this.f57921d.f57912c.f(entity.d());
            if (strF2 == null) {
                statement.I1(6);
            } else {
                statement.Z0(6, strF2);
            }
            String strF3 = this.f57921d.f57912c.f(entity.l());
            if (strF3 == null) {
                statement.I1(7);
            } else {
                statement.Z0(7, strF3);
            }
            Long lB = this.f57921d.f57912c.b(entity.a());
            if (lB == null) {
                statement.I1(8);
            } else {
                statement.m1(8, lB.longValue());
            }
            String strM2 = entity.m();
            if (strM2 == null) {
                statement.I1(9);
            } else {
                statement.Z0(9, strM2);
            }
            byte[] bArrF = entity.f();
            if (bArrF == null) {
                statement.I1(10);
            } else {
                statement.p1(10, bArrF);
            }
            statement.m1(11, this.f57921d.f57912c.c(entity.g()));
            String strC = entity.c();
            if (strC == null) {
                statement.I1(12);
            } else {
                statement.Z0(12, strC);
            }
            statement.m1(13, entity.k() ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: qd.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0875b extends M3.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f57922d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0875b(q qVar, b bVar) {
            super(qVar);
            this.f57922d = bVar;
        }

        @Override // M3.w
        protected String e() {
            return "INSERT OR REPLACE INTO `updates_assets` (`update_id`,`asset_id`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, rd.c entity) {
            AbstractC5504s.h(statement, "statement");
            AbstractC5504s.h(entity, "entity");
            statement.p1(1, this.f57922d.f57912c.n(entity.b()));
            statement.m1(2, entity.a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends M3.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f57923d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(q qVar, b bVar) {
            super(qVar);
            this.f57923d = bVar;
        }

        @Override // M3.w
        protected String e() {
            return "UPDATE OR ABORT `assets` SET `key` = ?,`type` = ?,`id` = ?,`url` = ?,`headers` = ?,`extra_request_headers` = ?,`metadata` = ?,`download_time` = ?,`relative_path` = ?,`hash` = ?,`hash_type` = ?,`expected_hash` = ?,`marked_for_deletion` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M3.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, C6306a entity) {
            AbstractC5504s.h(statement, "statement");
            AbstractC5504s.h(entity, "entity");
            String strJ = entity.j();
            if (strJ == null) {
                statement.I1(1);
            } else {
                statement.Z0(1, strJ);
            }
            String strR = entity.r();
            if (strR == null) {
                statement.I1(2);
            } else {
                statement.Z0(2, strR);
            }
            statement.m1(3, entity.i());
            String strM = this.f57923d.f57912c.m(entity.s());
            if (strM == null) {
                statement.I1(4);
            } else {
                statement.Z0(4, strM);
            }
            String strF = this.f57923d.f57912c.f(entity.h());
            if (strF == null) {
                statement.I1(5);
            } else {
                statement.Z0(5, strF);
            }
            String strF2 = this.f57923d.f57912c.f(entity.d());
            if (strF2 == null) {
                statement.I1(6);
            } else {
                statement.Z0(6, strF2);
            }
            String strF3 = this.f57923d.f57912c.f(entity.l());
            if (strF3 == null) {
                statement.I1(7);
            } else {
                statement.Z0(7, strF3);
            }
            Long lB = this.f57923d.f57912c.b(entity.a());
            if (lB == null) {
                statement.I1(8);
            } else {
                statement.m1(8, lB.longValue());
            }
            String strM2 = entity.m();
            if (strM2 == null) {
                statement.I1(9);
            } else {
                statement.Z0(9, strM2);
            }
            byte[] bArrF = entity.f();
            if (bArrF == null) {
                statement.I1(10);
            } else {
                statement.p1(10, bArrF);
            }
            statement.m1(11, this.f57923d.f57912c.c(entity.g()));
            String strC = entity.c();
            if (strC == null) {
                statement.I1(12);
            } else {
                statement.Z0(12, strC);
            }
            statement.m1(13, entity.k() ? 1L : 0L);
            statement.m1(14, entity.i());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends w {
        d(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE updates SET launch_asset_id = ? WHERE id = ?;";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends w {
        e(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE assets SET marked_for_deletion = 1;";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends w {
        f(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE assets SET marked_for_deletion = 0 WHERE id IN ( SELECT asset_id FROM updates_assets INNER JOIN updates ON updates_assets.update_id = updates.id WHERE updates.keep);";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends w {
        g(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE assets SET marked_for_deletion = 0 WHERE id IN ( SELECT launch_asset_id FROM updates WHERE updates.keep);";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends w {
        h(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "UPDATE assets SET marked_for_deletion = 0 WHERE relative_path IN ( SELECT relative_path FROM assets WHERE marked_for_deletion = 0);";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends w {
        i(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "DELETE FROM assets WHERE marked_for_deletion = 1;";
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

    public b(q __db) {
        AbstractC5504s.h(__db, "__db");
        this.f57912c = new C5997b();
        this.f57910a = __db;
        this.f57911b = new a(__db, this);
        this.f57913d = new C0875b(__db, this);
        this.f57914e = new c(__db, this);
        this.f57915f = new d(__db);
        this.f57916g = new e(__db);
        this.f57917h = new f(__db);
        this.f57918i = new g(__db);
        this.f57919j = new h(__db);
        this.f57920k = new i(__db);
    }

    @Override // qd.AbstractC6170a
    public boolean a(rd.d update, C6306a asset, boolean z10) {
        AbstractC5504s.h(update, "update");
        AbstractC5504s.h(asset, "asset");
        this.f57910a.e();
        try {
            boolean zA = super.a(update, asset, z10);
            this.f57910a.B();
            return zA;
        } finally {
            this.f57910a.i();
        }
    }

    @Override // qd.AbstractC6170a
    protected void b() {
        this.f57910a.d();
        k kVarB = this.f57920k.b();
        try {
            this.f57910a.e();
            try {
                kVarB.Z();
                this.f57910a.B();
            } finally {
                this.f57910a.i();
            }
        } finally {
            this.f57920k.h(kVarB);
        }
    }

    @Override // qd.AbstractC6170a
    public List c() {
        this.f57910a.e();
        try {
            List listC = super.c();
            this.f57910a.B();
            return listC;
        } finally {
            this.f57910a.i();
        }
    }

    @Override // qd.AbstractC6170a
    protected long d(C6306a asset) {
        AbstractC5504s.h(asset, "asset");
        this.f57910a.d();
        this.f57910a.e();
        try {
            long jK = this.f57911b.k(asset);
            this.f57910a.B();
            return jK;
        } finally {
            this.f57910a.i();
        }
    }

    @Override // qd.AbstractC6170a
    public void e(List assets, rd.d update) {
        AbstractC5504s.h(assets, "assets");
        AbstractC5504s.h(update, "update");
        this.f57910a.e();
        try {
            super.e(assets, update);
            this.f57910a.B();
        } finally {
            this.f57910a.i();
        }
    }

    @Override // qd.AbstractC6170a
    protected void f(rd.c updateAsset) {
        AbstractC5504s.h(updateAsset, "updateAsset");
        this.f57910a.d();
        this.f57910a.e();
        try {
            this.f57913d.j(updateAsset);
            this.f57910a.B();
        } finally {
            this.f57910a.i();
        }
    }

    @Override // qd.AbstractC6170a
    protected List h(String str) throws Throwable {
        t tVar;
        int i10;
        String string;
        t tVarA = t.f12198i.a("SELECT * FROM assets WHERE `key` = ? LIMIT 1;", 1);
        if (str == null) {
            tVarA.I1(1);
        } else {
            tVarA.Z0(1, str);
        }
        this.f57910a.d();
        Cursor cursorB = O3.b.b(this.f57910a, tVarA, false, null);
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
            tVar = tVarA;
            try {
                int iE13 = O3.a.e(cursorB, "marked_for_deletion");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string2 = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                    if (cursorB.isNull(iE2)) {
                        i10 = iE;
                        string = null;
                    } else {
                        i10 = iE;
                        string = cursorB.getString(iE2);
                    }
                    int i11 = iE2;
                    C6306a c6306a = new C6306a(string2, string);
                    int i12 = iE12;
                    c6306a.B(cursorB.getLong(iE3));
                    c6306a.K(this.f57912c.l(cursorB.isNull(iE4) ? null : cursorB.getString(iE4)));
                    c6306a.A(this.f57912c.j(cursorB.isNull(iE5) ? null : cursorB.getString(iE5)));
                    c6306a.x(this.f57912c.j(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)));
                    c6306a.E(this.f57912c.j(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    c6306a.u(this.f57912c.g(cursorB.isNull(iE8) ? null : Long.valueOf(cursorB.getLong(iE8))));
                    if (cursorB.isNull(iE9)) {
                        c6306a.F(null);
                    } else {
                        c6306a.F(cursorB.getString(iE9));
                    }
                    if (cursorB.isNull(iE10)) {
                        c6306a.y(null);
                    } else {
                        c6306a.y(cursorB.getBlob(iE10));
                    }
                    c6306a.z(this.f57912c.d(cursorB.getInt(iE11)));
                    if (cursorB.isNull(i12)) {
                        c6306a.w(null);
                    } else {
                        c6306a.w(cursorB.getString(i12));
                    }
                    int i13 = iE13;
                    c6306a.D(cursorB.getInt(i13) != 0);
                    arrayList.add(c6306a);
                    iE12 = i12;
                    iE13 = i13;
                    iE2 = i11;
                    iE = i10;
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

    @Override // qd.AbstractC6170a
    public List i(UUID id2) throws Throwable {
        t tVar;
        int i10;
        String string;
        AbstractC5504s.h(id2, "id");
        t tVarA = t.f12198i.a("SELECT assets.* FROM assets INNER JOIN updates_assets ON updates_assets.asset_id = assets.id INNER JOIN updates ON updates_assets.update_id = updates.id WHERE updates.id = ?;", 1);
        tVarA.p1(1, this.f57912c.n(id2));
        this.f57910a.d();
        Cursor cursorB = O3.b.b(this.f57910a, tVarA, false, null);
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
            tVar = tVarA;
            try {
                int iE13 = O3.a.e(cursorB, "marked_for_deletion");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string2 = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                    if (cursorB.isNull(iE2)) {
                        i10 = iE;
                        string = null;
                    } else {
                        i10 = iE;
                        string = cursorB.getString(iE2);
                    }
                    int i11 = iE2;
                    C6306a c6306a = new C6306a(string2, string);
                    int i12 = iE12;
                    c6306a.B(cursorB.getLong(iE3));
                    c6306a.K(this.f57912c.l(cursorB.isNull(iE4) ? null : cursorB.getString(iE4)));
                    c6306a.A(this.f57912c.j(cursorB.isNull(iE5) ? null : cursorB.getString(iE5)));
                    c6306a.x(this.f57912c.j(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)));
                    c6306a.E(this.f57912c.j(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    c6306a.u(this.f57912c.g(cursorB.isNull(iE8) ? null : Long.valueOf(cursorB.getLong(iE8))));
                    if (cursorB.isNull(iE9)) {
                        c6306a.F(null);
                    } else {
                        c6306a.F(cursorB.getString(iE9));
                    }
                    if (cursorB.isNull(iE10)) {
                        c6306a.y(null);
                    } else {
                        c6306a.y(cursorB.getBlob(iE10));
                    }
                    c6306a.z(this.f57912c.d(cursorB.getInt(iE11)));
                    if (cursorB.isNull(i12)) {
                        c6306a.w(null);
                    } else {
                        c6306a.w(cursorB.getString(i12));
                    }
                    int i13 = iE13;
                    c6306a.D(cursorB.getInt(i13) != 0);
                    arrayList.add(c6306a);
                    iE12 = i12;
                    iE13 = i13;
                    iE2 = i11;
                    iE = i10;
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

    @Override // qd.AbstractC6170a
    protected List j() throws Throwable {
        t tVar;
        int i10;
        String string;
        t tVarA = t.f12198i.a("SELECT * FROM assets WHERE marked_for_deletion = 1;", 0);
        this.f57910a.d();
        Cursor cursorB = O3.b.b(this.f57910a, tVarA, false, null);
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
            tVar = tVarA;
            try {
                int iE13 = O3.a.e(cursorB, "marked_for_deletion");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string2 = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                    if (cursorB.isNull(iE2)) {
                        i10 = iE;
                        string = null;
                    } else {
                        i10 = iE;
                        string = cursorB.getString(iE2);
                    }
                    int i11 = iE2;
                    C6306a c6306a = new C6306a(string2, string);
                    ArrayList arrayList2 = arrayList;
                    int i12 = iE12;
                    c6306a.B(cursorB.getLong(iE3));
                    c6306a.K(this.f57912c.l(cursorB.isNull(iE4) ? null : cursorB.getString(iE4)));
                    c6306a.A(this.f57912c.j(cursorB.isNull(iE5) ? null : cursorB.getString(iE5)));
                    c6306a.x(this.f57912c.j(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)));
                    c6306a.E(this.f57912c.j(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    c6306a.u(this.f57912c.g(cursorB.isNull(iE8) ? null : Long.valueOf(cursorB.getLong(iE8))));
                    if (cursorB.isNull(iE9)) {
                        c6306a.F(null);
                    } else {
                        c6306a.F(cursorB.getString(iE9));
                    }
                    if (cursorB.isNull(iE10)) {
                        c6306a.y(null);
                    } else {
                        c6306a.y(cursorB.getBlob(iE10));
                    }
                    c6306a.z(this.f57912c.d(cursorB.getInt(iE11)));
                    if (cursorB.isNull(i12)) {
                        c6306a.w(null);
                    } else {
                        c6306a.w(cursorB.getString(i12));
                    }
                    int i13 = iE13;
                    c6306a.D(cursorB.getInt(i13) != 0);
                    arrayList2.add(c6306a);
                    iE13 = i13;
                    arrayList = arrayList2;
                    iE2 = i11;
                    iE12 = i12;
                    iE = i10;
                }
                ArrayList arrayList3 = arrayList;
                cursorB.close();
                tVar.k();
                return arrayList3;
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

    @Override // qd.AbstractC6170a
    protected void k() {
        this.f57910a.d();
        k kVarB = this.f57916g.b();
        try {
            this.f57910a.e();
            try {
                kVarB.Z();
                this.f57910a.B();
            } finally {
                this.f57910a.i();
            }
        } finally {
            this.f57916g.h(kVarB);
        }
    }

    @Override // qd.AbstractC6170a
    protected void m(long j10, UUID updateId) {
        AbstractC5504s.h(updateId, "updateId");
        this.f57910a.d();
        k kVarB = this.f57915f.b();
        kVarB.m1(1, j10);
        kVarB.p1(2, this.f57912c.n(updateId));
        try {
            this.f57910a.e();
            try {
                kVarB.Z();
                this.f57910a.B();
            } finally {
                this.f57910a.i();
            }
        } finally {
            this.f57915f.h(kVarB);
        }
    }

    @Override // qd.AbstractC6170a
    protected void n() {
        this.f57910a.d();
        k kVarB = this.f57919j.b();
        try {
            this.f57910a.e();
            try {
                kVarB.Z();
                this.f57910a.B();
            } finally {
                this.f57910a.i();
            }
        } finally {
            this.f57919j.h(kVarB);
        }
    }

    @Override // qd.AbstractC6170a
    protected void o() {
        this.f57910a.d();
        k kVarB = this.f57917h.b();
        try {
            this.f57910a.e();
            try {
                kVarB.Z();
                this.f57910a.B();
            } finally {
                this.f57910a.i();
            }
        } finally {
            this.f57917h.h(kVarB);
        }
    }

    @Override // qd.AbstractC6170a
    protected void p() {
        this.f57910a.d();
        k kVarB = this.f57918i.b();
        try {
            this.f57910a.e();
            try {
                kVarB.Z();
                this.f57910a.B();
            } finally {
                this.f57910a.i();
            }
        } finally {
            this.f57918i.h(kVarB);
        }
    }

    @Override // qd.AbstractC6170a
    public void q(C6306a assetEntity) {
        AbstractC5504s.h(assetEntity, "assetEntity");
        this.f57910a.d();
        this.f57910a.e();
        try {
            this.f57914e.j(assetEntity);
            this.f57910a.B();
        } finally {
            this.f57910a.i();
        }
    }
}
