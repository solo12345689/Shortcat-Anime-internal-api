package wd;

import android.content.Context;
import expo.modules.updates.db.UpdatesDatabase;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rd.C6306a;
import wd.g;
import wd.w;
import xd.C7136g;

/* JADX INFO: renamed from: wd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6963a extends i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0947a f62953w = new C0947a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final expo.modules.updates.d f62954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final j f62955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f62956v;

    /* JADX INFO: renamed from: wd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0947a {
        public /* synthetic */ C0947a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0947a() {
        }
    }

    public /* synthetic */ C6963a(Context context, expo.modules.updates.d dVar, C7136g c7136g, UpdatesDatabase updatesDatabase, File file, j jVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, c7136g, updatesDatabase, file, jVar, (i10 & 64) != 0 ? false : z10);
    }

    @Override // wd.i
    protected Object l(C6306a c6306a, File file, expo.modules.updates.d dVar, rd.d dVar2, rd.d dVar3, Zd.e eVar) {
        if (!this.f62956v) {
            c6306a.u(new Date());
            c6306a.F(Dd.a.f3689a.a(c6306a));
            return new g.a(c6306a, true);
        }
        String strC = expo.modules.updates.g.f46458a.c(c6306a);
        File file2 = new File(file, strC);
        if (this.f62955u.d(h(), file, strC)) {
            c6306a.F(strC);
            return new g.a(c6306a, false);
        }
        try {
            c6306a.y(this.f62955u.a(c6306a, file2, h()));
            c6306a.u(new Date());
            c6306a.F(strC);
            return new g.a(c6306a, true);
        } catch (FileNotFoundException unused) {
            throw new AssertionError("APK bundle must contain the expected embedded asset " + (c6306a.b() != null ? c6306a.b() : c6306a.n()));
        }
    }

    @Override // wd.i
    protected Object m(UpdatesDatabase updatesDatabase, expo.modules.updates.d dVar, Zd.e eVar) throws Exception {
        yd.q qVarE = this.f62955u.e(h(), this.f62954t);
        if (qVarE != null) {
            return new v(null, new w.b(qVarE), null);
        }
        throw new Exception("Embedded manifest is null");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6963a(Context context, expo.modules.updates.d configuration, C7136g logger, UpdatesDatabase database, File updatesDirectory, j loaderFiles, boolean z10) {
        super(context, configuration, logger, database, updatesDirectory, loaderFiles, null, 64, null);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(updatesDirectory, "updatesDirectory");
        AbstractC5504s.h(loaderFiles, "loaderFiles");
        this.f62954t = configuration;
        this.f62955u = loaderFiles;
        this.f62956v = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6963a(Context context, expo.modules.updates.d configuration, C7136g logger, UpdatesDatabase database, File updatesDirectory) {
        this(context, configuration, logger, database, updatesDirectory, new j(), false, 64, null);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(updatesDirectory, "updatesDirectory");
    }
}
