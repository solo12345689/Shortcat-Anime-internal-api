.class public final synthetic Lio/sentry/t0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/w0$b;


# instance fields
.field public final synthetic a:Lio/sentry/w0;

.field public final synthetic b:Lio/sentry/x0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/w0;Lio/sentry/x0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/t0;->a:Lio/sentry/w0;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/t0;->b:Lio/sentry/x0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/t0;->a:Lio/sentry/w0;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/t0;->b:Lio/sentry/x0;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lio/sentry/w0;->c(Lio/sentry/w0;Lio/sentry/x0;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
