package com.amazon.a.a.o.c;

import com.amazon.a.a.o.c;
import com.amazon.a.a.o.c.a.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f34704a = new c("Serializer");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class[] f34705b = {com.amazon.a.a.b.c.class, String.class, HashMap.class, LinkedHashMap.class};

    public static String a(Serializable serializable) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        if (serializable == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        } catch (IOException e10) {
            e = e10;
            objectOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            com.amazon.a.a.o.a.a(objectOutputStream2);
            throw th;
        }
        try {
            try {
                objectOutputStream.writeObject(serializable);
                String strA = com.amazon.c.a.a.c.a(byteArrayOutputStream.toByteArray());
                com.amazon.a.a.o.a.a(objectOutputStream);
                return strA;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream2 = objectOutputStream;
                com.amazon.a.a.o.a.a(objectOutputStream2);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            if (c.f34700b) {
                f34704a.b("Could not serialize object: " + serializable, e);
            }
            com.amazon.a.a.o.a.a(objectOutputStream);
            return null;
        }
    }

    public static <T> T a(String str) throws Throwable {
        f fVar;
        f fVar2 = null;
        if (str != null && str.length() != 0) {
            try {
                try {
                    fVar = new f(new ByteArrayInputStream(com.amazon.c.a.a.c.c(str.getBytes())));
                } catch (Exception e10) {
                    e = e10;
                    fVar = null;
                } catch (Throwable th2) {
                    th = th2;
                    com.amazon.a.a.o.a.a(fVar2);
                    throw th;
                }
                try {
                    try {
                        fVar.a(f34705b);
                        T t10 = (T) fVar.readObject();
                        com.amazon.a.a.o.a.a(fVar);
                        return t10;
                    } catch (Throwable th3) {
                        th = th3;
                        fVar2 = fVar;
                        com.amazon.a.a.o.a.a(fVar2);
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    if (c.f34700b) {
                        f34704a.b("Could not read object from string: " + str, e);
                    }
                    com.amazon.a.a.o.a.a(fVar);
                    return null;
                }
            } catch (IOException e12) {
                if (c.f34700b) {
                    f34704a.b("Could not decode string", e12);
                }
            }
        }
        return null;
    }
}
