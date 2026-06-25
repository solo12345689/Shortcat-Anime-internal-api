.class public final synthetic Lio/sentry/cache/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/sentry/cache/t;

.field public final synthetic b:Lio/sentry/T3;

.field public final synthetic c:Lio/sentry/Y;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/cache/t;Lio/sentry/T3;Lio/sentry/Y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/cache/j;->a:Lio/sentry/cache/t;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/cache/j;->b:Lio/sentry/T3;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/cache/j;->c:Lio/sentry/Y;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/cache/j;->a:Lio/sentry/cache/t;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/cache/j;->b:Lio/sentry/T3;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/cache/j;->c:Lio/sentry/Y;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lio/sentry/cache/t;->n(Lio/sentry/cache/t;Lio/sentry/T3;Lio/sentry/Y;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
