package S3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f15909a = new b();

    private b() {
    }

    public static final boolean a(File file) {
        AbstractC5504s.h(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    public static final boolean b(SQLiteDatabase sQLiteDatabase) {
        AbstractC5504s.h(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public static final Cursor c(SQLiteDatabase sQLiteDatabase, String sql, String[] selectionArgs, String str, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        AbstractC5504s.h(sQLiteDatabase, "sQLiteDatabase");
        AbstractC5504s.h(sql, "sql");
        AbstractC5504s.h(selectionArgs, "selectionArgs");
        AbstractC5504s.h(cancellationSignal, "cancellationSignal");
        AbstractC5504s.h(cursorFactory, "cursorFactory");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
        AbstractC5504s.g(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    public static final void d(SQLiteOpenHelper sQLiteOpenHelper, boolean z10) {
        AbstractC5504s.h(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
    }
}
