package T3;

import S3.k;
import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends g implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f17148b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement delegate) {
        super(delegate);
        AbstractC5504s.h(delegate, "delegate");
        this.f17148b = delegate;
    }

    @Override // S3.k
    public long T0() {
        return this.f17148b.executeInsert();
    }

    @Override // S3.k
    public int Z() {
        return this.f17148b.executeUpdateDelete();
    }
}
