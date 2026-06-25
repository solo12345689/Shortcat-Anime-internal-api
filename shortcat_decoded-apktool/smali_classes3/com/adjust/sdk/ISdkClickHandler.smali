.class public interface abstract Lcom/adjust/sdk/ISdkClickHandler;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# virtual methods
.method public abstract init(Lcom/adjust/sdk/IActivityHandler;ZLcom/adjust/sdk/network/IActivityPackageSender;)V
.end method

.method public abstract pauseSending()V
.end method

.method public abstract resumeSending()V
.end method

.method public abstract sendPreinstallPayload(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract sendReftagReferrers()V
.end method

.method public abstract sendSdkClick(Lcom/adjust/sdk/ActivityPackage;)V
.end method

.method public abstract teardown()V
.end method
