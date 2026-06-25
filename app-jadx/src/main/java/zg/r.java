package zg;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r implements InterfaceC7400e, Oh.c {
    @Override // zg.InterfaceC7400e
    public abstract AbstractC7432y e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC7400e) {
            return e().u(((InterfaceC7400e) obj).e());
        }
        return false;
    }

    @Override // Oh.c
    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e().r(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return e().hashCode();
    }

    public byte[] i(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e().s(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
