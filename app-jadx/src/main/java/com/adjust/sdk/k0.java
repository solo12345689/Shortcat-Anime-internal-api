package com.adjust.sdk;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class k0 {

    /* JADX INFO: renamed from: a */
    public final ActivityHandler f34146a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f34147b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public int f34148c = 0;

    public k0(ActivityHandler activityHandler) {
        this.f34146a = activityHandler;
    }

    public final void a(Runnable runnable, String str) {
        if (this.f34148c != 3) {
            runnable.run();
            return;
        }
        this.f34146a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
        this.f34147b.add(runnable);
    }

    public final void b(String str, IRunActivityHandler iRunActivityHandler) {
        if (this.f34148c != 3) {
            iRunActivityHandler.run(this.f34146a);
            return;
        }
        this.f34146a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
        this.f34146a.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
    }
}
