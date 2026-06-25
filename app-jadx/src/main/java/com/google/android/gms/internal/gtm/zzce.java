package com.google.android.gms.internal.gtm;

import F8.n;
import R8.AbstractC2115p;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.util.j;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class zzce extends zzbs implements Closeable {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    private static final String zzb = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    private final zzcd zzc;
    private final zzfo zzd;
    private final zzfo zze;

    zzce(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzd = new zzfo(zzC());
        this.zze = new zzfo(zzC());
        this.zzc = new zzcd(this, zzbvVar.zza(), zzae());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzad(java.lang.String r1, java.lang.String[] r2, long r3) {
        /*
            r0 = this;
            android.database.sqlite.SQLiteDatabase r3 = r0.zzf()
            r4 = 0
            android.database.Cursor r4 = r3.rawQuery(r1, r2)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            boolean r2 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r2 == 0) goto L18
            r2 = 0
            long r1 = r4.getLong(r2)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r4.close()
            return r1
        L18:
            r4.close()
            r1 = 0
            return r1
        L1e:
            r1 = move-exception
            goto L27
        L20:
            r2 = move-exception
            java.lang.String r3 = "Database error"
            r0.zzL(r3, r1, r2)     // Catch: java.lang.Throwable -> L1e
            throw r2     // Catch: java.lang.Throwable -> L1e
        L27:
            if (r4 == 0) goto L2c
            r4.close()
        L2c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzce.zzad(java.lang.String, java.lang.String[], long):long");
    }

    public final String zzae() {
        zzw();
        zzw();
        return "google_analytics_v4.db";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (SQLiteException e10) {
            zzK("Sql error closing database", e10);
        } catch (IllegalStateException e11) {
            zzK("Error closing database", e11);
        }
    }

    public final void zzZ(List<Long> list) {
        AbstractC2115p.l(list);
        n.d();
        zzW();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("hit_id");
        sb2.append(" in (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            Long l10 = list.get(i10);
            if (l10 == null || l10.longValue() == 0) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i10 > 0) {
                sb2.append(f.f34694a);
            }
            sb2.append(l10);
        }
        sb2.append(")");
        String string = sb2.toString();
        try {
            SQLiteDatabase sQLiteDatabaseZzf = zzf();
            zzP("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int iDelete = sQLiteDatabaseZzf.delete("hits2", string, null);
            if (iDelete != list.size()) {
                zzU("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(iDelete), string);
            }
        } catch (SQLiteException e10) {
            zzK("Error deleting hits", e10);
            throw e10;
        }
    }

    public final int zza() {
        n.d();
        zzW();
        if (!this.zzd.zzc(86400000L)) {
            return 0;
        }
        this.zzd.zzb();
        zzO("Deleting stale hits (if any)");
        int iDelete = zzf().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzC().a() - 2592000000L)});
        zzP("Deleted stale hits, count", Integer.valueOf(iDelete));
        return iDelete;
    }

    public final void zzaa() {
        zzW();
        zzf().endTransaction();
    }

    public final void zzab() {
        zzW();
        zzf().setTransactionSuccessful();
    }

    final boolean zzac() {
        return zzb() == 0;
    }

    public final long zzb() {
        n.d();
        zzW();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zzf().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                zzL("Database error", "SELECT COUNT(*) FROM hits2", e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long zzc() {
        n.d();
        zzW();
        return zzad(zzb, null, 0L);
    }

    final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzS("Error opening database", e10);
            throw e10;
        }
    }

    public final List<zzex> zzj(long j10) throws Throwable {
        Map<String, String> map;
        boolean z10;
        AbstractC2115p.a(j10 >= 0);
        n.d();
        zzW();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = zzf().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j10));
                try {
                    ArrayList arrayList = new ArrayList();
                    if (cursorQuery.moveToFirst()) {
                        do {
                            long j11 = cursorQuery.getLong(0);
                            long j12 = cursorQuery.getLong(1);
                            String string = cursorQuery.getString(2);
                            String string2 = cursorQuery.getString(3);
                            int i10 = cursorQuery.getInt(4);
                            Map<String, String> mapZzk = zzk(string);
                            if (!TextUtils.isEmpty(string2) && string2.startsWith("http:")) {
                                map = mapZzk;
                                z10 = false;
                            } else {
                                map = mapZzk;
                                z10 = true;
                            }
                            arrayList.add(new zzex(this, map, j12, z10, j11, i10, null));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (SQLiteException e10) {
                    e = e10;
                    zzK("Error loading hits from the database", e);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    final Map<String, String> zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = str.length() != 0 ? "?".concat(str) : new String("?");
            }
            return j.a(new URI(str), Constants.ENCODING);
        } catch (URISyntaxException e10) {
            zzK("Error parsing hit parameters", e10);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        zzW();
        zzf().beginTransaction();
    }

    public final void zzn(long j10) {
        n.d();
        zzW();
        ArrayList arrayList = new ArrayList(1);
        Long lValueOf = Long.valueOf(j10);
        arrayList.add(lValueOf);
        zzP("Deleting hit, id", lValueOf);
        zzZ(arrayList);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }
}
