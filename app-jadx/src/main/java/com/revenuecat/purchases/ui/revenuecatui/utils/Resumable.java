package com.revenuecat.purchases.ui.revenuecatui.utils;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/utils/Resumable;", "", "", "shouldResume", "LTd/L;", "resume", "(Z)V", "invoke", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Resumable {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void invoke(Resumable resumable, boolean z10) {
            resumable.resume(z10);
        }

        public static /* synthetic */ void invoke$default(Resumable resumable, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            resumable.invoke(z10);
        }
    }

    void invoke(boolean shouldResume);

    void resume(boolean shouldResume);
}
