package com.revenuecat.purchases.common;

import G1.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/DefaultLocaleProvider;", "Lcom/revenuecat/purchases/common/LocaleProvider;", "<init>", "()V", "", "localeString", "LTd/L;", "setPreferredLocaleOverride", "(Ljava/lang/String;)V", "preferredLocaleOverride", "Ljava/lang/String;", "getCurrentLocalesLanguageTags", "()Ljava/lang/String;", "currentLocalesLanguageTags", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultLocaleProvider implements LocaleProvider {
    private String preferredLocaleOverride;

    @Override // com.revenuecat.purchases.common.LocaleProvider
    public String getCurrentLocalesLanguageTags() {
        String str = this.preferredLocaleOverride;
        if (str != null) {
            String strH = i.d().h();
            AbstractC5504s.g(strH, "getDefault().toLanguageTags()");
            if (strH.length() != 0) {
                str = str + ',' + strH;
            }
            if (str != null) {
                return str;
            }
        }
        String strH2 = i.d().h();
        AbstractC5504s.g(strH2, "getDefault().toLanguageTags()");
        return strH2;
    }

    public final void setPreferredLocaleOverride(String localeString) {
        this.preferredLocaleOverride = localeString;
    }
}
