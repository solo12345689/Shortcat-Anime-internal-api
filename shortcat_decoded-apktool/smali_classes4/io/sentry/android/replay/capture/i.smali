.class public final synthetic Lio/sentry/android/replay/capture/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/sentry/android/replay/capture/m;

.field public final synthetic b:J

.field public final synthetic c:Ljava/util/Date;

.field public final synthetic d:Lio/sentry/protocol/x;

.field public final synthetic e:Lio/sentry/android/replay/s;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/m;JLjava/util/Date;Lio/sentry/protocol/x;Lio/sentry/android/replay/s;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/replay/capture/i;->a:Lio/sentry/android/replay/capture/m;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/sentry/android/replay/capture/i;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Lio/sentry/android/replay/capture/i;->c:Ljava/util/Date;

    .line 9
    .line 10
    iput-object p5, p0, Lio/sentry/android/replay/capture/i;->d:Lio/sentry/protocol/x;

    .line 11
    .line 12
    iput-object p6, p0, Lio/sentry/android/replay/capture/i;->e:Lio/sentry/android/replay/s;

    .line 13
    .line 14
    iput-object p7, p0, Lio/sentry/android/replay/capture/i;->f:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/capture/i;->a:Lio/sentry/android/replay/capture/m;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/sentry/android/replay/capture/i;->b:J

    .line 4
    .line 5
    iget-object v3, p0, Lio/sentry/android/replay/capture/i;->c:Ljava/util/Date;

    .line 6
    .line 7
    iget-object v4, p0, Lio/sentry/android/replay/capture/i;->d:Lio/sentry/protocol/x;

    .line 8
    .line 9
    iget-object v5, p0, Lio/sentry/android/replay/capture/i;->e:Lio/sentry/android/replay/s;

    .line 10
    .line 11
    iget-object v6, p0, Lio/sentry/android/replay/capture/i;->f:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    invoke-static/range {v0 .. v6}, Lio/sentry/android/replay/capture/m;->E(Lio/sentry/android/replay/capture/m;JLjava/util/Date;Lio/sentry/protocol/x;Lio/sentry/android/replay/s;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
