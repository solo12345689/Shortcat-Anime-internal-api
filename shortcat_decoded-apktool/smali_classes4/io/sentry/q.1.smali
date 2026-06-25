.class public final Lio/sentry/q;
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
    iput-object p1, p0, Lio/sentry/q;->a:Lio/sentry/z3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    invoke-static {}, Lio/sentry/g3;->d()Lio/sentry/g3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lio/sentry/q;->a:Lio/sentry/z3;

    .line 6
    .line 7
    invoke-virtual {v1}, Lio/sentry/z3;->getFatalLogger()Lio/sentry/ILogger;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lio/sentry/g3;->c(Lio/sentry/ILogger;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method
