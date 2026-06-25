.class public final Lio/sentry/exception/a;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lio/sentry/protocol/l;

.field private final b:Ljava/lang/Throwable;

.field private final c:Ljava/lang/Thread;

.field private final d:Z


# direct methods
.method public constructor <init>(Lio/sentry/protocol/l;Ljava/lang/Throwable;Ljava/lang/Thread;)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3, v0}, Lio/sentry/exception/a;-><init>(Lio/sentry/protocol/l;Ljava/lang/Throwable;Ljava/lang/Thread;Z)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/l;Ljava/lang/Throwable;Ljava/lang/Thread;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2
    const-string v0, "Mechanism is required."

    invoke-static {p1, v0}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/l;

    iput-object p1, p0, Lio/sentry/exception/a;->a:Lio/sentry/protocol/l;

    .line 3
    const-string p1, "Throwable is required."

    invoke-static {p2, p1}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    iput-object p1, p0, Lio/sentry/exception/a;->b:Ljava/lang/Throwable;

    .line 4
    const-string p1, "Thread is required."

    invoke-static {p3, p1}, Lio/sentry/util/w;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Thread;

    iput-object p1, p0, Lio/sentry/exception/a;->c:Ljava/lang/Thread;

    .line 5
    iput-boolean p4, p0, Lio/sentry/exception/a;->d:Z

    return-void
.end method


# virtual methods
.method public a()Lio/sentry/protocol/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/exception/a;->a:Lio/sentry/protocol/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ljava/lang/Thread;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/exception/a;->c:Ljava/lang/Thread;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/exception/a;->b:Ljava/lang/Throwable;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/sentry/exception/a;->d:Z

    .line 2
    .line 3
    return v0
.end method
