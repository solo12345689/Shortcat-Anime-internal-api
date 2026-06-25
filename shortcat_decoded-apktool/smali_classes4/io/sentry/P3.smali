.class public final synthetic Lio/sentry/P3;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/sentry/ShutdownHookIntegration;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/ShutdownHookIntegration;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/P3;->a:Lio/sentry/ShutdownHookIntegration;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/P3;->a:Lio/sentry/ShutdownHookIntegration;

    .line 2
    .line 3
    invoke-static {v0}, Lio/sentry/ShutdownHookIntegration;->b(Lio/sentry/ShutdownHookIntegration;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
