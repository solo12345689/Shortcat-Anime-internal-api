.class public final Lio/sentry/rrweb/e$b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/rrweb/e$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lio/sentry/j1;Lio/sentry/ILogger;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/sentry/rrweb/e$b$a;->b(Lio/sentry/j1;Lio/sentry/ILogger;)Lio/sentry/rrweb/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Lio/sentry/j1;Lio/sentry/ILogger;)Lio/sentry/rrweb/e$b;
    .locals 0

    .line 1
    invoke-static {}, Lio/sentry/rrweb/e$b;->values()[Lio/sentry/rrweb/e$b;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lio/sentry/j1;->nextInt()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    aget-object p1, p2, p1

    .line 10
    .line 11
    return-object p1
.end method
