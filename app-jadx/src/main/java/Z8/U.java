package z8;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class U extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f65967c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static int f65968d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f65969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f65970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f65971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f65972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f65973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List f65974j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f65975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f65976b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: z8.O
            @Override // z8.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.a(sQLiteDatabase);
            }
        };
        f65969e = aVar;
        a aVar2 = new a() { // from class: z8.P
            @Override // z8.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.h(sQLiteDatabase);
            }
        };
        f65970f = aVar2;
        a aVar3 = new a() { // from class: z8.Q
            @Override // z8.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f65971g = aVar3;
        a aVar4 = new a() { // from class: z8.S
            @Override // z8.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.j(sQLiteDatabase);
            }
        };
        f65972h = aVar4;
        a aVar5 = new a() { // from class: z8.T
            @Override // z8.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.g(sQLiteDatabase);
            }
        };
        f65973i = aVar5;
        f65974j = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    U(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f65976b = false;
        this.f65975a = i10;
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f65967c);
    }

    public static /* synthetic */ void h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    private void k(SQLiteDatabase sQLiteDatabase) {
        if (this.f65976b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    private void l(SQLiteDatabase sQLiteDatabase, int i10) {
        k(sQLiteDatabase);
        m(sQLiteDatabase, 0, i10);
    }

    private void m(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List list = f65974j;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                ((a) f65974j.get(i10)).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f65976b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        l(sQLiteDatabase, this.f65975a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        l(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        k(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        k(sQLiteDatabase);
        m(sQLiteDatabase, i10, i11);
    }
}
