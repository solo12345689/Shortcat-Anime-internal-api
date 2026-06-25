.class final Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/common/events/EventsManager;->flushLegacyEvents()V
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
.field final synthetic $legacyEventsFileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/revenuecat/purchases/utils/EventsFileHelper<",
            "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/revenuecat/purchases/common/events/EventsManager;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/utils/EventsFileHelper;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/common/events/EventsManager;",
            "Lcom/revenuecat/purchases/utils/EventsFileHelper<",
            "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;->this$0:Lcom/revenuecat/purchases/common/events/EventsManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;->$legacyEventsFileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;->this$0:Lcom/revenuecat/purchases/common/events/EventsManager;

    invoke-static {v0}, Lcom/revenuecat/purchases/common/events/EventsManager;->access$getLegacyPaywallsStoredEvents(Lcom/revenuecat/purchases/common/events/EventsManager;)Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-static {v0}, LUd/u;->j0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    .line 4
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 6
    check-cast v5, Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;

    .line 7
    new-instance v6, Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;

    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;->toBackendEvent()Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;

    move-result-object v5

    invoke-direct {v6, v5}, Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;-><init>(Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)V

    .line 8
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-string v4, "[Purchases] - "

    if-eqz v1, :cond_2

    .line 10
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->VERBOSE:Lcom/revenuecat/purchases/LogLevel;

    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    move-result-object v1

    .line 11
    sget-object v2, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gtz v2, :cond_1

    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 13
    const-string v2, "No legacy events to sync. Skipping legacy flush."

    .line 14
    invoke-interface {v1, v0, v2}, Lcom/revenuecat/purchases/LogHandler;->v(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    .line 15
    :cond_2
    sget-object v1, Lcom/revenuecat/purchases/LogLevel;->VERBOSE:Lcom/revenuecat/purchases/LogLevel;

    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    move-result-object v5

    .line 16
    sget-object v6, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    invoke-virtual {v6}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v6

    if-gtz v6, :cond_3

    .line 17
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 18
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Legacy event flush: posting "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " events."

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 19
    invoke-interface {v5, v1, v4}, Lcom/revenuecat/purchases/LogHandler;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    :cond_3
    iget-object v1, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;->this$0:Lcom/revenuecat/purchases/common/events/EventsManager;

    invoke-static {v1}, Lcom/revenuecat/purchases/common/events/EventsManager;->access$getPostEvents$p(Lcom/revenuecat/purchases/common/events/EventsManager;)Lie/p;

    move-result-object v1

    .line 21
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 23
    check-cast v3, Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;

    .line 24
    invoke-static {v3}, Lcom/revenuecat/purchases/common/events/BackendStoredEventKt;->toBackendEvent(Lcom/revenuecat/purchases/common/events/BackendStoredEvent;)Lcom/revenuecat/purchases/common/events/BackendEvent;

    move-result-object v3

    .line 25
    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 26
    :cond_4
    new-instance v2, Lcom/revenuecat/purchases/common/events/EventsRequest;

    invoke-direct {v2, v4}, Lcom/revenuecat/purchases/common/events/EventsRequest;-><init>(Ljava/util/List;)V

    .line 27
    sget-object v3, Lcom/revenuecat/purchases/common/Delay;->LONG:Lcom/revenuecat/purchases/common/Delay;

    .line 28
    new-instance v4, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1$4;

    iget-object v5, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;->this$0:Lcom/revenuecat/purchases/common/events/EventsManager;

    iget-object v6, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;->$legacyEventsFileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    invoke-direct {v4, v5, v6, v0}, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1$4;-><init>(Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/utils/EventsFileHelper;Ljava/util/List;)V

    new-instance v5, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1$5;

    iget-object v6, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;->this$0:Lcom/revenuecat/purchases/common/events/EventsManager;

    iget-object v7, p0, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1;->$legacyEventsFileHelper:Lcom/revenuecat/purchases/utils/EventsFileHelper;

    invoke-direct {v5, v6, v7, v0}, Lcom/revenuecat/purchases/common/events/EventsManager$flushLegacyEvents$1$5;-><init>(Lcom/revenuecat/purchases/common/events/EventsManager;Lcom/revenuecat/purchases/utils/EventsFileHelper;Ljava/util/List;)V

    invoke-interface {v1, v2, v3, v4, v5}, Lie/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
