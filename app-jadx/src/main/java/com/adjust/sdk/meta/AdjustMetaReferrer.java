package com.adjust.sdk.meta;

import android.content.Context;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AdjustMetaReferrer {
    static boolean shouldReadMetaReferrer = true;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AsyncTaskExecutor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ OnMetaInstallReferrerReadListener f34154c;

        a(Context context, String str, OnMetaInstallReferrerReadListener onMetaInstallReferrerReadListener) {
            this.f34152a = context;
            this.f34153b = str;
            this.f34154c = onMetaInstallReferrerReadListener;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MetaInstallReferrerResult doInBackground(Context[] contextArr) {
            try {
                return MetaReferrerClient.getMetaInstallReferrer(this.f34152a, this.f34153b, AdjustFactory.getLogger(), false);
            } catch (Exception e10) {
                return new MetaInstallReferrerResult(e10.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(MetaInstallReferrerResult metaInstallReferrerResult) {
            if (metaInstallReferrerResult == null) {
                this.f34154c.onFail("Meta Install Referrer result null");
                return;
            }
            MetaInstallReferrerDetails metaInstallReferrerDetails = metaInstallReferrerResult.metaInstallReferrerDetails;
            if (metaInstallReferrerDetails != null) {
                this.f34154c.onInstallReferrerDetailsRead(metaInstallReferrerDetails);
                return;
            }
            String str = metaInstallReferrerResult.error;
            if (str != null) {
                this.f34154c.onFail(str);
            } else {
                this.f34154c.onFail("Meta Install Referrer details null");
            }
        }
    }

    public static void doNotReadMetaReferrer() {
        shouldReadMetaReferrer = false;
    }

    public static void getMetaInstallReferrer(Context context, String str, OnMetaInstallReferrerReadListener onMetaInstallReferrerReadListener) {
        if (onMetaInstallReferrerReadListener == null) {
            AdjustFactory.getLogger().error("onMetaInstallReferrerReadListener can not be null", new Object[0]);
        } else {
            new a(context, str, onMetaInstallReferrerReadListener).execute(context);
        }
    }

    public static void readMetaReferrer(Context context) {
        shouldReadMetaReferrer = true;
    }
}
