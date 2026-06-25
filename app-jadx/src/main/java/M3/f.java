package M3;

import M3.q;
import S3.h;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a */
    public final Context f12115a;

    /* JADX INFO: renamed from: b */
    public final String f12116b;

    /* JADX INFO: renamed from: c */
    public final h.c f12117c;

    /* JADX INFO: renamed from: d */
    public final q.e f12118d;

    /* JADX INFO: renamed from: e */
    public final List f12119e;

    /* JADX INFO: renamed from: f */
    public final boolean f12120f;

    /* JADX INFO: renamed from: g */
    public final q.d f12121g;

    /* JADX INFO: renamed from: h */
    public final Executor f12122h;

    /* JADX INFO: renamed from: i */
    public final Executor f12123i;

    /* JADX INFO: renamed from: j */
    public final Intent f12124j;

    /* JADX INFO: renamed from: k */
    public final boolean f12125k;

    /* JADX INFO: renamed from: l */
    public final boolean f12126l;

    /* JADX INFO: renamed from: m */
    private final Set f12127m;

    /* JADX INFO: renamed from: n */
    public final String f12128n;

    /* JADX INFO: renamed from: o */
    public final File f12129o;

    /* JADX INFO: renamed from: p */
    public final Callable f12130p;

    /* JADX INFO: renamed from: q */
    public final List f12131q;

    /* JADX INFO: renamed from: r */
    public final List f12132r;

    /* JADX INFO: renamed from: s */
    public final boolean f12133s;

    public f(Context context, String str, h.c sqliteOpenHelperFactory, q.e migrationContainer, List list, boolean z10, q.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, q.f fVar, List typeConverters, List autoMigrationSpecs) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        AbstractC5504s.h(migrationContainer, "migrationContainer");
        AbstractC5504s.h(journalMode, "journalMode");
        AbstractC5504s.h(queryExecutor, "queryExecutor");
        AbstractC5504s.h(transactionExecutor, "transactionExecutor");
        AbstractC5504s.h(typeConverters, "typeConverters");
        AbstractC5504s.h(autoMigrationSpecs, "autoMigrationSpecs");
        this.f12115a = context;
        this.f12116b = str;
        this.f12117c = sqliteOpenHelperFactory;
        this.f12118d = migrationContainer;
        this.f12119e = list;
        this.f12120f = z10;
        this.f12121g = journalMode;
        this.f12122h = queryExecutor;
        this.f12123i = transactionExecutor;
        this.f12124j = intent;
        this.f12125k = z11;
        this.f12126l = z12;
        this.f12127m = set;
        this.f12128n = str2;
        this.f12129o = file;
        this.f12130p = callable;
        this.f12131q = typeConverters;
        this.f12132r = autoMigrationSpecs;
        this.f12133s = intent != null;
    }

    public boolean a(int i10, int i11) {
        Set set;
        return (i10 <= i11 || !this.f12126l) && this.f12125k && ((set = this.f12127m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
