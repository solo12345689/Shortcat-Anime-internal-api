package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context) {
        AbstractC5504s.h(context, "context");
        MeasurementManager measurementManager = MeasurementManager.get(context);
        AbstractC5504s.g(measurementManager, "get(context)");
        super(measurementManager);
    }
}
