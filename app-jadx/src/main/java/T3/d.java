package T3;

import S3.h;
import T3.d;
import Td.AbstractC2163n;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import ie.InterfaceC5082a;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements S3.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f17118h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h.a f17121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f17124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17125g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T3.c f17126a;

        public b(T3.c cVar) {
            this.f17126a = cVar;
        }

        public final T3.c a() {
            return this.f17126a;
        }

        public final void b(T3.c cVar) {
            this.f17126a = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0295c f17127h = new C0295c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f17128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f17129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h.a f17130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f17131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f17132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final U3.a f17133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f17134g;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f17135a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f17136b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                AbstractC5504s.h(callbackName, "callbackName");
                AbstractC5504s.h(cause, "cause");
                this.f17135a = callbackName;
                this.f17136b = cause;
            }

            public final b a() {
                return this.f17135a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f17136b;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: T3.d$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0295c {
            public /* synthetic */ C0295c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final T3.c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                AbstractC5504s.h(refHolder, "refHolder");
                AbstractC5504s.h(sqLiteDatabase, "sqLiteDatabase");
                T3.c cVarA = refHolder.a();
                if (cVarA != null && cVarA.g(sqLiteDatabase)) {
                    return cVarA;
                }
                T3.c cVar = new T3.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }

            private C0295c() {
            }
        }

        /* JADX INFO: renamed from: T3.d$c$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class C0296d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17143a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f17143a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final h.a callback, boolean z10) {
            String string;
            super(context, str, null, callback.f15915a, new DatabaseErrorHandler() { // from class: T3.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.b(callback, dbRef, sQLiteDatabase);
                }
            });
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(dbRef, "dbRef");
            AbstractC5504s.h(callback, "callback");
            this.f17128a = context;
            this.f17129b = dbRef;
            this.f17130c = callback;
            this.f17131d = z10;
            if (str == null) {
                string = UUID.randomUUID().toString();
                AbstractC5504s.g(string, "randomUUID().toString()");
            } else {
                string = str;
            }
            this.f17133f = new U3.a(string, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(h.a callback, b dbRef, SQLiteDatabase dbObj) {
            AbstractC5504s.h(callback, "$callback");
            AbstractC5504s.h(dbRef, "$dbRef");
            C0295c c0295c = f17127h;
            AbstractC5504s.g(dbObj, "dbObj");
            callback.c(c0295c.a(dbRef, dbObj));
        }

        private final SQLiteDatabase j(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                AbstractC5504s.g(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            AbstractC5504s.g(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase k(boolean z10) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f17134g;
            if (databaseName != null && !z11 && (parentFile = this.f17128a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return j(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return j(z10);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof a) {
                        a aVar = th2;
                        Throwable cause = aVar.getCause();
                        int i10 = C0296d.f17143a[aVar.a().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th2 instanceof SQLiteException) || databaseName == null || !this.f17131d) {
                        throw th2;
                    }
                    this.f17128a.deleteDatabase(databaseName);
                    try {
                        return j(z10);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                U3.a.c(this.f17133f, false, 1, null);
                super.close();
                this.f17129b.b(null);
                this.f17134g = false;
            } finally {
                this.f17133f.d();
            }
        }

        public final S3.g g(boolean z10) {
            S3.g gVarH;
            try {
                this.f17133f.b((this.f17134g || getDatabaseName() == null) ? false : true);
                this.f17132e = false;
                SQLiteDatabase sQLiteDatabaseK = k(z10);
                if (this.f17132e) {
                    close();
                    gVarH = g(z10);
                } else {
                    gVarH = h(sQLiteDatabaseK);
                }
                this.f17133f.d();
                return gVarH;
            } catch (Throwable th2) {
                this.f17133f.d();
                throw th2;
            }
        }

        public final T3.c h(SQLiteDatabase sqLiteDatabase) {
            AbstractC5504s.h(sqLiteDatabase, "sqLiteDatabase");
            return f17127h.a(this.f17129b, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            AbstractC5504s.h(db2, "db");
            if (!this.f17132e && this.f17130c.f15915a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.f17130c.b(h(db2));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            AbstractC5504s.h(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f17130c.d(h(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
            AbstractC5504s.h(db2, "db");
            this.f17132e = true;
            try {
                this.f17130c.e(h(db2), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            AbstractC5504s.h(db2, "db");
            if (!this.f17132e) {
                try {
                    this.f17130c.f(h(db2));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.f17134g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            AbstractC5504s.h(sqLiteDatabase, "sqLiteDatabase");
            this.f17132e = true;
            try {
                this.f17130c.g(h(sqLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }
    }

    /* JADX INFO: renamed from: T3.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0297d extends AbstractC5506u implements InterfaceC5082a {
        C0297d() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (d.this.f17120b == null || !d.this.f17122d) {
                cVar = new c(d.this.f17119a, d.this.f17120b, new b(null), d.this.f17121c, d.this.f17123e);
            } else {
                cVar = new c(d.this.f17119a, new File(S3.d.a(d.this.f17119a), d.this.f17120b).getAbsolutePath(), new b(null), d.this.f17121c, d.this.f17123e);
            }
            S3.b.d(cVar, d.this.f17125g);
            return cVar;
        }
    }

    public d(Context context, String str, h.a callback, boolean z10, boolean z11) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(callback, "callback");
        this.f17119a = context;
        this.f17120b = str;
        this.f17121c = callback;
        this.f17122d = z10;
        this.f17123e = z11;
        this.f17124f = AbstractC2163n.b(new C0297d());
    }

    private final c l() {
        return (c) this.f17124f.getValue();
    }

    @Override // S3.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f17124f.e()) {
            l().close();
        }
    }

    @Override // S3.h
    public String getDatabaseName() {
        return this.f17120b;
    }

    @Override // S3.h
    public S3.g getWritableDatabase() {
        return l().g(true);
    }

    @Override // S3.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f17124f.e()) {
            S3.b.d(l(), z10);
        }
        this.f17125g = z10;
    }
}
