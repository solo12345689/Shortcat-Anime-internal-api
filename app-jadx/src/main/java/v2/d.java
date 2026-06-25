package v2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import q2.AbstractC6076H;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    static {
        AbstractC6076H.a("media3.database");
    }

    private static String[] a(int i10, String str) {
        return new String[]{Integer.toString(i10), str};
    }

    public static int b(SQLiteDatabase sQLiteDatabase, int i10, String str) throws C6837a {
        try {
        } catch (SQLException e10) {
            throw new C6837a(e10);
        }
        if (!a0.z1(sQLiteDatabase, "ExoPlayerVersions")) {
            return -1;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{DiagnosticsEntry.VERSION_KEY}, "feature = ? AND instance_uid = ?", a(i10, str), null, null, null);
        try {
            if (cursorQuery.getCount() == 0) {
                cursorQuery.close();
                return -1;
            }
            cursorQuery.moveToNext();
            int i11 = cursorQuery.getInt(0);
            cursorQuery.close();
            return i11;
        } finally {
        }
        throw new C6837a(e10);
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i10, String str) throws C6837a {
        try {
            if (a0.z1(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", a(i10, str));
            }
        } catch (SQLException e10) {
            throw new C6837a(e10);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i10, String str, int i11) throws C6837a {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i10));
            contentValues.put("instance_uid", str);
            contentValues.put(DiagnosticsEntry.VERSION_KEY, Integer.valueOf(i11));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e10) {
            throw new C6837a(e10);
        }
    }
}
