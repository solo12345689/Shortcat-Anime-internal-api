package com.adjust.sdk;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class GlobalParameters {
    Map<String, String> callbackParameters;
    Map<String, String> partnerParameters;

    public GlobalParameters deepCopy() {
        GlobalParameters globalParameters = new GlobalParameters();
        if (this.callbackParameters != null) {
            globalParameters.callbackParameters = new HashMap(this.callbackParameters);
        }
        if (this.partnerParameters != null) {
            globalParameters.partnerParameters = new HashMap(this.partnerParameters);
        }
        return globalParameters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalParameters globalParameters = (GlobalParameters) obj;
        return Util.equalObject(this.callbackParameters, globalParameters.callbackParameters) && Util.equalObject(this.partnerParameters, globalParameters.partnerParameters);
    }

    public int hashCode() {
        return Util.hashObject(this.partnerParameters, Util.hashObject(this.callbackParameters, 17));
    }
}
