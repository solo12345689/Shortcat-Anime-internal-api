package M3;

import Td.L;
import Ud.AbstractC2279u;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements S3.h, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S3.h f12087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M3.c f12088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f12089c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements S3.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final M3.c f12090a;

        /* JADX INFO: renamed from: M3.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0183a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0183a f12091a = new C0183a();

            C0183a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(S3.g obj) {
                AbstractC5504s.h(obj, "obj");
                return obj.R();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f12092a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f12092a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(S3.g db2) {
                AbstractC5504s.h(db2, "db");
                db2.T(this.f12092a);
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f12093a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object[] f12094b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f12093a = str;
                this.f12094b = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(S3.g db2) {
                AbstractC5504s.h(db2, "db");
                db2.m0(this.f12093a, this.f12094b);
                return null;
            }
        }

        /* JADX INFO: renamed from: M3.d$a$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        /* synthetic */ class C0184d extends AbstractC5502p implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0184d f12095a = new C0184d();

            C0184d() {
                super(1, S3.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(S3.g p02) {
                AbstractC5504s.h(p02, "p0");
                return Boolean.valueOf(p02.L1());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class e extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f12096a = new e();

            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(S3.g db2) {
                AbstractC5504s.h(db2, "db");
                return Boolean.valueOf(db2.R1());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class f extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f12097a = new f();

            f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(S3.g obj) {
                AbstractC5504s.h(obj, "obj");
                return obj.H0();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class g extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f12098a = new g();

            g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(S3.g it) {
                AbstractC5504s.h(it, "it");
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class h extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f12099a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f12100b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContentValues f12101c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f12102d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object[] f12103e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f12099a = str;
                this.f12100b = i10;
                this.f12101c = contentValues;
                this.f12102d = str2;
                this.f12103e = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(S3.g db2) {
                AbstractC5504s.h(db2, "db");
                return Integer.valueOf(db2.n1(this.f12099a, this.f12100b, this.f12101c, this.f12102d, this.f12103e));
            }
        }

        public a(M3.c autoCloser) {
            AbstractC5504s.h(autoCloser, "autoCloser");
            this.f12090a = autoCloser;
        }

        @Override // S3.g
        public Cursor E1(S3.j query) {
            AbstractC5504s.h(query, "query");
            try {
                return new c(this.f12090a.j().E1(query), this.f12090a);
            } catch (Throwable th2) {
                this.f12090a.e();
                throw th2;
            }
        }

        @Override // S3.g
        public String H0() {
            return (String) this.f12090a.g(f.f12097a);
        }

        @Override // S3.g
        public boolean L1() {
            if (this.f12090a.h() == null) {
                return false;
            }
            return ((Boolean) this.f12090a.g(C0184d.f12095a)).booleanValue();
        }

        @Override // S3.g
        public void M() {
            try {
                this.f12090a.j().M();
            } catch (Throwable th2) {
                this.f12090a.e();
                throw th2;
            }
        }

        @Override // S3.g
        public List R() {
            return (List) this.f12090a.g(C0183a.f12091a);
        }

        @Override // S3.g
        public boolean R1() {
            return ((Boolean) this.f12090a.g(e.f12096a)).booleanValue();
        }

        @Override // S3.g
        public void T(String sql) {
            AbstractC5504s.h(sql, "sql");
            this.f12090a.g(new b(sql));
        }

        public final void a() {
            this.f12090a.g(g.f12098a);
        }

        @Override // S3.g
        public S3.k c1(String sql) {
            AbstractC5504s.h(sql, "sql");
            return new b(sql, this.f12090a);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f12090a.d();
        }

        @Override // S3.g
        public boolean isOpen() {
            S3.g gVarH = this.f12090a.h();
            if (gVarH == null) {
                return false;
            }
            return gVarH.isOpen();
        }

        @Override // S3.g
        public void l0() {
            L l10;
            S3.g gVarH = this.f12090a.h();
            if (gVarH != null) {
                gVarH.l0();
                l10 = L.f17438a;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // S3.g
        public void m0(String sql, Object[] bindArgs) {
            AbstractC5504s.h(sql, "sql");
            AbstractC5504s.h(bindArgs, "bindArgs");
            this.f12090a.g(new c(sql, bindArgs));
        }

        @Override // S3.g
        public void n0() {
            try {
                this.f12090a.j().n0();
            } catch (Throwable th2) {
                this.f12090a.e();
                throw th2;
            }
        }

        @Override // S3.g
        public int n1(String table, int i10, ContentValues values, String str, Object[] objArr) {
            AbstractC5504s.h(table, "table");
            AbstractC5504s.h(values, "values");
            return ((Number) this.f12090a.g(new h(table, i10, values, str, objArr))).intValue();
        }

        @Override // S3.g
        public Cursor o0(S3.j query, CancellationSignal cancellationSignal) {
            AbstractC5504s.h(query, "query");
            try {
                return new c(this.f12090a.j().o0(query, cancellationSignal), this.f12090a);
            } catch (Throwable th2) {
                this.f12090a.e();
                throw th2;
            }
        }

        @Override // S3.g
        public void v0() {
            if (this.f12090a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                S3.g gVarH = this.f12090a.h();
                AbstractC5504s.e(gVarH);
                gVarH.v0();
            } finally {
                this.f12090a.e();
            }
        }

        @Override // S3.g
        public Cursor v1(String query) {
            AbstractC5504s.h(query, "query");
            try {
                return new c(this.f12090a.j().v1(query), this.f12090a);
            } catch (Throwable th2) {
                this.f12090a.e();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements Cursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Cursor f12111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final M3.c f12112b;

        public c(Cursor delegate, M3.c autoCloser) {
            AbstractC5504s.h(delegate, "delegate");
            AbstractC5504s.h(autoCloser, "autoCloser");
            this.f12111a = delegate;
            this.f12112b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f12111a.close();
            this.f12112b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f12111a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f12111a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f12111a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f12111a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f12111a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f12111a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f12111a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f12111a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f12111a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f12111a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f12111a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f12111a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f12111a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f12111a.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return S3.c.a(this.f12111a);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return S3.f.a(this.f12111a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f12111a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f12111a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f12111a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f12111a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f12111a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f12111a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f12111a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f12111a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f12111a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f12111a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f12111a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f12111a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f12111a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f12111a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f12111a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f12111a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f12111a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f12111a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f12111a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f12111a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f12111a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            AbstractC5504s.h(extras, "extras");
            S3.e.a(this.f12111a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f12111a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            AbstractC5504s.h(cr, "cr");
            AbstractC5504s.h(uris, "uris");
            S3.f.b(this.f12111a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f12111a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f12111a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public d(S3.h delegate, M3.c autoCloser) {
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(autoCloser, "autoCloser");
        this.f12087a = delegate;
        this.f12088b = autoCloser;
        autoCloser.k(a());
        this.f12089c = new a(autoCloser);
    }

    @Override // M3.g
    public S3.h a() {
        return this.f12087a;
    }

    @Override // S3.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12089c.close();
    }

    @Override // S3.h
    public String getDatabaseName() {
        return this.f12087a.getDatabaseName();
    }

    @Override // S3.h
    public S3.g getWritableDatabase() {
        this.f12089c.a();
        return this.f12089c;
    }

    @Override // S3.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f12087a.setWriteAheadLoggingEnabled(z10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements S3.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final M3.c f12105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f12106c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f12107a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(S3.k obj) {
                AbstractC5504s.h(obj, "obj");
                return Long.valueOf(obj.T0());
            }
        }

        /* JADX INFO: renamed from: M3.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0185b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f12109b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0185b(Function1 function1) {
                super(1);
                this.f12109b = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(S3.g db2) {
                AbstractC5504s.h(db2, "db");
                S3.k kVarC1 = db2.c1(b.this.f12104a);
                b.this.g(kVarC1);
                return this.f12109b.invoke(kVarC1);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f12110a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(S3.k obj) {
                AbstractC5504s.h(obj, "obj");
                return Integer.valueOf(obj.Z());
            }
        }

        public b(String sql, M3.c autoCloser) {
            AbstractC5504s.h(sql, "sql");
            AbstractC5504s.h(autoCloser, "autoCloser");
            this.f12104a = sql;
            this.f12105b = autoCloser;
            this.f12106c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(S3.k kVar) {
            Iterator it = this.f12106c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC2279u.w();
                }
                Object obj = this.f12106c.get(i10);
                if (obj == null) {
                    kVar.I1(i11);
                } else if (obj instanceof Long) {
                    kVar.m1(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.b0(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.Z0(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.p1(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final Object h(Function1 function1) {
            return this.f12105b.g(new C0185b(function1));
        }

        private final void j(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f12106c.size() && (size = this.f12106c.size()) <= i11) {
                while (true) {
                    this.f12106c.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f12106c.set(i11, obj);
        }

        @Override // S3.i
        public void I1(int i10) {
            j(i10, null);
        }

        @Override // S3.k
        public long T0() {
            return ((Number) h(a.f12107a)).longValue();
        }

        @Override // S3.k
        public int Z() {
            return ((Number) h(c.f12110a)).intValue();
        }

        @Override // S3.i
        public void Z0(int i10, String value) {
            AbstractC5504s.h(value, "value");
            j(i10, value);
        }

        @Override // S3.i
        public void b0(int i10, double d10) {
            j(i10, Double.valueOf(d10));
        }

        @Override // S3.i
        public void m1(int i10, long j10) {
            j(i10, Long.valueOf(j10));
        }

        @Override // S3.i
        public void p1(int i10, byte[] value) {
            AbstractC5504s.h(value, "value");
            j(i10, value);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
