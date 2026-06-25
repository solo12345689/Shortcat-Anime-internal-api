package Jh;

import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
abstract class e {
    static C7427t a(String str) {
        if (str.equals("SHA-256")) {
            return Bg.a.f1958c;
        }
        if (str.equals("SHA-512")) {
            return Bg.a.f1962e;
        }
        if (str.equals("SHAKE128")) {
            return Bg.a.f1978m;
        }
        if (str.equals("SHAKE256")) {
            return Bg.a.f1980n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
