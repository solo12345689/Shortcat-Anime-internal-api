.class public final synthetic Lio/sentry/android/replay/util/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Lio/sentry/z3;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lio/sentry/z3;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/replay/util/e;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/android/replay/util/e;->b:Lio/sentry/z3;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/android/replay/util/e;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/util/e;->a:Ljava/lang/Runnable;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/replay/util/e;->b:Lio/sentry/z3;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/android/replay/util/e;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lio/sentry/android/replay/util/f;->a(Ljava/lang/Runnable;Lio/sentry/z3;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
