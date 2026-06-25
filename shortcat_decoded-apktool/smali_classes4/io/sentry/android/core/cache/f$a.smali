.class final Lio/sentry/android/core/cache/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/android/core/cache/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/core/cache/f$a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lio/sentry/android/core/cache/f$a$a;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Lio/sentry/android/core/cache/f$a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/cache/f$a;->a:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/android/core/cache/f$a;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/android/core/cache/f$a;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lio/sentry/android/core/cache/f$a;->d:Lio/sentry/android/core/cache/f$a$a;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a(Lio/sentry/android/core/cache/f$a;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/cache/f;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/cache/f$a;->d:Lio/sentry/android/core/cache/f$a$a;

    .line 2
    .line 3
    invoke-interface {v0, p3}, Lio/sentry/android/core/cache/f$a$a;->a(Ljava/lang/Object;)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-virtual {p1}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v0, Lio/sentry/i3;->DEBUG:Lio/sentry/i3;

    .line 12
    .line 13
    iget-object v1, p0, Lio/sentry/android/core/cache/f$a;->b:Ljava/lang/String;

    .line 14
    .line 15
    filled-new-array {v1, p3}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "Writing last reported %s marker with timestamp %d"

    .line 20
    .line 21
    invoke-interface {p1, v0, v2, v1}, Lio/sentry/ILogger;->c(Lio/sentry/i3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lio/sentry/android/core/cache/f$a;->c:Ljava/lang/String;

    .line 25
    .line 26
    iget-object p0, p0, Lio/sentry/android/core/cache/f$a;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p2, p3, p1, p0}, Lio/sentry/android/core/cache/f;->V(Lio/sentry/android/core/cache/f;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method b(Lio/sentry/android/core/cache/f;Lio/sentry/H;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/cache/f$a;->a:Ljava/lang/Class;

    .line 2
    .line 3
    new-instance v1, Lio/sentry/android/core/cache/e;

    .line 4
    .line 5
    invoke-direct {v1, p0, p3, p1}, Lio/sentry/android/core/cache/e;-><init>(Lio/sentry/android/core/cache/f$a;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/cache/f;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2, v0, v1}, Lio/sentry/util/l;->h(Lio/sentry/H;Ljava/lang/Class;Lio/sentry/util/l$a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
