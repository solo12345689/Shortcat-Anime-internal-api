package qd;

import M3.i;
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
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.C5997b;
import qd.c;
import rd.C6307b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends qd.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f57931e = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f57932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f57933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5997b f57934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f57935d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f57936d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, d dVar) {
            super(qVar);
            this.f57936d = dVar;
        }

        @Override // M3.w
        protected String e() {
            return "INSERT OR ABORT INTO `json_data` (`key`,`value`,`last_updated`,`scope_key`,`id`) VALUES (?,?,?,?,nullif(?, 0))";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, C6307b entity) {
            AbstractC5504s.h(statement, "statement");
            AbstractC5504s.h(entity, "entity");
            statement.Z0(1, entity.b());
            statement.Z0(2, entity.e());
            Long lB = this.f57936d.f57934c.b(entity.c());
            if (lB == null) {
                statement.I1(3);
            } else {
                statement.m1(3, lB.longValue());
            }
            statement.Z0(4, entity.d());
            statement.m1(5, entity.a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends w {
        b(q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "DELETE FROM json_data WHERE `key` = ? AND scope_key = ?;";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return AbstractC2279u.m();
        }

        private c() {
        }
    }

    public d(q __db) {
        AbstractC5504s.h(__db, "__db");
        this.f57934c = new C5997b();
        this.f57932a = __db;
        this.f57933b = new a(__db, this);
        this.f57935d = new b(__db);
    }

    @Override // qd.c
    protected void a(String key, String scopeKey) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(scopeKey, "scopeKey");
        this.f57932a.d();
        k kVarB = this.f57935d.b();
        kVarB.Z0(1, key);
        kVarB.Z0(2, scopeKey);
        try {
            this.f57932a.e();
            try {
                kVarB.Z();
                this.f57932a.B();
            } finally {
                this.f57932a.i();
            }
        } finally {
            this.f57935d.h(kVarB);
        }
    }

    @Override // qd.c
    public void b(List keys) {
        AbstractC5504s.h(keys, "keys");
        this.f57932a.e();
        try {
            super.b(keys);
            this.f57932a.B();
        } finally {
            this.f57932a.i();
        }
    }

    @Override // qd.c
    protected void c(List keys) {
        AbstractC5504s.h(keys, "keys");
        this.f57932a.d();
        StringBuilder sbB = O3.d.b();
        sbB.append("DELETE FROM json_data WHERE `key` IN (");
        O3.d.a(sbB, keys.size());
        sbB.append(")");
        String string = sbB.toString();
        AbstractC5504s.g(string, "toString(...)");
        k kVarF = this.f57932a.f(string);
        Iterator it = keys.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            kVarF.Z0(i10, (String) it.next());
            i10++;
        }
        this.f57932a.e();
        try {
            kVarF.Z();
            this.f57932a.B();
        } finally {
            this.f57932a.i();
        }
    }

    @Override // qd.c
    protected void d(C6307b jsonDataEntity) {
        AbstractC5504s.h(jsonDataEntity, "jsonDataEntity");
        this.f57932a.d();
        this.f57932a.e();
        try {
            this.f57933b.j(jsonDataEntity);
            this.f57932a.B();
        } finally {
            this.f57932a.i();
        }
    }

    @Override // qd.c
    protected List e(String key, String scopeKey) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(scopeKey, "scopeKey");
        t tVarA = t.f12198i.a("SELECT * FROM json_data WHERE `key` = ? AND scope_key = ? ORDER BY last_updated DESC LIMIT 1;", 2);
        tVarA.Z0(1, key);
        tVarA.Z0(2, scopeKey);
        this.f57932a.d();
        Cursor cursorB = O3.b.b(this.f57932a, tVarA, false, null);
        try {
            int iE = O3.a.e(cursorB, SubscriberAttributeKt.JSON_NAME_KEY);
            int iE2 = O3.a.e(cursorB, "value");
            int iE3 = O3.a.e(cursorB, "last_updated");
            int iE4 = O3.a.e(cursorB, "scope_key");
            int iE5 = O3.a.e(cursorB, DiagnosticsEntry.ID_KEY);
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iE);
                AbstractC5504s.g(string, "getString(...)");
                String string2 = cursorB.getString(iE2);
                AbstractC5504s.g(string2, "getString(...)");
                Date dateG = this.f57934c.g(cursorB.isNull(iE3) ? null : Long.valueOf(cursorB.getLong(iE3)));
                if (dateG == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                String string3 = cursorB.getString(iE4);
                AbstractC5504s.g(string3, "getString(...)");
                C6307b c6307b = new C6307b(string, string2, dateG, string3);
                c6307b.f(cursorB.getLong(iE5));
                arrayList.add(c6307b);
            }
            cursorB.close();
            tVarA.k();
            return arrayList;
        } catch (Throwable th2) {
            cursorB.close();
            tVarA.k();
            throw th2;
        }
    }

    @Override // qd.c
    public void g(c.a key, String value, String scopeKey) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(scopeKey, "scopeKey");
        this.f57932a.e();
        try {
            super.g(key, value, scopeKey);
            this.f57932a.B();
        } finally {
            this.f57932a.i();
        }
    }

    @Override // qd.c
    public void h(Map fields, String scopeKey) {
        AbstractC5504s.h(fields, "fields");
        AbstractC5504s.h(scopeKey, "scopeKey");
        this.f57932a.e();
        try {
            super.h(fields, scopeKey);
            this.f57932a.B();
        } finally {
            this.f57932a.i();
        }
    }

    @Override // qd.c
    public void i(c.a key, String scopeKey, Function1 updater) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(scopeKey, "scopeKey");
        AbstractC5504s.h(updater, "updater");
        this.f57932a.e();
        try {
            super.i(key, scopeKey, updater);
            this.f57932a.B();
        } finally {
            this.f57932a.i();
        }
    }
}
