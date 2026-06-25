package x2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import t2.AbstractC6614a;
import v2.C6837a;
import v2.InterfaceC6838b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f63743c = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6838b f63744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63745b;

    public f(InterfaceC6838b interfaceC6838b) {
        this.f63744a = interfaceC6838b;
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    private Cursor c() {
        AbstractC6614a.e(this.f63745b);
        return this.f63744a.getReadableDatabase().query(this.f63745b, f63743c, null, null, null, null, null);
    }

    private static String d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public Map b() throws C6837a {
        try {
            Cursor cursorC = c();
            try {
                HashMap map = new HashMap(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    map.put((String) AbstractC6614a.e(cursorC.getString(0)), new e(cursorC.getLong(1), cursorC.getLong(2)));
                }
                cursorC.close();
                return map;
            } finally {
            }
        } catch (SQLException e10) {
            throw new C6837a(e10);
        }
    }

    public void e(long j10) throws C6837a {
        try {
            String hexString = Long.toHexString(j10);
            this.f63745b = d(hexString);
            if (v2.d.b(this.f63744a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f63744a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    v2.d.d(writableDatabase, 2, hexString, 1);
                    a(writableDatabase, this.f63745b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f63745b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new C6837a(e10);
        }
    }

    public void f(String str) throws C6837a {
        AbstractC6614a.e(this.f63745b);
        try {
            this.f63744a.getWritableDatabase().delete(this.f63745b, "name = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new C6837a(e10);
        }
    }

    public void g(Set set) throws C6837a {
        AbstractC6614a.e(this.f63745b);
        try {
            SQLiteDatabase writableDatabase = this.f63744a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f63745b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e10) {
            throw new C6837a(e10);
        }
    }

    public void h(String str, long j10, long j11) throws C6837a {
        AbstractC6614a.e(this.f63745b);
        try {
            SQLiteDatabase writableDatabase = this.f63744a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f63745b, null, contentValues);
        } catch (SQLException e10) {
            throw new C6837a(e10);
        }
    }
}
