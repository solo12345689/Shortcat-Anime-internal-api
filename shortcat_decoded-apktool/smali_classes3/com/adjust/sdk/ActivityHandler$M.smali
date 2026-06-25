.class Lcom/adjust/sdk/ActivityHandler$M;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adjust/sdk/ActivityHandler;->processRemoteTriggersI(Lcom/adjust/sdk/ResponseData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/adjust/sdk/AdjustRemoteTrigger;

.field public final synthetic b:Lcom/adjust/sdk/ActivityHandler;


# direct methods
.method public constructor <init>(Lcom/adjust/sdk/ActivityHandler;Lcom/adjust/sdk/AdjustRemoteTrigger;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/adjust/sdk/ActivityHandler$M;->b:Lcom/adjust/sdk/ActivityHandler;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/adjust/sdk/ActivityHandler$M;->a:Lcom/adjust/sdk/AdjustRemoteTrigger;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/adjust/sdk/ActivityHandler$M;->b:Lcom/adjust/sdk/ActivityHandler;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/adjust/sdk/ActivityHandler;->access$1400(Lcom/adjust/sdk/ActivityHandler;)Lcom/adjust/sdk/AdjustConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lcom/adjust/sdk/AdjustConfig;->onRemoteTriggerListener:Lcom/adjust/sdk/OnRemoteTriggerListener;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/adjust/sdk/ActivityHandler$M;->b:Lcom/adjust/sdk/ActivityHandler;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/adjust/sdk/ActivityHandler;->access$1400(Lcom/adjust/sdk/ActivityHandler;)Lcom/adjust/sdk/AdjustConfig;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, Lcom/adjust/sdk/AdjustConfig;->onRemoteTriggerListener:Lcom/adjust/sdk/OnRemoteTriggerListener;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/adjust/sdk/ActivityHandler$M;->a:Lcom/adjust/sdk/AdjustRemoteTrigger;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lcom/adjust/sdk/OnRemoteTriggerListener;->onRemoteTrigger(Lcom/adjust/sdk/AdjustRemoteTrigger;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
