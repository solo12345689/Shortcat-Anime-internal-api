package com.adjust.sdk.meta;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.ILogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class MetaReferrerClient {
    private static final String COLUMN_ACTUAL_TIMESTAMP = "actual_timestamp";
    private static final String COLUMN_INSTALL_REFERRER = "install_referrer";
    private static final String COLUMN_IS_CT = "is_ct";
    private static final String FACEBOOK_REFERRER_PROVIDER_AUTHORITY = "com.facebook.katana.provider.InstallReferrerProvider";
    private static final String FBLITE_REFERRER_PROVIDER_AUTHORITY = "com.facebook.lite.provider.InstallReferrerProvider";
    private static final String INSTAGRAM_REFERRER_PROVIDER_AUTHORITY = "com.instagram.contentprovider.InstallReferrerProvider";
    private static final AtomicBoolean shouldTryToRead = new AtomicBoolean(true);

    public static MetaInstallReferrerResult getMetaInstallReferrer(Context context, String str, ILogger iLogger, boolean z10) {
        String str2;
        Uri uri;
        if (z10 && !shouldTryToRead.get()) {
            iLogger.debug("Shouldn't try to read Meta Install referrer", new Object[0]);
            return new MetaInstallReferrerResult("Shouldn't try to read Meta Install referrer");
        }
        if (TextUtils.isEmpty(str)) {
            iLogger.debug("Can't read Meta Install referrer with null or empty FBAppId", new Object[0]);
            return new MetaInstallReferrerResult("Can't read Meta Install referrer with null or empty FBAppId");
        }
        Cursor cursorQuery = null;
        try {
            try {
                if (resolveContentProvider(context, FACEBOOK_REFERRER_PROVIDER_AUTHORITY)) {
                    uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str);
                } else if (resolveContentProvider(context, INSTAGRAM_REFERRER_PROVIDER_AUTHORITY)) {
                    uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str);
                } else {
                    if (!resolveContentProvider(context, FBLITE_REFERRER_PROVIDER_AUTHORITY)) {
                        iLogger.debug("Failed to find Meta Install Referrer content provider", new Object[0]);
                        return new MetaInstallReferrerResult("Failed to find Meta Install Referrer content provider");
                    }
                    uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str);
                }
                cursorQuery = context.getContentResolver().query(uri, new String[]{"install_referrer", COLUMN_IS_CT, COLUMN_ACTUAL_TIMESTAMP}, null, null, null);
            } catch (Exception e10) {
                str2 = "Meta Install Referrer error " + e10.getMessage();
                iLogger.debug(str2, new Object[0]);
                if (0 != 0) {
                }
                return new MetaInstallReferrerResult(str2);
            }
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                int columnIndex2 = cursorQuery.getColumnIndex(COLUMN_ACTUAL_TIMESTAMP);
                int columnIndex3 = cursorQuery.getColumnIndex(COLUMN_IS_CT);
                String string = cursorQuery.getString(columnIndex);
                long j10 = cursorQuery.getLong(columnIndex2);
                int i10 = cursorQuery.getInt(columnIndex3);
                boolean z11 = true;
                if (i10 != 1) {
                    z11 = false;
                }
                iLogger.debug("InstallReferrerMeta reads installReferrer[%s] actualTimestampInSec[%d] isClick[%b]", string, Long.valueOf(j10), Boolean.valueOf(z11));
                if (isValidReferrer(string)) {
                    shouldTryToRead.set(false);
                    MetaInstallReferrerResult metaInstallReferrerResult = new MetaInstallReferrerResult(new MetaInstallReferrerDetails(string, j10, z11));
                    cursorQuery.close();
                    return metaInstallReferrerResult;
                }
                str2 = "Invalid Meta Install Referrer";
                iLogger.debug("Invalid Meta Install Referrer", new Object[0]);
                cursorQuery.close();
                return new MetaInstallReferrerResult(str2);
            }
            String string2 = com.adjust.sdk.Util.formatString("Fail to read Meta Install Referrer for FB AppId [%s]", str);
            iLogger.debug(string2, new Object[0]);
            MetaInstallReferrerResult metaInstallReferrerResult2 = new MetaInstallReferrerResult(string2);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return metaInstallReferrerResult2;
        } finally {
        }
    }

    private static boolean isValidReferrer(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    private static boolean resolveContentProvider(Context context, String str) {
        return context.getPackageManager().resolveContentProvider(str, 0) != null;
    }
}
