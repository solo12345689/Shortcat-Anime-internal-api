package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static z f24554d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f24556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24557c = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f24558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f24559b;

        a() {
        }
    }

    z(Context context, LocationManager locationManager) {
        this.f24555a = context;
        this.f24556b = locationManager;
    }

    static z a(Context context) {
        if (f24554d == null) {
            Context applicationContext = context.getApplicationContext();
            f24554d = new z(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f24554d;
    }

    private Location b() {
        Location locationC = y1.f.b(this.f24555a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = y1.f.b(this.f24555a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f24556b.isProviderEnabled(str)) {
                return this.f24556b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f24557c.f24559b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f24557c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        y yVarB = y.b();
        yVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        yVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = yVarB.f24553c == 1;
        long j11 = yVarB.f24552b;
        long j12 = yVarB.f24551a;
        yVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = yVarB.f24552b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + 60000;
        }
        aVar.f24558a = z10;
        aVar.f24559b = j10;
    }

    boolean d() {
        a aVar = this.f24557c;
        if (e()) {
            return aVar.f24558a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f24558a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
