package M3;

import S3.h;
import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class s extends h.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f12190g = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f12191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f12192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f12193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f12194f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(S3.g db2) throws IOException {
            AbstractC5504s.h(db2, "db");
            Cursor cursorV1 = db2.v1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (cursorV1.moveToFirst()) {
                    if (cursorV1.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                fe.c.a(cursorV1, null);
                return z10;
            } finally {
            }
        }

        public final boolean b(S3.g db2) throws IOException {
            AbstractC5504s.h(db2, "db");
            Cursor cursorV1 = db2.v1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z10 = false;
                if (cursorV1.moveToFirst()) {
                    if (cursorV1.getInt(0) != 0) {
                        z10 = true;
                    }
                }
                fe.c.a(cursorV1, null);
                return z10;
            } finally {
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12195a;

        public b(int i10) {
            this.f12195a = i10;
        }

        public abstract void a(S3.g gVar);

        public abstract void b(S3.g gVar);

        public abstract void c(S3.g gVar);

        public abstract void d(S3.g gVar);

        public abstract void e(S3.g gVar);

        public abstract void f(S3.g gVar);

        public abstract c g(S3.g gVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f12196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12197b;

        public c(boolean z10, String str) {
            this.f12196a = z10;
            this.f12197b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f configuration, b delegate, String identityHash, String legacyHash) {
        super(delegate.f12195a);
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(identityHash, "identityHash");
        AbstractC5504s.h(legacyHash, "legacyHash");
        this.f12191c = configuration;
        this.f12192d = delegate;
        this.f12193e = identityHash;
        this.f12194f = legacyHash;
    }

    private final void h(S3.g gVar) throws IOException {
        if (!f12190g.b(gVar)) {
            c cVarG = this.f12192d.g(gVar);
            if (cVarG.f12196a) {
                this.f12192d.e(gVar);
                j(gVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.f12197b);
            }
        }
        Cursor cursorE1 = gVar.E1(new S3.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorE1.moveToFirst() ? cursorE1.getString(0) : null;
            fe.c.a(cursorE1, null);
            if (AbstractC5504s.c(this.f12193e, string) || AbstractC5504s.c(this.f12194f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f12193e + ", found: " + string);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                fe.c.a(cursorE1, th2);
                throw th3;
            }
        }
    }

    private final void i(S3.g gVar) {
        gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(S3.g gVar) {
        i(gVar);
        gVar.T(r.a(this.f12193e));
    }

    @Override // S3.h.a
    public void b(S3.g db2) {
        AbstractC5504s.h(db2, "db");
        super.b(db2);
    }

    @Override // S3.h.a
    public void d(S3.g db2) throws IOException {
        AbstractC5504s.h(db2, "db");
        boolean zA = f12190g.a(db2);
        this.f12192d.a(db2);
        if (!zA) {
            c cVarG = this.f12192d.g(db2);
            if (!cVarG.f12196a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarG.f12197b);
            }
        }
        j(db2);
        this.f12192d.c(db2);
    }

    @Override // S3.h.a
    public void e(S3.g db2, int i10, int i11) {
        AbstractC5504s.h(db2, "db");
        g(db2, i10, i11);
    }

    @Override // S3.h.a
    public void f(S3.g db2) throws IOException {
        AbstractC5504s.h(db2, "db");
        super.f(db2);
        h(db2);
        this.f12192d.d(db2);
        this.f12191c = null;
    }

    @Override // S3.h.a
    public void g(S3.g db2, int i10, int i11) {
        List listD;
        AbstractC5504s.h(db2, "db");
        f fVar = this.f12191c;
        if (fVar == null || (listD = fVar.f12118d.d(i10, i11)) == null) {
            f fVar2 = this.f12191c;
            if (fVar2 != null && !fVar2.a(i10, i11)) {
                this.f12192d.b(db2);
                this.f12192d.a(db2);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f12192d.f(db2);
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            ((N3.b) it.next()).a(db2);
        }
        c cVarG = this.f12192d.g(db2);
        if (cVarG.f12196a) {
            this.f12192d.e(db2);
            j(db2);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + cVarG.f12197b);
        }
    }
}
