package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC3428c0;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3821h2 extends AbstractC3428c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3829i2 f41337a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3821h2(C3829i2 c3829i2, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        Objects.requireNonNull(c3829i2);
        this.f41337a = c3829i2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            X2 x22 = this.f41337a.f40611a;
            x22.a().o().a("Opening the local database failed, dropping and recreating it");
            x22.w();
            if (!x22.d().getDatabasePath("google_app_measurement_local.db").delete()) {
                x22.a().o().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                this.f41337a.f40611a.a().o().b("Failed to open local database. Events will bypass local storage", e11);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC3918v.b(this.f41337a.f40611a.a(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        AbstractC3918v.a(this.f41337a.f40611a.a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", C3829i2.f41364e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
