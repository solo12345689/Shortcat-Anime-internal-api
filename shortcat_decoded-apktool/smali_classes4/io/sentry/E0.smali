.class public final Lio/sentry/E0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/m0;


# instance fields
.field private final a:Lio/sentry/z3;


# direct methods
.method public constructor <init>(Lio/sentry/z3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/E0;->a:Lio/sentry/z3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    invoke-static {}, Lio/sentry/internal/a;->a()Lio/sentry/internal/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/sentry/internal/a;->b()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lio/sentry/g3;->d()Lio/sentry/g3;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lio/sentry/E0;->a:Lio/sentry/z3;

    .line 13
    .line 14
    invoke-virtual {v1}, Lio/sentry/z3;->getFatalLogger()Lio/sentry/ILogger;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lio/sentry/g3;->c(Lio/sentry/ILogger;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method
