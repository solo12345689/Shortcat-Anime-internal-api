.class public final Lio/sentry/android/replay/capture/a$f$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/android/replay/capture/a$f;->b(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lio/sentry/android/replay/capture/a;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/android/replay/capture/a$f$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lio/sentry/android/replay/capture/a$f$b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lio/sentry/android/replay/capture/a$f$b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Lio/sentry/android/replay/capture/a$f$b;->d:Lio/sentry/android/replay/capture/a;

    .line 8
    .line 9
    iput-object p5, p0, Lio/sentry/android/replay/capture/a$f$b;->e:Ljava/lang/String;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a$f$b;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lio/sentry/android/replay/capture/a$f$b;->c:Ljava/lang/Object;

    .line 3
    iget-object v1, p0, Lio/sentry/android/replay/capture/a$f$b;->d:Lio/sentry/android/replay/capture/a;

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/a;->o()Lio/sentry/android/replay/i;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lio/sentry/android/replay/capture/a$f$b;->e:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lio/sentry/android/replay/i;->E(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
