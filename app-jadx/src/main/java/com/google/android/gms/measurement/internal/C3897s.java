package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3897s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f41581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3911u f41582c;

    public C3897s(C3911u c3911u, String str) {
        Objects.requireNonNull(c3911u);
        this.f41582c = c3911u;
        AbstractC2115p.f(str);
        this.f41580a = str;
        this.f41581b = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f41582c.u0().query("raw_events", new String[]{"rowid", "name", DiagnosticsEntry.TIMESTAMP_KEY, "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f41580a, String.valueOf(this.f41581b)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j10 > this.f41581b) {
                            this.f41581b = j10;
                        }
                        try {
                            com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) u6.W(com.google.android.gms.internal.measurement.S2.M(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            r22.G(string);
                            r22.J(cursorQuery.getLong(2));
                            arrayList.add(new r(j10, j11, z10, (com.google.android.gms.internal.measurement.S2) r22.q()));
                        } catch (IOException e10) {
                            this.f41582c.f40611a.a().o().c("Data loss. Failed to merge raw event. appId", C3887q2.x(this.f41580a), e10);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e11) {
                this.f41582c.f40611a.a().o().c("Data loss. Error querying raw events batch. appId", C3887q2.x(this.f41580a), e11);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public C3897s(C3911u c3911u, String str, long j10) {
        Objects.requireNonNull(c3911u);
        this.f41582c = c3911u;
        AbstractC2115p.f(str);
        this.f41580a = str;
        this.f41581b = c3911u.b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
