package m4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.AbstractC5504s;
import p4.InterfaceC5931b;

/* JADX INFO: renamed from: m4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5640a extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5640a(Context context, InterfaceC5931b taskExecutor) {
        super(context, taskExecutor);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(taskExecutor, "taskExecutor");
    }

    private final boolean m(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // m4.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // m4.e
    public void k(Intent intent) {
        AbstractC5504s.h(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        i4.i.e().a(b.f53188a, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    g(Boolean.FALSE);
                    break;
                }
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    g(Boolean.FALSE);
                    break;
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    g(Boolean.TRUE);
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    g(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    @Override // m4.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        Intent intentRegisterReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(m(intentRegisterReceiver));
        }
        i4.i.e().c(b.f53188a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
