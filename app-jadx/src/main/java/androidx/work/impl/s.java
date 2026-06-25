package androidx.work.impl;

import android.content.Context;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends N3.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f32908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context mContext, int i10, int i11) {
        super(i10, i11);
        AbstractC5504s.h(mContext, "mContext");
        this.f32908c = mContext;
    }

    @Override // N3.b
    public void a(S3.g db2) {
        AbstractC5504s.h(db2, "db");
        if (this.f12666b >= 10) {
            db2.m0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f32908c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
