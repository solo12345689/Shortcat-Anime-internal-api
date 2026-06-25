.class final Lio/sentry/android/replay/i$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/android/replay/i;-><init>(Lio/sentry/z3;Lio/sentry/protocol/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/sentry/android/replay/i;


# direct methods
.method constructor <init>(Lio/sentry/android/replay/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/android/replay/i$d;->a:Lio/sentry/android/replay/i;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/io/File;
    .locals 3

    .line 1
    sget-object v0, Lio/sentry/android/replay/i;->l:Lio/sentry/android/replay/i$a;

    iget-object v1, p0, Lio/sentry/android/replay/i$d;->a:Lio/sentry/android/replay/i;

    invoke-static {v1}, Lio/sentry/android/replay/i;->b(Lio/sentry/android/replay/i;)Lio/sentry/z3;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/android/replay/i$d;->a:Lio/sentry/android/replay/i;

    invoke-static {v2}, Lio/sentry/android/replay/i;->g(Lio/sentry/android/replay/i;)Lio/sentry/protocol/x;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/sentry/android/replay/i$a;->d(Lio/sentry/z3;Lio/sentry/protocol/x;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lio/sentry/android/replay/i$d;->invoke()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
