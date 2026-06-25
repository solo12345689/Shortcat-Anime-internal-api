package S3;

import Df.r;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface h extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0272a f15914b = new C0272a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15915a;

        /* JADX INFO: renamed from: S3.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0272a {
            public /* synthetic */ C0272a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0272a() {
            }
        }

        public a(int i10) {
            this.f15915a = i10;
        }

        private final void a(String str) {
            if (r.B(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = AbstractC5504s.i(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                S3.b.a(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(g db2) {
            AbstractC5504s.h(db2, "db");
        }

        public void c(g db2) {
            AbstractC5504s.h(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String strH0 = db2.H0();
                if (strH0 != null) {
                    a(strH0);
                    return;
                }
                return;
            }
            List listR = null;
            try {
                try {
                    listR = db2.R();
                } finally {
                    if (listR != null) {
                        Iterator it = listR.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            AbstractC5504s.g(obj, "p.second");
                            a((String) obj);
                        }
                    } else {
                        String strH02 = db2.H0();
                        if (strH02 != null) {
                            a(strH02);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db2.close();
            } catch (IOException unused2) {
            }
            if (listR != null) {
                return;
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i10, int i11);

        public void f(g db2) {
            AbstractC5504s.h(db2, "db");
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0273b f15916f = new C0273b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f15917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f15919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f15920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f15921e;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Context f15922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f15923b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private a f15924c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f15925d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f15926e;

            public a(Context context) {
                AbstractC5504s.h(context, "context");
                this.f15922a = context;
            }

            public a a(boolean z10) {
                this.f15926e = z10;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f15924c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f15925d && ((str = this.f15923b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f15922a, this.f15923b, aVar, this.f15925d, this.f15926e);
            }

            public a c(a callback) {
                AbstractC5504s.h(callback, "callback");
                this.f15924c = callback;
                return this;
            }

            public a d(String str) {
                this.f15923b = str;
                return this;
            }

            public a e(boolean z10) {
                this.f15925d = z10;
                return this;
            }
        }

        /* JADX INFO: renamed from: S3.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0273b {
            public /* synthetic */ C0273b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                AbstractC5504s.h(context, "context");
                return new a(context);
            }

            private C0273b() {
            }
        }

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(callback, "callback");
            this.f15917a = context;
            this.f15918b = str;
            this.f15919c = callback;
            this.f15920d = z10;
            this.f15921e = z11;
        }

        public static final a a(Context context) {
            return f15916f.a(context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        h a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    g getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);
}
