.class public final synthetic Lio/sentry/android/core/W0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/g2$a;


# instance fields
.field public final synthetic a:Lio/sentry/ILogger;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lio/sentry/g2$a;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/ILogger;Landroid/content/Context;Lio/sentry/g2$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/W0;->a:Lio/sentry/ILogger;

    .line 5
    .line 6
    iput-object p2, p0, Lio/sentry/android/core/W0;->b:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lio/sentry/android/core/W0;->c:Lio/sentry/g2$a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/z3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/W0;->a:Lio/sentry/ILogger;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/core/W0;->b:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/android/core/W0;->c:Lio/sentry/g2$a;

    .line 6
    .line 7
    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, Lio/sentry/android/core/Y0;->c(Lio/sentry/ILogger;Landroid/content/Context;Lio/sentry/g2$a;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
