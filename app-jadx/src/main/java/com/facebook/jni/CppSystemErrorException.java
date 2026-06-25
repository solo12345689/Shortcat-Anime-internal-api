package com.facebook.jni;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class CppSystemErrorException extends CppException {
    int errorCode;

    public CppSystemErrorException(String str, int i10) {
        super(str);
        this.errorCode = i10;
    }

    public int getErrorCode() {
        return this.errorCode;
    }
}
