package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.RequestId;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ProductDataResponseBuilder {
    private Map<String, Product> productData;
    private RequestId requestId;
    private ProductDataResponse.RequestStatus requestStatus;
    private Set<String> unavailableSkus;

    public ProductDataResponse build() {
        return new ProductDataResponse(this);
    }

    public Map<String, Product> getProductData() {
        return this.productData;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public ProductDataResponse.RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public Set<String> getUnavailableSkus() {
        return this.unavailableSkus;
    }

    public ProductDataResponseBuilder setProductData(Map<String, Product> map) {
        this.productData = map;
        return this;
    }

    public ProductDataResponseBuilder setRequestId(RequestId requestId) {
        this.requestId = requestId;
        return this;
    }

    public ProductDataResponseBuilder setRequestStatus(ProductDataResponse.RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
        return this;
    }

    public ProductDataResponseBuilder setUnavailableSkus(Set<String> set) {
        this.unavailableSkus = set;
        return this;
    }
}
