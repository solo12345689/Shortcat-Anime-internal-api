package Ih;

import rh.AbstractC6326b;
import rh.AbstractC6329d;
import zg.AbstractC7388C;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static byte[] a(Cg.b bVar) {
        try {
            return bVar.i("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(Kg.a aVar, AbstractC7388C abstractC7388C) {
        if (!aVar.a()) {
            throw new IllegalArgumentException("public key found");
        }
        try {
            return a(AbstractC6326b.a(aVar, abstractC7388C));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] c(Dg.b bVar) {
        try {
            return bVar.i("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] d(Kg.a aVar) {
        if (aVar.a()) {
            throw new IllegalArgumentException("private key found");
        }
        try {
            return c(AbstractC6329d.a(aVar));
        } catch (Exception unused) {
            return null;
        }
    }
}
