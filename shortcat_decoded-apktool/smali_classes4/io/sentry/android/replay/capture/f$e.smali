.class final Lio/sentry/android/replay/capture/f$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/android/replay/capture/f;->R(Ljava/util/List;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lio/sentry/android/replay/capture/f;

.field final synthetic c:Lkotlin/jvm/internal/J;


# direct methods
.method constructor <init>(JLio/sentry/android/replay/capture/f;Lkotlin/jvm/internal/J;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lio/sentry/android/replay/capture/f$e;->a:J

    .line 2
    .line 3
    iput-object p3, p0, Lio/sentry/android/replay/capture/f$e;->b:Lio/sentry/android/replay/capture/f;

    .line 4
    .line 5
    iput-object p4, p0, Lio/sentry/android/replay/capture/f$e;->c:Lkotlin/jvm/internal/J;

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
.method public final a(Lio/sentry/android/replay/capture/h$c$a;)Ljava/lang/Boolean;
    .locals 4

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lio/sentry/android/replay/capture/h$c$a;->c()Lio/sentry/A3;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lio/sentry/A3;->g0()Ljava/util/Date;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-wide v2, p0, Lio/sentry/android/replay/capture/f$e;->a:J

    .line 19
    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-gez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lio/sentry/android/replay/capture/f$e;->b:Lio/sentry/android/replay/capture/f;

    .line 25
    .line 26
    invoke-virtual {v0}, Lio/sentry/android/replay/capture/a;->d()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/lit8 v1, v1, -0x1

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lio/sentry/android/replay/capture/a;->c(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lio/sentry/android/replay/capture/f$e;->b:Lio/sentry/android/replay/capture/f;

    .line 36
    .line 37
    invoke-virtual {p1}, Lio/sentry/android/replay/capture/h$c$a;->c()Lio/sentry/A3;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lio/sentry/A3;->h0()Ljava/io/File;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {v0, p1}, Lio/sentry/android/replay/capture/f;->I(Lio/sentry/android/replay/capture/f;Ljava/io/File;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lio/sentry/android/replay/capture/f$e;->c:Lkotlin/jvm/internal/J;

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p1, Lkotlin/jvm/internal/J;->a:Z

    .line 52
    .line 53
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lio/sentry/android/replay/capture/h$c$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/f$e;->a(Lio/sentry/android/replay/capture/h$c$a;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
