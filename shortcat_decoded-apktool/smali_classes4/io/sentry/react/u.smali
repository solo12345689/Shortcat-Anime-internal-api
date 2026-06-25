.class public final synthetic Lio/sentry/react/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/sentry/p2;

.field public final synthetic b:Lcom/facebook/react/bridge/Promise;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/p2;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/react/u;->a:Lio/sentry/p2;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/react/u;->b:Lcom/facebook/react/bridge/Promise;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/react/u;->a:Lio/sentry/p2;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/react/u;->b:Lcom/facebook/react/bridge/Promise;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lio/sentry/react/w;->a(Lio/sentry/p2;Lcom/facebook/react/bridge/Promise;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
