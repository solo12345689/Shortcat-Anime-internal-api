package T3;

import S3.j;
import S3.k;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import ie.p;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements S3.g {

    /* JADX INFO: renamed from: b */
    public static final a f17113b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final String[] f17114c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d */
    private static final String[] f17115d = new String[0];

    /* JADX INFO: renamed from: a */
    private final SQLiteDatabase f17116a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements p {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ j f17117a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.f17117a = jVar;
        }

        @Override // ie.p
        /* JADX INFO: renamed from: a */
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f17117a;
            AbstractC5504s.e(sQLiteQuery);
            jVar.b(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f17116a = delegate;
    }

    public static final Cursor h(p tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC5504s.h(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor j(j query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC5504s.h(query, "$query");
        AbstractC5504s.e(sQLiteQuery);
        query.b(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // S3.g
    public Cursor E1(j query) {
        AbstractC5504s.h(query, "query");
        final b bVar = new b(query);
        Cursor cursorRawQueryWithFactory = this.f17116a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: T3.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.h(bVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.a(), f17115d, null);
        AbstractC5504s.g(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // S3.g
    public String H0() {
        return this.f17116a.getPath();
    }

    @Override // S3.g
    public boolean L1() {
        return this.f17116a.inTransaction();
    }

    @Override // S3.g
    public void M() {
        this.f17116a.beginTransaction();
    }

    @Override // S3.g
    public List R() {
        return this.f17116a.getAttachedDbs();
    }

    @Override // S3.g
    public boolean R1() {
        return S3.b.b(this.f17116a);
    }

    @Override // S3.g
    public void T(String sql) {
        AbstractC5504s.h(sql, "sql");
        this.f17116a.execSQL(sql);
    }

    @Override // S3.g
    public k c1(String sql) {
        AbstractC5504s.h(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f17116a.compileStatement(sql);
        AbstractC5504s.g(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new h(sQLiteStatementCompileStatement);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17116a.close();
    }

    public final boolean g(SQLiteDatabase sqLiteDatabase) {
        AbstractC5504s.h(sqLiteDatabase, "sqLiteDatabase");
        return AbstractC5504s.c(this.f17116a, sqLiteDatabase);
    }

    @Override // S3.g
    public boolean isOpen() {
        return this.f17116a.isOpen();
    }

    @Override // S3.g
    public void l0() {
        this.f17116a.setTransactionSuccessful();
    }

    @Override // S3.g
    public void m0(String sql, Object[] bindArgs) {
        AbstractC5504s.h(sql, "sql");
        AbstractC5504s.h(bindArgs, "bindArgs");
        this.f17116a.execSQL(sql, bindArgs);
    }

    @Override // S3.g
    public void n0() {
        this.f17116a.beginTransactionNonExclusive();
    }

    @Override // S3.g
    public int n1(String table, int i10, ContentValues values, String str, Object[] objArr) {
        AbstractC5504s.h(table, "table");
        AbstractC5504s.h(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f17114c[i10]);
        sb2.append(table);
        sb2.append(" SET ");
        int i11 = 0;
        for (String str2 : values.keySet()) {
            sb2.append(i11 > 0 ? com.amazon.a.a.o.b.f.f34694a : "");
            sb2.append(str2);
            objArr2[i11] = values.get(str2);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "StringBuilder().apply(builderAction).toString()");
        k kVarC1 = c1(string);
        S3.a.f15906c.b(kVarC1, objArr2);
        return kVarC1.Z();
    }

    @Override // S3.g
    public Cursor o0(final j query, CancellationSignal cancellationSignal) {
        AbstractC5504s.h(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f17116a;
        String strA = query.a();
        String[] strArr = f17115d;
        AbstractC5504s.e(cancellationSignal);
        return S3.b.c(sQLiteDatabase, strA, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: T3.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return c.j(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // S3.g
    public void v0() {
        this.f17116a.endTransaction();
    }

    @Override // S3.g
    public Cursor v1(String query) {
        AbstractC5504s.h(query, "query");
        return E1(new S3.a(query));
    }
}
