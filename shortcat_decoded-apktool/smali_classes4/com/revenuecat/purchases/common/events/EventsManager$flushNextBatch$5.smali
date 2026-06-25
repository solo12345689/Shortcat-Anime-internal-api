.class final Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/common/events/EventsManager;->flushNextBatch(ILcom/revenuecat/purchases/common/Delay;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LTd/L;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $batchNumber:I

.field final synthetic $batchStartTimeMillis:J

.field final synthetic $delay:Lcom/revenuecat/purchases/common/Delay;

.field final synthetic $storedEventsWithNullValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/revenuecat/purchases/common/events/EventsManager;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/common/events/EventsManager;IJLjava/util/List;Lcom/revenuecat/purchases/common/Delay;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/common/events/EventsManager;",
            "IJ",
            "Ljava/util/List<",
            "+",
            "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;",
            ">;",
            "Lcom/revenuecat/purchases/common/Delay;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->this$0:Lcom/revenuecat/purchases/common/events/EventsManager;

    .line 2
    .line 3
    iput p2, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->$batchNumber:I

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->$batchStartTimeMillis:J

    .line 6
    .line 7
    iput-object p5, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->$storedEventsWithNullValues:Ljava/util/List;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->$delay:Lcom/revenuecat/purchases/common/Delay;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    .line 2
    iget v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->$batchNumber:I

    .line 3
    sget-object v1, Lcom/revenuecat/purchases/LogLevel;->VERBOSE:Lcom/revenuecat/purchases/LogLevel;

    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    move-result-object v2

    .line 4
    sget-object v3, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    invoke-virtual {v3}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gtz v3, :cond_0

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "[Purchases] - "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "New event flush (batch "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "): success."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-interface {v2, v1, v0}, Lcom/revenuecat/purchases/LogHandler;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->this$0:Lcom/revenuecat/purchases/common/events/EventsManager;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/common/events/EventsManager;->getDebugEventListener()Lcom/revenuecat/purchases/DebugEventListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    new-instance v1, Lcom/revenuecat/purchases/DebugEvent;

    .line 10
    sget-object v2, Lcom/revenuecat/purchases/DebugEventName;->FLUSH_COMPLETED:Lcom/revenuecat/purchases/DebugEventName;

    .line 11
    iget v3, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->$batchNumber:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "batch_number"

    invoke-static {v4, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->$batchStartTimeMillis:J

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    const-string v5, "elapsed_millis"

    invoke-static {v5, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    filled-new-array {v3, v4}, [Lkotlin/Pair;

    move-result-object v3

    .line 13
    invoke-static {v3}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    .line 14
    invoke-direct {v1, v2, v3}, Lcom/revenuecat/purchases/DebugEvent;-><init>(Lcom/revenuecat/purchases/DebugEventName;Ljava/util/Map;)V

    .line 15
    invoke-interface {v0, v1}, Lcom/revenuecat/purchases/DebugEventListener;->onDebugEventReceived(Lcom/revenuecat/purchases/DebugEvent;)V

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->this$0:Lcom/revenuecat/purchases/common/events/EventsManager;

    new-instance v1, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5$2;

    iget-object v2, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->$storedEventsWithNullValues:Ljava/util/List;

    iget v3, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->$batchNumber:I

    iget-object v4, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5;->$delay:Lcom/revenuecat/purchases/common/Delay;

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/revenuecat/purchases/common/events/EventsManager$flushNextBatch$5$2;-><init>(Lcom/revenuecat/purchases/common/events/EventsManager;Ljava/util/List;ILcom/revenuecat/purchases/common/Delay;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v3}, Lcom/revenuecat/purchases/common/events/EventsManager;->enqueue$default(Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/common/Delay;Lie/a;ILjava/lang/Object;)V

    return-void
.end method
