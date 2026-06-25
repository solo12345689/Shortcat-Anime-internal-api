package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.internal.measurement.C3431c3;
import com.google.android.gms.internal.measurement.C3440d3;
import com.google.android.gms.internal.measurement.C3449e3;
import com.google.android.gms.internal.measurement.C3498j7;
import com.google.android.gms.internal.measurement.K6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3911u extends AbstractC3777b6 {

    /* JADX INFO: renamed from: f */
    private static final String[] f41630f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g */
    static final String[] f41631g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: h */
    private static final String[] f41632h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: i */
    private static final String[] f41633i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* JADX INFO: renamed from: j */
    private static final String[] f41634j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: k */
    private static final String[] f41635k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: l */
    private static final String[] f41636l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m */
    private static final String[] f41637m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: n */
    private static final String[] f41638n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: o */
    private static final String[] f41639o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: p */
    private static final String[] f41640p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d */
    private final C3904t f41641d;

    /* JADX INFO: renamed from: e */
    private final R5 f41642e;

    C3911u(q6 q6Var) {
        super(q6Var);
        this.f41642e = new R5(this.f40611a.e());
        this.f40611a.w();
        this.f41641d = new C3904t(this, this.f40611a.d(), "google_app_measurement.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String M(java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r5 = r2.u0()
            r0 = 0
            android.database.Cursor r0 = r5.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            boolean r4 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r4 == 0) goto L18
            r4 = 0
            java.lang.String r3 = r0.getString(r4)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r0.close()
            return r3
        L18:
            r0.close()
            java.lang.String r3 = ""
            return r3
        L1e:
            r3 = move-exception
            goto L31
        L20:
            r4 = move-exception
            com.google.android.gms.measurement.internal.X2 r5 = r2.f40611a     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.measurement.internal.q2 r5 = r5.a()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.measurement.internal.o2 r5 = r5.o()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "Database error"
            r5.c(r1, r3, r4)     // Catch: java.lang.Throwable -> L1e
            throw r4     // Catch: java.lang.Throwable -> L1e
        L31:
            if (r0 == 0) goto L36
            r0.close()
        L36:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.M(java.lang.String, java.lang.String[], java.lang.String):java.lang.String");
    }

    private final void N(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            if (contentValues.getAsString("app_id") == null) {
                this.f40611a.a().q().b("Value of the primary key is not set.", C3887q2.x("app_id"));
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append("app_id");
            sb2.append(" = ?");
            if (sQLiteDatabaseU0.update("consent_settings", contentValues, sb2.toString(), new String[]{r2}) == 0 && sQLiteDatabaseU0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.f40611a.a().o().c("Failed to insert/update table (got -1). key", C3887q2.x("consent_settings"), C3887q2.x("app_id"));
            }
        } catch (SQLiteException e10) {
            this.f40611a.a().o().d("Error storing into table. key", C3887q2.x("consent_settings"), C3887q2.x("app_id"), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.measurement.internal.C O(java.lang.String r30, java.lang.String r31, java.lang.String r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.O(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.C");
    }

    private final void P(String str, C c10) {
        AbstractC2115p.l(c10);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        String str2 = c10.f40672a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c10.f40673b);
        contentValues.put("lifetime_count", Long.valueOf(c10.f40674c));
        contentValues.put("current_bundle_count", Long.valueOf(c10.f40675d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c10.f40677f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c10.f40678g));
        contentValues.put("last_bundled_day", c10.f40679h);
        contentValues.put("last_sampled_complex_event_id", c10.f40680i);
        contentValues.put("last_sampling_rate", c10.f40681j);
        contentValues.put("current_session_count", Long.valueOf(c10.f40676e));
        Boolean bool = c10.f40682k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.f40611a.a().o().b("Failed to insert/update event aggregates (got -1). appId", C3887q2.x(str2));
            }
        } catch (SQLiteException e10) {
            this.f40611a.a().o().c("Error storing event aggregates. appId", C3887q2.x(c10.f40672a), e10);
        }
    }

    private final void Q(String str, String str2) {
        AbstractC2115p.f(str2);
        h();
        j();
        try {
            u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            this.f40611a.a().o().c("Error deleting snapshot. appId", C3887q2.x(str2), e10);
        }
    }

    private final t6 R(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        if (TextUtils.isEmpty(str2)) {
            this.f40611a.a().v().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.Z2 z22 = (com.google.android.gms.internal.measurement.Z2) u6.W(C3431c3.J(), bArr);
            j9.G gA = j9.G.a(i10);
            if (gA != j9.G.GOOGLE_SIGNAL && gA != j9.G.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = z22.t().iterator();
                while (it.hasNext()) {
                    C3440d3 c3440d3 = (C3440d3) ((C3449e3) it.next()).p();
                    c3440d3.C0(i11);
                    arrayList.add((C3449e3) c3440d3.q());
                }
                z22.B();
                z22.A(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length = strArrSplit.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    String str4 = strArrSplit[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split(com.amazon.a.a.o.b.f.f34695b, 2);
                    if (strArrSplit2.length != 2) {
                        this.f40611a.a().o().b("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i12++;
                }
            }
            s6 s6Var = new s6();
            s6Var.b(j10);
            s6Var.c((C3431c3) z22.q());
            s6Var.d(str2);
            s6Var.e(map);
            s6Var.f(gA);
            s6Var.g(j11);
            s6Var.h(j12);
            s6Var.i(j13);
            s6Var.j(i11);
            return s6Var.a();
        } catch (IOException e10) {
            this.f40611a.a().o().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    private final String S() {
        X2 x22 = this.f40611a;
        long jA = x22.e().a();
        Locale locale = Locale.US;
        j9.G g10 = j9.G.GOOGLE_SIGNAL;
        Integer numValueOf = Integer.valueOf(g10.zza());
        Long lValueOf = Long.valueOf(jA);
        x22.w();
        Long l10 = (Long) AbstractC3789d2.f41179T.b(null);
        l10.longValue();
        String str = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, l10);
        Integer numValueOf2 = Integer.valueOf(g10.zza());
        x22.w();
        String str2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", numValueOf2, lValueOf, Long.valueOf(C3856m.q()));
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb2.append("(");
        sb2.append(str);
        sb2.append(" OR ");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }

    private static final String T(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    static final void o0(ContentValues contentValues, String str, Object obj) {
        AbstractC2115p.f("value");
        AbstractC2115p.l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long p0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f40611a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    private final long q0(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = u0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f40611a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final long A() {
        return q0("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean A0(x6 x6Var) {
        AbstractC2115p.l(x6Var);
        h();
        j();
        String str = x6Var.f41773a;
        String str2 = x6Var.f41775c;
        if (B0(str, str2) == null) {
            if (z6.r0(str2)) {
                if (p0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.f40611a.w().F(str, AbstractC3789d2.f41185W, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jP0 = p0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, x6Var.f41774b});
                this.f40611a.w();
                if (jP0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", x6Var.f41774b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(x6Var.f41776d));
        o0(contentValues, "value", x6Var.f41777e);
        try {
            if (u0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f40611a.a().o().b("Failed to insert/update user property (got -1). appId", C3887q2.x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f40611a.a().o().c("Error storing user property. appId", C3887q2.x(x6Var.f41773a), e10);
            return true;
        }
    }

    public final boolean B() {
        return p0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.x6 B0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            R8.AbstractC2115p.f(r11)
            R8.AbstractC2115p.f(r12)
            r10.h()
            r10.j()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.u0()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            if (r0 != 0) goto L32
            goto L99
        L32:
            r0 = 0
            long r7 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            r0 = 1
            java.lang.Object r9 = r10.x(r2, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            if (r9 != 0) goto L40
            goto L99
        L40:
            r0 = 2
            java.lang.String r5 = r2.getString(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            com.google.android.gms.measurement.internal.x6 r3 = new com.google.android.gms.measurement.internal.x6     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L70
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            if (r11 == 0) goto L6c
            com.google.android.gms.measurement.internal.X2 r11 = r10.f40611a     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            com.google.android.gms.measurement.internal.q2 r11 = r11.a()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            com.google.android.gms.measurement.internal.o2 r11 = r11.o()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C3887q2.x(r4)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            r11.b(r12, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69
            goto L6c
        L66:
            r0 = move-exception
            r11 = r0
            goto L74
        L69:
            r0 = move-exception
        L6a:
            r11 = r0
            goto L7e
        L6c:
            r2.close()
            return r3
        L70:
            r0 = move-exception
            r4 = r11
            r6 = r12
            goto L6a
        L74:
            r1 = r2
            goto L9f
        L76:
            r0 = move-exception
            r11 = r0
            goto L9f
        L79:
            r0 = move-exception
            r4 = r11
            r6 = r12
            r11 = r0
            r2 = r1
        L7e:
            com.google.android.gms.measurement.internal.X2 r12 = r10.f40611a     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.q2 r0 = r12.a()     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.o2 r0 = r0.o()     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C3887q2.x(r4)     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.measurement.internal.j2 r12 = r12.D()     // Catch: java.lang.Throwable -> L66
            java.lang.String r12 = r12.c(r6)     // Catch: java.lang.Throwable -> L66
            r0.d(r3, r4, r12, r11)     // Catch: java.lang.Throwable -> L66
        L99:
            if (r2 == 0) goto L9e
            r2.close()
        L9e:
            return r1
        L9f:
            if (r1 == 0) goto La4
            r1.close()
        La4:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.B0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.x6");
    }

    public final boolean C(String str, String str2) {
        return p0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final List C0(String str) {
        String str2;
        AbstractC2115p.f(str);
        h();
        j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                X2 x22 = this.f40611a;
                x22.w();
                cursorQuery = u0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j10 = cursorQuery.getLong(2);
                            Object objX = x(cursorQuery, 3);
                            if (objX == null) {
                                x22.a().o().b("Read invalid user property value, ignoring it. appId", C3887q2.x(str));
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new x6(str2, str3, string, j10, objX));
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    this.f40611a.a().o().c("Error querying user properties. appId", C3887q2.x(str2), e);
                                    arrayList = Collections.EMPTY_LIST;
                                }
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        }
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e12) {
            e = e12;
            str2 = str;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final boolean D() {
        return p0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00b6, code lost:
    
        r0 = r8.a().o();
        r8.w();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List D0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.D0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long E(String str) {
        AbstractC2115p.f(str);
        return q0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean E0(C3826i c3826i) {
        AbstractC2115p.l(c3826i);
        h();
        j();
        String str = c3826i.f41351a;
        AbstractC2115p.l(str);
        if (B0(str, c3826i.f41353c.f41669b) == null) {
            long jP0 = p0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f40611a.w();
            if (jP0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c3826i.f41352b);
        contentValues.put("name", c3826i.f41353c.f41669b);
        o0(contentValues, "value", AbstractC2115p.l(c3826i.f41353c.c()));
        contentValues.put(AppStateModule.APP_STATE_ACTIVE, Boolean.valueOf(c3826i.f41355e));
        contentValues.put("trigger_event_name", c3826i.f41356f);
        contentValues.put("trigger_timeout", Long.valueOf(c3826i.f41358h));
        X2 x22 = this.f40611a;
        contentValues.put("timed_out_event", x22.C().T(c3826i.f41357g));
        contentValues.put("creation_timestamp", Long.valueOf(c3826i.f41354d));
        contentValues.put("triggered_event", x22.C().T(c3826i.f41359i));
        contentValues.put("triggered_timestamp", Long.valueOf(c3826i.f41353c.f41670c));
        contentValues.put("time_to_live", Long.valueOf(c3826i.f41360j));
        contentValues.put("expired_event", x22.C().T(c3826i.f41361k));
        try {
            if (u0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            x22.a().o().b("Failed to insert/update conditional user property (got -1)", C3887q2.x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f40611a.a().o().c("Error storing conditional user property", C3887q2.x(str), e10);
            return true;
        }
    }

    public final boolean F(String str, Long l10, long j10, com.google.android.gms.internal.measurement.S2 s22) {
        h();
        j();
        AbstractC2115p.l(s22);
        AbstractC2115p.f(str);
        AbstractC2115p.l(l10);
        X2 x22 = this.f40611a;
        byte[] bArrB = s22.b();
        x22.a().w().c("Saving complex main event, appId, data size", x22.D().a(str), Integer.valueOf(bArrB.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrB);
        try {
            if (u0().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            x22.a().o().b("Failed to insert complex main event (got -1). appId", C3887q2.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f40611a.a().o().c("Error storing complex main event. appId", C3887q2.x(str), e10);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:247), block:B:76:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C3826i F0(java.lang.String r26, java.lang.String r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.F0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.i");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:55:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle G(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.h()
            r5.j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.u0()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            if (r2 != 0) goto L2f
            com.google.android.gms.measurement.internal.X2 r6 = r5.f40611a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.q2 r6 = r6.a()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.o2 r6 = r6.w()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L2b:
            r6 = move-exception
            goto L6a
        L2d:
            r6 = move-exception
            goto L70
        L2f:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.internal.measurement.R2 r3 = com.google.android.gms.internal.measurement.S2.M()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.D5 r2 = com.google.android.gms.measurement.internal.u6.W(r3, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.R2 r2 = (com.google.android.gms.internal.measurement.R2) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.d5 r2 = r2.q()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.S2 r2 = (com.google.android.gms.internal.measurement.S2) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.measurement.internal.q6 r6 = r5.f41010b     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r6.K0()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.util.List r6 = r2.C()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.u6.q(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r1.close()
            return r6
        L55:
            r2 = move-exception
            com.google.android.gms.measurement.internal.X2 r3 = r5.f40611a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.q2 r3 = r3.a()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.measurement.internal.o2 r3 = r3.o()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C3887q2.x(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r3.c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L6a:
            r0 = r1
            goto L85
        L6c:
            r6 = move-exception
            goto L85
        L6e:
            r6 = move-exception
            r1 = r0
        L70:
            com.google.android.gms.measurement.internal.X2 r2 = r5.f40611a     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.q2 r2 = r2.a()     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.o2 r2 = r2.o()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch: java.lang.Throwable -> L2b
        L7f:
            if (r1 == 0) goto L84
            r1.close()
        L84:
            return r0
        L85:
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.G(java.lang.String):android.os.Bundle");
    }

    public final int G0(String str, String str2) {
        AbstractC2115p.f(str);
        AbstractC2115p.f(str2);
        h();
        j();
        try {
            return u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            X2 x22 = this.f40611a;
            x22.a().o().d("Error deleting conditional property", C3887q2.x(str), x22.D().c(str2), e10);
            return 0;
        }
    }

    final boolean H(String str, long j10) {
        try {
            if (q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0) {
                return false;
            }
            return q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            this.f40611a.a().o().b("Error checking backfill conditions", e10);
            return false;
        }
    }

    public final List H0(String str, String str2, String str3) {
        AbstractC2115p.f(str);
        h();
        j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return I0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x011e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.lang.String r25, java.lang.Long r26, java.lang.String r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.I(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        r2 = r12.a().o();
        r12.w();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List I0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.I0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0066  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.E3 J(java.lang.String r5) {
        /*
            r4 = this;
            R8.AbstractC2115p.l(r5)
            r4.h()
            r4.j()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.u0()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            if (r0 != 0) goto L35
            com.google.android.gms.measurement.internal.X2 r0 = r4.f40611a     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.q2 r0 = r0.a()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.o2 r0 = r0.w()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            java.lang.String r2 = "No data found"
            r0.a(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
        L2d:
            r5.close()
            goto L5e
        L31:
            r0 = move-exception
            goto L44
        L33:
            r0 = move-exception
            goto L4c
        L35:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.E3 r1 = com.google.android.gms.measurement.internal.E3.f(r0, r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            goto L2d
        L44:
            r1 = r5
            goto L64
        L46:
            r5 = move-exception
            r0 = r5
            goto L64
        L49:
            r5 = move-exception
            r0 = r5
            r5 = r1
        L4c:
            com.google.android.gms.measurement.internal.X2 r2 = r4.f40611a     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.q2 r2 = r2.a()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.o2 r2 = r2.o()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "Error querying database."
            r2.b(r3, r0)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L5e
            goto L2d
        L5e:
            if (r1 != 0) goto L63
            com.google.android.gms.measurement.internal.E3 r5 = com.google.android.gms.measurement.internal.E3.f40738c
            return r5
        L63:
            return r1
        L64:
            if (r1 == 0) goto L69
            r1.close()
        L69:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.J(java.lang.String):com.google.android.gms.measurement.internal.E3");
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C3928w2 J0(java.lang.String r52) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.J0(java.lang.String):com.google.android.gms.measurement.internal.w2");
    }

    public final boolean K(String str, S5 s52) {
        h();
        j();
        AbstractC2115p.l(s52);
        AbstractC2115p.f(str);
        X2 x22 = this.f40611a;
        long jA = x22.e().a();
        C3781c2 c3781c2 = AbstractC3789d2.f41250w0;
        long jLongValue = jA - ((Long) c3781c2.b(null)).longValue();
        long j10 = s52.f40963b;
        if (j10 < jLongValue || j10 > ((Long) c3781c2.b(null)).longValue() + jA) {
            x22.a().r().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C3887q2.x(str), Long.valueOf(jA), Long.valueOf(j10));
        }
        x22.a().w().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", s52.f40962a);
        contentValues.put("source", Integer.valueOf(s52.f40964c));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (u0().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            x22.a().o().b("Failed to insert trigger URI (got -1). appId", C3887q2.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f40611a.a().o().c("Error storing trigger URI. appId", C3887q2.x(str), e10);
            return false;
        }
    }

    public final void K0(C3928w2 c3928w2, boolean z10, boolean z11) {
        AbstractC2115p.l(c3928w2);
        h();
        j();
        String strO0 = c3928w2.o0();
        AbstractC2115p.l(strO0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strO0);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f41010b.g(strO0).o(j9.v.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", c3928w2.p0());
        }
        contentValues.put("gmp_app_id", c3928w2.r0());
        q6 q6Var = this.f41010b;
        if (q6Var.g(strO0).o(j9.v.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", c3928w2.v0());
        }
        contentValues.put("last_bundle_index", Long.valueOf(c3928w2.g()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c3928w2.z0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c3928w2.B0()));
        contentValues.put("app_version", c3928w2.D0());
        contentValues.put("app_store", c3928w2.H0());
        contentValues.put("gmp_version", Long.valueOf(c3928w2.J0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c3928w2.L0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c3928w2.d()));
        contentValues.put("day", Long.valueOf(c3928w2.n()));
        contentValues.put("daily_public_events_count", Long.valueOf(c3928w2.p()));
        contentValues.put("daily_events_count", Long.valueOf(c3928w2.r()));
        contentValues.put("daily_conversions_count", Long.valueOf(c3928w2.t()));
        contentValues.put("config_fetched_time", Long.valueOf(c3928w2.h()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c3928w2.j()));
        contentValues.put("app_version_int", Long.valueOf(c3928w2.F0()));
        contentValues.put("firebase_instance_id", c3928w2.x0());
        contentValues.put("daily_error_events_count", Long.valueOf(c3928w2.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c3928w2.v()));
        contentValues.put("health_monitor_sample", c3928w2.z());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c3928w2.P()));
        contentValues.put("dynamite_version", Long.valueOf(c3928w2.b()));
        if (q6Var.g(strO0).o(j9.v.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", c3928w2.t0());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c3928w2.V()));
        contentValues.put("target_os_version", Long.valueOf(c3928w2.X()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c3928w2.Z()));
        C3498j7.a();
        X2 x22 = this.f40611a;
        if (x22.w().H(strO0, AbstractC3789d2.f41174Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(c3928w2.b0()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(c3928w2.j0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c3928w2.d0()));
        contentValues.put("npa_metadata_value", c3928w2.R());
        contentValues.put("bundle_delivery_index", Long.valueOf(c3928w2.G()));
        contentValues.put("sgtm_preview_key", c3928w2.l0());
        contentValues.put("dma_consent_state", Integer.valueOf(c3928w2.B()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c3928w2.D()));
        contentValues.put("serialized_npa_metadata", c3928w2.I());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c3928w2.M()));
        List listT = c3928w2.T();
        if (listT != null) {
            if (listT.isEmpty()) {
                x22.a().r().b("Safelisted events should not be an empty list. appId", strO0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(com.amazon.a.a.o.b.f.f34694a, listT));
            }
        }
        K6.a();
        if (x22.w().H(null, AbstractC3789d2.f41164L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", c3928w2.f0());
        contentValues.put("unmatched_uwa", c3928w2.h0());
        contentValues.put("ad_campaign_info", c3928w2.K());
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            if (sQLiteDatabaseU0.update("apps", contentValues, "app_id = ?", new String[]{strO0}) == 0 && sQLiteDatabaseU0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                x22.a().o().b("Failed to insert/update app (got -1). appId", C3887q2.x(strO0));
            }
        } catch (SQLiteException e10) {
            this.f40611a.a().o().c("Error storing app. appId", C3887q2.x(strO0), e10);
        }
    }

    public final void L(String str, E3 e32) {
        AbstractC2115p.l(str);
        AbstractC2115p.l(e32);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", e32.l());
        contentValues.put("consent_source", Integer.valueOf(e32.b()));
        N("consent_settings", "app_id", contentValues);
    }

    public final C3884q L0(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return M0(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    public final C3884q M0(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        AbstractC2115p.f(str);
        h();
        j();
        String[] strArr = {str};
        C3884q c3884q = new C3884q();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                cursorQuery = sQLiteDatabaseU0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j10) {
                        c3884q.f41500b = cursorQuery.getLong(1);
                        c3884q.f41499a = cursorQuery.getLong(2);
                        c3884q.f41501c = cursorQuery.getLong(3);
                        c3884q.f41502d = cursorQuery.getLong(4);
                        c3884q.f41503e = cursorQuery.getLong(5);
                        c3884q.f41504f = cursorQuery.getLong(6);
                        c3884q.f41505g = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        c3884q.f41500b += j11;
                    }
                    if (z11) {
                        c3884q.f41499a += j11;
                    }
                    if (z12) {
                        c3884q.f41501c += j11;
                    }
                    if (z13) {
                        c3884q.f41502d += j11;
                    }
                    if (z14) {
                        c3884q.f41503e += j11;
                    }
                    if (z15) {
                        c3884q.f41504f += j11;
                    }
                    if (z16) {
                        c3884q.f41505g += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(c3884q.f41499a));
                    contentValues.put("daily_events_count", Long.valueOf(c3884q.f41500b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c3884q.f41501c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c3884q.f41502d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c3884q.f41503e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c3884q.f41504f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c3884q.f41505g));
                    sQLiteDatabaseU0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.f40611a.a().r().b("Not updating daily counts, app is not known. appId", C3887q2.x(str));
                }
            } catch (SQLiteException e10) {
                this.f40611a.a().o().c("Error updating daily counts. appId", C3887q2.x(str), e10);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return c3884q;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C3877p N0(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            R8.AbstractC2115p.f(r11)
            r10.h()
            r10.j()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.u0()     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            java.lang.String r3 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteException -> L6d
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            if (r0 != 0) goto L2e
            goto L82
        L2e:
            r0 = 0
            byte[] r0 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r3 = 1
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r4 = 2
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            boolean r5 = r2.moveToNext()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            if (r5 == 0) goto L5c
            com.google.android.gms.measurement.internal.X2 r5 = r10.f40611a     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            com.google.android.gms.measurement.internal.q2 r5 = r5.a()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            com.google.android.gms.measurement.internal.o2 r5 = r5.o()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C3887q2.x(r11)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            goto L5c
        L57:
            r0 = move-exception
            r11 = r0
            goto L68
        L5a:
            r0 = move-exception
            goto L6f
        L5c:
            if (r0 != 0) goto L5f
            goto L82
        L5f:
            com.google.android.gms.measurement.internal.p r5 = new com.google.android.gms.measurement.internal.p     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r5.<init>(r0, r3, r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L5a
            r2.close()
            return r5
        L68:
            r1 = r2
            goto L88
        L6a:
            r0 = move-exception
            r11 = r0
            goto L88
        L6d:
            r0 = move-exception
            r2 = r1
        L6f:
            com.google.android.gms.measurement.internal.X2 r3 = r10.f40611a     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.q2 r3 = r3.a()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.o2 r3 = r3.o()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C3887q2.x(r11)     // Catch: java.lang.Throwable -> L57
            r3.c(r4, r11, r0)     // Catch: java.lang.Throwable -> L57
        L82:
            if (r2 == 0) goto L87
            r2.close()
        L87:
            return r1
        L88:
            if (r1 == 0) goto L8d
            r1.close()
        L8d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.N0(java.lang.String):com.google.android.gms.measurement.internal.p");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O0(com.google.android.gms.internal.measurement.C3449e3 r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.O0(com.google.android.gms.internal.measurement.e3, boolean):boolean");
    }

    public final C3939y U(String str) {
        AbstractC2115p.l(str);
        h();
        j();
        return C3939y.g(M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void V(String str, C3939y c3939y) {
        AbstractC2115p.l(str);
        AbstractC2115p.l(c3939y);
        h();
        j();
        E3 e3J = J(str);
        E3 e32 = E3.f40738c;
        if (e3J == e32) {
            L(str, e32);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c3939y.e());
        N("consent_settings", "app_id", contentValues);
    }

    public final void W(String str, E3 e32) {
        AbstractC2115p.l(str);
        AbstractC2115p.l(e32);
        h();
        j();
        L(str, J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", e32.l());
        N("consent_settings", "app_id", contentValues);
    }

    public final E3 X(String str) {
        AbstractC2115p.l(str);
        h();
        j();
        return E3.f(M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0176, code lost:
    
        r11 = r0.E().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0182, code lost:
    
        if (r11.hasNext() == false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x018e, code lost:
    
        if (((com.google.android.gms.internal.measurement.L1) r11.next()).C() != false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0190, code lost:
    
        r22.f40611a.a().r().c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C3887q2.x(r23), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01a9, code lost:
    
        r11 = r0.H().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01b5, code lost:
    
        r19 = r0;
        r0 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.D1) r11.next();
        j();
        h();
        R8.AbstractC2115p.f(r23);
        R8.AbstractC2115p.l(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01df, code lost:
    
        if (r12.E().isEmpty() == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01e1, code lost:
    
        r0 = r22.f40611a.a().r();
        r11 = com.google.android.gms.measurement.internal.C3887q2.x(r23);
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01f9, code lost:
    
        if (r12.C() == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01fb, code lost:
    
        r16 = java.lang.Integer.valueOf(r12.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0206, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0208, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r11, r13, java.lang.String.valueOf(r16));
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0213, code lost:
    
        r3 = r12.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0217, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0219, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r23);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x022c, code lost:
    
        if (r12.C() == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x022e, code lost:
    
        r0 = java.lang.Integer.valueOf(r12.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x023a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x023b, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r12.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x024b, code lost:
    
        if (r12.M() == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x024d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r12.N());
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0256, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0257, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0269, code lost:
    
        if (u0().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x026b, code lost:
    
        r22.f40611a.a().o().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C3887q2.x(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x027e, code lost:
    
        r0 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0286, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0287, code lost:
    
        r22.f40611a.a().o().c("Error storing event filter. appId", com.google.android.gms.measurement.internal.C3887q2.x(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x029c, code lost:
    
        r20 = r7;
        r3 = r19.E().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x02aa, code lost:
    
        if (r3.hasNext() == false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x02ac, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.L1) r3.next();
        j();
        h();
        R8.AbstractC2115p.f(r23);
        R8.AbstractC2115p.l(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02c6, code lost:
    
        if (r7.E().isEmpty() == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x02c8, code lost:
    
        r0 = r22.f40611a.a().r();
        r9 = com.google.android.gms.measurement.internal.C3887q2.x(r23);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x02e0, code lost:
    
        if (r7.C() == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x02e2, code lost:
    
        r16 = java.lang.Integer.valueOf(r7.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x02ed, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x02ef, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x02f8, code lost:
    
        r11 = r7.b();
        r12 = new android.content.ContentValues();
        r12.put(r0, r23);
        r19 = r0;
        r12.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0311, code lost:
    
        if (r7.C() == false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0313, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x031c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x031d, code lost:
    
        r12.put("filter_id", r0);
        r21 = r3;
        r12.put("property_name", r7.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x032f, code lost:
    
        if (r7.I() == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0331, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.J());
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x033a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x033b, code lost:
    
        r12.put("session_scoped", r0);
        r12.put("data", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x034d, code lost:
    
        if (u0().insertWithOnConflict("property_filters", null, r12, 5) != (-1)) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x034f, code lost:
    
        r22.f40611a.a().o().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C3887q2.x(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0363, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0365, code lost:
    
        r0 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x036b, code lost:
    
        r22.f40611a.a().o().c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C3887q2.x(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x037e, code lost:
    
        j();
        h();
        R8.AbstractC2115p.f(r23);
        r0 = u0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x03a1, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0494, code lost:
    
        r20.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0497, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void Y(java.lang.String r23, java.util.List r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.Y(java.lang.String, java.util.List):void");
    }

    final C Z(String str, com.google.android.gms.internal.measurement.S2 s22, String str2) throws Throwable {
        C cO = O("events", str, s22.F());
        if (cO == null) {
            X2 x22 = this.f40611a;
            x22.a().r().c("Event aggregate wasn't created during raw event logging. appId, event", C3887q2.x(str), x22.D().a(str2));
            return new C(str, s22.F(), 1L, 1L, 1L, s22.H(), 0L, null, null, null, null);
        }
        long j10 = cO.f40676e + 1;
        long j11 = cO.f40675d + 1;
        return new C(cO.f40672a, cO.f40673b, cO.f40674c + 1, j11, j10, cO.f40677f, cO.f40678g, cO.f40679h, cO.f40680i, cO.f40681j, cO.f40682k);
    }

    protected final boolean a0() {
        X2 x22 = this.f40611a;
        Context contextD = x22.d();
        x22.w();
        return contextD.getDatabasePath("google_app_measurement.db").exists();
    }

    final /* synthetic */ long b0(String str, String[] strArr, long j10) {
        return q0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3777b6
    protected final boolean l() {
        return false;
    }

    public final long m(String str, C3431c3 c3431c3, String str2, Map map, j9.G g10, Long l10) {
        int iDelete;
        h();
        j();
        AbstractC2115p.l(c3431c3);
        AbstractC2115p.f(str);
        h();
        j();
        if (a0()) {
            q6 q6Var = this.f41010b;
            long jA = q6Var.L0().f41793f.a();
            X2 x22 = this.f40611a;
            long jC = x22.e().c();
            long jAbs = Math.abs(jC - jA);
            x22.w();
            if (jAbs > C3856m.r()) {
                q6Var.L0().f41793f.b(jC);
                h();
                j();
                if (a0() && (iDelete = u0().delete("upload_queue", S(), new String[0])) > 0) {
                    x22.a().w().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                AbstractC2115p.f(str);
                h();
                j();
                try {
                    int iE = x22.w().E(str, AbstractC3789d2.f41141A);
                    if (iE > 0) {
                        u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iE)});
                    }
                } catch (SQLiteException e10) {
                    this.f40611a.a().o().c("Error deleting over the limit queued batches. appId", C3887q2.x(str), e10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append(com.amazon.a.a.o.b.f.f34695b);
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrB = c3431c3.b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrB);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", H2.h.a("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(g10.zza()));
        X2 x23 = this.f40611a;
        contentValues.put("creation_timestamp", Long.valueOf(x23.e().a()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = u0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            x23.a().o().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e11) {
            this.f40611a.a().o().c("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    final /* synthetic */ R5 m0() {
        return this.f41642e;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.t6 n(long r19) {
        /*
            r18 = this;
            r18.h()
            r18.j()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r18.u0()     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "rowId"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "measurement_batch"
            java.lang.String r7 = "upload_uri"
            java.lang.String r8 = "upload_headers"
            java.lang.String r9 = "upload_type"
            java.lang.String r10 = "retry_count"
            java.lang.String r11 = "creation_timestamp"
            java.lang.String r12 = "associated_row_id"
            java.lang.String r13 = "last_upload_timestamp"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r5 = "rowId=?"
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r10 = "1"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            if (r0 != 0) goto L42
            r3 = r18
            goto Lab
        L42:
            r0 = 1
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.Object r0 = R8.AbstractC2115p.l(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 2
            byte[] r7 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 3
            java.lang.String r8 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 4
            java.lang.String r9 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 5
            int r10 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 6
            int r11 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 7
            long r12 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 8
            long r14 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 9
            long r16 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r3 = r18
            r5 = r19
            com.google.android.gms.measurement.internal.t6 r0 = r3.R(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r2.close()
            return r0
        L84:
            r0 = move-exception
            goto L88
        L86:
            r0 = move-exception
            goto L8c
        L88:
            r3 = r18
        L8a:
            r1 = r2
            goto Lb3
        L8c:
            r3 = r18
            goto L98
        L8f:
            r0 = move-exception
            goto L93
        L91:
            r0 = move-exception
            goto L96
        L93:
            r3 = r18
            goto Lb3
        L96:
            r2 = r1
            goto L8c
        L98:
            com.google.android.gms.measurement.internal.X2 r4 = r3.f40611a     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.measurement.internal.q2 r4 = r4.a()     // Catch: java.lang.Throwable -> Lb1
            com.google.android.gms.measurement.internal.o2 r4 = r4.o()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r5 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r6 = java.lang.Long.valueOf(r19)     // Catch: java.lang.Throwable -> Lb1
            r4.c(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb1
        Lab:
            if (r2 == 0) goto Lb0
            r2.close()
        Lb0:
            return r1
        Lb1:
            r0 = move-exception
            goto L8a
        Lb3:
            if (r1 == 0) goto Lb8
            r1.close()
        Lb8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.n(long):com.google.android.gms.measurement.internal.t6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00f5 A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:148:0x0070, B:174:0x00ce, B:176:0x00f5, B:177:0x010a, B:178:0x010e, B:179:0x011e, B:181:0x0124, B:182:0x0137, B:185:0x0151, B:197:0x0178, B:200:0x0180, B:206:0x01a0, B:190:0x0167, B:204:0x0192, B:205:0x019b, B:227:0x0221), top: B:241:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x010a A[Catch: all -> 0x0078, SQLiteException -> 0x007a, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:148:0x0070, B:174:0x00ce, B:176:0x00f5, B:177:0x010a, B:178:0x010e, B:179:0x011e, B:181:0x0124, B:182:0x0137, B:185:0x0151, B:197:0x0178, B:200:0x0180, B:206:0x01a0, B:190:0x0167, B:204:0x0192, B:205:0x019b, B:227:0x0221), top: B:241:0x0070 }] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n0(java.lang.String r20, long r21, long r23, com.google.android.gms.measurement.internal.m6 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.n0(java.lang.String, long, long, com.google.android.gms.measurement.internal.m6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List o(java.lang.String r19, j9.J r20, int r21) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.o(java.lang.String, j9.J, int):java.util.List");
    }

    public final boolean p(String str) {
        j9.G[] gArr = {j9.G.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(gArr[0].zza()));
        String strT = T(arrayList);
        String strS = S();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strT).length() + 61 + strS.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(strT);
        sb2.append(" AND NOT ");
        sb2.append(strS);
        return p0(sb2.toString(), new String[]{str}) != 0;
    }

    public final void q(Long l10) {
        h();
        j();
        AbstractC2115p.l(l10);
        try {
            if (u0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                this.f40611a.a().r().a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f40611a.a().o().b("Failed to delete a MeasurementBatch in a upload_queue table", e10);
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String r() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.u0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L36
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L22:
            r0 = move-exception
            goto L3c
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            com.google.android.gms.measurement.internal.X2 r3 = r6.f40611a     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.q2 r3 = r3.a()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.o2 r3 = r3.o()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
        L36:
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r1 == 0) goto L41
            r1.close()
        L41:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.r():java.lang.String");
    }

    public final void r0() {
        j();
        u0().beginTransaction();
    }

    public final boolean s() {
        return p0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void s0() {
        j();
        u0().setTransactionSuccessful();
    }

    public final void t(long j10) {
        h();
        j();
        try {
            if (u0().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f40611a.a().o().b("Failed to delete a bundle in a queue table", e10);
            throw e10;
        }
    }

    public final void t0() {
        j();
        u0().endTransaction();
    }

    final void u() {
        h();
        j();
        if (a0()) {
            q6 q6Var = this.f41010b;
            long jA = q6Var.L0().f41792e.a();
            X2 x22 = this.f40611a;
            long jC = x22.e().c();
            long jAbs = Math.abs(jC - jA);
            x22.w();
            if (jAbs > C3856m.r()) {
                q6Var.L0().f41792e.b(jC);
                h();
                j();
                if (a0()) {
                    SQLiteDatabase sQLiteDatabaseU0 = u0();
                    String strValueOf = String.valueOf(x22.e().a());
                    x22.w();
                    int iDelete = sQLiteDatabaseU0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(C3856m.q())});
                    if (iDelete > 0) {
                        x22.a().w().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    final SQLiteDatabase u0() {
        h();
        try {
            return this.f41641d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f40611a.a().r().b("Error opening database", e10);
            throw e10;
        }
    }

    final void v(List list) {
        h();
        j();
        AbstractC2115p.l(list);
        AbstractC2115p.n(list.size());
        if (a0()) {
            String strJoin = TextUtils.join(com.amazon.a.a.o.b.f.f34694a, list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb2.append("(");
            sb2.append(strJoin);
            sb2.append(")");
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(string);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb3.toString(), null) > 0) {
                this.f40611a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                StringBuilder sb4 = new StringBuilder(string.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(string);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseU0.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.f40611a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final C v0(String str, String str2) {
        return O("events", str, str2);
    }

    final void w(Long l10) {
        h();
        j();
        AbstractC2115p.l(l10);
        if (a0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb2.toString(), null) > 0) {
                this.f40611a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                long jA = this.f40611a.e().a();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jA).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jA);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l10);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseU0.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.f40611a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final void w0(C c10) {
        P("events", c10);
    }

    final Object x(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f40611a.a().o().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.f40611a.a().o().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f40611a.a().o().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final void x0(String str) {
        C cO;
        Q("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = u0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (cO = O("events", str, string)) != null) {
                            P("events_snapshot", cO);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f40611a.a().o().c("Error creating snapshot. appId", C3887q2.x(str), e10);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    public final long y() {
        return q0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.y0(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009a A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TryCatch #0 {all -> 0x0074, blocks: (B:35:0x001b, B:38:0x0041, B:40:0x0060, B:47:0x0079, B:49:0x009a, B:52:0x00b0, B:55:0x00b8), top: B:61:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0 A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:35:0x001b, B:38:0x0041, B:40:0x0060, B:47:0x0079, B:49:0x009a, B:52:0x00b0, B:55:0x00b8), top: B:61:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final long z(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3911u.z(java.lang.String, java.lang.String):long");
    }

    public final void z0(String str, String str2) {
        AbstractC2115p.f(str);
        AbstractC2115p.f(str2);
        h();
        j();
        try {
            u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            X2 x22 = this.f40611a;
            x22.a().o().d("Error deleting user property. appId", C3887q2.x(str), x22.D().c(str2), e10);
        }
    }
}
