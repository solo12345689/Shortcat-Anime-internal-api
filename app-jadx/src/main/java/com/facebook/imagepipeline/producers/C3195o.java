package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import w5.C6944a;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3195o extends L {
    public C3195o(B5.i iVar) {
        super(C6944a.b(), iVar);
    }

    static byte[] g(String str) {
        y5.k.b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int iIndexOf = str.indexOf(44);
        String strSubstring = str.substring(iIndexOf + 1, str.length());
        if (h(str.substring(0, iIndexOf))) {
            return Base64.decode(strSubstring, 0);
        }
        String strDecode = Uri.decode(strSubstring);
        y5.k.g(strDecode);
        return strDecode.getBytes();
    }

    static boolean h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        return str.split(";")[r2.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected E6.k d(K6.b bVar) {
        byte[] bArrG = g(bVar.v().toString());
        return c(new ByteArrayInputStream(bArrG), bArrG.length);
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "DataFetchProducer";
    }
}
