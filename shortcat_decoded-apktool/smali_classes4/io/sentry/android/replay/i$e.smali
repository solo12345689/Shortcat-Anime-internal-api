.class final Lio/sentry/android/replay/i$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/android/replay/i;->H(J)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lio/sentry/android/replay/i;

.field final synthetic c:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(JLio/sentry/android/replay/i;Lkotlin/jvm/internal/N;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lio/sentry/android/replay/i$e;->a:J

    .line 2
    .line 3
    iput-object p3, p0, Lio/sentry/android/replay/i$e;->b:Lio/sentry/android/replay/i;

    .line 4
    .line 5
    iput-object p4, p0, Lio/sentry/android/replay/i$e;->c:Lkotlin/jvm/internal/N;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/android/replay/j;)Ljava/lang/Boolean;
    .locals 4

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/android/replay/j;->c()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-wide v2, p0, Lio/sentry/android/replay/i$e;->a:J

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-gez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lio/sentry/android/replay/i$e;->b:Lio/sentry/android/replay/i;

    .line 17
    .line 18
    invoke-virtual {p1}, Lio/sentry/android/replay/j;->b()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {v0, p1}, Lio/sentry/android/replay/i;->a(Lio/sentry/android/replay/i;Ljava/io/File;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/i$e;->c:Lkotlin/jvm/internal/N;

    .line 29
    .line 30
    iget-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Lio/sentry/android/replay/j;->a()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 39
    .line 40
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    .line 42
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lio/sentry/android/replay/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/i$e;->a(Lio/sentry/android/replay/j;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
