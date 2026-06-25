.class final Lio/sentry/android/replay/capture/m$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/android/replay/capture/m;->stop()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/sentry/android/replay/capture/m;

.field final synthetic b:Ljava/io/File;


# direct methods
.method constructor <init>(Lio/sentry/android/replay/capture/m;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/android/replay/capture/m$d;->a:Lio/sentry/android/replay/capture/m;

    .line 2
    .line 3
    iput-object p2, p0, Lio/sentry/android/replay/capture/m$d;->b:Ljava/io/File;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/android/replay/capture/h$c;)V
    .locals 3

    .line 1
    const-string v0, "segment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lio/sentry/android/replay/capture/h$c$a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Lio/sentry/android/replay/capture/h$c$a;

    .line 11
    .line 12
    iget-object v0, p0, Lio/sentry/android/replay/capture/m$d;->a:Lio/sentry/android/replay/capture/m;

    .line 13
    .line 14
    invoke-static {v0}, Lio/sentry/android/replay/capture/m;->H(Lio/sentry/android/replay/capture/m;)Lio/sentry/a0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x2

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {p1, v0, v2, v1, v2}, Lio/sentry/android/replay/capture/h$c$a;->b(Lio/sentry/android/replay/capture/h$c$a;Lio/sentry/a0;Lio/sentry/H;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Lio/sentry/android/replay/capture/m$d;->a:Lio/sentry/android/replay/capture/m;

    .line 24
    .line 25
    const/4 v0, -0x1

    .line 26
    invoke-virtual {p1, v0}, Lio/sentry/android/replay/capture/a;->c(I)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lio/sentry/android/replay/capture/m$d;->b:Ljava/io/File;

    .line 30
    .line 31
    invoke-static {p1}, Lio/sentry/util/i;->a(Ljava/io/File;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lio/sentry/android/replay/capture/h$c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/m$d;->a(Lio/sentry/android/replay/capture/h$c;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
