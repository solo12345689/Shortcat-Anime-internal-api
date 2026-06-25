package com.reactnativegooglesignin;

import Df.p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43992b;

    public a(Exception e10, String str) {
        String strA;
        AbstractC5504s.h(e10, "e");
        String localizedMessage = e10.getLocalizedMessage();
        localizedMessage = localizedMessage == null ? e10.getMessage() : localizedMessage;
        if (!(e10 instanceof P8.b)) {
            if (!(e10 instanceof P8.l)) {
                this.f43991a = str;
                this.f43992b = localizedMessage;
                return;
            }
            this.f43991a = str;
            this.f43992b = localizedMessage + " Make sure you have the latest version of Google Play Services installed.";
            return;
        }
        P8.b bVar = (P8.b) e10;
        int iB = bVar.b();
        if (localizedMessage == null || localizedMessage.length() <= 10 || localizedMessage == null) {
            strA = J8.c.a(iB);
            AbstractC5504s.g(strA, "getStatusCodeString(...)");
        } else {
            strA = new p(iB + ": ").k(localizedMessage, "");
        }
        this.f43991a = String.valueOf((iB == 12501 || bVar.a().i()) ? 12501 : iB);
        this.f43992b = strA;
    }

    public final String a() {
        return this.f43991a;
    }

    public final String b() {
        return this.f43992b;
    }
}
